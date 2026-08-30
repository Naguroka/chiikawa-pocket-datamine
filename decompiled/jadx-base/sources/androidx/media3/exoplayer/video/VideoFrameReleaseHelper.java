package androidx.media3.exoplayer.video;

/* JADX INFO: loaded from: classes.dex */
public final class VideoFrameReleaseHelper {
    private static final long MAX_ALLOWED_ADJUSTMENT_NS = 20000000;
    private static final int MINIMUM_FRAMES_WITHOUT_SYNC_TO_CLEAR_SURFACE_FRAME_RATE = 30;
    private static final long MINIMUM_MATCHING_FRAME_DURATION_FOR_HIGH_CONFIDENCE_NS = 5000000000L;
    private static final float MINIMUM_MEDIA_FRAME_RATE_CHANGE_FOR_UPDATE_HIGH_CONFIDENCE = 0.02f;
    private static final float MINIMUM_MEDIA_FRAME_RATE_CHANGE_FOR_UPDATE_LOW_CONFIDENCE = 1.0f;
    private static final java.lang.String TAG = "VideoFrameReleaseHelper";
    private static final long VSYNC_OFFSET_PERCENTAGE = 80;
    private static final long VSYNC_SAMPLE_UPDATE_PERIOD_MS = 500;
    private int changeFrameRateStrategy;
    private final androidx.media3.exoplayer.video.VideoFrameReleaseHelper.DisplayHelper displayHelper;
    private float formatFrameRate;
    private long frameIndex;
    private final androidx.media3.exoplayer.video.FixedFrameRateEstimator frameRateEstimator = new androidx.media3.exoplayer.video.FixedFrameRateEstimator();
    private long lastAdjustedFrameIndex;
    private long lastAdjustedReleaseTimeNs;
    private long pendingLastAdjustedFrameIndex;
    private long pendingLastAdjustedReleaseTimeNs;
    private float playbackSpeed;
    private boolean started;
    private android.view.Surface surface;
    private float surfaceMediaFrameRate;
    private float surfacePlaybackFrameRate;
    private long vsyncDurationNs;
    private long vsyncOffsetNs;
    private final androidx.media3.exoplayer.video.VideoFrameReleaseHelper.VSyncSampler vsyncSampler;

    public VideoFrameReleaseHelper(android.content.Context context) {
        androidx.media3.exoplayer.video.VideoFrameReleaseHelper.DisplayHelper displayHelperMaybeBuildDisplayHelper = maybeBuildDisplayHelper(context);
        this.displayHelper = displayHelperMaybeBuildDisplayHelper;
        this.vsyncSampler = displayHelperMaybeBuildDisplayHelper != null ? androidx.media3.exoplayer.video.VideoFrameReleaseHelper.VSyncSampler.getInstance() : null;
        this.vsyncDurationNs = androidx.media3.common.C.TIME_UNSET;
        this.vsyncOffsetNs = androidx.media3.common.C.TIME_UNSET;
        this.formatFrameRate = -1.0f;
        this.playbackSpeed = 1.0f;
        this.changeFrameRateStrategy = 0;
    }

    public void setChangeFrameRateStrategy(int i) {
        if (this.changeFrameRateStrategy == i) {
            return;
        }
        this.changeFrameRateStrategy = i;
        updateSurfacePlaybackFrameRate(true);
    }

    public void onStarted() {
        this.started = true;
        resetAdjustment();
        if (this.displayHelper != null) {
            ((androidx.media3.exoplayer.video.VideoFrameReleaseHelper.VSyncSampler) androidx.media3.common.util.Assertions.checkNotNull(this.vsyncSampler)).addObserver();
            this.displayHelper.register();
        }
        updateSurfacePlaybackFrameRate(false);
    }

    public void onSurfaceChanged(android.view.Surface surface) {
        if (surface instanceof androidx.media3.exoplayer.video.PlaceholderSurface) {
            surface = null;
        }
        if (this.surface == surface) {
            return;
        }
        clearSurfaceFrameRate();
        this.surface = surface;
        updateSurfacePlaybackFrameRate(true);
    }

    public void onPositionReset() {
        resetAdjustment();
    }

    public void onPlaybackSpeed(float f) {
        this.playbackSpeed = f;
        resetAdjustment();
        updateSurfacePlaybackFrameRate(false);
    }

    public void onFormatChanged(float f) {
        this.formatFrameRate = f;
        this.frameRateEstimator.reset();
        updateSurfaceMediaFrameRate();
    }

    public void onNextFrame(long j) {
        long j2 = this.pendingLastAdjustedFrameIndex;
        if (j2 != -1) {
            this.lastAdjustedFrameIndex = j2;
            this.lastAdjustedReleaseTimeNs = this.pendingLastAdjustedReleaseTimeNs;
        }
        this.frameIndex++;
        this.frameRateEstimator.onNextFrame(j * 1000);
        updateSurfaceMediaFrameRate();
    }

    public void onStopped() {
        this.started = false;
        androidx.media3.exoplayer.video.VideoFrameReleaseHelper.DisplayHelper displayHelper = this.displayHelper;
        if (displayHelper != null) {
            displayHelper.unregister();
            ((androidx.media3.exoplayer.video.VideoFrameReleaseHelper.VSyncSampler) androidx.media3.common.util.Assertions.checkNotNull(this.vsyncSampler)).removeObserver();
        }
        clearSurfaceFrameRate();
    }

    public long adjustReleaseTime(long j) {
        long j2;
        if (this.lastAdjustedFrameIndex == -1 || !this.frameRateEstimator.isSynced()) {
            j2 = j;
        } else {
            long frameDurationNs = this.lastAdjustedReleaseTimeNs + ((long) ((this.frameRateEstimator.getFrameDurationNs() * (this.frameIndex - this.lastAdjustedFrameIndex)) / this.playbackSpeed));
            if (adjustmentAllowed(j, frameDurationNs)) {
                j2 = frameDurationNs;
            } else {
                resetAdjustment();
                j2 = j;
            }
        }
        this.pendingLastAdjustedFrameIndex = this.frameIndex;
        this.pendingLastAdjustedReleaseTimeNs = j2;
        androidx.media3.exoplayer.video.VideoFrameReleaseHelper.VSyncSampler vSyncSampler = this.vsyncSampler;
        if (vSyncSampler == null || this.vsyncDurationNs == androidx.media3.common.C.TIME_UNSET) {
            return j2;
        }
        long j3 = vSyncSampler.sampledVsyncTimeNs;
        return j3 == androidx.media3.common.C.TIME_UNSET ? j2 : closestVsync(j2, j3, this.vsyncDurationNs) - this.vsyncOffsetNs;
    }

    private void resetAdjustment() {
        this.frameIndex = 0L;
        this.lastAdjustedFrameIndex = -1L;
        this.pendingLastAdjustedFrameIndex = -1L;
    }

    private static boolean adjustmentAllowed(long j, long j2) {
        return java.lang.Math.abs(j - j2) <= MAX_ALLOWED_ADJUSTMENT_NS;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005f  */
    private void updateSurfaceMediaFrameRate() {
        if (androidx.media3.common.util.Util.SDK_INT < 30 || this.surface == null) {
            return;
        }
        float frameRate = this.frameRateEstimator.isSynced() ? this.frameRateEstimator.getFrameRate() : this.formatFrameRate;
        float f = this.surfaceMediaFrameRate;
        if (frameRate == f) {
            return;
        }
        boolean z = true;
        if (frameRate != -1.0f && f != -1.0f) {
            if (java.lang.Math.abs(frameRate - this.surfaceMediaFrameRate) < (this.frameRateEstimator.isSynced() && (this.frameRateEstimator.getMatchingFrameDurationSumNs() > MINIMUM_MATCHING_FRAME_DURATION_FOR_HIGH_CONFIDENCE_NS ? 1 : (this.frameRateEstimator.getMatchingFrameDurationSumNs() == MINIMUM_MATCHING_FRAME_DURATION_FOR_HIGH_CONFIDENCE_NS ? 0 : -1)) >= 0 ? MINIMUM_MEDIA_FRAME_RATE_CHANGE_FOR_UPDATE_HIGH_CONFIDENCE : 1.0f)) {
                z = false;
            }
        } else if (frameRate == -1.0f && this.frameRateEstimator.getFramesWithoutSyncCount() < 30) {
            z = false;
        }
        if (z) {
            this.surfaceMediaFrameRate = frameRate;
            updateSurfacePlaybackFrameRate(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0021  */
    private void updateSurfacePlaybackFrameRate(boolean z) {
        android.view.Surface surface;
        float f;
        if (androidx.media3.common.util.Util.SDK_INT < 30 || (surface = this.surface) == null || this.changeFrameRateStrategy == Integer.MIN_VALUE) {
            return;
        }
        if (this.started) {
            float f2 = this.surfaceMediaFrameRate;
            if (f2 != -1.0f) {
                f = f2 * this.playbackSpeed;
            } else {
                f = 0.0f;
            }
        } else {
            f = 0.0f;
        }
        if (z || this.surfacePlaybackFrameRate != f) {
            this.surfacePlaybackFrameRate = f;
            androidx.media3.exoplayer.video.VideoFrameReleaseHelper.Api30.setSurfaceFrameRate(surface, f);
        }
    }

    private void clearSurfaceFrameRate() {
        android.view.Surface surface;
        if (androidx.media3.common.util.Util.SDK_INT < 30 || (surface = this.surface) == null || this.changeFrameRateStrategy == Integer.MIN_VALUE || this.surfacePlaybackFrameRate == 0.0f) {
            return;
        }
        this.surfacePlaybackFrameRate = 0.0f;
        androidx.media3.exoplayer.video.VideoFrameReleaseHelper.Api30.setSurfaceFrameRate(surface, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateDefaultDisplayRefreshRateParams(android.view.Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            this.vsyncDurationNs = refreshRate;
            this.vsyncOffsetNs = (refreshRate * VSYNC_OFFSET_PERCENTAGE) / 100;
        } else {
            androidx.media3.common.util.Log.w(TAG, "Unable to query display refresh rate");
            this.vsyncDurationNs = androidx.media3.common.C.TIME_UNSET;
            this.vsyncOffsetNs = androidx.media3.common.C.TIME_UNSET;
        }
    }

    private static long closestVsync(long j, long j2, long j3) {
        long j4;
        long j5 = j2 + (((j - j2) / j3) * j3);
        if (j <= j5) {
            j4 = j5 - j3;
        } else {
            j5 = j3 + j5;
            j4 = j5;
        }
        return j5 - j < j - j4 ? j5 : j4;
    }

    private androidx.media3.exoplayer.video.VideoFrameReleaseHelper.DisplayHelper maybeBuildDisplayHelper(android.content.Context context) {
        android.hardware.display.DisplayManager displayManager;
        if (context == null || (displayManager = (android.hardware.display.DisplayManager) context.getSystemService("display")) == null) {
            return null;
        }
        return new androidx.media3.exoplayer.video.VideoFrameReleaseHelper.DisplayHelper(displayManager);
    }

    private static final class Api30 {
        private Api30() {
        }

        public static void setSurfaceFrameRate(android.view.Surface surface, float f) {
            try {
                surface.setFrameRate(f, f == 0.0f ? 0 : 1);
            } catch (java.lang.IllegalStateException e) {
                androidx.media3.common.util.Log.e(androidx.media3.exoplayer.video.VideoFrameReleaseHelper.TAG, "Failed to call Surface.setFrameRate", e);
            }
        }
    }

    private final class DisplayHelper implements android.hardware.display.DisplayManager.DisplayListener {
        private final android.hardware.display.DisplayManager displayManager;

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i) {
        }

        public DisplayHelper(android.hardware.display.DisplayManager displayManager) {
            this.displayManager = displayManager;
        }

        public void register() {
            this.displayManager.registerDisplayListener(this, androidx.media3.common.util.Util.createHandlerForCurrentLooper());
            androidx.media3.exoplayer.video.VideoFrameReleaseHelper.this.updateDefaultDisplayRefreshRateParams(getDefaultDisplay());
        }

        public void unregister() {
            this.displayManager.unregisterDisplayListener(this);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i) {
            if (i == 0) {
                androidx.media3.exoplayer.video.VideoFrameReleaseHelper.this.updateDefaultDisplayRefreshRateParams(getDefaultDisplay());
            }
        }

        private android.view.Display getDefaultDisplay() {
            return this.displayManager.getDisplay(0);
        }
    }

    private static final class VSyncSampler implements android.view.Choreographer.FrameCallback, android.os.Handler.Callback {
        private static final int CREATE_CHOREOGRAPHER = 1;
        private static final androidx.media3.exoplayer.video.VideoFrameReleaseHelper.VSyncSampler INSTANCE = new androidx.media3.exoplayer.video.VideoFrameReleaseHelper.VSyncSampler();
        private static final int MSG_ADD_OBSERVER = 2;
        private static final int MSG_REMOVE_OBSERVER = 3;
        private android.view.Choreographer choreographer;
        private final android.os.HandlerThread choreographerOwnerThread;
        private final android.os.Handler handler;
        private int observerCount;
        public volatile long sampledVsyncTimeNs = androidx.media3.common.C.TIME_UNSET;

        public static androidx.media3.exoplayer.video.VideoFrameReleaseHelper.VSyncSampler getInstance() {
            return INSTANCE;
        }

        private VSyncSampler() {
            android.os.HandlerThread handlerThread = new android.os.HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.choreographerOwnerThread = handlerThread;
            handlerThread.start();
            android.os.Handler handlerCreateHandler = androidx.media3.common.util.Util.createHandler(handlerThread.getLooper(), this);
            this.handler = handlerCreateHandler;
            handlerCreateHandler.sendEmptyMessage(1);
        }

        public void addObserver() {
            this.handler.sendEmptyMessage(2);
        }

        public void removeObserver() {
            this.handler.sendEmptyMessage(3);
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            this.sampledVsyncTimeNs = j;
            ((android.view.Choreographer) androidx.media3.common.util.Assertions.checkNotNull(this.choreographer)).postFrameCallbackDelayed(this, 500L);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message message) {
            int i = message.what;
            if (i == 1) {
                createChoreographerInstanceInternal();
                return true;
            }
            if (i == 2) {
                addObserverInternal();
                return true;
            }
            if (i != 3) {
                return false;
            }
            removeObserverInternal();
            return true;
        }

        private void createChoreographerInstanceInternal() {
            try {
                this.choreographer = android.view.Choreographer.getInstance();
            } catch (java.lang.RuntimeException e) {
                androidx.media3.common.util.Log.w(androidx.media3.exoplayer.video.VideoFrameReleaseHelper.TAG, "Vsync sampling disabled due to platform error", e);
            }
        }

        private void addObserverInternal() {
            android.view.Choreographer choreographer = this.choreographer;
            if (choreographer != null) {
                int i = this.observerCount + 1;
                this.observerCount = i;
                if (i == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        }

        private void removeObserverInternal() {
            android.view.Choreographer choreographer = this.choreographer;
            if (choreographer != null) {
                int i = this.observerCount - 1;
                this.observerCount = i;
                if (i == 0) {
                    choreographer.removeFrameCallback(this);
                    this.sampledVsyncTimeNs = androidx.media3.common.C.TIME_UNSET;
                }
            }
        }
    }
}

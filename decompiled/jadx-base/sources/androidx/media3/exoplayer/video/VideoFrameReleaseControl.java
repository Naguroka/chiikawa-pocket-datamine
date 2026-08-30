package androidx.media3.exoplayer.video;

/* JADX INFO: loaded from: classes.dex */
public final class VideoFrameReleaseControl {
    public static final int FRAME_RELEASE_DROP = 2;
    public static final int FRAME_RELEASE_IGNORE = 4;
    public static final int FRAME_RELEASE_IMMEDIATELY = 0;
    public static final int FRAME_RELEASE_SCHEDULED = 1;
    public static final int FRAME_RELEASE_SKIP = 3;
    public static final int FRAME_RELEASE_TRY_AGAIN_LATER = 5;
    private static final long MAX_EARLY_US_THRESHOLD = 50000;
    private final long allowedJoiningTimeMs;
    private final androidx.media3.exoplayer.video.VideoFrameReleaseHelper frameReleaseHelper;
    private final androidx.media3.exoplayer.video.VideoFrameReleaseControl.FrameTimingEvaluator frameTimingEvaluator;
    private boolean joiningRenderNextFrameImmediately;
    private long lastReleaseRealtimeUs;
    private boolean started;
    private int firstFrameState = 0;
    private long initialPositionUs = androidx.media3.common.C.TIME_UNSET;
    private long lastPresentationTimeUs = androidx.media3.common.C.TIME_UNSET;
    private long joiningDeadlineMs = androidx.media3.common.C.TIME_UNSET;
    private float playbackSpeed = 1.0f;
    private androidx.media3.common.util.Clock clock = androidx.media3.common.util.Clock.DEFAULT;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface FrameReleaseAction {
    }

    public interface FrameTimingEvaluator {
        boolean shouldDropFrame(long j, long j2, boolean z);

        boolean shouldForceReleaseFrame(long j, long j2);

        boolean shouldIgnoreFrame(long j, long j2, long j3, boolean z, boolean z2) throws androidx.media3.exoplayer.ExoPlaybackException;
    }

    public static class FrameReleaseInfo {
        private long earlyUs = androidx.media3.common.C.TIME_UNSET;
        private long releaseTimeNs = androidx.media3.common.C.TIME_UNSET;

        public long getEarlyUs() {
            return this.earlyUs;
        }

        public long getReleaseTimeNs() {
            return this.releaseTimeNs;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void reset() {
            this.earlyUs = androidx.media3.common.C.TIME_UNSET;
            this.releaseTimeNs = androidx.media3.common.C.TIME_UNSET;
        }
    }

    public VideoFrameReleaseControl(android.content.Context context, androidx.media3.exoplayer.video.VideoFrameReleaseControl.FrameTimingEvaluator frameTimingEvaluator, long j) {
        this.frameTimingEvaluator = frameTimingEvaluator;
        this.allowedJoiningTimeMs = j;
        this.frameReleaseHelper = new androidx.media3.exoplayer.video.VideoFrameReleaseHelper(context);
    }

    public void onEnabled(boolean z) {
        this.firstFrameState = z ? 1 : 0;
    }

    public void onDisabled() {
        lowerFirstFrameState(0);
    }

    public void onStarted() {
        this.started = true;
        this.lastReleaseRealtimeUs = androidx.media3.common.util.Util.msToUs(this.clock.elapsedRealtime());
        this.frameReleaseHelper.onStarted();
    }

    public void onStopped() {
        this.started = false;
        this.joiningDeadlineMs = androidx.media3.common.C.TIME_UNSET;
        this.frameReleaseHelper.onStopped();
    }

    public void onProcessedStreamChange() {
        lowerFirstFrameState(2);
    }

    public void setOutputSurface(android.view.Surface surface) {
        this.frameReleaseHelper.onSurfaceChanged(surface);
        lowerFirstFrameState(1);
    }

    public void setFrameRate(float f) {
        this.frameReleaseHelper.onFormatChanged(f);
    }

    public boolean onFrameReleasedIsFirstFrame() {
        boolean z = this.firstFrameState != 3;
        this.firstFrameState = 3;
        this.lastReleaseRealtimeUs = androidx.media3.common.util.Util.msToUs(this.clock.elapsedRealtime());
        return z;
    }

    public void setClock(androidx.media3.common.util.Clock clock) {
        this.clock = clock;
    }

    public void allowReleaseFirstFrameBeforeStarted() {
        if (this.firstFrameState == 0) {
            this.firstFrameState = 1;
        }
    }

    public boolean isReady(boolean z) {
        if (z && this.firstFrameState == 3) {
            this.joiningDeadlineMs = androidx.media3.common.C.TIME_UNSET;
            return true;
        }
        if (this.joiningDeadlineMs == androidx.media3.common.C.TIME_UNSET) {
            return false;
        }
        if (this.clock.elapsedRealtime() < this.joiningDeadlineMs) {
            return true;
        }
        this.joiningDeadlineMs = androidx.media3.common.C.TIME_UNSET;
        return false;
    }

    public void join(boolean z) {
        this.joiningRenderNextFrameImmediately = z;
        this.joiningDeadlineMs = this.allowedJoiningTimeMs > 0 ? this.clock.elapsedRealtime() + this.allowedJoiningTimeMs : androidx.media3.common.C.TIME_UNSET;
    }

    public int getFrameReleaseAction(long j, long j2, long j3, long j4, boolean z, androidx.media3.exoplayer.video.VideoFrameReleaseControl.FrameReleaseInfo frameReleaseInfo) throws androidx.media3.exoplayer.ExoPlaybackException {
        frameReleaseInfo.reset();
        if (this.initialPositionUs == androidx.media3.common.C.TIME_UNSET) {
            this.initialPositionUs = j2;
        }
        if (this.lastPresentationTimeUs != j) {
            this.frameReleaseHelper.onNextFrame(j);
            this.lastPresentationTimeUs = j;
        }
        frameReleaseInfo.earlyUs = calculateEarlyTimeUs(j2, j3, j);
        boolean z2 = false;
        if (shouldForceRelease(j2, frameReleaseInfo.earlyUs, j4)) {
            return 0;
        }
        if (!this.started || j2 == this.initialPositionUs) {
            return 5;
        }
        long jNanoTime = this.clock.nanoTime();
        frameReleaseInfo.releaseTimeNs = this.frameReleaseHelper.adjustReleaseTime((frameReleaseInfo.earlyUs * 1000) + jNanoTime);
        frameReleaseInfo.earlyUs = (frameReleaseInfo.releaseTimeNs - jNanoTime) / 1000;
        if (this.joiningDeadlineMs != androidx.media3.common.C.TIME_UNSET && !this.joiningRenderNextFrameImmediately) {
            z2 = true;
        }
        if (this.frameTimingEvaluator.shouldIgnoreFrame(frameReleaseInfo.earlyUs, j2, j3, z, z2)) {
            return 4;
        }
        if (this.frameTimingEvaluator.shouldDropFrame(frameReleaseInfo.earlyUs, j3, z)) {
            return z2 ? 3 : 2;
        }
        return frameReleaseInfo.earlyUs > MAX_EARLY_US_THRESHOLD ? 5 : 1;
    }

    public void reset() {
        this.frameReleaseHelper.onPositionReset();
        this.lastPresentationTimeUs = androidx.media3.common.C.TIME_UNSET;
        this.initialPositionUs = androidx.media3.common.C.TIME_UNSET;
        lowerFirstFrameState(1);
        this.joiningDeadlineMs = androidx.media3.common.C.TIME_UNSET;
    }

    public void setChangeFrameRateStrategy(int i) {
        this.frameReleaseHelper.setChangeFrameRateStrategy(i);
    }

    public void setPlaybackSpeed(float f) {
        if (f == this.playbackSpeed) {
            return;
        }
        this.playbackSpeed = f;
        this.frameReleaseHelper.onPlaybackSpeed(f);
    }

    private void lowerFirstFrameState(int i) {
        this.firstFrameState = java.lang.Math.min(this.firstFrameState, i);
    }

    private long calculateEarlyTimeUs(long j, long j2, long j3) {
        long j4 = (long) ((j3 - j) / ((double) this.playbackSpeed));
        return this.started ? j4 - (androidx.media3.common.util.Util.msToUs(this.clock.elapsedRealtime()) - j2) : j4;
    }

    private boolean shouldForceRelease(long j, long j2, long j3) {
        if (this.joiningDeadlineMs != androidx.media3.common.C.TIME_UNSET && !this.joiningRenderNextFrameImmediately) {
            return false;
        }
        int i = this.firstFrameState;
        if (i == 0) {
            return this.started;
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return j >= j3;
        }
        if (i == 3) {
            return this.started && this.frameTimingEvaluator.shouldForceReleaseFrame(j2, androidx.media3.common.util.Util.msToUs(this.clock.elapsedRealtime()) - this.lastReleaseRealtimeUs);
        }
        throw new java.lang.IllegalStateException();
    }
}

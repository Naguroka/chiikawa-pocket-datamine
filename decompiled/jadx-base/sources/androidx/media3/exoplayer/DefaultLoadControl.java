package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public class DefaultLoadControl implements androidx.media3.exoplayer.LoadControl {
    public static final int DEFAULT_AUDIO_BUFFER_SIZE = 13107200;
    public static final int DEFAULT_BACK_BUFFER_DURATION_MS = 0;
    public static final int DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS = 5000;
    public static final int DEFAULT_BUFFER_FOR_PLAYBACK_MS = 2500;
    public static final int DEFAULT_CAMERA_MOTION_BUFFER_SIZE = 131072;
    public static final int DEFAULT_IMAGE_BUFFER_SIZE = 131072;
    public static final int DEFAULT_MAX_BUFFER_MS = 50000;
    public static final int DEFAULT_METADATA_BUFFER_SIZE = 131072;
    public static final int DEFAULT_MIN_BUFFER_MS = 50000;
    public static final int DEFAULT_MIN_BUFFER_SIZE = 13107200;
    public static final int DEFAULT_MUXED_BUFFER_SIZE = 144310272;
    public static final boolean DEFAULT_PRIORITIZE_TIME_OVER_SIZE_THRESHOLDS = false;
    public static final boolean DEFAULT_RETAIN_BACK_BUFFER_FROM_KEYFRAME = false;
    public static final int DEFAULT_TARGET_BUFFER_BYTES = -1;
    public static final int DEFAULT_TEXT_BUFFER_SIZE = 131072;
    public static final int DEFAULT_VIDEO_BUFFER_SIZE = 131072000;
    private final androidx.media3.exoplayer.upstream.DefaultAllocator allocator;
    private final long backBufferDurationUs;
    private final long bufferForPlaybackAfterRebufferUs;
    private final long bufferForPlaybackUs;
    private final java.util.HashMap<androidx.media3.exoplayer.analytics.PlayerId, androidx.media3.exoplayer.DefaultLoadControl.PlayerLoadingState> loadingStates;
    private final long maxBufferUs;
    private final long minBufferUs;
    private final boolean prioritizeTimeOverSizeThresholds;
    private final boolean retainBackBufferFromKeyframe;
    private final int targetBufferBytesOverwrite;
    private long threadId;

    public static final class Builder {
        private androidx.media3.exoplayer.upstream.DefaultAllocator allocator;
        private boolean buildCalled;
        private int minBufferMs = 50000;
        private int maxBufferMs = 50000;
        private int bufferForPlaybackMs = 2500;
        private int bufferForPlaybackAfterRebufferMs = 5000;
        private int targetBufferBytes = -1;
        private boolean prioritizeTimeOverSizeThresholds = false;
        private int backBufferDurationMs = 0;
        private boolean retainBackBufferFromKeyframe = false;

        public androidx.media3.exoplayer.DefaultLoadControl.Builder setAllocator(androidx.media3.exoplayer.upstream.DefaultAllocator defaultAllocator) {
            androidx.media3.common.util.Assertions.checkState(!this.buildCalled);
            this.allocator = defaultAllocator;
            return this;
        }

        public androidx.media3.exoplayer.DefaultLoadControl.Builder setBufferDurationsMs(int i, int i2, int i3, int i4) {
            androidx.media3.common.util.Assertions.checkState(!this.buildCalled);
            androidx.media3.exoplayer.DefaultLoadControl.assertGreaterOrEqual(i3, 0, "bufferForPlaybackMs", "0");
            androidx.media3.exoplayer.DefaultLoadControl.assertGreaterOrEqual(i4, 0, "bufferForPlaybackAfterRebufferMs", "0");
            androidx.media3.exoplayer.DefaultLoadControl.assertGreaterOrEqual(i, i3, "minBufferMs", "bufferForPlaybackMs");
            androidx.media3.exoplayer.DefaultLoadControl.assertGreaterOrEqual(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
            androidx.media3.exoplayer.DefaultLoadControl.assertGreaterOrEqual(i2, i, "maxBufferMs", "minBufferMs");
            this.minBufferMs = i;
            this.maxBufferMs = i2;
            this.bufferForPlaybackMs = i3;
            this.bufferForPlaybackAfterRebufferMs = i4;
            return this;
        }

        public androidx.media3.exoplayer.DefaultLoadControl.Builder setTargetBufferBytes(int i) {
            androidx.media3.common.util.Assertions.checkState(!this.buildCalled);
            this.targetBufferBytes = i;
            return this;
        }

        public androidx.media3.exoplayer.DefaultLoadControl.Builder setPrioritizeTimeOverSizeThresholds(boolean z) {
            androidx.media3.common.util.Assertions.checkState(!this.buildCalled);
            this.prioritizeTimeOverSizeThresholds = z;
            return this;
        }

        public androidx.media3.exoplayer.DefaultLoadControl.Builder setBackBuffer(int i, boolean z) {
            androidx.media3.common.util.Assertions.checkState(!this.buildCalled);
            androidx.media3.exoplayer.DefaultLoadControl.assertGreaterOrEqual(i, 0, "backBufferDurationMs", "0");
            this.backBufferDurationMs = i;
            this.retainBackBufferFromKeyframe = z;
            return this;
        }

        public androidx.media3.exoplayer.DefaultLoadControl build() {
            androidx.media3.common.util.Assertions.checkState(!this.buildCalled);
            this.buildCalled = true;
            if (this.allocator == null) {
                this.allocator = new androidx.media3.exoplayer.upstream.DefaultAllocator(true, 65536);
            }
            return new androidx.media3.exoplayer.DefaultLoadControl(this.allocator, this.minBufferMs, this.maxBufferMs, this.bufferForPlaybackMs, this.bufferForPlaybackAfterRebufferMs, this.targetBufferBytes, this.prioritizeTimeOverSizeThresholds, this.backBufferDurationMs, this.retainBackBufferFromKeyframe);
        }
    }

    public DefaultLoadControl() {
        this(new androidx.media3.exoplayer.upstream.DefaultAllocator(true, 65536), 50000, 50000, 2500, 5000, -1, false, 0, false);
    }

    protected DefaultLoadControl(androidx.media3.exoplayer.upstream.DefaultAllocator defaultAllocator, int i, int i2, int i3, int i4, int i5, boolean z, int i6, boolean z2) {
        assertGreaterOrEqual(i3, 0, "bufferForPlaybackMs", "0");
        assertGreaterOrEqual(i4, 0, "bufferForPlaybackAfterRebufferMs", "0");
        assertGreaterOrEqual(i, i3, "minBufferMs", "bufferForPlaybackMs");
        assertGreaterOrEqual(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        assertGreaterOrEqual(i2, i, "maxBufferMs", "minBufferMs");
        assertGreaterOrEqual(i6, 0, "backBufferDurationMs", "0");
        this.allocator = defaultAllocator;
        this.minBufferUs = androidx.media3.common.util.Util.msToUs(i);
        this.maxBufferUs = androidx.media3.common.util.Util.msToUs(i2);
        this.bufferForPlaybackUs = androidx.media3.common.util.Util.msToUs(i3);
        this.bufferForPlaybackAfterRebufferUs = androidx.media3.common.util.Util.msToUs(i4);
        this.targetBufferBytesOverwrite = i5;
        this.prioritizeTimeOverSizeThresholds = z;
        this.backBufferDurationUs = androidx.media3.common.util.Util.msToUs(i6);
        this.retainBackBufferFromKeyframe = z2;
        this.loadingStates = new java.util.HashMap<>();
        this.threadId = -1L;
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public void onPrepared(androidx.media3.exoplayer.analytics.PlayerId playerId) {
        long id = java.lang.Thread.currentThread().getId();
        long j = this.threadId;
        androidx.media3.common.util.Assertions.checkState(j == -1 || j == id, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.threadId = id;
        if (!this.loadingStates.containsKey(playerId)) {
            this.loadingStates.put(playerId, new androidx.media3.exoplayer.DefaultLoadControl.PlayerLoadingState());
        }
        resetPlayerLoadingState(playerId);
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public void onTracksSelected(androidx.media3.exoplayer.analytics.PlayerId playerId, androidx.media3.common.Timeline timeline, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.Renderer[] rendererArr, androidx.media3.exoplayer.source.TrackGroupArray trackGroupArray, androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr) {
        androidx.media3.exoplayer.DefaultLoadControl.PlayerLoadingState playerLoadingState = (androidx.media3.exoplayer.DefaultLoadControl.PlayerLoadingState) androidx.media3.common.util.Assertions.checkNotNull(this.loadingStates.get(playerId));
        int iCalculateTargetBufferBytes = this.targetBufferBytesOverwrite;
        if (iCalculateTargetBufferBytes == -1) {
            iCalculateTargetBufferBytes = calculateTargetBufferBytes(rendererArr, exoTrackSelectionArr);
        }
        playerLoadingState.targetBufferBytes = iCalculateTargetBufferBytes;
        updateAllocator();
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public void onStopped(androidx.media3.exoplayer.analytics.PlayerId playerId) {
        removePlayer(playerId);
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public void onReleased(androidx.media3.exoplayer.analytics.PlayerId playerId) {
        removePlayer(playerId);
        if (this.loadingStates.isEmpty()) {
            this.threadId = -1L;
        }
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public androidx.media3.exoplayer.upstream.Allocator getAllocator() {
        return this.allocator;
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public long getBackBufferDurationUs(androidx.media3.exoplayer.analytics.PlayerId playerId) {
        return this.backBufferDurationUs;
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public boolean retainBackBufferFromKeyframe(androidx.media3.exoplayer.analytics.PlayerId playerId) {
        return this.retainBackBufferFromKeyframe;
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public boolean shouldContinueLoading(androidx.media3.exoplayer.LoadControl.Parameters parameters) {
        androidx.media3.exoplayer.DefaultLoadControl.PlayerLoadingState playerLoadingState = (androidx.media3.exoplayer.DefaultLoadControl.PlayerLoadingState) androidx.media3.common.util.Assertions.checkNotNull(this.loadingStates.get(parameters.playerId));
        boolean z = true;
        boolean z2 = this.allocator.getTotalBytesAllocated() >= calculateTotalTargetBufferBytes();
        long jMin = this.minBufferUs;
        if (parameters.playbackSpeed > 1.0f) {
            jMin = java.lang.Math.min(androidx.media3.common.util.Util.getMediaDurationForPlayoutDuration(jMin, parameters.playbackSpeed), this.maxBufferUs);
        }
        if (parameters.bufferedDurationUs < java.lang.Math.max(jMin, 500000L)) {
            if (!this.prioritizeTimeOverSizeThresholds && z2) {
                z = false;
            }
            playerLoadingState.isLoading = z;
            if (!playerLoadingState.isLoading && parameters.bufferedDurationUs < 500000) {
                androidx.media3.common.util.Log.w("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (parameters.bufferedDurationUs >= this.maxBufferUs || z2) {
            playerLoadingState.isLoading = false;
        }
        return playerLoadingState.isLoading;
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public boolean shouldStartPlayback(androidx.media3.exoplayer.LoadControl.Parameters parameters) {
        long playoutDurationForMediaDuration = androidx.media3.common.util.Util.getPlayoutDurationForMediaDuration(parameters.bufferedDurationUs, parameters.playbackSpeed);
        long jMin = parameters.rebuffering ? this.bufferForPlaybackAfterRebufferUs : this.bufferForPlaybackUs;
        if (parameters.targetLiveOffsetUs != androidx.media3.common.C.TIME_UNSET) {
            jMin = java.lang.Math.min(parameters.targetLiveOffsetUs / 2, jMin);
        }
        return jMin <= 0 || playoutDurationForMediaDuration >= jMin || (!this.prioritizeTimeOverSizeThresholds && this.allocator.getTotalBytesAllocated() >= calculateTotalTargetBufferBytes());
    }

    protected int calculateTargetBufferBytes(androidx.media3.exoplayer.Renderer[] rendererArr, androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr) {
        int defaultBufferSize = 0;
        for (int i = 0; i < rendererArr.length; i++) {
            if (exoTrackSelectionArr[i] != null) {
                defaultBufferSize += getDefaultBufferSize(rendererArr[i].getTrackType());
            }
        }
        return java.lang.Math.max(13107200, defaultBufferSize);
    }

    int calculateTotalTargetBufferBytes() {
        java.util.Iterator<androidx.media3.exoplayer.DefaultLoadControl.PlayerLoadingState> it = this.loadingStates.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().targetBufferBytes;
        }
        return i;
    }

    private void resetPlayerLoadingState(androidx.media3.exoplayer.analytics.PlayerId playerId) {
        androidx.media3.exoplayer.DefaultLoadControl.PlayerLoadingState playerLoadingState = (androidx.media3.exoplayer.DefaultLoadControl.PlayerLoadingState) androidx.media3.common.util.Assertions.checkNotNull(this.loadingStates.get(playerId));
        int i = this.targetBufferBytesOverwrite;
        if (i == -1) {
            i = 13107200;
        }
        playerLoadingState.targetBufferBytes = i;
        playerLoadingState.isLoading = false;
    }

    private void removePlayer(androidx.media3.exoplayer.analytics.PlayerId playerId) {
        if (this.loadingStates.remove(playerId) != null) {
            updateAllocator();
        }
    }

    private void updateAllocator() {
        if (this.loadingStates.isEmpty()) {
            this.allocator.reset();
        } else {
            this.allocator.setTargetBufferSize(calculateTotalTargetBufferBytes());
        }
    }

    private static int getDefaultBufferSize(int i) {
        switch (i) {
            case -2:
                return 0;
            case -1:
            default:
                throw new java.lang.IllegalArgumentException();
            case 0:
                return DEFAULT_MUXED_BUFFER_SIZE;
            case 1:
                return 13107200;
            case 2:
                return DEFAULT_VIDEO_BUFFER_SIZE;
            case 3:
            case 4:
            case 5:
            case 6:
                return 131072;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void assertGreaterOrEqual(int i, int i2, java.lang.String str, java.lang.String str2) {
        androidx.media3.common.util.Assertions.checkArgument(i >= i2, str + " cannot be less than " + str2);
    }

    private static class PlayerLoadingState {
        public boolean isLoading;
        public int targetBufferBytes;

        private PlayerLoadingState() {
        }
    }
}

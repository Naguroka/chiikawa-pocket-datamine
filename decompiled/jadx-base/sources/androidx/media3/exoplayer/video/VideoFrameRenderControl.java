package androidx.media3.exoplayer.video;

/* JADX INFO: loaded from: classes.dex */
final class VideoFrameRenderControl {
    private final androidx.media3.exoplayer.video.VideoFrameRenderControl.FrameRenderer frameRenderer;
    private long outputStreamOffsetUs;
    private androidx.media3.common.VideoSize pendingOutputVideoSize;
    private final androidx.media3.exoplayer.video.VideoFrameReleaseControl videoFrameReleaseControl;
    private final androidx.media3.exoplayer.video.VideoFrameReleaseControl.FrameReleaseInfo videoFrameReleaseInfo = new androidx.media3.exoplayer.video.VideoFrameReleaseControl.FrameReleaseInfo();
    private final androidx.media3.common.util.TimedValueQueue<androidx.media3.common.VideoSize> videoSizeChanges = new androidx.media3.common.util.TimedValueQueue<>();
    private final androidx.media3.common.util.TimedValueQueue<java.lang.Long> streamOffsets = new androidx.media3.common.util.TimedValueQueue<>();
    private final androidx.media3.common.util.LongArrayQueue presentationTimestampsUs = new androidx.media3.common.util.LongArrayQueue();
    private androidx.media3.common.VideoSize reportedVideoSize = androidx.media3.common.VideoSize.UNKNOWN;
    private long lastPresentationTimeUs = androidx.media3.common.C.TIME_UNSET;

    interface FrameRenderer {
        void dropFrame();

        void onVideoSizeChanged(androidx.media3.common.VideoSize videoSize);

        void renderFrame(long j, long j2, long j3, boolean z);
    }

    public VideoFrameRenderControl(androidx.media3.exoplayer.video.VideoFrameRenderControl.FrameRenderer frameRenderer, androidx.media3.exoplayer.video.VideoFrameReleaseControl videoFrameReleaseControl) {
        this.frameRenderer = frameRenderer;
        this.videoFrameReleaseControl = videoFrameReleaseControl;
    }

    public void flush() {
        this.presentationTimestampsUs.clear();
        this.lastPresentationTimeUs = androidx.media3.common.C.TIME_UNSET;
        if (this.streamOffsets.size() > 0) {
            this.streamOffsets.add(0L, java.lang.Long.valueOf(((java.lang.Long) getLastAndClear(this.streamOffsets)).longValue()));
        }
        if (this.pendingOutputVideoSize == null) {
            if (this.videoSizeChanges.size() > 0) {
                this.pendingOutputVideoSize = (androidx.media3.common.VideoSize) getLastAndClear(this.videoSizeChanges);
                return;
            }
            return;
        }
        this.videoSizeChanges.clear();
    }

    public boolean isReady() {
        return this.videoFrameReleaseControl.isReady(true);
    }

    public boolean hasReleasedFrame(long j) {
        long j2 = this.lastPresentationTimeUs;
        return j2 != androidx.media3.common.C.TIME_UNSET && j2 >= j;
    }

    public void setPlaybackSpeed(float f) {
        androidx.media3.common.util.Assertions.checkArgument(f > 0.0f);
        this.videoFrameReleaseControl.setPlaybackSpeed(f);
    }

    public void render(long j, long j2) throws androidx.media3.exoplayer.ExoPlaybackException {
        while (!this.presentationTimestampsUs.isEmpty()) {
            long jElement = this.presentationTimestampsUs.element();
            if (maybeUpdateOutputStreamOffset(jElement)) {
                this.videoFrameReleaseControl.onProcessedStreamChange();
            }
            int frameReleaseAction = this.videoFrameReleaseControl.getFrameReleaseAction(jElement, j, j2, this.outputStreamOffsetUs, false, this.videoFrameReleaseInfo);
            if (frameReleaseAction == 0 || frameReleaseAction == 1) {
                this.lastPresentationTimeUs = jElement;
                renderFrame(frameReleaseAction == 0);
            } else if (frameReleaseAction != 2 && frameReleaseAction != 3 && frameReleaseAction != 4) {
                if (frameReleaseAction != 5) {
                    throw new java.lang.IllegalStateException(java.lang.String.valueOf(frameReleaseAction));
                }
                return;
            } else {
                this.lastPresentationTimeUs = jElement;
                dropFrame();
            }
        }
    }

    public void onOutputSizeChanged(int i, int i2) {
        androidx.media3.common.VideoSize videoSize = new androidx.media3.common.VideoSize(i, i2);
        if (androidx.media3.common.util.Util.areEqual(this.pendingOutputVideoSize, videoSize)) {
            return;
        }
        this.pendingOutputVideoSize = videoSize;
    }

    public void onOutputFrameAvailableForRendering(long j) {
        androidx.media3.common.VideoSize videoSize = this.pendingOutputVideoSize;
        if (videoSize != null) {
            this.videoSizeChanges.add(j, videoSize);
            this.pendingOutputVideoSize = null;
        }
        this.presentationTimestampsUs.add(j);
    }

    public void onStreamOffsetChange(long j, long j2) {
        this.streamOffsets.add(j, java.lang.Long.valueOf(j2));
    }

    private void dropFrame() {
        androidx.media3.common.util.Assertions.checkStateNotNull(java.lang.Long.valueOf(this.presentationTimestampsUs.remove()));
        this.frameRenderer.dropFrame();
    }

    private void renderFrame(boolean z) {
        long jLongValue = ((java.lang.Long) androidx.media3.common.util.Assertions.checkStateNotNull(java.lang.Long.valueOf(this.presentationTimestampsUs.remove()))).longValue();
        if (maybeUpdateVideoSize(jLongValue)) {
            this.frameRenderer.onVideoSizeChanged(this.reportedVideoSize);
        }
        this.frameRenderer.renderFrame(z ? -1L : this.videoFrameReleaseInfo.getReleaseTimeNs(), jLongValue, this.outputStreamOffsetUs, this.videoFrameReleaseControl.onFrameReleasedIsFirstFrame());
    }

    private boolean maybeUpdateOutputStreamOffset(long j) {
        java.lang.Long lPollFloor = this.streamOffsets.pollFloor(j);
        if (lPollFloor == null || lPollFloor.longValue() == this.outputStreamOffsetUs) {
            return false;
        }
        this.outputStreamOffsetUs = lPollFloor.longValue();
        return true;
    }

    private boolean maybeUpdateVideoSize(long j) {
        androidx.media3.common.VideoSize videoSizePollFloor = this.videoSizeChanges.pollFloor(j);
        if (videoSizePollFloor == null || videoSizePollFloor.equals(androidx.media3.common.VideoSize.UNKNOWN) || videoSizePollFloor.equals(this.reportedVideoSize)) {
            return false;
        }
        this.reportedVideoSize = videoSizePollFloor;
        return true;
    }

    private static <T> T getLastAndClear(androidx.media3.common.util.TimedValueQueue<T> timedValueQueue) {
        androidx.media3.common.util.Assertions.checkArgument(timedValueQueue.size() > 0);
        while (timedValueQueue.size() > 1) {
            timedValueQueue.pollFirst();
        }
        return (T) androidx.media3.common.util.Assertions.checkNotNull(timedValueQueue.pollFirst());
    }
}

package androidx.media3.exoplayer.video;

/* JADX INFO: loaded from: classes.dex */
public interface VideoSink {
    public static final int INPUT_TYPE_BITMAP = 2;
    public static final int INPUT_TYPE_SURFACE = 1;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface InputType {
    }

    public interface Listener {
        public static final androidx.media3.exoplayer.video.VideoSink.Listener NO_OP = new androidx.media3.exoplayer.video.VideoSink.Listener() { // from class: androidx.media3.exoplayer.video.VideoSink.Listener.1
            @Override // androidx.media3.exoplayer.video.VideoSink.Listener
            public void onError(androidx.media3.exoplayer.video.VideoSink videoSink, androidx.media3.exoplayer.video.VideoSink.VideoSinkException videoSinkException) {
            }

            @Override // androidx.media3.exoplayer.video.VideoSink.Listener
            public void onFirstFrameRendered(androidx.media3.exoplayer.video.VideoSink videoSink) {
            }

            @Override // androidx.media3.exoplayer.video.VideoSink.Listener
            public void onFrameDropped(androidx.media3.exoplayer.video.VideoSink videoSink) {
            }

            @Override // androidx.media3.exoplayer.video.VideoSink.Listener
            public void onVideoSizeChanged(androidx.media3.exoplayer.video.VideoSink videoSink, androidx.media3.common.VideoSize videoSize) {
            }
        };

        void onError(androidx.media3.exoplayer.video.VideoSink videoSink, androidx.media3.exoplayer.video.VideoSink.VideoSinkException videoSinkException);

        void onFirstFrameRendered(androidx.media3.exoplayer.video.VideoSink videoSink);

        void onFrameDropped(androidx.media3.exoplayer.video.VideoSink videoSink);

        void onVideoSizeChanged(androidx.media3.exoplayer.video.VideoSink videoSink, androidx.media3.common.VideoSize videoSize);
    }

    void clearOutputSurfaceInfo();

    void enableMayRenderStartOfStream();

    void flush(boolean z);

    android.view.Surface getInputSurface();

    void initialize(androidx.media3.common.Format format) throws androidx.media3.exoplayer.video.VideoSink.VideoSinkException;

    boolean isEnded();

    boolean isFrameDropAllowedOnInput();

    boolean isInitialized();

    boolean isReady();

    void onRendererDisabled();

    void onRendererEnabled(boolean z);

    void onRendererStarted();

    void onRendererStopped();

    boolean queueBitmap(android.graphics.Bitmap bitmap, androidx.media3.common.util.TimestampIterator timestampIterator);

    long registerInputFrame(long j, boolean z);

    void registerInputStream(int i, androidx.media3.common.Format format);

    void release();

    void render(long j, long j2) throws androidx.media3.exoplayer.video.VideoSink.VideoSinkException;

    void setListener(androidx.media3.exoplayer.video.VideoSink.Listener listener, java.util.concurrent.Executor executor);

    void setOutputSurfaceInfo(android.view.Surface surface, androidx.media3.common.util.Size size);

    void setPendingVideoEffects(java.util.List<androidx.media3.common.Effect> list);

    void setPlaybackSpeed(float f);

    void setStreamOffsetAndAdjustmentUs(long j, long j2);

    void setVideoEffects(java.util.List<androidx.media3.common.Effect> list);

    void setVideoFrameMetadataListener(androidx.media3.exoplayer.video.VideoFrameMetadataListener videoFrameMetadataListener);

    public static final class VideoSinkException extends java.lang.Exception {
        public final androidx.media3.common.Format format;

        public VideoSinkException(java.lang.Throwable th, androidx.media3.common.Format format) {
            super(th);
            this.format = format;
        }
    }
}

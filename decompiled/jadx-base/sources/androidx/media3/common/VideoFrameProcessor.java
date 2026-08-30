package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public interface VideoFrameProcessor {
    public static final long DROP_OUTPUT_FRAME = -2;
    public static final int INPUT_TYPE_BITMAP = 2;
    public static final int INPUT_TYPE_SURFACE = 1;
    public static final int INPUT_TYPE_TEXTURE_ID = 3;
    public static final long RENDER_OUTPUT_FRAME_IMMEDIATELY = -1;

    public interface Factory {
        androidx.media3.common.VideoFrameProcessor create(android.content.Context context, androidx.media3.common.DebugViewProvider debugViewProvider, androidx.media3.common.ColorInfo colorInfo, boolean z, java.util.concurrent.Executor executor, androidx.media3.common.VideoFrameProcessor.Listener listener) throws androidx.media3.common.VideoFrameProcessingException;
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface InputType {
    }

    public interface Listener {
        void onEnded();

        void onError(androidx.media3.common.VideoFrameProcessingException videoFrameProcessingException);

        void onInputStreamRegistered(int i, java.util.List<androidx.media3.common.Effect> list, androidx.media3.common.FrameInfo frameInfo);

        void onOutputFrameAvailableForRendering(long j);

        void onOutputSizeChanged(int i, int i2);
    }

    void flush();

    android.view.Surface getInputSurface();

    int getPendingInputFrameCount();

    boolean queueInputBitmap(android.graphics.Bitmap bitmap, androidx.media3.common.util.TimestampIterator timestampIterator);

    boolean queueInputTexture(int i, long j);

    boolean registerInputFrame();

    void registerInputStream(int i, java.util.List<androidx.media3.common.Effect> list, androidx.media3.common.FrameInfo frameInfo);

    void release();

    void renderOutputFrame(long j);

    void setOnInputFrameProcessedListener(androidx.media3.common.OnInputFrameProcessedListener onInputFrameProcessedListener);

    void setOutputSurfaceInfo(androidx.media3.common.SurfaceInfo surfaceInfo);

    void signalEndOfInput();
}

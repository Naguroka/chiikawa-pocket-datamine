package androidx.media3.transformer;

/* JADX INFO: loaded from: classes3.dex */
public interface SampleConsumer {
    public static final int INPUT_RESULT_END_OF_STREAM = 3;
    public static final int INPUT_RESULT_SUCCESS = 1;
    public static final int INPUT_RESULT_TRY_AGAIN_LATER = 2;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface InputResult {
    }

    default androidx.media3.decoder.DecoderInputBuffer getInputBuffer() {
        throw new java.lang.UnsupportedOperationException();
    }

    default boolean queueInputBuffer() {
        throw new java.lang.UnsupportedOperationException();
    }

    default int queueInputBitmap(android.graphics.Bitmap bitmap, androidx.media3.common.util.TimestampIterator timestampIterator) {
        throw new java.lang.UnsupportedOperationException();
    }

    default void setOnInputFrameProcessedListener(androidx.media3.common.OnInputFrameProcessedListener onInputFrameProcessedListener) {
        throw new java.lang.UnsupportedOperationException();
    }

    default int queueInputTexture(int i, long j) {
        throw new java.lang.UnsupportedOperationException();
    }

    default android.view.Surface getInputSurface() {
        throw new java.lang.UnsupportedOperationException();
    }

    default int getPendingVideoFrameCount() {
        throw new java.lang.UnsupportedOperationException();
    }

    default boolean registerVideoFrame(long j) {
        throw new java.lang.UnsupportedOperationException();
    }

    default void signalEndOfVideoInput() {
        throw new java.lang.UnsupportedOperationException();
    }
}

package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
public interface GlShaderProgram {

    public interface ErrorListener {
        void onError(androidx.media3.common.VideoFrameProcessingException videoFrameProcessingException);
    }

    public interface InputListener {
        default void onFlush() {
        }

        default void onInputFrameProcessed(androidx.media3.common.GlTextureInfo glTextureInfo) {
        }

        default void onReadyToAcceptInputFrame() {
        }
    }

    public interface OutputListener {
        default void onCurrentOutputStreamEnded() {
        }

        default void onOutputFrameAvailable(androidx.media3.common.GlTextureInfo glTextureInfo, long j) {
        }
    }

    void flush();

    void queueInputFrame(androidx.media3.common.GlObjectsProvider glObjectsProvider, androidx.media3.common.GlTextureInfo glTextureInfo, long j);

    void release() throws androidx.media3.common.VideoFrameProcessingException;

    void releaseOutputFrame(androidx.media3.common.GlTextureInfo glTextureInfo);

    void setErrorListener(java.util.concurrent.Executor executor, androidx.media3.effect.GlShaderProgram.ErrorListener errorListener);

    void setInputListener(androidx.media3.effect.GlShaderProgram.InputListener inputListener);

    void setOutputListener(androidx.media3.effect.GlShaderProgram.OutputListener outputListener);

    void signalEndOfCurrentInputStream();
}

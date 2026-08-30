package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
public interface VideoCompositor extends androidx.media3.effect.GlTextureProducer {

    public interface Listener {
        void onEnded();

        void onError(androidx.media3.common.VideoFrameProcessingException videoFrameProcessingException);
    }

    void queueInputTexture(int i, androidx.media3.effect.GlTextureProducer glTextureProducer, androidx.media3.common.GlTextureInfo glTextureInfo, androidx.media3.common.ColorInfo colorInfo, long j);

    void registerInputSource(int i);

    void release();

    void signalEndOfInputSource(int i);
}

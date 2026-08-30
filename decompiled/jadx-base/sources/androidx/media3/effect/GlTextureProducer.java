package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
public interface GlTextureProducer {

    public interface Listener {
        void onTextureRendered(androidx.media3.effect.GlTextureProducer glTextureProducer, androidx.media3.common.GlTextureInfo glTextureInfo, long j, long j2) throws androidx.media3.common.VideoFrameProcessingException, androidx.media3.common.util.GlUtil.GlException;
    }

    void releaseOutputTexture(long j);
}

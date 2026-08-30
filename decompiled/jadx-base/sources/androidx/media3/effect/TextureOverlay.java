package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
public abstract class TextureOverlay {
    private static final float[] IDENTITY_MATRIX = androidx.media3.common.util.GlUtil.create4x4IdentityMatrix();

    public void configure(androidx.media3.common.util.Size size) {
    }

    public abstract int getTextureId(long j) throws androidx.media3.common.VideoFrameProcessingException;

    public abstract androidx.media3.common.util.Size getTextureSize(long j);

    public void release() throws androidx.media3.common.VideoFrameProcessingException {
    }

    public float[] getVertexTransformation(long j) {
        return IDENTITY_MATRIX;
    }

    public androidx.media3.effect.OverlaySettings getOverlaySettings(long j) {
        return new androidx.media3.effect.OverlaySettings.Builder().build();
    }
}

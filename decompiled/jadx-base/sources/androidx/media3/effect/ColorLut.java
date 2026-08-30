package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
public interface ColorLut extends androidx.media3.effect.GlEffect {
    int getLength(long j);

    int getLutTextureId(long j);

    void release() throws androidx.media3.common.util.GlUtil.GlException;

    @Override // androidx.media3.effect.GlEffect
    default androidx.media3.effect.GlShaderProgram toGlShaderProgram(android.content.Context context, boolean z) throws androidx.media3.common.VideoFrameProcessingException {
        return new androidx.media3.effect.ColorLutShaderProgram(context, this, z);
    }
}

package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
public final class AlphaScale implements androidx.media3.effect.GlEffect {
    private final float alphaScale;

    public AlphaScale(float f) {
        androidx.media3.common.util.Assertions.checkArgument(0.0f <= f);
        this.alphaScale = f;
    }

    @Override // androidx.media3.effect.GlEffect
    public androidx.media3.effect.AlphaScaleShaderProgram toGlShaderProgram(android.content.Context context, boolean z) throws androidx.media3.common.VideoFrameProcessingException {
        return new androidx.media3.effect.AlphaScaleShaderProgram(context, z, this.alphaScale);
    }

    @Override // androidx.media3.effect.GlEffect
    public boolean isNoOp(int i, int i2) {
        return this.alphaScale == 1.0f;
    }
}

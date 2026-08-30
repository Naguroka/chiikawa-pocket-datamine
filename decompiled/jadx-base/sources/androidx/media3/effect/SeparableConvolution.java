package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
public abstract class SeparableConvolution implements androidx.media3.effect.GlEffect {
    private final float scaleHeight;
    private final float scaleWidth;

    public abstract androidx.media3.effect.ConvolutionFunction1D getConvolution(long j);

    public SeparableConvolution() {
        this(1.0f, 1.0f);
    }

    public SeparableConvolution(float f, float f2) {
        this.scaleWidth = f;
        this.scaleHeight = f2;
    }

    @Override // androidx.media3.effect.GlEffect
    public androidx.media3.effect.GlShaderProgram toGlShaderProgram(android.content.Context context, boolean z) throws androidx.media3.common.VideoFrameProcessingException {
        return new androidx.media3.effect.SeparableConvolutionShaderProgram(context, z, this, this.scaleWidth, this.scaleHeight);
    }
}

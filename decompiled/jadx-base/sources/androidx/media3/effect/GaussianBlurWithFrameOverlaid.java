package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
public final class GaussianBlurWithFrameOverlaid extends androidx.media3.effect.SeparableConvolution {
    private final float numStandardDeviations;
    private final float scaleSharpX;
    private final float scaleSharpY;
    private final float sigma;

    public GaussianBlurWithFrameOverlaid(float f, float f2, float f3, float f4) {
        this.sigma = f;
        this.numStandardDeviations = f2;
        this.scaleSharpX = f3;
        this.scaleSharpY = f4;
    }

    public GaussianBlurWithFrameOverlaid(float f, float f2, float f3) {
        this(f, 2.0f, f2, f3);
    }

    @Override // androidx.media3.effect.SeparableConvolution
    public androidx.media3.effect.ConvolutionFunction1D getConvolution(long j) {
        return new androidx.media3.effect.GaussianFunction(this.sigma, this.numStandardDeviations);
    }

    @Override // androidx.media3.effect.SeparableConvolution, androidx.media3.effect.GlEffect
    public androidx.media3.effect.GlShaderProgram toGlShaderProgram(android.content.Context context, boolean z) throws androidx.media3.common.VideoFrameProcessingException {
        return new androidx.media3.effect.SharpSeparableConvolutionShaderProgram(context, z, this, this.scaleSharpX, this.scaleSharpY);
    }
}

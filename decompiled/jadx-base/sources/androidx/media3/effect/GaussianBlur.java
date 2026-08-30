package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
public final class GaussianBlur extends androidx.media3.effect.SeparableConvolution {
    private final float numStandardDeviations;
    private final float sigma;

    public GaussianBlur(float f, float f2) {
        this.sigma = f;
        this.numStandardDeviations = f2;
    }

    public GaussianBlur(float f) {
        this(f, 2.0f);
    }

    @Override // androidx.media3.effect.SeparableConvolution
    public androidx.media3.effect.ConvolutionFunction1D getConvolution(long j) {
        return new androidx.media3.effect.GaussianFunction(this.sigma, this.numStandardDeviations);
    }
}

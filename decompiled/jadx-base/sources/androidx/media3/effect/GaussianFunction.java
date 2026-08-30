package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
public final class GaussianFunction implements androidx.media3.effect.ConvolutionFunction1D {
    private final float numStdDev;
    private final float sigma;

    public GaussianFunction(float f, float f2) {
        androidx.media3.common.util.Assertions.checkArgument(f > 0.0f && f2 > 0.0f);
        this.sigma = f;
        this.numStdDev = f2;
    }

    @Override // androidx.media3.effect.ConvolutionFunction1D
    public float domainStart() {
        return (-this.numStdDev) * this.sigma;
    }

    @Override // androidx.media3.effect.ConvolutionFunction1D
    public float domainEnd() {
        return this.numStdDev * this.sigma;
    }

    @Override // androidx.media3.effect.ConvolutionFunction1D
    public float value(float f) {
        float fAbs = java.lang.Math.abs(f);
        float f2 = this.numStdDev;
        float f3 = this.sigma;
        if (fAbs > f2 * f3) {
            return 0.0f;
        }
        float f4 = f / f3;
        return (float) ((java.lang.Math.exp(((-f4) * f4) / 2.0f) / java.lang.Math.sqrt(6.283185307179586d)) / ((double) this.sigma));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.media3.effect.GaussianFunction)) {
            return false;
        }
        androidx.media3.effect.GaussianFunction gaussianFunction = (androidx.media3.effect.GaussianFunction) obj;
        return java.lang.Float.compare(gaussianFunction.sigma, this.sigma) == 0 && java.lang.Float.compare(gaussianFunction.numStdDev, this.numStdDev) == 0;
    }

    public int hashCode() {
        return java.util.Objects.hash(java.lang.Float.valueOf(this.sigma), java.lang.Float.valueOf(this.numStdDev));
    }
}

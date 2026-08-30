package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
final class ScaledLanczosFunction implements androidx.media3.effect.ConvolutionFunction1D {
    private final float radius;
    private final float scale;

    public ScaledLanczosFunction(float f, float f2) {
        this.radius = f;
        this.scale = f2;
    }

    @Override // androidx.media3.effect.ConvolutionFunction1D
    public float domainStart() {
        return (-this.radius) / this.scale;
    }

    @Override // androidx.media3.effect.ConvolutionFunction1D
    public float domainEnd() {
        return this.radius / this.scale;
    }

    @Override // androidx.media3.effect.ConvolutionFunction1D
    public float value(float f) {
        float f2 = f * this.scale;
        if (java.lang.Math.abs(f2) < 1.0E-5d) {
            return 1.0f;
        }
        float fAbs = java.lang.Math.abs(f2);
        float f3 = this.radius;
        if (fAbs > f3) {
            return 0.0f;
        }
        double d = f2;
        double d2 = 3.141592653589793d * d;
        return (float) (((((double) f3) * java.lang.Math.sin(d2)) * java.lang.Math.sin(d2 / ((double) this.radius))) / ((9.869604401089358d * d) * d));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.media3.effect.ScaledLanczosFunction)) {
            return false;
        }
        androidx.media3.effect.ScaledLanczosFunction scaledLanczosFunction = (androidx.media3.effect.ScaledLanczosFunction) obj;
        return java.lang.Float.compare(scaledLanczosFunction.radius, this.radius) == 0 && java.lang.Float.compare(scaledLanczosFunction.scale, this.scale) == 0;
    }

    public int hashCode() {
        return java.util.Objects.hash(java.lang.Float.valueOf(this.radius), java.lang.Float.valueOf(this.scale));
    }
}

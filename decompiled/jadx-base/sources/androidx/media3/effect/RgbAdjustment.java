package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
public final class RgbAdjustment implements androidx.media3.effect.RgbMatrix {
    private final float[] rgbMatrix;

    public static final class Builder {
        private float redScale = 1.0f;
        private float greenScale = 1.0f;
        private float blueScale = 1.0f;

        public androidx.media3.effect.RgbAdjustment.Builder setRedScale(float f) {
            androidx.media3.common.util.Assertions.checkArgument(0.0f <= f, "Red scale needs to be non-negative.");
            this.redScale = f;
            return this;
        }

        public androidx.media3.effect.RgbAdjustment.Builder setGreenScale(float f) {
            androidx.media3.common.util.Assertions.checkArgument(0.0f <= f, "Green scale needs to be non-negative.");
            this.greenScale = f;
            return this;
        }

        public androidx.media3.effect.RgbAdjustment.Builder setBlueScale(float f) {
            androidx.media3.common.util.Assertions.checkArgument(0.0f <= f, "Blue scale needs to be non-negative.");
            this.blueScale = f;
            return this;
        }

        public androidx.media3.effect.RgbAdjustment build() {
            float[] fArrCreate4x4IdentityMatrix = androidx.media3.common.util.GlUtil.create4x4IdentityMatrix();
            android.opengl.Matrix.scaleM(fArrCreate4x4IdentityMatrix, 0, this.redScale, this.greenScale, this.blueScale);
            return new androidx.media3.effect.RgbAdjustment(fArrCreate4x4IdentityMatrix);
        }
    }

    private RgbAdjustment(float[] fArr) {
        this.rgbMatrix = fArr;
    }

    @Override // androidx.media3.effect.RgbMatrix
    public float[] getMatrix(long j, boolean z) {
        return this.rgbMatrix;
    }

    @Override // androidx.media3.effect.GlEffect
    public boolean isNoOp(int i, int i2) {
        return java.util.Arrays.equals(this.rgbMatrix, androidx.media3.common.util.GlUtil.create4x4IdentityMatrix());
    }
}

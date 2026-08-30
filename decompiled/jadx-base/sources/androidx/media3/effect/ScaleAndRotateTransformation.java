package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
public final class ScaleAndRotateTransformation implements androidx.media3.effect.MatrixTransformation {
    private android.graphics.Matrix adjustedTransformationMatrix;
    public final float rotationDegrees;
    public final float scaleX;
    public final float scaleY;
    private final android.graphics.Matrix transformationMatrix;

    public static final class Builder {
        private float scaleX = 1.0f;
        private float scaleY = 1.0f;
        private float rotationDegrees = 0.0f;

        public androidx.media3.effect.ScaleAndRotateTransformation.Builder setScale(float f, float f2) {
            this.scaleX = f;
            this.scaleY = f2;
            return this;
        }

        public androidx.media3.effect.ScaleAndRotateTransformation.Builder setRotationDegrees(float f) {
            float f2 = f % 360.0f;
            this.rotationDegrees = f2;
            if (f2 < 0.0f) {
                this.rotationDegrees = f2 + 360.0f;
            }
            return this;
        }

        public androidx.media3.effect.ScaleAndRotateTransformation build() {
            return new androidx.media3.effect.ScaleAndRotateTransformation(this.scaleX, this.scaleY, this.rotationDegrees);
        }
    }

    private ScaleAndRotateTransformation(float f, float f2, float f3) {
        this.scaleX = f;
        this.scaleY = f2;
        this.rotationDegrees = f3;
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        this.transformationMatrix = matrix;
        matrix.postScale(f, f2);
        matrix.postRotate(f3);
    }

    @Override // androidx.media3.effect.GlMatrixTransformation
    public androidx.media3.common.util.Size configure(int i, int i2) {
        androidx.media3.common.util.Assertions.checkArgument(i > 0, "inputWidth must be positive");
        androidx.media3.common.util.Assertions.checkArgument(i2 > 0, "inputHeight must be positive");
        this.adjustedTransformationMatrix = new android.graphics.Matrix(this.transformationMatrix);
        if (this.transformationMatrix.isIdentity()) {
            return new androidx.media3.common.util.Size(i, i2);
        }
        float f = i;
        float f2 = i2;
        float f3 = f / f2;
        this.adjustedTransformationMatrix.preScale(f3, 1.0f);
        this.adjustedTransformationMatrix.postScale(1.0f / f3, 1.0f);
        float[][] fArr = {new float[]{-1.0f, -1.0f, 0.0f, 1.0f}, new float[]{-1.0f, 1.0f, 0.0f, 1.0f}, new float[]{1.0f, -1.0f, 0.0f, 1.0f}, new float[]{1.0f, 1.0f, 0.0f, 1.0f}};
        float fMax = Float.MIN_VALUE;
        float fMin = Float.MAX_VALUE;
        float fMin2 = Float.MAX_VALUE;
        float fMax2 = Float.MIN_VALUE;
        for (int i3 = 0; i3 < 4; i3++) {
            float[] fArr2 = fArr[i3];
            this.adjustedTransformationMatrix.mapPoints(fArr2);
            fMin = java.lang.Math.min(fMin, fArr2[0]);
            fMax = java.lang.Math.max(fMax, fArr2[0]);
            fMin2 = java.lang.Math.min(fMin2, fArr2[1]);
            fMax2 = java.lang.Math.max(fMax2, fArr2[1]);
        }
        float f4 = (fMax - fMin) / 2.0f;
        float f5 = (fMax2 - fMin2) / 2.0f;
        this.adjustedTransformationMatrix.postScale(1.0f / f4, 1.0f / f5);
        return new androidx.media3.common.util.Size(java.lang.Math.round(f * f4), java.lang.Math.round(f2 * f5));
    }

    @Override // androidx.media3.effect.MatrixTransformation
    public android.graphics.Matrix getMatrix(long j) {
        return (android.graphics.Matrix) androidx.media3.common.util.Assertions.checkStateNotNull(this.adjustedTransformationMatrix, "configure must be called first");
    }

    @Override // androidx.media3.effect.GlEffect
    public boolean isNoOp(int i, int i2) {
        androidx.media3.common.util.Size sizeConfigure = configure(i, i2);
        return ((android.graphics.Matrix) androidx.media3.common.util.Assertions.checkStateNotNull(this.adjustedTransformationMatrix)).isIdentity() && i == sizeConfigure.getWidth() && i2 == sizeConfigure.getHeight();
    }
}

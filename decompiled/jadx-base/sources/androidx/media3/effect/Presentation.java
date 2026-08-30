package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
public final class Presentation implements androidx.media3.effect.MatrixTransformation {
    private static final float ASPECT_RATIO_UNSET = -1.0f;
    public static final int LAYOUT_SCALE_TO_FIT = 0;
    public static final int LAYOUT_SCALE_TO_FIT_WITH_CROP = 1;
    public static final int LAYOUT_STRETCH_TO_FIT = 2;
    private final int layout;
    private float outputHeight;
    private float outputWidth;
    private float requestedAspectRatio;
    private final int requestedHeightPixels;
    private final int requestedWidthPixels;
    private android.graphics.Matrix transformationMatrix;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Layout {
    }

    private static void checkLayout(int i) {
        boolean z = true;
        if (i != 0 && i != 1 && i != 2) {
            z = false;
        }
        androidx.media3.common.util.Assertions.checkArgument(z, "invalid layout " + i);
    }

    public static androidx.media3.effect.Presentation createForAspectRatio(float f, int i) {
        androidx.media3.common.util.Assertions.checkArgument(f > 0.0f, "aspect ratio " + f + " must be positive");
        checkLayout(i);
        return new androidx.media3.effect.Presentation(-1, -1, f, i);
    }

    public static androidx.media3.effect.Presentation createForHeight(int i) {
        return new androidx.media3.effect.Presentation(-1, i, -1.0f, 0);
    }

    public static androidx.media3.effect.Presentation createForWidthAndHeight(int i, int i2, int i3) {
        androidx.media3.common.util.Assertions.checkArgument(i > 0, "width " + i + " must be positive");
        androidx.media3.common.util.Assertions.checkArgument(i2 > 0, "height " + i2 + " must be positive");
        checkLayout(i3);
        return new androidx.media3.effect.Presentation(i, i2, -1.0f, i3);
    }

    private Presentation(int i, int i2, float f, int i3) {
        androidx.media3.common.util.Assertions.checkArgument(f == -1.0f || i == -1, "width and aspect ratio should not both be set");
        this.requestedWidthPixels = i;
        this.requestedHeightPixels = i2;
        this.requestedAspectRatio = f;
        this.layout = i3;
        this.outputWidth = -1.0f;
        this.outputHeight = -1.0f;
        this.transformationMatrix = new android.graphics.Matrix();
    }

    @Override // androidx.media3.effect.GlMatrixTransformation
    public androidx.media3.common.util.Size configure(int i, int i2) {
        int i3;
        androidx.media3.common.util.Assertions.checkArgument(i > 0, "inputWidth must be positive");
        androidx.media3.common.util.Assertions.checkArgument(i2 > 0, "inputHeight must be positive");
        this.transformationMatrix = new android.graphics.Matrix();
        this.outputWidth = i;
        this.outputHeight = i2;
        int i4 = this.requestedWidthPixels;
        if (i4 != -1 && (i3 = this.requestedHeightPixels) != -1) {
            this.requestedAspectRatio = i4 / i3;
        }
        if (this.requestedAspectRatio != -1.0f) {
            applyAspectRatio();
        }
        int i5 = this.requestedHeightPixels;
        if (i5 != -1) {
            int i6 = this.requestedWidthPixels;
            if (i6 != -1) {
                this.outputWidth = i6;
            } else {
                this.outputWidth = (i5 * this.outputWidth) / this.outputHeight;
            }
            this.outputHeight = i5;
        }
        return new androidx.media3.common.util.Size(java.lang.Math.round(this.outputWidth), java.lang.Math.round(this.outputHeight));
    }

    @Override // androidx.media3.effect.MatrixTransformation
    public android.graphics.Matrix getMatrix(long j) {
        return (android.graphics.Matrix) androidx.media3.common.util.Assertions.checkStateNotNull(this.transformationMatrix, "configure must be called first");
    }

    @Override // androidx.media3.effect.GlEffect
    public boolean isNoOp(int i, int i2) {
        configure(i, i2);
        return ((android.graphics.Matrix) androidx.media3.common.util.Assertions.checkStateNotNull(this.transformationMatrix)).isIdentity() && i == java.lang.Math.round(this.outputWidth) && i2 == java.lang.Math.round(this.outputHeight);
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"transformationMatrix"})
    private void applyAspectRatio() {
        float f = this.outputWidth;
        float f2 = this.outputHeight;
        float f3 = f / f2;
        int i = this.layout;
        if (i == 0) {
            float f4 = this.requestedAspectRatio;
            if (f4 > f3) {
                this.transformationMatrix.setScale(f3 / f4, 1.0f);
                this.outputWidth = this.outputHeight * this.requestedAspectRatio;
                return;
            } else {
                this.transformationMatrix.setScale(1.0f, f4 / f3);
                this.outputHeight = this.outputWidth / this.requestedAspectRatio;
                return;
            }
        }
        if (i == 1) {
            float f5 = this.requestedAspectRatio;
            if (f5 > f3) {
                this.transformationMatrix.setScale(1.0f, f5 / f3);
                this.outputHeight = this.outputWidth / this.requestedAspectRatio;
                return;
            } else {
                this.transformationMatrix.setScale(f3 / f5, 1.0f);
                this.outputWidth = this.outputHeight * this.requestedAspectRatio;
                return;
            }
        }
        if (i == 2) {
            float f6 = this.requestedAspectRatio;
            if (f6 > f3) {
                this.outputWidth = f2 * f6;
            } else {
                this.outputHeight = f / f6;
            }
        }
    }
}

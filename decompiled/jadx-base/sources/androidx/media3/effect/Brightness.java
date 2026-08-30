package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
public final class Brightness implements androidx.media3.effect.RgbMatrix {
    private final float[] rgbMatrix;

    public Brightness(float f) {
        androidx.media3.common.util.Assertions.checkArgument(f >= -1.0f && f <= 1.0f, "brightness value outside of range from -1f to 1f, inclusive");
        float[] fArrCreate4x4IdentityMatrix = androidx.media3.common.util.GlUtil.create4x4IdentityMatrix();
        this.rgbMatrix = fArrCreate4x4IdentityMatrix;
        android.opengl.Matrix.translateM(fArrCreate4x4IdentityMatrix, 0, f, f, f);
    }

    @Override // androidx.media3.effect.RgbMatrix
    public float[] getMatrix(long j, boolean z) {
        androidx.media3.common.util.Assertions.checkArgument(!z, "HDR is not supported.");
        return this.rgbMatrix;
    }

    @Override // androidx.media3.effect.GlEffect
    public boolean isNoOp(int i, int i2) {
        return java.util.Arrays.equals(this.rgbMatrix, androidx.media3.common.util.GlUtil.create4x4IdentityMatrix());
    }
}

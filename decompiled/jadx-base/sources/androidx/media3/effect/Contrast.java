package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
public final class Contrast implements androidx.media3.effect.RgbMatrix {
    private final float contrast;
    private final float[] contrastMatrix;

    public Contrast(float f) {
        androidx.media3.common.util.Assertions.checkArgument(-1.0f <= f && f <= 1.0f, "Contrast needs to be in the interval [-1, 1].");
        this.contrast = f;
        float f2 = (f + 1.0f) / (1.0001f - f);
        float f3 = (1.0f - f2) * 0.5f;
        this.contrastMatrix = new float[]{f2, 0.0f, 0.0f, 0.0f, 0.0f, f2, 0.0f, 0.0f, 0.0f, 0.0f, f2, 0.0f, f3, f3, f3, 1.0f};
    }

    @Override // androidx.media3.effect.RgbMatrix
    public float[] getMatrix(long j, boolean z) {
        return this.contrastMatrix;
    }

    @Override // androidx.media3.effect.GlEffect
    public boolean isNoOp(int i, int i2) {
        return this.contrast == 0.0f;
    }
}

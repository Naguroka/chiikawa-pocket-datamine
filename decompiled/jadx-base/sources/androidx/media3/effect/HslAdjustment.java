package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
public final class HslAdjustment implements androidx.media3.effect.GlEffect {
    public final float hueAdjustmentDegrees;
    public final float lightnessAdjustment;
    public final float saturationAdjustment;

    public static final class Builder {
        private float hueAdjustment;
        private float lightnessAdjustment;
        private float saturationAdjustment;

        public androidx.media3.effect.HslAdjustment.Builder adjustHue(float f) {
            this.hueAdjustment = f % 360.0f;
            return this;
        }

        public androidx.media3.effect.HslAdjustment.Builder adjustSaturation(float f) {
            androidx.media3.common.util.Assertions.checkArgument(-100.0f <= f && f <= 100.0f, "Can adjust the saturation by only 100 in either direction, but provided " + f);
            this.saturationAdjustment = f;
            return this;
        }

        public androidx.media3.effect.HslAdjustment.Builder adjustLightness(float f) {
            androidx.media3.common.util.Assertions.checkArgument(-100.0f <= f && f <= 100.0f, "Can adjust the lightness by only 100 in either direction, but provided " + f);
            this.lightnessAdjustment = f;
            return this;
        }

        public androidx.media3.effect.HslAdjustment build() {
            return new androidx.media3.effect.HslAdjustment(this.hueAdjustment, this.saturationAdjustment, this.lightnessAdjustment);
        }
    }

    private HslAdjustment(float f, float f2, float f3) {
        this.hueAdjustmentDegrees = f;
        this.saturationAdjustment = f2;
        this.lightnessAdjustment = f3;
    }

    @Override // androidx.media3.effect.GlEffect
    public androidx.media3.effect.BaseGlShaderProgram toGlShaderProgram(android.content.Context context, boolean z) throws androidx.media3.common.VideoFrameProcessingException {
        return new androidx.media3.effect.HslShaderProgram(context, this, z);
    }

    @Override // androidx.media3.effect.GlEffect
    public boolean isNoOp(int i, int i2) {
        return this.hueAdjustmentDegrees == 0.0f && this.saturationAdjustment == 0.0f && this.lightnessAdjustment == 0.0f;
    }
}

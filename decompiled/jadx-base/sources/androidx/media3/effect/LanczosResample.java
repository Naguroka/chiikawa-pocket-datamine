package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
public final class LanczosResample implements androidx.media3.effect.GlEffect {
    private static final float DEFAULT_RADIUS = 3.0f;
    private final int height;
    private final float radius;
    private final int width;

    public static androidx.media3.effect.LanczosResample scaleToFit(int i, int i2) {
        androidx.media3.common.util.Assertions.checkArgument(i > 0);
        androidx.media3.common.util.Assertions.checkArgument(i2 > 0);
        return new androidx.media3.effect.LanczosResample(DEFAULT_RADIUS, i, i2);
    }

    private LanczosResample(float f, int i, int i2) {
        this.radius = f;
        this.width = i;
        this.height = i2;
    }

    @Override // androidx.media3.effect.GlEffect
    public androidx.media3.effect.GlShaderProgram toGlShaderProgram(android.content.Context context, boolean z) throws androidx.media3.common.VideoFrameProcessingException {
        return new androidx.media3.effect.SeparableConvolutionShaderProgram(context, z, new androidx.media3.effect.LanczosResample.LanczosResampleScaledFunctionProvider(this.radius, this.width, this.height));
    }

    private static class LanczosResampleScaledFunctionProvider implements androidx.media3.effect.ConvolutionFunction1D.Provider {
        private static final float SCALE_UNSET = -3.4028235E38f;
        private final int height;
        private final float radius;
        private float scale;
        private final int width;

        private LanczosResampleScaledFunctionProvider(float f, int i, int i2) {
            androidx.media3.common.util.Assertions.checkArgument(f > 0.0f);
            androidx.media3.common.util.Assertions.checkArgument(i > 0);
            androidx.media3.common.util.Assertions.checkArgument(i2 > 0);
            this.radius = f;
            this.width = i;
            this.height = i2;
            this.scale = -3.4028235E38f;
        }

        @Override // androidx.media3.effect.ConvolutionFunction1D.Provider
        public androidx.media3.effect.ConvolutionFunction1D getConvolution(long j) {
            return new androidx.media3.effect.ScaledLanczosFunction(this.radius, java.lang.Math.min(this.scale, 1.0f));
        }

        @Override // androidx.media3.effect.ConvolutionFunction1D.Provider
        public androidx.media3.common.util.Size configure(androidx.media3.common.util.Size size) {
            androidx.media3.common.util.Assertions.checkArgument(size.getWidth() > 0);
            androidx.media3.common.util.Assertions.checkArgument(size.getHeight() > 0);
            if (size.getHeight() * this.width <= this.height * size.getWidth()) {
                this.scale = this.width / size.getWidth();
                return new androidx.media3.common.util.Size(this.width, java.lang.Math.round(size.getHeight() * this.scale));
            }
            this.scale = this.height / size.getHeight();
            return new androidx.media3.common.util.Size(java.lang.Math.round(size.getWidth() * this.scale), this.height);
        }
    }
}

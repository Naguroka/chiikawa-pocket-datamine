package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
public final class RgbFilter implements androidx.media3.effect.RgbMatrix {
    private static final int COLOR_FILTER_GRAYSCALE_INDEX = 1;
    private static final int COLOR_FILTER_INVERTED_INDEX = 2;
    private final int colorFilter;
    private java.lang.Boolean useHdr;
    private static final float[] FILTER_MATRIX_GRAYSCALE_SDR = {0.2126f, 0.2126f, 0.2126f, 0.0f, 0.7152f, 0.7152f, 0.7152f, 0.0f, 0.0722f, 0.0722f, 0.0722f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    private static final float[] FILTER_MATRIX_GRAYSCALE_HDR = {0.2627f, 0.2627f, 0.2627f, 0.0f, 0.678f, 0.678f, 0.678f, 0.0f, 0.0593f, 0.0593f, 0.0593f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    private static final float[] FILTER_MATRIX_INVERTED = {-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f};

    public static androidx.media3.effect.RgbFilter createGrayscaleFilter() {
        return new androidx.media3.effect.RgbFilter(1);
    }

    public static androidx.media3.effect.RgbFilter createInvertedFilter() {
        return new androidx.media3.effect.RgbFilter(2);
    }

    private RgbFilter(int i) {
        this.colorFilter = i;
    }

    private void checkForConsistentHdrSetting(boolean z) {
        java.lang.Boolean bool = this.useHdr;
        if (bool == null) {
            this.useHdr = java.lang.Boolean.valueOf(z);
        } else {
            androidx.media3.common.util.Assertions.checkState(bool.booleanValue() == z, "Changing HDR setting is not supported.");
        }
    }

    @Override // androidx.media3.effect.RgbMatrix
    public float[] getMatrix(long j, boolean z) {
        checkForConsistentHdrSetting(z);
        int i = this.colorFilter;
        if (i == 1) {
            return z ? FILTER_MATRIX_GRAYSCALE_HDR : FILTER_MATRIX_GRAYSCALE_SDR;
        }
        if (i == 2) {
            return FILTER_MATRIX_INVERTED;
        }
        throw new java.lang.IllegalStateException("Invalid color filter " + this.colorFilter);
    }

    @Override // androidx.media3.effect.RgbMatrix, androidx.media3.effect.GlEffect
    public androidx.media3.effect.BaseGlShaderProgram toGlShaderProgram(android.content.Context context, boolean z) throws androidx.media3.common.VideoFrameProcessingException {
        checkForConsistentHdrSetting(z);
        return super.toGlShaderProgram(context, z);
    }
}

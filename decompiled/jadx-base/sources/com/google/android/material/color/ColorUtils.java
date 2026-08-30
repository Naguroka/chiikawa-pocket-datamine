package com.google.android.material.color;

/* JADX INFO: loaded from: classes5.dex */
final class ColorUtils {
    private static final float[] WHITE_POINT_D65 = {95.047f, 100.0f, 108.883f};

    public static int blueFromInt(int i) {
        return i & 255;
    }

    public static int greenFromInt(int i) {
        return (i & androidx.core.view.MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
    }

    public static int intFromRgb(int i, int i2, int i3) {
        return (((((i & 255) << 16) | androidx.core.view.ViewCompat.MEASURED_STATE_MASK) | ((i2 & 255) << 8)) | (i3 & 255)) >>> 0;
    }

    public static int redFromInt(int i) {
        return (i & 16711680) >> 16;
    }

    private ColorUtils() {
    }

    public static final float[] whitePointD65() {
        return java.util.Arrays.copyOf(WHITE_POINT_D65, 3);
    }

    public static float lstarFromInt(int i) {
        return (float) labFromInt(i)[0];
    }

    public static java.lang.String hexFromInt(int i) {
        return java.lang.String.format("#%02x%02x%02x", java.lang.Integer.valueOf(redFromInt(i)), java.lang.Integer.valueOf(greenFromInt(i)), java.lang.Integer.valueOf(blueFromInt(i)));
    }

    public static float[] xyzFromInt(int i) {
        float fLinearized = linearized(redFromInt(i) / 255.0f) * 100.0f;
        float fLinearized2 = linearized(greenFromInt(i) / 255.0f) * 100.0f;
        float fLinearized3 = linearized(blueFromInt(i) / 255.0f) * 100.0f;
        return new float[]{(0.41233894f * fLinearized) + (0.35762063f * fLinearized2) + (0.18051042f * fLinearized3), (0.2126f * fLinearized) + (0.7152f * fLinearized2) + (0.0722f * fLinearized3), (fLinearized * 0.01932141f) + (fLinearized2 * 0.11916382f) + (fLinearized3 * 0.9503448f)};
    }

    public static double[] labFromInt(int i) {
        float[] fArrXyzFromInt = xyzFromInt(i);
        float f = fArrXyzFromInt[1];
        float[] fArr = WHITE_POINT_D65;
        double d = f / fArr[1];
        double dCbrt = d > 0.008856451679035631d ? java.lang.Math.cbrt(d) : ((d * 903.2962962962963d) + 16.0d) / 116.0d;
        double d2 = fArrXyzFromInt[0] / fArr[0];
        double dCbrt2 = d2 > 0.008856451679035631d ? java.lang.Math.cbrt(d2) : ((d2 * 903.2962962962963d) + 16.0d) / 116.0d;
        double d3 = fArrXyzFromInt[2] / fArr[2];
        return new double[]{(116.0d * dCbrt) - 16.0d, (dCbrt2 - dCbrt) * 500.0d, (dCbrt - (d3 > 0.008856451679035631d ? java.lang.Math.cbrt(d3) : ((d3 * 903.2962962962963d) + 16.0d) / 116.0d)) * 200.0d};
    }

    public static int intFromLab(double d, double d2, double d3) {
        double d4 = (d + 16.0d) / 116.0d;
        double d5 = (d2 / 500.0d) + d4;
        double d6 = d4 - (d3 / 200.0d);
        double d7 = d5 * d5 * d5;
        if (d7 <= 0.008856451679035631d) {
            d7 = ((d5 * 116.0d) - 16.0d) / 903.2962962962963d;
        }
        double d8 = d > 8.0d ? d4 * d4 * d4 : d / 903.2962962962963d;
        double d9 = d6 * d6 * d6;
        if (d9 <= 0.008856451679035631d) {
            d9 = ((d6 * 116.0d) - 16.0d) / 903.2962962962963d;
        }
        float[] fArr = WHITE_POINT_D65;
        return intFromXyzComponents((float) (d7 * ((double) fArr[0])), (float) (d8 * ((double) fArr[1])), (float) (d9 * ((double) fArr[2])));
    }

    public static int intFromXyzComponents(float f, float f2, float f3) {
        float f4 = f / 100.0f;
        float f5 = f2 / 100.0f;
        float f6 = f3 / 100.0f;
        float f7 = (3.2406f * f4) + ((-1.5372f) * f5) + ((-0.4986f) * f6);
        float f8 = ((-0.9689f) * f4) + (1.8758f * f5) + (0.0415f * f6);
        float f9 = (f4 * 0.0557f) + (f5 * (-0.204f)) + (f6 * 1.057f);
        return intFromRgb(java.lang.Math.max(java.lang.Math.min(255, java.lang.Math.round(delinearized(f7) * 255.0f)), 0), java.lang.Math.max(java.lang.Math.min(255, java.lang.Math.round(delinearized(f8) * 255.0f)), 0), java.lang.Math.max(java.lang.Math.min(255, java.lang.Math.round(delinearized(f9) * 255.0f)), 0));
    }

    public static int intFromXyz(float[] fArr) {
        return intFromXyzComponents(fArr[0], fArr[1], fArr[2]);
    }

    public static int intFromLstar(float f) {
        float f2 = (f + 16.0f) / 116.0f;
        float f3 = f2 * f2 * f2;
        boolean z = f3 > 0.008856452f;
        float f4 = (f > 8.0f ? 1 : (f == 8.0f ? 0 : -1)) > 0 ? f3 : f / 903.2963f;
        float f5 = z ? f3 : ((f2 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f3 = ((f2 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = WHITE_POINT_D65;
        return intFromXyz(new float[]{f5 * fArr[0], f4 * fArr[1], f3 * fArr[2]});
    }

    public static float yFromLstar(float f) {
        return (f > 8.0f ? (float) java.lang.Math.pow((((double) f) + 16.0d) / 116.0d, 3.0d) : f / 903.2963f) * 100.0f;
    }

    public static float linearized(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) java.lang.Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static float delinearized(float f) {
        return f <= 0.0031308f ? f * 12.92f : (((float) java.lang.Math.pow(f, 0.4166666567325592d)) * 1.055f) - 0.055f;
    }
}

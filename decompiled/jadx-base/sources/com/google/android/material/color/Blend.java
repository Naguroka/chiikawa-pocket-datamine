package com.google.android.material.color;

/* JADX INFO: loaded from: classes5.dex */
final class Blend {
    private static final float HARMONIZE_MAX_DEGREES = 15.0f;
    private static final float HARMONIZE_PERCENTAGE = 0.5f;

    private Blend() {
    }

    public static int harmonize(int i, int i2) {
        com.google.android.material.color.Hct hctFromInt = com.google.android.material.color.Hct.fromInt(i);
        com.google.android.material.color.Hct hctFromInt2 = com.google.android.material.color.Hct.fromInt(i2);
        return com.google.android.material.color.Hct.from(com.google.android.material.color.MathUtils.sanitizeDegrees(hctFromInt.getHue() + (java.lang.Math.min(com.google.android.material.color.MathUtils.differenceDegrees(hctFromInt.getHue(), hctFromInt2.getHue()) * 0.5f, HARMONIZE_MAX_DEGREES) * rotationDirection(hctFromInt.getHue(), hctFromInt2.getHue()))), hctFromInt.getChroma(), hctFromInt.getTone()).toInt();
    }

    public static int blendHctHue(int i, int i2, float f) {
        return com.google.android.material.color.Hct.from(com.google.android.material.color.Cam16.fromInt(blendCam16Ucs(i, i2, f)).getHue(), com.google.android.material.color.Cam16.fromInt(i).getChroma(), com.google.android.material.color.ColorUtils.lstarFromInt(i)).toInt();
    }

    public static int blendCam16Ucs(int i, int i2, float f) {
        com.google.android.material.color.Cam16 cam16FromInt = com.google.android.material.color.Cam16.fromInt(i);
        com.google.android.material.color.Cam16 cam16FromInt2 = com.google.android.material.color.Cam16.fromInt(i2);
        float jStar = cam16FromInt.getJStar();
        float aStar = cam16FromInt.getAStar();
        float bStar = cam16FromInt.getBStar();
        return com.google.android.material.color.Cam16.fromUcs(jStar + ((cam16FromInt2.getJStar() - jStar) * f), aStar + ((cam16FromInt2.getAStar() - aStar) * f), bStar + ((cam16FromInt2.getBStar() - bStar) * f)).getInt();
    }

    private static float rotationDirection(float f, float f2) {
        float f3 = f2 - f;
        float f4 = f3 + 360.0f;
        float f5 = f3 - 360.0f;
        float fAbs = java.lang.Math.abs(f3);
        float fAbs2 = java.lang.Math.abs(f4);
        float fAbs3 = java.lang.Math.abs(f5);
        if (fAbs <= fAbs2 && fAbs <= fAbs3) {
            return ((double) f3) >= 0.0d ? 1.0f : -1.0f;
        }
        if (fAbs2 > fAbs || fAbs2 > fAbs3) {
            return ((double) f5) >= 0.0d ? 1.0f : -1.0f;
        }
        return ((double) f4) >= 0.0d ? 1.0f : -1.0f;
    }
}

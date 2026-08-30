package com.google.android.material.color;

/* JADX INFO: loaded from: classes5.dex */
final class Cam16 {
    private final float astar;
    private final float bstar;
    private final float chroma;
    private final float hue;
    private final float j;
    private final float jstar;
    private final float m;
    private final float q;
    private final float s;
    static final float[][] XYZ_TO_CAM16RGB = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    static final float[][] CAM16RGB_TO_XYZ = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    float distance(com.google.android.material.color.Cam16 cam16) {
        float jStar = getJStar() - cam16.getJStar();
        float aStar = getAStar() - cam16.getAStar();
        float bStar = getBStar() - cam16.getBStar();
        return (float) (java.lang.Math.pow(java.lang.Math.sqrt((jStar * jStar) + (aStar * aStar) + (bStar * bStar)), 0.63d) * 1.41d);
    }

    public float getHue() {
        return this.hue;
    }

    public float getChroma() {
        return this.chroma;
    }

    public float getJ() {
        return this.j;
    }

    public float getQ() {
        return this.q;
    }

    public float getM() {
        return this.m;
    }

    public float getS() {
        return this.s;
    }

    public float getJStar() {
        return this.jstar;
    }

    public float getAStar() {
        return this.astar;
    }

    public float getBStar() {
        return this.bstar;
    }

    private Cam16(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.hue = f;
        this.chroma = f2;
        this.j = f3;
        this.q = f4;
        this.m = f5;
        this.s = f6;
        this.jstar = f7;
        this.astar = f8;
        this.bstar = f9;
    }

    public static com.google.android.material.color.Cam16 fromInt(int i) {
        return fromIntInViewingConditions(i, com.google.android.material.color.ViewingConditions.DEFAULT);
    }

    static com.google.android.material.color.Cam16 fromIntInViewingConditions(int i, com.google.android.material.color.ViewingConditions viewingConditions) {
        float fLinearized = com.google.android.material.color.ColorUtils.linearized(((16711680 & i) >> 16) / 255.0f) * 100.0f;
        float fLinearized2 = com.google.android.material.color.ColorUtils.linearized(((65280 & i) >> 8) / 255.0f) * 100.0f;
        float fLinearized3 = com.google.android.material.color.ColorUtils.linearized((i & 255) / 255.0f) * 100.0f;
        float f = (0.41233894f * fLinearized) + (0.35762063f * fLinearized2) + (0.18051042f * fLinearized3);
        float f2 = (0.2126f * fLinearized) + (0.7152f * fLinearized2) + (0.0722f * fLinearized3);
        float f3 = (fLinearized * 0.01932141f) + (fLinearized2 * 0.11916382f) + (fLinearized3 * 0.9503448f);
        float[][] fArr = XYZ_TO_CAM16RGB;
        float[] fArr2 = fArr[0];
        float f4 = (fArr2[0] * f) + (fArr2[1] * f2) + (fArr2[2] * f3);
        float[] fArr3 = fArr[1];
        float f5 = (fArr3[0] * f) + (fArr3[1] * f2) + (fArr3[2] * f3);
        float[] fArr4 = fArr[2];
        float f6 = (f * fArr4[0]) + (f2 * fArr4[1]) + (f3 * fArr4[2]);
        float f7 = viewingConditions.getRgbD()[0] * f4;
        float f8 = viewingConditions.getRgbD()[1] * f5;
        float f9 = viewingConditions.getRgbD()[2] * f6;
        float fPow = (float) java.lang.Math.pow(((double) (viewingConditions.getFl() * java.lang.Math.abs(f7))) / 100.0d, 0.42d);
        float fPow2 = (float) java.lang.Math.pow(((double) (viewingConditions.getFl() * java.lang.Math.abs(f8))) / 100.0d, 0.42d);
        float fPow3 = (float) java.lang.Math.pow(((double) (viewingConditions.getFl() * java.lang.Math.abs(f9))) / 100.0d, 0.42d);
        float fSignum = ((java.lang.Math.signum(f7) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((java.lang.Math.signum(f8) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((java.lang.Math.signum(f9) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d = fSignum3;
        float f10 = ((float) (((((double) fSignum) * 11.0d) + (((double) fSignum2) * (-12.0d))) + d)) / 11.0f;
        float f11 = ((float) (((double) (fSignum + fSignum2)) - (d * 2.0d))) / 9.0f;
        float f12 = fSignum2 * 20.0f;
        float f13 = (((fSignum * 20.0f) + f12) + (21.0f * fSignum3)) / 20.0f;
        float f14 = (((fSignum * 40.0f) + f12) + fSignum3) / 20.0f;
        double d2 = f11;
        double d3 = f10;
        float fAtan2 = (((float) java.lang.Math.atan2(d2, d3)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f15 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) java.lang.Math.pow((f14 * viewingConditions.getNbb()) / viewingConditions.getAw(), viewingConditions.getC() * viewingConditions.getZ())) * 100.0f;
        float c = (4.0f / viewingConditions.getC()) * ((float) java.lang.Math.sqrt(fPow4 / 100.0f)) * (viewingConditions.getAw() + 4.0f) * viewingConditions.getFlRoot();
        float fPow5 = ((float) java.lang.Math.pow(1.64d - java.lang.Math.pow(0.29d, viewingConditions.getN()), 0.73d)) * ((float) java.lang.Math.pow((((((((float) (java.lang.Math.cos(java.lang.Math.toRadians(((double) fAtan2) < 20.14d ? 360.0f + fAtan2 : fAtan2) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * viewingConditions.getNc()) * viewingConditions.getNcb()) * ((float) java.lang.Math.hypot(d3, d2))) / (f13 + 0.305f), 0.9d));
        float fSqrt = fPow5 * ((float) java.lang.Math.sqrt(((double) fPow4) / 100.0d));
        float flRoot = fSqrt * viewingConditions.getFlRoot();
        float fSqrt2 = ((float) java.lang.Math.sqrt((fPow5 * viewingConditions.getC()) / (viewingConditions.getAw() + 4.0f))) * 50.0f;
        float f16 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog1p = ((float) java.lang.Math.log1p(0.0228f * flRoot)) * 43.85965f;
        double d4 = f15;
        return new com.google.android.material.color.Cam16(fAtan2, fSqrt, fPow4, c, flRoot, fSqrt2, f16, fLog1p * ((float) java.lang.Math.cos(d4)), fLog1p * ((float) java.lang.Math.sin(d4)));
    }

    static com.google.android.material.color.Cam16 fromJch(float f, float f2, float f3) {
        return fromJchInViewingConditions(f, f2, f3, com.google.android.material.color.ViewingConditions.DEFAULT);
    }

    private static com.google.android.material.color.Cam16 fromJchInViewingConditions(float f, float f2, float f3, com.google.android.material.color.ViewingConditions viewingConditions) {
        double d = ((double) f) / 100.0d;
        float c = (4.0f / viewingConditions.getC()) * ((float) java.lang.Math.sqrt(d)) * (viewingConditions.getAw() + 4.0f) * viewingConditions.getFlRoot();
        float flRoot = f2 * viewingConditions.getFlRoot();
        float fSqrt = ((float) java.lang.Math.sqrt(((f2 / ((float) java.lang.Math.sqrt(d))) * viewingConditions.getC()) / (viewingConditions.getAw() + 4.0f))) * 50.0f;
        float f4 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float fLog1p = ((float) java.lang.Math.log1p(((double) flRoot) * 0.0228d)) * 43.85965f;
        double d2 = (3.1415927f * f3) / 180.0f;
        return new com.google.android.material.color.Cam16(f3, f2, f, c, flRoot, fSqrt, f4, fLog1p * ((float) java.lang.Math.cos(d2)), fLog1p * ((float) java.lang.Math.sin(d2)));
    }

    public static com.google.android.material.color.Cam16 fromUcs(float f, float f2, float f3) {
        return fromUcsInViewingConditions(f, f2, f3, com.google.android.material.color.ViewingConditions.DEFAULT);
    }

    public static com.google.android.material.color.Cam16 fromUcsInViewingConditions(float f, float f2, float f3, com.google.android.material.color.ViewingConditions viewingConditions) {
        double d = f2;
        double d2 = f3;
        double dExpm1 = (java.lang.Math.expm1(java.lang.Math.hypot(d, d2) * 0.02280000038444996d) / 0.02280000038444996d) / ((double) viewingConditions.getFlRoot());
        double dAtan2 = java.lang.Math.atan2(d2, d) * 57.29577951308232d;
        if (dAtan2 < 0.0d) {
            dAtan2 += 360.0d;
        }
        return fromJchInViewingConditions(f / (1.0f - ((f - 100.0f) * 0.007f)), (float) dExpm1, (float) dAtan2, viewingConditions);
    }

    public int getInt() {
        return viewed(com.google.android.material.color.ViewingConditions.DEFAULT);
    }

    int viewed(com.google.android.material.color.ViewingConditions viewingConditions) {
        float fPow = (float) java.lang.Math.pow(((double) ((((double) getChroma()) == 0.0d || ((double) getJ()) == 0.0d) ? 0.0f : getChroma() / ((float) java.lang.Math.sqrt(((double) getJ()) / 100.0d)))) / java.lang.Math.pow(1.64d - java.lang.Math.pow(0.29d, viewingConditions.getN()), 0.73d), 1.1111111111111112d);
        double hue = (getHue() * 3.1415927f) / 180.0f;
        float fCos = ((float) (java.lang.Math.cos(2.0d + hue) + 3.8d)) * 0.25f;
        float aw = viewingConditions.getAw() * ((float) java.lang.Math.pow(((double) getJ()) / 100.0d, (1.0d / ((double) viewingConditions.getC())) / ((double) viewingConditions.getZ())));
        float nc = fCos * 3846.1538f * viewingConditions.getNc() * viewingConditions.getNcb();
        float nbb = aw / viewingConditions.getNbb();
        float fSin = (float) java.lang.Math.sin(hue);
        float fCos2 = (float) java.lang.Math.cos(hue);
        float f = (((0.305f + nbb) * 23.0f) * fPow) / (((nc * 23.0f) + ((11.0f * fPow) * fCos2)) + ((fPow * 108.0f) * fSin));
        float f2 = fCos2 * f;
        float f3 = f * fSin;
        float f4 = nbb * 460.0f;
        float f5 = (((451.0f * f2) + f4) + (288.0f * f3)) / 1403.0f;
        float f6 = ((f4 - (891.0f * f2)) - (261.0f * f3)) / 1403.0f;
        float f7 = ((f4 - (f2 * 220.0f)) - (f3 * 6300.0f)) / 1403.0f;
        float fSignum = java.lang.Math.signum(f5) * (100.0f / viewingConditions.getFl()) * ((float) java.lang.Math.pow((float) java.lang.Math.max(0.0d, (((double) java.lang.Math.abs(f5)) * 27.13d) / (400.0d - ((double) java.lang.Math.abs(f5)))), 2.380952380952381d));
        float fSignum2 = java.lang.Math.signum(f6) * (100.0f / viewingConditions.getFl()) * ((float) java.lang.Math.pow((float) java.lang.Math.max(0.0d, (((double) java.lang.Math.abs(f6)) * 27.13d) / (400.0d - ((double) java.lang.Math.abs(f6)))), 2.380952380952381d));
        float fSignum3 = java.lang.Math.signum(f7) * (100.0f / viewingConditions.getFl()) * ((float) java.lang.Math.pow((float) java.lang.Math.max(0.0d, (((double) java.lang.Math.abs(f7)) * 27.13d) / (400.0d - ((double) java.lang.Math.abs(f7)))), 2.380952380952381d));
        float f8 = fSignum / viewingConditions.getRgbD()[0];
        float f9 = fSignum2 / viewingConditions.getRgbD()[1];
        float f10 = fSignum3 / viewingConditions.getRgbD()[2];
        float[][] fArr = CAM16RGB_TO_XYZ;
        float[] fArr2 = fArr[0];
        float f11 = (fArr2[0] * f8) + (fArr2[1] * f9) + (fArr2[2] * f10);
        float[] fArr3 = fArr[1];
        float f12 = (fArr3[0] * f8) + (fArr3[1] * f9) + (fArr3[2] * f10);
        float[] fArr4 = fArr[2];
        return com.google.android.material.color.ColorUtils.intFromXyzComponents(f11, f12, (f8 * fArr4[0]) + (f9 * fArr4[1]) + (f10 * fArr4[2]));
    }
}

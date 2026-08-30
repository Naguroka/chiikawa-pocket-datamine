package com.bytedance.sdk.openadsdk.core.Kg.bg;

/* JADX INFO: loaded from: classes4.dex */
public class bg {
    public static android.util.Pair<java.lang.Float, java.lang.Float> bg(android.view.Window window, int i) {
        android.view.View decorView = window.getDecorView();
        float[] fArrBg = {decorView.getWidth() - (decorView.getPaddingLeft() * 2), decorView.getHeight() - (decorView.getPaddingTop() * 2)};
        fArrBg[0] = com.bytedance.sdk.openadsdk.utils.ZQc.eqN(window.getContext(), fArrBg[0]);
        float fEqN = com.bytedance.sdk.openadsdk.utils.ZQc.eqN(window.getContext(), fArrBg[1]);
        fArrBg[1] = fEqN;
        if (fArrBg[0] < 10.0f || fEqN < 10.0f) {
            fArrBg = bg(window.getContext(), com.bytedance.sdk.openadsdk.utils.ZQc.eqN(window.getContext(), com.bytedance.sdk.openadsdk.utils.ZQc.bg()), i);
        }
        float fMax = java.lang.Math.max(fArrBg[0], fArrBg[1]);
        float fMin = java.lang.Math.min(fArrBg[0], fArrBg[1]);
        if (i == 1) {
            fArrBg[0] = fMin;
            fArrBg[1] = fMax;
        } else {
            fArrBg[0] = fMax;
            fArrBg[1] = fMin;
        }
        return new android.util.Pair<>(java.lang.Float.valueOf(fArrBg[0]), java.lang.Float.valueOf(fArrBg[1]));
    }

    private static float[] bg(android.content.Context context, int i, int i2) {
        float fBg = bg(context);
        float fIL = IL(context);
        if ((i2 == 1) != (fBg > fIL)) {
            float f = fBg + fIL;
            fIL = f - fIL;
            fBg = f - fIL;
        }
        if (i2 == 1) {
            fBg -= i;
        } else {
            fIL -= i;
        }
        return new float[]{fIL, fBg};
    }

    public static float bg(android.content.Context context) {
        return com.bytedance.sdk.openadsdk.utils.ZQc.eqN(context, com.bytedance.sdk.openadsdk.utils.ZQc.WR(context));
    }

    public static float IL(android.content.Context context) {
        return com.bytedance.sdk.openadsdk.utils.ZQc.eqN(context, com.bytedance.sdk.openadsdk.utils.ZQc.eo(context));
    }
}

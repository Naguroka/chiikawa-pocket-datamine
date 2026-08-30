package com.bytedance.adsdk.IL.ldr;

/* JADX INFO: loaded from: classes3.dex */
public class IL {
    private static float bg(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((java.lang.Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    private static float IL(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) java.lang.Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static int bg(float f, int i, int i2) {
        if (i == i2) {
            return i;
        }
        float f2 = ((i >> 24) & 255) / 255.0f;
        float fIL = IL(((i >> 16) & 255) / 255.0f);
        float fIL2 = IL(((i >> 8) & 255) / 255.0f);
        float fIL3 = IL((i & 255) / 255.0f);
        float fIL4 = IL(((i2 >> 16) & 255) / 255.0f);
        float f3 = f2 + (((((i2 >> 24) & 255) / 255.0f) - f2) * f);
        float fIL5 = fIL2 + ((IL(((i2 >> 8) & 255) / 255.0f) - fIL2) * f);
        float fIL6 = fIL3 + (f * (IL((i2 & 255) / 255.0f) - fIL3));
        return (java.lang.Math.round(bg(fIL + ((fIL4 - fIL) * f)) * 255.0f) << 16) | (java.lang.Math.round(f3 * 255.0f) << 24) | (java.lang.Math.round(bg(fIL5) * 255.0f) << 8) | java.lang.Math.round(bg(fIL6) * 255.0f);
    }
}

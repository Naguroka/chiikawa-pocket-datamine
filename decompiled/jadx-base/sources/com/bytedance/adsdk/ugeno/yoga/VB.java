package com.bytedance.adsdk.ugeno.yoga;

/* JADX INFO: loaded from: classes3.dex */
public class VB {
    public static long bg(float f, float f2) {
        return ((long) java.lang.Float.floatToRawIntBits(f2)) | (((long) java.lang.Float.floatToRawIntBits(f)) << 32);
    }

    public static long bg(int i, int i2) {
        return bg(i, i2);
    }
}

package com.bytedance.adsdk.ugeno.iR;

/* JADX INFO: loaded from: classes3.dex */
public final class bX {
    public static float bg(java.lang.String str, float f) {
        try {
            return java.lang.Float.parseFloat(str);
        } catch (java.lang.NumberFormatException unused) {
            return f;
        }
    }

    public static int bg(java.lang.String str, int i) {
        try {
            return java.lang.Integer.parseInt(str);
        } catch (java.lang.NumberFormatException unused) {
            return i;
        }
    }

    public static long bg(java.lang.String str, long j) {
        try {
            return java.lang.Long.parseLong(str);
        } catch (java.lang.NumberFormatException unused) {
            return j;
        }
    }

    public static double bg(java.lang.String str, double d) {
        try {
            return java.lang.Double.parseDouble(str);
        } catch (java.lang.NumberFormatException unused) {
            return d;
        }
    }

    public static boolean bg(java.lang.String str, boolean z) {
        try {
            return java.lang.Boolean.parseBoolean(str);
        } catch (java.lang.NumberFormatException unused) {
            return z;
        }
    }
}

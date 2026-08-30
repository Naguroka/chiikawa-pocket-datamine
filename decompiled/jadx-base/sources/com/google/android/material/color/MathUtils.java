package com.google.android.material.color;

/* JADX INFO: loaded from: classes5.dex */
final class MathUtils {
    public static float lerp(float f, float f2, float f3) {
        return ((1.0f - f3) * f) + (f3 * f2);
    }

    public static float sanitizeDegrees(float f) {
        if (f < 0.0f) {
            return (f % 360.0f) + 360.0f;
        }
        return f >= 360.0f ? f % 360.0f : f;
    }

    static float toDegrees(float f) {
        return (f * 180.0f) / 3.1415927f;
    }

    static float toRadians(float f) {
        return (f / 180.0f) * 3.1415927f;
    }

    private MathUtils() {
    }

    static float clamp(float f, float f2, float f3) {
        return java.lang.Math.min(java.lang.Math.max(f3, f), f2);
    }

    public static float differenceDegrees(float f, float f2) {
        return 180.0f - java.lang.Math.abs(java.lang.Math.abs(f - f2) - 180.0f);
    }

    public static int sanitizeDegrees(int i) {
        if (i < 0) {
            return (i % 360) + 360;
        }
        return i >= 360 ? i % 360 : i;
    }
}

package com.google.android.material.animation;

/* JADX INFO: loaded from: classes5.dex */
public class AnimationUtils {
    public static final android.animation.TimeInterpolator LINEAR_INTERPOLATOR = new android.view.animation.LinearInterpolator();
    public static final android.animation.TimeInterpolator FAST_OUT_SLOW_IN_INTERPOLATOR = new androidx.interpolator.view.animation.FastOutSlowInInterpolator();
    public static final android.animation.TimeInterpolator FAST_OUT_LINEAR_IN_INTERPOLATOR = new androidx.interpolator.view.animation.FastOutLinearInInterpolator();
    public static final android.animation.TimeInterpolator LINEAR_OUT_SLOW_IN_INTERPOLATOR = new androidx.interpolator.view.animation.LinearOutSlowInInterpolator();
    public static final android.animation.TimeInterpolator DECELERATE_INTERPOLATOR = new android.view.animation.DecelerateInterpolator();

    public static float lerp(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    public static int lerp(int i, int i2, float f) {
        return i + java.lang.Math.round(f * (i2 - i));
    }

    public static float lerp(float f, float f2, float f3, float f4, float f5) {
        if (f5 < f3) {
            return f;
        }
        return f5 > f4 ? f2 : lerp(f, f2, (f5 - f3) / (f4 - f3));
    }
}

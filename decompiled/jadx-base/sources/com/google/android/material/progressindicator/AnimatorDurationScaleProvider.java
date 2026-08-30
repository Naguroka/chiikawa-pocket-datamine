package com.google.android.material.progressindicator;

/* JADX INFO: loaded from: classes5.dex */
public class AnimatorDurationScaleProvider {
    private static float defaultSystemAnimatorDurationScale = 1.0f;

    public float getSystemAnimatorDurationScale(android.content.ContentResolver contentResolver) {
        return android.provider.Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
    }

    public static void setDefaultSystemAnimatorDurationScale(float f) {
        defaultSystemAnimatorDurationScale = f;
    }
}

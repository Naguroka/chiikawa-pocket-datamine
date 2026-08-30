package com.google.android.gms.common.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class PlatformVersion {
    private PlatformVersion() {
    }

    @java.lang.Deprecated
    public static boolean isAtLeastHoneycomb() {
        return true;
    }

    public static boolean isAtLeastHoneycombMR1() {
        return true;
    }

    public static boolean isAtLeastIceCreamSandwich() {
        return true;
    }

    public static boolean isAtLeastIceCreamSandwichMR1() {
        return true;
    }

    public static boolean isAtLeastJellyBean() {
        return true;
    }

    public static boolean isAtLeastJellyBeanMR1() {
        return true;
    }

    public static boolean isAtLeastJellyBeanMR2() {
        return true;
    }

    public static boolean isAtLeastKitKat() {
        return true;
    }

    public static boolean isAtLeastKitKatWatch() {
        return true;
    }

    public static boolean isAtLeastLollipop() {
        return true;
    }

    public static boolean isAtLeastLollipopMR1() {
        return true;
    }

    public static boolean isAtLeastM() {
        return true;
    }

    public static boolean isAtLeastN() {
        return true;
    }

    public static boolean isAtLeastO() {
        return android.os.Build.VERSION.SDK_INT >= 26;
    }

    public static boolean isAtLeastP() {
        return android.os.Build.VERSION.SDK_INT >= 28;
    }

    public static boolean isAtLeastQ() {
        return android.os.Build.VERSION.SDK_INT >= 29;
    }

    public static boolean isAtLeastR() {
        return android.os.Build.VERSION.SDK_INT >= 30;
    }

    public static boolean isAtLeastS() {
        return android.os.Build.VERSION.SDK_INT >= 31;
    }

    public static boolean isAtLeastSv2() {
        return android.os.Build.VERSION.SDK_INT >= 32;
    }

    public static boolean isAtLeastT() {
        return android.os.Build.VERSION.SDK_INT >= 33;
    }

    public static boolean isAtLeastU() {
        return android.os.Build.VERSION.SDK_INT >= 34;
    }

    public static boolean isAtLeastV() {
        return androidx.core.os.BuildCompat.isAtLeastV();
    }
}

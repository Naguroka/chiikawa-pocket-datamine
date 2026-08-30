package com.google.android.material.internal;

/* JADX INFO: loaded from: classes5.dex */
public class EdgeToEdgeUtils {
    private static final int EDGE_TO_EDGE_BAR_ALPHA = 128;

    private EdgeToEdgeUtils() {
    }

    public static void applyEdgeToEdge(android.view.Window window, boolean z) {
        applyEdgeToEdge(window, z, null, null);
    }

    public static void applyEdgeToEdge(android.view.Window window, boolean z, java.lang.Integer num, java.lang.Integer num2) {
        boolean z2 = num == null || num.intValue() == 0;
        boolean z3 = num2 == null || num2.intValue() == 0;
        if (z2 || z3) {
            int color = com.google.android.material.color.MaterialColors.getColor(window.getContext(), android.R.attr.colorBackground, androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
            if (z2) {
                num = java.lang.Integer.valueOf(color);
            }
            if (z3) {
                num2 = java.lang.Integer.valueOf(color);
            }
        }
        androidx.core.view.WindowCompat.setDecorFitsSystemWindows(window, !z);
        int statusBarColor = getStatusBarColor(window.getContext(), z);
        int navigationBarColor = getNavigationBarColor(window.getContext(), z);
        window.setStatusBarColor(statusBarColor);
        window.setNavigationBarColor(navigationBarColor);
        setLightStatusBar(window, isUsingLightSystemBar(statusBarColor, com.google.android.material.color.MaterialColors.isColorLight(num.intValue())));
        setLightNavigationBar(window, isUsingLightSystemBar(navigationBarColor, com.google.android.material.color.MaterialColors.isColorLight(num2.intValue())));
    }

    public static void setLightStatusBar(android.view.Window window, boolean z) {
        androidx.core.view.WindowCompat.getInsetsController(window, window.getDecorView()).setAppearanceLightStatusBars(z);
    }

    public static void setLightNavigationBar(android.view.Window window, boolean z) {
        androidx.core.view.WindowCompat.getInsetsController(window, window.getDecorView()).setAppearanceLightNavigationBars(z);
    }

    private static int getStatusBarColor(android.content.Context context, boolean z) {
        if (z) {
            return 0;
        }
        return com.google.android.material.color.MaterialColors.getColor(context, android.R.attr.statusBarColor, androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
    }

    private static int getNavigationBarColor(android.content.Context context, boolean z) {
        if (z && android.os.Build.VERSION.SDK_INT < 27) {
            return androidx.core.graphics.ColorUtils.setAlphaComponent(com.google.android.material.color.MaterialColors.getColor(context, android.R.attr.navigationBarColor, androidx.core.view.ViewCompat.MEASURED_STATE_MASK), 128);
        }
        if (z) {
            return 0;
        }
        return com.google.android.material.color.MaterialColors.getColor(context, android.R.attr.navigationBarColor, androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
    }

    private static boolean isUsingLightSystemBar(int i, boolean z) {
        return com.google.android.material.color.MaterialColors.isColorLight(i) || (i == 0 && z);
    }
}

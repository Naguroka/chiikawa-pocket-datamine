package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
final class x {
    static final float a(android.content.Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    static float a(android.content.Context context, float f) {
        android.view.Display defaultDisplay = ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay();
        int iMin = java.lang.Math.min(defaultDisplay.getWidth(), defaultDisplay.getHeight());
        return java.lang.Math.min((int) (iMin / f), iMin) / 320.0f;
    }
}

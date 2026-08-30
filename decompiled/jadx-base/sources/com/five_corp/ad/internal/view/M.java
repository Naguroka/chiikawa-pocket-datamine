package com.five_corp.ad.internal.view;

/* JADX INFO: loaded from: classes4.dex */
public abstract class M {
    public static int a(java.lang.String str) {
        try {
            if (!str.startsWith("#")) {
                str = "#".concat(str);
            }
            return android.graphics.Color.parseColor(str);
        } catch (java.lang.Throwable unused) {
            return androidx.core.view.ViewCompat.MEASURED_STATE_MASK;
        }
    }

    public static void a(android.view.View view) {
        android.view.ViewParent parent;
        if (view == null || (parent = view.getParent()) == null || !(parent instanceof android.view.ViewGroup)) {
            return;
        }
        ((android.view.ViewGroup) parent).removeView(view);
    }

    public static void a(android.widget.TextView textView, android.graphics.drawable.GradientDrawable gradientDrawable) {
        textView.setBackground(gradientDrawable);
    }
}

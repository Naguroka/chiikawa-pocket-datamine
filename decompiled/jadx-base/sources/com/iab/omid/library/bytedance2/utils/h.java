package com.iab.omid.library.bytedance2.utils;

/* JADX INFO: loaded from: classes5.dex */
public final class h {
    public static java.lang.String a(android.view.View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        int visibility = view.getVisibility();
        if (visibility == 8) {
            return "viewGone";
        }
        if (visibility == 4) {
            return "viewInvisible";
        }
        if (visibility != 0) {
            return "viewNotVisible";
        }
        if (view.getAlpha() == 0.0f) {
            return "viewAlphaZero";
        }
        return null;
    }

    public static android.view.View b(android.view.View view) {
        java.lang.Object parent = view.getParent();
        if (parent instanceof android.view.View) {
            return (android.view.View) parent;
        }
        return null;
    }

    public static float c(android.view.View view) {
        return view.getZ();
    }

    public static boolean d(android.view.View view) {
        return a(view) == null;
    }

    public static boolean e(android.view.View view) {
        if (!view.isAttachedToWindow() || !view.isShown()) {
            return false;
        }
        while (view != null) {
            if (view.getAlpha() == 0.0f) {
                return false;
            }
            view = b(view);
        }
        return true;
    }
}

package com.unity3d.services.core.misc;

/* JADX INFO: loaded from: classes6.dex */
public class ViewUtilities {
    public static void removeViewFromParent(android.view.View view) {
        if (view == null || view.getParent() == null) {
            return;
        }
        try {
            ((android.view.ViewGroup) view.getParent()).removeView(view);
        } catch (java.lang.Exception e) {
            com.unity3d.services.core.log.DeviceLog.exception("Error while removing view from it's parent", e);
        }
    }

    public static void setBackground(android.view.View view, android.graphics.drawable.Drawable drawable) {
        try {
            android.view.View.class.getMethod("setBackground", android.graphics.drawable.Drawable.class).invoke(view, drawable);
        } catch (java.lang.Exception e) {
            com.unity3d.services.core.log.DeviceLog.exception("Couldn't run".concat("setBackground"), e);
        }
    }

    public static float dpFromPx(android.content.Context context, float f) {
        return f / context.getResources().getDisplayMetrics().density;
    }

    public static float pxFromDp(android.content.Context context, float f) {
        return f * context.getResources().getDisplayMetrics().density;
    }
}

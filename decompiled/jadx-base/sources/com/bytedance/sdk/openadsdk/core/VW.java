package com.bytedance.sdk.openadsdk.core;

/* JADX INFO: loaded from: classes4.dex */
public class VW {
    private static boolean bg(android.view.View view, int i) {
        float fBg = bg(view);
        return fBg > 0.0f && fBg >= ((float) i) / 100.0f;
    }

    public static float bg(android.view.View view) {
        if (view != null) {
            try {
                if (view.getVisibility() == 0 && view.getParent() != null) {
                    android.graphics.Rect rect = new android.graphics.Rect();
                    if (!view.getGlobalVisibleRect(rect)) {
                        return -1.0f;
                    }
                    long jHeight = ((long) rect.height()) * ((long) rect.width());
                    long height = ((long) view.getHeight()) * ((long) view.getWidth());
                    if (height <= 0) {
                        return -1.0f;
                    }
                    return jHeight / height;
                }
            } catch (java.lang.Throwable unused) {
            }
        }
        return -1.0f;
    }

    private static boolean IL(android.view.View view) {
        return view != null && view.isShown();
    }

    private static boolean IL(android.view.View view, int i) {
        return view.getWidth() >= bX(view, i) && view.getHeight() >= eqN(view, i);
    }

    private static int bX(android.view.View view, int i) {
        if (i == 3) {
            return (int) (((double) com.bytedance.sdk.openadsdk.utils.ZQc.bX(view.getContext().getApplicationContext())) * 0.7d);
        }
        return 20;
    }

    private static int eqN(android.view.View view, int i) {
        if (i == 3) {
            return com.bytedance.sdk.openadsdk.utils.ZQc.eqN(view.getContext().getApplicationContext()) / 2;
        }
        return 20;
    }

    private static int IL(android.view.View view, int i, int i2) throws java.lang.Throwable {
        if (view.getWindowVisibility() != 0) {
            return 4;
        }
        if (!IL(view)) {
            return 1;
        }
        if (IL(view, i2)) {
            return !bg(view, i) ? 3 : 0;
        }
        return 6;
    }

    public static boolean bg(android.view.View view, int i, int i2) {
        if (i2 == 1) {
            while (view != null) {
                try {
                    if (view.getVisibility() != 0) {
                        return false;
                    }
                    if ((view instanceof com.bytedance.sdk.openadsdk.core.Kg.Fy) || (view instanceof com.bytedance.sdk.openadsdk.core.bX.bX)) {
                        break;
                    }
                    view = (android.view.View) view.getParent();
                } catch (java.lang.Throwable unused) {
                }
            }
        }
        return IL(view, i, i2) == 0;
    }
}

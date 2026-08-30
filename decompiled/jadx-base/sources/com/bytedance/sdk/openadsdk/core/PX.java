package com.bytedance.sdk.openadsdk.core;

/* JADX INFO: loaded from: classes4.dex */
public class PX {
    private static java.lang.String IL;
    private static java.lang.String bX;
    private static java.lang.String bg;
    private static boolean eqN;

    private static android.content.Context eqN(android.content.Context context) {
        return context == null ? com.bytedance.sdk.openadsdk.core.VzQ.bg() : context;
    }

    public static java.lang.String bg(android.content.Context context) {
        if (!android.text.TextUtils.isEmpty(bg)) {
            return bg;
        }
        ldr(context);
        return bg;
    }

    public static java.lang.String IL(android.content.Context context) {
        if (IL == null && !eqN) {
            synchronized (com.bytedance.sdk.openadsdk.core.PX.class) {
                if (!eqN) {
                    zx(context);
                }
            }
        }
        return IL;
    }

    public static java.lang.String bX(android.content.Context context) {
        if (android.text.TextUtils.isEmpty(bX) && !eqN) {
            synchronized (com.bytedance.sdk.openadsdk.core.PX.class) {
                if (!eqN) {
                    zx(context);
                }
            }
        }
        return bX;
    }

    public static void bg(android.content.Context context, java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str) && !str.equals(bg)) {
            com.bytedance.sdk.openadsdk.core.bX.bg(context).bg("did", str);
            bg = str;
        }
        if (android.text.TextUtils.isEmpty(bg)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.WR.bX.IL(bg);
        com.bytedance.sdk.openadsdk.core.VB.bg(bg);
    }

    private static void zx(android.content.Context context) {
        android.content.Context contextEqN;
        if (eqN || (contextEqN = eqN(context)) == null) {
            return;
        }
        IL = java.lang.String.valueOf(android.os.Build.TIME);
        bX = com.bytedance.sdk.openadsdk.core.bX.bg(contextEqN).IL("uuid", (java.lang.String) null);
        eqN = true;
    }

    private static void ldr(android.content.Context context) {
        android.content.Context contextEqN = eqN(context);
        if (contextEqN == null) {
            return;
        }
        bg = com.bytedance.sdk.openadsdk.core.bX.bg(contextEqN).IL("did", (java.lang.String) null);
    }

    public static java.lang.String bg() {
        try {
            java.util.Locale locale = android.os.LocaleList.getDefault().get(0);
            java.lang.String language = locale != null ? locale.getLanguage() : "";
            if (locale == null || !"zh".equals(language)) {
                return language;
            }
            java.lang.String string = locale.toString();
            if (locale.toString().length() >= 5) {
                string = string.substring(0, 5);
            }
            return java.util.Locale.SIMPLIFIED_CHINESE.toString().equals(string) ? "zh" : "zh-Hant";
        } catch (java.lang.Throwable unused) {
            return "";
        }
    }
}

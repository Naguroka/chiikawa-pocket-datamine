package com.bytedance.sdk.openadsdk.common;

/* JADX INFO: loaded from: classes4.dex */
public class IL {
    private static java.lang.String bg;

    public static java.lang.String IL() {
        return "1371";
    }

    public static java.lang.String bX() {
        return com.bytedance.sdk.openadsdk.BuildConfig.VERSION_NAME;
    }

    public static java.lang.String bg() {
        return "open_news";
    }

    public static java.lang.String eqN() {
        return com.bytedance.sdk.openadsdk.utils.ayS.iR();
    }

    public static java.lang.String zx() {
        return com.bytedance.sdk.openadsdk.core.WR.IL().ldr();
    }

    public static java.lang.String ldr() {
        return com.bytedance.sdk.component.utils.Lq.iR(com.bytedance.sdk.openadsdk.core.VzQ.bg());
    }

    public static java.lang.String bg(android.content.Context context) {
        return com.bytedance.sdk.openadsdk.core.PX.bg(context);
    }

    public static java.lang.String iR() {
        try {
            if (!android.text.TextUtils.isEmpty(bg)) {
                return bg;
            }
            java.lang.String strBg = com.bytedance.sdk.openadsdk.core.WR.bg("sdk_app_sha1", 259200000L);
            bg = strBg;
            if (bg(strBg)) {
                return bg;
            }
            java.lang.String strBg2 = com.bytedance.sdk.component.utils.bX.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg());
            bg = strBg2;
            if (bg(strBg2)) {
                java.lang.String upperCase = bg.toUpperCase();
                bg = upperCase;
                com.bytedance.sdk.openadsdk.core.WR.bg("sdk_app_sha1", upperCase);
                return bg;
            }
            return "";
        } catch (java.lang.Exception unused) {
        }
    }

    private static boolean bg(java.lang.String str) {
        java.lang.String[] strArrSplit;
        if (android.text.TextUtils.isEmpty(str) || (strArrSplit = str.split(":")) == null || strArrSplit.length < 20) {
            return false;
        }
        for (java.lang.String str2 : strArrSplit) {
            if (!"00".equals(str2)) {
                return true;
            }
        }
        return false;
    }
}

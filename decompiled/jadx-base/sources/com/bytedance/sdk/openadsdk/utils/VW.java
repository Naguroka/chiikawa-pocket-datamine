package com.bytedance.sdk.openadsdk.utils;

/* JADX INFO: loaded from: classes4.dex */
public class VW {
    private static java.lang.String bg;

    public static boolean bX() {
        return false;
    }

    public static boolean bg() {
        return com.bytedance.sdk.component.utils.PX.eqN() && com.bytedance.sdk.openadsdk.core.WR.IL().xxp() && com.bytedance.sdk.openadsdk.core.WR.IL().VzQ();
    }

    public static java.lang.String bg(java.lang.String str) {
        try {
            if (!bg()) {
                return str;
            }
            java.lang.String strTuV = com.bytedance.sdk.openadsdk.core.WR.IL().tuV();
            if (android.text.TextUtils.isEmpty(strTuV)) {
                return str;
            }
            android.util.Log.d("TestHelperUtils", "AnyDoorId=".concat(java.lang.String.valueOf(strTuV)));
            return android.net.Uri.parse(str).buildUpon().appendQueryParameter(IL(), strTuV).appendQueryParameter(com.json.tk.SESSION_HISTORY_KEY_AD_ID, "5001121").toString();
        } catch (java.lang.Throwable unused) {
            return str;
        }
    }

    public static java.lang.String IL() {
        if (android.text.TextUtils.isEmpty(bg)) {
            bg = new java.lang.String(android.util.Base64.decode("ZGV2aWNlX2lk", 0));
        }
        return bg;
    }
}

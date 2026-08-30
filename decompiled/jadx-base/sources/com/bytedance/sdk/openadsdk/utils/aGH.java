package com.bytedance.sdk.openadsdk.utils;

/* JADX INFO: loaded from: classes4.dex */
public class aGH {
    private static final java.util.Map<java.lang.String, com.bytedance.sdk.openadsdk.utils.aGH> bg = new java.util.HashMap();
    private android.content.SharedPreferences IL;

    public static com.bytedance.sdk.openadsdk.utils.aGH bg(java.lang.String str, android.content.Context context) {
        if (android.text.TextUtils.isEmpty(str)) {
            str = "tt_ad_sdk_sp";
        }
        java.util.Map<java.lang.String, com.bytedance.sdk.openadsdk.utils.aGH> map = bg;
        com.bytedance.sdk.openadsdk.utils.aGH agh = map.get(str);
        if (agh != null) {
            return agh;
        }
        com.bytedance.sdk.openadsdk.utils.aGH agh2 = new com.bytedance.sdk.openadsdk.utils.aGH(str, context);
        map.put(str, agh2);
        return agh2;
    }

    private aGH(java.lang.String str, android.content.Context context) {
        if (context != null) {
            this.IL = context.getSharedPreferences(str, 0);
        }
    }

    public java.lang.String bg(java.lang.String str, java.lang.String str2) {
        try {
            return this.IL.getString(str, str2);
        } catch (java.lang.Throwable unused) {
            return str2;
        }
    }

    public void bg(java.lang.String str) {
        try {
            this.IL.edit().remove(str).apply();
        } catch (java.lang.Throwable unused) {
        }
    }
}

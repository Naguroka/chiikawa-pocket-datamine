package com.bytedance.sdk.openadsdk.utils;

/* JADX INFO: loaded from: classes4.dex */
public class WR {
    public static void bg(java.lang.String str) {
        bg("any_door_id", str);
    }

    public static java.lang.String bg() {
        return IL("any_door_id", null);
    }

    private static void bg(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg((java.lang.String) null, str, str2);
        } catch (java.lang.Throwable unused) {
        }
    }

    private static java.lang.String IL(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return com.bytedance.sdk.openadsdk.multipro.eqN.eqN.IL(null, str, str2);
        } catch (java.lang.Throwable unused) {
            return str2;
        }
    }
}

package com.bytedance.sdk.openadsdk.utils;

/* JADX INFO: loaded from: classes4.dex */
public class LZ {
    private static boolean bg = false;

    public static void bg() {
        bg = true;
    }

    public static void IL() {
        bg = false;
    }

    public static void bg(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        bg(bX(str, str2), objArr);
    }

    public static void bg(java.lang.String str, java.lang.String str2) {
        if (bg && str2 != null) {
            android.util.Log.d(bg(str), str2);
        }
    }

    public static void bg(java.lang.String str, java.lang.Object... objArr) {
        if (bg && objArr != null) {
            android.util.Log.d(bg(str), bg(objArr));
        }
    }

    public static void IL(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        IL(bX(str, str2), objArr);
    }

    public static void IL(java.lang.String str, java.lang.String str2) {
        if (bg && str2 != null) {
            android.util.Log.e(bg(str), str2);
        }
    }

    public static void IL(java.lang.String str, java.lang.Object... objArr) {
        if (bg && objArr != null) {
            android.util.Log.e(bg(str), bg(objArr));
        }
    }

    private static java.lang.String bg(java.lang.String str) {
        return android.text.TextUtils.isEmpty("PangleSDK-6406") ? str : bg("[PangleSDK-6406]-[" + str + com.ironsource.y8.i.e);
    }

    private static java.lang.String bX(java.lang.String str, java.lang.String str2) {
        return android.text.TextUtils.isEmpty("PangleSDK-6406") ? str : bg(str2 + "]-[" + str);
    }

    private static java.lang.String bg(java.lang.Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (java.lang.Object obj : objArr) {
            if (obj != null) {
                sb.append(obj.toString());
            } else {
                sb.append(" null ");
            }
            sb.append(" ");
        }
        return sb.toString();
    }
}

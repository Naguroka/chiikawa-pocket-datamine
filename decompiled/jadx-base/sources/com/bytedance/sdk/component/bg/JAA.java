package com.bytedance.sdk.component.bg;

/* JADX INFO: loaded from: classes3.dex */
class JAA {
    private static boolean bg;

    static java.lang.String bg() {
        return "";
    }

    static java.lang.String bg(java.lang.Throwable th) {
        return "{\"code\":" + (th instanceof com.bytedance.sdk.component.bg.tuV ? ((com.bytedance.sdk.component.bg.tuV) th).bg : 0) + "}";
    }

    static java.lang.String bg(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return "{\"code\":1}";
        }
        java.lang.String strSubstring = bg ? str.substring(1, str.length() - 1) : "";
        java.lang.String strConcat = "{\"code\":1,\"__data\":".concat(java.lang.String.valueOf(str));
        if (!strSubstring.isEmpty()) {
            return strConcat + "," + strSubstring + "}";
        }
        return strConcat + "}";
    }

    static void bg(boolean z) {
        bg = z;
    }
}

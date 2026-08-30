package com.bytedance.sdk.component.utils;

/* JADX INFO: loaded from: classes3.dex */
public class tC {
    private static volatile java.lang.String bg;

    public static java.lang.String bg() {
        if (!android.text.TextUtils.isEmpty(bg)) {
            return bg;
        }
        java.lang.String str = android.os.Build.MODEL;
        bg = str;
        return str;
    }
}

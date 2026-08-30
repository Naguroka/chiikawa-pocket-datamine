package com.bytedance.sdk.component.ldr.bg.bg.bg;

/* JADX INFO: loaded from: classes3.dex */
public class ldr {
    public static java.lang.String bg(java.lang.String str) {
        return android.text.TextUtils.isEmpty(str) ? "" : android.util.Base64.encodeToString(str.getBytes(), 10);
    }

    public static java.lang.String IL(java.lang.String str) {
        return android.text.TextUtils.isEmpty(str) ? "" : new java.lang.String(android.util.Base64.decode(str, 10));
    }
}

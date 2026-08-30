package com.bytedance.sdk.openadsdk.core;

/* JADX INFO: loaded from: classes4.dex */
public final class bg {
    private static final java.lang.String bg = bX();
    private static final java.lang.String IL = com.bytedance.sdk.openadsdk.core.VzQ.eqN().bX();

    public static java.lang.String bg() {
        return new java.lang.String(android.util.Base64.decode(bg, 0)).substring(2);
    }

    public static java.lang.String IL() {
        return new java.lang.String(android.util.Base64.decode(IL, 0)).substring(2);
    }

    private static java.lang.String bX() {
        char[] cArr = {203, kotlin.text.Typography.paragraph, 168, kotlin.text.Typography.degree, 207, 148, 149, 178, 205, kotlin.text.Typography.paragraph, 149, 166, 134, 178, 184, kotlin.text.Typography.degree, 206, kotlin.text.Typography.registered, 187, 178, 150, 185, kotlin.text.Typography.section, 166};
        char[] cArr2 = new char[24];
        for (int i = 23; i >= 0; i--) {
            cArr2[23 - i] = (char) (cArr[i] ^ 255);
        }
        return new java.lang.String(cArr2);
    }
}

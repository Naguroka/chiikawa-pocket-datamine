package com.bytedance.sdk.openadsdk.multipro;

/* JADX INFO: loaded from: classes4.dex */
public class eqN {
    public static java.lang.String bg = "com.bytedance.openadsdk";
    public static java.lang.String IL = "content://" + bg + ".TTMultiProvider";

    static {
        bg();
    }

    public static void bg() {
        if (com.bytedance.sdk.openadsdk.core.VzQ.bg() != null) {
            bg = com.bytedance.sdk.openadsdk.core.VzQ.bg().getPackageName();
            IL = "content://" + bg + ".TTMultiProvider";
        }
    }
}

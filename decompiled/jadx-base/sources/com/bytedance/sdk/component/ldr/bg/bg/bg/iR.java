package com.bytedance.sdk.component.ldr.bg.bg.bg;

/* JADX INFO: loaded from: classes3.dex */
public class iR {
    public static java.lang.String bg = "com.bytedance.openadsdk";
    public static java.lang.String IL = "content://" + bg + ".TTMultiProvider";

    static {
        bg();
    }

    public static void bg() {
        if (com.bytedance.sdk.component.ldr.bg.Kg.iR().ldr() != null) {
            bg = com.bytedance.sdk.component.ldr.bg.Kg.iR().ldr().getPackageName();
            IL = "content://" + bg + ".TTMultiProvider";
        }
    }
}

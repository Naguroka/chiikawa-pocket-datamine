package com.bytedance.sdk.openadsdk.multipro;

/* JADX INFO: loaded from: classes4.dex */
public class IL {
    public static java.lang.Boolean bg;

    public static void bg() {
        bg = java.lang.Boolean.TRUE;
        com.bytedance.sdk.openadsdk.multipro.eqN.bg.bg("sp_multi_info", "is_support_multi_process", java.lang.Boolean.TRUE);
    }

    public static void IL() {
        bg = java.lang.Boolean.FALSE;
        com.bytedance.sdk.openadsdk.multipro.aidl.BinderPoolService.bg = true;
    }

    public static boolean bX() {
        java.lang.Boolean bool = bg;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (!com.bytedance.sdk.openadsdk.core.yDt.zx()) {
            return false;
        }
        if (bg == null) {
            bg = java.lang.Boolean.valueOf(com.bytedance.sdk.openadsdk.multipro.eqN.bg.bg("sp_multi_info", "is_support_multi_process", false));
        }
        return bg.booleanValue();
    }
}

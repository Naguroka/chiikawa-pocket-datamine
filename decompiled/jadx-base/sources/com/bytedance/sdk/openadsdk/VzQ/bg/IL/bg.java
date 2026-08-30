package com.bytedance.sdk.openadsdk.VzQ.bg.IL;

/* JADX INFO: loaded from: classes4.dex */
public class bg {
    private static volatile com.bytedance.sdk.openadsdk.VzQ.bg.IL.bg IL;
    private java.lang.String bg = "";

    public static com.bytedance.sdk.openadsdk.VzQ.bg.IL.bg bg() {
        if (IL == null) {
            synchronized (com.bytedance.sdk.openadsdk.VzQ.bg.IL.bg.class) {
                if (IL == null) {
                    IL = new com.bytedance.sdk.openadsdk.VzQ.bg.IL.bg();
                }
            }
        }
        return IL;
    }

    private bg() {
    }

    public java.lang.String IL() {
        if (!com.bytedance.sdk.openadsdk.core.VzQ.eqN().DDQ(com.json.ce.K0)) {
            return "";
        }
        if (!android.text.TextUtils.isEmpty(this.bg)) {
            return this.bg;
        }
        java.lang.String strIL = com.bytedance.sdk.openadsdk.core.bX.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg()).IL(com.json.ce.K0, "");
        this.bg = strIL;
        return strIL;
    }

    public static void bg(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.bX.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg()).bg(com.json.ce.K0, str);
    }

    public void IL(java.lang.String str) {
        this.bg = str;
    }
}

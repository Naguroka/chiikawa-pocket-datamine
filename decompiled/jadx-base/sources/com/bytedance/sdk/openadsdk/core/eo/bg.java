package com.bytedance.sdk.openadsdk.core.eo;

/* JADX INFO: loaded from: classes4.dex */
public class bg {
    private static final int IL = java.lang.Integer.parseInt("1371");
    private static long bX = java.lang.System.currentTimeMillis();
    public static boolean bg = false;

    public static void bg() {
        android.content.Context contextBg;
        if (!com.bytedance.sdk.openadsdk.core.VzQ.eqN().WR() || bg || (contextBg = com.bytedance.sdk.openadsdk.core.VzQ.bg()) == null) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.xxp.bX.bg().IL().bg(contextBg, true, new com.bytedance.sdk.openadsdk.xxp.IL(contextBg));
            com.bytedance.sdk.openadsdk.xxp.bX.bg().IL().bg(contextBg, com.bytedance.sdk.openadsdk.multipro.IL.bX());
            bX = java.lang.System.currentTimeMillis();
            bg = true;
        } catch (java.lang.Exception e) {
            com.bytedance.sdk.component.utils.PX.bg("TncHelper", "initTTAdNet: ", e.getMessage());
        }
    }

    public static void IL() {
        if (bg) {
            com.bytedance.sdk.openadsdk.core.settings.ldr ldrVarEqN = com.bytedance.sdk.openadsdk.core.VzQ.eqN();
            if (ldrVarEqN.WR()) {
                long jEDa = ldrVarEqN.eDa();
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - bX >= jEDa) {
                    bX = jCurrentTimeMillis;
                    android.content.Context contextBg = com.bytedance.sdk.openadsdk.core.VzQ.bg();
                    if (contextBg == null) {
                        return;
                    }
                    com.bytedance.sdk.component.iR.bX.Kg.bg().bg(IL, contextBg).bX();
                }
            }
        }
    }
}

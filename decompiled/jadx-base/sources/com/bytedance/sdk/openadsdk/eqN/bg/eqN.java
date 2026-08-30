package com.bytedance.sdk.openadsdk.eqN.bg;

/* JADX INFO: loaded from: classes4.dex */
public class eqN {
    public static java.util.concurrent.atomic.AtomicInteger bg = new java.util.concurrent.atomic.AtomicInteger(0);
    public static final java.util.concurrent.atomic.AtomicBoolean IL = new java.util.concurrent.atomic.AtomicBoolean(false);

    public static void bg(android.content.Context context, boolean z) {
        if (IL.compareAndSet(false, true)) {
            com.bytedance.sdk.component.ldr.bg.IL.bg(new com.bytedance.sdk.component.ldr.bg.bg.C0114bg().bg(new com.bytedance.sdk.openadsdk.eqN.bg.eo()).IL(com.bytedance.sdk.component.ldr.bg.eqN.IL.bg.bX()).bX(com.bytedance.sdk.component.ldr.bg.eqN.IL.bg.zx()).bg(com.bytedance.sdk.component.ldr.bg.eqN.IL.bg.eqN()).bg(z).bg(new com.bytedance.sdk.openadsdk.eqN.bg.VB()).bg(com.bytedance.sdk.openadsdk.eqN.bg.Kg.bg).IL(com.bytedance.sdk.openadsdk.core.VzQ.eqN().yDt()).bg(com.bytedance.sdk.openadsdk.core.VzQ.eqN().Lq()).bg(com.bytedance.sdk.openadsdk.core.VzQ.eqN().bOf()).bg(), context);
            IL();
        }
    }

    public static void bg(com.bytedance.sdk.openadsdk.eqN.bg bgVar) {
        com.bytedance.sdk.component.ldr.bg.eqN.bg.bg bgVar2 = new com.bytedance.sdk.component.ldr.bg.eqN.bg.bg(bgVar.eqN(), bgVar);
        bgVar2.IL(bgVar.zx() ? (byte) 1 : (byte) 2);
        bgVar2.bg((byte) 0);
        if (com.bytedance.sdk.component.ldr.bg.IL.IL()) {
            bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(), com.bytedance.sdk.openadsdk.multipro.IL.bX());
        }
        com.bytedance.sdk.component.ldr.bg.IL.bg(bgVar2);
    }

    public static com.bytedance.sdk.openadsdk.yDt.bX.IL bg() {
        return com.bytedance.sdk.openadsdk.eqN.bg.PX.bg;
    }

    public static void bg(final java.util.List<java.lang.String> list, final int i, final java.lang.String str) {
        if (list == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.eqN.bX.bg(new com.bytedance.sdk.component.Kg.Kg("track") { // from class: com.bytedance.sdk.openadsdk.eqN.bg.eqN.1
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.component.ldr.bg.IL.IL()) {
                    com.bytedance.sdk.openadsdk.eqN.bg.eqN.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(), com.bytedance.sdk.openadsdk.multipro.IL.bX());
                }
                com.bytedance.sdk.component.ldr.bg.IL.bg(com.bytedance.sdk.openadsdk.core.PX.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg()), list, true, i, str);
            }
        });
    }

    public static void bg(java.lang.String str) {
        bg(str, false);
    }

    public static void bg(java.lang.String str, boolean z) {
        if (com.bytedance.sdk.component.ldr.bg.IL.IL()) {
            bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(), com.bytedance.sdk.openadsdk.multipro.IL.bX());
        }
        com.bytedance.sdk.component.ldr.bg.IL.bg(str, z);
    }

    public static void IL() {
        com.bytedance.sdk.component.ldr.bg.IL.bX();
    }

    public static void bX() {
        try {
            com.bytedance.sdk.component.ldr.bg.IL.eqN();
            com.bytedance.sdk.component.ldr.bg.IL.zx();
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("AdLogSwitchUtils", th.getMessage());
        }
    }
}

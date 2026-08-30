package com.bytedance.sdk.openadsdk.eqN.bg;

/* JADX INFO: loaded from: classes4.dex */
class PX implements com.bytedance.sdk.openadsdk.yDt.bX.IL {
    public static final com.bytedance.sdk.openadsdk.eqN.bg.PX bg = new com.bytedance.sdk.openadsdk.eqN.bg.PX();

    private PX() {
    }

    @Override // com.bytedance.sdk.openadsdk.yDt.bX.IL
    public void bg(com.bytedance.sdk.openadsdk.yDt.IL il) {
        bg(il, false);
    }

    @Override // com.bytedance.sdk.openadsdk.yDt.bX.IL
    public void bg(final com.bytedance.sdk.openadsdk.yDt.IL il, final boolean z) {
        bg(new com.bytedance.sdk.component.Kg.Kg("uploadLogEvent") { // from class: com.bytedance.sdk.openadsdk.eqN.bg.PX.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.bytedance.sdk.openadsdk.yDt.bg.bX logStats = il.getLogStats();
                    if (logStats == null) {
                        return;
                    }
                    com.bytedance.sdk.component.ldr.bg.eqN.bg.bg bgVar = new com.bytedance.sdk.component.ldr.bg.eqN.bg.bg(com.bytedance.sdk.openadsdk.utils.rri.bg(), logStats.bg());
                    bgVar.bX((byte) 0);
                    bgVar.IL(z ? (byte) 2 : (byte) 3);
                    bgVar.bg((byte) 1);
                    if (com.bytedance.sdk.component.ldr.bg.IL.IL()) {
                        com.bytedance.sdk.openadsdk.eqN.bg.eqN.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(), com.bytedance.sdk.openadsdk.multipro.IL.bX());
                    }
                    com.bytedance.sdk.component.ldr.bg.IL.bg(bgVar);
                } catch (java.lang.Throwable unused) {
                }
            }
        });
    }

    private void bg(com.bytedance.sdk.component.Kg.Kg kg) {
        if (kg == null) {
            return;
        }
        if (!com.bytedance.sdk.openadsdk.utils.VJ.ldr()) {
            com.bytedance.sdk.openadsdk.utils.VJ.IL(kg, 5);
        } else {
            kg.run();
        }
    }
}

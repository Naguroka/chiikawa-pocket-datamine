package com.bytedance.sdk.openadsdk.core.Kg;

/* JADX INFO: loaded from: classes4.dex */
public class ldr extends com.bytedance.sdk.component.adexpress.dynamic.bg.bg {
    private com.bytedance.sdk.component.adexpress.IL.iR IL;
    private final com.bytedance.sdk.component.Kg.Kg bX;
    private final com.bytedance.sdk.component.adexpress.IL.Ta bg;
    private final java.lang.Runnable eqN;

    public ldr(android.content.Context context, com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z, com.bytedance.sdk.component.adexpress.dynamic.zx.Kg kg, com.bytedance.sdk.component.adexpress.IL.Ta ta, com.bytedance.sdk.component.adexpress.dynamic.ldr.bg bgVar) {
        super(context, themeStatusBroadcastReceiver, z, kg, ta, bgVar);
        this.bX = new com.bytedance.sdk.component.Kg.Kg("dynamic_render_template") { // from class: com.bytedance.sdk.openadsdk.core.Kg.ldr.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.core.Kg.ldr.this.bg.bX();
                com.bytedance.sdk.openadsdk.core.yDt.bX().post(com.bytedance.sdk.openadsdk.core.Kg.ldr.this.eqN);
            }
        };
        this.eqN = new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.Kg.ldr.2
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.openadsdk.core.Kg.ldr.this.IL != null) {
                    com.bytedance.sdk.openadsdk.core.Kg.ldr ldrVar = com.bytedance.sdk.openadsdk.core.Kg.ldr.this;
                    com.bytedance.sdk.openadsdk.core.Kg.ldr.super.bg(ldrVar.IL);
                }
            }
        };
        this.bg = ta;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.bg.bg, com.bytedance.sdk.component.adexpress.IL.eqN
    public void bg(com.bytedance.sdk.component.adexpress.IL.iR iRVar) {
        this.IL = iRVar;
        com.bytedance.sdk.openadsdk.utils.VJ.IL(this.bX);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.bg.bg
    public void IL() {
        super.IL();
        com.bytedance.sdk.openadsdk.core.yDt.bX().removeCallbacks(this.eqN);
    }
}

package com.bytedance.sdk.openadsdk.core.Kg;

/* JADX INFO: loaded from: classes4.dex */
public class LZ extends com.bytedance.sdk.component.adexpress.IL.bg<com.bytedance.sdk.openadsdk.core.Kg.bg> {
    private com.bytedance.sdk.openadsdk.core.Kg.bg IL;
    private final android.view.View bX;
    java.util.concurrent.atomic.AtomicBoolean bg = new java.util.concurrent.atomic.AtomicBoolean(false);
    private com.bytedance.sdk.component.adexpress.IL.bX eqN;
    private final com.bytedance.sdk.component.adexpress.IL.Ta ldr;
    private com.bytedance.sdk.component.adexpress.IL.iR zx;

    public LZ(android.view.View view, com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, com.bytedance.sdk.component.adexpress.IL.Ta ta) {
        this.bX = view;
        this.ldr = ta;
    }

    @Override // com.bytedance.sdk.component.adexpress.IL.eqN
    public void bg(com.bytedance.sdk.component.adexpress.IL.iR iRVar) {
        this.zx = iRVar;
        com.bytedance.sdk.openadsdk.utils.VJ.bg(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.Kg.LZ.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.core.Kg.LZ.this.IL();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IL() {
        if (this.bg.get()) {
            return;
        }
        com.bytedance.sdk.component.adexpress.IL.bX bXVar = this.eqN;
        boolean z = false;
        if (bXVar != null && bXVar.bg((com.bytedance.sdk.openadsdk.core.Kg.Fy) this.bX, 0)) {
            z = true;
        }
        if (!z) {
            this.zx.bg(107, "backup false");
            return;
        }
        this.ldr.zx().iR();
        com.bytedance.sdk.openadsdk.core.Kg.bg bgVar = (com.bytedance.sdk.openadsdk.core.Kg.bg) this.bX.findViewWithTag("tt_express_backup_fl_tag_26");
        this.IL = bgVar;
        if (bgVar != null) {
            com.bytedance.sdk.component.adexpress.IL.yDt ydt = new com.bytedance.sdk.component.adexpress.IL.yDt();
            com.bytedance.sdk.openadsdk.core.Kg.bg bgVar2 = this.IL;
            float realWidth = bgVar2 == null ? 0.0f : bgVar2.getRealWidth();
            com.bytedance.sdk.openadsdk.core.Kg.bg bgVar3 = this.IL;
            float realHeight = bgVar3 != null ? bgVar3.getRealHeight() : 0.0f;
            ydt.bg(true);
            ydt.bg(realWidth);
            ydt.IL(realHeight);
            this.zx.bg(this.IL, ydt);
            return;
        }
        this.zx.bg(107, "backupview is null");
    }

    @Override // com.bytedance.sdk.component.adexpress.IL.eqN
    /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.openadsdk.core.Kg.bg zx() {
        return this.IL;
    }

    @Override // com.bytedance.sdk.component.adexpress.IL.bg
    public void bg(com.bytedance.sdk.component.adexpress.IL.bX bXVar) {
        this.eqN = bXVar;
    }
}

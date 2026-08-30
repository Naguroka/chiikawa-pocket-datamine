package com.bytedance.sdk.component.adexpress.IL;

/* JADX INFO: loaded from: classes3.dex */
public class IL implements com.bytedance.sdk.component.adexpress.IL.eo {
    private com.bytedance.sdk.component.adexpress.dynamic.bg.bg IL;
    private com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver bX;
    private android.content.Context bg;
    private com.bytedance.sdk.component.adexpress.IL.Kg eqN;
    private int ldr;
    private com.bytedance.sdk.component.adexpress.IL.Ta zx;

    public IL(android.content.Context context, com.bytedance.sdk.component.adexpress.IL.Ta ta, com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z, com.bytedance.sdk.component.adexpress.dynamic.zx.Kg kg, com.bytedance.sdk.component.adexpress.IL.Kg kg2, com.bytedance.sdk.component.adexpress.dynamic.ldr.bg bgVar, com.bytedance.sdk.component.adexpress.dynamic.bg.bg bgVar2) {
        this.bg = context;
        this.zx = ta;
        this.bX = themeStatusBroadcastReceiver;
        this.eqN = kg2;
        if (bgVar2 != null) {
            this.IL = bgVar2;
        } else {
            this.IL = new com.bytedance.sdk.component.adexpress.dynamic.bg.bg(this.bg, this.bX, z, kg, this.zx, bgVar);
        }
        this.IL.bg(this.eqN);
        if (kg instanceof com.bytedance.sdk.component.adexpress.dynamic.zx.iR) {
            this.ldr = 3;
        } else {
            this.ldr = 2;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.IL.eo
    public boolean bg(final com.bytedance.sdk.component.adexpress.IL.eo.bg bgVar) {
        this.zx.zx().bg(this.ldr);
        this.IL.bg(new com.bytedance.sdk.component.adexpress.IL.iR() { // from class: com.bytedance.sdk.component.adexpress.IL.IL.1
            @Override // com.bytedance.sdk.component.adexpress.IL.iR
            public void bg(android.view.View view, com.bytedance.sdk.component.adexpress.IL.yDt ydt) {
                if (bgVar.bX()) {
                    return;
                }
                com.bytedance.sdk.component.adexpress.IL.IL.this.zx.zx().zx(com.bytedance.sdk.component.adexpress.IL.IL.this.ldr);
                com.bytedance.sdk.component.adexpress.IL.IL.this.zx.zx().ldr(com.bytedance.sdk.component.adexpress.IL.IL.this.ldr);
                com.bytedance.sdk.component.adexpress.IL.IL.this.zx.zx().eo();
                com.bytedance.sdk.component.adexpress.IL.Lq lqIL = bgVar.IL();
                if (lqIL == null) {
                    return;
                }
                lqIL.bg(com.bytedance.sdk.component.adexpress.IL.IL.this.IL, ydt);
                bgVar.bg(true);
            }

            @Override // com.bytedance.sdk.component.adexpress.IL.iR
            public void bg(int i, java.lang.String str) {
                com.bytedance.sdk.component.adexpress.IL.IL.this.zx.zx().bg(com.bytedance.sdk.component.adexpress.IL.IL.this.ldr, i, str, bgVar.IL(com.bytedance.sdk.component.adexpress.IL.IL.this));
                if (bgVar.IL(com.bytedance.sdk.component.adexpress.IL.IL.this)) {
                    bgVar.bg(com.bytedance.sdk.component.adexpress.IL.IL.this);
                    return;
                }
                com.bytedance.sdk.component.adexpress.IL.Lq lqIL = bgVar.IL();
                if (lqIL == null) {
                    return;
                }
                lqIL.a_(i);
            }
        });
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.IL.eo
    public void bg() {
        com.bytedance.sdk.component.adexpress.dynamic.bg.bg bgVar = this.IL;
        if (bgVar != null) {
            bgVar.IL();
        }
    }

    public com.bytedance.sdk.component.adexpress.dynamic.eqN IL() {
        com.bytedance.sdk.component.adexpress.dynamic.bg.bg bgVar = this.IL;
        if (bgVar != null) {
            return bgVar.eqN();
        }
        return null;
    }
}

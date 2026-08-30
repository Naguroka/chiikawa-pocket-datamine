package com.bytedance.sdk.component.adexpress.IL;

/* JADX INFO: loaded from: classes3.dex */
public class ldr implements com.bytedance.sdk.component.adexpress.IL.eo {
    private com.bytedance.sdk.component.adexpress.IL.bg IL;
    private com.bytedance.sdk.component.adexpress.IL.Ta bX;
    private android.content.Context bg;

    @Override // com.bytedance.sdk.component.adexpress.IL.eo
    public void bg() {
    }

    public ldr(android.content.Context context, com.bytedance.sdk.component.adexpress.IL.Ta ta, com.bytedance.sdk.component.adexpress.IL.bg bgVar) {
        this.bg = context;
        this.IL = bgVar;
        this.bX = ta;
    }

    @Override // com.bytedance.sdk.component.adexpress.IL.eo
    public boolean bg(final com.bytedance.sdk.component.adexpress.IL.eo.bg bgVar) {
        this.bX.zx().ldr();
        this.IL.bg(new com.bytedance.sdk.component.adexpress.IL.iR() { // from class: com.bytedance.sdk.component.adexpress.IL.ldr.1
            @Override // com.bytedance.sdk.component.adexpress.IL.iR
            public void bg(android.view.View view, com.bytedance.sdk.component.adexpress.IL.yDt ydt) {
                if (bgVar.bX()) {
                    return;
                }
                com.bytedance.sdk.component.adexpress.IL.Lq lqIL = bgVar.IL();
                if (lqIL != null) {
                    lqIL.bg(com.bytedance.sdk.component.adexpress.IL.ldr.this.IL, ydt);
                }
                bgVar.bg(true);
            }

            @Override // com.bytedance.sdk.component.adexpress.IL.iR
            public void bg(int i, java.lang.String str) {
                com.bytedance.sdk.component.adexpress.IL.Lq lqIL = bgVar.IL();
                if (lqIL != null) {
                    lqIL.a_(i);
                }
            }
        });
        return true;
    }

    public void bg(com.bytedance.sdk.component.adexpress.IL.bX bXVar) {
        this.IL.bg(bXVar);
    }
}

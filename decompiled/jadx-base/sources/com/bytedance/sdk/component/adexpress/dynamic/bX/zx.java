package com.bytedance.sdk.component.adexpress.dynamic.bX;

/* JADX INFO: loaded from: classes3.dex */
public class zx extends com.bytedance.sdk.component.adexpress.dynamic.bX.VzQ<com.bytedance.sdk.component.adexpress.ldr.iR> {
    @Override // com.bytedance.sdk.component.adexpress.dynamic.bX.VzQ
    protected void eqN() {
    }

    public zx(android.content.Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx zxVar, com.bytedance.sdk.component.adexpress.dynamic.eqN.iR iRVar) {
        super(context, zxVar, iRVar);
        bg(iRVar);
    }

    private void bg(com.bytedance.sdk.component.adexpress.dynamic.eqN.iR iRVar) {
        this.bg = new com.bytedance.sdk.component.adexpress.ldr.Kg(this.IL);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 81;
        this.bg.setLayoutParams(layoutParams);
        if (this.bg instanceof com.bytedance.sdk.component.adexpress.ldr.Kg) {
            ((com.bytedance.sdk.component.adexpress.ldr.Kg) this.bg).setButtonText(this.eqN.GvG());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.bX.VzQ, com.bytedance.sdk.component.adexpress.dynamic.bX.iR
    public void bg() {
        this.bg.bg();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.bX.VzQ, com.bytedance.sdk.component.adexpress.dynamic.bX.iR
    public void IL() {
        this.bg.IL();
    }
}

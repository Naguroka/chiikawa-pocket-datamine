package com.bytedance.sdk.component.adexpress.dynamic.bX;

/* JADX INFO: loaded from: classes3.dex */
public class eqN extends com.bytedance.sdk.component.adexpress.dynamic.bX.VzQ<com.bytedance.sdk.component.adexpress.ldr.iR> {
    @Override // com.bytedance.sdk.component.adexpress.dynamic.bX.VzQ
    protected void eqN() {
    }

    public eqN(android.content.Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx zxVar, com.bytedance.sdk.component.adexpress.dynamic.eqN.iR iRVar) {
        super(context, zxVar, iRVar);
        bg(iRVar);
    }

    private void bg(com.bytedance.sdk.component.adexpress.dynamic.eqN.iR iRVar) {
        this.bg = new com.bytedance.sdk.component.adexpress.ldr.iR(this.IL);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(this.IL, iRVar.RJ());
        this.bg.setLayoutParams(layoutParams);
        this.bg.setSlideText(this.eqN.GvG());
        if (this.bg instanceof com.bytedance.sdk.component.adexpress.ldr.iR) {
            ((com.bytedance.sdk.component.adexpress.ldr.iR) this.bg).setButtonText(this.eqN.eo());
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

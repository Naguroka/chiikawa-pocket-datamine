package com.bytedance.sdk.component.adexpress.dynamic.bX;

/* JADX INFO: loaded from: classes3.dex */
public class tuV implements com.bytedance.sdk.component.adexpress.dynamic.bX.iR<com.bytedance.sdk.component.adexpress.ldr.VB> {
    private final com.bytedance.sdk.component.adexpress.ldr.VB bg;

    public tuV(android.content.Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx zxVar, com.bytedance.sdk.component.adexpress.dynamic.eqN.iR iRVar) {
        int iRJ;
        com.bytedance.sdk.component.adexpress.ldr.VB vb = new com.bytedance.sdk.component.adexpress.ldr.VB(context);
        this.bg = vb;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        if (iRVar.RJ() > 0) {
            iRJ = iRVar.RJ();
        } else {
            iRJ = com.bytedance.sdk.component.adexpress.eqN.IL() ? 0 : 120;
        }
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(context, iRJ);
        vb.setLayoutParams(layoutParams);
        vb.setClipChildren(false);
        vb.setText(iRVar.GvG());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.bX.iR
    public void bg() {
        com.bytedance.sdk.component.adexpress.ldr.VB vb = this.bg;
        if (vb != null) {
            vb.bg();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.bX.iR
    public void IL() {
        com.bytedance.sdk.component.adexpress.ldr.VB vb = this.bg;
        if (vb != null) {
            vb.IL();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.bX.iR
    /* JADX INFO: renamed from: eqN, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.adexpress.ldr.VB bX() {
        return this.bg;
    }
}

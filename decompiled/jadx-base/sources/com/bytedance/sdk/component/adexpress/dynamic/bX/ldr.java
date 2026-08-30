package com.bytedance.sdk.component.adexpress.dynamic.bX;

/* JADX INFO: loaded from: classes3.dex */
public class ldr extends com.bytedance.sdk.component.adexpress.dynamic.bX.VzQ<com.bytedance.sdk.component.adexpress.ldr.ldr> {
    @Override // com.bytedance.sdk.component.adexpress.dynamic.bX.VzQ
    protected void eqN() {
    }

    public ldr(android.content.Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx zxVar, com.bytedance.sdk.component.adexpress.dynamic.eqN.iR iRVar, int i, int i2, int i3, org.json.JSONObject jSONObject) {
        super(context, zxVar, iRVar);
        this.IL = context;
        this.eqN = iRVar;
        this.bX = zxVar;
        bg(i, i2, i3, jSONObject, iRVar);
    }

    private void bg(int i, int i2, int i3, org.json.JSONObject jSONObject, com.bytedance.sdk.component.adexpress.dynamic.eqN.iR iRVar) {
        int iRJ;
        this.bg = new com.bytedance.sdk.component.adexpress.ldr.ldr(this.IL, i, i2, i3, jSONObject);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(this.IL, 300.0f));
        layoutParams.gravity = 81;
        android.content.Context context = this.IL;
        if (iRVar.RJ() > 0) {
            iRJ = iRVar.RJ();
        } else {
            iRJ = com.bytedance.sdk.component.adexpress.eqN.IL() ? 0 : 120;
        }
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(context, iRJ);
        this.bg.setLayoutParams(layoutParams);
        this.bg.setClipChildren(false);
        this.bg.setSlideText(this.eqN.GvG());
        if (this.bg instanceof com.bytedance.sdk.component.adexpress.ldr.ldr) {
            ((com.bytedance.sdk.component.adexpress.ldr.ldr) this.bg).setShakeText(this.eqN.gXn());
            final com.bytedance.sdk.component.adexpress.ldr.LZ shakeView = ((com.bytedance.sdk.component.adexpress.ldr.ldr) this.bg).getShakeView();
            if (shakeView != null) {
                shakeView.setOnShakeViewListener(new com.bytedance.sdk.component.adexpress.ldr.Fy.bg() { // from class: com.bytedance.sdk.component.adexpress.dynamic.bX.ldr.1
                });
                shakeView.setOnClickListener((android.view.View.OnClickListener) this.bX.getDynamicClickListener());
            }
        }
    }
}

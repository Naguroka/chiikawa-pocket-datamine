package com.bytedance.sdk.component.adexpress.dynamic.bX;

/* JADX INFO: loaded from: classes3.dex */
public class bg implements com.bytedance.sdk.component.adexpress.dynamic.bX.iR {
    private com.bytedance.sdk.component.adexpress.ldr.IL bg;

    public bg(android.content.Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx zxVar, com.bytedance.sdk.component.adexpress.dynamic.eqN.iR iRVar) {
        double dZCS = iRVar.zCS();
        dZCS = dZCS == 0.0d ? 1.0d : dZCS;
        double dYs = iRVar.Ys();
        double d = dYs != 0.0d ? dYs : 1.0d;
        int dynamicWidth = (int) (((double) zxVar.getDynamicWidth()) * 0.32d * dZCS);
        int dynamicWidth2 = (int) (((double) zxVar.getDynamicWidth()) * 0.32d * d);
        this.bg = new com.bytedance.sdk.component.adexpress.ldr.IL(context, dynamicWidth, dynamicWidth2);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(dynamicWidth, dynamicWidth2);
        layoutParams.gravity = 17;
        layoutParams.topMargin = (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(context, iRVar.wS() - 7);
        layoutParams.leftMargin = (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(context, iRVar.cZH() - 3);
        this.bg.setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.bX.iR
    public void bg() {
        this.bg.bg();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.bX.iR
    public void IL() {
        this.bg.IL();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.bX.iR
    public android.view.ViewGroup bX() {
        return this.bg;
    }
}

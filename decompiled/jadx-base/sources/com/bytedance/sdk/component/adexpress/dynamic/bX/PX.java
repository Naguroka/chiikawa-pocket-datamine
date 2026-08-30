package com.bytedance.sdk.component.adexpress.dynamic.bX;

/* JADX INFO: loaded from: classes3.dex */
public class PX implements com.bytedance.sdk.component.adexpress.dynamic.bX.iR {
    private com.bytedance.sdk.component.adexpress.ldr.yDt bg;

    public PX(android.content.Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx zxVar, com.bytedance.sdk.component.adexpress.dynamic.eqN.iR iRVar) {
        this.bg = new com.bytedance.sdk.component.adexpress.ldr.yDt(context);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(context, 180.0f), (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(context, 180.0f));
        layoutParams.gravity = 17;
        this.bg.setLayoutParams(layoutParams);
        this.bg.setGuideText(iRVar.GvG());
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

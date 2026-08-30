package com.bytedance.sdk.component.adexpress.dynamic.bX;

/* JADX INFO: loaded from: classes3.dex */
public class yDt implements com.bytedance.sdk.component.adexpress.dynamic.bX.iR<com.bytedance.sdk.component.adexpress.ldr.xxp> {
    private com.bytedance.sdk.component.adexpress.ldr.xxp bg;

    public yDt(android.content.Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx zxVar, com.bytedance.sdk.component.adexpress.dynamic.eqN.iR iRVar) {
        this.bg = new com.bytedance.sdk.component.adexpress.ldr.xxp(context);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(context, 180.0f), (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(context, 180.0f));
        layoutParams.gravity = 17;
        layoutParams.leftMargin = (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(context, 20.0f);
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
    /* JADX INFO: renamed from: eqN, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.adexpress.ldr.xxp bX() {
        return this.bg;
    }
}

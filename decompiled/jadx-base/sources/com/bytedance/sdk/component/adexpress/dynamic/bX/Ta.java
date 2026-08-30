package com.bytedance.sdk.component.adexpress.dynamic.bX;

/* JADX INFO: loaded from: classes3.dex */
public class Ta implements com.bytedance.sdk.component.adexpress.dynamic.bX.iR {
    private com.bytedance.sdk.component.adexpress.ldr.Lq bg;

    public Ta(android.content.Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx zxVar, com.bytedance.sdk.component.adexpress.dynamic.eqN.iR iRVar) {
        this.bg = new com.bytedance.sdk.component.adexpress.ldr.Lq(context);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(zxVar.getDynamicHeight(), zxVar.getDynamicHeight());
        layoutParams.gravity = 8388629;
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
    /* JADX INFO: renamed from: eqN, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.adexpress.ldr.Lq bX() {
        return this.bg;
    }
}

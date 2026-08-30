package com.bytedance.sdk.component.adexpress.dynamic.bX;

/* JADX INFO: loaded from: classes3.dex */
public class VzQ<E extends com.bytedance.sdk.component.adexpress.ldr.rri> implements com.bytedance.sdk.component.adexpress.dynamic.bX.iR<E> {
    protected android.content.Context IL;
    protected com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx bX;
    protected com.bytedance.sdk.component.adexpress.ldr.rri bg;
    protected com.bytedance.sdk.component.adexpress.dynamic.eqN.iR eqN;
    protected int zx;

    public VzQ(android.content.Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx zxVar, com.bytedance.sdk.component.adexpress.dynamic.eqN.iR iRVar, int i) {
        this.zx = i;
        this.IL = context;
        this.bX = zxVar;
        this.eqN = iRVar;
        eqN();
    }

    public VzQ(android.content.Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx zxVar, com.bytedance.sdk.component.adexpress.dynamic.eqN.iR iRVar) {
        this(context, zxVar, iRVar, 0);
    }

    protected void eqN() {
        this.bg = new com.bytedance.sdk.component.adexpress.ldr.rri(this.IL, this.eqN.Dxa());
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(this.IL, 200.0f));
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(this.IL, 100 - this.zx);
        this.bg.setLayoutParams(layoutParams);
        try {
            this.bg.setGuideText(this.eqN.GvG());
        } catch (java.lang.Throwable unused) {
        }
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
    /* JADX INFO: renamed from: zx, reason: merged with bridge method [inline-methods] */
    public E bX() {
        return (E) this.bg;
    }
}

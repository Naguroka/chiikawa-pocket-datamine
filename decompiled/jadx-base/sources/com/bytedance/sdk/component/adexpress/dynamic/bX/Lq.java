package com.bytedance.sdk.component.adexpress.dynamic.bX;

/* JADX INFO: loaded from: classes3.dex */
public class Lq implements com.bytedance.sdk.component.adexpress.dynamic.bX.iR<com.bytedance.sdk.component.adexpress.ldr.Fy> {
    private android.content.Context IL;
    private int Kg;
    private org.json.JSONObject WR;
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx bX;
    private com.bytedance.sdk.component.adexpress.ldr.Fy bg;
    private com.bytedance.sdk.component.adexpress.dynamic.eqN.iR eqN;
    private int iR;
    private int ldr;
    private java.lang.String zx;

    public Lq(android.content.Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx zxVar, com.bytedance.sdk.component.adexpress.dynamic.eqN.iR iRVar, java.lang.String str, int i, int i2, int i3, org.json.JSONObject jSONObject) {
        this.IL = context;
        this.bX = zxVar;
        this.eqN = iRVar;
        this.zx = str;
        this.ldr = i;
        this.iR = i2;
        this.Kg = i3;
        this.WR = jSONObject;
        zx();
    }

    private void zx() {
        final com.bytedance.sdk.component.adexpress.dynamic.ldr.bg dynamicClickListener = this.bX.getDynamicClickListener();
        try {
            new org.json.JSONObject().put("convertActionType", 1);
        } catch (java.lang.Throwable unused) {
        }
        if ("16".equals(this.zx)) {
            android.content.Context context = this.IL;
            com.bytedance.sdk.component.adexpress.ldr.Fy fy = new com.bytedance.sdk.component.adexpress.ldr.Fy(context, com.bytedance.sdk.component.adexpress.bX.bg.Kg(context), this.ldr, this.iR, this.Kg, this.WR);
            this.bg = fy;
            if (fy.getShakeLayout() != null) {
                this.bg.getShakeLayout().setOnClickListener((android.view.View.OnClickListener) dynamicClickListener);
            }
        } else {
            android.content.Context context2 = this.IL;
            this.bg = new com.bytedance.sdk.component.adexpress.ldr.Fy(context2, com.bytedance.sdk.component.adexpress.bX.bg.iR(context2), this.ldr, this.iR, this.Kg, this.WR);
        }
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        this.bg.setGravity(17);
        layoutParams.gravity = 17;
        this.bg.setLayoutParams(layoutParams);
        this.bg.setTranslationY(com.bytedance.sdk.component.adexpress.eqN.Kg.bg(this.IL, this.eqN.dS()));
        this.bg.setShakeText(this.eqN.GvG());
        this.bg.setClipChildren(false);
        this.bg.setOnShakeViewListener(new com.bytedance.sdk.component.adexpress.ldr.Fy.bg() { // from class: com.bytedance.sdk.component.adexpress.dynamic.bX.Lq.1
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.bX.iR
    public void bg() {
        this.bg.bg();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.bX.iR
    public void IL() {
        this.bg.clearAnimation();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.bX.iR
    /* JADX INFO: renamed from: eqN, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.adexpress.ldr.Fy bX() {
        return this.bg;
    }
}

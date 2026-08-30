package com.bytedance.sdk.component.adexpress.dynamic.bX;

/* JADX INFO: loaded from: classes3.dex */
public class Fy implements com.bytedance.sdk.component.adexpress.dynamic.bX.iR<com.bytedance.sdk.component.adexpress.ldr.Uw> {
    private android.content.Context IL;
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx bX;
    private com.bytedance.sdk.component.adexpress.ldr.Uw bg;
    private com.bytedance.sdk.component.adexpress.dynamic.eqN.iR eqN;
    private com.bytedance.sdk.component.adexpress.dynamic.eqN.eo ldr;
    private java.lang.String zx;

    public Fy(android.content.Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx zxVar, com.bytedance.sdk.component.adexpress.dynamic.eqN.iR iRVar, java.lang.String str, com.bytedance.sdk.component.adexpress.dynamic.eqN.eo eoVar) {
        this.IL = context;
        this.bX = zxVar;
        this.eqN = iRVar;
        this.zx = str;
        this.ldr = eoVar;
        zx();
    }

    private void zx() {
        int iRJ = this.eqN.RJ();
        final com.bytedance.sdk.component.adexpress.dynamic.ldr.bg dynamicClickListener = this.bX.getDynamicClickListener();
        try {
            new org.json.JSONObject().put("convertActionType", 2);
        } catch (java.lang.Throwable unused) {
        }
        if ("18".equals(this.zx)) {
            android.content.Context context = this.IL;
            com.bytedance.sdk.component.adexpress.ldr.Uw uw = new com.bytedance.sdk.component.adexpress.ldr.Uw(context, com.bytedance.sdk.component.adexpress.bX.bg.WR(context), this.ldr);
            this.bg = uw;
            if (uw.getWriggleLayout() != null) {
                this.bg.getWriggleLayout().setOnClickListener((android.view.View.OnClickListener) dynamicClickListener);
            }
            if (this.bg.getTopTextView() != null) {
                if (android.text.TextUtils.isEmpty(this.eqN.RiO())) {
                    this.bg.getTopTextView().setText(com.bytedance.sdk.component.utils.Fy.IL(this.IL, "tt_splash_wriggle_top_text_style_17"));
                } else {
                    this.bg.getTopTextView().setText(this.eqN.RiO());
                }
            }
        } else {
            android.content.Context context2 = this.IL;
            this.bg = new com.bytedance.sdk.component.adexpress.ldr.Uw(context2, com.bytedance.sdk.component.adexpress.bX.bg.WR(context2), this.ldr);
        }
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        this.bg.setTranslationY(-((int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(this.IL, iRJ)));
        this.bg.setLayoutParams(layoutParams);
        this.bg.setShakeText(this.eqN.GvG());
        this.bg.setClipChildren(false);
        final android.view.View wriggleProgressIv = this.bg.getWriggleProgressIv();
        this.bg.setOnShakeViewListener(new com.bytedance.sdk.component.adexpress.ldr.Uw.bg() { // from class: com.bytedance.sdk.component.adexpress.dynamic.bX.Fy.1
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
    public com.bytedance.sdk.component.adexpress.ldr.Uw bX() {
        return this.bg;
    }
}

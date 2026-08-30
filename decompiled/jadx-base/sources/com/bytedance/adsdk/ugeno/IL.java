package com.bytedance.adsdk.ugeno;

/* JADX INFO: loaded from: classes3.dex */
public class IL extends com.bytedance.adsdk.ugeno.IL.bg<com.bytedance.adsdk.ugeno.ldr.IL> {
    private float FFy;
    private int HXG;
    private boolean IEI;
    private java.lang.String IL;
    private boolean ZTq;
    private int bu;
    private org.json.JSONArray eK;
    private float ews;
    private boolean gCm;
    private java.lang.String gtr;
    private float hi;
    private float ovC;
    private com.bytedance.adsdk.ugeno.IL.bX rgo;
    private float rr;
    private float zU;

    @Override // com.bytedance.adsdk.ugeno.IL.bX
    public void bg(org.json.JSONObject jSONObject) {
    }

    public IL(android.content.Context context) {
        super(context);
        this.ZTq = true;
        this.gCm = true;
        this.FFy = 0.0f;
        this.rr = 2000.0f;
        this.gtr = com.adjust.sdk.Constants.NORMAL;
        this.IEI = true;
        this.bu = android.graphics.Color.parseColor("#666666");
        this.HXG = android.graphics.Color.parseColor("#ffffff");
    }

    @Override // com.bytedance.adsdk.ugeno.IL.bX
    public android.view.View eqN() {
        this.ldr = new com.bytedance.adsdk.ugeno.ldr.IL(this.bX);
        ((com.bytedance.adsdk.ugeno.ldr.IL) this.ldr).bg((com.bytedance.adsdk.ugeno.bX) this);
        return this.ldr;
    }

    public void bg(com.bytedance.adsdk.ugeno.ldr.bX bXVar) {
        if (this.ldr != 0) {
            ((com.bytedance.adsdk.ugeno.ldr.IL) this.ldr).setOnPageChangeListener(bXVar);
        }
    }

    public void bg(int i) {
        if (this.ldr != 0) {
            ((com.bytedance.adsdk.ugeno.ldr.IL) this.ldr).WR(i);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.IL.bg, com.bytedance.adsdk.ugeno.IL.bX
    public void IL() {
        super.IL();
        org.json.JSONArray jSONArray = this.eK;
        if (jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.ldr.IL) this.ldr).eqN((int) this.ovC).zx((int) this.ews).ldr((int) this.zU).IL(this.IEI).IL(this.HXG).bX(this.bu).bg(this.gtr).bX(this.ZTq).bg(this.hi).bg(this.gCm).bg((int) this.rr).IL(this.IEI);
        for (int i = 0; i < this.eK.length(); i++) {
            com.bytedance.adsdk.ugeno.core.WR wr = new com.bytedance.adsdk.ugeno.core.WR(this.bX);
            wr.bg(this.hff);
            com.bytedance.adsdk.ugeno.IL.bX<android.view.View> bXVarIL = wr.IL(this.rgo.Uw(), null);
            wr.IL(this.eK.optJSONObject(i));
            ((com.bytedance.adsdk.ugeno.ldr.IL) this.ldr).bg(bXVarIL);
        }
        if (this.gCm) {
            ((com.bytedance.adsdk.ugeno.ldr.IL) this.ldr).bg();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.IL.bg
    public void bg(com.bytedance.adsdk.ugeno.IL.bX bXVar) {
        this.rgo = bXVar;
    }

    @Override // com.bytedance.adsdk.ugeno.IL.bX
    public void bg(java.lang.String str, java.lang.String str2) {
        super.bg(str, str2);
        if (android.text.TextUtils.isEmpty(str)) {
        }
        str.hashCode();
        switch (str) {
            case "delayStart":
                this.FFy = com.bytedance.adsdk.ugeno.iR.bX.bg(str2, 0.0f);
                break;
            case "indicatorColor":
                this.bu = com.bytedance.adsdk.ugeno.iR.bg.bg(str2);
                break;
            case "nextMargin":
                this.zU = com.bytedance.adsdk.ugeno.iR.Kg.bg(this.bX, com.bytedance.adsdk.ugeno.iR.bX.bg(str2, 0.0f));
                break;
            case "effect":
                this.gtr = str2;
                break;
            case "direction":
                this.IL = str2;
                break;
            case "indicator":
                this.IEI = com.bytedance.adsdk.ugeno.iR.bX.bg(str2, true);
                break;
            case "previousMargin":
                this.ews = com.bytedance.adsdk.ugeno.iR.Kg.bg(this.bX, com.bytedance.adsdk.ugeno.iR.bX.bg(str2, 0.0f));
                break;
            case "loop":
                this.ZTq = com.bytedance.adsdk.ugeno.iR.bX.bg(str2, true);
                break;
            case "speed":
                this.rr = com.bytedance.adsdk.ugeno.iR.bX.bg(str2, 500.0f);
                break;
            case "pageCount":
                this.hi = com.bytedance.adsdk.ugeno.iR.bX.bg(str2, 1.0f);
                break;
            case "pageMargin":
                this.ovC = com.bytedance.adsdk.ugeno.iR.Kg.bg(this.bX, com.bytedance.adsdk.ugeno.iR.bX.bg(str2, 0.0f));
                break;
            case "indicatorSelectedColor":
                this.HXG = com.bytedance.adsdk.ugeno.iR.bg.bg(str2);
                break;
            case "autoplay":
                this.gCm = com.bytedance.adsdk.ugeno.iR.bX.bg(str2, true);
                break;
            case "dataList":
                this.eK = com.bytedance.adsdk.ugeno.iR.IL.bg(str2, (org.json.JSONArray) null);
                break;
        }
    }
}

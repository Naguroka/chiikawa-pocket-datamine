package com.bytedance.adsdk.IL.bX.IL;

/* JADX INFO: loaded from: classes3.dex */
public class Ta implements com.bytedance.adsdk.IL.bX.IL.bX {
    private final com.bytedance.adsdk.IL.bX.bg.Ta<java.lang.Float, java.lang.Float> IL;
    private final java.lang.String bg;

    public Ta(java.lang.String str, com.bytedance.adsdk.IL.bX.bg.Ta<java.lang.Float, java.lang.Float> ta) {
        this.bg = str;
        this.IL = ta;
    }

    public java.lang.String bg() {
        return this.bg;
    }

    public com.bytedance.adsdk.IL.bX.bg.Ta<java.lang.Float, java.lang.Float> IL() {
        return this.IL;
    }

    @Override // com.bytedance.adsdk.IL.bX.IL.bX
    public com.bytedance.adsdk.IL.bg.bg.bX bg(com.bytedance.adsdk.IL.WR wr, com.bytedance.adsdk.IL.iR iRVar, com.bytedance.adsdk.IL.bX.bX.bg bgVar) {
        return new com.bytedance.adsdk.IL.bg.bg.VzQ(wr, bgVar, this);
    }
}

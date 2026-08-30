package com.bytedance.adsdk.IL.bg.IL;

/* JADX INFO: loaded from: classes3.dex */
public class bX implements com.bytedance.adsdk.IL.bg.IL.bg.InterfaceC0076bg {
    private final com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Integer, java.lang.Integer> IL;
    private final com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Float, java.lang.Float> bX;
    private final com.bytedance.adsdk.IL.bg.IL.bg.InterfaceC0076bg bg;
    private final com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Float, java.lang.Float> eqN;
    private boolean iR = true;
    private final com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Float, java.lang.Float> ldr;
    private final com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Float, java.lang.Float> zx;

    public bX(com.bytedance.adsdk.IL.bg.IL.bg.InterfaceC0076bg interfaceC0076bg, com.bytedance.adsdk.IL.bX.bX.bg bgVar, com.bytedance.adsdk.IL.zx.eo eoVar) {
        this.bg = interfaceC0076bg;
        com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Integer, java.lang.Integer> bgVarBg = eoVar.bg().bg();
        this.IL = bgVarBg;
        bgVarBg.bg(this);
        bgVar.bg(bgVarBg);
        com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Float, java.lang.Float> bgVarBg2 = eoVar.IL().bg();
        this.bX = bgVarBg2;
        bgVarBg2.bg(this);
        bgVar.bg(bgVarBg2);
        com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Float, java.lang.Float> bgVarBg3 = eoVar.bX().bg();
        this.eqN = bgVarBg3;
        bgVarBg3.bg(this);
        bgVar.bg(bgVarBg3);
        com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Float, java.lang.Float> bgVarBg4 = eoVar.eqN().bg();
        this.zx = bgVarBg4;
        bgVarBg4.bg(this);
        bgVar.bg(bgVarBg4);
        com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Float, java.lang.Float> bgVarBg5 = eoVar.zx().bg();
        this.ldr = bgVarBg5;
        bgVarBg5.bg(this);
        bgVar.bg(bgVarBg5);
    }

    @Override // com.bytedance.adsdk.IL.bg.IL.bg.InterfaceC0076bg
    public void bg() {
        this.iR = true;
        this.bg.bg();
    }

    public void bg(android.graphics.Paint paint) {
        if (this.iR) {
            this.iR = false;
            double dFloatValue = ((double) this.eqN.iR().floatValue()) * 0.017453292519943295d;
            float fFloatValue = this.zx.iR().floatValue();
            float fSin = ((float) java.lang.Math.sin(dFloatValue)) * fFloatValue;
            float fCos = ((float) java.lang.Math.cos(dFloatValue + 3.141592653589793d)) * fFloatValue;
            int iIntValue = this.IL.iR().intValue();
            paint.setShadowLayer(this.ldr.iR().floatValue(), fSin, fCos, android.graphics.Color.argb(java.lang.Math.round(this.bX.iR().floatValue()), android.graphics.Color.red(iIntValue), android.graphics.Color.green(iIntValue), android.graphics.Color.blue(iIntValue)));
        }
    }
}

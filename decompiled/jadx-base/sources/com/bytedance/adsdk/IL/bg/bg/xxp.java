package com.bytedance.adsdk.IL.bg.bg;

/* JADX INFO: loaded from: classes3.dex */
public class xxp implements com.bytedance.adsdk.IL.bg.IL.bg.InterfaceC0076bg, com.bytedance.adsdk.IL.bg.bg.Ta, com.bytedance.adsdk.IL.bg.bg.VB, com.bytedance.adsdk.IL.bg.bg.eo, com.bytedance.adsdk.IL.bg.bg.zx {
    private final com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Float, java.lang.Float> Kg;
    private final com.bytedance.adsdk.IL.bg.IL.xxp WR;
    private final com.bytedance.adsdk.IL.WR bX;
    private com.bytedance.adsdk.IL.bg.bg.eqN eo;
    private final com.bytedance.adsdk.IL.bX.bX.bg eqN;
    private final com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Float, java.lang.Float> iR;
    private final boolean ldr;
    private final java.lang.String zx;
    private final android.graphics.Matrix bg = new android.graphics.Matrix();
    private final android.graphics.Path IL = new android.graphics.Path();

    public xxp(com.bytedance.adsdk.IL.WR wr, com.bytedance.adsdk.IL.bX.bX.bg bgVar, com.bytedance.adsdk.IL.bX.IL.PX px) {
        this.bX = wr;
        this.eqN = bgVar;
        this.zx = px.bg();
        this.ldr = px.zx();
        com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Float, java.lang.Float> bgVarBg = px.IL().bg();
        this.iR = bgVarBg;
        bgVar.bg(bgVarBg);
        bgVarBg.bg(this);
        com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Float, java.lang.Float> bgVarBg2 = px.bX().bg();
        this.Kg = bgVarBg2;
        bgVar.bg(bgVarBg2);
        bgVarBg2.bg(this);
        com.bytedance.adsdk.IL.bg.IL.xxp xxpVarEo = px.eqN().eo();
        this.WR = xxpVarEo;
        xxpVarEo.bg(bgVar);
        xxpVarEo.bg(this);
    }

    @Override // com.bytedance.adsdk.IL.bg.bg.eo
    public void bg(java.util.ListIterator<com.bytedance.adsdk.IL.bg.bg.bX> listIterator) {
        if (this.eo != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        java.util.Collections.reverse(arrayList);
        this.eo = new com.bytedance.adsdk.IL.bg.bg.eqN(this.bX, this.eqN, "Repeater", this.ldr, arrayList, null);
    }

    @Override // com.bytedance.adsdk.IL.bg.bg.bX
    public void bg(java.util.List<com.bytedance.adsdk.IL.bg.bg.bX> list, java.util.List<com.bytedance.adsdk.IL.bg.bg.bX> list2) {
        this.eo.bg(list, list2);
    }

    @Override // com.bytedance.adsdk.IL.bg.bg.Ta
    public android.graphics.Path eqN() {
        android.graphics.Path pathEqN = this.eo.eqN();
        this.IL.reset();
        float fFloatValue = this.iR.iR().floatValue();
        float fFloatValue2 = this.Kg.iR().floatValue();
        for (int i = ((int) fFloatValue) - 1; i >= 0; i--) {
            this.bg.set(this.WR.IL(i + fFloatValue2));
            this.IL.addPath(pathEqN, this.bg);
        }
        return this.IL;
    }

    @Override // com.bytedance.adsdk.IL.bg.bg.zx
    public void bg(android.graphics.Canvas canvas, android.graphics.Matrix matrix, int i) {
        float fFloatValue = this.iR.iR().floatValue();
        float fFloatValue2 = this.Kg.iR().floatValue();
        float fFloatValue3 = this.WR.IL().iR().floatValue() / 100.0f;
        float fFloatValue4 = this.WR.bX().iR().floatValue() / 100.0f;
        for (int i2 = ((int) fFloatValue) - 1; i2 >= 0; i2--) {
            this.bg.set(matrix);
            float f = i2;
            this.bg.preConcat(this.WR.IL(f + fFloatValue2));
            this.eo.bg(canvas, this.bg, (int) (i * com.bytedance.adsdk.IL.ldr.zx.bg(fFloatValue3, fFloatValue4, f / fFloatValue)));
        }
    }

    @Override // com.bytedance.adsdk.IL.bg.bg.zx
    public void bg(android.graphics.RectF rectF, android.graphics.Matrix matrix, boolean z) {
        this.eo.bg(rectF, matrix, z);
    }

    @Override // com.bytedance.adsdk.IL.bg.IL.bg.InterfaceC0076bg
    public void bg() {
        this.bX.invalidateSelf();
    }
}

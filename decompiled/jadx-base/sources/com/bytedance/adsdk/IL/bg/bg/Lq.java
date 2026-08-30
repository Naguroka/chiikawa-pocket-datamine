package com.bytedance.adsdk.IL.bg.bg;

/* JADX INFO: loaded from: classes3.dex */
public class Lq implements com.bytedance.adsdk.IL.bg.IL.bg.InterfaceC0076bg, com.bytedance.adsdk.IL.bg.bg.Ta, com.bytedance.adsdk.IL.bg.bg.VB {
    private final com.bytedance.adsdk.IL.bg.IL.bg<?, java.lang.Float> Kg;
    private boolean VB;
    private final java.lang.String bX;
    private final boolean eqN;
    private final com.bytedance.adsdk.IL.bg.IL.bg<?, android.graphics.PointF> iR;
    private final com.bytedance.adsdk.IL.bg.IL.bg<?, android.graphics.PointF> ldr;
    private final com.bytedance.adsdk.IL.WR zx;
    private final android.graphics.Path bg = new android.graphics.Path();
    private final android.graphics.RectF IL = new android.graphics.RectF();
    private final com.bytedance.adsdk.IL.bg.bg.IL WR = new com.bytedance.adsdk.IL.bg.bg.IL();
    private com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Float, java.lang.Float> eo = null;

    public Lq(com.bytedance.adsdk.IL.WR wr, com.bytedance.adsdk.IL.bX.bX.bg bgVar, com.bytedance.adsdk.IL.bX.IL.VB vb) {
        this.bX = vb.bg();
        this.eqN = vb.zx();
        this.zx = wr;
        com.bytedance.adsdk.IL.bg.IL.bg<android.graphics.PointF, android.graphics.PointF> bgVarBg = vb.eqN().bg();
        this.ldr = bgVarBg;
        com.bytedance.adsdk.IL.bg.IL.bg<android.graphics.PointF, android.graphics.PointF> bgVarBg2 = vb.bX().bg();
        this.iR = bgVarBg2;
        com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Float, java.lang.Float> bgVarBg3 = vb.IL().bg();
        this.Kg = bgVarBg3;
        bgVar.bg(bgVarBg);
        bgVar.bg(bgVarBg2);
        bgVar.bg(bgVarBg3);
        bgVarBg.bg(this);
        bgVarBg2.bg(this);
        bgVarBg3.bg(this);
    }

    @Override // com.bytedance.adsdk.IL.bg.IL.bg.InterfaceC0076bg
    public void bg() {
        IL();
    }

    private void IL() {
        this.VB = false;
        this.zx.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:12:0x0029  */
    /* JADX WARN: Code duplicated, block: B:18:0x0031 A[SYNTHETIC] */
    @Override // com.bytedance.adsdk.IL.bg.bg.bX
    public void bg(java.util.List<com.bytedance.adsdk.IL.bg.bg.bX> list, java.util.List<com.bytedance.adsdk.IL.bg.bg.bX> list2) {
        for (int i = 0; i < list.size(); i++) {
            com.bytedance.adsdk.IL.bg.bg.bX bXVar = list.get(i);
            if (bXVar instanceof com.bytedance.adsdk.IL.bg.bg.tC) {
                com.bytedance.adsdk.IL.bg.bg.tC tCVar = (com.bytedance.adsdk.IL.bg.bg.tC) bXVar;
                if (tCVar.IL() == com.bytedance.adsdk.IL.bX.IL.Fy.bg.SIMULTANEOUSLY) {
                    this.WR.bg(tCVar);
                    tCVar.bg(this);
                } else if (bXVar instanceof com.bytedance.adsdk.IL.bg.bg.VzQ) {
                    this.eo = ((com.bytedance.adsdk.IL.bg.bg.VzQ) bXVar).IL();
                }
            } else if (bXVar instanceof com.bytedance.adsdk.IL.bg.bg.VzQ) {
                this.eo = ((com.bytedance.adsdk.IL.bg.bg.VzQ) bXVar).IL();
            }
        }
    }

    @Override // com.bytedance.adsdk.IL.bg.bg.Ta
    public android.graphics.Path eqN() {
        com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Float, java.lang.Float> bgVar;
        if (this.VB) {
            return this.bg;
        }
        this.bg.reset();
        if (this.eqN) {
            this.VB = true;
            return this.bg;
        }
        android.graphics.PointF pointFIR = this.iR.iR();
        float f = pointFIR.x / 2.0f;
        float f2 = pointFIR.y / 2.0f;
        com.bytedance.adsdk.IL.bg.IL.bg<?, java.lang.Float> bgVar2 = this.Kg;
        float fWR = bgVar2 == null ? 0.0f : ((com.bytedance.adsdk.IL.bg.IL.eqN) bgVar2).WR();
        if (fWR == 0.0f && (bgVar = this.eo) != null) {
            fWR = java.lang.Math.min(bgVar.iR().floatValue(), java.lang.Math.min(f, f2));
        }
        float fMin = java.lang.Math.min(f, f2);
        if (fWR > fMin) {
            fWR = fMin;
        }
        android.graphics.PointF pointFIR2 = this.ldr.iR();
        this.bg.moveTo(pointFIR2.x + f, (pointFIR2.y - f2) + fWR);
        this.bg.lineTo(pointFIR2.x + f, (pointFIR2.y + f2) - fWR);
        if (fWR > 0.0f) {
            float f3 = fWR * 2.0f;
            this.IL.set((pointFIR2.x + f) - f3, (pointFIR2.y + f2) - f3, pointFIR2.x + f, pointFIR2.y + f2);
            this.bg.arcTo(this.IL, 0.0f, 90.0f, false);
        }
        this.bg.lineTo((pointFIR2.x - f) + fWR, pointFIR2.y + f2);
        if (fWR > 0.0f) {
            float f4 = fWR * 2.0f;
            this.IL.set(pointFIR2.x - f, (pointFIR2.y + f2) - f4, (pointFIR2.x - f) + f4, pointFIR2.y + f2);
            this.bg.arcTo(this.IL, 90.0f, 90.0f, false);
        }
        this.bg.lineTo(pointFIR2.x - f, (pointFIR2.y - f2) + fWR);
        if (fWR > 0.0f) {
            float f5 = fWR * 2.0f;
            this.IL.set(pointFIR2.x - f, pointFIR2.y - f2, (pointFIR2.x - f) + f5, (pointFIR2.y - f2) + f5);
            this.bg.arcTo(this.IL, 180.0f, 90.0f, false);
        }
        this.bg.lineTo((pointFIR2.x + f) - fWR, pointFIR2.y - f2);
        if (fWR > 0.0f) {
            float f6 = fWR * 2.0f;
            this.IL.set((pointFIR2.x + f) - f6, pointFIR2.y - f2, pointFIR2.x + f, (pointFIR2.y - f2) + f6);
            this.bg.arcTo(this.IL, 270.0f, 90.0f, false);
        }
        this.bg.close();
        this.WR.bg(this.bg);
        this.VB = true;
        return this.bg;
    }
}

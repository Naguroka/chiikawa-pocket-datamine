package com.bytedance.adsdk.IL.bg.bg;

/* JADX INFO: loaded from: classes3.dex */
public class ldr implements com.bytedance.adsdk.IL.bg.IL.bg.InterfaceC0076bg, com.bytedance.adsdk.IL.bg.bg.Ta, com.bytedance.adsdk.IL.bg.bg.VB {
    private final java.lang.String IL;
    private boolean Kg;
    private final com.bytedance.adsdk.IL.WR bX;
    private final com.bytedance.adsdk.IL.bg.IL.bg<?, android.graphics.PointF> eqN;
    private final com.bytedance.adsdk.IL.bX.IL.IL ldr;
    private final com.bytedance.adsdk.IL.bg.IL.bg<?, android.graphics.PointF> zx;
    private final android.graphics.Path bg = new android.graphics.Path();
    private final com.bytedance.adsdk.IL.bg.bg.IL iR = new com.bytedance.adsdk.IL.bg.bg.IL();

    public ldr(com.bytedance.adsdk.IL.WR wr, com.bytedance.adsdk.IL.bX.bX.bg bgVar, com.bytedance.adsdk.IL.bX.IL.IL il) {
        this.IL = il.bg();
        this.bX = wr;
        com.bytedance.adsdk.IL.bg.IL.bg<android.graphics.PointF, android.graphics.PointF> bgVarBg = il.bX().bg();
        this.eqN = bgVarBg;
        com.bytedance.adsdk.IL.bg.IL.bg<android.graphics.PointF, android.graphics.PointF> bgVarBg2 = il.IL().bg();
        this.zx = bgVarBg2;
        this.ldr = il;
        bgVar.bg(bgVarBg);
        bgVar.bg(bgVarBg2);
        bgVarBg.bg(this);
        bgVarBg2.bg(this);
    }

    @Override // com.bytedance.adsdk.IL.bg.IL.bg.InterfaceC0076bg
    public void bg() {
        IL();
    }

    private void IL() {
        this.Kg = false;
        this.bX.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.IL.bg.bg.bX
    public void bg(java.util.List<com.bytedance.adsdk.IL.bg.bg.bX> list, java.util.List<com.bytedance.adsdk.IL.bg.bg.bX> list2) {
        for (int i = 0; i < list.size(); i++) {
            com.bytedance.adsdk.IL.bg.bg.bX bXVar = list.get(i);
            if (bXVar instanceof com.bytedance.adsdk.IL.bg.bg.tC) {
                com.bytedance.adsdk.IL.bg.bg.tC tCVar = (com.bytedance.adsdk.IL.bg.bg.tC) bXVar;
                if (tCVar.IL() == com.bytedance.adsdk.IL.bX.IL.Fy.bg.SIMULTANEOUSLY) {
                    this.iR.bg(tCVar);
                    tCVar.bg(this);
                }
            }
        }
    }

    @Override // com.bytedance.adsdk.IL.bg.bg.Ta
    public android.graphics.Path eqN() {
        if (this.Kg) {
            return this.bg;
        }
        this.bg.reset();
        if (this.ldr.zx()) {
            this.Kg = true;
            return this.bg;
        }
        android.graphics.PointF pointFIR = this.eqN.iR();
        float f = pointFIR.x / 2.0f;
        float f2 = pointFIR.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = 0.55228f * f2;
        this.bg.reset();
        if (this.ldr.eqN()) {
            float f5 = -f2;
            this.bg.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            this.bg.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            this.bg.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f10 = f3 + 0.0f;
            this.bg.cubicTo(f10, f2, f, f9, f, 0.0f);
            this.bg.cubicTo(f, f8, f10, f5, 0.0f, f5);
        } else {
            float f11 = -f2;
            this.bg.moveTo(0.0f, f11);
            float f12 = f3 + 0.0f;
            float f13 = 0.0f - f4;
            this.bg.cubicTo(f12, f11, f, f13, f, 0.0f);
            float f14 = f4 + 0.0f;
            this.bg.cubicTo(f, f14, f12, f2, 0.0f, f2);
            float f15 = 0.0f - f3;
            float f16 = -f;
            this.bg.cubicTo(f15, f2, f16, f14, f16, 0.0f);
            this.bg.cubicTo(f16, f13, f15, f11, 0.0f, f11);
        }
        android.graphics.PointF pointFIR2 = this.zx.iR();
        this.bg.offset(pointFIR2.x, pointFIR2.y);
        this.bg.close();
        this.iR.bg(this.bg);
        this.Kg = true;
        return this.bg;
    }
}

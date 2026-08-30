package com.bytedance.adsdk.IL.bg.bg;

/* JADX INFO: loaded from: classes3.dex */
public class WR extends com.bytedance.adsdk.IL.bg.bg.bg {
    private final android.graphics.RectF Kg;
    private final com.bytedance.adsdk.IL.bg.IL.bg<android.graphics.PointF, android.graphics.PointF> PX;
    private final com.bytedance.adsdk.IL.bg.IL.bg<android.graphics.PointF, android.graphics.PointF> Ta;
    private final com.bytedance.adsdk.IL.bg.IL.bg<com.bytedance.adsdk.IL.bX.IL.eqN, com.bytedance.adsdk.IL.bX.IL.eqN> VB;
    private final com.bytedance.adsdk.IL.bX.IL.iR WR;
    private final int eo;
    private final java.lang.String eqN;
    private final android.util.LongSparseArray<android.graphics.RadialGradient> iR;
    private final android.util.LongSparseArray<android.graphics.LinearGradient> ldr;
    private com.bytedance.adsdk.IL.bg.IL.VzQ yDt;
    private final boolean zx;

    public WR(com.bytedance.adsdk.IL.WR wr, com.bytedance.adsdk.IL.bX.bX.bg bgVar, com.bytedance.adsdk.IL.bX.IL.ldr ldrVar) {
        super(wr, bgVar, ldrVar.Kg().bg(), ldrVar.WR().bg(), ldrVar.PX(), ldrVar.eqN(), ldrVar.iR(), ldrVar.eo(), ldrVar.VB());
        this.ldr = new android.util.LongSparseArray<>();
        this.iR = new android.util.LongSparseArray<>();
        this.Kg = new android.graphics.RectF();
        this.eqN = ldrVar.bg();
        this.WR = ldrVar.IL();
        this.zx = ldrVar.Ta();
        this.eo = (int) (wr.kMt().zx() / 32.0f);
        com.bytedance.adsdk.IL.bg.IL.bg<com.bytedance.adsdk.IL.bX.IL.eqN, com.bytedance.adsdk.IL.bX.IL.eqN> bgVarBg = ldrVar.bX().bg();
        this.VB = bgVarBg;
        bgVarBg.bg(this);
        bgVar.bg(bgVarBg);
        com.bytedance.adsdk.IL.bg.IL.bg<android.graphics.PointF, android.graphics.PointF> bgVarBg2 = ldrVar.zx().bg();
        this.PX = bgVarBg2;
        bgVarBg2.bg(this);
        bgVar.bg(bgVarBg2);
        com.bytedance.adsdk.IL.bg.IL.bg<android.graphics.PointF, android.graphics.PointF> bgVarBg3 = ldrVar.ldr().bg();
        this.Ta = bgVarBg3;
        bgVarBg3.bg(this);
        bgVar.bg(bgVarBg3);
    }

    @Override // com.bytedance.adsdk.IL.bg.bg.bg, com.bytedance.adsdk.IL.bg.bg.zx
    public void bg(android.graphics.Canvas canvas, android.graphics.Matrix matrix, int i) {
        android.graphics.Shader shaderBX;
        if (this.zx) {
            return;
        }
        bg(this.Kg, matrix, false);
        if (this.WR == com.bytedance.adsdk.IL.bX.IL.iR.LINEAR) {
            shaderBX = IL();
        } else {
            shaderBX = bX();
        }
        shaderBX.setLocalMatrix(matrix);
        this.IL.setShader(shaderBX);
        super.bg(canvas, matrix, i);
    }

    private android.graphics.LinearGradient IL() {
        long jEqN = eqN();
        android.graphics.LinearGradient linearGradient = this.ldr.get(jEqN);
        if (linearGradient != null) {
            return linearGradient;
        }
        android.graphics.PointF pointFIR = this.PX.iR();
        android.graphics.PointF pointFIR2 = this.Ta.iR();
        com.bytedance.adsdk.IL.bX.IL.eqN eqnIR = this.VB.iR();
        android.graphics.LinearGradient linearGradient2 = new android.graphics.LinearGradient(pointFIR.x, pointFIR.y, pointFIR2.x, pointFIR2.y, bg(eqnIR.IL()), eqnIR.bg(), android.graphics.Shader.TileMode.CLAMP);
        this.ldr.put(jEqN, linearGradient2);
        return linearGradient2;
    }

    private android.graphics.RadialGradient bX() {
        long jEqN = eqN();
        android.graphics.RadialGradient radialGradient = this.iR.get(jEqN);
        if (radialGradient != null) {
            return radialGradient;
        }
        android.graphics.PointF pointFIR = this.PX.iR();
        android.graphics.PointF pointFIR2 = this.Ta.iR();
        com.bytedance.adsdk.IL.bX.IL.eqN eqnIR = this.VB.iR();
        int[] iArrBg = bg(eqnIR.IL());
        float[] fArrBg = eqnIR.bg();
        float f = pointFIR.x;
        float f2 = pointFIR.y;
        android.graphics.RadialGradient radialGradient2 = new android.graphics.RadialGradient(f, f2, (float) java.lang.Math.hypot(pointFIR2.x - f, pointFIR2.y - f2), iArrBg, fArrBg, android.graphics.Shader.TileMode.CLAMP);
        this.iR.put(jEqN, radialGradient2);
        return radialGradient2;
    }

    private int eqN() {
        int iRound = java.lang.Math.round(this.PX.Kg() * this.eo);
        int iRound2 = java.lang.Math.round(this.Ta.Kg() * this.eo);
        int iRound3 = java.lang.Math.round(this.VB.Kg() * this.eo);
        int i = iRound != 0 ? iRound * com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }

    private int[] bg(int[] iArr) {
        if (this.yDt == null) {
            return iArr;
        }
        throw null;
    }
}

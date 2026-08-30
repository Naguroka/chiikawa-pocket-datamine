package com.bytedance.adsdk.IL.bg.bg;

/* JADX INFO: loaded from: classes3.dex */
public class Kg implements com.bytedance.adsdk.IL.bg.IL.bg.InterfaceC0076bg, com.bytedance.adsdk.IL.bg.bg.VB, com.bytedance.adsdk.IL.bg.bg.zx {
    private com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Float, java.lang.Float> Fy;
    private final java.lang.String IL;
    private final android.graphics.Paint Kg;
    private com.bytedance.adsdk.IL.bg.IL.bX LZ;
    private final com.bytedance.adsdk.IL.bg.IL.bg<android.graphics.PointF, android.graphics.PointF> Lq;
    private final com.bytedance.adsdk.IL.bg.IL.bg<com.bytedance.adsdk.IL.bX.IL.eqN, com.bytedance.adsdk.IL.bX.IL.eqN> PX;
    private final com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Integer, java.lang.Integer> Ta;
    private final com.bytedance.adsdk.IL.bX.IL.iR VB;
    private final com.bytedance.adsdk.IL.WR VzQ;
    private final android.graphics.RectF WR;
    private final boolean bX;
    float bg;
    private final java.util.List<com.bytedance.adsdk.IL.bg.bg.Ta> eo;
    private final com.bytedance.adsdk.IL.bX.bX.bg eqN;
    private final android.graphics.Path iR;
    private final int tuV;
    private com.bytedance.adsdk.IL.bg.IL.bg<android.graphics.ColorFilter, android.graphics.ColorFilter> vb;
    private com.bytedance.adsdk.IL.bg.IL.VzQ xxp;
    private final com.bytedance.adsdk.IL.bg.IL.bg<android.graphics.PointF, android.graphics.PointF> yDt;
    private final android.util.LongSparseArray<android.graphics.LinearGradient> zx = new android.util.LongSparseArray<>();
    private final android.util.LongSparseArray<android.graphics.RadialGradient> ldr = new android.util.LongSparseArray<>();

    public Kg(com.bytedance.adsdk.IL.WR wr, com.bytedance.adsdk.IL.iR iRVar, com.bytedance.adsdk.IL.bX.bX.bg bgVar, com.bytedance.adsdk.IL.bX.IL.zx zxVar) {
        android.graphics.Path path = new android.graphics.Path();
        this.iR = path;
        this.Kg = new com.bytedance.adsdk.IL.bg.bg(1);
        this.WR = new android.graphics.RectF();
        this.eo = new java.util.ArrayList();
        this.bg = 0.0f;
        this.eqN = bgVar;
        this.IL = zxVar.bg();
        this.bX = zxVar.Kg();
        this.VzQ = wr;
        this.VB = zxVar.IL();
        path.setFillType(zxVar.bX());
        this.tuV = (int) (iRVar.zx() / 32.0f);
        com.bytedance.adsdk.IL.bg.IL.bg<com.bytedance.adsdk.IL.bX.IL.eqN, com.bytedance.adsdk.IL.bX.IL.eqN> bgVarBg = zxVar.eqN().bg();
        this.PX = bgVarBg;
        bgVarBg.bg(this);
        bgVar.bg(bgVarBg);
        com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Integer, java.lang.Integer> bgVarBg2 = zxVar.zx().bg();
        this.Ta = bgVarBg2;
        bgVarBg2.bg(this);
        bgVar.bg(bgVarBg2);
        com.bytedance.adsdk.IL.bg.IL.bg<android.graphics.PointF, android.graphics.PointF> bgVarBg3 = zxVar.ldr().bg();
        this.yDt = bgVarBg3;
        bgVarBg3.bg(this);
        bgVar.bg(bgVarBg3);
        com.bytedance.adsdk.IL.bg.IL.bg<android.graphics.PointF, android.graphics.PointF> bgVarBg4 = zxVar.iR().bg();
        this.Lq = bgVarBg4;
        bgVarBg4.bg(this);
        bgVar.bg(bgVarBg4);
        if (bgVar.eo() != null) {
            com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Float, java.lang.Float> bgVarBg5 = bgVar.eo().bg().bg();
            this.Fy = bgVarBg5;
            bgVarBg5.bg(this);
            bgVar.bg(this.Fy);
        }
        if (bgVar.VB() != null) {
            this.LZ = new com.bytedance.adsdk.IL.bg.IL.bX(this, bgVar, bgVar.VB());
        }
    }

    @Override // com.bytedance.adsdk.IL.bg.IL.bg.InterfaceC0076bg
    public void bg() {
        this.VzQ.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.IL.bg.bg.bX
    public void bg(java.util.List<com.bytedance.adsdk.IL.bg.bg.bX> list, java.util.List<com.bytedance.adsdk.IL.bg.bg.bX> list2) {
        for (int i = 0; i < list2.size(); i++) {
            com.bytedance.adsdk.IL.bg.bg.bX bXVar = list2.get(i);
            if (bXVar instanceof com.bytedance.adsdk.IL.bg.bg.Ta) {
                this.eo.add((com.bytedance.adsdk.IL.bg.bg.Ta) bXVar);
            }
        }
    }

    @Override // com.bytedance.adsdk.IL.bg.bg.zx
    public void bg(android.graphics.Canvas canvas, android.graphics.Matrix matrix, int i) {
        android.graphics.Shader shaderBX;
        if (this.bX) {
            return;
        }
        com.bytedance.adsdk.IL.zx.bg("GradientFillContent#draw");
        this.iR.reset();
        for (int i2 = 0; i2 < this.eo.size(); i2++) {
            this.iR.addPath(this.eo.get(i2).eqN(), matrix);
        }
        this.iR.computeBounds(this.WR, false);
        if (this.VB == com.bytedance.adsdk.IL.bX.IL.iR.LINEAR) {
            shaderBX = IL();
        } else {
            shaderBX = bX();
        }
        shaderBX.setLocalMatrix(matrix);
        this.Kg.setShader(shaderBX);
        com.bytedance.adsdk.IL.bg.IL.bg<android.graphics.ColorFilter, android.graphics.ColorFilter> bgVar = this.vb;
        if (bgVar != null) {
            this.Kg.setColorFilter(bgVar.iR());
        }
        com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Float, java.lang.Float> bgVar2 = this.Fy;
        if (bgVar2 != null) {
            float fFloatValue = bgVar2.iR().floatValue();
            if (fFloatValue == 0.0f) {
                this.Kg.setMaskFilter(null);
            } else if (fFloatValue != this.bg) {
                this.Kg.setMaskFilter(new android.graphics.BlurMaskFilter(fFloatValue, android.graphics.BlurMaskFilter.Blur.NORMAL));
            }
            this.bg = fFloatValue;
        }
        com.bytedance.adsdk.IL.bg.IL.bX bXVar = this.LZ;
        if (bXVar != null) {
            bXVar.bg(this.Kg);
        }
        this.Kg.setAlpha(com.bytedance.adsdk.IL.ldr.zx.bg((int) ((((i / 255.0f) * this.Ta.iR().intValue()) / 100.0f) * 255.0f), 0, 255));
        canvas.drawPath(this.iR, this.Kg);
        com.bytedance.adsdk.IL.zx.IL("GradientFillContent#draw");
    }

    @Override // com.bytedance.adsdk.IL.bg.bg.zx
    public void bg(android.graphics.RectF rectF, android.graphics.Matrix matrix, boolean z) {
        this.iR.reset();
        for (int i = 0; i < this.eo.size(); i++) {
            this.iR.addPath(this.eo.get(i).eqN(), matrix);
        }
        this.iR.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    private android.graphics.LinearGradient IL() {
        long jEqN = eqN();
        android.graphics.LinearGradient linearGradient = this.zx.get(jEqN);
        if (linearGradient != null) {
            return linearGradient;
        }
        android.graphics.PointF pointFIR = this.yDt.iR();
        android.graphics.PointF pointFIR2 = this.Lq.iR();
        com.bytedance.adsdk.IL.bX.IL.eqN eqnIR = this.PX.iR();
        android.graphics.LinearGradient linearGradient2 = new android.graphics.LinearGradient(pointFIR.x, pointFIR.y, pointFIR2.x, pointFIR2.y, bg(eqnIR.IL()), eqnIR.bg(), android.graphics.Shader.TileMode.CLAMP);
        this.zx.put(jEqN, linearGradient2);
        return linearGradient2;
    }

    private android.graphics.RadialGradient bX() {
        long jEqN = eqN();
        android.graphics.RadialGradient radialGradient = this.ldr.get(jEqN);
        if (radialGradient != null) {
            return radialGradient;
        }
        android.graphics.PointF pointFIR = this.yDt.iR();
        android.graphics.PointF pointFIR2 = this.Lq.iR();
        com.bytedance.adsdk.IL.bX.IL.eqN eqnIR = this.PX.iR();
        int[] iArrBg = bg(eqnIR.IL());
        float[] fArrBg = eqnIR.bg();
        float f = pointFIR.x;
        float f2 = pointFIR.y;
        float fHypot = (float) java.lang.Math.hypot(pointFIR2.x - f, pointFIR2.y - f2);
        if (fHypot <= 0.0f) {
            fHypot = 0.001f;
        }
        android.graphics.RadialGradient radialGradient2 = new android.graphics.RadialGradient(f, f2, fHypot, iArrBg, fArrBg, android.graphics.Shader.TileMode.CLAMP);
        this.ldr.put(jEqN, radialGradient2);
        return radialGradient2;
    }

    private int eqN() {
        int iRound = java.lang.Math.round(this.yDt.Kg() * this.tuV);
        int iRound2 = java.lang.Math.round(this.Lq.Kg() * this.tuV);
        int iRound3 = java.lang.Math.round(this.PX.Kg() * this.tuV);
        int i = iRound != 0 ? iRound * com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }

    private int[] bg(int[] iArr) {
        if (this.xxp == null) {
            return iArr;
        }
        throw null;
    }
}

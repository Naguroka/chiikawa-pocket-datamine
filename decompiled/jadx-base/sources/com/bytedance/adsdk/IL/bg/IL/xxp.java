package com.bytedance.adsdk.IL.bg.IL;

/* JADX INFO: loaded from: classes3.dex */
public class xxp {
    private final android.graphics.Matrix IL;
    private com.bytedance.adsdk.IL.bg.IL.bg<com.bytedance.adsdk.IL.iR.bX, com.bytedance.adsdk.IL.iR.bX> Kg;
    private com.bytedance.adsdk.IL.bg.IL.eqN PX;
    private com.bytedance.adsdk.IL.bg.IL.bg<?, java.lang.Float> Ta;
    private com.bytedance.adsdk.IL.bg.IL.eqN VB;
    private com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Float, java.lang.Float> WR;
    private final android.graphics.Matrix bX;
    private final android.graphics.Matrix bg = new android.graphics.Matrix();
    private com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Integer, java.lang.Integer> eo;
    private final android.graphics.Matrix eqN;
    private com.bytedance.adsdk.IL.bg.IL.bg<?, android.graphics.PointF> iR;
    private com.bytedance.adsdk.IL.bg.IL.bg<android.graphics.PointF, android.graphics.PointF> ldr;
    private com.bytedance.adsdk.IL.bg.IL.bg<?, java.lang.Float> yDt;
    private final float[] zx;

    public xxp(com.bytedance.adsdk.IL.bX.bg.PX px) {
        this.ldr = px.bg() == null ? null : px.bg().bg();
        this.iR = px.IL() == null ? null : px.IL().bg();
        this.Kg = px.bX() == null ? null : px.bX().bg();
        this.WR = px.eqN() == null ? null : px.eqN().bg();
        com.bytedance.adsdk.IL.bg.IL.eqN eqn = px.Kg() == null ? null : (com.bytedance.adsdk.IL.bg.IL.eqN) px.Kg().bg();
        this.VB = eqn;
        if (eqn != null) {
            this.IL = new android.graphics.Matrix();
            this.bX = new android.graphics.Matrix();
            this.eqN = new android.graphics.Matrix();
            this.zx = new float[9];
        } else {
            this.IL = null;
            this.bX = null;
            this.eqN = null;
            this.zx = null;
        }
        this.PX = px.WR() == null ? null : (com.bytedance.adsdk.IL.bg.IL.eqN) px.WR().bg();
        if (px.zx() != null) {
            this.eo = px.zx().bg();
        }
        if (px.ldr() != null) {
            this.Ta = px.ldr().bg();
        } else {
            this.Ta = null;
        }
        if (px.iR() != null) {
            this.yDt = px.iR().bg();
        } else {
            this.yDt = null;
        }
    }

    public void bg(com.bytedance.adsdk.IL.bX.bX.bg bgVar) {
        bgVar.bg(this.eo);
        bgVar.bg(this.Ta);
        bgVar.bg(this.yDt);
        bgVar.bg(this.ldr);
        bgVar.bg(this.iR);
        bgVar.bg(this.Kg);
        bgVar.bg(this.WR);
        bgVar.bg(this.VB);
        bgVar.bg(this.PX);
    }

    public void bg(com.bytedance.adsdk.IL.bg.IL.bg.InterfaceC0076bg interfaceC0076bg) {
        com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Integer, java.lang.Integer> bgVar = this.eo;
        if (bgVar != null) {
            bgVar.bg(interfaceC0076bg);
        }
        com.bytedance.adsdk.IL.bg.IL.bg<?, java.lang.Float> bgVar2 = this.Ta;
        if (bgVar2 != null) {
            bgVar2.bg(interfaceC0076bg);
        }
        com.bytedance.adsdk.IL.bg.IL.bg<?, java.lang.Float> bgVar3 = this.yDt;
        if (bgVar3 != null) {
            bgVar3.bg(interfaceC0076bg);
        }
        com.bytedance.adsdk.IL.bg.IL.bg<android.graphics.PointF, android.graphics.PointF> bgVar4 = this.ldr;
        if (bgVar4 != null) {
            bgVar4.bg(interfaceC0076bg);
        }
        com.bytedance.adsdk.IL.bg.IL.bg<?, android.graphics.PointF> bgVar5 = this.iR;
        if (bgVar5 != null) {
            bgVar5.bg(interfaceC0076bg);
        }
        com.bytedance.adsdk.IL.bg.IL.bg<com.bytedance.adsdk.IL.iR.bX, com.bytedance.adsdk.IL.iR.bX> bgVar6 = this.Kg;
        if (bgVar6 != null) {
            bgVar6.bg(interfaceC0076bg);
        }
        com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Float, java.lang.Float> bgVar7 = this.WR;
        if (bgVar7 != null) {
            bgVar7.bg(interfaceC0076bg);
        }
        com.bytedance.adsdk.IL.bg.IL.eqN eqn = this.VB;
        if (eqn != null) {
            eqn.bg(interfaceC0076bg);
        }
        com.bytedance.adsdk.IL.bg.IL.eqN eqn2 = this.PX;
        if (eqn2 != null) {
            eqn2.bg(interfaceC0076bg);
        }
    }

    public void bg(float f) {
        com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Integer, java.lang.Integer> bgVar = this.eo;
        if (bgVar != null) {
            bgVar.bg(f);
        }
        com.bytedance.adsdk.IL.bg.IL.bg<?, java.lang.Float> bgVar2 = this.Ta;
        if (bgVar2 != null) {
            bgVar2.bg(f);
        }
        com.bytedance.adsdk.IL.bg.IL.bg<?, java.lang.Float> bgVar3 = this.yDt;
        if (bgVar3 != null) {
            bgVar3.bg(f);
        }
        com.bytedance.adsdk.IL.bg.IL.bg<android.graphics.PointF, android.graphics.PointF> bgVar4 = this.ldr;
        if (bgVar4 != null) {
            bgVar4.bg(f);
        }
        com.bytedance.adsdk.IL.bg.IL.bg<?, android.graphics.PointF> bgVar5 = this.iR;
        if (bgVar5 != null) {
            bgVar5.bg(f);
        }
        com.bytedance.adsdk.IL.bg.IL.bg<com.bytedance.adsdk.IL.iR.bX, com.bytedance.adsdk.IL.iR.bX> bgVar6 = this.Kg;
        if (bgVar6 != null) {
            bgVar6.bg(f);
        }
        com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Float, java.lang.Float> bgVar7 = this.WR;
        if (bgVar7 != null) {
            bgVar7.bg(f);
        }
        com.bytedance.adsdk.IL.bg.IL.eqN eqn = this.VB;
        if (eqn != null) {
            eqn.bg(f);
        }
        com.bytedance.adsdk.IL.bg.IL.eqN eqn2 = this.PX;
        if (eqn2 != null) {
            eqn2.bg(f);
        }
    }

    public com.bytedance.adsdk.IL.bg.IL.bg<?, java.lang.Integer> bg() {
        return this.eo;
    }

    public com.bytedance.adsdk.IL.bg.IL.bg<?, java.lang.Float> IL() {
        return this.Ta;
    }

    public com.bytedance.adsdk.IL.bg.IL.bg<?, java.lang.Float> bX() {
        return this.yDt;
    }

    public android.graphics.Matrix eqN() {
        android.graphics.PointF pointFIR;
        float fWR;
        android.graphics.PointF pointFIR2;
        this.bg.reset();
        com.bytedance.adsdk.IL.bg.IL.bg<?, android.graphics.PointF> bgVar = this.iR;
        if (bgVar != null && (pointFIR2 = bgVar.iR()) != null && (pointFIR2.x != 0.0f || pointFIR2.y != 0.0f)) {
            this.bg.preTranslate(pointFIR2.x, pointFIR2.y);
        }
        com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Float, java.lang.Float> bgVar2 = this.WR;
        if (bgVar2 != null) {
            if (bgVar2 instanceof com.bytedance.adsdk.IL.bg.IL.VzQ) {
                fWR = bgVar2.iR().floatValue();
            } else {
                fWR = ((com.bytedance.adsdk.IL.bg.IL.eqN) bgVar2).WR();
            }
            if (fWR != 0.0f) {
                this.bg.preRotate(fWR);
            }
        }
        com.bytedance.adsdk.IL.bg.IL.eqN eqn = this.VB;
        if (eqn != null) {
            com.bytedance.adsdk.IL.bg.IL.eqN eqn2 = this.PX;
            float fCos = eqn2 == null ? 0.0f : (float) java.lang.Math.cos(java.lang.Math.toRadians((-eqn2.WR()) + 90.0f));
            com.bytedance.adsdk.IL.bg.IL.eqN eqn3 = this.PX;
            float fSin = eqn3 == null ? 1.0f : (float) java.lang.Math.sin(java.lang.Math.toRadians((-eqn3.WR()) + 90.0f));
            float fTan = (float) java.lang.Math.tan(java.lang.Math.toRadians(eqn.WR()));
            zx();
            float[] fArr = this.zx;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f = -fSin;
            fArr[3] = f;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            this.IL.setValues(fArr);
            zx();
            float[] fArr2 = this.zx;
            fArr2[0] = 1.0f;
            fArr2[3] = fTan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.bX.setValues(fArr2);
            zx();
            float[] fArr3 = this.zx;
            fArr3[0] = fCos;
            fArr3[1] = f;
            fArr3[3] = fSin;
            fArr3[4] = fCos;
            fArr3[8] = 1.0f;
            this.eqN.setValues(fArr3);
            this.bX.preConcat(this.IL);
            this.eqN.preConcat(this.bX);
            this.bg.preConcat(this.eqN);
        }
        com.bytedance.adsdk.IL.bg.IL.bg<com.bytedance.adsdk.IL.iR.bX, com.bytedance.adsdk.IL.iR.bX> bgVar3 = this.Kg;
        if (bgVar3 != null) {
            com.bytedance.adsdk.IL.iR.bX bXVarIR = bgVar3.iR();
            if (bXVarIR.bg() != 1.0f || bXVarIR.IL() != 1.0f) {
                this.bg.preScale(bXVarIR.bg(), bXVarIR.IL());
            }
        }
        com.bytedance.adsdk.IL.bg.IL.bg<android.graphics.PointF, android.graphics.PointF> bgVar4 = this.ldr;
        if (bgVar4 != null && (((pointFIR = bgVar4.iR()) != null && pointFIR.x != 0.0f) || pointFIR.y != 0.0f)) {
            this.bg.preTranslate(-pointFIR.x, -pointFIR.y);
        }
        return this.bg;
    }

    private void zx() {
        for (int i = 0; i < 9; i++) {
            this.zx[i] = 0.0f;
        }
    }

    public android.graphics.Matrix IL(float f) {
        com.bytedance.adsdk.IL.bg.IL.bg<?, android.graphics.PointF> bgVar = this.iR;
        android.graphics.PointF pointFIR = bgVar == null ? null : bgVar.iR();
        com.bytedance.adsdk.IL.bg.IL.bg<com.bytedance.adsdk.IL.iR.bX, com.bytedance.adsdk.IL.iR.bX> bgVar2 = this.Kg;
        com.bytedance.adsdk.IL.iR.bX bXVarIR = bgVar2 == null ? null : bgVar2.iR();
        this.bg.reset();
        if (pointFIR != null) {
            this.bg.preTranslate(pointFIR.x * f, pointFIR.y * f);
        }
        if (bXVarIR != null) {
            double d = f;
            this.bg.preScale((float) java.lang.Math.pow(bXVarIR.bg(), d), (float) java.lang.Math.pow(bXVarIR.IL(), d));
        }
        com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Float, java.lang.Float> bgVar3 = this.WR;
        if (bgVar3 != null) {
            float fFloatValue = bgVar3.iR().floatValue();
            com.bytedance.adsdk.IL.bg.IL.bg<android.graphics.PointF, android.graphics.PointF> bgVar4 = this.ldr;
            android.graphics.PointF pointFIR2 = bgVar4 != null ? bgVar4.iR() : null;
            this.bg.preRotate(fFloatValue * f, pointFIR2 == null ? 0.0f : pointFIR2.x, pointFIR2 != null ? pointFIR2.y : 0.0f);
        }
        return this.bg;
    }
}

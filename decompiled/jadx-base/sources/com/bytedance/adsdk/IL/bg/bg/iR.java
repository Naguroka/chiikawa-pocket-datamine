package com.bytedance.adsdk.IL.bg.bg;

/* JADX INFO: loaded from: classes3.dex */
public class iR implements com.bytedance.adsdk.IL.bg.IL.bg.InterfaceC0076bg, com.bytedance.adsdk.IL.bg.bg.VB, com.bytedance.adsdk.IL.bg.bg.zx {
    private final android.graphics.Path IL;
    private final com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Integer, java.lang.Integer> Kg;
    private com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Float, java.lang.Float> PX;
    private com.bytedance.adsdk.IL.bg.IL.bX Ta;
    private final com.bytedance.adsdk.IL.WR VB;
    private final com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Integer, java.lang.Integer> WR;
    private final android.graphics.Paint bX;
    float bg;
    private com.bytedance.adsdk.IL.bg.IL.bg<android.graphics.ColorFilter, android.graphics.ColorFilter> eo;
    private final com.bytedance.adsdk.IL.bX.bX.bg eqN;
    private final java.util.List<com.bytedance.adsdk.IL.bg.bg.Ta> iR;
    private final boolean ldr;
    private final java.lang.String zx;

    public iR(com.bytedance.adsdk.IL.WR wr, com.bytedance.adsdk.IL.bX.bX.bg bgVar, com.bytedance.adsdk.IL.bX.IL.Lq lq) {
        android.graphics.Path path = new android.graphics.Path();
        this.IL = path;
        this.bX = new com.bytedance.adsdk.IL.bg.bg(1);
        this.iR = new java.util.ArrayList();
        this.eqN = bgVar;
        this.zx = lq.bg();
        this.ldr = lq.zx();
        this.VB = wr;
        if (bgVar.eo() != null) {
            com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Float, java.lang.Float> bgVarBg = bgVar.eo().bg().bg();
            this.PX = bgVarBg;
            bgVarBg.bg(this);
            bgVar.bg(this.PX);
        }
        if (bgVar.VB() != null) {
            this.Ta = new com.bytedance.adsdk.IL.bg.IL.bX(this, bgVar, bgVar.VB());
        }
        if (lq.IL() == null || lq.bX() == null) {
            this.Kg = null;
            this.WR = null;
            return;
        }
        path.setFillType(lq.eqN());
        com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Integer, java.lang.Integer> bgVarBg2 = lq.IL().bg();
        this.Kg = bgVarBg2;
        bgVarBg2.bg(this);
        bgVar.bg(bgVarBg2);
        com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Integer, java.lang.Integer> bgVarBg3 = lq.bX().bg();
        this.WR = bgVarBg3;
        bgVarBg3.bg(this);
        bgVar.bg(bgVarBg3);
    }

    @Override // com.bytedance.adsdk.IL.bg.IL.bg.InterfaceC0076bg
    public void bg() {
        this.VB.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.IL.bg.bg.bX
    public void bg(java.util.List<com.bytedance.adsdk.IL.bg.bg.bX> list, java.util.List<com.bytedance.adsdk.IL.bg.bg.bX> list2) {
        for (int i = 0; i < list2.size(); i++) {
            com.bytedance.adsdk.IL.bg.bg.bX bXVar = list2.get(i);
            if (bXVar instanceof com.bytedance.adsdk.IL.bg.bg.Ta) {
                this.iR.add((com.bytedance.adsdk.IL.bg.bg.Ta) bXVar);
            }
        }
    }

    @Override // com.bytedance.adsdk.IL.bg.bg.zx
    public void bg(android.graphics.Canvas canvas, android.graphics.Matrix matrix, int i) {
        if (this.ldr) {
            return;
        }
        com.bytedance.adsdk.IL.zx.bg("FillContent#draw");
        this.bX.setColor((com.bytedance.adsdk.IL.ldr.zx.bg((int) ((((i / 255.0f) * this.WR.iR().intValue()) / 100.0f) * 255.0f), 0, 255) << 24) | (((com.bytedance.adsdk.IL.bg.IL.IL) this.Kg).WR() & androidx.core.view.ViewCompat.MEASURED_SIZE_MASK));
        com.bytedance.adsdk.IL.bg.IL.bg<android.graphics.ColorFilter, android.graphics.ColorFilter> bgVar = this.eo;
        if (bgVar != null) {
            this.bX.setColorFilter(bgVar.iR());
        }
        com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Float, java.lang.Float> bgVar2 = this.PX;
        if (bgVar2 != null) {
            float fFloatValue = bgVar2.iR().floatValue();
            if (fFloatValue == 0.0f) {
                this.bX.setMaskFilter(null);
            } else if (fFloatValue != this.bg) {
                this.bX.setMaskFilter(this.eqN.IL(fFloatValue));
            }
            this.bg = fFloatValue;
        }
        com.bytedance.adsdk.IL.bg.IL.bX bXVar = this.Ta;
        if (bXVar != null) {
            bXVar.bg(this.bX);
        }
        this.IL.reset();
        for (int i2 = 0; i2 < this.iR.size(); i2++) {
            this.IL.addPath(this.iR.get(i2).eqN(), matrix);
        }
        canvas.drawPath(this.IL, this.bX);
        com.bytedance.adsdk.IL.zx.IL("FillContent#draw");
    }

    @Override // com.bytedance.adsdk.IL.bg.bg.zx
    public void bg(android.graphics.RectF rectF, android.graphics.Matrix matrix, boolean z) {
        this.IL.reset();
        for (int i = 0; i < this.iR.size(); i++) {
            this.IL.addPath(this.iR.get(i).eqN(), matrix);
        }
        this.IL.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }
}

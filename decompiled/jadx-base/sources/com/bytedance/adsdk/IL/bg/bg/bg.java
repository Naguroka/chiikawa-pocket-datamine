package com.bytedance.adsdk.IL.bg.bg;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bg implements com.bytedance.adsdk.IL.bg.IL.bg.InterfaceC0076bg, com.bytedance.adsdk.IL.bg.bg.VB, com.bytedance.adsdk.IL.bg.bg.zx {
    final android.graphics.Paint IL;
    private final com.bytedance.adsdk.IL.WR Kg;
    private com.bytedance.adsdk.IL.bg.IL.bg<android.graphics.ColorFilter, android.graphics.ColorFilter> Lq;
    private final com.bytedance.adsdk.IL.bg.IL.bg<?, java.lang.Integer> PX;
    private final java.util.List<com.bytedance.adsdk.IL.bg.IL.bg<?, java.lang.Float>> Ta;
    private final com.bytedance.adsdk.IL.bg.IL.bg<?, java.lang.Float> VB;
    float bX;
    protected final com.bytedance.adsdk.IL.bX.bX.bg bg;
    private final float[] eo;
    private com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Float, java.lang.Float> vb;
    private com.bytedance.adsdk.IL.bg.IL.bX xxp;
    private final com.bytedance.adsdk.IL.bg.IL.bg<?, java.lang.Float> yDt;
    private final android.graphics.PathMeasure eqN = new android.graphics.PathMeasure();
    private final android.graphics.Path zx = new android.graphics.Path();
    private final android.graphics.Path ldr = new android.graphics.Path();
    private final android.graphics.RectF iR = new android.graphics.RectF();
    private final java.util.List<com.bytedance.adsdk.IL.bg.bg.bg.C0077bg> WR = new java.util.ArrayList();

    bg(com.bytedance.adsdk.IL.WR wr, com.bytedance.adsdk.IL.bX.bX.bg bgVar, android.graphics.Paint.Cap cap, android.graphics.Paint.Join join, float f, com.bytedance.adsdk.IL.bX.bg.eqN eqn, com.bytedance.adsdk.IL.bX.bg.IL il, java.util.List<com.bytedance.adsdk.IL.bX.bg.IL> list, com.bytedance.adsdk.IL.bX.bg.IL il2) {
        com.bytedance.adsdk.IL.bg.bg bgVar2 = new com.bytedance.adsdk.IL.bg.bg(1);
        this.IL = bgVar2;
        this.bX = 0.0f;
        this.Kg = wr;
        this.bg = bgVar;
        bgVar2.setStyle(android.graphics.Paint.Style.STROKE);
        bgVar2.setStrokeCap(cap);
        bgVar2.setStrokeJoin(join);
        bgVar2.setStrokeMiter(f);
        this.PX = eqn.bg();
        this.VB = il.bg();
        if (il2 == null) {
            this.yDt = null;
        } else {
            this.yDt = il2.bg();
        }
        this.Ta = new java.util.ArrayList(list.size());
        this.eo = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.Ta.add(list.get(i).bg());
        }
        bgVar.bg(this.PX);
        bgVar.bg(this.VB);
        for (int i2 = 0; i2 < this.Ta.size(); i2++) {
            bgVar.bg(this.Ta.get(i2));
        }
        com.bytedance.adsdk.IL.bg.IL.bg<?, java.lang.Float> bgVar3 = this.yDt;
        if (bgVar3 != null) {
            bgVar.bg(bgVar3);
        }
        this.PX.bg(this);
        this.VB.bg(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.Ta.get(i3).bg(this);
        }
        com.bytedance.adsdk.IL.bg.IL.bg<?, java.lang.Float> bgVar4 = this.yDt;
        if (bgVar4 != null) {
            bgVar4.bg(this);
        }
        if (bgVar.eo() != null) {
            com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Float, java.lang.Float> bgVarBg = bgVar.eo().bg().bg();
            this.vb = bgVarBg;
            bgVarBg.bg(this);
            bgVar.bg(this.vb);
        }
        if (bgVar.VB() != null) {
            this.xxp = new com.bytedance.adsdk.IL.bg.IL.bX(this, bgVar, bgVar.VB());
        }
    }

    @Override // com.bytedance.adsdk.IL.bg.IL.bg.InterfaceC0076bg
    public void bg() {
        this.Kg.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055  */
    /* JADX WARN: Code duplicated, block: B:23:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069 A[SYNTHETIC] */
    @Override // com.bytedance.adsdk.IL.bg.bg.bX
    public void bg(java.util.List<com.bytedance.adsdk.IL.bg.bg.bX> list, java.util.List<com.bytedance.adsdk.IL.bg.bg.bX> list2) {
        com.bytedance.adsdk.IL.bg.bg.tC tCVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            com.bytedance.adsdk.IL.bg.bg.bX bXVar = list.get(size);
            if (bXVar instanceof com.bytedance.adsdk.IL.bg.bg.tC) {
                com.bytedance.adsdk.IL.bg.bg.tC tCVar2 = (com.bytedance.adsdk.IL.bg.bg.tC) bXVar;
                if (tCVar2.IL() == com.bytedance.adsdk.IL.bX.IL.Fy.bg.INDIVIDUALLY) {
                    tCVar = tCVar2;
                }
            }
        }
        if (tCVar != null) {
            tCVar.bg(this);
        }
        com.bytedance.adsdk.IL.bg.bg.bg.C0077bg c0077bg = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            com.bytedance.adsdk.IL.bg.bg.bX bXVar2 = list2.get(size2);
            if (bXVar2 instanceof com.bytedance.adsdk.IL.bg.bg.tC) {
                com.bytedance.adsdk.IL.bg.bg.tC tCVar3 = (com.bytedance.adsdk.IL.bg.bg.tC) bXVar2;
                if (tCVar3.IL() == com.bytedance.adsdk.IL.bX.IL.Fy.bg.INDIVIDUALLY) {
                    if (c0077bg != null) {
                        this.WR.add(c0077bg);
                    }
                    c0077bg = new com.bytedance.adsdk.IL.bg.bg.bg.C0077bg(tCVar3);
                    tCVar3.bg(this);
                } else if (!(bXVar2 instanceof com.bytedance.adsdk.IL.bg.bg.Ta)) {
                    if (c0077bg == null) {
                        c0077bg = new com.bytedance.adsdk.IL.bg.bg.bg.C0077bg(tCVar);
                    }
                    c0077bg.bg.add((com.bytedance.adsdk.IL.bg.bg.Ta) bXVar2);
                }
            } else if (!(bXVar2 instanceof com.bytedance.adsdk.IL.bg.bg.Ta)) {
                if (c0077bg == null) {
                    c0077bg = new com.bytedance.adsdk.IL.bg.bg.bg.C0077bg(tCVar);
                }
                c0077bg.bg.add((com.bytedance.adsdk.IL.bg.bg.Ta) bXVar2);
            }
        }
        if (c0077bg != null) {
            this.WR.add(c0077bg);
        }
    }

    public void bg(android.graphics.Canvas canvas, android.graphics.Matrix matrix, int i) {
        com.bytedance.adsdk.IL.zx.bg("StrokeContent#draw");
        if (com.bytedance.adsdk.IL.ldr.ldr.IL(matrix)) {
            com.bytedance.adsdk.IL.zx.IL("StrokeContent#draw");
            return;
        }
        this.IL.setAlpha(com.bytedance.adsdk.IL.ldr.zx.bg((int) ((((i / 255.0f) * ((com.bytedance.adsdk.IL.bg.IL.ldr) this.PX).WR()) / 100.0f) * 255.0f), 0, 255));
        this.IL.setStrokeWidth(((com.bytedance.adsdk.IL.bg.IL.eqN) this.VB).WR() * com.bytedance.adsdk.IL.ldr.ldr.bg(matrix));
        if (this.IL.getStrokeWidth() <= 0.0f) {
            com.bytedance.adsdk.IL.zx.IL("StrokeContent#draw");
            return;
        }
        bg(matrix);
        com.bytedance.adsdk.IL.bg.IL.bg<android.graphics.ColorFilter, android.graphics.ColorFilter> bgVar = this.Lq;
        if (bgVar != null) {
            this.IL.setColorFilter(bgVar.iR());
        }
        com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Float, java.lang.Float> bgVar2 = this.vb;
        if (bgVar2 != null) {
            float fFloatValue = bgVar2.iR().floatValue();
            if (fFloatValue == 0.0f) {
                this.IL.setMaskFilter(null);
            } else if (fFloatValue != this.bX) {
                this.IL.setMaskFilter(this.bg.IL(fFloatValue));
            }
            this.bX = fFloatValue;
        }
        com.bytedance.adsdk.IL.bg.IL.bX bXVar = this.xxp;
        if (bXVar != null) {
            bXVar.bg(this.IL);
        }
        for (int i2 = 0; i2 < this.WR.size(); i2++) {
            com.bytedance.adsdk.IL.bg.bg.bg.C0077bg c0077bg = this.WR.get(i2);
            if (c0077bg.IL != null) {
                bg(canvas, c0077bg, matrix);
            } else {
                com.bytedance.adsdk.IL.zx.bg("StrokeContent#buildPath");
                this.zx.reset();
                for (int size = c0077bg.bg.size() - 1; size >= 0; size--) {
                    this.zx.addPath(((com.bytedance.adsdk.IL.bg.bg.Ta) c0077bg.bg.get(size)).eqN(), matrix);
                }
                com.bytedance.adsdk.IL.zx.IL("StrokeContent#buildPath");
                com.bytedance.adsdk.IL.zx.bg("StrokeContent#drawPath");
                canvas.drawPath(this.zx, this.IL);
                com.bytedance.adsdk.IL.zx.IL("StrokeContent#drawPath");
            }
        }
        com.bytedance.adsdk.IL.zx.IL("StrokeContent#draw");
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0110  */
    private void bg(android.graphics.Canvas canvas, com.bytedance.adsdk.IL.bg.bg.bg.C0077bg c0077bg, android.graphics.Matrix matrix) {
        float f;
        float f2;
        float fMin;
        com.bytedance.adsdk.IL.zx.bg("StrokeContent#applyTrimPath");
        if (c0077bg.IL == null) {
            com.bytedance.adsdk.IL.zx.IL("StrokeContent#applyTrimPath");
            return;
        }
        this.zx.reset();
        for (int size = c0077bg.bg.size() - 1; size >= 0; size--) {
            this.zx.addPath(((com.bytedance.adsdk.IL.bg.bg.Ta) c0077bg.bg.get(size)).eqN(), matrix);
        }
        float fFloatValue = c0077bg.IL.bX().iR().floatValue() / 100.0f;
        float fFloatValue2 = c0077bg.IL.eqN().iR().floatValue() / 100.0f;
        float fFloatValue3 = c0077bg.IL.zx().iR().floatValue() / 360.0f;
        if (fFloatValue < 0.01f && fFloatValue2 > 0.99f) {
            canvas.drawPath(this.zx, this.IL);
            com.bytedance.adsdk.IL.zx.IL("StrokeContent#applyTrimPath");
            return;
        }
        this.eqN.setPath(this.zx, false);
        float length = this.eqN.getLength();
        while (this.eqN.nextContour()) {
            length += this.eqN.getLength();
        }
        float f3 = fFloatValue3 * length;
        float f4 = (fFloatValue * length) + f3;
        float fMin2 = java.lang.Math.min((fFloatValue2 * length) + f3, (f4 + length) - 1.0f);
        float f5 = 0.0f;
        for (int size2 = c0077bg.bg.size() - 1; size2 >= 0; size2--) {
            this.ldr.set(((com.bytedance.adsdk.IL.bg.bg.Ta) c0077bg.bg.get(size2)).eqN());
            this.ldr.transform(matrix);
            this.eqN.setPath(this.ldr, false);
            float length2 = this.eqN.getLength();
            if (fMin2 > length) {
                float f6 = fMin2 - length;
                if (f6 >= f5 + length2 || f5 >= f6) {
                    f = f5 + length2;
                    if (f < f4 && f5 <= fMin2) {
                        if (f > fMin2 || f4 >= f5) {
                            f2 = f4 < f5 ? 0.0f : (f4 - f5) / length2;
                            fMin = fMin2 > f ? 1.0f : (fMin2 - f5) / length2;
                        } else {
                            canvas.drawPath(this.ldr, this.IL);
                        }
                    }
                } else {
                    f2 = f4 > length ? (f4 - length) / length2 : 0.0f;
                    fMin = java.lang.Math.min(f6 / length2, 1.0f);
                }
                com.bytedance.adsdk.IL.ldr.ldr.bg(this.ldr, f2, fMin, 0.0f);
                canvas.drawPath(this.ldr, this.IL);
            } else {
                f = f5 + length2;
                if (f < f4) {
                }
            }
            f5 += length2;
        }
        com.bytedance.adsdk.IL.zx.IL("StrokeContent#applyTrimPath");
    }

    @Override // com.bytedance.adsdk.IL.bg.bg.zx
    public void bg(android.graphics.RectF rectF, android.graphics.Matrix matrix, boolean z) {
        com.bytedance.adsdk.IL.zx.bg("StrokeContent#getBounds");
        this.zx.reset();
        for (int i = 0; i < this.WR.size(); i++) {
            com.bytedance.adsdk.IL.bg.bg.bg.C0077bg c0077bg = this.WR.get(i);
            for (int i2 = 0; i2 < c0077bg.bg.size(); i2++) {
                this.zx.addPath(((com.bytedance.adsdk.IL.bg.bg.Ta) c0077bg.bg.get(i2)).eqN(), matrix);
            }
        }
        this.zx.computeBounds(this.iR, false);
        float fWR = ((com.bytedance.adsdk.IL.bg.IL.eqN) this.VB).WR();
        android.graphics.RectF rectF2 = this.iR;
        float f = fWR / 2.0f;
        rectF2.set(rectF2.left - f, this.iR.top - f, this.iR.right + f, this.iR.bottom + f);
        rectF.set(this.iR);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        com.bytedance.adsdk.IL.zx.IL("StrokeContent#getBounds");
    }

    private void bg(android.graphics.Matrix matrix) {
        com.bytedance.adsdk.IL.zx.bg("StrokeContent#applyDashPattern");
        if (this.Ta.isEmpty()) {
            com.bytedance.adsdk.IL.zx.IL("StrokeContent#applyDashPattern");
            return;
        }
        float fBg = com.bytedance.adsdk.IL.ldr.ldr.bg(matrix);
        for (int i = 0; i < this.Ta.size(); i++) {
            this.eo[i] = this.Ta.get(i).iR().floatValue();
            if (i % 2 == 0) {
                float[] fArr = this.eo;
                if (fArr[i] < 1.0f) {
                    fArr[i] = 1.0f;
                }
            } else {
                float[] fArr2 = this.eo;
                if (fArr2[i] < 0.1f) {
                    fArr2[i] = 0.1f;
                }
            }
            float[] fArr3 = this.eo;
            fArr3[i] = fArr3[i] * fBg;
        }
        com.bytedance.adsdk.IL.bg.IL.bg<?, java.lang.Float> bgVar = this.yDt;
        this.IL.setPathEffect(new android.graphics.DashPathEffect(this.eo, bgVar == null ? 0.0f : fBg * bgVar.iR().floatValue()));
        com.bytedance.adsdk.IL.zx.IL("StrokeContent#applyDashPattern");
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.IL.bg.bg.bg$bg, reason: collision with other inner class name */
    private static final class C0077bg {
        private final com.bytedance.adsdk.IL.bg.bg.tC IL;
        private final java.util.List<com.bytedance.adsdk.IL.bg.bg.Ta> bg;

        private C0077bg(com.bytedance.adsdk.IL.bg.bg.tC tCVar) {
            this.bg = new java.util.ArrayList();
            this.IL = tCVar;
        }
    }
}

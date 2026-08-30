package com.bytedance.adsdk.IL.bg.bg;

/* JADX INFO: loaded from: classes3.dex */
public class yDt implements com.bytedance.adsdk.IL.bg.IL.bg.InterfaceC0076bg, com.bytedance.adsdk.IL.bg.bg.Ta, com.bytedance.adsdk.IL.bg.bg.VB {
    private final java.lang.String IL;
    private final com.bytedance.adsdk.IL.bg.IL.bg<?, android.graphics.PointF> Kg;
    private boolean Lq;
    private final com.bytedance.adsdk.IL.bg.IL.bg<?, java.lang.Float> PX;
    private final com.bytedance.adsdk.IL.bg.IL.bg<?, java.lang.Float> Ta;
    private final com.bytedance.adsdk.IL.bg.IL.bg<?, java.lang.Float> VB;
    private final com.bytedance.adsdk.IL.bg.IL.bg<?, java.lang.Float> WR;
    private final com.bytedance.adsdk.IL.WR bX;
    private final com.bytedance.adsdk.IL.bg.IL.bg<?, java.lang.Float> eo;
    private final com.bytedance.adsdk.IL.bX.IL.eo.bg eqN;
    private final com.bytedance.adsdk.IL.bg.IL.bg<?, java.lang.Float> iR;
    private final boolean ldr;
    private final boolean zx;
    private final android.graphics.Path bg = new android.graphics.Path();
    private final com.bytedance.adsdk.IL.bg.bg.IL yDt = new com.bytedance.adsdk.IL.bg.bg.IL();

    public yDt(com.bytedance.adsdk.IL.WR wr, com.bytedance.adsdk.IL.bX.bX.bg bgVar, com.bytedance.adsdk.IL.bX.IL.eo eoVar) {
        this.bX = wr;
        this.IL = eoVar.bg();
        com.bytedance.adsdk.IL.bX.IL.eo.bg bgVarIL = eoVar.IL();
        this.eqN = bgVarIL;
        this.zx = eoVar.eo();
        this.ldr = eoVar.VB();
        com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Float, java.lang.Float> bgVarBg = eoVar.bX().bg();
        this.iR = bgVarBg;
        com.bytedance.adsdk.IL.bg.IL.bg<android.graphics.PointF, android.graphics.PointF> bgVarBg2 = eoVar.eqN().bg();
        this.Kg = bgVarBg2;
        com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Float, java.lang.Float> bgVarBg3 = eoVar.zx().bg();
        this.WR = bgVarBg3;
        com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Float, java.lang.Float> bgVarBg4 = eoVar.iR().bg();
        this.VB = bgVarBg4;
        com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Float, java.lang.Float> bgVarBg5 = eoVar.WR().bg();
        this.Ta = bgVarBg5;
        if (bgVarIL == com.bytedance.adsdk.IL.bX.IL.eo.bg.STAR) {
            this.eo = eoVar.ldr().bg();
            this.PX = eoVar.Kg().bg();
        } else {
            this.eo = null;
            this.PX = null;
        }
        bgVar.bg(bgVarBg);
        bgVar.bg(bgVarBg2);
        bgVar.bg(bgVarBg3);
        bgVar.bg(bgVarBg4);
        bgVar.bg(bgVarBg5);
        if (bgVarIL == com.bytedance.adsdk.IL.bX.IL.eo.bg.STAR) {
            bgVar.bg(this.eo);
            bgVar.bg(this.PX);
        }
        bgVarBg.bg(this);
        bgVarBg2.bg(this);
        bgVarBg3.bg(this);
        bgVarBg4.bg(this);
        bgVarBg5.bg(this);
        if (bgVarIL == com.bytedance.adsdk.IL.bX.IL.eo.bg.STAR) {
            this.eo.bg(this);
            this.PX.bg(this);
        }
    }

    @Override // com.bytedance.adsdk.IL.bg.IL.bg.InterfaceC0076bg
    public void bg() {
        IL();
    }

    private void IL() {
        this.Lq = false;
        this.bX.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.IL.bg.bg.bX
    public void bg(java.util.List<com.bytedance.adsdk.IL.bg.bg.bX> list, java.util.List<com.bytedance.adsdk.IL.bg.bg.bX> list2) {
        for (int i = 0; i < list.size(); i++) {
            com.bytedance.adsdk.IL.bg.bg.bX bXVar = list.get(i);
            if (bXVar instanceof com.bytedance.adsdk.IL.bg.bg.tC) {
                com.bytedance.adsdk.IL.bg.bg.tC tCVar = (com.bytedance.adsdk.IL.bg.bg.tC) bXVar;
                if (tCVar.IL() == com.bytedance.adsdk.IL.bX.IL.Fy.bg.SIMULTANEOUSLY) {
                    this.yDt.bg(tCVar);
                    tCVar.bg(this);
                }
            }
        }
    }

    @Override // com.bytedance.adsdk.IL.bg.bg.Ta
    public android.graphics.Path eqN() {
        if (this.Lq) {
            return this.bg;
        }
        this.bg.reset();
        if (this.zx) {
            this.Lq = true;
            return this.bg;
        }
        int i = com.bytedance.adsdk.IL.bg.bg.yDt.AnonymousClass1.bg[this.eqN.ordinal()];
        if (i == 1) {
            bX();
        } else if (i == 2) {
            zx();
        }
        this.bg.close();
        this.yDt.bg(this.bg);
        this.Lq = true;
        return this.bg;
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.IL.bg.bg.yDt$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] bg;

        static {
            int[] iArr = new int[com.bytedance.adsdk.IL.bX.IL.eo.bg.values().length];
            bg = iArr;
            try {
                iArr[com.bytedance.adsdk.IL.bX.IL.eo.bg.STAR.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                bg[com.bytedance.adsdk.IL.bX.IL.eo.bg.POLYGON.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    private void bX() {
        float f;
        float f2;
        double d;
        float fSin;
        float f3;
        float f4;
        float f5;
        float fFloatValue = this.iR.iR().floatValue();
        com.bytedance.adsdk.IL.bg.IL.bg<?, java.lang.Float> bgVar = this.WR;
        double radians = java.lang.Math.toRadians((bgVar == null ? 0.0d : bgVar.iR().floatValue()) - 90.0d);
        double d2 = fFloatValue;
        float f6 = (float) (6.283185307179586d / d2);
        if (this.ldr) {
            f6 *= -1.0f;
        }
        float f7 = f6 / 2.0f;
        float f8 = fFloatValue - ((int) fFloatValue);
        if (f8 != 0.0f) {
            radians += (double) ((1.0f - f8) * f7);
        }
        float fFloatValue2 = this.VB.iR().floatValue();
        float fFloatValue3 = this.eo.iR().floatValue();
        com.bytedance.adsdk.IL.bg.IL.bg<?, java.lang.Float> bgVar2 = this.PX;
        float fFloatValue4 = bgVar2 != null ? bgVar2.iR().floatValue() / 100.0f : 0.0f;
        com.bytedance.adsdk.IL.bg.IL.bg<?, java.lang.Float> bgVar3 = this.Ta;
        float fFloatValue5 = bgVar3 != null ? bgVar3.iR().floatValue() / 100.0f : 0.0f;
        if (f8 != 0.0f) {
            f3 = ((fFloatValue2 - fFloatValue3) * f8) + fFloatValue3;
            double d3 = f3;
            float fCos = (float) (d3 * java.lang.Math.cos(radians));
            fSin = (float) (d3 * java.lang.Math.sin(radians));
            this.bg.moveTo(fCos, fSin);
            d = radians + ((double) ((f6 * f8) / 2.0f));
            f = fCos;
            f2 = f7;
        } else {
            double d4 = fFloatValue2;
            float fCos2 = (float) (java.lang.Math.cos(radians) * d4);
            float fSin2 = (float) (d4 * java.lang.Math.sin(radians));
            this.bg.moveTo(fCos2, fSin2);
            f = fCos2;
            f2 = f7;
            d = radians + ((double) f2);
            fSin = fSin2;
            f3 = 0.0f;
        }
        double dCeil = java.lang.Math.ceil(d2) * 2.0d;
        int i = 0;
        float f9 = f2;
        float f10 = f;
        boolean z = false;
        while (true) {
            double d5 = i;
            if (d5 < dCeil) {
                float f11 = z ? fFloatValue2 : fFloatValue3;
                float f12 = (f3 == 0.0f || d5 != dCeil - 2.0d) ? f9 : (f6 * f8) / 2.0f;
                if (f3 == 0.0f || d5 != dCeil - 1.0d) {
                    f3 = f11;
                }
                double d6 = f3;
                double d7 = dCeil;
                float fCos3 = (float) (d6 * java.lang.Math.cos(d));
                float fSin3 = (float) (d6 * java.lang.Math.sin(d));
                if (fFloatValue4 == 0.0f && fFloatValue5 == 0.0f) {
                    this.bg.lineTo(fCos3, fSin3);
                    f4 = fFloatValue4;
                    f5 = fFloatValue5;
                } else {
                    f4 = fFloatValue4;
                    double dAtan2 = (float) (java.lang.Math.atan2(fSin, f10) - 1.5707963267948966d);
                    float fCos4 = (float) java.lang.Math.cos(dAtan2);
                    float fSin4 = (float) java.lang.Math.sin(dAtan2);
                    f5 = fFloatValue5;
                    double dAtan3 = (float) (java.lang.Math.atan2(fSin3, fCos3) - 1.5707963267948966d);
                    float fCos5 = (float) java.lang.Math.cos(dAtan3);
                    float fSin5 = (float) java.lang.Math.sin(dAtan3);
                    float f13 = z ? f4 : f5;
                    float f14 = z ? f5 : f4;
                    float f15 = (z ? fFloatValue3 : fFloatValue2) * f13 * 0.47829f;
                    float f16 = fCos4 * f15;
                    float f17 = f15 * fSin4;
                    float f18 = (z ? fFloatValue2 : fFloatValue3) * f14 * 0.47829f;
                    float f19 = fCos5 * f18;
                    float f20 = f18 * fSin5;
                    if (f8 != 0.0f) {
                        if (i == 0) {
                            f16 *= f8;
                            f17 *= f8;
                        } else if (d5 == d7 - 1.0d) {
                            f19 *= f8;
                            f20 *= f8;
                        }
                    }
                    this.bg.cubicTo(f10 - f16, fSin - f17, fCos3 + f19, fSin3 + f20, fCos3, fSin3);
                }
                d += (double) f12;
                z = !z;
                i++;
                f10 = fCos3;
                fSin = fSin3;
                fFloatValue5 = f5;
                fFloatValue4 = f4;
                f3 = f3;
                f6 = f6;
                dCeil = d7;
            } else {
                android.graphics.PointF pointFIR = this.Kg.iR();
                this.bg.offset(pointFIR.x, pointFIR.y);
                this.bg.close();
                return;
            }
        }
    }

    private void zx() {
        int iFloor = (int) java.lang.Math.floor(this.iR.iR().floatValue());
        com.bytedance.adsdk.IL.bg.IL.bg<?, java.lang.Float> bgVar = this.WR;
        double radians = java.lang.Math.toRadians((bgVar == null ? 0.0d : bgVar.iR().floatValue()) - 90.0d);
        double d = iFloor;
        float fFloatValue = this.Ta.iR().floatValue() / 100.0f;
        float fFloatValue2 = this.VB.iR().floatValue();
        double d2 = fFloatValue2;
        float fCos = (float) (java.lang.Math.cos(radians) * d2);
        float fSin = (float) (java.lang.Math.sin(radians) * d2);
        this.bg.moveTo(fCos, fSin);
        double d3 = (float) (6.283185307179586d / d);
        double d4 = radians + d3;
        double dCeil = java.lang.Math.ceil(d);
        int i = 0;
        while (i < dCeil) {
            float fCos2 = (float) (java.lang.Math.cos(d4) * d2);
            double d5 = dCeil;
            float fSin2 = (float) (d2 * java.lang.Math.sin(d4));
            if (fFloatValue != 0.0f) {
                double dAtan2 = (float) (java.lang.Math.atan2(fSin, fCos) - 1.5707963267948966d);
                float fCos3 = (float) java.lang.Math.cos(dAtan2);
                float fSin3 = (float) java.lang.Math.sin(dAtan2);
                double dAtan3 = (float) (java.lang.Math.atan2(fSin2, fCos2) - 1.5707963267948966d);
                float f = fFloatValue2 * fFloatValue * 0.25f;
                this.bg.cubicTo(fCos - (fCos3 * f), fSin - (fSin3 * f), fCos2 + (((float) java.lang.Math.cos(dAtan3)) * f), fSin2 + (f * ((float) java.lang.Math.sin(dAtan3))), fCos2, fSin2);
            } else {
                this.bg.lineTo(fCos2, fSin2);
            }
            d4 += d3;
            i++;
            fSin = fSin2;
            fCos = fCos2;
            dCeil = d5;
            d2 = d2;
            d3 = d3;
        }
        android.graphics.PointF pointFIR = this.Kg.iR();
        this.bg.offset(pointFIR.x, pointFIR.y);
        this.bg.close();
    }
}

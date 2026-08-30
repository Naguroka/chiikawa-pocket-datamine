package com.bytedance.sdk.component.adexpress.dynamic.zx;

/* JADX INFO: loaded from: classes3.dex */
public class zx {
    protected com.bytedance.sdk.component.adexpress.dynamic.zx.IL IL;
    private com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg bX;
    public com.bytedance.sdk.component.adexpress.dynamic.eqN.IL bg;
    private com.bytedance.sdk.component.adexpress.dynamic.zx.zx.bg eqN;

    static class bg {
        float IL;
        float bX;
        float bg;

        bg() {
        }
    }

    public zx(double d, int i, double d2, java.lang.String str, com.bytedance.sdk.component.adexpress.IL.Ta ta) {
        this.IL = new com.bytedance.sdk.component.adexpress.dynamic.zx.IL(d, i, d2, str, ta);
    }

    public void bg(com.bytedance.sdk.component.adexpress.dynamic.zx.zx.bg bgVar) {
        this.eqN = bgVar;
    }

    public void bg() {
        this.IL.bg();
    }

    public void bg(com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg, float f, float f2) {
        if (kg != null) {
            this.bX = kg;
        }
        com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg2 = this.bX;
        float fKg = kg2.Kg();
        float fWR = kg2.WR();
        float f3 = android.text.TextUtils.equals(kg2.eo().zx().Uw(), "fixed") ? fWR : 65536.0f;
        this.IL.bg();
        this.IL.bX(kg2, fKg, f3);
        com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX bXVarBg = this.IL.bg(kg2);
        com.bytedance.sdk.component.adexpress.dynamic.eqN.IL il = new com.bytedance.sdk.component.adexpress.dynamic.eqN.IL();
        il.bg = f;
        il.IL = f2;
        if (bXVarBg != null) {
            fKg = bXVarBg.bg;
        }
        il.bX = fKg;
        if (bXVarBg != null) {
            fWR = bXVarBg.IL;
        }
        il.eqN = fWR;
        il.zx = "root";
        il.WR = 1280.0f;
        il.ldr = kg2;
        il.ldr.bX(il.bg);
        il.ldr.eqN(il.IL);
        il.ldr.zx(il.bX);
        il.ldr.ldr(il.eqN);
        com.bytedance.sdk.component.adexpress.dynamic.eqN.IL ilBg = bg(il, 0.0f);
        this.bg = ilBg;
        bg(ilBg);
    }

    public void bg(com.bytedance.sdk.component.adexpress.dynamic.eqN.IL il) {
        if (il == null) {
            return;
        }
        il.ldr.eo().IL();
        float f = il.bX;
        float f2 = il.eqN;
        float f3 = il.bg;
        float f4 = il.IL;
        java.util.List<java.util.List<com.bytedance.sdk.component.adexpress.dynamic.eqN.IL>> list = il.iR;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (java.util.List<com.bytedance.sdk.component.adexpress.dynamic.eqN.IL> list2 : list) {
            if (list2 != null && list2.size() > 0) {
                java.util.Iterator<com.bytedance.sdk.component.adexpress.dynamic.eqN.IL> it = list2.iterator();
                while (it.hasNext()) {
                    bg(it.next());
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:137:0x031c  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ed  */
    public com.bytedance.sdk.component.adexpress.dynamic.eqN.IL bg(com.bytedance.sdk.component.adexpress.dynamic.eqN.IL il, float f) {
        float fBg;
        float fBg2;
        float f2;
        float fBg3;
        float fBg4;
        com.bytedance.sdk.component.adexpress.dynamic.eqN.IL il2;
        com.bytedance.sdk.component.adexpress.dynamic.eqN.WR wrBg;
        float f3;
        com.bytedance.sdk.component.adexpress.dynamic.eqN.WR wr;
        com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX bXVarBg;
        com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX bXVarBg2;
        com.bytedance.sdk.component.adexpress.dynamic.eqN.IL il3 = il;
        com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg = il3.ldr;
        if (kg == null) {
            return il3;
        }
        kg.LZ();
        java.util.List<java.util.List<com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg>> listXxp = kg.xxp();
        if (listXxp == null || listXxp.size() <= 0) {
            return il3;
        }
        com.bytedance.sdk.component.adexpress.dynamic.eqN.ldr ldrVarZx = kg.eo().zx();
        float fXxp = ldrVarZx.xxp();
        float fVb = ldrVarZx.vb();
        float fYDt = ldrVarZx.yDt();
        float fLq = ldrVarZx.Lq();
        float fPX = ldrVarZx.PX();
        java.lang.String strQC = ldrVarZx.qC();
        java.lang.String strDxa = ldrVarZx.Dxa();
        float f4 = il3.bg + fLq;
        float f5 = il3.IL + fXxp;
        float f6 = fPX * 2.0f;
        float f7 = ((il3.bX - fLq) - fVb) - f6;
        float f8 = ((il3.eqN - fXxp) - fYDt) - f6;
        com.bytedance.sdk.component.adexpress.dynamic.eqN.WR wr2 = new com.bytedance.sdk.component.adexpress.dynamic.eqN.WR(f4, f5);
        if (il3.iR == null) {
            il3.iR = new java.util.ArrayList();
        }
        java.util.Iterator<java.util.List<com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg>> it = listXxp.iterator();
        float f9 = 0.0f;
        while (it.hasNext()) {
            com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX bXVarBg3 = this.IL.bg(it.next());
            if (bXVarBg3 != null) {
                f9 += bXVarBg3.IL;
            }
        }
        java.lang.String str = "space-between";
        java.lang.String str2 = "space-around";
        if (f9 >= f8) {
            fBg = 0.0f;
            fBg2 = 0.0f;
        } else {
            if (android.text.TextUtils.equals(strDxa, androidx.media3.extractor.text.ttml.TtmlNode.CENTER)) {
                fBg2 = (f8 - f9) / 2.0f;
            } else if (android.text.TextUtils.equals(strDxa, "flex-end")) {
                fBg2 = f8 - f9;
            } else if (android.text.TextUtils.equals(strDxa, "space-around")) {
                fBg2 = com.bytedance.sdk.component.adexpress.dynamic.zx.eo.bg((f8 - f9) / (listXxp.size() + 1));
                fBg = fBg2;
            } else {
                if (!android.text.TextUtils.equals(strDxa, "space-between") || listXxp.size() <= 1) {
                    fBg = 0.0f;
                } else {
                    fBg = com.bytedance.sdk.component.adexpress.dynamic.zx.eo.bg((f8 - f9) / (listXxp.size() - 1));
                }
                fBg2 = 0.0f;
            }
            fBg = 0.0f;
        }
        wr2.IL += fBg2;
        float f10 = f;
        int i = 0;
        while (i < listXxp.size()) {
            java.util.List<com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg> list = listXxp.get(i);
            i++;
            if (i >= il3.iR.size()) {
                int size = (i - il3.iR.size()) + 1;
                int i2 = 0;
                while (i2 < size) {
                    il3.iR.add(new java.util.ArrayList());
                    i2++;
                    size = size;
                    f10 = f10;
                }
            }
            float f11 = f10;
            java.util.Iterator<com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg> it2 = list.iterator();
            float f12 = 0.0f;
            while (true) {
                f2 = fBg;
                if (!it2.hasNext()) {
                    break;
                }
                com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg next = it2.next();
                com.bytedance.sdk.component.adexpress.dynamic.eqN.ldr ldrVarZx2 = next.eo().zx();
                java.lang.String strDDQ = ldrVarZx2.DDQ();
                java.util.Iterator<com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg> it3 = it2;
                int iBCU = ldrVarZx2.bCU();
                if (!android.text.TextUtils.equals(strDDQ, "flex") && iBCU != 1 && iBCU != 2 && (bXVarBg2 = this.IL.bg(next)) != null) {
                    f12 += bXVarBg2.bg;
                }
                fBg = f2;
                it2 = it3;
            }
            float fMax = java.lang.Math.max(f7 - f12, 0.0f);
            java.util.Iterator<com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg> it4 = list.iterator();
            float f13 = 0.0f;
            while (it4.hasNext()) {
                com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg next2 = it4.next();
                com.bytedance.sdk.component.adexpress.dynamic.eqN.ldr ldrVarZx3 = next2.eo().zx();
                java.util.Iterator<com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg> it5 = it4;
                if (ldrVarZx3.bCU() != 1 && ldrVarZx3.bCU() != 2 && (bXVarBg = this.IL.bg(next2)) != null) {
                    f13 += bXVarBg.bg;
                }
                it4 = it5;
            }
            if (f13 >= f7) {
                fBg3 = 0.0f;
                fBg4 = 0.0f;
            } else {
                if (android.text.TextUtils.equals(strQC, androidx.media3.extractor.text.ttml.TtmlNode.CENTER)) {
                    fBg3 = (f7 - f13) / 2.0f;
                } else if (android.text.TextUtils.equals(strQC, "flex-end")) {
                    fBg3 = f7 - f13;
                } else if (android.text.TextUtils.equals(strQC, str2)) {
                    fBg3 = com.bytedance.sdk.component.adexpress.dynamic.zx.eo.bg((f7 - f13) / (list.size() + 1));
                    fBg4 = fBg3;
                } else if (!android.text.TextUtils.equals(strQC, str) || list.size() <= 1) {
                    fBg3 = 0.0f;
                } else {
                    fBg4 = com.bytedance.sdk.component.adexpress.dynamic.zx.eo.bg((f7 - f13) / (list.size() - 1.0f));
                    fBg3 = 0.0f;
                }
                fBg4 = 0.0f;
            }
            wr2.bg += fBg3;
            java.util.Iterator<com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg> it6 = list.iterator();
            float fMax2 = 0.0f;
            while (it6.hasNext()) {
                com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg next3 = it6.next();
                java.util.Iterator<com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg> it7 = it6;
                float f14 = this.IL.bg(next3) != null ? this.IL.bg(next3).IL : 0.0f;
                com.bytedance.sdk.component.adexpress.dynamic.eqN.ldr ldrVarZx4 = next3.eo().zx();
                java.lang.String str3 = str;
                fMax2 = java.lang.Math.max(fMax2, (ldrVarZx4.bCU() == 1 || ldrVarZx4.bCU() == 2) ? 0.0f : f14);
                it6 = it7;
                str = str3;
            }
            java.lang.String str4 = str;
            java.util.Iterator<com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg> it8 = list.iterator();
            f10 = f11;
            while (it8.hasNext()) {
                com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg next4 = it8.next();
                java.util.Iterator<com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg> it9 = it8;
                com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX bXVarBg4 = this.IL.bg(next4);
                java.lang.String str5 = strQC;
                com.bytedance.sdk.component.adexpress.dynamic.eqN.ldr ldrVarZx5 = next4.eo().zx();
                float f15 = f10;
                float fPae = ldrVarZx5.Pae();
                float f16 = f7;
                float fSVc = ldrVarZx5.sVc();
                java.lang.String str6 = str2;
                float fRJ = ldrVarZx5.RJ();
                float f17 = fBg4;
                float fTxA = ldrVarZx5.txA();
                com.bytedance.sdk.component.adexpress.dynamic.eqN.WR wr3 = wr2;
                float f18 = bXVarBg4 == null ? 0.0f : bXVarBg4.bg;
                float f19 = bXVarBg4 == null ? 0.0f : bXVarBg4.IL;
                com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg2 = kg;
                float f20 = android.text.TextUtils.equals(kg.bX(), "root") ? i : f15;
                int i3 = i;
                if (ldrVarZx5.bCU() == 1) {
                    il2 = il;
                    wrBg = bg(il2, ldrVarZx5, (f18 - fSVc) - fTxA, (f19 - fPae) - fRJ);
                } else {
                    il2 = il;
                    wrBg = wr3;
                }
                com.bytedance.sdk.component.adexpress.dynamic.eqN.WR wrBg2 = ldrVarZx5.bCU() == 2 ? bg(ldrVarZx5, this.IL.bg(this.bX), new com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX((f18 - fSVc) - fTxA, (f19 - fPae) - fRJ)) : wrBg;
                java.lang.String strHff = ldrVarZx.hff();
                if (fMax2 <= f19 || android.text.TextUtils.equals(strHff, "flex-start")) {
                    f3 = 0.0f;
                } else {
                    strHff.hashCode();
                    if (strHff.equals(androidx.media3.extractor.text.ttml.TtmlNode.CENTER)) {
                        f3 = (fMax2 - f19) / 2.0f;
                    } else if (strHff.equals("flex-end")) {
                        f3 = fMax2 - f19;
                    } else {
                        f3 = 0.0f;
                    }
                }
                com.bytedance.sdk.component.adexpress.dynamic.eqN.IL il4 = new com.bytedance.sdk.component.adexpress.dynamic.eqN.IL();
                il4.bg = wrBg2.bg + fTxA;
                il4.IL = wrBg2.IL + fPae + f3;
                il4.bX = (f18 - fSVc) - fTxA;
                il4.eqN = (f19 - fPae) - fRJ;
                il4.zx = il2.zx + "." + next4.bX();
                il4.Kg = il2;
                il4.ldr = next4;
                fMax = fMax;
                il4.WR = fMax;
                list = list;
                il4.eo = list;
                il4.ldr.bX(il4.bg);
                il4.ldr.eqN(il4.IL);
                il4.ldr.zx(il4.bX);
                il4.ldr.ldr(il4.eqN);
                float f21 = f20;
                com.bytedance.sdk.component.adexpress.dynamic.eqN.IL ilBg = bg(il4, f21);
                i = i3;
                il2.iR.get(i).add(ilBg);
                if (ldrVarZx5.bCU() == 1) {
                    wr = wr3;
                } else if (ldrVarZx5.bCU() != 2) {
                    wr = wr3;
                    wr.bg += f18 + f17;
                } else {
                    wr = wr3;
                }
                f10 = f21;
                wr2 = wr;
                it8 = it9;
                strQC = str5;
                f7 = f16;
                str2 = str6;
                fBg4 = f17;
                kg = kg2;
            }
            com.bytedance.sdk.component.adexpress.dynamic.eqN.WR wr4 = wr2;
            wr4.bg = f4;
            wr4.IL += fMax2 + f2;
            il3 = il;
            listXxp = listXxp;
            fBg = f2;
            str = str4;
            kg = kg;
        }
        return il3;
    }

    private com.bytedance.sdk.component.adexpress.dynamic.eqN.WR bg(com.bytedance.sdk.component.adexpress.dynamic.eqN.ldr ldrVar, com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX bXVar, com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX bXVar2) {
        float fQp = ldrVar.qp();
        float fRFq = ldrVar.RFq();
        float fEDa = ldrVar.eDa();
        float fJA = ldrVar.jA();
        boolean zWS = ldrVar.wS();
        boolean zCZH = ldrVar.cZH();
        boolean zZCS = ldrVar.zCS();
        boolean zYs = ldrVar.Ys();
        if (!zWS) {
            if (zCZH) {
                fQp = ((this.eqN.bg != 0.0f ? java.lang.Math.min(this.eqN.bg, bXVar.bg) : bXVar.bg) - fEDa) - bXVar2.bg;
            } else {
                fQp = 0.0f;
            }
        }
        if (!zZCS) {
            if (zYs) {
                fRFq = ((this.eqN.IL != 0.0f ? this.eqN.IL : bXVar.IL) - fJA) - bXVar2.IL;
            } else {
                fRFq = 0.0f;
            }
        }
        return new com.bytedance.sdk.component.adexpress.dynamic.eqN.WR(fQp, fRFq);
    }

    private com.bytedance.sdk.component.adexpress.dynamic.eqN.WR bg(com.bytedance.sdk.component.adexpress.dynamic.eqN.IL il, com.bytedance.sdk.component.adexpress.dynamic.eqN.ldr ldrVar, float f, float f2) {
        float f3;
        float f4;
        float f5 = il.bg;
        float f6 = il.IL;
        float fQp = ldrVar.qp();
        float fRFq = ldrVar.RFq();
        float fEDa = ldrVar.eDa();
        float fJA = ldrVar.jA();
        boolean zWS = ldrVar.wS();
        boolean zCZH = ldrVar.cZH();
        boolean zZCS = ldrVar.zCS();
        boolean zYs = ldrVar.Ys();
        java.lang.String strLd = ldrVar.Ld();
        float f7 = il.bX;
        float f8 = il.eqN;
        if (android.text.TextUtils.equals(strLd, "0")) {
            if (zWS) {
                f5 = il.bg + fQp;
            } else if (zCZH) {
                f5 = ((il.bg + f7) - fEDa) - f;
            }
            if (zZCS) {
                f4 = il.IL;
                f6 = f4 + fRFq;
            } else if (zYs) {
                f3 = il.IL;
                f6 = ((f3 + f8) - fJA) - f2;
            }
        } else if (android.text.TextUtils.equals(strLd, "1")) {
            f5 = il.bg + ((f7 - f) / 2.0f);
            if (zZCS) {
                f4 = il.IL;
                f6 = f4 + fRFq;
            } else if (zYs) {
                f3 = il.IL;
                f6 = ((f3 + f8) - fJA) - f2;
            }
        } else if (android.text.TextUtils.equals(strLd, "2")) {
            f6 = il.IL + ((f8 - f2) / 2.0f);
            if (zWS) {
                f5 = il.bg + fQp;
            } else if (zCZH) {
                f5 = ((il.bg + f7) - fEDa) - f;
            }
        } else if (android.text.TextUtils.equals(strLd, androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D)) {
            f5 = il.bg + ((f7 - f) / 2.0f);
            f6 = il.IL + ((f8 - f2) / 2.0f);
        }
        return new com.bytedance.sdk.component.adexpress.dynamic.eqN.WR(f5, f6);
    }
}

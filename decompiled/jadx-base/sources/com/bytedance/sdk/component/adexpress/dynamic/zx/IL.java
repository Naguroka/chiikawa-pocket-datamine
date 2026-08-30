package com.bytedance.sdk.component.adexpress.dynamic.zx;

/* JADX INFO: loaded from: classes3.dex */
public class IL {
    private java.lang.String Kg;
    private com.bytedance.sdk.component.adexpress.IL.Ta WR;
    private double iR;
    private int ldr;
    private double zx;
    public java.util.Map<java.lang.String, com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX> bg = new java.util.HashMap();
    public java.util.Map<java.lang.String, com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX> IL = new java.util.HashMap();
    public java.util.Map<java.lang.String, com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX> bX = new java.util.HashMap();
    private double eqN = java.lang.Math.random();

    public IL(double d, int i, double d2, java.lang.String str, com.bytedance.sdk.component.adexpress.IL.Ta ta) {
        this.zx = d;
        this.ldr = i;
        this.iR = d2;
        this.Kg = str;
        this.WR = ta;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX bg(com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg, float f, float f2) {
        float f3;
        if (android.text.TextUtils.isEmpty(kg.eo().bX()) && kg.eo().zx().dS() == null) {
            return new com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX(0.0f, 0.0f);
        }
        if (android.text.TextUtils.equals(kg.eo().IL(), "creative-playable-bait")) {
            return new com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX(0.0f, 0.0f);
        }
        float fKg = kg.Kg();
        float fWR = kg.WR();
        com.bytedance.sdk.component.adexpress.dynamic.eqN.ldr ldrVarZx = kg.eo().zx();
        java.lang.String strDDQ = ldrVarZx.DDQ();
        java.lang.String strUw = ldrVarZx.Uw();
        float fTa = kg.Ta();
        float fYDt = kg.yDt();
        float fLq = kg.Lq();
        float fVb = kg.vb();
        if (android.text.TextUtils.equals(strDDQ, "fixed")) {
            f = java.lang.Math.min(fKg, f);
            if (android.text.TextUtils.equals(strUw, "auto")) {
                f3 = IL(kg, f - fLq, f2 - fVb).IL;
                fWR = f3 + fVb;
            }
        } else if (android.text.TextUtils.equals(strDDQ, "auto")) {
            com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX bXVarIL = IL(kg, f - fLq, f2 - fVb);
            f = bXVarIL.bg + fLq;
            if (android.text.TextUtils.equals(strUw, "auto")) {
                f3 = bXVarIL.IL;
                fWR = f3 + fVb;
            }
        } else if (!android.text.TextUtils.equals(strDDQ, "flex")) {
            f = fKg;
        } else if (android.text.TextUtils.equals(strUw, "auto")) {
            f3 = IL(kg, f - fLq, f2 - fVb).IL;
            fWR = f3 + fVb;
        }
        if (android.text.TextUtils.equals(strUw, "scale")) {
            float fRound = java.lang.Math.round((f - fTa) / fWR) + fYDt;
            if (fRound > f2) {
                f = java.lang.Math.round((f2 - fYDt) * fWR) + fTa;
            } else {
                f2 = fRound;
            }
        } else if (android.text.TextUtils.equals(strUw, "fixed")) {
            f2 = java.lang.Math.min(fWR + fYDt, f2);
        } else if (!android.text.TextUtils.equals(strUw, "flex")) {
            f2 = fWR;
        }
        com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX bXVar = new com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX();
        bXVar.bg = f;
        bXVar.IL = f2;
        return bXVar;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX IL(com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg, float f, float f2) {
        com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX bXVar = new com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX();
        if (kg.eo().zx() == null) {
            return bXVar;
        }
        com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX bXVarZx = zx(kg, f, f2);
        float f3 = bXVarZx.bg;
        float f4 = bXVarZx.IL;
        bXVar.bg = java.lang.Math.min(f3, f);
        bXVar.IL = java.lang.Math.min(f4, f2);
        return bXVar;
    }

    private com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX zx(com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg, float f, float f2) {
        java.lang.String str = kg.bX() + "_" + f + "_" + f2;
        if (this.bX.containsKey(str)) {
            return this.bX.get(str);
        }
        com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX bXVarLdr = ldr(kg, f, f2);
        this.bX.put(str, bXVarLdr);
        return bXVarLdr;
    }

    private com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX ldr(com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg, float f, float f2) {
        new com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX();
        com.bytedance.sdk.component.adexpress.dynamic.eqN.ldr ldrVarZx = kg.eo().zx();
        kg.eo().bX();
        ldrVarZx.lM();
        float fVzQ = ldrVarZx.VzQ();
        int iGvG = ldrVarZx.GvG();
        double dApA = ldrVarZx.ApA();
        int iGXn = ldrVarZx.gXn();
        boolean zBN = ldrVarZx.bN();
        boolean zGZ = ldrVarZx.GZ();
        int iJz = ldrVarZx.jz();
        com.bytedance.sdk.component.adexpress.dynamic.zx.IL.C0106IL c0106il = new com.bytedance.sdk.component.adexpress.dynamic.zx.IL.C0106IL();
        c0106il.bg = fVzQ;
        c0106il.IL = iGvG;
        c0106il.bX = iGXn;
        c0106il.eqN = dApA;
        c0106il.zx = f;
        return bg(kg.eo().bX(), c0106il, zBN, zGZ, iJz, kg);
    }

    private com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX bg(java.lang.String str, com.bytedance.sdk.component.adexpress.dynamic.zx.IL.C0106IL c0106il, boolean z, boolean z2, int i, com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg) {
        return com.bytedance.sdk.component.adexpress.dynamic.zx.VB.bg(str, kg.eo().IL(), com.bytedance.sdk.component.adexpress.dynamic.zx.IL.C0106IL.bg(c0106il).toString(), z, z2, i, kg, this.zx, this.ldr, this.iR, this.Kg, this.WR);
    }

    public com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX bX(com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg, float f, float f2) {
        if (kg == null) {
            return null;
        }
        com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX bXVarBg = bg(kg);
        if (bXVarBg != null && (bXVarBg.bg != 0.0f || bXVarBg.IL != 0.0f)) {
            return bXVarBg;
        }
        com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX bXVarEqN = eqN(kg, f, f2);
        bg(kg, bXVarEqN);
        return bXVarEqN;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX eqN(com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg, float f, float f2) {
        float fMin;
        com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX bXVar = new com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX();
        float f3 = 0.0f;
        if (f2 <= 0.0f || f <= 0.0f) {
            bXVar.bg = 0.0f;
            bXVar.IL = 0.0f;
            return bXVar;
        }
        if (kg.VzQ()) {
            return bg(kg, f, f2);
        }
        float fKg = kg.Kg();
        float fWR = kg.WR();
        float fLq = kg.Lq();
        float fVb = kg.vb();
        com.bytedance.sdk.component.adexpress.dynamic.eqN.ldr ldrVarZx = kg.eo().zx();
        java.lang.String strDDQ = ldrVarZx.DDQ();
        java.lang.String strUw = ldrVarZx.Uw();
        float fMin2 = ((android.text.TextUtils.equals(strDDQ, "flex") || android.text.TextUtils.equals(strDDQ, "auto")) ? f : java.lang.Math.min(fKg, f)) - fLq;
        if (android.text.TextUtils.equals(strUw, "scale")) {
            fMin = java.lang.Math.round(fMin2 / fWR) + fVb;
            if (fMin > f2) {
                fMin2 = java.lang.Math.round((f2 - fVb) * fWR);
            }
        } else {
            fMin = (android.text.TextUtils.equals(strUw, "auto") || android.text.TextUtils.equals(strUw, "flex")) ? f2 : java.lang.Math.min(fWR, f2);
        }
        float f4 = fMin - fVb;
        java.util.List<java.util.List<com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg>> listXxp = kg.xxp();
        java.util.Iterator<java.util.List<com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg>> it = listXxp.iterator();
        float fMax = 0.0f;
        float fMax2 = 0.0f;
        while (it.hasNext()) {
            java.util.Iterator<java.util.List<com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg>> it2 = it;
            java.util.List<com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg> next = it.next();
            com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX bXVar2 = bXVar;
            com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX bXVarIL = IL(next, fMin2, f4);
            if (IL(next)) {
                f3 += 1.0f;
            } else {
                fMax = java.lang.Math.max(fMax, bXVarIL.bg);
            }
            float f5 = f3;
            if (kg.eo().IL().equals("carousel")) {
                fMax2 = java.lang.Math.max(kg.WR(), bXVarIL.IL);
            } else {
                fMax2 += bXVarIL.IL;
            }
            bXVar = bXVar2;
            it = it2;
            f3 = f5;
        }
        com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX bXVar3 = bXVar;
        if (android.text.TextUtils.equals(strDDQ, "auto")) {
            if (f3 == listXxp.size()) {
                fMin2 = f;
            } else {
                for (java.util.List<com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg> list : listXxp) {
                    bX(list);
                    IL(list, fMax, f4);
                }
                fMin2 = fMax;
            }
        }
        if (android.text.TextUtils.equals(strUw, "auto")) {
            if (fMax2 <= f2) {
                f4 = fMax2;
            } else {
                bg(listXxp, fMin2, f4);
            }
        } else if ((android.text.TextUtils.equals(strUw, "fixed") || android.text.TextUtils.equals(strUw, "flex")) && f4 < fMax2) {
            bg(listXxp, fMin2, f4);
        }
        bXVar3.bg = java.lang.Math.min(fMin2 + fLq, f);
        bXVar3.IL = java.lang.Math.min(f4 + fVb, f2);
        return bXVar3;
    }

    private void bg(java.util.List<java.util.List<com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg>> list, float f, float f2) {
        if (list == null || list.size() <= 0) {
            return;
        }
        java.util.Iterator<java.util.List<com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg>> it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (bg(it.next(), false)) {
                z = true;
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.List<com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg> list2 : list) {
            com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bg bgVar = new com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bg();
            boolean zBg = bg(list2, !z);
            bgVar.bg = zBg ? 1.0f : IL(list2, f, f2).IL;
            bgVar.IL = !zBg;
            arrayList.add(bgVar);
        }
        java.util.List<com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bg> listBg = com.bytedance.sdk.component.adexpress.dynamic.zx.eo.bg(f2, arrayList);
        for (int i = 0; i < list.size(); i++) {
            if (((com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bg) arrayList.get(i)).bg != listBg.get(i).bg) {
                java.util.List<com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg> list3 = list.get(i);
                bX(list3);
                IL(list3, f, listBg.get(i).bg);
            }
        }
    }

    private boolean IL(java.util.List<com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg> list) {
        boolean z;
        java.util.List<java.util.List<com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg>> listXxp;
        java.util.Iterator<com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            if (android.text.TextUtils.equals(it.next().eo().zx().DDQ(), "flex")) {
                z = true;
                break;
            }
        }
        if (z) {
            return true;
        }
        while (true) {
            boolean z2 = false;
            for (com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg : list) {
                if (android.text.TextUtils.equals(kg.eo().zx().DDQ(), "auto") && (listXxp = kg.xxp()) != null) {
                    java.util.Iterator<java.util.List<com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg>> it2 = listXxp.iterator();
                    int i = 0;
                    while (true) {
                        if (it2.hasNext()) {
                            java.util.List<com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg> next = it2.next();
                            i++;
                            if (IL(next)) {
                                if (i == next.size()) {
                                    z2 = true;
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return z2;
        }
    }

    private com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX IL(java.util.List<com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg> list, float f, float f2) {
        com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX bXVarBg = bg(list);
        if (bXVarBg != null && (bXVarBg.bg != 0.0f || bXVarBg.IL != 0.0f)) {
            return bXVarBg;
        }
        com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX bXVarBX = bX(list, f, f2);
        bg(list, bXVarBX);
        return bXVarBX;
    }

    private com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX bX(java.util.List<com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg> list, float f, float f2) {
        float fMax;
        eqN(list);
        com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX bXVar = new com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg : list) {
            com.bytedance.sdk.component.adexpress.dynamic.eqN.ldr ldrVarZx = kg.eo().zx();
            if (ldrVarZx.bCU() == 1 || ldrVarZx.bCU() == 2) {
                arrayList.add(kg);
            }
            if (ldrVarZx.bCU() != 1 && ldrVarZx.bCU() != 2) {
                arrayList2.add(kg);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bX((com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg) it.next(), f, f2);
        }
        if (arrayList2.size() <= 0) {
            return bXVar;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator<com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg> it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(java.lang.Float.valueOf(bX(it2.next(), f, f2).bg));
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        int i = 0;
        while (true) {
            fMax = 0.0f;
            if (i >= arrayList2.size()) {
                break;
            }
            com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg2 = arrayList2.get(i);
            java.lang.String strDDQ = kg2.eo().zx().DDQ();
            float fKg = kg2.Kg();
            boolean zEquals = android.text.TextUtils.equals(strDDQ, "flex");
            if (android.text.TextUtils.equals(strDDQ, "auto")) {
                java.util.List<java.util.List<com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg>> listXxp = kg2.xxp();
                if (listXxp == null || listXxp.size() <= 0) {
                    zEquals = false;
                    break;
                }
                java.util.Iterator<java.util.List<com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg>> it3 = listXxp.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        zEquals = false;
                        break;
                    }
                    if (IL(it3.next())) {
                        zEquals = true;
                        break;
                    }
                }
            }
            com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bg bgVar = new com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bg();
            if (!zEquals) {
                fKg = ((java.lang.Float) arrayList3.get(i)).floatValue();
            }
            bgVar.bg = fKg;
            bgVar.IL = !zEquals;
            if (zEquals) {
                fMax = ((java.lang.Float) arrayList3.get(i)).floatValue();
            }
            bgVar.bX = fMax;
            arrayList4.add(bgVar);
            i++;
        }
        bg(arrayList4, f, arrayList2);
        java.util.List<com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bg> listBg = com.bytedance.sdk.component.adexpress.dynamic.zx.eo.bg(f, arrayList4);
        float f3 = 0.0f;
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            f3 += listBg.get(i2).bg;
            if (((java.lang.Float) arrayList3.get(i2)).floatValue() != listBg.get(i2).bg) {
                eqN(arrayList2.get(i2));
            }
        }
        java.util.Iterator<com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg> it4 = arrayList2.iterator();
        int i3 = 0;
        boolean z = false;
        while (it4.hasNext()) {
            i3++;
            if (!IL(it4.next())) {
                z = false;
                break;
            }
            if (i3 == arrayList2.size()) {
                z = true;
            }
        }
        fMax = z ? f2 : 0.0f;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg3 = arrayList2.get(i4);
            com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX bXVarBX = bX(kg3, listBg.get(i4).bg, f2);
            if (!IL(kg3)) {
                fMax = java.lang.Math.max(fMax, bXVarBX.IL);
            }
            arrayList5.add(bXVarBX);
        }
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        java.util.Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            arrayList6.add(java.lang.Float.valueOf(((com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX) it5.next()).IL));
        }
        if (!z) {
            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg4 = arrayList2.get(i5);
                if (IL(kg4) && ((java.lang.Float) arrayList6.get(i5)).floatValue() != fMax) {
                    eqN(kg4);
                    bX(kg4, listBg.get(i5).bg, fMax);
                }
            }
        }
        bXVar.bg = f3;
        bXVar.IL = fMax;
        return bXVar;
    }

    private boolean IL(com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg) {
        if (kg == null) {
            return false;
        }
        if (android.text.TextUtils.equals(kg.eo().zx().Uw(), "flex")) {
            return true;
        }
        return bX(kg);
    }

    private boolean bX(com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg) {
        java.util.List<java.util.List<com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg>> listXxp;
        if (!kg.VzQ() && android.text.TextUtils.equals(kg.eo().zx().Uw(), "auto") && (listXxp = kg.xxp()) != null && listXxp.size() > 0) {
            if (listXxp.size() == 1) {
                java.util.Iterator<com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg> it = listXxp.get(0).iterator();
                while (it.hasNext()) {
                    if (!IL(it.next())) {
                        return false;
                    }
                }
                return true;
            }
            java.util.Iterator<java.util.List<com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg>> it2 = listXxp.iterator();
            while (it2.hasNext()) {
                if (bg(it2.next(), true)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean bg(java.util.List<com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg> list, boolean z) {
        boolean z2;
        java.util.Iterator<com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z2 = false;
                break;
            }
            com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg next = it.next();
            com.bytedance.sdk.component.adexpress.dynamic.eqN.ldr ldrVarZx = next.eo().zx();
            java.lang.String strUw = ldrVarZx.Uw();
            if (android.text.TextUtils.equals(strUw, "flex") || (z && ((android.text.TextUtils.equals(ldrVarZx.DDQ(), "flex") && android.text.TextUtils.equals(ldrVarZx.Uw(), "scale") && com.bytedance.sdk.component.adexpress.dynamic.eqN.zx.bg.get(next.eo().IL()).intValue() == 7) || android.text.TextUtils.equals(strUw, "flex")))) {
                z2 = true;
                break;
            }
        }
        if (z2) {
            return true;
        }
        java.util.Iterator<com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg> it2 = list.iterator();
        while (it2.hasNext()) {
            if (bX(it2.next())) {
                return true;
            }
        }
        return false;
    }

    private void bg(java.util.List<com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bg> list, float f, java.util.List<com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg> list2) {
        float f2 = 0.0f;
        for (com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bg bgVar : list) {
            if (bgVar.IL) {
                f2 += bgVar.bg;
            }
        }
        if (f2 > f) {
            int i = 0;
            for (int i2 = 0; i2 < list2.size(); i2++) {
                if (list.get(i2).IL && list2.get(i2).tC()) {
                    i++;
                }
            }
            if (i > 0) {
                float fCeil = (float) (java.lang.Math.ceil(((f2 - f) / i) * 1000.0f) / 1000.0d);
                for (int i3 = 0; i3 < list2.size(); i3++) {
                    com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bg bgVar2 = list.get(i3);
                    if (bgVar2.IL && list2.get(i3).tC()) {
                        bgVar2.bg -= fCeil;
                    }
                }
            }
        }
    }

    public void bg() {
        this.bX.clear();
        this.bg.clear();
        this.IL.clear();
    }

    public com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX bg(com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg) {
        return this.bg.get(zx(kg));
    }

    public com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX bg(java.util.List<com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg> list) {
        return this.IL.get(eqN(list));
    }

    private void eqN(com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg) {
        this.bg.remove(zx(kg));
        java.util.List<java.util.List<com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg>> listXxp = kg.xxp();
        if (listXxp == null || listXxp.size() <= 0) {
            return;
        }
        java.util.Iterator<java.util.List<com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg>> it = listXxp.iterator();
        while (it.hasNext()) {
            bX(it.next());
        }
    }

    private void bX(java.util.List<com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.IL.remove(eqN(list));
        java.util.Iterator<com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg> it = list.iterator();
        while (it.hasNext()) {
            eqN(it.next());
        }
    }

    private java.lang.String zx(com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg) {
        return kg.bX();
    }

    private java.lang.String eqN(java.util.List<com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg> list) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            java.lang.String strBX = list.get(i).bX();
            if (i < list.size() - 1) {
                sb.append(strBX).append("-");
            } else {
                sb.append(strBX);
            }
        }
        return sb.toString();
    }

    private void bg(com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg, com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX bXVar) {
        this.bg.put(zx(kg), bXVar);
    }

    private void bg(java.util.List<com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg> list, com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bX bXVar) {
        this.IL.put(eqN(list), bXVar);
    }

    static class bX {
        float IL;
        float bg;

        public bX() {
        }

        public bX(float f, float f2) {
            this.bg = f;
            this.IL = f2;
        }

        public java.lang.String toString() {
            return "UnitSize{width=" + this.bg + ", height=" + this.IL + '}';
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.zx.IL$IL, reason: collision with other inner class name */
    static class C0106IL {
        int IL;
        int bX;
        float bg;
        double eqN;
        float zx;

        C0106IL() {
        }

        static org.json.JSONObject bg(com.bytedance.sdk.component.adexpress.dynamic.zx.IL.C0106IL c0106il) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put(androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_FONT_SIZE, c0106il.bg);
                jSONObject.put("letterSpacing", c0106il.IL);
                jSONObject.put("lineHeight", c0106il.eqN);
                jSONObject.put("maxWidth", c0106il.zx);
                jSONObject.put(androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_FONT_WEIGHT, c0106il.bX);
            } catch (org.json.JSONException unused) {
            }
            return jSONObject;
        }
    }

    static class bg implements java.lang.Cloneable {
        boolean IL;
        float bX;
        float bg;

        bg() {
        }

        public java.lang.Object clone() {
            try {
                return (com.bytedance.sdk.component.adexpress.dynamic.zx.IL.bg) super.clone();
            } catch (java.lang.CloneNotSupportedException unused) {
                return null;
            }
        }
    }
}

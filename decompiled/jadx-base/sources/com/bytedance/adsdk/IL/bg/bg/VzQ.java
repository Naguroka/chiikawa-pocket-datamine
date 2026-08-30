package com.bytedance.adsdk.IL.bg.bg;

/* JADX INFO: loaded from: classes3.dex */
public class VzQ implements com.bytedance.adsdk.IL.bg.IL.bg.InterfaceC0076bg, com.bytedance.adsdk.IL.bg.bg.Fy {
    private final java.lang.String IL;
    private final com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Float, java.lang.Float> bX;
    private final com.bytedance.adsdk.IL.WR bg;
    private com.bytedance.adsdk.IL.bX.IL.yDt eqN;

    @Override // com.bytedance.adsdk.IL.bg.bg.bX
    public void bg(java.util.List<com.bytedance.adsdk.IL.bg.bg.bX> list, java.util.List<com.bytedance.adsdk.IL.bg.bg.bX> list2) {
    }

    public VzQ(com.bytedance.adsdk.IL.WR wr, com.bytedance.adsdk.IL.bX.bX.bg bgVar, com.bytedance.adsdk.IL.bX.IL.Ta ta) {
        this.bg = wr;
        this.IL = ta.bg();
        com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Float, java.lang.Float> bgVarBg = ta.IL().bg();
        this.bX = bgVarBg;
        bgVar.bg(bgVarBg);
        bgVarBg.bg(this);
    }

    @Override // com.bytedance.adsdk.IL.bg.IL.bg.InterfaceC0076bg
    public void bg() {
        this.bg.invalidateSelf();
    }

    public com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Float, java.lang.Float> IL() {
        return this.bX;
    }

    @Override // com.bytedance.adsdk.IL.bg.bg.Fy
    public com.bytedance.adsdk.IL.bX.IL.yDt bg(com.bytedance.adsdk.IL.bX.IL.yDt ydt) {
        java.util.List<com.bytedance.adsdk.IL.bX.bg> listBX = ydt.bX();
        if (listBX.size() <= 2) {
            return ydt;
        }
        float fFloatValue = this.bX.iR().floatValue();
        if (fFloatValue == 0.0f) {
            return ydt;
        }
        com.bytedance.adsdk.IL.bX.IL.yDt ydtIL = IL(ydt);
        ydtIL.bg(ydt.bg().x, ydt.bg().y);
        java.util.List<com.bytedance.adsdk.IL.bX.bg> listBX2 = ydtIL.bX();
        boolean zIL = ydt.IL();
        int i = 0;
        int i2 = 0;
        while (i < listBX.size()) {
            com.bytedance.adsdk.IL.bX.bg bgVar = listBX.get(i);
            com.bytedance.adsdk.IL.bX.bg bgVar2 = listBX.get(bg(i - 1, listBX.size()));
            com.bytedance.adsdk.IL.bX.bg bgVar3 = listBX.get(bg(i - 2, listBX.size()));
            android.graphics.PointF pointFBX = (i != 0 || zIL) ? bgVar2.bX() : ydt.bg();
            android.graphics.PointF pointFIL = (i != 0 || zIL) ? bgVar2.IL() : pointFBX;
            android.graphics.PointF pointFBg = bgVar.bg();
            android.graphics.PointF pointFBX2 = bgVar3.bX();
            android.graphics.PointF pointFBX3 = bgVar.bX();
            boolean z = !ydt.IL() && i == 0 && i == listBX.size() + (-1);
            if (pointFIL.equals(pointFBX) && pointFBg.equals(pointFBX) && !z) {
                float f = pointFBX.x - pointFBX2.x;
                float f2 = pointFBX.y - pointFBX2.y;
                float f3 = pointFBX3.x - pointFBX.x;
                float f4 = pointFBX3.y - pointFBX.y;
                float fHypot = (float) java.lang.Math.hypot(f, f2);
                float fHypot2 = (float) java.lang.Math.hypot(f3, f4);
                float fMin = java.lang.Math.min(fFloatValue / fHypot, 0.5f);
                float fMin2 = java.lang.Math.min(fFloatValue / fHypot2, 0.5f);
                float f5 = pointFBX.x + ((pointFBX2.x - pointFBX.x) * fMin);
                float f6 = pointFBX.y + ((pointFBX2.y - pointFBX.y) * fMin);
                float f7 = pointFBX.x + ((pointFBX3.x - pointFBX.x) * fMin2);
                float f8 = pointFBX.y + ((pointFBX3.y - pointFBX.y) * fMin2);
                float f9 = f5 - ((f5 - pointFBX.x) * 0.5519f);
                float f10 = f6 - ((f6 - pointFBX.y) * 0.5519f);
                float f11 = f7 - ((f7 - pointFBX.x) * 0.5519f);
                float f12 = f8 - ((f8 - pointFBX.y) * 0.5519f);
                com.bytedance.adsdk.IL.bX.bg bgVar4 = listBX2.get(bg(i2 - 1, listBX2.size()));
                com.bytedance.adsdk.IL.bX.bg bgVar5 = listBX2.get(i2);
                bgVar4.IL(f5, f6);
                bgVar4.bX(f5, f6);
                if (i == 0) {
                    ydtIL.bg(f5, f6);
                }
                bgVar5.bg(f9, f10);
                i2++;
                com.bytedance.adsdk.IL.bX.bg bgVar6 = listBX2.get(i2);
                bgVar5.IL(f11, f12);
                bgVar5.bX(f7, f8);
                bgVar6.bg(f7, f8);
            } else {
                com.bytedance.adsdk.IL.bX.bg bgVar7 = listBX2.get(bg(i2 - 1, listBX2.size()));
                com.bytedance.adsdk.IL.bX.bg bgVar8 = listBX2.get(i2);
                bgVar7.IL(bgVar2.IL().x, bgVar2.IL().y);
                bgVar7.bX(bgVar2.bX().x, bgVar2.bX().y);
                bgVar8.bg(bgVar.bg().x, bgVar.bg().y);
            }
            i2++;
            i++;
            listBX = listBX;
            zIL = zIL;
        }
        return ydtIL;
    }

    private com.bytedance.adsdk.IL.bX.IL.yDt IL(com.bytedance.adsdk.IL.bX.IL.yDt ydt) {
        java.util.List<com.bytedance.adsdk.IL.bX.bg> listBX = ydt.bX();
        boolean zIL = ydt.IL();
        int size = listBX.size() - 1;
        int i = 0;
        while (size >= 0) {
            com.bytedance.adsdk.IL.bX.bg bgVar = listBX.get(size);
            com.bytedance.adsdk.IL.bX.bg bgVar2 = listBX.get(bg(size - 1, listBX.size()));
            android.graphics.PointF pointFBX = (size != 0 || zIL) ? bgVar2.bX() : ydt.bg();
            i = (((size != 0 || zIL) ? bgVar2.IL() : pointFBX).equals(pointFBX) && bgVar.bg().equals(pointFBX) && !(!ydt.IL() && size == 0 && size == listBX.size() - 1)) ? i + 2 : i + 1;
            size--;
        }
        com.bytedance.adsdk.IL.bX.IL.yDt ydt2 = this.eqN;
        if (ydt2 == null || ydt2.bX().size() != i) {
            java.util.ArrayList arrayList = new java.util.ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new com.bytedance.adsdk.IL.bX.bg());
            }
            this.eqN = new com.bytedance.adsdk.IL.bX.IL.yDt(new android.graphics.PointF(0.0f, 0.0f), false, arrayList);
        }
        this.eqN.bg(zIL);
        return this.eqN;
    }

    private static int bg(int i, int i2) {
        return i - (IL(i, i2) * i2);
    }

    private static int IL(int i, int i2) {
        int i3 = i / i2;
        return ((i ^ i2) >= 0 || i2 * i3 == i) ? i3 : i3 - 1;
    }
}

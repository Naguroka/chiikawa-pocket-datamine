package com.bytedance.adsdk.IL.bg.bg;

/* JADX INFO: loaded from: classes3.dex */
public class eqN implements com.bytedance.adsdk.IL.bg.IL.bg.InterfaceC0076bg, com.bytedance.adsdk.IL.bg.bg.Ta, com.bytedance.adsdk.IL.bg.bg.zx {
    private final android.graphics.RectF IL;
    private final java.util.List<com.bytedance.adsdk.IL.bg.bg.bX> Kg;
    private com.bytedance.adsdk.IL.bg.IL.xxp VB;
    private final com.bytedance.adsdk.IL.WR WR;
    private final android.graphics.Matrix bX;
    private final android.graphics.Paint bg;
    private java.util.List<com.bytedance.adsdk.IL.bg.bg.Ta> eo;
    private final android.graphics.Path eqN;
    private final boolean iR;
    private final java.lang.String ldr;
    private final android.graphics.RectF zx;

    private static java.util.List<com.bytedance.adsdk.IL.bg.bg.bX> bg(com.bytedance.adsdk.IL.WR wr, com.bytedance.adsdk.IL.iR iRVar, com.bytedance.adsdk.IL.bX.bX.bg bgVar, java.util.List<com.bytedance.adsdk.IL.bX.IL.bX> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            com.bytedance.adsdk.IL.bg.bg.bX bXVarBg = list.get(i).bg(wr, iRVar, bgVar);
            if (bXVarBg != null) {
                arrayList.add(bXVarBg);
            }
        }
        return arrayList;
    }

    static com.bytedance.adsdk.IL.bX.bg.PX bg(java.util.List<com.bytedance.adsdk.IL.bX.IL.bX> list) {
        for (int i = 0; i < list.size(); i++) {
            com.bytedance.adsdk.IL.bX.IL.bX bXVar = list.get(i);
            if (bXVar instanceof com.bytedance.adsdk.IL.bX.bg.PX) {
                return (com.bytedance.adsdk.IL.bX.bg.PX) bXVar;
            }
        }
        return null;
    }

    public eqN(com.bytedance.adsdk.IL.WR wr, com.bytedance.adsdk.IL.bX.bX.bg bgVar, com.bytedance.adsdk.IL.bX.IL.xxp xxpVar, com.bytedance.adsdk.IL.iR iRVar) {
        this(wr, bgVar, xxpVar.bg(), xxpVar.bX(), bg(wr, iRVar, bgVar, xxpVar.IL()), bg(xxpVar.IL()));
    }

    eqN(com.bytedance.adsdk.IL.WR wr, com.bytedance.adsdk.IL.bX.bX.bg bgVar, java.lang.String str, boolean z, java.util.List<com.bytedance.adsdk.IL.bg.bg.bX> list, com.bytedance.adsdk.IL.bX.bg.PX px) {
        this.bg = new com.bytedance.adsdk.IL.bg.bg();
        this.IL = new android.graphics.RectF();
        this.bX = new android.graphics.Matrix();
        this.eqN = new android.graphics.Path();
        this.zx = new android.graphics.RectF();
        this.ldr = str;
        this.WR = wr;
        this.iR = z;
        this.Kg = list;
        if (px != null) {
            com.bytedance.adsdk.IL.bg.IL.xxp xxpVarEo = px.eo();
            this.VB = xxpVarEo;
            xxpVarEo.bg(bgVar);
            this.VB.bg(this);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            com.bytedance.adsdk.IL.bg.bg.bX bXVar = list.get(size);
            if (bXVar instanceof com.bytedance.adsdk.IL.bg.bg.eo) {
                arrayList.add((com.bytedance.adsdk.IL.bg.bg.eo) bXVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((com.bytedance.adsdk.IL.bg.bg.eo) arrayList.get(size2)).bg(list.listIterator(list.size()));
        }
    }

    @Override // com.bytedance.adsdk.IL.bg.IL.bg.InterfaceC0076bg
    public void bg() {
        this.WR.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.IL.bg.bg.bX
    public void bg(java.util.List<com.bytedance.adsdk.IL.bg.bg.bX> list, java.util.List<com.bytedance.adsdk.IL.bg.bg.bX> list2) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size() + this.Kg.size());
        arrayList.addAll(list);
        for (int size = this.Kg.size() - 1; size >= 0; size--) {
            com.bytedance.adsdk.IL.bg.bg.bX bXVar = this.Kg.get(size);
            bXVar.bg(arrayList, this.Kg.subList(0, size));
            arrayList.add(bXVar);
        }
    }

    java.util.List<com.bytedance.adsdk.IL.bg.bg.Ta> IL() {
        if (this.eo == null) {
            this.eo = new java.util.ArrayList();
            for (int i = 0; i < this.Kg.size(); i++) {
                com.bytedance.adsdk.IL.bg.bg.bX bXVar = this.Kg.get(i);
                if (bXVar instanceof com.bytedance.adsdk.IL.bg.bg.Ta) {
                    this.eo.add((com.bytedance.adsdk.IL.bg.bg.Ta) bXVar);
                }
            }
        }
        return this.eo;
    }

    android.graphics.Matrix bX() {
        com.bytedance.adsdk.IL.bg.IL.xxp xxpVar = this.VB;
        if (xxpVar != null) {
            return xxpVar.eqN();
        }
        this.bX.reset();
        return this.bX;
    }

    @Override // com.bytedance.adsdk.IL.bg.bg.Ta
    public android.graphics.Path eqN() {
        this.bX.reset();
        com.bytedance.adsdk.IL.bg.IL.xxp xxpVar = this.VB;
        if (xxpVar != null) {
            this.bX.set(xxpVar.eqN());
        }
        this.eqN.reset();
        if (this.iR) {
            return this.eqN;
        }
        for (int size = this.Kg.size() - 1; size >= 0; size--) {
            com.bytedance.adsdk.IL.bg.bg.bX bXVar = this.Kg.get(size);
            if (bXVar instanceof com.bytedance.adsdk.IL.bg.bg.Ta) {
                this.eqN.addPath(((com.bytedance.adsdk.IL.bg.bg.Ta) bXVar).eqN(), this.bX);
            }
        }
        return this.eqN;
    }

    @Override // com.bytedance.adsdk.IL.bg.bg.zx
    public void bg(android.graphics.Canvas canvas, android.graphics.Matrix matrix, int i) {
        if (this.iR) {
            return;
        }
        this.bX.set(matrix);
        com.bytedance.adsdk.IL.bg.IL.xxp xxpVar = this.VB;
        if (xxpVar != null) {
            this.bX.preConcat(xxpVar.eqN());
            i = (int) (((((this.VB.bg() == null ? 100 : this.VB.bg().iR().intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        boolean z = this.WR.iR() && zx() && i != 255;
        if (z) {
            this.IL.set(0.0f, 0.0f, 0.0f, 0.0f);
            bg(this.IL, this.bX, true);
            this.bg.setAlpha(i);
            com.bytedance.adsdk.IL.ldr.ldr.bg(canvas, this.IL, this.bg);
        }
        if (z) {
            i = 255;
        }
        for (int size = this.Kg.size() - 1; size >= 0; size--) {
            com.bytedance.adsdk.IL.bg.bg.bX bXVar = this.Kg.get(size);
            if (bXVar instanceof com.bytedance.adsdk.IL.bg.bg.zx) {
                ((com.bytedance.adsdk.IL.bg.bg.zx) bXVar).bg(canvas, this.bX, i);
            }
        }
        if (z) {
            canvas.restore();
        }
    }

    private boolean zx() {
        int i = 0;
        for (int i2 = 0; i2 < this.Kg.size(); i2++) {
            if ((this.Kg.get(i2) instanceof com.bytedance.adsdk.IL.bg.bg.zx) && (i = i + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.adsdk.IL.bg.bg.zx
    public void bg(android.graphics.RectF rectF, android.graphics.Matrix matrix, boolean z) {
        this.bX.set(matrix);
        com.bytedance.adsdk.IL.bg.IL.xxp xxpVar = this.VB;
        if (xxpVar != null) {
            this.bX.preConcat(xxpVar.eqN());
        }
        this.zx.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.Kg.size() - 1; size >= 0; size--) {
            com.bytedance.adsdk.IL.bg.bg.bX bXVar = this.Kg.get(size);
            if (bXVar instanceof com.bytedance.adsdk.IL.bg.bg.zx) {
                ((com.bytedance.adsdk.IL.bg.bg.zx) bXVar).bg(this.zx, this.bX, z);
                rectF.union(this.zx);
            }
        }
    }
}

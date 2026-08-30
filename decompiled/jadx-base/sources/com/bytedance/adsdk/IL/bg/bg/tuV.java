package com.bytedance.adsdk.IL.bg.bg;

/* JADX INFO: loaded from: classes3.dex */
public class tuV implements com.bytedance.adsdk.IL.bg.IL.bg.InterfaceC0076bg, com.bytedance.adsdk.IL.bg.bg.Ta {
    private final java.lang.String IL;
    private final boolean bX;
    private final com.bytedance.adsdk.IL.WR eqN;
    private boolean ldr;
    private final com.bytedance.adsdk.IL.bg.IL.Ta zx;
    private final android.graphics.Path bg = new android.graphics.Path();
    private final com.bytedance.adsdk.IL.bg.bg.IL iR = new com.bytedance.adsdk.IL.bg.bg.IL();

    public tuV(com.bytedance.adsdk.IL.WR wr, com.bytedance.adsdk.IL.bX.bX.bg bgVar, com.bytedance.adsdk.IL.bX.IL.VzQ vzQ) {
        this.IL = vzQ.bg();
        this.bX = vzQ.bX();
        this.eqN = wr;
        com.bytedance.adsdk.IL.bg.IL.Ta taBg = vzQ.IL().bg();
        this.zx = taBg;
        bgVar.bg(taBg);
        taBg.bg(this);
    }

    @Override // com.bytedance.adsdk.IL.bg.IL.bg.InterfaceC0076bg
    public void bg() {
        IL();
    }

    private void IL() {
        this.ldr = false;
        this.eqN.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:12:0x002a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0036 A[SYNTHETIC] */
    @Override // com.bytedance.adsdk.IL.bg.bg.bX
    public void bg(java.util.List<com.bytedance.adsdk.IL.bg.bg.bX> list, java.util.List<com.bytedance.adsdk.IL.bg.bg.bX> list2) {
        java.util.ArrayList arrayList = null;
        for (int i = 0; i < list.size(); i++) {
            com.bytedance.adsdk.IL.bg.bg.bX bXVar = list.get(i);
            if (bXVar instanceof com.bytedance.adsdk.IL.bg.bg.tC) {
                com.bytedance.adsdk.IL.bg.bg.tC tCVar = (com.bytedance.adsdk.IL.bg.bg.tC) bXVar;
                if (tCVar.IL() == com.bytedance.adsdk.IL.bX.IL.Fy.bg.SIMULTANEOUSLY) {
                    this.iR.bg(tCVar);
                    tCVar.bg(this);
                } else if (!(bXVar instanceof com.bytedance.adsdk.IL.bg.bg.Fy)) {
                    if (arrayList == null) {
                        arrayList = new java.util.ArrayList();
                    }
                    arrayList.add((com.bytedance.adsdk.IL.bg.bg.Fy) bXVar);
                }
            } else if (!(bXVar instanceof com.bytedance.adsdk.IL.bg.bg.Fy)) {
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                }
                arrayList.add((com.bytedance.adsdk.IL.bg.bg.Fy) bXVar);
            }
        }
        this.zx.bg((java.util.List<com.bytedance.adsdk.IL.bg.bg.Fy>) arrayList);
    }

    @Override // com.bytedance.adsdk.IL.bg.bg.Ta
    public android.graphics.Path eqN() {
        if (this.ldr) {
            return this.bg;
        }
        this.bg.reset();
        if (this.bX) {
            this.ldr = true;
            return this.bg;
        }
        android.graphics.Path pathIR = this.zx.iR();
        if (pathIR == null) {
            return this.bg;
        }
        this.bg.set(pathIR);
        this.bg.setFillType(android.graphics.Path.FillType.EVEN_ODD);
        this.iR.bg(this.bg);
        this.ldr = true;
        return this.bg;
    }
}

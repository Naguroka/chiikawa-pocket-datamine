package com.bytedance.sdk.component.ldr.bg.bg;

/* JADX INFO: loaded from: classes3.dex */
public class ldr implements com.bytedance.sdk.component.ldr.bg.bg.eqN {
    private com.bytedance.sdk.component.ldr.bg.bg.IL.zx IL;
    private com.bytedance.sdk.component.ldr.bg.eqN.IL.bg Kg;
    private com.bytedance.sdk.component.ldr.bg.eqN.IL.bg PX;
    private com.bytedance.sdk.component.ldr.bg.eqN.IL.bg Ta;
    private com.bytedance.sdk.component.ldr.bg.eqN.IL.bg VB;
    private com.bytedance.sdk.component.ldr.bg.eqN.IL.bg WR;
    private com.bytedance.sdk.component.ldr.bg.bg.IL.bg bX;
    com.bytedance.sdk.component.ldr.bg.bg.zx bg = com.bytedance.sdk.component.ldr.bg.Kg.iR().eqN();
    private com.bytedance.sdk.component.ldr.bg.eqN.IL.bg eo;
    private com.bytedance.sdk.component.ldr.bg.bg.IL.IL eqN;
    private com.bytedance.sdk.component.ldr.bg.bg.IL.ldr iR;
    private com.bytedance.sdk.component.ldr.bg.bg.IL.bX ldr;
    private java.util.Queue<java.lang.String> yDt;
    private com.bytedance.sdk.component.ldr.bg.bg.IL.iR zx;

    @Override // com.bytedance.sdk.component.ldr.bg.bg.eqN
    public void bg(int i, long j) {
    }

    public ldr(java.util.Queue<java.lang.String> queue) {
        this.yDt = queue;
        if (com.bytedance.sdk.component.ldr.bg.IL.bg.bg()) {
            this.Kg = com.bytedance.sdk.component.ldr.bg.Kg.iR().PX();
            this.IL = new com.bytedance.sdk.component.ldr.bg.bg.IL.zx(this.Kg, queue);
        }
        if (com.bytedance.sdk.component.ldr.bg.IL.bg.zx()) {
            if (com.bytedance.sdk.component.ldr.bg.Kg.iR().eo() != null) {
                this.eo = com.bytedance.sdk.component.ldr.bg.Kg.iR().eo();
            } else {
                this.eo = com.bytedance.sdk.component.ldr.bg.Kg.iR().Ta();
            }
            this.eqN = new com.bytedance.sdk.component.ldr.bg.bg.IL.IL(this.eo, queue);
        }
        if (com.bytedance.sdk.component.ldr.bg.IL.bg.IL()) {
            this.WR = com.bytedance.sdk.component.ldr.bg.Kg.iR().Ta();
            this.bX = new com.bytedance.sdk.component.ldr.bg.bg.IL.bg(this.WR, queue);
        }
        if (com.bytedance.sdk.component.ldr.bg.IL.bg.bX()) {
            this.VB = com.bytedance.sdk.component.ldr.bg.Kg.iR().Ta();
            this.zx = new com.bytedance.sdk.component.ldr.bg.bg.IL.iR(this.VB, queue);
        }
        if (com.bytedance.sdk.component.ldr.bg.IL.bg.eqN()) {
            this.PX = com.bytedance.sdk.component.ldr.bg.Kg.iR().yDt();
            this.ldr = new com.bytedance.sdk.component.ldr.bg.bg.IL.bX(this.PX, queue);
        }
        if (com.bytedance.sdk.component.ldr.bg.IL.bg.ldr()) {
            this.Ta = com.bytedance.sdk.component.ldr.bg.Kg.iR().Lq();
            this.iR = new com.bytedance.sdk.component.ldr.bg.bg.IL.ldr(this.Ta, queue);
        }
    }

    @Override // com.bytedance.sdk.component.ldr.bg.bg.eqN
    public void bg(com.bytedance.sdk.component.ldr.bg.eqN.bg bgVar, int i) {
        try {
            byte bEqN = bgVar.eqN();
            byte bZx = bgVar.zx();
            if (bEqN == 0 && bZx == 1 && com.bytedance.sdk.component.ldr.bg.IL.bg.bg()) {
                this.IL.bg(bgVar);
                return;
            }
            if (bEqN == 3 && bZx == 2 && com.bytedance.sdk.component.ldr.bg.IL.bg.zx()) {
                this.eqN.bg(bgVar);
                return;
            }
            if (bEqN == 0 && bZx == 2 && com.bytedance.sdk.component.ldr.bg.IL.bg.IL()) {
                this.bX.bg(bgVar);
                return;
            }
            if (bEqN == 1 && bZx == 2 && com.bytedance.sdk.component.ldr.bg.IL.bg.bX()) {
                this.zx.bg(bgVar);
                return;
            }
            if (bEqN == 1 && bZx == 3 && com.bytedance.sdk.component.ldr.bg.IL.bg.eqN()) {
                this.ldr.bg(bgVar);
            } else if (bEqN == 2 && bZx == 3 && com.bytedance.sdk.component.ldr.bg.IL.bg.ldr()) {
                this.iR.bg(bgVar);
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.component.ldr.bg.bg.eqN
    public void bg(int i, java.util.List<com.bytedance.sdk.component.ldr.bg.eqN.bg> list) {
        if (list == null || list.size() == 0 || list.get(0) == null) {
            return;
        }
        com.bytedance.sdk.component.ldr.bg.eqN.bg bgVar = list.get(0);
        byte bZx = bgVar.zx();
        byte bEqN = bgVar.eqN();
        if (bEqN == 0 && bZx == 1 && com.bytedance.sdk.component.ldr.bg.IL.bg.bg()) {
            this.IL.bg(i, list);
            return;
        }
        if (bEqN == 3 && bZx == 2 && com.bytedance.sdk.component.ldr.bg.IL.bg.zx()) {
            this.eqN.bg(i, list);
            return;
        }
        if (bEqN == 0 && bZx == 2 && com.bytedance.sdk.component.ldr.bg.IL.bg.IL()) {
            this.bX.bg(i, list);
            return;
        }
        if (bEqN == 1 && bZx == 2 && com.bytedance.sdk.component.ldr.bg.IL.bg.bX()) {
            this.zx.bg(i, list);
            return;
        }
        if (bEqN == 1 && bZx == 3 && com.bytedance.sdk.component.ldr.bg.IL.bg.eqN()) {
            this.ldr.bg(i, list);
        } else if (bEqN == 2 && bZx == 3 && com.bytedance.sdk.component.ldr.bg.IL.bg.ldr()) {
            this.iR.bg(i, list);
        }
    }

    @Override // com.bytedance.sdk.component.ldr.bg.bg.eqN
    public java.util.List<com.bytedance.sdk.component.ldr.bg.eqN.bg> bg(int i, int i2, java.util.List<java.lang.String> list) {
        java.util.List<com.bytedance.sdk.component.ldr.bg.eqN.bg> listBg;
        java.util.List<com.bytedance.sdk.component.ldr.bg.eqN.bg> listBg2;
        java.util.List<com.bytedance.sdk.component.ldr.bg.eqN.bg> listBg3;
        java.util.List<com.bytedance.sdk.component.ldr.bg.eqN.bg> listBg4;
        java.util.List<com.bytedance.sdk.component.ldr.bg.eqN.bg> listBg5;
        java.util.List<com.bytedance.sdk.component.ldr.bg.eqN.bg> listBg6;
        if (com.bytedance.sdk.component.ldr.bg.IL.bg.bg() && this.IL.IL(i, i2) && (listBg6 = this.IL.bg(i, i2)) != null && listBg6.size() != 0) {
            com.bytedance.sdk.component.ldr.bg.bX.IL.bg(com.bytedance.sdk.component.ldr.bg.IL.eqN.eqN.VzQ(), 1);
            return listBg6;
        }
        if (com.bytedance.sdk.component.ldr.bg.IL.bg.zx() && this.eqN.IL(i, i2) && (listBg5 = this.eqN.bg(i, i2)) != null && listBg5.size() != 0) {
            return listBg5;
        }
        if (com.bytedance.sdk.component.ldr.bg.IL.bg.IL() && this.bX.IL(i, i2) && (listBg4 = this.bX.bg(i, i2)) != null && listBg4.size() != 0) {
            com.bytedance.sdk.component.ldr.bg.bX.IL.bg(com.bytedance.sdk.component.ldr.bg.IL.eqN.eqN.tuV(), 1);
            return listBg4;
        }
        if (com.bytedance.sdk.component.ldr.bg.IL.bg.bX() && this.zx.IL(i, i2) && (listBg3 = this.zx.bg(i, i2)) != null && listBg3.size() != 0) {
            com.bytedance.sdk.component.ldr.bg.bX.IL.bg(com.bytedance.sdk.component.ldr.bg.IL.eqN.eqN.Fy(), 1);
            return listBg3;
        }
        if (com.bytedance.sdk.component.ldr.bg.IL.bg.eqN() && this.ldr.IL(i, i2) && (listBg2 = this.ldr.bg(i, i2)) != null && listBg2.size() != 0) {
            com.bytedance.sdk.component.ldr.bg.bX.IL.bg(com.bytedance.sdk.component.ldr.bg.IL.eqN.eqN.LZ(), 1);
            return listBg2;
        }
        if (!com.bytedance.sdk.component.ldr.bg.IL.bg.ldr() || !this.iR.IL(i, i2) || (listBg = this.iR.bg(i, i2)) == null || listBg.size() == 0) {
            return null;
        }
        return listBg;
    }

    @Override // com.bytedance.sdk.component.ldr.bg.bg.eqN
    public boolean bg(int i, boolean z) {
        com.bytedance.sdk.component.ldr.bg.bg.IL.ldr ldrVar;
        com.bytedance.sdk.component.ldr.bg.eqN.IL.bg bgVar;
        com.bytedance.sdk.component.ldr.bg.bg.IL.bX bXVar;
        com.bytedance.sdk.component.ldr.bg.eqN.IL.bg bgVar2;
        com.bytedance.sdk.component.ldr.bg.bg.IL.iR iRVar;
        com.bytedance.sdk.component.ldr.bg.eqN.IL.bg bgVar3;
        com.bytedance.sdk.component.ldr.bg.bg.IL.bg bgVar4;
        com.bytedance.sdk.component.ldr.bg.eqN.IL.bg bgVar5;
        com.bytedance.sdk.component.ldr.bg.bg.IL.IL il;
        com.bytedance.sdk.component.ldr.bg.eqN.IL.bg bgVar6;
        com.bytedance.sdk.component.ldr.bg.bg.IL.zx zxVar;
        com.bytedance.sdk.component.ldr.bg.eqN.IL.bg bgVar7;
        if (com.bytedance.sdk.component.ldr.bg.IL.bg.bg() && (zxVar = this.IL) != null && (bgVar7 = this.Kg) != null && zxVar.IL(i, bgVar7.bg())) {
            return true;
        }
        if (com.bytedance.sdk.component.ldr.bg.IL.bg.zx() && (il = this.eqN) != null && (bgVar6 = this.eo) != null && il.IL(i, bgVar6.bg())) {
            return true;
        }
        if (com.bytedance.sdk.component.ldr.bg.IL.bg.IL() && (bgVar4 = this.bX) != null && (bgVar5 = this.WR) != null && bgVar4.IL(i, bgVar5.bg())) {
            return true;
        }
        if (com.bytedance.sdk.component.ldr.bg.IL.bg.bX() && (iRVar = this.zx) != null && (bgVar3 = this.VB) != null && iRVar.IL(i, bgVar3.bg())) {
            return true;
        }
        if (!com.bytedance.sdk.component.ldr.bg.IL.bg.eqN() || (bXVar = this.ldr) == null || (bgVar2 = this.PX) == null || !bXVar.IL(i, bgVar2.bg())) {
            return com.bytedance.sdk.component.ldr.bg.IL.bg.ldr() && (ldrVar = this.iR) != null && (bgVar = this.Ta) != null && ldrVar.IL(i, bgVar.bg());
        }
        return true;
    }
}

package com.bytedance.adsdk.IL.bg.IL;

/* JADX INFO: loaded from: classes3.dex */
public class WR extends com.bytedance.adsdk.IL.iR.bg<android.graphics.PointF> {
    private final com.bytedance.adsdk.IL.iR.bg<android.graphics.PointF> VB;
    private android.graphics.Path eo;

    public WR(com.bytedance.adsdk.IL.iR iRVar, com.bytedance.adsdk.IL.iR.bg<android.graphics.PointF> bgVar) {
        super(iRVar, bgVar.bg, bgVar.IL, bgVar.bX, bgVar.eqN, bgVar.zx, bgVar.ldr, bgVar.iR);
        this.VB = bgVar;
        bg();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void bg() {
        boolean z = (this.IL == 0 || this.bg == 0 || !((android.graphics.PointF) this.bg).equals(((android.graphics.PointF) this.IL).x, ((android.graphics.PointF) this.IL).y)) ? false : true;
        if (this.bg == 0 || this.IL == 0 || z) {
            return;
        }
        this.eo = com.bytedance.adsdk.IL.ldr.ldr.bg((android.graphics.PointF) this.bg, (android.graphics.PointF) this.IL, this.VB.Kg, this.VB.WR);
    }

    android.graphics.Path IL() {
        return this.eo;
    }
}

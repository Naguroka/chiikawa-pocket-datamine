package com.bytedance.adsdk.IL.bg.bg;

/* JADX INFO: loaded from: classes3.dex */
public class LZ extends com.bytedance.adsdk.IL.bg.bg.bg {
    private com.bytedance.adsdk.IL.bg.IL.bg<android.graphics.ColorFilter, android.graphics.ColorFilter> Kg;
    private final com.bytedance.adsdk.IL.bX.bX.bg eqN;
    private final com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Integer, java.lang.Integer> iR;
    private final boolean ldr;
    private final java.lang.String zx;

    public LZ(com.bytedance.adsdk.IL.WR wr, com.bytedance.adsdk.IL.bX.bX.bg bgVar, com.bytedance.adsdk.IL.bX.IL.tuV tuv) {
        super(wr, bgVar, tuv.iR().bg(), tuv.Kg().bg(), tuv.WR(), tuv.bX(), tuv.eqN(), tuv.zx(), tuv.ldr());
        this.eqN = bgVar;
        this.zx = tuv.bg();
        this.ldr = tuv.eo();
        com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Integer, java.lang.Integer> bgVarBg = tuv.IL().bg();
        this.iR = bgVarBg;
        bgVarBg.bg(this);
        bgVar.bg(bgVarBg);
    }

    @Override // com.bytedance.adsdk.IL.bg.bg.bg, com.bytedance.adsdk.IL.bg.bg.zx
    public void bg(android.graphics.Canvas canvas, android.graphics.Matrix matrix, int i) {
        if (this.ldr) {
            return;
        }
        this.IL.setColor(((com.bytedance.adsdk.IL.bg.IL.IL) this.iR).WR());
        if (this.Kg != null) {
            this.IL.setColorFilter(this.Kg.iR());
        }
        super.bg(canvas, matrix, i);
    }
}

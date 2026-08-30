package com.bytedance.adsdk.IL.bX.bX;

/* JADX INFO: loaded from: classes3.dex */
public class iR extends com.bytedance.adsdk.IL.bX.bX.bg {
    private final com.bytedance.adsdk.IL.bX.bX.IL Kg;
    private final com.bytedance.adsdk.IL.bg.bg.eqN iR;

    iR(com.bytedance.adsdk.IL.WR wr, com.bytedance.adsdk.IL.bX.bX.zx zxVar, com.bytedance.adsdk.IL.bX.bX.IL il, com.bytedance.adsdk.IL.iR iRVar) {
        super(wr, zxVar);
        this.Kg = il;
        com.bytedance.adsdk.IL.bg.bg.eqN eqn = new com.bytedance.adsdk.IL.bg.bg.eqN(wr, this, new com.bytedance.adsdk.IL.bX.IL.xxp("__container", zxVar.yDt(), false), iRVar);
        this.iR = eqn;
        eqn.bg(java.util.Collections.emptyList(), java.util.Collections.emptyList());
    }

    @Override // com.bytedance.adsdk.IL.bX.bX.bg
    public void IL(android.graphics.Canvas canvas, android.graphics.Matrix matrix, int i) {
        super.IL(canvas, matrix, i);
        this.iR.bg(canvas, matrix, i);
    }

    @Override // com.bytedance.adsdk.IL.bX.bX.bg, com.bytedance.adsdk.IL.bg.bg.zx
    public void bg(android.graphics.RectF rectF, android.graphics.Matrix matrix, boolean z) {
        super.bg(rectF, matrix, z);
        this.iR.bg(rectF, this.bg, z);
    }

    @Override // com.bytedance.adsdk.IL.bX.bX.bg
    public com.bytedance.adsdk.IL.bX.IL.bg eo() {
        com.bytedance.adsdk.IL.bX.IL.bg bgVarEo = super.eo();
        return bgVarEo != null ? bgVarEo : this.Kg.eo();
    }

    @Override // com.bytedance.adsdk.IL.bX.bX.bg
    public com.bytedance.adsdk.IL.zx.eo VB() {
        com.bytedance.adsdk.IL.zx.eo eoVarVB = super.VB();
        return eoVarVB != null ? eoVarVB : this.Kg.VB();
    }
}

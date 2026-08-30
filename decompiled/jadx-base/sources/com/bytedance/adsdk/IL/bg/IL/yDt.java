package com.bytedance.adsdk.IL.bg.IL;

/* JADX INFO: loaded from: classes3.dex */
public class yDt extends com.bytedance.adsdk.IL.bg.IL.bg<android.graphics.PointF, android.graphics.PointF> {
    private final com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Float, java.lang.Float> Kg;
    private final com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Float, java.lang.Float> WR;
    protected com.bytedance.adsdk.IL.iR.IL<java.lang.Float> eqN;
    private final android.graphics.PointF iR;
    private final android.graphics.PointF ldr;
    protected com.bytedance.adsdk.IL.iR.IL<java.lang.Float> zx;

    public yDt(com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Float, java.lang.Float> bgVar, com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Float, java.lang.Float> bgVar2) {
        super(java.util.Collections.emptyList());
        this.ldr = new android.graphics.PointF();
        this.iR = new android.graphics.PointF();
        this.Kg = bgVar;
        this.WR = bgVar2;
        bg(Kg());
    }

    @Override // com.bytedance.adsdk.IL.bg.IL.bg
    public void bg(float f) {
        this.Kg.bg(f);
        this.WR.bg(f);
        this.ldr.set(this.Kg.iR().floatValue(), this.WR.iR().floatValue());
        for (int i = 0; i < this.bg.size(); i++) {
            this.bg.get(i).bg();
        }
    }

    @Override // com.bytedance.adsdk.IL.bg.IL.bg
    /* JADX INFO: renamed from: WR, reason: merged with bridge method [inline-methods] */
    public android.graphics.PointF iR() {
        return bg(null, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bytedance.adsdk.IL.bg.IL.bg
    /* JADX INFO: renamed from: IL, reason: merged with bridge method [inline-methods] */
    public android.graphics.PointF bg(com.bytedance.adsdk.IL.iR.bg<android.graphics.PointF> bgVar, float f) {
        com.bytedance.adsdk.IL.iR.bg<java.lang.Float> bgVarBX;
        com.bytedance.adsdk.IL.iR.bg<java.lang.Float> bgVarBX2;
        if (this.eqN != null && (bgVarBX2 = this.Kg.bX()) != null) {
            this.Kg.zx();
            java.lang.Float f2 = bgVarBX2.iR;
            if (f2 == null) {
                throw null;
            }
            f2.floatValue();
            throw null;
        }
        if (this.zx != null && (bgVarBX = this.WR.bX()) != null) {
            this.WR.zx();
            java.lang.Float f3 = bgVarBX.iR;
            if (f3 == null) {
                throw null;
            }
            f3.floatValue();
            throw null;
        }
        this.iR.set(this.ldr.x, 0.0f);
        android.graphics.PointF pointF = this.iR;
        pointF.set(pointF.x, this.ldr.y);
        return this.iR;
    }
}

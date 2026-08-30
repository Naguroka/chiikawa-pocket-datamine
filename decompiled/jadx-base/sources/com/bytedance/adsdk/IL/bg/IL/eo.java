package com.bytedance.adsdk.IL.bg.IL;

/* JADX INFO: loaded from: classes3.dex */
public class eo extends com.bytedance.adsdk.IL.bg.IL.iR<android.graphics.PointF> {
    private final android.graphics.PointF eqN;
    private com.bytedance.adsdk.IL.bg.IL.WR iR;
    private final android.graphics.PathMeasure ldr;
    private final float[] zx;

    public eo(java.util.List<? extends com.bytedance.adsdk.IL.iR.bg<android.graphics.PointF>> list) {
        super(list);
        this.eqN = new android.graphics.PointF();
        this.zx = new float[2];
        this.ldr = new android.graphics.PathMeasure();
    }

    @Override // com.bytedance.adsdk.IL.bg.IL.bg
    /* JADX INFO: renamed from: IL, reason: merged with bridge method [inline-methods] */
    public android.graphics.PointF bg(com.bytedance.adsdk.IL.iR.bg<android.graphics.PointF> bgVar, float f) {
        com.bytedance.adsdk.IL.bg.IL.WR wr = (com.bytedance.adsdk.IL.bg.IL.WR) bgVar;
        android.graphics.Path pathIL = wr.IL();
        if (pathIL == null) {
            return bgVar.bg;
        }
        if (this.bX != null) {
            wr.iR.floatValue();
            eqN();
            Kg();
            throw null;
        }
        if (this.iR != wr) {
            this.ldr.setPath(pathIL, false);
            this.iR = wr;
        }
        android.graphics.PathMeasure pathMeasure = this.ldr;
        pathMeasure.getPosTan(f * pathMeasure.getLength(), this.zx, null);
        android.graphics.PointF pointF = this.eqN;
        float[] fArr = this.zx;
        pointF.set(fArr[0], fArr[1]);
        return this.eqN;
    }
}

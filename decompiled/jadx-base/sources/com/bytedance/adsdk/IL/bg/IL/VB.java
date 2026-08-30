package com.bytedance.adsdk.IL.bg.IL;

/* JADX INFO: loaded from: classes3.dex */
public class VB extends com.bytedance.adsdk.IL.bg.IL.iR<android.graphics.PointF> {
    private final android.graphics.PointF eqN;

    public VB(java.util.List<com.bytedance.adsdk.IL.iR.bg<android.graphics.PointF>> list) {
        super(list);
        this.eqN = new android.graphics.PointF();
    }

    @Override // com.bytedance.adsdk.IL.bg.IL.bg
    /* JADX INFO: renamed from: IL, reason: merged with bridge method [inline-methods] */
    public android.graphics.PointF bg(com.bytedance.adsdk.IL.iR.bg<android.graphics.PointF> bgVar, float f) {
        return bg(bgVar, f, f, f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.adsdk.IL.bg.IL.bg
    /* JADX INFO: renamed from: IL, reason: merged with bridge method [inline-methods] */
    public android.graphics.PointF bg(com.bytedance.adsdk.IL.iR.bg<android.graphics.PointF> bgVar, float f, float f2, float f3) {
        if (bgVar.bg == null || bgVar.IL == null) {
            throw new java.lang.IllegalStateException("Missing values for keyframe.");
        }
        android.graphics.PointF pointF = bgVar.bg;
        android.graphics.PointF pointF2 = bgVar.IL;
        if (this.bX != null) {
            bgVar.iR.floatValue();
            eqN();
            Kg();
            throw null;
        }
        this.eqN.set(pointF.x + (f2 * (pointF2.x - pointF.x)), pointF.y + (f3 * (pointF2.y - pointF.y)));
        return this.eqN;
    }
}

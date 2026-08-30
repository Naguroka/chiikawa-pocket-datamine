package com.bytedance.adsdk.IL.bX.bg;

/* JADX INFO: loaded from: classes3.dex */
public class WR implements com.bytedance.adsdk.IL.bX.bg.Ta<android.graphics.PointF, android.graphics.PointF> {
    private final com.bytedance.adsdk.IL.bX.bg.IL IL;
    private final com.bytedance.adsdk.IL.bX.bg.IL bg;

    public WR(com.bytedance.adsdk.IL.bX.bg.IL il, com.bytedance.adsdk.IL.bX.bg.IL il2) {
        this.bg = il;
        this.IL = il2;
    }

    @Override // com.bytedance.adsdk.IL.bX.bg.Ta
    public java.util.List<com.bytedance.adsdk.IL.iR.bg<android.graphics.PointF>> bX() {
        throw new java.lang.UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // com.bytedance.adsdk.IL.bX.bg.Ta
    public boolean IL() {
        return this.bg.IL() && this.IL.IL();
    }

    @Override // com.bytedance.adsdk.IL.bX.bg.Ta
    public com.bytedance.adsdk.IL.bg.IL.bg<android.graphics.PointF, android.graphics.PointF> bg() {
        return new com.bytedance.adsdk.IL.bg.IL.yDt(this.bg.bg(), this.IL.bg());
    }
}

package com.bytedance.adsdk.IL.bX.IL;

/* JADX INFO: loaded from: classes3.dex */
public class VB implements com.bytedance.adsdk.IL.bX.IL.bX {
    private final com.bytedance.adsdk.IL.bX.bg.Ta<android.graphics.PointF, android.graphics.PointF> IL;
    private final com.bytedance.adsdk.IL.bX.bg.Ta<android.graphics.PointF, android.graphics.PointF> bX;
    private final java.lang.String bg;
    private final com.bytedance.adsdk.IL.bX.bg.IL eqN;
    private final boolean zx;

    public VB(java.lang.String str, com.bytedance.adsdk.IL.bX.bg.Ta<android.graphics.PointF, android.graphics.PointF> ta, com.bytedance.adsdk.IL.bX.bg.Ta<android.graphics.PointF, android.graphics.PointF> ta2, com.bytedance.adsdk.IL.bX.bg.IL il, boolean z) {
        this.bg = str;
        this.IL = ta;
        this.bX = ta2;
        this.eqN = il;
        this.zx = z;
    }

    public java.lang.String bg() {
        return this.bg;
    }

    public com.bytedance.adsdk.IL.bX.bg.IL IL() {
        return this.eqN;
    }

    public com.bytedance.adsdk.IL.bX.bg.Ta<android.graphics.PointF, android.graphics.PointF> bX() {
        return this.bX;
    }

    public com.bytedance.adsdk.IL.bX.bg.Ta<android.graphics.PointF, android.graphics.PointF> eqN() {
        return this.IL;
    }

    public boolean zx() {
        return this.zx;
    }

    @Override // com.bytedance.adsdk.IL.bX.IL.bX
    public com.bytedance.adsdk.IL.bg.bg.bX bg(com.bytedance.adsdk.IL.WR wr, com.bytedance.adsdk.IL.iR iRVar, com.bytedance.adsdk.IL.bX.bX.bg bgVar) {
        return new com.bytedance.adsdk.IL.bg.bg.Lq(wr, bgVar, this);
    }

    public java.lang.String toString() {
        return "RectangleShape{position=" + this.IL + ", size=" + this.bX + '}';
    }
}

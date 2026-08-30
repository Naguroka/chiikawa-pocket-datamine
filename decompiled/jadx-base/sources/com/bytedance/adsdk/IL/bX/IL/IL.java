package com.bytedance.adsdk.IL.bX.IL;

/* JADX INFO: loaded from: classes3.dex */
public class IL implements com.bytedance.adsdk.IL.bX.IL.bX {
    private final com.bytedance.adsdk.IL.bX.bg.Ta<android.graphics.PointF, android.graphics.PointF> IL;
    private final com.bytedance.adsdk.IL.bX.bg.ldr bX;
    private final java.lang.String bg;
    private final boolean eqN;
    private final boolean zx;

    public IL(java.lang.String str, com.bytedance.adsdk.IL.bX.bg.Ta<android.graphics.PointF, android.graphics.PointF> ta, com.bytedance.adsdk.IL.bX.bg.ldr ldrVar, boolean z, boolean z2) {
        this.bg = str;
        this.IL = ta;
        this.bX = ldrVar;
        this.eqN = z;
        this.zx = z2;
    }

    @Override // com.bytedance.adsdk.IL.bX.IL.bX
    public com.bytedance.adsdk.IL.bg.bg.bX bg(com.bytedance.adsdk.IL.WR wr, com.bytedance.adsdk.IL.iR iRVar, com.bytedance.adsdk.IL.bX.bX.bg bgVar) {
        return new com.bytedance.adsdk.IL.bg.bg.ldr(wr, bgVar, this);
    }

    public java.lang.String bg() {
        return this.bg;
    }

    public com.bytedance.adsdk.IL.bX.bg.Ta<android.graphics.PointF, android.graphics.PointF> IL() {
        return this.IL;
    }

    public com.bytedance.adsdk.IL.bX.bg.ldr bX() {
        return this.bX;
    }

    public boolean eqN() {
        return this.eqN;
    }

    public boolean zx() {
        return this.zx;
    }
}

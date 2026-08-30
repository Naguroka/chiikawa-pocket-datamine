package com.bytedance.adsdk.IL.bX.IL;

/* JADX INFO: loaded from: classes3.dex */
public class Lq implements com.bytedance.adsdk.IL.bX.IL.bX {
    private final android.graphics.Path.FillType IL;
    private final java.lang.String bX;
    private final boolean bg;
    private final com.bytedance.adsdk.IL.bX.bg.bg eqN;
    private final boolean ldr;
    private final com.bytedance.adsdk.IL.bX.bg.eqN zx;

    public Lq(java.lang.String str, boolean z, android.graphics.Path.FillType fillType, com.bytedance.adsdk.IL.bX.bg.bg bgVar, com.bytedance.adsdk.IL.bX.bg.eqN eqn, boolean z2) {
        this.bX = str;
        this.bg = z;
        this.IL = fillType;
        this.eqN = bgVar;
        this.zx = eqn;
        this.ldr = z2;
    }

    public java.lang.String bg() {
        return this.bX;
    }

    public com.bytedance.adsdk.IL.bX.bg.bg IL() {
        return this.eqN;
    }

    public com.bytedance.adsdk.IL.bX.bg.eqN bX() {
        return this.zx;
    }

    public android.graphics.Path.FillType eqN() {
        return this.IL;
    }

    public boolean zx() {
        return this.ldr;
    }

    @Override // com.bytedance.adsdk.IL.bX.IL.bX
    public com.bytedance.adsdk.IL.bg.bg.bX bg(com.bytedance.adsdk.IL.WR wr, com.bytedance.adsdk.IL.iR iRVar, com.bytedance.adsdk.IL.bX.bX.bg bgVar) {
        return new com.bytedance.adsdk.IL.bg.bg.iR(wr, bgVar, this);
    }

    public java.lang.String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.bg + '}';
    }
}

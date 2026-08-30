package com.bytedance.adsdk.IL.bX.IL;

/* JADX INFO: loaded from: classes3.dex */
public class VzQ implements com.bytedance.adsdk.IL.bX.IL.bX {
    private final int IL;
    private final com.bytedance.adsdk.IL.bX.bg.Kg bX;
    private final java.lang.String bg;
    private final boolean eqN;

    public VzQ(java.lang.String str, int i, com.bytedance.adsdk.IL.bX.bg.Kg kg, boolean z) {
        this.bg = str;
        this.IL = i;
        this.bX = kg;
        this.eqN = z;
    }

    public java.lang.String bg() {
        return this.bg;
    }

    public com.bytedance.adsdk.IL.bX.bg.Kg IL() {
        return this.bX;
    }

    @Override // com.bytedance.adsdk.IL.bX.IL.bX
    public com.bytedance.adsdk.IL.bg.bg.bX bg(com.bytedance.adsdk.IL.WR wr, com.bytedance.adsdk.IL.iR iRVar, com.bytedance.adsdk.IL.bX.bX.bg bgVar) {
        return new com.bytedance.adsdk.IL.bg.bg.tuV(wr, bgVar, this);
    }

    public boolean bX() {
        return this.eqN;
    }

    public java.lang.String toString() {
        return "ShapePath{name=" + this.bg + ", index=" + this.IL + '}';
    }
}

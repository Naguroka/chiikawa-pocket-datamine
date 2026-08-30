package com.bytedance.adsdk.IL.bX.IL;

/* JADX INFO: loaded from: classes3.dex */
public class xxp implements com.bytedance.adsdk.IL.bX.IL.bX {
    private final java.util.List<com.bytedance.adsdk.IL.bX.IL.bX> IL;
    private final boolean bX;
    private final java.lang.String bg;

    public xxp(java.lang.String str, java.util.List<com.bytedance.adsdk.IL.bX.IL.bX> list, boolean z) {
        this.bg = str;
        this.IL = list;
        this.bX = z;
    }

    public java.lang.String bg() {
        return this.bg;
    }

    public java.util.List<com.bytedance.adsdk.IL.bX.IL.bX> IL() {
        return this.IL;
    }

    public boolean bX() {
        return this.bX;
    }

    @Override // com.bytedance.adsdk.IL.bX.IL.bX
    public com.bytedance.adsdk.IL.bg.bg.bX bg(com.bytedance.adsdk.IL.WR wr, com.bytedance.adsdk.IL.iR iRVar, com.bytedance.adsdk.IL.bX.bX.bg bgVar) {
        return new com.bytedance.adsdk.IL.bg.bg.eqN(wr, bgVar, this, iRVar);
    }

    public java.lang.String toString() {
        return "ShapeGroup{name='" + this.bg + "' Shapes: " + java.util.Arrays.toString(this.IL.toArray()) + '}';
    }
}

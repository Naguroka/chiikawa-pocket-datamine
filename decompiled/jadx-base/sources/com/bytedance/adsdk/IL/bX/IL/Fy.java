package com.bytedance.adsdk.IL.bX.IL;

/* JADX INFO: loaded from: classes3.dex */
public class Fy implements com.bytedance.adsdk.IL.bX.IL.bX {
    private final com.bytedance.adsdk.IL.bX.IL.Fy.bg IL;
    private final com.bytedance.adsdk.IL.bX.bg.IL bX;
    private final java.lang.String bg;
    private final com.bytedance.adsdk.IL.bX.bg.IL eqN;
    private final boolean ldr;
    private final com.bytedance.adsdk.IL.bX.bg.IL zx;

    public enum bg {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static com.bytedance.adsdk.IL.bX.IL.Fy.bg bg(int i) {
            if (i == 1) {
                return SIMULTANEOUSLY;
            }
            if (i == 2) {
                return INDIVIDUALLY;
            }
            throw new java.lang.IllegalArgumentException("Unknown trim path type ".concat(java.lang.String.valueOf(i)));
        }
    }

    public Fy(java.lang.String str, com.bytedance.adsdk.IL.bX.IL.Fy.bg bgVar, com.bytedance.adsdk.IL.bX.bg.IL il, com.bytedance.adsdk.IL.bX.bg.IL il2, com.bytedance.adsdk.IL.bX.bg.IL il3, boolean z) {
        this.bg = str;
        this.IL = bgVar;
        this.bX = il;
        this.eqN = il2;
        this.zx = il3;
        this.ldr = z;
    }

    public java.lang.String bg() {
        return this.bg;
    }

    public com.bytedance.adsdk.IL.bX.IL.Fy.bg IL() {
        return this.IL;
    }

    public com.bytedance.adsdk.IL.bX.bg.IL bX() {
        return this.eqN;
    }

    public com.bytedance.adsdk.IL.bX.bg.IL eqN() {
        return this.bX;
    }

    public com.bytedance.adsdk.IL.bX.bg.IL zx() {
        return this.zx;
    }

    public boolean ldr() {
        return this.ldr;
    }

    @Override // com.bytedance.adsdk.IL.bX.IL.bX
    public com.bytedance.adsdk.IL.bg.bg.bX bg(com.bytedance.adsdk.IL.WR wr, com.bytedance.adsdk.IL.iR iRVar, com.bytedance.adsdk.IL.bX.bX.bg bgVar) {
        return new com.bytedance.adsdk.IL.bg.bg.tC(bgVar, this);
    }

    public java.lang.String toString() {
        return "Trim Path: {start: " + this.bX + ", end: " + this.eqN + ", offset: " + this.zx + "}";
    }
}

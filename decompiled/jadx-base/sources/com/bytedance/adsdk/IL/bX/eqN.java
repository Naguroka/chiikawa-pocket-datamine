package com.bytedance.adsdk.IL.bX;

/* JADX INFO: loaded from: classes3.dex */
public class eqN {
    private final char IL;
    private final double bX;
    private final java.util.List<com.bytedance.adsdk.IL.bX.IL.xxp> bg;
    private final double eqN;
    private final java.lang.String ldr;
    private final java.lang.String zx;

    public static int bg(char c, java.lang.String str, java.lang.String str2) {
        return (((c * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public eqN(java.util.List<com.bytedance.adsdk.IL.bX.IL.xxp> list, char c, double d, double d2, java.lang.String str, java.lang.String str2) {
        this.bg = list;
        this.IL = c;
        this.bX = d;
        this.eqN = d2;
        this.zx = str;
        this.ldr = str2;
    }

    public java.util.List<com.bytedance.adsdk.IL.bX.IL.xxp> bg() {
        return this.bg;
    }

    public double IL() {
        return this.eqN;
    }

    public int hashCode() {
        return bg(this.IL, this.ldr, this.zx);
    }
}

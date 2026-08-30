package com.bytedance.adsdk.IL;

/* JADX INFO: loaded from: classes3.dex */
public class eo {
    private final int IL;
    private final java.lang.String Kg;
    private final int[][] WR;
    private final java.lang.String bX;
    private final int bg;
    private android.graphics.Bitmap eo;
    private final java.lang.String eqN;
    private final java.util.List<com.bytedance.adsdk.IL.eo.bg> iR;
    private final java.lang.String ldr;
    private final java.lang.String zx;

    public static class bg {
        public int IL;
        public java.lang.String bX;
        public int bg;
        public java.lang.String eqN;
        public int ldr;
        public int zx;
    }

    public eo(int i, int i2, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.List<com.bytedance.adsdk.IL.eo.bg> list, java.lang.String str5, int[][] iArr) {
        this.bg = i;
        this.IL = i2;
        this.bX = str;
        this.eqN = str2;
        this.zx = str3;
        this.ldr = str4;
        this.iR = list;
        this.Kg = str5;
        this.WR = iArr;
    }

    public int bg() {
        return this.bg;
    }

    public int IL() {
        return this.IL;
    }

    public java.util.List<com.bytedance.adsdk.IL.eo.bg> bX() {
        return this.iR;
    }

    public java.lang.String eqN() {
        return this.ldr;
    }

    public java.lang.String zx() {
        return this.Kg;
    }

    public int[][] ldr() {
        return this.WR;
    }

    public java.lang.String iR() {
        return this.bX;
    }

    public java.lang.String Kg() {
        return this.eqN;
    }

    public java.lang.String WR() {
        return this.zx;
    }

    public android.graphics.Bitmap eo() {
        return this.eo;
    }

    public void bg(android.graphics.Bitmap bitmap) {
        this.eo = bitmap;
    }
}

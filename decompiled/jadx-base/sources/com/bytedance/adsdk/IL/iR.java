package com.bytedance.adsdk.IL;

/* JADX INFO: loaded from: classes3.dex */
public class iR {
    private android.util.LongSparseArray<com.bytedance.adsdk.IL.bX.bX.zx> Kg;
    private float PX;
    private float Ta;
    private float VB;
    private com.bytedance.adsdk.IL.iR.bg VzQ;
    private java.util.List<com.bytedance.adsdk.IL.bX.bX.zx> WR;
    private java.util.Map<java.lang.String, java.util.List<com.bytedance.adsdk.IL.bX.bX.zx>> bX;
    private android.graphics.Rect eo;
    private java.util.Map<java.lang.String, com.bytedance.adsdk.IL.eo> eqN;
    private android.util.SparseArray<com.bytedance.adsdk.IL.bX.eqN> iR;
    private java.util.List<com.bytedance.adsdk.IL.bX.ldr> ldr;
    private com.bytedance.adsdk.IL.iR.IL tuV;
    private com.bytedance.adsdk.IL.iR.bX vb;
    private boolean yDt;
    private java.util.Map<java.lang.String, com.bytedance.adsdk.IL.bX.bX> zx;
    private final com.bytedance.adsdk.IL.tuV bg = new com.bytedance.adsdk.IL.tuV();
    private final java.util.HashSet<java.lang.String> IL = new java.util.HashSet<>();
    private int Lq = 0;
    private java.lang.String xxp = "";

    public static class IL {
        public int[][] IL;
        public java.lang.String bg;
    }

    public static class bX {
        public java.lang.String IL;
        public java.lang.String bX;
        public int bg;
        public java.lang.String eqN;
        public java.lang.String ldr;
        public int[] zx;
    }

    public static class bg {
        public java.util.Map<java.lang.String, java.lang.Object> IL;
        public java.util.Map<java.lang.String, java.lang.Object> bX;
        public int bg;
    }

    public void bg(android.graphics.Rect rect, float f, float f2, float f3, java.util.List<com.bytedance.adsdk.IL.bX.bX.zx> list, android.util.LongSparseArray<com.bytedance.adsdk.IL.bX.bX.zx> longSparseArray, java.util.Map<java.lang.String, java.util.List<com.bytedance.adsdk.IL.bX.bX.zx>> map, java.util.Map<java.lang.String, com.bytedance.adsdk.IL.eo> map2, android.util.SparseArray<com.bytedance.adsdk.IL.bX.eqN> sparseArray, java.util.Map<java.lang.String, com.bytedance.adsdk.IL.bX.bX> map3, java.util.List<com.bytedance.adsdk.IL.bX.ldr> list2, com.bytedance.adsdk.IL.iR.bX bXVar, java.lang.String str, com.bytedance.adsdk.IL.iR.bg bgVar, com.bytedance.adsdk.IL.iR.IL il) {
        this.eo = rect;
        this.VB = f;
        this.PX = f2;
        this.Ta = f3;
        this.WR = list;
        this.Kg = longSparseArray;
        this.bX = map;
        this.eqN = map2;
        this.iR = sparseArray;
        this.zx = map3;
        this.ldr = list2;
        this.vb = bXVar;
        this.xxp = str;
        this.VzQ = bgVar;
        this.tuV = il;
    }

    public void bg(java.lang.String str) {
        this.IL.add(str);
    }

    public void bg(boolean z) {
        this.yDt = z;
    }

    public void bg(int i) {
        this.Lq += i;
    }

    public boolean bg() {
        return this.yDt;
    }

    public int IL() {
        return this.Lq;
    }

    public void IL(boolean z) {
        this.bg.bg(z);
    }

    public com.bytedance.adsdk.IL.tuV bX() {
        return this.bg;
    }

    public com.bytedance.adsdk.IL.bX.bX.zx bg(long j) {
        return this.Kg.get(j);
    }

    public android.graphics.Rect eqN() {
        return this.eo;
    }

    public float zx() {
        return (long) ((xxp() / this.Ta) * 1000.0f);
    }

    public float ldr() {
        return this.VB;
    }

    public float iR() {
        return this.PX;
    }

    public float bg(float f) {
        return com.bytedance.adsdk.IL.ldr.zx.bg(this.VB, this.PX, f);
    }

    public com.bytedance.adsdk.IL.iR.bX Kg() {
        return this.vb;
    }

    public java.lang.String WR() {
        return this.xxp;
    }

    public com.bytedance.adsdk.IL.iR.IL eo() {
        return this.tuV;
    }

    public com.bytedance.adsdk.IL.iR.bg VB() {
        return this.VzQ;
    }

    public float PX() {
        return this.Ta;
    }

    public java.util.List<com.bytedance.adsdk.IL.bX.bX.zx> Ta() {
        return this.WR;
    }

    public java.util.List<com.bytedance.adsdk.IL.bX.bX.zx> IL(java.lang.String str) {
        return this.bX.get(str);
    }

    public android.util.SparseArray<com.bytedance.adsdk.IL.bX.eqN> yDt() {
        return this.iR;
    }

    public java.util.Map<java.lang.String, com.bytedance.adsdk.IL.bX.bX> Lq() {
        return this.zx;
    }

    public com.bytedance.adsdk.IL.bX.ldr bX(java.lang.String str) {
        int size = this.ldr.size();
        for (int i = 0; i < size; i++) {
            com.bytedance.adsdk.IL.bX.ldr ldrVar = this.ldr.get(i);
            if (ldrVar.bg(str)) {
                return ldrVar;
            }
        }
        return null;
    }

    public java.util.Map<java.lang.String, com.bytedance.adsdk.IL.eo> vb() {
        return this.eqN;
    }

    public float xxp() {
        return this.PX - this.VB;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LottieComposition:\n");
        java.util.Iterator<com.bytedance.adsdk.IL.bX.bX.zx> it = this.WR.iterator();
        while (it.hasNext()) {
            sb.append(it.next().bg("\t"));
        }
        return sb.toString();
    }
}

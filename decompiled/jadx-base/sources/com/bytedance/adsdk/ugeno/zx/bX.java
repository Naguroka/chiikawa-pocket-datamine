package com.bytedance.adsdk.ugeno.zx;

/* JADX INFO: loaded from: classes3.dex */
public class bX {
    int Kg;
    int Lq;
    int PX;
    int Ta;
    float VB;
    boolean VzQ;
    int WR;
    float eo;
    int iR;
    int ldr;
    int vb;
    boolean xxp;
    int zx;
    int bg = Integer.MAX_VALUE;
    int IL = Integer.MAX_VALUE;
    int bX = Integer.MIN_VALUE;
    int eqN = Integer.MIN_VALUE;
    java.util.List<java.lang.Integer> yDt = new java.util.ArrayList();

    bX() {
    }

    public int bg() {
        return this.iR;
    }

    public int IL() {
        return this.Kg - this.WR;
    }

    void bg(android.view.View view, int i, int i2, int i3, int i4) {
        com.bytedance.adsdk.ugeno.zx.IL il = (com.bytedance.adsdk.ugeno.zx.IL) view.getLayoutParams();
        this.bg = java.lang.Math.min(this.bg, (view.getLeft() - il.Ta()) - i);
        this.IL = java.lang.Math.min(this.IL, (view.getTop() - il.yDt()) - i2);
        this.bX = java.lang.Math.max(this.bX, view.getRight() + il.Lq() + i3);
        this.eqN = java.lang.Math.max(this.eqN, view.getBottom() + il.vb() + i4);
    }
}

package com.bytedance.adsdk.IL.bX;

/* JADX INFO: loaded from: classes3.dex */
public class bg {
    private final android.graphics.PointF IL;
    private final android.graphics.PointF bX;
    private final android.graphics.PointF bg;

    public bg() {
        this.bg = new android.graphics.PointF();
        this.IL = new android.graphics.PointF();
        this.bX = new android.graphics.PointF();
    }

    public bg(android.graphics.PointF pointF, android.graphics.PointF pointF2, android.graphics.PointF pointF3) {
        this.bg = pointF;
        this.IL = pointF2;
        this.bX = pointF3;
    }

    public void bg(float f, float f2) {
        this.bg.set(f, f2);
    }

    public android.graphics.PointF bg() {
        return this.bg;
    }

    public void IL(float f, float f2) {
        this.IL.set(f, f2);
    }

    public android.graphics.PointF IL() {
        return this.IL;
    }

    public void bX(float f, float f2) {
        this.bX.set(f, f2);
    }

    public android.graphics.PointF bX() {
        return this.bX;
    }

    public java.lang.String toString() {
        return java.lang.String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", java.lang.Float.valueOf(this.bX.x), java.lang.Float.valueOf(this.bX.y), java.lang.Float.valueOf(this.bg.x), java.lang.Float.valueOf(this.bg.y), java.lang.Float.valueOf(this.IL.x), java.lang.Float.valueOf(this.IL.y));
    }
}

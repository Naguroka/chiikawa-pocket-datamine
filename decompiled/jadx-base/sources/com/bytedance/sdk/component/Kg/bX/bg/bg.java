package com.bytedance.sdk.component.Kg.bX.bg;

/* JADX INFO: loaded from: classes3.dex */
public class bg {
    private int IL = 0;
    private long bX;
    private java.lang.String bg;
    private long eqN;
    private long ldr;
    private long zx;

    public java.lang.String bg() {
        return this.bg;
    }

    public int IL() {
        return this.IL;
    }

    public long bX() {
        return this.bX;
    }

    public long eqN() {
        return this.eqN;
    }

    public long zx() {
        return this.zx;
    }

    public long ldr() {
        return this.ldr;
    }

    public void bg(com.bytedance.sdk.component.Kg.bX.IL il) {
        synchronized (this) {
            if (android.text.TextUtils.isEmpty(this.bg)) {
                this.bg = il.IL();
            }
            this.bX += il.ldr();
            this.eqN += il.iR();
            this.zx = java.lang.Math.max(this.zx, il.ldr());
            this.ldr = java.lang.Math.max(this.ldr, il.iR());
            this.IL++;
        }
        java.lang.Object[] objArr = new java.lang.Object[5];
        java.lang.Long.valueOf(il.ldr());
        java.lang.Long.valueOf(il.iR());
        toString();
    }

    public java.lang.String toString() {
        return this.bg + " times=" + this.IL + ",waitMaxTime=" + this.zx + ",runMaxTime=" + this.ldr + ",runTotalTime=" + this.eqN + ",waitTotalTime=" + this.bX;
    }
}

package com.bytedance.sdk.component.Kg.bX;

/* JADX INFO: loaded from: classes3.dex */
public abstract class IL implements java.lang.Comparable<com.bytedance.sdk.component.Kg.bX.IL>, java.lang.Runnable {
    private java.lang.String IL;
    private java.lang.Runnable bX;
    private int bg;
    private long eqN;
    private long ldr;
    private long zx;

    public IL(java.lang.String str) {
        this.bg = 5;
        this.IL = str;
    }

    public IL(int i, java.lang.String str) {
        this.bg = i;
        this.IL = str;
    }

    public IL(java.lang.String str, java.lang.Runnable runnable) {
        this.bg = 5;
        this.IL = str;
        this.bX = runnable;
    }

    public void bg(int i) {
        this.bg = i;
    }

    public int bg() {
        return this.bg;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
    public int compareTo(com.bytedance.sdk.component.Kg.bX.IL il) {
        if (bg() < il.bg()) {
            return 1;
        }
        return bg() >= il.bg() ? -1 : 0;
    }

    public java.lang.String IL() {
        return this.IL;
    }

    public long bX() {
        return this.eqN;
    }

    public void bg(long j) {
        this.eqN = j;
    }

    public long eqN() {
        return this.zx;
    }

    public void IL(long j) {
        this.zx = j;
    }

    public long zx() {
        return this.ldr;
    }

    public void bX(long j) {
        this.ldr = j;
    }

    public long ldr() {
        return this.zx - this.eqN;
    }

    public long iR() {
        return this.ldr - this.zx;
    }

    public java.lang.Runnable Kg() {
        return this.bX;
    }
}

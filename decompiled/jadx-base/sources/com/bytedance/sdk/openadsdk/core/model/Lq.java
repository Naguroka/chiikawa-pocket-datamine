package com.bytedance.sdk.openadsdk.core.model;

/* JADX INFO: loaded from: classes4.dex */
public class Lq {
    private int IL;
    private int bX;
    private java.lang.String bg;
    private double eqN;
    private java.lang.String ldr;
    private boolean zx;

    public java.lang.String bg() {
        return this.bg;
    }

    public void bg(java.lang.String str) {
        this.bg = str;
    }

    public int IL() {
        return this.IL;
    }

    public void bg(int i) {
        this.IL = i;
    }

    public int bX() {
        return this.bX;
    }

    public void IL(int i) {
        this.bX = i;
    }

    public double eqN() {
        return this.eqN;
    }

    public boolean zx() {
        return !android.text.TextUtils.isEmpty(this.bg) && this.IL > 0 && this.bX > 0;
    }

    public boolean ldr() {
        return this.zx;
    }

    public void bg(boolean z) {
        this.zx = z;
    }

    public java.lang.String iR() {
        return this.ldr;
    }

    public void IL(java.lang.String str) {
        this.ldr = str;
    }
}

package com.bytedance.sdk.openadsdk.core.model;

/* JADX INFO: loaded from: classes4.dex */
public class VzQ {
    private long bg = 10000;
    private long IL = 10000;
    private long bX = 10;
    private long eqN = 20;
    private java.lang.String zx = "";

    public long bg() {
        return this.bg;
    }

    public void bg(long j) {
        if (j <= 0) {
            this.bg = 10L;
        } else {
            this.bg = j;
        }
    }

    public long IL() {
        return this.IL;
    }

    public void IL(long j) {
        if (j < 0) {
            this.IL = 20L;
        } else {
            this.IL = j;
        }
    }

    public long bX() {
        return this.bX;
    }

    public void bX(long j) {
        if (j <= 0) {
            this.bX = 10L;
        } else {
            this.bX = j;
        }
    }

    public long eqN() {
        return this.eqN;
    }

    public void eqN(long j) {
        if (j < 0) {
            this.eqN = 20L;
        } else {
            this.eqN = j;
        }
    }

    public java.lang.String zx() {
        return this.zx;
    }

    public void bg(java.lang.String str) {
        this.zx = str;
    }
}

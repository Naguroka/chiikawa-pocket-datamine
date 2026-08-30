package com.bytedance.sdk.component.ldr.bg.ldr;

/* JADX INFO: loaded from: classes3.dex */
public class eqN {
    private final java.lang.String IL;
    private java.lang.String Kg;
    private boolean VB;
    private final boolean bX;
    private final java.lang.String bg;
    private java.lang.String iR;
    private final java.lang.String ldr;
    private final int zx;
    private int eqN = -1;
    private int WR = 0;
    private java.lang.String eo = null;

    eqN(java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.String str3) {
        this.bg = str;
        this.IL = str2;
        this.bX = z;
        this.zx = i;
        this.ldr = str3;
    }

    public java.lang.String bg() {
        return this.bg;
    }

    public java.lang.String IL() {
        return this.IL;
    }

    public boolean bX() {
        return this.bX;
    }

    public int eqN() {
        return this.eqN;
    }

    public void bg(int i) {
        this.eqN = i;
    }

    public int zx() {
        return this.zx;
    }

    public java.lang.String ldr() {
        return this.ldr;
    }

    public void bg(java.lang.String str) {
        this.iR = str;
    }

    public java.lang.String iR() {
        return this.iR;
    }

    public void IL(int i) {
        this.WR = i;
        if (i == 0) {
            return;
        }
        if (android.text.TextUtils.isEmpty(this.iR)) {
            this.iR = java.lang.String.valueOf(this.WR);
        } else {
            this.iR += "," + this.WR;
        }
    }

    public int Kg() {
        return this.WR;
    }

    public void IL(java.lang.String str) {
        this.Kg = str;
    }

    public java.lang.String WR() {
        return this.Kg;
    }

    public void bX(java.lang.String str) {
        this.eo = str;
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        if (android.text.TextUtils.isEmpty(this.Kg)) {
            this.Kg = java.lang.String.valueOf(this.eo);
        } else {
            this.Kg += "," + this.eo;
        }
    }

    public void bg(boolean z) {
        this.VB = z;
    }

    public boolean eo() {
        return this.VB;
    }

    public java.lang.Runnable bg(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        return com.bytedance.sdk.component.ldr.bg.ldr.bg.bg().bg(this, str, map);
    }

    public boolean VB() {
        return this.eqN == -1;
    }
}

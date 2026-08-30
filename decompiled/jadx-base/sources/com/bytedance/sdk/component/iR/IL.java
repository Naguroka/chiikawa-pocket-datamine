package com.bytedance.sdk.component.iR;

/* JADX INFO: loaded from: classes3.dex */
public class IL {
    final java.lang.String IL;
    private final boolean WR;
    final java.util.Map<java.lang.String, java.lang.String> bX;
    final int bg;
    final java.lang.String eqN;
    com.bytedance.sdk.component.IL.bg.eo iR;
    final long ldr;
    final long zx;
    private java.io.File Kg = null;
    private byte[] eo = null;

    public IL(boolean z, int i, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str2, long j, long j2) {
        this.WR = z;
        this.bg = i;
        this.IL = str;
        this.bX = map;
        this.eqN = str2;
        this.zx = j;
        this.ldr = j2;
    }

    public int bg() {
        return this.bg;
    }

    public java.lang.String IL() {
        return this.IL;
    }

    public java.util.Map<java.lang.String, java.lang.String> bX() {
        return this.bX;
    }

    public java.lang.String eqN() {
        return this.eqN;
    }

    public java.io.File zx() {
        return this.Kg;
    }

    public void bg(java.io.File file) {
        this.Kg = file;
    }

    public boolean ldr() {
        return this.WR;
    }

    public void bg(byte[] bArr) {
        this.eo = bArr;
    }

    public com.bytedance.sdk.component.IL.bg.eo iR() {
        return this.iR;
    }

    public void bg(com.bytedance.sdk.component.IL.bg.eo eoVar) {
        this.iR = eoVar;
    }
}

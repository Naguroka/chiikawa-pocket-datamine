package com.bytedance.sdk.openadsdk.core.model;

/* JADX INFO: loaded from: classes4.dex */
public class JAA {
    public long IL;
    private long Kg;
    private int VB;
    private long WR;
    public boolean bg;
    private long eo;
    private long iR;
    private long ldr;
    private long zx;
    private com.bytedance.sdk.openadsdk.utils.daV bX = com.bytedance.sdk.openadsdk.utils.daV.IL();
    private com.bytedance.sdk.openadsdk.utils.daV eqN = com.bytedance.sdk.openadsdk.utils.daV.IL();

    public void bg(com.bytedance.sdk.openadsdk.utils.daV dav, com.bytedance.sdk.openadsdk.utils.daV dav2, int i, com.bytedance.sdk.openadsdk.utils.daV dav3) {
        this.zx = dav.bg(this.bX);
        this.ldr = dav2.bg(dav);
        this.iR = i;
        this.Kg = dav3.bg(dav2);
    }

    public void bg(com.bytedance.sdk.openadsdk.utils.daV dav) {
        this.bX = dav;
    }

    public void IL(com.bytedance.sdk.openadsdk.utils.daV dav) {
        this.eqN = dav;
        this.WR = dav.bg(this.bX);
    }

    public com.bytedance.sdk.openadsdk.utils.daV bg() {
        return this.bX;
    }

    public long IL() {
        return this.zx;
    }

    public long bX() {
        return this.ldr;
    }

    public long eqN() {
        return this.iR;
    }

    public long zx() {
        return this.Kg;
    }

    public long ldr() {
        return this.WR;
    }

    public long iR() {
        return this.eo;
    }

    public void bg(long j) {
        this.eo = j;
    }

    public int Kg() {
        return this.VB;
    }

    public void bg(int i) {
        this.VB = i;
    }
}

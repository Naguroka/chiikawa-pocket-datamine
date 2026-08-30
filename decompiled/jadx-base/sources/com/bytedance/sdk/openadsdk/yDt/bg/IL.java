package com.bytedance.sdk.openadsdk.yDt.bg;

/* JADX INFO: loaded from: classes4.dex */
public class IL {
    private com.bytedance.sdk.openadsdk.core.model.tuV IL;
    private int Kg = 0;
    private int WR = 0;
    private java.lang.String bX;
    private java.lang.String bg;
    private int eqN;
    private int iR;
    private java.lang.String ldr;
    private boolean zx;

    public java.lang.String bg() {
        return this.bg;
    }

    public void bg(java.lang.String str) {
        this.bg = str;
    }

    public com.bytedance.sdk.openadsdk.core.model.tuV IL() {
        return this.IL;
    }

    public void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        this.IL = tuv;
    }

    public java.lang.String bX() {
        com.bytedance.sdk.openadsdk.core.model.tuV tuv;
        if (android.text.TextUtils.isEmpty(this.bX) && (tuv = this.IL) != null) {
            this.bX = com.bytedance.sdk.openadsdk.utils.ayS.bg(tuv);
        }
        return this.bX;
    }

    public void IL(java.lang.String str) {
        this.bX = str;
    }

    public int eqN() {
        return this.eqN;
    }

    public void bg(int i) {
        this.eqN = i;
    }

    public boolean zx() {
        return this.zx;
    }

    public void bg(boolean z) {
        this.zx = z;
    }

    public java.lang.String ldr() {
        return this.ldr;
    }

    public void bX(java.lang.String str) {
        this.ldr = str;
    }

    public int iR() {
        return this.iR;
    }

    public void IL(int i) {
        this.iR = i;
    }

    public int Kg() {
        return this.Kg;
    }

    public void bX(int i) {
        this.Kg = i;
    }

    public int WR() {
        return this.WR;
    }

    public void eqN(int i) {
        this.WR = i;
    }
}

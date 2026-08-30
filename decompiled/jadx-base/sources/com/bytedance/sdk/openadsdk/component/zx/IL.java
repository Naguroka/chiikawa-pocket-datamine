package com.bytedance.sdk.openadsdk.component.zx;

/* JADX INFO: loaded from: classes4.dex */
public class IL {
    private int IL;
    private com.bytedance.sdk.openadsdk.core.model.tuV bX;
    private int bg;
    private com.bytedance.sdk.openadsdk.core.model.bg eqN;
    private boolean iR;
    private java.lang.String ldr;
    private int zx;

    public IL(int i, int i2, com.bytedance.sdk.openadsdk.core.model.tuV tuv, com.bytedance.sdk.openadsdk.core.model.bg bgVar) {
        this.bg = i;
        this.IL = i2;
        this.bX = tuv;
        this.eqN = bgVar;
    }

    public IL(int i, int i2, int i3, java.lang.String str) {
        this.bg = i;
        this.IL = i2;
        this.zx = i3;
        this.ldr = str;
    }

    public com.bytedance.sdk.openadsdk.core.model.bg bg() {
        return this.eqN;
    }

    public void bg(boolean z) {
        this.iR = z;
    }

    public boolean IL() {
        return this.iR;
    }

    public int bX() {
        return this.bg;
    }

    public int eqN() {
        return this.IL;
    }

    public com.bytedance.sdk.openadsdk.core.model.tuV zx() {
        return this.bX;
    }

    public int ldr() {
        return this.zx;
    }

    public java.lang.String iR() {
        return this.ldr;
    }
}

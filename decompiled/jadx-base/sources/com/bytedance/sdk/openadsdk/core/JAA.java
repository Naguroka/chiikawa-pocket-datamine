package com.bytedance.sdk.openadsdk.core;

/* JADX INFO: loaded from: classes4.dex */
public class JAA {
    private static com.bytedance.sdk.openadsdk.core.JAA bg;
    private com.bytedance.sdk.openadsdk.core.model.bg IL;
    private com.bytedance.sdk.openadsdk.core.model.tuV bX;
    private com.bytedance.sdk.openadsdk.bg.zx.bg eqN;
    private com.bytedance.sdk.openadsdk.bg.eqN.IL ldr;
    private com.bytedance.sdk.openadsdk.bg.bX.IL zx;

    private JAA() {
    }

    public static com.bytedance.sdk.openadsdk.core.JAA bg() {
        if (bg == null) {
            bg = new com.bytedance.sdk.openadsdk.core.JAA();
        }
        return bg;
    }

    public com.bytedance.sdk.openadsdk.core.model.tuV IL() {
        return this.bX;
    }

    public void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        this.bX = tuv;
    }

    public com.bytedance.sdk.openadsdk.bg.zx.bg bX() {
        return this.eqN;
    }

    public com.bytedance.sdk.openadsdk.bg.bX.IL eqN() {
        return this.zx;
    }

    public com.bytedance.sdk.openadsdk.bg.eqN.IL zx() {
        return this.ldr;
    }

    public void bg(com.bytedance.sdk.openadsdk.bg.bX.IL il) {
        this.zx = il;
    }

    public void bg(com.bytedance.sdk.openadsdk.bg.zx.bg bgVar) {
        this.eqN = bgVar;
    }

    public void bg(com.bytedance.sdk.openadsdk.bg.eqN.IL il) {
        this.ldr = il;
    }

    public void ldr() {
        this.bX = null;
        this.IL = null;
        this.eqN = null;
        this.zx = null;
        this.ldr = null;
    }

    public com.bytedance.sdk.openadsdk.core.model.bg iR() {
        return this.IL;
    }

    public void bg(com.bytedance.sdk.openadsdk.core.model.bg bgVar) {
        this.IL = bgVar;
    }
}

package com.bytedance.adsdk.bg.IL.IL.bg;

/* JADX INFO: loaded from: classes3.dex */
public abstract class VzQ implements com.bytedance.adsdk.bg.IL.IL.bg {
    protected com.bytedance.adsdk.bg.IL.IL.bg IL;
    protected com.bytedance.adsdk.bg.IL.eqN.bX bX;
    protected com.bytedance.adsdk.bg.IL.IL.bg bg;

    protected VzQ(com.bytedance.adsdk.bg.IL.eqN.bX bXVar) {
        this.bX = bXVar;
    }

    public void bg(com.bytedance.adsdk.bg.IL.IL.bg bgVar) {
        this.bg = bgVar;
    }

    public void IL(com.bytedance.adsdk.bg.IL.IL.bg bgVar) {
        this.IL = bgVar;
    }

    @Override // com.bytedance.adsdk.bg.IL.IL.bg
    public com.bytedance.adsdk.bg.IL.eqN.zx bg() {
        return com.bytedance.adsdk.bg.IL.eqN.ldr.OPERATOR_RESULT;
    }

    @Override // com.bytedance.adsdk.bg.IL.IL.bg
    public java.lang.String IL() {
        return this.bg.IL() + this.bX.bg() + this.IL.IL();
    }

    public java.lang.String toString() {
        return IL();
    }
}

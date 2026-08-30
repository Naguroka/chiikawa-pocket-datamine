package com.bytedance.adsdk.IL.bX.IL;

/* JADX INFO: loaded from: classes3.dex */
public class zx implements com.bytedance.adsdk.IL.bX.IL.bX {
    private final android.graphics.Path.FillType IL;
    private final com.bytedance.adsdk.IL.bX.bg.IL Kg;
    private final com.bytedance.adsdk.IL.bX.bg.IL WR;
    private final com.bytedance.adsdk.IL.bX.bg.bX bX;
    private final com.bytedance.adsdk.IL.bX.IL.iR bg;
    private final boolean eo;
    private final com.bytedance.adsdk.IL.bX.bg.eqN eqN;
    private final java.lang.String iR;
    private final com.bytedance.adsdk.IL.bX.bg.ldr ldr;
    private final com.bytedance.adsdk.IL.bX.bg.ldr zx;

    public zx(java.lang.String str, com.bytedance.adsdk.IL.bX.IL.iR iRVar, android.graphics.Path.FillType fillType, com.bytedance.adsdk.IL.bX.bg.bX bXVar, com.bytedance.adsdk.IL.bX.bg.eqN eqn, com.bytedance.adsdk.IL.bX.bg.ldr ldrVar, com.bytedance.adsdk.IL.bX.bg.ldr ldrVar2, com.bytedance.adsdk.IL.bX.bg.IL il, com.bytedance.adsdk.IL.bX.bg.IL il2, boolean z) {
        this.bg = iRVar;
        this.IL = fillType;
        this.bX = bXVar;
        this.eqN = eqn;
        this.zx = ldrVar;
        this.ldr = ldrVar2;
        this.iR = str;
        this.Kg = il;
        this.WR = il2;
        this.eo = z;
    }

    public java.lang.String bg() {
        return this.iR;
    }

    public com.bytedance.adsdk.IL.bX.IL.iR IL() {
        return this.bg;
    }

    public android.graphics.Path.FillType bX() {
        return this.IL;
    }

    public com.bytedance.adsdk.IL.bX.bg.bX eqN() {
        return this.bX;
    }

    public com.bytedance.adsdk.IL.bX.bg.eqN zx() {
        return this.eqN;
    }

    public com.bytedance.adsdk.IL.bX.bg.ldr ldr() {
        return this.zx;
    }

    public com.bytedance.adsdk.IL.bX.bg.ldr iR() {
        return this.ldr;
    }

    public boolean Kg() {
        return this.eo;
    }

    @Override // com.bytedance.adsdk.IL.bX.IL.bX
    public com.bytedance.adsdk.IL.bg.bg.bX bg(com.bytedance.adsdk.IL.WR wr, com.bytedance.adsdk.IL.iR iRVar, com.bytedance.adsdk.IL.bX.bX.bg bgVar) {
        return new com.bytedance.adsdk.IL.bg.bg.Kg(wr, iRVar, bgVar, this);
    }
}

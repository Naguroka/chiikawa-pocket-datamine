package com.bytedance.sdk.openadsdk.p002vb;

/* JADX INFO: loaded from: classes4.dex */
class ldr implements com.bytedance.sdk.openadsdk.p002vb.zx {
    private com.bytedance.sdk.openadsdk.p002vb.zx IL;
    private int bX;
    long bg = java.lang.System.currentTimeMillis();
    private int eqN;
    private int zx;

    public ldr(com.bytedance.sdk.openadsdk.p002vb.zx zxVar, int i, int i2, int i3) {
        this.IL = zxVar;
        this.bX = i;
        this.eqN = i2;
        this.zx = i3;
    }

    @Override // com.bytedance.sdk.openadsdk.p002vb.zx
    public com.bytedance.sdk.openadsdk.p002vb.IL.bg generatorModel() {
        com.bytedance.sdk.openadsdk.p002vb.IL.bg bgVarGeneratorModel = this.IL.generatorModel();
        bgVarGeneratorModel.bg(com.bytedance.sdk.openadsdk.BuildConfig.VERSION_NAME);
        bgVarGeneratorModel.bg(this.bX);
        bgVarGeneratorModel.IL(this.eqN);
        bgVarGeneratorModel.bX(this.zx);
        bgVarGeneratorModel.IL(this.bg);
        bgVarGeneratorModel.ldr(com.bytedance.sdk.openadsdk.core.WR.IL().zx());
        bgVarGeneratorModel.eqN(com.bytedance.sdk.openadsdk.core.yDt.eqN());
        return bgVarGeneratorModel;
    }
}

package com.bytedance.adsdk.IL.bg.bg;

/* JADX INFO: loaded from: classes3.dex */
public class tC implements com.bytedance.adsdk.IL.bg.IL.bg.InterfaceC0076bg, com.bytedance.adsdk.IL.bg.bg.bX {
    private final boolean IL;
    private final java.util.List<com.bytedance.adsdk.IL.bg.IL.bg.InterfaceC0076bg> bX = new java.util.ArrayList();
    private final java.lang.String bg;
    private final com.bytedance.adsdk.IL.bX.IL.Fy.bg eqN;
    private final com.bytedance.adsdk.IL.bg.IL.bg<?, java.lang.Float> iR;
    private final com.bytedance.adsdk.IL.bg.IL.bg<?, java.lang.Float> ldr;
    private final com.bytedance.adsdk.IL.bg.IL.bg<?, java.lang.Float> zx;

    @Override // com.bytedance.adsdk.IL.bg.bg.bX
    public void bg(java.util.List<com.bytedance.adsdk.IL.bg.bg.bX> list, java.util.List<com.bytedance.adsdk.IL.bg.bg.bX> list2) {
    }

    public tC(com.bytedance.adsdk.IL.bX.bX.bg bgVar, com.bytedance.adsdk.IL.bX.IL.Fy fy) {
        this.bg = fy.bg();
        this.IL = fy.ldr();
        this.eqN = fy.IL();
        com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Float, java.lang.Float> bgVarBg = fy.eqN().bg();
        this.zx = bgVarBg;
        com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Float, java.lang.Float> bgVarBg2 = fy.bX().bg();
        this.ldr = bgVarBg2;
        com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Float, java.lang.Float> bgVarBg3 = fy.zx().bg();
        this.iR = bgVarBg3;
        bgVar.bg(bgVarBg);
        bgVar.bg(bgVarBg2);
        bgVar.bg(bgVarBg3);
        bgVarBg.bg(this);
        bgVarBg2.bg(this);
        bgVarBg3.bg(this);
    }

    @Override // com.bytedance.adsdk.IL.bg.IL.bg.InterfaceC0076bg
    public void bg() {
        for (int i = 0; i < this.bX.size(); i++) {
            this.bX.get(i).bg();
        }
    }

    void bg(com.bytedance.adsdk.IL.bg.IL.bg.InterfaceC0076bg interfaceC0076bg) {
        this.bX.add(interfaceC0076bg);
    }

    com.bytedance.adsdk.IL.bX.IL.Fy.bg IL() {
        return this.eqN;
    }

    public com.bytedance.adsdk.IL.bg.IL.bg<?, java.lang.Float> bX() {
        return this.zx;
    }

    public com.bytedance.adsdk.IL.bg.IL.bg<?, java.lang.Float> eqN() {
        return this.ldr;
    }

    public com.bytedance.adsdk.IL.bg.IL.bg<?, java.lang.Float> zx() {
        return this.iR;
    }

    public boolean ldr() {
        return this.IL;
    }
}

package com.bykv.vk.openvk.bg.bg.IL.IL.zx;

/* JADX INFO: loaded from: classes3.dex */
public class ldr extends com.bykv.vk.openvk.bg.bg.IL.IL.zx.bg {
    private com.bytedance.sdk.component.IL.bg.Lq bX;

    public ldr(com.bytedance.sdk.component.IL.bg.Lq lq, com.bykv.vk.openvk.bg.bg.IL.IL.zx.zx zxVar) {
        com.bytedance.sdk.component.IL.bg.ldr ldrVarIR;
        this.bX = lq;
        this.bg = new java.util.ArrayList();
        if (lq != null && (ldrVarIR = lq.iR()) != null) {
            for (int i = 0; i < ldrVarIR.bg(); i++) {
                this.bg.add(new com.bykv.vk.openvk.bg.bg.IL.IL.WR.IL(ldrVarIR.bg(i), ldrVarIR.IL(i)));
            }
        }
        this.IL = zxVar;
    }

    @Override // com.bykv.vk.openvk.bg.bg.IL.IL.zx.bg
    public int bg() {
        return this.bX.bX();
    }

    @Override // com.bykv.vk.openvk.bg.bg.IL.IL.zx.bg
    public boolean IL() {
        return this.bX.bX() >= 200 && this.bX.bX() < 300;
    }

    @Override // com.bykv.vk.openvk.bg.bg.IL.IL.zx.bg
    public java.lang.String bg(java.lang.String str, java.lang.String str2) {
        return bg(str) != null ? bg(str).IL : str2;
    }

    @Override // com.bykv.vk.openvk.bg.bg.IL.IL.zx.bg
    public java.util.List<com.bykv.vk.openvk.bg.bg.IL.IL.WR.IL> bX() {
        return this.bg;
    }

    @Override // com.bykv.vk.openvk.bg.bg.IL.IL.zx.bg
    public java.io.InputStream eqN() {
        return this.bX.ldr().bX();
    }

    @Override // com.bykv.vk.openvk.bg.bg.IL.IL.zx.bg
    public java.lang.String zx() {
        com.bytedance.sdk.component.IL.bg.Lq lq = this.bX;
        return (lq == null || lq.Kg() == null) ? "http/1.1" : this.bX.Kg().toString();
    }

    @Override // com.bykv.vk.openvk.bg.bg.IL.IL.zx.bg
    public java.lang.String ldr() {
        return bg(this.bX.bX());
    }
}

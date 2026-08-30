package com.bytedance.adsdk.ugeno.eqN.IL;

/* JADX INFO: loaded from: classes3.dex */
public class IL extends com.bytedance.adsdk.ugeno.eqN.IL.bg {
    private java.util.List<com.bytedance.adsdk.ugeno.eqN.bg.eqN> Kg;

    public IL(com.bytedance.adsdk.ugeno.IL.bX bXVar, java.lang.String str, com.bytedance.adsdk.ugeno.eqN.IL.bg bgVar) {
        super(bXVar, str, bgVar);
        this.Kg = new java.util.concurrent.CopyOnWriteArrayList();
    }

    @Override // com.bytedance.adsdk.ugeno.eqN.IL.bg
    public void bg() {
        com.bytedance.adsdk.ugeno.eqN.bg.bX bXVarBg;
        if (this.ldr == null || this.ldr.size() <= 0) {
            return;
        }
        java.lang.String str = this.ldr.get("name");
        com.bytedance.adsdk.ugeno.eqN.bg.bg bgVarLKE = this.bX.LKE();
        if (bgVarLKE == null || (bXVarBg = bgVarLKE.bg(str)) == null) {
            return;
        }
        bXVarBg.bg(str);
    }
}

package com.bytedance.adsdk.bg.IL.IL.bg;

/* JADX INFO: loaded from: classes3.dex */
public class ldr extends com.bytedance.adsdk.bg.IL.IL.bg.VzQ {
    public ldr() {
        super(com.bytedance.adsdk.bg.IL.eqN.bX.GT);
    }

    @Override // com.bytedance.adsdk.bg.IL.IL.bg
    public java.lang.Object bg(java.util.Map<java.lang.String, org.json.JSONObject> map) {
        java.lang.Object objBg;
        java.lang.Object objBg2 = this.bg.bg(map);
        if (objBg2 == null || (objBg = this.IL.bg(map)) == null) {
            return null;
        }
        return com.bytedance.adsdk.bg.IL.zx.bg.bX.bg(objBg2, (java.lang.Number) objBg);
    }
}

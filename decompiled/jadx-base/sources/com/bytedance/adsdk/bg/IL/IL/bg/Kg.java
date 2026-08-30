package com.bytedance.adsdk.bg.IL.IL.bg;

/* JADX INFO: loaded from: classes3.dex */
public class Kg extends com.bytedance.adsdk.bg.IL.IL.bg.VzQ {
    public Kg() {
        super(com.bytedance.adsdk.bg.IL.eqN.bX.LT_EQ);
    }

    @Override // com.bytedance.adsdk.bg.IL.IL.bg
    public java.lang.Object bg(java.util.Map<java.lang.String, org.json.JSONObject> map) {
        java.lang.Object objBg;
        java.lang.Object objBg2 = this.bg.bg(map);
        if (objBg2 == null || (objBg = this.IL.bg(map)) == null) {
            return null;
        }
        return java.lang.Boolean.valueOf(!((java.lang.Boolean) com.bytedance.adsdk.bg.IL.zx.bg.bX.bg(objBg2, (java.lang.Number) objBg)).booleanValue());
    }
}

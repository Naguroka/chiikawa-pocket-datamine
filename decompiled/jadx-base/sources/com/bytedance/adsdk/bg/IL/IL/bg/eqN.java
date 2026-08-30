package com.bytedance.adsdk.bg.IL.IL.bg;

/* JADX INFO: loaded from: classes3.dex */
public class eqN extends com.bytedance.adsdk.bg.IL.IL.bg.VzQ {
    public eqN() {
        super(com.bytedance.adsdk.bg.IL.eqN.bX.EQ);
    }

    @Override // com.bytedance.adsdk.bg.IL.IL.bg
    public java.lang.Object bg(java.util.Map<java.lang.String, org.json.JSONObject> map) {
        java.lang.Object objBg = this.bg.bg(map);
        java.lang.Object objBg2 = this.IL.bg(map);
        if (objBg == null && objBg2 == null) {
            return java.lang.Boolean.TRUE;
        }
        if (objBg == null && objBg2 != null) {
            return java.lang.Boolean.FALSE;
        }
        if (objBg != null && objBg2 == null) {
            return java.lang.Boolean.FALSE;
        }
        if ((objBg instanceof java.lang.Number) && (objBg2 instanceof java.lang.Number)) {
            return java.lang.Boolean.valueOf(com.bytedance.adsdk.bg.IL.zx.bg.IL.bg((java.lang.Number) objBg, (java.lang.Number) objBg2));
        }
        return java.lang.Boolean.valueOf(objBg.equals(objBg2));
    }
}

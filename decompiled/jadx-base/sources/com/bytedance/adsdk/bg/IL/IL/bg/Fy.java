package com.bytedance.adsdk.bg.IL.IL.bg;

/* JADX INFO: loaded from: classes3.dex */
public class Fy implements com.bytedance.adsdk.bg.IL.IL.IL {
    private com.bytedance.adsdk.bg.IL.IL.bg IL;
    private com.bytedance.adsdk.bg.IL.IL.bg bX;
    private com.bytedance.adsdk.bg.IL.IL.bg bg;

    @Override // com.bytedance.adsdk.bg.IL.IL.bg
    public java.lang.Object bg(java.util.Map<java.lang.String, org.json.JSONObject> map) {
        java.lang.Object objBg = this.bg.bg(map);
        if (objBg == null) {
            return null;
        }
        if (((java.lang.Boolean) objBg).booleanValue()) {
            return this.IL.bg(map);
        }
        return this.bX.bg(map);
    }

    @Override // com.bytedance.adsdk.bg.IL.IL.bg
    public com.bytedance.adsdk.bg.IL.eqN.zx bg() {
        return com.bytedance.adsdk.bg.IL.eqN.ldr.OPERATOR_RESULT;
    }

    @Override // com.bytedance.adsdk.bg.IL.IL.IL
    public void bg(com.bytedance.adsdk.bg.IL.IL.bg bgVar) {
        this.bg = bgVar;
    }

    @Override // com.bytedance.adsdk.bg.IL.IL.IL
    public void IL(com.bytedance.adsdk.bg.IL.IL.bg bgVar) {
        this.IL = bgVar;
    }

    @Override // com.bytedance.adsdk.bg.IL.IL.IL
    public void bX(com.bytedance.adsdk.bg.IL.IL.bg bgVar) {
        this.bX = bgVar;
    }

    @Override // com.bytedance.adsdk.bg.IL.IL.bg
    public java.lang.String IL() {
        return this.bg.IL() + "?" + this.IL.IL() + ":" + this.bX.IL();
    }

    public java.lang.String toString() {
        return IL();
    }
}

package com.bytedance.adsdk.ugeno.core.IL;

/* JADX INFO: loaded from: classes3.dex */
public class bg implements com.bytedance.adsdk.ugeno.iR.WR.bg {
    private com.bytedance.adsdk.ugeno.core.PX IL;
    private android.content.Context bX;
    private int bg;
    private com.bytedance.adsdk.ugeno.core.eo eqN;
    private android.os.Handler ldr = new com.bytedance.adsdk.ugeno.iR.WR(android.os.Looper.getMainLooper(), this);
    private com.bytedance.adsdk.ugeno.IL.bX zx;

    public bg(android.content.Context context, com.bytedance.adsdk.ugeno.core.eo eoVar, com.bytedance.adsdk.ugeno.IL.bX bXVar) {
        this.bX = context;
        this.eqN = eoVar;
        this.zx = bXVar;
    }

    public void bg(com.bytedance.adsdk.ugeno.core.PX px) {
        this.IL = px;
    }

    public void bg() {
        com.bytedance.adsdk.ugeno.core.eo eoVar = this.eqN;
        if (eoVar == null) {
            return;
        }
        try {
            int i = java.lang.Integer.parseInt(com.bytedance.adsdk.ugeno.bX.IL.bg(eoVar.bX().optString("delay"), this.zx.eo()));
            this.bg = i;
            this.ldr.sendEmptyMessageDelayed(1001, i);
        } catch (java.lang.NumberFormatException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.iR.WR.bg
    public void bg(android.os.Message message) {
        if (message.what != 1001) {
            return;
        }
        org.json.JSONObject jSONObjectBX = this.eqN.bX();
        if (android.text.TextUtils.equals(jSONObjectBX.optString("type"), "onAnimation")) {
            java.lang.String strOptString = jSONObjectBX.optString("nodeId");
            com.bytedance.adsdk.ugeno.IL.bX bXVar = this.zx;
            com.bytedance.adsdk.ugeno.IL.bX bXVarBX = bXVar.IL(bXVar).bX(strOptString);
            new com.bytedance.adsdk.ugeno.core.iR(bXVarBX.WR(), com.bytedance.adsdk.ugeno.core.bg.bg(jSONObjectBX.optJSONObject("animatorSet"), bXVarBX)).bg();
        } else {
            com.bytedance.adsdk.ugeno.core.PX px = this.IL;
            if (px != null) {
                com.bytedance.adsdk.ugeno.core.eo eoVar = this.eqN;
                com.bytedance.adsdk.ugeno.IL.bX bXVar2 = this.zx;
                px.bg(eoVar, bXVar2, bXVar2);
            }
        }
        this.ldr.removeMessages(1001);
    }
}

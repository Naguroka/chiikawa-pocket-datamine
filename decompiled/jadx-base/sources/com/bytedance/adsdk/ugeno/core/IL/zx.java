package com.bytedance.adsdk.ugeno.core.IL;

/* JADX INFO: loaded from: classes3.dex */
public class zx implements com.bytedance.adsdk.ugeno.iR.WR.bg {
    private int IL;
    private com.bytedance.adsdk.ugeno.core.PX bX;
    private boolean bg;
    private android.content.Context eqN;
    private android.os.Handler iR = new com.bytedance.adsdk.ugeno.iR.WR(android.os.Looper.getMainLooper(), this);
    private com.bytedance.adsdk.ugeno.IL.bX ldr;
    private com.bytedance.adsdk.ugeno.core.eo zx;

    public zx(android.content.Context context, com.bytedance.adsdk.ugeno.core.eo eoVar, com.bytedance.adsdk.ugeno.IL.bX bXVar) {
        this.eqN = context;
        this.zx = eoVar;
        this.ldr = bXVar;
    }

    public void bg(com.bytedance.adsdk.ugeno.core.PX px) {
        this.bX = px;
    }

    public void bg() {
        com.bytedance.adsdk.ugeno.core.eo eoVar = this.zx;
        if (eoVar == null) {
            return;
        }
        org.json.JSONObject jSONObjectBX = eoVar.bX();
        try {
            this.IL = java.lang.Integer.parseInt(com.bytedance.adsdk.ugeno.bX.IL.bg(jSONObjectBX.optString("interval", "8000"), this.ldr.eo()));
            this.bg = jSONObjectBX.optBoolean("repeat");
            this.iR.sendEmptyMessageDelayed(1001, this.IL);
        } catch (java.lang.NumberFormatException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.iR.WR.bg
    public void bg(android.os.Message message) {
        if (message.what != 1001) {
            return;
        }
        com.bytedance.adsdk.ugeno.core.PX px = this.bX;
        if (px != null) {
            com.bytedance.adsdk.ugeno.core.eo eoVar = this.zx;
            com.bytedance.adsdk.ugeno.IL.bX bXVar = this.ldr;
            px.bg(eoVar, bXVar, bXVar);
        }
        if (this.bg) {
            this.iR.sendEmptyMessageDelayed(1001, this.IL);
        } else {
            this.iR.removeMessages(1001);
        }
    }
}

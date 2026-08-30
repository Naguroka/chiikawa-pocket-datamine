package com.bytedance.sdk.openadsdk.eqN.zx.IL;

/* JADX INFO: loaded from: classes4.dex */
public class yDt implements com.bytedance.sdk.openadsdk.eqN.zx.IL.bX {
    private long IL;
    private final int bX;
    private long bg;
    private final int eqN;
    private final java.lang.String zx;

    public yDt(com.bykv.vk.openvk.bg.bg.bg.bX.bg bgVar) {
        this.bX = bgVar.bg();
        this.eqN = bgVar.IL();
        this.zx = bgVar.bX();
    }

    public void bg(long j) {
        this.bg = j;
    }

    public void IL(long j) {
        this.IL = j;
    }

    @Override // com.bytedance.sdk.openadsdk.eqN.zx.IL.bX
    public void bg(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.bg);
            jSONObject.put("total_duration", this.IL);
            jSONObject.put("error_code", this.bX);
            jSONObject.put("extra_error_code", this.eqN);
            jSONObject.put("error_message", this.zx);
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("PlayErrorModel", th.getMessage());
        }
    }
}

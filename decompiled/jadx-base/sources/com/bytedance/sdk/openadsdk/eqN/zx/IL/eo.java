package com.bytedance.sdk.openadsdk.eqN.zx.IL;

/* JADX INFO: loaded from: classes4.dex */
public class eo implements com.bytedance.sdk.openadsdk.eqN.zx.IL.bX {
    private long IL;
    private long bX;
    private java.lang.String bg;
    private int eqN;
    private java.lang.String ldr;
    private java.lang.String zx;

    public void bg(java.lang.String str) {
        this.bg = str;
    }

    public void bg(long j) {
        this.IL = j;
    }

    public void IL(long j) {
        this.bX = j;
    }

    public void bg(int i) {
        this.eqN = i;
    }

    public void IL(java.lang.String str) {
        this.zx = str;
    }

    public void bX(java.lang.String str) {
        this.ldr = str;
    }

    @Override // com.bytedance.sdk.openadsdk.eqN.zx.IL.bX
    public void bg(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("preload_url", this.bg);
            jSONObject.put("preload_size", this.IL);
            jSONObject.put("load_time", this.bX);
            jSONObject.put("error_code", this.eqN);
            jSONObject.put("error_message", this.zx);
            jSONObject.put("error_message_server", this.ldr);
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("LoadVideoErrorModel", th.getMessage());
        }
    }
}

package com.bytedance.sdk.openadsdk.eqN.zx.IL;

/* JADX INFO: loaded from: classes4.dex */
public class PX implements com.bytedance.sdk.openadsdk.eqN.zx.IL.bX {
    private long IL;
    private long bX;
    private java.lang.String bg;
    private long eqN;

    public void bg(java.lang.String str) {
        this.bg = str;
    }

    public void bg(long j) {
        this.IL = j;
    }

    public void IL(long j) {
        this.bX = j;
    }

    public void bX(long j) {
        this.eqN = j;
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
            jSONObject.put("local_cache", this.eqN);
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("LoadVideoSuccessModel", th.getMessage());
        }
    }
}

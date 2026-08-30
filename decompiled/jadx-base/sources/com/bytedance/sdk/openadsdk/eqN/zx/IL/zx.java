package com.bytedance.sdk.openadsdk.eqN.zx.IL;

/* JADX INFO: loaded from: classes4.dex */
public class zx implements com.bytedance.sdk.openadsdk.eqN.zx.IL.bX {
    private long IL;
    private long bg;

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
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("FeedContinueModel", th.getMessage());
        }
    }
}

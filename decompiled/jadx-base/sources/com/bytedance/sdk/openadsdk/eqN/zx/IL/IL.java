package com.bytedance.sdk.openadsdk.eqN.zx.IL;

/* JADX INFO: loaded from: classes4.dex */
public class IL implements com.bytedance.sdk.openadsdk.eqN.zx.IL.bX {
    private long IL;
    private int bX;
    private long bg;
    private int eqN;

    public void bg(long j) {
        this.bg = j;
    }

    public void IL(long j) {
        this.IL = j;
    }

    public void bg(int i) {
        this.bX = i;
    }

    public void IL(int i) {
        this.eqN = i;
    }

    @Override // com.bytedance.sdk.openadsdk.eqN.zx.IL.bX
    public void bg(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.bg);
            jSONObject.put("total_duration", this.IL);
            jSONObject.put("vbtt_skip_type", this.bX);
            jSONObject.put("skip_reason", this.eqN);
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("EndcardSkipModel", th.getMessage());
        }
    }
}

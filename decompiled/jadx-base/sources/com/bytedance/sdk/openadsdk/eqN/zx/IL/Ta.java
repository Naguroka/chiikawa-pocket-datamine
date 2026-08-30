package com.bytedance.sdk.openadsdk.eqN.zx.IL;

/* JADX INFO: loaded from: classes4.dex */
public class Ta implements com.bytedance.sdk.openadsdk.eqN.zx.IL.bX {
    public int IL;
    public long bX;
    public long bg;

    public void bg(long j) {
        this.bg = j;
    }

    public void bg(int i) {
        this.IL = i;
    }

    public void IL(long j) {
        this.bX = j;
    }

    @Override // com.bytedance.sdk.openadsdk.eqN.zx.IL.bX
    public void bg(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.bg);
            jSONObject.put("buffers_count", this.IL);
            jSONObject.put("total_duration", this.bX);
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("PlayBufferModel", th.getMessage());
        }
    }
}

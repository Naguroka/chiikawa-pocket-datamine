package com.bytedance.sdk.openadsdk.eqN.zx.IL;

/* JADX INFO: loaded from: classes4.dex */
public class ldr implements com.bytedance.sdk.openadsdk.eqN.zx.IL.bX {
    private long IL;
    private int bX = 0;
    private long bg;

    public void bg(long j) {
        this.bg = j;
    }

    public void IL(long j) {
        this.IL = j;
    }

    public void bg(int i) {
        this.bX = i;
    }

    @Override // com.bytedance.sdk.openadsdk.eqN.zx.IL.bX
    public void bg(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("total_duration", this.bg);
            jSONObject.put("buffers_time", this.IL);
            jSONObject.put("video_backup", this.bX);
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("FeedOverModel", th.getMessage());
        }
    }
}

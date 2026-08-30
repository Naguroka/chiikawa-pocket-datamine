package com.bytedance.sdk.openadsdk.eqN.zx.IL;

/* JADX INFO: loaded from: classes4.dex */
public class eqN implements com.bytedance.sdk.openadsdk.eqN.zx.IL.bX {
    public long IL;
    public int bX;
    public long bg;
    public int eqN = 0;

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
            jSONObject.put("total_duration", this.bg);
            jSONObject.put("buffers_time", this.IL);
            jSONObject.put("break_reason", this.bX);
            jSONObject.put("video_backup", this.eqN);
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("FeedBreakModel", th.getMessage());
        }
    }
}

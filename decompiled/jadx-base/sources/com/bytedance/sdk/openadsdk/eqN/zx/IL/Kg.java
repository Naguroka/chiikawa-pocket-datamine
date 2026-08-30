package com.bytedance.sdk.openadsdk.eqN.zx.IL;

/* JADX INFO: loaded from: classes4.dex */
public class Kg implements com.bytedance.sdk.openadsdk.eqN.zx.IL.bX {
    private long IL;
    private int bX;
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
            jSONObject.put("video_start_duration", this.bg);
            jSONObject.put("video_cache_size", this.IL);
            jSONObject.put("is_auto_play", this.bX);
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("FeedPlayModel", th.getMessage());
        }
    }
}

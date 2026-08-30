package com.bytedance.sdk.openadsdk.eqN.zx.IL;

/* JADX INFO: loaded from: classes4.dex */
public class WR implements com.bytedance.sdk.openadsdk.eqN.zx.IL.bX {
    private final long IL;
    private final java.lang.String bg;

    public WR(java.lang.String str, long j) {
        this.bg = str;
        this.IL = j;
    }

    @Override // com.bytedance.sdk.openadsdk.eqN.zx.IL.bX
    public void bg(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("preload_url", this.bg);
            jSONObject.put("preload_size", this.IL);
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("LoadVideoCancelModel", th.getMessage());
        }
    }
}

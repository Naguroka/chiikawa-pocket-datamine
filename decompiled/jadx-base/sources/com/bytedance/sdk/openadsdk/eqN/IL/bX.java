package com.bytedance.sdk.openadsdk.eqN.IL;

/* JADX INFO: loaded from: classes4.dex */
public class bX implements com.bytedance.sdk.openadsdk.eqN.IL.IL {
    com.bytedance.sdk.openadsdk.eqN.IL.IL bg;

    @Override // com.bytedance.sdk.openadsdk.eqN.IL.IL
    public void bg(org.json.JSONObject jSONObject, long j) throws org.json.JSONException {
        com.bytedance.sdk.openadsdk.eqN.IL.IL il = this.bg;
        if (il != null) {
            il.bg(jSONObject, j);
        }
        if (j <= 0) {
            j = java.lang.System.currentTimeMillis();
        }
        jSONObject.put("event_ts", j);
    }
}

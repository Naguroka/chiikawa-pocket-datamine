package com.bytedance.sdk.openadsdk.core.settings;

/* JADX INFO: loaded from: classes4.dex */
public class bg extends com.bytedance.sdk.openadsdk.core.settings.Lq {
    public bg() {
        super("tt_set_apm.prop", new com.bytedance.sdk.openadsdk.core.settings.Lq.bg() { // from class: com.bytedance.sdk.openadsdk.core.settings.bg.1
            @Override // com.bytedance.sdk.openadsdk.core.settings.Lq.bg
            public void IL() {
            }

            @Override // com.bytedance.sdk.openadsdk.core.settings.Lq.bg
            public void bg() {
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.zx
    public void bg(org.json.JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.settings.zx.bg bgVarBg = bg();
        if (jSONObject.has("apm_url")) {
            bgVarBg.bg("apm_url", jSONObject.optString("apm_url"));
        }
        if (jSONObject.has("perf_con")) {
            try {
                org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("perf_con");
                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.has("perf_con_apm")) {
                    bgVarBg.bg("perf_con_apm", jSONObjectOptJSONObject.optInt("perf_con_apm"));
                }
            } catch (java.lang.Exception unused) {
            }
        }
        bgVarBg.bg();
        eqN();
    }
}

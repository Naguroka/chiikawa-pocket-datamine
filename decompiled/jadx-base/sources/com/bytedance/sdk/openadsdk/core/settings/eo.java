package com.bytedance.sdk.openadsdk.core.settings;

/* JADX INFO: loaded from: classes4.dex */
public class eo extends com.bytedance.sdk.openadsdk.core.settings.Lq {
    public eo() {
        super("tt_set_mediation.prop", null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.zx
    public void bg(org.json.JSONObject jSONObject) {
        if (jSONObject.has("mediation_init_conf")) {
            com.bytedance.sdk.openadsdk.core.settings.zx.bg bgVarBg = bg();
            bgVarBg.bg("mediation_init_conf", jSONObject.optString("mediation_init_conf"));
            bgVarBg.bg();
            eqN();
        }
    }
}

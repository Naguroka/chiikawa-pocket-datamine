package com.bytedance.sdk.openadsdk.core.settings;

/* JADX INFO: loaded from: classes4.dex */
public class WR {
    public static final com.bytedance.sdk.openadsdk.core.settings.WR bg = new com.bytedance.sdk.openadsdk.core.settings.WR("");
    private final java.util.HashMap<java.lang.String, com.bytedance.sdk.openadsdk.core.settings.WR.bg> IL = new java.util.HashMap<>();

    public WR(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                org.json.JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    com.bytedance.sdk.openadsdk.core.settings.WR.bg bgVar = new com.bytedance.sdk.openadsdk.core.settings.WR.bg(jSONObjectOptJSONObject);
                    this.IL.put(bgVar.bg, bgVar);
                }
            }
        } catch (org.json.JSONException e) {
            com.bytedance.sdk.component.utils.PX.bg("MediationInitConfigs", e.getMessage());
        }
    }

    public static class bg {
        public java.lang.String IL;
        public int bX;
        public final java.lang.String bg;
        public int eqN;
        public java.lang.String zx;

        public bg(org.json.JSONObject jSONObject) {
            this.bg = jSONObject.optString("name");
            this.IL = jSONObject.optString("app_id");
            this.bX = jSONObject.optInt("init_thread", 2);
            this.eqN = jSONObject.optInt("request_after_init", 2);
            this.zx = jSONObject.optString("class_name");
        }
    }
}

package com.bytedance.sdk.openadsdk.core.model;

/* JADX INFO: loaded from: classes4.dex */
public class Ja {
    private java.lang.String IL;
    private java.lang.String bX;
    private java.lang.String bg;
    private java.lang.String eqN;
    private org.json.JSONObject zx;

    public java.lang.String bg() {
        return this.bg;
    }

    public java.lang.String IL() {
        return this.IL;
    }

    public java.lang.String bX() {
        return this.bX;
    }

    public java.lang.String eqN() {
        return this.eqN;
    }

    public org.json.JSONObject zx() {
        return this.zx;
    }

    public static com.bytedance.sdk.openadsdk.core.model.Ja bg(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.model.Ja ja = new com.bytedance.sdk.openadsdk.core.model.Ja();
        ja.bg = jSONObject.optString("id");
        ja.eqN = jSONObject.optString("data");
        ja.bX = jSONObject.optString("url");
        ja.IL = jSONObject.optString("md5");
        ja.zx = jSONObject.optJSONObject("custom_components");
        return ja;
    }

    public org.json.JSONObject ldr() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("id", this.bg);
            jSONObject.put("md5", this.IL);
            jSONObject.put("url", this.bX);
            jSONObject.put("data", this.eqN);
            jSONObject.put("custom_components", this.zx);
        } catch (org.json.JSONException unused) {
        }
        return jSONObject;
    }
}

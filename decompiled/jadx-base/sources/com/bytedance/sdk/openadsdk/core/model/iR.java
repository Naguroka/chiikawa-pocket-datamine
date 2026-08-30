package com.bytedance.sdk.openadsdk.core.model;

/* JADX INFO: loaded from: classes4.dex */
public class iR {
    private java.util.List<java.lang.String> IL;
    private java.lang.String bg;

    public iR(java.lang.String str) {
        this.bg = "";
        this.IL = new java.util.ArrayList();
        java.util.HashMap<java.lang.String, java.lang.Object> map = android.text.TextUtils.isEmpty(str) ? new java.util.HashMap<>() : bg(str);
        try {
            this.bg = (java.lang.String) map.get("auto_test_param");
            org.json.JSONArray jSONArray = new org.json.JSONArray((java.lang.String) map.get("auto_test_hosts"));
            this.IL = new java.util.ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                this.IL.add(jSONArray.optString(i));
            }
        } catch (java.lang.Exception e) {
            com.bytedance.sdk.component.utils.PX.bg("AutoTestModel", e.getMessage());
        }
    }

    public java.lang.String bg() {
        return this.bg;
    }

    public java.util.List<java.lang.String> IL() {
        return this.IL;
    }

    private static final java.util.HashMap<java.lang.String, java.lang.Object> bg(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return new java.util.HashMap<>();
        }
        java.util.HashMap<java.lang.String, java.lang.Object> map = new java.util.HashMap<>();
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                org.json.JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                map.put(jSONObjectOptJSONObject.optString("name"), jSONObjectOptJSONObject.optString("value"));
            }
            return map;
        } catch (java.lang.Exception unused) {
            return new java.util.HashMap<>();
        }
    }
}

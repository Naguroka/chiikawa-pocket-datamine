package com.bytedance.sdk.component.adexpress.dynamic.eqN;

/* JADX INFO: loaded from: classes3.dex */
public class eqN {
    public java.lang.String IL;
    public java.lang.String bX;
    public java.util.List<com.bytedance.sdk.component.adexpress.dynamic.eqN.eqN.bg> bg;
    public java.lang.String eqN;

    public static class bg {
        public org.json.JSONObject IL;
        public int bg;
    }

    public static com.bytedance.sdk.component.adexpress.dynamic.eqN.eqN bg(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.component.adexpress.dynamic.eqN.eqN eqn = new com.bytedance.sdk.component.adexpress.dynamic.eqN.eqN();
        java.lang.String strOptString = jSONObject.optString("custom_components");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(strOptString);
            for (int i = 0; i < jSONArray.length(); i++) {
                org.json.JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    com.bytedance.sdk.component.adexpress.dynamic.eqN.eqN.bg bgVar = new com.bytedance.sdk.component.adexpress.dynamic.eqN.eqN.bg();
                    bgVar.bg = jSONObjectOptJSONObject.optInt("id");
                    bgVar.IL = new org.json.JSONObject(jSONObjectOptJSONObject.optString("componentLayout"));
                    arrayList.add(bgVar);
                }
            }
        } catch (org.json.JSONException unused) {
        }
        eqn.bg = arrayList;
        eqn.IL = jSONObject.optString("diff_data");
        eqn.bX = jSONObject.optString("style_diff");
        eqn.eqN = jSONObject.optString("tag_diff");
        return eqn;
    }
}

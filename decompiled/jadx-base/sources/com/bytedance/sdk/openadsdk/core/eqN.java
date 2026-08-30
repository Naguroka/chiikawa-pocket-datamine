package com.bytedance.sdk.openadsdk.core;

/* JADX INFO: loaded from: classes4.dex */
public class eqN {
    public static void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str, int i, org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new org.json.JSONObject();
        }
        try {
            jSONObject.put("type", i);
        } catch (org.json.JSONException unused) {
        }
        com.bytedance.sdk.openadsdk.eqN.bX.IL(tuv, str, "convert_track", jSONObject);
    }
}

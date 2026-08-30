package com.bytedance.sdk.openadsdk.core.Ta.bX;

/* JADX INFO: loaded from: classes4.dex */
public class IL {
    public static void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        if (com.bytedance.sdk.openadsdk.core.model.rri.IL(tuv)) {
            com.bytedance.sdk.openadsdk.eqN.bX.IL(tuv, "playable_preload", "preload_start", (org.json.JSONObject) null);
        }
    }

    public static void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, long j, long j2) {
        if (tuv != null) {
            if (com.bytedance.sdk.openadsdk.core.model.rri.bX(tuv) || com.bytedance.sdk.openadsdk.core.model.rri.IL(tuv)) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put("loadzip_success_time", j);
                    jSONObject.put("unzip_success_time", j2);
                } catch (org.json.JSONException e) {
                    com.bytedance.sdk.component.utils.PX.bg("PlayableEvent", "onSuccess json error", e);
                }
                com.bytedance.sdk.openadsdk.eqN.bX.IL(tuv, "playable_preload", "preload_success", jSONObject);
            }
        }
    }

    public static void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, int i, java.lang.String str) {
        if (tuv != null) {
            if (com.bytedance.sdk.openadsdk.core.model.rri.bX(tuv) || com.bytedance.sdk.openadsdk.core.model.rri.IL(tuv)) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put("error_code", i);
                    jSONObject.put("error_reason", str);
                } catch (org.json.JSONException e) {
                    com.bytedance.sdk.component.utils.PX.bg("PlayableEvent", "onFail json error", e);
                }
                com.bytedance.sdk.openadsdk.eqN.bX.IL(tuv, "playable_preload", "preload_fail", jSONObject);
            }
        }
    }
}

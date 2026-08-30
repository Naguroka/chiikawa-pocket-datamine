package com.bytedance.sdk.openadsdk.core.Kg;

/* JADX INFO: loaded from: classes4.dex */
public class VB {
    public static void bg(java.lang.String str, int i, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        if (android.text.TextUtils.isEmpty(str2)) {
            str2 = com.bytedance.sdk.openadsdk.core.Kg.bg(i);
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("render_source", str);
            com.bytedance.sdk.openadsdk.core.model.tuV.bg bgVarLKE = tuv.LKE();
            if (bgVarLKE != null) {
                jSONObject.put("tpl_id", bgVarLKE.ldr());
                if ("Web".equals(str)) {
                    if (bgVarLKE.yDt()) {
                        jSONObject.put("engine_version", "v3");
                    } else {
                        jSONObject.put("engine_version", "v1");
                    }
                }
            } else if (tuv.uu() != null) {
                jSONObject.put("tpl_id", tuv.uu().bg());
                if ("Web".equals(str)) {
                    jSONObject.put("engine_version", "v3");
                }
            }
        } catch (java.lang.Exception unused) {
        }
        com.bytedance.sdk.openadsdk.yDt.bX.bg().bg(com.bytedance.sdk.openadsdk.yDt.bg.eqN.IL().bg(bg(str3)).bX(str4).zx(tuv != null ? tuv.waE() : "").IL(i).IL(jSONObject.toString()).ldr(str2));
    }

    private static int bg(java.lang.String str) {
        str.hashCode();
        switch (str) {
            case "banner_ad":
                return 1;
            case "rewarded_video":
                return 7;
            case "open_ad":
                return 3;
            case "fullscreen_interstitial_ad":
                return 8;
            case "interaction":
                return 2;
            default:
                return 5;
        }
    }
}

package com.bytedance.sdk.openadsdk.component.iR;

/* JADX INFO: loaded from: classes4.dex */
public class bg {
    public static java.io.File bg(java.lang.String str) {
        return new java.io.File(com.bytedance.sdk.openadsdk.CacheDirFactory.getICacheDir(0).IL() + java.io.File.separator + str);
    }

    public static java.lang.String bg() {
        return com.bytedance.sdk.openadsdk.utils.eo.bg();
    }

    public static java.io.File IL(java.lang.String str) {
        return bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(), com.bytedance.sdk.openadsdk.component.ldr.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg()).IL(), str);
    }

    public static java.io.File bg(android.content.Context context, java.lang.String str, java.lang.String str2) {
        return com.bytedance.sdk.component.utils.ldr.bg(context, com.bytedance.sdk.openadsdk.multipro.IL.bX(), str, str2);
    }

    public static void bg(java.io.File file) {
        if (file == null) {
            return;
        }
        try {
            com.bytedance.sdk.component.utils.ldr.IL(file);
        } catch (java.lang.Throwable unused) {
        }
    }

    public static void bg(android.content.Context context) {
        try {
            com.bytedance.sdk.openadsdk.component.ldr.bg(context).bg();
        } catch (java.lang.Throwable unused) {
        }
    }

    public static java.lang.String IL() {
        return com.bytedance.sdk.component.utils.ldr.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(), com.bytedance.sdk.openadsdk.multipro.IL.bX(), com.bytedance.sdk.openadsdk.component.ldr.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg()).IL()).getAbsolutePath();
    }

    public static void bg(org.json.JSONObject jSONObject, int i, boolean z) {
        try {
            java.lang.String strLdr = com.bytedance.sdk.openadsdk.core.WR.IL().ldr();
            int iIR = com.bytedance.sdk.openadsdk.core.WR.IL().iR();
            org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("creative");
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("app_name", strLdr);
            if (z) {
                if (com.bytedance.sdk.openadsdk.core.WR.IL().iR() != 0) {
                    jSONObject3.put("app_icon_id", "local://pag_open_icon_id");
                }
            } else {
                jSONObject3.put("app_icon_id", "@".concat(java.lang.String.valueOf(iIR)));
            }
            jSONObject2.put("open_app_info", jSONObject3);
            if (jSONObject2.optJSONObject("video") == null) {
                org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                jSONObject4.put("video_duration", com.bytedance.sdk.openadsdk.core.VzQ.eqN().rri(java.lang.String.valueOf(i)));
                jSONObject2.put("video", jSONObject4);
            }
        } catch (java.lang.Exception e) {
            com.bytedance.sdk.component.utils.PX.bg("TTAppOpenUtils", e.getMessage());
        }
    }

    public static int bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, int i) {
        return i - tuv.KRc();
    }
}

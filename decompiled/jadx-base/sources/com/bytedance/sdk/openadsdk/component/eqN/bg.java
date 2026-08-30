package com.bytedance.sdk.openadsdk.component.eqN;

/* JADX INFO: loaded from: classes4.dex */
public class bg {
    public static void bg(final int i, final int i2) {
        com.bytedance.sdk.openadsdk.yDt.bX.bg("openad_load_ad_timeout", false, new com.bytedance.sdk.openadsdk.yDt.IL() { // from class: com.bytedance.sdk.openadsdk.component.eqN.bg.1
            @Override // com.bytedance.sdk.openadsdk.yDt.IL
            public com.bytedance.sdk.openadsdk.yDt.bg.bX getLogStats() throws java.lang.Exception {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("timeout_type", i);
                jSONObject.put("user_timeout_time", i2);
                return com.bytedance.sdk.openadsdk.yDt.bg.eqN.IL().bg("openad_load_ad_timeout").IL(jSONObject.toString());
            }
        });
    }

    public static void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, int i, int i2, float f) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            bg(jSONObject, tuv);
            jSONObject.put("openad_creative_type", com.bytedance.sdk.openadsdk.core.model.tuV.zx(tuv) ? "video_normal_ad" : "image_normal_ad");
            jSONObject.put("skip_time", i);
            jSONObject.put("skip_show_time", i2);
            jSONObject.put("total_time", f);
        } catch (org.json.JSONException e) {
            com.bytedance.sdk.component.utils.PX.bg("TTAppOpenAdReport", "reportSkip json error", e);
        }
        com.bytedance.sdk.openadsdk.eqN.bX.bg(tuv, "skip", i, jSONObject);
    }

    public static void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, long j, float f, boolean z) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            bg(jSONObject, tuv);
            jSONObject.put("openad_creative_type", com.bytedance.sdk.openadsdk.core.model.tuV.zx(tuv) ? "video_normal_ad" : "image_normal_ad");
            if (z) {
                double d = f;
                jSONObject.put("video_duration", d);
                jSONObject.put("video_percent", (int) (((j * 1.0d) / 10.0d) / d));
            } else {
                jSONObject.put("image_duration", f);
            }
        } catch (org.json.JSONException e) {
            com.bytedance.sdk.component.utils.PX.bg("TTAppOpenAdReport", "reportDestroy json error", e);
        }
        com.bytedance.sdk.openadsdk.eqN.bX.eqN(tuv, "destroy", jSONObject);
    }

    public static void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        com.bytedance.sdk.openadsdk.eqN.bX.eqN(tuv, "cache_expire", (org.json.JSONObject) null);
    }

    public static void IL(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("openad_creative_type", com.bytedance.sdk.openadsdk.core.model.tuV.zx(tuv) ? "video_normal_ad" : "image_normal_ad");
        } catch (org.json.JSONException e) {
            com.bytedance.sdk.component.utils.PX.bg("TTAppOpenAdReport", "reportCacheLoss json error", e);
        }
        com.bytedance.sdk.openadsdk.eqN.bX.eqN(tuv, "cache_loss", jSONObject);
    }

    public static void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, long j, boolean z) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(com.json.j5.u, z ? 1 : 2);
        } catch (org.json.JSONException unused) {
        }
        com.bytedance.sdk.openadsdk.eqN.bX.bg(tuv, "download_image_duration", j, jSONObject);
    }

    public static void IL(com.bytedance.sdk.openadsdk.core.model.tuV tuv, long j, boolean z) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("size", tuv.Dxa().zx());
            jSONObject.put("video_duration", tuv.Dxa().ldr());
            jSONObject.put(com.json.j5.u, z ? 1 : 2);
        } catch (org.json.JSONException unused) {
        }
        com.bytedance.sdk.openadsdk.eqN.bX.bg(tuv, "download_video_duration", j, jSONObject);
    }

    public static void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, int i, com.bytedance.sdk.openadsdk.core.model.JAA jaa) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        long jLdr = 0;
        try {
            jSONObject.put("openad_creative_type", com.bytedance.sdk.openadsdk.core.model.tuV.zx(tuv) ? "video_normal_ad" : "image_normal_ad");
            jSONObject.put("open_ad_cache_type", i);
            if (jaa != null) {
                jaa.IL(com.bytedance.sdk.openadsdk.utils.daV.bg());
                bg(jSONObject, tuv);
                jSONObject.put("client_start_time", jaa.IL());
                jSONObject.put("sever_time", jaa.eqN());
                jSONObject.put("network_time", jaa.bX());
                jSONObject.put("client_end_time", jaa.zx());
                jSONObject.put("download_resource_duration", jaa.iR());
                jSONObject.put("resource_source", jaa.Kg());
                jSONObject.put("is_bidding", jaa.bg ? 1 : 0);
                if (jaa.bg) {
                    jSONObject.put("load_wait_time", jaa.IL);
                }
                jLdr = jaa.ldr();
            }
        } catch (org.json.JSONException e) {
            com.bytedance.sdk.component.utils.PX.bg("TTAppOpenAdReport", "reportLoadNetDuration json error", e);
        }
        com.bytedance.sdk.openadsdk.eqN.bX.bg(tuv, "load_net_duration", jLdr, jSONObject);
    }

    public static void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, long j) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            bg(jSONObject, tuv);
            jSONObject.put("openad_creative_type", com.bytedance.sdk.openadsdk.core.model.tuV.zx(tuv) ? "video_normal_ad" : "image_normal_ad");
        } catch (org.json.JSONException unused) {
            com.bytedance.sdk.component.utils.PX.bg("TTAppOpenAdReport", "reportLoadCacheDuration json error");
        }
        com.bytedance.sdk.openadsdk.eqN.bX.bg(tuv, "load_cache_duration", j, jSONObject);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000c  */
    private static void bg(org.json.JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        int i;
        if (tuv != null) {
            try {
                if (tuv.NC()) {
                    i = 1;
                } else {
                    i = 0;
                }
            } catch (org.json.JSONException e) {
                com.bytedance.sdk.component.utils.PX.bg("TTAppOpenAdReport", e.getMessage());
                return;
            }
        } else {
            i = 0;
        }
        jSONObject.put("is_icon_only", i);
    }
}

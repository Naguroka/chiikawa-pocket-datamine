package com.bytedance.sdk.openadsdk.eqN.bg;

/* JADX INFO: loaded from: classes4.dex */
public class ldr {
    public static java.util.concurrent.atomic.AtomicInteger bg = new java.util.concurrent.atomic.AtomicInteger(0);
    public static java.util.concurrent.atomic.AtomicInteger IL = new java.util.concurrent.atomic.AtomicInteger(0);
    public static java.util.concurrent.atomic.AtomicInteger bX = new java.util.concurrent.atomic.AtomicInteger(0);
    public static java.util.concurrent.atomic.AtomicInteger eqN = new java.util.concurrent.atomic.AtomicInteger(0);
    public static java.util.concurrent.atomic.AtomicInteger zx = new java.util.concurrent.atomic.AtomicInteger(0);
    public static java.util.concurrent.atomic.AtomicInteger ldr = new java.util.concurrent.atomic.AtomicInteger(0);
    public static java.util.concurrent.atomic.AtomicInteger iR = new java.util.concurrent.atomic.AtomicInteger(0);
    public static java.util.concurrent.atomic.AtomicInteger Kg = new java.util.concurrent.atomic.AtomicInteger(0);
    public static java.util.concurrent.atomic.AtomicInteger WR = new java.util.concurrent.atomic.AtomicInteger(0);

    public static void bg() {
        try {
            long jBg = com.bytedance.sdk.openadsdk.multipro.eqN.bg.bg("tt_sdk_event_get_ad", "get_ad_event_time_key", 0L);
            if (jBg > 0 && java.lang.System.currentTimeMillis() - jBg >= 86400000) {
                IL();
                com.bytedance.sdk.openadsdk.multipro.eqN.bg.bg("tt_sdk_event_get_ad", "get_ad_event_time_key", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                return;
            }
            if (jBg <= 0 || jBg > java.lang.System.currentTimeMillis()) {
                com.bytedance.sdk.openadsdk.multipro.eqN.bg.bg("tt_sdk_event_get_ad", "get_ad_event_time_key", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject(com.bytedance.sdk.openadsdk.multipro.eqN.bg.IL("tt_sdk_event_get_ad", "get_ad_event_key", ""));
            int iOptInt = jSONObject.optInt("load_get_ad_version", 0);
            if (iOptInt >= 5702 && (iOptInt < 5800 || iOptInt >= 5802)) {
                bg.addAndGet(jSONObject.optInt("load_times"));
                IL.addAndGet(jSONObject.optInt("load_success"));
                bX.addAndGet(jSONObject.optInt("load_fail"));
                eqN.addAndGet(jSONObject.optInt("load_success_and_parse_success"));
                zx.addAndGet(jSONObject.optInt("load_success_and_parse_fail"));
                ldr.addAndGet(jSONObject.optInt("load_success_and_no_ad"));
                iR.addAndGet(jSONObject.optInt("load_fail_by_no_net"));
                Kg.addAndGet(jSONObject.optInt("load_fail_by_io"));
                WR.addAndGet(jSONObject.optInt("load_fail_in_background"));
                return;
            }
            com.bytedance.sdk.openadsdk.multipro.eqN.bg.bg("tt_sdk_event_get_ad");
        } catch (java.lang.Throwable unused) {
        }
    }

    public static void IL() {
        try {
            com.bytedance.sdk.openadsdk.yDt.bX.bg().bg("pangle_sdk_get_ad_track", com.bytedance.sdk.openadsdk.multipro.eqN.bg.IL("tt_sdk_event_get_ad", "get_ad_event_key", ""));
            com.bytedance.sdk.openadsdk.multipro.eqN.bg.bg("tt_sdk_event_get_ad");
        } catch (java.lang.Throwable unused) {
        }
    }

    public static void bX() {
        try {
            com.bytedance.sdk.openadsdk.multipro.eqN.bg.bg("tt_sdk_event_get_ad", "get_ad_event_key", eqN().toString());
        } catch (java.lang.Throwable unused) {
        }
    }

    public static org.json.JSONObject eqN() {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("load_times", bg.get());
            jSONObject.put("load_success", IL.get());
            jSONObject.put("load_fail", bX.get());
            jSONObject.put("load_fail_in_background", WR.get());
            jSONObject.put("load_success_and_parse_success", eqN.get());
            jSONObject.put("load_success_and_parse_fail", zx.get());
            jSONObject.put("load_success_and_no_ad", ldr.get());
            jSONObject.put("load_fail_by_no_net", iR.get());
            jSONObject.put("load_fail_by_io", Kg.get());
            jSONObject.put("load_get_ad_version", com.bytedance.sdk.openadsdk.BuildConfig.VERSION_CODE);
            return jSONObject;
        } catch (java.lang.Throwable unused) {
            return new org.json.JSONObject();
        }
    }

    public static void bg(int i, java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("code", i);
            jSONObject.put(androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, str);
            com.bytedance.sdk.openadsdk.yDt.bX.bg().bg("pangle_sdk_client_load_error", jSONObject);
        } catch (java.lang.Throwable unused) {
        }
    }

    public static void zx() {
        try {
            if (com.bytedance.sdk.openadsdk.utils.DeviceUtils.IL()) {
                return;
            }
            WR.incrementAndGet();
        } catch (java.lang.Throwable unused) {
        }
    }
}

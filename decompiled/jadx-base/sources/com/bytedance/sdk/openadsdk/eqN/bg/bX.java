package com.bytedance.sdk.openadsdk.eqN.bg;

/* JADX INFO: loaded from: classes4.dex */
public class bX {
    private int IL;
    private final android.content.Context bX;
    private long bg;
    private final boolean eqN;
    private final java.lang.String zx;

    private java.lang.String bg(int i) {
        if (i == 120) {
            return "ldpi";
        }
        if (i == 160) {
            return "mdpi";
        }
        if (i == 240) {
            return "hdpi";
        }
        if (i == 320) {
            return "xhdpi";
        }
        if (i != 480) {
            return i != 640 ? "mdpi" : "xxxhdpi";
        }
        return "xxhdpi";
    }

    private static class bg {
        private static final com.bytedance.sdk.openadsdk.eqN.bg.bX bg = new com.bytedance.sdk.openadsdk.eqN.bg.bX();
    }

    public static com.bytedance.sdk.openadsdk.eqN.bg.bX bg() {
        return com.bytedance.sdk.openadsdk.eqN.bg.bX.bg.bg;
    }

    private bX() {
        this.eqN = bX();
        this.bX = com.bytedance.sdk.openadsdk.core.VzQ.bg().getApplicationContext();
        this.zx = zx();
    }

    public java.lang.String bg(java.util.List<com.bytedance.sdk.openadsdk.eqN.bg> list) {
        return com.bytedance.sdk.openadsdk.utils.ayS.zx((list.size() <= 0 || list.get(0) == null || list.get(0).bX() == null) ? "" : list.get(0).bX().optString("app_log_url"));
    }

    private void bg(com.bytedance.sdk.openadsdk.eqN.bg bgVar, boolean z) {
        java.lang.String strOptString;
        if (bgVar == null) {
            return;
        }
        try {
            if (z) {
                strOptString = bgVar.bX().optJSONObject("params").optString("log_extra", "");
            } else {
                strOptString = bgVar.bX().optString("log_extra", "");
            }
            long jBg = com.bytedance.sdk.openadsdk.core.model.tuV.bg(strOptString);
            int iEqN = com.bytedance.sdk.openadsdk.core.model.tuV.eqN(strOptString);
            if (jBg == 0) {
                jBg = this.bg;
            }
            this.bg = jBg;
            if (iEqN == 0) {
                iEqN = this.IL;
            }
            this.IL = iEqN;
        } catch (java.lang.Exception e) {
            com.bytedance.sdk.component.utils.PX.bg("AdLogParamsGenerate", "getInfoFromLogExtra exception", e.getMessage());
        }
    }

    public org.json.JSONObject bg(java.util.List<com.bytedance.sdk.openadsdk.eqN.bg> list, long j, org.json.JSONObject jSONObject, boolean z) {
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            bg(list.get(0), z);
            jSONObject2.put("header", jSONObject);
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.Iterator<com.bytedance.sdk.openadsdk.eqN.bg> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().bg(z));
            }
            if (z) {
                jSONObject2.put("event_v3", jSONArray);
                jSONObject2.put("magic_tag", "ss_app_log");
            } else {
                jSONObject2.put(androidx.core.app.NotificationCompat.CATEGORY_EVENT, jSONArray);
            }
            jSONObject2.put("_gen_time", j);
            jSONObject2.put("local_time", j / 1000);
        } catch (org.json.JSONException unused) {
        }
        return jSONObject2;
    }

    public java.util.List<com.bytedance.sdk.openadsdk.eqN.bg> bg(java.util.List<com.bytedance.sdk.openadsdk.eqN.bg> list, boolean z) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.bytedance.sdk.openadsdk.eqN.bg bgVar : list) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                org.json.JSONObject jSONObjectBX = bgVar.bX();
                jSONObject.putOpt(androidx.core.app.NotificationCompat.CATEGORY_EVENT, jSONObjectBX.optString("label"));
                long jOptLong = jSONObjectBX.optLong("event_ts", java.lang.System.currentTimeMillis());
                jSONObject.putOpt("local_time_ms", java.lang.Long.valueOf(jOptLong));
                jSONObject.putOpt("datetime", com.bytedance.sdk.openadsdk.eqN.ldr.bX.format(new java.util.Date(jOptLong)));
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                java.util.Iterator<java.lang.String> itKeys = jSONObjectBX.keys();
                while (itKeys.hasNext()) {
                    java.lang.String next = itKeys.next();
                    if (!android.text.TextUtils.equals(next, "label")) {
                        jSONObject2.putOpt(next, jSONObjectBX.opt(next));
                    }
                }
                if (z) {
                    jSONObject2.putOpt("_ad_staging_flag", 3);
                }
                jSONObject.putOpt("params", jSONObject2);
                arrayList.add(new com.bytedance.sdk.openadsdk.eqN.ldr(bgVar.bg, jSONObject));
            } catch (java.lang.Exception e) {
                com.bytedance.sdk.component.utils.PX.bg("AdLogParamsGenerate", e.getMessage());
            }
        }
        return arrayList;
    }

    public java.util.List<com.bytedance.sdk.openadsdk.eqN.bg> IL(java.util.List<com.bytedance.sdk.openadsdk.eqN.bg> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.bytedance.sdk.openadsdk.eqN.bg bgVar : list) {
            try {
                org.json.JSONObject jSONObjectBX = bgVar.bX();
                jSONObjectBX.putOpt("_ad_staging_flag", 1);
                arrayList.add(new com.bytedance.sdk.openadsdk.eqN.bg(bgVar.bg, jSONObjectBX));
            } catch (java.lang.Exception e) {
                com.bytedance.sdk.component.utils.PX.bg("AdLogParamsGenerate", e.getMessage());
            }
        }
        return arrayList;
    }

    @com.bytedance.JProtect
    public org.json.JSONObject IL() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(com.json.ce.U, com.bytedance.sdk.openadsdk.utils.ayS.bX());
            jSONObject.put("ad_sdk_version", com.bytedance.sdk.openadsdk.BuildConfig.VERSION_NAME);
            jSONObject.put("app_version", com.bytedance.sdk.openadsdk.utils.ayS.iR());
            jSONObject.put("sim_op", bg(this.bX));
            jSONObject.put("root", this.eqN ? 1 : 0);
            jSONObject.put("timezone", eqN());
            jSONObject.put("access", com.bytedance.sdk.openadsdk.utils.tC.bg(this.bX));
            jSONObject.put(com.json.ce.y, com.json.y8.d);
            jSONObject.put("os_version", android.os.Build.VERSION.RELEASE);
            jSONObject.put("os_api", android.os.Build.VERSION.SDK_INT);
            jSONObject.put("device_type", this.zx);
            jSONObject.put("device_model", android.os.Build.MODEL);
            jSONObject.put("device_brand", android.os.Build.BRAND);
            jSONObject.put("device_manufacturer", android.os.Build.MANUFACTURER);
            jSONObject.put("language", java.util.Locale.getDefault().getLanguage());
            jSONObject.put("resolution", com.bytedance.sdk.openadsdk.utils.ZQc.eqN(this.bX) + "x" + com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.bX));
            jSONObject.put("display_density", bg(com.bytedance.sdk.openadsdk.utils.ZQc.iR(this.bX)));
            jSONObject.put("density_dpi", com.bytedance.sdk.openadsdk.utils.ZQc.iR(this.bX));
            jSONObject.put(com.json.tk.SESSION_HISTORY_KEY_AD_ID, "1371");
            jSONObject.put("device_id", com.bytedance.sdk.openadsdk.core.PX.bg(this.bX));
            jSONObject.put("rom", ldr());
            jSONObject.put("cpu_abi", android.os.Build.CPU_ABI);
            jSONObject.put("ut", this.IL);
            jSONObject.put("uid", this.bg);
            jSONObject.put("google_aid", com.bytedance.sdk.openadsdk.VzQ.bg.IL.bg.bg().IL());
            jSONObject.put("locale_language", com.bytedance.sdk.openadsdk.utils.DeviceUtils.eqN());
            jSONObject.put("screen_bright", java.lang.Math.ceil(com.bytedance.sdk.openadsdk.utils.DeviceUtils.zx() * 10.0f) / 10.0d);
            jSONObject.put("is_screen_off", com.bytedance.sdk.openadsdk.utils.DeviceUtils.IL() ? 0 : 1);
            com.bytedance.sdk.openadsdk.core.settings.ldr ldrVarEqN = com.bytedance.sdk.openadsdk.core.VzQ.eqN();
            jSONObject.put("force_language", com.bytedance.sdk.component.utils.Fy.bg(this.bX, "tt_choose_language"));
            if (ldrVarEqN.DDQ("mnc")) {
                jSONObject.put("mnc", com.bytedance.sdk.openadsdk.utils.Uw.bX());
            }
            if (ldrVarEqN.DDQ("mcc")) {
                jSONObject.put("mcc", com.bytedance.sdk.openadsdk.utils.Uw.IL());
            }
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    private java.lang.String bg(android.content.Context context) {
        try {
            android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) context.getSystemService("phone");
            return telephonyManager == null ? "" : telephonyManager.getSimOperator();
        } catch (java.lang.Throwable unused) {
            return "";
        }
    }

    private boolean bX() {
        try {
            return new java.io.File("/system/bin/su").exists() || new java.io.File("/system/xbin/su").exists();
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    private int eqN() {
        int rawOffset = java.util.TimeZone.getDefault().getRawOffset() / com.adjust.sdk.Constants.ONE_HOUR;
        if (rawOffset < -12) {
            rawOffset = -12;
        }
        if (rawOffset > 12) {
            return 12;
        }
        return rawOffset;
    }

    private java.lang.String zx() {
        if (com.bytedance.sdk.openadsdk.utils.DeviceUtils.bX(this.bX)) {
            return "tv";
        }
        return com.bytedance.sdk.openadsdk.utils.DeviceUtils.IL(this.bX) ? "android_pad" : "android";
    }

    @com.bytedance.JProtect
    private java.lang.String ldr() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            if (com.bytedance.sdk.openadsdk.utils.JAA.zx()) {
                sb.append("MIUI-");
            } else if (com.bytedance.sdk.openadsdk.utils.JAA.IL()) {
                sb.append("FLYME-");
            } else {
                java.lang.String strYDt = com.bytedance.sdk.openadsdk.utils.JAA.yDt();
                if (com.bytedance.sdk.openadsdk.utils.JAA.bg(strYDt)) {
                    sb.append("EMUI-");
                }
                if (!android.text.TextUtils.isEmpty(strYDt)) {
                    sb.append(strYDt).append("-");
                }
            }
            sb.append(android.os.Build.VERSION.INCREMENTAL);
        } catch (java.lang.Throwable unused) {
        }
        return sb.toString();
    }
}

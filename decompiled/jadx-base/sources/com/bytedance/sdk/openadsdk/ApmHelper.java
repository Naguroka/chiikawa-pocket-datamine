package com.bytedance.sdk.openadsdk;

/* JADX INFO: loaded from: classes4.dex */
public class ApmHelper {
    private static java.lang.String bX = null;
    private static volatile boolean bg = false;
    private static boolean eqN;
    private static com.bytedance.sdk.openadsdk.ApmHelper.bg iR;
    private static com.bytedance.sdk.openadsdk.ApmHelper.IL ldr;
    private static final java.util.concurrent.atomic.AtomicBoolean IL = new java.util.concurrent.atomic.AtomicBoolean(false);
    private static boolean zx = false;

    private interface IL {
        void bg(java.lang.String str, java.lang.String str2, java.lang.Throwable th);
    }

    public static void initApm(final android.content.Context context, final com.bytedance.sdk.openadsdk.InitConfig initConfig) {
        if (IL.compareAndSet(false, true) && !bg) {
            com.bytedance.sdk.openadsdk.utils.VJ.bg(new com.bytedance.sdk.component.Kg.Kg("init-apm") { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1
                @Override // java.lang.Runnable
                public void run() {
                    if (!com.bytedance.sdk.openadsdk.ApmHelper.bg) {
                        com.bytedance.sdk.openadsdk.core.settings.ldr ldrVarEqN = com.bytedance.sdk.openadsdk.core.VzQ.eqN();
                        boolean unused = com.bytedance.sdk.openadsdk.ApmHelper.eqN = ldrVarEqN.jz();
                        if (com.bytedance.sdk.openadsdk.ApmHelper.eqN && !android.text.TextUtils.isEmpty(ldrVarEqN.daV())) {
                            java.lang.String unused2 = com.bytedance.sdk.openadsdk.ApmHelper.bX = initConfig.getAppId();
                            java.lang.String[] strArr = {"com.bytedance.sdk.component", "com.bytedance.sdk.mediation", com.bytedance.sdk.openadsdk.BuildConfig.LIBRARY_PACKAGE_NAME, "com.com.bytedance.overseas.sdk", "com.pgl.ssdk", "com.bykv.vk", "com.iab.omid.library.bytedance2", "com.bytedance.adsdk"};
                            java.lang.String strBg = com.bytedance.sdk.openadsdk.core.PX.bg(context);
                            java.lang.String strDaV = ldrVarEqN.daV();
                            try {
                                final com.apm.insight.MonitorCrash monitorCrashInitSDK = com.apm.insight.MonitorCrash.initSDK(context, "10000001", 6406L, com.bytedance.sdk.openadsdk.BuildConfig.VERSION_NAME, strArr);
                                monitorCrashInitSDK.setCustomDataCallback(new com.apm.insight.AttachUserData() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.1
                                    @Override // com.apm.insight.AttachUserData
                                    public java.util.Map<? extends java.lang.String, ? extends java.lang.String> getUserData(com.apm.insight.CrashType crashType) {
                                        java.util.Map<? extends java.lang.String, ? extends java.lang.String> mapWR = com.bytedance.sdk.openadsdk.ApmHelper.WR();
                                        if (mapWR.containsKey("render_type")) {
                                            monitorCrashInitSDK.addTags("render_type", mapWR.get("render_type"));
                                        } else {
                                            monitorCrashInitSDK.addTags("render_type", "-2");
                                        }
                                        return mapWR;
                                    }
                                });
                                if (ldrVarEqN.RiO()) {
                                    monitorCrashInitSDK.config().setSoList(new java.lang.String[]{"libnms.so", "libtobEmbedPagEncrypt.so", "tt_ugen_layout.so"});
                                }
                                monitorCrashInitSDK.config().setDeviceId(strBg);
                                monitorCrashInitSDK.setReportUrl(strDaV);
                                monitorCrashInitSDK.addTags("host_appid", com.bytedance.sdk.openadsdk.ApmHelper.bX);
                                monitorCrashInitSDK.addTags("sdk_version", com.bytedance.sdk.openadsdk.BuildConfig.VERSION_NAME);
                                com.bytedance.sdk.openadsdk.ApmHelper.IL unused3 = com.bytedance.sdk.openadsdk.ApmHelper.ldr = new com.bytedance.sdk.openadsdk.ApmHelper.IL() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.2
                                    @Override // com.bytedance.sdk.openadsdk.ApmHelper.IL
                                    public void bg(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
                                        monitorCrashInitSDK.reportCustomErr(str, str2, th);
                                    }
                                };
                                boolean unused4 = com.bytedance.sdk.openadsdk.ApmHelper.bg = true;
                                com.bytedance.sdk.openadsdk.ApmHelper.bX(strBg, strDaV);
                                monitorCrashInitSDK.registerCrashCallback(new com.apm.insight.ICrashCallback() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.3
                                    @Override // com.apm.insight.ICrashCallback
                                    public void onCrash(com.apm.insight.CrashType crashType, java.lang.String str, java.lang.Thread thread) {
                                        if (!com.bytedance.sdk.openadsdk.ApmHelper.zx) {
                                            com.bytedance.sdk.openadsdk.ApmHelper.eqN(crashType.getName());
                                        }
                                        boolean unused5 = com.bytedance.sdk.openadsdk.ApmHelper.zx = true;
                                    }
                                }, com.apm.insight.CrashType.ALL);
                                com.bytedance.sdk.openadsdk.ApmHelper.bg bgVar = com.bytedance.sdk.openadsdk.ApmHelper.iR;
                                com.bytedance.sdk.openadsdk.ApmHelper.bg unused5 = com.bytedance.sdk.openadsdk.ApmHelper.iR = null;
                                if (bgVar != null) {
                                    com.bytedance.sdk.openadsdk.ApmHelper.ldr.bg(bgVar.bg, bgVar.IL, bgVar.bX);
                                }
                            } catch (java.lang.Throwable unused6) {
                                boolean unused7 = com.bytedance.sdk.openadsdk.ApmHelper.bg = false;
                            }
                        }
                    }
                    com.bytedance.sdk.openadsdk.ApmHelper.IL.set(false);
                }
            });
        }
    }

    public static void reportCustomError(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        com.bytedance.sdk.openadsdk.ApmHelper.IL il = ldr;
        if (il != null) {
            il.bg(str, str2, th);
        } else {
            iR = new com.bytedance.sdk.openadsdk.ApmHelper.bg(str, str2, th);
        }
    }

    private static class bg {
        public final java.lang.String IL;
        public final java.lang.Throwable bX;
        public final java.lang.String bg;

        public bg(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
            this.bg = str;
            this.IL = str2;
            this.bX = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.util.Map<java.lang.String, java.lang.String> WR() {
        java.util.HashMap map = new java.util.HashMap();
        com.bytedance.sdk.openadsdk.core.model.tuV tuvBg = com.bytedance.sdk.openadsdk.utils.IL.bg();
        if (tuvBg != null) {
            map.put("adType", java.lang.String.valueOf(tuvBg.JMw()));
            map.put(com.json.tk.SESSION_HISTORY_KEY_AD_ID, java.lang.String.valueOf(tuvBg.VHL()));
            map.put(androidx.media3.exoplayer.upstream.CmcdConfiguration.KEY_CONTENT_ID, tuvBg.Ys());
            map.put("reqId", tuvBg.waE());
            map.put("rit", tuvBg.JAA("-1"));
            int iJAA = tuvBg.JAA();
            if (tuvBg.tC() != 2) {
                iJAA = -1;
            }
            map.put("render_type", java.lang.String.valueOf(iJAA));
        }
        return map;
    }

    private static void IL(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.VzQ.bX().bg(bX(str), "https://" + str2 + "/monitor/collect/c/session?version_code=6406&device_platform=android&aid=10000001");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void bX(java.lang.String str, java.lang.String str2) {
        IL(str, str2);
    }

    public static void reportPvFromBackGround() {
        if (eqN) {
            IL(com.bytedance.sdk.openadsdk.core.PX.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg()), com.bytedance.sdk.openadsdk.core.VzQ.eqN().daV());
        }
    }

    private static org.json.JSONObject bX(java.lang.String str) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        try {
            jSONObject3.put("sdk_version", com.bytedance.sdk.openadsdk.BuildConfig.VERSION_NAME);
            jSONObject3.put("host_app_id", bX);
            jSONObject2.putOpt("custom", jSONObject3);
            jSONObject2.put(com.json.ce.y, com.json.y8.d);
            jSONObject2.put("os_version", android.os.Build.VERSION.RELEASE);
            jSONObject2.put("device_model", android.os.Build.MODEL);
            jSONObject2.put("device_brand", android.os.Build.BRAND);
            jSONObject2.put("sdk_version_name", "0.0.5");
            jSONObject2.put(com.json.tk.SESSION_HISTORY_KEY_AD_ID, "10000001");
            jSONObject2.put("update_version_code", com.bytedance.sdk.openadsdk.BuildConfig.VERSION_CODE);
            jSONObject2.put("bd_did", str);
            jSONObject.putOpt("header", jSONObject2);
            jSONObject.putOpt("local_time", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            jSONArray.put(new org.json.JSONObject().put("local_time_ms", java.lang.System.currentTimeMillis()));
            jSONObject.putOpt("launch", jSONArray);
        } catch (org.json.JSONException e) {
            com.bytedance.sdk.component.utils.PX.bg("ApmHelper", e.getMessage());
        }
        return jSONObject;
    }

    public static boolean isIsInit() {
        return bg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void eqN(final java.lang.String str) {
        final com.bytedance.sdk.openadsdk.core.model.tuV tuvBg = com.bytedance.sdk.openadsdk.utils.IL.bg();
        if (tuvBg != null) {
            java.lang.String strBg = com.bytedance.sdk.openadsdk.utils.ayS.bg(tuvBg);
            if (android.text.TextUtils.isEmpty(strBg)) {
                return;
            }
            com.bytedance.sdk.openadsdk.eqN.bX.bg(java.lang.System.currentTimeMillis(), tuvBg, strBg, "sdk_crash_info", new com.bytedance.sdk.openadsdk.yDt.bX.bg() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.2
                @Override // com.bytedance.sdk.openadsdk.yDt.bX.bg
                public org.json.JSONObject bg() {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    try {
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                        jSONObject2.put("type", str);
                        jSONObject2.put("material", com.bytedance.sdk.component.utils.bg.bg(tuvBg.ZTq()).toString());
                        jSONObject.put("ad_extra_data", jSONObject2.toString());
                    } catch (org.json.JSONException unused) {
                    }
                    return jSONObject;
                }
            });
        }
    }
}

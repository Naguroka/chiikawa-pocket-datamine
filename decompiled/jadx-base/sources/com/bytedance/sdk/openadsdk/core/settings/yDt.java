package com.bytedance.sdk.openadsdk.core.settings;

/* JADX INFO: loaded from: classes4.dex */
public class yDt extends com.bytedance.sdk.component.Kg.Kg {
    private final com.bytedance.sdk.openadsdk.core.settings.Ta IL;
    private final java.util.Set<com.bytedance.sdk.openadsdk.core.settings.zx> bX;
    private final com.bytedance.sdk.openadsdk.core.settings.yDt.bg bg;

    public interface bg {
        void bg(boolean z);
    }

    public yDt(com.bytedance.sdk.openadsdk.core.settings.yDt.bg bgVar, com.bytedance.sdk.openadsdk.core.settings.Ta ta, com.bytedance.sdk.openadsdk.core.settings.zx... zxVarArr) {
        super("SetF");
        java.util.HashSet hashSet = new java.util.HashSet();
        this.bX = hashSet;
        this.bg = bgVar;
        this.IL = ta;
        hashSet.addAll(java.util.Arrays.asList(zxVarArr));
    }

    @Override // java.lang.Runnable
    public void run() {
        android.util.Log.d("TTAD.SdkSettingsFetch", "Start Try");
        int iBg = com.bytedance.sdk.component.utils.rri.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(), 0L);
        if (iBg == 0) {
            android.util.Log.d("TTAD.SdkSettingsFetch", "No net");
            this.bg.bg(false);
            return;
        }
        final com.bytedance.sdk.openadsdk.yDt.bg.zx zxVar = new com.bytedance.sdk.openadsdk.yDt.bg.zx(1);
        org.json.JSONObject jSONObjectBg = bg(iBg);
        com.bytedance.sdk.component.iR.IL.eqN eqnIL = com.bytedance.sdk.openadsdk.xxp.bX.bg().IL().IL();
        try {
            java.lang.String strBg = com.bytedance.sdk.openadsdk.Kg.eqN.bg(eqnIL, com.bytedance.sdk.openadsdk.utils.ayS.eqN("/api/ad/union/sdk/settings/"));
            eqnIL.IL(strBg);
            eqnIL.IL(com.google.common.net.HttpHeaders.USER_AGENT, com.bytedance.sdk.openadsdk.utils.ayS.bX());
            zxVar.bg(strBg);
        } catch (java.lang.Exception unused) {
        }
        java.lang.String string = IL(jSONObjectBg).toString();
        if (com.bytedance.sdk.openadsdk.core.VzQ.eqN().txA() && com.bytedance.sdk.openadsdk.core.DDQ.bg().iR() == 1) {
            com.bytedance.sdk.openadsdk.utils.ayS.bg("Pangle_Debug_Mode", string, com.bytedance.sdk.openadsdk.core.VzQ.bg());
        }
        eqnIL.bg(string, com.bytedance.sdk.openadsdk.core.VzQ.eqN().xxp());
        zxVar.bg(eqnIL.eqN()).bg();
        eqnIL.bg(6);
        eqnIL.bg("setting");
        com.bytedance.sdk.openadsdk.p002vb.eqN.bg(new com.bytedance.sdk.openadsdk.p002vb.zx() { // from class: com.bytedance.sdk.openadsdk.core.settings.yDt.1
            @Override // com.bytedance.sdk.openadsdk.p002vb.zx
            public com.bytedance.sdk.openadsdk.p002vb.IL.bg generatorModel() {
                com.bytedance.sdk.openadsdk.p002vb.IL.bg bgVar = new com.bytedance.sdk.openadsdk.p002vb.IL.bg();
                bgVar.IL("settings_fetch");
                return bgVar;
            }
        });
        eqnIL.bg(new com.bytedance.sdk.component.iR.bg.bg() { // from class: com.bytedance.sdk.openadsdk.core.settings.yDt.2
            @Override // com.bytedance.sdk.component.iR.bg.bg
            public void bg(com.bytedance.sdk.component.iR.IL.bX bXVar, com.bytedance.sdk.component.iR.IL il) {
                org.json.JSONObject jSONObject;
                int iOptInt;
                int iBg2 = il.bg();
                java.lang.String strEqN = il.eqN();
                if (com.bytedance.sdk.openadsdk.core.VzQ.eqN().txA() && com.bytedance.sdk.openadsdk.core.DDQ.bg().iR() == 1) {
                    com.bytedance.sdk.openadsdk.utils.ayS.bg("Pangle_Debug_Mode", strEqN, com.bytedance.sdk.openadsdk.core.VzQ.bg());
                }
                if (il.ldr() && !android.text.TextUtils.isEmpty(strEqN)) {
                    zxVar.bX(strEqN).bg(iBg2).bg(true).bX();
                    java.lang.String strBX = null;
                    try {
                        jSONObject = new org.json.JSONObject(strEqN);
                    } catch (org.json.JSONException unused2) {
                        jSONObject = null;
                    }
                    if (jSONObject != null && (iOptInt = jSONObject.optInt("cypher", -1)) != -1) {
                        if (iOptInt == 3) {
                            strBX = com.bytedance.sdk.component.utils.bg.bX(jSONObject.optString(com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE));
                            if (!android.text.TextUtils.isEmpty(strBX)) {
                                try {
                                    jSONObject = new org.json.JSONObject(strBX);
                                } catch (java.lang.Throwable unused3) {
                                }
                            }
                        }
                        try {
                            com.bytedance.sdk.openadsdk.core.settings.yDt.this.bg(strBX, il.bX());
                        } catch (java.lang.Throwable unused4) {
                        }
                        try {
                            com.bytedance.sdk.openadsdk.core.settings.yDt.this.bg(jSONObject);
                            com.bytedance.sdk.openadsdk.core.VzQ.eqN().bg(java.lang.System.currentTimeMillis());
                            com.bytedance.sdk.openadsdk.p002vb.eqN.IL(new com.bytedance.sdk.openadsdk.p002vb.zx() { // from class: com.bytedance.sdk.openadsdk.core.settings.yDt.2.1
                                @Override // com.bytedance.sdk.openadsdk.p002vb.zx
                                public com.bytedance.sdk.openadsdk.p002vb.IL.bg generatorModel() {
                                    com.bytedance.sdk.openadsdk.p002vb.IL.bg bgVar = new com.bytedance.sdk.openadsdk.p002vb.IL.bg();
                                    bgVar.IL("settings_fetch");
                                    return bgVar;
                                }
                            });
                        } catch (java.lang.Throwable unused5) {
                        }
                        com.bytedance.sdk.openadsdk.core.settings.yDt.this.bg.bg(true);
                        com.bytedance.sdk.openadsdk.core.eo.bg.bg();
                        return;
                    }
                } else {
                    com.bytedance.sdk.openadsdk.p002vb.eqN.bX(new com.bytedance.sdk.openadsdk.p002vb.zx() { // from class: com.bytedance.sdk.openadsdk.core.settings.yDt.2.2
                        @Override // com.bytedance.sdk.openadsdk.p002vb.zx
                        public com.bytedance.sdk.openadsdk.p002vb.IL.bg generatorModel() {
                            com.bytedance.sdk.openadsdk.p002vb.IL.bg bgVar = new com.bytedance.sdk.openadsdk.p002vb.IL.bg();
                            bgVar.IL("settings_fetch");
                            return bgVar;
                        }
                    });
                }
                zxVar.bX(strEqN).bg(iBg2).eqN(il.IL()).bg(il.ldr()).bX();
                com.bytedance.sdk.openadsdk.core.settings.yDt.this.bg.bg(false);
            }

            @Override // com.bytedance.sdk.component.iR.bg.bg
            public void bg(com.bytedance.sdk.component.iR.IL.bX bXVar, java.io.IOException iOException) {
                zxVar.eqN(iOException != null ? iOException.getMessage() : null).bg(false).bX();
                com.bytedance.sdk.openadsdk.core.settings.yDt.this.bg.bg(false);
                com.bytedance.sdk.openadsdk.core.eo.bg.bg();
                com.bytedance.sdk.openadsdk.p002vb.eqN.bX(new com.bytedance.sdk.openadsdk.p002vb.zx() { // from class: com.bytedance.sdk.openadsdk.core.settings.yDt.2.3
                    @Override // com.bytedance.sdk.openadsdk.p002vb.zx
                    public com.bytedance.sdk.openadsdk.p002vb.IL.bg generatorModel() {
                        com.bytedance.sdk.openadsdk.p002vb.IL.bg bgVar = new com.bytedance.sdk.openadsdk.p002vb.IL.bg();
                        bgVar.IL("settings_fetch");
                        return bgVar;
                    }
                });
            }
        });
        com.bytedance.sdk.openadsdk.utils.DeviceUtils.VB();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        int i = 1;
        try {
            if (!android.text.TextUtils.isEmpty(str) && map != null) {
                java.util.HashMap map2 = new java.util.HashMap();
                for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
                    java.lang.String key = entry.getKey();
                    if (key != null) {
                        map2.put(key.toLowerCase(java.util.Locale.US), entry.getValue());
                    }
                }
                int i2 = java.lang.Integer.parseInt((java.lang.String) map2.get("active-control"));
                long j = java.lang.Long.parseLong((java.lang.String) map2.get("ts"));
                java.lang.String str2 = (java.lang.String) map2.get("pst");
                java.lang.String strBg = com.bykv.vk.openvk.bg.bg.bg.iR.IL.bg(str + i2 + j);
                if (strBg != null && strBg.equalsIgnoreCase(str2)) {
                    i = i2;
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.core.settings.PX.bg(i);
    }

    public static org.json.JSONObject bg(int i) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            com.bytedance.sdk.openadsdk.core.settings.ldr ldrVarEqN = com.bytedance.sdk.openadsdk.core.VzQ.eqN();
            jSONObject.put(com.json.ce.v, android.os.Build.MODEL);
            jSONObject.put("device_city", com.bytedance.sdk.openadsdk.utils.ayS.Lq());
            if (ldrVarEqN.DDQ(com.json.ce.K0)) {
                jSONObject.put(com.json.ce.K0, com.bytedance.sdk.openadsdk.VzQ.bg.IL.bg.bg().IL());
            }
            jSONObject.put("gdpr", com.bytedance.sdk.openadsdk.core.WR.IL().WR());
            jSONObject.put("coppa", com.bytedance.sdk.openadsdk.core.WR.IL().Kg());
            jSONObject.put("ccpa", com.bytedance.sdk.openadsdk.core.WR.IL().Fy());
            if (ldrVarEqN.DDQ("mcc")) {
                jSONObject.put("mcc", com.bytedance.sdk.openadsdk.utils.Uw.IL());
            }
            android.content.Context contextBg = com.bytedance.sdk.openadsdk.core.VzQ.bg();
            jSONObject.put("conn_type", com.bytedance.sdk.openadsdk.utils.ayS.iR(i));
            int i2 = 1;
            jSONObject.put(com.json.ce.y, 1);
            jSONObject.put("oversea_version_type", 1);
            jSONObject.put("os_version", android.os.Build.VERSION.RELEASE);
            jSONObject.put("aos_api_level", android.os.Build.VERSION.SDK_INT);
            jSONObject.put("sdk_version", com.bytedance.sdk.openadsdk.BuildConfig.VERSION_NAME);
            jSONObject.put("language", com.bytedance.sdk.openadsdk.core.PX.bg());
            jSONObject.put("time_zone", com.bytedance.sdk.openadsdk.utils.ayS.VzQ());
            jSONObject.put(com.ironsource.y8.h.V, com.bytedance.sdk.openadsdk.utils.ayS.zx());
            if (!com.bytedance.sdk.openadsdk.utils.ayS.bg()) {
                i2 = 2;
            }
            jSONObject.put(com.ironsource.y8.h.L, i2);
            jSONObject.put("app_version", com.bytedance.sdk.openadsdk.utils.ayS.iR());
            jSONObject.put("vendor", android.os.Build.MANUFACTURER);
            jSONObject.put("uuid", com.bytedance.sdk.openadsdk.core.PX.bX(contextBg));
            java.lang.String strEqN = com.bytedance.sdk.openadsdk.core.WR.IL().eqN();
            if (strEqN != null) {
                jSONObject.put("app_id", strEqN);
            }
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
            jSONObject.put("ts", jCurrentTimeMillis);
            jSONObject.put("req_sign", com.bytedance.sdk.component.utils.zx.bg(strEqN != null ? strEqN.concat(java.lang.String.valueOf(jCurrentTimeMillis)).concat(com.bytedance.sdk.openadsdk.BuildConfig.VERSION_NAME) : ""));
            jSONObject.put("tcstring", com.bytedance.sdk.openadsdk.core.settings.xxp.bX(contextBg));
            jSONObject.put("tcf_gdpr", com.bytedance.sdk.openadsdk.core.settings.xxp.IL(contextBg));
            jSONObject.put("lmt", com.bytedance.sdk.openadsdk.utils.DeviceUtils.bX());
            jSONObject.put("locale_language", com.bytedance.sdk.openadsdk.utils.DeviceUtils.eqN());
            jSONObject.put("channel", com.ironsource.y8.h.Z);
            org.json.JSONObject jSONObjectZx = ldrVarEqN.zx();
            if (jSONObjectZx != null) {
                jSONObject.put("digest", jSONObjectZx);
            }
            jSONObject.put("data_time", ldrVarEqN.ldr());
            jSONObject.put("app_set_id_scope", com.bytedance.sdk.openadsdk.core.settings.eqN.IL());
            jSONObject.put("app_set_id", com.bytedance.sdk.openadsdk.core.settings.eqN.bX());
            jSONObject.put("installed_source", com.bytedance.sdk.openadsdk.core.settings.eqN.eqN());
            if (ldrVarEqN.DDQ(com.json.ce.K0)) {
                jSONObject.put("did", com.bytedance.sdk.openadsdk.core.PX.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg()));
            }
            java.lang.String strZx = com.bytedance.sdk.openadsdk.core.WR.IL().zx();
            if (!android.text.TextUtils.isEmpty(strZx)) {
                jSONObject.put("mediation", strZx);
            }
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    private org.json.JSONObject IL(org.json.JSONObject jSONObject) {
        return com.bytedance.sdk.component.utils.bg.bg(jSONObject);
    }

    public boolean bg(org.json.JSONObject jSONObject) throws java.lang.Throwable {
        this.IL.bg(jSONObject);
        for (com.bytedance.sdk.openadsdk.core.settings.zx zxVar : this.bX) {
            if (zxVar != null) {
                zxVar.bg(jSONObject);
            }
        }
        return this.IL.bX;
    }

    public static boolean bg() {
        return com.bytedance.sdk.openadsdk.multipro.aidl.BinderPoolService.bg;
    }
}

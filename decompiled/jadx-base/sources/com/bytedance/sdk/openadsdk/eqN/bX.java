package com.bytedance.sdk.openadsdk.eqN;

/* JADX INFO: loaded from: classes4.dex */
public class bX {
    public static void bg() {
        try {
            java.lang.Class.forName(com.bytedance.sdk.openadsdk.eqN.bX.class.getName());
        } catch (java.lang.ClassNotFoundException unused) {
        }
    }

    public static void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str, final int i) {
        bg(java.lang.System.currentTimeMillis(), tuv, str, "open_url_h5", new com.bytedance.sdk.openadsdk.yDt.bX.bg() { // from class: com.bytedance.sdk.openadsdk.eqN.bX.1
            @Override // com.bytedance.sdk.openadsdk.yDt.bX.bg
            public org.json.JSONObject bg() {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.putOpt("render_type", "h5");
                    jSONObject2.putOpt("render_type_2", 0);
                    jSONObject2.putOpt("preload_status", java.lang.Integer.valueOf(i));
                    jSONObject.putOpt("ad_extra_data", jSONObject2.toString());
                } catch (java.lang.Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void bg(final com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str) {
        bg(java.lang.System.currentTimeMillis(), tuv, str, "endcard_load_start", new com.bytedance.sdk.openadsdk.yDt.bX.bg() { // from class: com.bytedance.sdk.openadsdk.eqN.bX.11
            @Override // com.bytedance.sdk.openadsdk.yDt.bX.bg
            public org.json.JSONObject bg() {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    if (com.bytedance.sdk.openadsdk.core.model.tuV.bX(tuv)) {
                        if (tuv.Az() != null) {
                            jSONObject2.putOpt("url", tuv.Az().bX());
                            jSONObject2.putOpt("id", tuv.Az().bg());
                            jSONObject2.putOpt("md5", tuv.Az().IL());
                        }
                        if (tuv.Dxa() != null) {
                            jSONObject2.putOpt("render_type", 7);
                        }
                    } else {
                        jSONObject2.putOpt("url", tuv.Dxa().PX());
                        jSONObject2.putOpt("style_id", tuv.Cv());
                        if (tuv.Dxa() != null) {
                            jSONObject2.putOpt("render_type", 0);
                        }
                    }
                    jSONObject.putOpt("ad_extra_data", jSONObject2.toString());
                } catch (java.lang.Exception e) {
                    com.bytedance.sdk.component.utils.PX.IL(e.getMessage());
                }
                return jSONObject;
            }
        });
    }

    public static void bg(final com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str, final long j) {
        bg(java.lang.System.currentTimeMillis(), tuv, str, "endcard_load_finish", new com.bytedance.sdk.openadsdk.yDt.bX.bg() { // from class: com.bytedance.sdk.openadsdk.eqN.bX.22
            @Override // com.bytedance.sdk.openadsdk.yDt.bX.bg
            public org.json.JSONObject bg() {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    if (com.bytedance.sdk.openadsdk.core.model.tuV.bX(tuv)) {
                        if (tuv.Az() != null) {
                            jSONObject2.putOpt("url", tuv.Az().bX());
                            jSONObject2.putOpt("id", tuv.Az().bg());
                            jSONObject2.putOpt("md5", tuv.Az().IL());
                        }
                        if (tuv.Dxa() != null) {
                            jSONObject2.putOpt("render_type", 7);
                        }
                    } else {
                        jSONObject2.putOpt("url", tuv.Dxa().PX());
                        jSONObject2.putOpt("style_id", tuv.Cv());
                        if (tuv.Dxa() != null) {
                            jSONObject2.putOpt("render_type", 0);
                        }
                    }
                    jSONObject.putOpt("ad_extra_data", jSONObject2.toString());
                    jSONObject.put("duration", j);
                } catch (java.lang.Exception e) {
                    com.bytedance.sdk.component.utils.PX.IL(e.getMessage());
                }
                return jSONObject;
            }
        });
    }

    public static void bg(final com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str, final long j, final int i, final java.lang.String str2, final java.lang.String str3) {
        bg(java.lang.System.currentTimeMillis(), tuv, str, "endcard_load_fail", new com.bytedance.sdk.openadsdk.yDt.bX.bg() { // from class: com.bytedance.sdk.openadsdk.eqN.bX.33
            @Override // com.bytedance.sdk.openadsdk.yDt.bX.bg
            public org.json.JSONObject bg() {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    if (com.bytedance.sdk.openadsdk.core.model.tuV.bX(tuv)) {
                        if (tuv.Az() != null) {
                            jSONObject2.putOpt("url", tuv.Az().bX());
                            jSONObject2.putOpt("id", tuv.Az().bg());
                            jSONObject2.putOpt("md5", tuv.Az().IL());
                        }
                        if (tuv.Dxa() != null) {
                            jSONObject2.putOpt("render_type", 7);
                        }
                    } else {
                        jSONObject2.putOpt("url", tuv.Dxa().PX());
                        jSONObject2.putOpt("style_id", tuv.Cv());
                        if (!android.text.TextUtils.isEmpty(str3)) {
                            jSONObject2.putOpt("error_url", str3);
                        }
                        if (tuv.Dxa() != null) {
                            jSONObject2.putOpt("render_type", 0);
                        }
                    }
                    jSONObject2.put("error_code", i);
                    jSONObject2.put("error_msg", str2);
                    jSONObject.putOpt("ad_extra_data", jSONObject2.toString());
                    jSONObject.put("duration", j);
                } catch (java.lang.Exception e) {
                    com.bytedance.sdk.component.utils.PX.IL(e.getMessage());
                }
                return jSONObject;
            }
        });
    }

    public static void bg(final com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str, final long j, final int i, final int i2) {
        bg(java.lang.System.currentTimeMillis(), tuv, str, "load", new com.bytedance.sdk.openadsdk.yDt.bX.bg() { // from class: com.bytedance.sdk.openadsdk.eqN.bX.44
            @Override // com.bytedance.sdk.openadsdk.yDt.bX.bg
            public org.json.JSONObject bg() {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.putOpt("render_type", "h5");
                    jSONObject2.putOpt("render_type_2", 0);
                    jSONObject2.putOpt("interaction_method", java.lang.Integer.valueOf(tuv.xxp()));
                    jSONObject2.put("first_page", i2);
                    jSONObject2.put("preload_h5_type", tuv.ULi());
                    int i3 = i;
                    if (i3 >= 0) {
                        jSONObject2.putOpt("preload_status", java.lang.Integer.valueOf(i3));
                    }
                    jSONObject.putOpt("ad_extra_data", jSONObject2.toString());
                    jSONObject.put("duration", java.lang.Math.min(j, com.bytedance.sdk.openadsdk.TTAdConstant.AD_MAX_EVENT_TIME));
                } catch (java.lang.Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void bg(java.lang.String str, com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str2, final java.util.Map<java.lang.String, java.lang.Object> map) {
        bg(java.lang.System.currentTimeMillis(), tuv, str2, str, new com.bytedance.sdk.openadsdk.yDt.bX.bg() { // from class: com.bytedance.sdk.openadsdk.eqN.bX.45
            @Override // com.bytedance.sdk.openadsdk.yDt.bX.bg
            public org.json.JSONObject bg() {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    if (map != null) {
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                        for (java.util.Map.Entry entry : map.entrySet()) {
                            jSONObject2.put((java.lang.String) entry.getKey(), entry.getValue());
                        }
                        jSONObject.put("ad_extra_data", jSONObject2.toString());
                    }
                } catch (java.lang.Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void bg(long j, com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str, java.lang.String str2, final org.json.JSONObject jSONObject, com.bytedance.sdk.openadsdk.eqN.iR iRVar, com.bytedance.sdk.openadsdk.eqN.IL.bg bgVar) {
        bg(j, tuv, str, str2, new com.bytedance.sdk.openadsdk.yDt.bX.bg() { // from class: com.bytedance.sdk.openadsdk.eqN.bX.46
            @Override // com.bytedance.sdk.openadsdk.yDt.bX.bg
            public org.json.JSONObject bg() {
                return jSONObject;
            }
        });
    }

    @com.pgl.ssdk.ces.out.DungeonFlag
    public static void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str, org.json.JSONObject jSONObject) {
        eqN(tuv, com.json.j5.v, str, jSONObject);
    }

    @com.pgl.ssdk.ces.out.DungeonFlag
    private static void eqN(final com.bytedance.sdk.openadsdk.core.model.tuV tuv, final java.lang.String str, final java.lang.String str2, final org.json.JSONObject jSONObject) {
        if (tuv == null || android.text.TextUtils.isEmpty(str)) {
            return;
        }
        if (tuv.XQ() && com.json.j5.v.equals(str)) {
            return;
        }
        if (com.json.j5.v.equals(str)) {
            tuv.Kg(true);
        }
        final long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        bg(new com.bytedance.sdk.component.Kg.Kg("onShow") { // from class: com.bytedance.sdk.openadsdk.eqN.bX.47
            @Override // java.lang.Runnable
            public void run() {
                final java.lang.String strBg;
                if (com.bytedance.sdk.openadsdk.core.VzQ.eqN().Ny()) {
                    strBg = com.bytedance.sdk.openadsdk.core.WR.bg.bg.bg((android.app.Application) com.bytedance.sdk.openadsdk.core.VzQ.bg()).bg(str2, com.bytedance.sdk.openadsdk.utils.DeviceUtils.bg(), tuv.IGR());
                } else {
                    strBg = "none";
                }
                com.bytedance.sdk.openadsdk.eqN.bX.bg(jCurrentTimeMillis, tuv, str2, str, new com.bytedance.sdk.openadsdk.yDt.bX.bg() { // from class: com.bytedance.sdk.openadsdk.eqN.bX.47.1
                    @Override // com.bytedance.sdk.openadsdk.yDt.bX.bg
                    public org.json.JSONObject bg() {
                        java.lang.Object obj;
                        try {
                            com.bytedance.sdk.openadsdk.core.kMt.IL(tuv);
                            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                            try {
                                if (jSONObject != null) {
                                    jSONObject.put("interaction_method", tuv.xxp());
                                    jSONObject.put("real_interaction_method", tuv.vb());
                                    jSONObject.put("video_skip_result", com.bytedance.sdk.openadsdk.core.VzQ.eqN().Ta(java.lang.String.valueOf(tuv.IGR())));
                                    jSONObject.put("au_show", strBg);
                                    com.bytedance.sdk.openadsdk.tuV.bg.bg.bg(tuv, jSONObject);
                                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                                } else {
                                    org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                                    jSONObject3.put("interaction_method", tuv.xxp());
                                    jSONObject3.put("real_interaction_method", tuv.vb());
                                    jSONObject3.put("video_skip_result", com.bytedance.sdk.openadsdk.core.VzQ.eqN().Ta(java.lang.String.valueOf(tuv.IGR())));
                                    jSONObject3.put("au_show", strBg);
                                    com.bytedance.sdk.openadsdk.tuV.bg.bg.bg(tuv, jSONObject3);
                                    jSONObject2.put("ad_extra_data", jSONObject3.toString());
                                }
                                jSONObject2.putOpt("log_extra", tuv.Ny());
                                float fFloatValue = java.lang.Double.valueOf((java.lang.System.currentTimeMillis() / 1000) - tuv.dFf()).floatValue();
                                if (fFloatValue <= 0.0f) {
                                    fFloatValue = 0.0f;
                                }
                                jSONObject2.putOpt("show_time", java.lang.Float.valueOf(fFloatValue));
                                jSONObject2.putOpt("ua_policy", java.lang.Integer.valueOf(tuv.ZQc()));
                                java.lang.String strUw = tuv.Uw();
                                if (!android.text.TextUtils.isEmpty(strUw) && !android.text.TextUtils.isEmpty(strUw)) {
                                    try {
                                        jSONObject2.put("ttdsp_price", java.lang.Math.round(java.lang.Float.parseFloat(strUw) * 100000.0f));
                                    } catch (java.lang.Throwable th) {
                                        jSONObject2.put("ttdsp_price", 0);
                                        com.bytedance.sdk.component.utils.PX.bg("TTAD.AdEvent", th.getMessage());
                                    }
                                }
                                if (tuv.jA() == null) {
                                    return jSONObject2;
                                }
                                try {
                                    java.lang.Object obj2 = tuv.jA().get(com.bytedance.sdk.openadsdk.TTAdConstant.SDK_BIDDING_TYPE);
                                    if (obj2 == null || java.lang.Integer.parseInt(obj2.toString()) != 2 || (obj = tuv.jA().get("price")) == null) {
                                        return jSONObject2;
                                    }
                                    jSONObject2.put("ttdsp_price", java.lang.Math.round(java.lang.Double.parseDouble(obj.toString()) * 100000.0d));
                                    return jSONObject2;
                                } catch (java.lang.Throwable th2) {
                                    com.bytedance.sdk.component.utils.PX.bg("TTAD.AdEvent", "client bidding price error: ", th2);
                                    return jSONObject2;
                                }
                                return jSONObject2;
                            } catch (java.lang.Exception unused) {
                                return jSONObject2;
                            }
                        } catch (java.lang.Exception unused2) {
                            return null;
                        }
                    }
                });
                if (com.json.j5.v.equals(str)) {
                    if (!tuv.zU()) {
                        if (tuv.Fb()) {
                            com.bytedance.sdk.openadsdk.core.PX.IL.bX.bg(tuv.GZ(), new com.bytedance.sdk.openadsdk.core.PX.IL.bX.IL("show_urls", tuv));
                        } else {
                            com.bytedance.sdk.openadsdk.eqN.bX.bg(tuv);
                        }
                    }
                    org.json.JSONObject jSONObject2 = jSONObject;
                    if (jSONObject2 != null) {
                        int iOptInt = jSONObject2.optInt("dynamic_show_type");
                        if (tuv.GEa() == 1 && (iOptInt == 7 || iOptInt == 10)) {
                            com.bytedance.sdk.component.utils.iR.bg().postDelayed(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.eqN.bX.47.2
                                @Override // java.lang.Runnable
                                public void run() {
                                    org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                                    try {
                                        jSONObject3.put("auto_click", true);
                                        com.bytedance.sdk.openadsdk.eqN.bX.IL(tuv, str2, com.json.z8.CLICK, jSONObject3);
                                    } catch (java.lang.Exception unused) {
                                        com.bytedance.sdk.component.utils.PX.bg("TTAD.AdEvent", "ugen click exception");
                                    }
                                }
                            }, com.bytedance.sdk.openadsdk.core.settings.xxp.zU().huT());
                        }
                    }
                    com.bytedance.sdk.openadsdk.core.WR.bX.bg(tuv, strBg);
                }
            }
        });
    }

    public static void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        if (android.text.TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.PX.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg()))) {
            return;
        }
        com.bytedance.sdk.openadsdk.eqN.bg.eqN.bg(com.bytedance.sdk.openadsdk.rri.bg.bg(tuv.GZ(), true), 1, tuv.Ys());
    }

    @com.pgl.ssdk.ces.out.DungeonFlag
    public static void bg(final java.lang.String str, final com.bytedance.sdk.openadsdk.core.model.tuV tuv, final java.lang.String str2, final com.bytedance.sdk.openadsdk.eqN.iR iRVar) {
        if (tuv == null || iRVar == null || !iRVar.bg()) {
            return;
        }
        bg(java.lang.System.currentTimeMillis(), tuv, str2, "ad_show_time", new com.bytedance.sdk.openadsdk.yDt.bX.bg() { // from class: com.bytedance.sdk.openadsdk.eqN.bX.48
            @Override // com.bytedance.sdk.openadsdk.yDt.bX.bg
            public org.json.JSONObject bg() {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put("duration", str);
                    com.bytedance.sdk.openadsdk.eqN.iR iRVar2 = iRVar;
                    if (iRVar2 != null && iRVar2.IL() != null) {
                        org.json.JSONObject jSONObjectIL = iRVar.IL();
                        if (str2.equals("open_ad")) {
                            jSONObjectIL.put("is_icon_only", tuv.NC() ? 1 : 0);
                        }
                        jSONObject.put("ad_extra_data", jSONObjectIL.toString());
                    }
                } catch (java.lang.Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void bg(final com.bytedance.sdk.openadsdk.core.model.tuV tuv, final java.lang.String str, final com.bytedance.sdk.openadsdk.utils.daV dav) {
        if (tuv == null) {
            return;
        }
        final long jBX = dav.bX();
        bg(java.lang.System.currentTimeMillis(), tuv, str, "stay_duration", new com.bytedance.sdk.openadsdk.yDt.bX.bg() { // from class: com.bytedance.sdk.openadsdk.eqN.bX.2
            @Override // com.bytedance.sdk.openadsdk.yDt.bX.bg
            public org.json.JSONObject bg() {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    jSONObject.put("click_stay_time", jBX);
                    jSONObject.put("click_time", dav.bg);
                    if (str.equals("open_ad")) {
                        jSONObject.put("is_icon_only", tuv.NC() ? 1 : 0);
                    }
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                } catch (java.lang.Throwable unused) {
                }
                return jSONObject2;
            }
        });
    }

    public static void IL(com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str, final long j) {
        if (tuv != null && j > 0 && j < 200000) {
            bg(java.lang.System.currentTimeMillis(), tuv, str, "video_click_duration", new com.bytedance.sdk.openadsdk.yDt.bX.bg() { // from class: com.bytedance.sdk.openadsdk.eqN.bX.3
                @Override // com.bytedance.sdk.openadsdk.yDt.bX.bg
                public org.json.JSONObject bg() {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    try {
                        jSONObject.put("video_click_duration_time", j);
                        jSONObject2.put("ad_extra_data", jSONObject.toString());
                    } catch (java.lang.Throwable unused) {
                    }
                    return jSONObject2;
                }
            });
        }
    }

    public static void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, final java.lang.String str, final int i, final java.lang.String str2, final long j, final boolean z, final int i2, final long j2) {
        bg(java.lang.System.currentTimeMillis(), tuv, str, com.bytedance.sdk.openadsdk.eqN.IL.eqN, new com.bytedance.sdk.openadsdk.yDt.bX.bg() { // from class: com.bytedance.sdk.openadsdk.eqN.bX.4
            @Override // com.bytedance.sdk.openadsdk.yDt.bX.bg
            public org.json.JSONObject bg() {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    jSONObject.put("invisible_scene", i);
                    jSONObject.put("arbi_current_url", str2);
                    jSONObject.put("loading_visible_time", j);
                    jSONObject.put("arbi_trigger_start", z);
                    jSONObject.put("arbi_convert_count", i2);
                    jSONObject.put("loading_start_timestamp", j2);
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                } catch (java.lang.Throwable th) {
                    com.bytedance.sdk.component.utils.PX.IL(th.toString());
                }
                java.lang.Object[] objArr = new java.lang.Object[3];
                return jSONObject2;
            }
        });
    }

    public static void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str, final long j, final boolean z) {
        bg(java.lang.System.currentTimeMillis(), tuv, str, "lp_loading", new com.bytedance.sdk.openadsdk.yDt.bX.bg() { // from class: com.bytedance.sdk.openadsdk.eqN.bX.5
            @Override // com.bytedance.sdk.openadsdk.yDt.bX.bg
            public org.json.JSONObject bg() {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    jSONObject.put("if_lp_loading_success", z ? 1 : 2);
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                    jSONObject2.put("duration", j);
                } catch (java.lang.Throwable th) {
                    com.bytedance.sdk.component.utils.PX.IL(th.toString());
                }
                return jSONObject2;
            }
        });
    }

    public static void IL(com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str, final int i) {
        bg(java.lang.System.currentTimeMillis(), tuv, str, "check_meta", new com.bytedance.sdk.openadsdk.yDt.bX.bg() { // from class: com.bytedance.sdk.openadsdk.eqN.bX.6
            @Override // com.bytedance.sdk.openadsdk.yDt.bX.bg
            public org.json.JSONObject bg() {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    jSONObject.put("error_code", i);
                    jSONObject.put("check_url", com.bytedance.sdk.openadsdk.core.settings.xxp.zU().HXG());
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                } catch (java.lang.Throwable th) {
                    com.bytedance.sdk.component.utils.PX.IL(th.toString());
                }
                return jSONObject2;
            }
        });
    }

    public static void bX(com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str, final int i) {
        bg(java.lang.System.currentTimeMillis(), tuv, str, "check_meta_more", new com.bytedance.sdk.openadsdk.yDt.bX.bg() { // from class: com.bytedance.sdk.openadsdk.eqN.bX.7
            @Override // com.bytedance.sdk.openadsdk.yDt.bX.bg
            public org.json.JSONObject bg() {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    jSONObject.put("error_code", i);
                    jSONObject.put("check_url", com.bytedance.sdk.openadsdk.core.settings.xxp.zU().HXG());
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                } catch (java.lang.Throwable th) {
                    com.bytedance.sdk.component.utils.PX.IL(th.toString());
                }
                return jSONObject2;
            }
        });
    }

    public static void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, final java.lang.String str, final int i, final java.lang.String str2, final int i2) {
        bg(java.lang.System.currentTimeMillis(), tuv, str, com.bytedance.sdk.openadsdk.eqN.IL.bg, new com.bytedance.sdk.openadsdk.yDt.bX.bg() { // from class: com.bytedance.sdk.openadsdk.eqN.bX.8
            @Override // com.bytedance.sdk.openadsdk.yDt.bX.bg
            public org.json.JSONObject bg() {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    jSONObject.put(com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, i);
                    jSONObject.put("arbi_current_url", str2);
                    org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                    jSONObject3.put("new_index", i2);
                    jSONObject.put("pag_json_data", jSONObject3.toString());
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                } catch (java.lang.Throwable th) {
                    com.bytedance.sdk.component.utils.PX.IL(th.toString());
                }
                java.lang.Object[] objArr = new java.lang.Object[3];
                return jSONObject2;
            }
        });
    }

    public static void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, final java.lang.String str, final int i, final java.lang.String str2, final float f) {
        bg(java.lang.System.currentTimeMillis(), tuv, str, com.bytedance.sdk.openadsdk.eqN.IL.IL, new com.bytedance.sdk.openadsdk.yDt.bX.bg() { // from class: com.bytedance.sdk.openadsdk.eqN.bX.9
            @Override // com.bytedance.sdk.openadsdk.yDt.bX.bg
            public org.json.JSONObject bg() {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    jSONObject.put(com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, i);
                    jSONObject.put("arbi_current_url", str2);
                    jSONObject.put("arbi_load_duration", f);
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                } catch (java.lang.Throwable th) {
                    com.bytedance.sdk.component.utils.PX.IL(th.toString());
                }
                java.lang.Object[] objArr = new java.lang.Object[3];
                return jSONObject2;
            }
        });
    }

    public static void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, final java.lang.String str, final int i, final java.lang.String str2, final java.lang.String str3, final int i2) {
        bg(java.lang.System.currentTimeMillis(), tuv, str, com.bytedance.sdk.openadsdk.eqN.IL.bX, new com.bytedance.sdk.openadsdk.yDt.bX.bg() { // from class: com.bytedance.sdk.openadsdk.eqN.bX.10
            @Override // com.bytedance.sdk.openadsdk.yDt.bX.bg
            public org.json.JSONObject bg() {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    jSONObject.put(com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, i);
                    jSONObject.put("arbi_current_url", str2);
                    jSONObject.put(com.applovin.sdk.AppLovinWebViewActivity.INTENT_EXTRA_KEY_LOAD_URL, str3);
                    jSONObject.put("url_flag", i2);
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                } catch (java.lang.Throwable th) {
                    com.bytedance.sdk.component.utils.PX.IL(th.toString());
                }
                java.lang.Object[] objArr = new java.lang.Object[3];
                return jSONObject2;
            }
        });
    }

    public static void IL(final com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str) {
        bg(java.lang.System.currentTimeMillis(), tuv, str, "picture_click", new com.bytedance.sdk.openadsdk.yDt.bX.bg() { // from class: com.bytedance.sdk.openadsdk.eqN.bX.12
            @Override // com.bytedance.sdk.openadsdk.yDt.bX.bg
            public org.json.JSONObject bg() {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    jSONObject.put("ad_slot_type", tuv.VW().getNativeAdType());
                    jSONObject.put("interaction_method", tuv.xxp());
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                } catch (java.lang.Throwable th) {
                    com.bytedance.sdk.component.utils.PX.IL(th.toString());
                }
                return jSONObject2;
            }
        });
    }

    @com.pgl.ssdk.ces.out.DungeonFlag
    public static void bg(final java.lang.String str, final com.bytedance.sdk.openadsdk.core.model.tuV tuv, final com.bytedance.sdk.openadsdk.core.model.eo eoVar, final java.lang.String str2, final boolean z, final java.util.Map<java.lang.String, java.lang.Object> map, final int i) {
        final long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        bg(new com.bytedance.sdk.component.Kg.Kg("onClick") { // from class: com.bytedance.sdk.openadsdk.eqN.bX.13
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.core.model.tuV tuv2 = tuv;
                if (tuv2 == null) {
                    return;
                }
                com.bytedance.sdk.openadsdk.eqN.bX.bg(jCurrentTimeMillis, tuv2, str2, str, new com.bytedance.sdk.openadsdk.yDt.bX.bg() { // from class: com.bytedance.sdk.openadsdk.eqN.bX.13.1
                    @Override // com.bytedance.sdk.openadsdk.yDt.bX.bg
                    public org.json.JSONObject bg() {
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        try {
                            if (eoVar != null) {
                                org.json.JSONObject jSONObjectBg = eoVar.bg();
                                jSONObjectBg.put("is_valid", z);
                                if (i > 0 && i <= 2) {
                                    jSONObjectBg.put("user_behavior_type", i);
                                }
                                if (map != null) {
                                    if (map.containsKey("duration")) {
                                        jSONObject.put("duration", map.get("duration"));
                                    }
                                    for (java.util.Map.Entry entry : map.entrySet()) {
                                        if (!"duration".equals(entry.getKey())) {
                                            jSONObjectBg.put((java.lang.String) entry.getKey(), entry.getValue());
                                        }
                                    }
                                }
                                jSONObjectBg.put("interaction_method", tuv.xxp());
                                if (str2.equals("open_ad")) {
                                    jSONObjectBg.put("is_icon_only", tuv.NC() ? 1 : 0);
                                }
                                jSONObject.put("ad_extra_data", jSONObjectBg.toString());
                            }
                            jSONObject.putOpt("log_extra", tuv.Ny());
                            float fFloatValue = java.lang.Double.valueOf((java.lang.System.currentTimeMillis() / 1000) - tuv.dFf()).floatValue();
                            if (fFloatValue <= 0.0f) {
                                fFloatValue = 0.0f;
                            }
                            jSONObject.putOpt("show_time", java.lang.Float.valueOf(fFloatValue));
                            jSONObject.putOpt("ua_policy", java.lang.Integer.valueOf(tuv.ZQc()));
                        } catch (java.lang.Exception unused) {
                        }
                        return jSONObject;
                    }
                });
                if (!android.text.TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.PX.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg())) && com.json.z8.CLICK.equals(str)) {
                    com.bytedance.sdk.openadsdk.eqN.bg.eqN.bg(com.bytedance.sdk.openadsdk.rri.bg.bg(tuv.bCU(), true), 2, tuv.Ys());
                }
                if (com.json.z8.CLICK.equals(str)) {
                    com.bytedance.sdk.openadsdk.core.kMt.bX(tuv);
                }
            }
        });
    }

    public static void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str, java.lang.String str2, final org.json.JSONObject jSONObject) {
        bg(java.lang.System.currentTimeMillis(), tuv, str, str2, new com.bytedance.sdk.openadsdk.yDt.bX.bg() { // from class: com.bytedance.sdk.openadsdk.eqN.bX.14
            @Override // com.bytedance.sdk.openadsdk.yDt.bX.bg
            public org.json.JSONObject bg() {
                if (jSONObject == null) {
                    return null;
                }
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                    if (jSONObject.has("duration")) {
                        jSONObject2.put("duration", jSONObject.get("duration"));
                    }
                } catch (java.lang.Exception e) {
                    com.bytedance.sdk.component.utils.PX.bg("TTAD.AdEvent", e.getMessage());
                }
                return jSONObject2;
            }
        });
        if (com.json.z8.CLICK.equals(str2)) {
            com.bytedance.sdk.openadsdk.core.kMt.bX(tuv);
        }
    }

    public static void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str, final int i, final long j) {
        bg(java.lang.System.currentTimeMillis(), tuv, str, "video_choose", new com.bytedance.sdk.openadsdk.yDt.bX.bg() { // from class: com.bytedance.sdk.openadsdk.eqN.bX.15
            @Override // com.bytedance.sdk.openadsdk.yDt.bX.bg
            public org.json.JSONObject bg() {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put("video_choose", i);
                    jSONObject2.put("video_choose_duration", j);
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                } catch (java.lang.Throwable th) {
                    com.bytedance.sdk.component.utils.PX.IL(th.toString());
                }
                return jSONObject;
            }
        });
    }

    public static void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str, final java.lang.String str2, final long j, final int i, org.json.JSONObject jSONObject, final com.bytedance.sdk.openadsdk.eqN.iR iRVar) {
        final org.json.JSONObject jSONObject2 = jSONObject == null ? new org.json.JSONObject() : jSONObject;
        bg(java.lang.System.currentTimeMillis(), tuv, str, str2, new com.bytedance.sdk.openadsdk.yDt.bX.bg() { // from class: com.bytedance.sdk.openadsdk.eqN.bX.16
            @Override // com.bytedance.sdk.openadsdk.yDt.bX.bg
            public org.json.JSONObject bg() {
                com.bytedance.sdk.openadsdk.eqN.iR iRVar2;
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                try {
                    jSONObject3.put("duration", j);
                    jSONObject3.put("percent", i);
                    if (("feed_break".equals(str2) || "feed_over".equals(str2)) && (iRVar2 = iRVar) != null) {
                        iRVar2.bg(jSONObject2);
                    }
                    jSONObject3.put("ad_extra_data", jSONObject2.toString());
                } catch (java.lang.Throwable unused) {
                }
                return jSONObject3;
            }
        });
    }

    public static void IL(com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str, java.lang.String str2, final org.json.JSONObject jSONObject) {
        bg(java.lang.System.currentTimeMillis(), tuv, str, str2, new com.bytedance.sdk.openadsdk.yDt.bX.bg() { // from class: com.bytedance.sdk.openadsdk.eqN.bX.17
            @Override // com.bytedance.sdk.openadsdk.yDt.bX.bg
            public org.json.JSONObject bg() {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    org.json.JSONObject jSONObject3 = jSONObject;
                    if (jSONObject3 != null) {
                        jSONObject2.put("ad_extra_data", jSONObject3.toString());
                    }
                } catch (java.lang.Exception unused) {
                }
                return jSONObject2;
            }
        });
    }

    public static void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str, java.lang.String str2, final org.json.JSONObject jSONObject, final long j) {
        bg(java.lang.System.currentTimeMillis(), tuv, str, str2, new com.bytedance.sdk.openadsdk.yDt.bX.bg() { // from class: com.bytedance.sdk.openadsdk.eqN.bX.18
            @Override // com.bytedance.sdk.openadsdk.yDt.bX.bg
            public org.json.JSONObject bg() {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    org.json.JSONObject jSONObject3 = jSONObject;
                    if (jSONObject3 != null) {
                        jSONObject2.put("ad_extra_data", jSONObject3.toString());
                    }
                    jSONObject2.put("duration", j);
                } catch (java.lang.Exception unused) {
                }
                return jSONObject2;
            }
        });
    }

    public static void bg(final com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str, java.lang.String str2, final java.util.Map<java.lang.String, java.lang.Object> map) {
        bg(java.lang.System.currentTimeMillis(), tuv, str, str2, new com.bytedance.sdk.openadsdk.yDt.bX.bg() { // from class: com.bytedance.sdk.openadsdk.eqN.bX.19
            @Override // com.bytedance.sdk.openadsdk.yDt.bX.bg
            public org.json.JSONObject bg() {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    java.util.Map map2 = map;
                    if (map2 != null) {
                        for (java.util.Map.Entry entry : map2.entrySet()) {
                            jSONObject2.put((java.lang.String) entry.getKey(), entry.getValue());
                        }
                    }
                    jSONObject2.put("dp_creative_type", tuv.OLh());
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                } catch (java.lang.Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    @com.pgl.ssdk.ces.out.DungeonFlag
    public static void bg(long j, com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str, java.lang.String str2) {
        bg(j, tuv, str, str2, (com.bytedance.sdk.openadsdk.yDt.bX.bg) null);
    }

    @com.pgl.ssdk.ces.out.DungeonFlag
    public static void bg(final long j, final com.bytedance.sdk.openadsdk.core.model.tuV tuv, final java.lang.String str, final java.lang.String str2, final com.bytedance.sdk.openadsdk.yDt.bX.bg bgVar) {
        if (tuv == null || android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2) || bg(tuv.fVE(), str2)) {
            return;
        }
        bg(new com.bytedance.sdk.component.Kg.Kg(str2) { // from class: com.bytedance.sdk.openadsdk.eqN.bX.20
            @Override // java.lang.Runnable
            public void run() {
                org.json.JSONObject jSONObject;
                try {
                    com.bytedance.sdk.openadsdk.yDt.bX.bg bgVar2 = bgVar;
                    if (bgVar2 != null) {
                        jSONObject = bgVar2.bg();
                        if (jSONObject == null) {
                            try {
                                jSONObject = new org.json.JSONObject();
                            } catch (java.lang.Exception unused) {
                            }
                        }
                    } else {
                        jSONObject = new org.json.JSONObject();
                    }
                    jSONObject.putOpt("log_extra", tuv.Ny());
                    jSONObject.putOpt("ua_policy", java.lang.Integer.valueOf(tuv.ZQc()));
                } catch (java.lang.Exception unused2) {
                    jSONObject = null;
                }
                new com.bytedance.sdk.openadsdk.eqN.bg.C0159bg(j, tuv).IL(str).bX(str2).zx(tuv.Ys()).Kg(tuv.MM()).bg(tuv.dS()).bg(jSONObject).iR(tuv.waE()).bg((com.bytedance.sdk.openadsdk.eqN.IL.bg) null);
            }
        });
    }

    public static void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str, final java.lang.String str2, final com.bytedance.sdk.openadsdk.yDt.bX.bg bgVar) {
        bg(java.lang.System.currentTimeMillis(), tuv, str, "playable_track", new com.bytedance.sdk.openadsdk.yDt.bX.bg() { // from class: com.bytedance.sdk.openadsdk.eqN.bX.21
            @Override // com.bytedance.sdk.openadsdk.yDt.bX.bg
            public org.json.JSONObject bg() {
                org.json.JSONObject jSONObject;
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    com.bytedance.sdk.openadsdk.yDt.bX.bg bgVar2 = bgVar;
                    if (bgVar2 == null || (jSONObject = bgVar2.bg()) == null) {
                        jSONObject = new org.json.JSONObject();
                    }
                    jSONObject.put("is_new_playable", 1);
                    org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                    jSONObject3.put("pag_json_data", jSONObject.toString());
                    jSONObject3.put("playable_event", str2);
                    jSONObject2.put("ad_extra_data", jSONObject3.toString());
                } catch (java.lang.Exception unused) {
                }
                return jSONObject2;
            }
        });
    }

    public static void IL(final long j, final com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str, final java.lang.String str2) {
        bg(java.lang.System.currentTimeMillis(), tuv, str, "endcard_feeling_duraion", new com.bytedance.sdk.openadsdk.yDt.bX.bg() { // from class: com.bytedance.sdk.openadsdk.eqN.bX.23
            @Override // com.bytedance.sdk.openadsdk.yDt.bX.bg
            public org.json.JSONObject bg() {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject.put("duration", j);
                    if (com.bytedance.sdk.openadsdk.core.model.tuV.bX(tuv)) {
                        if (tuv.Az() != null) {
                            jSONObject2.putOpt("url", tuv.Az().bX());
                            jSONObject2.putOpt("id", tuv.Az().bg());
                            jSONObject2.putOpt("md5", tuv.Az().IL());
                        }
                        jSONObject2.putOpt("from", str2);
                        if (tuv.Dxa() != null) {
                            jSONObject2.putOpt("render_type", 7);
                        }
                    } else {
                        jSONObject2.put("url", tuv.Dxa().PX());
                        jSONObject2.put("style_id", tuv.Cv());
                        if (tuv.Dxa() != null) {
                            jSONObject2.putOpt("render_type", 0);
                        }
                    }
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                } catch (java.lang.Exception e) {
                    com.bytedance.sdk.component.utils.PX.IL(e.getMessage());
                }
                return jSONObject;
            }
        });
    }

    public static void bX(final com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str) {
        if (tuv == null || !com.bytedance.sdk.openadsdk.core.model.tuV.bX(tuv) || tuv.Az() == null) {
            return;
        }
        bg(java.lang.System.currentTimeMillis(), tuv, str, "endcard_show", new com.bytedance.sdk.openadsdk.yDt.bX.bg() { // from class: com.bytedance.sdk.openadsdk.eqN.bX.24
            @Override // com.bytedance.sdk.openadsdk.yDt.bX.bg
            public org.json.JSONObject bg() {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.putOpt("url", tuv.Az().bX());
                    jSONObject2.putOpt("id", tuv.Az().bg());
                    jSONObject2.putOpt("md5", tuv.Az().IL());
                    if (tuv.Dxa() != null) {
                        jSONObject2.putOpt("render_type", java.lang.Integer.valueOf(tuv.Dxa().eqN()));
                    }
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                } catch (java.lang.Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, final com.bytedance.sdk.openadsdk.yDt.bg.bg bgVar, final java.lang.String str) {
        bg(java.lang.System.currentTimeMillis(), tuv, str, "web_behavior_keyword", new com.bytedance.sdk.openadsdk.yDt.bX.bg() { // from class: com.bytedance.sdk.openadsdk.eqN.bX.25
            @Override // com.bytedance.sdk.openadsdk.yDt.bX.bg
            public org.json.JSONObject bg() {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put("arbi_current_url", bgVar.bX());
                    jSONObject2.put("keyword", bgVar.xxp());
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                } catch (java.lang.Throwable th) {
                    com.bytedance.sdk.openadsdk.utils.LZ.IL("TTAD.AdEvent", "onWebBehaviorKeyword", th.getMessage());
                }
                java.lang.Object[] objArr = new java.lang.Object[3];
                return jSONObject;
            }
        });
    }

    public static void IL(com.bytedance.sdk.openadsdk.core.model.tuV tuv, final com.bytedance.sdk.openadsdk.yDt.bg.bg bgVar, final java.lang.String str) {
        bg(java.lang.System.currentTimeMillis(), tuv, str, "web_behavior_load", new com.bytedance.sdk.openadsdk.yDt.bX.bg() { // from class: com.bytedance.sdk.openadsdk.eqN.bX.26
            @Override // com.bytedance.sdk.openadsdk.yDt.bX.bg
            public org.json.JSONObject bg() {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put("arbi_current_url", bgVar.bX());
                    jSONObject2.put("current_url_index", bgVar.eqN());
                    jSONObject2.put("arbi_load_duration", bgVar.VzQ());
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                } catch (java.lang.Throwable th) {
                    com.bytedance.sdk.openadsdk.utils.LZ.IL("TTAD.AdEvent", "onWebBehaviorLoad", th.getMessage());
                }
                java.lang.Object[] objArr = new java.lang.Object[3];
                return jSONObject;
            }
        });
    }

    public static void bX(com.bytedance.sdk.openadsdk.core.model.tuV tuv, final com.bytedance.sdk.openadsdk.yDt.bg.bg bgVar, final java.lang.String str) {
        bg(java.lang.System.currentTimeMillis(), tuv, str, "web_behavior_stay", new com.bytedance.sdk.openadsdk.yDt.bX.bg() { // from class: com.bytedance.sdk.openadsdk.eqN.bX.27
            @Override // com.bytedance.sdk.openadsdk.yDt.bX.bg
            public org.json.JSONObject bg() {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put("arbi_current_url", bgVar.bX());
                    jSONObject2.put("current_url_index", bgVar.eqN());
                    jSONObject2.put("arbi_stay_duration", bgVar.yDt());
                    jSONObject2.put("browsing_percentage", bgVar.Lq());
                    jSONObject2.put("out_focus_scene", bgVar.vb());
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                } catch (java.lang.Throwable th) {
                    com.bytedance.sdk.openadsdk.utils.LZ.IL("TTAD.AdEvent", "onWebBehaviorStay", th.getMessage());
                }
                java.lang.Object[] objArr = new java.lang.Object[3];
                return jSONObject;
            }
        });
    }

    public static void eqN(com.bytedance.sdk.openadsdk.core.model.tuV tuv, final com.bytedance.sdk.openadsdk.yDt.bg.bg bgVar, final java.lang.String str) {
        bg(java.lang.System.currentTimeMillis(), tuv, str, "web_behavior_scroll", new com.bytedance.sdk.openadsdk.yDt.bX.bg() { // from class: com.bytedance.sdk.openadsdk.eqN.bX.28
            @Override // com.bytedance.sdk.openadsdk.yDt.bX.bg
            public org.json.JSONObject bg() {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put("arbi_current_url", bgVar.bX());
                    jSONObject2.put("current_url_index", bgVar.eqN());
                    jSONObject2.put("trigger_scroll_x", bgVar.WR());
                    jSONObject2.put("trigger_scroll_y", bgVar.eo());
                    jSONObject2.put("arbi_offset_y", bgVar.VB());
                    jSONObject2.put("scroll_type", bgVar.PX());
                    jSONObject2.put("scroll_duration", bgVar.Ta());
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                } catch (java.lang.Throwable th) {
                    com.bytedance.sdk.openadsdk.utils.LZ.IL("TTAD.AdEvent", "onWebBehaviorScroll", th.getMessage());
                }
                java.lang.Object[] objArr = new java.lang.Object[3];
                return jSONObject;
            }
        });
    }

    public static void zx(com.bytedance.sdk.openadsdk.core.model.tuV tuv, final com.bytedance.sdk.openadsdk.yDt.bg.bg bgVar, final java.lang.String str) {
        bg(java.lang.System.currentTimeMillis(), tuv, str, "web_behavior_click", new com.bytedance.sdk.openadsdk.yDt.bX.bg() { // from class: com.bytedance.sdk.openadsdk.eqN.bX.29
            @Override // com.bytedance.sdk.openadsdk.yDt.bX.bg
            public org.json.JSONObject bg() {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put("arbi_current_url", bgVar.bX());
                    jSONObject2.put("current_url_index", bgVar.eqN());
                    jSONObject2.put("arbi_start_x", bgVar.zx());
                    jSONObject2.put("arbi_start_y", bgVar.ldr());
                    jSONObject2.put("click_duration", bgVar.iR());
                    jSONObject2.put("is_trigger_jump", bgVar.Kg());
                    jSONObject2.put("click_type", java.lang.String.valueOf(bgVar.tuV()));
                    if (bgVar.bg() != -1) {
                        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                        jSONObject3.put("hit_type", bgVar.bg());
                        jSONObject3.put("hit_extra", bgVar.IL());
                        jSONObject2.put("pag_json_data", jSONObject3.toString());
                    }
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                } catch (java.lang.Throwable th) {
                    com.bytedance.sdk.openadsdk.utils.LZ.IL("TTAD.AdEvent", "onWebBehaviorClick", th.getMessage());
                }
                java.lang.Object[] objArr = new java.lang.Object[3];
                return jSONObject;
            }
        });
    }

    public static void bg(final long j, final com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str) {
        if (tuv == null || !com.bytedance.sdk.openadsdk.core.model.tuV.bX(tuv) || tuv.Az() == null) {
            return;
        }
        bg(java.lang.System.currentTimeMillis(), tuv, str, "endcard_close", new com.bytedance.sdk.openadsdk.yDt.bX.bg() { // from class: com.bytedance.sdk.openadsdk.eqN.bX.30
            @Override // com.bytedance.sdk.openadsdk.yDt.bX.bg
            public org.json.JSONObject bg() {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.putOpt("url", tuv.Az().bX());
                    jSONObject2.putOpt("id", tuv.Az().bg());
                    jSONObject2.putOpt("md5", tuv.Az().IL());
                    if (tuv.Dxa() != null) {
                        jSONObject2.putOpt("render_type", java.lang.Integer.valueOf(tuv.Dxa().eqN()));
                    }
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                    jSONObject.put("duration", j);
                } catch (java.lang.Exception e) {
                    com.bytedance.sdk.component.utils.PX.IL(e.getMessage());
                }
                return jSONObject;
            }
        });
    }

    public static void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str, final java.lang.String str2) {
        bg(java.lang.System.currentTimeMillis(), tuv, str, "show_error", new com.bytedance.sdk.openadsdk.yDt.bX.bg() { // from class: com.bytedance.sdk.openadsdk.eqN.bX.31
            @Override // com.bytedance.sdk.openadsdk.yDt.bX.bg
            public org.json.JSONObject bg() {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    jSONObject2.putOpt("error_msg", str2);
                    jSONObject.putOpt("ad_extra_data", jSONObject2.toString());
                } catch (java.lang.Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str, java.lang.String str2, final long j, final org.json.JSONObject jSONObject) {
        if (tuv == null || jSONObject == null) {
            return;
        }
        bg(java.lang.System.currentTimeMillis(), tuv, str, str2, new com.bytedance.sdk.openadsdk.yDt.bX.bg() { // from class: com.bytedance.sdk.openadsdk.eqN.bX.32
            @Override // com.bytedance.sdk.openadsdk.yDt.bX.bg
            public org.json.JSONObject bg() {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    jSONObject2.put("duration", j);
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                } catch (java.lang.Exception e) {
                    com.bytedance.sdk.component.utils.PX.bg("TTAD.AdEvent", e.getMessage());
                }
                return jSONObject2;
            }
        });
    }

    public static void IL(com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str, java.lang.String str2, final org.json.JSONObject jSONObject, final long j) {
        if (tuv == null || jSONObject == null) {
            return;
        }
        bg(java.lang.System.currentTimeMillis(), tuv, str, str2, new com.bytedance.sdk.openadsdk.yDt.bX.bg() { // from class: com.bytedance.sdk.openadsdk.eqN.bX.34
            @Override // com.bytedance.sdk.openadsdk.yDt.bX.bg
            public org.json.JSONObject bg() {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                    jSONObject2.put("duration", j);
                } catch (java.lang.Throwable unused) {
                }
                return jSONObject2;
            }
        });
    }

    public static void bX(com.bytedance.sdk.openadsdk.core.model.tuV tuv, final java.lang.String str, final java.lang.String str2, final org.json.JSONObject jSONObject) {
        if (tuv == null || jSONObject == null) {
            return;
        }
        bg(java.lang.System.currentTimeMillis(), tuv, str, str2, new com.bytedance.sdk.openadsdk.yDt.bX.bg() { // from class: com.bytedance.sdk.openadsdk.eqN.bX.35
            @Override // com.bytedance.sdk.openadsdk.yDt.bX.bg
            public org.json.JSONObject bg() {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                } catch (org.json.JSONException unused) {
                }
                java.lang.Object[] objArr = new java.lang.Object[6];
                return jSONObject2;
            }
        });
    }

    public static void IL(com.bytedance.sdk.openadsdk.core.model.tuV tuv, final java.lang.String str, final org.json.JSONObject jSONObject) {
        bg(java.lang.System.currentTimeMillis(), tuv, str, com.bytedance.sdk.openadsdk.eqN.IL.zx, new com.bytedance.sdk.openadsdk.yDt.bX.bg() { // from class: com.bytedance.sdk.openadsdk.eqN.bX.36
            @Override // com.bytedance.sdk.openadsdk.yDt.bX.bg
            public org.json.JSONObject bg() {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                try {
                    jSONObject3.put("pag_json_data", jSONObject);
                    jSONObject2.put("ad_extra_data", jSONObject3);
                } catch (org.json.JSONException unused) {
                }
                java.lang.Object[] objArr = new java.lang.Object[6];
                java.lang.String str2 = com.bytedance.sdk.openadsdk.eqN.IL.zx;
                return jSONObject2;
            }
        });
    }

    public static void bX(com.bytedance.sdk.openadsdk.core.model.tuV tuv, final java.lang.String str, final org.json.JSONObject jSONObject) {
        bg(java.lang.System.currentTimeMillis(), tuv, str, com.bytedance.sdk.openadsdk.eqN.IL.ldr, new com.bytedance.sdk.openadsdk.yDt.bX.bg() { // from class: com.bytedance.sdk.openadsdk.eqN.bX.37
            @Override // com.bytedance.sdk.openadsdk.yDt.bX.bg
            public org.json.JSONObject bg() {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                try {
                    jSONObject3.put("pag_json_data", jSONObject);
                    jSONObject2.put("ad_extra_data", jSONObject3);
                } catch (org.json.JSONException unused) {
                }
                java.lang.Object[] objArr = new java.lang.Object[6];
                java.lang.String str2 = com.bytedance.sdk.openadsdk.eqN.IL.ldr;
                return jSONObject2;
            }
        });
    }

    public static void bg(java.lang.String str, long j) {
        com.bytedance.sdk.openadsdk.core.iR.bX.bg(str, j);
    }

    @com.pgl.ssdk.ces.out.DungeonFlag
    public static void bg(final com.bytedance.sdk.openadsdk.core.model.tuV tuv, final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final long j, final long j2, final org.json.JSONObject jSONObject, final boolean z) {
        if (tuv == null || bg(tuv.fVE(), str3)) {
            return;
        }
        final long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        bg(new com.bytedance.sdk.component.Kg.Kg("sendJsAdEvent") { // from class: com.bytedance.sdk.openadsdk.eqN.bX.38
            @Override // java.lang.Runnable
            public void run() {
                org.json.JSONArray jSONArrayOptJSONArray;
                java.lang.String strDS = tuv.dS();
                if (jSONObject != null) {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    try {
                        java.lang.String strOptString = jSONObject.optString("ad_extra_data");
                        if (!android.text.TextUtils.isEmpty(strOptString)) {
                            jSONObject2 = new org.json.JSONObject(strOptString);
                        }
                        if (!com.json.z8.CLICK.equals(str3)) {
                            jSONObject2.put(com.ironsource.y8.h.G, com.bytedance.sdk.openadsdk.utils.DeviceUtils.zx(com.bytedance.sdk.openadsdk.core.VzQ.bg()).toString());
                        }
                        if (com.json.z8.CLICK.equals(str3)) {
                            if (z) {
                                jSONObject2.put("click_scence", 1);
                            } else if (com.bytedance.sdk.openadsdk.core.model.rri.IL(tuv)) {
                                jSONObject2.put("click_scence", 3);
                            }
                        }
                        if (tuv.kCH()) {
                            try {
                                org.json.JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("pag_json_data");
                                if (jSONObjectOptJSONObject == null) {
                                    jSONObjectOptJSONObject = new org.json.JSONObject();
                                }
                                jSONObjectOptJSONObject.put("is_new_playable", 1);
                                if (tuv.zqp()) {
                                    jSONObjectOptJSONObject.put("is_pre_render", 1);
                                }
                                jSONObject2.put("pag_json_data", jSONObjectOptJSONObject.toString());
                            } catch (java.lang.Throwable unused) {
                            }
                        }
                        jSONObject.put("ad_extra_data", jSONObject2.toString());
                        jSONObject.put("tag", str2);
                        int iOptInt = jSONObject2.optInt("agg_request_type", -1);
                        if (z && iOptInt == 2) {
                            strDS = jSONObject2.optString("app_log_url");
                        }
                        int i = 0;
                        if (com.json.z8.CLICK.equals(str3)) {
                            com.bytedance.sdk.openadsdk.core.kMt.bX(tuv);
                            float fFloatValue = java.lang.Double.valueOf((java.lang.System.currentTimeMillis() / 1000) - com.bytedance.sdk.openadsdk.core.model.tuV.IL(jSONObject.optString("log_extra"))).floatValue();
                            org.json.JSONObject jSONObject3 = jSONObject;
                            if (fFloatValue <= 0.0f) {
                                fFloatValue = 0.0f;
                            }
                            jSONObject3.putOpt("show_time", java.lang.Float.valueOf(fFloatValue));
                            if (!android.text.TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.PX.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg()))) {
                                if (z && iOptInt == 2) {
                                    org.json.JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("click_tracking_url");
                                    if (jSONArrayOptJSONArray2 != null) {
                                        java.util.ArrayList arrayList = new java.util.ArrayList();
                                        while (i < jSONArrayOptJSONArray2.length()) {
                                            arrayList.add(jSONArrayOptJSONArray2.optString(i));
                                            i++;
                                        }
                                        com.bytedance.sdk.openadsdk.eqN.bg.eqN.bg(com.bytedance.sdk.openadsdk.rri.bg.bg(arrayList, true), 2, java.lang.String.valueOf(j));
                                    }
                                } else {
                                    com.bytedance.sdk.openadsdk.core.model.tuV tuv2 = tuv;
                                    if (tuv2 != null) {
                                        com.bytedance.sdk.openadsdk.eqN.bg.eqN.bg(com.bytedance.sdk.openadsdk.rri.bg.bg(tuv2.bCU(), true), 2, tuv.Ys());
                                    }
                                }
                            }
                        } else if (com.json.j5.v.equals(str3) && !android.text.TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.PX.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg())) && z && iOptInt == 2 && (jSONArrayOptJSONArray = jSONObject2.optJSONArray("show_tracking_url")) != null) {
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            while (i < jSONArrayOptJSONArray.length()) {
                                arrayList2.add(jSONArrayOptJSONArray.optString(i));
                                i++;
                            }
                            com.bytedance.sdk.openadsdk.eqN.bg.eqN.bg(com.bytedance.sdk.openadsdk.rri.bg.bg(arrayList2, true), 1, java.lang.String.valueOf(j));
                        }
                    } catch (java.lang.Exception unused2) {
                    }
                }
                new com.bytedance.sdk.openadsdk.eqN.bg.C0159bg(jCurrentTimeMillis, tuv).eqN(str).IL(str2).bX(str3).zx(java.lang.String.valueOf(j)).ldr(java.lang.String.valueOf(j2)).bg(strDS).bg(jSONObject).Kg(tuv.MM()).iR(tuv.waE()).bg((com.bytedance.sdk.openadsdk.eqN.IL.bg) null);
            }
        });
    }

    public static void eqN(com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str, org.json.JSONObject jSONObject) {
        if (tuv == null) {
            return;
        }
        bg(tuv, str, -1L, jSONObject);
    }

    public static void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str, final long j, final org.json.JSONObject jSONObject) {
        bg(java.lang.System.currentTimeMillis(), tuv, "open_ad", str, new com.bytedance.sdk.openadsdk.yDt.bX.bg() { // from class: com.bytedance.sdk.openadsdk.eqN.bX.39
            @Override // com.bytedance.sdk.openadsdk.yDt.bX.bg
            public org.json.JSONObject bg() {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    long j2 = j;
                    if (j2 != -1) {
                        jSONObject2.put("duration", j2);
                    }
                    org.json.JSONObject jSONObject3 = jSONObject;
                    if (jSONObject3 != null) {
                        jSONObject2.put("ad_extra_data", jSONObject3.toString());
                    } else {
                        jSONObject2.put("ad_extra_data", new org.json.JSONObject().toString());
                    }
                } catch (java.lang.Exception e) {
                    com.bytedance.sdk.component.utils.PX.bg("TTAD.AdEvent", e.getMessage());
                }
                return jSONObject2;
            }
        });
    }

    public static void bg(final com.bytedance.sdk.component.Kg.Kg kg) {
        if (kg == null) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.utils.VJ.zx()) {
            com.bytedance.sdk.component.utils.iR.bg().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.eqN.bX.40
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.utils.VJ.IL(kg, 10);
                }
            });
        } else if (!com.bytedance.sdk.openadsdk.utils.VJ.ldr()) {
            com.bytedance.sdk.openadsdk.utils.VJ.IL(kg, 10);
        } else {
            kg.run();
        }
    }

    public static void bg(final com.bytedance.sdk.openadsdk.yDt.bg.IL il) {
        if (il == null || il.IL() == null) {
            return;
        }
        final com.bytedance.sdk.openadsdk.core.model.tuV tuvIL = il.IL();
        final int iJz = tuvIL.jz();
        if (iJz == 2 || iJz == 8 || (com.bytedance.sdk.openadsdk.utils.ayS.eqN(tuvIL) && com.bytedance.sdk.openadsdk.eqN.IL.bg.eqN.equals(il.bg()))) {
            bg(java.lang.System.currentTimeMillis(), tuvIL, il.bX(), "open_browser", new com.bytedance.sdk.openadsdk.yDt.bX.bg() { // from class: com.bytedance.sdk.openadsdk.eqN.bX.41
                @Override // com.bytedance.sdk.openadsdk.yDt.bX.bg
                public org.json.JSONObject bg() {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    try {
                        int iEqN = il.eqN();
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                        jSONObject2.put("count", com.bytedance.sdk.openadsdk.utils.ayS.yDt(com.bytedance.sdk.openadsdk.core.VzQ.bg()));
                        jSONObject2.put("interceptor", iEqN);
                        jSONObject2.put("success", il.zx());
                        jSONObject2.put("link", il.bg());
                        jSONObject2.put("interaction_type", iJz);
                        jSONObject2.put("real_interaction_type", il.iR());
                        if (il.eqN() == 9) {
                            jSONObject2.put("is_act_signals_api_available", il.Kg());
                            jSONObject2.put("is_act_signals_callback", il.WR());
                        }
                        if (!android.text.TextUtils.isEmpty(il.ldr())) {
                            jSONObject2.put("exception_msg", il.ldr());
                        }
                        if (iEqN == 2 || iEqN == 5) {
                            jSONObject2.put(com.adjust.sdk.Constants.REFERRER_API_META, tuvIL.ZTq().toString());
                        }
                        jSONObject.put("ad_extra_data", jSONObject2.toString());
                    } catch (java.lang.Exception e) {
                        com.bytedance.sdk.component.utils.PX.bg("TTAD.AdEvent", e.getMessage());
                    }
                    return jSONObject;
                }
            });
        }
    }

    public static void zx(com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str, org.json.JSONObject jSONObject) {
        eqN(tuv, "activity_recreate", str, jSONObject);
    }

    public static class bg {
        public static void bg(java.lang.String str, final org.json.JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
            java.lang.String strBg = com.bytedance.sdk.openadsdk.utils.ayS.bg(tuv);
            if (strBg == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.eqN.bX.bg(java.lang.System.currentTimeMillis(), tuv, strBg + "_landingpage", str, new com.bytedance.sdk.openadsdk.yDt.bX.bg() { // from class: com.bytedance.sdk.openadsdk.eqN.bX.bg.1
                @Override // com.bytedance.sdk.openadsdk.yDt.bX.bg
                public org.json.JSONObject bg() {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    try {
                        jSONObject2.put("ad_extra_data", jSONObject.toString());
                    } catch (java.lang.Throwable th) {
                        android.util.Log.d("TTAD.AdEvent", "Gecko.loadEvent error", th);
                    }
                    return jSONObject2;
                }
            });
        }

        public static void bg(final int i, final int i2, com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
            java.lang.String strBg = com.bytedance.sdk.openadsdk.utils.ayS.bg(tuv);
            if (strBg == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.eqN.bX.bg(java.lang.System.currentTimeMillis(), tuv, strBg + "_landingpage", "local_res_hit_rate", new com.bytedance.sdk.openadsdk.yDt.bX.bg() { // from class: com.bytedance.sdk.openadsdk.eqN.bX.bg.2
                @Override // com.bytedance.sdk.openadsdk.yDt.bX.bg
                public org.json.JSONObject bg() {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    try {
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                        jSONObject2.put("all_times", i2);
                        jSONObject2.put("hit_times", i);
                        jSONObject.put("ad_extra_data", jSONObject2.toString());
                    } catch (java.lang.Throwable th) {
                        android.util.Log.d("TTAD.AdEvent", "Gecko.localResHitRate error", th);
                    }
                    return jSONObject;
                }
            });
        }

        public static void bg(final long j, final com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str, final com.bykv.vk.openvk.preload.falconx.loader.ILoader iLoader, final java.lang.String str2) {
            if (str == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.eqN.bX.bg(java.lang.System.currentTimeMillis(), tuv, str, "landingpage_init", new com.bytedance.sdk.openadsdk.yDt.bX.bg() { // from class: com.bytedance.sdk.openadsdk.eqN.bX.bg.3
                @Override // com.bytedance.sdk.openadsdk.yDt.bX.bg
                public org.json.JSONObject bg() {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    try {
                        int iBg = com.bytedance.sdk.openadsdk.iR.IL.bg().bg(iLoader, str2);
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                        jSONObject3.put(com.bytedance.sdk.openadsdk.core.model.tuV.bX, tuv.RJ() ? 1 : 0);
                        jSONObject2.put("pag_json_data", jSONObject3.toString());
                        jSONObject2.put("url", tuv.GvG());
                        jSONObject2.put("channel_name", tuv.qp());
                        jSONObject2.put("interceptor_status", (android.text.TextUtils.isEmpty(tuv.qp()) || iBg <= 0) ? 0 : 1);
                        org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                        jSONObject4.put("resource_count", iBg);
                        jSONObject2.put("resource_info", jSONObject4);
                        jSONObject.put("ad_extra_data", jSONObject2.toString());
                        jSONObject.put("duration", j);
                    } catch (java.lang.Throwable th) {
                        android.util.Log.d("TTAD.AdEvent", "Gecko.localResHitRate error", th);
                    }
                    return jSONObject;
                }
            });
        }

        public static void bg(final int i, final int i2, final int i3, final int i4, final com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str, final int i5) {
            if (str == null || android.text.TextUtils.isEmpty(tuv.qp())) {
                return;
            }
            com.bytedance.sdk.openadsdk.eqN.bX.bg(java.lang.System.currentTimeMillis(), tuv, str, "landing_page_resource_detail", new com.bytedance.sdk.openadsdk.yDt.bX.bg() { // from class: com.bytedance.sdk.openadsdk.eqN.bX.bg.4
                @Override // com.bytedance.sdk.openadsdk.yDt.bX.bg
                public org.json.JSONObject bg() {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    try {
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                        jSONObject2.put("next_url", tuv.GvG());
                        jSONObject2.put("channel_name", tuv.qp());
                        jSONObject2.put("preload_status", i <= 0 ? 0 : 2);
                        jSONObject2.put("first_page", i5);
                        jSONObject2.put("preload_h5_type", tuv.ULi());
                        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                        jSONObject3.put("channel_response", i);
                        jSONObject3.put("failResourceCount", i2);
                        jSONObject3.put("successCount", i3);
                        jSONObject3.put("failCount", i4);
                        jSONObject2.put("resource_info", jSONObject3);
                        jSONObject.put("ad_extra_data", jSONObject2.toString());
                    } catch (java.lang.Throwable th) {
                        android.util.Log.d("TTAD.AdEvent", "Gecko.localResHitRate error", th);
                    }
                    return jSONObject;
                }
            });
        }
    }

    public static void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str, int i, org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new org.json.JSONObject();
        }
        try {
            jSONObject.put("type", i);
        } catch (org.json.JSONException unused) {
        }
        IL(tuv, str, "open_ad_land_page_links", jSONObject);
    }

    public static void IL(com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str, int i, org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new org.json.JSONObject();
        }
        try {
            jSONObject.put("type", i);
        } catch (org.json.JSONException unused) {
        }
        IL(tuv, str, "download_app_ad_track", jSONObject);
    }

    public static void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str, final boolean z, final boolean z2, final boolean z3, final boolean z4, final int i, final java.util.Map<java.lang.String, java.lang.Object> map) {
        bg(java.lang.System.currentTimeMillis(), tuv, str, "start_show_plb", new com.bytedance.sdk.openadsdk.yDt.bX.bg() { // from class: com.bytedance.sdk.openadsdk.eqN.bX.42
            @Override // com.bytedance.sdk.openadsdk.yDt.bX.bg
            public org.json.JSONObject bg() {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put("isSkip", z);
                    jSONObject2.put("force", z2);
                    jSONObject2.put("isFromLandingPage", z3);
                    jSONObject2.put("finishing", z4);
                    jSONObject2.put("from", i);
                    java.util.Map map2 = map;
                    if (map2 != null) {
                        for (java.util.Map.Entry entry : map2.entrySet()) {
                            jSONObject2.put((java.lang.String) entry.getKey(), entry.getValue());
                        }
                    }
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                } catch (java.lang.Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void bg(final com.bytedance.sdk.openadsdk.core.model.tuV tuv, final boolean z, java.lang.String str, final java.lang.String str2, final long j, final java.lang.String str3, final java.lang.String str4, final int i, final java.lang.String str5) {
        bg(java.lang.System.currentTimeMillis(), tuv, str, "load_ugen_template", new com.bytedance.sdk.openadsdk.yDt.bX.bg() { // from class: com.bytedance.sdk.openadsdk.eqN.bX.43
            /* JADX WARN: Code duplicated, block: B:19:0x0043  */
            @Override // com.bytedance.sdk.openadsdk.yDt.bX.bg
            public org.json.JSONObject bg() {
                byte b;
                com.bytedance.sdk.openadsdk.core.model.Ja jaUu;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    java.lang.String str6 = str4;
                    int iHashCode = str6.hashCode();
                    if (iHashCode != -1606803861) {
                        if (iHashCode != 3107) {
                            if (iHashCode == 2989536 && str6.equals("adv3")) {
                                b = 2;
                            } else {
                                b = -1;
                            }
                        } else if (str6.equals("ad")) {
                            b = 1;
                        } else {
                            b = -1;
                        }
                    } else if (str6.equals("endcard")) {
                        b = 0;
                    } else {
                        b = -1;
                    }
                    if (b != 0) {
                        if (b == 1) {
                            com.bytedance.sdk.openadsdk.core.model.tuV.bg bgVarLKE = tuv.LKE();
                            if (bgVarLKE != null) {
                                jSONObject2.putOpt("url", bgVarLKE.Lq());
                                jSONObject2.putOpt("id", bgVarLKE.ldr());
                                jSONObject2.putOpt("md5", bgVarLKE.vb());
                            }
                        } else if (b == 2 && (jaUu = tuv.uu()) != null) {
                            jSONObject2.putOpt("url", jaUu.bX());
                            jSONObject2.putOpt("id", jaUu.bg());
                            jSONObject2.putOpt("md5", jaUu.IL());
                        }
                    } else if (z) {
                        com.bytedance.sdk.openadsdk.core.VB.ldr.bg bgVarHSp = tuv.hSp();
                        if (bgVarHSp != null) {
                            jSONObject2.putOpt("url", bgVarHSp.bX());
                            jSONObject2.putOpt("id", bgVarHSp.bg());
                            jSONObject2.putOpt("md5", bgVarHSp.IL());
                        }
                    } else {
                        com.bytedance.sdk.openadsdk.core.VB.ldr.bg bgVarAz = tuv.Az();
                        if (bgVarAz != null) {
                            jSONObject2.putOpt("url", bgVarAz.bX());
                            jSONObject2.putOpt("id", bgVarAz.bg());
                            jSONObject2.putOpt("md5", bgVarAz.IL());
                        }
                    }
                    jSONObject2.put("ugen_status", str2);
                    jSONObject2.put("from", str3);
                    jSONObject2.put("ugen_scene", str4);
                    if (com.ironsource.y8.f.e.equals(str2)) {
                        jSONObject2.put("error_code", i);
                        jSONObject2.put("error_msg", str5);
                    }
                    jSONObject.put("duration", j);
                } catch (java.lang.Throwable th) {
                    try {
                        jSONObject2.put("error_code", org.objectweb.asm.Opcodes.I2L);
                        jSONObject2.put("error_msg", "send template error " + th.getMessage());
                    } catch (java.lang.Throwable unused) {
                    }
                }
                try {
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                } catch (java.lang.Throwable unused2) {
                }
                return jSONObject;
            }
        });
    }

    private static boolean bg(int i, java.lang.String str) {
        int iUq;
        try {
            java.util.Set<java.lang.String> setOvC = com.bytedance.sdk.openadsdk.core.settings.xxp.zU().ovC();
            if ((i == 1 && setOvC != null && setOvC.contains(str)) || (iUq = com.bytedance.sdk.openadsdk.core.settings.xxp.zU().Uq(str)) == 0) {
                return true;
            }
            return iUq != 100 && ((int) ((java.lang.Math.random() * 100.0d) + 1.0d)) > iUq;
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("TTAD.AdEvent", th.getMessage());
            return false;
        }
    }
}

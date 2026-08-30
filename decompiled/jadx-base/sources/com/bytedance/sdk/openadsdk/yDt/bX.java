package com.bytedance.sdk.openadsdk.yDt;

/* JADX INFO: loaded from: classes4.dex */
public class bX {
    private static volatile com.bytedance.sdk.openadsdk.yDt.bX bg;

    private boolean bX(com.bytedance.sdk.openadsdk.yDt.bg.eqN eqn) {
        return eqn == null;
    }

    private bX() {
    }

    public static com.bytedance.sdk.openadsdk.yDt.bX bg() {
        if (bg == null) {
            synchronized (com.bytedance.sdk.openadsdk.yDt.bX.class) {
                if (bg == null) {
                    bg = new com.bytedance.sdk.openadsdk.yDt.bX();
                }
            }
        }
        return bg;
    }

    public static void bg(final com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        if (tuv == null) {
            return;
        }
        final long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        bg("bidding_receive", false, new com.bytedance.sdk.openadsdk.yDt.IL() { // from class: com.bytedance.sdk.openadsdk.yDt.bX.1
            @Override // com.bytedance.sdk.openadsdk.yDt.IL
            public com.bytedance.sdk.openadsdk.yDt.bg.bX getLogStats() throws java.lang.Exception {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("reveice_ts", jCurrentTimeMillis);
                if (tuv.JMw() == 3) {
                    jSONObject.put("is_icon_only", tuv.NC() ? 1 : 0);
                }
                return com.bytedance.sdk.openadsdk.yDt.bg.eqN.IL().bg("bidding_receive").IL(jSONObject.toString());
            }
        });
    }

    public static void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, final long j) {
        if (tuv == null) {
            return;
        }
        bg("bidding_load", false, new com.bytedance.sdk.openadsdk.yDt.IL() { // from class: com.bytedance.sdk.openadsdk.yDt.bX.12
            @Override // com.bytedance.sdk.openadsdk.yDt.IL
            public com.bytedance.sdk.openadsdk.yDt.bg.bX getLogStats() throws java.lang.Exception {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("duration", j);
                return com.bytedance.sdk.openadsdk.yDt.bg.eqN.IL().bg("bidding_load").IL(jSONObject.toString());
            }
        });
    }

    public static void bg(final java.lang.String str, final com.bytedance.sdk.openadsdk.eqN.zx.IL.bg bgVar) {
        if (bgVar == null) {
            return;
        }
        bg(str, false, new com.bytedance.sdk.openadsdk.yDt.IL() { // from class: com.bytedance.sdk.openadsdk.yDt.bX.18
            @Override // com.bytedance.sdk.openadsdk.yDt.IL
            public com.bytedance.sdk.openadsdk.yDt.bg.bX getLogStats() throws java.lang.Exception {
                org.json.JSONObject jSONObjectBX = bgVar.bX();
                if (jSONObjectBX == null) {
                    jSONObjectBX = new org.json.JSONObject();
                }
                com.bytedance.sdk.openadsdk.eqN.zx.IL.bX bXVarEqN = bgVar.eqN();
                if (bXVarEqN != null) {
                    bXVarEqN.bg(jSONObjectBX);
                }
                return com.bytedance.sdk.openadsdk.yDt.bg.eqN.IL().bg(str).bg(bgVar.bg().JMw()).IL(jSONObjectBX.toString());
            }
        });
    }

    public static void IL(final com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        if (com.bytedance.sdk.openadsdk.utils.ayS.bg(tuv) == null || android.text.TextUtils.isEmpty(tuv.qp())) {
            return;
        }
        bg("download_gecko_start", false, new com.bytedance.sdk.openadsdk.yDt.IL() { // from class: com.bytedance.sdk.openadsdk.yDt.bX.19
            @Override // com.bytedance.sdk.openadsdk.yDt.IL
            public com.bytedance.sdk.openadsdk.yDt.bg.bX getLogStats() throws java.lang.Exception {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("url", tuv.GvG());
                jSONObject.put("channel_name", tuv.qp());
                return com.bytedance.sdk.openadsdk.yDt.bg.eqN.IL().bg("download_gecko_start").bg(tuv.JMw()).IL(jSONObject.toString());
            }
        });
    }

    public static void bg(final com.bytedance.sdk.openadsdk.core.model.tuV tuv, final org.json.JSONObject jSONObject) {
        if (com.bytedance.sdk.openadsdk.utils.ayS.bg(tuv) == null || android.text.TextUtils.isEmpty(tuv.qp())) {
            return;
        }
        bg("download_gecko_end", false, new com.bytedance.sdk.openadsdk.yDt.IL() { // from class: com.bytedance.sdk.openadsdk.yDt.bX.20
            @Override // com.bytedance.sdk.openadsdk.yDt.IL
            public com.bytedance.sdk.openadsdk.yDt.bg.bX getLogStats() throws java.lang.Exception {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("url", tuv.GvG());
                jSONObject2.put("channel_name", tuv.qp());
                jSONObject2.put("data", jSONObject);
                return com.bytedance.sdk.openadsdk.yDt.bg.eqN.IL().bg("download_gecko_end").bg(tuv.JMw()).IL(jSONObject2.toString());
            }
        });
    }

    public void bg(final com.bytedance.sdk.openadsdk.yDt.bg.eqN eqn) {
        if (bX(eqn)) {
            return;
        }
        eqn.bg("express_ad_render");
        com.bytedance.sdk.openadsdk.core.VzQ.zx().bg(new com.bytedance.sdk.openadsdk.yDt.IL() { // from class: com.bytedance.sdk.openadsdk.yDt.bX.21
            @Override // com.bytedance.sdk.openadsdk.yDt.IL
            public com.bytedance.sdk.openadsdk.yDt.bg.bX getLogStats() throws java.lang.Exception {
                return eqn;
            }
        });
    }

    public void IL(final com.bytedance.sdk.openadsdk.yDt.bg.eqN eqn) {
        if (bX(eqn)) {
            return;
        }
        eqn.bg("show_backup_endcard");
        com.bytedance.sdk.openadsdk.core.VzQ.zx().bg(new com.bytedance.sdk.openadsdk.yDt.IL() { // from class: com.bytedance.sdk.openadsdk.yDt.bX.22
            @Override // com.bytedance.sdk.openadsdk.yDt.IL
            public com.bytedance.sdk.openadsdk.yDt.bg.bX getLogStats() throws java.lang.Exception {
                return eqn;
            }
        });
    }

    public void bg(final java.lang.String str) {
        bg("click_playable_test_tool", false, new com.bytedance.sdk.openadsdk.yDt.IL() { // from class: com.bytedance.sdk.openadsdk.yDt.bX.2
            @Override // com.bytedance.sdk.openadsdk.yDt.IL
            public com.bytedance.sdk.openadsdk.yDt.bg.bX getLogStats() throws java.lang.Exception {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put("playable_url", str);
                } catch (java.lang.Throwable unused) {
                }
                return com.bytedance.sdk.openadsdk.yDt.bg.eqN.IL().bg("click_playable_test_tool").IL(jSONObject.toString());
            }
        });
    }

    public void IL(final java.lang.String str) {
        bg("close_playable_test_tool", false, new com.bytedance.sdk.openadsdk.yDt.IL() { // from class: com.bytedance.sdk.openadsdk.yDt.bX.3
            @Override // com.bytedance.sdk.openadsdk.yDt.IL
            public com.bytedance.sdk.openadsdk.yDt.bg.bX getLogStats() throws java.lang.Exception {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put("playable_url", str);
                } catch (java.lang.Throwable unused) {
                }
                return com.bytedance.sdk.openadsdk.yDt.bg.eqN.IL().bg("close_playable_test_tool").IL(jSONObject.toString());
            }
        });
    }

    public void bg(final java.lang.String str, final int i, final java.lang.String str2) {
        bg("use_playable_test_tool_error", false, new com.bytedance.sdk.openadsdk.yDt.IL() { // from class: com.bytedance.sdk.openadsdk.yDt.bX.4
            @Override // com.bytedance.sdk.openadsdk.yDt.IL
            public com.bytedance.sdk.openadsdk.yDt.bg.bX getLogStats() throws java.lang.Exception {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put("playable_url", str);
                    jSONObject.put("error_code", i);
                    jSONObject.put("error_message", str2);
                } catch (java.lang.Throwable unused) {
                }
                return com.bytedance.sdk.openadsdk.yDt.bg.eqN.IL().bg("use_playable_test_tool_error").IL(jSONObject.toString());
            }
        });
    }

    public void bg(final long j, final long j2) {
        final long j3 = j2 - j;
        bg("general_label", false, new com.bytedance.sdk.openadsdk.yDt.IL() { // from class: com.bytedance.sdk.openadsdk.yDt.bX.5
            @Override // com.bytedance.sdk.openadsdk.yDt.IL
            public com.bytedance.sdk.openadsdk.yDt.bg.bX getLogStats() throws java.lang.Exception {
                int i = !com.bytedance.sdk.openadsdk.core.yDt.IL.get() ? 1 : 0;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put("starttime", j);
                    jSONObject.put("endtime", j2);
                    jSONObject.put("start_type", i);
                } catch (java.lang.Throwable unused) {
                }
                return com.bytedance.sdk.openadsdk.yDt.bg.eqN.IL().bg("general_label").Kg(java.lang.String.valueOf(j3)).IL(jSONObject.toString());
            }
        });
    }

    public static void IL() {
        com.bytedance.sdk.openadsdk.utils.VJ.bX(new com.bytedance.sdk.component.Kg.Kg("showFailLog") { // from class: com.bytedance.sdk.openadsdk.yDt.bX.6
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.bytedance.sdk.openadsdk.yDt.bX.bg().bg("show_fail_log", new org.json.JSONObject());
                } catch (java.lang.Throwable th) {
                    com.bytedance.sdk.component.utils.PX.bg("StatsLogManager", th.getMessage());
                }
            }
        });
    }

    public void bg(final java.lang.String str, final org.json.JSONObject jSONObject) {
        if (str == null || jSONObject == null) {
            return;
        }
        bg(str, false, new com.bytedance.sdk.openadsdk.yDt.IL() { // from class: com.bytedance.sdk.openadsdk.yDt.bX.7
            @Override // com.bytedance.sdk.openadsdk.yDt.IL
            public com.bytedance.sdk.openadsdk.yDt.bg.bX getLogStats() throws java.lang.Exception {
                return com.bytedance.sdk.openadsdk.yDt.bg.eqN.IL().bg(str).IL(jSONObject.toString());
            }
        });
    }

    public void bg(final java.lang.String str, final java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        bg(str, false, new com.bytedance.sdk.openadsdk.yDt.IL() { // from class: com.bytedance.sdk.openadsdk.yDt.bX.8
            @Override // com.bytedance.sdk.openadsdk.yDt.IL
            public com.bytedance.sdk.openadsdk.yDt.bg.bX getLogStats() throws java.lang.Exception {
                return com.bytedance.sdk.openadsdk.yDt.bg.eqN.IL().bg(str).IL(str2);
            }
        });
    }

    public void bX() {
        bg("blind_mode_status", true, new com.bytedance.sdk.openadsdk.yDt.IL() { // from class: com.bytedance.sdk.openadsdk.yDt.bX.9
            @Override // com.bytedance.sdk.openadsdk.yDt.IL
            public com.bytedance.sdk.openadsdk.yDt.bg.bX getLogStats() throws java.lang.Exception {
                return com.bytedance.sdk.openadsdk.yDt.bg.eqN.IL().bg("blind_mode_status");
            }
        });
    }

    public void bg(final org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            com.bytedance.sdk.openadsdk.utils.LZ.bg("adRevenuePangle", "You must pass adRevenue json to pangle");
            return;
        }
        java.lang.Object objOpt = jSONObject.opt("device_ad_mediation_platform");
        if (!(objOpt instanceof java.lang.String) || android.text.TextUtils.isEmpty((java.lang.String) objOpt)) {
            com.bytedance.sdk.openadsdk.utils.LZ.bg("adRevenuePangle", "You must pass device_ad_mediation_platform to pangle");
        } else {
            com.bytedance.sdk.openadsdk.utils.LZ.bg("adRevenuePangle", "pangle", "You successfully passed the parameters to pangle. The parameters are:", jSONObject);
            bg("ad_revenue", true, new com.bytedance.sdk.openadsdk.yDt.IL() { // from class: com.bytedance.sdk.openadsdk.yDt.bX.10
                @Override // com.bytedance.sdk.openadsdk.yDt.IL
                public com.bytedance.sdk.openadsdk.yDt.bg.bX getLogStats() throws java.lang.Exception {
                    try {
                        jSONObject.put(androidx.core.app.NotificationCompat.CATEGORY_EVENT, 272);
                        jSONObject.put("uuid", com.bytedance.sdk.openadsdk.core.PX.bX(com.bytedance.sdk.openadsdk.core.VzQ.bg()));
                        java.lang.String strBg = "";
                        try {
                            if (com.bytedance.sdk.openadsdk.core.PX.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg()) != null) {
                                strBg = com.bytedance.sdk.openadsdk.core.PX.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg());
                            }
                        } catch (java.lang.Throwable th) {
                            th.getMessage();
                        }
                        jSONObject.put("device_id", strBg);
                        jSONObject.put(com.json.ce.A, "android");
                        jSONObject.put("partner", "PangleSDK");
                    } catch (java.lang.Throwable th2) {
                        th2.getMessage();
                    }
                    return com.bytedance.sdk.openadsdk.yDt.bg.eqN.IL().bg("ad_revenue").IL(jSONObject.toString());
                }
            });
        }
    }

    public static void eqN() {
        bg("disk_log", false, new com.bytedance.sdk.openadsdk.yDt.IL() { // from class: com.bytedance.sdk.openadsdk.yDt.bX.11
            @Override // com.bytedance.sdk.openadsdk.yDt.IL
            public com.bytedance.sdk.openadsdk.yDt.bg.bX getLogStats() throws java.lang.Exception {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                java.io.File file = new java.io.File(com.bytedance.sdk.openadsdk.CacheDirFactory.getRootDir());
                long j = 0;
                if (file.exists() && file.isDirectory()) {
                    for (java.io.File file2 : file.listFiles()) {
                        long jBg = com.bytedance.sdk.openadsdk.yDt.bX.bg(file2);
                        j += jBg;
                        jSONObject.put(file2.getName(), jBg);
                    }
                }
                if (j < 524288000) {
                    return null;
                }
                return com.bytedance.sdk.openadsdk.yDt.bg.eqN.IL().bg("disk_log").IL(jSONObject.toString());
            }
        });
    }

    public static long bg(java.io.File file) {
        if (file.isFile()) {
            return file.length();
        }
        long jBg = 0;
        for (java.io.File file2 : file.listFiles()) {
            jBg += bg(file2);
        }
        return jBg;
    }

    public static void IL(java.lang.String str, java.lang.String str2) {
        try {
            if (!android.text.TextUtils.isEmpty(str) && !android.text.TextUtils.isEmpty(str2)) {
                final com.bytedance.sdk.openadsdk.yDt.bg.eqN eqnIL = com.bytedance.sdk.openadsdk.yDt.bg.eqN.IL().bg(str).IL(str2);
                com.bytedance.sdk.openadsdk.core.VzQ.zx().bg(new com.bytedance.sdk.openadsdk.yDt.IL() { // from class: com.bytedance.sdk.openadsdk.yDt.bX.13
                    @Override // com.bytedance.sdk.openadsdk.yDt.IL
                    public com.bytedance.sdk.openadsdk.yDt.bg.bX getLogStats() throws java.lang.Exception {
                        return eqnIL;
                    }
                }, false);
            }
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("StatsLogManager", th.getMessage());
        }
    }

    public static void bg(java.lang.String str, boolean z, com.bytedance.sdk.openadsdk.yDt.IL il) {
        int iIL = com.bytedance.sdk.openadsdk.core.settings.xxp.zU().IL(str);
        java.lang.Object[] objArr = new java.lang.Object[4];
        java.lang.Integer.valueOf(iIL);
        if (android.text.TextUtils.isEmpty(str) || iIL == 0 || il == null) {
            return;
        }
        boolean z2 = iIL == 100;
        if (!z2) {
            z2 = ((int) ((java.lang.Math.random() * 100.0d) + 1.0d)) <= iIL;
        }
        if (z2) {
            com.bytedance.sdk.openadsdk.core.VzQ.zx().bg(il, z);
        }
    }

    public static void bg(long j, long j2, final java.lang.String str, final int i) {
        if (j == 0) {
            return;
        }
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        final long j3 = jElapsedRealtime - j;
        final long j4 = jElapsedRealtime - j2;
        final long j5 = j2 - j;
        bg("ad_show_cost_time", false, new com.bytedance.sdk.openadsdk.yDt.IL() { // from class: com.bytedance.sdk.openadsdk.yDt.bX.14
            @Override // com.bytedance.sdk.openadsdk.yDt.IL
            public com.bytedance.sdk.openadsdk.yDt.bg.bX getLogStats() throws java.lang.Exception {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("duration", j3);
                jSONObject.put("renderDuration", j4);
                jSONObject.put("showToRenderDuration", j5);
                jSONObject.put("tag", str);
                jSONObject.put("renderType", i);
                return com.bytedance.sdk.openadsdk.yDt.bg.eqN.IL().bg("ad_show_cost_time").IL(jSONObject.toString());
            }
        });
    }

    public static void bX(final java.lang.String str) {
        bg("request_monitor_daily", false, new com.bytedance.sdk.openadsdk.yDt.IL() { // from class: com.bytedance.sdk.openadsdk.yDt.bX.15
            @Override // com.bytedance.sdk.openadsdk.yDt.IL
            public com.bytedance.sdk.openadsdk.yDt.bg.bX getLogStats() throws java.lang.Exception {
                return com.bytedance.sdk.openadsdk.yDt.bg.eqN.IL().bg("request_monitor_daily").IL(str);
            }
        });
    }

    public static void bg(int i, java.lang.String str) {
        bg(i, str, 0, (java.lang.String) null);
    }

    public static void bg(final int i, final java.lang.String str, final int i2, final java.lang.String str2) {
        bg("ipv6_req", false, (com.bytedance.sdk.openadsdk.yDt.IL) new com.bytedance.sdk.openadsdk.yDt.IL<com.bytedance.sdk.openadsdk.yDt.bg.bX>() { // from class: com.bytedance.sdk.openadsdk.yDt.bX.16
            @Override // com.bytedance.sdk.openadsdk.yDt.IL
            public com.bytedance.sdk.openadsdk.yDt.bg.bX getLogStats() throws java.lang.Exception {
                java.lang.String str3;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                int i3 = i;
                if (i3 == 1) {
                    str3 = "success";
                } else if (i3 == -1) {
                    jSONObject.put("error_code", i2);
                    jSONObject.put("error_msg", str2);
                    str3 = com.ironsource.y8.f.e;
                } else {
                    str3 = androidx.media3.extractor.text.ttml.TtmlNode.START;
                }
                if (!android.text.TextUtils.isEmpty(str)) {
                    jSONObject.put("url", str);
                }
                jSONObject.put("status", str3);
                return com.bytedance.sdk.openadsdk.yDt.bg.eqN.IL().bg("ipv6_req").IL(jSONObject.toString());
            }
        });
    }

    public static void bX(final java.lang.String str, final java.lang.String str2) {
        bg("playable_url_mime", false, new com.bytedance.sdk.openadsdk.yDt.IL() { // from class: com.bytedance.sdk.openadsdk.yDt.bX.17
            @Override // com.bytedance.sdk.openadsdk.yDt.IL
            public com.bytedance.sdk.openadsdk.yDt.bg.bX getLogStats() throws java.lang.Exception {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    java.lang.String str3 = str;
                    java.lang.Object obj = "not validate";
                    if (android.text.TextUtils.isEmpty(str3)) {
                        str3 = "not validate";
                    }
                    jSONObject.put("original_mime", str3);
                    java.lang.String mimeTypeFromExtension = android.webkit.MimeTypeMap.getSingleton().getMimeTypeFromExtension(android.webkit.MimeTypeMap.getFileExtensionFromUrl(str2));
                    if (!android.text.TextUtils.isEmpty(mimeTypeFromExtension)) {
                        obj = mimeTypeFromExtension;
                    }
                    jSONObject.put("new_mime", obj);
                    jSONObject.put("url", str2);
                    jSONObject.put("is_same", str3.equals(obj) ? 1 : 0);
                } catch (java.lang.Throwable unused) {
                }
                return com.bytedance.sdk.openadsdk.yDt.bg.eqN.IL().bg("playable_url_mime").IL(jSONObject.toString());
            }
        });
    }
}

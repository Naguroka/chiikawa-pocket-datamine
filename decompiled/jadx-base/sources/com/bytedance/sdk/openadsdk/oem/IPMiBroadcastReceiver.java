package com.bytedance.sdk.openadsdk.oem;

/* JADX INFO: loaded from: classes4.dex */
public class IPMiBroadcastReceiver extends android.content.BroadcastReceiver {
    private static volatile com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver bg;
    private final android.util.LruCache<java.lang.String, com.bytedance.sdk.openadsdk.core.model.tuV> IL;
    private com.bytedance.sdk.openadsdk.oem.bg bX;
    private int eqN = 0;

    private IPMiBroadcastReceiver() {
        int i = 10;
        int iBg = com.bytedance.sdk.openadsdk.Fy.bg.bg("ip_data_config", "ip_ad_cache_count", 10);
        if (iBg > 0 && iBg <= 200) {
            i = iBg;
        }
        java.lang.Object[] objArr = new java.lang.Object[2];
        java.lang.Integer.valueOf(i);
        this.IL = new android.util.LruCache<>(i);
    }

    public void bg(java.lang.String str, com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        if (android.text.TextUtils.isEmpty(str) || tuv == null || this.IL.get(str) != null) {
            return;
        }
        this.IL.put(str, tuv);
    }

    public com.bytedance.sdk.openadsdk.core.model.tuV bg(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        return this.IL.get(str);
    }

    public void bg(com.bytedance.sdk.openadsdk.oem.bg bgVar) {
        this.bX = bgVar;
    }

    public void bg() {
        this.bX = null;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, final android.content.Intent intent) {
        if ("com.xiaomi.market.DOWNLOAD_INSTALL_RESULT".equals(intent.getAction())) {
            com.bytedance.sdk.openadsdk.utils.VJ.bX(new com.bytedance.sdk.component.Kg.Kg("ip-mi") { // from class: com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver.1
                @Override // java.lang.Runnable
                public void run() {
                    final int i;
                    final int intExtra;
                    final int intExtra2;
                    try {
                        final int intExtra3 = intent.getIntExtra(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, 0);
                        if (intExtra3 < 0) {
                            int intExtra4 = intent.getIntExtra("reason", 0);
                            if (intExtra3 == -4 && intExtra4 == -1) {
                                return;
                            } else {
                                i = intExtra4;
                            }
                        } else {
                            i = 0;
                        }
                        if (intExtra3 == 5) {
                            intExtra = intent.getIntExtra("status", 0);
                            if (intExtra == -2) {
                                try {
                                    intExtra2 = intent.getIntExtra("progress", 0);
                                } catch (java.lang.Throwable unused) {
                                    com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver.this.eqN = 1;
                                    intExtra2 = 0;
                                }
                                if (intExtra2 < 100) {
                                    return;
                                }
                            } else {
                                intExtra2 = 0;
                            }
                        } else {
                            intExtra = 0;
                            intExtra2 = 0;
                        }
                        java.lang.String stringExtra = intent.getStringExtra(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);
                        com.bytedance.sdk.openadsdk.oem.bg bgVar = com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver.this.bX;
                        if (intExtra3 > 0 && bgVar != null) {
                            bgVar.bg(stringExtra, intExtra3);
                        }
                        com.bytedance.sdk.openadsdk.core.model.tuV tuvBg = com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver.this.bg(stringExtra);
                        com.bytedance.sdk.component.utils.PX.bg("IPMiBroadcastReceiver", "err_code=", java.lang.Integer.valueOf(intExtra3), " reason=", java.lang.Integer.valueOf(i), " status=", java.lang.Integer.valueOf(intExtra), " progress=", java.lang.Integer.valueOf(intExtra2));
                        if (tuvBg != null) {
                            com.bytedance.sdk.openadsdk.eqN.bX.bg(java.lang.System.currentTimeMillis(), tuvBg, com.bytedance.sdk.openadsdk.utils.ayS.bg(tuvBg), "ip_listener_log", new com.bytedance.sdk.openadsdk.yDt.bX.bg() { // from class: com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver.1.1
                                @Override // com.bytedance.sdk.openadsdk.yDt.bX.bg
                                public org.json.JSONObject bg() {
                                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                                    try {
                                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                                        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                                        jSONObject3.put("ip_error_code", intExtra3);
                                        int i2 = intExtra3;
                                        if (i2 > 0) {
                                            if (i2 == 5) {
                                                jSONObject3.put("ip_status", intExtra);
                                                jSONObject3.put("ip_exec_type", com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver.this.eqN);
                                            }
                                            if (intExtra == -2) {
                                                jSONObject3.put("ip_progress", intExtra2);
                                            }
                                        }
                                        if (intExtra3 < 0) {
                                            jSONObject3.put("ip_reason", i);
                                        }
                                        jSONObject2.put("pag_json_data", jSONObject3.toString());
                                        jSONObject.put("ad_extra_data", jSONObject2);
                                    } catch (java.lang.Throwable th) {
                                        com.bytedance.sdk.component.utils.PX.bg("IPMiBroadcastReceiver", th.getMessage());
                                    }
                                    return jSONObject;
                                }
                            });
                        }
                    } catch (java.lang.Throwable th) {
                        com.bytedance.sdk.component.utils.PX.bg("IPMiBroadcastReceiver", th.getMessage());
                    }
                }
            });
        }
    }

    public static com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver bg(android.content.Context context) {
        int iBg = com.bytedance.sdk.openadsdk.Fy.bg.bg("ip_data_config", "ip_link_listener", 0);
        com.bytedance.sdk.component.utils.PX.bg("IPMiBroadcastReceiver", "open =", java.lang.Integer.valueOf(iBg));
        if (iBg == 0) {
            return null;
        }
        if (bg == null) {
            synchronized (com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver.class) {
                if (bg == null) {
                    bg = new com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver();
                    android.content.IntentFilter intentFilter = new android.content.IntentFilter("com.xiaomi.market.DOWNLOAD_INSTALL_RESULT");
                    if (android.os.Build.VERSION.SDK_INT >= 34 && com.bytedance.sdk.openadsdk.utils.ayS.eo(context) >= 34) {
                        context.registerReceiver(bg, intentFilter, 2);
                    } else {
                        context.registerReceiver(bg, intentFilter);
                    }
                }
            }
        }
        return bg;
    }

    public static void bg(final android.content.Context context, com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        com.bytedance.sdk.openadsdk.core.model.tC tCVarFW;
        if (bg == null && tuv != null && (tCVarFW = tuv.fW()) != null && tCVarFW.bg()) {
            com.bytedance.sdk.openadsdk.core.yDt.IL().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(context));
                    } catch (java.lang.Throwable th) {
                        com.bytedance.sdk.component.utils.PX.bg("IPMiBroadcastReceiver", th.getMessage());
                    }
                }
            });
        }
    }
}

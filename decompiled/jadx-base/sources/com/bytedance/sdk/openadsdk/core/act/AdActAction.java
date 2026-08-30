package com.bytedance.sdk.openadsdk.core.act;

/* JADX INFO: loaded from: classes4.dex */
public class AdActAction {
    private android.content.Context IL;
    private com.bytedance.sdk.openadsdk.core.act.ActServiceConnection Kg;
    private java.lang.Long Lq;
    private com.bytedance.sdk.openadsdk.core.model.tuV bX;
    private java.lang.String eqN;
    private androidx.browser.customtabs.CustomTabsSession iR;
    private com.bytedance.sdk.openadsdk.core.act.AdActAction.BindCustomTabsServiceCallback vb;
    private java.lang.String zx;
    private androidx.browser.customtabs.CustomTabsClient ldr = null;
    private boolean WR = false;
    private boolean eo = false;
    private boolean VB = false;
    private boolean PX = false;
    private boolean Ta = false;
    private long yDt = 0;
    private com.bytedance.sdk.openadsdk.core.act.IL xxp = new com.bytedance.sdk.openadsdk.core.act.IL() { // from class: com.bytedance.sdk.openadsdk.core.act.AdActAction.1
        @Override // com.bytedance.sdk.openadsdk.core.act.IL
        public void bg(final androidx.browser.customtabs.CustomTabsClient customTabsClient) {
            if (com.bytedance.sdk.openadsdk.utils.VJ.zx()) {
                com.bytedance.sdk.openadsdk.core.act.AdActAction.this.bg(customTabsClient);
            } else {
                com.bytedance.sdk.openadsdk.utils.VJ.bg(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.act.AdActAction.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.openadsdk.core.act.AdActAction.this.bg(customTabsClient);
                    }
                });
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.act.IL
        public void bg() {
            com.bytedance.sdk.openadsdk.core.act.AdActAction.this.ldr = null;
            com.bytedance.sdk.openadsdk.core.act.AdActAction.this.Kg = null;
            com.bytedance.sdk.openadsdk.core.act.AdActAction.this.iR = null;
        }
    };
    public androidx.browser.customtabs.EngagementSignalsCallback bg = new com.bytedance.sdk.openadsdk.core.act.AdActAction.PAGEngagementSignalsCallback();
    private androidx.browser.customtabs.CustomTabsCallback VzQ = new com.bytedance.sdk.openadsdk.core.act.AdActAction.PAGCustomTabsCallback();

    public interface BindCustomTabsServiceCallback {
        void onBindFail(int i, java.lang.String str);

        void onBindSuccess(androidx.browser.customtabs.CustomTabsSession customTabsSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(androidx.browser.customtabs.CustomTabsClient customTabsClient) {
        this.ldr = customTabsClient;
        this.iR = customTabsClient.newSession(this.VzQ);
        com.bytedance.sdk.openadsdk.yDt.bg.IL ilBg = bg(9);
        try {
            boolean zIsEngagementSignalsApiAvailable = this.iR.isEngagementSignalsApiAvailable(android.os.Bundle.EMPTY);
            boolean z = false;
            if (zIsEngagementSignalsApiAvailable) {
                boolean engagementSignalsCallback = this.iR.setEngagementSignalsCallback(this.bg, android.os.Bundle.EMPTY);
                ilBg.bX(1);
                com.bytedance.sdk.openadsdk.core.act.bg.bg(1);
                if (engagementSignalsCallback) {
                    ilBg.eqN(1);
                    com.bytedance.sdk.openadsdk.core.act.bg.IL(1);
                } else {
                    com.bytedance.sdk.openadsdk.core.act.bg.IL(0);
                }
                z = engagementSignalsCallback;
            } else {
                ilBg.bX(0);
                com.bytedance.sdk.openadsdk.core.act.bg.bg(0);
            }
            java.lang.Object[] objArr = new java.lang.Object[4];
            java.lang.Boolean.valueOf(zIsEngagementSignalsApiAvailable);
            java.lang.Boolean.valueOf(z);
            com.bytedance.sdk.openadsdk.eqN.bX.bg(ilBg);
            com.bytedance.sdk.openadsdk.core.act.AdActAction.BindCustomTabsServiceCallback bindCustomTabsServiceCallback = this.vb;
            if (bindCustomTabsServiceCallback != null) {
                bindCustomTabsServiceCallback.onBindSuccess(this.iR);
            }
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.openadsdk.core.act.AdActAction.BindCustomTabsServiceCallback bindCustomTabsServiceCallback2 = this.vb;
            if (bindCustomTabsServiceCallback2 != null) {
                bindCustomTabsServiceCallback2.onBindFail(11, th.getMessage());
            }
        }
    }

    public class PAGEngagementSignalsCallback implements androidx.browser.customtabs.EngagementSignalsCallback {
        public PAGEngagementSignalsCallback() {
        }

        @Override // androidx.browser.customtabs.EngagementSignalsCallback
        public void onVerticalScrollEvent(boolean z, android.os.Bundle bundle) {
            com.bytedance.sdk.openadsdk.core.act.AdActAction.this.yDt = java.lang.System.currentTimeMillis();
            if (com.bytedance.sdk.openadsdk.core.act.AdActAction.this.bX == null || com.bytedance.sdk.openadsdk.core.act.AdActAction.this.WR) {
                return;
            }
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("url", com.bytedance.sdk.openadsdk.core.act.AdActAction.this.zx);
                jSONObject.put("down_time", com.bytedance.sdk.openadsdk.core.act.AdActAction.this.yDt);
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                jSONObject.put("up_time", jCurrentTimeMillis);
                com.bytedance.sdk.openadsdk.eqN.bX.IL(com.bytedance.sdk.openadsdk.core.act.AdActAction.this.bX, com.bytedance.sdk.openadsdk.utils.ayS.bg(com.bytedance.sdk.openadsdk.core.act.AdActAction.this.bX), "in_web_click", jSONObject, jCurrentTimeMillis - com.bytedance.sdk.openadsdk.core.act.AdActAction.this.yDt);
            } catch (java.lang.Throwable th) {
                com.bytedance.sdk.component.utils.PX.bg("AdActAction", th.getMessage());
            }
            if (!android.text.TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.model.tuV.bg(com.bytedance.sdk.openadsdk.core.act.AdActAction.this.IL, com.bytedance.sdk.openadsdk.core.act.AdActAction.this.bX))) {
                com.bytedance.sdk.openadsdk.eqN.bX.bg(com.json.z8.CLICK, com.bytedance.sdk.openadsdk.core.act.AdActAction.this.bX, new com.bytedance.sdk.openadsdk.core.model.eo.bg().IL(com.bytedance.sdk.openadsdk.core.act.AdActAction.this.yDt).bg(java.lang.System.currentTimeMillis()).IL(com.bytedance.sdk.openadsdk.core.WR.IL().bg() ? 1 : 2).bX(com.bytedance.sdk.openadsdk.utils.ZQc.iR(com.bytedance.sdk.openadsdk.core.act.AdActAction.this.IL)).bg(com.bytedance.sdk.openadsdk.utils.ZQc.zx(com.bytedance.sdk.openadsdk.core.act.AdActAction.this.IL)).IL(com.bytedance.sdk.openadsdk.utils.ZQc.ldr(com.bytedance.sdk.openadsdk.core.act.AdActAction.this.IL)).bg(), com.bytedance.sdk.openadsdk.utils.ayS.bg(com.bytedance.sdk.openadsdk.core.act.AdActAction.this.bX), true, (java.util.Map<java.lang.String, java.lang.Object>) new java.util.HashMap(), 2);
            }
            com.bytedance.sdk.openadsdk.core.act.AdActAction.this.WR = true;
        }

        @Override // androidx.browser.customtabs.EngagementSignalsCallback
        public void onGreatestScrollPercentageIncreased(int i, android.os.Bundle bundle) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            java.lang.Integer.valueOf(i);
        }

        @Override // androidx.browser.customtabs.EngagementSignalsCallback
        public void onSessionEnded(boolean z, android.os.Bundle bundle) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            java.lang.Boolean.valueOf(z);
        }
    }

    public class PAGCustomTabsCallback extends androidx.browser.customtabs.CustomTabsCallback {
        public PAGCustomTabsCallback() {
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void onNavigationEvent(int i, android.os.Bundle bundle) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            java.lang.Integer.valueOf(i);
            if (i == 1) {
                com.bytedance.sdk.openadsdk.core.act.AdActAction.this.Lq = java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime());
                if (com.bytedance.sdk.openadsdk.core.act.AdActAction.this.PX || com.bytedance.sdk.openadsdk.core.act.AdActAction.this.bX == null) {
                    return;
                }
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                    com.bytedance.sdk.openadsdk.core.act.AdActAction.this.bg("load_start", jSONObject, 0L);
                    com.bytedance.sdk.openadsdk.core.act.AdActAction.this.PX = true;
                    return;
                } catch (java.lang.Throwable th) {
                    com.bytedance.sdk.component.utils.PX.bg("AdActAction", th.getMessage());
                    return;
                }
            }
            if (i == 2) {
                if (com.bytedance.sdk.openadsdk.core.act.AdActAction.this.eo || com.bytedance.sdk.openadsdk.core.act.AdActAction.this.Lq == null || com.bytedance.sdk.openadsdk.core.act.AdActAction.this.bX == null) {
                    return;
                }
                long jLongValue = com.bytedance.sdk.openadsdk.core.act.AdActAction.this.Lq.longValue() - android.os.SystemClock.elapsedRealtime();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    jSONObject2.put("first_page", true);
                    jSONObject2.putOpt("render_type", "h5");
                    jSONObject2.putOpt("render_type_2", 0);
                    jSONObject2.put("url", com.bytedance.sdk.openadsdk.core.act.AdActAction.this.zx);
                    jSONObject2.put("preload_h5_type", com.bytedance.sdk.openadsdk.core.act.AdActAction.this.bX.ULi());
                    com.bytedance.sdk.openadsdk.core.act.AdActAction.this.bg("load_finish", jSONObject2, jLongValue);
                    com.bytedance.sdk.openadsdk.core.act.AdActAction.this.eo = true;
                    return;
                } catch (java.lang.Throwable th2) {
                    com.bytedance.sdk.component.utils.PX.bg("AdActAction", th2.getMessage());
                    return;
                }
            }
            if (i != 3) {
                if (i != 6) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.act.AdActAction.this.bg();
                if (com.bytedance.sdk.openadsdk.core.act.AdActAction.this.Ta || com.bytedance.sdk.openadsdk.core.act.AdActAction.this.bX == null || com.bytedance.sdk.openadsdk.core.act.AdActAction.this.VB || com.bytedance.sdk.openadsdk.core.act.AdActAction.this.eo || com.bytedance.sdk.openadsdk.core.act.AdActAction.this.Lq == null) {
                    return;
                }
                com.bytedance.sdk.openadsdk.eqN.bX.bg(com.bytedance.sdk.openadsdk.core.act.AdActAction.this.bX, com.bytedance.sdk.openadsdk.utils.ayS.bg(com.bytedance.sdk.openadsdk.core.act.AdActAction.this.bX), android.os.SystemClock.elapsedRealtime() - com.bytedance.sdk.openadsdk.core.act.AdActAction.this.Lq.longValue(), 0, 1);
                return;
            }
            if (com.bytedance.sdk.openadsdk.core.act.AdActAction.this.VB || com.bytedance.sdk.openadsdk.core.act.AdActAction.this.bX == null) {
                return;
            }
            try {
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                jSONObject3.putOpt("render_type", "h5");
                jSONObject3.putOpt("render_type_2", 0);
                jSONObject3.put("url", com.bytedance.sdk.openadsdk.core.act.AdActAction.this.zx);
                jSONObject3.put("preload_h5_type", com.bytedance.sdk.openadsdk.core.act.AdActAction.this.bX.ULi());
                com.bytedance.sdk.openadsdk.core.act.AdActAction.this.bg("load_fail", jSONObject3, 0L);
                com.bytedance.sdk.openadsdk.core.act.AdActAction.this.VB = true;
            } catch (java.lang.Throwable th3) {
                com.bytedance.sdk.component.utils.PX.bg("AdActAction", th3.getMessage());
            }
        }
    }

    public AdActAction(android.content.Context context, com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str, java.lang.String str2) {
        this.IL = context;
        this.bX = tuv;
        this.eqN = str;
        this.zx = str2;
    }

    public void bg(com.bytedance.sdk.openadsdk.core.act.AdActAction.BindCustomTabsServiceCallback bindCustomTabsServiceCallback) {
        this.vb = bindCustomTabsServiceCallback;
        if (this.IL == null || this.bX == null) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.eqN.bX.bg(bg(8));
            java.lang.String strBg = com.bytedance.sdk.openadsdk.core.act.bg.bg(this.IL);
            if (strBg == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.act.ActServiceConnection actServiceConnection = new com.bytedance.sdk.openadsdk.core.act.ActServiceConnection(this.xxp);
            this.Kg = actServiceConnection;
            androidx.browser.customtabs.CustomTabsClient.bindCustomTabsService(this.IL, strBg, actServiceConnection);
        } catch (java.lang.Throwable th) {
            java.lang.String message = th.getMessage();
            com.bytedance.sdk.component.utils.PX.bg("AdActAction", message);
            com.bytedance.sdk.openadsdk.core.act.AdActAction.BindCustomTabsServiceCallback bindCustomTabsServiceCallback2 = this.vb;
            if (bindCustomTabsServiceCallback2 != null) {
                bindCustomTabsServiceCallback2.onBindFail(10, message);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg() {
        try {
            com.bytedance.sdk.openadsdk.core.act.ActServiceConnection actServiceConnection = this.Kg;
            if (actServiceConnection == null) {
                return;
            }
            this.IL.unbindService(actServiceConnection);
            this.ldr = null;
            this.iR = null;
            this.Kg = null;
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("AdActAction", th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(java.lang.String str, final org.json.JSONObject jSONObject, final long j) {
        if (this.bX == null || android.text.TextUtils.isEmpty(str)) {
            return;
        }
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.bX;
        com.bytedance.sdk.openadsdk.eqN.bX.bg(jCurrentTimeMillis, tuv, com.bytedance.sdk.openadsdk.utils.ayS.bg(tuv), str, new com.bytedance.sdk.openadsdk.yDt.bX.bg() { // from class: com.bytedance.sdk.openadsdk.core.act.AdActAction.2
            @Override // com.bytedance.sdk.openadsdk.yDt.bX.bg
            public org.json.JSONObject bg() {
                org.json.JSONObject jSONObject2;
                java.lang.Throwable th;
                try {
                    int i = 1;
                    jSONObject.put("is_playable", com.bytedance.sdk.openadsdk.core.model.rri.IL(com.bytedance.sdk.openadsdk.core.act.AdActAction.this.bX) ? 1 : 0);
                    org.json.JSONObject jSONObject3 = jSONObject;
                    if (!com.bytedance.sdk.openadsdk.core.Ta.bX.bg.bg().bg(com.bytedance.sdk.openadsdk.core.act.AdActAction.this.bX)) {
                        i = 0;
                    }
                    jSONObject3.put("usecache", i);
                    jSONObject2 = new org.json.JSONObject();
                    try {
                        jSONObject2.put("ad_extra_data", jSONObject.toString());
                        long j2 = j;
                        if (j2 > 0) {
                            jSONObject2.put("duration", j2);
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        com.bytedance.sdk.component.utils.PX.bg("AdActAction", th.getMessage());
                    }
                } catch (java.lang.Throwable th3) {
                    jSONObject2 = null;
                    th = th3;
                }
                return jSONObject2;
            }
        });
    }

    private com.bytedance.sdk.openadsdk.yDt.bg.IL bg(int i) {
        com.bytedance.sdk.openadsdk.yDt.bg.IL il = new com.bytedance.sdk.openadsdk.yDt.bg.IL();
        il.bg(this.eqN);
        il.bg(this.bX);
        il.IL(com.bytedance.sdk.openadsdk.utils.ayS.bg(this.bX));
        il.bg(i);
        il.bg(false);
        il.IL(8);
        return il;
    }
}

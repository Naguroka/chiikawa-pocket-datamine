package com.bytedance.sdk.openadsdk.component.reward.bg;

/* JADX INFO: loaded from: classes4.dex */
public class WR implements android.os.Handler.Callback, com.bytedance.sdk.openadsdk.PX.iR {
    private static final com.bytedance.sdk.openadsdk.tuV.iR.bg eo = new com.bytedance.sdk.openadsdk.tuV.iR.bg() { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.WR.1
        @Override // com.bytedance.sdk.openadsdk.tuV.iR.bg
        public void bg(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg(str, str2, th);
        }
    };
    private boolean JAA;
    private boolean Ja;
    private boolean Kg;
    private com.bytedance.sdk.component.utils.HomeWatcherReceiver LZ;
    private final com.bytedance.sdk.openadsdk.component.reward.bg.bg Lq;
    private final android.app.Activity PX;
    private final com.bytedance.sdk.openadsdk.core.model.tuV Ta;
    private volatile boolean VB;
    private boolean WR;
    private volatile boolean kMt;
    private boolean rri;
    private com.bytedance.sdk.openadsdk.tuV.Kg tC;
    private com.bytedance.sdk.openadsdk.core.widget.VB tuV;
    private com.bytedance.sdk.openadsdk.component.reward.bg.tuV xxp;
    private final java.lang.String yDt;
    protected final java.util.concurrent.atomic.AtomicBoolean bg = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final android.os.Handler vb = new android.os.Handler(this);
    boolean IL = false;
    boolean bX = false;
    long eqN = 0;
    int zx = 0;
    int ldr = 0;
    int iR = 0;
    private int VzQ = 1;
    private boolean Fy = true;
    private final com.bytedance.sdk.openadsdk.PX.eqN Uw = new com.bytedance.sdk.openadsdk.PX.eqN() { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.WR.8
        @Override // com.bytedance.sdk.openadsdk.PX.eqN
        public void IL() {
        }

        @Override // com.bytedance.sdk.openadsdk.PX.eqN
        public void bg(int i) {
        }

        @Override // com.bytedance.sdk.openadsdk.PX.eqN
        public void bg() {
            if (!com.bytedance.sdk.openadsdk.component.reward.bg.WR.this.Lq.uu.isFinishing() && com.bytedance.sdk.openadsdk.component.reward.bg.WR.this.Lq.IL.gJ() && com.bytedance.sdk.openadsdk.core.model.rri.vb(com.bytedance.sdk.openadsdk.component.reward.bg.WR.this.Lq.IL)) {
                com.bytedance.sdk.openadsdk.component.reward.bg.WR.this.vb.removeMessages(800);
                com.bytedance.sdk.openadsdk.component.reward.bg.WR.this.vb.sendMessage(com.bytedance.sdk.openadsdk.component.reward.bg.WR.bg(1, 0));
            }
        }
    };

    public WR(com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar) {
        this.Kg = true;
        this.Lq = bgVar;
        this.PX = bgVar.uu;
        this.yDt = bgVar.zx;
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = bgVar.IL;
        this.Ta = tuv;
        this.Kg = com.bytedance.sdk.openadsdk.core.model.rri.iR(tuv);
    }

    public static android.os.Message bg(int i, int i2) {
        android.os.Message messageObtain = android.os.Message.obtain();
        messageObtain.what = 800;
        messageObtain.arg1 = i;
        if (i == 3) {
            messageObtain.arg2 = i2;
        }
        return messageObtain;
    }

    public void IL(int i) {
        if (this.Kg) {
            if (i == 5) {
                this.WR = true;
                if (com.bytedance.sdk.openadsdk.core.model.rri.rri(this.Ta)) {
                    this.vb.removeMessages(900);
                    this.Lq.bN.sendEmptyMessage(600);
                }
            }
            this.vb.sendMessage(bg(i, 0));
        }
    }

    public void bg() {
        if (this.Kg && !this.rri) {
            this.rri = true;
            this.xxp = this.Lq.VJ;
            this.VzQ = this.Lq.GvG;
            LZ();
            if (com.bytedance.sdk.openadsdk.core.model.rri.iR(this.Ta)) {
                com.bytedance.sdk.openadsdk.utils.DeviceUtils.AudioInfoReceiver.bg(this);
            }
            if (tC() && com.bytedance.sdk.openadsdk.core.model.rri.VzQ(this.Ta) && com.bytedance.sdk.openadsdk.core.model.rri.vb(this.Ta)) {
                android.os.Handler handler = this.vb;
                handler.sendMessageDelayed(handler.obtainMessage(800, 2, com.bytedance.sdk.openadsdk.core.model.rri.bg(2)), com.bytedance.sdk.openadsdk.core.model.rri.Fy(this.Ta) * 1000);
            }
        }
    }

    public void bg(final com.bytedance.sdk.openadsdk.PX.zx zxVar, boolean z) {
        com.bytedance.sdk.openadsdk.yDt.IL il;
        com.bytedance.sdk.component.bg.VzQ vzQBg;
        if (this.Kg && com.bytedance.sdk.openadsdk.core.model.rri.iR(this.Ta) && this.Lq.jz) {
            if (com.bytedance.sdk.openadsdk.core.WR.IL().xxp()) {
                com.bytedance.sdk.openadsdk.tuV.iR.bg(eo);
            }
            com.bytedance.sdk.openadsdk.tuV.bg bgVar = new com.bytedance.sdk.openadsdk.tuV.bg() { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.WR.2
                @Override // com.bytedance.sdk.openadsdk.tuV.bg
                public void bg(int i, java.lang.String str) {
                    super.bg(i, str);
                    if (com.bytedance.sdk.openadsdk.component.reward.bg.WR.this.tuV == null || !com.bytedance.sdk.openadsdk.component.reward.bg.WR.this.tuV.isShown()) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.component.reward.bg.WR.this.vb.sendMessage(com.bytedance.sdk.openadsdk.component.reward.bg.WR.bg(3, com.bytedance.sdk.openadsdk.core.model.rri.bg(i)));
                }

                @Override // com.bytedance.sdk.openadsdk.tuV.bg
                public com.bytedance.sdk.openadsdk.tuV.eqN bg() {
                    return com.bytedance.sdk.openadsdk.component.reward.bg.WR.Fy();
                }

                @Override // com.bytedance.sdk.openadsdk.tuV.bg
                public void IL() {
                    com.bytedance.sdk.openadsdk.component.reward.bg.WR.this.Lq.VJ.PX().bX(true);
                    com.bytedance.sdk.openadsdk.PX.zx zxVar2 = zxVar;
                    if (zxVar2 != null) {
                        zxVar2.bg();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.tuV.bg
                public void bg(org.json.JSONObject jSONObject) {
                    com.bytedance.sdk.openadsdk.eqN.bX.IL(com.bytedance.sdk.openadsdk.component.reward.bg.WR.this.Ta, com.bytedance.sdk.openadsdk.component.reward.bg.WR.this.yDt, "playable_track", jSONObject);
                }
            };
            com.bytedance.sdk.openadsdk.tuV.bX bXVar = new com.bytedance.sdk.openadsdk.tuV.bX() { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.WR.3
                @Override // com.bytedance.sdk.openadsdk.tuV.bX
                public void bg(java.lang.String str, org.json.JSONObject jSONObject) {
                    com.bytedance.sdk.openadsdk.component.reward.bg.WR.this.Lq.VJ.PX().bg(str, jSONObject);
                }
            };
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put(androidx.media3.exoplayer.upstream.CmcdConfiguration.KEY_CONTENT_ID, this.Ta.Ys());
                jSONObject.put("log_extra", this.Ta.Ny());
                com.bytedance.sdk.openadsdk.tuV.Kg kgZx = com.bytedance.sdk.openadsdk.tuV.Kg.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(), this.Lq.VJ.eo().getWebView(), bXVar, bgVar).iR(this.Lq.VJ.JAA()).zx(com.bytedance.sdk.openadsdk.common.IL.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg())).bg(com.bytedance.sdk.openadsdk.common.IL.bg()).bX(jSONObject).bg("sdkEdition", com.bytedance.sdk.openadsdk.common.IL.bX()).IL(com.bytedance.sdk.openadsdk.common.IL.zx()).eqN(com.bytedance.sdk.openadsdk.common.IL.eqN()).eqN(false).bg(z).bg(com.bytedance.sdk.openadsdk.core.model.rri.Fy(this.Ta)).IL(com.bytedance.sdk.openadsdk.core.model.rri.Fy(this.Ta)).zx(com.bytedance.sdk.openadsdk.core.model.rri.VzQ(this.Ta));
                this.tC = kgZx;
                if (kgZx == null) {
                    il = new com.bytedance.sdk.openadsdk.yDt.IL() { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.WR.4
                        @Override // com.bytedance.sdk.openadsdk.yDt.IL
                        public com.bytedance.sdk.openadsdk.yDt.bg.bX getLogStats() throws java.lang.Exception {
                            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                            jSONObject2.put("PlayablePlugin_is_null", true);
                            return com.bytedance.sdk.openadsdk.yDt.bg.eqN.IL().bg("PlayablePlugin_init").IL(jSONObject2.toString());
                        }
                    };
                    com.bytedance.sdk.openadsdk.yDt.bX.bg("PlayablePlugin_init", false, il);
                }
            } catch (java.lang.Exception unused) {
                if (this.tC == null) {
                    il = new com.bytedance.sdk.openadsdk.yDt.IL() { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.WR.4
                        @Override // com.bytedance.sdk.openadsdk.yDt.IL
                        public com.bytedance.sdk.openadsdk.yDt.bg.bX getLogStats() throws java.lang.Exception {
                            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                            jSONObject2.put("PlayablePlugin_is_null", true);
                            return com.bytedance.sdk.openadsdk.yDt.bg.eqN.IL().bg("PlayablePlugin_init").IL(jSONObject2.toString());
                        }
                    };
                }
            } catch (java.lang.Throwable th) {
                if (this.tC == null) {
                    com.bytedance.sdk.openadsdk.yDt.bX.bg("PlayablePlugin_init", false, new com.bytedance.sdk.openadsdk.yDt.IL() { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.WR.4
                        @Override // com.bytedance.sdk.openadsdk.yDt.IL
                        public com.bytedance.sdk.openadsdk.yDt.bg.bX getLogStats() throws java.lang.Exception {
                            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                            jSONObject2.put("PlayablePlugin_is_null", true);
                            return com.bytedance.sdk.openadsdk.yDt.bg.eqN.IL().bg("PlayablePlugin_init").IL(jSONObject2.toString());
                        }
                    });
                }
                throw th;
            }
            if (this.tC != null && !android.text.TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.model.rri.VB(this.Ta))) {
                this.tC.bX(com.bytedance.sdk.openadsdk.core.model.rri.VB(this.Ta));
            }
            com.bytedance.sdk.openadsdk.tuV.Kg kg = this.tC;
            if (kg != null) {
                java.util.Set<java.lang.String> setVB = kg.VB();
                final java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this.tC);
                for (java.lang.String str : setVB) {
                    if (!"subscribe_app_ad".equals(str) && !"adInfo".equals(str) && !"webview_time_track".equals(str) && !"download_app_ad".equals(str) && (vzQBg = this.Lq.VJ.PX().bg()) != null) {
                        vzQBg.bg(str, new com.bytedance.sdk.component.bg.zx<org.json.JSONObject, org.json.JSONObject>() { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.WR.5
                            @Override // com.bytedance.sdk.component.bg.zx
                            public org.json.JSONObject bg(org.json.JSONObject jSONObject2, com.bytedance.sdk.component.bg.ldr ldrVar) {
                                try {
                                    com.bytedance.sdk.openadsdk.tuV.Kg kg2 = (com.bytedance.sdk.openadsdk.tuV.Kg) weakReference.get();
                                    if (kg2 == null) {
                                        return null;
                                    }
                                    return kg2.eqN(bg(), jSONObject2);
                                } catch (java.lang.Throwable unused2) {
                                    return null;
                                }
                            }
                        });
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.bytedance.sdk.openadsdk.tuV.eqN Fy() {
        java.lang.String strLdr = com.bytedance.sdk.openadsdk.common.IL.ldr();
        strLdr.hashCode();
        switch (strLdr) {
            case "2g":
                return com.bytedance.sdk.openadsdk.tuV.eqN.TYPE_2G;
            case "3g":
                return com.bytedance.sdk.openadsdk.tuV.eqN.TYPE_3G;
            case "4g":
                return com.bytedance.sdk.openadsdk.tuV.eqN.TYPE_4G;
            case "5g":
                return com.bytedance.sdk.openadsdk.tuV.eqN.TYPE_5G;
            case "wifi":
                return com.bytedance.sdk.openadsdk.tuV.eqN.TYPE_WIFI;
            default:
                return com.bytedance.sdk.openadsdk.tuV.eqN.TYPE_UNKNOWN;
        }
    }

    private void LZ() {
        if (this.Kg) {
            this.tuV = (com.bytedance.sdk.openadsdk.core.widget.VB) this.Lq.CQc.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.OLh);
        }
    }

    private boolean tC() {
        if (this.tuV == null) {
            return false;
        }
        if (this.Ta.gJ() && com.bytedance.sdk.openadsdk.core.model.rri.VzQ(this.Ta)) {
            this.tuV.IL(this.Ta, this.VzQ);
            return true;
        }
        this.tuV.bX();
        return false;
    }

    public void IL() {
        if (this.Kg && !this.bg.getAndSet(true)) {
            this.xxp.ayS();
            if (com.bytedance.sdk.openadsdk.core.model.rri.Kg(this.Ta)) {
                this.xxp.iR();
            }
        }
    }

    public void bg(android.webkit.DownloadListener downloadListener) {
        com.bytedance.sdk.component.WR.eqN eqnVB;
        if (this.Kg && (eqnVB = this.xxp.VB()) != null) {
            java.lang.String strRri = rri();
            if (android.text.TextUtils.isEmpty(strRri)) {
                return;
            }
            eqnVB.setWebViewClient(new com.bytedance.sdk.openadsdk.core.widget.bg.zx(this.PX, this.xxp.Ta(), this.Ta.Ys(), null, false) { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.WR.6
                @Override // com.bytedance.sdk.openadsdk.core.widget.bg.zx, android.webkit.WebViewClient
                public void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
                    if (com.bytedance.sdk.openadsdk.component.reward.bg.WR.this.Fy) {
                        com.bytedance.sdk.openadsdk.eqN.bX.bg(java.lang.System.currentTimeMillis(), com.bytedance.sdk.openadsdk.component.reward.bg.WR.this.Ta, com.bytedance.sdk.openadsdk.component.reward.bg.WR.this.yDt, "loading_h5_success");
                    }
                    super.onPageFinished(webView, str);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.bg.zx, android.webkit.WebViewClient
                public void onReceivedHttpError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceResponse webResourceResponse) {
                    super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                    com.bytedance.sdk.openadsdk.component.reward.bg.WR.this.Fy = false;
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.bg.zx, android.webkit.WebViewClient
                public void onReceivedError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceError webResourceError) {
                    super.onReceivedError(webView, webResourceRequest, webResourceError);
                    com.bytedance.sdk.openadsdk.component.reward.bg.WR.this.Fy = false;
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.bg.zx, android.webkit.WebViewClient
                public void onReceivedError(android.webkit.WebView webView, int i, java.lang.String str, java.lang.String str2) {
                    super.onReceivedError(webView, i, str, str2);
                    com.bytedance.sdk.openadsdk.component.reward.bg.WR.this.Fy = false;
                }
            });
            eqnVB.a_(strRri);
            eqnVB.setDisplayZoomControls(false);
            eqnVB.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.bg.eqN(this.xxp.Ta(), this.xxp.yDt()));
            eqnVB.setDownloadListener(downloadListener);
        }
    }

    private java.lang.String rri() {
        java.lang.String strJa = com.bytedance.sdk.openadsdk.core.VzQ.eqN().Ja();
        if (android.text.TextUtils.isEmpty(strJa) || this.Ta.RiO() == null) {
            return strJa;
        }
        java.lang.String strIL = this.Ta.RiO().IL();
        double dEqN = this.Ta.RiO().eqN();
        int iZx = this.Ta.RiO().zx();
        java.lang.String strBg = (this.Ta.sVc() == null || android.text.TextUtils.isEmpty(this.Ta.sVc().bg())) ? "" : this.Ta.sVc().bg();
        java.lang.String strYs = this.Ta.Ys();
        java.lang.String strBX = this.Ta.RiO().bX();
        java.lang.String strBg2 = this.Ta.RiO().bg();
        java.lang.String strIL2 = this.Ta.RiO().IL();
        java.lang.String strWS = this.Ta.wS();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("appname=");
        sb.append(java.net.URLEncoder.encode(strIL)).append("&stars=").append(dEqN).append("&comments=").append(iZx).append("&icon=").append(java.net.URLEncoder.encode(strBg)).append("&downloading=true&id=").append(java.net.URLEncoder.encode(strYs)).append("&packageName=").append(java.net.URLEncoder.encode(strBX)).append("&downloadUrl=").append(java.net.URLEncoder.encode(strBg2)).append("&name=").append(java.net.URLEncoder.encode(strIL2)).append("&orientation=").append(this.VzQ == 1 ? com.ironsource.y8.h.D : com.ironsource.y8.h.C).append("&apptitle=").append(java.net.URLEncoder.encode(strWS));
        return strJa + "?" + ((java.lang.Object) sb);
    }

    public void bX() {
        if (this.Kg && !this.Ja) {
            this.Ja = true;
            bX(false);
            bg(this.PX.getApplicationContext());
            com.bytedance.sdk.openadsdk.tuV.Kg kg = this.tC;
            if (kg != null) {
                kg.ayS();
            }
            this.vb.removeCallbacksAndMessages(null);
            com.bytedance.sdk.openadsdk.utils.DeviceUtils.AudioInfoReceiver.IL(this);
        }
    }

    public void bg(boolean z) {
        if (this.Kg && z) {
            this.xxp.eo().setDomStorageEnabled(true);
        }
    }

    public void IL(boolean z) {
        if (this.Kg) {
            if (z) {
                try {
                    if (!android.text.TextUtils.isEmpty(this.xxp.JAA()) && this.xxp.rri() != 0) {
                        com.bytedance.sdk.openadsdk.yDt.bX.bg().bg(this.xxp.JAA(), this.xxp.rri(), this.xxp.kMt());
                    }
                } catch (java.lang.Throwable unused) {
                }
            }
            if (z) {
                try {
                    if (android.text.TextUtils.isEmpty(this.xxp.JAA())) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.yDt.bX.bg().IL(this.xxp.JAA());
                } catch (java.lang.Throwable unused2) {
                }
            }
        }
    }

    public void eqN() {
        if (this.Kg) {
            try {
                com.bytedance.sdk.component.utils.HomeWatcherReceiver homeWatcherReceiver = new com.bytedance.sdk.component.utils.HomeWatcherReceiver();
                this.LZ = homeWatcherReceiver;
                homeWatcherReceiver.bg(new com.bytedance.sdk.component.utils.HomeWatcherReceiver.bg() { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.WR.7
                    @Override // com.bytedance.sdk.component.utils.HomeWatcherReceiver.bg
                    public void bg() {
                        com.bytedance.sdk.openadsdk.component.reward.bg.WR.this.bX = true;
                    }

                    @Override // com.bytedance.sdk.component.utils.HomeWatcherReceiver.bg
                    public void IL() {
                        com.bytedance.sdk.openadsdk.component.reward.bg.WR.this.bX = true;
                    }
                });
                this.PX.getApplicationContext().registerReceiver(this.LZ, new android.content.IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    private void bg(android.content.Context context) {
        if (this.Kg) {
            try {
                this.LZ.bg(null);
                context.getApplicationContext().unregisterReceiver(this.LZ);
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    public void bg(java.lang.String str) {
        if (this.Kg && this.bX) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("duration", java.lang.System.currentTimeMillis() - this.eqN);
            } catch (org.json.JSONException e) {
                com.bytedance.sdk.component.utils.PX.bg("TTAD.RFPM", "sendPlayableEvent error", e);
            }
            com.bytedance.sdk.openadsdk.eqN.bX.IL(this.Ta, this.yDt, str, jSONObject);
            if ("return_foreground".equals(str)) {
                this.bX = false;
            }
        }
    }

    public void zx() {
        if (this.Kg && this.eqN <= 0) {
            this.eqN = java.lang.System.currentTimeMillis();
            android.os.Handler handler = this.vb;
            handler.sendMessage(handler.obtainMessage(900, WR(), 0));
            bX(true);
        }
    }

    public void bg(org.json.JSONObject jSONObject) {
        if (this.Kg && jSONObject != null) {
            try {
                jSONObject.put("duration", java.lang.System.currentTimeMillis() - this.eqN);
            } catch (org.json.JSONException e) {
                com.bytedance.sdk.component.utils.PX.bg("TTAD.RFPM", "endShow json error", e);
            }
        }
    }

    public void bX(int i) {
        com.bytedance.sdk.openadsdk.core.widget.VB vb;
        if (this.Kg && (vb = this.tuV) != null) {
            vb.setProgress(i);
        }
    }

    public void bg(com.bytedance.sdk.openadsdk.core.IL.zx zxVar) {
        com.bytedance.sdk.openadsdk.core.widget.VB vb;
        if (!this.Kg || (vb = this.tuV) == null || vb.getDownloadButton() == null) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.core.model.rri.VzQ(this.Ta) || com.bytedance.sdk.openadsdk.core.model.rri.rri(this.Ta)) {
            this.tuV.getDownloadButton().setOnClickListener(zxVar);
            this.tuV.getDownloadButton().setOnTouchListener(zxVar);
        }
    }

    public void ldr() {
        com.bytedance.sdk.openadsdk.tuV.Kg kg;
        if (this.Kg) {
            if (!com.bytedance.sdk.openadsdk.core.model.rri.Kg(this.Ta) && this.tuV.isShown() && this.Lq.Dt != null) {
                this.Lq.Dt.bg(WR() * 1000);
            }
            if (com.bytedance.sdk.openadsdk.core.model.rri.tuV(this.Ta) && this.tuV.isShown()) {
                this.Lq.ZQc.IL(this.Lq.dS);
            }
            com.bytedance.sdk.openadsdk.core.widget.VB vb = this.tuV;
            if (vb != null) {
                vb.bX();
            }
            if (this.bg.getAndSet(true)) {
                return;
            }
            if (this.Lq.VJ.LKE() && (kg = this.tC) != null) {
                kg.bg(1);
            }
            if (com.bytedance.sdk.openadsdk.core.model.rri.iR(this.Ta) && com.bytedance.sdk.openadsdk.core.model.rri.rri(this.Ta)) {
                if (this.Lq.VJ != null && !this.Lq.VJ.LKE()) {
                    int i = !this.Lq.VJ.VzQ() ? 2 : 3;
                    com.bytedance.sdk.openadsdk.tuV.Kg kg2 = this.tC;
                    if (kg2 != null) {
                        kg2.bg(i);
                    }
                    if (com.bytedance.sdk.openadsdk.core.model.rri.VzQ(this.Lq.IL)) {
                        bg(this.Lq.ldr, this.Lq.IL, this.Lq.IL.fE());
                        zx();
                        this.Lq.qC.VB();
                    }
                    this.Lq.ZQc.bg(false);
                    this.Lq.VJ.ZQc();
                    this.kMt = true;
                    this.Lq.ayS.bX(false);
                    this.Lq.VW.bg(true);
                    this.Lq.RJ = true;
                    if (com.bytedance.sdk.openadsdk.core.model.rri.tuV(this.Ta)) {
                        this.vb.removeMessages(900);
                        this.Lq.ayS.eqN(false);
                        if (this.Lq.bN != null) {
                            this.Lq.bN.removeMessages(1);
                            this.Lq.bN.sendEmptyMessageDelayed(600, 1000L);
                        }
                    }
                    com.bytedance.sdk.openadsdk.tuV.Kg kg3 = this.tC;
                    if (kg3 != null) {
                        kg3.bX(true);
                        return;
                    }
                    return;
                }
                this.Lq.ZQc.bg(this.Lq.dS);
            }
        }
    }

    public void iR() {
        if (this.Kg && !this.tuV.isShown()) {
            com.bytedance.sdk.openadsdk.core.widget.VB vb = this.tuV;
            if (vb != null) {
                vb.IL(this.Ta, this.VzQ);
                this.tuV.setProgress(this.Lq.VJ.eo() != null ? this.Lq.VJ.eo().getProgress() : 0);
            }
            com.bytedance.sdk.openadsdk.tuV.Kg kg = this.tC;
            if (kg != null) {
                kg.Uq();
            }
        }
    }

    public boolean Kg() {
        return this.VB;
    }

    public void bX(boolean z) {
        if (this.Kg) {
            this.VB = z;
            if (z) {
                return;
            }
            this.vb.removeMessages(900);
        }
    }

    public int eqN(int i) {
        return this.iR - (this.ldr - i);
    }

    public int WR() {
        return this.ldr;
    }

    public int eo() {
        return this.zx;
    }

    public void bg(int i, com.bytedance.sdk.openadsdk.core.model.tuV tuv, boolean z) {
        if (this.Kg && tuv != null) {
            this.ldr = tuv.gtr();
            this.iR = com.bytedance.sdk.openadsdk.core.VzQ.eqN().bg(java.lang.String.valueOf(i), z);
        }
    }

    public void zx(int i) {
        this.zx = i - 1;
    }

    public void ldr(int i) {
        this.zx = i;
    }

    @Override // com.bytedance.sdk.openadsdk.PX.iR
    public void bg(int i) {
        if (this.Kg) {
            if (!com.bytedance.sdk.openadsdk.core.model.rri.tuV(this.Lq.IL) || this.Lq.eo.get()) {
                if (com.bytedance.sdk.openadsdk.core.model.rri.VzQ(this.Lq.IL) || com.bytedance.sdk.openadsdk.core.model.rri.tuV(this.Lq.IL)) {
                    if (this.Lq.VW.IL()) {
                        boolean z = this.Lq.RJ;
                        this.Lq.VW.bg();
                        if (i == 0) {
                            this.Lq.ayS.IL(true);
                            this.Lq.rri.IL(true);
                            return;
                        } else {
                            this.Lq.ayS.IL(false);
                            this.Lq.rri.IL(false);
                            return;
                        }
                    }
                    this.Lq.VW.bg(-1);
                    boolean z2 = this.Lq.RJ;
                    this.Lq.VW.bg();
                    if (this.Lq.txA) {
                        if (i == 0) {
                            this.Lq.RJ = true;
                            this.Lq.ayS.IL(true);
                            this.Lq.rri.IL(true);
                        } else {
                            this.Lq.RJ = false;
                            this.Lq.ayS.IL(false);
                            this.Lq.rri.IL(false);
                        }
                    }
                }
            }
        }
    }

    public void VB() {
        if (this.Kg && this.tC != null && com.bytedance.sdk.openadsdk.utils.ZQc.eqN(this.Lq.VJ.eo())) {
            this.tC.bX(true);
        }
    }

    public void PX() {
        if (this.Kg) {
            com.bytedance.sdk.openadsdk.tuV.Kg kg = this.tC;
            if (kg != null) {
                kg.bX(false);
            }
            this.vb.removeMessages(900);
        }
    }

    public void eqN(boolean z) {
        com.bytedance.sdk.openadsdk.tuV.Kg kg;
        if (this.Kg && (kg = this.tC) != null) {
            kg.bX(z);
        }
    }

    public void zx(boolean z) {
        com.bytedance.sdk.openadsdk.tuV.Kg kg;
        if (this.Kg && (kg = this.tC) != null) {
            kg.bg(z);
        }
    }

    public void bg(int i, java.lang.String str, java.lang.String str2) {
        if (this.Kg) {
            try {
                com.bytedance.sdk.openadsdk.tuV.Kg kg = this.tC;
                if (kg != null) {
                    kg.ldr(com.bytedance.sdk.openadsdk.core.Ta.bX.bg.bg().bg(this.Ta));
                    this.tC.bg(i, str, str2);
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public void bg(boolean z, java.lang.String str, int i) {
        if (this.Kg) {
            try {
                com.bytedance.sdk.openadsdk.tuV.Kg kg = this.tC;
                if (kg != null) {
                    kg.ldr(com.bytedance.sdk.openadsdk.core.Ta.bX.bg.bg().bg(this.Ta));
                    this.tC.bg(z, str, i);
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public void IL(java.lang.String str) {
        com.bytedance.sdk.openadsdk.tuV.Kg kg = this.tC;
        if (kg != null) {
            if (!this.Kg) {
                return;
            }
            kg.ldr(com.bytedance.sdk.openadsdk.core.Ta.bX.bg.bg().bg(this.Ta));
            this.tC.WR(str);
        }
        if (Lq()) {
            this.Lq.VJ.eqN(true);
            this.Lq.VW.bg(true);
            this.Lq.RJ = true;
        }
    }

    public void bX(java.lang.String str) {
        com.bytedance.sdk.openadsdk.tuV.Kg kg = this.tC;
        if (kg == null || !this.Kg) {
            return;
        }
        kg.ldr(com.bytedance.sdk.openadsdk.core.Ta.bX.bg.bg().bg(this.Ta));
        this.tC.Kg(str);
    }

    public void Ta() {
        if (this.Kg) {
            this.vb.removeMessages(900);
            this.vb.removeMessages(600);
        }
    }

    public void bg(long j) {
        if (this.Kg) {
            android.os.Message messageObtain = android.os.Message.obtain();
            messageObtain.what = 900;
            messageObtain.arg1 = eo();
            this.vb.sendMessageDelayed(messageObtain, j);
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        com.bytedance.sdk.openadsdk.core.widget.VB vb;
        if (message.what == 900) {
            if (!this.VB || !com.bytedance.sdk.openadsdk.core.model.rri.VzQ(this.Lq.IL)) {
                return true;
            }
            int i = message.arg1;
            if (i > 0) {
                this.Lq.ayS.eqN(true);
                int iIL = this.Lq.JAA.IL(i);
                if (iIL == i) {
                    this.Lq.ayS.bg(java.lang.String.valueOf(i), null);
                } else if (iIL > 0) {
                    this.Lq.ayS.bg(java.lang.String.valueOf(i), java.lang.String.format(com.bytedance.sdk.component.utils.Fy.bg(this.Lq.uu.getApplicationContext(), "tt_skip_ad_time_text"), java.lang.Integer.valueOf(iIL)));
                } else if (com.bytedance.sdk.openadsdk.core.model.rri.Kg(this.Ta) && !Lq()) {
                    this.Lq.ayS.bg(java.lang.String.valueOf(i), com.bytedance.sdk.component.utils.Fy.bg(this.Lq.uu.getApplicationContext(), "tt_reward_screen_skip_tx"));
                    this.Lq.ayS.zx(true);
                } else {
                    this.Lq.tuV.set(true);
                    this.Lq.dS.Lq();
                }
                android.os.Message messageObtain = android.os.Message.obtain();
                messageObtain.what = 900;
                messageObtain.arg1 = i - 1;
                this.vb.sendMessageDelayed(messageObtain, 1000L);
                zx(i);
            } else {
                if (com.bytedance.sdk.openadsdk.core.model.rri.Kg(this.Ta) && (!com.bytedance.sdk.openadsdk.core.model.rri.rri(this.Ta) || !this.Lq.JAA.iR())) {
                    this.Lq.ayS.bX();
                    this.Lq.ayS.zx(true);
                } else {
                    this.Lq.ayS.eqN(false);
                    this.Lq.tuV.set(true);
                    this.Lq.dS.Lq();
                }
                if (!this.WR) {
                    this.JAA = true;
                }
            }
            this.Lq.qC.yDt();
        } else {
            if (message.what != 800 || ((vb = this.tuV) != null && (!vb.isShown() || this.tuV.eqN()))) {
                return true;
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            long displayDuration = 0;
            try {
                jSONObject.put("remove_loading_page_type", message.arg1);
                if (message.arg2 != 0) {
                    jSONObject.put("remove_loading_page_reason", message.arg2);
                }
                java.lang.String strPX = com.bytedance.sdk.openadsdk.core.model.rri.PX(this.Ta);
                com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar = this.Lq;
                if (bgVar != null && bgVar.VJ != null) {
                    java.lang.String strJAA = this.Lq.VJ.JAA();
                    if (!android.text.TextUtils.isEmpty(strJAA)) {
                        strPX = strJAA;
                    }
                }
                jSONObject.put("playable_url", strPX);
                com.bytedance.sdk.openadsdk.core.widget.VB vb2 = this.tuV;
                displayDuration = vb2 != null ? vb2.getDisplayDuration() : 0L;
                jSONObject.put("duration", displayDuration);
            } catch (org.json.JSONException e) {
                com.bytedance.sdk.component.utils.PX.bg("TTAD.RFPM", "handleMessage json error", e);
            }
            com.bytedance.sdk.openadsdk.eqN.bX.bg(this.Lq.IL, this.Lq.zx, "remove_loading_page", jSONObject, displayDuration);
            this.vb.removeMessages(800);
            if (!this.PX.isFinishing()) {
                this.Lq.JAA.zx();
            }
        }
        return true;
    }

    public com.bytedance.sdk.openadsdk.PX.eqN yDt() {
        return this.Uw;
    }

    public void ldr(boolean z) {
        if (this.Kg && z && !this.Lq.JAA.iR()) {
            com.bytedance.sdk.openadsdk.tuV.Kg kg = this.tC;
            if (kg != null) {
                kg.bg(1);
            }
            boolean zVzQ = com.bytedance.sdk.openadsdk.core.model.rri.VzQ(this.Ta);
            if ((zVzQ || com.bytedance.sdk.openadsdk.core.model.rri.rri(this.Ta)) && this.Ta.gJ() && !com.bytedance.sdk.openadsdk.core.model.rri.vb(this.Ta)) {
                android.os.Handler handler = this.vb;
                handler.sendMessageDelayed(handler.obtainMessage(800, 0, 0), 1000L);
            }
            if (zVzQ) {
                this.Lq.JAA.Kg();
                this.Lq.VJ.IL(true);
                this.Lq.VJ.bX(true);
                com.bytedance.sdk.openadsdk.eqN.bX.bg(java.lang.System.currentTimeMillis(), this.Lq.IL, this.yDt, "py_loading_success");
            }
        }
    }

    public boolean Lq() {
        return this.kMt;
    }

    public boolean vb() {
        return this.JAA;
    }

    public boolean xxp() {
        com.bytedance.sdk.openadsdk.core.widget.VB vb = this.tuV;
        return vb != null && vb.isShown();
    }

    public com.bytedance.sdk.openadsdk.tuV.Kg VzQ() {
        return this.tC;
    }
}

package com.bytedance.sdk.openadsdk.tuV.bg;

/* JADX INFO: loaded from: classes4.dex */
public class bg {
    private final android.content.Context IL;
    private final java.lang.String Kg;
    private volatile boolean Ta;
    private com.bytedance.sdk.openadsdk.PX.zx VB;
    private com.bytedance.sdk.openadsdk.tuV.bg.bg.InterfaceC0166bg VzQ;
    private final java.lang.String WR;
    private final com.bytedance.sdk.openadsdk.core.model.tuV bX;
    protected com.bytedance.sdk.component.WR.eqN bg;
    private com.bytedance.sdk.openadsdk.tuV.Kg eo;
    private final int eqN;
    private com.bytedance.sdk.openadsdk.core.aGH iR;
    private com.bytedance.sdk.openadsdk.core.widget.VB ldr;
    private com.bytedance.sdk.openadsdk.core.widget.eo vb;
    private com.bytedance.sdk.openadsdk.core.IL.bg xxp;
    private volatile boolean yDt;
    private final android.widget.FrameLayout zx;
    private boolean PX = true;
    private java.util.concurrent.atomic.AtomicBoolean Lq = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.tuV.bg.bg$bg, reason: collision with other inner class name */
    public interface InterfaceC0166bg {
        void bg();
    }

    public bg(android.content.Context context, com.bytedance.sdk.openadsdk.core.model.tuV tuv, int i, boolean z, android.widget.FrameLayout frameLayout) {
        this.IL = context;
        this.bX = tuv;
        this.eqN = i;
        this.Kg = com.bytedance.sdk.openadsdk.utils.ayS.bX(tuv.VW().getDurationSlotType());
        this.WR = com.bytedance.sdk.openadsdk.core.model.rri.Ta(tuv);
        this.zx = frameLayout;
        bg(frameLayout);
        iR();
        bX(z);
        Kg();
    }

    public static void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, org.json.JSONObject jSONObject) {
        if (jSONObject == null || tuv == null || !com.bytedance.sdk.openadsdk.core.model.rri.IL(tuv) || !tuv.kCH()) {
            return;
        }
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("is_new_playable", 1);
            jSONObject.put("pag_json_data", jSONObject2.toString());
        } catch (org.json.JSONException unused) {
        }
    }

    private void bg(android.widget.FrameLayout frameLayout) {
        com.bytedance.sdk.component.WR.eqN eqn = new com.bytedance.sdk.component.WR.eqN(this.IL);
        this.bg = eqn;
        eqn.f_();
        this.bg.setLayerType(2, null);
        this.bg.setVisibility(4);
        this.bg.setBackgroundColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        this.bg.setEnabled(true);
        this.bg.setTag(this.Kg);
        this.bg.setMaterialMeta(this.bX.mLT());
        this.bg.setLandingPage(true);
        frameLayout.addView(this.bg, new android.widget.FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.widget.eo eoVar = new com.bytedance.sdk.openadsdk.core.widget.eo(this.IL);
        this.vb = eoVar;
        eoVar.bg(this.bX, this.Kg, this.xxp);
        frameLayout.addView(this.vb, new android.widget.FrameLayout.LayoutParams(-1, -1));
        if (this.bX.gJ()) {
            com.bytedance.sdk.openadsdk.core.widget.VB vb = new com.bytedance.sdk.openadsdk.core.widget.VB(this.IL);
            this.ldr = vb;
            vb.IL();
            frameLayout.addView(this.ldr, new android.widget.FrameLayout.LayoutParams(-1, -1));
        }
    }

    private void iR() {
        java.util.HashMap map = new java.util.HashMap();
        map.put("click_scence", 3);
        this.iR = new com.bytedance.sdk.openadsdk.core.aGH(this.IL);
        this.iR.IL(this.bg).bg(this.bX).bX(this.bX.Ys()).eqN(this.bX.Ny()).IL(com.bytedance.sdk.openadsdk.utils.ayS.bg(this.Kg)).zx(this.bX.PC()).bg(this.bg).IL(this.Kg).bg(map).bg(new com.bytedance.sdk.openadsdk.eqN.VzQ(3, this.Kg, this.bX));
    }

    private void bX(boolean z) {
        com.bytedance.sdk.component.bg.VzQ vzQBg;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(androidx.media3.exoplayer.upstream.CmcdConfiguration.KEY_CONTENT_ID, this.bX.Ys());
            jSONObject.put("log_extra", this.bX.Ny());
        } catch (java.lang.Throwable unused) {
        }
        if (com.bytedance.sdk.openadsdk.core.WR.IL().xxp()) {
            com.bytedance.sdk.openadsdk.tuV.iR.bg(new com.bytedance.sdk.openadsdk.tuV.iR.bg() { // from class: com.bytedance.sdk.openadsdk.tuV.bg.bg.1
                @Override // com.bytedance.sdk.openadsdk.tuV.iR.bg
                public void bg(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
                    com.bytedance.sdk.component.utils.PX.bg(str, str2, th);
                }
            });
        }
        com.bytedance.sdk.openadsdk.tuV.Kg kgBg = com.bytedance.sdk.openadsdk.tuV.Kg.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(), this.bg.getWebView(), new com.bytedance.sdk.openadsdk.tuV.bX() { // from class: com.bytedance.sdk.openadsdk.tuV.bg.bg.2
            @Override // com.bytedance.sdk.openadsdk.tuV.bX
            public void bg(java.lang.String str, org.json.JSONObject jSONObject2) {
                if (com.bytedance.sdk.openadsdk.tuV.bg.bg.this.iR != null) {
                    com.bytedance.sdk.openadsdk.tuV.bg.bg.this.iR.bg(str, jSONObject2);
                }
            }
        }, new com.bytedance.sdk.openadsdk.tuV.bg() { // from class: com.bytedance.sdk.openadsdk.tuV.bg.bg.3
            @Override // com.bytedance.sdk.openadsdk.tuV.bg
            public com.bytedance.sdk.openadsdk.tuV.eqN bg() {
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

            @Override // com.bytedance.sdk.openadsdk.tuV.bg
            public void IL() {
                com.bytedance.sdk.openadsdk.tuV.bg.bg.this.iR.bX(true);
                if (com.bytedance.sdk.openadsdk.tuV.bg.bg.this.VB != null) {
                    com.bytedance.sdk.openadsdk.tuV.bg.bg.this.VB.bg();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.tuV.bg
            public void bg(org.json.JSONObject jSONObject2) {
                if (jSONObject2 == null) {
                    jSONObject2 = new org.json.JSONObject();
                }
                try {
                    org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                    jSONObject3.put("is_new_playable", 1);
                    if (com.bytedance.sdk.openadsdk.tuV.bg.bg.this.bX.zqp()) {
                        jSONObject3.put("is_pre_render", 1);
                    }
                    jSONObject2.put("pag_json_data", jSONObject3.toString());
                } catch (org.json.JSONException e) {
                    com.bytedance.sdk.component.utils.PX.bg("PlayableManager", e.getMessage());
                }
                com.bytedance.sdk.openadsdk.eqN.bX.IL(com.bytedance.sdk.openadsdk.tuV.bg.bg.this.bX, com.bytedance.sdk.openadsdk.tuV.bg.bg.this.Kg, "playable_track", jSONObject2);
            }

            @Override // com.bytedance.sdk.openadsdk.tuV.bg
            public void bg(int i, java.lang.String str) {
                com.bytedance.sdk.openadsdk.tuV.bg.bg.this.PX = false;
                if (i == 2 || i == 3 || i == 4) {
                    com.bytedance.sdk.openadsdk.tuV.bg.bg.this.bg(2, i);
                } else if (i == 5) {
                    com.bytedance.sdk.openadsdk.tuV.bg.bg.this.bg(3, i);
                } else {
                    com.bytedance.sdk.openadsdk.tuV.bg.bg.this.bg(1, 0);
                }
            }
        });
        this.eo = kgBg;
        kgBg.iR(this.WR).zx(com.bytedance.sdk.openadsdk.common.IL.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg())).IL(com.bytedance.sdk.openadsdk.common.IL.zx()).bg(com.bytedance.sdk.openadsdk.common.IL.bg()).eqN(com.bytedance.sdk.openadsdk.common.IL.eqN()).bX(jSONObject).bX(com.bytedance.sdk.openadsdk.core.model.rri.VB(this.bX)).eqN(true).bg(z).bX(false).bg(com.bytedance.sdk.openadsdk.core.model.rri.Fy(this.bX)).IL(com.bytedance.sdk.openadsdk.core.model.rri.Fy(this.bX)).bg("sdkEdition", com.bytedance.sdk.openadsdk.common.IL.bX()).zx(com.bytedance.sdk.openadsdk.core.model.rri.ldr(this.bX)).ldr(this.Kg);
        this.eo.bg(com.bytedance.sdk.openadsdk.tuV.zx.IL(this.IL));
        java.util.Set<java.lang.String> setVB = this.eo.VB();
        final java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this.eo);
        for (java.lang.String str : setVB) {
            if (!"subscribe_app_ad".equals(str) && !"adInfo".equals(str) && !"webview_time_track".equals(str) && !"download_app_ad".equals(str) && (vzQBg = this.iR.bg()) != null) {
                vzQBg.bg(str, new com.bytedance.sdk.component.bg.zx<org.json.JSONObject, org.json.JSONObject>() { // from class: com.bytedance.sdk.openadsdk.tuV.bg.bg.4
                    @Override // com.bytedance.sdk.component.bg.zx
                    public org.json.JSONObject bg(org.json.JSONObject jSONObject2, com.bytedance.sdk.component.bg.ldr ldrVar) {
                        try {
                            com.bytedance.sdk.openadsdk.tuV.Kg kg = (com.bytedance.sdk.openadsdk.tuV.Kg) weakReference.get();
                            if (kg == null) {
                                return null;
                            }
                            return kg.eqN(bg(), jSONObject2);
                        } catch (java.lang.Throwable unused2) {
                            return null;
                        }
                    }
                });
            }
        }
    }

    private void Kg() {
        this.bg.setWebViewClient(new com.bytedance.sdk.openadsdk.core.widget.bg.zx(com.bytedance.sdk.openadsdk.core.VzQ.bg(), this.iR, this.bX.Ys(), null, true) { // from class: com.bytedance.sdk.openadsdk.tuV.bg.bg.5
            @Override // com.bytedance.sdk.openadsdk.core.widget.bg.zx, android.webkit.WebViewClient
            public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, java.lang.String str) {
                try {
                    if (com.bytedance.sdk.openadsdk.tuV.bg.bg.this.bX.Dxa() != null && !android.text.TextUtils.isEmpty(com.bytedance.sdk.openadsdk.tuV.bg.bg.this.bX.Dxa().Ta())) {
                        if (com.bytedance.sdk.openadsdk.tuV.bg.bg.this.eo != null) {
                            com.bytedance.sdk.openadsdk.tuV.bg.bg.this.eo.eo(str);
                        }
                        java.lang.String strTa = com.bytedance.sdk.openadsdk.core.model.rri.Ta(com.bytedance.sdk.openadsdk.tuV.bg.bg.this.bX);
                        android.webkit.WebResourceResponse webResourceResponseBg = com.bytedance.sdk.openadsdk.core.Ta.bX.bg.bg().bg(com.bytedance.sdk.openadsdk.tuV.bg.bg.this.bX.Dxa().Ta(), strTa, str);
                        if (webResourceResponseBg != null) {
                            java.lang.Object[] objArr = new java.lang.Object[2];
                            if (com.bytedance.sdk.openadsdk.tuV.bg.bg.this.eo != null) {
                                com.bytedance.sdk.openadsdk.tuV.bg.bg.this.eo.VB(str);
                            }
                            return webResourceResponseBg;
                        }
                        java.lang.Object[] objArr2 = new java.lang.Object[2];
                        return super.shouldInterceptRequest(webView, str);
                    }
                    return super.shouldInterceptRequest(webView, str);
                } catch (java.lang.Throwable unused) {
                    return super.shouldInterceptRequest(webView, str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.bg.zx, android.webkit.WebViewClient
            public void onReceivedError(android.webkit.WebView webView, int i, java.lang.String str, java.lang.String str2) {
                super.onReceivedError(webView, i, str, str2);
                com.bytedance.sdk.openadsdk.tuV.bg.bg.this.PX = false;
                if (com.bytedance.sdk.openadsdk.tuV.bg.bg.this.eo != null) {
                    com.bytedance.sdk.openadsdk.tuV.bg.bg.this.eo.ldr(com.bytedance.sdk.openadsdk.core.Ta.bX.bg.bg().bg(com.bytedance.sdk.openadsdk.tuV.bg.bg.this.bX));
                    com.bytedance.sdk.openadsdk.tuV.bg.bg.this.eo.bg(i, str, str2);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.bg.zx, android.webkit.WebViewClient
            public void onReceivedError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceError webResourceError) {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                if (webResourceRequest.isForMainFrame()) {
                    com.bytedance.sdk.openadsdk.tuV.bg.bg.this.PX = false;
                    if (com.bytedance.sdk.openadsdk.tuV.bg.bg.this.eo == null || webResourceError == null || webResourceRequest == null) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.tuV.bg.bg.this.eo.ldr(com.bytedance.sdk.openadsdk.core.Ta.bX.bg.bg().bg(com.bytedance.sdk.openadsdk.tuV.bg.bg.this.bX));
                    com.bytedance.sdk.openadsdk.tuV.bg.bg.this.eo.bg(webResourceError.getErrorCode(), java.lang.String.valueOf(webResourceError.getDescription()), java.lang.String.valueOf(webResourceRequest.getUrl()));
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.bg.zx, android.webkit.WebViewClient
            public void onReceivedHttpError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceResponse webResourceResponse) {
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                if (webResourceRequest.isForMainFrame()) {
                    com.bytedance.sdk.openadsdk.tuV.bg.bg.this.PX = false;
                    if (com.bytedance.sdk.openadsdk.tuV.bg.bg.this.eo != null) {
                        com.bytedance.sdk.openadsdk.tuV.bg.bg.this.eo.ldr(com.bytedance.sdk.openadsdk.core.Ta.bX.bg.bg().bg(com.bytedance.sdk.openadsdk.tuV.bg.bg.this.bX));
                        com.bytedance.sdk.openadsdk.tuV.bg.bg.this.eo.bg(webResourceRequest.isForMainFrame(), webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode());
                    }
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.bg.zx, android.webkit.WebViewClient
            public void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
                super.onPageFinished(webView, str);
                if (com.bytedance.sdk.openadsdk.tuV.bg.bg.this.eo != null) {
                    com.bytedance.sdk.openadsdk.tuV.bg.bg.this.eo.WR(str);
                }
                if (com.bytedance.sdk.openadsdk.tuV.bg.bg.this.PX) {
                    com.bytedance.sdk.openadsdk.tuV.bg.bg.this.bg(0, 0);
                    com.bytedance.sdk.openadsdk.eqN.bX.bg(java.lang.System.currentTimeMillis(), com.bytedance.sdk.openadsdk.tuV.bg.bg.this.bX, com.bytedance.sdk.openadsdk.tuV.bg.bg.this.Kg, "py_loading_success");
                }
            }
        });
        this.bg.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.bg.eqN(this.iR) { // from class: com.bytedance.sdk.openadsdk.tuV.bg.bg.6
            @Override // com.bytedance.sdk.openadsdk.core.widget.bg.eqN, android.webkit.WebChromeClient
            public boolean onConsoleMessage(android.webkit.ConsoleMessage consoleMessage) {
                return super.onConsoleMessage(consoleMessage);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.bg.eqN, android.webkit.WebChromeClient
            public void onProgressChanged(android.webkit.WebView webView, int i) {
                super.onProgressChanged(webView, i);
                if (com.bytedance.sdk.openadsdk.tuV.bg.bg.this.ldr == null || com.bytedance.sdk.openadsdk.tuV.bg.bg.this.ldr.getVisibility() != 0) {
                    return;
                }
                com.bytedance.sdk.openadsdk.tuV.bg.bg.this.ldr.setProgress(i);
            }
        });
        com.bytedance.sdk.openadsdk.core.widget.bg.bX.bg(this.IL).bg(false).IL(false).bg(this.bg.getWebView());
        com.bytedance.sdk.component.WR.eqN eqn = this.bg;
        eqn.setUserAgentString(com.bytedance.sdk.openadsdk.utils.xxp.bg(eqn.getWebView(), com.bytedance.sdk.openadsdk.BuildConfig.VERSION_CODE));
        this.bg.setMixedContentMode(0);
    }

    public void bg(boolean z, com.bytedance.sdk.openadsdk.PX.zx zxVar) {
        this.VB = zxVar;
        this.eo.IL(z);
        com.bytedance.sdk.openadsdk.core.Ta.bX.bg.bg().IL(this.bX);
        this.bg.a_(this.WR);
        com.bytedance.sdk.openadsdk.tuV.Kg kg = this.eo;
        if (kg != null) {
            kg.ldr(com.bytedance.sdk.openadsdk.core.Ta.bX.bg.bg().bg(this.bX));
            this.eo.Kg(this.WR);
        }
    }

    public void bg() {
        boolean z;
        com.bytedance.sdk.openadsdk.core.widget.VB vb;
        if (this.Lq.getAndSet(true)) {
            return;
        }
        android.widget.FrameLayout frameLayout = this.zx;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        if (!this.yDt && (vb = this.ldr) != null) {
            vb.IL(this.bX, this.eqN);
            com.bytedance.sdk.openadsdk.tuV.Kg kg = this.eo;
            if (kg != null) {
                kg.Uq();
            }
            z = true;
        } else {
            this.eo.bX(true);
            z = false;
        }
        if (this.eo != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("webview_state", this.eo.CQc());
                jSONObject2.put("has_loading", z);
                jSONObject2.put("is_new_playable", 1);
                jSONObject.put("pag_json_data", jSONObject2.toString());
                jSONObject.put("playable_event", "start_show_plb");
            } catch (java.lang.Throwable unused) {
            }
            com.bytedance.sdk.openadsdk.eqN.bX.IL(this.bX, this.Kg, "playable_track", jSONObject);
            this.eo.ldr(com.bytedance.sdk.openadsdk.core.Ta.bX.bg.bg().bg(this.bX));
        }
        this.bg.setVisibility(0);
    }

    public void bg(final int i, final int i2) {
        com.bytedance.sdk.openadsdk.tuV.Kg kg;
        com.bytedance.sdk.openadsdk.tuV.bg.bg.InterfaceC0166bg interfaceC0166bg;
        if (this.yDt) {
            return;
        }
        this.yDt = true;
        if (i == 2) {
            this.Ta = true;
            this.eo.bg(3);
        } else if (i == 1) {
            this.Ta = true;
            this.eo.bg(2);
        } else if (i == 3) {
            this.Ta = true;
            this.eo.bg(4);
        } else if (i == 0) {
            this.eo.bg(1);
        }
        if (this.Ta && (interfaceC0166bg = this.VzQ) != null) {
            interfaceC0166bg.bg();
        }
        if (this.Lq.get() && (kg = this.eo) != null) {
            kg.bX(true);
        }
        com.bytedance.sdk.openadsdk.core.widget.VB vb = this.ldr;
        if (vb != null) {
            vb.post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.tuV.bg.bg.7
                @Override // java.lang.Runnable
                public void run() {
                    if (com.bytedance.sdk.openadsdk.tuV.bg.bg.this.Ta) {
                        com.bytedance.sdk.openadsdk.tuV.bg.bg.this.vb.setVisibility(0);
                        com.bytedance.sdk.openadsdk.tuV.bg.bg.this.bg(true);
                    }
                    com.bytedance.sdk.openadsdk.tuV.bg.bg.this.ldr.bX();
                    if (com.bytedance.sdk.openadsdk.tuV.bg.bg.this.Lq.get()) {
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        try {
                            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                            jSONObject2.put("remove_loading_page_type", i);
                            jSONObject2.put("remove_loading_page_reason", i2);
                            jSONObject2.put("playable_url", com.bytedance.sdk.openadsdk.tuV.bg.bg.this.WR);
                            jSONObject2.put("duration", com.bytedance.sdk.openadsdk.tuV.bg.bg.this.ldr.getDisplayDuration());
                            jSONObject2.put("is_new_playable", 1);
                            jSONObject.put("pag_json_data", jSONObject2.toString());
                            jSONObject.put("playable_event", "remove_loading_page");
                        } catch (java.lang.Throwable unused) {
                        }
                        com.bytedance.sdk.openadsdk.eqN.bX.IL(com.bytedance.sdk.openadsdk.tuV.bg.bg.this.bX, com.bytedance.sdk.openadsdk.tuV.bg.bg.this.Kg, "playable_track", jSONObject);
                    }
                }
            });
        }
    }

    public void bg(boolean z) {
        com.bytedance.sdk.openadsdk.tuV.Kg kg = this.eo;
        if (kg != null) {
            kg.bg(z);
        }
    }

    public void IL() {
        com.bytedance.sdk.openadsdk.tuV.Kg kg;
        if (!this.Lq.get() || (kg = this.eo) == null) {
            return;
        }
        kg.bX(true);
    }

    public void bX() {
        com.bytedance.sdk.openadsdk.tuV.Kg kg;
        if (!this.Lq.get() || (kg = this.eo) == null) {
            return;
        }
        kg.bX(false);
    }

    public void eqN() {
        com.bytedance.sdk.openadsdk.tuV.Kg kg = this.eo;
        if (kg != null) {
            kg.ayS();
        }
        com.bytedance.sdk.component.WR.eqN eqn = this.bg;
        if (eqn != null) {
            eqn.PX();
        }
        com.bytedance.sdk.openadsdk.core.aGH agh = this.iR;
        if (agh != null) {
            agh.VB();
        }
        this.bg = null;
    }

    public void bg(com.bytedance.sdk.openadsdk.core.IL.bg bgVar) {
        this.xxp = bgVar;
        com.bytedance.sdk.openadsdk.core.widget.VB vb = this.ldr;
        if (vb != null && vb.getDownloadButton() != null) {
            com.bytedance.sdk.openadsdk.core.zx.Kg downloadButton = this.ldr.getDownloadButton();
            downloadButton.setOnClickListener(bgVar);
            downloadButton.setOnTouchListener(bgVar);
        }
        com.bytedance.sdk.openadsdk.core.widget.eo eoVar = this.vb;
        if (eoVar != null) {
            eoVar.setClickListener(bgVar);
        }
    }

    public boolean zx() {
        return this.Ta;
    }

    public void bg(com.bytedance.sdk.openadsdk.tuV.bg.bg.InterfaceC0166bg interfaceC0166bg) {
        this.VzQ = interfaceC0166bg;
    }

    public boolean ldr() {
        com.bytedance.sdk.openadsdk.core.aGH agh = this.iR;
        if (agh != null) {
            return agh.zx();
        }
        return false;
    }

    public void IL(boolean z) {
        com.bytedance.sdk.openadsdk.tuV.Kg kg = this.eo;
        if (kg != null) {
            kg.zx(z);
        }
    }
}

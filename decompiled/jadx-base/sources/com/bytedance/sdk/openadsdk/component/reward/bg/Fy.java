package com.bytedance.sdk.openadsdk.component.reward.bg;

/* JADX INFO: loaded from: classes4.dex */
public class Fy implements com.bytedance.sdk.openadsdk.PX.iR {
    private final com.bytedance.sdk.openadsdk.core.model.tuV IL;
    private volatile boolean Kg;
    private final com.bytedance.sdk.openadsdk.component.reward.bg.bg WR;
    private com.bytedance.sdk.component.WR.eqN bX;
    private final android.app.Activity bg;
    private int eo;
    private android.widget.ImageView eqN;
    private final java.util.concurrent.atomic.AtomicBoolean iR = new java.util.concurrent.atomic.AtomicBoolean(false);
    private com.bytedance.sdk.openadsdk.core.IL.iR ldr;
    private boolean zx;

    public Fy(com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar) {
        this.WR = bgVar;
        this.IL = bgVar.IL;
        this.bg = bgVar.uu;
    }

    public void bg() {
        com.bytedance.sdk.openadsdk.utils.DeviceUtils.AudioInfoReceiver.bg(this);
        this.eo = com.bytedance.sdk.openadsdk.utils.DeviceUtils.iR();
        if (this.IL.hi() != null) {
            this.ldr = new com.bytedance.sdk.openadsdk.core.IL.iR("VAST_END_CARD", this.IL.hi()) { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.Fy.1
            };
            com.bytedance.sdk.openadsdk.core.PX.bX bXVarBX = this.IL.hi().bX();
            if (bXVarBX != null) {
                java.lang.String strZx = bXVarBX.zx();
                if (!android.text.TextUtils.isEmpty(strZx)) {
                    this.zx = true;
                    this.eqN = (android.widget.ImageView) this.WR.CQc.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.Kg);
                    bg(bXVarBX.IL(), bXVarBX.bX());
                    com.bytedance.sdk.openadsdk.WR.eqN.bg(strZx).bg(bXVarBX.IL()).IL(bXVarBX.bX()).zx(com.bytedance.sdk.openadsdk.utils.ZQc.eqN(com.bytedance.sdk.openadsdk.core.VzQ.bg())).eqN(com.bytedance.sdk.openadsdk.utils.ZQc.bX(com.bytedance.sdk.openadsdk.core.VzQ.bg())).bX(2).bg(new com.bytedance.sdk.openadsdk.WR.IL(this.IL, strZx, new com.bytedance.sdk.openadsdk.component.reward.bg.Fy.bg(this.eqN, strZx, this, this.iR)));
                    return;
                }
                com.bytedance.sdk.component.WR.eqN eqn = (com.bytedance.sdk.component.WR.eqN) this.WR.CQc.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.WR);
                this.bX = eqn;
                if (eqn == null) {
                    return;
                }
                zx();
                java.lang.String strEqN = bXVarBX.eqN();
                if (strEqN != null) {
                    this.zx = true;
                    if (strEqN.startsWith(androidx.webkit.ProxyConfig.MATCH_HTTP)) {
                        this.bX.a_(strEqN);
                        return;
                    }
                    java.lang.String strBg = com.bytedance.sdk.openadsdk.core.PX.zx.bg(strEqN);
                    java.lang.String str = android.text.TextUtils.isEmpty(strBg) ? strEqN : strBg;
                    this.bX.setDefaultTextEncodingName("UTF -8");
                    this.bX.bg(null, str, "text/html", com.adjust.sdk.Constants.ENCODING, null);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void eqN() {
        bg(Integer.MAX_VALUE, (java.lang.String) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(final int i, final java.lang.String str) {
        if (this.Kg) {
            return;
        }
        this.Kg = true;
        final java.lang.String strVB = this.IL.hi() != null ? this.IL.hi().VB() : "";
        if (i == Integer.MAX_VALUE) {
            com.bytedance.sdk.openadsdk.eqN.bX.IL(this.IL, strVB, "load_vast_endcard_success", (org.json.JSONObject) null);
        } else {
            com.bytedance.sdk.openadsdk.eqN.bX.bg(new com.bytedance.sdk.component.Kg.Kg("load_vast_endcard_fail") { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.Fy.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        jSONObject.put("reason_code", i);
                        jSONObject.put("error_code", i);
                        java.lang.String str2 = str;
                        if (str2 != null) {
                            jSONObject.put("url", str2);
                        }
                        com.bytedance.sdk.openadsdk.eqN.bX.IL(com.bytedance.sdk.openadsdk.component.reward.bg.Fy.this.IL, strVB, "load_vast_endcard_fail", jSONObject);
                    } catch (java.lang.Exception unused) {
                    }
                }
            });
        }
    }

    private void zx() {
        this.bX.f_();
        bg(this.bX);
        this.bX.setDisplayZoomControls(false);
        this.bX.setWebChromeClient(new android.webkit.WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.Fy.3
            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(android.webkit.WebView webView, int i) {
                super.onProgressChanged(webView, i);
                if (i == 100) {
                    com.bytedance.sdk.openadsdk.component.reward.bg.Fy.this.eqN();
                }
            }
        });
        this.bX.setWebViewClient(new com.bytedance.sdk.component.WR.eqN.bg() { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.Fy.4
            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
                if (com.bytedance.sdk.openadsdk.component.reward.bg.Fy.this.bg(str)) {
                    return true;
                }
                return super.shouldOverrideUrlLoading(webView, str);
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedHttpError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceResponse webResourceResponse) {
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                if (webResourceRequest.isForMainFrame()) {
                    com.bytedance.sdk.openadsdk.component.reward.bg.Fy.this.bg(webResourceResponse.getStatusCode(), webResourceRequest.getUrl() != null ? webResourceRequest.getUrl().toString() : null);
                }
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
                super.onPageFinished(webView, str);
                com.bytedance.sdk.openadsdk.component.reward.bg.Fy.this.eqN();
            }
        });
    }

    private void bg(com.bytedance.sdk.component.WR.eqN eqn) {
        eqn.setVerticalScrollBarEnabled(false);
        eqn.setHorizontalScrollBarEnabled(false);
        eqn.setMixedContentMode(0);
        eqn.setJavaScriptEnabled(true);
        eqn.setJavaScriptCanOpenWindowsAutomatically(true);
        eqn.setDomStorageEnabled(true);
        eqn.setDatabaseEnabled(true);
        eqn.setAppCacheEnabled(true);
        eqn.setAllowFileAccess(false);
        eqn.setSupportZoom(true);
        eqn.setBuiltInZoomControls(true);
        eqn.setLayoutAlgorithm(android.webkit.WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        eqn.setUseWideViewPort(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean bg(java.lang.String str) {
        com.bytedance.sdk.openadsdk.core.model.tuV tuv;
        if (str == null || (tuv = this.IL) == null || tuv.hi() == null || this.ldr == null) {
            return false;
        }
        this.IL.hi().iR(str);
        this.ldr.onClick(this.bX);
        return true;
    }

    private void bg(int i, int i2) {
        if (i == 0 || i2 == 0 || this.eqN == null) {
            return;
        }
        int iBX = com.bytedance.sdk.openadsdk.utils.ZQc.bX((android.content.Context) this.bg);
        int iEqN = com.bytedance.sdk.openadsdk.utils.ZQc.eqN((android.content.Context) this.bg);
        float f = i / i2;
        float f2 = iBX;
        if (f <= f2 / iEqN) {
            iBX = (int) java.lang.Math.ceil(f2 * f);
        } else {
            iEqN = (int) java.lang.Math.ceil(f2 / f);
        }
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.eqN.getLayoutParams();
        layoutParams.width = iBX;
        layoutParams.height = iEqN;
        layoutParams.gravity = 17;
        this.eqN.setLayoutParams(layoutParams);
        this.eqN.setOnClickListener(this.ldr);
        this.eqN.setOnTouchListener(this.ldr);
    }

    public boolean bg(com.bytedance.sdk.openadsdk.component.reward.bg.VzQ vzQ) {
        com.bytedance.sdk.openadsdk.core.PX.bX bXVarBX;
        if (!this.zx) {
            return false;
        }
        if (this.eqN != null && this.iR.get()) {
            this.eqN.setVisibility(0);
        } else {
            com.bytedance.sdk.component.WR.eqN eqn = this.bX;
            if (eqn != null) {
                eqn.setVisibility(0);
                if (this.bX.getWebView() != null) {
                    this.bX.getWebView().setOnTouchListener(this.ldr);
                }
            }
        }
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.IL;
        if (tuv == null || tuv.hi() == null || (bXVarBX = this.IL.hi().bX()) == null) {
            return true;
        }
        bXVarBX.IL(vzQ != null ? vzQ.iR() : -1L);
        return true;
    }

    public void bg(com.bytedance.sdk.openadsdk.core.IL.zx zxVar) {
        com.bytedance.sdk.openadsdk.core.IL.iR iRVar = this.ldr;
        if (iRVar != null) {
            iRVar.bg(zxVar);
        }
    }

    public void IL() {
        com.bytedance.sdk.openadsdk.utils.DeviceUtils.AudioInfoReceiver.IL(this);
        com.bytedance.sdk.component.WR.eqN eqn = this.bX;
        if (eqn != null) {
            com.bytedance.sdk.openadsdk.core.daV.bg(eqn.getWebView());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.PX.iR
    public void bg(int i) {
        int i2 = this.eo;
        if (i2 == 0 && i > 0) {
            this.IL.hi().bg().WR(this.WR.rri.iR());
        } else if (i2 > 0 && i == 0) {
            this.IL.hi().bg().Kg(this.WR.rri.iR());
        }
        this.eo = i;
    }

    public boolean bX() {
        if (!this.zx) {
            return false;
        }
        android.widget.ImageView imageView = this.eqN;
        if (imageView != null) {
            imageView.performClick();
            return true;
        }
        com.bytedance.sdk.component.WR.eqN eqn = this.bX;
        if (eqn == null) {
            return false;
        }
        this.ldr.onClick(eqn);
        return true;
    }

    private static class bg implements com.bytedance.sdk.component.zx.xxp<android.graphics.Bitmap> {
        private final java.lang.String IL;
        private final java.lang.ref.WeakReference<com.bytedance.sdk.openadsdk.component.reward.bg.Fy> bX;
        private final java.lang.ref.WeakReference<android.widget.ImageView> bg;
        private final java.util.concurrent.atomic.AtomicBoolean eqN;

        public bg(android.widget.ImageView imageView, java.lang.String str, com.bytedance.sdk.openadsdk.component.reward.bg.Fy fy, java.util.concurrent.atomic.AtomicBoolean atomicBoolean) {
            this.bg = new java.lang.ref.WeakReference<>(imageView);
            this.IL = str;
            this.bX = new java.lang.ref.WeakReference<>(fy);
            this.eqN = atomicBoolean;
        }

        @Override // com.bytedance.sdk.component.zx.xxp
        public void bg(com.bytedance.sdk.component.zx.VB<android.graphics.Bitmap> vb) {
            com.bytedance.sdk.openadsdk.component.reward.bg.Fy fy;
            android.widget.ImageView imageView = this.bg.get();
            if (imageView == null || (fy = this.bX.get()) == null || vb == null) {
                return;
            }
            android.graphics.Bitmap bitmapIL = vb.IL();
            if (bitmapIL == null) {
                fy.bg(-1, this.IL);
                return;
            }
            imageView.setImageBitmap(bitmapIL);
            this.eqN.set(true);
            fy.eqN();
        }

        @Override // com.bytedance.sdk.component.zx.xxp
        public void bg(int i, java.lang.String str, java.lang.Throwable th) {
            com.bytedance.sdk.openadsdk.component.reward.bg.Fy fy;
            android.widget.ImageView imageView = this.bg.get();
            if (imageView == null || (fy = this.bX.get()) == null) {
                return;
            }
            imageView.setVisibility(8);
            fy.bg(-2, this.IL);
        }
    }
}

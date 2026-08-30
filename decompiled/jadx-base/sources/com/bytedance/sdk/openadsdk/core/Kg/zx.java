package com.bytedance.sdk.openadsdk.core.Kg;

/* JADX INFO: loaded from: classes4.dex */
public class zx extends com.bytedance.sdk.component.WR.eqN implements com.bytedance.sdk.openadsdk.core.Kg.bX.InterfaceC0134bX {
    protected boolean IL;
    private java.lang.String Kg;
    private int PX;
    private long Ta;
    private com.bytedance.sdk.openadsdk.core.Kg.zx.IL VB;
    private int WR;
    java.util.concurrent.atomic.AtomicBoolean bX;
    protected boolean bg;
    private java.util.List<java.lang.String> eo;
    java.util.concurrent.atomic.AtomicBoolean eqN;
    private com.bytedance.sdk.openadsdk.core.model.tuV iR;
    private com.bytedance.sdk.openadsdk.core.Kg.zx.bX ldr;
    private com.bytedance.sdk.openadsdk.core.Kg.rri zx;

    public interface IL {
        android.view.View IL();

        android.view.View bg();

        void bg(int i, int i2);

        void bg(android.view.View view, int i);

        void e_();
    }

    public zx(android.content.Context context) {
        super(context);
        this.bg = false;
        this.IL = false;
        this.bX = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.eqN = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.WR = 0;
    }

    public void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, com.bytedance.sdk.openadsdk.core.Kg.zx.IL il, java.lang.String str) {
        this.VB = il;
        this.iR = tuv;
        this.Kg = str;
        this.ldr = new com.bytedance.sdk.openadsdk.core.Kg.zx.bX();
        this.zx = new com.bytedance.sdk.openadsdk.core.Kg.rri(getContext());
        setWebViewClient(new com.bytedance.sdk.openadsdk.core.Kg.zx.bg(this));
        setWebChromeClient(new android.webkit.WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.core.Kg.zx.1
            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(android.webkit.WebView webView, int i) {
                com.bytedance.sdk.openadsdk.core.Kg.zx.this.PX = i;
                super.onProgressChanged(webView, i);
                if (i >= 100) {
                    com.bytedance.sdk.openadsdk.core.Kg.zx.this.bg();
                }
            }
        });
        com.bytedance.sdk.component.utils.iR.IL().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.Kg.zx.2
            @Override // java.lang.Runnable
            public void run() {
                android.webkit.WebView webView = com.bytedance.sdk.openadsdk.core.Kg.zx.this.getWebView();
                if (webView != null) {
                    webView.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.Kg.zx.2.1
                        @Override // android.view.View.OnTouchListener
                        public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                            com.bytedance.sdk.openadsdk.core.Kg.zx.this.zx.onTouchEvent(motionEvent);
                            return false;
                        }
                    });
                }
            }
        });
    }

    private void xxp() {
        if (this.eo == null) {
            com.bytedance.sdk.openadsdk.eqN.bX.IL(this.iR, this.Kg, "dsp_html_success_url", (org.json.JSONObject) null);
        } else {
            com.bytedance.sdk.openadsdk.eqN.bX.bg(new com.bytedance.sdk.component.Kg.Kg("dsp_html_error_url") { // from class: com.bytedance.sdk.openadsdk.core.Kg.zx.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (com.bytedance.sdk.openadsdk.core.Kg.zx.this.eo != null && com.bytedance.sdk.openadsdk.core.Kg.zx.this.eqN.compareAndSet(false, true)) {
                            org.json.JSONObject jSONObject = new org.json.JSONObject();
                            org.json.JSONArray jSONArray = new org.json.JSONArray();
                            java.util.Iterator it = com.bytedance.sdk.openadsdk.core.Kg.zx.this.eo.iterator();
                            while (it.hasNext()) {
                                jSONArray.put((java.lang.String) it.next());
                            }
                            jSONObject.put("url", jSONArray);
                            com.bytedance.sdk.openadsdk.eqN.bX.IL(com.bytedance.sdk.openadsdk.core.Kg.zx.this.iR, com.bytedance.sdk.openadsdk.core.Kg.zx.this.Kg, "dsp_html_error_url", jSONObject);
                            com.bytedance.sdk.openadsdk.core.Kg.zx.this.eo = null;
                        }
                    } catch (java.lang.Exception unused) {
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.component.WR.eqN
    public void PX() {
        this.ldr.IL();
        super.PX();
    }

    public void bg(android.view.View view, com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose friendlyObstructionPurpose) {
        this.ldr.bg(view, friendlyObstructionPurpose);
    }

    @Override // com.bytedance.sdk.component.WR.eqN, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.bg) {
            this.ldr.bg(getWebView());
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(android.view.View view, int i) {
        super.onVisibilityChanged(view, i);
        boolean z = i == 0;
        this.IL = z;
        this.ldr.bg(z);
    }

    @Override // com.bytedance.sdk.component.WR.eqN, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.ldr.bg();
        super.onDetachedFromWindow();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("rate", this.PX / 100.0f);
        } catch (java.lang.Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.eqN.bX.IL(this.iR, this.Kg, "load_rate", jSONObject);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:41:0x00df  */
    /* JADX WARN: Code duplicated, block: B:44:0x0108  */
    /* JADX WARN: Code duplicated, block: B:45:0x010b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0116  */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    @Override // com.bytedance.sdk.openadsdk.core.Kg.bX.InterfaceC0134bX
    public void bg(java.lang.String str) {
        java.lang.String str2;
        boolean zBg;
        java.lang.String str3;
        com.bytedance.sdk.openadsdk.core.Kg.rri rriVar;
        com.bytedance.sdk.openadsdk.core.Kg.zx.IL il;
        android.view.View view;
        int i;
        if (android.text.TextUtils.isEmpty(str) || this.iR == null || !this.zx.IL()) {
            return;
        }
        int iBg = com.bytedance.sdk.openadsdk.utils.ayS.bg(this.Kg);
        android.view.View view2 = null;
        if (com.bytedance.sdk.component.utils.Lq.bg(str) || !(this.iR.Dt() == null || android.text.TextUtils.isEmpty(this.iR.Dt().bg()))) {
            str2 = str;
        } else {
            com.bytedance.sdk.openadsdk.core.model.VB vb = new com.bytedance.sdk.openadsdk.core.model.VB();
            vb.bg(str);
            this.iR.bg(vb);
            str2 = null;
        }
        this.iR.bg(true);
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.iR;
        if (tuv != null && tuv.Dt() != null && !android.text.TextUtils.isEmpty(this.iR.Dt().bg())) {
            zBg = com.bytedance.sdk.openadsdk.core.VJ.bg(getContext(), this.iR, iBg, this.Kg, true, (java.util.Map<java.lang.String, java.lang.Object>) null);
            if (!zBg && !android.text.TextUtils.isEmpty(this.iR.Dt().IL())) {
                java.lang.String strIL = this.iR.Dt().IL();
                com.bytedance.sdk.openadsdk.eqN.bX.bg(this.iR, this.Kg, "open_fallback_url", (java.util.Map<java.lang.String, java.lang.Object>) null);
                str3 = strIL;
            }
            if (!zBg) {
                if (!android.text.TextUtils.isEmpty(str3)) {
                    return;
                } else {
                    com.bytedance.sdk.openadsdk.core.VJ.bg(getContext(), this.iR, iBg, (com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd) null, (com.bytedance.sdk.openadsdk.api.PangleAd) null, this.Kg, true, str3);
                }
            }
            if (this.zx != null) {
                il = this.VB;
                if (il != null) {
                    android.view.View viewBg = il.bg();
                    android.view.View viewIL = this.VB.IL();
                    this.VB.bg(this, 2);
                    view2 = viewIL;
                    view = viewBg;
                } else {
                    view = null;
                }
                com.bytedance.sdk.openadsdk.core.model.eo eoVarBg = this.zx.bg(getContext(), view2, view);
                java.util.HashMap map = new java.util.HashMap();
                map.put("click_scence", 1);
                com.bytedance.sdk.openadsdk.core.model.tuV tuv2 = this.iR;
                java.lang.String str4 = this.Kg;
                if (this.zx.IL()) {
                    i = 1;
                } else {
                    i = 2;
                }
                com.bytedance.sdk.openadsdk.eqN.bX.bg(com.json.z8.CLICK, tuv2, eoVarBg, str4, true, (java.util.Map<java.lang.String, java.lang.Object>) map, i);
            }
            rriVar = this.zx;
            if (rriVar != null) {
                rriVar.bg();
            }
        }
        zBg = false;
        str3 = str2;
        if (!zBg) {
            if (!android.text.TextUtils.isEmpty(str3)) {
                return;
            } else {
                com.bytedance.sdk.openadsdk.core.VJ.bg(getContext(), this.iR, iBg, (com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd) null, (com.bytedance.sdk.openadsdk.api.PangleAd) null, this.Kg, true, str3);
            }
        }
        if (this.zx != null) {
            il = this.VB;
            if (il != null) {
                android.view.View viewBg2 = il.bg();
                android.view.View viewIL2 = this.VB.IL();
                this.VB.bg(this, 2);
                view2 = viewIL2;
                view = viewBg2;
            } else {
                view = null;
            }
            com.bytedance.sdk.openadsdk.core.model.eo eoVarBg2 = this.zx.bg(getContext(), view2, view);
            java.util.HashMap map2 = new java.util.HashMap();
            map2.put("click_scence", 1);
            com.bytedance.sdk.openadsdk.core.model.tuV tuv3 = this.iR;
            java.lang.String str5 = this.Kg;
            if (this.zx.IL()) {
                i = 1;
            } else {
                i = 2;
            }
            com.bytedance.sdk.openadsdk.eqN.bX.bg(com.json.z8.CLICK, tuv3, eoVarBg2, str5, true, (java.util.Map<java.lang.String, java.lang.Object>) map2, i);
        }
        rriVar = this.zx;
        if (rriVar != null) {
            rriVar.bg();
        }
    }

    public void Lq() {
        com.bytedance.sdk.openadsdk.core.Kg.zx.IL il = this.VB;
        if (il != null) {
            il.e_();
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("render_duration", android.os.SystemClock.elapsedRealtime() - this.Ta);
        } catch (java.lang.Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.eqN.bX.IL(this.iR, this.Kg, "render_html_success", jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.core.Kg.bX.InterfaceC0134bX
    public void bg(int i, int i2) {
        com.bytedance.sdk.openadsdk.core.Kg.zx.IL il = this.VB;
        if (il != null) {
            il.bg(i, i2);
        }
        this.WR = i2;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("error_code", i2);
            jSONObject.put("render_duration", android.os.SystemClock.elapsedRealtime() - this.Ta);
        } catch (java.lang.Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.eqN.bX.IL(this.iR, this.Kg, "render_html_fail", jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.core.Kg.bX.InterfaceC0134bX
    public void IL(java.lang.String str) {
        if (this.eo == null) {
            this.eo = new java.util.ArrayList();
        }
        this.eo.add(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.Kg.bX.InterfaceC0134bX
    public void bg() {
        if (this.bX.compareAndSet(false, true)) {
            this.bg = true;
            this.ldr.bg(getWebView());
            this.ldr.bg(this.IL);
            Lq();
            xxp();
        }
    }

    public void vb() {
        this.bX.set(false);
        java.lang.String strRgo = this.iR.rgo();
        if (android.text.TextUtils.isEmpty(strRgo)) {
            return;
        }
        java.lang.String strBg = com.bytedance.sdk.openadsdk.core.PX.zx.bg(strRgo);
        java.lang.String str = android.text.TextUtils.isEmpty(strBg) ? strRgo : strBg;
        this.WR = 0;
        bg(null, str, "text/html", com.adjust.sdk.Constants.ENCODING, null);
        this.Ta = android.os.SystemClock.elapsedRealtime();
    }

    static class bg extends com.bytedance.sdk.component.WR.eqN.bg {
        public static final java.util.Set<java.lang.String> bg = new java.util.HashSet<java.lang.String>() { // from class: com.bytedance.sdk.openadsdk.core.Kg.zx.bg.1
            {
                add(".jpeg");
                add(".png");
                add(".bmp");
                add(".gif");
                add(".jpg");
                add(".webp");
            }
        };
        com.bytedance.sdk.openadsdk.core.Kg.bX.InterfaceC0134bX IL;

        public bg(com.bytedance.sdk.openadsdk.core.Kg.bX.InterfaceC0134bX interfaceC0134bX) {
            this.IL = interfaceC0134bX;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
            this.IL.bg(str);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            if (webResourceRequest == null || webResourceResponse == null || webResourceRequest.getUrl() == null) {
                return;
            }
            if (webResourceRequest.isForMainFrame()) {
                bg(webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode(), "");
            }
            bg(webResourceRequest.getUrl().toString());
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(android.webkit.WebView webView, int i, java.lang.String str, java.lang.String str2) {
            super.onReceivedError(webView, i, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
                return;
            }
            bg(webResourceRequest.getUrl().toString());
        }

        private void bg(java.lang.String str) {
            int iLastIndexOf;
            com.bytedance.sdk.openadsdk.core.Kg.bX.InterfaceC0134bX interfaceC0134bX;
            if (!android.text.TextUtils.isEmpty(str) && (iLastIndexOf = str.lastIndexOf(".")) > 0) {
                if (!bg.contains(str.substring(iLastIndexOf).toLowerCase()) || (interfaceC0134bX = this.IL) == null) {
                    return;
                }
                interfaceC0134bX.IL(str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
            super.onPageFinished(webView, str);
            com.bytedance.sdk.openadsdk.core.Kg.bX.InterfaceC0134bX interfaceC0134bX = this.IL;
            if (interfaceC0134bX != null) {
                interfaceC0134bX.bg();
            }
        }

        private void bg(java.lang.String str, int i, java.lang.String str2) {
            com.bytedance.sdk.openadsdk.core.Kg.bX.InterfaceC0134bX interfaceC0134bX = this.IL;
            if (interfaceC0134bX != null) {
                interfaceC0134bX.bg(106, i);
            }
        }
    }

    public static class bX {
        protected int bg = 0;
        private com.bytedance.sdk.openadsdk.core.PX.ldr IL = com.bytedance.sdk.openadsdk.core.PX.ldr.bg();

        bX() {
        }

        public void bg(android.webkit.WebView webView) {
            if (webView != null && this.bg == 0) {
                if (this.IL == null) {
                    this.IL = com.bytedance.sdk.openadsdk.core.PX.ldr.bg();
                }
                this.IL.bg(webView);
                this.IL.IL();
                this.bg = 1;
            }
        }

        public void bg(boolean z) {
            com.bytedance.sdk.openadsdk.core.PX.ldr ldrVar;
            if (this.bg == 1 && z && (ldrVar = this.IL) != null) {
                ldrVar.bX();
                this.bg = 3;
            }
        }

        public void bg(android.view.View view, com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose friendlyObstructionPurpose) {
            com.bytedance.sdk.openadsdk.core.PX.ldr ldrVar = this.IL;
            if (ldrVar != null) {
                ldrVar.bg(view, friendlyObstructionPurpose);
            }
        }

        public void bg() {
            com.bytedance.sdk.openadsdk.core.PX.ldr ldrVar;
            int i = this.bg;
            if (i != 0 && i != 4 && (ldrVar = this.IL) != null) {
                ldrVar.eqN();
            }
            this.bg = 4;
            this.IL = null;
        }

        public void IL() {
            bg();
        }
    }
}

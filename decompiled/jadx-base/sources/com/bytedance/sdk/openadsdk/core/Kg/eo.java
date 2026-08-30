package com.bytedance.sdk.openadsdk.core.Kg;

/* JADX INFO: loaded from: classes4.dex */
public class eo extends com.bytedance.sdk.openadsdk.core.widget.bg.zx {
    private final com.bytedance.sdk.openadsdk.core.model.tuV IL;
    public java.util.ArrayList<java.lang.Integer> bg;
    private com.bytedance.sdk.component.adexpress.IL.Ta eo;

    public eo(android.content.Context context, com.bytedance.sdk.openadsdk.core.aGH agh, com.bytedance.sdk.openadsdk.core.model.tuV tuv, com.bytedance.sdk.openadsdk.eqN.VB vb, com.bytedance.sdk.component.adexpress.IL.Ta ta) {
        super(context, agh, tuv.Ys(), vb, false);
        this.bg = new java.util.ArrayList<>();
        this.IL = tuv;
        this.eo = ta;
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.bg.zx, android.webkit.WebViewClient
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
        try {
            return shouldInterceptRequest(webView, webResourceRequest.getUrl().toString());
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("ExpressClient", "shouldInterceptRequest error1", th);
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
    }

    public int bg() {
        for (java.lang.Integer num : this.bg) {
            if (num.intValue() == 3 || num.intValue() == 2 || num.intValue() == -1) {
                return num.intValue();
            }
        }
        return android.text.TextUtils.isEmpty(bX()) ? -1 : 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.bg.zx, android.webkit.WebViewClient
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, java.lang.String str) {
        try {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            com.bytedance.sdk.component.adexpress.bg.IL.bg bgVarBg = bg(webView, str);
            bg(jCurrentTimeMillis, java.lang.System.currentTimeMillis(), str, (bgVarBg == null || bgVarBg.bg() == null) ? 2 : 1);
            if (bgVarBg != null && bgVarBg.IL() != 5) {
                bgVarBg.IL();
                this.bg.add(java.lang.Integer.valueOf(bgVarBg.IL()));
            }
            if (bgVarBg != null && bgVarBg.bg() != null) {
                java.lang.Object[] objArr = new java.lang.Object[2];
                return bgVarBg.bg();
            }
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("ExpressClient", "shouldInterceptRequest error2", th);
        }
        return super.shouldInterceptRequest(webView, str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.bg.zx, android.webkit.WebViewClient
    public void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
        this.iR = false;
        super.onPageFinished(webView, str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.bg.zx, android.webkit.WebViewClient
    public void onPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
        this.Kg = false;
        super.onPageStarted(webView, str, bitmap);
    }

    private com.bytedance.sdk.component.adexpress.bg.IL.bg bg(android.webkit.WebView webView, java.lang.String str) {
        com.bytedance.sdk.openadsdk.core.model.Lq lq = null;
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        java.lang.Object[] objArr = new java.lang.Object[2];
        if (str.equals("local://pag_open_icon_id") || str.equals(com.bytedance.sdk.openadsdk.core.Kg.bg.IL.bg)) {
            com.bytedance.sdk.component.adexpress.bg.IL.bg bgVar = new com.bytedance.sdk.component.adexpress.bg.IL.bg();
            bgVar.bg(5);
            bgVar.bg(eqN());
            return bgVar;
        }
        com.bytedance.sdk.openadsdk.core.model.tuV.bg bgVarLKE = this.IL.LKE();
        if (bgVarLKE != null && !android.text.TextUtils.isEmpty(str) && str.equals(bgVarLKE.eqN())) {
            com.bytedance.sdk.component.adexpress.bg.IL.bg bgVar2 = new com.bytedance.sdk.component.adexpress.bg.IL.bg();
            bgVar2.bg(5);
            android.webkit.WebResourceResponse webResourceResponseZx = zx(str);
            bgVar2.bg(webResourceResponseZx);
            boolean z = webResourceResponseZx != null;
            java.lang.Object[] objArr2 = new java.lang.Object[2];
            java.lang.Boolean.valueOf(z);
            com.bytedance.sdk.openadsdk.core.eqN.bg.bg().bg(z);
            return bgVar2;
        }
        com.bytedance.sdk.component.adexpress.eqN.eo.bg bgVarBg = com.bytedance.sdk.component.adexpress.eqN.eo.bg(str);
        if (bgVarBg != com.bytedance.sdk.component.adexpress.eqN.eo.bg.IMAGE) {
            for (com.bytedance.sdk.openadsdk.core.model.Lq lq2 : this.IL.lM()) {
                if (!android.text.TextUtils.isEmpty(lq2.bg()) && !android.text.TextUtils.isEmpty(str)) {
                    java.lang.String strBg = lq2.bg();
                    if (strBg.startsWith("https")) {
                        strBg = strBg.replaceFirst("https", androidx.webkit.ProxyConfig.MATCH_HTTP);
                    }
                    if ((str.startsWith("https") ? str.replaceFirst("https", androidx.webkit.ProxyConfig.MATCH_HTTP) : str).equals(strBg)) {
                        lq = lq2;
                        break;
                    }
                }
            }
        }
        if (bgVarBg == com.bytedance.sdk.component.adexpress.eqN.eo.bg.IMAGE || lq != null) {
            com.bytedance.sdk.component.adexpress.bg.IL.bg bgVar3 = new com.bytedance.sdk.component.adexpress.bg.IL.bg();
            bgVar3.bg(5);
            bgVar3.bg(bg(str, com.bytedance.sdk.openadsdk.core.Kg.bg.IL.bg(this.IL, str)));
            return bgVar3;
        }
        return com.bytedance.sdk.component.adexpress.bg.IL.IL.bg(str, bgVarBg, "", bX());
    }

    private java.lang.String bX() {
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.IL;
        if (tuv == null) {
            return null;
        }
        if (tuv.LKE() != null) {
            return this.IL.LKE().Ta();
        }
        if (this.IL.uu() != null) {
            return "v3";
        }
        return null;
    }

    private android.webkit.WebResourceResponse eqN() {
        java.io.InputStream inputStreamOpenRawResource;
        int iIR = com.bytedance.sdk.openadsdk.core.WR.IL().iR();
        if (iIR == 0) {
            return null;
        }
        android.content.res.Resources resources = com.bytedance.sdk.openadsdk.core.VzQ.bg().getResources();
        if (resources != null) {
            try {
                inputStreamOpenRawResource = resources.openRawResource(iIR);
            } catch (android.content.res.Resources.NotFoundException e) {
                com.bytedance.sdk.component.utils.PX.bg("ExpressClient", e.toString());
                inputStreamOpenRawResource = null;
            }
        } else {
            inputStreamOpenRawResource = null;
        }
        if (inputStreamOpenRawResource != null) {
            return new android.webkit.WebResourceResponse(com.bytedance.sdk.component.adexpress.eqN.eo.bg.IMAGE.bg(), com.adjust.sdk.Constants.ENCODING, inputStreamOpenRawResource);
        }
        return null;
    }

    private android.webkit.WebResourceResponse zx(java.lang.String str) {
        java.io.InputStream inputStreamBg;
        if (android.text.TextUtils.isEmpty(str) || (inputStreamBg = com.bytedance.sdk.openadsdk.core.eqN.bg.bg().bg(str)) == null) {
            return null;
        }
        android.webkit.WebResourceResponse webResourceResponse = new android.webkit.WebResourceResponse("audio/*", com.adjust.sdk.Constants.ENCODING, inputStreamBg);
        bg(webResourceResponse);
        return webResourceResponse;
    }

    private android.webkit.WebResourceResponse bg(java.lang.String str, java.lang.String str2) {
        android.webkit.WebResourceResponse webResourceResponse = null;
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            java.io.InputStream inputStreamBg = com.bytedance.sdk.openadsdk.WR.eqN.bg(str, str2);
            if (inputStreamBg == null) {
                return null;
            }
            android.webkit.WebResourceResponse webResourceResponse2 = new android.webkit.WebResourceResponse(com.bytedance.sdk.component.adexpress.eqN.eo.bg.IMAGE.bg(), com.json.zb.N, inputStreamBg);
            try {
                bg(webResourceResponse2);
                return webResourceResponse2;
            } catch (java.lang.Throwable th) {
                th = th;
                webResourceResponse = webResourceResponse2;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
        com.bytedance.sdk.component.utils.PX.bg("ExpressClient", "get image WebResourceResponse error", th);
        return webResourceResponse;
    }

    private void bg(long j, long j2, java.lang.String str, int i) {
        if (this.ldr == null || this.ldr.IL() == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.eqN.eo.bg bgVarBg = com.bytedance.sdk.component.adexpress.eqN.eo.bg(str);
        if (bgVarBg == com.bytedance.sdk.component.adexpress.eqN.eo.bg.HTML) {
            this.ldr.IL().bg(str, j, j2, i);
        } else if (bgVarBg == com.bytedance.sdk.component.adexpress.eqN.eo.bg.JS) {
            this.ldr.IL().IL(str, j, j2, i);
        }
    }

    private void bg(android.webkit.WebResourceResponse webResourceResponse) {
        if (webResourceResponse == null) {
            return;
        }
        java.util.HashMap map = new java.util.HashMap();
        map.put(com.google.common.net.HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, androidx.webkit.ProxyConfig.MATCH_ALL_SCHEMES);
        webResourceResponse.setResponseHeaders(map);
    }
}

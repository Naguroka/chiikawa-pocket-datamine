package com.bytedance.sdk.openadsdk.core.widget.bg;

/* JADX INFO: loaded from: classes4.dex */
public class zx extends com.bytedance.sdk.component.WR.eqN.bg {
    private static final java.util.HashSet<java.lang.String> VzQ;
    private java.lang.String IL;
    protected boolean Kg;
    private final java.util.Stack<java.lang.String> Lq;
    private boolean PX;
    private com.bytedance.sdk.openadsdk.common.eqN Ta;
    private java.util.Map<java.lang.String, java.lang.Object> VB;
    protected boolean WR;
    protected final com.bytedance.sdk.openadsdk.core.aGH bX;
    private final boolean bg;
    private com.bytedance.sdk.openadsdk.core.model.eo eo;
    protected final android.content.Context eqN;
    protected boolean iR;
    protected com.bytedance.sdk.openadsdk.eqN.VB ldr;
    private org.json.JSONObject vb;
    private com.bytedance.sdk.openadsdk.core.model.tuV xxp;
    private java.lang.String yDt;
    protected final java.lang.String zx;

    public void bg(com.bytedance.sdk.openadsdk.core.model.eo eoVar) {
        this.eo = eoVar;
    }

    public void bg(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.VB = map;
    }

    public void bg(org.json.JSONObject jSONObject) {
        this.vb = jSONObject;
    }

    public void bg(java.lang.String str) {
        this.IL = str;
    }

    public void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        this.xxp = tuv;
    }

    public zx(android.content.Context context, com.bytedance.sdk.openadsdk.core.aGH agh, java.lang.String str, com.bytedance.sdk.openadsdk.common.eqN eqn, com.bytedance.sdk.openadsdk.eqN.VB vb, boolean z) {
        this(context, agh, str, vb, z);
        this.Ta = eqn;
    }

    public zx(android.content.Context context, com.bytedance.sdk.openadsdk.core.aGH agh, java.lang.String str, com.bytedance.sdk.openadsdk.eqN.VB vb, boolean z) {
        this.iR = true;
        this.Kg = true;
        this.WR = false;
        this.eqN = context;
        this.bX = agh;
        this.zx = str;
        this.ldr = vb;
        this.bg = z;
        this.Lq = new java.util.Stack<>();
    }

    @Override // android.webkit.WebViewClient
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, java.lang.String str) {
        com.bytedance.sdk.openadsdk.eqN.VB vb = this.ldr;
        if (vb != null) {
            vb.IL(webView, str, this.bg);
        }
        com.bytedance.sdk.openadsdk.common.eqN eqn = this.Ta;
        if (eqn != null) {
            eqn.bg(webView, str);
        }
        return super.shouldInterceptRequest(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(android.webkit.WebView webView, java.lang.String str) {
        super.onLoadResource(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
        com.bytedance.sdk.openadsdk.eqN.VB vb = this.ldr;
        if (vb != null) {
            vb.bg(str, this.bg);
        }
        com.bytedance.sdk.openadsdk.common.eqN eqn = this.Ta;
        if (eqn != null) {
            eqn.bg(webView, str, this.bg);
        }
        if (bg(webView, str)) {
            return true;
        }
        try {
            android.net.Uri uri = android.net.Uri.parse(str);
            java.lang.String lowerCase = uri.getScheme().toLowerCase();
            if ("bytedance".equals(lowerCase)) {
                com.bytedance.sdk.openadsdk.utils.xxp.bg(uri, this.bX);
                return true;
            }
            if (bX(str)) {
                return true;
            }
            if (!com.bytedance.sdk.component.utils.Lq.bg(str)) {
                if (com.bytedance.sdk.openadsdk.core.model.xxp.iR(this.xxp)) {
                    bg(lowerCase, str);
                    return true;
                }
                try {
                    android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
                    intent.setData(uri);
                    intent.addFlags(268435456);
                    com.bytedance.sdk.component.utils.IL.bg(this.eqN, intent, null);
                } catch (java.lang.Throwable unused) {
                }
                return true;
            }
            return super.shouldOverrideUrlLoading(webView, str);
        } catch (java.lang.Throwable unused2) {
            com.bytedance.sdk.openadsdk.core.aGH agh = this.bX;
            if (agh != null && agh.eqN()) {
                return true;
            }
        }
    }

    private void bg(java.lang.String str, java.lang.String str2) {
        if ((zx(str) || "market".equals(str)) && ((this.eo != null || this.vb != null) && IL(str2))) {
            IL();
        }
        this.eo = null;
        this.vb = null;
    }

    public boolean IL(java.lang.String str) {
        java.lang.String strBX;
        java.lang.String strBg;
        if (this.eqN == null) {
            return false;
        }
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.xxp;
        if (tuv == null || tuv.RiO() == null) {
            strBX = "";
            strBg = "";
        } else {
            strBX = this.xxp.RiO().bX();
            strBg = this.xxp.RiO().bg();
        }
        if (!com.bytedance.sdk.openadsdk.VzQ.bg.bg.bX.bg()) {
            return com.bytedance.sdk.openadsdk.VzQ.bg.bg.bg.bg(str, this.eqN, this.IL, this.xxp, (java.util.Map<java.lang.String, java.lang.Object>) null) || com.bytedance.sdk.openadsdk.VzQ.bg.bg.bg.bg(this.xxp, strBX, this.eqN, this.IL, (java.util.Map<java.lang.String, java.lang.Object>) null) || com.bytedance.sdk.openadsdk.VzQ.bg.bg.eqN.bg(this.eqN, strBg, strBX, this.IL, this.xxp);
        }
        android.content.Context context = this.eqN;
        com.bytedance.sdk.openadsdk.core.model.tuV tuv2 = this.xxp;
        return com.bytedance.sdk.openadsdk.VzQ.bg.bg.bX.bg(context, str, tuv2, com.bytedance.sdk.openadsdk.utils.ayS.IL(tuv2), null, true) || com.bytedance.sdk.openadsdk.VzQ.bg.bg.zx.bg(this.xxp, strBX, this.eqN, this.IL, (java.util.Map<java.lang.String, java.lang.Object>) null) || com.bytedance.sdk.openadsdk.VzQ.bg.bg.zx.bg(this.eqN, strBg, strBX, this.IL, this.xxp);
    }

    private boolean zx(java.lang.String str) {
        if (com.bytedance.sdk.openadsdk.core.model.xxp.iR(this.xxp)) {
            return android.text.TextUtils.equals(this.xxp.Gih(), str);
        }
        return false;
    }

    public void IL() {
        if (android.text.TextUtils.isEmpty(this.IL) || !com.bytedance.sdk.openadsdk.core.model.xxp.ldr(this.xxp) || this.PX) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.eo eoVar = this.eo;
        if (eoVar != null) {
            com.bytedance.sdk.openadsdk.eqN.bX.bg(com.json.z8.CLICK, this.xxp, eoVar, this.IL, true, this.VB, 1);
            this.PX = true;
            return;
        }
        org.json.JSONObject jSONObject = this.vb;
        if (jSONObject != null) {
            com.bytedance.sdk.openadsdk.eqN.bX.bg(this.xxp, this.IL, com.json.z8.CLICK, jSONObject);
            this.PX = true;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
        com.bytedance.sdk.openadsdk.eqN.VB vb = this.ldr;
        if (vb != null) {
            vb.bg(webView, str, this.bg);
        }
        com.bytedance.sdk.openadsdk.common.eqN eqn = this.Ta;
        if (eqn != null) {
            eqn.IL(webView, str, this.bg);
        }
        super.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
        com.bytedance.sdk.openadsdk.core.model.tuV tuv;
        super.onPageStarted(webView, str, bitmap);
        com.bytedance.sdk.openadsdk.core.model.tuV tuv2 = this.xxp;
        int iBg = (tuv2 != null && tuv2.RJ() && com.bytedance.sdk.openadsdk.Fy.bg.bg("opt_web_index", false)) ? com.bytedance.sdk.openadsdk.utils.ayS.bg(webView) : -1;
        java.lang.Object[] objArr = new java.lang.Object[2];
        java.lang.Integer.valueOf(iBg);
        com.bytedance.sdk.openadsdk.eqN.VB vb = this.ldr;
        if (vb != null) {
            vb.bg(webView, str, bitmap, this.bg, iBg);
        }
        com.bytedance.sdk.openadsdk.common.eqN eqn = this.Ta;
        if (eqn != null) {
            eqn.bX(webView, str, this.bg);
        }
        if (this.bg && (tuv = this.xxp) != null && tuv.RJ() && this.xxp.eo().IL() >= 2) {
            if (!android.text.TextUtils.isEmpty(str) && !str.equals(this.yDt)) {
                if (this.Lq.contains(str)) {
                    while (!str.equals(this.Lq.peek())) {
                        this.Lq.pop();
                    }
                } else {
                    this.Lq.push(str);
                }
            }
            this.yDt = str;
        }
        java.lang.Object[] objArr2 = new java.lang.Object[4];
        java.lang.Boolean.valueOf(this.Kg);
        java.lang.Boolean.valueOf(this.WR);
        if (!this.Kg || this.WR) {
            return;
        }
        this.WR = true;
        com.bytedance.sdk.openadsdk.core.widget.bg.bX.bg(this.eqN).bg(true).IL(webView.getSettings().getBuiltInZoomControls()).bg(webView);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(android.webkit.WebView webView, int i, java.lang.String str, java.lang.String str2) {
        super.onReceivedError(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (this.ldr == null || webResourceError == null) {
            return;
        }
        android.net.Uri url = webResourceRequest.getUrl();
        java.lang.String string = url != null ? url.toString() : "";
        java.util.Map<java.lang.String, java.lang.String> requestHeaders = webResourceRequest.getRequestHeaders();
        this.ldr.bg(webView, webResourceError.getErrorCode(), java.lang.String.valueOf(webResourceError.getDescription()), string, requestHeaders.containsKey("accept") ? requestHeaders.get("accept") : "", webResourceRequest != null && webResourceRequest.isForMainFrame());
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (this.ldr == null || webResourceResponse == null) {
            return;
        }
        android.net.Uri url = webResourceRequest.getUrl();
        java.lang.String string = url != null ? url.toString() : "";
        java.util.Map<java.lang.String, java.lang.String> requestHeaders = webResourceRequest.getRequestHeaders();
        this.ldr.bg(webView, webResourceResponse.getStatusCode(), java.lang.String.valueOf(webResourceResponse.getReasonPhrase()), string, requestHeaders.containsKey("accept") ? requestHeaders.get("accept") : "", webResourceRequest != null && webResourceRequest.isForMainFrame());
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(android.webkit.WebView webView, android.webkit.SslErrorHandler sslErrorHandler, android.net.http.SslError sslError) {
        if (sslErrorHandler != null) {
            try {
                sslErrorHandler.cancel();
            } catch (java.lang.Throwable unused) {
            }
        }
        if (this.ldr != null) {
            int primaryError = 0;
            java.lang.String strConcat = "SslError: unknown";
            java.lang.String url = null;
            if (sslError != null) {
                try {
                    primaryError = sslError.getPrimaryError();
                    strConcat = "SslError: ".concat(java.lang.String.valueOf(sslError));
                    url = sslError.getUrl();
                } catch (java.lang.Throwable unused2) {
                }
            }
            java.lang.String str = url;
            this.ldr.bg(webView, primaryError, strConcat, str, eqN(str), true);
        }
    }

    public boolean bX(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            android.net.Uri uri = android.net.Uri.parse(str);
            if ("play.google.com".equals(uri.getHost())) {
                if (com.bytedance.sdk.openadsdk.core.model.xxp.iR(this.xxp) && this.vb == null && this.eo == null) {
                    return true;
                }
                android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
                if (!(this.eqN instanceof android.app.Activity)) {
                    intent.addFlags(268435456);
                }
                intent.setData(uri);
                intent.setPackage("com.android.vending");
                this.eqN.startActivity(intent);
                IL();
                this.vb = null;
                this.eo = null;
                return true;
            }
        } catch (java.lang.Throwable unused) {
        }
        return false;
    }

    static {
        java.util.HashSet<java.lang.String> hashSet = new java.util.HashSet<>();
        VzQ = hashSet;
        hashSet.add("png");
        hashSet.add("ico");
        hashSet.add("jpg");
        hashSet.add("gif");
        hashSet.add("svg");
        hashSet.add("jpeg");
    }

    protected static java.lang.String eqN(java.lang.String str) {
        int iLastIndexOf;
        java.lang.String strSubstring;
        if (str == null || (iLastIndexOf = str.lastIndexOf(46)) < 0 || iLastIndexOf == str.length() - 1 || (strSubstring = str.substring(iLastIndexOf)) == null || !VzQ.contains(strSubstring.toLowerCase(java.util.Locale.getDefault()))) {
            return null;
        }
        return "image/".concat(java.lang.String.valueOf(strSubstring));
    }

    private boolean bg(android.webkit.WebView webView, java.lang.String str) {
        if (!com.bytedance.sdk.openadsdk.utils.ayS.eqN(this.xxp) || this.xxp.eo() == null || webView == null) {
            return false;
        }
        int iIL = this.xxp.eo().IL();
        int size = this.Lq.size();
        java.lang.Object[] objArr = new java.lang.Object[4];
        java.lang.Integer.valueOf(iIL);
        java.lang.Integer.valueOf(size);
        if (size + 1 != iIL) {
            return false;
        }
        com.bytedance.sdk.openadsdk.utils.Fy.bg(this.eqN, str, this.xxp, com.bytedance.sdk.openadsdk.eqN.IL.bg.eqN);
        return true;
    }

    @Override // com.bytedance.sdk.component.WR.eqN.bg, android.webkit.WebViewClient
    public boolean onRenderProcessGone(android.webkit.WebView webView, android.webkit.RenderProcessGoneDetail renderProcessGoneDetail) {
        try {
            com.bytedance.sdk.component.adexpress.zx.zx.bg().IL();
        } catch (java.lang.Exception unused) {
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }
}

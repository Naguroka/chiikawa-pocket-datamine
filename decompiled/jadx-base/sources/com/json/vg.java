package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class vg implements com.json.qh {
    private static final java.lang.String g = "loadWithUrl | webView is not null";
    private static final java.lang.String h = "vg";
    private static final java.lang.String i = "file://";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f3495a;
    private java.lang.String b;
    private android.webkit.WebView c;
    private com.json.tg d;
    private com.json.og e;
    private android.content.Context f;

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f3496a;
        final /* synthetic */ org.json.JSONObject b;
        final /* synthetic */ java.lang.String c;

        a(java.lang.String str, org.json.JSONObject jSONObject, java.lang.String str2) {
            this.f3496a = str;
            this.b = jSONObject;
            this.c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.json.vg.this.c != null) {
                com.json.gh.a(com.json.ar.q, new com.json.bh().a(com.json.zb.A, com.json.vg.g).a());
            }
            try {
                com.json.vg.this.b(this.f3496a);
                com.json.vg.this.c.loadUrl(com.json.vg.this.a(this.b.getString("urlForWebView")));
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("adViewId", com.json.vg.this.f3495a);
                com.json.vg.this.d.a(this.c, jSONObject);
            } catch (java.lang.Exception e) {
                com.json.l9.d().a(e);
                com.json.vg.this.b(this.f3496a, e.getMessage());
                com.json.gh.a(com.json.ar.q, new com.json.bh().a(com.json.zb.A, e.getMessage()).a());
            }
        }
    }

    class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f3497a;
        final /* synthetic */ java.lang.String b;

        b(java.lang.String str, java.lang.String str2) {
            this.f3497a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (com.json.vg.this.c != null) {
                    com.json.vg.this.c.destroy();
                }
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("adViewId", com.json.vg.this.f3495a);
                if (com.json.vg.this.d != null) {
                    com.json.vg.this.d.a(this.f3497a, jSONObject);
                    com.json.vg.this.d.b();
                }
                com.json.vg.this.d = null;
                com.json.vg.this.f = null;
            } catch (java.lang.Exception e) {
                com.json.l9.d().a(e);
                android.util.Log.e(com.json.vg.h, "performCleanup | could not destroy ISNAdView webView ID: " + com.json.vg.this.f3495a);
                com.json.gh.a(com.json.ar.r, new com.json.bh().a(com.json.zb.A, e.getMessage()).a());
                com.json.vg.this.b(this.b, e.getMessage());
            }
        }
    }

    class c implements com.ironsource.qh.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f3498a;

        c(java.lang.String str) {
            this.f3498a = str;
        }

        @Override // com.ironsource.qh.a
        public void a(java.lang.String str) {
            com.json.sdk.utils.Logger.i(com.json.vg.h, "ISNAdViewWebPresenter | WebViewClient | reportOnError: " + str);
            com.json.vg.this.b(this.f3498a, str);
        }

        @Override // com.ironsource.qh.a
        public void b(java.lang.String str) {
            com.json.sdk.utils.Logger.i(com.json.vg.h, "ISNAdViewWebPresenter | WebViewClient | onRenderProcessGone: " + str);
            try {
                ((android.view.ViewGroup) com.json.vg.this.c.getParent()).removeView(com.json.vg.this.c);
            } catch (java.lang.Exception e) {
                com.json.l9.d().a(e);
                com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            }
            com.json.vg.this.e();
        }
    }

    private class d extends android.webkit.WebChromeClient {
        private d() {
        }

        /* synthetic */ d(com.json.vg vgVar, com.ironsource.vg.a aVar) {
            this();
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(android.webkit.WebView webView, boolean z, boolean z2, android.os.Message message) {
            android.webkit.WebView webView2 = new android.webkit.WebView(webView.getContext());
            webView2.setWebChromeClient(com.json.vg.this.new d());
            webView2.setWebViewClient(new com.ironsource.vg.e(com.json.vg.this, null));
            ((android.webkit.WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            com.json.sdk.utils.Logger.i("onCreateWindow", "onCreateWindow");
            return true;
        }
    }

    private class e extends android.webkit.WebViewClient {
        private e() {
        }

        /* synthetic */ e(com.json.vg vgVar, com.ironsource.vg.a aVar) {
            this();
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(android.webkit.WebView webView, android.webkit.RenderProcessGoneDetail renderProcessGoneDetail) {
            com.json.sdk.utils.Logger.e(com.json.vg.h, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
            android.content.Context context = webView.getContext();
            android.content.Intent intentA = new com.ironsource.sdk.controller.OpenUrlActivity.e(new com.ironsource.sdk.controller.k.b()).a(str).b(false).a(context);
            intentA.addFlags(268435456);
            context.startActivity(intentA);
            return true;
        }
    }

    public vg(com.json.rg rgVar, android.content.Context context, java.lang.String str, com.json.og ogVar) {
        this.f = context;
        com.json.tg tgVar = new com.json.tg();
        this.d = tgVar;
        tgVar.g(str);
        this.f3495a = str;
        this.d.a(rgVar);
        this.e = ogVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.String a(java.lang.String str) {
        return c(str) ? i + this.b + d(str) : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(java.lang.String str) {
        com.json.sdk.utils.Logger.i(h, "ISNAdViewWebPresenter | createWebView");
        android.webkit.WebView webView = new android.webkit.WebView(this.f);
        this.c = webView;
        webView.addJavascriptInterface(new com.json.sg(this), com.json.pg.e);
        this.c.setWebViewClient(new com.json.ug(new com.ironsource.vg.c(str)));
        this.c.setWebChromeClient(new com.ironsource.vg.d(this, null));
        com.json.gw.a(this.c);
        this.d.a(this.c);
    }

    private boolean c(java.lang.String str) {
        return str.startsWith(".");
    }

    private java.lang.String d(java.lang.String str) {
        java.lang.String strSubstring = str.substring(str.indexOf("/") + 1);
        return strSubstring.substring(strSubstring.indexOf("/"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void e() {
        a("", "");
    }

    @Override // com.json.qh
    public synchronized void a(java.lang.String str, java.lang.String str2) {
        if (this.f == null) {
            return;
        }
        com.json.sdk.utils.Logger.i(h, "performCleanup");
        com.json.cg.f2559a.d(new com.ironsource.vg.b(str, str2));
    }

    @Override // com.json.qh
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (android.text.TextUtils.isEmpty(str)) {
            b(str3, com.ironsource.y8.c.D);
            return;
        }
        com.json.sdk.utils.Logger.i(h, "trying to perform WebView Action: " + str);
        try {
            if (str.equals(com.ironsource.y8.h.t0)) {
                this.c.onPause();
            } else {
                if (!str.equals(com.ironsource.y8.h.u0)) {
                    b(str3, com.ironsource.y8.c.C);
                    return;
                }
                this.c.onResume();
            }
            this.d.f(str2);
        } catch (java.lang.Exception e2) {
            com.json.l9.d().a(e2);
            b(str3, com.ironsource.y8.c.E);
        }
    }

    @Override // com.json.qh
    public void a(org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2) {
        try {
            this.d.e(str);
        } catch (java.lang.Exception e2) {
            com.json.l9.d().a(e2);
            com.json.sdk.utils.Logger.i(h, "sendHandleGetViewVisibility fail with reason: " + e2.getMessage());
        }
    }

    public java.lang.String b() {
        return this.f3495a;
    }

    public void b(java.lang.String str, java.lang.String str2) {
        com.json.tg tgVar = this.d;
        if (tgVar != null) {
            tgVar.a(str, str2);
        }
    }

    @Override // com.json.qh
    public void b(org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2) {
        com.json.cg.f2559a.d(new com.ironsource.vg.a(str2, jSONObject, str));
    }

    public com.json.tg c() {
        return this.d;
    }

    @Override // com.json.qh
    public void c(org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        try {
            this.d.a(jSONObject.getString("params"), str, str2);
        } catch (java.lang.Exception e2) {
            com.json.l9.d().a(e2);
            com.json.sdk.utils.Logger.i(h, "sendMessageToAd fail message: " + e2.getMessage());
            throw e2;
        }
    }

    public com.json.og d() {
        return this.e;
    }

    public void e(java.lang.String str) {
        this.b = str;
    }

    @Override // com.json.qh
    public android.webkit.WebView getPresentingView() {
        return this.c;
    }

    @android.webkit.JavascriptInterface
    public void handleMessageFromAd(java.lang.String str) {
        this.d.c(str);
    }
}

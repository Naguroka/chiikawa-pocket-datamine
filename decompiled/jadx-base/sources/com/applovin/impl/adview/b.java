package com.applovin.impl.adview;

/* JADX INFO: loaded from: classes3.dex */
public class b extends com.applovin.impl.j3 {
    private final com.applovin.impl.sdk.n c;
    private final com.applovin.impl.sdk.j d;
    private com.applovin.impl.sdk.ad.b f;
    private boolean g;
    private boolean h;
    private final java.util.List i;
    private final java.lang.Object j;

    public b(com.applovin.impl.sdk.j jVar, android.content.Context context) {
        super(context);
        this.i = new java.util.ArrayList();
        this.j = new java.lang.Object();
        if (jVar == null) {
            throw new java.lang.IllegalArgumentException("No sdk specified.");
        }
        this.d = jVar;
        this.c = jVar.I();
        setBackgroundColor(0);
        android.webkit.WebSettings settings = getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setScrollBarStyle(33554432);
        if (com.applovin.impl.z3.k() && ((java.lang.Boolean) jVar.a(com.applovin.impl.sj.K5)).booleanValue()) {
            setWebViewRenderProcessClient(new com.applovin.impl.adview.d(jVar).a());
        }
        setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.applovin.impl.adview.b$$ExternalSyntheticLambda0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                return com.applovin.impl.adview.b.a(view, motionEvent);
            }
        });
        setOnLongClickListener(new android.view.View.OnLongClickListener() { // from class: com.applovin.impl.adview.b$$ExternalSyntheticLambda1
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                return this.f$0.a(view);
            }
        });
    }

    private void b() {
        synchronized (this.j) {
            java.util.Iterator it = this.i.iterator();
            while (it.hasNext()) {
                com.applovin.impl.tr.a(this, (java.lang.String) it.next(), "AdWebView", this.d);
            }
            this.i.clear();
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void computeScroll() {
    }

    @Override // android.webkit.WebView
    public void destroy() {
        this.g = true;
        this.h = false;
        super.destroy();
    }

    com.applovin.impl.sdk.ad.b getCurrentAd() {
        return this.f;
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
    }

    public void setAdHtmlLoaded(boolean z) {
        this.h = z;
        if (z && ((java.lang.Boolean) this.d.a(com.applovin.impl.sj.e6)).booleanValue()) {
            b();
        }
    }

    private void a(java.lang.String str, java.lang.String str2, java.lang.String str3, com.applovin.impl.sdk.j jVar, com.applovin.impl.aq aqVar) {
        java.lang.String strA = a(str3, str);
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(strA)) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a("AdWebView", "Rendering webview for VAST ad with resourceContents : " + strA);
            }
            loadDataWithBaseURL(str2, strA, "text/html", null, "");
            return;
        }
        java.lang.String strA2 = a((java.lang.String) jVar.a(com.applovin.impl.sj.E4), str);
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(strA2)) {
            if (aqVar.D1() && aqVar.isOpenMeasurementEnabled()) {
                strA2 = jVar.V().a(strA2);
            }
            java.lang.String str4 = strA2;
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a("AdWebView", "Rendering webview for VAST ad with resourceContents : " + str4);
            }
            loadDataWithBaseURL(str2, str4, "text/html", null, "");
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a("AdWebView", "Rendering webview for VAST ad with resourceURL : " + str);
        }
        loadUrl(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(android.view.View view, android.view.MotionEvent motionEvent) {
        if (view.hasFocus()) {
            return false;
        }
        view.requestFocus();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean a(android.view.View view) {
        if (!com.applovin.impl.sdk.n.a()) {
            return true;
        }
        this.c.a("AdWebView", "Received a LongClick event.");
        return true;
    }

    public void a(com.applovin.impl.adview.c cVar) {
        if (((java.lang.Boolean) this.d.a(com.applovin.impl.sj.t1)).booleanValue()) {
            loadUrl(com.unity3d.ads.adplayer.AndroidWebViewClient.BLANK_PAGE);
            clearView();
        }
        setWebViewClient(cVar != null ? cVar : new com.applovin.impl.pi());
        setWebChromeClient(new com.applovin.impl.f0(cVar != null ? cVar.c() : null, this.d));
        synchronized (this.i) {
            this.i.clear();
        }
        onResume();
    }

    public void a(com.applovin.impl.sdk.ad.b bVar) {
        if (!this.g) {
            this.f = bVar;
            try {
                applySettings(bVar);
                if (com.applovin.impl.yp.a(bVar.getSize())) {
                    setVisibility(0);
                }
                if (bVar instanceof com.applovin.impl.sdk.ad.a) {
                    loadDataWithBaseURL(bVar.h(), ((com.applovin.impl.sdk.ad.a) bVar).l1(), "text/html", null, "");
                    if (com.applovin.impl.sdk.n.a()) {
                        this.c.a("AdWebView", "AppLovinAd rendered");
                        return;
                    }
                    return;
                }
                if (bVar instanceof com.applovin.impl.aq) {
                    com.applovin.impl.aq aqVar = (com.applovin.impl.aq) bVar;
                    com.applovin.impl.dq dqVarL1 = aqVar.l1();
                    if (dqVarL1 != null) {
                        com.applovin.impl.iq iqVarE = dqVarL1.e();
                        android.net.Uri uriC = iqVarE.c();
                        java.lang.String string = uriC != null ? uriC.toString() : "";
                        java.lang.String strB = iqVarE.b();
                        java.lang.String strN1 = aqVar.n1();
                        if (!com.applovin.impl.sdk.utils.StringUtils.isValidString(string) && !com.applovin.impl.sdk.utils.StringUtils.isValidString(strB)) {
                            if (com.applovin.impl.sdk.n.a()) {
                                this.c.b("AdWebView", "Unable to load companion ad. No resources provided.");
                                return;
                            }
                            return;
                        }
                        if (iqVarE.d() == com.applovin.impl.iq.a.STATIC) {
                            if (com.applovin.impl.sdk.n.a()) {
                                this.c.a("AdWebView", "Rendering WebView for static VAST ad");
                            }
                            java.lang.String strA = a((java.lang.String) this.d.a(com.applovin.impl.sj.D4), string);
                            if (aqVar.D1() && aqVar.isOpenMeasurementEnabled() && aqVar.E1()) {
                                strA = this.d.V().a(strA);
                            }
                            loadDataWithBaseURL(bVar.h(), strA, "text/html", null, "");
                            return;
                        }
                        if (iqVarE.d() == com.applovin.impl.iq.a.HTML) {
                            if (com.applovin.impl.sdk.utils.StringUtils.isValidString(strB)) {
                                java.lang.String strA2 = a(strN1, strB);
                                java.lang.String str = com.applovin.impl.sdk.utils.StringUtils.isValidString(strA2) ? strA2 : strB;
                                if (com.applovin.impl.sdk.n.a()) {
                                    this.c.a("AdWebView", "Rendering WebView for HTML VAST ad with resourceContents: " + str);
                                }
                                loadDataWithBaseURL(bVar.h(), str, "text/html", null, "");
                                return;
                            }
                            if (com.applovin.impl.sdk.utils.StringUtils.isValidString(string)) {
                                if (com.applovin.impl.sdk.n.a()) {
                                    this.c.a("AdWebView", "Preparing to load HTML VAST ad resourceUri");
                                }
                                a(string, bVar.h(), strN1, this.d, aqVar);
                                return;
                            }
                            return;
                        }
                        if (iqVarE.d() == com.applovin.impl.iq.a.IFRAME) {
                            if (com.applovin.impl.sdk.utils.StringUtils.isValidString(string)) {
                                if (com.applovin.impl.sdk.n.a()) {
                                    this.c.a("AdWebView", "Preparing to load iFrame VAST ad resourceUri");
                                }
                                a(string, bVar.h(), strN1, this.d, aqVar);
                                return;
                            } else {
                                if (com.applovin.impl.sdk.utils.StringUtils.isValidString(strB)) {
                                    java.lang.String strA3 = a(strN1, strB);
                                    java.lang.String str2 = com.applovin.impl.sdk.utils.StringUtils.isValidString(strA3) ? strA3 : strB;
                                    if (com.applovin.impl.sdk.n.a()) {
                                        this.c.a("AdWebView", "Rendering WebView for iFrame VAST ad with resourceContents: " + str2);
                                    }
                                    loadDataWithBaseURL(bVar.h(), str2, "text/html", null, "");
                                    return;
                                }
                                return;
                            }
                        }
                        if (com.applovin.impl.sdk.n.a()) {
                            this.c.b("AdWebView", "Failed to render VAST companion ad of invalid type");
                            return;
                        }
                        return;
                    }
                    if (com.applovin.impl.sdk.n.a()) {
                        this.c.a("AdWebView", "No companion ad provided.");
                        return;
                    }
                    return;
                }
                return;
            } catch (java.lang.Throwable th) {
                throw new java.lang.RuntimeException("Unable to render AppLovin ad (" + (bVar != null ? java.lang.String.valueOf(bVar.getAdIdNumber()) : "null") + ") - " + th);
            }
        }
        com.applovin.impl.sdk.n.h("AdWebView", "Ad can not be loaded in a destroyed webview");
    }

    public void a(java.lang.String str) {
        if (((java.lang.Boolean) this.d.a(com.applovin.impl.sj.e6)).booleanValue()) {
            if (this.h) {
                com.applovin.impl.tr.a(this, str, "AdWebView", this.d);
                return;
            }
            synchronized (this.i) {
                this.i.add(str);
            }
            return;
        }
        com.applovin.impl.tr.a(this, str, "AdWebView", this.d);
    }

    private java.lang.String a(java.lang.String str, java.lang.String str2) {
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(str)) {
            return str.replace("{SOURCE}", str2);
        }
        return null;
    }
}

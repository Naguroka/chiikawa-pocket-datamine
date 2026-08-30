package com.applovin.impl.adview;

/* JADX INFO: loaded from: classes3.dex */
public class c extends com.applovin.impl.pi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f606a;
    private final com.applovin.impl.sdk.n b;
    private final com.applovin.impl.adview.a c;

    public c(com.applovin.impl.adview.a aVar, com.applovin.impl.sdk.j jVar) {
        this.f606a = jVar;
        this.b = jVar.I();
        this.c = aVar;
    }

    private void b() {
        this.c.a();
    }

    protected com.applovin.impl.adview.a c() {
        return this.c;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(android.webkit.WebView webView, java.lang.String str) {
        super.onLoadResource(webView, str);
        if (com.applovin.impl.sdk.n.a()) {
            this.b.d("AdWebView", "Loaded resource: " + str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
        super.onPageFinished(webView, str);
        if (com.applovin.impl.sdk.n.a()) {
            this.b.d("AdWebView", "Loaded URL: " + str);
        }
        com.applovin.impl.adview.a aVar = this.c;
        if (aVar != null) {
            aVar.a(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        onReceivedError(webView, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        com.applovin.impl.adview.a aVar = this.c;
        if (aVar != null) {
            com.applovin.impl.sdk.ad.b bVarI = aVar.i();
            if (com.applovin.impl.sdk.n.a()) {
                this.b.b("AdWebView", "Received HTTP error: " + webResourceResponse + "for url: " + webResourceRequest.getUrl() + " and ad: " + bVarI);
            }
        }
        if (com.applovin.impl.yp.a(webResourceRequest.getUrl().toString(), this.f606a)) {
            this.f606a.D().a("adWebViewReceivedHttpError", webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode());
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(android.webkit.WebView webView, android.webkit.SslErrorHandler sslErrorHandler, android.net.http.SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        com.applovin.impl.adview.a aVar = this.c;
        if (aVar != null) {
            com.applovin.impl.sdk.ad.b bVarI = aVar.i();
            java.lang.String str = "Received SSL error: " + sslError;
            if (com.applovin.impl.sdk.n.a()) {
                this.b.b("AdWebView", str + " for ad: " + bVarI);
            }
        }
    }

    @Override // com.applovin.impl.pi, android.webkit.WebViewClient
    public boolean onRenderProcessGone(android.webkit.WebView webView, android.webkit.RenderProcessGoneDetail renderProcessGoneDetail) {
        com.applovin.impl.sdk.AppLovinBroadcastManager.sendBroadcast(new android.content.Intent("com.applovin.render_process_gone"), null);
        if (this.c == null) {
            return true;
        }
        com.applovin.impl.sdk.n.h("AdWebView", "Render process gone for ad: " + this.c.i() + ". Process did crash: " + renderProcessGoneDetail.didCrash());
        com.applovin.impl.sdk.ad.b bVarI = this.c.i();
        if (bVarI != null) {
            java.util.Map mapA = com.applovin.impl.la.a(bVarI);
            com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("top_main_method", "onRenderProcessGone", mapA);
            if (com.applovin.impl.z3.i()) {
                mapA.put("source", renderProcessGoneDetail.didCrash() ? com.google.android.gms.measurement.AppMeasurement.CRASH_ORIGIN : "non_crash");
            }
            this.f606a.D().a(com.applovin.impl.ka.d0, mapA);
        }
        if (((java.lang.Boolean) this.f606a.a(com.applovin.impl.sj.E5)).booleanValue()) {
            if (renderProcessGoneDetail.didCrash() && ((java.lang.Boolean) this.f606a.a(com.applovin.impl.sj.J5)).booleanValue()) {
                throw new java.lang.RuntimeException("Render process crashed. This is likely caused by a crash in an AppLovin ad with ID: " + (bVarI != null ? java.lang.String.valueOf(bVarI.getAdIdNumber()) : "null"));
            }
            if (webView != null && webView.equals(this.c.g())) {
                this.c.b();
                com.applovin.sdk.AppLovinAdSize appLovinAdSizeM = this.c.m();
                if (com.applovin.impl.yp.a(appLovinAdSizeM)) {
                    this.c.a(appLovinAdSizeM);
                    this.c.H();
                }
            }
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
        android.net.Uri url = webResourceRequest.getUrl();
        if (url != null) {
            return a(webView, url.toString());
        }
        if (!com.applovin.impl.sdk.n.a()) {
            return false;
        }
        this.b.b("AdWebView", "No url found for request");
        return false;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(android.webkit.WebView webView, int i, java.lang.String str, java.lang.String str2) {
        super.onReceivedError(webView, i, str, str2);
        com.applovin.impl.adview.a aVar = this.c;
        if (aVar != null) {
            com.applovin.impl.sdk.ad.b bVarI = aVar.i();
            java.lang.String str3 = "Received error with error code: " + i + " with description \\'" + str + "\\' for URL: " + str2;
            if (com.applovin.impl.sdk.n.a()) {
                this.b.b("AdWebView", str3 + " for ad: " + bVarI);
            }
        }
        if (com.applovin.impl.yp.a(str2, this.f606a)) {
            this.f606a.D().a("adWebViewReceivedError", str2, i);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
        return a(webView, str);
    }

    private void a(com.applovin.impl.aq aqVar, com.applovin.impl.adview.b bVar) {
        a(aqVar, bVar, (android.os.Bundle) null);
    }

    private void a(com.applovin.impl.aq aqVar, com.applovin.impl.adview.b bVar, android.os.Bundle bundle) {
        com.applovin.impl.dq dqVarL1 = aqVar.l1();
        if (dqVarL1 != null) {
            com.applovin.impl.mq.a(dqVarL1.b(), this.c.l());
            a(bVar, dqVarL1.c(), bundle);
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:161:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:93:0x0187  */
    protected boolean a(android.webkit.WebView webView, java.lang.String str) {
        boolean z;
        if (this.c == null) {
            return true;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.b.d("AdWebView", "Processing click on ad URL \"" + str + "\"");
        }
        if (str != null && (webView instanceof com.applovin.impl.adview.b)) {
            android.net.Uri uri = android.net.Uri.parse(str);
            com.applovin.impl.adview.b bVar = (com.applovin.impl.adview.b) webView;
            java.lang.String scheme = uri.getScheme();
            java.lang.String host = uri.getHost();
            java.lang.String path = uri.getPath();
            com.applovin.impl.sdk.ad.b bVarI = this.c.i();
            if (bVarI == null) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.b.b("AdWebView", "Unable to process click, ad not found!");
                }
                return true;
            }
            java.util.Iterator it = bVarI.e0().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                }
                java.lang.String str2 = (java.lang.String) it.next();
                if (com.applovin.impl.sdk.utils.StringUtils.isValidString(path) && path.contains(str2)) {
                    z = false;
                    break;
                }
            }
            boolean zA = bVar.a();
            boolean z2 = (!bVarI.a1() || zA) ? z : false;
            if ("applovin".equals(scheme) && com.google.ads.mediation.applovin.AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN.equals(host)) {
                if ("/adservice/close_ad".equals(path)) {
                    java.lang.String str3 = this.f606a.f0().getExtraParameters().get("enable_close_URL_ad_value");
                    if (com.applovin.impl.sdk.utils.StringUtils.isValidString(str3) && java.lang.Boolean.parseBoolean(str3)) {
                        bVarI.setMaxAdValue("close_url", str);
                    }
                    a();
                } else if ("/adservice/expand_ad".equals(path)) {
                    if (bVarI.b1() && !zA) {
                        if (com.applovin.impl.sdk.n.a()) {
                            this.b.b("AdWebView", "Skipping expand command without user interaction");
                        }
                        return true;
                    }
                    a(bVar.getLastClickEvent());
                } else if ("/adservice/contract_ad".equals(path)) {
                    b();
                } else {
                    if ("/adservice/no_op".equals(path)) {
                        return true;
                    }
                    if ("/adservice/load_url".equals(path)) {
                        if (a(zA, bVarI, uri)) {
                            if (com.applovin.impl.sdk.n.a()) {
                                this.b.b("AdWebView", "Skipping URL load command without user interaction");
                            }
                            return true;
                        }
                        com.applovin.impl.tp.a(uri, this.c, this.f606a);
                    } else if ("/adservice/track_click_now".equals(path)) {
                        if (a(zA, bVarI, uri)) {
                            if (com.applovin.impl.sdk.n.a()) {
                                this.b.b("AdWebView", "Skipping click tracking command without user interaction");
                            }
                            return true;
                        }
                        if (bVarI instanceof com.applovin.impl.aq) {
                            a((com.applovin.impl.aq) bVarI, bVar);
                        } else {
                            a(bVar, android.net.Uri.parse("/adservice/track_click_now"));
                        }
                    } else if ("/adservice/deeplink".equals(path)) {
                        if (a(zA, bVarI, uri)) {
                            if (com.applovin.impl.sdk.n.a()) {
                                this.b.b("AdWebView", "Skipping deep link plus command without user interaction");
                            }
                            return true;
                        }
                        if (bVarI instanceof com.applovin.impl.aq) {
                            com.applovin.impl.aq aqVar = (com.applovin.impl.aq) bVarI;
                            if (aqVar.C1()) {
                                a(aqVar, bVar);
                            } else {
                                a(bVar, uri);
                            }
                        } else {
                            a(bVar, uri);
                        }
                    } else if ("/adservice/postback".equals(path)) {
                        com.applovin.impl.tp.a(uri, bVarI, this.f606a);
                    } else if ("/ga_init".equals(path)) {
                        this.c.b(uri);
                    } else if ("/ga_event".equals(path)) {
                        this.c.a(uri);
                    } else if ("/playable_event".equals(path)) {
                        a(uri);
                    } else if ("/adservice/direct_download".equals(path)) {
                        android.os.Bundle bundleA = com.applovin.impl.tp.a(uri);
                        if (bVarI instanceof com.applovin.impl.aq) {
                            com.applovin.impl.aq aqVar2 = (com.applovin.impl.aq) bVarI;
                            if (aqVar2.C1()) {
                                a(aqVar2, bVar, bundleA);
                            } else {
                                a(bVar, bVarI.j(), bundleA);
                            }
                        } else {
                            a(bVar, bVarI.j(), bundleA);
                        }
                    } else if ("/template_error".equals(path)) {
                        com.applovin.impl.tp.b(uri, bVarI, this.f606a);
                    } else if (this.c.h() != null) {
                        if ("/video_began".equals(path)) {
                            this.c.h().b(com.applovin.impl.yp.a(uri.getQueryParameter("duration"), 0.0d));
                        } else if ("/video_completed".equals(path)) {
                            this.c.h().e();
                        } else if ("/video_progress".equals(path)) {
                            this.c.h().a(com.applovin.impl.yp.a(uri.getQueryParameter("percent_viewed"), 0.0d));
                        } else if ("/video_waiting".equals(path)) {
                            this.c.h().a();
                        } else if ("/video_resumed".equals(path)) {
                            this.c.h().d();
                        }
                    } else if ("/adservice/fully_watched".equals(path)) {
                        this.c.A();
                    } else {
                        if (com.applovin.impl.sdk.n.a()) {
                            this.b.k("AdWebView", "Unknown URL: " + str);
                        }
                        if (com.applovin.impl.sdk.n.a()) {
                            this.b.k("AdWebView", "Path: " + path);
                        }
                    }
                }
            } else if (z2) {
                java.util.List listY0 = bVarI.y0();
                java.util.List listX0 = bVarI.x0();
                if ((!listY0.isEmpty() && !listY0.contains(scheme)) || (!listX0.isEmpty() && !listX0.contains(host))) {
                    if (com.applovin.impl.sdk.n.a()) {
                        this.b.b("AdWebView", "URL is not whitelisted - bypassing click");
                    }
                } else {
                    if (bVarI instanceof com.applovin.impl.aq) {
                        com.applovin.impl.aq aqVar3 = (com.applovin.impl.aq) bVarI;
                        if (aqVar3.C1()) {
                            a(aqVar3, bVar);
                        } else {
                            a(bVar, uri);
                        }
                    } else {
                        a(bVar, uri);
                    }
                    if (!zA && bVarI.h1()) {
                        this.f606a.D().a(com.applovin.impl.ka.O, a(bVarI, uri));
                    }
                }
            }
        }
        return true;
    }

    private boolean a(boolean z, com.applovin.impl.sdk.ad.b bVar, android.net.Uri uri) {
        if (z) {
            return false;
        }
        if (bVar.b1()) {
            return true;
        }
        if (bVar.h1()) {
            this.f606a.D().a(com.applovin.impl.ka.O, a(bVar, uri));
        }
        return false;
    }

    private static java.util.Map a(com.applovin.impl.sdk.ad.b bVar, android.net.Uri uri) {
        java.util.Map mapA = com.applovin.impl.la.a(bVar);
        com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("url", uri.toString(), mapA);
        return mapA;
    }

    private void a() {
        this.c.z();
    }

    private void a(android.view.MotionEvent motionEvent) {
        this.c.a(motionEvent);
    }

    private void a(com.applovin.impl.adview.b bVar, android.net.Uri uri) {
        a(bVar, uri, (android.os.Bundle) null);
    }

    private void a(com.applovin.impl.adview.b bVar, android.net.Uri uri, android.os.Bundle bundle) {
        com.applovin.impl.sdk.ad.b currentAd = bVar.getCurrentAd();
        com.applovin.adview.AppLovinAdView appLovinAdViewK = this.c.k();
        if (appLovinAdViewK != null && currentAd != null) {
            if (currentAd instanceof com.applovin.impl.aq) {
                ((com.applovin.impl.aq) currentAd).getAdEventTracker().v();
            }
            this.c.a(currentAd, appLovinAdViewK, uri, bVar.getAndClearLastClickEvent(), bundle);
        } else if (com.applovin.impl.sdk.n.a()) {
            this.b.b("AdWebView", "Attempting to track click that is null or not an ApplovinAdView instance for clickedUri = " + uri);
        }
    }

    private void a(android.net.Uri uri) {
        java.lang.String str;
        boolean booleanQueryParameter = uri.getBooleanQueryParameter("success", false);
        java.lang.String queryParameter = uri.getQueryParameter("type");
        if (booleanQueryParameter) {
            str = "Tracked event: " + queryParameter;
        } else {
            str = "Failed to track event: " + queryParameter;
        }
        com.applovin.impl.yp.a(str, com.applovin.impl.sdk.j.m());
    }
}

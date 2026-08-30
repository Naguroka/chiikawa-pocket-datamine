package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class qr extends com.applovin.impl.pi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f1201a;
    private final com.applovin.impl.sdk.n b;
    private android.webkit.WebView c;
    private boolean d;
    private final java.util.Set e = java.util.Collections.synchronizedSet(new java.util.HashSet());

    public qr(com.applovin.impl.sdk.j jVar) {
        this.f1201a = jVar;
        this.b = jVar.I();
    }

    public void b(final java.lang.String str) {
        if (!com.applovin.sdk.AppLovinSdkUtils.isValidString(str)) {
            if (com.applovin.impl.sdk.n.a()) {
                this.b.b("WebTrackerManager", "Failed to fire tracker due to empty script string");
            }
        } else {
            if (!str.startsWith("<script")) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.b.b("WebTrackerManager", "Failed to fire tracker due to improperly formatted script tag");
                    return;
                }
                return;
            }
            com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.qr$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.c(str);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(java.lang.String str) {
        final android.webkit.WebView webViewA = a(str);
        if (webViewA == null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.b.b("WebTrackerManager", "Failed to fire tracker since web view could not be created");
            }
        } else {
            this.e.add(webViewA);
            com.applovin.sdk.AppLovinSdkUtils.runOnUiThreadDelayed(new java.lang.Runnable() { // from class: com.applovin.impl.qr$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.b(webViewA);
                }
            }, ((java.lang.Integer) this.f1201a.a(com.applovin.impl.sj.N2)).intValue());
        }
    }

    class a extends android.webkit.WebViewClient {
        a() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
            com.applovin.impl.sdk.n unused = com.applovin.impl.qr.this.b;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.qr.this.b.a("WebTrackerManager", "Successfully initialized web view for postbacks");
            }
            com.applovin.impl.qr.this.d = true;
        }
    }

    private boolean d() {
        return ((java.lang.Boolean) this.f1201a.a(com.applovin.impl.sj.S2)).booleanValue();
    }

    public void c() {
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.qr$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b();
            }
        });
    }

    @Override // com.applovin.impl.pi, android.webkit.WebViewClient
    public boolean onRenderProcessGone(android.webkit.WebView webView, android.webkit.RenderProcessGoneDetail renderProcessGoneDetail) {
        if (webView == this.c) {
            com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.qr$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a();
                }
            });
        } else {
            b(webView);
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(final android.webkit.WebView webView) {
        if (webView == null || !this.e.remove(webView)) {
            return;
        }
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.qr$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                webView.destroy();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.applovin.impl.sdk.network.e eVar, com.applovin.sdk.AppLovinPostbackListener appLovinPostbackListener) {
        java.lang.String strAppendQueryParameters = com.applovin.impl.sdk.utils.StringUtils.appendQueryParameters(eVar.f(), eVar.i(), ((java.lang.Boolean) this.f1201a.a(com.applovin.impl.sj.k3)).booleanValue());
        if (this.c == null) {
            android.webkit.WebView webViewA = a("<script>window.al_firePostback = function(url) {\n    setTimeout(function() {\n        var img = new Image();\n        img.src = url;\n    }, 100);\n}\n</script>", true);
            this.c = webViewA;
            if (webViewA == null) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.b.b("WebTrackerManager", "Failed to fire postback since web view could not be created");
                }
                appLovinPostbackListener.onPostbackFailure(strAppendQueryParameters, -1);
                return;
            }
        }
        if (d() && !this.d) {
            if (com.applovin.impl.sdk.n.a()) {
                this.b.b("WebTrackerManager", "Failed to fire postback since web view was not initialized in time");
            }
            java.util.HashMap<java.lang.String, java.lang.String> mapHashMap = com.applovin.impl.sdk.utils.CollectionUtils.hashMap("top_main_method", "firePostback");
            mapHashMap.put("url", strAppendQueryParameters);
            this.f1201a.D().a(com.applovin.impl.ka.d0, (java.util.Map) mapHashMap);
            appLovinPostbackListener.onPostbackFailure(strAppendQueryParameters, -1);
            return;
        }
        com.applovin.impl.tr.a(this.c, "al_firePostback('" + strAppendQueryParameters + "')");
        appLovinPostbackListener.onPostbackSuccess(strAppendQueryParameters);
    }

    private android.webkit.WebView a(java.lang.String str) {
        return a(str, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        android.webkit.WebView webViewA = a("<script>window.al_firePostback = function(url) {\n    setTimeout(function() {\n        var img = new Image();\n        img.src = url;\n    }, 100);\n}\n</script>", true);
        this.c = webViewA;
        if (webViewA == null && com.applovin.impl.sdk.n.a()) {
            this.b.b("WebTrackerManager", "Failed to preload postback web view");
        }
    }

    public void a(final com.applovin.impl.sdk.network.e eVar, final com.applovin.sdk.AppLovinPostbackListener appLovinPostbackListener) {
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.qr$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(eVar, appLovinPostbackListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        this.c.destroy();
        this.c = null;
    }

    private android.webkit.WebView a(java.lang.String str, boolean z) {
        com.applovin.impl.yp.b();
        android.webkit.WebView webViewB = com.applovin.impl.yp.b(com.applovin.impl.sdk.j.m(), "web tracker");
        if (webViewB == null) {
            return null;
        }
        webViewB.getSettings().setJavaScriptEnabled(true);
        webViewB.setWebViewClient(this);
        if (z && d()) {
            webViewB.setWebViewClient(new com.applovin.impl.qr.a());
        }
        webViewB.loadData("<html><head><link rel=\"icon\" href=\"data:,\">" + str + "</head><body></body></html>", "text/html", com.adjust.sdk.Constants.ENCODING);
        return webViewB;
    }
}

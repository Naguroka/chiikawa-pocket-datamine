package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.AppLovinAdBase f993a;
    protected final com.applovin.impl.sdk.j b;
    protected final com.applovin.impl.sdk.n c;
    protected final java.lang.String d;
    protected boolean e;
    protected com.iab.omid.library.applovin.adsession.AdSession f;
    protected com.iab.omid.library.applovin.adsession.AdEvents g;

    protected abstract com.iab.omid.library.applovin.adsession.AdSessionConfiguration a();

    protected abstract com.iab.omid.library.applovin.adsession.AdSessionContext a(android.webkit.WebView webView);

    protected void a(com.iab.omid.library.applovin.adsession.AdSession adSession) {
    }

    public lg(com.applovin.impl.sdk.AppLovinAdBase appLovinAdBase) {
        this.f993a = appLovinAdBase;
        this.b = appLovinAdBase.getSdk();
        this.c = appLovinAdBase.getSdk().I();
        java.lang.String str = "AdEventTracker:" + appLovinAdBase.getAdIdNumber();
        this.d = com.applovin.impl.sdk.utils.StringUtils.isValidString(appLovinAdBase.getDspName()) ? str + ":" + appLovinAdBase.getDspName() : str;
    }

    public void e() {
        c(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(android.webkit.WebView webView) {
        com.iab.omid.library.applovin.adsession.AdSessionContext adSessionContextA;
        if (!this.f993a.isOpenMeasurementEnabled()) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.d(this.d, "Skip starting session - Open Measurement disabled");
                return;
            }
            return;
        }
        if (this.f != null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.k(this.d, "Attempting to start session again for ad: " + this.f993a);
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a(this.d, "Starting session");
        }
        com.iab.omid.library.applovin.adsession.AdSessionConfiguration adSessionConfigurationA = a();
        if (adSessionConfigurationA == null || (adSessionContextA = a(webView)) == null) {
            return;
        }
        try {
            com.iab.omid.library.applovin.adsession.AdSession adSessionCreateAdSession = com.iab.omid.library.applovin.adsession.AdSession.createAdSession(adSessionConfigurationA, adSessionContextA);
            this.f = adSessionCreateAdSession;
            try {
                this.g = com.iab.omid.library.applovin.adsession.AdEvents.createAdEvents(adSessionCreateAdSession);
                a(this.f);
                this.f.start();
                this.e = true;
                if (com.applovin.impl.sdk.n.a()) {
                    this.c.a(this.d, "Session started");
                }
            } catch (java.lang.Throwable th) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.c.a(this.d, "Failed to create ad events", th);
                }
            }
        } catch (java.lang.Throwable th2) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a(this.d, "Failed to create session", th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        this.g.loaded();
    }

    public void h() {
        b("track loaded", new java.lang.Runnable() { // from class: com.applovin.impl.lg$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.d();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        this.g.impressionOccurred();
    }

    public void g() {
        b("track impression event", new java.lang.Runnable() { // from class: com.applovin.impl.lg$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.c();
            }
        });
    }

    public void f() {
        b("stop session", new java.lang.Runnable() { // from class: com.applovin.impl.lg$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b();
            }
        });
    }

    public void c(final android.webkit.WebView webView) {
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.lg$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(webView);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(java.lang.String str, java.lang.Runnable runnable) {
        try {
            if (this.e) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.c.a(this.d, "Running operation: " + str);
                }
                runnable.run();
            }
        } catch (java.lang.Throwable th) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a(this.d, "Failed to run operation: " + str, th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.e = false;
        this.f.finish();
        this.f = null;
        this.g = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(java.lang.String str) {
        this.f.error(com.iab.omid.library.applovin.adsession.ErrorType.VIDEO, str);
    }

    protected void b(final java.lang.String str, final java.lang.Runnable runnable) {
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.lg$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(str, runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(android.view.View view, java.util.List list) {
        this.f.registerAdView(view);
        this.f.removeAllFriendlyObstructions();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.applovin.impl.ng ngVar = (com.applovin.impl.ng) it.next();
            if (ngVar.c() != null) {
                try {
                    this.f.addFriendlyObstruction(ngVar.c(), ngVar.b(), ngVar.a());
                } catch (java.lang.Throwable th) {
                    if (com.applovin.impl.sdk.n.a()) {
                        this.c.a(this.d, "Failed to add friendly obstruction (" + ngVar + ")", th);
                    }
                }
            }
        }
    }

    public void b(final java.lang.String str) {
        b("track error", new java.lang.Runnable() { // from class: com.applovin.impl.lg$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(str);
            }
        });
    }

    public void a(android.view.View view) {
        b(view, java.util.Collections.emptyList());
    }

    public void b(final android.view.View view, final java.util.List list) {
        b("update main view: " + view, new java.lang.Runnable() { // from class: com.applovin.impl.lg$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(view, list);
            }
        });
    }
}

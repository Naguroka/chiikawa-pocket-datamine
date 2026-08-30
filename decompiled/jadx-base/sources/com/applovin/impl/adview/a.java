package com.applovin.impl.adview;

/* JADX INFO: loaded from: classes3.dex */
public class a implements com.applovin.communicator.AppLovinCommunicatorSubscriber {
    private static final java.util.concurrent.atomic.AtomicReference H = new java.util.concurrent.atomic.AtomicReference();
    private volatile com.applovin.sdk.AppLovinAdLoadListener C;
    private volatile com.applovin.sdk.AppLovinAdDisplayListener D;
    private volatile com.applovin.adview.AppLovinAdViewEventListener E;
    private volatile com.applovin.sdk.AppLovinAdClickListener F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.content.Context f595a;
    private android.view.ViewGroup b;
    private com.applovin.impl.sdk.j c;
    private com.applovin.impl.sdk.AppLovinAdServiceImpl d;
    private com.applovin.impl.sdk.n f;
    private com.applovin.communicator.AppLovinCommunicator g;
    private com.applovin.impl.adview.a.b h;
    private com.applovin.sdk.AppLovinAdSize j;
    private java.lang.String k;
    private androidx.browser.customtabs.CustomTabsSession l;
    private com.applovin.impl.adview.c m;
    private com.applovin.impl.adview.a.e n;
    private com.applovin.impl.adview.b o;
    private android.webkit.WebView p;
    private com.applovin.impl.adview.k q;
    private java.lang.Runnable r;
    private java.lang.Runnable s;
    private final java.util.Map i = java.util.Collections.synchronizedMap(new java.util.HashMap());
    private volatile com.applovin.impl.sdk.ad.b t = null;
    private volatile com.applovin.sdk.AppLovinAd u = null;
    private com.applovin.impl.adview.f v = null;
    private com.applovin.impl.adview.f w = null;
    private final java.util.concurrent.atomic.AtomicReference x = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicBoolean y = new java.util.concurrent.atomic.AtomicBoolean();
    private volatile boolean z = false;
    private volatile boolean A = false;
    private volatile boolean B = false;
    private volatile com.applovin.impl.g0 G = null;

    public interface b {
        void a(com.applovin.impl.adview.a aVar);
    }

    private class c implements java.lang.Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.applovin.impl.adview.a.this.o != null) {
                com.applovin.impl.adview.a.this.o.setVisibility(8);
            }
        }
    }

    private class d implements java.lang.Runnable {

        /* JADX INFO: renamed from: com.applovin.impl.adview.a$d$a, reason: collision with other inner class name */
        class C0029a implements com.applovin.impl.adview.k.a {
            C0029a() {
            }

            @Override // com.applovin.impl.adview.k.a
            public void a() {
                com.applovin.impl.adview.a.this.o.addView(com.applovin.impl.adview.a.this.q, new android.view.ViewGroup.LayoutParams(-1, -1));
            }

            @Override // com.applovin.impl.adview.k.a
            public void onFailure() {
                com.applovin.impl.sdk.n unused = com.applovin.impl.adview.a.this.f;
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.adview.a.this.f.b("AppLovinAdView", "Watermark failed to render.");
                }
            }
        }

        private d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.applovin.impl.adview.a.this.t != null) {
                if (com.applovin.impl.adview.a.this.o == null) {
                    com.applovin.impl.sdk.n.h("AppLovinAdView", "Unable to render advertisement for ad #" + com.applovin.impl.adview.a.this.t.getAdIdNumber() + ". Please make sure you are not calling AppLovinAdView.destroy() prematurely.");
                    com.applovin.impl.fc.a(com.applovin.impl.adview.a.this.E, com.applovin.impl.adview.a.this.t, (com.applovin.adview.AppLovinAdView) null, com.applovin.adview.AppLovinAdViewDisplayErrorCode.WEBVIEW_NOT_FOUND);
                    return;
                }
                com.applovin.impl.adview.a.this.w();
                com.applovin.impl.sdk.n unused = com.applovin.impl.adview.a.this.f;
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.adview.a.this.f.a("AppLovinAdView", "Rendering advertisement ad for #" + com.applovin.impl.adview.a.this.t.getAdIdNumber() + "...");
                }
                com.applovin.impl.adview.a.b(com.applovin.impl.adview.a.this.o, com.applovin.impl.adview.a.this.t.getSize());
                if (com.applovin.impl.adview.a.this.q != null) {
                    com.applovin.impl.zq.c(com.applovin.impl.adview.a.this.q);
                    com.applovin.impl.adview.a.this.q = null;
                }
                com.applovin.impl.da daVar = new com.applovin.impl.da(com.applovin.impl.adview.a.this.i, com.applovin.impl.adview.a.this.c);
                if (daVar.c()) {
                    com.applovin.impl.adview.a.this.q = new com.applovin.impl.adview.k(daVar, com.applovin.impl.adview.a.this.f595a);
                    com.applovin.impl.adview.a.this.q.a(new com.applovin.impl.adview.a.d.C0029a());
                }
                com.applovin.impl.adview.a.this.o.setAdHtmlLoaded(false);
                com.applovin.impl.adview.a.this.o.a(com.applovin.impl.adview.a.this.t);
                if (com.applovin.impl.adview.a.this.t.getSize() == com.applovin.sdk.AppLovinAdSize.INTERSTITIAL || com.applovin.impl.adview.a.this.A) {
                    return;
                }
                com.applovin.impl.adview.a.this.t.setHasShown(true);
            }
        }
    }

    static class e implements com.applovin.sdk.AppLovinAdLoadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.adview.a f599a;

        e(com.applovin.impl.adview.a aVar, com.applovin.impl.sdk.j jVar) {
            if (aVar == null) {
                throw new java.lang.IllegalArgumentException("No view specified");
            }
            if (jVar == null) {
                throw new java.lang.IllegalArgumentException("No sdk specified");
            }
            this.f599a = aVar;
        }

        private com.applovin.impl.adview.a a() {
            return this.f599a;
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(com.applovin.sdk.AppLovinAd appLovinAd) {
            com.applovin.impl.adview.a aVarA = a();
            if (aVarA != null) {
                aVarA.b(appLovinAd);
            } else {
                com.applovin.impl.sdk.n.h("AppLovinAdView", "Ad view has been garbage collected by the time an ad was received");
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i) {
            com.applovin.impl.adview.a aVarA = a();
            if (aVarA != null) {
                aVarA.b(i);
            }
        }
    }

    private void G() {
        com.applovin.impl.adview.b bVar;
        if (this.f != null && com.applovin.impl.sdk.n.a() && com.applovin.impl.sdk.n.a()) {
            this.f.a("AppLovinAdView", "Destroying...");
        }
        if (!((java.lang.Boolean) this.c.a(com.applovin.impl.sj.u1)).booleanValue() || (bVar = this.o) == null) {
            com.applovin.impl.tr.d(this.o);
        } else {
            com.applovin.impl.tr.a(bVar);
            f().a(this.o, new com.applovin.impl.ub.b() { // from class: com.applovin.impl.adview.a$$ExternalSyntheticLambda6
                @Override // com.applovin.impl.ub.b
                public final void a(java.lang.Object obj) {
                    com.applovin.impl.tr.d((com.applovin.impl.adview.b) obj);
                }
            });
        }
        this.o = null;
        com.applovin.impl.tr.d(this.p);
        this.p = null;
        this.l = null;
        this.C = null;
        this.D = null;
        this.F = null;
        this.E = null;
        this.A = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ com.applovin.impl.adview.b o() {
        return new com.applovin.impl.adview.b(this.c, this.f595a.getApplicationContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p() {
        this.o.loadDataWithBaseURL("/", "<html></html>", "text/html", null, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q() {
        com.applovin.impl.adview.b bVar;
        d();
        if (this.b == null || (bVar = this.o) == null || bVar.getParent() != null) {
            return;
        }
        this.b.addView(this.o);
        b(this.o, this.t.getSize());
        if (this.t.isOpenMeasurementEnabled()) {
            this.t.getAdEventTracker().a((android.view.View) this.o);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r() {
        if (this.o != null && this.v != null) {
            a();
        }
        G();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s() {
        if (this.v != null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f.a("AppLovinAdView", "Detaching expanded ad: " + this.v.b());
            }
            this.w = this.v;
            this.v = null;
            a(this.j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t() {
        com.applovin.impl.sdk.ad.a aVarB;
        com.applovin.impl.adview.f fVar = this.w;
        if (fVar == null && this.v == null) {
            return;
        }
        if (fVar != null) {
            aVarB = fVar.b();
            this.w.dismiss();
            this.w = null;
        } else {
            aVarB = this.v.b();
            this.v.dismiss();
            this.v = null;
        }
        com.applovin.impl.fc.a(this.E, aVarB, (com.applovin.adview.AppLovinAdView) this.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u() {
        g().loadUrl("chrome://crash");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        com.applovin.impl.sdk.ad.b bVar = this.t;
        com.applovin.impl.pc pcVar = new com.applovin.impl.pc();
        pcVar.a().a(bVar).a(k());
        if (!com.applovin.impl.yp.a(bVar.getSize())) {
            pcVar.a().a("Fullscreen Ad Properties").b(bVar);
        }
        pcVar.a(this.c);
        pcVar.a();
        if (com.applovin.impl.sdk.n.a()) {
            this.f.a("AppLovinAdView", pcVar.toString());
        }
    }

    private void y() {
        if (this.t.X0()) {
            int iA = this.c.o().a();
            if (com.applovin.impl.sdk.h.a(iA)) {
                this.o.a("javascript:al_muteSwitchOn();");
            } else if (iA == 2) {
                this.o.a("javascript:al_muteSwitchOff();");
            }
        }
    }

    public void A() {
        if (com.applovin.impl.sdk.n.a()) {
            this.f.a("AppLovinAdView", "AdView fully watched...");
        }
        com.applovin.impl.adview.a.b bVar = this.h;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    public void B() {
        if (com.applovin.impl.e0.a(this.o)) {
            this.c.C().c(com.applovin.impl.ba.r);
        }
    }

    public void C() {
        if (this.z) {
            com.applovin.impl.fc.b(this.D, this.t);
            if (this.t != null && this.t.isOpenMeasurementEnabled() && com.applovin.impl.yp.a(this.t.getSize())) {
                this.t.getAdEventTracker().f();
            }
            if (this.o == null || this.v == null) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.f.a("AppLovinAdView", "onDetachedFromWindowCalled without an expanded ad present");
                }
            } else {
                if (com.applovin.impl.sdk.n.a()) {
                    this.f.a("AppLovinAdView", "onDetachedFromWindowCalled with expanded ad present");
                }
                c();
            }
        }
    }

    public void D() {
        this.B = true;
    }

    public void E() {
        this.B = false;
    }

    public void F() {
        if (!this.z || this.A) {
            return;
        }
        this.A = true;
    }

    public void H() {
        if (this.z) {
            com.applovin.sdk.AppLovinAd appLovinAd = (com.applovin.sdk.AppLovinAd) this.x.getAndSet(null);
            if (appLovinAd != null) {
                c(appLovinAd);
            }
            this.A = false;
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public java.lang.String getCommunicatorId() {
        return androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY;
    }

    public com.applovin.adview.AppLovinAdView k() {
        return (com.applovin.adview.AppLovinAdView) this.b;
    }

    public com.applovin.impl.sdk.j l() {
        return this.c;
    }

    public com.applovin.sdk.AppLovinAdSize m() {
        return this.j;
    }

    public java.lang.String n() {
        return this.k;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(com.applovin.communicator.AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("crash_applovin_ad_webview".equals(appLovinCommunicatorMessage.getTopic())) {
            a(new java.lang.Runnable() { // from class: com.applovin.impl.adview.a$$ExternalSyntheticLambda13
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.u();
                }
            });
        }
    }

    public void v() {
        if (this.c == null || this.n == null || this.f595a == null || !this.z) {
            com.applovin.impl.sdk.n.i("AppLovinAdView", "Unable to load next ad: AppLovinAdView is not initialized.");
        } else {
            this.d.loadNextAd(this.k, this.j, this.n);
        }
    }

    public void x() {
        if ((this.f595a instanceof com.applovin.impl.s6) && this.t != null && this.t.S() == com.applovin.impl.sdk.ad.b.EnumC0052b.DISMISS) {
            ((com.applovin.impl.s6) this.f595a).dismiss();
        }
    }

    public void z() {
        if (this.v != null || this.w != null) {
            a();
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.f.a("AppLovinAdView", "Ad: " + this.t + " closed.");
        }
        a(this.s);
        com.applovin.impl.fc.b(this.D, this.t);
        this.t = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(android.view.View view, com.applovin.sdk.AppLovinAdSize appLovinAdSize) {
        int iApplyDimension;
        if (view == null) {
            return;
        }
        android.util.DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        java.lang.String label = appLovinAdSize.getLabel();
        com.applovin.sdk.AppLovinAdSize appLovinAdSize2 = com.applovin.sdk.AppLovinAdSize.INTERSTITIAL;
        int iApplyDimension2 = -1;
        if (label.equals(appLovinAdSize2.getLabel())) {
            iApplyDimension = -1;
        } else {
            iApplyDimension = appLovinAdSize.getWidth() == -1 ? displayMetrics.widthPixels : (int) android.util.TypedValue.applyDimension(1, appLovinAdSize.getWidth(), displayMetrics);
        }
        if (!appLovinAdSize.getLabel().equals(appLovinAdSize2.getLabel())) {
            iApplyDimension2 = appLovinAdSize.getHeight() == -1 ? displayMetrics.heightPixels : (int) android.util.TypedValue.applyDimension(1, appLovinAdSize.getHeight(), displayMetrics);
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        }
        layoutParams.width = iApplyDimension;
        layoutParams.height = iApplyDimension2;
        if (layoutParams instanceof android.widget.RelativeLayout.LayoutParams) {
            ((android.widget.RelativeLayout.LayoutParams) layoutParams).addRule(13);
        }
        view.setLayoutParams(layoutParams);
    }

    private void c() {
        a(new java.lang.Runnable() { // from class: com.applovin.impl.adview.a$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.s();
            }
        });
    }

    private void d() {
        a(new java.lang.Runnable() { // from class: com.applovin.impl.adview.a$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.t();
            }
        });
    }

    public static com.applovin.impl.ub f() {
        java.util.concurrent.atomic.AtomicReference atomicReference = H;
        java.lang.Object dVar = atomicReference.get();
        if (dVar == null) {
            synchronized (atomicReference) {
                dVar = atomicReference.get();
                if (dVar == null) {
                    dVar = new com.applovin.impl.ub.d();
                    atomicReference.set(dVar);
                }
            }
        }
        if (dVar == atomicReference) {
            dVar = null;
        }
        return (com.applovin.impl.ub) dVar;
    }

    public com.applovin.adview.AppLovinAdViewEventListener e() {
        return this.E;
    }

    public com.applovin.impl.adview.b g() {
        return this.o;
    }

    public com.applovin.impl.sdk.ad.b i() {
        return this.t;
    }

    public androidx.browser.customtabs.CustomTabsSession j() {
        return this.l;
    }

    public void c(com.applovin.sdk.AppLovinAd appLovinAd) {
        a(appLovinAd, (java.lang.String) null);
    }

    public void c(android.webkit.WebView webView) {
        a(webView, (java.lang.String) null);
    }

    public void b() {
        a(new java.lang.Runnable() { // from class: com.applovin.impl.adview.a$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.r();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(android.webkit.WebView webView) {
        this.t.getAdEventTracker().c(webView);
        com.applovin.impl.adview.k kVar = this.q;
        if (kVar != null && kVar.a()) {
            com.applovin.impl.lg adEventTracker = this.t.getAdEventTracker();
            com.applovin.impl.adview.k kVar2 = this.q;
            adEventTracker.b(webView, java.util.Collections.singletonList(new com.applovin.impl.ng(kVar2, com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier())));
        } else {
            this.t.getAdEventTracker().a((android.view.View) webView);
        }
        this.t.getAdEventTracker().h();
        this.t.getAdEventTracker().g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(android.view.MotionEvent motionEvent) {
        if (this.v == null && (this.t instanceof com.applovin.impl.sdk.ad.a) && this.o != null) {
            com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) this.t;
            android.content.Context context = this.f595a;
            android.app.Activity activityA = context instanceof android.app.Activity ? (android.app.Activity) context : com.applovin.impl.zq.a(this.o, this.c);
            if (activityA != null && !activityA.isFinishing()) {
                android.view.ViewGroup viewGroup = this.b;
                if (viewGroup != null) {
                    viewGroup.removeView(this.o);
                }
                com.applovin.impl.adview.f fVar = new com.applovin.impl.adview.f(aVar, this.o, activityA, this.c);
                this.v = fVar;
                fVar.setOnDismissListener(new android.content.DialogInterface.OnDismissListener() { // from class: com.applovin.impl.adview.a$$ExternalSyntheticLambda9
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(android.content.DialogInterface dialogInterface) {
                        this.f$0.a(dialogInterface);
                    }
                });
                this.v.show();
                com.applovin.impl.fc.c(this.E, this.t, (com.applovin.adview.AppLovinAdView) this.b);
                if (this.t.isOpenMeasurementEnabled()) {
                    this.t.getAdEventTracker().a((android.view.View) this.v.c());
                    return;
                }
                return;
            }
            com.applovin.impl.sdk.n.h("AppLovinAdView", "Unable to expand ad. No Activity found.");
            android.net.Uri uriJ = aVar.j();
            if (uriJ != null) {
                this.d.trackAndLaunchClick(aVar, k(), this, uriJ, motionEvent, this.B, null);
            }
            this.o.a("javascript:al_onFailedExpand();");
        }
    }

    void b(final com.applovin.sdk.AppLovinAd appLovinAd) {
        if (appLovinAd != null) {
            if (!this.A) {
                c(appLovinAd);
            } else {
                this.x.set(appLovinAd);
                if (com.applovin.impl.sdk.n.a()) {
                    this.f.a("AppLovinAdView", "Ad view has paused when an ad was received, ad saved for later");
                }
            }
            a(new java.lang.Runnable() { // from class: com.applovin.impl.adview.a$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(appLovinAd);
                }
            });
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.f.b("AppLovinAdView", "No provided when to the view controller");
        }
        b(-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final int i) {
        if (!this.A) {
            a(this.s);
        }
        a(new java.lang.Runnable() { // from class: com.applovin.impl.adview.a$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(i);
            }
        });
    }

    public void b(android.net.Uri uri) {
        if (this.t != null && this.t.E0() && this.p == null) {
            java.lang.String queryParameter = uri.getQueryParameter("tracking_id");
            if (android.text.TextUtils.isEmpty(queryParameter)) {
                this.c.I();
                if (com.applovin.impl.sdk.n.a()) {
                    this.c.I().b("AppLovinAdView", "Invalid tracking id. Cannot initialize GA");
                    return;
                }
                return;
            }
            android.webkit.WebView webView = new android.webkit.WebView(this.f595a);
            this.p = webView;
            webView.setWebViewClient(new com.applovin.impl.pi());
            this.p.getSettings().setJavaScriptEnabled(true);
            this.p.loadDataWithBaseURL((java.lang.String) this.c.a(com.applovin.impl.sj.A6), "<html><head><link rel=\"icon\" href=\"data:,\"><G-SCRIPT_TAG></head><body></body></html>".replace("<G-SCRIPT_TAG>", "<script src='https://www.googletagmanager.com/gtag/js?id=<G-TRACKING_ID>'></script><script>window.dataLayer = window.dataLayer || [];function gtag(){dataLayer.push(arguments);}gtag('js', new Date());gtag('config', '<G-TRACKING_ID>')</script>".replace("<G-TRACKING_ID>", queryParameter)), "text/html", com.adjust.sdk.Constants.ENCODING, null);
        }
    }

    public com.applovin.impl.g0 h() {
        return this.G;
    }

    public void a(com.applovin.impl.g0 g0Var) {
        this.G = g0Var;
    }

    public void a(com.applovin.sdk.AppLovinAdLoadListener appLovinAdLoadListener) {
        this.C = appLovinAdLoadListener;
    }

    public void a(com.applovin.sdk.AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.D = appLovinAdDisplayListener;
    }

    public void a(com.applovin.adview.AppLovinAdViewEventListener appLovinAdViewEventListener) {
        this.E = appLovinAdViewEventListener;
    }

    public void a(com.applovin.sdk.AppLovinAdClickListener appLovinAdClickListener) {
        this.F = appLovinAdClickListener;
    }

    private void a(com.applovin.adview.AppLovinAdView appLovinAdView, com.applovin.impl.sdk.j jVar, com.applovin.sdk.AppLovinAdSize appLovinAdSize, java.lang.String str, android.content.Context context) {
        if (appLovinAdView == null) {
            throw new java.lang.IllegalArgumentException("No parent view specified");
        }
        if (jVar == null) {
            throw new java.lang.IllegalArgumentException("No sdk specified");
        }
        if (appLovinAdSize != null) {
            this.c = jVar;
            this.d = jVar.j();
            this.f = jVar.I();
            this.g = com.applovin.communicator.AppLovinCommunicator.getInstance(context);
            this.j = appLovinAdSize;
            this.k = str;
            if (!(context instanceof com.applovin.adview.AppLovinFullscreenActivity)) {
                context = context.getApplicationContext();
            }
            this.f595a = context;
            this.b = appLovinAdView;
            this.m = new com.applovin.impl.adview.c(this, jVar);
            this.s = new com.applovin.impl.adview.a.c();
            this.r = new com.applovin.impl.adview.a.d();
            this.n = new com.applovin.impl.adview.a.e(this, jVar);
            a(appLovinAdSize);
            return;
        }
        throw new java.lang.IllegalArgumentException("No ad size specified");
    }

    protected void a(com.applovin.sdk.AppLovinAdSize appLovinAdSize) {
        try {
            if (((java.lang.Boolean) this.c.a(com.applovin.impl.sj.u1)).booleanValue()) {
                this.o = (com.applovin.impl.adview.b) f().a(new com.applovin.impl.ub.a() { // from class: com.applovin.impl.adview.a$$ExternalSyntheticLambda3
                    @Override // com.applovin.impl.ub.a
                    public final java.lang.Object a() {
                        return this.f$0.o();
                    }
                });
            } else {
                this.o = new com.applovin.impl.adview.b(this.c, this.f595a);
            }
            this.o.a(this.m);
            this.o.setBackgroundColor(0);
            this.o.setWillNotCacheDrawing(false);
            this.b.setBackgroundColor(0);
            this.b.addView(this.o);
            b(this.o, appLovinAdSize);
            if (!this.z) {
                a(this.s);
            }
            a(new java.lang.Runnable() { // from class: com.applovin.impl.adview.a$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.p();
                }
            });
            this.z = true;
        } catch (java.lang.Throwable th) {
            com.applovin.impl.sdk.n.c("AppLovinAdView", "Failed to initialize AdWebView", th);
            this.c.D().a("AppLovinAdView", "initAdWebView", th);
            this.y.set(true);
        }
    }

    public void a(com.applovin.adview.AppLovinAdView appLovinAdView, android.content.Context context, com.applovin.sdk.AppLovinAdSize appLovinAdSize, java.lang.String str, com.applovin.sdk.AppLovinSdk appLovinSdk, android.util.AttributeSet attributeSet) {
        if (appLovinAdView == null) {
            throw new java.lang.IllegalArgumentException("No parent view specified");
        }
        if (context == null) {
            com.applovin.impl.sdk.n.h("AppLovinAdView", "Unable to build AppLovinAdView: no context provided. Please use a different constructor for this view.");
            return;
        }
        if (appLovinAdSize == null && (appLovinAdSize = com.applovin.impl.e0.a(attributeSet)) == null) {
            appLovinAdSize = com.applovin.sdk.AppLovinAdSize.BANNER;
        }
        com.applovin.sdk.AppLovinAdSize appLovinAdSize2 = appLovinAdSize;
        if (appLovinSdk == null) {
            appLovinSdk = com.applovin.sdk.AppLovinSdk.getInstance(context);
        }
        if (appLovinSdk != null) {
            a(appLovinAdView, appLovinSdk.a(), appLovinAdSize2, str, context);
            if (com.applovin.impl.e0.b(attributeSet)) {
                v();
            }
        }
    }

    public void a(java.lang.String str, java.lang.Object obj) {
        this.i.put(str, obj);
    }

    public void a(com.applovin.sdk.AppLovinAd appLovinAd, java.lang.String str) {
        if (appLovinAd != null) {
            com.applovin.impl.yp.b(appLovinAd, this.c);
            if (this.z) {
                com.applovin.impl.sdk.ad.b bVar = (com.applovin.impl.sdk.ad.b) com.applovin.impl.yp.a(appLovinAd, this.c);
                if (bVar == null) {
                    com.applovin.impl.sdk.n.h("AppLovinAdView", "Unable to retrieve the loaded ad: " + appLovinAd);
                    com.applovin.impl.fc.a(this.D, "Unable to retrieve the loaded ad");
                    return;
                }
                if (bVar == this.t) {
                    com.applovin.impl.sdk.n.h("AppLovinAdView", "Attempting to show ad again: " + bVar);
                    if (((java.lang.Boolean) this.c.a(com.applovin.impl.sj.M1)).booleanValue()) {
                        if (this.D instanceof com.applovin.impl.pb) {
                            com.applovin.impl.fc.a(this.D, "Attempting to show ad again");
                            return;
                        }
                        throw new java.lang.IllegalStateException("Attempting to show ad again");
                    }
                    return;
                }
                if (com.applovin.impl.sdk.n.a()) {
                    this.f.a("AppLovinAdView", "Rendering ad #" + bVar.getAdIdNumber() + " (" + bVar.getSize() + ")");
                }
                com.applovin.impl.fc.b(this.D, this.t);
                if (this.t != null && this.t.isOpenMeasurementEnabled()) {
                    this.t.getAdEventTracker().f();
                }
                this.x.set(null);
                this.u = null;
                this.t = bVar;
                if (this.t.C0()) {
                    this.l = this.c.w().a(this);
                    this.c.w().b(this.t.A(), this.l);
                }
                if (!this.A && com.applovin.impl.yp.a(this.j)) {
                    this.c.j().trackImpression(bVar);
                }
                if (this.v != null) {
                    c();
                }
                a(this.r);
                return;
            }
            com.applovin.impl.sdk.n.i("AppLovinAdView", "Unable to render ad: AppLovinAdView is not initialized.");
            return;
        }
        throw new java.lang.IllegalArgumentException("No ad specified");
    }

    public void a(final android.webkit.WebView webView, java.lang.String str) {
        if (this.t == null) {
            return;
        }
        a(new java.lang.Runnable() { // from class: com.applovin.impl.adview.a$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                webView.setVisibility(0);
            }
        });
        if (!((java.lang.Boolean) this.c.a(com.applovin.impl.sj.e6)).booleanValue() || (str != null && str.startsWith(this.t.h()))) {
            try {
                if (this.t != this.u) {
                    this.u = this.t;
                    y();
                    this.o.setAdHtmlLoaded(true);
                    if (this.D != null) {
                        this.c.v().d(this.t);
                        this.c.D().a(com.applovin.impl.ka.k, this.t);
                        com.applovin.impl.fc.a(this.D, this.t);
                        this.o.a("javascript:al_onAdViewRendered();");
                    }
                    if ((this.t instanceof com.applovin.impl.sdk.ad.a) && this.t.isOpenMeasurementEnabled()) {
                        this.c.i0().a(new com.applovin.impl.jn(this.c, "StartOMSDK", new java.lang.Runnable() { // from class: com.applovin.impl.adview.a$$ExternalSyntheticLambda11
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f$0.b(webView);
                            }
                        }), com.applovin.impl.tm.b.OTHER, 500L);
                    }
                }
            } catch (java.lang.Throwable th) {
                com.applovin.impl.sdk.n.c("AppLovinAdView", "Exception while notifying ad display listener", th);
                com.applovin.impl.sdk.j jVar = this.c;
                if (jVar != null) {
                    jVar.D().a("AppLovinAdView", "onAdHtmlLoaded", th);
                }
            }
        }
    }

    public void a(final android.view.MotionEvent motionEvent) {
        a(new java.lang.Runnable() { // from class: com.applovin.impl.adview.a$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(motionEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(android.content.DialogInterface dialogInterface) {
        a();
    }

    public void a() {
        a(new java.lang.Runnable() { // from class: com.applovin.impl.adview.a$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.q();
            }
        });
    }

    public void a(com.applovin.impl.sdk.ad.b bVar, com.applovin.adview.AppLovinAdView appLovinAdView, android.net.Uri uri, android.view.MotionEvent motionEvent, android.os.Bundle bundle) {
        if (appLovinAdView != null) {
            this.d.trackAndLaunchClick(bVar, appLovinAdView, this, uri, motionEvent, this.B, bundle);
        } else if (com.applovin.impl.sdk.n.a()) {
            this.f.b("AppLovinAdView", "Unable to process ad click - AppLovinAdView destroyed prematurely");
        }
        com.applovin.impl.fc.a(this.F, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.sdk.AppLovinAd appLovinAd) {
        if (this.y.compareAndSet(true, false)) {
            a(this.j);
        }
        try {
            if (this.C != null) {
                this.C.adReceived(appLovinAd);
            }
        } catch (java.lang.Throwable th) {
            com.applovin.impl.sdk.n.h("AppLovinAdView", "Exception while running ad load callback: " + th.getMessage());
            com.applovin.impl.sdk.j jVar = this.c;
            if (jVar != null) {
                jVar.D().a("AppLovinAdView", "notifyAdLoaded", th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i) {
        try {
            if (this.C != null) {
                this.C.failedToReceiveAd(i);
            }
        } catch (java.lang.Throwable th) {
            com.applovin.impl.sdk.n.c("AppLovinAdView", "Exception while running app load callback", th);
            com.applovin.impl.sdk.j jVar = this.c;
            if (jVar != null) {
                jVar.D().a("AppLovinAdView", "notifyAdLoadFailed", th);
            }
        }
    }

    private void a(java.lang.Runnable runnable) {
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(runnable);
    }

    public void a(com.applovin.impl.adview.a.b bVar) {
        this.h = bVar;
    }

    public void a(android.net.Uri uri) {
        if (this.t == null || !this.t.E0()) {
            return;
        }
        if (this.p == null) {
            this.c.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.c.I().a("AppLovinAdView", "GA is not initialized. Cannot fire GA event");
                return;
            }
            return;
        }
        final java.lang.String queryParameter = uri.getQueryParameter("event_name");
        final java.lang.String queryParameter2 = uri.getQueryParameter("event_params_json");
        if (android.text.TextUtils.isEmpty(queryParameter)) {
            this.c.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.c.I().a("AppLovinAdView", "Invalid GA event name. Cannot fire GA event");
                return;
            }
            return;
        }
        a(new java.lang.Runnable() { // from class: com.applovin.impl.adview.a$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(queryParameter2, queryParameter);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(str)) {
            str3 = "gtag('event', '" + str2 + "', " + str + ");";
        } else {
            str3 = "gtag('event', '" + str2 + "')";
        }
        com.applovin.impl.tr.a(this.p, str3);
    }
}

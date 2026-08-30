package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o9 implements com.applovin.impl.jb.a, com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver, com.applovin.impl.adview.a.b {
    protected boolean A;
    protected com.applovin.sdk.AppLovinAdClickListener B;
    protected com.applovin.sdk.AppLovinAdDisplayListener C;
    protected com.applovin.sdk.AppLovinAdVideoPlaybackListener D;
    protected final com.applovin.impl.jb E;
    protected com.applovin.impl.go F;
    protected com.applovin.impl.go G;
    protected boolean H;
    private final com.applovin.impl.j2 I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.ad.b f1113a;
    protected final com.applovin.impl.sdk.j b;
    protected final com.applovin.impl.sdk.n c;
    protected android.app.Activity d;
    private final com.applovin.impl.p g;
    private final com.applovin.impl.sdk.h.a h;
    protected com.applovin.adview.AppLovinAdView i;
    protected com.applovin.impl.adview.k j;
    protected final com.applovin.impl.adview.g k;
    protected final com.applovin.impl.adview.g l;
    protected long q;
    private boolean r;
    protected boolean s;
    protected int t;
    protected boolean u;
    private final android.os.Handler f = new android.os.Handler(android.os.Looper.getMainLooper());
    protected final long m = android.os.SystemClock.elapsedRealtime();
    private final java.util.concurrent.atomic.AtomicBoolean n = new java.util.concurrent.atomic.AtomicBoolean();
    private final java.util.concurrent.atomic.AtomicBoolean o = new java.util.concurrent.atomic.AtomicBoolean();
    protected long p = -1;
    private int v = 0;
    private final java.util.ArrayList w = new java.util.ArrayList();
    protected int x = 0;
    protected int y = 0;
    protected int z = com.applovin.impl.sdk.h.i;
    private boolean J = false;

    public interface d {
        void a(com.applovin.impl.o9 o9Var);

        void a(java.lang.String str, java.lang.Throwable th);
    }

    public abstract void a(long j);

    public abstract void a(android.view.ViewGroup viewGroup);

    public void h() {
        if (com.applovin.impl.sdk.n.a()) {
            this.c.d("AppLovinFullscreenActivity", "Handling al_onPoststitialShow evaluation error");
        }
    }

    public void i() {
        if (com.applovin.impl.sdk.n.a()) {
            this.c.d("AppLovinFullscreenActivity", "Handling render process crash");
        }
        this.s = true;
    }

    protected boolean k() {
        return com.applovin.sdk.AppLovinAdType.INCENTIVIZED == this.f1113a.getType() || com.applovin.sdk.AppLovinAdType.AUTO_INCENTIVIZED == this.f1113a.getType();
    }

    protected abstract void o();

    public void s() {
        if (com.applovin.impl.sdk.n.a()) {
            this.c.d("AppLovinFullscreenActivity", "onBackPressed()");
        }
        if (this.J) {
            f();
        }
        if (this.f1113a.W0()) {
            c("javascript:onBackPressed();");
        }
    }

    public void u() {
        if (com.applovin.impl.sdk.n.a()) {
            this.c.d("AppLovinFullscreenActivity", "onPause()");
        }
        b("javascript:al_onAppPaused();");
        if (this.E.b()) {
            this.E.a();
        }
        p();
    }

    public void v() {
        if (com.applovin.impl.sdk.n.a()) {
            this.c.d("AppLovinFullscreenActivity", "onResume()");
        }
        b("javascript:al_onAppResumed();");
        q();
        if (this.E.b()) {
            this.E.a();
        }
    }

    public void w() {
        if (com.applovin.impl.sdk.n.a()) {
            this.c.d("AppLovinFullscreenActivity", "onStop()");
        }
    }

    public abstract void x();

    public abstract void y();

    static /* synthetic */ int c(com.applovin.impl.o9 o9Var) {
        int i = o9Var.v;
        o9Var.v = i + 1;
        return i;
    }

    o9(com.applovin.impl.sdk.ad.b bVar, android.app.Activity activity, java.util.Map map, com.applovin.impl.sdk.j jVar, com.applovin.sdk.AppLovinAdClickListener appLovinAdClickListener, com.applovin.sdk.AppLovinAdDisplayListener appLovinAdDisplayListener, com.applovin.sdk.AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.f1113a = bVar;
        this.b = jVar;
        this.c = jVar.I();
        this.d = activity;
        this.B = appLovinAdClickListener;
        this.C = appLovinAdDisplayListener;
        this.D = appLovinAdVideoPlaybackListener;
        com.applovin.impl.jb jbVar = new com.applovin.impl.jb(activity, jVar);
        this.E = jbVar;
        jbVar.a(this);
        this.I = new com.applovin.impl.j2(jVar);
        com.applovin.impl.o9.e eVar = new com.applovin.impl.o9.e(this, null);
        if (((java.lang.Boolean) jVar.a(com.applovin.impl.sj.A2)).booleanValue()) {
            com.applovin.impl.sdk.AppLovinBroadcastManager.registerReceiver(this, new android.content.IntentFilter("com.applovin.render_process_gone"));
        }
        if (((java.lang.Boolean) jVar.a(com.applovin.impl.sj.G2)).booleanValue()) {
            com.applovin.impl.sdk.AppLovinBroadcastManager.registerReceiver(this, new android.content.IntentFilter("com.applovin.al_onPoststitialShow_evaluation_error"));
        }
        com.applovin.impl.m9 m9Var = new com.applovin.impl.m9(jVar.q0(), com.applovin.sdk.AppLovinAdSize.INTERSTITIAL, activity);
        this.i = m9Var;
        m9Var.setAdClickListener(eVar);
        this.i.setAdDisplayListener(new com.applovin.impl.o9.a());
        bVar.e().putString("ad_view_address", com.applovin.impl.zq.a(this.i));
        this.i.getController().a(this);
        com.applovin.impl.da daVar = new com.applovin.impl.da(map, jVar);
        if (daVar.c()) {
            this.j = new com.applovin.impl.adview.k(daVar, activity);
        }
        jVar.j().trackImpression(bVar);
        java.util.List listL = bVar.L();
        if (bVar.p() < 0 && listL == null) {
            this.k = null;
        } else {
            com.applovin.impl.adview.g gVar = new com.applovin.impl.adview.g(bVar.n(), activity);
            this.k = gVar;
            gVar.setVisibility(8);
            gVar.setOnClickListener(eVar);
        }
        com.applovin.impl.adview.g gVar2 = new com.applovin.impl.adview.g(com.applovin.impl.adview.e.a.WHITE_ON_TRANSPARENT, activity);
        this.l = gVar2;
        gVar2.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.applovin.impl.o9$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                this.f$0.b(view);
            }
        });
        if (bVar.Y0()) {
            this.h = new com.applovin.impl.o9.b();
        } else {
            this.h = null;
        }
        this.g = new com.applovin.impl.o9.c();
    }

    class a implements com.applovin.sdk.AppLovinAdDisplayListener {
        a() {
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(com.applovin.sdk.AppLovinAd appLovinAd) {
            com.applovin.impl.sdk.n nVar = com.applovin.impl.o9.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.o9.this.c.a("AppLovinFullscreenActivity", "Web content rendered");
            }
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(com.applovin.sdk.AppLovinAd appLovinAd) {
            com.applovin.impl.sdk.n nVar = com.applovin.impl.o9.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.o9.this.c.a("AppLovinFullscreenActivity", "Closing from WebView");
            }
            com.applovin.impl.o9.this.f();
        }
    }

    class b implements com.applovin.impl.sdk.h.a {
        b() {
        }

        @Override // com.applovin.impl.sdk.h.a
        public void a(int i) {
            com.applovin.impl.o9 o9Var = com.applovin.impl.o9.this;
            if (o9Var.z != com.applovin.impl.sdk.h.i) {
                o9Var.A = true;
            }
            com.applovin.impl.adview.b bVarG = o9Var.i.getController().g();
            if (bVarG == null) {
                com.applovin.impl.sdk.n nVar = com.applovin.impl.o9.this.c;
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.o9.this.c.k("AppLovinFullscreenActivity", "Unable to handle ringer mode change: no valid web view.");
                }
            } else if (com.applovin.impl.sdk.h.a(i) && !com.applovin.impl.sdk.h.a(com.applovin.impl.o9.this.z)) {
                bVarG.a("javascript:al_muteSwitchOn();");
            } else if (i == 2) {
                bVarG.a("javascript:al_muteSwitchOff();");
            }
            com.applovin.impl.o9.this.z = i;
        }
    }

    class c extends com.applovin.impl.p {
        c() {
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
            if (!activity.getClass().getName().equals(com.applovin.impl.yp.l(activity.getApplicationContext())) || com.applovin.impl.o9.this.o.get()) {
                return;
            }
            com.applovin.impl.sdk.n.h("AppLovinFullscreenActivity", "Dismissing on-screen ad due to app relaunched via launcher.");
            try {
                com.applovin.impl.o9.this.f();
            } catch (java.lang.Throwable th) {
                com.applovin.impl.sdk.n.c("AppLovinFullscreenActivity", "Failed to dismiss ad.", th);
                try {
                    com.applovin.impl.o9.this.n();
                } catch (java.lang.Throwable unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(android.view.View view) {
        f();
    }

    private void z() {
        if (this.h != null) {
            this.b.o().a(this.h);
        }
        if (this.g != null) {
            this.b.e().a(this.g);
        }
    }

    protected boolean a(boolean z) {
        java.util.List listA = com.applovin.impl.yp.a(z, this.f1113a, this.b, this.d);
        if (listA.isEmpty()) {
            return false;
        }
        if (((java.lang.Boolean) this.b.a(com.applovin.impl.sj.G5)).booleanValue()) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.b("AppLovinFullscreenActivity", "Dismissing ad due to missing resources: " + listA);
            }
            com.applovin.impl.sb.a(this.f1113a, this.C, "Missing ad resources", null, null);
            f();
            java.util.HashMap map = new java.util.HashMap();
            com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("error_message", "Missing ad resources: " + listA, map);
            com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("details", "Failing ad display", map);
            this.b.D().a(com.applovin.impl.ka.Q, "missingCachedAdResources", (java.util.Map) map);
            return ((java.lang.Boolean) this.b.a(com.applovin.impl.sj.I5)).booleanValue();
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.c.b("AppLovinFullscreenActivity", "Streaming ad due to missing ad resources: " + listA);
        }
        this.f1113a.N0();
        java.util.HashMap map2 = new java.util.HashMap();
        com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("error_message", "Missing ad resources: " + listA, map2);
        com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("details", "Streaming ad", map2);
        this.b.D().a(com.applovin.impl.ka.Q, "missingCachedAdResources", (java.util.Map) map2);
        return false;
    }

    public void f() {
        this.r = true;
        if (com.applovin.impl.sdk.n.a()) {
            this.c.d("AppLovinFullscreenActivity", "dismiss()");
        }
        com.applovin.impl.sdk.ad.b bVar = this.f1113a;
        if (bVar != null) {
            bVar.getAdEventTracker().f();
        }
        this.f.removeCallbacksAndMessages(null);
        com.applovin.impl.sdk.ad.b bVar2 = this.f1113a;
        a("javascript:al_onPoststitialDismiss();", bVar2 != null ? bVar2.C() : 0L);
        n();
        this.I.b();
        if (this.h != null) {
            this.b.o().b(this.h);
        }
        if (this.g != null) {
            this.b.e().b(this.g);
        }
        if (l()) {
            this.d.finish();
            return;
        }
        this.b.I();
        if (com.applovin.impl.sdk.n.a()) {
            this.b.I().a("AppLovinFullscreenActivity", "Fullscreen ad shown in container view dismissed, destroying the presenter.");
        }
        t();
    }

    public boolean j() {
        return this.r;
    }

    public void t() {
        com.applovin.adview.AppLovinAdView appLovinAdView = this.i;
        if (appLovinAdView != null) {
            android.view.ViewParent parent = appLovinAdView.getParent();
            this.i.destroy();
            this.i = null;
            if ((parent instanceof android.view.ViewGroup) && l()) {
                ((android.view.ViewGroup) parent).removeAllViews();
            }
        }
        o();
        n();
        this.B = null;
        this.C = null;
        this.D = null;
        this.d = null;
        com.applovin.impl.sdk.AppLovinBroadcastManager.unregisterReceiver(this);
    }

    public static void a(com.applovin.impl.sdk.ad.b bVar, com.applovin.sdk.AppLovinAdClickListener appLovinAdClickListener, com.applovin.sdk.AppLovinAdDisplayListener appLovinAdDisplayListener, com.applovin.sdk.AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, java.util.Map map, com.applovin.impl.sdk.j jVar, android.app.Activity activity, com.applovin.impl.o9.d dVar) {
        com.applovin.impl.o9 p9Var;
        boolean zI1 = bVar.i1();
        if (bVar instanceof com.applovin.impl.aq) {
            if (zI1) {
                try {
                    p9Var = new com.applovin.impl.r9(bVar, activity, map, jVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                } catch (java.lang.Throwable th) {
                    jVar.I();
                    if (com.applovin.impl.sdk.n.a()) {
                        jVar.I().d("AppLovinFullscreenActivity", "Failed to create ExoPlayer presenter to show the ad. Falling back to using native media player presenter.", th);
                    }
                    jVar.D().a("AppLovinFullscreenActivity", "createVastVideoAdExoPlayerPresenter", th, com.applovin.impl.la.a(bVar));
                    try {
                        p9Var = new com.applovin.impl.s9(bVar, activity, map, jVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                    } catch (java.lang.Throwable th2) {
                        dVar.a("Failed to create FullscreenVastVideoAdPresenter with sdk: " + jVar + " and throwable: " + th2.getMessage(), th2);
                        return;
                    }
                }
            } else {
                try {
                    p9Var = new com.applovin.impl.s9(bVar, activity, map, jVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                } catch (java.lang.Throwable th3) {
                    dVar.a("Failed to create FullscreenVastVideoAdPresenter with sdk: " + jVar + " and throwable: " + th3.getMessage(), th3);
                    return;
                }
            }
        } else if (bVar.hasVideoUrl()) {
            if (bVar.M0()) {
                try {
                    p9Var = new com.applovin.impl.w9(bVar, activity, map, jVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                } catch (java.lang.Throwable th4) {
                    dVar.a("Failed to create FullscreenWebVideoAdPresenter with sdk: " + jVar + " and throwable: " + th4.getMessage(), th4);
                    return;
                }
            } else if (zI1) {
                try {
                    p9Var = new com.applovin.impl.t9(bVar, activity, map, jVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                } catch (java.lang.Throwable th5) {
                    jVar.I();
                    if (com.applovin.impl.sdk.n.a()) {
                        jVar.I().d("AppLovinFullscreenActivity", "Failed to create ExoPlayer presenter to show the ad. Falling back to using native media player presenter.", th5);
                    }
                    jVar.D().a("AppLovinFullscreenActivity", "createVideoAdExoPlayerPresenter", th5, com.applovin.impl.la.a(bVar));
                    try {
                        p9Var = new com.applovin.impl.u9(bVar, activity, map, jVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                    } catch (java.lang.Throwable th6) {
                        dVar.a("Failed to create FullscreenVideoAdExoPlayerPresenter with sdk: " + jVar + " and throwable: " + th6.getMessage(), th6);
                        return;
                    }
                }
            } else {
                try {
                    p9Var = new com.applovin.impl.u9(bVar, activity, map, jVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                } catch (java.lang.Throwable th7) {
                    dVar.a("Failed to create FullscreenVideoAdPresenter with sdk: " + jVar + " and throwable: " + th7.getMessage(), th7);
                    return;
                }
            }
        } else {
            try {
                p9Var = new com.applovin.impl.p9(bVar, activity, map, jVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (java.lang.Throwable th8) {
                dVar.a("Failed to create FullscreenGraphicAdPresenter with sdk: " + jVar + " and throwable: " + th8.getMessage(), th8);
                return;
            }
        }
        p9Var.z();
        dVar.a(p9Var);
    }

    protected int g() {
        int iR = this.f1113a.r();
        return (iR <= 0 && ((java.lang.Boolean) this.b.a(com.applovin.impl.sj.x2)).booleanValue()) ? this.t + 1 : iR;
    }

    protected void n() {
        if (this.o.compareAndSet(false, true)) {
            com.applovin.impl.fc.b(this.C, this.f1113a);
            this.b.B().b(this.f1113a);
            this.b.D().a(com.applovin.impl.ka.l, this.f1113a);
        }
    }

    protected boolean l() {
        return this.d instanceof com.applovin.adview.AppLovinFullscreenActivity;
    }

    protected void p() {
        com.applovin.impl.go goVar = this.F;
        if (goVar != null) {
            goVar.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(final com.applovin.impl.adview.g gVar, final java.lang.Runnable runnable) {
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.o9$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.applovin.impl.o9.b(gVar, runnable);
            }
        });
    }

    protected void q() {
        com.applovin.impl.go goVar = this.F;
        if (goVar != null) {
            goVar.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m() {
        if (this.f1113a.H0().getAndSet(true)) {
            return;
        }
        this.b.i0().a((com.applovin.impl.yl) new com.applovin.impl.en(this.f1113a, this.b), com.applovin.impl.tm.b.OTHER);
    }

    protected void r() {
        com.applovin.impl.adview.b bVarG;
        if (this.i == null || !this.f1113a.z0() || (bVarG = this.i.getController().g()) == null) {
            return;
        }
        this.I.a(bVarG, new com.applovin.impl.j2.c() { // from class: com.applovin.impl.o9$$ExternalSyntheticLambda5
            @Override // com.applovin.impl.j2.c
            public final void a(android.view.View view) {
                this.f$0.a(view);
            }
        });
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(android.content.Intent intent, java.util.Map map) {
        if ("com.applovin.render_process_gone".equals(intent.getAction()) && !this.s) {
            i();
        } else if ("com.applovin.al_onPoststitialShow_evaluation_error".equals(intent.getAction())) {
            h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class e implements com.applovin.sdk.AppLovinAdClickListener, android.view.View.OnClickListener {
        private e() {
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(com.applovin.sdk.AppLovinAd appLovinAd) {
            com.applovin.impl.sdk.n nVar = com.applovin.impl.o9.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.o9.this.c.a("AppLovinFullscreenActivity", "Clicking through graphic");
            }
            com.applovin.impl.fc.a(com.applovin.impl.o9.this.B, appLovinAd);
            com.applovin.impl.o9.this.y++;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            com.applovin.impl.o9 o9Var = com.applovin.impl.o9.this;
            if (view == o9Var.k && ((java.lang.Boolean) o9Var.b.a(com.applovin.impl.sj.e2)).booleanValue()) {
                com.applovin.impl.o9.c(com.applovin.impl.o9.this);
                if (com.applovin.impl.o9.this.f1113a.W0()) {
                    com.applovin.impl.o9.this.c("javascript:al_onCloseButtonTapped(" + com.applovin.impl.o9.this.v + "," + com.applovin.impl.o9.this.x + "," + com.applovin.impl.o9.this.y + ");");
                }
                java.util.List listL = com.applovin.impl.o9.this.f1113a.L();
                com.applovin.impl.sdk.n nVar = com.applovin.impl.o9.this.c;
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.o9.this.c.a("AppLovinFullscreenActivity", "Handling close button tap " + com.applovin.impl.o9.this.v + " with multi close delay: " + listL);
                }
                if (listL != null && listL.size() > com.applovin.impl.o9.this.v) {
                    com.applovin.impl.o9.this.w.add(java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - com.applovin.impl.o9.this.p));
                    java.util.List listJ = com.applovin.impl.o9.this.f1113a.J();
                    if (listJ != null && listJ.size() > com.applovin.impl.o9.this.v) {
                        com.applovin.impl.o9 o9Var2 = com.applovin.impl.o9.this;
                        o9Var2.k.a((com.applovin.impl.adview.e.a) listJ.get(o9Var2.v));
                    }
                    com.applovin.impl.sdk.n nVar2 = com.applovin.impl.o9.this.c;
                    if (com.applovin.impl.sdk.n.a()) {
                        com.applovin.impl.o9.this.c.a("AppLovinFullscreenActivity", "Scheduling next close button with delay: " + listL.get(com.applovin.impl.o9.this.v));
                    }
                    com.applovin.impl.o9.this.k.setVisibility(8);
                    com.applovin.impl.o9 o9Var3 = com.applovin.impl.o9.this;
                    o9Var3.a(o9Var3.k, ((java.lang.Integer) listL.get(o9Var3.v)).intValue(), new java.lang.Runnable() { // from class: com.applovin.impl.o9$e$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.a();
                        }
                    });
                    return;
                }
                com.applovin.impl.o9.this.f();
                return;
            }
            com.applovin.impl.sdk.n nVar3 = com.applovin.impl.o9.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.o9.this.c.b("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            com.applovin.impl.o9.this.p = android.os.SystemClock.elapsedRealtime();
        }

        /* synthetic */ e(com.applovin.impl.o9 o9Var, com.applovin.impl.o9.a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(final com.applovin.impl.adview.g gVar, final java.lang.Runnable runnable) {
        com.applovin.impl.zq.a(gVar, 400L, new java.lang.Runnable() { // from class: com.applovin.impl.o9$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                com.applovin.impl.o9.a(gVar, runnable);
            }
        });
    }

    protected void c(java.lang.String str) {
        a(str, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(java.lang.String str) {
        com.applovin.impl.adview.b bVarG;
        com.applovin.adview.AppLovinAdView appLovinAdView = this.i;
        if (appLovinAdView == null || (bVarG = appLovinAdView.getController().g()) == null) {
            return;
        }
        bVarG.a(str);
    }

    protected void b(java.lang.String str) {
        if (this.f1113a.D0()) {
            a(str, 0L);
        }
    }

    public void b(boolean z) {
        if (com.applovin.impl.sdk.n.a()) {
            this.c.d("AppLovinFullscreenActivity", "onWindowFocusChanged(boolean) - " + z);
        }
        b("javascript:al_onWindowFocusChanged( " + z + " );");
        com.applovin.impl.go goVar = this.G;
        if (goVar != null) {
            if (z) {
                goVar.e();
            } else {
                goVar.d();
            }
        }
    }

    protected void b(long j) {
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a("AppLovinFullscreenActivity", "Scheduling report reward in " + java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(j) + " seconds...");
        }
        this.F = com.applovin.impl.go.a(j, this.b, new java.lang.Runnable() { // from class: com.applovin.impl.o9$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m();
            }
        });
    }

    protected void c(boolean z) {
        a(z, ((java.lang.Long) this.b.a(com.applovin.impl.sj.y2)).longValue());
        com.applovin.impl.fc.a(this.C, this.f1113a);
        this.b.B().a(this.f1113a);
        if (this.f1113a.hasVideoUrl() || k()) {
            com.applovin.impl.fc.a(this.D, this.f1113a);
        }
        new com.applovin.impl.xg(this.d).a(this.f1113a);
        this.f1113a.setHasShown(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(com.applovin.impl.adview.g gVar, java.lang.Runnable runnable) {
        gVar.bringToFront();
        runnable.run();
    }

    protected void a(final java.lang.String str, long j) {
        if (j < 0 || !com.applovin.impl.sdk.utils.StringUtils.isValidString(str)) {
            return;
        }
        a(new java.lang.Runnable() { // from class: com.applovin.impl.o9$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(str);
            }
        }, j);
    }

    protected void a(int i, boolean z, boolean z2, long j) {
        if (this.n.compareAndSet(false, true)) {
            if (this.f1113a.hasVideoUrl() || k()) {
                com.applovin.impl.fc.a(this.D, this.f1113a, i, z2);
            }
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.m;
            this.b.j().trackVideoEnd(this.f1113a, java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(jElapsedRealtime), i, z);
            long jElapsedRealtime2 = this.p != -1 ? android.os.SystemClock.elapsedRealtime() - this.p : -1L;
            this.b.j().trackFullScreenAdClosed(this.f1113a, jElapsedRealtime2, this.w, j, this.A, this.z);
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a("AppLovinFullscreenActivity", "Video ad ended at percent: " + i + "%, elapsedTime: " + jElapsedRealtime + "ms, skipTimeMillis: " + j + "ms, closeTimeMillis: " + jElapsedRealtime2 + "ms");
            }
        }
    }

    protected void a(boolean z, long j) {
        if (this.f1113a.O0()) {
            a(z ? "javascript:al_mute();" : "javascript:al_unmute();", j);
        }
    }

    public void a(int i, android.view.KeyEvent keyEvent) {
        if (this.c == null || !com.applovin.impl.sdk.n.a()) {
            return;
        }
        this.c.d("AppLovinFullscreenActivity", "onKeyDown(int, KeyEvent) -  " + i + ", " + keyEvent);
    }

    protected void a(java.lang.Runnable runnable, long j) {
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThreadDelayed(runnable, j, this.f);
    }

    protected void a(final com.applovin.impl.adview.g gVar, long j, final java.lang.Runnable runnable) {
        if (j >= ((java.lang.Long) this.b.a(com.applovin.impl.sj.d2)).longValue()) {
            return;
        }
        this.G = com.applovin.impl.go.a(java.util.concurrent.TimeUnit.SECONDS.toMillis(j), this.b, new java.lang.Runnable() { // from class: com.applovin.impl.o9$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                com.applovin.impl.o9.c(gVar, runnable);
            }
        });
    }

    public void a(android.content.res.Configuration configuration) {
        if (com.applovin.impl.sdk.n.a()) {
            this.c.d("AppLovinFullscreenActivity", "onConfigurationChanged(Configuration) -  " + configuration);
        }
    }

    @Override // com.applovin.impl.adview.a.b
    public void a(com.applovin.impl.adview.a aVar) {
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a("AppLovinFullscreenActivity", "Fully watched from ad web view...");
        }
        this.H = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(android.view.View view) {
        com.applovin.impl.adview.g gVar;
        if (com.applovin.impl.yp.a(com.applovin.impl.sj.P0, this.b)) {
            this.b.A().c(this.f1113a, com.applovin.impl.sdk.j.m());
        }
        this.b.D().a(com.applovin.impl.ka.P, com.applovin.impl.la.a(this.f1113a, true, this.b));
        if (((java.lang.Boolean) this.b.a(com.applovin.impl.sj.X5)).booleanValue()) {
            f();
            return;
        }
        this.J = ((java.lang.Boolean) this.b.a(com.applovin.impl.sj.Y5)).booleanValue();
        if (!((java.lang.Boolean) this.b.a(com.applovin.impl.sj.Z5)).booleanValue() || (gVar = this.k) == null) {
            return;
        }
        gVar.setVisibility(0);
    }
}

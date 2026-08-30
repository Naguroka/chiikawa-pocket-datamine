package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class w9 extends com.applovin.impl.o9 implements com.applovin.impl.g0 {
    private final com.applovin.impl.x9 K;
    private final com.applovin.impl.adview.g L;
    private final android.widget.ImageView M;
    private final com.applovin.impl.o N;
    private final boolean O;
    private double P;
    private double Q;
    private final java.util.concurrent.atomic.AtomicBoolean R;
    private final java.util.concurrent.atomic.AtomicBoolean S;
    private boolean T;
    private long U;
    private long V;

    @Override // com.applovin.impl.o9
    public void a(long j) {
    }

    @Override // com.applovin.impl.jb.a
    public void c() {
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a("AppLovinFullscreenActivity", "Continue video from prompt - will resume in onWindowFocusChanged(true) when alert dismisses");
        }
    }

    @Override // com.applovin.impl.o9
    public void x() {
    }

    public w9(com.applovin.impl.sdk.ad.b bVar, android.app.Activity activity, java.util.Map map, com.applovin.impl.sdk.j jVar, com.applovin.sdk.AppLovinAdClickListener appLovinAdClickListener, com.applovin.sdk.AppLovinAdDisplayListener appLovinAdDisplayListener, com.applovin.sdk.AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, jVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.K = new com.applovin.impl.x9(this.f1113a, this.d, this.b);
        boolean zK0 = this.f1113a.K0();
        this.O = zK0;
        this.R = new java.util.concurrent.atomic.AtomicBoolean();
        this.S = new java.util.concurrent.atomic.AtomicBoolean();
        this.T = com.applovin.impl.yp.e(this.b);
        this.U = -2L;
        this.V = 0L;
        com.applovin.impl.w9.b bVar2 = new com.applovin.impl.w9.b();
        if (bVar.m0() >= 0) {
            com.applovin.impl.adview.g gVar = new com.applovin.impl.adview.g(bVar.d0(), activity);
            this.L = gVar;
            gVar.setVisibility(8);
            gVar.setOnClickListener(bVar2);
        } else {
            this.L = null;
        }
        if (a(this.T, jVar)) {
            android.widget.ImageView imageView = new android.widget.ImageView(activity);
            this.M = imageView;
            imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
            imageView.setClickable(true);
            imageView.setOnClickListener(bVar2);
            d(this.T);
        } else {
            this.M = null;
        }
        if (zK0) {
            com.applovin.impl.o oVar = new com.applovin.impl.o(activity, ((java.lang.Integer) jVar.a(com.applovin.impl.sj.w2)).intValue(), android.R.attr.progressBarStyleLarge);
            this.N = oVar;
            oVar.setColor(android.graphics.Color.parseColor("#75FFFFFF"));
            oVar.setBackgroundColor(android.graphics.Color.parseColor("#00000000"));
            oVar.setVisibility(8);
            return;
        }
        this.N = null;
    }

    @Override // com.applovin.impl.o9
    public void y() {
        a((android.view.ViewGroup) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.applovin.impl.adview.g gVar = this.k;
        if (gVar != null) {
            arrayList.add(new com.applovin.impl.ng(gVar, com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose.CLOSE_AD, "close button"));
        }
        com.applovin.impl.adview.k kVar = this.j;
        if (kVar != null && kVar.a()) {
            com.applovin.impl.adview.k kVar2 = this.j;
            arrayList.add(new com.applovin.impl.ng(kVar2, com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier()));
        }
        this.f1113a.getAdEventTracker().b(this.i, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G() {
        if (this.S.compareAndSet(false, true)) {
            a(this.L, this.f1113a.m0(), new java.lang.Runnable() { // from class: com.applovin.impl.w9$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.C();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C() {
        this.U = -1L;
        this.V = android.os.SystemClock.elapsedRealtime();
    }

    public void K() {
        this.U = android.os.SystemClock.elapsedRealtime() - this.V;
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a("AppLovinFullscreenActivity", "Attempting to skip video with skip time: " + this.U + "ms");
        }
        if (H()) {
            p();
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a("AppLovinFullscreenActivity", "Prompting incentivized ad close warning");
            }
            this.E.e();
            return;
        }
        A();
    }

    private void A() {
        this.x++;
        if (this.f1113a.B()) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a("AppLovinFullscreenActivity", "Dismissing ad on video skip...");
            }
            f();
        } else {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a("AppLovinFullscreenActivity", "Skipping video...");
            }
            J();
        }
    }

    public void J() {
        if (this.R.compareAndSet(false, true)) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a("AppLovinFullscreenActivity", "Showing postitial...");
            }
            c("javascript:al_showPostitial();");
            com.applovin.impl.adview.g gVar = this.L;
            if (gVar != null) {
                gVar.setVisibility(8);
            }
            android.widget.ImageView imageView = this.M;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            com.applovin.impl.o oVar = this.N;
            if (oVar != null) {
                oVar.b();
            }
            if (this.k != null) {
                if (this.f1113a.p() >= 0) {
                    a(this.k, this.f1113a.p(), new java.lang.Runnable() { // from class: com.applovin.impl.w9$$ExternalSyntheticLambda1
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.E();
                        }
                    });
                } else {
                    this.k.setVisibility(0);
                }
            }
            this.i.getController().E();
            r();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E() {
        this.p = android.os.SystemClock.elapsedRealtime();
    }

    @Override // com.applovin.impl.o9
    public void i() {
        super.i();
        I();
    }

    @Override // com.applovin.impl.o9
    public void h() {
        super.h();
        I();
    }

    private void I() {
        this.K.a(this.l);
        this.p = android.os.SystemClock.elapsedRealtime();
        this.P = 100.0d;
    }

    @Override // com.applovin.impl.g0
    public void e() {
        J();
    }

    @Override // com.applovin.impl.g0
    public void b(double d) {
        c("javascript:al_setVideoMuted(" + this.T + ");");
        com.applovin.impl.o oVar = this.N;
        if (oVar != null) {
            oVar.b();
        }
        if (this.L != null) {
            G();
        }
        this.i.getController().D();
        this.Q = d;
        F();
        if (this.f1113a.f1()) {
            this.E.b(this.f1113a, (java.lang.Runnable) null);
        }
    }

    @Override // com.applovin.impl.g0
    public void d() {
        com.applovin.impl.o oVar = this.N;
        if (oVar != null) {
            oVar.b();
        }
    }

    private void d(boolean z) {
        if (com.applovin.impl.z3.f()) {
            android.graphics.drawable.AnimatedVectorDrawable animatedVectorDrawable = (android.graphics.drawable.AnimatedVectorDrawable) this.d.getDrawable(z ? com.applovin.sdk.R.drawable.applovin_ic_unmute_to_mute : com.applovin.sdk.R.drawable.applovin_ic_mute_to_unmute);
            if (animatedVectorDrawable != null) {
                this.M.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
                this.M.setImageDrawable(animatedVectorDrawable);
                animatedVectorDrawable.start();
                return;
            }
        }
        com.applovin.impl.sdk.utils.ImageViewUtils.setImageUri(this.M, z ? this.f1113a.M() : this.f1113a.g0(), this.b);
    }

    @Override // com.applovin.impl.o9
    public void f() {
        o();
        super.f();
    }

    @Override // com.applovin.impl.jb.a
    public void b() {
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a("AppLovinFullscreenActivity", "Skipping video from prompt");
        }
        A();
    }

    protected boolean H() {
        return k() && !B();
    }

    protected boolean B() {
        return (this.H && this.f1113a.c1()) || this.P >= ((double) this.f1113a.o0());
    }

    @Override // com.applovin.impl.o9
    protected void o() {
        super.a((int) this.P, this.O, B(), this.U);
    }

    protected void F() {
        long jW;
        long millis;
        if (this.f1113a.V() >= 0 || this.f1113a.W() >= 0) {
            if (this.f1113a.V() >= 0) {
                jW = this.f1113a.V();
            } else {
                com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) this.f1113a;
                double d = this.Q;
                long millis2 = d > 0.0d ? java.util.concurrent.TimeUnit.SECONDS.toMillis((long) d) : 0L;
                if (aVar.Z0()) {
                    int iN1 = (int) ((com.applovin.impl.sdk.ad.a) this.f1113a).n1();
                    if (iN1 > 0) {
                        millis = java.util.concurrent.TimeUnit.SECONDS.toMillis(iN1);
                    } else {
                        int iP = (int) aVar.p();
                        if (iP > 0) {
                            millis = java.util.concurrent.TimeUnit.SECONDS.toMillis(iP);
                        }
                    }
                    millis2 += millis;
                }
                jW = (long) (millis2 * (((double) this.f1113a.W()) / 100.0d));
            }
            b(jW);
        }
    }

    protected void L() {
        this.T = !this.T;
        c("javascript:al_setVideoMuted(" + this.T + ");");
        d(this.T);
        a(this.T, 0L);
    }

    private static boolean a(boolean z, com.applovin.impl.sdk.j jVar) {
        if (!((java.lang.Boolean) jVar.a(com.applovin.impl.sj.l2)).booleanValue()) {
            return false;
        }
        if (!((java.lang.Boolean) jVar.a(com.applovin.impl.sj.m2)).booleanValue() || z) {
            return true;
        }
        return ((java.lang.Boolean) jVar.a(com.applovin.impl.sj.o2)).booleanValue();
    }

    private class b implements android.view.View.OnClickListener {
        private b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            if (view != com.applovin.impl.w9.this.L) {
                if (view == com.applovin.impl.w9.this.M) {
                    com.applovin.impl.w9.this.L();
                    return;
                }
                com.applovin.impl.sdk.n nVar = com.applovin.impl.w9.this.c;
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.w9.this.c.b("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
                    return;
                }
                return;
            }
            com.applovin.impl.w9.this.K();
        }
    }

    @Override // com.applovin.impl.o9
    public void a(android.view.ViewGroup viewGroup) {
        this.K.a(this.M, this.L, this.k, this.N, this.j, this.i, viewGroup);
        this.i.getController().a((com.applovin.impl.g0) this);
        if (a(false)) {
            return;
        }
        com.applovin.impl.o oVar = this.N;
        if (oVar != null) {
            oVar.a();
        }
        com.applovin.impl.adview.k kVar = this.j;
        if (kVar != null) {
            kVar.b();
        }
        this.i.renderAd(this.f1113a);
        if (this.L != null) {
            this.b.i0().a(new com.applovin.impl.jn(this.b, "scheduleSkipButton", new java.lang.Runnable() { // from class: com.applovin.impl.w9$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.G();
                }
            }), com.applovin.impl.tm.b.TIMEOUT, this.f1113a.n0(), true);
        }
        this.b.i0().a(new com.applovin.impl.jn(this.b, "updateMainViewOM", new java.lang.Runnable() { // from class: com.applovin.impl.w9$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.D();
            }
        }), com.applovin.impl.tm.b.OTHER, 500L);
        super.c(this.T);
    }

    @Override // com.applovin.impl.g0
    public void a(double d) {
        this.P = d;
    }

    @Override // com.applovin.impl.g0
    public void a() {
        com.applovin.impl.o oVar = this.N;
        if (oVar != null) {
            oVar.a();
        }
    }
}

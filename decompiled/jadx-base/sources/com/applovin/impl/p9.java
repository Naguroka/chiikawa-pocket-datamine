package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class p9 extends com.applovin.impl.o9 {
    private final com.applovin.impl.q9 K;
    private com.applovin.impl.x1 L;
    private long M;
    private final java.util.concurrent.atomic.AtomicBoolean N;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D() {
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a("AppLovinFullscreenActivity", "Marking ad as fully watched");
        }
        this.N.set(true);
    }

    @Override // com.applovin.impl.o9
    public void a(long j) {
    }

    @Override // com.applovin.impl.jb.a
    public void b() {
    }

    @Override // com.applovin.impl.jb.a
    public void c() {
    }

    @Override // com.applovin.impl.o9
    public void x() {
    }

    public p9(com.applovin.impl.sdk.ad.b bVar, android.app.Activity activity, java.util.Map map, com.applovin.impl.sdk.j jVar, com.applovin.sdk.AppLovinAdClickListener appLovinAdClickListener, com.applovin.sdk.AppLovinAdDisplayListener appLovinAdDisplayListener, com.applovin.sdk.AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, jVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.K = new com.applovin.impl.q9(this.f1113a, this.d, this.b);
        this.N = new java.util.concurrent.atomic.AtomicBoolean();
    }

    @Override // com.applovin.impl.o9
    public void y() {
        a((android.view.ViewGroup) null);
    }

    @Override // com.applovin.impl.o9
    public void a(android.view.ViewGroup viewGroup) {
        this.K.a(this.k, this.j, this.i, viewGroup);
        if (a(false)) {
            return;
        }
        com.applovin.impl.adview.k kVar = this.j;
        if (kVar != null) {
            kVar.b();
        }
        this.i.renderAd(this.f1113a);
        a("javascript:al_onPoststitialShow();", this.f1113a.D());
        if (k()) {
            long jA = A();
            this.M = jA;
            if (jA > 0) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.c.a("AppLovinFullscreenActivity", "Scheduling timer for ad fully watched in " + this.M + "ms...");
                }
                this.L = com.applovin.impl.x1.a(this.M, this.b, new java.lang.Runnable() { // from class: com.applovin.impl.p9$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.D();
                    }
                });
            }
        }
        if (this.k != null) {
            if (this.f1113a.p() >= 0) {
                a(this.k, this.f1113a.p(), new java.lang.Runnable() { // from class: com.applovin.impl.p9$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.E();
                    }
                });
            } else {
                this.k.setVisibility(0);
            }
        }
        G();
        this.b.i0().a(new com.applovin.impl.jn(this.b, "updateMainViewOM", new java.lang.Runnable() { // from class: com.applovin.impl.p9$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.F();
            }
        }), com.applovin.impl.tm.b.OTHER, java.util.concurrent.TimeUnit.SECONDS.toMillis(1L));
        r();
        super.c(com.applovin.impl.yp.e(this.b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E() {
        this.p = android.os.SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F() {
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

    @Override // com.applovin.impl.o9
    public void f() {
        o();
        com.applovin.impl.x1 x1Var = this.L;
        if (x1Var != null) {
            x1Var.a();
            this.L = null;
        }
        super.f();
    }

    protected boolean C() {
        if (!(this.H && this.f1113a.c1()) && k()) {
            return this.N.get();
        }
        return true;
    }

    @Override // com.applovin.impl.o9
    protected void o() {
        super.a(B(), false, C(), -2L);
    }

    protected void G() {
        long jW;
        long millis = 0;
        if (this.f1113a.V() >= 0 || this.f1113a.W() >= 0) {
            if (this.f1113a.V() >= 0) {
                jW = this.f1113a.V();
            } else {
                if (this.f1113a.Z0()) {
                    int iN1 = (int) ((com.applovin.impl.sdk.ad.a) this.f1113a).n1();
                    if (iN1 > 0) {
                        millis = java.util.concurrent.TimeUnit.SECONDS.toMillis(iN1);
                    } else {
                        int iP = (int) this.f1113a.p();
                        if (iP > 0) {
                            millis = java.util.concurrent.TimeUnit.SECONDS.toMillis(iP);
                        }
                    }
                }
                jW = (long) (millis * (((double) this.f1113a.W()) / 100.0d));
            }
            b(jW);
        }
    }

    @Override // com.applovin.impl.o9
    public void i() {
        super.i();
        H();
    }

    @Override // com.applovin.impl.o9
    public void h() {
        super.h();
        H();
    }

    private void H() {
        this.K.a(this.l);
        this.p = android.os.SystemClock.elapsedRealtime();
        this.N.set(true);
    }

    private long A() {
        com.applovin.impl.sdk.ad.b bVar = this.f1113a;
        if (!(bVar instanceof com.applovin.impl.sdk.ad.a)) {
            return 0L;
        }
        float fN1 = ((com.applovin.impl.sdk.ad.a) bVar).n1();
        if (fN1 <= 0.0f) {
            fN1 = this.f1113a.p();
        }
        return (long) (com.applovin.impl.yp.c(fN1) * (((double) this.f1113a.E()) / 100.0d));
    }

    private int B() {
        com.applovin.impl.x1 x1Var;
        int iMin = 100;
        if (k()) {
            if (!C() && (x1Var = this.L) != null) {
                iMin = (int) java.lang.Math.min(100.0d, ((this.M - x1Var.b()) / this.M) * 100.0d);
            }
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a("AppLovinFullscreenActivity", "Ad engaged at " + iMin + "%");
            }
        }
        return iMin;
    }
}

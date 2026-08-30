package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class s9 extends com.applovin.impl.u9 {
    private final com.applovin.impl.aq m0;
    private final java.util.Set n0;

    public s9(com.applovin.impl.sdk.ad.b bVar, final android.app.Activity activity, java.util.Map map, final com.applovin.impl.sdk.j jVar, com.applovin.sdk.AppLovinAdClickListener appLovinAdClickListener, com.applovin.sdk.AppLovinAdDisplayListener appLovinAdDisplayListener, com.applovin.sdk.AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, jVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        java.util.HashSet hashSet = new java.util.HashSet();
        this.n0 = hashSet;
        com.applovin.impl.aq aqVar = (com.applovin.impl.aq) bVar;
        this.m0 = aqVar;
        if (aqVar.x1()) {
            android.widget.ImageView imageViewA = com.applovin.impl.gq.a(aqVar.r1().e(), activity, jVar);
            this.U = imageViewA;
            imageViewA.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.applovin.impl.s9$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    this.f$0.a(activity, jVar, view);
                }
            });
        }
        com.applovin.impl.aq.d dVar = com.applovin.impl.aq.d.VIDEO;
        hashSet.addAll(aqVar.a(dVar, com.applovin.impl.lq.f998a));
        a(com.applovin.impl.aq.d.IMPRESSION);
        a(dVar, "creativeView");
        aqVar.getAdEventTracker().g();
    }

    @Override // com.applovin.impl.o9
    public void u() {
        super.u();
        a(this.g0 ? com.applovin.impl.aq.d.COMPANION : com.applovin.impl.aq.d.VIDEO, "pause");
        this.m0.getAdEventTracker().z();
    }

    @Override // com.applovin.impl.o9
    public void v() {
        super.v();
        a(this.g0 ? com.applovin.impl.aq.d.COMPANION : com.applovin.impl.aq.d.VIDEO, "resume");
        this.m0.getAdEventTracker().A();
    }

    @Override // com.applovin.impl.u9, com.applovin.impl.o9
    public void f() {
        if (this.m0 != null) {
            a(com.applovin.impl.aq.d.VIDEO, "close");
            a(com.applovin.impl.aq.d.COMPANION, "close");
        }
        super.f();
    }

    @Override // com.applovin.impl.u9, com.applovin.impl.o9
    public void y() {
        a((android.view.ViewGroup) null);
    }

    class a implements com.applovin.impl.u4.b {
        a() {
        }

        @Override // com.applovin.impl.u4.b
        public void a() {
            long seconds = java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(com.applovin.impl.s9.this.d0 - ((long) (com.applovin.impl.s9.this.M.getDuration() - com.applovin.impl.s9.this.M.getCurrentPosition())));
            int iA = com.applovin.impl.s9.this.A();
            java.util.HashSet hashSet = new java.util.HashSet();
            for (com.applovin.impl.kq kqVar : new java.util.HashSet(com.applovin.impl.s9.this.n0)) {
                if (kqVar.a(seconds, iA)) {
                    hashSet.add(kqVar);
                    com.applovin.impl.s9.this.n0.remove(kqVar);
                }
            }
            com.applovin.impl.s9.this.a(hashSet);
            if (iA >= 25 && iA < 50) {
                com.applovin.impl.s9.this.m0.getAdEventTracker().x();
                return;
            }
            if (iA >= 50 && iA < 75) {
                com.applovin.impl.s9.this.m0.getAdEventTracker().y();
            } else if (iA >= 75) {
                com.applovin.impl.s9.this.m0.getAdEventTracker().C();
            }
        }

        @Override // com.applovin.impl.u4.b
        public boolean b() {
            return !com.applovin.impl.s9.this.g0;
        }
    }

    @Override // com.applovin.impl.u9
    protected void c(long j) {
        super.c(j);
        this.m0.getAdEventTracker().b(java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(j), com.applovin.impl.yp.e(this.b));
    }

    @Override // com.applovin.impl.u9, com.applovin.impl.o9
    public void x() {
        this.Z.c();
        super.x();
    }

    @Override // com.applovin.impl.u9
    public void B() {
        a(com.applovin.impl.aq.d.VIDEO, "skip");
        this.m0.getAdEventTracker().B();
        super.B();
    }

    @Override // com.applovin.impl.u9
    protected void S() {
        super.S();
        com.applovin.impl.aq aqVar = this.m0;
        if (aqVar != null) {
            aqVar.getAdEventTracker().j();
        }
    }

    @Override // com.applovin.impl.u9
    protected void C() {
        super.C();
        com.applovin.impl.aq aqVar = this.m0;
        if (aqVar != null) {
            aqVar.getAdEventTracker().i();
        }
    }

    @Override // com.applovin.impl.u9
    public void d(java.lang.String str) {
        a(com.applovin.impl.aq.d.ERROR, com.applovin.impl.fq.MEDIA_FILE_ERROR);
        this.m0.getAdEventTracker().b(str);
        super.d(str);
    }

    @Override // com.applovin.impl.u9
    public void V() {
        super.V();
        a(com.applovin.impl.aq.d.VIDEO, this.c0 ? "mute" : "unmute");
        this.m0.getAdEventTracker().b(this.c0);
    }

    @Override // com.applovin.impl.u9
    public void T() {
        X();
        if (com.applovin.impl.mq.a(this.m0)) {
            if (this.g0) {
                return;
            }
            a(com.applovin.impl.aq.d.COMPANION, "creativeView");
            this.m0.getAdEventTracker().w();
            super.T();
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a("AppLovinFullscreenActivity", "VAST ad does not have valid companion ad - dismissing...");
        }
        f();
    }

    @Override // com.applovin.impl.u9
    public void a(android.view.MotionEvent motionEvent, android.os.Bundle bundle) {
        a(com.applovin.impl.aq.d.VIDEO_CLICK);
        this.m0.getAdEventTracker().v();
        super.a(motionEvent, bundle);
    }

    private void X() {
        if (!E() || this.n0.isEmpty()) {
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.c.k("AppLovinFullscreenActivity", "Firing " + this.n0.size() + " un-fired video progress trackers when video was completed.");
        }
        a(this.n0);
    }

    @Override // com.applovin.impl.u9
    protected void N() {
        long jW;
        int iP;
        long millis = 0;
        if (this.m0.V() >= 0 || this.m0.W() >= 0) {
            if (this.m0.V() >= 0) {
                jW = this.m0.V();
            } else {
                com.applovin.impl.aq aqVar = this.m0;
                com.applovin.impl.nq nqVarV1 = aqVar.v1();
                if (nqVarV1 != null && nqVarV1.d() > 0) {
                    millis = java.util.concurrent.TimeUnit.SECONDS.toMillis(nqVarV1.d());
                } else {
                    long j = this.d0;
                    if (j > 0) {
                        millis = j;
                    }
                }
                if (aqVar.Z0() && (iP = (int) aqVar.p()) > 0) {
                    millis += java.util.concurrent.TimeUnit.SECONDS.toMillis(iP);
                }
                jW = (long) (millis * (((double) this.m0.W()) / 100.0d));
            }
            b(jW);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(android.app.Activity activity, com.applovin.impl.sdk.j jVar, android.view.View view) {
        android.net.Uri uriC = this.m0.r1().c();
        if (uriC != null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a("AppLovinFullscreenActivity", "Industry Icon clicked, opening URL: " + uriC);
            }
            a(com.applovin.impl.aq.d.INDUSTRY_ICON_CLICK);
            com.applovin.impl.tp.a(uriC, activity, jVar);
        }
    }

    private boolean W() {
        return this.U != null && this.m0.x1();
    }

    private void a(com.applovin.impl.aq.d dVar) {
        a(dVar, com.applovin.impl.fq.UNSPECIFIED);
    }

    private void a(com.applovin.impl.aq.d dVar, com.applovin.impl.fq fqVar) {
        a(dVar, "", fqVar);
    }

    private void a(com.applovin.impl.aq.d dVar, java.lang.String str) {
        a(dVar, str, com.applovin.impl.fq.UNSPECIFIED);
    }

    private void a(com.applovin.impl.aq.d dVar, java.lang.String str, com.applovin.impl.fq fqVar) {
        a(this.m0.a(dVar, str), fqVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(java.util.Set set) {
        a(set, com.applovin.impl.fq.UNSPECIFIED);
    }

    private void a(java.util.Set set, com.applovin.impl.fq fqVar) {
        if (set == null || set.isEmpty()) {
            return;
        }
        long seconds = java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(this.M.getCurrentPosition());
        com.applovin.impl.oq oqVarW1 = this.m0.w1();
        android.net.Uri uriD = oqVarW1 != null ? oqVarW1.d() : null;
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a("AppLovinFullscreenActivity", "Firing " + set.size() + " tracker(s): " + set);
        }
        com.applovin.impl.mq.a(set, seconds, uriD, fqVar, this.b);
    }

    @Override // com.applovin.impl.u9, com.applovin.impl.o9
    public void a(android.view.ViewGroup viewGroup) {
        super.a(viewGroup);
        if (W()) {
            a(com.applovin.impl.aq.d.INDUSTRY_ICON_IMPRESSION);
            this.U.setVisibility(0);
        }
        this.Z.a("PROGRESS_TRACKING", java.util.concurrent.TimeUnit.SECONDS.toMillis(1L), new com.applovin.impl.s9.a());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.applovin.impl.o oVar = this.N;
        if (oVar != null) {
            arrayList.add(new com.applovin.impl.ng(oVar, com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose.OTHER, "video stream buffering indicator"));
        }
        com.applovin.impl.adview.g gVar = this.O;
        if (gVar != null) {
            arrayList.add(new com.applovin.impl.ng(gVar, com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose.CLOSE_AD, "skip button"));
        }
        com.applovin.impl.h3 h3Var = this.P;
        if (h3Var != null) {
            arrayList.add(new com.applovin.impl.ng(h3Var, com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose.OTHER, "countdown clock"));
        }
        android.widget.ProgressBar progressBar = this.S;
        if (progressBar != null) {
            arrayList.add(new com.applovin.impl.ng(progressBar, com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose.OTHER, "progress bar"));
        }
        android.widget.ProgressBar progressBar2 = this.T;
        if (progressBar2 != null) {
            arrayList.add(new com.applovin.impl.ng(progressBar2, com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose.OTHER, "postitial progress bar"));
        }
        android.widget.ImageView imageView = this.Q;
        if (imageView != null) {
            arrayList.add(new com.applovin.impl.ng(imageView, com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose.VIDEO_CONTROLS, "mute button"));
        }
        com.applovin.impl.adview.l lVar = this.R;
        if (lVar != null) {
            arrayList.add(new com.applovin.impl.ng(lVar, com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose.VIDEO_CONTROLS, "generic webview overlay containing HTML controls"));
        }
        com.applovin.impl.adview.k kVar = this.j;
        if (kVar != null && kVar.a()) {
            com.applovin.impl.adview.k kVar2 = this.j;
            arrayList.add(new com.applovin.impl.ng(kVar2, com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier()));
        }
        this.m0.getAdEventTracker().b(this.M, arrayList);
    }
}

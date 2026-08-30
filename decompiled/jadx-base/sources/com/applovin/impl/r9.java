package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class r9 extends com.applovin.impl.t9 {
    private final com.applovin.impl.aq k0;
    private final java.util.Set l0;

    public r9(com.applovin.impl.sdk.ad.b bVar, android.app.Activity activity, java.util.Map map, com.applovin.impl.sdk.j jVar, com.applovin.sdk.AppLovinAdClickListener appLovinAdClickListener, com.applovin.sdk.AppLovinAdDisplayListener appLovinAdDisplayListener, com.applovin.sdk.AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, jVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        java.util.HashSet hashSet = new java.util.HashSet();
        this.l0 = hashSet;
        com.applovin.impl.aq aqVar = (com.applovin.impl.aq) bVar;
        this.k0 = aqVar;
        com.applovin.impl.aq.d dVar = com.applovin.impl.aq.d.VIDEO;
        hashSet.addAll(aqVar.a(dVar, com.applovin.impl.lq.f998a));
        a(com.applovin.impl.aq.d.IMPRESSION);
        a(dVar, "creativeView");
        aqVar.getAdEventTracker().g();
    }

    @Override // com.applovin.impl.o9
    public void u() {
        super.u();
        a(this.d0 ? com.applovin.impl.aq.d.COMPANION : com.applovin.impl.aq.d.VIDEO, "pause");
        this.k0.getAdEventTracker().z();
    }

    @Override // com.applovin.impl.o9
    public void v() {
        super.v();
        a(this.d0 ? com.applovin.impl.aq.d.COMPANION : com.applovin.impl.aq.d.VIDEO, "resume");
        this.k0.getAdEventTracker().A();
    }

    @Override // com.applovin.impl.t9, com.applovin.impl.o9
    public void f() {
        if (this.k0 != null) {
            a(com.applovin.impl.aq.d.VIDEO, "close");
            a(com.applovin.impl.aq.d.COMPANION, "close");
        }
        super.f();
    }

    @Override // com.applovin.impl.t9, com.applovin.impl.o9
    public void y() {
        a((android.view.ViewGroup) null);
    }

    class a implements com.applovin.impl.u4.b {
        a() {
        }

        @Override // com.applovin.impl.u4.b
        public void a() {
            long seconds = java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(com.applovin.impl.r9.this.b0 - (com.applovin.impl.r9.this.M.getDuration() - com.applovin.impl.r9.this.M.getCurrentPosition()));
            int iA = com.applovin.impl.r9.this.A();
            java.util.HashSet hashSet = new java.util.HashSet();
            for (com.applovin.impl.kq kqVar : new java.util.HashSet(com.applovin.impl.r9.this.l0)) {
                if (kqVar.a(seconds, iA)) {
                    hashSet.add(kqVar);
                    com.applovin.impl.r9.this.l0.remove(kqVar);
                }
            }
            com.applovin.impl.r9.this.a(hashSet);
            if (iA >= 25 && iA < 50) {
                com.applovin.impl.r9.this.k0.getAdEventTracker().x();
                return;
            }
            if (iA >= 50 && iA < 75) {
                com.applovin.impl.r9.this.k0.getAdEventTracker().y();
            } else if (iA >= 75) {
                com.applovin.impl.r9.this.k0.getAdEventTracker().C();
            }
        }

        @Override // com.applovin.impl.u4.b
        public boolean b() {
            return !com.applovin.impl.r9.this.d0;
        }
    }

    @Override // com.applovin.impl.t9
    protected void c(long j) {
        super.c(j);
        this.k0.getAdEventTracker().b(java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(j), com.applovin.impl.yp.e(this.b));
    }

    @Override // com.applovin.impl.t9, com.applovin.impl.o9
    public void x() {
        this.X.c();
        super.x();
    }

    @Override // com.applovin.impl.t9
    public void B() {
        a(com.applovin.impl.aq.d.VIDEO, "skip");
        this.k0.getAdEventTracker().B();
        super.B();
    }

    @Override // com.applovin.impl.t9
    protected void S() {
        super.S();
        com.applovin.impl.aq aqVar = this.k0;
        if (aqVar != null) {
            aqVar.getAdEventTracker().j();
        }
    }

    @Override // com.applovin.impl.t9
    protected void C() {
        super.C();
        com.applovin.impl.aq aqVar = this.k0;
        if (aqVar != null) {
            aqVar.getAdEventTracker().i();
        }
    }

    @Override // com.applovin.impl.t9
    public void d(java.lang.String str) {
        if (com.applovin.impl.sdk.utils.StringUtils.containsAtLeastOneSubstring(str, this.b.c(com.applovin.impl.sj.X4))) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a("AppLovinFullscreenActivity", "Not firing trackers for media error: " + str);
            }
        } else {
            a(com.applovin.impl.aq.d.ERROR, com.applovin.impl.fq.MEDIA_FILE_ERROR);
            this.k0.getAdEventTracker().b(str);
        }
        super.d(str);
    }

    @Override // com.applovin.impl.t9
    public void W() {
        super.W();
        a(com.applovin.impl.aq.d.VIDEO, this.a0 ? "mute" : "unmute");
        this.k0.getAdEventTracker().b(this.a0);
    }

    @Override // com.applovin.impl.t9
    public void T() {
        X();
        if (com.applovin.impl.mq.a(this.k0)) {
            if (this.d0) {
                return;
            }
            a(com.applovin.impl.aq.d.COMPANION, "creativeView");
            this.k0.getAdEventTracker().w();
            super.T();
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a("AppLovinFullscreenActivity", "VAST ad does not have valid companion ad - dismissing...");
        }
        f();
    }

    @Override // com.applovin.impl.t9
    public void a(android.view.MotionEvent motionEvent, android.os.Bundle bundle) {
        a(com.applovin.impl.aq.d.VIDEO_CLICK);
        this.k0.getAdEventTracker().v();
        super.a(motionEvent, bundle);
    }

    private void X() {
        if (!E() || this.l0.isEmpty()) {
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.c.k("AppLovinFullscreenActivity", "Firing " + this.l0.size() + " un-fired video progress trackers when video was completed.");
        }
        a(this.l0);
    }

    @Override // com.applovin.impl.t9
    protected void M() {
        long jW;
        int iP;
        long millis = 0;
        if (this.k0.V() >= 0 || this.k0.W() >= 0) {
            if (this.k0.V() >= 0) {
                jW = this.k0.V();
            } else {
                com.applovin.impl.aq aqVar = this.k0;
                com.applovin.impl.nq nqVarV1 = aqVar.v1();
                if (nqVarV1 != null && nqVarV1.d() > 0) {
                    millis = java.util.concurrent.TimeUnit.SECONDS.toMillis(nqVarV1.d());
                } else {
                    long j = this.b0;
                    if (j > 0) {
                        millis = j;
                    }
                }
                if (aqVar.Z0() && (iP = (int) aqVar.p()) > 0) {
                    millis += java.util.concurrent.TimeUnit.SECONDS.toMillis(iP);
                }
                jW = (long) (millis * (((double) this.k0.W()) / 100.0d));
            }
            b(jW);
        }
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
        a(this.k0.a(dVar, str), fqVar);
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
        com.applovin.impl.oq oqVarW1 = this.k0.w1();
        android.net.Uri uriD = oqVarW1 != null ? oqVarW1.d() : null;
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a("AppLovinFullscreenActivity", "Firing " + set.size() + " tracker(s): " + set);
        }
        com.applovin.impl.mq.a(set, seconds, uriD, fqVar, this.b);
    }

    @Override // com.applovin.impl.t9, com.applovin.impl.o9
    public void a(android.view.ViewGroup viewGroup) {
        super.a(viewGroup);
        this.X.a("PROGRESS_TRACKING", java.util.concurrent.TimeUnit.SECONDS.toMillis(1L), new com.applovin.impl.r9.a());
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
        this.k0.getAdEventTracker().b(this.L, arrayList);
    }
}

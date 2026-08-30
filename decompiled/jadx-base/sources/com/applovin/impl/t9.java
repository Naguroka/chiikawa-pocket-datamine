package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class t9 extends com.applovin.impl.o9 implements com.applovin.communicator.AppLovinCommunicatorSubscriber {
    private final com.applovin.impl.v9 K;
    protected final com.applovin.exoplayer2.ui.e L;
    protected final com.applovin.impl.ck M;
    protected final com.applovin.impl.o N;
    protected final com.applovin.impl.adview.g O;
    protected com.applovin.impl.h3 P;
    protected final android.widget.ImageView Q;
    protected com.applovin.impl.adview.l R;
    protected final android.widget.ProgressBar S;
    protected android.widget.ProgressBar T;
    private final com.applovin.impl.t9.d U;
    private final android.os.Handler V;
    private final android.os.Handler W;
    protected final com.applovin.impl.u4 X;
    protected final com.applovin.impl.u4 Y;
    private final boolean Z;
    protected boolean a0;
    protected long b0;
    protected int c0;
    protected boolean d0;
    protected boolean e0;
    private long f0;
    private final java.util.concurrent.atomic.AtomicBoolean g0;
    private final java.util.concurrent.atomic.AtomicBoolean h0;
    private long i0;
    private long j0;

    protected void d(java.lang.String str) {
        if (com.applovin.impl.sdk.n.a()) {
            this.c.b("AppLovinFullscreenActivity", "Encountered media error: " + str + " for ad: " + this.f1113a);
        }
        if (com.applovin.impl.sdk.utils.StringUtils.containsAtLeastOneSubstring(str, this.b.c(com.applovin.impl.sj.H2))) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a("AppLovinFullscreenActivity", "Ignoring media error: " + str);
            }
        } else if (this.g0.compareAndSet(false, true)) {
            if (com.applovin.impl.yp.a(com.applovin.impl.sj.O0, this.b)) {
                this.b.A().d(this.f1113a, com.applovin.impl.sdk.j.m());
            }
            com.applovin.sdk.AppLovinAdDisplayListener appLovinAdDisplayListener = this.C;
            if (appLovinAdDisplayListener instanceof com.applovin.impl.pb) {
                ((com.applovin.impl.pb) appLovinAdDisplayListener).onAdDisplayFailed(str);
            }
            this.b.D().a(this.f1113a instanceof com.applovin.impl.aq ? "handleVastExoPlayerError" : "handleExoPlayerError", str, this.f1113a);
            f();
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public java.lang.String getCommunicatorId() {
        return "FullscreenVideoAdExoPlayerPresenter";
    }

    @Override // com.applovin.impl.o9
    public void x() {
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a("AppLovinFullscreenActivity", "Pausing video");
        }
        if (!this.M.isPlaying()) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a("AppLovinFullscreenActivity", "Nothing to pause");
            }
        } else {
            this.f0 = this.M.getCurrentPosition();
            this.M.a(false);
            this.X.c();
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a("AppLovinFullscreenActivity", "Paused video at position " + this.f0 + "ms");
            }
        }
    }

    protected void d(boolean z) {
        if (com.applovin.impl.z3.f()) {
            android.graphics.drawable.AnimatedVectorDrawable animatedVectorDrawable = (android.graphics.drawable.AnimatedVectorDrawable) this.d.getDrawable(z ? com.applovin.sdk.R.drawable.applovin_ic_unmute_to_mute : com.applovin.sdk.R.drawable.applovin_ic_mute_to_unmute);
            if (animatedVectorDrawable != null) {
                this.Q.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
                this.Q.setImageDrawable(animatedVectorDrawable);
                animatedVectorDrawable.start();
                return;
            }
        }
        com.applovin.impl.sdk.utils.ImageViewUtils.setImageUri(this.Q, z ? this.f1113a.M() : this.f1113a.g0(), this.b);
    }

    public t9(com.applovin.impl.sdk.ad.b bVar, android.app.Activity activity, java.util.Map map, com.applovin.impl.sdk.j jVar, com.applovin.sdk.AppLovinAdClickListener appLovinAdClickListener, com.applovin.sdk.AppLovinAdDisplayListener appLovinAdDisplayListener, com.applovin.sdk.AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, jVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.K = new com.applovin.impl.v9(this.f1113a, this.d, this.b);
        com.applovin.impl.t9.a aVar = null;
        com.applovin.impl.t9.d dVar = new com.applovin.impl.t9.d(this, aVar);
        this.U = dVar;
        android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
        this.V = handler;
        android.os.Handler handler2 = new android.os.Handler(android.os.Looper.getMainLooper());
        this.W = handler2;
        com.applovin.impl.u4 u4Var = new com.applovin.impl.u4(handler, this.b);
        this.X = u4Var;
        this.Y = new com.applovin.impl.u4(handler2, this.b);
        boolean zK0 = this.f1113a.K0();
        this.Z = zK0;
        this.a0 = com.applovin.impl.yp.e(this.b);
        this.f0 = -1L;
        this.g0 = new java.util.concurrent.atomic.AtomicBoolean();
        this.h0 = new java.util.concurrent.atomic.AtomicBoolean();
        this.i0 = -2L;
        this.j0 = 0L;
        if (bVar.hasVideoUrl()) {
            com.applovin.impl.t9.f fVar = new com.applovin.impl.t9.f(this, aVar);
            if (bVar.m0() >= 0) {
                com.applovin.impl.adview.g gVar = new com.applovin.impl.adview.g(bVar.d0(), activity);
                this.O = gVar;
                gVar.setVisibility(8);
                gVar.setOnClickListener(fVar);
            } else {
                this.O = null;
            }
            if (a(this.a0, jVar)) {
                android.widget.ImageView imageView = new android.widget.ImageView(activity);
                this.Q = imageView;
                imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
                imageView.setClickable(true);
                imageView.setOnClickListener(fVar);
                d(this.a0);
            } else {
                this.Q = null;
            }
            java.lang.String strI0 = bVar.i0();
            if (com.applovin.impl.sdk.utils.StringUtils.isValidString(strI0)) {
                com.applovin.impl.rr rrVar = new com.applovin.impl.rr(jVar);
                rrVar.a(new java.lang.ref.WeakReference(dVar));
                com.applovin.impl.adview.l lVar = new com.applovin.impl.adview.l(bVar.h0(), bVar, rrVar, activity);
                this.R = lVar;
                lVar.a(strI0);
            } else {
                this.R = null;
            }
            if (zK0) {
                com.applovin.impl.o oVar = new com.applovin.impl.o(activity, ((java.lang.Integer) jVar.a(com.applovin.impl.sj.w2)).intValue(), android.R.attr.progressBarStyleLarge);
                this.N = oVar;
                oVar.setColor(android.graphics.Color.parseColor("#75FFFFFF"));
                oVar.setBackgroundColor(android.graphics.Color.parseColor("#00000000"));
                oVar.setVisibility(8);
                com.applovin.communicator.AppLovinCommunicator.getInstance(activity).subscribe(this, "video_caching_failed");
            } else {
                this.N = null;
            }
            int iG = g();
            boolean z = ((java.lang.Boolean) jVar.a(com.applovin.impl.sj.b2)).booleanValue() && iG > 0;
            if (this.P == null && z) {
                this.P = new com.applovin.impl.h3(activity);
                int iQ = bVar.q();
                this.P.setTextColor(iQ);
                this.P.setTextSize(((java.lang.Integer) jVar.a(com.applovin.impl.sj.a2)).intValue());
                this.P.setFinishedStrokeColor(iQ);
                this.P.setFinishedStrokeWidth(((java.lang.Integer) jVar.a(com.applovin.impl.sj.Z1)).intValue());
                this.P.setMax(iG);
                this.P.setProgress(iG);
                u4Var.a("COUNTDOWN_CLOCK", java.util.concurrent.TimeUnit.SECONDS.toMillis(1L), new com.applovin.impl.t9.a(iG));
            }
            if (bVar.t0()) {
                java.lang.Long l = (java.lang.Long) jVar.a(com.applovin.impl.sj.t2);
                java.lang.Integer num = (java.lang.Integer) jVar.a(com.applovin.impl.sj.u2);
                android.widget.ProgressBar progressBar = new android.widget.ProgressBar(activity, null, android.R.attr.progressBarStyleHorizontal);
                this.S = progressBar;
                a(progressBar, bVar.s0(), num.intValue());
                u4Var.a("PROGRESS_BAR", l.longValue(), new com.applovin.impl.t9.b(num));
            } else {
                this.S = null;
            }
            com.applovin.impl.ck ckVarA = new com.applovin.impl.ck.b(activity).a();
            this.M = ckVarA;
            com.applovin.impl.t9.e eVar = new com.applovin.impl.t9.e(this, aVar);
            ckVarA.a((com.applovin.impl.qh.c) eVar);
            ckVarA.a(0);
            com.applovin.exoplayer2.ui.e eVar2 = new com.applovin.exoplayer2.ui.e(activity);
            this.L = eVar2;
            eVar2.c();
            eVar2.setControllerVisibilityListener(eVar);
            eVar2.setPlayer(ckVarA);
            eVar2.setOnTouchListener(new com.applovin.impl.adview.AppLovinTouchToClickListener(jVar, com.applovin.impl.sj.j0, activity, eVar));
            bVar.e().putString("video_view_address", com.applovin.impl.zq.a(eVar2));
            O();
            return;
        }
        throw new java.lang.IllegalStateException("Attempting to use fullscreen video ad presenter for non-video ad");
    }

    class a implements com.applovin.impl.u4.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f1353a;

        a(int i) {
            this.f1353a = i;
        }

        @Override // com.applovin.impl.u4.b
        public void a() {
            com.applovin.impl.t9 t9Var = com.applovin.impl.t9.this;
            if (t9Var.P != null) {
                long seconds = ((long) this.f1353a) - java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(t9Var.L.getPlayer().getCurrentPosition());
                if (seconds <= 0) {
                    com.applovin.impl.t9.this.u = true;
                } else if (com.applovin.impl.t9.this.P()) {
                    com.applovin.impl.t9.this.P.setProgress((int) seconds);
                }
            }
        }

        @Override // com.applovin.impl.u4.b
        public boolean b() {
            return com.applovin.impl.t9.this.P();
        }
    }

    class b implements com.applovin.impl.u4.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.Integer f1354a;

        b(java.lang.Integer num) {
            this.f1354a = num;
        }

        @Override // com.applovin.impl.u4.b
        public void a() {
            com.applovin.impl.t9 t9Var = com.applovin.impl.t9.this;
            if (t9Var.d0) {
                t9Var.S.setVisibility(8);
            } else {
                com.applovin.impl.t9.this.S.setProgress((int) ((t9Var.M.getCurrentPosition() / com.applovin.impl.t9.this.b0) * this.f1354a.intValue()));
            }
        }

        @Override // com.applovin.impl.u4.b
        public boolean b() {
            return !com.applovin.impl.t9.this.d0;
        }
    }

    @Override // com.applovin.impl.o9
    public void y() {
        a((android.view.ViewGroup) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H() {
        a(250L);
    }

    protected void c(long j) {
        this.b0 = j;
    }

    @Override // com.applovin.impl.jb.a
    public void c() {
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a("AppLovinFullscreenActivity", "Continue video from prompt - will resume in onWindowFocusChanged(true) when alert dismisses");
        }
    }

    protected void O() {
        if (a(!this.Z)) {
            return;
        }
        android.app.Activity activity = this.d;
        com.applovin.impl.bi biVarA = new com.applovin.impl.bi.b(new com.applovin.impl.v5(activity, com.applovin.impl.xp.a((android.content.Context) activity, com.google.ads.mediation.applovin.AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN))).a(com.applovin.impl.sd.a(this.f1113a.u0()));
        this.M.a(!this.a0 ? 1 : 0);
        this.M.a((com.applovin.impl.ae) biVarA);
        this.M.b();
        this.M.a(false);
    }

    protected void N() {
        if (this.h0.compareAndSet(false, true)) {
            a(this.O, this.f1113a.m0(), new java.lang.Runnable() { // from class: com.applovin.impl.t9$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.G();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G() {
        this.i0 = -1L;
        this.j0 = android.os.SystemClock.elapsedRealtime();
    }

    @Override // com.applovin.impl.o9
    public void f() {
        this.X.a();
        this.Y.a();
        this.V.removeCallbacksAndMessages(null);
        this.W.removeCallbacksAndMessages(null);
        o();
        super.f();
    }

    @Override // com.applovin.impl.o9
    public void t() {
        if (((java.lang.Boolean) this.b.a(com.applovin.impl.sj.b6)).booleanValue()) {
            com.applovin.impl.tr.d(this.R);
            this.R = null;
        }
        this.M.V();
        if (this.Z) {
            com.applovin.communicator.AppLovinCommunicator.getInstance(this.d).unsubscribe(this, "video_caching_failed");
        }
        super.t();
    }

    private void K() {
        com.applovin.impl.adview.l lVar;
        com.applovin.impl.qq qqVarK0 = this.f1113a.k0();
        if (qqVarK0 == null || !qqVarK0.j() || this.d0 || (lVar = this.R) == null) {
            return;
        }
        final boolean z = lVar.getVisibility() == 4;
        final long jH = qqVarK0.h();
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.t9$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(z, jH);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(boolean z, long j) {
        if (z) {
            com.applovin.impl.zq.a(this.R, j, (java.lang.Runnable) null);
        } else {
            com.applovin.impl.zq.b(this.R, j, null);
        }
    }

    protected boolean P() {
        return (this.u || this.d0 || !this.L.getPlayer().isPlaying()) ? false : true;
    }

    public void U() {
        this.i0 = android.os.SystemClock.elapsedRealtime() - this.j0;
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a("AppLovinFullscreenActivity", "Attempting to skip video with skip time: " + this.i0 + "ms");
        }
        if (Q()) {
            x();
            p();
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a("AppLovinFullscreenActivity", "Prompting incentivized ad close warning");
            }
            this.E.e();
            return;
        }
        B();
    }

    public void B() {
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
            T();
        }
    }

    protected void a(android.view.MotionEvent motionEvent, android.os.Bundle bundle) {
        android.content.Context context;
        if (this.f1113a.J0()) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a("AppLovinFullscreenActivity", "Clicking through video");
            }
            android.net.Uri uriL0 = this.f1113a.l0();
            if (uriL0 != null) {
                if (!((java.lang.Boolean) this.b.a(com.applovin.impl.sj.B)).booleanValue() || (context = this.d) == null) {
                    com.applovin.adview.AppLovinAdView appLovinAdView = this.i;
                    context = appLovinAdView != null ? appLovinAdView.getContext() : com.applovin.impl.sdk.j.m();
                }
                this.b.j().trackAndLaunchVideoClick(this.f1113a, uriL0, motionEvent, bundle, this, context);
                com.applovin.impl.fc.a(this.B, this.f1113a);
                this.y++;
                return;
            }
            return;
        }
        K();
    }

    protected void V() {
        this.c0 = A();
        this.M.a(false);
    }

    protected void L() {
        if (this.d0) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.k("AppLovinFullscreenActivity", "Skip video resume - postitial shown");
                return;
            }
            return;
        }
        if (this.b.e0().isApplicationPaused()) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.k("AppLovinFullscreenActivity", "Skip video resume - app paused");
                return;
            }
            return;
        }
        long j = this.f0;
        if (j >= 0) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a("AppLovinFullscreenActivity", "Resuming video at position " + j + "ms for MediaPlayer: " + this.M);
            }
            this.M.a(true);
            this.X.b();
            this.f0 = -1L;
            if (this.M.isPlaying()) {
                return;
            }
            S();
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a("AppLovinFullscreenActivity", "Invalid last video position, isVideoPlaying=" + this.M.isPlaying());
        }
    }

    protected void S() {
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.t9$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.I();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I() {
        com.applovin.impl.o oVar = this.N;
        if (oVar != null) {
            oVar.a();
        }
    }

    protected void C() {
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.t9$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.F();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F() {
        com.applovin.impl.o oVar = this.N;
        if (oVar != null) {
            oVar.b();
        }
    }

    protected boolean D() {
        com.applovin.impl.sdk.ad.b bVar = this.f1113a;
        if (bVar == null) {
            return false;
        }
        if (this.H && bVar.c1()) {
            return true;
        }
        return E();
    }

    protected boolean E() {
        return A() >= this.f1113a.o0();
    }

    protected int A() {
        com.applovin.impl.ck ckVar = this.M;
        if (ckVar == null) {
            return 0;
        }
        long currentPosition = ckVar.getCurrentPosition();
        if (this.e0) {
            return 100;
        }
        if (currentPosition > 0) {
            return (int) ((currentPosition / this.b0) * 100.0f);
        }
        return this.c0;
    }

    protected boolean Q() {
        return k() && !D();
    }

    public void T() {
        V();
        long jU = this.f1113a.U();
        if (jU > 0) {
            this.q = 0L;
            java.lang.Long l = (java.lang.Long) this.b.a(com.applovin.impl.sj.C2);
            java.lang.Integer num = (java.lang.Integer) this.b.a(com.applovin.impl.sj.F2);
            android.widget.ProgressBar progressBar = new android.widget.ProgressBar(this.d, null, android.R.attr.progressBarStyleHorizontal);
            this.T = progressBar;
            a(progressBar, this.f1113a.T(), num.intValue());
            this.Y.a("POSTITIAL_PROGRESS_BAR", l.longValue(), new com.applovin.impl.t9.c(jU, num, l));
            this.Y.b();
        }
        this.K.a(this.k, this.j, this.i, this.T);
        a("javascript:al_onPoststitialShow(" + this.x + "," + this.y + ");", this.f1113a.D());
        if (this.k != null) {
            if (this.f1113a.p() >= 0) {
                a(this.k, this.f1113a.p(), new java.lang.Runnable() { // from class: com.applovin.impl.t9$$ExternalSyntheticLambda8
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.J();
                    }
                });
            } else {
                this.k.setVisibility(0);
            }
        }
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
        android.widget.ProgressBar progressBar2 = this.T;
        if (progressBar2 != null) {
            arrayList.add(new com.applovin.impl.ng(progressBar2, com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose.OTHER, "postitial progress bar"));
        }
        this.f1113a.getAdEventTracker().b(this.i, arrayList);
        r();
        this.d0 = true;
    }

    class c implements com.applovin.impl.u4.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f1355a;
        final /* synthetic */ java.lang.Integer b;
        final /* synthetic */ java.lang.Long c;

        c(long j, java.lang.Integer num, java.lang.Long l) {
            this.f1355a = j;
            this.b = num;
            this.c = l;
        }

        @Override // com.applovin.impl.u4.b
        public void a() {
            com.applovin.impl.t9.this.T.setProgress((int) ((com.applovin.impl.t9.this.q / this.f1355a) * this.b.intValue()));
            com.applovin.impl.t9.this.q += this.c.longValue();
        }

        @Override // com.applovin.impl.u4.b
        public boolean b() {
            return com.applovin.impl.t9.this.q < this.f1355a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J() {
        this.p = android.os.SystemClock.elapsedRealtime();
    }

    protected void W() {
        boolean z = this.a0;
        this.a0 = !z;
        this.M.a(z ? 1.0f : 0.0f);
        d(this.a0);
        a(this.a0, 0L);
    }

    @Override // com.applovin.impl.o9
    protected void o() {
        super.a(A(), this.Z, D(), this.i0);
    }

    protected void M() {
        long jW;
        long millis;
        if (this.f1113a.V() >= 0 || this.f1113a.W() >= 0) {
            if (this.f1113a.V() >= 0) {
                jW = this.f1113a.V();
            } else {
                com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) this.f1113a;
                long j = this.b0;
                long j2 = j > 0 ? j : 0L;
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
                    j2 += millis;
                }
                jW = (long) (j2 * (((double) this.f1113a.W()) / 100.0d));
            }
            b(jW);
        }
    }

    @Override // com.applovin.impl.o9
    public void b(boolean z) {
        super.b(z);
        if (z) {
            a(0L);
            if (this.d0) {
                this.Y.b();
                return;
            }
            return;
        }
        if (this.d0) {
            this.Y.c();
        } else {
            x();
        }
    }

    @Override // com.applovin.impl.o9
    public void i() {
        super.i();
        this.K.a(this.R);
        this.K.a((android.view.View) this.O);
        if (!k() || this.d0) {
            R();
        }
    }

    @Override // com.applovin.impl.jb.a
    public void b() {
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a("AppLovinFullscreenActivity", "Skipping video from prompt");
        }
        B();
    }

    @Override // com.applovin.impl.o9
    public void h() {
        super.h();
        R();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R() {
        this.K.a(this.l);
        this.p = android.os.SystemClock.elapsedRealtime();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(com.applovin.communicator.AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("video_caching_failed".equals(appLovinCommunicatorMessage.getTopic())) {
            android.os.Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            if (messageData.getLong("ad_id") == this.f1113a.getAdIdNumber() && this.Z) {
                int i = messageData.getInt("load_response_code");
                java.lang.String string = messageData.getString("load_exception_message");
                if ((string == null && i >= 200 && i < 300) || this.e0 || this.M.isPlaying()) {
                    return;
                }
                d("Video cache error during stream. ResponseCode=" + i + ", exception=" + string);
            }
        }
    }

    private class e implements com.applovin.impl.qh.c, com.applovin.exoplayer2.ui.d.e, com.applovin.impl.adview.AppLovinTouchToClickListener.OnClickListener {
        private e() {
        }

        @Override // com.applovin.impl.qh.c
        public void b(int i) {
            com.applovin.impl.sdk.n nVar = com.applovin.impl.t9.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.t9.this.c.a("AppLovinFullscreenActivity", "Player state changed to state " + i + " and will play when ready: " + com.applovin.impl.t9.this.M.l());
            }
            if (i == 2) {
                com.applovin.impl.t9.this.S();
                return;
            }
            if (i != 3) {
                if (i == 4) {
                    com.applovin.impl.sdk.n nVar2 = com.applovin.impl.t9.this.c;
                    if (com.applovin.impl.sdk.n.a()) {
                        com.applovin.impl.t9.this.c.a("AppLovinFullscreenActivity", "Video completed");
                    }
                    com.applovin.impl.t9 t9Var = com.applovin.impl.t9.this;
                    t9Var.e0 = true;
                    if (!t9Var.s) {
                        t9Var.T();
                        return;
                    } else {
                        if (t9Var.k()) {
                            com.applovin.impl.t9.this.R();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            com.applovin.impl.t9 t9Var2 = com.applovin.impl.t9.this;
            t9Var2.M.a(!t9Var2.a0 ? 1 : 0);
            com.applovin.impl.t9 t9Var3 = com.applovin.impl.t9.this;
            t9Var3.t = (int) java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(t9Var3.M.getDuration());
            com.applovin.impl.t9 t9Var4 = com.applovin.impl.t9.this;
            t9Var4.c(t9Var4.M.getDuration());
            com.applovin.impl.t9.this.M();
            com.applovin.impl.sdk.n nVar3 = com.applovin.impl.t9.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.t9.this.c.a("AppLovinFullscreenActivity", "MediaPlayer prepared: " + com.applovin.impl.t9.this.M);
            }
            com.applovin.impl.t9.this.X.b();
            com.applovin.impl.t9 t9Var5 = com.applovin.impl.t9.this;
            if (t9Var5.O != null) {
                t9Var5.N();
            }
            com.applovin.impl.t9.this.C();
            if (com.applovin.impl.t9.this.E.b()) {
                com.applovin.impl.t9.this.x();
            }
        }

        @Override // com.applovin.impl.qh.c
        public void a(com.applovin.impl.nh nhVar) {
            com.applovin.impl.t9.this.d("Video view error (" + com.applovin.impl.yp.a(nhVar) + ")");
            com.applovin.impl.t9.this.f();
        }

        @Override // com.applovin.impl.adview.AppLovinTouchToClickListener.OnClickListener
        public void onClick(android.view.View view, android.view.MotionEvent motionEvent) {
            com.applovin.impl.t9.this.a(motionEvent, (android.os.Bundle) null);
        }

        @Override // com.applovin.exoplayer2.ui.d.e
        public void d(int i) {
            if (i == 0) {
                com.applovin.impl.t9.this.L.c();
            }
        }

        /* synthetic */ e(com.applovin.impl.t9 t9Var, com.applovin.impl.t9.a aVar) {
            this();
        }
    }

    private class f implements android.view.View.OnClickListener {
        private f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            com.applovin.impl.t9 t9Var = com.applovin.impl.t9.this;
            if (view == t9Var.O) {
                t9Var.U();
                return;
            }
            if (view == t9Var.Q) {
                t9Var.W();
                return;
            }
            com.applovin.impl.sdk.n nVar = t9Var.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.t9.this.c.b("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
            }
        }

        /* synthetic */ f(com.applovin.impl.t9 t9Var, com.applovin.impl.t9.a aVar) {
            this();
        }
    }

    private class d implements com.applovin.impl.rr.a {
        private d() {
        }

        @Override // com.applovin.impl.rr.a
        public void b(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.n nVar = com.applovin.impl.t9.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.t9.this.c.a("AppLovinFullscreenActivity", "Clicking through from video button...");
            }
            com.applovin.impl.t9.this.a(lVar.getAndClearLastClickEvent(), (android.os.Bundle) null);
        }

        @Override // com.applovin.impl.rr.a
        public void a(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.n nVar = com.applovin.impl.t9.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.t9.this.c.a("AppLovinFullscreenActivity", "Closing ad from video button...");
            }
            com.applovin.impl.t9.this.f();
        }

        @Override // com.applovin.impl.rr.a
        public void d(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.n nVar = com.applovin.impl.t9.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.t9.this.c.a("AppLovinFullscreenActivity", "Skipping video from video button...");
            }
            com.applovin.impl.t9.this.U();
        }

        @Override // com.applovin.impl.rr.a
        public void c(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.n nVar = com.applovin.impl.t9.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.t9.this.c.a("AppLovinFullscreenActivity", "Fully Watched from video button...");
            }
            com.applovin.impl.t9.this.H = true;
        }

        /* synthetic */ d(com.applovin.impl.t9 t9Var, com.applovin.impl.t9.a aVar) {
            this();
        }

        @Override // com.applovin.impl.rr.a
        public void a(com.applovin.impl.adview.l lVar, android.os.Bundle bundle) {
            com.applovin.impl.sdk.n nVar = com.applovin.impl.t9.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.t9.this.c.a("AppLovinFullscreenActivity", "Attempting to launch Direct Download from video button...");
            }
            com.applovin.impl.t9.this.a(lVar.getAndClearLastClickEvent(), bundle);
        }

        @Override // com.applovin.impl.rr.a
        public void b(android.net.Uri uri, com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.n nVar = com.applovin.impl.t9.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.t9.this.c.a("AppLovinFullscreenActivity", "Attempting to report a template error from video button...");
            }
            com.applovin.impl.tp.b(uri, com.applovin.impl.t9.this.i.getController().i(), com.applovin.impl.t9.this.b);
        }

        @Override // com.applovin.impl.rr.a
        public void a(android.net.Uri uri, com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.n nVar = com.applovin.impl.t9.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.t9.this.c.a("AppLovinFullscreenActivity", "Attempting to load a url from video button...");
            }
            com.applovin.impl.tp.a(uri, com.applovin.impl.t9.this.i.getController(), com.applovin.impl.t9.this.b);
        }
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

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(java.lang.String str) {
        com.applovin.impl.tr.a(this.R, str, "AppLovinFullscreenActivity", this.b);
    }

    @Override // com.applovin.impl.o9
    protected void a(final java.lang.String str, long j) {
        super.a(str, j);
        if (this.R == null || j < 0 || !com.applovin.impl.sdk.utils.StringUtils.isValidString(str)) {
            return;
        }
        a(new java.lang.Runnable() { // from class: com.applovin.impl.t9$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(str);
            }
        }, j);
    }

    private void a(android.widget.ProgressBar progressBar, int i, int i2) {
        progressBar.setMax(i2);
        progressBar.setPadding(0, 0, 0, 0);
        if (com.applovin.impl.z3.f()) {
            progressBar.setProgressTintList(android.content.res.ColorStateList.valueOf(i));
        }
    }

    @Override // com.applovin.impl.o9
    public void a(android.view.ViewGroup viewGroup) {
        this.K.a(this.Q, this.O, this.R, this.N, this.S, this.P, this.L, this.i, this.j, null, viewGroup);
        com.applovin.impl.adview.k kVar = this.j;
        if (kVar != null) {
            kVar.b();
        }
        this.M.a(true);
        if (this.f1113a.f1()) {
            this.E.b(this.f1113a, new java.lang.Runnable() { // from class: com.applovin.impl.t9$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.H();
                }
            });
        }
        if (this.Z) {
            S();
        }
        this.i.renderAd(this.f1113a);
        if (this.O != null) {
            this.b.i0().a(new com.applovin.impl.jn(this.b, "scheduleSkipButton", new java.lang.Runnable() { // from class: com.applovin.impl.t9$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.N();
                }
            }), com.applovin.impl.tm.b.TIMEOUT, this.f1113a.n0(), true);
        }
        super.c(this.a0);
    }

    @Override // com.applovin.impl.o9
    public void a(long j) {
        a(new java.lang.Runnable() { // from class: com.applovin.impl.t9$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.L();
            }
        }, j);
    }
}

package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class u9 extends com.applovin.impl.o9 implements com.applovin.communicator.AppLovinCommunicatorSubscriber {
    private final com.applovin.impl.v9 K;
    private android.media.MediaPlayer L;
    protected final com.applovin.impl.adview.AppLovinVideoView M;
    protected final com.applovin.impl.o N;
    protected final com.applovin.impl.adview.g O;
    protected com.applovin.impl.h3 P;
    protected final android.widget.ImageView Q;
    protected com.applovin.impl.adview.l R;
    protected final android.widget.ProgressBar S;
    protected android.widget.ProgressBar T;
    protected android.widget.ImageView U;
    private final com.applovin.impl.u9.e V;
    private final com.applovin.impl.u9.d W;
    private final android.os.Handler X;
    private final android.os.Handler Y;
    protected final com.applovin.impl.u4 Z;
    protected final com.applovin.impl.u4 a0;
    private final boolean b0;
    protected boolean c0;
    protected long d0;
    private int e0;
    private int f0;
    protected boolean g0;
    private boolean h0;
    private final java.util.concurrent.atomic.AtomicBoolean i0;
    private final java.util.concurrent.atomic.AtomicBoolean j0;
    private long k0;
    private long l0;

    public void T() {
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a("AppLovinFullscreenActivity", "Showing postitial...");
        }
        e(this.f1113a.j1());
        long jU = this.f1113a.U();
        if (jU > 0) {
            this.q = 0L;
            java.lang.Long l = (java.lang.Long) this.b.a(com.applovin.impl.sj.C2);
            java.lang.Integer num = (java.lang.Integer) this.b.a(com.applovin.impl.sj.F2);
            android.widget.ProgressBar progressBar = new android.widget.ProgressBar(this.d, null, android.R.attr.progressBarStyleHorizontal);
            this.T = progressBar;
            a(progressBar, this.f1113a.T(), num.intValue());
            this.a0.a("POSTITIAL_PROGRESS_BAR", l.longValue(), new com.applovin.impl.u9.c(jU, num, l));
            this.a0.b();
        }
        this.K.a(this.k, this.j, this.i, this.T);
        a("javascript:al_onPoststitialShow(" + this.x + "," + this.y + ");", this.f1113a.D());
        if (this.k != null) {
            if (this.f1113a.p() >= 0) {
                a(this.k, this.f1113a.p(), new java.lang.Runnable() { // from class: com.applovin.impl.u9$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.K();
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
        this.g0 = true;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public java.lang.String getCommunicatorId() {
        return "FullscreenVideoAdPresenter";
    }

    @Override // com.applovin.impl.o9
    public void t() {
        if (com.applovin.impl.sdk.n.a()) {
            this.c.d("AppLovinFullscreenActivity", "Destroying video components");
        }
        try {
            if (((java.lang.Boolean) this.b.a(com.applovin.impl.sj.b6)).booleanValue()) {
                com.applovin.impl.tr.d(this.R);
                this.R = null;
            }
            if (this.b0) {
                com.applovin.communicator.AppLovinCommunicator.getInstance(this.d).unsubscribe(this, "video_caching_failed");
            }
            com.applovin.impl.adview.AppLovinVideoView appLovinVideoView = this.M;
            if (appLovinVideoView != null) {
                appLovinVideoView.pause();
                this.M.stopPlayback();
            }
            android.media.MediaPlayer mediaPlayer = this.L;
            if (mediaPlayer != null) {
                mediaPlayer.release();
            }
        } catch (java.lang.Throwable th) {
            com.applovin.impl.sdk.n.c("AppLovinFullscreenActivity", "Unable to destroy presenter", th);
        }
        super.t();
    }

    @Override // com.applovin.impl.o9
    public void x() {
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a("AppLovinFullscreenActivity", "Pausing video");
        }
        this.f0 = this.M.getCurrentPosition();
        this.M.pause();
        this.Z.c();
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a("AppLovinFullscreenActivity", "Paused video at position " + this.f0 + "ms");
        }
    }

    protected void d(java.lang.String str) {
        if (com.applovin.impl.sdk.n.a()) {
            this.c.b("AppLovinFullscreenActivity", "Encountered media error: " + str + " for ad: " + this.f1113a);
        }
        if (this.i0.compareAndSet(false, true)) {
            if (com.applovin.impl.yp.a(com.applovin.impl.sj.O0, this.b)) {
                this.b.A().d(this.f1113a, com.applovin.impl.sdk.j.m());
            }
            com.applovin.sdk.AppLovinAdDisplayListener appLovinAdDisplayListener = this.C;
            if (appLovinAdDisplayListener instanceof com.applovin.impl.pb) {
                ((com.applovin.impl.pb) appLovinAdDisplayListener).onAdDisplayFailed(str);
            }
            this.b.D().a(this.f1113a instanceof com.applovin.impl.aq ? "handleVastVideoError" : "handleVideoError", str, this.f1113a);
            f();
        }
    }

    private void d(boolean z) {
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

    public u9(com.applovin.impl.sdk.ad.b bVar, android.app.Activity activity, java.util.Map map, com.applovin.impl.sdk.j jVar, com.applovin.sdk.AppLovinAdClickListener appLovinAdClickListener, com.applovin.sdk.AppLovinAdDisplayListener appLovinAdDisplayListener, com.applovin.sdk.AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, jVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.K = new com.applovin.impl.v9(this.f1113a, this.d, this.b);
        com.applovin.impl.u9.a aVar = null;
        this.U = null;
        com.applovin.impl.u9.e eVar = new com.applovin.impl.u9.e(this, aVar);
        this.V = eVar;
        com.applovin.impl.u9.d dVar = new com.applovin.impl.u9.d(this, aVar);
        this.W = dVar;
        android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
        this.X = handler;
        android.os.Handler handler2 = new android.os.Handler(android.os.Looper.getMainLooper());
        this.Y = handler2;
        com.applovin.impl.u4 u4Var = new com.applovin.impl.u4(handler, this.b);
        this.Z = u4Var;
        this.a0 = new com.applovin.impl.u4(handler2, this.b);
        boolean zK0 = this.f1113a.K0();
        this.b0 = zK0;
        this.c0 = com.applovin.impl.yp.e(this.b);
        this.f0 = -1;
        this.i0 = new java.util.concurrent.atomic.AtomicBoolean();
        this.j0 = new java.util.concurrent.atomic.AtomicBoolean();
        this.k0 = -2L;
        this.l0 = 0L;
        if (bVar.hasVideoUrl()) {
            com.applovin.impl.adview.AppLovinVideoView appLovinVideoView = new com.applovin.impl.adview.AppLovinVideoView(activity);
            this.M = appLovinVideoView;
            appLovinVideoView.setOnPreparedListener(eVar);
            appLovinVideoView.setOnCompletionListener(eVar);
            appLovinVideoView.setOnErrorListener(eVar);
            appLovinVideoView.setOnTouchListener(new com.applovin.impl.adview.AppLovinTouchToClickListener(jVar, com.applovin.impl.sj.j0, activity, eVar));
            bVar.e().putString("video_view_address", com.applovin.impl.zq.a(appLovinVideoView));
            com.applovin.impl.u9.f fVar = new com.applovin.impl.u9.f(this, aVar);
            if (bVar.m0() >= 0) {
                com.applovin.impl.adview.g gVar = new com.applovin.impl.adview.g(bVar.d0(), activity);
                this.O = gVar;
                gVar.setVisibility(8);
                gVar.setOnClickListener(fVar);
            } else {
                this.O = null;
            }
            if (a(this.c0, jVar)) {
                android.widget.ImageView imageView = new android.widget.ImageView(activity);
                this.Q = imageView;
                imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
                imageView.setClickable(true);
                imageView.setOnClickListener(fVar);
                d(this.c0);
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
                u4Var.a("COUNTDOWN_CLOCK", java.util.concurrent.TimeUnit.SECONDS.toMillis(1L), new com.applovin.impl.u9.a(iG));
            }
            if (bVar.t0()) {
                java.lang.Long l = (java.lang.Long) jVar.a(com.applovin.impl.sj.t2);
                java.lang.Integer num = (java.lang.Integer) jVar.a(com.applovin.impl.sj.u2);
                android.widget.ProgressBar progressBar = new android.widget.ProgressBar(activity, null, android.R.attr.progressBarStyleHorizontal);
                this.S = progressBar;
                a(progressBar, bVar.s0(), num.intValue());
                u4Var.a("PROGRESS_BAR", l.longValue(), new com.applovin.impl.u9.b(num));
                return;
            }
            this.S = null;
            return;
        }
        throw new java.lang.IllegalStateException("Attempting to use fullscreen video ad presenter for non-video ad");
    }

    class a implements com.applovin.impl.u4.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f1389a;

        a(int i) {
            this.f1389a = i;
        }

        @Override // com.applovin.impl.u4.b
        public void a() {
            com.applovin.impl.u9 u9Var = com.applovin.impl.u9.this;
            if (u9Var.P != null) {
                long seconds = ((long) this.f1389a) - java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(u9Var.M.getCurrentPosition());
                if (seconds <= 0) {
                    com.applovin.impl.u9.this.u = true;
                } else if (com.applovin.impl.u9.this.P()) {
                    com.applovin.impl.u9.this.P.setProgress((int) seconds);
                }
            }
        }

        @Override // com.applovin.impl.u4.b
        public boolean b() {
            return com.applovin.impl.u9.this.P();
        }
    }

    class b implements com.applovin.impl.u4.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.Integer f1390a;

        b(java.lang.Integer num) {
            this.f1390a = num;
        }

        @Override // com.applovin.impl.u4.b
        public void a() {
            com.applovin.impl.u9 u9Var = com.applovin.impl.u9.this;
            if (u9Var.g0) {
                u9Var.S.setVisibility(8);
            } else {
                com.applovin.impl.u9.this.S.setProgress((int) ((u9Var.M.getCurrentPosition() / com.applovin.impl.u9.this.d0) * this.f1390a.intValue()));
            }
        }

        @Override // com.applovin.impl.u4.b
        public boolean b() {
            return !com.applovin.impl.u9.this.g0;
        }
    }

    @Override // com.applovin.impl.o9
    public void y() {
        a((android.view.ViewGroup) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I() {
        a(250L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O() {
        if (this.j0.compareAndSet(false, true)) {
            a(this.O, this.f1113a.m0(), new java.lang.Runnable() { // from class: com.applovin.impl.u9$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.H();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H() {
        this.k0 = -1L;
        this.l0 = android.os.SystemClock.elapsedRealtime();
    }

    @Override // com.applovin.impl.o9
    public void f() {
        this.Z.a();
        this.a0.a();
        this.X.removeCallbacksAndMessages(null);
        this.Y.removeCallbacksAndMessages(null);
        o();
        super.f();
    }

    protected void c(long j) {
        this.d0 = j;
    }

    @Override // com.applovin.impl.jb.a
    public void c() {
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a("AppLovinFullscreenActivity", "Continue video from prompt - will resume in onWindowFocusChanged(true) when alert dismisses");
        }
    }

    private void L() {
        com.applovin.impl.adview.l lVar;
        com.applovin.impl.qq qqVarK0 = this.f1113a.k0();
        if (qqVarK0 == null || !qqVarK0.j() || this.g0 || (lVar = this.R) == null) {
            return;
        }
        final boolean z = lVar.getVisibility() == 4;
        final long jH = qqVarK0.h();
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.u9$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(z, jH);
            }
        });
    }

    protected boolean P() {
        return (this.u || this.g0 || !this.M.isPlaying()) ? false : true;
    }

    public void U() {
        this.k0 = android.os.SystemClock.elapsedRealtime() - this.l0;
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a("AppLovinFullscreenActivity", "Attempting to skip video with skip time: " + this.k0 + "ms");
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

    private void e(boolean z) {
        this.e0 = A();
        if (z) {
            this.M.pause();
        } else {
            this.M.stopPlayback();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(boolean z, long j) {
        if (z) {
            com.applovin.impl.zq.a(this.R, j, (java.lang.Runnable) null);
        } else {
            com.applovin.impl.zq.b(this.R, j, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M() {
        if (this.g0) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.k("AppLovinFullscreenActivity", "Skip video resume - postitial shown");
                return;
            }
            return;
        }
        if (this.b.e0().isApplicationPaused()) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.k("AppLovinFullscreenActivity", "Skip video resume - app paused");
            }
        } else {
            if (this.f0 >= 0) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.c.a("AppLovinFullscreenActivity", "Resuming video at position " + this.f0 + "ms for MediaPlayer: " + this.L);
                }
                this.M.seekTo(this.f0);
                this.M.start();
                this.Z.b();
                this.f0 = -1;
                a(new java.lang.Runnable() { // from class: com.applovin.impl.u9$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.G();
                    }
                }, 250L);
                return;
            }
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a("AppLovinFullscreenActivity", "Invalid last video position");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G() {
        com.applovin.impl.o oVar = this.N;
        if (oVar != null) {
            oVar.a();
            final com.applovin.impl.o oVar2 = this.N;
            java.util.Objects.requireNonNull(oVar2);
            a(new java.lang.Runnable() { // from class: com.applovin.impl.u9$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    oVar2.b();
                }
            }, 2000L);
        }
    }

    protected void S() {
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.u9$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.J();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J() {
        com.applovin.impl.o oVar = this.N;
        if (oVar != null) {
            oVar.a();
        }
    }

    protected void C() {
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.u9$$ExternalSyntheticLambda0
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
        if (this.H && this.f1113a.c1()) {
            return true;
        }
        return E();
    }

    protected boolean E() {
        return A() >= this.f1113a.o0();
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
        L();
    }

    protected int A() {
        long currentPosition = this.M.getCurrentPosition();
        if (this.h0) {
            return 100;
        }
        if (currentPosition > 0) {
            return (int) ((currentPosition / this.d0) * 100.0f);
        }
        return this.e0;
    }

    protected boolean Q() {
        return k() && !D();
    }

    class c implements com.applovin.impl.u4.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f1391a;
        final /* synthetic */ java.lang.Integer b;
        final /* synthetic */ java.lang.Long c;

        c(long j, java.lang.Integer num, java.lang.Long l) {
            this.f1391a = j;
            this.b = num;
            this.c = l;
        }

        @Override // com.applovin.impl.u4.b
        public void a() {
            com.applovin.impl.u9.this.T.setProgress((int) ((com.applovin.impl.u9.this.q / this.f1391a) * this.b.intValue()));
            com.applovin.impl.u9.this.q += this.c.longValue();
        }

        @Override // com.applovin.impl.u4.b
        public boolean b() {
            return com.applovin.impl.u9.this.q < this.f1391a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K() {
        this.p = android.os.SystemClock.elapsedRealtime();
    }

    protected void V() {
        android.media.MediaPlayer mediaPlayer = this.L;
        if (mediaPlayer == null) {
            return;
        }
        try {
            float f2 = this.c0 ? 1.0f : 0.0f;
            mediaPlayer.setVolume(f2, f2);
            boolean z = !this.c0;
            this.c0 = z;
            d(z);
            a(this.c0, 0L);
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // com.applovin.impl.o9
    protected void o() {
        super.a(A(), this.b0, D(), this.k0);
    }

    protected void N() {
        long jW;
        long millis;
        if (this.f1113a.V() >= 0 || this.f1113a.W() >= 0) {
            if (this.f1113a.V() >= 0) {
                jW = this.f1113a.V();
            } else {
                com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) this.f1113a;
                long j = this.d0;
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
    public void i() {
        super.i();
        this.K.a(this.R);
        this.K.a((android.view.View) this.O);
        if (!k() || this.g0) {
            R();
        }
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
            if (messageData.getLong("ad_id") == this.f1113a.getAdIdNumber() && this.b0) {
                int i = messageData.getInt("load_response_code");
                java.lang.String string = messageData.getString("load_exception_message");
                if ((string == null && i >= 200 && i < 300) || this.h0 || this.M.isPlaying()) {
                    return;
                }
                d("Video cache error during stream. ResponseCode=" + i + ", exception=" + string);
            }
        }
    }

    @Override // com.applovin.impl.o9
    public void b(boolean z) {
        super.b(z);
        if (z) {
            a(0L);
            if (this.g0) {
                this.a0.b();
                return;
            }
            return;
        }
        if (this.g0) {
            this.a0.c();
        } else {
            x();
        }
    }

    private class e implements android.media.MediaPlayer.OnPreparedListener, android.media.MediaPlayer.OnErrorListener, android.media.MediaPlayer.OnInfoListener, android.media.MediaPlayer.OnCompletionListener, com.applovin.impl.adview.AppLovinTouchToClickListener.OnClickListener {
        private e() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(android.media.MediaPlayer mediaPlayer) {
            com.applovin.impl.u9.this.L = mediaPlayer;
            mediaPlayer.setOnInfoListener(com.applovin.impl.u9.this.V);
            mediaPlayer.setOnErrorListener(com.applovin.impl.u9.this.V);
            float f = !com.applovin.impl.u9.this.c0 ? 1 : 0;
            mediaPlayer.setVolume(f, f);
            com.applovin.impl.u9.this.t = (int) java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(mediaPlayer.getDuration());
            com.applovin.impl.u9.this.c(mediaPlayer.getDuration());
            com.applovin.impl.u9.this.N();
            com.applovin.impl.sdk.n nVar = com.applovin.impl.u9.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.u9.this.c.a("AppLovinFullscreenActivity", "MediaPlayer prepared: " + com.applovin.impl.u9.this.L);
            }
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(android.media.MediaPlayer mediaPlayer, int i, int i2) {
            com.applovin.impl.sdk.n nVar = com.applovin.impl.u9.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.u9.this.c.a("AppLovinFullscreenActivity", "MediaPlayer Info: (" + i + ", " + i2 + ")");
            }
            if (i == 701) {
                com.applovin.impl.u9.this.S();
                return false;
            }
            if (i != 3) {
                if (i != 702) {
                    return false;
                }
                com.applovin.impl.u9.this.C();
                return false;
            }
            com.applovin.impl.u9.this.Z.b();
            com.applovin.impl.u9 u9Var = com.applovin.impl.u9.this;
            if (u9Var.O != null) {
                u9Var.O();
            }
            com.applovin.impl.u9.this.C();
            if (!com.applovin.impl.u9.this.E.b()) {
                return false;
            }
            com.applovin.impl.u9.this.x();
            return false;
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(android.media.MediaPlayer mediaPlayer, int i, int i2) {
            com.applovin.impl.u9.this.d("Video view error (" + i + "," + i2 + ")");
            com.applovin.impl.u9.this.M.start();
            return true;
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(android.media.MediaPlayer mediaPlayer) {
            com.applovin.impl.sdk.n nVar = com.applovin.impl.u9.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.u9.this.c.a("AppLovinFullscreenActivity", "Video completed");
            }
            com.applovin.impl.u9.this.h0 = true;
            com.applovin.impl.u9 u9Var = com.applovin.impl.u9.this;
            if (!u9Var.s) {
                u9Var.T();
            } else if (u9Var.k()) {
                com.applovin.impl.u9.this.R();
            }
        }

        @Override // com.applovin.impl.adview.AppLovinTouchToClickListener.OnClickListener
        public void onClick(android.view.View view, android.view.MotionEvent motionEvent) {
            com.applovin.impl.u9.this.a(motionEvent, (android.os.Bundle) null);
        }

        /* synthetic */ e(com.applovin.impl.u9 u9Var, com.applovin.impl.u9.a aVar) {
            this();
        }
    }

    @Override // com.applovin.impl.jb.a
    public void b() {
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a("AppLovinFullscreenActivity", "Skipping video from prompt");
        }
        B();
    }

    private class f implements android.view.View.OnClickListener {
        private f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            com.applovin.impl.u9 u9Var = com.applovin.impl.u9.this;
            if (view == u9Var.O) {
                u9Var.U();
                return;
            }
            if (view == u9Var.Q) {
                u9Var.V();
                return;
            }
            com.applovin.impl.sdk.n nVar = u9Var.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.u9.this.c.b("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
            }
        }

        /* synthetic */ f(com.applovin.impl.u9 u9Var, com.applovin.impl.u9.a aVar) {
            this();
        }
    }

    private class d implements com.applovin.impl.rr.a {
        private d() {
        }

        @Override // com.applovin.impl.rr.a
        public void b(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.n nVar = com.applovin.impl.u9.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.u9.this.c.a("AppLovinFullscreenActivity", "Clicking through from video button...");
            }
            com.applovin.impl.u9.this.a(lVar.getAndClearLastClickEvent(), (android.os.Bundle) null);
        }

        @Override // com.applovin.impl.rr.a
        public void a(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.n nVar = com.applovin.impl.u9.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.u9.this.c.a("AppLovinFullscreenActivity", "Closing ad from video button...");
            }
            com.applovin.impl.u9.this.f();
        }

        @Override // com.applovin.impl.rr.a
        public void d(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.n nVar = com.applovin.impl.u9.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.u9.this.c.a("AppLovinFullscreenActivity", "Skipping video from video button...");
            }
            com.applovin.impl.u9.this.U();
        }

        @Override // com.applovin.impl.rr.a
        public void c(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.n nVar = com.applovin.impl.u9.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.u9.this.c.a("AppLovinFullscreenActivity", "Fully Watched from video button...");
            }
            com.applovin.impl.u9.this.H = true;
        }

        /* synthetic */ d(com.applovin.impl.u9 u9Var, com.applovin.impl.u9.a aVar) {
            this();
        }

        @Override // com.applovin.impl.rr.a
        public void a(com.applovin.impl.adview.l lVar, android.os.Bundle bundle) {
            com.applovin.impl.sdk.n nVar = com.applovin.impl.u9.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.u9.this.c.a("AppLovinFullscreenActivity", "Attempting to launch Direct Download from video button...");
            }
            com.applovin.impl.u9.this.a(lVar.getAndClearLastClickEvent(), bundle);
        }

        @Override // com.applovin.impl.rr.a
        public void b(android.net.Uri uri, com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.n nVar = com.applovin.impl.u9.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.u9.this.c.a("AppLovinFullscreenActivity", "Attempting to report a template error from video button...");
            }
            com.applovin.impl.tp.b(uri, com.applovin.impl.u9.this.i.getController().i(), com.applovin.impl.u9.this.b);
        }

        @Override // com.applovin.impl.rr.a
        public void a(android.net.Uri uri, com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.n nVar = com.applovin.impl.u9.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.u9.this.c.a("AppLovinFullscreenActivity", "Attempting to load a url from video button...");
            }
            com.applovin.impl.tp.a(uri, com.applovin.impl.u9.this.i.getController(), com.applovin.impl.u9.this.b);
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
        a(new java.lang.Runnable() { // from class: com.applovin.impl.u9$$ExternalSyntheticLambda6
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
        java.lang.String str;
        this.K.a(this.Q, this.O, this.R, this.N, this.S, this.P, this.M, this.i, this.j, this.U, viewGroup);
        if (com.applovin.impl.z3.i() && (str = this.b.f0().getExtraParameters().get("audio_focus_request")) != null) {
            this.M.setAudioFocusRequest(java.lang.Integer.parseInt(str));
        }
        android.os.StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        if (a(!this.b0)) {
            return;
        }
        this.M.setVideoURI(this.f1113a.u0());
        android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        if (this.f1113a.f1()) {
            this.E.b(this.f1113a, new java.lang.Runnable() { // from class: com.applovin.impl.u9$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.I();
                }
            });
        }
        com.applovin.impl.adview.k kVar = this.j;
        if (kVar != null) {
            kVar.b();
        }
        this.M.start();
        if (this.b0) {
            S();
        }
        this.i.renderAd(this.f1113a);
        if (this.O != null) {
            this.b.i0().a(new com.applovin.impl.jn(this.b, "scheduleSkipButton", new java.lang.Runnable() { // from class: com.applovin.impl.u9$$ExternalSyntheticLambda9
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.O();
                }
            }), com.applovin.impl.tm.b.TIMEOUT, this.f1113a.n0(), true);
        }
        super.c(this.c0);
    }

    @Override // com.applovin.impl.o9
    public void a(long j) {
        a(new java.lang.Runnable() { // from class: com.applovin.impl.u9$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.M();
            }
        }, j);
    }
}

package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class d6 extends com.json.k7<com.json.h6, com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener> implements com.json.p1, com.json.c6 {
    private com.json.x6 K;
    private boolean L;
    private com.json.mediationsdk.IronSourceBannerLayout M;
    private android.view.View N;
    private com.json.n7<?> O;
    private android.widget.FrameLayout.LayoutParams P;
    private final java.util.concurrent.atomic.AtomicBoolean Q;
    private final java.util.concurrent.atomic.AtomicBoolean R;

    class a implements com.json.y7 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.n7 f2575a;

        a(com.json.n7 n7Var) {
            this.f2575a = n7Var;
        }

        @Override // com.json.y7
        public void a() {
            ((com.json.h6) this.f2575a).Q();
        }
    }

    class b implements com.json.y7 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.n7 f2576a;

        b(com.json.n7 n7Var) {
            this.f2576a = n7Var;
        }

        @Override // com.json.y7
        public void a() {
            ((com.json.h6) this.f2576a).Q();
            com.json.d6 d6Var = com.json.d6.this;
            d6Var.s.j.j(d6Var.n());
            com.json.d6.this.Q.set(false);
            com.json.d6.this.W();
            com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("start binding timer after impression, expected interval = " + com.json.d6.this.o.getLoadingData().b() + ", current timestamp = " + java.lang.System.currentTimeMillis());
            com.json.d6.this.O().h();
        }
    }

    static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2577a;

        static {
            int[] iArr = new int[com.ironsource.l2.a.values().length];
            f2577a = iArr;
            try {
                iArr[com.ironsource.l2.a.MANUAL_WITH_AUTOMATIC_RELOAD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f2577a[com.ironsource.l2.a.MANUAL_WITH_LOAD_ON_SHOW.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    public d6(java.util.List<com.json.mediationsdk.model.NetworkSettings> list, com.json.r6 r6Var, java.lang.String str, com.json.lk lkVar, com.json.mediationsdk.IronSourceSegment ironSourceSegment) {
        super(new com.json.e6(str, list, r6Var), lkVar, ironSourceSegment);
        this.L = false;
        this.Q = new java.util.concurrent.atomic.AtomicBoolean(true);
        this.R = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.K = N();
    }

    private void M() {
        int i = com.ironsource.d6.c.f2577a[this.q.b().a().ordinal()];
        if (i == 1) {
            P().a();
        } else {
            if (i != 2) {
                return;
            }
            P().l();
            P().m();
            O().a();
            O().b();
        }
    }

    private com.json.x6 N() {
        return new com.json.x6(this.o.getLoadingData(), this.o.getInteractionData(), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.json.x6 O() {
        return this.K;
    }

    private com.json.d7 P() {
        return (com.json.d7) this.q;
    }

    private com.json.mediationsdk.ISBannerSize Q() {
        com.json.mediationsdk.IronSourceBannerLayout ironSourceBannerLayout = this.M;
        if (ironSourceBannerLayout == null || ironSourceBannerLayout.getSize() == null) {
            return null;
        }
        if (this.M.getSize().isSmart()) {
            return com.json.mediationsdk.AdapterUtils.isLargeScreen(com.json.environment.ContextProvider.getInstance().getApplicationContext()) ? com.json.mediationsdk.l.a() : com.json.mediationsdk.ISBannerSize.BANNER;
        }
        return this.M.getSize();
    }

    private boolean S() {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(b(this.N + ", " + this.P + ", " + this.O));
        return (this.N == null || this.P == null || this.O == null) ? false : true;
    }

    private void U() {
        int i = com.ironsource.d6.c.f2577a[this.q.b().a().ordinal()];
        if (i == 1) {
            P().k();
        } else {
            if (i != 2) {
                return;
            }
            P().r();
        }
    }

    private void V() {
        int i = com.ironsource.d6.c.f2577a[this.q.b().a().ordinal()];
        if (i == 1) {
            P().k();
        } else {
            if (i != 2) {
                return;
            }
            P().q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W() {
        this.O = null;
        this.N = null;
        this.P = null;
    }

    private void b(com.json.n7<?> n7Var, android.view.View view, android.widget.FrameLayout.LayoutParams layoutParams) {
        ((com.json.h6) n7Var).R();
        com.json.mediationsdk.l.a(this.M, view, layoutParams, new com.ironsource.d6.a(n7Var));
    }

    private void c(com.json.n7<?> n7Var, android.view.View view, android.widget.FrameLayout.LayoutParams layoutParams) {
        if (!a(com.ironsource.k7.f.READY_TO_SHOW, com.ironsource.k7.f.SHOWING)) {
            com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("wrong state = " + this.p);
            return;
        }
        this.R.set(false);
        O().e();
        ((com.json.h6) n7Var).R();
        com.json.mediationsdk.l.a(this.M, view, layoutParams, new com.ironsource.d6.b(n7Var));
    }

    boolean R() {
        com.json.mediationsdk.logger.IronLog ironLog;
        java.lang.String str;
        if (!this.M.isShown()) {
            ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
            str = "banner or one of its parents are INVISIBLE or GONE";
        } else {
            if (this.M.hasWindowFocus()) {
                boolean globalVisibleRect = this.M.getGlobalVisibleRect(new android.graphics.Rect());
                com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("visible = " + globalVisibleRect);
                return globalVisibleRect;
            }
            ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
            str = "banner has no window focus";
        }
        ironLog.verbose(str);
        return false;
    }

    public void T() {
        com.json.mediationsdk.IronSourceBannerLayout ironSourceBannerLayout = this.M;
        if (ironSourceBannerLayout != null) {
            a(ironSourceBannerLayout);
        }
    }

    @Override // com.json.k7
    protected com.json.mediationsdk.LoadWhileShowSupportState a(com.json.mediationsdk.model.NetworkSettings networkSettings, com.json.mediationsdk.adunit.adapter.internal.AdapterBaseInterface adapterBaseInterface) {
        return ((com.json.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface) adapterBaseInterface).getBannerLoadWhileShowSupportedState(networkSettings);
    }

    @Override // com.json.k7
    protected com.json.mediationsdk.adunit.adapter.utility.AdData a(com.json.mediationsdk.model.NetworkSettings networkSettings, java.lang.String str) {
        return com.json.mediationsdk.adunit.adapter.utility.AdData.createAdDataForNetworkAdapter(b(networkSettings), this.o.getAdUnit(), str, this.M);
    }

    @Override // com.json.k7
    protected /* bridge */ /* synthetic */ com.json.n7 a(com.json.mediationsdk.model.NetworkSettings networkSettings, com.json.mediationsdk.adunit.adapter.internal.BaseAdAdapter baseAdAdapter, int i, java.lang.String str, com.json.j5 j5Var) {
        return b(networkSettings, (com.json.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener>) baseAdAdapter, i, str, j5Var);
    }

    @Override // com.json.k7, com.json.a2
    public java.util.Map<java.lang.String, java.lang.Object> a(com.json.y1 y1Var) {
        java.util.Map<java.lang.String, java.lang.Object> mapA = super.a(y1Var);
        if (b(this.M)) {
            com.json.mediationsdk.l.a(mapA, this.M.getSize());
        }
        if (this.i != null) {
            mapA.put("placement", n());
        }
        return mapA;
    }

    @Override // com.json.k7
    protected void a(int i, java.lang.String str, boolean z) {
        if (!v()) {
            super.a(i, str, z);
            return;
        }
        if (!z) {
            this.s.g.a(com.json.fb.a(this.n), i, str);
            com.json.mediationsdk.n.a().b(this.o.getAdUnit(), new com.json.mediationsdk.logger.IronSourceError(i, str));
        }
        if (v()) {
            a(com.ironsource.k7.f.SHOWING);
            V();
        }
    }

    @Override // com.json.k7
    protected void a(android.content.Context context, com.json.mediationsdk.i iVar, com.json.p4 p4Var) {
        if (this.c == null) {
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(b("mAuctionHandler is null"));
        } else {
            iVar.a(Q());
            this.c.a(context, iVar, p4Var);
        }
    }

    public void a(com.json.mediationsdk.IronSourceBannerLayout ironSourceBannerLayout) {
        try {
            if (!b(ironSourceBannerLayout)) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                objArr[0] = ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed";
                com.json.mediationsdk.logger.IronLog.API.error("destroy banner failed - errorMessage = " + java.lang.String.format("can't destroy banner - %s", objArr));
                return;
            }
            com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("destroying banner");
            M();
            com.json.h6 h6Var = (com.json.h6) this.f2837a.d();
            if (h6Var != null) {
                this.s.g.a(h6Var.r() != null ? h6Var.r().intValue() : this.C.a(this.o.getAdUnit()));
                h6Var.P();
                this.f2837a.a(null);
                this.f2837a.b(null);
            }
            com.json.mediationsdk.l.a(ironSourceBannerLayout);
            this.M = null;
            this.i = null;
            this.L = false;
            if (P().o()) {
                this.Q.set(true);
                this.R.set(false);
                W();
            }
            a(com.ironsource.k7.f.READY_TO_LOAD);
        } catch (java.lang.Throwable th) {
            com.json.l9.d().a(th);
            java.lang.String str = "destroyBanner - exception = " + th.getLocalizedMessage() + " state = " + this.p;
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(b(str));
            com.json.b2 b2Var = this.s;
            if (b2Var != null) {
                b2Var.k.g(str);
            }
        }
    }

    public void a(com.json.mediationsdk.IronSourceBannerLayout ironSourceBannerLayout, com.json.mediationsdk.model.Placement placement) {
        java.lang.String str;
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("placement = " + placement);
        int iB = 510;
        if (!b(ironSourceBannerLayout)) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed";
            str = java.lang.String.format("can't load banner - %s", objArr);
        } else if (placement == null || android.text.TextUtils.isEmpty(placement.getCom.ironsource.op.d java.lang.String())) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            objArr2[0] = placement == null ? "placement is null" : "placement name is empty";
            str = java.lang.String.format("can't load banner - %s", objArr2);
            iB = com.json.x1.b(this.o.getAdUnit());
        } else if (this.E.b(com.json.environment.ContextProvider.getInstance().getApplicationContext(), placement, this.o.getAdUnit())) {
            str = java.lang.String.format("placement %s is capped", placement.getCom.ironsource.op.d java.lang.String());
            iB = com.json.x1.f(this.o.getAdUnit());
        } else {
            str = null;
        }
        if (!android.text.TextUtils.isEmpty(str)) {
            com.json.mediationsdk.logger.IronLog.API.error(b(str));
            a(iB, str, false);
        } else {
            com.json.mediationsdk.l.b(ironSourceBannerLayout);
            this.M = ironSourceBannerLayout;
            this.i = placement;
            A();
        }
    }

    @Override // com.json.r2
    public void a(com.json.n7<?> n7Var) {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(b(n7Var.k()));
        this.t.f(n7Var.f());
    }

    @Override // com.json.p1
    public void a(com.json.n7<?> n7Var, android.view.View view, android.widget.FrameLayout.LayoutParams layoutParams) {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("mState = " + this.p);
        super.e(n7Var);
        if (this.o.getLoadingData().a() == com.ironsource.l2.a.MANUAL_WITH_AUTOMATIC_RELOAD) {
            if (!a(com.ironsource.k7.f.READY_TO_SHOW, com.ironsource.k7.f.SHOWING)) {
                return;
            }
            this.f2837a.a(n7Var);
            this.f2837a.b(n7Var);
            b(n7Var, view, layoutParams);
            P().k();
        } else {
            if (!P().o()) {
                return;
            }
            this.f2837a.b(n7Var);
            if (this.Q.get()) {
                c(n7Var, view, layoutParams);
            } else {
                this.O = n7Var;
                this.N = view;
                this.P = layoutParams;
            }
        }
        this.t.c(n7Var.f());
    }

    protected com.json.h6 b(com.json.mediationsdk.model.NetworkSettings networkSettings, com.json.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener> baseAdAdapter, int i, java.lang.String str, com.json.j5 j5Var) {
        return new com.json.h6(this, new com.json.j1(com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER, this.o.getUserId(), i, this.g, str, this.e, this.f, networkSettings, this.o.getSmashLoadTimeout()), baseAdAdapter, this.M, this.i, v(), j5Var, this);
    }

    @Override // com.json.k7
    protected org.json.JSONObject b(com.json.mediationsdk.model.NetworkSettings networkSettings) {
        return networkSettings.getBannerSettings();
    }

    @Override // com.json.k7, com.json.bm
    public void b() {
        boolean z;
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose(i());
        try {
            if (this.M == null) {
                ironLog.error("mIronSourceBanner is null");
                this.s.g.b(com.json.mediationsdk.logger.IronSourceError.ERROR_BN_RELOAD_SKIP_BANNER_LAYOUT_IS_NULL);
                return;
            }
            if (!R()) {
                if (this.o.getLoadingData().a() == com.ironsource.l2.a.MANUAL_WITH_AUTOMATIC_RELOAD) {
                    ironLog.verbose("banner is not visible, reload skipped");
                    this.s.g.b(com.json.mediationsdk.logger.IronSourceError.ERROR_BN_RELOAD_SKIP_INVISIBLE);
                }
                U();
                return;
            }
            synchronized (this.x) {
                if (a(com.ironsource.k7.f.SHOWING, com.ironsource.k7.f.READY_TO_LOAD)) {
                    ironLog.verbose("start reload");
                    z = true;
                    this.L = true;
                } else {
                    ironLog.error("wrong state = " + this.p);
                    z = false;
                }
            }
            if (z) {
                a(this.M, this.i);
            }
        } catch (java.lang.Throwable th) {
            com.json.l9.d().a(th);
            this.s.k.c(th.getMessage());
        }
    }

    @Override // com.json.k7, com.json.o2
    public void b(com.json.n7<?> n7Var) {
        super.b(n7Var);
        if (P().o()) {
            if (!this.R.compareAndSet(false, true)) {
                com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("Impression already recorded as receive, it can occur from network onAdOpened or from impression timeout timer - loading next ad already in progress");
            } else {
                O().b();
                U();
            }
        }
    }

    boolean b(com.json.mediationsdk.IronSourceBannerLayout ironSourceBannerLayout) {
        return (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) ? false : true;
    }

    @Override // com.json.r2
    public void c(com.json.n7<?> n7Var) {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(b(n7Var.k()));
        this.t.e(n7Var.f());
    }

    @Override // com.json.r2
    public void d(com.json.n7<?> n7Var) {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(b(n7Var.k()));
        this.t.b(n7Var.f());
    }

    @Override // com.json.c6
    public void e() {
        if (!R()) {
            com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("banner is not visible, binding skipped");
            O().h();
            this.s.g.b(com.json.mediationsdk.logger.IronSourceError.ERROR_BN_BINDING_SKIP_INVISIBLE);
        } else if (S()) {
            com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("done binding timer, binding view now, current timestamp = " + java.lang.System.currentTimeMillis());
            c(this.O, this.N, this.P);
        } else {
            com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("Cannot bind banner view after interval, the next ad is not ready yet");
            this.Q.set(true);
        }
    }

    @Override // com.json.c6
    public void f() {
        if (!R()) {
            com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("banner is not visible, starting the impression timeout timer again");
            O().e();
        } else if (this.R.compareAndSet(false, true)) {
            com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("banner impression timeout reached, reloading banner manually");
            U();
            this.s.k.b("banner impression timeout reached, reloading banner manually");
        }
    }

    @Override // com.json.k7
    protected com.json.i2 g() {
        return new com.json.y6();
    }

    @Override // com.json.k7
    protected void g(com.json.n7<?> n7Var) {
    }

    @Override // com.json.k7
    protected com.json.n2 h() {
        return new com.json.d7(this.o.getLoadingData(), this);
    }

    @Override // com.json.k7
    protected void h(com.json.n7<?> n7Var) {
    }

    @Override // com.json.k7
    protected java.lang.String l() {
        return "BN";
    }

    @Override // com.json.k7
    protected java.lang.String o() {
        return com.json.mediationsdk.utils.IronSourceConstants.OPW_BN_MANAGER_NAME;
    }

    @Override // com.json.k7
    protected boolean v() {
        return this.L;
    }
}

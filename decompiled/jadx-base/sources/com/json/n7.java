package com.json;

/* JADX INFO: loaded from: classes5.dex */
public abstract class n7<Listener extends com.json.o2> implements com.json.mediationsdk.adunit.adapter.listener.NetworkInitializationListener, com.ironsource.mt.a, com.json.a2, com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener, com.ironsource.uh.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.json.j1 f3063a;
    protected Listener b;
    protected com.json.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener> c;
    protected com.json.b2 d;
    protected com.ironsource.n7.h e;
    protected com.json.mediationsdk.model.Placement g;
    protected com.json.z2 h;
    protected org.json.JSONObject i;
    protected java.lang.String j;
    protected com.json.mediationsdk.adunit.adapter.utility.AdData k;
    protected java.lang.Long l;
    protected com.json.fb m;
    private final com.json.j5 o;
    private final com.json.pp p;
    private java.util.concurrent.atomic.AtomicBoolean f = new java.util.concurrent.atomic.AtomicBoolean(false);
    private com.json.mt n = new com.json.mt(java.util.concurrent.TimeUnit.SECONDS.toMillis(s()));
    protected final java.lang.Object q = new java.lang.Object();

    class a extends com.json.dr {
        a() {
        }

        @Override // com.json.dr
        public void a() {
            com.json.n7.this.L();
        }
    }

    class b extends com.json.dr {
        b() {
        }

        @Override // com.json.dr
        public void a() {
            com.json.n7.this.K();
        }
    }

    class c extends com.json.dr {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f3066a;
        final /* synthetic */ java.lang.String b;

        c(int i, java.lang.String str) {
            this.f3066a = i;
            this.b = str;
        }

        @Override // com.json.dr
        public void a() {
            com.json.n7.this.a(this.f3066a, this.b);
        }
    }

    class d extends com.json.dr {
        d() {
        }

        @Override // com.json.dr
        public void a() {
            com.json.n7.this.I();
        }
    }

    class e extends com.json.dr {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.mediationsdk.adunit.adapter.utility.AdapterErrorType f3068a;
        final /* synthetic */ int b;
        final /* synthetic */ java.lang.String c;

        e(com.json.mediationsdk.adunit.adapter.utility.AdapterErrorType adapterErrorType, int i, java.lang.String str) {
            this.f3068a = adapterErrorType;
            this.b = i;
            this.c = str;
        }

        @Override // com.json.dr
        public void a() {
            com.json.n7.this.a(this.f3068a, this.b, this.c);
        }
    }

    class f extends com.json.dr {
        f() {
        }

        @Override // com.json.dr
        public void a() {
            com.json.n7.this.J();
        }
    }

    class g extends com.json.dr {
        g() {
        }

        @Override // com.json.dr
        public void a() {
            com.json.n7.this.H();
        }
    }

    protected enum h {
        NONE,
        INIT_IN_PROGRESS,
        READY_TO_LOAD,
        LOADING,
        LOADED,
        SHOWING,
        FAILED
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n7(com.json.pp ppVar, com.json.j1 j1Var, com.json.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, ?> baseAdAdapter, com.json.z2 z2Var, com.json.j5 j5Var, Listener listener) {
        this.f3063a = j1Var;
        this.b = listener;
        this.d = new com.json.b2(j1Var.a(), com.ironsource.b2.b.PROVIDER, this);
        this.h = z2Var;
        this.i = z2Var.c();
        this.c = baseAdAdapter;
        this.o = j5Var;
        this.p = ppVar;
        a(com.ironsource.n7.h.NONE);
    }

    private boolean D() {
        return this.e == com.ironsource.n7.h.INIT_IN_PROGRESS;
    }

    private void F() {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(d());
        a(com.ironsource.n7.h.LOADING);
        a(false);
        try {
            this.n.a((com.ironsource.mt.a) this);
            G();
        } catch (java.lang.Throwable th) {
            com.json.l9.d().a(th);
            java.lang.String str = "unexpected error while calling adapter.loadAd() - " + th.getMessage() + " - state = " + this.e;
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(a(str));
            com.json.b2 b2Var = this.d;
            if (b2Var != null) {
                b2Var.k.g(str);
            }
            onAdLoadFailed(com.json.mediationsdk.adunit.adapter.utility.AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 510, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(d());
        com.json.b2 b2Var = this.d;
        if (b2Var != null) {
            b2Var.j.a(j());
        }
        this.b.f(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        boolean zO;
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose(d());
        com.json.mt mtVar = this.n;
        if (mtVar != null) {
            mtVar.e();
        }
        synchronized (this.q) {
            com.ironsource.n7.h hVar = this.e;
            zO = false;
            if (hVar == com.ironsource.n7.h.LOADING) {
                long jA = com.json.fb.a(this.m);
                ironLog.verbose(a("Load duration = " + jA));
                if (this.d != null) {
                    if (v()) {
                        this.d.g.a(jA);
                    } else {
                        this.d.g.a(jA, false);
                    }
                }
                a(com.ironsource.n7.h.LOADED);
                zO = O();
            } else if (hVar != com.ironsource.n7.h.FAILED) {
                ironLog.error(a(java.lang.String.format("unexpected load success for %s, state - %s", k(), this.e)));
                java.lang.String str = java.lang.String.format("unexpected load success, state - %s", this.e);
                if (this.d != null) {
                    if (v()) {
                        this.d.k.r(str);
                    } else {
                        this.d.k.o(str);
                    }
                }
            }
        }
        if (zO) {
            this.b.e(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(d());
        a(com.ironsource.n7.h.SHOWING);
        com.json.b2 b2Var = this.d;
        if (b2Var != null) {
            b2Var.j.g(j());
        }
        this.b.b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose(d());
        if (D()) {
            com.json.mt mtVar = this.n;
            if (mtVar != null) {
                mtVar.e();
            }
            a(com.ironsource.n7.h.READY_TO_LOAD);
            F();
            return;
        }
        if (this.e == com.ironsource.n7.h.FAILED) {
            return;
        }
        ironLog.error(a(java.lang.String.format("unexpected init success for %s, state - %s", k(), this.e)));
        if (this.d != null) {
            this.d.k.m(java.lang.String.format("unexpected init success, state - %s", this.e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L() {
        long jA = com.json.fb.a(this.m);
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose(a("Load duration = " + jA + ", state = " + this.e + ", isBidder = " + w()));
        synchronized (this.q) {
            if (!z()) {
                ironLog.error(a(java.lang.String.format("unexpected timeout for %s, state - %s, error - %s", k(), this.e, 1025)));
                if (this.d != null) {
                    this.d.k.t(java.lang.String.format("unexpected timeout, state - %s, error - %s", this.e, 1025));
                }
            } else {
                a(com.ironsource.n7.h.FAILED);
                com.json.b2 b2Var = this.d;
                if (b2Var != null) {
                    b2Var.g.a(jA, 1025, false);
                    this.d.g.a(jA, 1025, "time out", false);
                }
                this.b.a(com.json.mediationsdk.utils.ErrorBuilder.buildLoadFailedError("time out"), this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, java.lang.String str) {
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose(a("error = " + i + ", " + str));
        if (D()) {
            com.json.mt mtVar = this.n;
            if (mtVar != null) {
                mtVar.e();
            }
            a(com.ironsource.n7.h.FAILED);
            a(com.json.mediationsdk.adunit.adapter.utility.AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, i, str, com.json.fb.a(this.m));
            this.b.a(new com.json.mediationsdk.logger.IronSourceError(i, str), this);
            return;
        }
        if (this.e == com.ironsource.n7.h.FAILED) {
            return;
        }
        ironLog.error(a(java.lang.String.format("unexpected init failed for %s, state - %s, error - %s, %s", k(), this.e, java.lang.Integer.valueOf(i), str)));
        if (this.d != null) {
            this.d.k.l(java.lang.String.format("unexpected init failed, state - %s, error - %s, %s", this.e, java.lang.Integer.valueOf(i), str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.json.mediationsdk.adunit.adapter.utility.AdapterErrorType adapterErrorType, int i, java.lang.String str) {
        long jA = com.json.fb.a(this.m);
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose(a("Load duration = " + jA + ", error = " + i + ", " + str));
        com.json.mt mtVar = this.n;
        if (mtVar != null) {
            mtVar.e();
        }
        synchronized (this.q) {
            com.ironsource.n7.h hVar = this.e;
            if (hVar == com.ironsource.n7.h.LOADING) {
                a(adapterErrorType, i, str, jA);
                a(com.ironsource.n7.h.FAILED);
                this.b.a(new com.json.mediationsdk.logger.IronSourceError(i, str), this);
                return;
            }
            if (hVar == com.ironsource.n7.h.FAILED) {
                a(adapterErrorType, i, str, jA);
                return;
            }
            if (hVar == com.ironsource.n7.h.LOADED && adapterErrorType == com.json.mediationsdk.adunit.adapter.utility.AdapterErrorType.ADAPTER_ERROR_TYPE_AD_EXPIRED) {
                this.l = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
                ironLog.error(a(java.lang.String.format("ad expired for %s, state = %s", this.h.f(), this.e)));
                com.json.b2 b2Var = this.d;
                if (b2Var != null) {
                    b2Var.k.a(java.lang.String.format("ad expired, state = %s", this.e));
                }
                return;
            }
            ironLog.error(a(java.lang.String.format("unexpected load failed for %s, state - %s, error - %s, %s", k(), this.e, java.lang.Integer.valueOf(i), str)));
            java.lang.String str2 = java.lang.String.format("unexpected load failed, state - %s, error - %s, %s", this.e, java.lang.Integer.valueOf(i), str);
            if (this.d != null) {
                if (v()) {
                    this.d.k.q(str2);
                } else if (this.f3063a.a() != com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO || this.e != com.ironsource.n7.h.SHOWING) {
                    this.d.k.n(str2);
                }
            }
        }
    }

    private void a(com.json.mediationsdk.adunit.adapter.utility.AdapterErrorType adapterErrorType, int i, java.lang.String str, long j) {
        if (this.d != null) {
            if (adapterErrorType == com.json.mediationsdk.adunit.adapter.utility.AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL) {
                if (v()) {
                    this.d.g.b(j, i);
                    return;
                } else {
                    this.d.g.a(j, i);
                    return;
                }
            }
            if (android.text.TextUtils.isEmpty(str)) {
                this.d.g.a(j, i, false);
            } else if (v()) {
                this.d.g.a(j, i, str);
            } else {
                this.d.g.a(j, i, str, false);
            }
        }
    }

    private boolean b(com.json.y1 y1Var) {
        return new java.util.ArrayList(java.util.Arrays.asList(com.json.y1.LOAD_AD, com.json.y1.LOAD_AD_SUCCESS, com.json.y1.LOAD_AD_FAILED, com.json.y1.LOAD_AD_FAILED_WITH_REASON, com.json.y1.LOAD_AD_NO_FILL, com.json.y1.RELOAD_AD, com.json.y1.RELOAD_AD_SUCCESS, com.json.y1.RELOAD_AD_FAILED_WITH_REASON, com.json.y1.RELOAD_AD_NO_FILL, com.json.y1.DESTROY_AD, com.json.y1.AD_PRESENT_SCREEN, com.json.y1.AD_DISMISS_SCREEN, com.json.y1.AD_LEFT_APPLICATION, com.json.y1.AD_OPENED, com.json.y1.AD_CLOSED, com.json.y1.SHOW_AD, com.json.y1.SHOW_AD_FAILED, com.json.y1.AD_CLICKED, com.json.y1.AD_REWARDED)).contains(y1Var);
    }

    private int o() {
        return 1;
    }

    private int s() {
        com.json.j5 j5Var = this.o;
        if (j5Var == null) {
            return this.f3063a.f();
        }
        java.lang.Integer numF = j5Var.f();
        int iF = (numF == null || numF.intValue() <= 0) ? this.f3063a.f() : numF.intValue();
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(a("Load timeout for " + this.o.c() + " - " + iF + " seconds"));
        return iF;
    }

    public java.util.concurrent.atomic.AtomicBoolean A() {
        return this.f;
    }

    public boolean B() {
        return y();
    }

    public boolean C() {
        return this.e == com.ironsource.n7.h.SHOWING;
    }

    public void E() {
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose(d());
        com.json.j5 j5VarI = i();
        java.lang.String strK = j5VarI.k();
        java.util.Map<java.lang.String, java.lang.Object> mapA = com.json.hk.a(j5VarI.a());
        mapA.put("adUnit", this.f3063a.a());
        b(strK);
        try {
            boolean z = false;
            if (v()) {
                this.d.g.a();
            } else {
                this.d.g.a(false);
            }
            this.l = null;
            this.m = new com.json.fb();
            this.k = a(strK, mapA);
            synchronized (this.q) {
                if (this.e != com.ironsource.n7.h.NONE) {
                    z = true;
                } else {
                    a(com.ironsource.n7.h.INIT_IN_PROGRESS);
                }
            }
            if (z) {
                java.lang.String str = "loadAd - incorrect state while loading, state = " + this.e;
                ironLog.error(a(str));
                this.d.k.g(str);
                onInitFailed(com.json.x1.c(this.f3063a.a()), str);
                return;
            }
            this.n.a((com.ironsource.mt.a) this);
            com.json.mediationsdk.adunit.adapter.internal.AdapterBaseInterface networkAdapter = this.c.getNetworkAdapter();
            if (networkAdapter != null) {
                networkAdapter.init(this.k, com.json.environment.ContextProvider.getInstance().getApplicationContext(), this);
                return;
            }
            java.lang.String str2 = "loadAd - network adapter not available " + k();
            ironLog.error(a(str2));
            onInitFailed(com.json.x1.c(this.f3063a.a()), str2);
        } catch (java.lang.Throwable th) {
            com.json.l9.d().a(th);
            java.lang.String str3 = "loadAd - exception = " + th.getLocalizedMessage();
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(a(str3));
            com.json.b2 b2Var = this.d;
            if (b2Var != null) {
                b2Var.k.g(str3);
            }
            onInitFailed(com.json.x1.c(this.f3063a.a()), str3);
        }
    }

    protected void G() {
        java.lang.Object obj = this.c;
        if (obj instanceof com.json.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface) {
            ((com.json.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface) obj).loadAd(this.k, com.json.environment.ContextProvider.getInstance().getCurrentActiveActivity(), this);
        } else {
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(a("adapter not instance of AdapterAdFullScreenInterface"));
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0059 A[Catch: all -> 0x0069, TryCatch #1 {, blocks: (B:4:0x0003, B:7:0x0008, B:13:0x0055, B:15:0x0059, B:16:0x005e, B:18:0x0062, B:19:0x0067, B:10:0x000f, B:12:0x0050), top: B:26:0x0003, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0062 A[Catch: all -> 0x0069, TryCatch #1 {, blocks: (B:4:0x0003, B:7:0x0008, B:13:0x0055, B:15:0x0059, B:16:0x005e, B:18:0x0062, B:19:0x0067, B:10:0x000f, B:12:0x0050), top: B:26:0x0003, inners: #0 }] */
    public void M() {
        com.json.b2 b2Var;
        com.json.mt mtVar;
        synchronized (this) {
            com.json.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener> baseAdAdapter = this.c;
            if (baseAdAdapter != null) {
                try {
                    baseAdAdapter.releaseMemory();
                    this.c = null;
                } catch (java.lang.Exception e2) {
                    com.json.l9.d().a(e2);
                    java.lang.String str = "Exception while calling adapter.releaseMemory() from " + this.h.f() + " - " + e2.getMessage() + " - state = " + this.e;
                    com.json.mediationsdk.logger.IronLog.INTERNAL.error(a(str));
                    com.json.b2 b2Var2 = this.d;
                    if (b2Var2 != null) {
                        b2Var2.k.g(str);
                    }
                }
                b2Var = this.d;
                if (b2Var != null) {
                    b2Var.f();
                    this.d = null;
                }
                mtVar = this.n;
                if (mtVar != null) {
                    mtVar.d();
                    this.n = null;
                }
            } else {
                b2Var = this.d;
                if (b2Var != null) {
                    b2Var.f();
                    this.d = null;
                }
                mtVar = this.n;
                if (mtVar != null) {
                    mtVar.d();
                    this.n = null;
                }
            }
            throw th;
        }
    }

    public void N() {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(d());
        com.json.b2 b2Var = this.d;
        if (b2Var != null) {
            b2Var.j.a();
        }
    }

    protected boolean O() {
        return true;
    }

    protected com.json.mediationsdk.adunit.adapter.utility.AdData a(java.lang.String str, java.util.Map<java.lang.String, java.lang.Object> map) {
        return new com.json.mediationsdk.adunit.adapter.utility.AdData(str, q(), a(map));
    }

    protected java.lang.String a(java.lang.String str) {
        java.lang.String str2 = this.f3063a.a().name() + " - " + k() + " - state = " + this.e;
        return android.text.TextUtils.isEmpty(str) ? str2 : str2 + " - " + str;
    }

    public java.util.Map<java.lang.String, java.lang.Object> a(com.json.y1 y1Var) {
        java.util.HashMap map = new java.util.HashMap();
        try {
            com.json.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener> baseAdAdapter = this.c;
            map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, baseAdAdapter != null ? baseAdAdapter.getNetworkAdapter().getAdapterVersion() : "");
            com.json.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener> baseAdAdapter2 = this.c;
            map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, baseAdAdapter2 != null ? baseAdAdapter2.getNetworkAdapter().getNetworkSDKVersion() : "");
        } catch (java.lang.Exception e2) {
            com.json.l9.d().a(e2);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(a("could not get adapter version for event data" + k()));
        }
        map.put("spId", this.h.i());
        map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER, this.h.a());
        map.put("instanceType", java.lang.Integer.valueOf(l()));
        map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_PROGRAMMATIC, java.lang.Integer.valueOf(o()));
        if (!android.text.TextUtils.isEmpty(this.j)) {
            map.put("dynamicDemandSource", this.j);
        }
        map.put("sessionDepth", r());
        if (this.f3063a.e() != null && this.f3063a.e().length() > 0) {
            map.put("genericParams", this.f3063a.e());
        }
        if (!android.text.TextUtils.isEmpty(this.f3063a.c())) {
            map.put("auctionId", this.f3063a.c());
        }
        if (b(y1Var)) {
            map.put(com.json.mediationsdk.utils.IronSourceConstants.AUCTION_TRIALS, java.lang.Integer.valueOf(this.f3063a.d()));
            if (!android.text.TextUtils.isEmpty(this.f3063a.b())) {
                map.put(com.json.mediationsdk.utils.IronSourceConstants.AUCTION_FALLBACK, this.f3063a.b());
            }
        }
        if (!android.text.TextUtils.isEmpty(this.f3063a.g().getCustomNetwork())) {
            map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_CUSTOM_NETWORK_FIELD, this.f3063a.g().getCustomNetwork());
        }
        return map;
    }

    protected java.util.Map<java.lang.String, java.lang.Object> a(java.util.Map<java.lang.String, java.lang.Object> map) {
        if (map == null) {
            map = new java.util.HashMap<>();
        }
        map.put("userId", this.f3063a.i());
        return map;
    }

    @Override // com.ironsource.mt.a
    public void a() {
        if (this.p.c()) {
            this.p.a(new com.ironsource.n7.a());
        } else {
            L();
        }
    }

    protected void a(com.ironsource.n7.h hVar) {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(d());
        this.e = hVar;
    }

    public void a(boolean z) {
        this.f.set(z);
    }

    @Override // com.ironsource.uh.b
    public int b() {
        return this.h.e();
    }

    public void b(java.lang.String str) {
        this.j = com.json.mediationsdk.d.b().c(str);
    }

    @Override // com.ironsource.uh.b
    public java.lang.String c() {
        return this.h.f();
    }

    protected java.lang.String d() {
        return a((java.lang.String) null);
    }

    public java.lang.Long e() {
        return this.l;
    }

    public com.json.mediationsdk.adunit.adapter.utility.AdInfo f() {
        return new com.json.mediationsdk.adunit.adapter.utility.AdInfo(this.o.a(j()), this.o.d());
    }

    public com.ironsource.mediationsdk.IronSource.AD_UNIT g() {
        return this.f3063a.a();
    }

    public java.lang.String h() {
        return this.f3063a.c();
    }

    public com.json.j5 i() {
        return this.o;
    }

    protected java.lang.String j() {
        com.json.mediationsdk.model.Placement placement = this.g;
        return placement == null ? "" : placement.getCom.ironsource.op.d java.lang.String();
    }

    public java.lang.String k() {
        return java.lang.String.format("%s %s", c(), java.lang.Integer.valueOf(hashCode()));
    }

    public int l() {
        return this.h.d();
    }

    public java.lang.String m() {
        return this.h.h().isMultipleInstances() ? this.h.h().getProviderTypeForReflection() : this.h.f();
    }

    public java.lang.String n() {
        return this.h.g();
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdClicked() {
        if (this.p.c()) {
            this.p.a(new com.ironsource.n7.g());
        } else {
            H();
        }
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadFailed(com.json.mediationsdk.adunit.adapter.utility.AdapterErrorType adapterErrorType, int i, java.lang.String str) {
        if (this.p.c()) {
            this.p.a(new com.ironsource.n7.e(adapterErrorType, i, str));
        } else {
            a(adapterErrorType, i, str);
        }
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadSuccess() {
        if (this.p.c()) {
            this.p.a(new com.ironsource.n7.d());
        } else {
            I();
        }
    }

    public void onAdOpened() {
        if (this.p.c()) {
            this.p.a(new com.ironsource.n7.f());
        } else {
            J();
        }
    }

    @Override // com.json.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitFailed(int i, java.lang.String str) {
        if (this.p.c()) {
            this.p.a(new com.ironsource.n7.c(i, str));
        } else {
            a(i, str);
        }
    }

    @Override // com.json.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitSuccess() {
        if (this.p.c()) {
            this.p.a(new com.ironsource.n7.b());
        } else {
            K();
        }
    }

    public com.json.mediationsdk.model.NetworkSettings p() {
        return this.f3063a.g();
    }

    protected java.util.Map<java.lang.String, java.lang.Object> q() {
        java.util.HashMap map = new java.util.HashMap();
        map.putAll(com.json.hk.a(this.i));
        return map;
    }

    public java.lang.Integer r() {
        com.json.j1 j1Var = this.f3063a;
        if (j1Var != null) {
            return java.lang.Integer.valueOf(j1Var.h());
        }
        return null;
    }

    public com.ironsource.n7.h t() {
        return this.e;
    }

    protected com.json.pp u() {
        return this.p;
    }

    protected boolean v() {
        return false;
    }

    public boolean w() {
        return this.h.j();
    }

    public boolean x() {
        return this.e == com.ironsource.n7.h.FAILED;
    }

    public boolean y() {
        return this.e == com.ironsource.n7.h.LOADED;
    }

    public boolean z() {
        com.ironsource.n7.h hVar = this.e;
        return hVar == com.ironsource.n7.h.INIT_IN_PROGRESS || hVar == com.ironsource.n7.h.LOADING;
    }
}

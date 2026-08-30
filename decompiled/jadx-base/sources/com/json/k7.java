package com.json;

/* JADX INFO: loaded from: classes5.dex */
public abstract class k7<Smash extends com.json.n7<?>, Listener extends com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener> implements com.json.o2, com.json.p4, com.json.a2, com.json.bm, com.json.zn, com.json.o, com.json.xv, com.json.u7, com.json.pp {
    private com.json.mediationsdk.adunit.adapter.utility.AdInfo A;
    private com.json.lk B;
    final com.json.vh C;
    final com.ironsource.vh.a D;
    protected final com.json.wf E;
    private final com.ironsource.wf.a F;
    private boolean G;
    private com.json.au H;
    private java.util.concurrent.atomic.AtomicBoolean I;
    private com.json.tj J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.json.wv<Smash> f2837a;
    protected java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.h.a> b;
    protected com.json.mediationsdk.e c;
    protected com.json.mediationsdk.h d;
    protected int e;
    protected java.lang.String f;
    protected org.json.JSONObject g;
    protected com.json.j5 h;
    protected com.json.mediationsdk.model.Placement i;
    protected boolean j;
    private com.json.environment.NetworkStateReceiver k;
    protected com.json.ms l;
    protected com.json.fb m;
    protected com.json.fb n;
    protected com.json.r0 o;
    protected com.ironsource.k7.f p;
    protected com.json.n2 q;
    protected com.json.kc r;
    protected com.json.b2 s;
    protected com.json.i2 t;
    protected com.json.r u;
    protected com.json.mediationsdk.IronSourceSegment v;
    protected java.util.UUID w;
    protected final java.lang.Object x;
    private long y;
    private java.lang.Boolean z;

    class a extends com.json.dr {
        a() {
        }

        @Override // com.json.dr
        public void a() {
            com.json.k7.this.B();
        }
    }

    class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.mediationsdk.model.NetworkSettings f2839a;

        b(com.json.mediationsdk.model.NetworkSettings networkSettings) {
            this.f2839a = networkSettings;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.json.k7.this.c(this.f2839a);
        }
    }

    class c extends java.util.TimerTask {
        c() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            com.json.k7.this.D();
        }
    }

    class d implements java.lang.Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.json.k7.this.g = new org.json.JSONObject();
            com.json.k7.this.s.i.a();
            java.util.HashMap map = new java.util.HashMap();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            com.json.k7.this.b(map, arrayList, sb, arrayList2);
            com.json.k7.this.a(map, arrayList, sb, arrayList2);
        }
    }

    class e implements com.ironsource.w7.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.util.Map f2842a;
        final /* synthetic */ java.lang.StringBuilder b;
        final /* synthetic */ java.util.List c;

        e(java.util.Map map, java.lang.StringBuilder sb, java.util.List list) {
            this.f2842a = map;
            this.b = sb;
            this.c = list;
        }

        @Override // com.ironsource.w7.b
        public void a(java.util.List<com.json.x7> list, long j, java.util.List<java.lang.String> list2) {
            com.json.k7.this.s.h.a(j);
            for (com.json.x7 x7Var : list) {
                com.json.mediationsdk.model.NetworkSettings networkSettingsA = com.json.k7.this.o.a(x7Var.c());
                java.util.Map<java.lang.String, java.lang.Object> mapB = com.json.k7.this.b(networkSettingsA, com.json.mediationsdk.c.b().b(networkSettingsA, com.json.k7.this.o.getAdUnit(), com.json.k7.this.k()));
                if (x7Var.a() != null) {
                    this.f2842a.put(x7Var.c(), x7Var.a());
                    this.b.append(x7Var.d()).append(x7Var.c()).append(",");
                    com.json.k7.this.s.h.a(mapB, x7Var.e());
                } else {
                    com.json.k7.this.s.h.a(mapB, x7Var.e(), x7Var.b());
                }
            }
            java.util.Iterator<java.lang.String> it = list2.iterator();
            while (it.hasNext()) {
                com.json.mediationsdk.model.NetworkSettings networkSettingsA2 = com.json.k7.this.o.a(it.next());
                com.json.k7.this.s.h.b(com.json.k7.this.b(networkSettingsA2, com.json.mediationsdk.c.b().b(networkSettingsA2, com.json.k7.this.o.getAdUnit(), com.json.k7.this.k())), j);
            }
            com.json.k7.this.a((java.util.Map<java.lang.String, java.lang.Object>) this.f2842a, (java.util.List<java.lang.String>) this.c, this.b.toString());
        }

        @Override // com.ironsource.w7.b
        public void onFailure(java.lang.String str) {
            com.json.k7.this.s.h.a(str);
            com.json.k7.this.a((java.util.Map<java.lang.String, java.lang.Object>) this.f2842a, (java.util.List<java.lang.String>) this.c, this.b.toString());
        }
    }

    protected enum f {
        NONE,
        READY_TO_LOAD,
        AUCTION,
        LOADING,
        READY_TO_SHOW,
        SHOWING
    }

    public k7(com.json.r0 r0Var, com.json.lk lkVar, com.json.mediationsdk.IronSourceSegment ironSourceSegment) {
        this(com.json.im.S(), com.json.im.M(), r0Var, lkVar, ironSourceSegment);
    }

    k7(com.json.sf sfVar, com.json.rf rfVar, com.json.r0 r0Var, com.json.lk lkVar, com.json.mediationsdk.IronSourceSegment ironSourceSegment) {
        this.f = "";
        this.j = false;
        this.x = new java.lang.Object();
        this.y = 0L;
        this.I = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.w = java.util.UUID.randomUUID();
        this.C = sfVar.k();
        this.D = rfVar.e();
        this.E = sfVar.B();
        this.F = rfVar.m();
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose("adUnit = " + r0Var.getAdUnit() + ", loading mode = " + r0Var.getLoadingData().a());
        com.json.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r0Var.getAdUnit() + " initiated object per waterfall mode");
        com.json.fb fbVar = new com.json.fb();
        this.J = a(r0Var);
        this.v = ironSourceSegment;
        this.o = r0Var;
        this.s = new com.json.b2(r0Var.getAdUnit(), com.ironsource.b2.b.MEDIATION, this);
        this.t = g();
        this.q = h();
        a(com.ironsource.k7.f.NONE);
        this.B = lkVar;
        this.f2837a = new com.json.wv<>(this.o.getAuctionSettings().f(), this.o.getAuctionSettings().i(), this);
        this.s.f.a(o(), this.o.getLoadingData().a().toString());
        this.b = new java.util.concurrent.ConcurrentHashMap<>();
        this.i = null;
        G();
        this.g = new org.json.JSONObject();
        if (this.o.q()) {
            this.c = new com.json.mediationsdk.e(new com.json.mediationsdk.f(this.o.getAuctionSettings(), com.json.mediationsdk.utils.IronSourceUtils.getSessionId()));
        }
        this.d = new com.json.mediationsdk.h(this.o.j(), this.o.getAuctionSettings().c());
        s();
        r();
        this.m = new com.json.fb();
        a(com.ironsource.k7.f.READY_TO_LOAD);
        this.r = new com.json.kc(r0Var.getAdExpirationInMinutes(), this);
        this.u = new com.json.r();
        this.s.f.a(com.json.fb.a(fbVar));
        if (this.o.getLoadingData().e()) {
            ironLog.verbose("first automatic load");
            A();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        com.ironsource.k7.f fVar;
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose(i());
        synchronized (this.x) {
            if (this.o.getLoadingData().e() && this.l.a()) {
                ironLog.verbose(b("all smashes are capped"));
                a(com.json.x1.a(this.o.getAdUnit()), "all smashes are capped", false);
                return;
            }
            if (!t() && this.p == com.ironsource.k7.f.SHOWING) {
                com.json.mediationsdk.logger.IronLog.API.error(b("load cannot be invoked while showing an ad"));
                a(new com.json.mediationsdk.logger.IronSourceError(com.json.x1.d(this.o.getAdUnit()), "load cannot be invoked while showing an ad"));
                return;
            }
            if (this.o.getLoadingData().a() != com.ironsource.l2.a.AUTOMATIC_LOAD_WHILE_SHOW && this.o.getLoadingData().a() != com.ironsource.l2.a.MANUAL_WITH_LOAD_ON_SHOW && (((fVar = this.p) != com.ironsource.k7.f.READY_TO_LOAD && fVar != com.ironsource.k7.f.READY_TO_SHOW) || com.json.mediationsdk.n.a().b(this.o.getAdUnit()))) {
                com.json.mediationsdk.logger.IronLog.API.error(b("load is already in progress"));
                return;
            }
            this.g = new org.json.JSONObject();
            F();
            if (v()) {
                this.s.g.a();
            } else {
                this.s.g.a(q());
            }
            this.n = new com.json.fb();
            if (this.o.q()) {
                if (!this.b.isEmpty()) {
                    this.d.a(this.b);
                    this.b.clear();
                }
                K();
            } else {
                a(com.ironsource.k7.f.LOADING);
            }
            if (this.o.q()) {
                return;
            }
            ironLog.verbose(b("auction disabled"));
            L();
            C();
        }
    }

    private void C() {
        com.json.cw<Smash> cwVarE = E();
        if (cwVarE.c()) {
            a(509, "Mediation No fill", false);
        }
        java.util.Iterator<Smash> it = cwVarE.a().iterator();
        while (it.hasNext()) {
            it.next().E();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(i());
        android.os.AsyncTask.execute(new com.ironsource.k7.d());
    }

    private com.json.cw<Smash> E() {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose();
        return new com.json.bw(this.o).d(this.f2837a.b());
    }

    private void F() {
        this.u.a(this.o.getAdUnit(), false);
    }

    private void K() {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(i());
        synchronized (this.x) {
            com.ironsource.k7.f fVar = this.p;
            com.ironsource.k7.f fVar2 = com.ironsource.k7.f.AUCTION;
            if (fVar == fVar2) {
                return;
            }
            a(fVar2);
            this.I.set(false);
            long jK = this.o.getAuctionSettings().k() - com.json.fb.a(this.m);
            if (jK > 0) {
                new java.util.Timer().schedule(new com.ironsource.k7.c(), jK);
            } else {
                D();
            }
        }
    }

    private void L() {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(i());
        a(j(), m());
    }

    private Smash a(com.json.j5 j5Var, java.lang.String str) {
        com.json.mediationsdk.model.NetworkSettings networkSettingsA = this.o.a(j5Var.c());
        if (networkSettingsA != null) {
            com.json.mediationsdk.c.b().b(networkSettingsA, this.o.getAdUnit(), k());
            com.json.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, Listener> baseAdAdapterA = a(networkSettingsA, this.o.getAdUnit());
            if (baseAdAdapterA != null) {
                Smash smash = (Smash) a(networkSettingsA, baseAdAdapterA, this.C.a(this.o.getAdUnit()), str, j5Var);
                this.b.put(j5Var.c(), com.ironsource.mediationsdk.h.a.ISAuctionPerformanceDidntAttemptToLoad);
                return smash;
            }
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(b("addSmashToWaterfall - could not load ad adapter for " + networkSettingsA.getProviderInstanceName()));
        } else {
            java.lang.String str2 = "could not find matching provider settings for auction response item - item = " + j5Var.c() + " state = " + this.p;
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(b(str2));
            this.s.k.h(str2);
        }
        return null;
    }

    private com.json.tj a(com.json.r0 r0Var) {
        if (r0Var.getSharedManagersThread()) {
            return com.json.environment.thread.IronSourceThreadManager.INSTANCE.getSharedManagersThread();
        }
        return null;
    }

    private java.lang.String a(java.util.List<com.json.j5> list, java.lang.String str) {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(b("waterfall.size() = " + list.size()));
        this.b.clear();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = new java.util.concurrent.CopyOnWriteArrayList();
        for (int i = 0; i < list.size(); i++) {
            com.json.j5 j5Var = list.get(i);
            com.json.n7 n7VarA = a(j5Var, str);
            if (n7VarA != null) {
                copyOnWriteArrayList.add(n7VarA);
                sb.append(a(j5Var, n7VarA.l()));
            }
            if (i != list.size() - 1) {
                sb.append(",");
            }
        }
        this.f2837a.a(this.o.getLoadingData().a(), (java.util.concurrent.CopyOnWriteArrayList<Smash>) copyOnWriteArrayList, str);
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(b("updateWaterfall() - next waterfall is " + ((java.lang.Object) sb)));
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(java.util.Map<java.lang.String, java.lang.Object> map, java.util.List<java.lang.String> list, java.lang.String str) {
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose(b("auction waterfallString = " + str));
        boolean z = false;
        if (map.size() == 0 && list.size() == 0) {
            ironLog.verbose(b("auction failed - no candidates"));
            this.s.i.a(1005, "No candidates available for auctioning");
            a(com.json.x1.e(this.o.getAdUnit()), "no available ad to load", false);
            return;
        }
        this.s.i.b(str);
        if (this.c == null) {
            ironLog.error(b("mAuctionHandler is null"));
            return;
        }
        int iA = this.C.a(this.o.getAdUnit());
        com.json.mediationsdk.i iVar = new com.json.mediationsdk.i(this.o.getAdUnit());
        iVar.b(com.json.mediationsdk.utils.IronSourceUtils.isEncryptedResponse());
        iVar.a(map);
        iVar.a(list);
        iVar.a(this.d);
        iVar.a(iA);
        iVar.a(this.v);
        iVar.d(this.G);
        com.json.au auVar = this.H;
        if (auVar != null && auVar.b()) {
            z = true;
        }
        iVar.e(z);
        a(com.json.environment.ContextProvider.getInstance().getApplicationContext(), iVar, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(java.util.Map<java.lang.String, java.lang.Object> map, java.util.List<java.lang.String> list, java.lang.StringBuilder sb, java.util.List<com.json.t7> list2) {
        if (list2.isEmpty()) {
            a(map, list, sb.toString());
            return;
        }
        com.json.w7 w7Var = new com.json.w7();
        com.ironsource.k7.e eVar = new com.ironsource.k7.e(map, sb, list);
        this.s.h.a();
        w7Var.a(list2, eVar, this.o.getCollectBiddingDataTimeout(), java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    private void a(org.json.JSONObject jSONObject) {
        this.u.a(this.o.getAdUnit(), jSONObject != null ? jSONObject.optBoolean(com.json.mediationsdk.d.f, false) : false);
        b(jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.util.Map<java.lang.String, java.lang.Object> b(com.json.mediationsdk.model.NetworkSettings networkSettings, com.json.mediationsdk.adunit.adapter.internal.AdapterBaseInterface adapterBaseInterface) {
        java.util.HashMap map = new java.util.HashMap();
        try {
            map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER, networkSettings.getProviderDefaultInstance());
            map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, adapterBaseInterface.getAdapterVersion());
            map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, adapterBaseInterface.getNetworkSDKVersion());
            map.put("spId", networkSettings.getSubProviderId());
            map.put("instanceType", java.lang.Integer.valueOf(networkSettings.getInstanceType(this.o.getAdUnit())));
            map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_PROGRAMMATIC, java.lang.Integer.valueOf(p()));
        } catch (java.lang.Exception e2) {
            com.json.l9.d().a(e2);
            com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL, "getProviderEventData " + networkSettings.getProviderDefaultInstance(), e2);
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(java.util.Map<java.lang.String, java.lang.Object> map, java.util.List<java.lang.String> list, java.lang.StringBuilder sb, java.util.List<com.json.t7> list2) {
        java.lang.StringBuilder sbAppend;
        java.lang.String providerName;
        for (com.json.mediationsdk.model.NetworkSettings networkSettings : this.o.j()) {
            com.json.au auVar = this.H;
            if (auVar == null || auVar.a(networkSettings, this.o.getAdUnit())) {
                if (!this.l.b(new com.json.ls(networkSettings.getProviderInstanceName(), networkSettings.getMaxAdsPerSession(this.o.getAdUnit()))) && d(networkSettings)) {
                    com.json.mediationsdk.adunit.adapter.utility.AdData adDataA = a(networkSettings, (java.lang.String) null);
                    if (networkSettings.isBidder(this.o.getAdUnit())) {
                        com.json.mediationsdk.adunit.adapter.internal.AdapterBaseInterface adapterBaseInterfaceB = com.json.mediationsdk.c.b().b(networkSettings, this.o.getAdUnit(), k());
                        if (adapterBaseInterfaceB instanceof com.json.v7) {
                            list2.add(new com.json.t7(networkSettings.getInstanceType(this.o.getAdUnit()), networkSettings.getProviderInstanceName(), adDataA, (com.json.v7) adapterBaseInterfaceB, this, networkSettings));
                        } else {
                            if (adapterBaseInterfaceB == null) {
                                sbAppend = new java.lang.StringBuilder("prepareAuctionCandidates - could not load network adapter ");
                                providerName = networkSettings.getProviderName();
                            } else {
                                sbAppend = new java.lang.StringBuilder("network adapter ").append(networkSettings.getProviderName());
                                providerName = " does not implementing BiddingDataInterface";
                            }
                            this.s.k.g(sbAppend.append(providerName).toString());
                        }
                    } else {
                        list.add(networkSettings.getProviderInstanceName());
                        sb.append(networkSettings.getInstanceType(this.o.getAdUnit())).append(networkSettings.getProviderInstanceName()).append(",");
                    }
                }
            }
        }
    }

    private void b(org.json.JSONObject jSONObject) {
        int i;
        try {
            if (jSONObject == null) {
                this.o.b(false);
                com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(b("loading configuration from auction response is null, using the following: " + this.o.r()));
                return;
            }
            try {
                if (jSONObject.has(com.json.mediationsdk.d.x) && (i = jSONObject.getInt(com.json.mediationsdk.d.x)) > 0) {
                    this.o.a(i);
                }
                if (jSONObject.has(com.json.mediationsdk.d.y)) {
                    this.o.a(jSONObject.getBoolean(com.json.mediationsdk.d.y));
                }
                this.o.b(jSONObject.optBoolean(com.json.mediationsdk.d.z, false));
                com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(b(this.o.r()));
            } catch (org.json.JSONException e2) {
                com.json.l9.d().a(e2);
                com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
                ironLog.error("failed to update loading configuration for" + this.o.getAdUnit() + " Error: " + e2.getMessage());
                ironLog.verbose(b(this.o.r()));
            }
        } catch (java.lang.Throwable th) {
            com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(b(this.o.r()));
            throw th;
        }
    }

    private boolean b(com.json.y1 y1Var) {
        return !new java.util.ArrayList(java.util.Arrays.asList(com.json.y1.INIT_STARTED, com.json.y1.LOAD_AD, com.json.y1.AUCTION_REQUEST, com.json.y1.AUCTION_REQUEST_WATERFALL, com.json.y1.AUCTION_FAILED_NO_CANDIDATES, com.json.y1.COLLECT_TOKEN, com.json.y1.COLLECT_TOKENS_COMPLETED, com.json.y1.COLLECT_TOKENS_FAILED, com.json.y1.INSTANCE_COLLECT_TOKEN, com.json.y1.INSTANCE_COLLECT_TOKEN_SUCCESS, com.json.y1.INSTANCE_COLLECT_TOKEN_FAILED, com.json.y1.INSTANCE_COLLECT_TOKEN_TIMED_OUT)).contains(y1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(com.json.mediationsdk.model.NetworkSettings networkSettings) {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(b(java.lang.String.format("Start initializing provider %s on thread %s", networkSettings.getProviderInstanceName(), java.lang.Thread.currentThread().getName())));
        com.json.mediationsdk.adunit.adapter.utility.AdData adDataA = a(networkSettings, this.o.getUserId());
        com.json.mediationsdk.adunit.adapter.internal.AdapterBaseInterface adapterBaseInterfaceB = com.json.mediationsdk.c.b().b(networkSettings, this.o.getAdUnit(), k());
        if (adapterBaseInterfaceB != null) {
            try {
                adapterBaseInterfaceB.init(adDataA, com.json.environment.ContextProvider.getInstance().getApplicationContext(), null);
            } catch (java.lang.Exception e2) {
                com.json.l9.d().a(e2);
                this.s.k.g("initProvider - exception while calling networkAdapter.init with " + networkSettings.getProviderName() + " - " + e2);
            }
        }
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(b(java.lang.String.format("Done initializing provider %s on thread %s", networkSettings.getProviderInstanceName(), java.lang.Thread.currentThread().getName())));
    }

    private boolean c(com.json.mediationsdk.model.NetworkSettings networkSettings, com.json.mediationsdk.adunit.adapter.internal.AdapterBaseInterface adapterBaseInterface) {
        if (this.f2837a.a(adapterBaseInterface, this.o.getAdUnit(), networkSettings.getProviderInstanceName())) {
            return false;
        }
        return networkSettings.shouldEarlyInit() || networkSettings.isIronSource() || networkSettings.isBidder(this.o.getAdUnit());
    }

    private boolean c(com.json.y1 y1Var) {
        return new java.util.ArrayList(java.util.Arrays.asList(com.json.y1.LOAD_AD_SUCCESS, com.json.y1.LOAD_AD_FAILED, com.json.y1.LOAD_AD_FAILED_WITH_REASON, com.json.y1.AUCTION_SUCCESS, com.json.y1.AUCTION_FAILED, com.json.y1.AUCTION_FAILED_NO_CANDIDATES, com.json.y1.AD_FORMAT_CAPPED, com.json.y1.AD_OPENED, com.json.y1.SHOW_AD, com.json.y1.SHOW_AD_FAILED, com.json.y1.AD_CLICKED, com.json.y1.RELOAD_AD_FAILED_WITH_REASON, com.json.y1.RELOAD_AD_SUCCESS, com.json.y1.AD_LEFT_APPLICATION)).contains(y1Var);
    }

    private boolean c(boolean z) {
        java.lang.Boolean bool = this.z;
        if (bool == null) {
            return false;
        }
        return (z && !bool.booleanValue() && u()) || (!z && this.z.booleanValue());
    }

    private boolean d(com.json.mediationsdk.model.NetworkSettings networkSettings) {
        com.json.mediationsdk.adunit.adapter.internal.AdapterBaseInterface adapterBaseInterfaceB = com.json.mediationsdk.c.b().b(networkSettings, this.o.getAdUnit(), k());
        if (adapterBaseInterfaceB instanceof com.json.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface) {
            return this.f2837a.a(this.o.getLoadingData().a(), networkSettings.getProviderInstanceName(), networkSettings.getProviderTypeForReflection(), a(networkSettings, adapterBaseInterfaceB), adapterBaseInterfaceB, this.o.getAdUnit());
        }
        return false;
    }

    private java.util.List<com.json.j5> j() {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = new java.util.concurrent.CopyOnWriteArrayList();
        for (com.json.mediationsdk.model.NetworkSettings networkSettings : this.o.j()) {
            if (!networkSettings.isBidder(this.o.getAdUnit()) && d(networkSettings)) {
                com.json.ls lsVar = new com.json.ls(networkSettings.getProviderInstanceName(), networkSettings.getMaxAdsPerSession(this.o.getAdUnit()));
                if (!this.l.b(lsVar)) {
                    copyOnWriteArrayList.add(new com.json.j5(lsVar.c()));
                }
            }
        }
        return copyOnWriteArrayList;
    }

    private int p() {
        return 1;
    }

    private void r() {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(i());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.json.mediationsdk.model.NetworkSettings networkSettings : this.o.j()) {
            if (c(networkSettings, com.json.mediationsdk.c.b().b(networkSettings, this.o.getAdUnit(), k()))) {
                arrayList.add(new com.ironsource.k7.b(networkSettings));
            }
        }
        com.json.environment.thread.IronSourceThreadManager.INSTANCE.executeTasks(this.o.getProvidersParallelInit(), this.o.getWaitUntilAllProvidersFinishInit(), arrayList);
    }

    private void s() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.json.mediationsdk.model.NetworkSettings networkSettings : this.o.j()) {
            arrayList.add(new com.json.ls(networkSettings.getProviderInstanceName(), networkSettings.getMaxAdsPerSession(this.o.getAdUnit())));
        }
        com.json.ms msVar = new com.json.ms();
        this.l = msVar;
        msVar.a(arrayList);
    }

    public void A() {
        if (c()) {
            a(new com.ironsource.k7.a());
        } else {
            B();
        }
    }

    protected void G() {
        com.json.mediationsdk.n.a().a(this.o.getAdUnit(), this.o.getDelayLoadFailure());
    }

    protected boolean H() {
        return true;
    }

    protected boolean I() {
        return true;
    }

    public void J() {
        java.util.Iterator<com.json.mediationsdk.model.NetworkSettings> it = this.o.j().iterator();
        while (it.hasNext()) {
            com.json.mediationsdk.c.b().b(it.next(), this.o.getAdUnit(), k());
        }
    }

    protected com.json.mediationsdk.LoadWhileShowSupportState a(com.json.mediationsdk.model.NetworkSettings networkSettings, com.json.mediationsdk.adunit.adapter.internal.AdapterBaseInterface adapterBaseInterface) {
        return com.json.mediationsdk.LoadWhileShowSupportState.NONE;
    }

    protected com.json.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, Listener> a(com.json.mediationsdk.model.NetworkSettings networkSettings, com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit) {
        com.json.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, Listener> baseAdAdapter = (com.json.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, Listener>) com.json.mediationsdk.c.b().a(networkSettings, ad_unit, k());
        if (baseAdAdapter != null) {
            return baseAdAdapter;
        }
        return null;
    }

    protected com.json.mediationsdk.adunit.adapter.utility.AdData a(com.json.mediationsdk.model.NetworkSettings networkSettings, java.lang.String str) {
        return com.json.mediationsdk.adunit.adapter.utility.AdData.createAdDataForNetworkAdapter(b(networkSettings), this.o.getAdUnit(), str);
    }

    protected abstract Smash a(com.json.mediationsdk.model.NetworkSettings networkSettings, com.json.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, Listener> baseAdAdapter, int i, java.lang.String str, com.json.j5 j5Var);

    protected java.lang.String a(com.json.j5 j5Var, int i) {
        return java.lang.String.format("%s%s", java.lang.Integer.valueOf(i), j5Var.c());
    }

    public java.util.Map<java.lang.String, java.lang.Object> a(com.json.y1 y1Var) {
        java.util.HashMap map = new java.util.HashMap();
        map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        org.json.JSONObject jSONObject = this.g;
        if (jSONObject != null && jSONObject.length() > 0) {
            map.put("genericParams", this.g);
        }
        map.put("sessionDepth", java.lang.Integer.valueOf(this.C.a(this.o.getAdUnit())));
        if (c(y1Var)) {
            map.put(com.json.mediationsdk.utils.IronSourceConstants.AUCTION_TRIALS, java.lang.Integer.valueOf(this.e));
            if (!android.text.TextUtils.isEmpty(this.f)) {
                map.put(com.json.mediationsdk.utils.IronSourceConstants.AUCTION_FALLBACK, this.f);
            }
        }
        if (b(y1Var) && !android.text.TextUtils.isEmpty(this.f2837a.c())) {
            map.put("auctionId", this.f2837a.c());
        }
        return map;
    }

    @Override // com.json.o
    public void a() {
        if (this.o.getLoadingData().e()) {
            a(com.ironsource.k7.f.READY_TO_LOAD);
            b(true);
            A();
        }
    }

    @Override // com.json.xv
    public void a(int i) {
        this.s.k.u("waterfalls hold too many with size = " + i);
    }

    @Override // com.json.p4
    public void a(int i, java.lang.String str, int i2, java.lang.String str2, long j) {
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose(i());
        if (!y()) {
            java.lang.String str3 = "unexpected auction fail - error = " + i + ", " + str + " state = " + this.p;
            ironLog.error(b(str3));
            this.s.k.i(str3);
            return;
        }
        java.lang.String str4 = "Auction failed | moving to fallback waterfall (error " + i + " - " + str + ")";
        ironLog.verbose(b(str4));
        com.json.mediationsdk.utils.IronSourceUtils.sendAutomationLog(l() + ": " + str4);
        this.e = i2;
        this.f = str2;
        this.g = new org.json.JSONObject();
        L();
        this.s.i.a(j, i, str);
        a(com.ironsource.k7.f.LOADING);
        C();
    }

    protected void a(int i, java.lang.String str, boolean z) {
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose();
        a(com.ironsource.k7.f.READY_TO_LOAD);
        ironLog.verbose(b("errorCode = " + i + ", errorReason = " + str));
        if (this.o.getLoadingData().f()) {
            if (!z) {
                this.s.g.a(com.json.fb.a(this.n), i, str, q());
            }
            a(new com.json.mediationsdk.logger.IronSourceError(i, str));
        } else {
            if (!z) {
                this.s.k.b(i, str);
            }
            b(false);
        }
        this.q.e();
    }

    protected void a(android.content.Context context, com.json.mediationsdk.i iVar, com.json.p4 p4Var) {
        com.json.mediationsdk.e eVar = this.c;
        if (eVar != null) {
            eVar.a(context, iVar, p4Var);
        } else {
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(b("mAuctionHandler is null"));
        }
    }

    public void a(android.content.Context context, boolean z) {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(b("track = " + z));
        try {
            this.j = z;
            if (z) {
                if (this.k == null) {
                    this.k = new com.json.environment.NetworkStateReceiver(context, this);
                }
                context.getApplicationContext().registerReceiver(this.k, new android.content.IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } else if (this.k != null) {
                context.getApplicationContext().unregisterReceiver(this.k);
            }
        } catch (java.lang.Exception e2) {
            com.json.l9.d().a(e2);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error("Got an error from receiver with message: " + e2.getMessage());
        }
    }

    public void a(com.json.au auVar) {
        this.H = auVar;
        this.G = auVar != null;
        this.z = null;
    }

    protected void a(com.json.i2 i2Var) {
        this.t = i2Var;
    }

    protected void a(com.ironsource.k7.f fVar) {
        synchronized (this.x) {
            com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("set current state to = " + fVar);
            this.p = fVar;
        }
    }

    public void a(com.json.mediationsdk.IronSourceSegment ironSourceSegment) {
        this.v = ironSourceSegment;
    }

    protected void a(com.json.mediationsdk.logger.IronSourceError ironSourceError) {
        com.json.mediationsdk.n.a().b(this.o.getAdUnit(), ironSourceError);
    }

    @Override // com.json.o2
    public void a(com.json.mediationsdk.logger.IronSourceError ironSourceError, com.json.n7<?> n7Var) {
        com.json.cw<Smash> cwVarE;
        com.json.n7<?> n7VarC;
        synchronized (this.x) {
            com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
            ironLog.verbose(b(n7Var.k() + " - error = " + ironSourceError));
            if (n7Var.h().equals(this.f2837a.c()) && this.p != com.ironsource.k7.f.AUCTION) {
                this.b.put(n7Var.c(), com.ironsource.mediationsdk.h.a.ISAuctionPerformanceFailedToLoad);
                if (z() || x()) {
                    cwVarE = E();
                    if (cwVarE.c()) {
                        a(509, "Mediation No fill", false);
                        return;
                    }
                } else {
                    cwVarE = null;
                }
                if (cwVarE == null) {
                    return;
                }
                if (this.o.getShowPriorityEnabled()) {
                    synchronized (this.x) {
                        if (cwVarE.b() && w() && (n7VarC = new com.json.bw(this.o).c(this.f2837a.b())) != null) {
                            i(n7VarC);
                        }
                    }
                }
                java.util.Iterator<Smash> it = cwVarE.a().iterator();
                while (it.hasNext()) {
                    it.next().E();
                }
                return;
            }
            ironLog.error(b("onAdLoadFailed was invoked from " + n7Var.c() + " with state =" + this.p + " auctionId: " + n7Var.h() + " and the current id is " + this.f2837a.c()));
            this.s.k.n("onAdLoadFailed was invoked with state =" + this.p);
        }
    }

    @Override // com.json.u7
    public void a(com.json.mediationsdk.model.NetworkSettings networkSettings) {
        com.json.mediationsdk.adunit.adapter.internal.AdapterBaseInterface adapterBaseInterfaceB = com.json.mediationsdk.c.b().b(networkSettings, this.o.getAdUnit(), k());
        if (adapterBaseInterfaceB != null) {
            this.s.h.a(b(networkSettings, adapterBaseInterfaceB));
        }
    }

    protected void a(com.json.n7<?> n7Var, com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
        this.t.c(adInfo);
    }

    @Override // com.json.pp
    public void a(java.lang.Runnable runnable) {
        com.json.tj tjVar = this.J;
        if (tjVar != null) {
            tjVar.a(runnable);
        }
    }

    @Override // com.json.u7
    public void a(java.lang.String str) {
        this.s.k.g(str);
    }

    @Override // com.json.p4
    public void a(java.util.List<com.json.j5> list, java.lang.String str, com.json.j5 j5Var, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, int i, long j, int i2, java.lang.String str2) {
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose(i());
        if (!y()) {
            ironLog.error(b("unexpected auction success for auctionId - " + str + " state = " + this.p));
            this.s.k.j("unexpected auction success, state = " + this.p);
            return;
        }
        this.f = "";
        this.e = i;
        this.h = j5Var;
        this.g = jSONObject;
        if (!android.text.TextUtils.isEmpty(str2)) {
            this.s.k.a(i2, str2);
        }
        a(jSONObject2);
        if (this.u.a(this.o.getAdUnit())) {
            this.s.i.a(str);
            a(com.json.mediationsdk.logger.IronSourceError.ERROR_AD_FORMAT_CAPPED, "Ad unit is capped", true);
            return;
        }
        java.lang.String strA = a(list, str);
        this.s.i.a(j, this.o.r());
        this.s.i.c(strA);
        a(com.ironsource.k7.f.LOADING);
        C();
    }

    @Override // com.json.zn
    public void a(boolean z) {
        if (!this.j || this.o.getLoadingData().f()) {
            return;
        }
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("network availability changed to - " + z);
        if (c(z)) {
            a(z, false, (com.json.n7<?>) null);
        }
    }

    protected void a(boolean z, boolean z2, com.json.n7<?> n7Var) {
        synchronized (this.x) {
            java.lang.Boolean bool = this.z;
            if (bool == null || bool.booleanValue() != z) {
                this.z = java.lang.Boolean.valueOf(z);
                long time = 0;
                if (this.y != 0) {
                    time = new java.util.Date().getTime() - this.y;
                }
                this.y = new java.util.Date().getTime();
                this.s.g.a(z, time, z2);
                com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfoF = n7Var != null ? n7Var.f() : this.A;
                this.A = adInfoF;
                com.json.i2 i2Var = this.t;
                if (!z) {
                    adInfoF = null;
                }
                i2Var.a(z, adInfoF);
            }
        }
    }

    protected boolean a(com.ironsource.k7.f fVar, com.ironsource.k7.f fVar2) {
        boolean z;
        synchronized (this.x) {
            if (this.p == fVar) {
                com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("expected state = " + fVar + ", state to set = " + fVar2);
                this.p = fVar2;
                z = true;
            } else {
                com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("wrong state, current state = " + this.p + ", expected state = " + fVar);
                z = false;
            }
        }
        return z;
    }

    protected java.lang.String b(java.lang.String str) {
        java.lang.String str2 = this.o.getAdUnit().name() + " state:" + this.p;
        return android.text.TextUtils.isEmpty(str) ? str2 : str2 + " - " + str;
    }

    protected abstract org.json.JSONObject b(com.json.mediationsdk.model.NetworkSettings networkSettings);

    public void b() {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(i());
        A();
    }

    protected void b(com.json.j5 j5Var, java.lang.String str) {
        if (j5Var == null) {
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(b("reportImpressionDataToPublisher - no auctionResponseItem or listener"));
            com.json.b2 b2Var = this.s;
            if (b2Var != null) {
                b2Var.k.g("reportImpressionDataToPublisher - no auctionResponseItem or listener");
                return;
            }
            return;
        }
        com.json.mediationsdk.impressionData.ImpressionData impressionDataA = j5Var.a(str);
        if (impressionDataA != null) {
            for (com.json.mediationsdk.impressionData.ImpressionDataListener impressionDataListener : new java.util.HashSet(this.B.a())) {
                com.json.mediationsdk.logger.IronLog.CALLBACK.info(b("onImpressionSuccess " + impressionDataListener.getClass().getSimpleName() + ": " + impressionDataA));
                impressionDataListener.onImpressionSuccess(impressionDataA);
            }
        }
    }

    @Override // com.json.o2
    public void b(com.json.n7<?> n7Var) {
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose(b(n7Var.k()));
        this.s.j.g(n());
        this.f2837a.a(n7Var);
        this.f2837a.b(n7Var);
        this.l.a(n7Var);
        if (this.l.b(n7Var)) {
            ironLog.verbose(b(n7Var.c() + " was session capped"));
            n7Var.N();
            com.json.mediationsdk.utils.IronSourceUtils.sendAutomationLog(n7Var.c() + " was session capped");
        }
        this.F.a(com.json.environment.ContextProvider.getInstance().getApplicationContext(), n(), this.o.getAdUnit());
        if (this.E.b(com.json.environment.ContextProvider.getInstance().getApplicationContext(), this.i, this.o.getAdUnit())) {
            ironLog.verbose(b("placement " + n() + " is capped"));
            this.s.j.b(n(), null);
        }
        this.D.b(this.o.getAdUnit());
        if (this.o.q()) {
            com.json.j5 j5VarI = n7Var.i();
            this.c.a(j5VarI, n7Var.l(), this.h, n());
            this.b.put(n7Var.c(), com.ironsource.mediationsdk.h.a.ISAuctionPerformanceShowedSuccessfully);
            if (H()) {
                b(j5VarI, n());
            }
        }
        g(n7Var);
        if (this.o.getLoadingData().e()) {
            b(false);
        }
        this.q.h();
    }

    protected void b(boolean z) {
        a(false, z, (com.json.n7<?>) null);
    }

    @Override // com.json.pp
    public boolean c() {
        com.json.tj tjVar = this.J;
        if (tjVar == null || tjVar == java.lang.Thread.currentThread()) {
            return false;
        }
        return this.o.getSharedManagersThread();
    }

    @Override // com.json.o2
    public void e(com.json.n7<?> n7Var) {
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose(b(n7Var.k()));
        if (!n7Var.h().equals(this.f2837a.c())) {
            ironLog.error(b("invoked from " + n7Var.c() + " with state = " + this.p + " auctionId: " + n7Var.h() + " and the current id is " + this.f2837a.c()));
            this.s.k.o("onAdLoadSuccess invoked with state = " + this.p);
            return;
        }
        if (this.o.getShowPriorityEnabled()) {
            java.util.List<Smash> listB = this.f2837a.b();
            com.json.bw bwVar = new com.json.bw(this.o);
            boolean zA = bwVar.a(n7Var, listB);
            synchronized (this.x) {
                if (zA) {
                    if (w()) {
                        i(n7Var);
                    }
                }
                if (bwVar.a(listB)) {
                    i(bwVar.c(listB));
                }
            }
        }
        this.b.put(n7Var.c(), com.ironsource.mediationsdk.h.a.ISAuctionPerformanceLoadedSuccessfully);
        if (a(com.ironsource.k7.f.LOADING, com.ironsource.k7.f.READY_TO_SHOW)) {
            long jA = com.json.fb.a(this.n);
            if (v()) {
                this.s.g.a(jA);
            } else {
                this.s.g.a(jA, q());
            }
            if (this.o.getLoadingData().e()) {
                this.r.a(0L);
            }
            if (!this.o.getShowPriorityEnabled()) {
                i(n7Var);
            }
            h(n7Var);
        }
    }

    @Override // com.json.o2
    public void f(com.json.n7<?> n7Var) {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(b(n7Var.k()));
        this.s.j.a(n());
        this.t.a(this.i, n7Var.f());
    }

    protected abstract com.json.i2 g();

    protected void g(com.json.n7<?> n7Var) {
        this.t.d(n7Var.f());
    }

    protected com.json.n2 h() {
        return new com.json.n2(this.o.getLoadingData(), this);
    }

    protected void h(com.json.n7<?> n7Var) {
        if (this.o.getLoadingData().f()) {
            a(n7Var, n7Var.f());
        } else {
            a(true, false, n7Var);
        }
    }

    protected java.lang.String i() {
        return b((java.lang.String) null);
    }

    protected void i(com.json.n7<?> n7Var) {
        if (this.o.q() && this.I.compareAndSet(false, true)) {
            com.json.j5 j5VarI = n7Var.i();
            this.c.a(j5VarI, n7Var.l(), this.h);
            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.json.j5> concurrentHashMap = new java.util.concurrent.ConcurrentHashMap<>();
            for (Smash smash : this.f2837a.b()) {
                arrayList.add(smash.c());
                concurrentHashMap.put(smash.c(), smash.i());
            }
            this.c.a(arrayList, concurrentHashMap, n7Var.l(), this.h, j5VarI);
        }
    }

    public java.util.UUID k() {
        return this.w;
    }

    protected abstract java.lang.String l();

    protected java.lang.String m() {
        return "fallback_" + java.lang.System.currentTimeMillis();
    }

    protected java.lang.String n() {
        com.json.mediationsdk.model.Placement placement = this.i;
        return placement == null ? "" : placement.getCom.ironsource.op.d java.lang.String();
    }

    abstract java.lang.String o();

    protected boolean q() {
        return false;
    }

    protected boolean t() {
        return false;
    }

    protected boolean u() {
        return false;
    }

    protected abstract boolean v();

    protected boolean w() {
        boolean z;
        synchronized (this.x) {
            com.ironsource.k7.f fVar = this.p;
            z = fVar == com.ironsource.k7.f.LOADING || fVar == com.ironsource.k7.f.READY_TO_SHOW;
        }
        return z;
    }

    protected boolean x() {
        boolean z;
        synchronized (this.x) {
            z = this.p == com.ironsource.k7.f.READY_TO_SHOW;
        }
        return z;
    }

    protected boolean y() {
        boolean z;
        synchronized (this.x) {
            z = this.p == com.ironsource.k7.f.AUCTION;
        }
        return z;
    }

    protected boolean z() {
        boolean z;
        synchronized (this.x) {
            z = this.p == com.ironsource.k7.f.LOADING;
        }
        return z;
    }
}

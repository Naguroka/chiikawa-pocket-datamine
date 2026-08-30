package com.json.mediationsdk;

/* JADX INFO: loaded from: classes5.dex */
public class w extends com.json.mediationsdk.m implements com.json.rp, com.json.p4 {
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.h.a> A;
    private long B;
    private final java.lang.Object C;
    private com.json.fb D;
    private boolean E;
    private final long F;
    private final java.lang.Runnable G;
    private final com.json.vh e;
    private final com.ironsource.vh.a f;
    private final com.json.wf g;
    private final com.ironsource.wf.a h;
    private com.json.mediationsdk.k i;
    private com.ironsource.mediationsdk.w.i j;
    private com.json.sl k;
    private com.json.mediationsdk.IronSourceBannerLayout l;
    private com.json.e7 m;
    private int n;
    private com.json.mediationsdk.x o;
    private int p;
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.json.mediationsdk.x> q;
    private java.util.concurrent.CopyOnWriteArrayList<com.json.mediationsdk.x> r;
    private java.lang.String s;
    private org.json.JSONObject t;
    private java.lang.String u;
    private int v;
    private com.json.mediationsdk.e w;
    private com.json.j5 x;
    private com.json.mediationsdk.h y;
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, com.json.j5> z;

    class a implements com.ironsource.mediationsdk.l.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.e7 f3024a;
        final /* synthetic */ com.json.mediationsdk.IronSourceBannerLayout b;

        a(com.json.e7 e7Var, com.json.mediationsdk.IronSourceBannerLayout ironSourceBannerLayout) {
            this.f3024a = e7Var;
            this.b = ironSourceBannerLayout;
        }

        @Override // com.ironsource.mediationsdk.l.b
        public void a() {
            com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
            ironLog.verbose("placement = " + this.f3024a.getCom.ironsource.op.d java.lang.String());
            com.json.mediationsdk.l.b(this.b);
            com.json.mediationsdk.w.this.l = this.b;
            com.json.mediationsdk.w.this.m = this.f3024a;
            com.json.wf wfVar = com.json.mediationsdk.w.this.g;
            android.content.Context applicationContext = com.json.environment.ContextProvider.getInstance().getApplicationContext();
            com.json.e7 e7Var = this.f3024a;
            com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER;
            if (!wfVar.b(applicationContext, e7Var, ad_unit)) {
                com.json.mediationsdk.w.this.b(false);
                return;
            }
            ironLog.verbose("placement is capped");
            com.json.mediationsdk.n.a().b(ad_unit, new com.json.mediationsdk.logger.IronSourceError(604, "placement " + this.f3024a.getCom.ironsource.op.d java.lang.String() + " is capped"));
            com.json.mediationsdk.w.this.a(com.json.mediationsdk.utils.IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, 604}});
            com.json.mediationsdk.w.this.a(com.ironsource.mediationsdk.w.i.READY_TO_LOAD);
        }

        @Override // com.ironsource.mediationsdk.l.b
        public void a(java.lang.String str) {
            com.json.mediationsdk.logger.IronLog.API.error("can't load banner - errorMessage = " + str);
        }
    }

    class b implements com.ironsource.mediationsdk.l.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.mediationsdk.IronSourceBannerLayout f3025a;

        b(com.json.mediationsdk.IronSourceBannerLayout ironSourceBannerLayout) {
            this.f3025a = ironSourceBannerLayout;
        }

        @Override // com.ironsource.mediationsdk.l.b
        public void a() {
            com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("destroying banner");
            com.json.mediationsdk.w.this.k.b();
            com.json.mediationsdk.w.this.a(com.json.mediationsdk.utils.IronSourceConstants.BN_DESTROY, (java.lang.Object[][]) null, com.json.mediationsdk.w.this.o != null ? com.json.mediationsdk.w.this.o.n() : com.json.mediationsdk.w.this.p);
            com.json.mediationsdk.w.this.h();
            this.f3025a.a();
            com.json.mediationsdk.w.this.l = null;
            com.json.mediationsdk.w.this.m = null;
            com.json.mediationsdk.w.this.a(com.ironsource.mediationsdk.w.i.READY_TO_LOAD);
        }

        @Override // com.ironsource.mediationsdk.l.b
        public void a(java.lang.String str) {
            com.json.mediationsdk.logger.IronLog.API.error("destroy banner failed - errorMessage = " + str);
        }
    }

    class c implements java.lang.Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (com.json.mediationsdk.w.this.l == null) {
                    com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("mIronSourceBanner is null");
                    com.json.mediationsdk.w.this.a(com.json.mediationsdk.utils.IronSourceConstants.BN_SKIP_RELOAD, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.valueOf(com.json.mediationsdk.logger.IronSourceError.ERROR_BN_RELOAD_SKIP_BANNER_LAYOUT_IS_NULL)}});
                } else {
                    if (com.json.mediationsdk.w.this.o()) {
                        com.json.mediationsdk.w.this.v();
                        return;
                    }
                    com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("banner is not visible, reload skipped");
                    com.json.mediationsdk.w.this.a(com.json.mediationsdk.utils.IronSourceConstants.BN_SKIP_RELOAD, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.valueOf(com.json.mediationsdk.logger.IronSourceError.ERROR_BN_RELOAD_SKIP_INVISIBLE)}});
                    com.json.mediationsdk.w.this.k.a(java.util.concurrent.TimeUnit.SECONDS.toMillis(com.json.mediationsdk.w.this.i.f()));
                }
            } catch (java.lang.Throwable th) {
                com.json.l9.d().a(th);
                com.json.mediationsdk.w.this.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_BN_RELOAD_EXCEPTION, new java.lang.Object[][]{new java.lang.Object[]{"reason", th.getMessage()}});
            }
        }
    }

    class d implements java.lang.Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.json.mediationsdk.w.this.w();
            if (com.json.mediationsdk.w.this.y()) {
                return;
            }
            com.json.mediationsdk.w.this.a(com.json.mediationsdk.utils.IronSourceConstants.BN_AUCTION_REQUEST);
            java.util.HashMap map = new java.util.HashMap();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            com.json.mediationsdk.w.this.b(map, arrayList, sb, arrayList2);
            com.json.mediationsdk.w.this.a(map, arrayList, sb, arrayList2);
        }
    }

    class e implements com.ironsource.w7.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.util.Map f3028a;
        final /* synthetic */ java.lang.StringBuilder b;
        final /* synthetic */ java.util.List c;

        e(java.util.Map map, java.lang.StringBuilder sb, java.util.List list) {
            this.f3028a = map;
            this.b = sb;
            this.c = list;
        }

        @Override // com.ironsource.w7.b
        public void a(java.util.List<com.json.x7> list, long j, java.util.List<java.lang.String> list2) {
            com.json.mediationsdk.w.this.a(com.json.mediationsdk.utils.IronSourceConstants.BN_COLLECT_TOKENS_COMPLETED, new java.lang.Object[][]{new java.lang.Object[]{"duration", java.lang.Long.valueOf(j)}});
            for (com.json.x7 x7Var : list) {
                if (x7Var.a() != null) {
                    this.f3028a.put(x7Var.c(), x7Var.a());
                    this.b.append(x7Var.d()).append(x7Var.c()).append(",");
                    ((com.json.mediationsdk.x) com.json.mediationsdk.w.this.q.get(x7Var.c())).a(com.json.mediationsdk.utils.IronSourceConstants.BN_INSTANCE_COLLECT_TOKEN_SUCCESS, new java.lang.Object[][]{new java.lang.Object[]{"duration", java.lang.Long.valueOf(x7Var.e())}});
                } else {
                    ((com.json.mediationsdk.x) com.json.mediationsdk.w.this.q.get(x7Var.c())).a(com.json.mediationsdk.utils.IronSourceConstants.BN_INSTANCE_COLLECT_TOKEN_FAILED, new java.lang.Object[][]{new java.lang.Object[]{"duration", java.lang.Long.valueOf(x7Var.e())}, new java.lang.Object[]{"reason", x7Var.b()}});
                }
            }
            java.util.Iterator<java.lang.String> it = list2.iterator();
            while (it.hasNext()) {
                ((com.json.mediationsdk.x) com.json.mediationsdk.w.this.q.get(it.next())).a(com.json.mediationsdk.utils.IronSourceConstants.BN_INSTANCE_COLLECT_TOKEN_TIMED_OUT, new java.lang.Object[][]{new java.lang.Object[]{"duration", java.lang.Long.valueOf(j)}});
            }
            com.json.mediationsdk.w.this.a((java.util.Map<java.lang.String, java.lang.Object>) this.f3028a, (java.util.List<java.lang.String>) this.c, this.b);
        }

        @Override // com.ironsource.w7.b
        public void onFailure(java.lang.String str) {
            com.json.mediationsdk.w.this.a(com.json.mediationsdk.utils.IronSourceConstants.BN_COLLECT_TOKENS_FAILED, new java.lang.Object[][]{new java.lang.Object[]{"duration", str}});
            com.json.mediationsdk.w.this.a((java.util.Map<java.lang.String, java.lang.Object>) this.f3028a, (java.util.List<java.lang.String>) this.c, this.b);
        }
    }

    class f implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.mediationsdk.model.NetworkSettings f3029a;

        f(com.json.mediationsdk.model.NetworkSettings networkSettings) {
            this.f3029a = networkSettings;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.json.mediationsdk.w.this.a(this.f3029a);
        }
    }

    class g implements com.json.y7 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.mediationsdk.x f3030a;

        g(com.json.mediationsdk.x xVar) {
            this.f3030a = xVar;
        }

        @Override // com.json.y7
        public void a() {
            this.f3030a.D();
        }
    }

    class h extends java.util.TimerTask {
        h() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            com.json.mediationsdk.w.this.u();
        }
    }

    enum i {
        NONE,
        READY_TO_LOAD,
        STARTED_LOADING,
        FIRST_AUCTION,
        AUCTION,
        LOADING,
        RELOADING,
        LOADED
    }

    w(com.json.sf sfVar, com.json.rf rfVar, java.util.List<com.json.mediationsdk.model.NetworkSettings> list, com.json.mediationsdk.k kVar, java.util.HashSet<com.json.mediationsdk.impressionData.ImpressionDataListener> hashSet, com.json.mediationsdk.IronSourceSegment ironSourceSegment) {
        super(hashSet, ironSourceSegment);
        this.j = com.ironsource.mediationsdk.w.i.NONE;
        this.u = "";
        this.C = new java.lang.Object();
        this.E = false;
        com.ironsource.mediationsdk.w.c cVar = new com.ironsource.mediationsdk.w.c();
        this.G = cVar;
        com.json.vh vhVarK = sfVar.k();
        this.e = vhVarK;
        this.f = rfVar.e();
        this.g = sfVar.B();
        this.h = rfVar.m();
        long time = new java.util.Date().getTime();
        a(com.json.mediationsdk.utils.IronSourceConstants.BN_MANAGER_INIT_STARTED, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, com.json.mediationsdk.utils.IronSourceConstants.PROG_BN_MANAGER_NAME}});
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("isAuctionEnabled = " + kVar.j());
        this.i = kVar;
        this.q = new java.util.concurrent.ConcurrentHashMap<>();
        this.r = new java.util.concurrent.CopyOnWriteArrayList<>();
        this.z = new java.util.concurrent.ConcurrentHashMap<>();
        this.A = new java.util.concurrent.ConcurrentHashMap<>();
        com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER;
        this.p = vhVarK.a(ad_unit);
        com.json.mediationsdk.n.a().a(ad_unit, this.i.d());
        if (this.i.j()) {
            this.w = new com.json.mediationsdk.e(ad_unit, this.i.b(), this);
        }
        this.y = new com.json.mediationsdk.h(list, this.i.b().c());
        a(list, kVar);
        this.B = new java.util.Date().getTime();
        a(com.ironsource.mediationsdk.w.i.READY_TO_LOAD);
        this.F = kVar.g();
        this.k = new com.json.sl(cVar, com.json.lifecycle.b.d(), new com.json.uu());
        a(com.json.mediationsdk.utils.IronSourceConstants.BN_MANAGER_INIT_ENDED, new java.lang.Object[][]{new java.lang.Object[]{"duration", java.lang.Long.valueOf(new java.util.Date().getTime() - time)}});
    }

    public w(java.util.List<com.json.mediationsdk.model.NetworkSettings> list, com.json.mediationsdk.k kVar, java.util.HashSet<com.json.mediationsdk.impressionData.ImpressionDataListener> hashSet, com.json.mediationsdk.IronSourceSegment ironSourceSegment) {
        this(com.json.im.S(), com.json.im.M(), list, kVar, hashSet, ironSourceSegment);
    }

    private java.lang.String a(java.util.List<com.json.j5> list) {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("waterfall.size() = " + list.size());
        this.r.clear();
        this.z.clear();
        this.A.clear();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            com.json.j5 j5Var = list.get(i2);
            a(j5Var);
            sb.append(b(j5Var));
            if (i2 != list.size() - 1) {
                sb.append(",");
            }
        }
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("updateWaterfall() - next waterfall is " + sb.toString());
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i2) {
        a(i2, (java.lang.Object[][]) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i2, java.lang.Object[][] objArr) {
        a(i2, objArr, this.p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i2, java.lang.Object[][] objArr, int i3) {
        org.json.JSONObject mediationAdditionalData = com.json.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(false, true, 1);
        try {
            com.json.mediationsdk.ISBannerSize iSBannerSizeK = k();
            if (iSBannerSizeK != null) {
                a(mediationAdditionalData, iSBannerSizeK);
            }
            if (this.m != null) {
                mediationAdditionalData.put("placement", l());
            }
            mediationAdditionalData.put("sessionDepth", i3);
            if (!android.text.TextUtils.isEmpty(this.s)) {
                mediationAdditionalData.put("auctionId", this.s);
            }
            org.json.JSONObject jSONObject = this.t;
            if (jSONObject != null && jSONObject.length() > 0) {
                mediationAdditionalData.put("genericParams", this.t);
            }
            if (b(i2)) {
                mediationAdditionalData.put(com.json.mediationsdk.utils.IronSourceConstants.AUCTION_TRIALS, this.v);
                if (!android.text.TextUtils.isEmpty(this.u)) {
                    mediationAdditionalData.put(com.json.mediationsdk.utils.IronSourceConstants.AUCTION_FALLBACK, this.u);
                }
            }
            if (objArr != null) {
                for (java.lang.Object[] objArr2 : objArr) {
                    mediationAdditionalData.put(objArr2[0].toString(), objArr2[1]);
                }
            }
        } catch (java.lang.Exception e2) {
            com.json.l9.d().a(e2);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(android.util.Log.getStackTraceString(e2));
        }
        com.json.jj.i().a(new com.json.wb(i2, mediationAdditionalData));
    }

    private void a(com.json.j5 j5Var) {
        com.json.mediationsdk.x xVar = this.q.get(j5Var.c());
        if (xVar == null) {
            com.json.mediationsdk.logger.IronLog.INTERNAL.error("could not find matching smash for auction response item - item = " + j5Var.c());
            return;
        }
        com.json.mediationsdk.AbstractAdapter abstractAdapterA = com.json.mediationsdk.c.b().a(xVar.b.h());
        if (abstractAdapterA != null) {
            com.json.mediationsdk.x xVar2 = new com.json.mediationsdk.x(this.i, this, xVar.b.h(), abstractAdapterA, this.p, this.s, this.t, this.v, this.u, p());
            xVar2.a(true);
            this.r.add(xVar2);
            this.z.put(xVar2.c(), j5Var);
            this.A.put(j5Var.c(), com.ironsource.mediationsdk.h.a.ISAuctionPerformanceDidntAttemptToLoad);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.json.mediationsdk.model.NetworkSettings networkSettings) {
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose(java.lang.String.format("Start initializing provider %s on thread %s", networkSettings.getProviderInstanceName(), java.lang.Thread.currentThread().getName()));
        com.json.mediationsdk.AbstractAdapter abstractAdapterA = com.json.mediationsdk.c.b().a(networkSettings, networkSettings.getBannerSettings(), false);
        if (abstractAdapterA != null) {
            com.json.mediationsdk.x xVar = new com.json.mediationsdk.x(this.i, this, networkSettings, abstractAdapterA, this.p, p());
            this.q.put(xVar.c(), xVar);
        } else {
            ironLog.verbose(networkSettings.getProviderInstanceName() + " can't load adapter");
        }
        ironLog.verbose(java.lang.String.format("Done initializing provider %s on thread %s", networkSettings.getProviderInstanceName(), java.lang.Thread.currentThread().getName()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.ironsource.mediationsdk.w.i iVar) {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("from '" + this.j + "' to '" + iVar + "'");
        synchronized (this.C) {
            this.j = iVar;
        }
    }

    private void a(com.json.mediationsdk.x xVar, com.json.j5 j5Var) {
        this.w.a(j5Var, xVar.g(), this.x, l());
        a(this.z.get(xVar.c()), l());
    }

    private void a(java.util.List<com.json.mediationsdk.model.NetworkSettings> list, com.json.mediationsdk.k kVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<com.json.mediationsdk.model.NetworkSettings> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.ironsource.mediationsdk.w.f(it.next()));
        }
        com.json.environment.thread.IronSourceThreadManager.INSTANCE.executeTasks(kVar.c().l(), kVar.c().n(), arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(java.util.Map<java.lang.String, java.lang.Object> map, java.util.List<java.lang.String> list, java.lang.StringBuilder sb) {
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose("auction waterfallString = " + ((java.lang.Object) sb));
        if (map.size() != 0 || list.size() != 0) {
            a(com.json.mediationsdk.utils.IronSourceConstants.BN_AUCTION_REQUEST_WATERFALL, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, sb.toString()}});
            com.json.mediationsdk.e eVar = this.w;
            if (eVar != null) {
                eVar.a(com.json.environment.ContextProvider.getInstance().getApplicationContext(), map, list, this.y, this.p, this.c, j());
                return;
            } else {
                ironLog.error("mAuctionHandler is null");
                return;
            }
        }
        a(com.json.mediationsdk.utils.IronSourceConstants.BN_AUCTION_FAILED, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, 1005}, new java.lang.Object[]{"duration", 0}});
        if (a(com.ironsource.mediationsdk.w.i.AUCTION, com.ironsource.mediationsdk.w.i.LOADED)) {
            this.k.a(java.util.concurrent.TimeUnit.SECONDS.toMillis(this.i.f()));
            return;
        }
        com.json.mediationsdk.n.a().b(com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER, new com.json.mediationsdk.logger.IronSourceError(1005, "No candidates available for auctioning"));
        a(com.json.mediationsdk.utils.IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, 1005}});
        a(com.ironsource.mediationsdk.w.i.READY_TO_LOAD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(java.util.Map<java.lang.String, java.lang.Object> map, java.util.List<java.lang.String> list, java.lang.StringBuilder sb, java.util.List<com.json.t7> list2) {
        if (list2.isEmpty()) {
            a(map, list, sb);
            return;
        }
        com.json.w7 w7Var = new com.json.w7();
        com.ironsource.mediationsdk.w.e eVar = new com.ironsource.mediationsdk.w.e(map, sb, list);
        a(com.json.mediationsdk.utils.IronSourceConstants.BN_COLLECT_TOKENS);
        w7Var.a(list2, eVar, this.F, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0046  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static void a(org.json.JSONObject jSONObject, com.json.mediationsdk.ISBannerSize iSBannerSize) {
        byte b2;
        try {
            java.lang.String description = iSBannerSize.getDescription();
            switch (description.hashCode()) {
                case -387072689:
                    if (!description.equals(com.json.mediationsdk.l.c)) {
                        b2 = -1;
                    } else {
                        b2 = 2;
                    }
                    break;
                case 72205083:
                    if (!description.equals(com.json.mediationsdk.l.b)) {
                        b2 = -1;
                    } else {
                        b2 = 1;
                    }
                    break;
                case 79011241:
                    if (!description.equals(com.json.mediationsdk.l.e)) {
                        b2 = -1;
                    } else {
                        b2 = 3;
                    }
                    break;
                case 1951953708:
                    if (!description.equals(com.json.mediationsdk.l.f2983a)) {
                        b2 = -1;
                    } else {
                        b2 = 0;
                    }
                    break;
                case 1999208305:
                    if (!description.equals("CUSTOM")) {
                        b2 = -1;
                    } else {
                        b2 = 4;
                    }
                    break;
                default:
                    b2 = -1;
                    break;
            }
            if (b2 == 0) {
                jSONObject.put(com.json.mediationsdk.l.h, 1);
            } else if (b2 == 1) {
                jSONObject.put(com.json.mediationsdk.l.h, 2);
            } else if (b2 == 2) {
                jSONObject.put(com.json.mediationsdk.l.h, 3);
            } else if (b2 == 3) {
                jSONObject.put(com.json.mediationsdk.l.h, 5);
            } else if (b2 == 4) {
                jSONObject.put(com.json.mediationsdk.l.h, 6);
                jSONObject.put("custom_banner_size", iSBannerSize.getWidth() + "x" + iSBannerSize.getHeight());
            }
            if (iSBannerSize.isAdaptive()) {
                java.lang.String str = com.json.mediationsdk.l.q;
                if (jSONObject.has(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1)) {
                    str = jSONObject.optString(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1) + " , Adaptive=true";
                }
                jSONObject.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, str);
            }
        } catch (java.lang.Exception e2) {
            com.json.l9.d().a(e2);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(android.util.Log.getStackTraceString(e2));
        }
    }

    private boolean a(com.ironsource.mediationsdk.w.i iVar, com.ironsource.mediationsdk.w.i iVar2) {
        boolean z;
        synchronized (this.C) {
            if (this.j == iVar) {
                com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("set state from '" + this.j + "' to '" + iVar2 + "'");
                this.j = iVar2;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    private java.lang.String b(com.json.j5 j5Var) {
        com.json.mediationsdk.x xVar = this.q.get(j5Var.c());
        return ((xVar == null ? !android.text.TextUtils.isEmpty(j5Var.k()) : xVar.p()) ? "2" : "1") + j5Var.c();
    }

    private void b(com.json.mediationsdk.x xVar, android.view.View view, android.widget.FrameLayout.LayoutParams layoutParams) {
        if (this.l != null) {
            xVar.E();
            com.json.mediationsdk.l.a(this.l, view, layoutParams, new com.ironsource.mediationsdk.w.g(xVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(java.util.Map<java.lang.String, java.lang.Object> map, java.util.List<java.lang.String> list, java.lang.StringBuilder sb, java.util.List<com.json.t7> list2) {
        if (this.g.b(com.json.environment.ContextProvider.getInstance().getApplicationContext(), this.m, com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER)) {
            return;
        }
        for (com.json.mediationsdk.x xVar : this.q.values()) {
            com.json.mediationsdk.adunit.adapter.utility.AdData adDataCreateAdDataForNetworkAdapter = com.json.mediationsdk.adunit.adapter.utility.AdData.createAdDataForNetworkAdapter(xVar.d, com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER, null, this.l);
            if (xVar.p()) {
                list2.add(new com.json.t7(xVar.g(), xVar.c(), adDataCreateAdDataForNetworkAdapter, xVar, null, null));
            } else if (!xVar.p()) {
                list.add(xVar.c());
                sb.append(xVar.g() + xVar.c() + ",");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) {
        com.ironsource.mediationsdk.w.i iVar;
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose("current state = " + this.j);
        if (this.i.j()) {
            iVar = z ? com.ironsource.mediationsdk.w.i.AUCTION : com.ironsource.mediationsdk.w.i.FIRST_AUCTION;
        } else {
            iVar = z ? com.ironsource.mediationsdk.w.i.RELOADING : com.ironsource.mediationsdk.w.i.LOADING;
        }
        if (!a(com.ironsource.mediationsdk.w.i.STARTED_LOADING, iVar)) {
            ironLog.error("wrong state - " + this.j);
            return;
        }
        this.D = new com.json.fb();
        this.s = "";
        this.t = null;
        this.n = 0;
        this.p = this.e.a(com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER);
        a(z ? com.json.mediationsdk.utils.IronSourceConstants.BN_RELOAD : 3001);
        if (this.i.j()) {
            u();
        } else {
            x();
            t();
        }
    }

    private boolean b(int i2) {
        return i2 == 3201 || i2 == 3110 || i2 == 3111 || i2 == 3116 || i2 == 3119 || i2 == 3112 || i2 == 3115 || i2 == 3501 || i2 == 3502 || i2 == 3506;
    }

    private void f(com.json.mediationsdk.x xVar) {
        java.lang.String strK;
        com.json.mediationsdk.IronSourceBannerLayout ironSourceBannerLayout = this.l;
        if (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) {
            return;
        }
        com.json.mediationsdk.IronSourceBannerLayout ironSourceBannerLayoutB = null;
        if (xVar.p()) {
            strK = this.z.get(xVar.c()).k();
            xVar.c(strK);
        } else {
            strK = null;
        }
        org.json.JSONObject jSONObjectA = this.z.get(xVar.c()).a();
        try {
            ironSourceBannerLayoutB = this.l.b();
        } catch (java.lang.Exception e2) {
            com.json.l9.d().a(e2);
            com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("Failed to make copy of banner layout: " + e2.getMessage());
        }
        xVar.a(ironSourceBannerLayoutB, this.m, strK, jSONObjectA);
    }

    private boolean g() {
        com.json.mediationsdk.IronSourceBannerLayout ironSourceBannerLayout = this.l;
        return (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (this.o != null) {
            com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("mActiveSmash = " + this.o.f());
            this.o.t();
            this.o = null;
        }
    }

    private java.util.List<com.json.j5> i() {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = new java.util.concurrent.CopyOnWriteArrayList();
        for (com.json.mediationsdk.x xVar : this.q.values()) {
            if (!xVar.p() && !this.g.b(com.json.environment.ContextProvider.getInstance().getApplicationContext(), this.m, com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER)) {
                copyOnWriteArrayList.add(new com.json.j5(xVar.c()));
            }
        }
        return copyOnWriteArrayList;
    }

    private com.json.mediationsdk.ISBannerSize j() {
        com.json.mediationsdk.IronSourceBannerLayout ironSourceBannerLayout = this.l;
        if (ironSourceBannerLayout == null || ironSourceBannerLayout.getSize() == null) {
            return null;
        }
        if (this.l.getSize().isSmart()) {
            return com.json.mediationsdk.AdapterUtils.isLargeScreen(com.json.environment.ContextProvider.getInstance().getApplicationContext()) ? com.json.mediationsdk.ISBannerSize.e : com.json.mediationsdk.ISBannerSize.BANNER;
        }
        return this.l.getSize();
    }

    private com.json.mediationsdk.ISBannerSize k() {
        com.json.mediationsdk.IronSourceBannerLayout ironSourceBannerLayout = this.l;
        if (ironSourceBannerLayout != null) {
            return ironSourceBannerLayout.getSize();
        }
        return null;
    }

    private java.lang.String l() {
        com.json.e7 e7Var = this.m;
        return e7Var != null ? e7Var.getCom.ironsource.op.d java.lang.String() : "";
    }

    private void m() {
        java.lang.String str = this.r.isEmpty() ? "Empty waterfall" : "Mediation No fill";
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose("errorReason = ".concat(str));
        g((com.json.mediationsdk.x) null);
        com.ironsource.mediationsdk.w.i iVar = com.ironsource.mediationsdk.w.i.LOADING;
        com.ironsource.mediationsdk.w.i iVar2 = com.ironsource.mediationsdk.w.i.READY_TO_LOAD;
        if (a(iVar, iVar2)) {
            a(com.json.mediationsdk.utils.IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, 606}, new java.lang.Object[]{"reason", str}, new java.lang.Object[]{"duration", java.lang.Long.valueOf(com.json.fb.a(this.D))}});
            com.json.mediationsdk.n.a().b(com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER, new com.json.mediationsdk.logger.IronSourceError(606, str));
        } else if (!a(com.ironsource.mediationsdk.w.i.RELOADING, com.ironsource.mediationsdk.w.i.LOADED)) {
            a(iVar2);
            ironLog.error("wrong state = " + this.j);
        } else {
            a(com.json.mediationsdk.utils.IronSourceConstants.BN_CALLBACK_RELOAD_ERROR, new java.lang.Object[][]{new java.lang.Object[]{"duration", java.lang.Long.valueOf(com.json.fb.a(this.D))}});
            com.json.mediationsdk.n.a().b(com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER, new com.json.mediationsdk.logger.IronSourceError(606, str));
            this.k.a(java.util.concurrent.TimeUnit.SECONDS.toMillis(this.i.f()));
        }
    }

    private void n() {
        java.lang.String strL = l();
        com.ironsource.wf.a aVar = this.h;
        android.content.Context applicationContext = com.json.environment.ContextProvider.getInstance().getApplicationContext();
        com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER;
        aVar.a(applicationContext, strL, ad_unit);
        if (this.g.b(com.json.environment.ContextProvider.getInstance().getApplicationContext(), this.m, ad_unit)) {
            a(com.json.mediationsdk.utils.IronSourceConstants.BN_PLACEMENT_CAPPED);
        }
    }

    private boolean p() {
        com.ironsource.mediationsdk.w.i iVar = this.j;
        return iVar == com.ironsource.mediationsdk.w.i.RELOADING || iVar == com.ironsource.mediationsdk.w.i.AUCTION;
    }

    private boolean q() {
        boolean z;
        synchronized (this.C) {
            z = this.j == com.ironsource.mediationsdk.w.i.LOADED;
        }
        return z;
    }

    private boolean r() {
        boolean z;
        synchronized (this.C) {
            com.ironsource.mediationsdk.w.i iVar = this.j;
            z = iVar == com.ironsource.mediationsdk.w.i.FIRST_AUCTION || iVar == com.ironsource.mediationsdk.w.i.AUCTION;
        }
        return z;
    }

    private boolean s() {
        boolean z;
        synchronized (this.C) {
            com.ironsource.mediationsdk.w.i iVar = this.j;
            z = iVar == com.ironsource.mediationsdk.w.i.LOADING || iVar == com.ironsource.mediationsdk.w.i.RELOADING;
        }
        return z;
    }

    private void t() {
        try {
            for (int i2 = this.n; i2 < this.r.size(); i2++) {
                com.json.mediationsdk.x xVar = this.r.get(i2);
                if (xVar.h()) {
                    com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("loading smash - " + xVar.f());
                    this.n = i2 + 1;
                    f(xVar);
                    return;
                }
            }
            m();
        } catch (java.lang.Exception e2) {
            com.json.l9.d().a(e2);
            a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_BN_INTERNAL_ERROR, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, "loadNextSmash"}, new java.lang.Object[]{"reason", android.util.Log.getStackTraceString(e2)}});
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose();
        android.os.AsyncTask.execute(new com.ironsource.mediationsdk.w.d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose("");
        if (a(com.ironsource.mediationsdk.w.i.LOADED, com.ironsource.mediationsdk.w.i.STARTED_LOADING)) {
            b(true);
        } else {
            ironLog.error("wrong state = " + this.j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        if (this.A.isEmpty()) {
            return;
        }
        this.y.a(this.A);
        this.A.clear();
    }

    private void x() {
        java.util.List<com.json.j5> listI = i();
        this.s = e();
        a(listI);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean y() {
        long jA = com.json.mediationsdk.l.a(this.B, this.i.h());
        if (jA <= 0) {
            return false;
        }
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("waiting before auction - timeToWaitBeforeAuction = " + jA);
        new java.util.Timer().schedule(new com.ironsource.mediationsdk.w.h(), jA);
        return true;
    }

    @Override // com.json.p4
    public void a(int i2, java.lang.String str, int i3, java.lang.String str2, long j) {
        java.lang.String str3 = "Auction failed | moving to fallback waterfall (error " + i2 + " - " + str + ")";
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose(str3);
        com.json.mediationsdk.utils.IronSourceUtils.sendAutomationLog("BN: " + str3);
        if (!r()) {
            ironLog.warning("wrong state - mCurrentState = " + this.j);
            return;
        }
        this.u = str2;
        this.v = i3;
        this.t = null;
        x();
        a(com.json.mediationsdk.utils.IronSourceConstants.BN_AUCTION_FAILED, new java.lang.Object[][]{new java.lang.Object[]{"duration", java.lang.Long.valueOf(j)}, new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.valueOf(i2)}, new java.lang.Object[]{"reason", str}});
        a(this.j == com.ironsource.mediationsdk.w.i.FIRST_AUCTION ? com.ironsource.mediationsdk.w.i.LOADING : com.ironsource.mediationsdk.w.i.RELOADING);
        t();
    }

    public void a(com.json.mediationsdk.IronSourceBannerLayout ironSourceBannerLayout) {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose();
        com.json.mediationsdk.l.a(ironSourceBannerLayout, new com.ironsource.mediationsdk.w.b(ironSourceBannerLayout));
    }

    public void a(com.json.mediationsdk.IronSourceBannerLayout ironSourceBannerLayout, com.json.e7 e7Var) {
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose();
        com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER;
        a(ad_unit);
        f();
        if (!a(com.ironsource.mediationsdk.w.i.READY_TO_LOAD, com.ironsource.mediationsdk.w.i.STARTED_LOADING)) {
            com.json.mediationsdk.logger.IronLog.API.error("can't load banner - loadBanner already called and still in progress");
        } else if (com.json.mediationsdk.n.a().b(ad_unit)) {
            ironLog.verbose("can't load banner - already has pending invocation");
        } else {
            com.json.mediationsdk.l.a(ironSourceBannerLayout, e7Var, new com.ironsource.mediationsdk.w.a(e7Var, ironSourceBannerLayout));
        }
    }

    @Override // com.json.rp
    public void a(com.json.mediationsdk.logger.IronSourceError ironSourceError, com.json.mediationsdk.x xVar, boolean z) {
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose("error = " + ironSourceError);
        if (xVar.x() != this.s) {
            ironLog.error("invoked with auctionId: " + xVar.x() + " and the current id is " + this.s);
            xVar.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_BN_MANAGER_UNEXPECTED_STATE, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, 3}, new java.lang.Object[]{"reason", "Wrong auction " + xVar.x() + " State - " + this.j}, new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, xVar.c()}});
        } else if (!s()) {
            ironLog.warning("wrong state - mCurrentState = " + this.j);
        } else {
            this.A.put(xVar.c(), com.ironsource.mediationsdk.h.a.ISAuctionPerformanceFailedToLoad);
            t();
        }
    }

    @Override // com.json.rp
    public void a(com.json.mediationsdk.x xVar) {
        com.json.j5 j5Var;
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose(xVar.f());
        if (!q()) {
            ironLog.warning("wrong state - mCurrentState = " + this.j);
            a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_BN_MANAGER_UNEXPECTED_STATE, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, 1}, new java.lang.Object[]{"reason", "Wrong State - " + this.j}, new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, xVar.c()}});
            return;
        }
        if (this.i.j() && this.i.b().p() && (j5Var = this.z.get(xVar.c())) != null) {
            a(xVar, j5Var);
        }
        a(com.json.mediationsdk.utils.IronSourceConstants.BN_CALLBACK_SHOW);
    }

    @Override // com.json.rp
    public void a(com.json.mediationsdk.x xVar, android.view.View view, android.widget.FrameLayout.LayoutParams layoutParams) {
        java.lang.Object[][] objArr;
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose("smash = " + xVar.f());
        if (xVar.x() != this.s) {
            ironLog.error("invoked with auctionId: " + xVar.x() + " and the current id is " + this.s);
            xVar.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_BN_MANAGER_UNEXPECTED_STATE, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, 2}, new java.lang.Object[]{"reason", "Wrong auction id " + xVar.x() + " State - " + this.j}, new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, xVar.c()}});
            return;
        }
        if (!s()) {
            ironLog.warning("wrong state - mCurrentState = " + this.j);
            return;
        }
        com.json.mediationsdk.x xVar2 = this.o;
        if (xVar2 != null) {
            xVar2.q();
        }
        g(xVar);
        this.o = xVar;
        b(xVar, view, layoutParams);
        this.A.put(xVar.c(), com.ironsource.mediationsdk.h.a.ISAuctionPerformanceShowedSuccessfully);
        if (this.i.j()) {
            com.json.j5 j5Var = this.z.get(xVar.c());
            if (j5Var != null) {
                a(j5Var.a(l()), j5Var.d());
                this.w.a(j5Var, xVar.g(), this.x);
                this.w.a(this.r, this.z, xVar.g(), this.x, j5Var);
                if (!this.i.b().p()) {
                    a(xVar, j5Var);
                }
            } else {
                java.lang.String strC = xVar.c();
                ironLog.error("onLoadSuccess winner instance " + strC + " missing from waterfall. auctionId = " + this.s);
                a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_BN_NOTIFICATIONS_ERROR, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, 1010}, new java.lang.Object[]{"reason", "Loaded missing"}, new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, strC}});
            }
        }
        if (this.j == com.ironsource.mediationsdk.w.i.LOADING) {
            if (g()) {
                com.json.q5.a().d(this.d);
                objArr = new java.lang.Object[][]{new java.lang.Object[]{"duration", java.lang.Long.valueOf(com.json.fb.a(this.D))}};
            } else {
                objArr = new java.lang.Object[][]{new java.lang.Object[]{"reason", "banner is destroyed"}, new java.lang.Object[]{"duration", java.lang.Long.valueOf(com.json.fb.a(this.D))}};
            }
            a(com.json.mediationsdk.utils.IronSourceConstants.BN_CALLBACK_LOAD_SUCCESS, objArr);
        } else {
            if (g()) {
                com.json.q5.a().d(this.d);
            }
            com.json.mediationsdk.utils.IronSourceUtils.sendAutomationLog("bannerReloadSucceeded");
            a(com.json.mediationsdk.utils.IronSourceConstants.BN_CALLBACK_RELOAD_SUCCESS, new java.lang.Object[][]{new java.lang.Object[]{"duration", java.lang.Long.valueOf(com.json.fb.a(this.D))}});
        }
        n();
        this.f.b(com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER);
        a(com.ironsource.mediationsdk.w.i.LOADED);
        this.k.a(java.util.concurrent.TimeUnit.SECONDS.toMillis(this.i.f()));
    }

    @Override // com.json.p4
    public void a(java.util.List<com.json.j5> list, java.lang.String str, com.json.j5 j5Var, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, int i2, long j, int i3, java.lang.String str2) {
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose("auctionId = " + str);
        if (!r()) {
            ironLog.warning("wrong state - mCurrentState = " + this.j);
            return;
        }
        this.u = "";
        this.s = str;
        this.v = i2;
        this.x = j5Var;
        this.t = jSONObject;
        if (!android.text.TextUtils.isEmpty(str2)) {
            a(88002, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.valueOf(i3)}, new java.lang.Object[]{"reason", str2}});
        }
        com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER;
        a(jSONObject2, ad_unit);
        if (!this.b.a(ad_unit)) {
            a(com.json.mediationsdk.utils.IronSourceConstants.BN_AUCTION_SUCCESS, new java.lang.Object[][]{new java.lang.Object[]{"duration", java.lang.Long.valueOf(j)}});
            a(this.j == com.ironsource.mediationsdk.w.i.FIRST_AUCTION ? com.ironsource.mediationsdk.w.i.LOADING : com.ironsource.mediationsdk.w.i.RELOADING);
            a(com.json.mediationsdk.utils.IronSourceConstants.BN_AUCTION_RESPONSE_WATERFALL, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, a(list)}});
            t();
            return;
        }
        a(com.json.mediationsdk.utils.IronSourceConstants.BN_AD_UNIT_CAPPED, new java.lang.Object[][]{new java.lang.Object[]{"auctionId", str}});
        com.ironsource.mediationsdk.w.i iVar = this.j;
        a(com.ironsource.mediationsdk.w.i.READY_TO_LOAD);
        if (iVar == com.ironsource.mediationsdk.w.i.FIRST_AUCTION) {
            com.json.mediationsdk.n.a().b(ad_unit, new com.json.mediationsdk.logger.IronSourceError(com.json.mediationsdk.logger.IronSourceError.ERROR_AD_FORMAT_CAPPED, "Ad unit is capped"));
        }
    }

    @Override // com.json.rp
    public void b(com.json.mediationsdk.x xVar) {
        java.lang.Object[][] objArr;
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(xVar.f());
        if (g()) {
            com.json.q5.a().b(this.d);
            objArr = null;
        } else {
            objArr = new java.lang.Object[][]{new java.lang.Object[]{"reason", "banner is destroyed"}};
        }
        a(com.json.mediationsdk.utils.IronSourceConstants.BN_CALLBACK_CLICK, objArr, xVar.n());
    }

    @Override // com.json.rp
    public void c(com.json.mediationsdk.x xVar) {
        java.lang.Object[][] objArr;
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(xVar.f());
        if (g()) {
            com.json.q5.a().c(this.d);
            objArr = null;
        } else {
            objArr = new java.lang.Object[][]{new java.lang.Object[]{"reason", "banner is destroyed"}};
        }
        a(com.json.mediationsdk.utils.IronSourceConstants.BN_CALLBACK_LEAVE_APP, objArr, xVar.n());
    }

    @Override // com.json.rp
    public void d(com.json.mediationsdk.x xVar) {
        java.lang.Object[][] objArr;
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(xVar.f());
        if (g()) {
            com.json.q5.a().f(this.d);
            objArr = null;
        } else {
            objArr = new java.lang.Object[][]{new java.lang.Object[]{"reason", "banner is destroyed"}};
        }
        a(com.json.mediationsdk.utils.IronSourceConstants.BN_CALLBACK_PRESENT_SCREEN, objArr, xVar.n());
    }

    @Override // com.json.rp
    public void e(com.json.mediationsdk.x xVar) {
        java.lang.Object[][] objArr;
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(xVar.f());
        if (g()) {
            com.json.q5.a().e(this.d);
            objArr = null;
        } else {
            objArr = new java.lang.Object[][]{new java.lang.Object[]{"reason", "banner is destroyed"}};
        }
        a(com.json.mediationsdk.utils.IronSourceConstants.BN_CALLBACK_DISMISS_SCREEN, objArr, xVar.n());
    }

    public void g(com.json.mediationsdk.x xVar) {
        for (com.json.mediationsdk.x xVar2 : this.r) {
            if (!xVar2.equals(xVar)) {
                xVar2.q();
            }
        }
    }

    public boolean o() {
        com.json.mediationsdk.logger.IronLog ironLog;
        java.lang.String str;
        if (!this.l.isShown()) {
            ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
            str = "banner or one of its parents are INVISIBLE or GONE";
        } else {
            if (this.l.hasWindowFocus()) {
                boolean globalVisibleRect = this.l.getGlobalVisibleRect(new android.graphics.Rect());
                com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("visible = " + globalVisibleRect);
                return globalVisibleRect;
            }
            ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
            str = "banner has no window focus";
        }
        ironLog.verbose(str);
        return false;
    }
}

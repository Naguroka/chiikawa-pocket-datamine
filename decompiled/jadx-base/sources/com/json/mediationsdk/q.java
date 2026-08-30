package com.json.mediationsdk;

/* JADX INFO: loaded from: classes5.dex */
class q extends com.json.mediationsdk.m implements com.json.uk, com.json.zq, com.json.p4, com.json.yf, com.json.zn, com.json.o {
    private long A;
    private java.lang.Boolean B;
    private final java.lang.Object C;
    private com.json.kc D;
    private final long E;
    private final com.ironsource.wf.a F;
    private final com.json.wf G;
    private com.json.vk e;
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, com.json.j5> f;
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.h.a> g;
    private com.json.j5 h;
    private com.json.mediationsdk.h i;
    private com.json.mediationsdk.e j;
    private org.json.JSONObject k;
    private com.json.yq l;
    private boolean m;
    private long n;
    private java.lang.String o;
    private int p;
    private com.json.environment.NetworkStateReceiver q;
    private boolean r;
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.json.mediationsdk.r> s;
    private com.json.ms t;
    private int u;
    private java.lang.String v;
    private int w;
    private boolean x;
    private boolean y;
    private com.ironsource.mediationsdk.q.e z;

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.mediationsdk.model.NetworkSettings f3003a;
        final /* synthetic */ com.json.uq b;
        final /* synthetic */ java.lang.String c;
        final /* synthetic */ java.lang.String d;

        a(com.json.mediationsdk.model.NetworkSettings networkSettings, com.json.uq uqVar, java.lang.String str, java.lang.String str2) {
            this.f3003a = networkSettings;
            this.b = uqVar;
            this.c = str;
            this.d = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.json.mediationsdk.q.this.a(this.f3003a, this.b, this.c, this.d);
        }
    }

    class b extends java.util.TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            com.json.mediationsdk.q.this.j();
        }
    }

    class c implements java.lang.Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.json.mediationsdk.q.this.d("makeAuction()");
            com.json.mediationsdk.q.this.n = new java.util.Date().getTime();
            java.util.HashMap map = new java.util.HashMap();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            com.json.mediationsdk.q.this.b(map, arrayList, sb, arrayList2);
            com.json.mediationsdk.q.this.a(map, arrayList, sb, arrayList2);
        }
    }

    class d implements com.ironsource.w7.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.util.Map f3006a;
        final /* synthetic */ java.lang.StringBuilder b;
        final /* synthetic */ java.util.List c;

        d(java.util.Map map, java.lang.StringBuilder sb, java.util.List list) {
            this.f3006a = map;
            this.b = sb;
            this.c = list;
        }

        @Override // com.ironsource.w7.b
        public void a(java.util.List<com.json.x7> list, long j, java.util.List<java.lang.String> list2) {
            com.json.mediationsdk.q.this.c(com.json.mediationsdk.utils.IronSourceConstants.RV_COLLECT_TOKENS_COMPLETED, com.json.kk.a(new java.lang.Object[][]{new java.lang.Object[]{"duration", java.lang.Long.valueOf(j)}}));
            for (com.json.x7 x7Var : list) {
                com.json.mediationsdk.r rVar = (com.json.mediationsdk.r) com.json.mediationsdk.q.this.s.get(x7Var.c());
                if (x7Var.a() != null) {
                    this.f3006a.put(x7Var.c(), x7Var.a());
                    this.b.append(x7Var.d()).append(x7Var.c()).append(",");
                    if (rVar != null) {
                        rVar.a(1021, new java.lang.Object[][]{new java.lang.Object[]{"duration", java.lang.Long.valueOf(x7Var.e())}});
                    }
                } else if (rVar != null) {
                    rVar.a(1022, new java.lang.Object[][]{new java.lang.Object[]{"duration", java.lang.Long.valueOf(x7Var.e())}, new java.lang.Object[]{"reason", x7Var.b()}});
                }
            }
            java.util.Iterator<java.lang.String> it = list2.iterator();
            while (it.hasNext()) {
                com.json.mediationsdk.r rVar2 = (com.json.mediationsdk.r) com.json.mediationsdk.q.this.s.get(it.next());
                if (rVar2 != null) {
                    rVar2.a(1023, new java.lang.Object[][]{new java.lang.Object[]{"duration", java.lang.Long.valueOf(j)}});
                }
            }
            com.json.mediationsdk.q.this.a((java.util.Map<java.lang.String, java.lang.Object>) this.f3006a, (java.util.List<java.lang.String>) this.c, this.b.toString());
        }

        @Override // com.ironsource.w7.b
        public void onFailure(java.lang.String str) {
            com.json.mediationsdk.q.this.c(com.json.mediationsdk.utils.IronSourceConstants.RV_COLLECT_TOKENS_FAILED, com.json.kk.a(new java.lang.Object[][]{new java.lang.Object[]{"reason", str}}));
            com.json.mediationsdk.q.this.a((java.util.Map<java.lang.String, java.lang.Object>) this.f3006a, (java.util.List<java.lang.String>) this.c, this.b.toString());
        }
    }

    private enum e {
        RV_STATE_INITIATING,
        RV_STATE_AUCTION_IN_PROGRESS,
        RV_STATE_NOT_LOADED,
        RV_STATE_LOADING_SMASHES,
        RV_STATE_READY_TO_SHOW
    }

    public q(java.util.List<com.json.mediationsdk.model.NetworkSettings> list, com.json.uq uqVar, java.lang.String str, java.lang.String str2, java.util.HashSet<com.json.mediationsdk.impressionData.ImpressionDataListener> hashSet, com.json.mediationsdk.IronSourceSegment ironSourceSegment) {
        super(hashSet, ironSourceSegment);
        this.o = "";
        this.r = false;
        this.u = 1;
        this.C = new java.lang.Object();
        this.F = com.json.im.M().m();
        this.G = com.json.im.S().B();
        long time = new java.util.Date().getTime();
        c(com.json.mediationsdk.utils.IronSourceConstants.RV_MANAGER_INIT_STARTED, com.json.kk.a(new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, com.json.mediationsdk.utils.IronSourceConstants.LWS_RV_MANAGER_NAME}}));
        a(com.ironsource.mediationsdk.q.e.RV_STATE_INITIATING);
        this.B = null;
        this.w = uqVar.g();
        this.x = uqVar.j();
        this.v = "";
        this.k = null;
        com.json.l5 l5VarK = uqVar.k();
        this.y = false;
        this.e = new com.json.vk(uqVar.k().f(), uqVar.k().i());
        this.f = new java.util.concurrent.ConcurrentHashMap<>();
        this.g = new java.util.concurrent.ConcurrentHashMap<>();
        this.A = new java.util.Date().getTime();
        boolean z = l5VarK.g() > 0;
        this.m = z;
        if (z) {
            this.j = new com.json.mediationsdk.e(com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO, l5VarK, this);
        }
        this.l = new com.json.yq(l5VarK, this);
        java.util.concurrent.ConcurrentHashMap<java.lang.String, com.json.mediationsdk.r> concurrentHashMap = new java.util.concurrent.ConcurrentHashMap<>();
        this.s = concurrentHashMap;
        a(list, uqVar, str, str2);
        this.i = new com.json.mediationsdk.h(list, l5VarK.c());
        com.json.ms msVar = new com.json.ms();
        this.t = msVar;
        msVar.a(new java.util.ArrayList(concurrentHashMap.values()));
        this.D = new com.json.kc(uqVar.c(), this);
        this.E = uqVar.l();
        c(com.json.mediationsdk.utils.IronSourceConstants.RV_MANAGER_INIT_ENDED, com.json.kk.a(new java.lang.Object[][]{new java.lang.Object[]{"duration", java.lang.Long.valueOf(new java.util.Date().getTime() - time)}}));
        a(l5VarK.k());
    }

    private java.lang.String a(com.json.j5 j5Var) {
        java.lang.String string;
        com.json.mediationsdk.r rVar = this.s.get(j5Var.c());
        if (rVar != null) {
            string = java.lang.Integer.toString(rVar.g());
        } else {
            string = android.text.TextUtils.isEmpty(j5Var.k()) ? "1" : "2";
        }
        return string + j5Var.c();
    }

    private void a(int i) {
        a(i, (java.util.Map<java.lang.String, java.lang.Object>) null, true, true);
    }

    private void a(int i, java.util.Map<java.lang.String, java.lang.Object> map) {
        a(i, map, false, true);
    }

    private void a(int i, java.util.Map<java.lang.String, java.lang.Object> map, boolean z, boolean z2) {
        java.util.HashMap map2 = new java.util.HashMap();
        map2.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        map2.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_PROGRAMMATIC, 2);
        if (z2 && !android.text.TextUtils.isEmpty(this.e.d())) {
            map2.put("auctionId", this.e.d());
        }
        org.json.JSONObject jSONObject = this.k;
        if (jSONObject != null && jSONObject.length() > 0) {
            map2.put("genericParams", this.k);
        }
        if (z && !android.text.TextUtils.isEmpty(this.v)) {
            map2.put("placement", this.v);
        }
        if (c(i)) {
            com.json.wq.i().a(map2, this.p, this.o);
        }
        map2.put("sessionDepth", java.lang.Integer.valueOf(this.u));
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    map2.putAll(map);
                }
            } catch (java.lang.Exception e2) {
                com.json.l9.d().a(e2);
                com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL, "LWSProgRvManager: RV sendMediationEvent " + android.util.Log.getStackTraceString(e2), 3);
            }
        }
        com.json.wq.i().a(new com.json.wb(i, new org.json.JSONObject(map2)));
    }

    private void a(long j) {
        java.util.Map<java.lang.String, java.lang.Object> mapA;
        if (this.t.a()) {
            d("all smashes are capped");
            mapA = com.json.kk.a(new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.valueOf(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_MEDIATION_TCS_CALCULATED)}, new java.lang.Object[]{"reason", "all smashes are capped"}});
        } else {
            a(com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO);
            if (this.m) {
                if (!this.g.isEmpty()) {
                    this.i.a(this.g);
                    this.g.clear();
                }
                new java.util.Timer().schedule(new com.ironsource.mediationsdk.q.b(), j);
                return;
            }
            d("auction fallback flow starting");
            k();
            if (!this.e.c().isEmpty()) {
                b(1000);
                i();
                return;
            } else {
                d("loadSmashes -  waterfall is empty");
                mapA = com.json.kk.a(new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, 80004}, new java.lang.Object[]{"reason", "waterfall is empty"}});
            }
        }
        a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, mapA);
        h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.json.mediationsdk.model.NetworkSettings networkSettings, com.json.uq uqVar, java.lang.String str, java.lang.String str2) {
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose(java.lang.String.format("Start initializing provider %s on thread %s", networkSettings.getProviderInstanceName(), java.lang.Thread.currentThread().getName()));
        com.json.mediationsdk.AbstractAdapter abstractAdapterA = com.json.mediationsdk.c.b().a(networkSettings, networkSettings.getRewardedVideoSettings(), false);
        if (abstractAdapterA != null) {
            com.json.mediationsdk.r rVar = new com.json.mediationsdk.r(str, str2, networkSettings, this, uqVar.h(), abstractAdapterA, this.u);
            this.s.put(rVar.c(), rVar);
        }
        ironLog.verbose(java.lang.String.format("Done initializing provider %s on thread %s", networkSettings.getProviderInstanceName(), java.lang.Thread.currentThread().getName()));
    }

    private void a(com.ironsource.mediationsdk.q.e eVar) {
        d("current state=" + this.z + ", new state=" + eVar);
        this.z = eVar;
    }

    private void a(com.json.mediationsdk.r rVar, java.lang.String str) {
        com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "LWSProgRvManager: " + (rVar.c() + " : " + str), 0);
    }

    private void a(java.lang.String str) {
        com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, str, 3);
    }

    private void a(java.util.List<com.json.mediationsdk.model.NetworkSettings> list, com.json.uq uqVar, java.lang.String str, java.lang.String str2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<com.json.mediationsdk.model.NetworkSettings> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.ironsource.mediationsdk.q.a(it.next(), uqVar, str, str2));
        }
        com.json.environment.thread.IronSourceThreadManager.INSTANCE.executeTasks(uqVar.f(), uqVar.o(), arrayList);
    }

    private void a(java.util.List<com.json.j5> list, java.lang.String str, org.json.JSONObject jSONObject) {
        this.f.clear();
        this.g.clear();
        java.util.concurrent.CopyOnWriteArrayList<com.json.mediationsdk.r> copyOnWriteArrayList = new java.util.concurrent.CopyOnWriteArrayList<>();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (com.json.j5 j5Var : list) {
            sb.append(a(j5Var) + ",");
            com.json.mediationsdk.r rVar = this.s.get(j5Var.c());
            if (rVar != null) {
                com.json.mediationsdk.AbstractAdapter abstractAdapterA = com.json.mediationsdk.c.b().a(rVar.b.h());
                if (abstractAdapterA != null) {
                    com.json.mediationsdk.r rVar2 = new com.json.mediationsdk.r(rVar, this, abstractAdapterA, this.u, str, jSONObject, this.p, this.o);
                    rVar2.a(true);
                    copyOnWriteArrayList.add(rVar2);
                    this.f.put(rVar2.c(), j5Var);
                    this.g.put(j5Var.c(), com.ironsource.mediationsdk.h.a.ISAuctionPerformanceDidntAttemptToLoad);
                }
            } else {
                d("updateWaterfall() - could not find matching smash for auction response item " + j5Var.c());
            }
        }
        this.e.a(copyOnWriteArrayList, str);
        if (this.e.a()) {
            a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_RV_WATERFALL_OVERHEAD, com.json.kk.a(new java.lang.Object[][]{new java.lang.Object[]{"reason", "waterfalls hold too many with size=" + this.e.e()}}));
        }
        d("updateWaterfall() - next waterfall is " + sb.toString());
        if (sb.length() == 0) {
            d("Updated waterfall is empty");
        }
        a(com.json.mediationsdk.utils.IronSourceConstants.RV_AUCTION_RESPONSE_WATERFALL, com.json.kk.a(new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, sb.toString()}}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(java.util.Map<java.lang.String, java.lang.Object> map, java.util.List<java.lang.String> list, java.lang.String str) {
        if (map.keySet().size() == 0 && list.size() == 0) {
            c(1301, com.json.kk.a(new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, 1005}, new java.lang.Object[]{"duration", 0}}));
            d("makeAuction() failed - No candidates available for auctioning");
            h();
        } else {
            d("makeAuction() - request waterfall is: " + str);
            b(1000);
            b(com.json.mediationsdk.utils.IronSourceConstants.RV_AUCTION_REQUEST);
            c(com.json.mediationsdk.utils.IronSourceConstants.RV_AUCTION_REQUEST_WATERFALL, com.json.kk.a(new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, str.toString()}}));
            this.j.a(com.json.environment.ContextProvider.getInstance().getApplicationContext(), map, list, this.i, this.u, this.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(java.util.Map<java.lang.String, java.lang.Object> map, java.util.List<java.lang.String> list, java.lang.StringBuilder sb, java.util.List<com.json.t7> list2) {
        if (list2.isEmpty()) {
            a(map, list, sb.toString());
            return;
        }
        com.json.w7 w7Var = new com.json.w7();
        com.ironsource.mediationsdk.q.d dVar = new com.ironsource.mediationsdk.q.d(map, sb, list);
        b(com.json.mediationsdk.utils.IronSourceConstants.RV_COLLECT_TOKENS);
        w7Var.a(list2, dVar, this.E, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    private void a(boolean z, java.util.Map<java.lang.String, java.lang.Object> map) {
        synchronized (this.C) {
            java.lang.Boolean bool = this.B;
            if (bool == null || bool.booleanValue() != z) {
                this.B = java.lang.Boolean.valueOf(z);
                long time = new java.util.Date().getTime() - this.A;
                this.A = new java.util.Date().getTime();
                if (map == null) {
                    map = new java.util.HashMap<>();
                }
                map.put("duration", java.lang.Long.valueOf(time));
                a(z ? com.json.mediationsdk.utils.IronSourceConstants.RV_CALLBACK_AVAILABILITY_TRUE : com.json.mediationsdk.utils.IronSourceConstants.RV_CALLBACK_AVAILABILITY_FALSE, map);
                com.json.zp zpVarA = com.json.zp.a();
                com.json.vk vkVar = this.e;
                zpVarA.a(z, vkVar.a(vkVar.d()));
            }
        }
    }

    private void b(int i) {
        a(i, (java.util.Map<java.lang.String, java.lang.Object>) null, false, false);
    }

    private void b(int i, java.util.Map<java.lang.String, java.lang.Object> map) {
        a(i, map, true, true);
    }

    private void b(java.lang.String str) {
        com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, str, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(java.util.Map<java.lang.String, java.lang.Object> map, java.util.List<java.lang.String> list, java.lang.StringBuilder sb, java.util.List<com.json.t7> list2) {
        for (com.json.mediationsdk.r rVar : this.s.values()) {
            if (!this.t.b(rVar) && this.e.b(rVar)) {
                if (rVar.p()) {
                    list2.add(new com.json.t7(rVar.g(), rVar.c(), null, rVar, null, null));
                } else {
                    list.add(rVar.c());
                    sb.append(rVar.g() + rVar.c() + ",");
                }
            }
        }
    }

    private void b(boolean z) {
        a(z, (java.util.Map<java.lang.String, java.lang.Object>) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i, java.util.Map<java.lang.String, java.lang.Object> map) {
        a(i, map, false, false);
    }

    private void c(com.json.mediationsdk.r rVar, com.json.mediationsdk.model.Placement placement) {
        d("showVideo()");
        this.t.a(rVar);
        if (this.t.b(rVar)) {
            rVar.B();
            com.json.mediationsdk.utils.IronSourceUtils.sendAutomationLog(rVar.c() + " rewarded video is now session capped");
        }
        com.ironsource.wf.a aVar = this.F;
        android.content.Context applicationContext = com.json.environment.ContextProvider.getInstance().getApplicationContext();
        java.lang.String str = placement.getCom.ironsource.op.d java.lang.String();
        com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO;
        aVar.a(applicationContext, str, ad_unit);
        if (this.G.b(com.json.environment.ContextProvider.getInstance().getApplicationContext(), placement, ad_unit)) {
            a(com.json.mediationsdk.utils.IronSourceConstants.RV_CAP_PLACEMENT);
        }
        this.D.a();
        rVar.a(placement);
    }

    private void c(java.lang.String str) {
        com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL, "LWSProgRvManager: " + str, 3);
    }

    private boolean c(int i) {
        return i == 1003 || i == 1302 || i == 1301 || i == 1303;
    }

    private boolean c(boolean z) {
        java.lang.Boolean bool = this.B;
        if (bool == null) {
            return false;
        }
        return (z && !bool.booleanValue() && d()) || (!z && this.B.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(java.lang.String str) {
        com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL, "LWSProgRvManager: " + str, 0);
    }

    private java.util.List<com.json.j5> g() {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = new java.util.concurrent.CopyOnWriteArrayList();
        for (com.json.mediationsdk.r rVar : this.s.values()) {
            if (!rVar.p() && !this.t.b(rVar) && this.e.b(rVar)) {
                copyOnWriteArrayList.add(new com.json.j5(rVar.c()));
            }
        }
        return copyOnWriteArrayList;
    }

    private void g(com.json.mediationsdk.r rVar) {
        java.lang.String strK = this.f.get(rVar.c()).k();
        org.json.JSONObject jSONObjectA = this.f.get(rVar.c()).a();
        rVar.c(strK);
        rVar.a(strK, jSONObjectA);
    }

    private void h() {
        a(com.ironsource.mediationsdk.q.e.RV_STATE_NOT_LOADED);
        if (!this.y) {
            b(false);
        }
        this.l.a();
    }

    private void i() {
        if (this.e.c().isEmpty()) {
            d("loadSmashes -  waterfall is empty");
            a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, com.json.kk.a(new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, 80004}, new java.lang.Object[]{"reason", "waterfall is empty"}}));
            h();
            return;
        }
        a(com.ironsource.mediationsdk.q.e.RV_STATE_LOADING_SMASHES);
        int i = 0;
        for (int i2 = 0; i2 < this.e.c().size() && i < this.w; i2++) {
            com.json.mediationsdk.r rVar = this.e.c().get(i2);
            if (rVar.h()) {
                if (this.x && rVar.p()) {
                    if (i != 0) {
                        java.lang.String str = "Advanced Loading: Won't start loading bidder " + rVar.c() + " as a non bidder is being loaded";
                        d(str);
                        com.json.mediationsdk.utils.IronSourceUtils.sendAutomationLog(str);
                        return;
                    } else {
                        java.lang.String str2 = "Advanced Loading: Starting to load bidder " + rVar.c() + ". No other instances will be loaded at the same time.";
                        d(str2);
                        com.json.mediationsdk.utils.IronSourceUtils.sendAutomationLog(str2);
                        g(rVar);
                        return;
                    }
                }
                g(rVar);
                i++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        synchronized (this.C) {
            com.ironsource.mediationsdk.q.e eVar = this.z;
            com.ironsource.mediationsdk.q.e eVar2 = com.ironsource.mediationsdk.q.e.RV_STATE_AUCTION_IN_PROGRESS;
            if (eVar != eVar2) {
                a(eVar2);
                android.os.AsyncTask.execute(new com.ironsource.mediationsdk.q.c());
            }
        }
    }

    private void k() {
        a(g(), "fallback_" + java.lang.System.currentTimeMillis(), this.k);
    }

    @Override // com.json.o
    public void a() {
        a(com.ironsource.mediationsdk.q.e.RV_STATE_NOT_LOADED);
        a(false, com.json.kk.a(new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.valueOf(com.json.mediationsdk.logger.IronSourceError.ERROR_RV_EXPIRED_ADS)}, new java.lang.Object[]{"reason", "loaded ads are expired"}}));
        a(0L);
    }

    @Override // com.json.p4
    public void a(int i, java.lang.String str, int i2, java.lang.String str2, long j) {
        java.lang.String str3 = "Auction failed | moving to fallback waterfall (error " + i + " - " + str + ")";
        d(str3);
        com.json.mediationsdk.utils.IronSourceUtils.sendAutomationLog("RV: " + str3);
        this.p = i2;
        this.o = str2;
        this.k = null;
        k();
        a(1301, android.text.TextUtils.isEmpty(str) ? com.json.kk.a(new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.valueOf(i)}, new java.lang.Object[]{"duration", java.lang.Long.valueOf(j)}}) : com.json.kk.a(new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.valueOf(i)}, new java.lang.Object[]{"reason", str}, new java.lang.Object[]{"duration", java.lang.Long.valueOf(j)}}));
        i();
    }

    @Override // com.json.yf
    public void a(android.app.Activity activity, com.json.mediationsdk.model.Placement placement) {
        synchronized (this.C) {
            try {
                if (placement == null) {
                    a("showRewardedVideo error: empty default placement");
                    com.json.mediationsdk.logger.IronSourceError ironSourceError = new com.json.mediationsdk.logger.IronSourceError(1021, "showRewardedVideo error: empty default placement");
                    com.json.zp zpVarA = com.json.zp.a();
                    com.json.vk vkVar = this.e;
                    zpVarA.a(ironSourceError, vkVar.a(vkVar.d()));
                    a(com.json.mediationsdk.utils.IronSourceConstants.RV_CALLBACK_SHOW_FAILED, com.json.kk.a(new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, 1021}, new java.lang.Object[]{"reason", "showRewardedVideo error: empty default placement"}}), false, true);
                    return;
                }
                this.v = placement.getCom.ironsource.op.d java.lang.String();
                b("showRewardedVideo(" + placement + ")");
                com.json.mediationsdk.r rVar = null;
                b(1100, activity != null ? com.json.kk.a(new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, com.json.mediationsdk.utils.IronSourceConstants.EVENTS_INIT_CONTEXT_FLOW}}) : null);
                if (this.y) {
                    a("showRewardedVideo error: can't show ad while an ad is already showing");
                    com.json.mediationsdk.logger.IronSourceError ironSourceError2 = new com.json.mediationsdk.logger.IronSourceError(1022, "showRewardedVideo error: can't show ad while an ad is already showing");
                    com.json.zp zpVarA2 = com.json.zp.a();
                    com.json.vk vkVar2 = this.e;
                    zpVarA2.a(ironSourceError2, vkVar2.a(vkVar2.d()));
                    b(com.json.mediationsdk.utils.IronSourceConstants.RV_CALLBACK_SHOW_FAILED, com.json.kk.a(new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, 1022}, new java.lang.Object[]{"reason", "showRewardedVideo error: can't show ad while an ad is already showing"}}));
                    return;
                }
                if (this.z != com.ironsource.mediationsdk.q.e.RV_STATE_READY_TO_SHOW) {
                    a("showRewardedVideo error: show called while no ads are available");
                    com.json.mediationsdk.logger.IronSourceError ironSourceError3 = new com.json.mediationsdk.logger.IronSourceError(1023, "showRewardedVideo error: show called while no ads are available");
                    com.json.zp zpVarA3 = com.json.zp.a();
                    com.json.vk vkVar3 = this.e;
                    zpVarA3.a(ironSourceError3, vkVar3.a(vkVar3.d()));
                    b(com.json.mediationsdk.utils.IronSourceConstants.RV_CALLBACK_SHOW_FAILED, com.json.kk.a(new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, 1023}, new java.lang.Object[]{"reason", "showRewardedVideo error: show called while no ads are available"}}));
                    return;
                }
                if (this.G.b(com.json.environment.ContextProvider.getInstance().getApplicationContext(), placement, com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO)) {
                    java.lang.String str = "showRewardedVideo error: placement " + this.v + " is capped";
                    a(str);
                    com.json.mediationsdk.logger.IronSourceError ironSourceError4 = new com.json.mediationsdk.logger.IronSourceError(com.json.mediationsdk.logger.IronSourceError.ERROR_PLACEMENT_CAPPED, str);
                    com.json.zp zpVarA4 = com.json.zp.a();
                    com.json.vk vkVar4 = this.e;
                    zpVarA4.a(ironSourceError4, vkVar4.a(vkVar4.d()));
                    b(com.json.mediationsdk.utils.IronSourceConstants.RV_CALLBACK_SHOW_FAILED, com.json.kk.a(new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.valueOf(com.json.mediationsdk.logger.IronSourceError.ERROR_PLACEMENT_CAPPED)}, new java.lang.Object[]{"reason", str}}));
                    return;
                }
                java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                for (com.json.mediationsdk.r rVar2 : this.e.c()) {
                    if (rVar2.A()) {
                        this.y = true;
                        rVar2.b(true);
                        a(com.ironsource.mediationsdk.q.e.RV_STATE_NOT_LOADED);
                        rVar = rVar2;
                        break;
                    }
                    if (rVar2.e() != null) {
                        stringBuffer.append(rVar2.c() + ":" + rVar2.e() + ",");
                    }
                    rVar2.b(false);
                }
                if (rVar != null) {
                    c(rVar, placement);
                    return;
                }
                d("showRewardedVideo(): No ads to show");
                com.json.zp zpVarA5 = com.json.zp.a();
                com.json.mediationsdk.logger.IronSourceError ironSourceErrorBuildNoAdsToShowError = com.json.mediationsdk.utils.ErrorBuilder.buildNoAdsToShowError(com.json.mediationsdk.utils.IronSourceConstants.REWARDED_VIDEO_AD_UNIT);
                com.json.vk vkVar5 = this.e;
                zpVarA5.a(ironSourceErrorBuildNoAdsToShowError, vkVar5.a(vkVar5.d()));
                java.util.HashMap map = new java.util.HashMap();
                map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, 509);
                map.put("reason", "showRewardedVideo(): No ads to show");
                if (stringBuffer.length() != 0) {
                    map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, stringBuffer.toString());
                }
                b(com.json.mediationsdk.utils.IronSourceConstants.RV_CALLBACK_SHOW_FAILED, map);
                this.l.b();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.json.yf
    public void a(android.content.Context context, boolean z) {
        com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL, "LWSProgRvManager Should Track Network State: " + z, 0);
        try {
            this.r = z;
            if (z) {
                if (this.q == null) {
                    this.q = new com.json.environment.NetworkStateReceiver(context, this);
                }
                context.getApplicationContext().registerReceiver(this.q, new android.content.IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } else if (this.q != null) {
                context.getApplicationContext().unregisterReceiver(this.q);
            }
        } catch (java.lang.Exception e2) {
            com.json.l9.d().a(e2);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error("Got an error from receiver with message: " + e2.getMessage());
        }
    }

    @Override // com.json.uk
    public void a(com.json.mediationsdk.logger.IronSourceError ironSourceError, com.json.mediationsdk.r rVar) {
        com.json.j5 j5Var;
        if (this.m && (j5Var = this.f.get(rVar.c())) != null) {
            com.json.vk vkVar = this.e;
            vkVar.a(vkVar.d(), j5Var.a(this.v), j5Var.d());
        }
        a(rVar, "onRewardedVideoAdShowFailed error=" + ironSourceError.getErrorMessage());
        this.y = false;
        b(com.json.mediationsdk.utils.IronSourceConstants.RV_CALLBACK_SHOW_FAILED, com.json.kk.a(new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.valueOf(ironSourceError.getErrorCode())}, new java.lang.Object[]{"reason", ironSourceError.getErrorMessage()}}));
        com.json.zp.a().a(ironSourceError, this.e.a(rVar.u()));
        this.g.put(rVar.c(), com.ironsource.mediationsdk.h.a.ISAuctionPerformanceFailedToShow);
        if (this.z != com.ironsource.mediationsdk.q.e.RV_STATE_READY_TO_SHOW) {
            b(false);
        }
        this.l.b();
    }

    @Override // com.json.uk
    public void a(com.json.mediationsdk.r rVar) {
        a(rVar, "onRewardedVideoAdStarted");
        com.json.zp.a().c();
    }

    @Override // com.json.uk
    public void a(com.json.mediationsdk.r rVar, com.json.mediationsdk.model.Placement placement) {
        a(rVar, "onRewardedVideoAdRewarded");
        com.json.zp.a().b(placement, this.e.a(rVar.u()));
    }

    @Override // com.json.p4
    public void a(java.util.List<com.json.j5> list, java.lang.String str, com.json.j5 j5Var, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, int i, long j, int i2, java.lang.String str2) {
        d("makeAuction(): success");
        this.h = j5Var;
        this.p = i;
        this.k = jSONObject;
        this.o = "";
        if (!android.text.TextUtils.isEmpty(str2)) {
            a(88002, com.json.kk.a(new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.valueOf(i2)}, new java.lang.Object[]{"reason", str2}}));
        }
        com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO;
        a(jSONObject2, ad_unit);
        if (this.b.a(ad_unit)) {
            a(com.json.mediationsdk.utils.IronSourceConstants.RV_AD_UNIT_CAPPED, com.json.kk.a(new java.lang.Object[][]{new java.lang.Object[]{"auctionId", str}}));
            h();
        } else {
            a(list, str, this.k);
            a(com.json.mediationsdk.utils.IronSourceConstants.RV_AUCTION_SUCCESS, com.json.kk.a(new java.lang.Object[][]{new java.lang.Object[]{"duration", java.lang.Long.valueOf(j)}}));
            i();
        }
    }

    @Override // com.json.zn
    public void a(boolean z) {
        if (this.r) {
            com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL, "Network Availability Changed To: " + z, 0);
            if (c(z)) {
                b(z);
            }
        }
    }

    @Override // com.json.zq
    public void b() {
        d("onLoadTriggered: RV load was triggered in " + this.z + " state");
        a(0L);
    }

    @Override // com.json.uk
    public void b(com.json.mediationsdk.r rVar) {
        a(rVar, "onRewardedVideoAdClosed, mediation state: " + this.z.name());
        com.json.zp.a().b(this.e.a(rVar.u()));
        this.y = false;
        boolean z = this.z == com.ironsource.mediationsdk.q.e.RV_STATE_READY_TO_SHOW;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (z) {
            for (com.json.mediationsdk.r rVar2 : this.e.c()) {
                if (rVar2.y()) {
                    sb.append(rVar2.c() + ";");
                }
            }
        }
        java.lang.Object[][] objArr = new java.lang.Object[1][];
        java.lang.Object[] objArr2 = new java.lang.Object[2];
        objArr2[0] = com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1;
        objArr2[1] = "otherRVAvailable = " + (sb.length() > 0 ? "true|" + ((java.lang.Object) sb) : "false");
        objArr[0] = objArr2;
        rVar.b(1203, objArr);
        if (rVar.equals(this.e.f())) {
            this.e.a((com.json.mediationsdk.r) null);
            if (this.z != com.ironsource.mediationsdk.q.e.RV_STATE_READY_TO_SHOW) {
                b(false);
            }
        }
    }

    @Override // com.json.uk
    public void b(com.json.mediationsdk.r rVar, com.json.mediationsdk.model.Placement placement) {
        a(rVar, "onRewardedVideoAdClicked");
        com.json.zp.a().a(placement, this.e.a(rVar.u()));
    }

    /* JADX WARN: Code duplicated, block: B:70:0x00da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x005a A[SYNTHETIC] */
    @Override // com.json.uk
    public void c(com.json.mediationsdk.r rVar) {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = new java.util.concurrent.CopyOnWriteArrayList();
        synchronized (this.C) {
            a(rVar, "onLoadError mState=" + this.z);
            if (rVar.u() == this.e.d() && this.z != com.ironsource.mediationsdk.q.e.RV_STATE_AUCTION_IN_PROGRESS) {
                this.g.put(rVar.c(), com.ironsource.mediationsdk.h.a.ISAuctionPerformanceFailedToLoad);
                com.ironsource.mediationsdk.q.e eVar = this.z;
                if (eVar == com.ironsource.mediationsdk.q.e.RV_STATE_LOADING_SMASHES || eVar == com.ironsource.mediationsdk.q.e.RV_STATE_READY_TO_SHOW) {
                    boolean z = false;
                    boolean z2 = false;
                    for (com.json.mediationsdk.r rVar2 : this.e.c()) {
                        if (rVar2.h()) {
                            if (this.x && rVar2.p()) {
                                if (z || z2) {
                                    java.lang.String str = "Advanced Loading: Won't start loading bidder " + rVar2.c() + " as " + (z ? "a non bidder is being loaded" : "a non bidder was already loaded successfully");
                                    d(str);
                                    com.json.mediationsdk.utils.IronSourceUtils.sendAutomationLog(str);
                                    break;
                                }
                                java.lang.String str2 = "Advanced Loading: Starting to load bidder " + rVar2.c() + ". No other instances will be loaded at the same time.";
                                d(str2);
                                com.json.mediationsdk.utils.IronSourceUtils.sendAutomationLog(str2);
                                if (this.f.get(rVar2.c()) != null) {
                                    copyOnWriteArrayList.add(rVar2);
                                    if (this.x) {
                                        break;
                                    } else {
                                        break;
                                    }
                                }
                                continue;
                            } else if (this.f.get(rVar2.c()) != null) {
                                copyOnWriteArrayList.add(rVar2);
                                if (this.x || !rVar.p() || rVar2.p() || copyOnWriteArrayList.size() >= this.w) {
                                    break;
                                } else {
                                    z = true;
                                }
                            } else {
                                continue;
                            }
                        } else if (rVar2.z()) {
                            z = true;
                        } else if (rVar2.A()) {
                            z2 = true;
                        }
                    }
                    if (copyOnWriteArrayList.size() == 0 && !z2 && !z) {
                        d("onLoadError(): No other available smashes");
                        if (!this.y) {
                            b(false);
                        }
                        a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, com.json.kk.a(new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, 509}, new java.lang.Object[]{"reason", "Mediation No fill"}}));
                        a(com.ironsource.mediationsdk.q.e.RV_STATE_NOT_LOADED);
                        this.l.a();
                    }
                    java.util.Iterator it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        g((com.json.mediationsdk.r) it.next());
                    }
                    return;
                }
                return;
            }
            d("onLoadError was invoked with auctionId:" + rVar.u() + " and the current id is " + this.e.d());
            rVar.a(com.json.mediationsdk.utils.IronSourceConstants.RV_MANAGER_UNEXPECTED_STATE, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, 4}, new java.lang.Object[]{"reason", "loadError wrong auction ID " + this.z}});
        }
    }

    @Override // com.json.uk
    public void d(com.json.mediationsdk.r rVar) {
        this.e.a(rVar);
        this.u++;
        a(rVar, "onRewardedVideoAdOpened");
        if (this.m) {
            com.json.j5 j5Var = this.f.get(rVar.c());
            if (j5Var != null) {
                com.json.vk vkVar = this.e;
                vkVar.a(vkVar.d(), j5Var.a(this.v), j5Var.d());
                this.j.a(j5Var, rVar.g(), this.h, this.v);
                this.g.put(rVar.c(), com.ironsource.mediationsdk.h.a.ISAuctionPerformanceShowedSuccessfully);
                a(j5Var, this.v);
            } else {
                java.lang.String strC = rVar.c();
                c("onRewardedVideoAdOpened showing instance " + strC + " missing from waterfall");
                a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR, com.json.kk.a(new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, 1011}, new java.lang.Object[]{"reason", "Showing missing " + this.z}, new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, strC}}));
            }
        }
        com.json.zp.a().c(this.e.a(rVar.u()));
        b(false);
        this.l.c();
    }

    @Override // com.json.yf
    public boolean d() {
        if ((!this.r || com.json.mediationsdk.utils.IronSourceUtils.isNetworkConnected(com.json.environment.ContextProvider.getInstance().getApplicationContext())) && this.z == com.ironsource.mediationsdk.q.e.RV_STATE_READY_TO_SHOW && !this.y) {
            java.util.Iterator<com.json.mediationsdk.r> it = this.e.c().iterator();
            while (it.hasNext()) {
                if (it.next().A()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.json.uk
    public void e(com.json.mediationsdk.r rVar) {
        synchronized (this.C) {
            a(rVar, "onLoadSuccess mState=" + this.z);
            if (rVar.u() == this.e.d() && this.z != com.ironsource.mediationsdk.q.e.RV_STATE_AUCTION_IN_PROGRESS) {
                this.g.put(rVar.c(), com.ironsource.mediationsdk.h.a.ISAuctionPerformanceLoadedSuccessfully);
                com.ironsource.mediationsdk.q.e eVar = this.z;
                com.ironsource.mediationsdk.q.e eVar2 = com.ironsource.mediationsdk.q.e.RV_STATE_LOADING_SMASHES;
                if (eVar == eVar2) {
                    a(com.ironsource.mediationsdk.q.e.RV_STATE_READY_TO_SHOW);
                    a(1003, com.json.kk.a(new java.lang.Object[][]{new java.lang.Object[]{"duration", java.lang.Long.valueOf(new java.util.Date().getTime() - this.n)}}));
                    this.D.a(0L);
                    if (this.m) {
                        com.json.j5 j5Var = this.f.get(rVar.c());
                        if (j5Var != null) {
                            com.json.vk vkVar = this.e;
                            vkVar.a(vkVar.d(), j5Var.a(""), j5Var.d());
                            this.j.a(j5Var, rVar.g(), this.h);
                            this.j.a(this.e.c(), this.f, rVar.g(), this.h, j5Var);
                        } else {
                            java.lang.String strC = rVar.c();
                            c("onLoadSuccess winner instance " + strC + " missing from waterfall. auctionId: " + rVar.u() + " and the current id is " + this.e.d());
                            a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR, com.json.kk.a(new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, 1010}, new java.lang.Object[]{"reason", "Loaded missing " + eVar2}, new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, strC}}));
                        }
                    }
                    b(true);
                }
                return;
            }
            d("onLoadSuccess was invoked with auctionId: " + rVar.u() + " and the current id is " + this.e.d());
            rVar.a(com.json.mediationsdk.utils.IronSourceConstants.RV_MANAGER_UNEXPECTED_STATE, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, 2}, new java.lang.Object[]{"reason", "onLoadSuccess wrong auction ID " + this.z}});
        }
    }

    @Override // com.json.uk
    public void f(com.json.mediationsdk.r rVar) {
        a(rVar, "onRewardedVideoAdEnded");
        com.json.zp.a().b();
    }
}

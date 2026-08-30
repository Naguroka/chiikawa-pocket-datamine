package com.json.mediationsdk;

/* JADX INFO: loaded from: classes5.dex */
public class p implements com.json.uj, com.json.io, com.json.na, com.ironsource.na.b, com.ironsource.na.c, com.ironsource.na.a {
    private static boolean t0 = false;
    private java.util.Set<com.ironsource.mediationsdk.IronSource.AD_UNIT> A;
    private boolean B;
    private com.json.mediationsdk.IronSourceSegment C;
    private final java.lang.String D;
    private int E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private java.lang.Boolean M;
    private com.json.mediationsdk.IronSourceBannerLayout N;
    private java.lang.String O;
    private java.lang.Boolean P;
    private com.json.yf Q;
    private com.json.mediationsdk.w R;
    private com.json.cj S;
    private com.json.rq T;
    private com.json.d6 U;
    private com.json.mediationsdk.sdk.InitializationListener V;
    private com.json.ao W;
    private java.util.concurrent.atomic.AtomicBoolean X;
    private boolean Y;
    private boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f2999a;
    private boolean a0;
    private final java.lang.String b;
    private boolean b0;
    private final com.json.Cif c;
    private boolean c0;
    private final com.json.Cif.a d;
    private int d0;
    private final com.json.wf e;
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.demandOnly.h.d> e0;
    private final com.json.xe f;
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.demandOnly.h.b> f0;
    private final com.ironsource.sh.a g;
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.demandOnly.h.d> g0;
    private com.json.mediationsdk.logger.IronSourceLoggerManager h;
    private com.json.mediationsdk.demandOnly.f h0;
    private com.json.ul i;
    private com.json.mediationsdk.demandOnly.k i0;
    private com.json.mediationsdk.logger.b j;
    private com.json.mediationsdk.demandOnly.c j0;
    private java.util.concurrent.atomic.AtomicBoolean k;
    private com.json.lc k0;
    private final java.lang.Object l;
    private com.json.vj l0;
    private com.json.hs m;
    private com.json.he m0;
    private java.lang.String n;
    private boolean n0;
    private java.lang.String o;
    private com.json.mediationsdk.adquality.AdQualityBridge o0;
    private java.lang.String p;
    private final java.util.concurrent.atomic.AtomicBoolean p0;
    private java.lang.String q;
    com.json.mediationsdk.events.ISErrorListener q0;
    private java.util.Map<java.lang.String, java.lang.String> r;
    com.json.hg<com.json.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener> r0;
    private java.lang.String s;
    com.json.hg<com.json.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener> s0;
    private java.util.concurrent.atomic.AtomicBoolean t;
    private boolean u;
    private java.util.List<com.ironsource.mediationsdk.IronSource.AD_UNIT> v;
    private java.lang.String w;
    private android.content.Context x;
    private java.lang.Boolean y;
    private java.util.Set<com.ironsource.mediationsdk.IronSource.AD_UNIT> z;

    class a implements com.json.mediationsdk.events.ISErrorListener {
        a() {
        }

        @Override // com.json.mediationsdk.events.ISErrorListener
        public void onError(java.lang.Throwable th) {
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(th.getMessage());
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3001a;
        static final /* synthetic */ int[] b;
        static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[com.ironsource.kp.b.values().length];
            c = iArr;
            try {
                iArr[com.ironsource.kp.b.CAPPED_PER_DELIVERY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                c[com.ironsource.kp.b.CAPPED_PER_COUNT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                c[com.ironsource.kp.b.CAPPED_PER_PACE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                c[com.ironsource.kp.b.NOT_CAPPED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[com.ironsource.mediationsdk.s.d.values().length];
            b = iArr2;
            try {
                iArr2[com.ironsource.mediationsdk.s.d.INIT_FAILED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                b[com.ironsource.mediationsdk.s.d.INIT_IN_PROGRESS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[com.ironsource.mediationsdk.IronSource.AD_UNIT.values().length];
            f3001a = iArr3;
            try {
                iArr3[com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                f3001a[com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                f3001a[com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                f3001a[com.ironsource.mediationsdk.IronSource.AD_UNIT.NATIVE_AD.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
        }
    }

    public interface c {
        void a(java.lang.String str);
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static volatile com.json.mediationsdk.p f3002a = new com.json.mediationsdk.p(null);

        private d() {
        }
    }

    private p() {
        this(com.json.im.S().f(), com.json.im.M().b(), com.json.im.S().B(), com.json.im.S().v(), com.json.im.M().q());
    }

    p(com.json.Cif cif, com.json.Cif.a aVar, com.json.wf wfVar, com.json.xe xeVar, com.ironsource.sh.a aVar2) {
        this.f2999a = getClass().getName();
        this.b = "!SDK-VERSION-STRING!:com.ironsource:mediationsdk:\u200b8.6.1";
        this.l = new java.lang.Object();
        this.m = null;
        this.n = null;
        this.o = "";
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.u = false;
        this.y = null;
        this.B = true;
        this.D = "sessionDepth";
        this.P = null;
        this.n0 = false;
        this.c = cif;
        this.d = aVar;
        this.e = wfVar;
        this.f = xeVar;
        this.g = aVar2;
        w();
        this.k = new java.util.concurrent.atomic.AtomicBoolean();
        this.z = new java.util.HashSet();
        this.A = new java.util.HashSet();
        this.G = false;
        this.F = false;
        this.H = false;
        this.t = new java.util.concurrent.atomic.AtomicBoolean(true);
        this.X = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.p0 = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.E = 0;
        this.I = false;
        this.J = false;
        this.K = false;
        this.L = false;
        this.w = com.json.mediationsdk.utils.IronSourceUtils.getSessionId();
        this.M = java.lang.Boolean.FALSE;
        this.b0 = false;
        this.O = null;
        this.Q = null;
        this.V = null;
        this.W = null;
        this.R = null;
        this.Y = false;
        this.e0 = new java.util.concurrent.ConcurrentHashMap<>();
        this.g0 = new java.util.concurrent.ConcurrentHashMap<>();
        this.f0 = new java.util.concurrent.ConcurrentHashMap<>();
        this.h0 = null;
        this.i0 = null;
        this.j0 = null;
        this.d0 = 1;
        this.k0 = new com.json.lc();
        com.json.vj vjVar = new com.json.vj();
        this.l0 = vjVar;
        this.m0 = new com.json.he(vjVar);
        this.q0 = new com.ironsource.mediationsdk.p.a();
        this.o0 = null;
        this.r0 = new com.ironsource.hg.a();
        this.s0 = new com.ironsource.hg.b();
    }

    /* synthetic */ p(com.ironsource.mediationsdk.p.a aVar) {
        this();
    }

    private boolean A() {
        com.json.hs hsVar = this.m;
        return (hsVar == null || hsVar.j() == null || this.m.j().a() == null || this.m.j().a().size() <= 0) ? false : true;
    }

    private synchronized boolean C() {
        return this.u;
    }

    private boolean D() {
        com.json.hs hsVar = this.m;
        return (hsVar == null || hsVar.c() == null || this.m.c().getInterstitialConfigurations() == null) ? false : true;
    }

    private boolean E() {
        return D() && G();
    }

    private boolean G() {
        com.json.hs hsVar = this.m;
        return (hsVar == null || hsVar.j() == null || this.m.j().b() == null || this.m.j().b().size() <= 0) ? false : true;
    }

    private boolean H() {
        com.json.hs hsVar = this.m;
        return (hsVar == null || hsVar.c() == null || this.m.c().getNativeAdConfigurations() == null) ? false : true;
    }

    private boolean I() {
        return H() && J();
    }

    private boolean J() {
        com.json.hs hsVar = this.m;
        return (hsVar == null || hsVar.j() == null || this.m.j().c() == null || this.m.j().c().isEmpty()) ? false : true;
    }

    private boolean L() {
        com.json.hs hsVar = this.m;
        return (hsVar == null || hsVar.c() == null || this.m.c().getRewardedVideoConfigurations() == null) ? false : true;
    }

    private boolean M() {
        return L() && N();
    }

    private boolean N() {
        com.json.hs hsVar = this.m;
        return (hsVar == null || hsVar.j() == null || this.m.j().d() == null || this.m.j().d().size() <= 0) ? false : true;
    }

    private void T() {
        if (this.V == null || !this.X.compareAndSet(false, true)) {
            return;
        }
        com.json.mediationsdk.logger.IronLog.CALLBACK.verbose("onInitializationCompleted()");
        com.json.wq.i().a(new com.json.wb(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_INIT_COMPLETED, com.json.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(false)));
        this.V.onInitializationComplete();
    }

    private void V() {
        java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<java.lang.String>> concurrentHashMapC = com.json.lk.b().c();
        if (concurrentHashMapC.containsKey(com.json.mediationsdk.metadata.a.c)) {
            java.lang.String str = concurrentHashMapC.get(com.json.mediationsdk.metadata.a.c).get(0);
            if (android.text.TextUtils.isEmpty(str)) {
                return;
            }
            com.json.ua.f3466a.b(!com.json.mediationsdk.metadata.MetaDataUtils.getMetaDataBooleanValue(str));
        }
    }

    private boolean W() {
        return this.o0 == null && this.p0.get() && this.m.c().getAdQualityConfigurations().a() && com.json.mediationsdk.adquality.AdQualityBridge.adQualityAvailable();
    }

    private void X() {
        if (this.H) {
            Z();
            return;
        }
        boolean zH = this.m.c().getBannerConfigurations().d().h();
        this.c0 = zH;
        if (zH) {
            Y();
        } else {
            f0();
        }
    }

    private void Y() {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose();
        java.util.List<com.json.mediationsdk.model.NetworkSettings> listA = a(this.m.j().a());
        if (listA.size() > 0) {
            this.U = new com.json.d6(listA, this.m.c().getBannerConfigurations(), com.json.mediationsdk.utils.IronSourceUtils.getUserIdForNetworks(), com.json.lk.b(), this.C);
            v();
        } else {
            org.json.JSONObject mediationAdditionalData = com.json.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(false, true, 1);
            a(mediationAdditionalData, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_BN_INIT_FAILED, mediationAdditionalData);
            a(com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER, false);
        }
    }

    private void Z() {
        this.h.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL, "Banner started in demand only mode", 0);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < this.m.j().a().size(); i++) {
            java.lang.String str = this.m.j().a().get(i);
            if (!android.text.TextUtils.isEmpty(str)) {
                arrayList.add(this.m.k().b(str));
            }
        }
        if (arrayList.isEmpty()) {
            org.json.JSONObject mediationAdditionalData = com.json.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(false, false, 1);
            a(mediationAdditionalData, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_BN_INIT_FAILED, mediationAdditionalData);
            a(com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER, false);
            return;
        }
        synchronized (this.f0) {
            com.json.r6 r6VarC = this.m.c().getBannerConfigurations();
            com.ironsource.oa.a aVar = new com.ironsource.oa.a("Mediation");
            if (r6VarC.k()) {
                aVar.a("isOneFlow", 1);
            }
            this.j0 = new com.json.mediationsdk.demandOnly.c(arrayList, r6VarC, n(), o(), new com.ironsource.oa.b(com.json.jj.i(), aVar));
        }
        for (com.ironsource.mediationsdk.demandOnly.h.b bVar : this.f0.values()) {
            this.j0.a(bVar.getBanner(), bVar.getInstanceId());
        }
        this.f0.clear();
    }

    private int a(com.json.uq uqVar) {
        return !this.a0 && !this.Y && uqVar.k().e() ? 2 : 1;
    }

    private com.json.hs a(android.content.Context context, java.lang.String str, com.ironsource.mediationsdk.p.c cVar) {
        com.json.hs hsVar = null;
        if (!com.json.mediationsdk.utils.IronSourceUtils.isNetworkConnected(context)) {
            return null;
        }
        try {
            java.lang.String strB = b(context);
            if (android.text.TextUtils.isEmpty(strB)) {
                strB = this.c.K(context);
                com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL, "using custom identifier", 1);
            }
            java.lang.String str2 = strB;
            com.json.mediationsdk.IronSourceSegment ironSourceSegment = this.C;
            java.lang.String strSendPostRequest = com.json.mediationsdk.server.HttpFunctions.sendPostRequest(com.json.mediationsdk.server.ServerURL.buildInitURL(context, n(), str, str2, q(), this.Y, ironSourceSegment != null ? ironSourceSegment.getSegmentData() : null, B()), com.json.li.a().toString(), cVar);
            if (strSendPostRequest == null) {
                com.json.mediationsdk.logger.IronLog.INTERNAL.warning("serverResponseString is null");
                return null;
            }
            if (com.json.mediationsdk.utils.IronSourceUtils.isEncryptedResponse()) {
                com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
                ironLog.verbose("encrypt");
                org.json.JSONObject jSONObject = new org.json.JSONObject(strSendPostRequest);
                java.lang.String strOptString = jSONObject.optString(com.json.hs.n, null);
                if (android.text.TextUtils.isEmpty(strOptString)) {
                    ironLog.warning("encryptedResponse is empty - return null");
                    return null;
                }
                strSendPostRequest = a(strOptString, java.lang.Boolean.valueOf(jSONObject.optBoolean("compression", false)));
                if (android.text.TextUtils.isEmpty(strSendPostRequest)) {
                    ironLog.warning("encoded response invalid - return null");
                    U();
                    return null;
                }
            }
            com.json.hs hsVar2 = new com.json.hs(context, n(), str, strSendPostRequest);
            try {
                hsVar2.a(com.ironsource.hs.a.SERVER);
                if (hsVar2.p()) {
                    return hsVar2;
                }
                com.json.mediationsdk.logger.IronLog.INTERNAL.warning("response invalid - return null");
                return null;
            } catch (java.lang.Exception e) {
                e = e;
                hsVar = hsVar2;
                com.json.l9.d().a(e);
                com.json.mediationsdk.logger.IronLog.INTERNAL.warning("exception = " + e);
                return hsVar;
            }
        } catch (java.lang.Exception e2) {
            e = e2;
        }
    }

    private com.json.mediationsdk.demandOnly.f a(java.util.List<com.json.mediationsdk.model.NetworkSettings> list) {
        com.json.hj hjVarD = this.m.c().getInterstitialConfigurations();
        com.ironsource.oa.a aVar = new com.ironsource.oa.a("Mediation");
        if (hjVarD.j()) {
            aVar.a("isOneFlow", 1);
        }
        return new com.json.mediationsdk.demandOnly.f(list, hjVarD, com.json.mediationsdk.c.b(), this.r0, n(), o(), new com.ironsource.oa.b(com.json.jj.i(), aVar));
    }

    private com.json.mediationsdk.logger.IronSourceError a(com.ironsource.mediationsdk.s.d dVar) {
        if (!this.K) {
            return new com.json.mediationsdk.logger.IronSourceError(510, "ironSource SDK was not initialized");
        }
        if (!this.H) {
            return new com.json.mediationsdk.logger.IronSourceError(510, "ironSource SDK was not initialized using Demand Only mode");
        }
        if (dVar == com.ironsource.mediationsdk.s.d.INIT_FAILED) {
            return new com.json.mediationsdk.logger.IronSourceError(510, "ironSource initialization failed");
        }
        if (dVar == com.ironsource.mediationsdk.s.d.INIT_IN_PROGRESS && com.json.mediationsdk.s.c().d()) {
            return new com.json.mediationsdk.logger.IronSourceError(510, "ironSource initialization in progress");
        }
        return null;
    }

    private java.lang.String a(java.lang.String str, java.lang.Boolean bool) {
        return bool.booleanValue() ? com.json.mediationsdk.utils.IronSourceAES.decryptAndDecompress(com.json.jb.b().c(), str) : com.json.mediationsdk.utils.IronSourceAES.decode(com.json.jb.b().c(), str);
    }

    private java.util.List<com.json.mediationsdk.model.NetworkSettings> a(java.util.ArrayList<java.lang.String> arrayList) {
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            java.lang.String str = arrayList.get(i);
            if (!android.text.TextUtils.isEmpty(str)) {
                arrayList2.add(this.m.k().b(str));
            }
        }
        return arrayList2;
    }

    private void a(int i, org.json.JSONObject jSONObject) {
        com.json.jj.i().a(new com.json.wb(i, jSONObject));
    }

    private synchronized void a(com.json.ao aoVar) {
        this.W = aoVar;
    }

    private void a(com.json.e4 e4Var, android.content.Context context, com.json.hs hsVar) {
        com.json.jj.i().a(e4Var.c(), context);
        com.json.jj.i().b(e4Var.d(), context);
        com.json.jj.i().b(e4Var.f());
        com.json.jj.i().a(e4Var.e());
        com.json.jj.i().c(e4Var.a());
        com.json.jj.i().c(e4Var.i(), context);
        com.json.jj.i().a(e4Var.h(), context);
        com.json.jj.i().b(e4Var.j(), context);
        com.json.jj.i().d(e4Var.g(), context);
        com.json.jj.i().a(hsVar.c().getApplicationConfigurations().i());
        com.json.jj.i().a(e4Var.k());
        com.json.jj.i().d(e4Var.b());
    }

    private void a(com.json.h4 h4Var) {
        com.json.ua uaVar = com.json.ua.f3466a;
        uaVar.c(h4Var.getShouldUseAppSet());
        uaVar.a(h4Var.getShouldReuseAdvId());
        uaVar.a(h4Var.getUserAgentExpirationThresholdInHours());
        this.f.a(h4Var);
    }

    private void a(com.json.hs hsVar) {
        this.j.setDebugLevel(hsVar.c().getApplicationConfigurations().g().b());
        this.h.setLoggerDebugLevel("console", hsVar.c().getApplicationConfigurations().g().a());
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:34:? A[RETURN, SYNTHETIC] */
    private void a(com.json.hs hsVar, android.content.Context context) {
        com.json.e4 e4VarG;
        com.json.ep epVar;
        boolean zL = L() ? hsVar.c().getRewardedVideoConfigurations().m().l() : false;
        boolean zL2 = D() ? hsVar.c().getInterstitialConfigurations().i().l() : false;
        boolean zL3 = y() ? hsVar.c().getBannerConfigurations().g().l() : false;
        boolean zL4 = H() ? hsVar.c().getNativeAdConfigurations().getEventsConfigurations().l() : false;
        com.json.fp fpVarH = hsVar.c().getApplicationConfigurations().h();
        boolean zI = fpVarH.i();
        if (zL) {
            b(hsVar.c().getRewardedVideoConfigurations().m(), context, hsVar);
        } else {
            com.json.wq.i().b(false);
        }
        if (zL2) {
            e4VarG = hsVar.c().getInterstitialConfigurations().i();
        } else {
            if (!zL3) {
                if (zL4) {
                    e4VarG = hsVar.c().getNativeAdConfigurations().getEventsConfigurations();
                } else {
                    com.json.jj.i().b(false);
                }
                epVar = com.json.ep.P;
                epVar.b(zI);
                if (zI) {
                    epVar.b(fpVarH.j(), context);
                    epVar.c(fpVarH.l(), context);
                    epVar.a(fpVarH.k(), context);
                    epVar.a(fpVarH.g());
                    epVar.d(fpVarH.h());
                }
            }
            e4VarG = hsVar.c().getBannerConfigurations().g();
        }
        a(e4VarG, context, hsVar);
        epVar = com.json.ep.P;
        epVar.b(zI);
        if (zI) {
            epVar.b(fpVarH.j(), context);
            epVar.c(fpVarH.l(), context);
            epVar.a(fpVarH.k(), context);
            epVar.a(fpVarH.g());
            epVar.d(fpVarH.h());
        }
    }

    private void a(com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit) {
        java.lang.String str = ad_unit + " ad unit has already been initialized";
        this.h.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, str, 3);
        com.json.mediationsdk.utils.IronSourceUtils.sendAutomationLog(str);
    }

    private void a(com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit, boolean z) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        int i = com.ironsource.mediationsdk.p.b.f3001a[ad_unit.ordinal()];
        if (i == 1) {
            if (!this.F) {
                if (this.Y) {
                    if (this.Z) {
                        this.Z = false;
                        com.json.mediationsdk.n.a().b(com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO, com.json.mediationsdk.utils.ErrorBuilder.buildInitFailedError("init() had failed", com.json.mediationsdk.utils.IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                        return;
                    }
                    return;
                }
                if (z || L() || this.A.contains(ad_unit)) {
                    com.json.zp.a().a(false, (com.json.mediationsdk.adunit.adapter.utility.AdInfo) null);
                    return;
                }
                return;
            }
            java.util.Iterator<com.ironsource.mediationsdk.demandOnly.h.d> it = this.g0.values().iterator();
            while (it.hasNext()) {
                java.lang.String strC = it.next().getInstanceId();
                this.s0.a(strC).onRewardedVideoAdLoadFailed(strC, com.json.mediationsdk.utils.ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", com.json.mediationsdk.utils.IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            }
            concurrentHashMap = this.g0;
        } else if (i != 2) {
            if (i != 3) {
                return;
            }
            if (!this.H) {
                if (this.M.booleanValue()) {
                    this.M = java.lang.Boolean.FALSE;
                    com.json.mediationsdk.n.a().b(com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER, new com.json.mediationsdk.logger.IronSourceError(602, "init() had failed"));
                    this.N = null;
                    this.O = null;
                    return;
                }
                return;
            }
            for (com.ironsource.mediationsdk.demandOnly.h.b bVar : this.f0.values()) {
                com.json.mediationsdk.demandOnly.ISDemandOnlyBannerLayout iSDemandOnlyBannerLayoutG = bVar.getBanner();
                if (iSDemandOnlyBannerLayoutG != null) {
                    iSDemandOnlyBannerLayoutG.getListener().a(bVar.getInstanceId(), com.json.mediationsdk.utils.ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", "Banner"));
                }
            }
            concurrentHashMap = this.f0;
        } else {
            if (!this.G) {
                if (this.b0) {
                    this.b0 = false;
                    com.json.mediationsdk.n.a().b(com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL, com.json.mediationsdk.utils.ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
                    return;
                }
                return;
            }
            java.util.Iterator<com.ironsource.mediationsdk.demandOnly.h.d> it2 = this.e0.values().iterator();
            while (it2.hasNext()) {
                java.lang.String strC2 = it2.next().getInstanceId();
                this.r0.a(strC2).onInterstitialAdLoadFailed(strC2, com.json.mediationsdk.utils.ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", "Interstitial"));
            }
            concurrentHashMap = this.e0;
        }
        concurrentHashMap.clear();
    }

    private synchronized void a(com.ironsource.mediationsdk.demandOnly.h.d dVar, com.json.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        java.lang.String strC = dVar.getInstanceId();
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.API;
        ironLog.info("instanceId=" + strC);
        try {
            if (!this.J) {
                ironLog.error("initISDemandOnly() must be called before loadISDemandOnlyInterstitial()");
                iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(strC, new com.json.mediationsdk.logger.IronSourceError(510, "initISDemandOnly() must be called before loadISDemandOnlyInterstitial()"));
                return;
            }
            if (!this.G) {
                ironLog.error("Interstitial was initialized in mediation mode. Use loadInterstitial instead");
                iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(strC, new com.json.mediationsdk.logger.IronSourceError(510, "Interstitial was initialized in mediation mode. Use loadInterstitial instead"));
                return;
            }
            com.ironsource.mediationsdk.s.d dVarA = com.json.mediationsdk.s.c().a();
            if (dVarA == com.ironsource.mediationsdk.s.d.INIT_FAILED) {
                ironLog.error("init() had failed");
                iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(strC, com.json.mediationsdk.utils.ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
                return;
            }
            com.json.mediationsdk.logger.IronSourceError ironSourceErrorA = dVar.a();
            if (ironSourceErrorA != null) {
                if (ironSourceErrorA.getErrorCode() == 1060) {
                    b(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_DO_CALLED_IS_LOAD_WITH_NO_ACTIVITY, com.json.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(true, !android.text.TextUtils.isEmpty(dVar.getAdMarkup()), 1));
                }
                ironLog.error(ironSourceErrorA.toString());
                iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(strC, ironSourceErrorA);
                return;
            }
            e(dVar.getActivity());
            if (dVarA == com.ironsource.mediationsdk.s.d.INIT_IN_PROGRESS) {
                if (com.json.mediationsdk.s.c().d()) {
                    ironLog.error("init() had failed");
                    iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(strC, com.json.mediationsdk.utils.ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
                } else {
                    synchronized (this.e0) {
                        this.e0.put(dVar.getInstanceId(), dVar);
                    }
                    if (!android.text.TextUtils.isEmpty(dVar.getInstanceId())) {
                        a(83003, com.json.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(true, !android.text.TextUtils.isEmpty(dVar.getAdMarkup()), 1));
                    }
                }
                return;
            }
            if (!E()) {
                ironLog.error("No interstitial configurations found");
                iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(strC, com.json.mediationsdk.utils.ErrorBuilder.buildInitFailedError("the server response does not contain interstitial data", "Interstitial"));
                return;
            }
            synchronized (this.e0) {
                com.json.mediationsdk.demandOnly.f fVar = this.h0;
                if (fVar == null) {
                    this.e0.put(dVar.getInstanceId(), dVar);
                    if (!android.text.TextUtils.isEmpty(dVar.getAdMarkup())) {
                        a(83003, com.json.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(true, !android.text.TextUtils.isEmpty(dVar.getAdMarkup()), 1));
                    }
                    return;
                }
                fVar.a(dVar);
            }
            throw th;
        } catch (java.lang.Throwable th) {
            com.json.l9.d().a(th);
            com.json.mediationsdk.logger.IronLog.API.error(th.getMessage());
            iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(strC, new com.json.mediationsdk.logger.IronSourceError(510, th.getMessage()));
        }
    }

    private void a(java.lang.String str, com.json.o8 o8Var) {
        if (a(str, 1, 128)) {
            return;
        }
        o8Var.a(com.json.mediationsdk.utils.ErrorBuilder.buildInvalidKeyValueError(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_DYNAMIC_USER_ID, "dynamicUserId is invalid, should be between 1-128 chars in length."));
    }

    private void a(org.json.JSONObject jSONObject, java.lang.Object[][] objArr) {
        if (objArr != null) {
            try {
                for (java.lang.Object[] objArr2 : objArr) {
                    jSONObject.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (java.lang.Exception e) {
                com.json.l9.d().a(e);
                com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL, "IronSourceObject addToDictionary: " + android.util.Log.getStackTraceString(e), 3);
            }
        }
    }

    private void a(boolean z, java.lang.String str) {
        if (z) {
            org.json.JSONObject mediationAdditionalData = com.json.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(this.F, true, this.d0);
            if (str != null) {
                a(mediationAdditionalData, new java.lang.Object[][]{new java.lang.Object[]{"placement", str}});
            }
            b(com.json.mediationsdk.utils.IronSourceConstants.RV_API_IS_CAPPED_TRUE, mediationAdditionalData);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x005a  */
    /* JADX WARN: Code duplicated, block: B:16:0x005d  */
    private void a(boolean z, boolean z2, int i, org.json.JSONObject jSONObject, boolean z3) {
        java.lang.String str;
        java.lang.String str2;
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            if (!z2) {
                if (z) {
                    sb.append(java.lang.String.format(",cachedUserAgent=%s", java.lang.Boolean.valueOf(this.c.q())));
                    jSONObject.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, sb.toString());
                    jSONObject.put("sessionDepth", i);
                    if (z3) {
                        if (z2) {
                            str2 = "isMultipleAdObjects";
                        } else {
                            str2 = "isMultipleAdUnits";
                        }
                        jSONObject.put(str2, 1);
                    }
                } else {
                    sb.append(",");
                    str = com.json.mediationsdk.utils.IronSourceConstants.EVENTS_INIT_CONTEXT_FLOW;
                }
                com.json.wq.i().a(new com.json.wb(14, jSONObject));
            }
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(com.json.environment.ContextProvider.getInstance().getCurrentActiveActivity() != null);
            str = java.lang.String.format(",Activity=%s", objArr);
            sb.append(str);
            sb.append(java.lang.String.format(",cachedUserAgent=%s", java.lang.Boolean.valueOf(this.c.q())));
            jSONObject.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, sb.toString());
            jSONObject.put("sessionDepth", i);
            if (z3) {
                if (z2) {
                    str2 = "isMultipleAdObjects";
                } else {
                    str2 = "isMultipleAdUnits";
                }
                jSONObject.put(str2, 1);
            }
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
        com.json.wq.i().a(new com.json.wb(14, jSONObject));
    }

    private synchronized void a(boolean z, boolean z2, boolean z3, com.ironsource.mediationsdk.IronSource.AD_UNIT... ad_unitArr) {
        org.json.JSONObject mediationAdditionalData;
        int i = 0;
        for (com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit : ad_unitArr) {
            if (ad_unit.equals(com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL)) {
                this.J = true;
            } else if (ad_unit.equals(com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER)) {
                this.K = true;
            } else if (ad_unit.equals(com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO)) {
                this.I = true;
            } else if (ad_unit.equals(com.ironsource.mediationsdk.IronSource.AD_UNIT.NATIVE_AD)) {
                this.L = true;
            }
        }
        if (com.json.mediationsdk.s.c().a() == com.ironsource.mediationsdk.s.d.INIT_FAILED) {
            try {
                if (this.i != null) {
                    int length = ad_unitArr.length;
                    while (i < length) {
                        com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit2 = ad_unitArr[i];
                        if (!this.z.contains(ad_unit2)) {
                            a(ad_unit2, true);
                        }
                        i++;
                    }
                }
            } catch (java.lang.Exception e) {
                com.json.l9.d().a(e);
                com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            }
        }
        if (!C()) {
            mediationAdditionalData = com.json.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(z2);
            int length2 = ad_unitArr.length;
            while (i < length2) {
                com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit3 = ad_unitArr[i];
                if (this.z.contains(ad_unit3)) {
                    this.h.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, ad_unit3 + " ad unit has started initializing.", 3);
                } else {
                    this.z.add(ad_unit3);
                    this.A.add(ad_unit3);
                    try {
                        mediationAdditionalData.put(ad_unit3.toString(), true);
                    } catch (java.lang.Exception e2) {
                        com.json.l9.d().a(e2);
                        com.json.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
                    }
                }
                i++;
            }
            org.json.JSONObject jSONObject = mediationAdditionalData;
            int i2 = 1 + this.E;
            this.E = i2;
            a(z, z2, i2, jSONObject, z3);
        } else {
            if (this.v == null) {
                return;
            }
            try {
                new com.json.jm().a(this.m.c().getApplicationConfigurations().d().b(), B());
            } catch (java.lang.Exception e3) {
                com.json.l9.d().a(e3);
                com.json.mediationsdk.logger.IronLog.INTERNAL.error(e3.toString());
            }
            mediationAdditionalData = com.json.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(z2);
            for (com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit4 : ad_unitArr) {
                if (this.z.contains(ad_unit4)) {
                    a(ad_unit4);
                } else {
                    this.z.add(ad_unit4);
                    this.A.add(ad_unit4);
                    try {
                        mediationAdditionalData.put(ad_unit4.toString(), true);
                    } catch (java.lang.Exception e4) {
                        com.json.l9.d().a(e4);
                        com.json.mediationsdk.logger.IronLog.INTERNAL.error(e4.toString());
                    }
                    java.util.List<com.ironsource.mediationsdk.IronSource.AD_UNIT> list = this.v;
                    if (list == null || !list.contains(ad_unit4)) {
                        a(ad_unit4, false);
                    } else {
                        b(ad_unit4);
                    }
                }
            }
            org.json.JSONObject jSONObject2 = mediationAdditionalData;
            int i3 = 1 + this.E;
            this.E = i3;
            a(z, z2, i3, jSONObject2, z3);
        }
    }

    private boolean a(com.ironsource.mediationsdk.demandOnly.h.b bVar) {
        if (com.json.mediationsdk.s.c().a() != com.ironsource.mediationsdk.s.d.INIT_IN_PROGRESS) {
            return false;
        }
        synchronized (this.f0) {
            this.f0.put(bVar.getInstanceId(), bVar);
        }
        return true;
    }

    private boolean a(java.lang.String str, int i, int i2) {
        return str != null && str.length() >= i && str.length() <= i2;
    }

    private void a0() {
        this.h.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL, "Interstitial started in demand only mode", 0);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < this.m.j().b().size(); i++) {
            java.lang.String str = this.m.j().b().get(i);
            if (!android.text.TextUtils.isEmpty(str)) {
                arrayList.add(this.m.k().b(str));
            }
        }
        if (arrayList.isEmpty()) {
            org.json.JSONObject mediationAdditionalData = com.json.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(false, false, 1);
            a(mediationAdditionalData, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_IS_INIT_FAILED, mediationAdditionalData);
            a(com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL, false);
            return;
        }
        synchronized (this.e0) {
            this.h0 = a((java.util.List<com.json.mediationsdk.model.NetworkSettings>) arrayList);
        }
        java.util.Iterator<com.ironsource.mediationsdk.demandOnly.h.d> it = this.e0.values().iterator();
        while (it.hasNext()) {
            this.h0.a(it.next());
        }
        this.e0.clear();
    }

    private com.json.mediationsdk.demandOnly.k b(java.util.List<com.json.mediationsdk.model.NetworkSettings> list) {
        com.json.uq uqVarF = this.m.c().getRewardedVideoConfigurations();
        com.ironsource.oa.a aVar = new com.ironsource.oa.a("Mediation");
        if (uqVarF.d()) {
            aVar.a("isOneFlow", 1);
        }
        return new com.json.mediationsdk.demandOnly.k(list, uqVarF, com.json.mediationsdk.c.b(), this.s0, n(), o(), new com.ironsource.oa.b(com.json.wq.i(), aVar));
    }

    private void b(int i, org.json.JSONObject jSONObject) {
        com.json.wq.i().a(new com.json.wb(i, jSONObject));
    }

    private void b(com.json.e4 e4Var, android.content.Context context, com.json.hs hsVar) {
        com.json.wq.i().a(e4Var.c(), context);
        com.json.wq.i().b(e4Var.d(), context);
        com.json.wq.i().b(e4Var.f());
        com.json.wq.i().a(e4Var.e());
        com.json.wq.i().c(e4Var.a());
        com.json.wq.i().c(e4Var.i(), context);
        com.json.wq.i().a(e4Var.h(), context);
        com.json.wq.i().b(e4Var.j(), context);
        com.json.wq.i().d(e4Var.g(), context);
        com.json.wq.i().a(hsVar.c().getApplicationConfigurations().i());
        com.json.wq.i().a(e4Var.k());
        com.json.wq.i().d(e4Var.b());
    }

    private void b(com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit) {
        int i = com.ironsource.mediationsdk.p.b.f3001a[ad_unit.ordinal()];
        if (i == 1) {
            g0();
        } else if (i == 2) {
            c0();
        } else {
            if (i != 3) {
                return;
            }
            X();
        }
    }

    private boolean b(com.json.hs hsVar) {
        return hsVar != null && hsVar.o();
    }

    private boolean b(com.ironsource.mediationsdk.demandOnly.h.b bVar) {
        synchronized (this.f0) {
            if (this.j0 != null) {
                return false;
            }
            this.f0.put(bVar.getInstanceId(), bVar);
            return true;
        }
    }

    private boolean b(java.util.List<com.ironsource.mediationsdk.IronSource.AD_UNIT> list, boolean z, com.json.p8 p8Var) {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose();
        try {
            this.j.a(p8Var.getApplicationConfigurations().g().d());
            this.v = list;
            c(true);
            this.h.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, "onInitSuccess()", 1);
            com.json.mediationsdk.utils.IronSourceUtils.sendAutomationLog("init success");
            if (z) {
                org.json.JSONObject mediationAdditionalData = com.json.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(false);
                try {
                    mediationAdditionalData.put("revived", true);
                } catch (org.json.JSONException e) {
                    com.json.l9.d().a(e);
                    com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
                }
                com.json.wq.i().a(new com.json.wb(114, mediationAdditionalData));
            }
            int cmpId = p8Var.getApplicationConfigurations().e().getCmpId();
            if (cmpId >= 0) {
                com.json.w8 w8Var = new com.json.w8();
                w8Var.a(cmpId);
                w8Var.a(cmpId, this.m.k().d());
            }
            com.json.jj.i().h();
            com.json.wq.i().h();
            com.json.mediationsdk.c.b().b(n(), o());
            for (com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit : com.ironsource.mediationsdk.IronSource.AD_UNIT.values()) {
                if (this.z.contains(ad_unit)) {
                    if (list.contains(ad_unit)) {
                        b(ad_unit);
                    } else {
                        a(ad_unit, false);
                    }
                }
            }
            if (x() && W()) {
                com.json.mediationsdk.adquality.AdQualityBridge adQualityBridge = new com.json.mediationsdk.adquality.AdQualityBridge(com.json.environment.ContextProvider.getInstance().getApplicationContext(), n(), o(), new com.json.f1(), this.m.c().getApplicationConfigurations().g().a());
                this.o0 = adQualityBridge;
                com.json.mediationsdk.IronSourceSegment ironSourceSegment = this.C;
                if (ironSourceSegment != null) {
                    adQualityBridge.setSegment(ironSourceSegment);
                }
            }
            T();
            com.json.ao aoVarR = r();
            if (aoVarR != null) {
                aoVarR.a(this.m);
            }
            return true;
        } catch (java.lang.Exception e2) {
            com.json.l9.d().a(e2);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
            com.json.ao aoVarR2 = r();
            if (aoVarR2 != null) {
                aoVarR2.onInitFailed(new com.json.mediationsdk.logger.IronSourceError(com.json.mediationsdk.logger.IronSourceError.ERROR_LEGACY_INIT_POST_FAILED, "onInitSuccess() had failed"));
            }
            return false;
        }
    }

    private void b0() {
        this.h.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL, "Rewarded Video started in demand only mode", 0);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < this.m.j().d().size(); i++) {
            java.lang.String str = this.m.j().d().get(i);
            if (!android.text.TextUtils.isEmpty(str)) {
                arrayList.add(this.m.k().b(str));
            }
        }
        if (arrayList.isEmpty()) {
            a(com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO, false);
            return;
        }
        synchronized (this.g0) {
            this.i0 = b(arrayList);
        }
        if (com.json.environment.ContextProvider.getInstance().getCurrentActiveActivity() == null) {
            a(com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO, false);
            return;
        }
        java.util.Iterator<com.ironsource.mediationsdk.demandOnly.h.d> it = this.g0.values().iterator();
        while (it.hasNext()) {
            this.i0.a(it.next());
        }
        this.g0.clear();
    }

    private synchronized void c(boolean z) {
        this.u = z;
    }

    private void c0() {
        if (this.G) {
            a0();
        } else {
            d0();
        }
    }

    private void d(android.app.Activity activity, java.lang.String str) {
        try {
            com.json.mediationsdk.model.InterstitialPlacement interstitialPlacementM = m(str);
            if (interstitialPlacementM == null) {
                interstitialPlacementM = i();
            }
            if (interstitialPlacementM == null) {
                this.h.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL, "showProgrammaticInterstitial error: empty default placement in response", 3);
                com.json.ng.a().a(new com.json.mediationsdk.logger.IronSourceError(1020, "showProgrammaticInterstitial error: empty default placement in response"), (com.json.mediationsdk.adunit.adapter.utility.AdInfo) null);
                return;
            }
            if (activity != null) {
                e(activity);
            } else if (com.json.environment.ContextProvider.getInstance().getCurrentActiveActivity() == null) {
                this.h.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, "Activity must be provided in showInterstitial when initializing SDK with context", 3);
                com.json.ng.a().a(new com.json.mediationsdk.logger.IronSourceError(510, "Activity must be provided in showInterstitial when initializing SDK with context"), (com.json.mediationsdk.adunit.adapter.utility.AdInfo) null);
                return;
            }
            this.S.a(activity, new com.json.mediationsdk.model.Placement(interstitialPlacementM));
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            this.h.logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, "showProgrammaticInterstitial()", e);
        }
    }

    private void d(android.content.Context context) {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.k;
        if (atomicBoolean == null || !atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        com.json.ot.a().a(new com.json.ae(context));
        com.json.jj.i().a(context, this.C);
        com.json.wq.i().a(context, this.C);
        com.json.ep.P.a(context, this.C);
    }

    private void d0() {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose();
        java.util.List<com.json.mediationsdk.model.NetworkSettings> listA = a(this.m.j().b());
        if (listA.size() <= 0) {
            org.json.JSONObject mediationAdditionalData = com.json.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(false, true, 1);
            a(mediationAdditionalData, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_IS_INIT_FAILED, mediationAdditionalData);
            a(com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL, false);
            return;
        }
        com.json.cj cjVar = new com.json.cj(listA, this.m.c().getInterstitialConfigurations(), com.json.mediationsdk.utils.IronSourceUtils.getUserIdForNetworks(), com.json.lk.b(), this.C);
        this.S = cjVar;
        java.lang.Boolean bool = this.y;
        if (bool != null) {
            cjVar.a(this.x, bool.booleanValue());
        }
        if (this.b0) {
            this.b0 = false;
            this.S.A();
        }
    }

    private void e(android.app.Activity activity) {
        com.json.environment.ContextProvider.getInstance().updateActivity(activity);
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("activity is updated to: " + activity.hashCode());
    }

    private void e(android.app.Activity activity, java.lang.String str) {
        com.json.mediationsdk.model.Placement placementP;
        try {
            placementP = p(str);
            if (placementP == null) {
                try {
                    placementP = j();
                } catch (java.lang.Exception e) {
                    e = e;
                    com.json.l9.d().a(e);
                    this.h.logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, "showProgrammaticRewardedVideo()", e);
                }
            }
            if (placementP == null) {
                this.h.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL, "showProgrammaticRewardedVideo error: empty default placement in response", 3);
                com.json.zp.a().a(new com.json.mediationsdk.logger.IronSourceError(1021, "showProgrammaticRewardedVideo error: empty default placement in response"), (com.json.mediationsdk.adunit.adapter.utility.AdInfo) null);
                return;
            }
        } catch (java.lang.Exception e2) {
            e = e2;
            placementP = null;
        }
        if (activity != null) {
            e(activity);
        } else if (com.json.environment.ContextProvider.getInstance().getCurrentActiveActivity() == null) {
            this.h.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, "Activity must be provided in showRewardedVideo when initializing SDK with context", 3);
            com.json.zp.a().a(com.json.mediationsdk.utils.ErrorBuilder.buildInitFailedError("Activity must be provided in showRewardedVideo when initializing SDK with context", com.json.mediationsdk.utils.IronSourceConstants.REWARDED_VIDEO_AD_UNIT), (com.json.mediationsdk.adunit.adapter.utility.AdInfo) null);
            return;
        }
        com.json.rq rqVar = this.T;
        if (rqVar != null && (this.Y || this.a0)) {
            rqVar.a(activity, placementP);
            return;
        }
        com.json.yf yfVar = this.Q;
        if (yfVar != null) {
            yfVar.a(activity, placementP);
            return;
        }
        this.h.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, "showProgrammaticRewardedVideo - show called before init completed, managers not initiated yet", 3);
        com.json.zp.a().a(new com.json.mediationsdk.logger.IronSourceError(1023, "showProgrammaticRewardedVideo - show called before init completed, managers not initiated yet"), (com.json.mediationsdk.adunit.adapter.utility.AdInfo) null);
    }

    private void e0() {
        this.h.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL, "Rewarded Video started in programmatic mode", 0);
        java.util.List<com.json.mediationsdk.model.NetworkSettings> listA = a(this.m.j().d());
        if (listA.size() <= 0) {
            org.json.JSONObject mediationAdditionalData = com.json.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(false, true, this.d0);
            a(mediationAdditionalData, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            b(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_RV_INIT_FAILED, mediationAdditionalData);
            a(com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO, false);
            return;
        }
        com.json.mediationsdk.q qVar = new com.json.mediationsdk.q(listA, this.m.c().getRewardedVideoConfigurations(), n(), com.json.mediationsdk.utils.IronSourceUtils.getUserIdForNetworks(), com.json.lk.b().a(), this.C);
        this.Q = qVar;
        java.lang.Boolean bool = this.y;
        if (bool != null) {
            qVar.a(this.x, bool.booleanValue());
        }
    }

    private void f0() {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose();
        java.util.List<com.json.mediationsdk.model.NetworkSettings> listA = a(this.m.j().a());
        if (listA.size() > 0) {
            this.h.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL, "Banner started in programmatic mode", 0);
            this.R = new com.json.mediationsdk.w(listA, new com.json.mediationsdk.k(n(), com.json.mediationsdk.utils.IronSourceUtils.getUserIdForNetworks(), this.m.c().getBannerConfigurations()), com.json.lk.b().a(), this.C);
            v();
        } else {
            org.json.JSONObject mediationAdditionalData = com.json.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(false, true, 1);
            a(mediationAdditionalData, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_BN_INIT_FAILED, mediationAdditionalData);
            a(com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER, false);
        }
    }

    private void g0() {
        if (this.F) {
            b0();
            return;
        }
        com.json.uq uqVarF = this.m.c().getRewardedVideoConfigurations();
        this.a0 = uqVarF.k().h();
        this.d0 = a(uqVarF);
        if (this.Y || this.a0) {
            h0();
        } else {
            e0();
        }
    }

    private void h0() {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose();
        java.util.List<com.json.mediationsdk.model.NetworkSettings> listA = a(this.m.j().d());
        if (listA.size() <= 0) {
            org.json.JSONObject mediationAdditionalData = com.json.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(false, true, this.d0);
            a(mediationAdditionalData, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            b(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_RV_INIT_FAILED, mediationAdditionalData);
            a(com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO, false);
            return;
        }
        com.json.rq rqVar = new com.json.rq(listA, this.m.c().getRewardedVideoConfigurations(), com.json.mediationsdk.utils.IronSourceUtils.getUserIdForNetworks(), this.Y, com.json.lk.b(), this.C);
        this.T = rqVar;
        java.lang.Boolean bool = this.y;
        if (bool != null) {
            rqVar.a(this.x, bool.booleanValue());
        }
        if (this.Z && this.Y) {
            this.Z = false;
            this.T.A();
        }
    }

    private com.json.mediationsdk.model.InterstitialPlacement i() {
        com.json.hj hjVarD = this.m.c().getInterstitialConfigurations();
        if (hjVarD != null) {
            return hjVarD.a();
        }
        return null;
    }

    private com.json.mediationsdk.model.Placement j() {
        com.json.uq uqVarF = this.m.c().getRewardedVideoConfigurations();
        if (uqVarF != null) {
            return uqVarF.a();
        }
        return null;
    }

    private com.json.e7 k(java.lang.String str) {
        com.json.e7 e7VarA;
        com.json.r6 r6VarC = this.m.c().getBannerConfigurations();
        if (r6VarC == null) {
            return new com.json.ib();
        }
        return (android.text.TextUtils.isEmpty(str) || (e7VarA = r6VarC.a(str)) == null) ? r6VarC.i() : e7VarA;
    }

    private com.json.oa k() {
        return new com.ironsource.oa.b(com.json.wq.i(), new com.ironsource.oa.a("IronSource"));
    }

    private com.ironsource.kp.b l(java.lang.String str) {
        com.json.mediationsdk.model.InterstitialPlacement interstitialPlacementM;
        com.json.hs hsVar = this.m;
        if (hsVar == null || hsVar.c() == null || this.m.c().getInterstitialConfigurations() == null) {
            return com.ironsource.kp.b.NOT_CAPPED;
        }
        try {
            interstitialPlacementM = m(str);
            if (interstitialPlacementM == null) {
                try {
                    interstitialPlacementM = i();
                    if (interstitialPlacementM == null) {
                        this.h.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, "Default placement was not found", 3);
                    }
                } catch (java.lang.Exception e) {
                    e = e;
                    com.json.l9.d().a(e);
                    com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
                }
            }
        } catch (java.lang.Exception e2) {
            e = e2;
            interstitialPlacementM = null;
        }
        return interstitialPlacementM == null ? com.ironsource.kp.b.NOT_CAPPED : a(interstitialPlacementM);
    }

    private com.json.mediationsdk.model.InterstitialPlacement m(java.lang.String str) {
        com.json.hj hjVarD = this.m.c().getInterstitialConfigurations();
        if (hjVarD != null) {
            return hjVarD.a(str);
        }
        return null;
    }

    public static com.json.mediationsdk.p m() {
        return com.ironsource.mediationsdk.p.d.f3002a;
    }

    private com.ironsource.kp.b o(java.lang.String str) {
        com.json.mediationsdk.model.Placement placementP;
        com.json.hs hsVar = this.m;
        if (hsVar == null || hsVar.c() == null || this.m.c().getRewardedVideoConfigurations() == null) {
            return com.ironsource.kp.b.NOT_CAPPED;
        }
        try {
            placementP = p(str);
            if (placementP == null) {
                try {
                    placementP = j();
                    if (placementP == null) {
                        this.h.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, "Default placement was not found", 3);
                    }
                } catch (java.lang.Exception e) {
                    e = e;
                    com.json.l9.d().a(e);
                    com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
                }
            }
        } catch (java.lang.Exception e2) {
            e = e2;
            placementP = null;
        }
        return placementP == null ? com.ironsource.kp.b.NOT_CAPPED : a(placementP);
    }

    private com.json.mediationsdk.model.Placement p(java.lang.String str) {
        com.json.uq uqVarF = this.m.c().getRewardedVideoConfigurations();
        if (uqVarF != null) {
            return uqVarF.a(str);
        }
        return null;
    }

    private synchronized com.json.ao r() {
        return this.W;
    }

    private boolean u(java.lang.String str) {
        if (str == null) {
            return false;
        }
        return str.matches("^[a-zA-Z0-9]*$");
    }

    private com.json.o8 v(java.lang.String str) {
        com.json.mediationsdk.logger.IronSourceError ironSourceError;
        java.lang.String str2;
        com.json.o8 o8Var = new com.json.o8();
        if (str != null) {
            if (a(str, 5, 10)) {
                str2 = u(str) ? "length should be between 5-10 characters" : "should contain only english characters and numbers";
                return o8Var;
            }
            ironSourceError = com.json.mediationsdk.utils.ErrorBuilder.buildInvalidCredentialsError("appKey", str, str2);
        } else {
            ironSourceError = new com.json.mediationsdk.logger.IronSourceError(506, "Init Fail - appKey is missing");
        }
        o8Var.a(ironSourceError);
        return o8Var;
    }

    private void v() {
        if (this.M.booleanValue()) {
            com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("load banner after init");
            this.M = java.lang.Boolean.FALSE;
            a(this.N, this.O);
            this.N = null;
            this.O = null;
        }
    }

    private void w() {
        this.h = com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger(0);
        com.json.mediationsdk.logger.b bVar = new com.json.mediationsdk.logger.b(null, 1);
        this.j = bVar;
        this.h.addLogger(bVar);
        this.i = new com.json.ul();
    }

    private boolean x() {
        try {
            com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("AdQuality SDK exist: " + java.lang.Class.forName("com.ironsource.adqualitysdk.sdk.IronSourceAdQuality").getName());
            return true;
        } catch (java.lang.Throwable th) {
            com.json.l9.d().a(th);
            com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("No AdQuality SDK found");
            return false;
        }
    }

    private boolean y() {
        com.json.hs hsVar = this.m;
        return (hsVar == null || hsVar.c() == null || this.m.c().getBannerConfigurations() == null) ? false : true;
    }

    private boolean z() {
        return y() && A();
    }

    boolean B() {
        return this.F || this.G || this.H;
    }

    public boolean F() {
        boolean z;
        try {
            if (this.G) {
                this.h.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, "Interstitial was initialized in demand only mode. Use isISDemandOnlyInterstitialReady instead", 3);
                return false;
            }
            com.json.cj cjVar = this.S;
            boolean z2 = cjVar != null && cjVar.u();
            try {
                com.json.jj.i().a(new com.json.wb(z2 ? com.json.mediationsdk.utils.IronSourceConstants.IS_CHECK_READY_TRUE : com.json.mediationsdk.utils.IronSourceConstants.IS_CHECK_READY_FALSE, com.json.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(false, true, 1)));
                this.h.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, "isInterstitialReady():" + z2, 1);
                return z2;
            } catch (java.lang.Throwable th) {
                z = z2;
                th = th;
                com.json.l9.d().a(th);
                com.json.mediationsdk.logger.IronSourceLoggerManager ironSourceLoggerManager = this.h;
                com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag ironSourceTag = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API;
                ironSourceLoggerManager.log(ironSourceTag, "isInterstitialReady():" + z, 1);
                this.h.logException(ironSourceTag, "isInterstitialReady()", th);
                return false;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            z = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0033  */
    public boolean K() {
        boolean z;
        boolean z2;
        try {
            if (this.F) {
                this.h.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, "Rewarded Video was initialized in demand only mode. Use isISDemandOnlyRewardedVideoAvailable instead", 3);
                return false;
            }
            if (this.Y || this.a0) {
                com.json.rq rqVar = this.T;
                if (rqVar == null || !rqVar.u()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
            } else {
                com.json.yf yfVar = this.Q;
                if (yfVar == null || !yfVar.d()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
            }
            try {
                org.json.JSONObject mediationAdditionalData = com.json.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(false);
                a(mediationAdditionalData, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_PROGRAMMATIC, java.lang.Integer.valueOf(this.d0)}});
                com.json.wq.i().a(new com.json.wb(z2 ? com.json.mediationsdk.utils.IronSourceConstants.RV_API_HAS_AVAILABILITY_TRUE : com.json.mediationsdk.utils.IronSourceConstants.RV_API_HAS_AVAILABILITY_FALSE, mediationAdditionalData));
                this.h.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, "isRewardedVideoAvailable():" + z2, 1);
                return z2;
            } catch (java.lang.Throwable th) {
                z = z2;
                th = th;
                com.json.l9.d().a(th);
                com.json.mediationsdk.logger.IronSourceLoggerManager ironSourceLoggerManager = this.h;
                com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag ironSourceTag = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API;
                ironSourceLoggerManager.log(ironSourceTag, "isRewardedVideoAvailable():" + z, 1);
                this.h.logException(ironSourceTag, "isRewardedVideoAvailable()", th);
                return false;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            z = false;
        }
    }

    public boolean O() {
        return C();
    }

    public void P() {
        com.json.mediationsdk.logger.IronSourceLoggerManager ironSourceLoggerManager = this.h;
        com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag ironSourceTag = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "loadInterstitial()", 1);
        try {
            if (this.G) {
                this.h.log(ironSourceTag, "Interstitial was initialized in demand only mode. Use loadISDemandOnlyInterstitial instead", 3);
                com.json.mediationsdk.n.a().b(com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL, com.json.mediationsdk.utils.ErrorBuilder.buildInitFailedError("Interstitial was initialized in demand only mode. Use loadISDemandOnlyInterstitial instead", "Interstitial"));
                return;
            }
            if (!this.J) {
                this.h.log(ironSourceTag, "init() must be called before loadInterstitial()", 3);
                com.json.mediationsdk.n.a().b(com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL, com.json.mediationsdk.utils.ErrorBuilder.buildInitFailedError("init() must be called before loadInterstitial()", "Interstitial"));
                return;
            }
            com.ironsource.mediationsdk.s.d dVarA = com.json.mediationsdk.s.c().a();
            if (dVarA == com.ironsource.mediationsdk.s.d.INIT_FAILED) {
                this.h.log(ironSourceTag, "init() had failed", 3);
                com.json.mediationsdk.n.a().b(com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL, com.json.mediationsdk.utils.ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
                return;
            }
            if (dVarA == com.ironsource.mediationsdk.s.d.INIT_IN_PROGRESS) {
                if (!com.json.mediationsdk.s.c().d()) {
                    this.b0 = true;
                    return;
                } else {
                    this.h.log(ironSourceTag, "init() had failed", 3);
                    com.json.mediationsdk.n.a().b(com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL, com.json.mediationsdk.utils.ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
                    return;
                }
            }
            if (!E()) {
                this.h.log(ironSourceTag, "No interstitial configurations found", 3);
                com.json.mediationsdk.n.a().b(com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL, com.json.mediationsdk.utils.ErrorBuilder.buildInitFailedError("the server response does not contain interstitial data", "Interstitial"));
                return;
            }
            com.json.cj cjVar = this.S;
            if (cjVar == null) {
                this.b0 = true;
            } else {
                cjVar.A();
            }
        } catch (java.lang.Throwable th) {
            com.json.l9.d().a(th);
            this.h.logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, "loadInterstitial()", th);
            com.json.mediationsdk.n.a().b(com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL, new com.json.mediationsdk.logger.IronSourceError(510, th.getMessage()));
        }
    }

    public void Q() {
        com.json.mediationsdk.logger.IronSourceLoggerManager ironSourceLoggerManager = this.h;
        com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag ironSourceTag = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "loadRewardedVideo()", 1);
        try {
            if (this.F) {
                this.h.log(ironSourceTag, "Rewarded Video was initialized in demand only mode. Use loadISDemandOnlyRewardedVideo instead", 3);
                com.json.mediationsdk.n.a().b(com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO, com.json.mediationsdk.utils.ErrorBuilder.buildInitFailedError("Rewarded Video was initialized in demand only mode. Use loadISDemandOnlyRewardedVideo instead", com.json.mediationsdk.utils.IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                return;
            }
            if (!this.Y && !this.n0) {
                this.h.log(ironSourceTag, "Rewarded Video is not initiated with manual load", 3);
                return;
            }
            if (!this.I) {
                this.h.log(ironSourceTag, "init() must be called before loadRewardedVideo()", 3);
                com.json.mediationsdk.n.a().b(com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO, com.json.mediationsdk.utils.ErrorBuilder.buildInitFailedError("init() must be called before loadRewardedVideo()", com.json.mediationsdk.utils.IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                return;
            }
            com.ironsource.mediationsdk.s.d dVarA = com.json.mediationsdk.s.c().a();
            if (dVarA == com.ironsource.mediationsdk.s.d.INIT_FAILED) {
                this.h.log(ironSourceTag, "init() had failed", 3);
                com.json.mediationsdk.n.a().b(com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO, com.json.mediationsdk.utils.ErrorBuilder.buildInitFailedError("init() had failed", com.json.mediationsdk.utils.IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                return;
            }
            if (dVarA == com.ironsource.mediationsdk.s.d.INIT_IN_PROGRESS) {
                if (!com.json.mediationsdk.s.c().d()) {
                    this.Z = true;
                    return;
                } else {
                    this.h.log(ironSourceTag, "init() had failed", 3);
                    com.json.mediationsdk.n.a().b(com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO, com.json.mediationsdk.utils.ErrorBuilder.buildInitFailedError("init() had failed", com.json.mediationsdk.utils.IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                    return;
                }
            }
            if (!M()) {
                this.h.log(ironSourceTag, "No rewarded video configurations found", 3);
                com.json.mediationsdk.n.a().b(com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO, com.json.mediationsdk.utils.ErrorBuilder.buildInitFailedError("the server response does not contain rewarded video data", com.json.mediationsdk.utils.IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                return;
            }
            com.json.rq rqVar = this.T;
            if (rqVar == null) {
                this.Z = true;
            } else {
                rqVar.A();
            }
        } catch (java.lang.Throwable th) {
            com.json.l9.d().a(th);
            this.h.logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, "loadRewardedVideo()", th);
            com.json.mediationsdk.n.a().b(com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO, new com.json.mediationsdk.logger.IronSourceError(510, th.getMessage()));
        }
    }

    public void R() {
        com.json.cj cjVar = this.S;
        if (cjVar != null) {
            cjVar.a((com.json.au) null);
        }
        com.json.rq rqVar = this.T;
        if (rqVar != null) {
            rqVar.a((com.json.au) null);
        }
        com.json.d6 d6Var = this.U;
        if (d6Var != null) {
            d6Var.a((com.json.au) null);
        }
        this.n0 = false;
    }

    public void S() {
        com.json.mediationsdk.logger.IronLog.API.info("removing all impression data listeners");
        com.json.lk.b().d();
        com.json.yf yfVar = this.Q;
        if (yfVar != null) {
            yfVar.c();
        }
        com.json.mediationsdk.w wVar = this.R;
        if (wVar != null) {
            wVar.c();
        }
    }

    public void U() {
        if (t0) {
            return;
        }
        t0 = true;
        org.json.JSONObject mediationAdditionalData = com.json.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(false);
        try {
            mediationAdditionalData.put("status", "false");
            mediationAdditionalData.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, 1);
        } catch (org.json.JSONException e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
        com.json.wq.i().a(new com.json.wb(114, mediationAdditionalData));
    }

    public com.json.hs a(android.content.Context context, java.lang.String str) {
        if (com.json.ni.a(context)) {
            com.json.a8 a8VarC = com.json.ni.c(context);
            java.lang.String strD = a8VarC.d();
            java.lang.String strF = a8VarC.f();
            java.lang.String strE = a8VarC.e();
            if (strD.equals(str)) {
                com.json.hs hsVar = new com.json.hs(context, strD, strF, strE);
                hsVar.a(com.ironsource.hs.a.CACHE);
                return hsVar;
            }
        }
        return null;
    }

    com.ironsource.kp.b a(com.json.mediationsdk.model.InterstitialPlacement interstitialPlacement) {
        return this.e.a(com.json.environment.ContextProvider.getInstance().getApplicationContext(), interstitialPlacement, com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL);
    }

    com.ironsource.kp.b a(com.json.mediationsdk.model.Placement placement) {
        return this.e.a(com.json.environment.ContextProvider.getInstance().getApplicationContext(), placement, com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO);
    }

    @Override // com.ironsource.na.a
    public com.json.mediationsdk.demandOnly.ISDemandOnlyBannerLayout a(android.app.Activity activity, com.json.mediationsdk.ISBannerSize iSBannerSize) {
        com.json.mediationsdk.logger.IronSourceLoggerManager ironSourceLoggerManager = this.h;
        com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag ironSourceTag = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "createBannerForDemandOnly()", 1);
        if (activity == null) {
            this.h.log(ironSourceTag, "createBannerForDemandOnly() : Activity cannot be null", 3);
            return null;
        }
        com.json.environment.ContextProvider.getInstance().updateActivity(activity);
        return new com.json.mediationsdk.demandOnly.ISDemandOnlyBannerLayout(activity, iSBannerSize);
    }

    public synchronized com.json.mediationsdk.logger.IronSourceError a(android.content.Context context, java.lang.String str, boolean z, com.json.mediationsdk.sdk.InitializationListener initializationListener, com.json.ao aoVar, com.ironsource.mediationsdk.IronSource.AD_UNIT... ad_unitArr) {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("GitHash: 0b12e64");
        com.json.j.f2777a.a(context);
        if (!com.json.ak.a((java.lang.Object) context, "Init Failed - provided context is null")) {
            d("Provided context is null");
            return new com.json.mediationsdk.logger.IronSourceError(2000, "Provided context is null");
        }
        this.g.a(context);
        boolean z2 = context instanceof android.app.Activity;
        if (z2) {
            e((android.app.Activity) context);
        }
        if (initializationListener != null) {
            this.V = initializationListener;
        }
        if (!z) {
            this.p0.set(true);
        }
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.t;
        if (atomicBoolean == null || !atomicBoolean.compareAndSet(true, false)) {
            if (ad_unitArr != null) {
                a(z2, z, aoVar != null, ad_unitArr);
                if (C() && !z) {
                    T();
                }
            } else {
                this.h.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, "Multiple calls to init without ad units are not allowed", 3);
            }
            com.json.vr vrVarB = com.json.wr.f3542a.b();
            if (C()) {
                return new com.json.mediationsdk.logger.IronSourceError(com.json.mediationsdk.logger.IronSourceError.ERROR_INIT_ALREADY_FINISHED, "Already finished init");
            }
            if (vrVarB == com.json.vr.INIT_FAILED) {
                return new com.json.mediationsdk.logger.IronSourceError(com.json.mediationsdk.logger.IronSourceError.ERROR_LEGACY_INIT_FAILED, "Legacy init failed");
            }
            if (vrVarB == com.json.vr.NOT_INIT) {
                return new com.json.mediationsdk.logger.IronSourceError(2020, "Already called new init");
            }
            if (aoVar != null) {
                a(aoVar);
            }
            return new com.json.mediationsdk.logger.IronSourceError(com.json.mediationsdk.logger.IronSourceError.ERROR_OLD_API_INIT_IN_PROGRESS, "Old Api init in progress");
        }
        com.json.wr.f3542a.a(aoVar == null);
        if ((ad_unitArr == null || ad_unitArr.length == 0) && aoVar == null) {
            for (com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit : com.ironsource.mediationsdk.IronSource.AD_UNIT.values()) {
                this.z.add(ad_unit);
            }
            this.I = true;
            this.J = true;
            this.K = true;
            this.L = true;
        } else {
            for (com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit2 : ad_unitArr) {
                this.z.add(ad_unit2);
                this.A.add(ad_unit2);
                if (ad_unit2.equals(com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL)) {
                    this.J = true;
                }
                if (ad_unit2.equals(com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER)) {
                    this.K = true;
                }
                if (ad_unit2.equals(com.ironsource.mediationsdk.IronSource.AD_UNIT.NATIVE_AD)) {
                    this.L = true;
                }
                if (ad_unit2.equals(com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO)) {
                    this.I = true;
                }
            }
        }
        com.json.mediationsdk.logger.IronLog.API.info("init(appKey:" + str + ")");
        com.json.o8 o8VarV = v(str);
        if (o8VarV.b()) {
            this.n = str;
        }
        com.json.hs hsVarA = a(context, this.n);
        if (hsVarA != null) {
            com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("init cache exists");
            a(hsVarA.c().getApplicationConfigurations().e());
        } else {
            com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("init cache does not exist");
        }
        com.json.environment.ContextProvider.getInstance().updateAppContext(context.getApplicationContext());
        this.d.a(context.getApplicationContext(), java.util.concurrent.TimeUnit.HOURS.toMillis(com.json.ua.f3466a.d()));
        this.l0.f(com.json.mediationsdk.utils.IronSourceUtils.getSDKVersion());
        this.l0.a(com.json.ag.a());
        this.l0.b(com.json.mediationsdk.utils.IronSourceUtils.isGooglePlayInstalled(context));
        this.l0.a(com.json.h1.a());
        V();
        d(context);
        if (this.n == null) {
            com.json.mediationsdk.s.c().f();
            if (this.z.contains(com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO)) {
                com.json.zp.a().a(false, (com.json.mediationsdk.adunit.adapter.utility.AdInfo) null);
            }
            com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, o8VarV.a().toString(), 1);
            return new com.json.mediationsdk.logger.IronSourceError(com.json.mediationsdk.logger.IronSourceError.ERROR_OLD_INIT_API_APP_KEY_IS_NULL, "App key is null");
        }
        this.l0.a(context);
        this.l0.b(this.n);
        this.l0.h(this.w);
        this.l0.g(com.json.mediationsdk.config.ConfigFile.getConfigFile().getPluginType());
        if (this.B) {
            org.json.JSONObject mediationAdditionalData = com.json.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(z);
            if (ad_unitArr != null) {
                for (com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit3 : ad_unitArr) {
                    try {
                        mediationAdditionalData.put(ad_unit3.toString(), true);
                    } catch (java.lang.Exception e) {
                        com.json.l9.d().a(e);
                    }
                }
            }
            int i = this.E + 1;
            this.E = i;
            a(z2, z, i, mediationAdditionalData, aoVar != null);
            this.B = false;
        }
        return null;
    }

    @Override // com.json.na
    public java.lang.String a(android.content.Context context) {
        com.json.zu zuVarJ;
        com.json.oa oaVarK = k();
        com.json.vr vrVarA = com.json.wr.f3542a.a();
        oaVarK.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_DO_GET_BIDDING_DATA_CALLED_IN_INIT_STATUS, vrVarA);
        if (context == null) {
            com.json.mediationsdk.logger.IronLog.API.error("bidding data cannot be retrieved, context required");
            oaVarK.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_DO_GET_BIDDING_DATA_CALLED_WITHOUT_CONTEXT, (com.json.vr) null);
            return null;
        }
        if (vrVarA == com.json.vr.NOT_INIT) {
            com.json.mediationsdk.logger.IronLog.API.error("bidding data cannot be retrieved, SDK not initialized");
            return null;
        }
        com.json.mediationsdk.s.c().g();
        com.json.hs hsVar = this.m;
        boolean zE = (hsVar == null || (zuVarJ = hsVar.c().getApplicationConfigurations().j()) == null) ? true : zuVarJ.e();
        org.json.JSONObject jSONObjectA = new com.json.yu().a(context);
        com.json.mediationsdk.d.b().a(jSONObjectA, true);
        java.lang.String string = jSONObjectA.toString();
        java.lang.String strCompressAndEncrypt = zE ? com.json.mediationsdk.utils.IronSourceAES.compressAndEncrypt(string) : com.json.mediationsdk.utils.IronSourceAES.encrypt(string);
        if (strCompressAndEncrypt == null) {
            oaVarK.a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_DO_GET_BIDDING_DATA_RETURNED_NULL, (com.json.vr) null);
        }
        return strCompressAndEncrypt;
    }

    java.lang.String a(java.lang.String str, com.ironsource.kp.b bVar) {
        if (bVar == null) {
            return null;
        }
        int i = com.ironsource.mediationsdk.p.b.c[bVar.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return "placement " + str + " is capped";
        }
        return null;
    }

    java.util.HashSet<java.lang.String> a(java.lang.String str, java.lang.String str2) {
        com.json.hs hsVar = this.m;
        return hsVar == null ? new java.util.HashSet<>() : hsVar.k().a(str, str2);
    }

    public synchronized java.util.List<com.ironsource.mediationsdk.IronSource.AD_UNIT> a(android.content.Context context, java.lang.String str, boolean z, com.ironsource.mediationsdk.IronSource.AD_UNIT... ad_unitArr) {
        java.util.ArrayList arrayList;
        arrayList = new java.util.ArrayList();
        if ((ad_unitArr == null || ad_unitArr.length == 0) && z) {
            if (this.I) {
                a(com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO);
            } else {
                this.F = true;
                arrayList.add(com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO);
            }
            if (this.J) {
                a(com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL);
            } else {
                this.G = true;
                arrayList.add(com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL);
            }
            if (this.K) {
                a(com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER);
            } else {
                this.H = true;
                arrayList.add(com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER);
            }
        } else {
            for (com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit : ad_unitArr) {
                if (ad_unit.equals(com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL)) {
                    if (this.J) {
                        a(ad_unit);
                    } else {
                        this.G = true;
                        if (!arrayList.contains(ad_unit)) {
                            arrayList.add(ad_unit);
                        }
                    }
                }
                if (ad_unit.equals(com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO)) {
                    if (this.I) {
                        a(ad_unit);
                    } else {
                        this.F = true;
                        if (!arrayList.contains(ad_unit)) {
                            arrayList.add(ad_unit);
                        }
                    }
                }
                if (ad_unit.equals(com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER)) {
                    if (this.K) {
                        a(ad_unit);
                    } else {
                        this.H = true;
                        if (!arrayList.contains(ad_unit)) {
                            arrayList.add(ad_unit);
                        }
                    }
                }
            }
        }
        if (context != null) {
            if (context instanceof android.app.Activity) {
                e((android.app.Activity) context);
            }
            com.json.environment.ContextProvider.getInstance().updateAppContext(context.getApplicationContext());
        }
        return arrayList;
    }

    @Override // com.json.io
    public void a() {
        if (this.M.booleanValue()) {
            this.M = java.lang.Boolean.FALSE;
            com.json.mediationsdk.n.a().b(com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER, new com.json.mediationsdk.logger.IronSourceError(603, "init() had failed"));
            this.N = null;
            this.O = null;
        }
        if (this.b0) {
            this.b0 = false;
            com.json.mediationsdk.n.a().b(com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL, com.json.mediationsdk.utils.ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
        }
        if (this.Z) {
            this.Z = false;
            com.json.mediationsdk.n.a().b(com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO, com.json.mediationsdk.utils.ErrorBuilder.buildInitFailedError("init() had failed", com.json.mediationsdk.utils.IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
        }
        synchronized (this.e0) {
            java.util.Iterator<com.ironsource.mediationsdk.demandOnly.h.d> it = this.e0.values().iterator();
            while (it.hasNext()) {
                java.lang.String strC = it.next().getInstanceId();
                this.r0.a(strC).onInterstitialAdLoadFailed(strC, com.json.mediationsdk.utils.ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
            }
            this.e0.clear();
        }
        synchronized (this.g0) {
            java.util.Iterator<com.ironsource.mediationsdk.demandOnly.h.d> it2 = this.g0.values().iterator();
            while (it2.hasNext()) {
                java.lang.String strC2 = it2.next().getInstanceId();
                this.s0.a(strC2).onRewardedVideoAdLoadFailed(strC2, com.json.mediationsdk.utils.ErrorBuilder.buildInitFailedError("init() had failed", com.json.mediationsdk.utils.IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            }
            this.g0.clear();
        }
        synchronized (this.f0) {
            for (com.ironsource.mediationsdk.demandOnly.h.b bVar : this.f0.values()) {
                com.json.mediationsdk.demandOnly.ISDemandOnlyBannerLayout iSDemandOnlyBannerLayoutG = bVar.getBanner();
                if (iSDemandOnlyBannerLayoutG != null) {
                    iSDemandOnlyBannerLayoutG.getListener().a(bVar.getInstanceId(), com.json.mediationsdk.utils.ErrorBuilder.buildInitFailedError("init() had failed", "Banner"));
                }
            }
            this.f0.clear();
        }
    }

    public void a(long j, com.ironsource.hs.a aVar) {
        org.json.JSONObject mediationAdditionalData = com.json.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(B());
        try {
            mediationAdditionalData.put("duration", j);
            mediationAdditionalData.put("sessionDepth", this.E);
            mediationAdditionalData.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, aVar.a());
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
        com.json.wq.i().a(new com.json.wb(com.json.mediationsdk.utils.IronSourceConstants.INIT_COMPLETE, mediationAdditionalData));
    }

    public void a(android.app.Activity activity) {
        try {
            if (com.json.sdk.controller.FeaturesManager.getInstance().getStopUseOnResumeAndPause()) {
                return;
            }
            this.h.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, "onPause()", 1);
            com.json.environment.ContextProvider.getInstance().onPause(activity);
        } catch (java.lang.Throwable th) {
            com.json.l9.d().a(th);
            this.h.logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, "onPause()", th);
        }
    }

    @Override // com.ironsource.na.a
    public synchronized void a(android.app.Activity activity, com.json.mediationsdk.demandOnly.ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, java.lang.String str) {
        com.ironsource.mediationsdk.demandOnly.h.b bVarA = new com.ironsource.mediationsdk.demandOnly.h.c().b(str).a(activity).a(iSDemandOnlyBannerLayout).a(com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER).a();
        com.json.mediationsdk.logger.IronSourceError ironSourceErrorA = bVarA.a();
        if (ironSourceErrorA != null) {
            this.h.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, ironSourceErrorA.getErrorMessage(), 3);
            if (iSDemandOnlyBannerLayout != null) {
                iSDemandOnlyBannerLayout.getListener().a(str, ironSourceErrorA);
            }
            return;
        }
        com.json.mediationsdk.logger.IronSourceError ironSourceErrorA2 = a(com.json.mediationsdk.s.c().a());
        if (ironSourceErrorA2 != null) {
            this.h.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, ironSourceErrorA2.getErrorMessage(), 3);
            iSDemandOnlyBannerLayout.getListener().a(str, ironSourceErrorA2);
            return;
        }
        com.json.environment.ContextProvider.getInstance().updateActivity(activity);
        if (a(bVarA)) {
            return;
        }
        if (!z()) {
            this.h.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, "No banner configurations found", 3);
            iSDemandOnlyBannerLayout.getListener().a(str, com.json.mediationsdk.utils.ErrorBuilder.buildInitFailedError("the server response does not contain banner data", "Banner"));
        } else {
            if (b(bVarA)) {
                return;
            }
            this.j0.a(iSDemandOnlyBannerLayout, str);
        }
    }

    @Override // com.ironsource.na.a
    public synchronized void a(android.app.Activity activity, com.json.mediationsdk.demandOnly.ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, java.lang.String str, java.lang.String str2) {
        com.ironsource.mediationsdk.demandOnly.h.b bVarA = new com.ironsource.mediationsdk.demandOnly.h.c().b(str).a(activity).a(true).a(str2).a(iSDemandOnlyBannerLayout).a(com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER).a();
        com.json.mediationsdk.logger.IronSourceError ironSourceErrorA = bVarA.a();
        if (ironSourceErrorA != null) {
            this.h.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, ironSourceErrorA.getErrorMessage(), 3);
            if (iSDemandOnlyBannerLayout != null) {
                iSDemandOnlyBannerLayout.getListener().a(str, ironSourceErrorA);
            }
            return;
        }
        com.json.mediationsdk.logger.IronSourceError ironSourceErrorA2 = a(com.json.mediationsdk.s.c().a());
        if (ironSourceErrorA2 != null) {
            this.h.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, ironSourceErrorA2.getErrorMessage(), 3);
            iSDemandOnlyBannerLayout.getListener().a(str, ironSourceErrorA2);
            return;
        }
        com.json.environment.ContextProvider.getInstance().updateActivity(activity);
        if (a(bVarA)) {
            return;
        }
        if (!z()) {
            this.h.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, "No banner configurations found", 3);
            iSDemandOnlyBannerLayout.getListener().a(str, com.json.mediationsdk.utils.ErrorBuilder.buildInitFailedError("the server response does not contain banner data", "Banner"));
        } else {
            if (b(bVarA)) {
                return;
            }
            this.j0.a(iSDemandOnlyBannerLayout, str, str2);
        }
    }

    @Override // com.ironsource.na.b
    public synchronized void a(android.app.Activity activity, java.lang.String str) {
        a(new com.ironsource.mediationsdk.demandOnly.h.c().b(str).a(activity, com.json.environment.ContextProvider.getInstance().getCurrentActiveActivity()).a(com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL).b(), this.r0.a(str));
    }

    @Override // com.ironsource.na.c
    public synchronized void a(android.app.Activity activity, java.lang.String str, java.lang.String str2) {
        a(new com.ironsource.mediationsdk.demandOnly.h.c().b(str).a(str2).a(activity, com.json.environment.ContextProvider.getInstance().getCurrentActiveActivity()).a(true).a(com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO).b(), this.s0.a(str));
    }

    public synchronized void a(android.content.Context context, java.lang.String str, boolean z, com.json.mediationsdk.sdk.InitializationListener initializationListener, com.ironsource.mediationsdk.IronSource.AD_UNIT... ad_unitArr) {
        if (a(context, str, z, initializationListener, null, ad_unitArr) == null) {
            com.json.mediationsdk.s.c().a(this);
            com.json.mediationsdk.s.c().a(this.k0);
            com.json.mediationsdk.s.c().a(context, str, this.o, ad_unitArr);
        }
    }

    @Override // com.json.na
    public synchronized void a(android.content.Context context, java.lang.String str, com.ironsource.mediationsdk.IronSource.AD_UNIT... ad_unitArr) {
        java.util.List<com.ironsource.mediationsdk.IronSource.AD_UNIT> listA = a(context, str, true, ad_unitArr);
        if (!listA.isEmpty()) {
            a(context, str, true, (com.json.mediationsdk.sdk.InitializationListener) null, (com.ironsource.mediationsdk.IronSource.AD_UNIT[]) listA.toArray(new com.ironsource.mediationsdk.IronSource.AD_UNIT[listA.size()]));
        }
    }

    @Override // com.json.uj
    public void a(android.content.Context context, boolean z) {
        this.x = context;
        this.y = java.lang.Boolean.valueOf(z);
        com.json.cj cjVar = this.S;
        if (cjVar != null) {
            cjVar.a(context, z);
        }
        if (this.a0) {
            com.json.rq rqVar = this.T;
            if (rqVar != null) {
                rqVar.a(context, z);
                return;
            }
            return;
        }
        com.json.yf yfVar = this.Q;
        if (yfVar != null) {
            yfVar.a(context, z);
        }
    }

    public void a(com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit, com.json.au auVar) {
        com.json.d6 d6Var;
        com.json.rq rqVar;
        com.json.cj cjVar;
        if (this.n0) {
            if (ad_unit == com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL && (cjVar = this.S) != null) {
                cjVar.a(auVar);
            }
            if (ad_unit == com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO && (rqVar = this.T) != null) {
                rqVar.a(auVar);
            }
            if (ad_unit != com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER || (d6Var = this.U) == null) {
                return;
            }
            d6Var.a(auVar);
        }
    }

    public void a(com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit, com.json.mediationsdk.WaterfallConfiguration waterfallConfiguration) {
        if (ad_unit == null) {
            com.json.mediationsdk.logger.IronLog.API.error("AdUnit should not be null.");
            return;
        }
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.API;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = ad_unit.name();
        objArr[1] = waterfallConfiguration == null ? "NULL" : waterfallConfiguration.toString();
        ironLog.info(java.lang.String.format("(%s, %s)", objArr));
        com.json.wb wbVar = new com.json.wb(53, com.json.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(false));
        wbVar.a(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, waterfallConfiguration == null ? "" : waterfallConfiguration.toJsonString());
        com.json.wq.i().a(wbVar, ad_unit);
        this.l0.a(ad_unit, waterfallConfiguration);
    }

    public void a(com.json.mediationsdk.IronSourceBannerLayout ironSourceBannerLayout) {
        com.json.d6 d6Var;
        this.h.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, "destroyBanner()", 1);
        try {
            if (!this.c0 || (d6Var = this.U) == null) {
                com.json.mediationsdk.w wVar = this.R;
                if (wVar != null) {
                    wVar.a(ironSourceBannerLayout);
                }
            } else {
                d6Var.a(ironSourceBannerLayout);
            }
        } catch (java.lang.Throwable th) {
            com.json.l9.d().a(th);
            this.h.logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, "destroyBanner()", th);
        }
    }

    public void a(com.json.mediationsdk.IronSourceBannerLayout ironSourceBannerLayout, java.lang.String str) {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("placementName = " + str);
        if (this.H) {
            this.h.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, "Banner was initialized in demand only mode. Use loadISDemandOnlyBanner instead", 3);
            com.json.mediationsdk.n.a().b(com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER, com.json.mediationsdk.utils.ErrorBuilder.buildInitFailedError("Banner was initialized in demand only mode. Use loadISDemandOnlyBanner instead", "Banner"));
            return;
        }
        if (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) {
            java.lang.String strConcat = "loadBanner can't be called - ".concat(ironSourceBannerLayout == null ? "banner layout is null " : "banner layout is destroyed");
            this.h.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, strConcat, 3);
            com.json.mediationsdk.n.a().b(com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER, com.json.mediationsdk.utils.ErrorBuilder.buildLoadFailedError(strConcat));
            return;
        }
        if (!this.K) {
            this.h.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, "init() must be called before loadBanner()", 3);
            com.json.mediationsdk.n.a().b(com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER, com.json.mediationsdk.utils.ErrorBuilder.buildLoadFailedError("init() must be called before loadBanner()"));
            return;
        }
        if (ironSourceBannerLayout.getSize().getDescription().equals("CUSTOM") && (ironSourceBannerLayout.getSize().getWidth() <= 0 || ironSourceBannerLayout.getSize().getHeight() <= 0)) {
            this.h.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, "loadBanner: Unsupported banner size. Height and width must be bigger than 0", 3);
            com.json.mediationsdk.n.a().b(com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER, com.json.mediationsdk.utils.ErrorBuilder.unsupportedBannerSize(""));
            return;
        }
        com.ironsource.mediationsdk.s.d dVarA = com.json.mediationsdk.s.c().a();
        if (dVarA == com.ironsource.mediationsdk.s.d.INIT_FAILED) {
            this.h.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
            com.json.mediationsdk.n.a().b(com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER, new com.json.mediationsdk.logger.IronSourceError(600, "Init() had failed"));
            return;
        }
        if (dVarA == com.ironsource.mediationsdk.s.d.INIT_IN_PROGRESS) {
            if (com.json.mediationsdk.s.c().d()) {
                this.h.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                com.json.mediationsdk.n.a().b(com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER, new com.json.mediationsdk.logger.IronSourceError(601, "Init() had failed"));
                return;
            } else {
                this.N = ironSourceBannerLayout;
                this.M = java.lang.Boolean.TRUE;
                this.O = str;
                return;
            }
        }
        if (!z()) {
            this.h.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, "No banner configurations found", 3);
            com.json.mediationsdk.n.a().b(com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER, new com.json.mediationsdk.logger.IronSourceError(com.json.mediationsdk.logger.IronSourceError.ERROR_BN_LOAD_NO_CONFIG, "the server response does not contain banner data"));
            return;
        }
        com.json.mediationsdk.w wVar = this.R;
        if (wVar == null && this.U == null) {
            this.N = ironSourceBannerLayout;
            this.M = java.lang.Boolean.TRUE;
            this.O = str;
        } else if (this.c0) {
            this.U.a(ironSourceBannerLayout, new com.json.mediationsdk.model.Placement(k(str)));
        } else {
            wVar.a(ironSourceBannerLayout, k(str));
        }
    }

    public void a(com.json.mediationsdk.IronSourceSegment ironSourceSegment) {
        this.C = ironSourceSegment;
        com.json.rq rqVar = this.T;
        if (rqVar != null) {
            rqVar.a(ironSourceSegment);
        }
        com.json.yf yfVar = this.Q;
        if (yfVar != null) {
            yfVar.a(ironSourceSegment);
        }
        com.json.cj cjVar = this.S;
        if (cjVar != null) {
            cjVar.a(ironSourceSegment);
        }
        com.json.mediationsdk.w wVar = this.R;
        if (wVar != null) {
            wVar.a(ironSourceSegment);
        }
        com.json.d6 d6Var = this.U;
        if (d6Var != null) {
            d6Var.a(ironSourceSegment);
        }
        com.json.mediationsdk.adquality.AdQualityBridge adQualityBridge = this.o0;
        if (adQualityBridge != null) {
            adQualityBridge.setSegment(ironSourceSegment);
        }
        com.json.jj.i().a(this.C);
        com.json.wq.i().a(this.C);
        com.json.ep.P.a(this.C);
    }

    @Override // com.ironsource.na.b
    public void a(com.json.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        this.r0.a(iSDemandOnlyInterstitialListener);
    }

    @Override // com.ironsource.na.c
    public void a(com.json.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        this.s0.a(iSDemandOnlyRewardedVideoListener);
    }

    void a(com.ironsource.mediationsdk.demandOnly.h.d dVar, com.json.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        java.lang.String strC = dVar.getInstanceId();
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.API;
        ironLog.info("instanceId=" + strC);
        try {
            if (!this.I) {
                ironLog.error("initISDemandOnly() must be called before loadDemandOnlyRewardedVideo()");
                iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strC, new com.json.mediationsdk.logger.IronSourceError(510, "initISDemandOnly() must be called before loadDemandOnlyRewardedVideo()"));
                return;
            }
            if (!this.F) {
                ironLog.error("Rewarded video was initialized in mediation mode");
                iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strC, new com.json.mediationsdk.logger.IronSourceError(510, "Rewarded video was initialized in mediation mode"));
                return;
            }
            com.ironsource.mediationsdk.s.d dVarA = com.json.mediationsdk.s.c().a();
            if (dVarA == com.ironsource.mediationsdk.s.d.INIT_FAILED) {
                ironLog.error("init() had failed");
                iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strC, com.json.mediationsdk.utils.ErrorBuilder.buildInitFailedError("init() had failed", com.json.mediationsdk.utils.IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                return;
            }
            com.json.mediationsdk.logger.IronSourceError ironSourceErrorA = dVar.a();
            if (ironSourceErrorA != null) {
                if (ironSourceErrorA.getErrorCode() == 1060) {
                    b(81321, com.json.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(true, !android.text.TextUtils.isEmpty(dVar.getAdMarkup()), 1));
                }
                ironLog.error(ironSourceErrorA.toString());
                iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strC, ironSourceErrorA);
                return;
            }
            e(dVar.getActivity());
            if (dVarA == com.ironsource.mediationsdk.s.d.INIT_IN_PROGRESS) {
                if (com.json.mediationsdk.s.c().d()) {
                    ironLog.error("init() had failed");
                    iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strC, com.json.mediationsdk.utils.ErrorBuilder.buildInitFailedError("init() had failed", com.json.mediationsdk.utils.IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                    return;
                }
                synchronized (this.g0) {
                    this.g0.put(strC, dVar);
                }
                if (android.text.TextUtils.isEmpty(dVar.getAdMarkup())) {
                    return;
                }
                b(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_DO_IAB_RV_LOAD_FAILED_INIT_IN_PROGRESS, com.json.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(true, !android.text.TextUtils.isEmpty(dVar.getAdMarkup()), 1));
                return;
            }
            if (!M()) {
                ironLog.error("No rewarded video configurations found");
                iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strC, com.json.mediationsdk.utils.ErrorBuilder.buildInitFailedError("the server response does not contain rewarded video data", com.json.mediationsdk.utils.IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                return;
            }
            synchronized (this.g0) {
                com.json.mediationsdk.demandOnly.k kVar = this.i0;
                if (kVar != null) {
                    kVar.a(dVar);
                    return;
                }
                this.g0.put(strC, dVar);
                if (!android.text.TextUtils.isEmpty(dVar.getAdMarkup())) {
                    b(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_DO_IAB_RV_LOAD_FAILED_INIT_IN_PROGRESS, com.json.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(true, !android.text.TextUtils.isEmpty(dVar.getAdMarkup()), 1));
                }
                return;
            }
            com.json.l9.d().a(th);
            com.json.mediationsdk.logger.IronLog.API.error(th.getMessage());
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strC, new com.json.mediationsdk.logger.IronSourceError(510, th.getMessage()));
        } catch (java.lang.Throwable th) {
            com.json.l9.d().a(th);
            com.json.mediationsdk.logger.IronLog.API.error(th.getMessage());
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strC, new com.json.mediationsdk.logger.IronSourceError(510, th.getMessage()));
        }
    }

    @Override // com.json.ei
    public void a(com.json.mediationsdk.impressionData.ImpressionDataListener impressionDataListener) {
        if (com.json.ak.a((java.lang.Object) impressionDataListener, "removeImpressionDataListener - listener is null")) {
            com.json.lk.b().b(impressionDataListener);
            com.json.yf yfVar = this.Q;
            if (yfVar != null) {
                yfVar.a(impressionDataListener);
            }
            com.json.mediationsdk.w wVar = this.R;
            if (wVar != null) {
                wVar.a(impressionDataListener);
            }
            com.json.mediationsdk.logger.IronLog.API.info("remove impression data listener from " + impressionDataListener.getClass().getSimpleName());
        }
    }

    @Override // com.json.em
    public void a(com.json.mediationsdk.logger.LogListener logListener) {
        if (logListener == null) {
            this.h.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, "setLogListener(LogListener:null)", 1);
        } else {
            this.j.a(logListener);
            this.h.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, "setLogListener(LogListener:" + logListener.getClass().getSimpleName() + ")", 1);
        }
    }

    public void a(com.json.mediationsdk.sdk.LevelPlayInterstitialListener levelPlayInterstitialListener) {
        com.json.mediationsdk.logger.IronLog.API.info();
        com.json.ng.a().a(levelPlayInterstitialListener);
    }

    public void a(com.json.mediationsdk.sdk.LevelPlayRewardedVideoListener levelPlayRewardedVideoListener) {
        com.json.mediationsdk.logger.IronLog.API.info();
        com.json.zp.a().a(levelPlayRewardedVideoListener);
    }

    public synchronized void a(com.json.mediationsdk.sdk.LevelPlayRewardedVideoManualListener levelPlayRewardedVideoManualListener) {
        java.lang.String str;
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.API;
        ironLog.info();
        if (!this.I) {
            if (levelPlayRewardedVideoManualListener == null) {
                this.Y = false;
                str = "Disabling rewarded video manual mode";
            } else {
                this.Y = true;
                str = "Enabling rewarded video manual mode";
            }
            ironLog.info(str);
        }
        com.json.zp.a().a(levelPlayRewardedVideoManualListener);
    }

    void a(com.json.mediationsdk.sdk.SegmentListener segmentListener) {
        com.json.ul ulVar = this.i;
        if (ulVar != null) {
            ulVar.a(segmentListener);
            com.json.mediationsdk.s.c().a(this.i);
        }
    }

    @Override // com.ironsource.na.c
    public synchronized void a(java.lang.String str) {
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.API;
        ironLog.info("instanceId=" + str);
        com.json.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerA = this.s0.a(str);
        try {
            if (!this.F) {
                ironLog.error("Rewarded video was initialized in mediation mode. Use showRewardedVideo instead");
                iSDemandOnlyRewardedVideoListenerA.onRewardedVideoAdShowFailed(str, new com.json.mediationsdk.logger.IronSourceError(508, "Rewarded video was initialized in mediation mode. Use showRewardedVideo instead"));
                return;
            }
            com.json.mediationsdk.demandOnly.k kVar = this.i0;
            if (kVar != null) {
                kVar.b(str);
            } else {
                ironLog.error("Rewarded video was not initiated");
                iSDemandOnlyRewardedVideoListenerA.onRewardedVideoAdShowFailed(str, new com.json.mediationsdk.logger.IronSourceError(508, "Rewarded video was not initiated"));
            }
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.API.error(e.getMessage());
            if (iSDemandOnlyRewardedVideoListenerA != null) {
                iSDemandOnlyRewardedVideoListenerA.onRewardedVideoAdShowFailed(str, new com.json.mediationsdk.logger.IronSourceError(510, e.getMessage()));
            }
        }
    }

    public void a(java.lang.String str, java.util.List<java.lang.String> list) {
        com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.API;
        ironLog.verbose("key = " + str + ", values = " + list.toString());
        java.lang.String strCheckMetaDataKeyValidity = com.json.mediationsdk.metadata.MetaDataUtils.checkMetaDataKeyValidity(str);
        java.lang.String strCheckMetaDataValueValidity = com.json.mediationsdk.metadata.MetaDataUtils.checkMetaDataValueValidity(list);
        if (strCheckMetaDataKeyValidity.length() > 0) {
            ironLog.verbose(strCheckMetaDataKeyValidity);
            return;
        }
        if (strCheckMetaDataValueValidity.length() > 0) {
            ironLog.verbose(strCheckMetaDataValueValidity);
            return;
        }
        com.json.mediationsdk.metadata.MetaData metaData = com.json.mediationsdk.metadata.MetaDataUtils.formatMetaData(str, list);
        java.lang.String metaDataKey = metaData.getMetaDataKey();
        java.util.List<java.lang.String> metaDataValue = metaData.getMetaDataValue();
        if (!com.json.mediationsdk.metadata.MetaDataUtils.isMediationOnlyKey(metaDataKey)) {
            com.json.mediationsdk.c.b().a(metaDataKey, metaDataValue);
        } else if (C() && com.json.mediationsdk.metadata.MetaDataUtils.isMediationKeysBeforeInit(metaDataKey)) {
            ironLog.error("setMetaData with key = " + metaDataKey + " must to be called before init");
        } else {
            com.json.lk.b().a(metaDataKey, metaDataValue);
        }
        try {
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<java.lang.String>> concurrentHashMapC = com.json.mediationsdk.c.b().c();
            concurrentHashMapC.putAll(com.json.lk.b().c());
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> entry : concurrentHashMapC.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            this.m0.a(jSONObject);
            this.l0.a(jSONObject);
        } catch (org.json.JSONException e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error("got the following error " + e.getMessage());
        }
        com.json.wq.i().a(new com.json.wb(C() ? 51 : 50, com.json.mediationsdk.utils.IronSourceUtils.getJsonForMetaData(str, list, metaDataValue)));
    }

    public void a(java.lang.String str, org.json.JSONObject jSONObject) {
        if (com.json.ak.a((java.lang.Object) jSONObject, "setAdRevenueData - impressionData is null") && com.json.ak.a((java.lang.Object) str, "setAdRevenueData - dataSource is null")) {
            this.k0.a(str, jSONObject);
        }
    }

    @Override // com.json.io
    public void a(java.util.List<com.ironsource.mediationsdk.IronSource.AD_UNIT> list, boolean z, com.json.p8 p8Var) {
        b(list, z, p8Var);
    }

    @Override // com.json.uj
    public void a(java.util.Map<java.lang.String, java.lang.String> map) {
        if (map != null) {
            try {
                if (map.size() == 0) {
                    return;
                }
                this.h.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, this.f2999a + ":setRewardedVideoServerParameters(params:" + map.toString() + ")", 1);
                this.r = new java.util.HashMap(map);
            } catch (java.lang.Exception e) {
                com.json.l9.d().a(e);
                this.h.logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, this.f2999a + ":setRewardedVideoServerParameters(params:" + map.toString() + ")", e);
            }
        }
    }

    @Override // com.json.uj
    public void a(boolean z) {
        com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, "setAdaptersDebug : " + z, 1);
        com.json.mediationsdk.c.b().a(z);
    }

    boolean a(com.json.e7 e7Var) {
        return this.e.b(com.json.environment.ContextProvider.getInstance().getApplicationContext(), e7Var, com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER);
    }

    public boolean a(boolean z, com.json.hs hsVar) {
        if (C()) {
            return true;
        }
        synchronized (this.l) {
            this.m = hsVar;
        }
        return b(hsVar.g(), z, hsVar.c());
    }

    com.json.hs b(android.content.Context context, java.lang.String str, com.ironsource.mediationsdk.p.c cVar) {
        synchronized (this.l) {
            com.json.hs hsVar = this.m;
            if (hsVar != null) {
                return new com.json.hs(hsVar);
            }
            com.json.hs hsVarA = a(context, str, cVar);
            if (hsVarA == null || !hsVarA.p()) {
                com.json.mediationsdk.logger.IronSourceLoggerManager logger = com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger();
                com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag ironSourceTag = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL;
                logger.log(ironSourceTag, "Null or invalid response. Trying to get cached response", 0);
                hsVarA = a(context, n());
                if (hsVarA != null) {
                    this.h.log(ironSourceTag, com.json.mediationsdk.utils.ErrorBuilder.buildUsingCachedConfigurationError(n(), str).toString() + ": " + hsVarA.toString(), 1);
                    com.json.wq.i().a(new com.json.wb(140, com.json.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(false)));
                }
            }
            if (hsVarA != null) {
                this.m = hsVarA;
                com.json.mediationsdk.utils.IronSourceUtils.saveLastResponse(context, hsVarA.toString());
                b(this.m, context);
                com.json.jj.i().c(true);
                com.json.wq.i().c(true);
                com.json.ep.P.c(true);
            }
            return hsVarA;
        }
    }

    public com.json.mediationsdk.IronSourceBannerLayout b(android.app.Activity activity, com.json.mediationsdk.ISBannerSize iSBannerSize) {
        com.json.mediationsdk.logger.IronSourceLoggerManager ironSourceLoggerManager = this.h;
        com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag ironSourceTag = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "createBanner()", 1);
        if (activity == null) {
            this.h.log(ironSourceTag, "createBanner() : Activity cannot be null", 3);
            return null;
        }
        com.json.environment.ContextProvider.getInstance().updateActivity(activity);
        return new com.json.mediationsdk.IronSourceBannerLayout(activity, iSBannerSize);
    }

    @Override // com.json.uj
    public java.lang.String b(android.content.Context context) {
        java.lang.String strP = this.c.p(context);
        return !android.text.TextUtils.isEmpty(strP) ? strP : "";
    }

    @Override // com.json.uj
    public void b() {
        this.r = null;
    }

    public void b(android.app.Activity activity) {
        try {
            if (com.json.sdk.controller.FeaturesManager.getInstance().getStopUseOnResumeAndPause()) {
                return;
            }
            this.h.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, "onResume()", 1);
            com.json.environment.ContextProvider.getInstance().onResume(activity);
        } catch (java.lang.Throwable th) {
            com.json.l9.d().a(th);
            this.h.logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, "onResume()", th);
        }
    }

    @Override // com.ironsource.na.c
    public synchronized void b(android.app.Activity activity, java.lang.String str) {
        a(new com.ironsource.mediationsdk.demandOnly.h.c().b(str).a(activity, com.json.environment.ContextProvider.getInstance().getCurrentActiveActivity()).a(com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO).b(), this.s0.a(str));
    }

    @Override // com.ironsource.na.b
    public synchronized void b(android.app.Activity activity, java.lang.String str, java.lang.String str2) {
        a(new com.ironsource.mediationsdk.demandOnly.h.c().b(str).a(activity, com.json.environment.ContextProvider.getInstance().getCurrentActiveActivity()).a(com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL).a(true).a(str2).b(), this.r0.a(str));
    }

    public void b(com.json.hs hsVar, android.content.Context context) {
        a(hsVar);
        a(hsVar, context);
    }

    public void b(com.json.mediationsdk.IronSourceBannerLayout ironSourceBannerLayout) {
        a(ironSourceBannerLayout, "");
    }

    @Override // com.json.ei
    public void b(com.json.mediationsdk.impressionData.ImpressionDataListener impressionDataListener) {
        if (com.json.ak.a((java.lang.Object) impressionDataListener, "addImpressionDataListener - listener is null")) {
            com.json.lk.b().a(impressionDataListener);
            com.json.yf yfVar = this.Q;
            if (yfVar != null) {
                yfVar.b(impressionDataListener);
            }
            com.json.mediationsdk.w wVar = this.R;
            if (wVar != null) {
                wVar.b(impressionDataListener);
            }
            com.json.mediationsdk.logger.IronLog.API.info("add impression data listener to " + impressionDataListener.getClass().getSimpleName());
        }
    }

    @Override // com.ironsource.na.b
    public void b(java.lang.String str) {
        this.h.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, "showDemandOnlyInterstitial() instanceId=" + str, 1);
        com.json.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListenerA = this.r0.a(str);
        try {
            if (!this.G) {
                com.json.mediationsdk.logger.IronLog.API.error("Interstitial was initialized in mediation mode. Use showInterstitial instead");
                iSDemandOnlyInterstitialListenerA.onInterstitialAdShowFailed(str, new com.json.mediationsdk.logger.IronSourceError(508, "Interstitial was initialized in mediation mode. Use showInterstitial instead"));
                return;
            }
            com.json.mediationsdk.demandOnly.f fVar = this.h0;
            if (fVar != null) {
                fVar.a(str);
            } else {
                com.json.mediationsdk.logger.IronLog.API.error("Interstitial was not initiated");
                iSDemandOnlyInterstitialListenerA.onInterstitialAdShowFailed(str, new com.json.mediationsdk.logger.IronSourceError(508, "Interstitial was not initiated"));
            }
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.API.error(e.getMessage());
            if (iSDemandOnlyInterstitialListenerA != null) {
                iSDemandOnlyInterstitialListenerA.onInterstitialAdShowFailed(str, com.json.mediationsdk.utils.ErrorBuilder.buildInitFailedError("showISDemandOnlyInterstitial can't be called before the Interstitial ad unit initialization completed successfully", "Interstitial"));
            }
        }
    }

    public void b(java.lang.String str, org.json.JSONObject jSONObject) {
        com.json.mediationsdk.v vVar = new com.json.mediationsdk.v(str, jSONObject);
        com.json.mediationsdk.logger.IronLog.API.verbose(vVar.toString());
        com.json.mediationsdk.c.b().a(vVar);
    }

    public void b(boolean z) {
        this.P = java.lang.Boolean.valueOf(z);
        com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, "setConsent : " + z, 1);
        com.json.mediationsdk.c.b().b(z);
        this.l0.a(z);
        com.json.wq.i().a(new com.json.wb(z ? 40 : 41, com.json.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(false)));
    }

    @Override // com.json.uj
    public void c() {
        this.h.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, "removeRewardedVideoListener()", 1);
        com.json.zp.a().a((com.json.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener) null);
    }

    public void c(android.app.Activity activity) {
        com.json.mediationsdk.logger.IronSourceLoggerManager ironSourceLoggerManager = this.h;
        com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag ironSourceTag = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "showInterstitial()", 1);
        try {
            if (this.G) {
                this.h.log(ironSourceTag, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead", 3);
                com.json.ng.a().a(new com.json.mediationsdk.logger.IronSourceError(510, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead"), (com.json.mediationsdk.adunit.adapter.utility.AdInfo) null);
            } else {
                if (!D()) {
                    com.json.ng.a().a(com.json.mediationsdk.utils.ErrorBuilder.buildInitFailedError("showInterstitial can't be called before the Interstitial ad unit initialization completed successfully", "Interstitial"), (com.json.mediationsdk.adunit.adapter.utility.AdInfo) null);
                    return;
                }
                com.json.mediationsdk.model.InterstitialPlacement interstitialPlacementI = i();
                if (interstitialPlacementI != null) {
                    c(activity, interstitialPlacementI.getCom.ironsource.op.d java.lang.String());
                } else {
                    com.json.ng.a().a(new com.json.mediationsdk.logger.IronSourceError(1020, "showInterstitial error: empty default placement in response"), (com.json.mediationsdk.adunit.adapter.utility.AdInfo) null);
                }
            }
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            this.h.logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, "showInterstitial()", e);
            com.json.ng.a().a(new com.json.mediationsdk.logger.IronSourceError(510, e.getMessage()), (com.json.mediationsdk.adunit.adapter.utility.AdInfo) null);
        }
    }

    public void c(android.app.Activity activity, java.lang.String str) {
        java.lang.String str2 = "showInterstitial(" + str + ")";
        com.json.mediationsdk.logger.IronSourceLoggerManager ironSourceLoggerManager = this.h;
        com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag ironSourceTag = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, str2, 1);
        try {
            if (this.G) {
                this.h.log(ironSourceTag, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead", 3);
                com.json.ng.a().a(new com.json.mediationsdk.logger.IronSourceError(510, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead"), (com.json.mediationsdk.adunit.adapter.utility.AdInfo) null);
            } else if (D()) {
                d(activity, str);
            } else {
                com.json.ng.a().a(com.json.mediationsdk.utils.ErrorBuilder.buildInitFailedError("showInterstitial can't be called before the Interstitial ad unit initialization completed successfully", "Interstitial"), (com.json.mediationsdk.adunit.adapter.utility.AdInfo) null);
            }
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            this.h.logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, str2, e);
            com.json.ng.a().a(new com.json.mediationsdk.logger.IronSourceError(510, e.getMessage()), (com.json.mediationsdk.adunit.adapter.utility.AdInfo) null);
        }
    }

    public void c(android.content.Context context) {
        com.json.vt vtVar = com.json.vt.f3518a;
        vtVar.b();
        if (!C()) {
            vtVar.a(com.json.mediationsdk.utils.IronSourceConstants.errorCode_TEST_SUITE_SDK_NOT_INITIALIZED);
            com.json.mediationsdk.logger.IronLog.API.error("TestSuite cannot be launched, SDK not initialized");
            return;
        }
        if (!b(this.m)) {
            vtVar.a(com.json.mediationsdk.utils.IronSourceConstants.errorCode_TEST_SUITE_DISABLED);
            com.json.mediationsdk.logger.IronLog.API.error("TestSuite cannot be launched, Please contact your account manager to enable it");
            return;
        }
        if (!com.json.mediationsdk.utils.IronSourceUtils.isNetworkConnected(context)) {
            vtVar.a(com.json.mediationsdk.utils.IronSourceConstants.errorCode_TEST_SUITE_NO_NETWORK_CONNECTIVITY);
            com.json.mediationsdk.logger.IronLog.API.error("TestSuite cannot be launched, No network connectivity");
            return;
        }
        com.json.cj cjVar = this.S;
        if (cjVar != null) {
            cjVar.J();
        }
        com.json.rq rqVar = this.T;
        if (rqVar != null) {
            rqVar.J();
        }
        com.json.d6 d6Var = this.U;
        if (d6Var != null) {
            d6Var.J();
            this.U.T();
        }
        new com.json.wt().a(context, n(), this.m.i(), com.json.mediationsdk.utils.IronSourceUtils.getSDKVersion(), this.m.c().getTestSuiteSettings().b(), g(), this.Y);
        this.n0 = true;
        vtVar.c();
    }

    @Override // com.ironsource.na.a
    public void c(java.lang.String str) {
        this.h.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, "destroyBanner()", 1);
        try {
            com.json.mediationsdk.demandOnly.c cVar = this.j0;
            if (cVar != null) {
                cVar.a(str);
            }
        } catch (java.lang.Throwable th) {
            com.json.l9.d().a(th);
            this.h.logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, "destroyISDemandOnlyBanner()", th);
        }
    }

    @Override // com.json.uj
    public void d() {
        this.h.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, "removeInterstitialListener()", 1);
        com.json.ng.a().a((com.json.mediationsdk.sdk.LevelPlayInterstitialListener) null);
    }

    public void d(android.app.Activity activity) {
        if (!L()) {
            com.json.zp.a().a(com.json.mediationsdk.utils.ErrorBuilder.buildInitFailedError("showRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", com.json.mediationsdk.utils.IronSourceConstants.REWARDED_VIDEO_AD_UNIT), (com.json.mediationsdk.adunit.adapter.utility.AdInfo) null);
            this.h.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL, "showRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", 3);
            return;
        }
        com.json.mediationsdk.model.Placement placementJ = j();
        if (placementJ != null) {
            f(activity, placementJ.getCom.ironsource.op.d java.lang.String());
            return;
        }
        this.h.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL, "showRewardedVideo error: empty default placement in response", 3);
        com.json.zp.a().a(new com.json.mediationsdk.logger.IronSourceError(1021, "showRewardedVideo error: empty default placement in response"), (com.json.mediationsdk.adunit.adapter.utility.AdInfo) null);
    }

    @Override // com.json.io
    public void d(java.lang.String str) {
        try {
            this.h.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, "onInitFailed(reason:" + str + ")", 1);
            com.json.mediationsdk.utils.IronSourceUtils.sendAutomationLog("Mediation init failed");
            if (this.i != null) {
                java.util.Iterator<com.ironsource.mediationsdk.IronSource.AD_UNIT> it = this.z.iterator();
                while (it.hasNext()) {
                    a(it.next(), true);
                }
            }
            com.json.ao aoVarR = r();
            if (aoVarR != null) {
                aoVarR.onInitFailed(new com.json.mediationsdk.logger.IronSourceError(com.json.mediationsdk.logger.IronSourceError.ERROR_LEGACY_INIT_FAILED, "Legacy init failed"));
            }
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002a  */
    public java.lang.String e() {
        java.lang.String str;
        if (this.L) {
            com.json.mediationsdk.s sVarC = com.json.mediationsdk.s.c();
            int i = com.ironsource.mediationsdk.p.b.b[sVarC.a().ordinal()];
            if (i == 1) {
                str = "init() had failed";
            } else if (i != 2) {
                str = "";
            } else if (sVarC.d()) {
                str = "init() had failed";
            } else {
                str = "init() not finished yet";
            }
        } else {
            str = "init() must be called first";
        }
        return (I() || !str.isEmpty()) ? str : "No Native Ad configurations found";
    }

    @Override // com.json.uj
    public boolean e(java.lang.String str) {
        try {
            java.lang.String str2 = this.f2999a + ":setDynamicUserId(dynamicUserId:" + str + ")";
            com.json.mediationsdk.logger.IronSourceLoggerManager ironSourceLoggerManager = this.h;
            com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag ironSourceTag = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.log(ironSourceTag, str2, 1);
            com.json.o8 o8Var = new com.json.o8();
            a(str, o8Var);
            if (!o8Var.b()) {
                com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(ironSourceTag, o8Var.a().toString(), 2);
                return false;
            }
            this.q = str;
            com.json.wq.i().a(new com.json.wb(52, com.json.mediationsdk.utils.IronSourceUtils.getJsonForUserId(true)));
            return true;
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            this.h.logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, this.f2999a + ":setDynamicUserId(dynamicUserId:" + str + ")", e);
            return false;
        }
    }

    public com.json.wm f() {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose();
        java.util.List<com.json.mediationsdk.model.NetworkSettings> listA = a(this.m.j().c());
        if (listA.size() > 0) {
            return new com.json.wm(listA, this.m.c().getNativeAdConfigurations(), com.json.mediationsdk.utils.IronSourceUtils.getUserIdForNetworks(), com.json.lk.b(), this.C);
        }
        org.json.JSONObject mediationAdditionalData = com.json.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(false, true, 1);
        a(mediationAdditionalData, new java.lang.Object[][]{new java.lang.Object[]{com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
        a(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_NT_INIT_FAILED, mediationAdditionalData);
        return null;
    }

    public void f(android.app.Activity activity, java.lang.String str) {
        java.lang.String str2 = "showRewardedVideo(" + str + ")";
        com.json.mediationsdk.logger.IronSourceLoggerManager ironSourceLoggerManager = this.h;
        com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag ironSourceTag = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, str2, 1);
        try {
            if (this.F) {
                this.h.log(ironSourceTag, "Rewarded Video was initialized in demand only mode. Use showISDemandOnlyRewardedVideo instead", 3);
                com.json.zp.a().a(com.json.mediationsdk.utils.ErrorBuilder.buildInitFailedError("Rewarded Video was initialized in demand only mode. Use showISDemandOnlyRewardedVideo instead", com.json.mediationsdk.utils.IronSourceConstants.REWARDED_VIDEO_AD_UNIT), (com.json.mediationsdk.adunit.adapter.utility.AdInfo) null);
            } else if (L()) {
                e(activity, str);
            } else {
                com.json.zp.a().a(com.json.mediationsdk.utils.ErrorBuilder.buildInitFailedError("showRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", com.json.mediationsdk.utils.IronSourceConstants.REWARDED_VIDEO_AD_UNIT), (com.json.mediationsdk.adunit.adapter.utility.AdInfo) null);
            }
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            this.h.logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, str2, e);
            com.json.zp.a().a(new com.json.mediationsdk.logger.IronSourceError(510, e.getMessage()), (com.json.mediationsdk.adunit.adapter.utility.AdInfo) null);
        }
    }

    @Override // com.ironsource.na.b
    public synchronized boolean f(java.lang.String str) {
        com.json.mediationsdk.demandOnly.f fVar;
        fVar = this.h0;
        return fVar != null && fVar.b(str);
    }

    @Override // com.json.uj
    public com.json.mediationsdk.model.InterstitialPlacement g(java.lang.String str) {
        com.json.mediationsdk.model.InterstitialPlacement interstitialPlacementM;
        try {
            interstitialPlacementM = m(str);
            if (interstitialPlacementM == null) {
                try {
                    this.h.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 2);
                    interstitialPlacementM = i();
                } catch (java.lang.Exception e) {
                    e = e;
                    com.json.l9.d().a(e);
                }
            }
            this.h.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, "getPlacementInfo(placement: " + str + "):" + interstitialPlacementM, 1);
        } catch (java.lang.Exception e2) {
            e = e2;
            interstitialPlacementM = null;
        }
        return interstitialPlacementM;
    }

    java.lang.Boolean g() {
        return this.P;
    }

    public com.json.hs h() {
        return this.m;
    }

    @Override // com.json.uj
    public void h(java.lang.String str) {
        try {
            java.lang.String str2 = this.f2999a + ":setMediationType(mediationType:" + str + ")";
            com.json.mediationsdk.logger.IronSourceLoggerManager ironSourceLoggerManager = this.h;
            com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag ironSourceTag = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL;
            ironSourceLoggerManager.log(ironSourceTag, str2, 1);
            if (a(str, 1, 64) && u(str)) {
                this.s = str;
                this.l0.e(str);
            } else {
                this.h.log(ironSourceTag, " mediationType value is invalid - should be alphanumeric and 1-64 chars in length", 1);
            }
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            this.h.logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, this.f2999a + ":setMediationType(mediationType:" + str + ")", e);
        }
    }

    @Override // com.json.uj
    public com.json.mediationsdk.model.Placement i(java.lang.String str) {
        com.json.mediationsdk.model.Placement placementP;
        try {
            placementP = p(str);
            if (placementP == null) {
                try {
                    this.h.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 2);
                    placementP = j();
                } catch (java.lang.Exception e) {
                    e = e;
                    com.json.l9.d().a(e);
                }
            }
            this.h.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, "getPlacementInfo(placement: " + str + "):" + placementP, 1);
        } catch (java.lang.Exception e2) {
            e = e2;
            placementP = null;
        }
        return placementP;
    }

    @Override // com.ironsource.na.c
    public synchronized boolean j(java.lang.String str) {
        com.json.mediationsdk.demandOnly.k kVar;
        kVar = this.i0;
        return kVar != null && kVar.a(str);
    }

    public java.lang.String l() {
        return this.q;
    }

    public com.json.ym n(java.lang.String str) {
        com.json.ym ymVarA;
        com.json.nm nmVarE = this.m.c().getNativeAdConfigurations();
        if (nmVarE == null) {
            return null;
        }
        return (android.text.TextUtils.isEmpty(str) || (ymVarA = nmVarE.a(str)) == null) ? nmVarE.e() : ymVarA;
    }

    public java.lang.String n() {
        return this.n;
    }

    public java.lang.String o() {
        return this.o;
    }

    public java.util.List<com.ironsource.mediationsdk.IronSource.AD_UNIT> p() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Set<com.ironsource.mediationsdk.IronSource.AD_UNIT> set = this.z;
        if (set != null) {
            arrayList.addAll(set);
        }
        return arrayList;
    }

    public java.lang.String q() {
        return this.s;
    }

    boolean q(java.lang.String str) {
        if (!y()) {
            return false;
        }
        com.json.e7 e7VarA = null;
        try {
            e7VarA = this.m.c().getBannerConfigurations().a(str);
            if (e7VarA == null && (e7VarA = this.m.c().getBannerConfigurations().i()) == null) {
                this.h.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, "Banner default placement was not found", 3);
                return false;
            }
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
        if (e7VarA == null) {
            return false;
        }
        return a(e7VarA);
    }

    boolean r(java.lang.String str) {
        if (this.G) {
            return false;
        }
        boolean z = l(str) != com.ironsource.kp.b.NOT_CAPPED;
        if (z) {
            org.json.JSONObject mediationAdditionalData = com.json.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(this.G, true, 1);
            try {
                mediationAdditionalData.put("placement", str);
                mediationAdditionalData.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
            } catch (java.lang.Exception e) {
                com.json.l9.d().a(e);
            }
            com.json.jj.i().a(new com.json.wb(com.json.mediationsdk.utils.IronSourceConstants.IS_CHECK_CAPPED_TRUE, mediationAdditionalData));
        }
        return z;
    }

    public java.util.Map<java.lang.String, java.lang.String> s() {
        return this.r;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0017  */
    boolean s(java.lang.String str) {
        boolean z;
        com.ironsource.kp.b bVarO = o(str);
        if (bVarO != null) {
            int i = com.ironsource.mediationsdk.p.b.c[bVarO.ordinal()];
            z = true;
            if (i != 1 && i != 2 && i != 3) {
                z = false;
            }
        } else {
            z = false;
        }
        a(z, str);
        return z;
    }

    public com.json.mediationsdk.IronSourceSegment t() {
        return this.C;
    }

    public void t(java.lang.String str) {
        com.json.mediationsdk.logger.IronLog.API.verbose("userId = " + str);
        this.o = str;
        com.json.wq.i().a(new com.json.wb(52, com.json.mediationsdk.utils.IronSourceUtils.getJsonForUserId(false)));
        com.json.mediationsdk.adquality.AdQualityBridge adQualityBridge = this.o0;
        if (adQualityBridge != null) {
            adQualityBridge.changeUserId(str);
        }
    }

    public java.lang.String u() {
        return this.w;
    }
}

package com.json.mediationsdk;

/* JADX INFO: loaded from: classes5.dex */
class s implements com.json.zn {
    private static com.json.mediationsdk.s A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.json.ks f3010a;
    private com.json.environment.NetworkStateReceiver p;
    private android.os.CountDownTimer q;
    private java.lang.String t;
    private com.json.hs u;
    private com.json.mediationsdk.sdk.SegmentListener v;
    private long x;
    private int b = com.ironsource.mediationsdk.s.e.f;
    private com.json.xe c = com.json.im.S().v();
    private final java.lang.String d = "appKey";
    private final java.lang.String e = getClass().getSimpleName();
    private boolean l = false;
    private boolean n = false;
    private java.util.List<com.json.io> r = new java.util.ArrayList();
    private java.lang.String s = "";
    private com.ironsource.mediationsdk.s.f z = new com.ironsource.mediationsdk.s.a();
    private android.os.Handler m = com.json.environment.thread.IronSourceThreadManager.INSTANCE.getInitHandler();
    private int f = 1;
    private int g = 0;
    private int h = 62;
    private int i = 12;
    private int j = 5;
    private java.util.concurrent.atomic.AtomicBoolean o = new java.util.concurrent.atomic.AtomicBoolean(true);
    private boolean k = false;
    private boolean w = false;
    private com.json.vj y = new com.json.vj();

    class a extends com.ironsource.mediationsdk.s.f {
        a() {
            super();
        }

        @Override // java.lang.Runnable
        public void run() {
            com.json.is isVarI;
            try {
                com.json.mediationsdk.p pVarM = com.json.mediationsdk.p.m();
                if (!android.text.TextUtils.isEmpty(com.json.mediationsdk.s.this.s)) {
                    com.json.zd.a().a("userId", com.json.mediationsdk.s.this.s);
                }
                if (!android.text.TextUtils.isEmpty(com.json.mediationsdk.s.this.t)) {
                    com.json.zd.a().a("appKey", com.json.mediationsdk.s.this.t);
                }
                com.json.mediationsdk.s.this.y.i(com.json.mediationsdk.s.this.s);
                com.json.mediationsdk.s.this.x = new java.util.Date().getTime();
                com.json.yp.c().a();
                com.json.mediationsdk.s.this.u = pVarM.b(com.json.environment.ContextProvider.getInstance().getApplicationContext(), com.json.mediationsdk.s.this.s, this.c);
                if (com.json.mediationsdk.s.this.u != null) {
                    com.json.mediationsdk.s.this.m.removeCallbacks(this);
                    if (com.json.mediationsdk.s.this.u.p()) {
                        com.json.mediationsdk.s.this.b(com.ironsource.mediationsdk.s.d.INITIATED);
                        new com.json.jm().a(com.json.mediationsdk.s.this.u.c().getApplicationConfigurations().d().b(), pVarM.B());
                        com.json.h4 h4VarE = com.json.mediationsdk.s.this.u.c().getApplicationConfigurations().e();
                        if (h4VarE != null) {
                            com.json.ua uaVar = com.json.ua.f3466a;
                            uaVar.c(h4VarE.getShouldUseAppSet());
                            uaVar.a(h4VarE.getShouldReuseAdvId());
                            uaVar.a(h4VarE.getUserAgentExpirationThresholdInHours());
                            com.json.environment.thread.IronSourceThreadManager.INSTANCE.setUseSharedExecutorService(h4VarE.getShouldUseSharedThreadPool());
                            com.json.mediationsdk.s.this.c.a(h4VarE);
                        }
                        com.json.mediationsdk.s.this.a(com.json.environment.ContextProvider.getInstance().getApplicationContext(), com.json.mediationsdk.s.this.u);
                        pVarM.a(new java.util.Date().getTime() - com.json.mediationsdk.s.this.x, com.json.mediationsdk.s.this.u.h());
                        if (h4VarE != null && h4VarE.getShouldRegisterTrigger()) {
                            new com.json.aq(com.json.wq.i(), new kotlin.jvm.functions.Function0() { // from class: com.ironsource.mediationsdk.s$a$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
                                }
                            }, com.json.im.S(), com.json.environment.thread.IronSourceThreadManager.INSTANCE.getThreadPoolExecutor()).c(com.json.environment.ContextProvider.getInstance().getApplicationContext());
                        }
                        com.json.mediationsdk.s.this.f3010a = new com.json.ks();
                        com.json.mediationsdk.s.this.f3010a.a(com.json.mediationsdk.s.this.c);
                        if (com.json.mediationsdk.s.this.u.c().getApplicationConfigurations().f() && com.json.environment.ContextProvider.getInstance().getApplicationContext() != null) {
                            com.json.mediationsdk.integration.IntegrationHelper.validateIntegration(com.json.environment.ContextProvider.getInstance().getApplicationContext());
                        }
                        java.util.List<com.ironsource.mediationsdk.IronSource.AD_UNIT> listG = com.json.mediationsdk.s.this.u.g();
                        java.util.Iterator it = com.json.mediationsdk.s.this.r.iterator();
                        while (it.hasNext()) {
                            ((com.json.io) it.next()).a(listG, com.json.mediationsdk.s.this.h(), com.json.mediationsdk.s.this.u.c());
                        }
                        new com.ironsource.ep.a().a();
                        if (com.json.mediationsdk.s.this.v != null && (isVarI = com.json.mediationsdk.s.this.u.c().getApplicationConfigurations().i()) != null && !android.text.TextUtils.isEmpty(isVarI.c())) {
                            com.json.mediationsdk.s.this.v.onSegmentReceived(isVarI.c());
                        }
                        com.json.b4 b4VarC = com.json.mediationsdk.s.this.u.c().getApplicationConfigurations().c();
                        if (b4VarC.f()) {
                            com.json.l9.d().a(b4VarC.b(), b4VarC.d(), b4VarC.c(), b4VarC.e(), com.json.mediationsdk.utils.IronSourceUtils.getSessionId(), b4VarC.a(), b4VarC.g());
                        }
                    } else if (!com.json.mediationsdk.s.this.l) {
                        com.json.mediationsdk.s.this.b(com.ironsource.mediationsdk.s.d.INIT_FAILED);
                        com.json.mediationsdk.s.this.l = true;
                        java.util.Iterator it2 = com.json.mediationsdk.s.this.r.iterator();
                        while (it2.hasNext()) {
                            ((com.json.io) it2.next()).d("serverResponseIsNotValid");
                        }
                    }
                } else {
                    if (com.json.mediationsdk.s.this.g == 3) {
                        com.json.mediationsdk.s.this.w = true;
                        java.util.Iterator it3 = com.json.mediationsdk.s.this.r.iterator();
                        while (it3.hasNext()) {
                            ((com.json.io) it3.next()).a();
                        }
                    }
                    if (this.f3016a && com.json.mediationsdk.s.this.g < com.json.mediationsdk.s.this.h) {
                        com.json.mediationsdk.s.this.k = true;
                        com.json.mediationsdk.s.this.m.postDelayed(this, com.json.mediationsdk.s.this.f * 1000);
                        if (com.json.mediationsdk.s.this.g < com.json.mediationsdk.s.this.i) {
                            com.json.mediationsdk.s.a(com.json.mediationsdk.s.this, 2);
                        }
                    }
                    if ((!this.f3016a || com.json.mediationsdk.s.this.g == com.json.mediationsdk.s.this.j) && !com.json.mediationsdk.s.this.l) {
                        com.json.mediationsdk.s.this.l = true;
                        if (android.text.TextUtils.isEmpty(this.b)) {
                            this.b = "noServerResponse";
                        }
                        java.util.Iterator it4 = com.json.mediationsdk.s.this.r.iterator();
                        while (it4.hasNext()) {
                            ((com.json.io) it4.next()).d(this.b);
                        }
                        com.json.mediationsdk.s.this.b(com.ironsource.mediationsdk.s.d.INIT_FAILED);
                        com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, "Mediation availability false reason: No server response", 1);
                    }
                    com.json.mediationsdk.s.f(com.json.mediationsdk.s.this);
                }
                com.json.mediationsdk.s.this.e();
            } catch (java.lang.Exception e) {
                com.json.l9.d().a(e);
                com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            }
        }
    }

    class b implements java.lang.Runnable {

        class a extends android.os.CountDownTimer {
            a(long j, long j2) {
                super(j, j2);
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                if (com.json.mediationsdk.s.this.l) {
                    return;
                }
                com.json.mediationsdk.s.this.l = true;
                java.util.Iterator it = com.json.mediationsdk.s.this.r.iterator();
                while (it.hasNext()) {
                    ((com.json.io) it.next()).d("noInternetConnection");
                }
                com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, "Mediation availability false reason: No internet connection", 1);
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j) {
                if (j <= 45000) {
                    com.json.mediationsdk.s.this.w = true;
                    java.util.Iterator it = com.json.mediationsdk.s.this.r.iterator();
                    while (it.hasNext()) {
                        ((com.json.io) it.next()).a();
                    }
                }
            }
        }

        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.json.mediationsdk.s.this.q = new com.ironsource.mediationsdk.s.b.a(60000L, androidx.media3.common.C.DEFAULT_SEEK_FORWARD_INCREMENT_MS).start();
        }
    }

    static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3013a;

        static {
            int[] iArr = new int[com.ironsource.mediationsdk.s.d.values().length];
            f3013a = iArr;
            try {
                iArr[com.ironsource.mediationsdk.s.d.INIT_IN_PROGRESS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f3013a[com.ironsource.mediationsdk.s.d.INIT_FAILED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f3013a[com.ironsource.mediationsdk.s.d.INITIATED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    enum d {
        NOT_INIT,
        INIT_IN_PROGRESS,
        INIT_FAILED,
        INITIATED
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f3015a = 0;
        public static int b = 1;
        public static int c = 2;
        public static int d = 3;
        public static int e = 4;
        public static int f = 5;
    }

    abstract class f implements java.lang.Runnable {
        java.lang.String b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f3016a = true;
        protected com.ironsource.mediationsdk.p.c c = new com.ironsource.mediationsdk.s.f.a();

        class a implements com.ironsource.mediationsdk.p.c {
            a() {
            }

            @Override // com.ironsource.mediationsdk.p.c
            public void a(java.lang.String str) {
                com.ironsource.mediationsdk.s.f fVar = com.ironsource.mediationsdk.s.f.this;
                fVar.f3016a = false;
                fVar.b = str;
            }
        }

        f() {
        }
    }

    private s() {
    }

    private static int a(com.ironsource.mediationsdk.s.d dVar) {
        int i = com.ironsource.mediationsdk.s.c.f3013a[dVar.ordinal()];
        if (i == 1) {
            return com.ironsource.mediationsdk.s.e.d;
        }
        if (i != 2) {
            return i != 3 ? com.ironsource.mediationsdk.s.e.f3015a : com.ironsource.mediationsdk.s.e.b;
        }
        return com.ironsource.mediationsdk.s.e.e;
    }

    static /* synthetic */ int a(com.json.mediationsdk.s sVar, int i) {
        int i2 = sVar.f * i;
        sVar.f = i2;
        return i2;
    }

    public static synchronized com.json.mediationsdk.s c() {
        if (A == null) {
            A = new com.json.mediationsdk.s();
        }
        return A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (com.json.im.S().d().f()) {
            com.json.wq.i().a(new com.json.wb(com.json.mediationsdk.utils.IronSourceConstants.EP_CONFIG_RECEIVED, null));
        }
    }

    static /* synthetic */ int f(com.json.mediationsdk.s sVar) {
        int i = sVar.g;
        sVar.g = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h() {
        return this.k;
    }

    public synchronized com.ironsource.mediationsdk.s.d a() {
        return com.ironsource.mediationsdk.s.d.values()[com.json.wr.f3542a.a().ordinal()];
    }

    public void a(android.content.Context context, com.json.hs hsVar) {
        this.y.i(hsVar.f().h());
        this.y.b(hsVar.f().d());
        com.json.x3 applicationConfigurations = hsVar.c().getApplicationConfigurations();
        this.y.a(applicationConfigurations.a());
        this.y.c(applicationConfigurations.b().b());
        this.y.b(applicationConfigurations.j().b());
        this.y.a(java.lang.Boolean.valueOf(com.json.mediationsdk.utils.IronSourceUtils.getFirstSession(context)));
        com.json.h4 h4VarE = hsVar.c().getApplicationConfigurations().e();
        this.y.b(h4VarE.getCmpId());
        com.json.im.M().x().a(h4VarE.getEpConfig());
    }

    public synchronized void a(android.content.Context context, java.lang.String str, java.lang.String str2, com.ironsource.mediationsdk.IronSource.AD_UNIT... ad_unitArr) {
        try {
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.o;
            if (atomicBoolean == null || !atomicBoolean.compareAndSet(true, false)) {
                com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, this.e + ": Multiple calls to init are not allowed", 2);
            } else {
                b(com.ironsource.mediationsdk.s.d.INIT_IN_PROGRESS);
                this.s = str2;
                this.t = str;
                if (com.json.mediationsdk.utils.IronSourceUtils.isNetworkConnected(context)) {
                    this.m.post(this.z);
                } else {
                    this.n = true;
                    if (this.p == null) {
                        this.p = new com.json.environment.NetworkStateReceiver(context, this);
                    }
                    context.registerReceiver(this.p, new android.content.IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    com.json.environment.thread.IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new com.ironsource.mediationsdk.s.b());
                }
            }
        } catch (java.lang.Exception e2) {
            com.json.l9.d().a(e2);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
        }
    }

    public void a(com.json.io ioVar) {
        if (ioVar == null) {
            return;
        }
        this.r.add(ioVar);
    }

    public void a(com.json.mediationsdk.sdk.SegmentListener segmentListener) {
        this.v = segmentListener;
    }

    @Override // com.json.zn
    public void a(boolean z) {
        if (this.n && z) {
            android.os.CountDownTimer countDownTimer = this.q;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            this.n = false;
            this.k = true;
            com.json.wq.i().a(new com.json.wb(com.json.mediationsdk.utils.IronSourceConstants.INIT_AFTER_REACHABILITY_CHANGE, com.json.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(false)));
            this.m.post(this.z);
        }
    }

    public int b() {
        return this.b;
    }

    public void b(com.json.io ioVar) {
        if (ioVar == null || this.r.size() == 0) {
            return;
        }
        this.r.remove(ioVar);
    }

    public synchronized void b(com.ironsource.mediationsdk.s.d dVar) {
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("old status: " + a() + ", new status: " + dVar + ")");
        com.json.wr.f3542a.a(com.json.vr.values()[dVar.ordinal()]);
    }

    public synchronized boolean d() {
        return this.w;
    }

    void f() {
        b(com.ironsource.mediationsdk.s.d.INIT_FAILED);
    }

    public synchronized void g() {
        int iA = a(a());
        this.b = iA;
        this.y.c(iA);
    }
}

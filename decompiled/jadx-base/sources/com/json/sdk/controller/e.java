package com.json.sdk.controller;

/* JADX INFO: loaded from: classes5.dex */
public class e implements com.json.sdk.controller.c, com.json.sdk.controller.l {
    private com.json.sdk.controller.l b;
    private android.os.CountDownTimer d;
    private final com.json.cg g;
    private final com.json.ew h;
    private final com.json.ln k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f3294a = "e";
    private com.ironsource.zg.b c = com.ironsource.zg.b.None;
    private final com.json.n8 e = new com.json.n8("NativeCommandExecutor");
    private final com.json.n8 f = new com.json.n8("ControllerCommandsExecutor");
    private final java.util.Map<java.lang.String, com.ironsource.sdk.controller.l.a> i = new java.util.HashMap();
    private final java.util.Map<java.lang.String, com.ironsource.sdk.controller.l.b> j = new java.util.HashMap();

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ org.json.JSONObject f3295a;
        final /* synthetic */ com.json.r9 b;

        a(org.json.JSONObject jSONObject, com.json.r9 r9Var) {
            this.f3295a = jSONObject;
            this.b = r9Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.json.sdk.controller.e.this.b != null) {
                com.json.sdk.controller.e.this.b.a(this.f3295a, this.b);
            }
        }
    }

    class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.sa f3296a;
        final /* synthetic */ java.util.Map b;
        final /* synthetic */ com.json.r9 c;

        b(com.json.sa saVar, java.util.Map map, com.json.r9 r9Var) {
            this.f3296a = saVar;
            this.b = map;
            this.c = r9Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.json.sdk.controller.e.this.b != null) {
                com.json.sdk.controller.e.this.b.a(this.f3296a, this.b, this.c);
            }
        }
    }

    class c implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f3297a;
        final /* synthetic */ java.lang.String b;
        final /* synthetic */ com.json.sa c;
        final /* synthetic */ com.json.q9 d;

        c(java.lang.String str, java.lang.String str2, com.json.sa saVar, com.json.q9 q9Var) {
            this.f3297a = str;
            this.b = str2;
            this.c = saVar;
            this.d = q9Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.json.sdk.controller.e.this.b != null) {
                com.json.sdk.controller.e.this.b.a(this.f3297a, this.b, this.c, this.d);
            }
        }
    }

    class d implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ org.json.JSONObject f3298a;
        final /* synthetic */ com.json.q9 b;

        d(org.json.JSONObject jSONObject, com.json.q9 q9Var) {
            this.f3298a = jSONObject;
            this.b = q9Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.json.sdk.controller.e.this.b != null) {
                com.json.sdk.controller.e.this.b.a(this.f3298a, this.b);
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.e$e, reason: collision with other inner class name */
    class RunnableC0246e implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.sa f3299a;

        RunnableC0246e(com.json.sa saVar) {
            this.f3299a = saVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.json.sdk.controller.e.this.b != null) {
                com.json.sdk.controller.e.this.b.a(this.f3299a);
            }
        }
    }

    class f implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.sa f3300a;

        f(com.json.sa saVar) {
            this.f3300a = saVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.json.sdk.controller.e.this.b != null) {
                com.json.sdk.controller.e.this.b.b(this.f3300a);
            }
        }
    }

    class g implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.sa f3301a;
        final /* synthetic */ java.util.Map b;
        final /* synthetic */ com.json.q9 c;

        g(com.json.sa saVar, java.util.Map map, com.json.q9 q9Var) {
            this.f3301a = saVar;
            this.b = map;
            this.c = q9Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.json.sdk.controller.e.this.b != null) {
                com.json.sdk.controller.e.this.b.a(this.f3301a, this.b, this.c);
            }
        }
    }

    class h implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.sdk.controller.l.a f3302a;
        final /* synthetic */ com.ironsource.sdk.controller.f.c b;

        h(com.ironsource.sdk.controller.l.a aVar, com.ironsource.sdk.controller.f.c cVar) {
            this.f3302a = aVar;
            this.b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.json.sdk.controller.e.this.b != null) {
                if (this.f3302a != null) {
                    com.json.sdk.controller.e.this.i.put(this.b.getCom.ironsource.sdk.controller.f.b.b java.lang.String(), this.f3302a);
                }
                com.json.sdk.controller.e.this.b.a(this.b, this.f3302a);
            }
        }
    }

    class i implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ org.json.JSONObject f3303a;

        i(org.json.JSONObject jSONObject) {
            this.f3303a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.json.sdk.controller.e.this.b != null) {
                com.json.sdk.controller.e.this.b.b(this.f3303a);
            }
        }
    }

    class j implements java.lang.Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.json.sdk.controller.e.this.b != null) {
                com.json.sdk.controller.e.this.b.destroy();
                com.json.sdk.controller.e.this.b = null;
            }
        }
    }

    class k extends android.os.CountDownTimer {
        k(long j, long j2) {
            super(j, j2);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            com.json.sdk.utils.Logger.i(com.json.sdk.controller.e.this.f3294a, "Global Controller Timer Finish");
            com.json.sdk.controller.e.this.d(com.ironsource.y8.c.k);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            com.json.sdk.utils.Logger.i(com.json.sdk.controller.e.this.f3294a, "Global Controller Timer Tick " + j);
        }
    }

    class l implements java.lang.Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.json.sdk.controller.e.this.c();
        }
    }

    class m implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f3307a;
        final /* synthetic */ java.lang.String b;

        m(java.lang.String str, java.lang.String str2) {
            this.f3307a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.json.sdk.controller.e eVar = com.json.sdk.controller.e.this;
                eVar.b = eVar.b(eVar.h.b(), com.json.sdk.controller.e.this.h.d(), com.json.sdk.controller.e.this.h.f(), com.json.sdk.controller.e.this.h.e(), com.json.sdk.controller.e.this.h.g(), com.json.sdk.controller.e.this.h.c(), this.f3307a, this.b);
                com.json.sdk.controller.e.this.b.a();
            } catch (java.lang.Throwable th) {
                com.json.l9.d().a(th);
                com.json.sdk.controller.e.this.d(android.util.Log.getStackTraceString(th));
            }
        }
    }

    class n extends android.os.CountDownTimer {
        n(long j, long j2) {
            super(j, j2);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            com.json.sdk.utils.Logger.i(com.json.sdk.controller.e.this.f3294a, "Recovered Controller | Global Controller Timer Finish");
            com.json.sdk.controller.e.this.d(com.ironsource.y8.c.k);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            com.json.sdk.utils.Logger.i(com.json.sdk.controller.e.this.f3294a, "Recovered Controller | Global Controller Timer Tick " + j);
        }
    }

    class o implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f3309a;
        final /* synthetic */ java.lang.String b;
        final /* synthetic */ com.json.sa c;
        final /* synthetic */ com.json.s9 d;

        o(java.lang.String str, java.lang.String str2, com.json.sa saVar, com.json.s9 s9Var) {
            this.f3309a = str;
            this.b = str2;
            this.c = saVar;
            this.d = s9Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.json.sdk.controller.e.this.b != null) {
                com.json.sdk.controller.e.this.b.a(this.f3309a, this.b, this.c, this.d);
            }
        }
    }

    class p implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ org.json.JSONObject f3310a;
        final /* synthetic */ com.json.s9 b;

        p(org.json.JSONObject jSONObject, com.json.s9 s9Var) {
            this.f3310a = jSONObject;
            this.b = s9Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.json.sdk.controller.e.this.b != null) {
                com.json.sdk.controller.e.this.b.a(this.f3310a, this.b);
            }
        }
    }

    class q implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f3311a;
        final /* synthetic */ java.lang.String b;
        final /* synthetic */ com.json.sa c;
        final /* synthetic */ com.json.r9 d;

        q(java.lang.String str, java.lang.String str2, com.json.sa saVar, com.json.r9 r9Var) {
            this.f3311a = str;
            this.b = str2;
            this.c = saVar;
            this.d = r9Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.json.sdk.controller.e.this.b != null) {
                com.json.sdk.controller.e.this.b.a(this.f3311a, this.b, this.c, this.d);
            }
        }
    }

    class r implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f3312a;
        final /* synthetic */ com.json.r9 b;

        r(java.lang.String str, com.json.r9 r9Var) {
            this.f3312a = str;
            this.b = r9Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.json.sdk.controller.e.this.b != null) {
                com.json.sdk.controller.e.this.b.a(this.f3312a, this.b);
            }
        }
    }

    class s implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.sa f3313a;
        final /* synthetic */ java.util.Map b;
        final /* synthetic */ com.json.r9 c;

        s(com.json.sa saVar, java.util.Map map, com.json.r9 r9Var) {
            this.f3313a = saVar;
            this.b = map;
            this.c = r9Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.json.gh.a(com.json.ar.j, new com.json.bh().a(com.json.zb.v, this.f3313a.f()).a(com.json.zb.w, com.json.hh.a(this.f3313a, com.ironsource.zg.e.Interstitial)).a(com.json.zb.x, java.lang.Boolean.valueOf(com.json.hh.a(this.f3313a))).a(com.json.zb.I, java.lang.Long.valueOf(com.json.j0.f2778a.b(this.f3313a.h()))).a());
            if (com.json.sdk.controller.e.this.b != null) {
                com.json.sdk.controller.e.this.b.b(this.f3313a, this.b, this.c);
            }
        }
    }

    public e(android.content.Context context, com.json.b9 b9Var, com.json.ta taVar, com.json.cg cgVar, int i2, org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2, com.json.ln lnVar) {
        this.k = lnVar;
        this.g = cgVar;
        java.lang.String networkStorageDir = com.json.sdk.utils.IronSourceStorageUtils.getNetworkStorageDir(context);
        com.json.db dbVarA = com.json.db.a(networkStorageDir, cgVar, jSONObject);
        this.h = new com.json.ew(context, b9Var, taVar, i2, dbVarA, networkStorageDir);
        a(context, b9Var, taVar, i2, dbVarA, networkStorageDir, str, str2);
    }

    private void a(final android.content.Context context, final com.json.b9 b9Var, final com.json.ta taVar, final int i2, final com.json.db dbVar, final java.lang.String str, final java.lang.String str2, final java.lang.String str3) {
        int iC = com.json.im.S().d().c();
        if (iC > 0) {
            com.json.gh.a(com.json.ar.B, new com.json.bh().a(com.json.zb.y, java.lang.String.valueOf(iC)).a());
        }
        a(new java.lang.Runnable() { // from class: com.ironsource.sdk.controller.e$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.c(context, b9Var, taVar, i2, dbVar, str, str2, str3);
            }
        }, iC);
        this.d = new com.ironsource.sdk.controller.e.k(200000L, 1000L).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.json.km kmVar) {
        com.ironsource.sdk.controller.l.b bVar = this.j.get(kmVar.d());
        if (bVar != null) {
            bVar.a(kmVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.ironsource.sdk.controller.f.a aVar) {
        com.ironsource.sdk.controller.l.a aVarRemove = this.i.remove(aVar.c());
        if (aVarRemove != null) {
            aVarRemove.a(aVar);
        }
    }

    private void a(com.ironsource.zg.e eVar, com.json.sa saVar, java.lang.String str, java.lang.String str2) {
        com.json.sdk.utils.Logger.i(this.f3294a, "recoverWebController for product: " + eVar.toString());
        com.json.bh bhVar = new com.json.bh();
        bhVar.a(com.json.zb.w, eVar.toString());
        bhVar.a(com.json.zb.v, saVar.f());
        com.json.gh.a(com.json.ar.b, bhVar.a());
        this.h.n();
        destroy();
        b(new com.ironsource.sdk.controller.e.m(str, str2));
        this.d = new com.ironsource.sdk.controller.e.n(200000L, 1000L).start();
    }

    private void a(java.lang.Runnable runnable, long j2) {
        com.json.cg cgVar = this.g;
        if (cgVar != null) {
            cgVar.d(runnable, j2);
        } else {
            com.json.sdk.utils.Logger.e(this.f3294a, "mThreadManager = null");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.json.sdk.controller.v b(android.content.Context context, com.json.b9 b9Var, com.json.ta taVar, int i2, com.json.db dbVar, java.lang.String str, java.lang.String str2, java.lang.String str3) throws java.lang.Throwable {
        com.json.gh.a(com.json.ar.c);
        com.json.sdk.controller.v vVar = new com.json.sdk.controller.v(context, taVar, b9Var, this, this.g, i2, dbVar, str, h(), i(), str2, str3);
        com.json.tc tcVar = new com.json.tc(context, dbVar, new com.json.sc(this.g.a()), new com.json.lm(dbVar.a()));
        vVar.a(new com.json.sdk.controller.u(context));
        vVar.a(new com.json.sdk.controller.o(context));
        vVar.a(new com.json.sdk.controller.q(context));
        vVar.a(new com.json.sdk.controller.i(context));
        vVar.a(new com.json.sdk.controller.a(context));
        vVar.a(new com.json.sdk.controller.j(dbVar.a(), tcVar));
        vVar.a(new com.json.p3());
        vVar.a(new com.json.v9(context, new com.json.u9()));
        return vVar;
    }

    private void b(java.lang.Runnable runnable) {
        a(runnable, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(android.content.Context context, com.json.b9 b9Var, com.json.ta taVar, int i2, com.json.db dbVar, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        try {
            com.json.sdk.controller.v vVarB = b(context, b9Var, taVar, i2, dbVar, str, str2, str3);
            this.b = vVarB;
            vVarB.a();
        } catch (java.lang.Throwable th) {
            com.json.l9.d().a(th);
            d(android.util.Log.getStackTraceString(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(java.lang.String str) {
        com.json.gh.a(com.json.ar.d, new com.json.bh().a(com.json.zb.A, str).a());
        this.c = com.ironsource.zg.b.Loading;
        this.b = new com.json.sdk.controller.n(str, this.g);
        this.e.c();
        this.e.a();
        com.json.cg cgVar = this.g;
        if (cgVar != null) {
            cgVar.c(new com.ironsource.sdk.controller.e.l());
        }
    }

    private void e(java.lang.String str) {
        com.json.sdk.IronSourceNetwork.updateInitFailed(new com.json.ah(1001, str));
    }

    private com.ironsource.sdk.controller.l.a h() {
        return new com.ironsource.sdk.controller.l.a() { // from class: com.ironsource.sdk.controller.e$$ExternalSyntheticLambda2
            @Override // com.ironsource.sdk.controller.l.a
            public final void a(com.ironsource.sdk.controller.f.a aVar) {
                this.f$0.a(aVar);
            }
        };
    }

    private com.ironsource.sdk.controller.l.b i() {
        return new com.ironsource.sdk.controller.l.b() { // from class: com.ironsource.sdk.controller.e$$ExternalSyntheticLambda0
            @Override // com.ironsource.sdk.controller.l.b
            public final void a(com.json.km kmVar) {
                this.f$0.a(kmVar);
            }
        };
    }

    private void k() {
        com.json.sdk.utils.Logger.i(this.f3294a, "handleReadyState");
        this.c = com.ironsource.zg.b.Ready;
        android.os.CountDownTimer countDownTimer = this.d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        m();
        this.f.c();
        this.f.a();
        com.json.sdk.controller.l lVar = this.b;
        if (lVar != null) {
            lVar.e();
        }
    }

    private boolean l() {
        return com.ironsource.zg.b.Ready.equals(this.c);
    }

    private void m() {
        this.h.a(true);
        com.json.sdk.controller.l lVar = this.b;
        if (lVar != null) {
            lVar.a(this.h.i());
        }
    }

    @Override // com.json.sdk.controller.l
    public void a() {
    }

    @Override // com.json.sdk.controller.l
    public void a(android.app.Activity activity) {
        this.b.a(activity);
    }

    @Override // com.json.sdk.controller.l
    public void a(android.content.Context context) {
        com.json.sdk.controller.l lVar;
        if (!l() || (lVar = this.b) == null) {
            return;
        }
        lVar.a(context);
    }

    @Override // com.json.re
    public void a(com.json.ne neVar) {
        com.ironsource.ar.a aVar;
        com.json.bh bhVar;
        java.lang.StringBuilder sb;
        com.json.pe strategy = neVar.getStrategy();
        if (strategy == com.json.pe.SendEvent) {
            aVar = com.json.ar.A;
            bhVar = new com.json.bh();
            sb = new java.lang.StringBuilder();
        } else {
            if (strategy != com.json.pe.NativeController) {
                return;
            }
            com.json.sdk.controller.n nVar = new com.json.sdk.controller.n(neVar.a(), this.g);
            this.b = nVar;
            this.k.a(nVar.g());
            com.json.gh.a(com.json.ar.d, new com.json.bh().a(com.json.zb.A, neVar.a() + " : strategy: " + strategy).a());
            aVar = com.json.ar.A;
            bhVar = new com.json.bh();
            sb = new java.lang.StringBuilder();
        }
        com.json.gh.a(aVar, bhVar.a(com.json.zb.y, sb.append(neVar.a()).append(" : strategy: ").append(strategy).toString()).a());
    }

    @Override // com.json.sdk.controller.l
    public void a(com.json.sa saVar) {
        this.f.a(new com.json.sdk.controller.e.RunnableC0246e(saVar));
    }

    @Override // com.json.sdk.controller.l
    public void a(com.json.sa saVar, java.util.Map<java.lang.String, java.lang.String> map, com.json.q9 q9Var) {
        this.f.a(new com.ironsource.sdk.controller.e.g(saVar, map, q9Var));
    }

    @Override // com.json.sdk.controller.l
    public void a(com.json.sa saVar, java.util.Map<java.lang.String, java.lang.String> map, com.json.r9 r9Var) {
        this.f.a(new com.ironsource.sdk.controller.e.b(saVar, map, r9Var));
    }

    @Override // com.json.sdk.controller.l
    public void a(com.ironsource.sdk.controller.f.c cVar, com.ironsource.sdk.controller.l.a aVar) {
        this.f.a(new com.ironsource.sdk.controller.e.h(aVar, cVar));
    }

    public void a(java.lang.Runnable runnable) {
        this.e.a(runnable);
    }

    @Override // com.json.sdk.controller.l
    public void a(java.lang.String str, com.json.r9 r9Var) {
        com.json.sdk.utils.Logger.i(this.f3294a, "load interstitial");
        this.f.a(new com.ironsource.sdk.controller.e.r(str, r9Var));
    }

    public void a(java.lang.String str, com.ironsource.sdk.controller.l.b bVar) {
        this.j.put(str, bVar);
    }

    @Override // com.json.sdk.controller.l
    public void a(java.lang.String str, java.lang.String str2, com.json.sa saVar, com.json.q9 q9Var) {
        if (this.h.a(g(), this.c)) {
            a(com.ironsource.zg.e.Banner, saVar, str, str2);
        }
        this.f.a(new com.ironsource.sdk.controller.e.c(str, str2, saVar, q9Var));
    }

    @Override // com.json.sdk.controller.l
    public void a(java.lang.String str, java.lang.String str2, com.json.sa saVar, com.json.r9 r9Var) {
        if (this.h.a(g(), this.c)) {
            a(com.ironsource.zg.e.Interstitial, saVar, str, str2);
        }
        this.f.a(new com.ironsource.sdk.controller.e.q(str, str2, saVar, r9Var));
    }

    @Override // com.json.sdk.controller.l
    public void a(java.lang.String str, java.lang.String str2, com.json.sa saVar, com.json.s9 s9Var) {
        if (this.h.a(g(), this.c)) {
            a(com.ironsource.zg.e.RewardedVideo, saVar, str, str2);
        }
        this.f.a(new com.ironsource.sdk.controller.e.o(str, str2, saVar, s9Var));
    }

    @Override // com.json.sdk.controller.l
    public void a(org.json.JSONObject jSONObject) {
    }

    @Override // com.json.sdk.controller.l
    public void a(org.json.JSONObject jSONObject, com.json.q9 q9Var) {
        this.f.a(new com.ironsource.sdk.controller.e.d(jSONObject, q9Var));
    }

    @Override // com.json.sdk.controller.l
    public void a(org.json.JSONObject jSONObject, com.json.r9 r9Var) {
        this.f.a(new com.ironsource.sdk.controller.e.a(jSONObject, r9Var));
    }

    @Override // com.json.sdk.controller.l
    public void a(org.json.JSONObject jSONObject, com.json.s9 s9Var) {
        this.f.a(new com.ironsource.sdk.controller.e.p(jSONObject, s9Var));
    }

    @Override // com.json.sdk.controller.l
    public boolean a(java.lang.String str) {
        if (this.b == null || !l()) {
            return false;
        }
        return this.b.a(str);
    }

    @Override // com.json.sdk.controller.c
    public void b() {
        com.json.sdk.utils.Logger.i(this.f3294a, "handleControllerLoaded");
        this.c = com.ironsource.zg.b.Loaded;
        this.e.c();
        this.e.a();
    }

    @Override // com.json.sdk.controller.l
    public void b(android.content.Context context) {
        com.json.sdk.controller.l lVar;
        if (!l() || (lVar = this.b) == null) {
            return;
        }
        lVar.b(context);
    }

    @Override // com.json.sdk.controller.l
    public void b(com.json.sa saVar) {
        this.f.a(new com.ironsource.sdk.controller.e.f(saVar));
    }

    @Override // com.json.sdk.controller.l
    public void b(com.json.sa saVar, java.util.Map<java.lang.String, java.lang.String> map, com.json.r9 r9Var) {
        this.f.a(new com.ironsource.sdk.controller.e.s(saVar, map, r9Var));
    }

    @Override // com.json.sdk.controller.c
    public void b(java.lang.String str) {
        com.json.sdk.utils.Logger.i(this.f3294a, "handleControllerFailed ");
        com.json.bh bhVar = new com.json.bh();
        bhVar.a(com.json.zb.A, str);
        bhVar.a(com.json.zb.y, java.lang.String.valueOf(this.h.l()));
        com.json.gh.a(com.json.ar.o, bhVar.a());
        this.h.a(false);
        e(str);
        if (this.d != null) {
            com.json.sdk.utils.Logger.i(this.f3294a, "cancel timer mControllerReadyTimer");
            this.d.cancel();
        }
        d(str);
    }

    @Override // com.json.sdk.controller.l
    public void b(org.json.JSONObject jSONObject) {
        this.f.a(new com.ironsource.sdk.controller.e.i(jSONObject));
    }

    @Override // com.json.sdk.controller.c
    public void c() {
        com.json.sdk.utils.Logger.i(this.f3294a, "handleControllerReady ");
        this.k.a(g());
        if (com.ironsource.zg.c.Web.equals(g())) {
            com.json.gh.a(com.json.ar.e, new com.json.bh().a(com.json.zb.y, java.lang.String.valueOf(this.h.l())).a());
            com.json.sdk.IronSourceNetwork.updateInitSucceeded();
        }
        k();
    }

    @Override // com.json.sdk.controller.c
    public void c(java.lang.String str) {
        com.json.gh.a(com.json.ar.y, new com.json.bh().a(com.json.zb.y, str).a());
        android.os.CountDownTimer countDownTimer = this.d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        d(str);
    }

    @Override // com.json.sdk.controller.l
    public void d() {
        com.json.sdk.controller.l lVar;
        if (!l() || (lVar = this.b) == null) {
            return;
        }
        lVar.d();
    }

    @Override // com.json.sdk.controller.l
    public void destroy() {
        com.json.sdk.utils.Logger.i(this.f3294a, "destroy controller");
        android.os.CountDownTimer countDownTimer = this.d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        com.json.n8 n8Var = this.f;
        if (n8Var != null) {
            n8Var.b();
        }
        this.d = null;
        b(new com.ironsource.sdk.controller.e.j());
    }

    @Override // com.json.sdk.controller.l
    @java.lang.Deprecated
    public void e() {
    }

    @Override // com.json.sdk.controller.l
    public void f() {
        com.json.sdk.controller.l lVar;
        if (!l() || (lVar = this.b) == null) {
            return;
        }
        lVar.f();
    }

    @Override // com.json.sdk.controller.l
    public com.ironsource.zg.c g() {
        com.json.sdk.controller.l lVar = this.b;
        return lVar != null ? lVar.g() : com.ironsource.zg.c.None;
    }

    public com.json.sdk.controller.l j() {
        return this.b;
    }
}

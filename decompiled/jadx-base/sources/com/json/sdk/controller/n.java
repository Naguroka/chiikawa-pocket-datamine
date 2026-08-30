package com.json.sdk.controller;

/* JADX INFO: loaded from: classes5.dex */
public class n implements com.json.sdk.controller.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.json.cg f3327a;
    private final java.lang.String b;

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.sdk.controller.l.a f3328a;
        final /* synthetic */ com.ironsource.sdk.controller.f.c b;

        a(com.ironsource.sdk.controller.l.a aVar, com.ironsource.sdk.controller.f.c cVar) {
            this.f3328a = aVar;
            this.b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (this.f3328a == null) {
                    return;
                }
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("success", false);
                jSONObject.put("reason", com.json.sdk.controller.n.this.b);
                this.f3328a.a(new com.ironsource.sdk.controller.f.a(this.b.getCom.ironsource.sdk.controller.f.b.b java.lang.String(), jSONObject));
            } catch (org.json.JSONException e) {
                com.json.l9.d().a(e);
                com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            }
        }
    }

    class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.s9 f3329a;
        final /* synthetic */ com.json.sa b;

        b(com.json.s9 s9Var, com.json.sa saVar) {
            this.f3329a = s9Var;
            this.b = saVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3329a.a(com.ironsource.zg.e.RewardedVideo, this.b.h(), com.json.sdk.controller.n.this.b);
        }
    }

    class c implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.s9 f3330a;
        final /* synthetic */ org.json.JSONObject b;

        c(com.json.s9 s9Var, org.json.JSONObject jSONObject) {
            this.f3330a = s9Var;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3330a.d(this.b.optString("demandSourceName"), com.json.sdk.controller.n.this.b);
        }
    }

    class d implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.r9 f3331a;
        final /* synthetic */ com.json.sa b;

        d(com.json.r9 r9Var, com.json.sa saVar) {
            this.f3331a = r9Var;
            this.b = saVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3331a.a(com.ironsource.zg.e.Interstitial, this.b.h(), com.json.sdk.controller.n.this.b);
        }
    }

    class e implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.r9 f3332a;
        final /* synthetic */ java.lang.String b;

        e(com.json.r9 r9Var, java.lang.String str) {
            this.f3332a = r9Var;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3332a.c(this.b, com.json.sdk.controller.n.this.b);
        }
    }

    class f implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.r9 f3333a;
        final /* synthetic */ com.json.sa b;

        f(com.json.r9 r9Var, com.json.sa saVar) {
            this.f3333a = r9Var;
            this.b = saVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3333a.c(this.b.h(), com.json.sdk.controller.n.this.b);
        }
    }

    class g implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.r9 f3334a;
        final /* synthetic */ org.json.JSONObject b;

        g(com.json.r9 r9Var, org.json.JSONObject jSONObject) {
            this.f3334a = r9Var;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3334a.b(this.b.optString("demandSourceName"), com.json.sdk.controller.n.this.b);
        }
    }

    class h implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.r9 f3335a;
        final /* synthetic */ com.json.sa b;

        h(com.json.r9 r9Var, com.json.sa saVar) {
            this.f3335a = r9Var;
            this.b = saVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3335a.b(this.b.h(), com.json.sdk.controller.n.this.b);
        }
    }

    class i implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.q9 f3336a;
        final /* synthetic */ java.util.Map b;

        i(com.json.q9 q9Var, java.util.Map map) {
            this.f3336a = q9Var;
            this.b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3336a.a((java.lang.String) this.b.get("demandSourceName"), com.json.sdk.controller.n.this.b);
        }
    }

    class j implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.q9 f3337a;
        final /* synthetic */ org.json.JSONObject b;

        j(com.json.q9 q9Var, org.json.JSONObject jSONObject) {
            this.f3337a = q9Var;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3337a.a(this.b.optString("demandSourceName"), com.json.sdk.controller.n.this.b);
        }
    }

    n(java.lang.String str, com.json.cg cgVar) {
        this.f3327a = cgVar;
        this.b = str;
    }

    @Override // com.json.sdk.controller.l
    public void a() {
    }

    @Override // com.json.sdk.controller.l
    public void a(android.app.Activity activity) {
    }

    @Override // com.json.sdk.controller.l
    public void a(android.content.Context context) {
    }

    @Override // com.json.sdk.controller.l
    public void a(com.json.sa saVar) {
    }

    @Override // com.json.sdk.controller.l
    public void a(com.json.sa saVar, java.util.Map<java.lang.String, java.lang.String> map, com.json.q9 q9Var) {
        if (q9Var != null) {
            a(new com.ironsource.sdk.controller.n.i(q9Var, map));
        }
    }

    @Override // com.json.sdk.controller.l
    public void a(com.json.sa saVar, java.util.Map<java.lang.String, java.lang.String> map, com.json.r9 r9Var) {
        if (r9Var != null) {
            a(new com.ironsource.sdk.controller.n.h(r9Var, saVar));
        }
    }

    @Override // com.json.sdk.controller.l
    public void a(com.ironsource.sdk.controller.f.c cVar, com.ironsource.sdk.controller.l.a aVar) {
        a(new com.ironsource.sdk.controller.n.a(aVar, cVar));
    }

    void a(java.lang.Runnable runnable) {
        com.json.cg cgVar = this.f3327a;
        if (cgVar != null) {
            cgVar.c(runnable);
        }
    }

    @Override // com.json.sdk.controller.l
    public void a(java.lang.String str, com.json.r9 r9Var) {
        if (r9Var != null) {
            a(new com.ironsource.sdk.controller.n.e(r9Var, str));
        }
    }

    @Override // com.json.sdk.controller.l
    public void a(java.lang.String str, java.lang.String str2, com.json.sa saVar, com.json.q9 q9Var) {
        if (q9Var != null) {
            q9Var.a(com.ironsource.zg.e.Banner, saVar.h(), this.b);
        }
    }

    @Override // com.json.sdk.controller.l
    public void a(java.lang.String str, java.lang.String str2, com.json.sa saVar, com.json.r9 r9Var) {
        if (r9Var != null) {
            a(new com.ironsource.sdk.controller.n.d(r9Var, saVar));
        }
    }

    @Override // com.json.sdk.controller.l
    public void a(java.lang.String str, java.lang.String str2, com.json.sa saVar, com.json.s9 s9Var) {
        if (s9Var != null) {
            a(new com.ironsource.sdk.controller.n.b(s9Var, saVar));
        }
    }

    @Override // com.json.sdk.controller.l
    public void a(org.json.JSONObject jSONObject) {
    }

    @Override // com.json.sdk.controller.l
    public void a(org.json.JSONObject jSONObject, com.json.q9 q9Var) {
        if (q9Var != null) {
            a(new com.ironsource.sdk.controller.n.j(q9Var, jSONObject));
        }
    }

    @Override // com.json.sdk.controller.l
    public void a(org.json.JSONObject jSONObject, com.json.r9 r9Var) {
        if (r9Var != null) {
            a(new com.ironsource.sdk.controller.n.g(r9Var, jSONObject));
        }
    }

    @Override // com.json.sdk.controller.l
    public void a(org.json.JSONObject jSONObject, com.json.s9 s9Var) {
        if (s9Var != null) {
            a(new com.ironsource.sdk.controller.n.c(s9Var, jSONObject));
        }
    }

    @Override // com.json.sdk.controller.l
    public boolean a(java.lang.String str) {
        return false;
    }

    @Override // com.json.sdk.controller.l
    public void b(android.content.Context context) {
    }

    @Override // com.json.sdk.controller.l
    public void b(com.json.sa saVar) {
    }

    @Override // com.json.sdk.controller.l
    public void b(com.json.sa saVar, java.util.Map<java.lang.String, java.lang.String> map, com.json.r9 r9Var) {
        if (r9Var != null) {
            a(new com.ironsource.sdk.controller.n.f(r9Var, saVar));
        }
    }

    @Override // com.json.sdk.controller.l
    public void b(org.json.JSONObject jSONObject) {
    }

    @Override // com.json.sdk.controller.l
    public void d() {
    }

    @Override // com.json.sdk.controller.l
    public void destroy() {
    }

    @Override // com.json.sdk.controller.l
    public void e() {
    }

    @Override // com.json.sdk.controller.l
    public void f() {
    }

    @Override // com.json.sdk.controller.l
    public com.ironsource.zg.c g() {
        return com.ironsource.zg.c.Native;
    }
}

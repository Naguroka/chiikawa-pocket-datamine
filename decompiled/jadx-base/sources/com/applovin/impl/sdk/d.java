package com.applovin.impl.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class d implements com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f1285a;
    private final com.applovin.impl.sdk.c b;
    private final java.util.List c = java.util.Collections.synchronizedList(new java.util.ArrayList());

    public interface a {
        void a(com.applovin.impl.sdk.ad.b bVar);
    }

    public d(com.applovin.impl.sdk.j jVar) {
        this.f1285a = jVar;
        this.b = new com.applovin.impl.sdk.c(jVar);
    }

    private void c(com.applovin.impl.sdk.c.a aVar) {
        if (aVar != null && this.c.remove(aVar)) {
            this.b.b(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        this.f1285a.h0().b(com.applovin.impl.uj.C);
        this.b.a();
    }

    private void e() {
        java.lang.String str = (java.lang.String) this.f1285a.h0().a(com.applovin.impl.uj.C);
        if (str == null) {
            return;
        }
        org.json.JSONArray jsonArray = com.applovin.impl.sdk.utils.JsonUtils.toJsonArray(str, new org.json.JSONArray());
        for (int length = jsonArray.length() - 1; length >= 0; length--) {
            com.applovin.impl.sdk.c.a aVarA = com.applovin.impl.sdk.c.a.a(com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jsonArray, length, new org.json.JSONObject()), this.f1285a);
            if (aVarA != null) {
                if (a(aVarA)) {
                    this.f1285a.D().a(com.applovin.impl.ka.v, com.applovin.impl.sdk.utils.CollectionUtils.map("details", "ttl = " + (aVarA.b() - android.os.SystemClock.elapsedRealtime()) + "ms"));
                } else {
                    this.c.add(0, aVarA);
                }
            }
        }
    }

    private void f() {
        this.f1285a.i0().a((com.applovin.impl.yl) new com.applovin.impl.jn(this.f1285a, "loadPersistedAdFilesQueueAndCleanupAsync", new java.lang.Runnable() { // from class: com.applovin.impl.sdk.d$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.c();
            }
        }), com.applovin.impl.tm.b.OTHER);
    }

    private void h() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        synchronized (this.c) {
            java.util.Iterator it = this.c.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.applovin.impl.sdk.c.a) it.next()).a());
            }
        }
        this.f1285a.h0().b(com.applovin.impl.uj.C, new org.json.JSONArray((java.util.Collection) arrayList).toString());
    }

    public void b() {
        f();
        com.applovin.impl.sdk.AppLovinBroadcastManager.registerReceiver(this, new android.content.IntentFilter(com.applovin.impl.sdk.SessionTracker.ACTION_APPLICATION_PAUSED));
    }

    public void g() {
        this.f1285a.i0().a((com.applovin.impl.yl) new com.applovin.impl.jn(this.f1285a, "resetManagerState", new java.lang.Runnable() { // from class: com.applovin.impl.sdk.d$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.d();
            }
        }), com.applovin.impl.tm.b.OTHER);
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(android.content.Intent intent, java.util.Map map) {
        h();
    }

    public void b(com.applovin.impl.sdk.ad.b bVar) {
        if (bVar == null) {
            return;
        }
        this.f1285a.D().a(com.applovin.impl.ka.p, bVar);
        this.b.b(bVar, new com.applovin.impl.sdk.c.b() { // from class: com.applovin.impl.sdk.d$$ExternalSyntheticLambda1
            @Override // com.applovin.impl.sdk.c.b
            public final void a(com.applovin.impl.sdk.c.a aVar) {
                this.f$0.b(aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        e();
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.applovin.impl.sdk.c.a aVar) {
        if (aVar == null) {
            this.f1285a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f1285a.I().a("AdPersistenceManager", "Ad failed to persist");
                return;
            }
            return;
        }
        this.c.add(aVar);
        if (((java.lang.Boolean) this.f1285a.a(com.applovin.impl.sj.Z0)).booleanValue()) {
            h();
        }
    }

    private void a(com.applovin.impl.sdk.d.a aVar, com.applovin.impl.sdk.c.a aVar2, com.applovin.impl.h0 h0Var, java.lang.String str) {
        if (aVar == null) {
            return;
        }
        this.f1285a.I();
        if (com.applovin.impl.sdk.n.a()) {
            this.f1285a.I().a("AdPersistenceManager", str);
        }
        aVar.a(null);
        this.b.b(aVar2);
        this.f1285a.D().a(com.applovin.impl.ka.u, h0Var, new com.applovin.impl.sdk.AppLovinError(-1, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.sdk.d.a aVar, com.applovin.impl.sdk.c.a aVar2, com.applovin.impl.h0 h0Var, com.applovin.impl.sdk.ad.b bVar, java.lang.String str) {
        if (bVar != null && !com.applovin.impl.sdk.utils.StringUtils.isValidString(str)) {
            a(aVar, bVar, aVar2);
        } else {
            a(aVar, aVar2, h0Var, str);
        }
    }

    public void a(final com.applovin.impl.h0 h0Var, final com.applovin.impl.sdk.d.a aVar) {
        if (aVar == null) {
            this.f1285a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f1285a.I().b("AdPersistenceManager", "Persisted ad could not be retrieved: listener is null");
            }
            com.applovin.impl.p6.a("Persisted ad could not be retrieved: listener is null", new java.lang.Object[0]);
            return;
        }
        if (h0Var == null) {
            a(aVar, null, null, "Persisted ad could not be retrieved: adZone is null");
            return;
        }
        this.f1285a.D().a(com.applovin.impl.ka.s, h0Var, (com.applovin.impl.sdk.AppLovinError) null);
        final com.applovin.impl.sdk.c.a aVarA = a(h0Var.g());
        this.b.a(aVarA, new com.applovin.impl.sdk.c.InterfaceC0053c() { // from class: com.applovin.impl.sdk.d$$ExternalSyntheticLambda3
            @Override // com.applovin.impl.sdk.c.InterfaceC0053c
            public final void a(com.applovin.impl.sdk.ad.b bVar, java.lang.String str) {
                this.f$0.a(aVar, aVarA, h0Var, bVar, str);
            }
        });
    }

    public void a(com.applovin.impl.sdk.ad.b bVar) {
        if (bVar == null) {
            return;
        }
        c(com.applovin.impl.sdk.c.a.a(bVar));
    }

    private com.applovin.impl.sdk.c.a a(com.applovin.sdk.AppLovinAdType appLovinAdType) {
        com.applovin.impl.sdk.c.a aVar;
        synchronized (this.c) {
            java.util.Iterator it = this.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    aVar = null;
                    break;
                }
                aVar = (com.applovin.impl.sdk.c.a) it.next();
                if (aVar.e().equals(appLovinAdType) && !a(aVar)) {
                    break;
                }
            }
            this.c.remove(aVar);
        }
        return aVar;
    }

    private void a(com.applovin.impl.sdk.d.a aVar, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.c.a aVar2) {
        if (aVar == null) {
            return;
        }
        this.f1285a.I();
        if (com.applovin.impl.sdk.n.a()) {
            this.f1285a.I().a("AdPersistenceManager", "Loading persisted ad");
        }
        aVar.a(bVar);
        this.b.b(aVar2);
        this.f1285a.D().a(com.applovin.impl.ka.t, bVar);
    }

    private boolean a(com.applovin.impl.sdk.c.a aVar) {
        return android.os.SystemClock.elapsedRealtime() + ((java.lang.Long) this.f1285a.a(com.applovin.impl.sj.b1)).longValue() >= aVar.b();
    }

    private void a() {
        synchronized (this.c) {
            this.b.a(new java.util.ArrayList(this.c));
        }
    }
}

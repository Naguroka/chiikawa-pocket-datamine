package com.applovin.impl.sdk.network;

/* JADX INFO: loaded from: classes3.dex */
public class b implements com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f1318a;
    private final com.applovin.impl.sdk.n b;
    private final int c;
    private final com.applovin.impl.sdk.network.c d;
    private final java.lang.Object f = new java.lang.Object();
    private final java.util.List g;
    private final java.util.Set h;
    private final java.util.List i;

    class a implements com.applovin.sdk.AppLovinPostbackListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.network.d f1319a;
        final /* synthetic */ com.applovin.sdk.AppLovinPostbackListener b;

        a(com.applovin.impl.sdk.network.d dVar, com.applovin.sdk.AppLovinPostbackListener appLovinPostbackListener) {
            this.f1319a = dVar;
            this.b = appLovinPostbackListener;
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackFailure(java.lang.String str, int i) {
            com.applovin.impl.sdk.n unused = com.applovin.impl.sdk.network.b.this.b;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.network.b.this.b.d("PersistentPostbackManager", "Failed to submit postback: " + this.f1319a + " with error code: " + i + "; will retry later...");
            }
            com.applovin.impl.sdk.network.b.this.d(this.f1319a);
            com.applovin.impl.fc.a(this.b, str, i);
            if (this.f1319a.c() == 1) {
                com.applovin.impl.sdk.network.b.this.f1318a.D().a("dispatchPostback", str, i);
            }
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackSuccess(java.lang.String str) {
            com.applovin.impl.sdk.network.b.this.a(this.f1319a);
            com.applovin.impl.sdk.n unused = com.applovin.impl.sdk.network.b.this.b;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.network.b.this.b.a("PersistentPostbackManager", "Successfully submit postback: " + this.f1319a);
            }
            com.applovin.impl.sdk.network.b.this.c();
            com.applovin.impl.fc.a(this.b, str);
        }
    }

    public b(com.applovin.impl.sdk.j jVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.g = arrayList;
        this.h = new java.util.HashSet();
        this.i = new java.util.ArrayList();
        if (jVar == null) {
            throw new java.lang.IllegalArgumentException("No sdk specified");
        }
        this.f1318a = jVar;
        this.b = jVar.I();
        int iIntValue = ((java.lang.Integer) jVar.a(com.applovin.impl.sj.M2)).intValue();
        this.c = iIntValue;
        if (!((java.lang.Boolean) jVar.a(com.applovin.impl.sj.P2)).booleanValue()) {
            this.d = null;
            return;
        }
        com.applovin.impl.sdk.network.c cVar = new com.applovin.impl.sdk.network.c(this, jVar);
        this.d = cVar;
        if (com.applovin.impl.yp.a(com.applovin.impl.sj.S0, jVar) && com.applovin.impl.yp.h()) {
            a(new java.lang.Runnable() { // from class: com.applovin.impl.sdk.network.b$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.f();
                }
            }, true, true);
        } else {
            arrayList.addAll(cVar.a(iIntValue));
        }
        com.applovin.impl.sdk.AppLovinBroadcastManager.registerReceiver(this, new android.content.IntentFilter(com.applovin.impl.sdk.SessionTracker.ACTION_APPLICATION_PAUSED));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        synchronized (this.f) {
            this.g.addAll(0, this.d.a(this.c));
        }
    }

    protected java.util.List d() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        synchronized (this.f) {
            if (((java.lang.Boolean) this.f1318a.a(com.applovin.impl.sj.O2)).booleanValue()) {
                arrayList.ensureCapacity(this.i.size());
                arrayList.addAll(this.i);
            } else {
                arrayList.ensureCapacity(this.g.size());
                arrayList.addAll(this.g);
            }
        }
        return arrayList;
    }

    public void e(com.applovin.impl.sdk.network.d dVar) {
        a(dVar, true);
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(android.content.Intent intent, java.util.Map map) {
        this.f1318a.i0().a((com.applovin.impl.yl) this.d, com.applovin.impl.tm.b.OTHER);
    }

    private void c(com.applovin.impl.sdk.network.d dVar) {
        synchronized (this.f) {
            while (this.g.size() > this.c) {
                this.g.remove(0);
            }
            this.g.add(dVar);
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.b.a("PersistentPostbackManager", "Enqueued postback: " + dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        synchronized (this.f) {
            java.util.Iterator it = new java.util.ArrayList(this.g).iterator();
            while (it.hasNext()) {
                b((com.applovin.impl.sdk.network.d) it.next());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.applovin.impl.sdk.network.d dVar, com.applovin.sdk.AppLovinPostbackListener appLovinPostbackListener) {
        synchronized (this.f) {
            c(dVar);
            a(dVar, appLovinPostbackListener);
        }
    }

    public void a(com.applovin.impl.sdk.network.d dVar, boolean z) {
        a(dVar, z, (com.applovin.sdk.AppLovinPostbackListener) null);
    }

    public void a(final com.applovin.impl.sdk.network.d dVar, boolean z, final com.applovin.sdk.AppLovinPostbackListener appLovinPostbackListener) {
        if (android.text.TextUtils.isEmpty(dVar.k())) {
            if (com.applovin.impl.sdk.n.a()) {
                this.b.b("PersistentPostbackManager", "Requested a postback dispatch for empty URL; nothing to do...");
            }
        } else {
            if (z) {
                dVar.a();
            }
            a(new java.lang.Runnable() { // from class: com.applovin.impl.sdk.network.b$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.b(dVar, appLovinPostbackListener);
                }
            }, com.applovin.impl.yp.h(), dVar.m());
        }
    }

    public void b() {
        a(new java.lang.Runnable() { // from class: com.applovin.impl.sdk.network.b$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.e();
            }
        }, true, false);
    }

    private void b(com.applovin.impl.sdk.network.d dVar) {
        a(dVar, (com.applovin.sdk.AppLovinPostbackListener) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        synchronized (this.f) {
            java.util.Iterator it = this.i.iterator();
            while (it.hasNext()) {
                b((com.applovin.impl.sdk.network.d) it.next());
            }
            this.i.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(com.applovin.impl.sdk.network.d dVar) {
        synchronized (this.f) {
            this.h.remove(dVar);
            this.i.add(dVar);
        }
    }

    public void a() {
        synchronized (this.f) {
            this.g.clear();
            this.i.clear();
        }
        this.f1318a.i0().a((com.applovin.impl.yl) this.d, com.applovin.impl.tm.b.OTHER);
    }

    private void a(com.applovin.impl.sdk.network.d dVar, com.applovin.sdk.AppLovinPostbackListener appLovinPostbackListener) {
        if (com.applovin.impl.sdk.n.a()) {
            this.b.a("PersistentPostbackManager", "Preparing to submit postback: " + dVar);
        }
        if (this.f1318a.v0() && !dVar.m()) {
            if (com.applovin.impl.sdk.n.a()) {
                this.b.a("PersistentPostbackManager", "Skipping postback dispatch because SDK is still initializing - postback will be dispatched afterwards");
                return;
            }
            return;
        }
        if (android.text.TextUtils.isEmpty(dVar.k())) {
            if (com.applovin.impl.sdk.n.a()) {
                this.b.b("PersistentPostbackManager", "Skipping empty postback dispatch...");
                return;
            }
            return;
        }
        synchronized (this.f) {
            if (this.h.contains(dVar)) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.b.a("PersistentPostbackManager", "Skipping in progress postback: " + dVar.k());
                }
                return;
            }
            dVar.l();
            java.lang.Integer num = (java.lang.Integer) this.f1318a.a(com.applovin.impl.sj.L2);
            if (dVar.c() > num.intValue()) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.b.k("PersistentPostbackManager", "Exceeded maximum persisted attempt count of " + num + ". Dequeuing postback: " + dVar);
                }
                a(dVar);
            } else {
                synchronized (this.f) {
                    this.h.add(dVar);
                }
                com.applovin.impl.sdk.network.e eVarB = com.applovin.impl.sdk.network.e.b(this.f1318a).b(dVar.k()).a(dVar.d()).b(dVar.i()).c(dVar.h()).a(dVar.g()).a(dVar.j() != null ? new org.json.JSONObject(dVar.j()) : null).b(dVar.o()).a(dVar.n()).a(dVar.f()).h(dVar.p()).e(dVar.e()).a();
                if (com.applovin.impl.sdk.n.a()) {
                    this.b.a("PersistentPostbackManager", "Submitting postback: " + dVar);
                }
                this.f1318a.X().dispatchPostbackRequest(eVarB, new com.applovin.impl.sdk.network.b.a(dVar, appLovinPostbackListener));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.sdk.network.d dVar) {
        synchronized (this.f) {
            this.h.remove(dVar);
            this.g.remove(dVar);
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.b.a("PersistentPostbackManager", "Dequeued postback: " + dVar);
        }
    }

    private void a(java.lang.Runnable runnable, boolean z, boolean z2) {
        if (z) {
            this.f1318a.i0().a((com.applovin.impl.yl) new com.applovin.impl.jn(this.f1318a, z2, "runPostbackTask", runnable), com.applovin.impl.tm.b.OTHER);
        } else {
            runnable.run();
        }
    }
}

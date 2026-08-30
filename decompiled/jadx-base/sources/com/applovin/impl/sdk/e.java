package com.applovin.impl.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f1286a;
    private final com.applovin.impl.sdk.n b;
    private final java.util.Map d = new java.util.HashMap();
    private final java.util.Map e = new java.util.HashMap();
    private final java.lang.Object c = new java.lang.Object();

    e(com.applovin.impl.sdk.j jVar) {
        this.f1286a = jVar;
        this.b = jVar.I();
        for (com.applovin.impl.h0 h0Var : com.applovin.impl.h0.a()) {
            this.d.put(h0Var, new com.applovin.impl.sdk.p());
            this.e.put(h0Var, new com.applovin.impl.sdk.p());
        }
    }

    public com.applovin.impl.sdk.ad.AppLovinAdImpl e(com.applovin.impl.h0 h0Var) {
        com.applovin.impl.sdk.ad.c cVar;
        synchronized (this.c) {
            com.applovin.impl.sdk.p pVarD = d(h0Var);
            if (pVarD.b() > 0) {
                b(h0Var).a(pVarD.a());
                cVar = new com.applovin.impl.sdk.ad.c(h0Var, this.f1286a);
            } else {
                cVar = null;
            }
        }
        if (cVar != null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.b.a("AdPreloadManager", "Retrieved ad of zone " + h0Var + "...");
            }
        } else if (com.applovin.impl.sdk.n.a()) {
            this.b.a("AdPreloadManager", "Unable to retrieve ad of zone " + h0Var + "...");
        }
        return cVar;
    }

    public com.applovin.impl.sdk.ad.AppLovinAdImpl a(com.applovin.impl.h0 h0Var) {
        com.applovin.impl.sdk.ad.AppLovinAdImpl appLovinAdImplA;
        synchronized (this.c) {
            appLovinAdImplA = c(h0Var).a();
        }
        return appLovinAdImplA;
    }

    void a(com.applovin.impl.sdk.ad.AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.c) {
            d(appLovinAdImpl.getAdZone()).a(appLovinAdImpl);
            if (com.applovin.impl.sdk.n.a()) {
                this.b.a("AdPreloadManager", "Ad enqueued: " + appLovinAdImpl);
            }
        }
    }

    public com.applovin.impl.sdk.AppLovinAdBase f(com.applovin.impl.h0 h0Var) {
        com.applovin.impl.sdk.ad.AppLovinAdImpl appLovinAdImplD;
        synchronized (this.c) {
            appLovinAdImplD = c(h0Var).d();
        }
        return appLovinAdImplD;
    }

    private com.applovin.impl.sdk.p d(com.applovin.impl.h0 h0Var) {
        com.applovin.impl.sdk.p pVar;
        synchronized (this.c) {
            pVar = (com.applovin.impl.sdk.p) this.d.get(h0Var);
            if (pVar == null) {
                pVar = new com.applovin.impl.sdk.p();
                this.d.put(h0Var, pVar);
            }
        }
        return pVar;
    }

    private com.applovin.impl.sdk.p b(com.applovin.impl.h0 h0Var) {
        com.applovin.impl.sdk.p pVar;
        synchronized (this.c) {
            pVar = (com.applovin.impl.sdk.p) this.e.get(h0Var);
            if (pVar == null) {
                pVar = new com.applovin.impl.sdk.p();
                this.e.put(h0Var, pVar);
            }
        }
        return pVar;
    }

    public void b(com.applovin.impl.sdk.ad.AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.c) {
            c(appLovinAdImpl.getAdZone()).b(appLovinAdImpl);
        }
    }

    private com.applovin.impl.sdk.p c(com.applovin.impl.h0 h0Var) {
        synchronized (this.c) {
            com.applovin.impl.sdk.p pVarB = b(h0Var);
            if (pVarB.b() > 0) {
                return pVarB;
            }
            return d(h0Var);
        }
    }
}

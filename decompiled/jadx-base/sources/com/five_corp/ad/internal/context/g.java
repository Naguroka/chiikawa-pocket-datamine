package com.five_corp.ad.internal.context;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.five_corp.ad.FiveAdConfig f1885a;
    public final com.five_corp.ad.internal.cache.s b;
    public final com.five_corp.ad.internal.storage.e c;
    public final com.five_corp.ad.internal.cache.p d;
    public final com.five_corp.ad.internal.time.a e;
    public final com.five_corp.ad.internal.soundstate.e f;
    public final com.five_corp.ad.internal.system.c g;
    public final com.five_corp.ad.internal.http.auxcache.i h;
    public final com.five_corp.ad.internal.http.movcache.h i;

    public g(com.five_corp.ad.FiveAdConfig fiveAdConfig, com.five_corp.ad.internal.cache.s sVar, com.five_corp.ad.internal.storage.e eVar, com.five_corp.ad.internal.cache.p pVar, com.five_corp.ad.internal.time.a aVar, com.five_corp.ad.internal.soundstate.e eVar2, com.five_corp.ad.internal.system.c cVar, com.five_corp.ad.internal.http.auxcache.i iVar, com.five_corp.ad.internal.http.movcache.h hVar) {
        this.f1885a = fiveAdConfig;
        this.b = sVar;
        this.c = eVar;
        this.d = pVar;
        this.e = aVar;
        this.f = eVar2;
        this.g = cVar;
        this.h = iVar;
        this.i = hVar;
    }

    public final com.five_corp.ad.internal.context.i a(java.lang.String str) {
        java.lang.String string = java.util.UUID.randomUUID().toString();
        java.lang.String str2 = this.f1885a.appId;
        return new com.five_corp.ad.internal.context.i(string, str);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0094  */
    /* JADX WARN: Code duplicated, block: B:29:0x009a  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:48:0x0110  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final void a(com.five_corp.ad.internal.context.j jVar, java.lang.String str, com.five_corp.ad.internal.context.t tVar, com.five_corp.ad.internal.context.h hVar, com.five_corp.ad.internal.context.e eVar, final com.five_corp.ad.internal.context.f fVar) {
        com.five_corp.ad.internal.util.f fVar2;
        com.five_corp.ad.internal.util.f fVarA;
        com.five_corp.ad.internal.beacon.e eVar2;
        android.os.Looper looperA;
        com.five_corp.ad.internal.cache.p pVar;
        java.util.List list;
        com.five_corp.ad.internal.context.l lVar;
        com.five_corp.ad.internal.ad.q qVar;
        long j;
        com.five_corp.ad.internal.ad.h hVar2;
        com.five_corp.ad.internal.ad.a aVar = jVar.f1888a;
        com.five_corp.ad.internal.ad.format_config.a aVarA = com.five_corp.ad.internal.ad.a.a(aVar, tVar.f1896a.c);
        if (aVarA == null) {
            fVar.a(new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.H5, null, null, null));
            return;
        }
        int i = com.five_corp.ad.internal.context.d.f1884a[aVar.b.ordinal()];
        if (i != 1) {
            if (i != 2) {
                fVarA = new com.five_corp.ad.internal.util.f(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.I5, "CreativeType: " + aVar.b.value, null, null), null);
            } else {
                int i2 = aVar.I;
                if (i2 == 2) {
                    if (aVar.J == 1) {
                        fVar2 = new com.five_corp.ad.internal.util.f(true, null, com.five_corp.ad.internal.beacon.e.LEGACY_PARTIAL_CACHE_PLAYER);
                    } else {
                        fVarA = com.five_corp.ad.internal.util.f.a(com.five_corp.ad.internal.t.K6);
                    }
                } else if (i2 == 1) {
                    fVar2 = aVar.J == 1 ? new com.five_corp.ad.internal.util.f(true, null, com.five_corp.ad.internal.beacon.e.LEGACY_FULL_CACHE_PLAYER) : new com.five_corp.ad.internal.util.f(true, null, com.five_corp.ad.internal.beacon.e.FULL_CACHE_PLAYER);
                } else {
                    fVar2 = new com.five_corp.ad.internal.util.f(true, null, com.five_corp.ad.internal.beacon.e.STREAMING_PLAYER);
                }
            }
            if (!fVarA.f2085a) {
                fVar.a(fVarA.b);
                return;
            }
            eVar2 = (com.five_corp.ad.internal.beacon.e) fVarA.c;
            looperA = this.g.a();
            if (looperA == null) {
                fVar.a(new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.A0, null, null, null));
                return;
            }
            pVar = this.d;
            list = jVar.f1888a.G;
            synchronized (pVar) {
                java.util.HashMap mapA = pVar.f1874a.a(list);
                com.five_corp.ad.internal.cache.q qVar2 = new com.five_corp.ad.internal.cache.q(mapA);
                pVar.b.f2086a.add(new java.lang.ref.WeakReference(qVar2));
            }
            lVar = new com.five_corp.ad.internal.context.l(jVar, str, tVar, aVarA, hVar, qVar2, eVar2, looperA);
            com.five_corp.ad.internal.http.auxcache.i iVar = this.h;
            iVar.f1915a.post(new com.five_corp.ad.internal.http.auxcache.b(iVar, lVar));
            com.five_corp.ad.internal.http.movcache.h hVar3 = this.i;
            hVar3.f1931a.post(new com.five_corp.ad.internal.http.movcache.b(hVar3, lVar));
            if (eVar2 == com.five_corp.ad.internal.beacon.e.FULL_CACHE_PLAYER && eVar2 != com.five_corp.ad.internal.beacon.e.LEGACY_FULL_CACHE_PLAYER) {
                eVar.a(lVar);
                return;
            }
            qVar = aVar.i;
            if (qVar != null || (hVar2 = qVar.b) == null) {
                j = 10000;
            } else {
                j = hVar2.f1825a;
            }
            com.five_corp.ad.internal.time.c cVar = new com.five_corp.ad.internal.time.c(this.e, j, new com.five_corp.ad.internal.time.b() { // from class: com.five_corp.ad.internal.context.g$$ExternalSyntheticLambda0
                @Override // com.five_corp.ad.internal.time.b
                public final void a() {
                    com.five_corp.ad.internal.context.g.a(fVar);
                }
            });
            cVar.c();
            ((com.five_corp.ad.internal.cache.o) java.util.Objects.requireNonNull((com.five_corp.ad.internal.cache.o) mapA.get(aVar.n))).a(new com.five_corp.ad.internal.context.c(cVar, eVar, lVar, fVar));
        }
        fVar2 = new com.five_corp.ad.internal.util.f(true, null, com.five_corp.ad.internal.beacon.e.NOT_MOVIE);
        fVarA = fVar2;
        if (!fVarA.f2085a) {
            fVar.a(fVarA.b);
            return;
        }
        eVar2 = (com.five_corp.ad.internal.beacon.e) fVarA.c;
        looperA = this.g.a();
        if (looperA == null) {
            fVar.a(new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.A0, null, null, null));
            return;
        }
        pVar = this.d;
        list = jVar.f1888a.G;
        synchronized (pVar) {
            java.util.HashMap mapA2 = pVar.f1874a.a(list);
            com.five_corp.ad.internal.cache.q qVar3 = new com.five_corp.ad.internal.cache.q(mapA2);
            pVar.b.f2086a.add(new java.lang.ref.WeakReference(qVar3));
            lVar = new com.five_corp.ad.internal.context.l(jVar, str, tVar, aVarA, hVar, qVar3, eVar2, looperA);
            com.five_corp.ad.internal.http.auxcache.i iVar2 = this.h;
            iVar2.f1915a.post(new com.five_corp.ad.internal.http.auxcache.b(iVar2, lVar));
            com.five_corp.ad.internal.http.movcache.h hVar4 = this.i;
            hVar4.f1931a.post(new com.five_corp.ad.internal.http.movcache.b(hVar4, lVar));
            if (eVar2 == com.five_corp.ad.internal.beacon.e.FULL_CACHE_PLAYER) {
            }
            qVar = aVar.i;
            if (qVar != null) {
                j = 10000;
            } else {
                j = 10000;
            }
            com.five_corp.ad.internal.time.c cVar2 = new com.five_corp.ad.internal.time.c(this.e, j, new com.five_corp.ad.internal.time.b() { // from class: com.five_corp.ad.internal.context.g$$ExternalSyntheticLambda0
                @Override // com.five_corp.ad.internal.time.b
                public final void a() {
                    com.five_corp.ad.internal.context.g.a(fVar);
                }
            });
            cVar2.c();
            ((com.five_corp.ad.internal.cache.o) java.util.Objects.requireNonNull((com.five_corp.ad.internal.cache.o) mapA2.get(aVar.n))).a(new com.five_corp.ad.internal.context.c(cVar2, eVar, lVar, fVar));
        }
    }

    public static void a(com.five_corp.ad.internal.context.f fVar) {
        fVar.a(new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.P5, null, null, null));
    }
}

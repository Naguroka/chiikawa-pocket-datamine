package com.five_corp.ad.internal.http.auxcache;

/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.os.Handler f1915a;
    public final com.five_corp.ad.internal.logger.a b;
    public final com.five_corp.ad.internal.storage.e c;
    public final com.five_corp.ad.internal.http.connection.c d;
    public final int e;
    public java.lang.Object f;
    public boolean g;
    public final java.util.ArrayList h;
    public final com.five_corp.ad.internal.http.auxcache.l i;
    public final com.five_corp.ad.internal.http.auxcache.l j;
    public final com.five_corp.ad.internal.http.auxcache.l k;

    public i(com.five_corp.ad.internal.logger.a aVar, com.five_corp.ad.internal.storage.e eVar, com.five_corp.ad.internal.http.connection.b bVar) {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("AuxiliaryResourceCacheDownloadManager");
        handlerThread.start();
        this.f1915a = new android.os.Handler(handlerThread.getLooper());
        this.b = aVar;
        this.c = eVar;
        this.d = bVar;
        this.e = 3;
        this.f = null;
        this.g = false;
        this.h = new java.util.ArrayList();
        this.i = com.five_corp.ad.internal.http.auxcache.l.b();
        this.j = com.five_corp.ad.internal.http.auxcache.l.c();
        this.k = com.five_corp.ad.internal.http.auxcache.l.d();
    }

    public static com.five_corp.ad.internal.http.auxcache.k a(com.five_corp.ad.internal.http.auxcache.i iVar, com.five_corp.ad.internal.http.a aVar) {
        iVar.getClass();
        com.five_corp.ad.internal.context.l lVar = (com.five_corp.ad.internal.context.l) aVar.b.get();
        com.five_corp.ad.internal.ad.a aVar2 = lVar != null ? lVar.b : (com.five_corp.ad.internal.ad.a) aVar.f1906a.get();
        if (aVar2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (com.five_corp.ad.internal.ad.w wVar : aVar2.G) {
                if (!wVar.equals(aVar2.n) || aVar2.b != com.five_corp.ad.CreativeType.MOVIE) {
                    arrayList.add(wVar);
                }
            }
            if (!arrayList.isEmpty()) {
                return new com.five_corp.ad.internal.http.auxcache.k(aVar2.c, aVar, iVar.c, arrayList, iVar.b);
            }
        }
        return null;
    }

    public static void a(com.five_corp.ad.internal.http.auxcache.i iVar) {
        iVar.f = null;
        if (iVar.g && !iVar.k.b.isEmpty()) {
            for (com.five_corp.ad.internal.http.auxcache.j jVar : iVar.h) {
                java.util.Iterator it = jVar.c.iterator();
                do {
                    if (!it.hasNext()) {
                        synchronized (jVar.f) {
                            if (!jVar.k) {
                                com.five_corp.ad.internal.http.client.a aVar = jVar.g;
                                jVar.k = true;
                                if (aVar == null) {
                                    break;
                                }
                                aVar.a();
                                break;
                            }
                            break;
                        }
                    }
                } while (((com.five_corp.ad.internal.http.auxcache.k) it.next()).f1917a.c != 3);
            }
            return;
        }
        if (iVar.g) {
            return;
        }
        iVar.g = true;
        iVar.i.e();
        iVar.j.e();
        iVar.k.e();
        iVar.a((com.five_corp.ad.internal.http.auxcache.j) null);
    }

    public final void a(com.five_corp.ad.internal.http.auxcache.j jVar) {
        com.five_corp.ad.internal.http.auxcache.l lVar;
        com.five_corp.ad.internal.ad.w wVar;
        com.five_corp.ad.internal.s sVar;
        if (jVar != null) {
            this.h.remove(jVar);
        }
        while (this.h.size() < this.e) {
            if (!this.k.b.isEmpty()) {
                lVar = this.k;
            } else if (this.j.b.isEmpty()) {
                lVar = !this.i.b.isEmpty() ? this.i : null;
            } else {
                lVar = this.j;
            }
            if (lVar == null) {
                if (this.h.size() == 0) {
                    this.g = false;
                    if (!this.k.c.isEmpty()) {
                        long jA = this.k.a();
                        java.lang.Object obj = new java.lang.Object();
                        this.f = obj;
                        this.f1915a.postDelayed(new com.five_corp.ad.internal.http.auxcache.h(this, obj), jA);
                        return;
                    }
                    if (!this.j.c.isEmpty()) {
                        long jA2 = this.j.a();
                        java.lang.Object obj2 = new java.lang.Object();
                        this.f = obj2;
                        this.f1915a.postDelayed(new com.five_corp.ad.internal.http.auxcache.h(this, obj2), jA2);
                        return;
                    }
                    if (this.i.c.isEmpty()) {
                        return;
                    }
                    long jA3 = this.i.a();
                    java.lang.Object obj3 = new java.lang.Object();
                    this.f = obj3;
                    this.f1915a.postDelayed(new com.five_corp.ad.internal.http.auxcache.h(this, obj3), jA3);
                    return;
                }
                return;
            }
            com.five_corp.ad.internal.http.auxcache.k kVar = (com.five_corp.ad.internal.http.auxcache.k) lVar.b.peekFirst();
            if (!kVar.f1917a.a()) {
                wVar = null;
                break;
            }
            while (true) {
                if (kVar.e.isEmpty()) {
                    wVar = null;
                    break;
                }
                wVar = (com.five_corp.ad.internal.ad.w) kVar.e.pollFirst();
                if (!kVar.d.a(wVar).d()) {
                    kVar.g.add(wVar);
                    break;
                }
            }
            if (wVar != null) {
                java.util.Iterator it = this.h.iterator();
                while (true) {
                    if (it.hasNext()) {
                        com.five_corp.ad.internal.http.auxcache.j jVar2 = (com.five_corp.ad.internal.http.auxcache.j) it.next();
                        if (jVar2.f1916a.equals(wVar)) {
                            jVar2.c.add(kVar);
                            break;
                        }
                    } else {
                        com.five_corp.ad.internal.cache.o oVarA = this.c.a(wVar);
                        com.five_corp.ad.internal.http.auxcache.j jVar3 = new com.five_corp.ad.internal.http.auxcache.j(wVar, oVarA, kVar, this.d, this);
                        synchronized (jVar3.f) {
                            sVar = jVar3.g != null ? new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.J2, null, null, null) : null;
                        }
                        if (sVar != null) {
                            jVar3.e(sVar);
                        } else {
                            com.five_corp.ad.internal.util.f fVarB = oVarA.b();
                            if (!fVarB.f2085a) {
                                jVar3.e(fVarB.b);
                            } else {
                                int iIntValue = ((java.lang.Integer) fVarB.c).intValue();
                                com.five_corp.ad.internal.http.client.a aVar = new com.five_corp.ad.internal.http.client.a(wVar, jVar3, jVar3.d);
                                synchronized (jVar3.f) {
                                    jVar3.g = aVar;
                                    jVar3.i = iIntValue;
                                }
                                aVar.b(iIntValue, 0);
                            }
                        }
                        this.h.add(jVar3);
                        break;
                    }
                }
            } else {
                lVar.b.pollFirst();
            }
        }
    }
}

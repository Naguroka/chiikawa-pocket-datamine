package com.five_corp.ad.internal.http.auxcache;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.http.auxcache.j f1913a;
    public final /* synthetic */ com.five_corp.ad.internal.s b;
    public final /* synthetic */ com.five_corp.ad.internal.http.auxcache.i c;

    public g(com.five_corp.ad.internal.http.auxcache.i iVar, com.five_corp.ad.internal.http.auxcache.j jVar, com.five_corp.ad.internal.s sVar) {
        this.c = iVar;
        this.f1913a = jVar;
        this.b = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.five_corp.ad.internal.http.auxcache.l lVar;
        for (com.five_corp.ad.internal.http.auxcache.k kVar : this.f1913a.c) {
            com.five_corp.ad.internal.ad.w wVar = this.f1913a.f1916a;
            com.five_corp.ad.internal.s sVar = this.b;
            kVar.g.remove(wVar);
            kVar.f.add(wVar);
            if (!kVar.j) {
                if (kVar.h == null) {
                    kVar.h = new java.util.HashMap();
                }
                if (!kVar.h.containsKey(wVar)) {
                    kVar.h.put(wVar, new java.util.ArrayList());
                }
                java.util.List list = (java.util.List) kVar.h.get(wVar);
                list.add("[Download " + wVar.f1835a + " failed with DetailedError: " + sVar.toString() + com.ironsource.y8.i.e);
                if (list.size() >= 10) {
                    java.util.Locale locale = java.util.Locale.US;
                    int i = kVar.i;
                    java.lang.String str = kVar.b;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(com.ironsource.y8.i.d);
                    java.util.Iterator it = list.iterator();
                    while (it.hasNext()) {
                        sb.append((java.lang.String) it.next());
                        sb.append(",");
                    }
                    sb.append(com.ironsource.y8.i.e);
                    kVar.c.a(4, "auxiliary resource cache download error is occurred " + i + " times for ad ots: " + str + ". errors: " + sb.toString());
                    kVar.j = true;
                    kVar.h = null;
                }
            }
            com.five_corp.ad.internal.http.auxcache.i iVar = this.c;
            int i2 = kVar.f1917a.c;
            iVar.getClass();
            int iA = com.five_corp.ad.e.a(i2);
            if (iA == 0) {
                lVar = iVar.i;
            } else if (iA == 1) {
                lVar = iVar.j;
            } else {
                if (iA != 2) {
                    throw new java.lang.RuntimeException("Unknown DownloadRequesterPriority: ".concat(com.five_corp.ad.internal.http.b.b(i2)));
                }
                lVar = iVar.k;
            }
            lVar.c.add(kVar);
        }
        this.c.a(this.f1913a);
    }
}

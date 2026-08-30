package com.five_corp.ad.internal.http.auxcache;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.http.auxcache.j f1912a;
    public final /* synthetic */ com.five_corp.ad.internal.http.auxcache.i b;

    public f(com.five_corp.ad.internal.http.auxcache.i iVar, com.five_corp.ad.internal.http.auxcache.j jVar) {
        this.b = iVar;
        this.f1912a = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.five_corp.ad.internal.http.auxcache.l lVar;
        for (com.five_corp.ad.internal.http.auxcache.k kVar : this.f1912a.c) {
            if (!(!kVar.e.isEmpty())) {
                com.five_corp.ad.internal.http.auxcache.i iVar = this.b;
                int i = kVar.f1917a.c;
                iVar.getClass();
                int iA = com.five_corp.ad.e.a(i);
                if (iA == 0) {
                    lVar = iVar.i;
                } else if (iA == 1) {
                    lVar = iVar.j;
                } else {
                    if (iA != 2) {
                        throw new java.lang.RuntimeException("Unknown DownloadRequesterPriority: ".concat(com.five_corp.ad.internal.http.b.b(i)));
                    }
                    lVar = iVar.k;
                }
                lVar.b.addFirst(kVar);
            }
            com.five_corp.ad.internal.ad.w wVar = this.f1912a.f1916a;
            kVar.g.remove(wVar);
            kVar.e.addLast(wVar);
        }
        this.b.a(this.f1912a);
    }
}

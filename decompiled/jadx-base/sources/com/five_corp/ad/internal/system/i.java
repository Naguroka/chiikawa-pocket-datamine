package com.five_corp.ad.internal.system;

/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f2071a;
    public final android.net.ConnectivityManager b;
    public final com.five_corp.ad.internal.logger.a c;
    public final java.lang.Object d = new java.lang.Object();
    public final com.five_corp.ad.internal.util.h e = new com.five_corp.ad.internal.util.h();

    public i(android.content.Context context, com.five_corp.ad.internal.logger.a aVar) {
        this.f2071a = context;
        this.b = (android.net.ConnectivityManager) context.getSystemService("connectivity");
        this.c = aVar;
    }

    public final void a() {
        java.util.ArrayList arrayList;
        synchronized (this.d) {
            com.five_corp.ad.internal.util.h hVar = this.e;
            hVar.getClass();
            arrayList = new java.util.ArrayList();
            hVar.a((java.util.AbstractCollection) arrayList);
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.five_corp.ad.j jVar = (com.five_corp.ad.j) ((com.five_corp.ad.internal.system.f) it.next());
            jVar.n.a();
            jVar.o.a();
            com.five_corp.ad.internal.http.auxcache.i iVar = jVar.x;
            iVar.f1915a.post(new com.five_corp.ad.internal.http.auxcache.d(iVar));
            com.five_corp.ad.internal.http.movcache.h hVar2 = jVar.y;
            hVar2.f1931a.post(new com.five_corp.ad.internal.http.movcache.d(hVar2));
        }
    }

    public final void b() {
        this.b.registerDefaultNetworkCallback(new com.five_corp.ad.internal.system.g(this));
    }
}

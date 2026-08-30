package com.five_corp.ad.internal.http.auxcache;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.context.l f1908a;
    public final /* synthetic */ com.five_corp.ad.internal.http.auxcache.i b;

    public b(com.five_corp.ad.internal.http.auxcache.i iVar, com.five_corp.ad.internal.context.l lVar) {
        this.b = iVar;
        this.f1908a = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.five_corp.ad.internal.http.auxcache.k kVarA = com.five_corp.ad.internal.http.auxcache.i.a(this.b, new com.five_corp.ad.internal.http.a(null, this.f1908a, 2));
        if (kVarA == null) {
            return;
        }
        this.b.j.b.addLast(kVarA);
        com.five_corp.ad.internal.http.auxcache.i.a(this.b);
    }
}

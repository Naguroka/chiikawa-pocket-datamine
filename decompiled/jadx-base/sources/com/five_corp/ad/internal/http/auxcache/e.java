package com.five_corp.ad.internal.http.auxcache;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.http.auxcache.j f1911a;
    public final /* synthetic */ com.five_corp.ad.internal.http.auxcache.i b;

    public e(com.five_corp.ad.internal.http.auxcache.i iVar, com.five_corp.ad.internal.http.auxcache.j jVar) {
        this.b = iVar;
        this.f1911a = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (com.five_corp.ad.internal.http.auxcache.k kVar : this.f1911a.c) {
            kVar.g.remove(this.f1911a.f1916a);
        }
        this.b.a(this.f1911a);
    }
}

package com.five_corp.ad.internal.http.auxcache;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.context.l f1909a;
    public final /* synthetic */ com.five_corp.ad.internal.http.auxcache.i b;

    public c(com.five_corp.ad.internal.http.auxcache.i iVar, com.five_corp.ad.internal.context.l lVar) {
        this.b = iVar;
        this.f1909a = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.five_corp.ad.internal.http.auxcache.k kVarA = com.five_corp.ad.internal.http.auxcache.i.a(this.b, new com.five_corp.ad.internal.http.a(null, this.f1909a, 3));
        if (kVarA == null) {
            return;
        }
        this.b.k.b.addLast(kVarA);
        com.five_corp.ad.internal.http.auxcache.i.a(this.b);
    }
}

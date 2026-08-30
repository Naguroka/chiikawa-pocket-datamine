package com.five_corp.ad.internal.http.movcache;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.context.l f1926a;
    public final /* synthetic */ com.five_corp.ad.internal.http.movcache.k b;
    public final /* synthetic */ com.five_corp.ad.internal.http.movcache.h c;

    public c(com.five_corp.ad.internal.http.movcache.h hVar, com.five_corp.ad.internal.context.l lVar, com.five_corp.ad.internal.movie.partialcache.C1467f c1467f) {
        this.c = hVar;
        this.f1926a = lVar;
        this.b = c1467f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.five_corp.ad.internal.ad.a aVar = this.f1926a.b;
        if (aVar.b != com.five_corp.ad.CreativeType.MOVIE) {
            return;
        }
        com.five_corp.ad.internal.ad.w wVar = aVar.n;
        com.five_corp.ad.internal.util.f fVarA = this.c.a(wVar, this.c.b.a(wVar), new com.five_corp.ad.internal.http.movcache.l(this.f1926a, this.b));
        if (fVarA.f2085a && ((java.lang.Boolean) fVarA.c).booleanValue()) {
            com.five_corp.ad.internal.http.movcache.h.a(this.c);
        }
    }
}

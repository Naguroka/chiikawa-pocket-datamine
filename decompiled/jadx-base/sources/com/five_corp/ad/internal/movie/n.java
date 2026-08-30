package com.five_corp.ad.internal.movie;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements com.five_corp.ad.internal.movie.partialcache.w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.movie.x f1982a;

    public n(com.five_corp.ad.internal.movie.x xVar) {
        this.f1982a = xVar;
    }

    @Override // com.five_corp.ad.internal.movie.partialcache.w1
    public final void a(java.lang.Object obj) {
        com.five_corp.ad.internal.movie.partialcache.C1459b c1459b = (com.five_corp.ad.internal.movie.partialcache.C1459b) obj;
        com.five_corp.ad.internal.movie.x xVar = this.f1982a;
        if (xVar.o == 8) {
            xVar.o = 9;
            xVar.h.a(c1459b.b);
            com.five_corp.ad.internal.view.D d = this.f1982a.e;
            d.e.post(new com.five_corp.ad.internal.view.x(d));
        }
    }
}

package com.five_corp.ad.internal.movie.partialcache.audio;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements com.five_corp.ad.internal.movie.partialcache.w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.movie.partialcache.audio.c f1992a;

    public b(com.five_corp.ad.internal.movie.partialcache.audio.c cVar) {
        this.f1992a = cVar;
    }

    @Override // com.five_corp.ad.internal.movie.partialcache.w1
    public final void a(java.lang.Object obj) {
        int iA = com.five_corp.ad.e.a(this.f1992a.d);
        if (iA != 3) {
            if (iA != 4) {
                return;
            }
            com.five_corp.ad.internal.movie.partialcache.audio.c cVar = this.f1992a;
            cVar.d = 6;
            cVar.c.h.c = false;
            return;
        }
        com.five_corp.ad.internal.movie.partialcache.audio.c cVar2 = this.f1992a;
        cVar2.d = 6;
        com.five_corp.ad.internal.movie.x xVar = cVar2.c;
        xVar.h.c = false;
        xVar.getClass();
        xVar.n.post(new com.five_corp.ad.internal.movie.RunnableC1455l(xVar, new com.five_corp.ad.internal.movie.n(xVar)));
    }
}

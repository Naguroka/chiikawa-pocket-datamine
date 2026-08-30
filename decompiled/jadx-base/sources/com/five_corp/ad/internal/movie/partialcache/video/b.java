package com.five_corp.ad.internal.movie.partialcache.video;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements com.five_corp.ad.internal.movie.partialcache.w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.movie.partialcache.video.d f2026a;

    public b(com.five_corp.ad.internal.movie.partialcache.video.d dVar) {
        this.f2026a = dVar;
    }

    @Override // com.five_corp.ad.internal.movie.partialcache.w1
    public final void a(java.lang.Object obj) {
        com.five_corp.ad.internal.movie.x xVar = (com.five_corp.ad.internal.movie.x) this.f2026a.c;
        xVar.getClass();
        xVar.n.post(new com.five_corp.ad.internal.movie.RunnableC1455l(xVar, new com.five_corp.ad.internal.movie.C1456m(xVar)));
    }
}

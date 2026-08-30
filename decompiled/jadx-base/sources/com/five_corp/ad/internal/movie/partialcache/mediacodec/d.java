package com.five_corp.ad.internal.movie.partialcache.mediacodec;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.movie.partialcache.mediacodec.a f2009a;
    public final /* synthetic */ com.five_corp.ad.internal.movie.partialcache.mediacodec.h b;

    public d(com.five_corp.ad.internal.movie.partialcache.mediacodec.h hVar, com.five_corp.ad.internal.movie.partialcache.mediacodec.a aVar) {
        this.b = hVar;
        this.f2009a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.five_corp.ad.internal.movie.partialcache.mediacodec.h hVar = this.b;
        if (hVar.d != 2) {
            return;
        }
        com.five_corp.ad.internal.movie.partialcache.mediacodec.a aVar = this.f2009a;
        if (hVar.f2013a.a(hVar, aVar)) {
            return;
        }
        hVar.b.postDelayed(new com.five_corp.ad.internal.movie.partialcache.mediacodec.d(hVar, aVar), 100L);
    }
}

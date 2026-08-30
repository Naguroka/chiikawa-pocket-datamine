package com.five_corp.ad.internal.movie.partialcache;

/* JADX INFO: loaded from: classes4.dex */
public final class F extends com.five_corp.ad.internal.movie.partialcache.AbstractC1466e0 {
    public final java.util.ArrayList h = new java.util.ArrayList();

    @Override // com.five_corp.ad.internal.movie.partialcache.AbstractC1466e0, com.five_corp.ad.internal.movie.partialcache.D
    public final void a(com.five_corp.ad.internal.util.c cVar, com.five_corp.ad.internal.logger.a aVar) throws com.five_corp.ad.internal.movie.partialcache.C1505y0 {
        super.a(cVar, aVar);
        int iB = cVar.b();
        for (int i = 0; i < iB; i++) {
            this.h.add(java.lang.Integer.valueOf(cVar.b()));
        }
    }
}

package com.five_corp.ad.internal.movie.partialcache;

/* JADX INFO: loaded from: classes4.dex */
public final class Q extends com.five_corp.ad.internal.movie.partialcache.AbstractC1466e0 {
    public short[] h;

    @Override // com.five_corp.ad.internal.movie.partialcache.AbstractC1466e0, com.five_corp.ad.internal.movie.partialcache.D
    public final void a(com.five_corp.ad.internal.util.c cVar, com.five_corp.ad.internal.logger.a aVar) throws com.five_corp.ad.internal.movie.partialcache.C1505y0 {
        super.a(cVar, aVar);
        int iA = (int) (a(cVar) / 2);
        this.h = new short[iA];
        for (int i = 0; i < iA; i++) {
            this.h[i] = cVar.d();
        }
    }
}

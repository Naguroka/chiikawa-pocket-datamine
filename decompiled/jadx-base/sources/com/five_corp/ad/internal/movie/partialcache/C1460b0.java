package com.five_corp.ad.internal.movie.partialcache;

/* JADX INFO: renamed from: com.five_corp.ad.internal.movie.partialcache.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1460b0 extends com.five_corp.ad.internal.movie.partialcache.D {
    public final java.util.ArrayList f = new java.util.ArrayList();

    @Override // com.five_corp.ad.internal.movie.partialcache.D
    public final void a(com.five_corp.ad.internal.util.c cVar, com.five_corp.ad.internal.logger.a aVar) throws com.five_corp.ad.internal.movie.partialcache.C1505y0 {
        super.a(cVar, aVar);
        cVar.b();
        cVar.b();
        long jA = a(cVar) / 4;
        for (long j = 0; j < jA; j++) {
            this.f.add(java.lang.Integer.valueOf(cVar.b()));
        }
    }
}

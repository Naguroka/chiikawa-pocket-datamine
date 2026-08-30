package com.five_corp.ad.internal.movie.partialcache;

/* JADX INFO: loaded from: classes4.dex */
public final class U0 extends com.five_corp.ad.internal.movie.partialcache.AbstractC1466e0 {
    @Override // com.five_corp.ad.internal.movie.partialcache.AbstractC1466e0, com.five_corp.ad.internal.movie.partialcache.D
    public final void a(com.five_corp.ad.internal.util.c cVar, com.five_corp.ad.internal.logger.a aVar) throws com.five_corp.ad.internal.movie.partialcache.C1505y0 {
        super.a(cVar, aVar);
        int iB = cVar.b();
        for (int i = 0; i < iB; i++) {
            com.five_corp.ad.internal.movie.partialcache.S0 s0 = new com.five_corp.ad.internal.movie.partialcache.S0();
            cVar.b();
            int iD = cVar.d();
            if (iD < 0) {
                iD += 65536;
            }
            if (iD > 0) {
                for (int i2 = 0; i2 < iD; i2++) {
                    com.five_corp.ad.internal.movie.partialcache.T0 t0 = new com.five_corp.ad.internal.movie.partialcache.T0();
                    if (this.f == 1) {
                        cVar.b();
                    } else {
                        cVar.d();
                        java.util.HashMap map = com.five_corp.ad.internal.movie.partialcache.j1.f2005a;
                    }
                    cVar.a();
                    cVar.a();
                    cVar.b();
                    s0.f1987a.add(t0);
                }
            }
        }
    }
}

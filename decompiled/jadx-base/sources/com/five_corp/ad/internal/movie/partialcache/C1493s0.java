package com.five_corp.ad.internal.movie.partialcache;

/* JADX INFO: renamed from: com.five_corp.ad.internal.movie.partialcache.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1493s0 extends com.five_corp.ad.internal.movie.partialcache.AbstractC1466e0 {
    @Override // com.five_corp.ad.internal.movie.partialcache.AbstractC1466e0, com.five_corp.ad.internal.movie.partialcache.D
    public final void a(com.five_corp.ad.internal.util.c cVar, com.five_corp.ad.internal.logger.a aVar) throws com.five_corp.ad.internal.movie.partialcache.C1505y0 {
        super.a(cVar, aVar);
        byte b = this.f;
        if (b == 1) {
            cVar.c();
        } else {
            if (b != 0) {
                throw new com.five_corp.ad.internal.movie.partialcache.C1505y0("Invalid version " + ((int) this.f) + " for mehd");
            }
            cVar.b();
            java.util.HashMap map = com.five_corp.ad.internal.movie.partialcache.j1.f2005a;
        }
    }
}

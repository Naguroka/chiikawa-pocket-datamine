package com.five_corp.ad.internal.movie.partialcache;

/* JADX INFO: renamed from: com.five_corp.ad.internal.movie.partialcache.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1480l0 extends com.five_corp.ad.internal.movie.partialcache.AbstractC1466e0 {
    public int h;

    @Override // com.five_corp.ad.internal.movie.partialcache.AbstractC1466e0, com.five_corp.ad.internal.movie.partialcache.D
    public final void a(com.five_corp.ad.internal.util.c cVar, com.five_corp.ad.internal.logger.a aVar) throws com.five_corp.ad.internal.movie.partialcache.C1505y0 {
        super.a(cVar, aVar);
        byte b = this.f;
        if (b == 1) {
            cVar.c();
            cVar.c();
            this.h = cVar.b();
            cVar.c();
        } else {
            if (b != 0) {
                throw new com.five_corp.ad.internal.movie.partialcache.C1505y0("Invalid version " + ((int) this.f) + " for mdhd");
            }
            cVar.b();
            java.util.HashMap map = com.five_corp.ad.internal.movie.partialcache.j1.f2005a;
            cVar.b();
            this.h = cVar.b();
            cVar.b();
        }
        cVar.b();
    }
}

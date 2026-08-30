package com.five_corp.ad.internal.movie.partialcache;

/* JADX INFO: loaded from: classes4.dex */
public final class b1 extends com.five_corp.ad.internal.movie.partialcache.AbstractC1466e0 {
    @Override // com.five_corp.ad.internal.movie.partialcache.AbstractC1466e0, com.five_corp.ad.internal.movie.partialcache.D
    public final void a(com.five_corp.ad.internal.util.c cVar, com.five_corp.ad.internal.logger.a aVar) throws com.five_corp.ad.internal.movie.partialcache.C1505y0 {
        super.a(cVar, aVar);
        byte b = this.f;
        if (b == 1) {
            cVar.c();
            cVar.c();
            cVar.b();
            cVar.b();
            cVar.c();
        } else {
            if (b != 0) {
                throw new com.five_corp.ad.internal.movie.partialcache.C1505y0("Invalid version " + ((int) this.f) + " for tkhd");
            }
            cVar.b();
            java.util.HashMap map = com.five_corp.ad.internal.movie.partialcache.j1.f2005a;
            cVar.b();
            cVar.b();
            cVar.b();
            cVar.b();
        }
        cVar.b();
        cVar.b();
        if (cVar.d() != 0) {
            java.util.HashMap map2 = com.five_corp.ad.internal.movie.partialcache.j1.f2005a;
        }
        if (cVar.d() != 0) {
            java.util.HashMap map3 = com.five_corp.ad.internal.movie.partialcache.j1.f2005a;
        }
        short sD = cVar.d();
        if (sD != 256 && sD != 0) {
            java.util.HashMap map4 = com.five_corp.ad.internal.movie.partialcache.j1.f2005a;
        }
        cVar.d();
        int[] iArr = new int[9];
        for (int i = 0; i < 9; i++) {
            iArr[i] = cVar.b();
        }
        if (!java.util.Arrays.equals(iArr, new int[]{65536, 0, 0, 0, 65536, 0, 0, 0, 1073741824})) {
            java.util.HashMap map5 = com.five_corp.ad.internal.movie.partialcache.j1.f2005a;
            java.util.Arrays.toString(iArr);
        }
        cVar.b();
        cVar.b();
    }
}

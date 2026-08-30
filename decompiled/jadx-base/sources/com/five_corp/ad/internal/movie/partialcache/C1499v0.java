package com.five_corp.ad.internal.movie.partialcache;

/* JADX INFO: renamed from: com.five_corp.ad.internal.movie.partialcache.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1499v0 extends com.five_corp.ad.internal.movie.partialcache.AbstractC1466e0 {
    public int h;
    public long i;

    @Override // com.five_corp.ad.internal.movie.partialcache.AbstractC1466e0, com.five_corp.ad.internal.movie.partialcache.D
    public final void a(com.five_corp.ad.internal.util.c cVar, com.five_corp.ad.internal.logger.a aVar) throws com.five_corp.ad.internal.movie.partialcache.C1505y0 {
        super.a(cVar, aVar);
        byte b = this.f;
        if (b == 1) {
            cVar.c();
            cVar.c();
            this.h = cVar.b();
            this.i = cVar.c();
        } else {
            if (b != 0) {
                throw new com.five_corp.ad.internal.movie.partialcache.C1505y0("Invalid version " + ((int) this.f) + " for mvhd");
            }
            cVar.b();
            java.util.HashMap map = com.five_corp.ad.internal.movie.partialcache.j1.f2005a;
            cVar.b();
            this.h = cVar.b();
            int iB = cVar.b();
            long j = iB;
            if (iB < 0) {
                j += 4294967296L;
            }
            this.i = j;
        }
        int iB2 = cVar.b();
        short sD = cVar.d();
        cVar.d();
        cVar.b();
        cVar.b();
        int[] iArr = new int[9];
        for (int i = 0; i < 9; i++) {
            iArr[i] = cVar.b();
        }
        cVar.a(new byte[24]);
        cVar.b();
        if (iB2 != 65536) {
            java.util.HashMap map2 = com.five_corp.ad.internal.movie.partialcache.j1.f2005a;
        }
        if (sD != 256) {
            java.util.HashMap map3 = com.five_corp.ad.internal.movie.partialcache.j1.f2005a;
        }
        if (java.util.Arrays.equals(iArr, new int[]{65536, 0, 0, 0, 65536, 0, 0, 0, 1073741824})) {
            return;
        }
        java.util.HashMap map4 = com.five_corp.ad.internal.movie.partialcache.j1.f2005a;
        java.util.Arrays.toString(iArr);
    }
}

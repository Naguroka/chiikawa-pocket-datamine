package com.five_corp.ad.internal.movie.partialcache;

/* JADX INFO: loaded from: classes4.dex */
public final class B extends com.five_corp.ad.internal.movie.partialcache.D {
    public int f;
    public int g;
    public int h;
    public byte[][] i;
    public byte[][] j;
    public int k;

    @Override // com.five_corp.ad.internal.movie.partialcache.D
    public final void a(com.five_corp.ad.internal.util.c cVar, com.five_corp.ad.internal.logger.a aVar) throws com.five_corp.ad.internal.movie.partialcache.C1505y0 {
        super.a(cVar, aVar);
        cVar.a();
        java.util.HashMap map = com.five_corp.ad.internal.movie.partialcache.j1.f2005a;
        this.f = com.five_corp.ad.internal.movie.partialcache.j1.a(cVar.a());
        cVar.a();
        this.g = com.five_corp.ad.internal.movie.partialcache.j1.a(cVar.a());
        cVar.a();
        int iA = cVar.a() & 31;
        this.h = iA;
        this.i = new byte[iA][];
        for (int i = 0; i < this.h; i++) {
            byte[] bArr = new byte[cVar.d()];
            this.i[i] = bArr;
            cVar.a(bArr);
        }
        int iA2 = cVar.a();
        this.k = iA2;
        this.j = new byte[iA2][];
        for (int i2 = 0; i2 < this.k; i2++) {
            byte[] bArr2 = new byte[cVar.d()];
            this.j[i2] = bArr2;
            cVar.a(bArr2);
        }
    }
}

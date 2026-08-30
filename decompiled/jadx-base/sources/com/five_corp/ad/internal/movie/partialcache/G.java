package com.five_corp.ad.internal.movie.partialcache;

/* JADX INFO: loaded from: classes4.dex */
public final class G extends com.five_corp.ad.internal.movie.partialcache.AbstractC1466e0 {
    public int[] h;

    @Override // com.five_corp.ad.internal.movie.partialcache.AbstractC1466e0, com.five_corp.ad.internal.movie.partialcache.D
    public final void a(com.five_corp.ad.internal.util.c cVar, com.five_corp.ad.internal.logger.a aVar) throws com.five_corp.ad.internal.movie.partialcache.C1505y0 {
        super.a(cVar, aVar);
        cVar.a();
        cVar.a();
        cVar.a();
        byte bA = cVar.a();
        int iB = cVar.b();
        this.h = new int[iB];
        int i = 0;
        if (bA == 4) {
            while (i < (iB + 1) / 2) {
                int iA = com.five_corp.ad.internal.movie.partialcache.j1.a(cVar.a());
                int[] iArr = this.h;
                int i2 = i * 2;
                iArr[i2] = iA >> 4;
                int i3 = i2 + 1;
                if (i3 < iB) {
                    iArr[i3] = iA & 15;
                }
                i++;
            }
            return;
        }
        if (bA == 8) {
            while (i < iB) {
                this.h[i] = com.five_corp.ad.internal.movie.partialcache.j1.a(cVar.a());
                i++;
            }
        } else {
            if (bA != 16) {
                throw new com.five_corp.ad.internal.movie.partialcache.C1505y0("stz2: Unsupported fieldSize " + ((int) bA));
            }
            while (i < iB) {
                int[] iArr2 = this.h;
                int iD = cVar.d();
                if (iD < 0) {
                    iD += 65536;
                }
                iArr2[i] = iD;
                i++;
            }
        }
    }
}

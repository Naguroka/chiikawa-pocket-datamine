package com.five_corp.ad.internal.movie.partialcache;

/* JADX INFO: renamed from: com.five_corp.ad.internal.movie.partialcache.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1458a0 extends com.five_corp.ad.internal.movie.partialcache.AbstractC1466e0 {
    public com.five_corp.ad.internal.movie.partialcache.X h;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.five_corp.ad.internal.movie.partialcache.Y] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.five_corp.ad.internal.movie.partialcache.X] */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.five_corp.ad.internal.movie.partialcache.V] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.five_corp.ad.internal.movie.partialcache.W] */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.five_corp.ad.internal.movie.partialcache.Z] */
    public static com.five_corp.ad.internal.movie.partialcache.X b(com.five_corp.ad.internal.util.c cVar) {
        int iA;
        ?? y;
        byte bA = cVar.a();
        int i = 0;
        int i2 = 0;
        do {
            iA = com.five_corp.ad.internal.movie.partialcache.j1.a(cVar.a());
            i++;
            i2 = (i2 << 7) | (iA & 127);
            if (i >= 4) {
                break;
            }
        } while ((iA & 128) > 0);
        int i3 = cVar.h;
        if (bA == 3) {
            y = new com.five_corp.ad.internal.movie.partialcache.Y();
            cVar.d();
            int iA2 = com.five_corp.ad.internal.movie.partialcache.j1.a(cVar.a());
            boolean z = ((iA2 >> 7) & 1) > 0;
            boolean z2 = ((iA2 >> 6) & 1) > 0;
            boolean z3 = ((iA2 >> 5) & 1) > 0;
            if (z) {
                cVar.d();
            }
            if (z2) {
                cVar.a(new byte[com.five_corp.ad.internal.movie.partialcache.j1.a(cVar.a())]);
            }
            if (z3) {
                cVar.d();
            }
        } else if (bA == 4) {
            y = new com.five_corp.ad.internal.movie.partialcache.V();
            cVar.a();
            cVar.a();
            com.five_corp.ad.internal.util.g gVarA = cVar.a(cVar.d);
            if (!gVarA.f2085a) {
                gVarA.b.b();
            }
            byte[] bArr = cVar.d;
            byte b = bArr[0];
            byte b2 = bArr[1];
            byte b3 = bArr[2];
            cVar.b();
            cVar.b();
        } else if (bA != 5) {
            y = new com.five_corp.ad.internal.movie.partialcache.Z();
            cVar.a(new byte[i2]);
        } else {
            y = new com.five_corp.ad.internal.movie.partialcache.W();
            byte[] bArr2 = new byte[i2];
            y.b = bArr2;
            cVar.a(bArr2);
        }
        while (cVar.h < i3 + i2) {
            y.f1988a.add(b(cVar));
        }
        return y;
    }

    @Override // com.five_corp.ad.internal.movie.partialcache.AbstractC1466e0, com.five_corp.ad.internal.movie.partialcache.D
    public final void a(com.five_corp.ad.internal.util.c cVar, com.five_corp.ad.internal.logger.a aVar) throws com.five_corp.ad.internal.movie.partialcache.C1505y0 {
        super.a(cVar, aVar);
        this.h = b(cVar);
    }
}

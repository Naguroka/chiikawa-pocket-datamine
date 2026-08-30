package com.five_corp.ad.internal.movie.partialcache;

/* JADX INFO: loaded from: classes4.dex */
public abstract class D {
    public static final byte[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f1985a;
    public byte[] b = new byte[4];
    public final java.util.ArrayList c = new java.util.ArrayList();
    public int d = 0;

    static {
        java.util.HashMap map = com.five_corp.ad.internal.movie.partialcache.j1.f2005a;
        e = "uuid".getBytes();
    }

    public final long a(com.five_corp.ad.internal.util.c cVar) {
        return (((long) this.d) + this.f1985a) - ((long) cVar.h);
    }

    public final void a(com.five_corp.ad.internal.util.c cVar, int i, com.five_corp.ad.internal.logger.a aVar) throws com.five_corp.ad.internal.movie.partialcache.C1505y0 {
        while (cVar.h < i) {
            java.util.HashMap map = com.five_corp.ad.internal.movie.partialcache.j1.f2005a;
            try {
                int iB = cVar.b();
                long jC = iB < 0 ? ((long) iB) + 4294967296L : iB;
                byte[] bArr = new byte[4];
                int i2 = 16;
                byte[] bArr2 = new byte[16];
                cVar.a(bArr);
                if (jC == 1) {
                    jC = cVar.c();
                } else {
                    if (jC == 0) {
                        throw new java.lang.RuntimeException("Box size = 0 is defined in ISO specification, but we do not support");
                    }
                    i2 = 8;
                }
                long j = jC;
                if (java.util.Arrays.equals(bArr, e)) {
                    cVar.a(bArr2);
                    i2 += 16;
                }
                com.five_corp.ad.internal.movie.partialcache.D dA = com.five_corp.ad.internal.movie.partialcache.j1.a(cVar, j, bArr, bArr2, i2, aVar);
                if (dA != null) {
                    this.c.add(dA);
                }
            } catch (java.nio.BufferUnderflowException e2) {
                throw new com.five_corp.ad.internal.movie.partialcache.C1505y0("buffer is insufficient", e2);
            }
        }
    }

    public void a(com.five_corp.ad.internal.util.c cVar, com.five_corp.ad.internal.logger.a aVar) throws com.five_corp.ad.internal.movie.partialcache.C1505y0 {
        if (!java.util.Arrays.equals(this.b, (byte[]) com.five_corp.ad.internal.movie.partialcache.j1.f2005a.get(getClass()))) {
            throw new com.five_corp.ad.internal.movie.partialcache.C1505y0("Box type mismatch");
        }
    }
}

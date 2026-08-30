package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class ds implements com.applovin.impl.lj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f741a;
    private final int b;
    private final long c;
    private final long d;
    private final long e;
    private final long[] f;

    public static com.applovin.impl.ds a(long j, long j2, com.applovin.impl.sf.a aVar, com.applovin.impl.ah ahVar) {
        int iA;
        int i = aVar.g;
        int i2 = aVar.d;
        int iJ = ahVar.j();
        if ((iJ & 1) != 1 || (iA = ahVar.A()) == 0) {
            return null;
        }
        long jC = com.applovin.impl.xp.c(iA, ((long) i) * 1000000, i2);
        if ((iJ & 6) != 6) {
            return new com.applovin.impl.ds(j2, aVar.c, jC);
        }
        long jY = ahVar.y();
        long[] jArr = new long[100];
        for (int i3 = 0; i3 < 100; i3++) {
            jArr[i3] = ahVar.w();
        }
        if (j != -1) {
            long j3 = j2 + jY;
            if (j != j3) {
                com.applovin.impl.oc.d("XingSeeker", "XING data size mismatch: " + j + ", " + j3);
            }
        }
        return new com.applovin.impl.ds(j2, aVar.c, jC, jY, jArr);
    }

    private ds(long j, int i, long j2) {
        this(j, i, j2, -1L, null);
    }

    @Override // com.applovin.impl.ij
    public com.applovin.impl.ij.a b(long j) {
        if (!b()) {
            return new com.applovin.impl.ij.a(new com.applovin.impl.kj(0L, this.f741a + ((long) this.b)));
        }
        long jB = com.applovin.impl.xp.b(j, 0L, this.c);
        double d = (jB * 100.0d) / this.c;
        double d2 = 0.0d;
        if (d > 0.0d) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i = (int) d;
                long[] jArr = (long[]) com.applovin.impl.b1.b(this.f);
                double d3 = jArr[i];
                d2 = d3 + ((d - ((double) i)) * ((i == 99 ? 256.0d : jArr[i + 1]) - d3));
            }
        }
        return new com.applovin.impl.ij.a(new com.applovin.impl.kj(jB, this.f741a + com.applovin.impl.xp.b(java.lang.Math.round((d2 / 256.0d) * this.d), this.b, this.d - 1)));
    }

    @Override // com.applovin.impl.ij
    public long d() {
        return this.c;
    }

    @Override // com.applovin.impl.lj
    public long c() {
        return this.e;
    }

    private ds(long j, int i, long j2, long j3, long[] jArr) {
        this.f741a = j;
        this.b = i;
        this.c = j2;
        this.f = jArr;
        this.d = j3;
        this.e = j3 != -1 ? j + j3 : -1L;
    }

    @Override // com.applovin.impl.lj
    public long a(long j) {
        long j2 = j - this.f741a;
        if (!b() || j2 <= this.b) {
            return 0L;
        }
        long[] jArr = (long[]) com.applovin.impl.b1.b(this.f);
        double d = (j2 * 256.0d) / this.d;
        int iB = com.applovin.impl.xp.b(jArr, (long) d, true, true);
        long jA = a(iB);
        long j3 = jArr[iB];
        int i = iB + 1;
        long jA2 = a(i);
        long j4 = iB == 99 ? 256L : jArr[i];
        return jA + java.lang.Math.round((j3 == j4 ? 0.0d : (d - j3) / (j4 - j3)) * (jA2 - jA));
    }

    @Override // com.applovin.impl.ij
    public boolean b() {
        return this.f != null;
    }

    private long a(int i) {
        return (this.c * ((long) i)) / 100;
    }
}

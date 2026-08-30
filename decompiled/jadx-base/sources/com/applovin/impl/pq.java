package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class pq implements com.applovin.impl.lj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long[] f1154a;
    private final long[] b;
    private final long c;
    private final long d;

    @Override // com.applovin.impl.ij
    public boolean b() {
        return true;
    }

    public static com.applovin.impl.pq a(long j, long j2, com.applovin.impl.sf.a aVar, com.applovin.impl.ah ahVar) {
        int iW;
        ahVar.g(10);
        int iJ = ahVar.j();
        if (iJ <= 0) {
            return null;
        }
        int i = aVar.d;
        long jC = com.applovin.impl.xp.c(iJ, ((long) (i >= 32000 ? 1152 : 576)) * 1000000, i);
        int iC = ahVar.C();
        int iC2 = ahVar.C();
        int iC3 = ahVar.C();
        ahVar.g(2);
        long j3 = j2 + ((long) aVar.c);
        long[] jArr = new long[iC];
        long[] jArr2 = new long[iC];
        int i2 = 0;
        long j4 = j2;
        while (i2 < iC) {
            int i3 = iC2;
            long j5 = j3;
            jArr[i2] = (((long) i2) * jC) / ((long) iC);
            jArr2[i2] = java.lang.Math.max(j4, j5);
            if (iC3 == 1) {
                iW = ahVar.w();
            } else if (iC3 == 2) {
                iW = ahVar.C();
            } else if (iC3 == 3) {
                iW = ahVar.z();
            } else {
                if (iC3 != 4) {
                    return null;
                }
                iW = ahVar.A();
            }
            j4 += (long) (iW * i3);
            i2++;
            j3 = j5;
            iC2 = i3;
        }
        if (j != -1 && j != j4) {
            com.applovin.impl.oc.d("VbriSeeker", "VBRI data size mismatch: " + j + ", " + j4);
        }
        return new com.applovin.impl.pq(jArr, jArr2, jC, j4);
    }

    private pq(long[] jArr, long[] jArr2, long j, long j2) {
        this.f1154a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j2;
    }

    @Override // com.applovin.impl.ij
    public com.applovin.impl.ij.a b(long j) {
        int iB = com.applovin.impl.xp.b(this.f1154a, j, true, true);
        com.applovin.impl.kj kjVar = new com.applovin.impl.kj(this.f1154a[iB], this.b[iB]);
        if (kjVar.f963a < j && iB != this.f1154a.length - 1) {
            int i = iB + 1;
            return new com.applovin.impl.ij.a(kjVar, new com.applovin.impl.kj(this.f1154a[i], this.b[i]));
        }
        return new com.applovin.impl.ij.a(kjVar);
    }

    @Override // com.applovin.impl.ij
    public long d() {
        return this.c;
    }

    @Override // com.applovin.impl.lj
    public long c() {
        return this.d;
    }

    @Override // com.applovin.impl.lj
    public long a(long j) {
        return this.f1154a[com.applovin.impl.xp.b(this.b, j, true, true)];
    }
}

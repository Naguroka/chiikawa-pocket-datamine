package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class jf implements com.applovin.impl.lj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long[] f924a;
    private final long[] b;
    private final long c;

    @Override // com.applovin.impl.ij
    public boolean b() {
        return true;
    }

    @Override // com.applovin.impl.lj
    public long c() {
        return -1L;
    }

    public static com.applovin.impl.jf a(long j, com.applovin.impl.Cif cif, long j2) {
        int length = cif.f.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += (long) (cif.c + cif.f[i3]);
            j3 += (long) (cif.d + cif.g[i3]);
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new com.applovin.impl.jf(jArr, jArr2, j2);
    }

    private jf(long[] jArr, long[] jArr2, long j) {
        this.f924a = jArr;
        this.b = jArr2;
        this.c = j == androidx.media3.common.C.TIME_UNSET ? com.applovin.impl.t2.a(jArr2[jArr2.length - 1]) : j;
    }

    @Override // com.applovin.impl.ij
    public com.applovin.impl.ij.a b(long j) {
        android.util.Pair pairA = a(com.applovin.impl.t2.b(com.applovin.impl.xp.b(j, 0L, this.c)), this.b, this.f924a);
        return new com.applovin.impl.ij.a(new com.applovin.impl.kj(com.applovin.impl.t2.a(((java.lang.Long) pairA.first).longValue()), ((java.lang.Long) pairA.second).longValue()));
    }

    @Override // com.applovin.impl.ij
    public long d() {
        return this.c;
    }

    @Override // com.applovin.impl.lj
    public long a(long j) {
        return com.applovin.impl.t2.a(((java.lang.Long) a(j, this.f924a, this.b).second).longValue());
    }

    private static android.util.Pair a(long j, long[] jArr, long[] jArr2) {
        int iB = com.applovin.impl.xp.b(jArr, j, true, true);
        long j2 = jArr[iB];
        long j3 = jArr2[iB];
        int i = iB + 1;
        if (i == jArr.length) {
            return android.util.Pair.create(java.lang.Long.valueOf(j2), java.lang.Long.valueOf(j3));
        }
        long j4 = jArr[i];
        return android.util.Pair.create(java.lang.Long.valueOf(j), java.lang.Long.valueOf(((long) ((j4 == j2 ? 0.0d : (j - j2) / (j4 - j2)) * (jArr2[i] - j3))) + j3));
    }
}

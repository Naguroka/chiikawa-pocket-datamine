package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class o4 implements com.applovin.impl.ij {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f1110a;
    private final long b;
    private final int c;
    private final long d;
    private final int e;
    private final long f;
    private final boolean g;

    public o4(long j, long j2, int i, int i2, boolean z) {
        this.f1110a = j;
        this.b = j2;
        this.c = i2 == -1 ? 1 : i2;
        this.e = i;
        this.g = z;
        if (j == -1) {
            this.d = -1L;
            this.f = androidx.media3.common.C.TIME_UNSET;
        } else {
            this.d = j - j2;
            this.f = a(j, j2, i);
        }
    }

    @Override // com.applovin.impl.ij
    public com.applovin.impl.ij.a b(long j) {
        if (this.d == -1 && !this.g) {
            return new com.applovin.impl.ij.a(new com.applovin.impl.kj(0L, this.b));
        }
        long jC = c(j);
        long jD = d(jC);
        com.applovin.impl.kj kjVar = new com.applovin.impl.kj(jD, jC);
        if (this.d != -1 && jD < j) {
            long j2 = jC + ((long) this.c);
            if (j2 < this.f1110a) {
                return new com.applovin.impl.ij.a(kjVar, new com.applovin.impl.kj(d(j2), j2));
            }
        }
        return new com.applovin.impl.ij.a(kjVar);
    }

    @Override // com.applovin.impl.ij
    public long d() {
        return this.f;
    }

    private static long a(long j, long j2, int i) {
        return (java.lang.Math.max(0L, j - j2) * 8000000) / ((long) i);
    }

    private long c(long j) {
        long j2 = (j * ((long) this.e)) / 8000000;
        long j3 = this.c;
        long jMin = (j2 / j3) * j3;
        long j4 = this.d;
        if (j4 != -1) {
            jMin = java.lang.Math.min(jMin, j4 - j3);
        }
        return this.b + java.lang.Math.max(jMin, 0L);
    }

    @Override // com.applovin.impl.ij
    public boolean b() {
        return this.d != -1 || this.g;
    }

    public long d(long j) {
        return a(j, this.b, this.e);
    }
}

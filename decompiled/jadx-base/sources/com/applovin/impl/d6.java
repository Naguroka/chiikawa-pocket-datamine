package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class d6 implements com.applovin.impl.jc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f707a;
    private final float b;
    private final long c;
    private final float d;
    private final long e;
    private final long f;
    private final float g;
    private long h;
    private long i;
    private long j;
    private long k;
    private long l;
    private long m;
    private float n;
    private float o;
    private float p;
    private long q;
    private long r;
    private long s;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f708a = 0.97f;
        private float b = 1.03f;
        private long c = 1000;
        private float d = 1.0E-7f;
        private long e = com.applovin.impl.t2.a(20L);
        private long f = com.applovin.impl.t2.a(500L);
        private float g = 0.999f;

        public com.applovin.impl.d6 a() {
            return new com.applovin.impl.d6(this.f708a, this.b, this.c, this.d, this.e, this.f, this.g);
        }
    }

    private static long a(long j, long j2, float f) {
        return (long) ((j * f) + ((1.0f - f) * j2));
    }

    private d6(float f, float f2, long j, float f3, long j2, long j3, float f4) {
        this.f707a = f;
        this.b = f2;
        this.c = j;
        this.d = f3;
        this.e = j2;
        this.f = j3;
        this.g = f4;
        this.h = androidx.media3.common.C.TIME_UNSET;
        this.i = androidx.media3.common.C.TIME_UNSET;
        this.k = androidx.media3.common.C.TIME_UNSET;
        this.l = androidx.media3.common.C.TIME_UNSET;
        this.o = f;
        this.n = f2;
        this.p = 1.0f;
        this.q = androidx.media3.common.C.TIME_UNSET;
        this.j = androidx.media3.common.C.TIME_UNSET;
        this.m = androidx.media3.common.C.TIME_UNSET;
        this.r = androidx.media3.common.C.TIME_UNSET;
        this.s = androidx.media3.common.C.TIME_UNSET;
    }

    @Override // com.applovin.impl.jc
    public float a(long j, long j2) {
        if (this.h == androidx.media3.common.C.TIME_UNSET) {
            return 1.0f;
        }
        b(j, j2);
        if (this.q != androidx.media3.common.C.TIME_UNSET && android.os.SystemClock.elapsedRealtime() - this.q < this.c) {
            return this.p;
        }
        this.q = android.os.SystemClock.elapsedRealtime();
        b(j);
        long j3 = j - this.m;
        if (java.lang.Math.abs(j3) < this.e) {
            this.p = 1.0f;
        } else {
            this.p = com.applovin.impl.xp.a((this.d * j3) + 1.0f, this.o, this.n);
        }
        return this.p;
    }

    private void c() {
        long j = this.h;
        if (j != androidx.media3.common.C.TIME_UNSET) {
            long j2 = this.i;
            if (j2 != androidx.media3.common.C.TIME_UNSET) {
                j = j2;
            }
            long j3 = this.k;
            if (j3 != androidx.media3.common.C.TIME_UNSET && j < j3) {
                j = j3;
            }
            long j4 = this.l;
            if (j4 != androidx.media3.common.C.TIME_UNSET && j > j4) {
                j = j4;
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.j == j) {
            return;
        }
        this.j = j;
        this.m = j;
        this.r = androidx.media3.common.C.TIME_UNSET;
        this.s = androidx.media3.common.C.TIME_UNSET;
        this.q = androidx.media3.common.C.TIME_UNSET;
    }

    private void b(long j) {
        long j2 = this.r + (this.s * 3);
        if (this.m > j2) {
            float fA = com.applovin.impl.t2.a(this.c);
            this.m = com.applovin.impl.rc.a(j2, this.j, this.m - (((long) ((this.p - 1.0f) * fA)) + ((long) ((this.n - 1.0f) * fA))));
            return;
        }
        long jB = com.applovin.impl.xp.b(j - ((long) (java.lang.Math.max(0.0f, this.p - 1.0f) / this.d)), this.m, j2);
        this.m = jB;
        long j3 = this.l;
        if (j3 == androidx.media3.common.C.TIME_UNSET || jB <= j3) {
            return;
        }
        this.m = j3;
    }

    @Override // com.applovin.impl.jc
    public void a() {
        long j = this.m;
        if (j == androidx.media3.common.C.TIME_UNSET) {
            return;
        }
        long j2 = j + this.f;
        this.m = j2;
        long j3 = this.l;
        if (j3 != androidx.media3.common.C.TIME_UNSET && j2 > j3) {
            this.m = j3;
        }
        this.q = androidx.media3.common.C.TIME_UNSET;
    }

    @Override // com.applovin.impl.jc
    public long b() {
        return this.m;
    }

    @Override // com.applovin.impl.jc
    public void a(com.applovin.impl.sd.f fVar) {
        this.h = com.applovin.impl.t2.a(fVar.f1254a);
        this.k = com.applovin.impl.t2.a(fVar.b);
        this.l = com.applovin.impl.t2.a(fVar.c);
        float f = fVar.d;
        if (f == -3.4028235E38f) {
            f = this.f707a;
        }
        this.o = f;
        float f2 = fVar.f;
        if (f2 == -3.4028235E38f) {
            f2 = this.b;
        }
        this.n = f2;
        c();
    }

    private void b(long j, long j2) {
        long j3 = j - j2;
        long j4 = this.r;
        if (j4 == androidx.media3.common.C.TIME_UNSET) {
            this.r = j3;
            this.s = 0L;
        } else {
            long jMax = java.lang.Math.max(j3, a(j4, j3, this.g));
            this.r = jMax;
            this.s = a(this.s, java.lang.Math.abs(j3 - jMax), this.g);
        }
    }

    @Override // com.applovin.impl.jc
    public void a(long j) {
        this.i = j;
        c();
    }
}

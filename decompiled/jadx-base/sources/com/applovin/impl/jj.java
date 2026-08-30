package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class jj {
    public static final com.applovin.impl.jj c;
    public static final com.applovin.impl.jj d;
    public static final com.applovin.impl.jj e;
    public static final com.applovin.impl.jj f;
    public static final com.applovin.impl.jj g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f927a;
    public final long b;

    static {
        com.applovin.impl.jj jjVar = new com.applovin.impl.jj(0L, 0L);
        c = jjVar;
        d = new com.applovin.impl.jj(Long.MAX_VALUE, Long.MAX_VALUE);
        e = new com.applovin.impl.jj(Long.MAX_VALUE, 0L);
        f = new com.applovin.impl.jj(0L, Long.MAX_VALUE);
        g = jjVar;
    }

    public jj(long j, long j2) {
        com.applovin.impl.b1.a(j >= 0);
        com.applovin.impl.b1.a(j2 >= 0);
        this.f927a = j;
        this.b = j2;
    }

    public long a(long j, long j2, long j3) {
        long j4 = this.f927a;
        if (j4 == 0 && this.b == 0) {
            return j;
        }
        long jD = com.applovin.impl.xp.d(j, j4, Long.MIN_VALUE);
        long jA = com.applovin.impl.xp.a(j, this.b, Long.MAX_VALUE);
        boolean z = jD <= j2 && j2 <= jA;
        boolean z2 = jD <= j3 && j3 <= jA;
        if (z && z2) {
            return java.lang.Math.abs(j2 - j) <= java.lang.Math.abs(j3 - j) ? j2 : j3;
        }
        if (z) {
            return j2;
        }
        return z2 ? j3 : jD;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.applovin.impl.jj.class != obj.getClass()) {
            return false;
        }
        com.applovin.impl.jj jjVar = (com.applovin.impl.jj) obj;
        return this.f927a == jjVar.f927a && this.b == jjVar.b;
    }

    public int hashCode() {
        return (((int) this.f927a) * 31) + ((int) this.b);
    }
}

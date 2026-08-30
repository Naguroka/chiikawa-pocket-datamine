package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class ho {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f856a;
    private long b;
    private long c;
    private final java.lang.ThreadLocal d = new java.lang.ThreadLocal();

    public synchronized long a(long j) {
        if (j == androidx.media3.common.C.TIME_UNSET) {
            return androidx.media3.common.C.TIME_UNSET;
        }
        if (this.b == androidx.media3.common.C.TIME_UNSET) {
            long jLongValue = this.f856a;
            if (jLongValue == androidx.media3.common.util.TimestampAdjuster.MODE_SHARED) {
                jLongValue = ((java.lang.Long) com.applovin.impl.b1.a((java.lang.Long) this.d.get())).longValue();
            }
            this.b = jLongValue - j;
            notifyAll();
        }
        this.c = j;
        return j + this.b;
    }

    public synchronized long b(long j) {
        if (j == androidx.media3.common.C.TIME_UNSET) {
            return androidx.media3.common.C.TIME_UNSET;
        }
        long j2 = this.c;
        if (j2 != androidx.media3.common.C.TIME_UNSET) {
            long jE = e(j2);
            long j3 = (4294967296L + jE) / 8589934592L;
            long j4 = ((j3 - 1) * 8589934592L) + j;
            j += j3 * 8589934592L;
            if (java.lang.Math.abs(j4 - jE) < java.lang.Math.abs(j - jE)) {
                j = j4;
            }
        }
        return a(c(j));
    }

    public ho(long j) {
        d(j);
    }

    public synchronized long c() {
        return this.b;
    }

    public synchronized void d(long j) {
        this.f856a = j;
        this.b = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.c = androidx.media3.common.C.TIME_UNSET;
    }

    public static long e(long j) {
        return (j * 90000) / 1000000;
    }

    public synchronized long b() {
        long jA;
        long j = this.c;
        if (j != androidx.media3.common.C.TIME_UNSET) {
            jA = j + this.b;
        } else {
            jA = a();
        }
        return jA;
    }

    public synchronized long a() {
        long j;
        j = this.f856a;
        if (j == Long.MAX_VALUE || j == androidx.media3.common.util.TimestampAdjuster.MODE_SHARED) {
            j = androidx.media3.common.C.TIME_UNSET;
        }
        return j;
    }

    public static long c(long j) {
        return (j * 1000000) / 90000;
    }
}

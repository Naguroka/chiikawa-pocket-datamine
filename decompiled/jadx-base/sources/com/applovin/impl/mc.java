package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class mc {
    private static final java.util.concurrent.atomic.AtomicLong h = new java.util.concurrent.atomic.AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1020a;
    public final com.applovin.impl.k5 b;
    public final android.net.Uri c;
    public final java.util.Map d;
    public final long e;
    public final long f;
    public final long g;

    public static long a() {
        return h.getAndIncrement();
    }

    public mc(long j, com.applovin.impl.k5 k5Var, long j2) {
        this(j, k5Var, k5Var.f947a, java.util.Collections.emptyMap(), j2, 0L, 0L);
    }

    public mc(long j, com.applovin.impl.k5 k5Var, android.net.Uri uri, java.util.Map map, long j2, long j3, long j4) {
        this.f1020a = j;
        this.b = k5Var;
        this.c = uri;
        this.d = map;
        this.e = j2;
        this.f = j3;
        this.g = j4;
    }
}

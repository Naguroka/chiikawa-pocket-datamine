package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class u2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f1382a;
    private long b;
    private boolean c;
    private long d;
    private long e;
    private int f;
    private java.lang.Throwable g;

    public java.lang.String toString() {
        return "CacheStatsTracker{totalDownloadedBytes=" + this.f1382a + ", totalCachedBytes=" + this.b + ", isHTMLCachingCancelled=" + this.c + ", htmlResourceCacheSuccessCount=" + this.d + ", htmlResourceCacheFailureCount=" + this.e + '}';
    }

    public void d() {
        this.d++;
    }

    public void c() {
        this.e++;
    }

    public java.lang.Throwable a() {
        return this.g;
    }

    public int b() {
        return this.f;
    }

    public void a(java.lang.Throwable th) {
        this.g = th;
    }

    public void a(int i) {
        this.f = i;
    }

    public void a(long j) {
        this.b += j;
    }
}

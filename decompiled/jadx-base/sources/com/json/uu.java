package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class uu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected long f3483a;
    protected long b;
    protected long c;

    public long a() {
        return java.lang.Math.max(0L, this.f3483a - java.lang.System.currentTimeMillis());
    }

    public void a(long j) {
        this.f3483a = java.lang.System.currentTimeMillis() + j;
    }

    public void b() {
        this.f3483a = 0L;
        this.b = 0L;
        this.c = 0L;
    }

    public void b(long j) {
        this.c = j;
        this.f3483a += j - this.b;
    }

    public void c(long j) {
        this.b = j;
        this.c = 0L;
    }
}

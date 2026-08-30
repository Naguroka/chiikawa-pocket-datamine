package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class rh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.rh.b f1226a;
    private final com.applovin.impl.rh.a b;
    private final com.applovin.impl.l3 c;
    private final com.applovin.impl.fo d;
    private int e;
    private java.lang.Object f;
    private android.os.Looper g;
    private int h;
    private long i = androidx.media3.common.C.TIME_UNSET;
    private boolean j = true;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;

    public interface a {
        void a(com.applovin.impl.rh rhVar);
    }

    public interface b {
        void a(int i, java.lang.Object obj);
    }

    public rh(com.applovin.impl.rh.a aVar, com.applovin.impl.rh.b bVar, com.applovin.impl.fo foVar, int i, com.applovin.impl.l3 l3Var, android.os.Looper looper) {
        this.b = aVar;
        this.f1226a = bVar;
        this.d = foVar;
        this.g = looper;
        this.c = l3Var;
        this.h = i;
    }

    public com.applovin.impl.fo f() {
        return this.d;
    }

    public com.applovin.impl.rh.b e() {
        return this.f1226a;
    }

    public int g() {
        return this.e;
    }

    public java.lang.Object c() {
        return this.f;
    }

    public android.os.Looper b() {
        return this.g;
    }

    public long d() {
        return this.i;
    }

    public int h() {
        return this.h;
    }

    public com.applovin.impl.rh j() {
        com.applovin.impl.b1.b(!this.k);
        if (this.i == androidx.media3.common.C.TIME_UNSET) {
            com.applovin.impl.b1.a(this.j);
        }
        this.k = true;
        this.b.a(this);
        return this;
    }

    public synchronized boolean i() {
        return this.n;
    }

    public synchronized boolean a(long j) {
        boolean z;
        com.applovin.impl.b1.b(this.k);
        com.applovin.impl.b1.b(this.g.getThread() != java.lang.Thread.currentThread());
        long jC = this.c.c() + j;
        while (true) {
            z = this.m;
            if (z || j <= 0) {
                break;
            }
            this.c.b();
            wait(j);
            j = jC - this.c.c();
        }
        if (!z) {
            throw new java.util.concurrent.TimeoutException("Message delivery timed out.");
        }
        return this.l;
    }

    public boolean a() {
        return this.j;
    }

    public synchronized void a(boolean z) {
        this.l = z | this.l;
        this.m = true;
        notifyAll();
    }

    public com.applovin.impl.rh a(java.lang.Object obj) {
        com.applovin.impl.b1.b(!this.k);
        this.f = obj;
        return this;
    }

    public com.applovin.impl.rh a(int i) {
        com.applovin.impl.b1.b(!this.k);
        this.e = i;
        return this;
    }
}

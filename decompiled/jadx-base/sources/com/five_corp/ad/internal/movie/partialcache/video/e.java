package com.five_corp.ad.internal.movie.partialcache.video;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.ArrayDeque f2028a = new java.util.ArrayDeque();
    public final java.util.ArrayDeque b = new java.util.ArrayDeque();
    public long c = 0;
    public long d = 0;
    public boolean e = false;
    public long f = 0;

    public final void a(com.five_corp.ad.internal.movie.partialcache.x1 x1Var) {
        this.f2028a.addLast(x1Var);
        this.f = x1Var.d;
        if (x1Var.f) {
            this.e = true;
        }
    }

    public final com.five_corp.ad.internal.movie.partialcache.x1 b() {
        com.five_corp.ad.internal.movie.partialcache.x1 x1Var = (com.five_corp.ad.internal.movie.partialcache.x1) this.f2028a.pollFirst();
        if (x1Var == null) {
            return null;
        }
        if (x1Var.e == 1) {
            this.d = x1Var.d;
        }
        this.b.addLast(x1Var);
        return x1Var;
    }

    public final void c() {
        while (!this.b.isEmpty()) {
            this.f2028a.addFirst((com.five_corp.ad.internal.movie.partialcache.x1) this.b.pollLast());
        }
    }

    public final void a() {
        this.f2028a.clear();
        this.b.clear();
        this.c = 0L;
        this.d = 0L;
        this.e = false;
        this.f = 0L;
    }

    public final void a(long j) {
        long j2 = this.d;
        if (j2 == this.c || j2 > j) {
            return;
        }
        while (!this.b.isEmpty() && ((com.five_corp.ad.internal.movie.partialcache.x1) this.b.peekFirst()).d < this.d) {
            this.b.pollFirst();
        }
        this.c = this.d;
    }
}

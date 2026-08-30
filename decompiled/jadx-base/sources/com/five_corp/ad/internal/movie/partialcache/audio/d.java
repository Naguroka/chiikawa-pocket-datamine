package com.five_corp.ad.internal.movie.partialcache.audio;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.ArrayDeque f1994a = new java.util.ArrayDeque();
    public final java.util.ArrayDeque b = new java.util.ArrayDeque();
    public boolean d = false;
    public long e = 0;
    public boolean c = true;

    public final void a(com.five_corp.ad.internal.movie.partialcache.x1 x1Var) {
        this.f1994a.addLast(x1Var);
        this.e = x1Var.d;
        if (x1Var.f) {
            this.d = true;
        }
    }

    public final com.five_corp.ad.internal.movie.partialcache.x1 b() {
        com.five_corp.ad.internal.movie.partialcache.x1 x1Var = (com.five_corp.ad.internal.movie.partialcache.x1) this.f1994a.pollFirst();
        if (x1Var != null) {
            this.b.addLast(x1Var);
        }
        return x1Var;
    }

    public final void a() {
        this.f1994a.clear();
        this.b.clear();
        this.d = false;
        this.e = 0L;
    }

    public final long b(long j) {
        while (!this.b.isEmpty() && j <= ((com.five_corp.ad.internal.movie.partialcache.x1) this.b.peekLast()).d) {
            this.f1994a.addFirst((com.five_corp.ad.internal.movie.partialcache.x1) this.b.pollLast());
        }
        this.b.clear();
        return !this.f1994a.isEmpty() ? ((com.five_corp.ad.internal.movie.partialcache.x1) this.f1994a.peekFirst()).d : j;
    }

    public final void a(long j) {
        java.util.Iterator it = this.b.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext() && ((com.five_corp.ad.internal.movie.partialcache.x1) it.next()).d < j) {
            i2++;
        }
        if (i2 != this.b.size()) {
            while (true) {
                i2--;
                if (i2 <= 0) {
                    return;
                } else {
                    this.b.pollFirst();
                }
            }
        } else {
            java.util.Iterator it2 = this.f1994a.iterator();
            while (it2.hasNext() && ((com.five_corp.ad.internal.movie.partialcache.x1) it2.next()).d < j) {
                i++;
            }
            if (i == this.f1994a.size()) {
                this.b.clear();
                this.f1994a.clear();
            } else if (i == 0) {
                while (this.b.size() > 1) {
                    this.b.pollFirst();
                }
            } else {
                this.b.clear();
                while (true) {
                    i--;
                    if (i <= 0) {
                        return;
                    } else {
                        this.f1994a.pollFirst();
                    }
                }
            }
        }
    }
}

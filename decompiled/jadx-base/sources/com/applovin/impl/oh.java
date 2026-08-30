package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class oh {
    private static final com.applovin.impl.ae.a t = new com.applovin.impl.ae.a(new java.lang.Object());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.applovin.impl.fo f1125a;
    public final com.applovin.impl.ae.a b;
    public final long c;
    public final long d;
    public final int e;
    public final com.applovin.impl.z7 f;
    public final boolean g;
    public final com.applovin.impl.po h;
    public final com.applovin.impl.wo i;
    public final java.util.List j;
    public final com.applovin.impl.ae.a k;
    public final boolean l;
    public final int m;
    public final com.applovin.impl.ph n;
    public final boolean o;
    public final boolean p;
    public volatile long q;
    public volatile long r;
    public volatile long s;

    public static com.applovin.impl.oh a(com.applovin.impl.wo woVar) {
        com.applovin.impl.fo foVar = com.applovin.impl.fo.f792a;
        com.applovin.impl.ae.a aVar = t;
        return new com.applovin.impl.oh(foVar, aVar, androidx.media3.common.C.TIME_UNSET, 0L, 1, null, false, com.applovin.impl.po.d, woVar, com.applovin.impl.db.h(), aVar, false, 0, com.applovin.impl.ph.d, 0L, 0L, 0L, false, false);
    }

    public com.applovin.impl.oh b(boolean z) {
        return new com.applovin.impl.oh(this.f1125a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.q, this.r, this.s, z, this.p);
    }

    public com.applovin.impl.oh c(boolean z) {
        return new com.applovin.impl.oh(this.f1125a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.q, this.r, this.s, this.o, z);
    }

    public static com.applovin.impl.ae.a a() {
        return t;
    }

    public com.applovin.impl.oh a(com.applovin.impl.ae.a aVar, long j, long j2, long j3, long j4, com.applovin.impl.po poVar, com.applovin.impl.wo woVar, java.util.List list) {
        return new com.applovin.impl.oh(this.f1125a, aVar, j2, j3, this.e, this.f, this.g, poVar, woVar, list, this.k, this.l, this.m, this.n, this.q, j4, j, this.o, this.p);
    }

    public com.applovin.impl.oh a(com.applovin.impl.fo foVar) {
        return new com.applovin.impl.oh(foVar, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.q, this.r, this.s, this.o, this.p);
    }

    public com.applovin.impl.oh a(int i) {
        return new com.applovin.impl.oh(this.f1125a, this.b, this.c, this.d, i, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.q, this.r, this.s, this.o, this.p);
    }

    public com.applovin.impl.oh a(com.applovin.impl.z7 z7Var) {
        return new com.applovin.impl.oh(this.f1125a, this.b, this.c, this.d, this.e, z7Var, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.q, this.r, this.s, this.o, this.p);
    }

    public com.applovin.impl.oh a(boolean z) {
        return new com.applovin.impl.oh(this.f1125a, this.b, this.c, this.d, this.e, this.f, z, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.q, this.r, this.s, this.o, this.p);
    }

    public com.applovin.impl.oh a(com.applovin.impl.ae.a aVar) {
        return new com.applovin.impl.oh(this.f1125a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, aVar, this.l, this.m, this.n, this.q, this.r, this.s, this.o, this.p);
    }

    public com.applovin.impl.oh a(boolean z, int i) {
        return new com.applovin.impl.oh(this.f1125a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, z, i, this.n, this.q, this.r, this.s, this.o, this.p);
    }

    public com.applovin.impl.oh a(com.applovin.impl.ph phVar) {
        return new com.applovin.impl.oh(this.f1125a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, phVar, this.q, this.r, this.s, this.o, this.p);
    }

    public oh(com.applovin.impl.fo foVar, com.applovin.impl.ae.a aVar, long j, long j2, int i, com.applovin.impl.z7 z7Var, boolean z, com.applovin.impl.po poVar, com.applovin.impl.wo woVar, java.util.List list, com.applovin.impl.ae.a aVar2, boolean z2, int i2, com.applovin.impl.ph phVar, long j3, long j4, long j5, boolean z3, boolean z4) {
        this.f1125a = foVar;
        this.b = aVar;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = z7Var;
        this.g = z;
        this.h = poVar;
        this.i = woVar;
        this.j = list;
        this.k = aVar2;
        this.l = z2;
        this.m = i2;
        this.n = phVar;
        this.q = j3;
        this.r = j4;
        this.s = j5;
        this.o = z3;
        this.p = z4;
    }
}

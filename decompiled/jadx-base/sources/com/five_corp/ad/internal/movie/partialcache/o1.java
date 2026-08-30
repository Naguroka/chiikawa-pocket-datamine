package com.five_corp.ad.internal.movie.partialcache;

/* JADX INFO: loaded from: classes4.dex */
public final class o1 implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.movie.partialcache.w1 f2016a;
    public final /* synthetic */ com.five_corp.ad.internal.movie.partialcache.u1 b;

    public o1(com.five_corp.ad.internal.movie.partialcache.u1 u1Var, com.five_corp.ad.internal.movie.partialcache.w1 w1Var) {
        this.b = u1Var;
        this.f2016a = w1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f2016a.a(this.b.h);
        } catch (java.lang.Throwable th) {
            com.five_corp.ad.internal.movie.partialcache.u1 u1Var = this.b;
            u1Var.a(u1Var.h, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.o5, null, th, null));
        }
    }
}

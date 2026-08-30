package com.five_corp.ad.internal.movie;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.movie.partialcache.w1 f1983a;
    public final /* synthetic */ com.five_corp.ad.internal.movie.x b;

    public o(com.five_corp.ad.internal.movie.x xVar, com.five_corp.ad.internal.movie.C1454k c1454k) {
        this.b = xVar;
        this.f1983a = c1454k;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f1983a.a(this.b.m);
        } catch (java.lang.Throwable th) {
            this.b.a(new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.t0, null, th, null));
        }
    }
}

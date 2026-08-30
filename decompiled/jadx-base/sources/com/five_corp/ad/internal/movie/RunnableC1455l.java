package com.five_corp.ad.internal.movie;

/* JADX INFO: renamed from: com.five_corp.ad.internal.movie.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC1455l implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.movie.partialcache.w1 f1980a;
    public final /* synthetic */ com.five_corp.ad.internal.movie.x b;

    public RunnableC1455l(com.five_corp.ad.internal.movie.x xVar, com.five_corp.ad.internal.movie.partialcache.w1 w1Var) {
        this.b = xVar;
        this.f1980a = w1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f1980a.a(this.b.m);
        } catch (java.lang.Throwable th) {
            this.b.a(new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.t0, null, th, null));
        }
    }
}

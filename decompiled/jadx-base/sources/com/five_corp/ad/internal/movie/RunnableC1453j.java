package com.five_corp.ad.internal.movie;

/* JADX INFO: renamed from: com.five_corp.ad.internal.movie.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC1453j implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.movie.C1454k f1978a;

    public RunnableC1453j(com.five_corp.ad.internal.movie.C1454k c1454k) {
        this.f1978a = c1454k;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.five_corp.ad.internal.movie.x xVar = this.f1978a.b;
        com.five_corp.ad.internal.movie.F f = xVar.b;
        xVar.a();
        ((com.five_corp.ad.internal.view.G) f).a(this.f1978a.f1979a);
    }
}

package com.five_corp.ad.internal.movie;

/* JADX INFO: renamed from: com.five_corp.ad.internal.movie.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC1446c implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.movie.x f1963a;

    public RunnableC1446c(com.five_corp.ad.internal.movie.x xVar) {
        this.f1963a = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.five_corp.ad.internal.movie.x xVar = this.f1963a;
        com.five_corp.ad.internal.movie.F f = xVar.b;
        int iA = xVar.a();
        com.five_corp.ad.f fVar = (com.five_corp.ad.f) ((com.five_corp.ad.internal.view.G) f).d;
        fVar.s.a();
        fVar.o.u(iA, fVar.t);
    }
}

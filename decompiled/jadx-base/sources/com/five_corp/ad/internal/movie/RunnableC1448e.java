package com.five_corp.ad.internal.movie;

/* JADX INFO: renamed from: com.five_corp.ad.internal.movie.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC1448e implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.movie.x f1965a;

    public RunnableC1448e(com.five_corp.ad.internal.movie.x xVar) {
        this.f1965a = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.five_corp.ad.internal.movie.x xVar = this.f1965a;
        ((com.five_corp.ad.internal.view.G) xVar.b).c(xVar.a());
    }
}

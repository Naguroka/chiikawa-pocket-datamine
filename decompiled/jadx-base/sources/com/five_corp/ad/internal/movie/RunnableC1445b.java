package com.five_corp.ad.internal.movie;

/* JADX INFO: renamed from: com.five_corp.ad.internal.movie.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC1445b implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.movie.x f1962a;

    public RunnableC1445b(com.five_corp.ad.internal.movie.x xVar) {
        this.f1962a = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.five_corp.ad.internal.movie.x xVar = this.f1962a;
        ((com.five_corp.ad.internal.view.G) xVar.b).a(xVar.a());
    }
}

package com.five_corp.ad.internal.movie;

/* JADX INFO: renamed from: com.five_corp.ad.internal.movie.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC1449f implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.movie.x f1974a;

    public RunnableC1449f(com.five_corp.ad.internal.movie.x xVar) {
        this.f1974a = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.five_corp.ad.internal.movie.x xVar = this.f1974a;
        ((com.five_corp.ad.internal.view.G) xVar.b).b(xVar.a());
    }
}

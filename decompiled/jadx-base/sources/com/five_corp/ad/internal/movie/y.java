package com.five_corp.ad.internal.movie;

/* JADX INFO: loaded from: classes4.dex */
public final class y implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.s f2040a;
    public final /* synthetic */ com.five_corp.ad.internal.movie.E b;

    public y(com.five_corp.ad.internal.movie.E e, com.five_corp.ad.internal.s sVar) {
        this.b = e;
        this.f2040a = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.five_corp.ad.internal.movie.E e = this.b;
        com.five_corp.ad.internal.movie.F f = e.f1955a;
        e.a();
        ((com.five_corp.ad.internal.view.G) f).a(this.f2040a);
    }
}

package com.five_corp.ad.internal.movie;

/* JADX INFO: loaded from: classes4.dex */
public final class A implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.movie.E f1952a;

    public A(com.five_corp.ad.internal.movie.E e) {
        this.f1952a = e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.five_corp.ad.internal.movie.E e = this.f1952a;
        ((com.five_corp.ad.internal.view.G) e.f1955a).a(e.a());
    }
}

package com.five_corp.ad.internal.view;

/* JADX INFO: loaded from: classes4.dex */
public final class A implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.view.D f2087a;

    public A(com.five_corp.ad.internal.view.D d) {
        this.f2087a = d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2087a.b.setKeepScreenOn(false);
        com.five_corp.ad.internal.view.D.a(this.f2087a);
        this.f2087a.f.setVisibility(0);
    }
}

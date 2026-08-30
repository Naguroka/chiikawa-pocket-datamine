package com.five_corp.ad.internal.view;

/* JADX INFO: loaded from: classes4.dex */
public final class z implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.view.D f2113a;

    public z(com.five_corp.ad.internal.view.D d) {
        this.f2113a = d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2113a.b.setKeepScreenOn(false);
        com.five_corp.ad.internal.view.D.a(this.f2113a);
    }
}

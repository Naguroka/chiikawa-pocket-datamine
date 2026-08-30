package com.five_corp.ad.internal.view;

/* JADX INFO: loaded from: classes4.dex */
public final class B implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.view.D f2088a;

    public B(com.five_corp.ad.internal.view.D d) {
        this.f2088a = d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2088a.b.setKeepScreenOn(true);
        this.f2088a.f.setVisibility(8);
    }
}

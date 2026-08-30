package com.five_corp.ad.internal.view;

/* JADX INFO: loaded from: classes4.dex */
public final class y implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.view.D f2112a;

    public y(com.five_corp.ad.internal.view.D d) {
        this.f2112a = d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2112a.b.setKeepScreenOn(false);
        com.five_corp.ad.internal.view.D.a(this.f2112a);
    }
}

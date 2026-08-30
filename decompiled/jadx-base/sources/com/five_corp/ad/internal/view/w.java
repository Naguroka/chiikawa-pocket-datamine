package com.five_corp.ad.internal.view;

/* JADX INFO: loaded from: classes4.dex */
public final class w implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.view.D f2110a;

    public w(com.five_corp.ad.internal.view.D d) {
        this.f2110a = d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2110a.b.setKeepScreenOn(false);
        this.f2110a.f.setVisibility(8);
        com.five_corp.ad.internal.view.D.a(this.f2110a);
    }
}

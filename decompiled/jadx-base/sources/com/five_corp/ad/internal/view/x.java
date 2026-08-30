package com.five_corp.ad.internal.view;

/* JADX INFO: loaded from: classes4.dex */
public final class x implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.view.D f2111a;

    public x(com.five_corp.ad.internal.view.D d) {
        this.f2111a = d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2111a.b.setKeepScreenOn(true);
        this.f2111a.f.setVisibility(8);
        this.f2111a.g.setVisibility(8);
    }
}

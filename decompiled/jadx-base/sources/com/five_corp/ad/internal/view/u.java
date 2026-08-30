package com.five_corp.ad.internal.view;

/* JADX INFO: loaded from: classes4.dex */
public final class u implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f2108a;
    public final /* synthetic */ com.five_corp.ad.internal.view.D b;

    public u(com.five_corp.ad.internal.view.D d, android.view.View view) {
        this.b = d;
        this.f2108a = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.c.addView(this.f2108a);
    }
}

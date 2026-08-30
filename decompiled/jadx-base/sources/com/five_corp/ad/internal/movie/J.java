package com.five_corp.ad.internal.movie;

/* JADX INFO: loaded from: classes4.dex */
public final class J implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.movie.L f1958a;
    public final /* synthetic */ android.view.Surface b;

    public J(com.five_corp.ad.internal.movie.L l, android.view.Surface surface) {
        this.f1958a = l;
        this.b = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1958a.a(this.b);
    }
}

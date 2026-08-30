package com.five_corp.ad.internal.movie;

/* JADX INFO: loaded from: classes4.dex */
public final class H implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.movie.L f1956a;
    public final /* synthetic */ android.view.Surface b;

    public H(com.five_corp.ad.internal.movie.L l, android.view.Surface surface) {
        this.f1956a = l;
        this.b = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1956a.a(this.b);
    }
}

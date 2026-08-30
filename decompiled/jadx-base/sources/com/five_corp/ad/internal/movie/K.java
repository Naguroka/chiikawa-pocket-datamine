package com.five_corp.ad.internal.movie;

/* JADX INFO: loaded from: classes4.dex */
public final class K implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.movie.L f1959a;
    public final /* synthetic */ android.view.Surface b;
    public final /* synthetic */ android.graphics.SurfaceTexture c;

    public K(com.five_corp.ad.internal.movie.L l, android.view.Surface surface, android.graphics.SurfaceTexture surfaceTexture) {
        this.f1959a = l;
        this.b = surface;
        this.c = surfaceTexture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1959a.c();
        this.b.release();
        this.c.release();
    }
}

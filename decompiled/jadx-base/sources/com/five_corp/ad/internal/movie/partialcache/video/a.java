package com.five_corp.ad.internal.movie.partialcache.video;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.movie.partialcache.w1 f2025a;
    public final /* synthetic */ com.five_corp.ad.internal.movie.partialcache.video.d b;

    public a(com.five_corp.ad.internal.movie.partialcache.video.d dVar, com.five_corp.ad.internal.movie.partialcache.video.b bVar) {
        this.b = dVar;
        this.f2025a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f2025a.a(this.b.b);
        } catch (java.lang.Throwable th) {
            ((com.five_corp.ad.internal.movie.x) this.b.c).a(new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.y0, null, th, null));
        }
    }
}

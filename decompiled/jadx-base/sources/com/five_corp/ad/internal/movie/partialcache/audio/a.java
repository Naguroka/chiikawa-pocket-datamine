package com.five_corp.ad.internal.movie.partialcache.audio;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.movie.partialcache.w1 f1991a;
    public final /* synthetic */ com.five_corp.ad.internal.movie.partialcache.audio.c b;

    public a(com.five_corp.ad.internal.movie.partialcache.audio.c cVar, com.five_corp.ad.internal.movie.partialcache.audio.b bVar) {
        this.b = cVar;
        this.f1991a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f1991a.a(this.b.b);
        } catch (java.lang.Throwable th) {
            this.b.c.a(new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.z0, null, th, null));
        }
    }
}

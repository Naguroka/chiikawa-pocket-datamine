package com.five_corp.ad.internal.movie.partialcache.video;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.os.Handler f2027a;
    public final com.five_corp.ad.internal.movie.partialcache.C1459b b;
    public final com.five_corp.ad.internal.movie.partialcache.video.c c;

    public d(android.os.Looper looper, com.five_corp.ad.internal.movie.partialcache.C1459b c1459b, com.five_corp.ad.internal.movie.partialcache.video.c cVar) {
        java.lang.System.identityHashCode(this);
        this.f2027a = new android.os.Handler(looper);
        this.b = c1459b;
        this.c = cVar;
    }

    public static void a(com.five_corp.ad.internal.movie.partialcache.C1459b c1459b) {
        com.five_corp.ad.internal.movie.partialcache.video.f fVar = c1459b.e;
        if (fVar != null) {
            fVar.a();
        }
    }
}

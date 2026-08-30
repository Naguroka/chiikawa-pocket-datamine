package com.five_corp.ad.internal.movie.partialcache.audio;

/* JADX INFO: loaded from: classes4.dex */
public final class m {
    public static final com.five_corp.ad.internal.movie.partialcache.audio.i g = new com.five_corp.ad.internal.movie.partialcache.audio.i();
    public final com.five_corp.ad.internal.movie.partialcache.audio.h b;
    public android.os.Handler c;
    public android.os.HandlerThread d;
    public android.media.AudioTrack e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f2000a = com.five_corp.ad.internal.movie.partialcache.audio.m.class.getName() + java.lang.System.identityHashCode(this);
    public int f = 1;

    public m(com.five_corp.ad.internal.movie.partialcache.audio.h hVar) {
        this.b = hVar;
    }

    public static void a(com.five_corp.ad.internal.movie.partialcache.audio.m mVar, com.five_corp.ad.internal.s sVar) {
        int i = mVar.f;
        if (i == 3 || i == 4) {
            return;
        }
        mVar.f = 3;
        com.five_corp.ad.internal.movie.partialcache.audio.g gVar = (com.five_corp.ad.internal.movie.partialcache.audio.g) mVar.b;
        int i2 = gVar.d;
        if (i2 == 5 || i2 == 6) {
            return;
        }
        gVar.d = 5;
        ((com.five_corp.ad.internal.movie.partialcache.audio.c) gVar.b).c.a(sVar);
    }
}

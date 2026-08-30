package com.five_corp.ad.internal.movie;

/* JADX INFO: renamed from: com.five_corp.ad.internal.movie.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1450g implements com.five_corp.ad.internal.movie.partialcache.w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.media.MediaFormat f1975a;
    public final /* synthetic */ android.media.MediaFormat b;
    public final /* synthetic */ com.five_corp.ad.internal.movie.x c;

    public C1450g(com.five_corp.ad.internal.movie.x xVar, android.media.MediaFormat mediaFormat, android.media.MediaFormat mediaFormat2) {
        this.c = xVar;
        this.f1975a = mediaFormat;
        this.b = mediaFormat2;
    }

    @Override // com.five_corp.ad.internal.movie.partialcache.w1
    public final void a(java.lang.Object obj) {
        com.five_corp.ad.internal.movie.partialcache.C1459b c1459b = (com.five_corp.ad.internal.movie.partialcache.C1459b) obj;
        com.five_corp.ad.internal.movie.x xVar = this.c;
        int i = xVar.o;
        if (i != 2) {
            com.five_corp.ad.internal.movie.w.a(i);
            return;
        }
        xVar.o = 3;
        com.five_corp.ad.internal.movie.partialcache.video.d dVar = xVar.k;
        android.media.MediaFormat mediaFormat = this.f1975a;
        dVar.getClass();
        c1459b.e = new com.five_corp.ad.internal.movie.partialcache.video.f(mediaFormat, new android.os.Handler(dVar.f2027a.getLooper()), dVar);
        this.c.f.b();
        com.five_corp.ad.internal.movie.x xVar2 = this.c;
        com.five_corp.ad.internal.movie.partialcache.audio.d dVar2 = xVar2.j;
        android.media.MediaFormat mediaFormat2 = this.b;
        dVar2.c = mediaFormat2 != null;
        if (mediaFormat2 != null) {
            com.five_corp.ad.internal.movie.partialcache.audio.c cVar = xVar2.i;
            if (cVar.d == 1) {
                cVar.d = c1459b.f2001a ? 3 : 7;
                c1459b.c = new com.five_corp.ad.internal.movie.partialcache.audio.g(mediaFormat2, cVar.f1993a.getLooper(), cVar);
            }
        }
        com.five_corp.ad.internal.movie.x xVar3 = this.c;
        xVar3.a(c1459b.b + xVar3.c);
    }
}

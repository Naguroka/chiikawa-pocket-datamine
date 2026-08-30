package com.five_corp.ad.internal.movie.partialcache.mediacodec;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2011a;
    public final /* synthetic */ android.media.MediaCodec.BufferInfo b;
    public final /* synthetic */ com.five_corp.ad.internal.movie.partialcache.mediacodec.h c;

    public f(com.five_corp.ad.internal.movie.partialcache.mediacodec.h hVar, int i, android.media.MediaCodec.BufferInfo bufferInfo) {
        this.c = hVar;
        this.f2011a = i;
        this.b = bufferInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.five_corp.ad.internal.movie.partialcache.mediacodec.h hVar = this.c;
        if (hVar.d != 2) {
            return;
        }
        hVar.f2013a.a(hVar, new com.five_corp.ad.internal.movie.partialcache.mediacodec.i(this.f2011a, this.b));
    }
}

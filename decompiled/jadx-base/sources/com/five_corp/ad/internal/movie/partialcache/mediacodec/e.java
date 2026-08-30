package com.five_corp.ad.internal.movie.partialcache.mediacodec;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.media.MediaCodec f2010a;
    public final /* synthetic */ int b;
    public final /* synthetic */ com.five_corp.ad.internal.movie.partialcache.mediacodec.h c;

    public e(com.five_corp.ad.internal.movie.partialcache.mediacodec.h hVar, android.media.MediaCodec mediaCodec, int i) {
        this.c = hVar;
        this.f2010a = mediaCodec;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c.d != 2) {
            return;
        }
        try {
            java.nio.ByteBuffer inputBuffer = this.f2010a.getInputBuffer(this.b);
            if (inputBuffer == null) {
                return;
            }
            com.five_corp.ad.internal.movie.partialcache.mediacodec.h hVar = this.c;
            com.five_corp.ad.internal.movie.partialcache.mediacodec.a aVar = new com.five_corp.ad.internal.movie.partialcache.mediacodec.a(this.b, inputBuffer);
            if (hVar.f2013a.a(hVar, aVar)) {
                return;
            }
            hVar.b.postDelayed(new com.five_corp.ad.internal.movie.partialcache.mediacodec.d(hVar, aVar), 100L);
        } catch (java.lang.Exception e) {
            this.c.a(new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.X4, null, e, null));
        }
    }
}

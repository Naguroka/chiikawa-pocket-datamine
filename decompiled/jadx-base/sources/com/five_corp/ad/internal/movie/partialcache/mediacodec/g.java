package com.five_corp.ad.internal.movie.partialcache.mediacodec;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.media.MediaFormat f2012a;
    public final /* synthetic */ com.five_corp.ad.internal.movie.partialcache.mediacodec.h b;

    public g(com.five_corp.ad.internal.movie.partialcache.mediacodec.h hVar, android.media.MediaFormat mediaFormat) {
        this.b = hVar;
        this.f2012a = mediaFormat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.five_corp.ad.internal.movie.partialcache.mediacodec.h hVar = this.b;
        if (hVar.d != 2) {
            return;
        }
        hVar.f2013a.a(hVar, this.f2012a);
    }
}

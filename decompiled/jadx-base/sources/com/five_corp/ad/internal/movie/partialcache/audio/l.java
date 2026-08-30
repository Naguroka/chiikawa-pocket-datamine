package com.five_corp.ad.internal.movie.partialcache.audio;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.movie.partialcache.audio.m f1999a;

    public l(com.five_corp.ad.internal.movie.partialcache.audio.m mVar) {
        this.f1999a = mVar;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0054 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x0023 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        com.five_corp.ad.internal.movie.partialcache.audio.m mVar;
        com.five_corp.ad.internal.movie.partialcache.audio.m mVar2;
        android.media.AudioTrack audioTrack;
        android.os.HandlerThread handlerThread;
        int iA = com.five_corp.ad.e.a(this.f1999a.f);
        if (iA != 0) {
            int i = 1;
            if (iA != 1) {
                if (iA == 2) {
                    mVar = this.f1999a;
                    i = 4;
                } else if (iA == 3) {
                    return;
                }
                mVar2 = this.f1999a;
                audioTrack = mVar2.e;
                if (audioTrack != null) {
                    try {
                        audioTrack.stop();
                    } catch (java.lang.Exception e) {
                        com.five_corp.ad.internal.movie.partialcache.audio.h hVar = mVar2.b;
                        com.five_corp.ad.internal.s sVar = new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.g5, null, e, null);
                        com.five_corp.ad.internal.movie.partialcache.audio.g gVar = (com.five_corp.ad.internal.movie.partialcache.audio.g) hVar;
                        int i2 = gVar.d;
                        if (i2 != 5 && i2 != 6) {
                            gVar.d = 5;
                            ((com.five_corp.ad.internal.movie.partialcache.audio.c) gVar.b).c.a(sVar);
                        }
                    }
                    mVar2.e.release();
                    mVar2.e = null;
                }
                handlerThread = this.f1999a.d;
                if (handlerThread == null) {
                    return;
                }
                handlerThread.quit();
                com.five_corp.ad.internal.movie.partialcache.audio.m mVar3 = this.f1999a;
                mVar3.d = null;
                mVar3.c = null;
            }
            mVar = this.f1999a;
            mVar.f = i;
            mVar2 = this.f1999a;
            audioTrack = mVar2.e;
            if (audioTrack != null) {
                audioTrack.stop();
                mVar2.e.release();
                mVar2.e = null;
            }
            handlerThread = this.f1999a.d;
            if (handlerThread == null) {
                return;
            }
            handlerThread.quit();
            com.five_corp.ad.internal.movie.partialcache.audio.m mVar4 = this.f1999a;
            mVar4.d = null;
            mVar4.c = null;
        }
    }
}

package com.five_corp.ad.internal.movie.partialcache.audio;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.media.MediaFormat f1997a;
    public final /* synthetic */ com.five_corp.ad.internal.movie.partialcache.audio.m b;

    public j(com.five_corp.ad.internal.movie.partialcache.audio.m mVar, android.media.MediaFormat mediaFormat) {
        this.b = mVar;
        this.f1997a = mediaFormat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        com.five_corp.ad.internal.movie.partialcache.audio.m mVar = this.b;
        if (mVar.f != 2) {
            return;
        }
        android.media.AudioTrack audioTrack = mVar.e;
        if (audioTrack != null) {
            try {
                audioTrack.stop();
            } catch (java.lang.Exception e) {
                com.five_corp.ad.internal.movie.partialcache.audio.h hVar = mVar.b;
                com.five_corp.ad.internal.s sVar = new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.g5, null, e, null);
                com.five_corp.ad.internal.movie.partialcache.audio.g gVar = (com.five_corp.ad.internal.movie.partialcache.audio.g) hVar;
                int i2 = gVar.d;
                if (i2 != 5 && i2 != 6) {
                    gVar.d = 5;
                    ((com.five_corp.ad.internal.movie.partialcache.audio.c) gVar.b).c.a(sVar);
                }
            }
            mVar.e.release();
            mVar.e = null;
        }
        int integer = this.f1997a.containsKey("pcm-encoding") ? this.f1997a.getInteger("pcm-encoding") : 2;
        int integer2 = this.f1997a.getInteger("channel-count");
        if (integer2 == 1) {
            i = 4;
        } else if (integer2 == 2) {
            i = 12;
        } else {
            java.lang.String str = this.b.f2000a;
            i = 4;
        }
        int i3 = i;
        int integer3 = this.f1997a.getInteger("sample-rate");
        int minBufferSize = android.media.AudioTrack.getMinBufferSize(integer3, i3, integer);
        if (minBufferSize == -2) {
            com.five_corp.ad.internal.movie.partialcache.audio.m.a(this.b, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.m5, null, null, null));
            return;
        }
        if (minBufferSize == -1) {
            com.five_corp.ad.internal.movie.partialcache.audio.m.a(this.b, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.l5, null, null, null));
            return;
        }
        try {
            com.five_corp.ad.internal.movie.partialcache.audio.m mVar2 = this.b;
            mVar2.getClass();
            mVar2.e = new android.media.AudioTrack(3, integer3, i3, integer, minBufferSize, 1);
            if (this.b.e.setPositionNotificationPeriod(integer3) == -3) {
                com.five_corp.ad.internal.movie.partialcache.audio.m.a(this.b, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.n5, null, null, null));
                return;
            }
            this.b.e.setPlaybackPositionUpdateListener(com.five_corp.ad.internal.movie.partialcache.audio.m.g);
            try {
                this.b.e.play();
            } catch (java.lang.Exception e2) {
                com.five_corp.ad.internal.movie.partialcache.audio.m.a(this.b, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.f5, null, e2, null));
            }
        } catch (java.lang.Exception e3) {
            com.five_corp.ad.internal.movie.partialcache.audio.m.a(this.b, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.e5, null, e3, null));
        }
    }
}

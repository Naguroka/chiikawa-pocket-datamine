package com.five_corp.ad.internal.movie.partialcache;

/* JADX INFO: loaded from: classes4.dex */
public final class m1 extends com.five_corp.ad.internal.movie.partialcache.l1 {
    public android.media.MediaFormat m;
    public android.media.MediaFormat n;

    public m1(com.five_corp.ad.internal.logger.a aVar) {
        super(aVar);
    }

    public final android.media.MediaFormat a() {
        if (this.n == null) {
            com.five_corp.ad.internal.movie.partialcache.C1457a c1457a = this.h;
            if (c1457a == null) {
                return null;
            }
            android.media.MediaFormat mediaFormatCreateAudioFormat = android.media.MediaFormat.createAudioFormat(androidx.media3.common.MimeTypes.AUDIO_AAC, c1457a.f1990a, c1457a.b);
            mediaFormatCreateAudioFormat.setByteBuffer("csd-0", c1457a.c);
            this.n = mediaFormatCreateAudioFormat;
        }
        return this.n;
    }

    public final android.media.MediaFormat b() {
        if (this.m == null) {
            com.five_corp.ad.internal.movie.partialcache.y1 y1Var = this.g;
            if (y1Var == null) {
                return null;
            }
            android.media.MediaFormat mediaFormatCreateVideoFormat = android.media.MediaFormat.createVideoFormat("video/avc", y1Var.f2031a, y1Var.b);
            mediaFormatCreateVideoFormat.setByteBuffer("csd-0", y1Var.c);
            mediaFormatCreateVideoFormat.setByteBuffer("csd-1", y1Var.d);
            mediaFormatCreateVideoFormat.setInteger(com.google.android.gms.common.Scopes.PROFILE, y1Var.e);
            mediaFormatCreateVideoFormat.setInteger("level", y1Var.f);
            this.m = mediaFormatCreateVideoFormat;
        }
        return this.m;
    }
}

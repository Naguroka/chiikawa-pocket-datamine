package com.five_corp.ad.internal.movie.partialcache.mediacodec;

/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2014a;
    public final android.media.MediaCodec.BufferInfo b;

    public i(int i, android.media.MediaCodec.BufferInfo bufferInfo) {
        this.f2014a = i;
        this.b = bufferInfo;
    }

    public final long a() {
        return this.b.presentationTimeUs;
    }

    public final boolean b() {
        return this.b.size == 0;
    }
}

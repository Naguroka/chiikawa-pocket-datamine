package com.five_corp.ad.internal.movie.partialcache.mediacodec;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends android.media.MediaCodec.Callback implements com.five_corp.ad.internal.movie.partialcache.mediacodec.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.five_corp.ad.internal.movie.partialcache.mediacodec.b f2013a;
    public final android.os.Handler b;
    public final android.media.MediaCodec c;
    public int d;

    public h(android.media.MediaCodec mediaCodec, com.five_corp.ad.internal.movie.partialcache.mediacodec.b bVar, android.os.Looper looper) {
        java.lang.System.identityHashCode(this);
        this.c = mediaCodec;
        this.f2013a = bVar;
        this.b = new android.os.Handler(looper);
        this.d = 1;
    }

    public final java.nio.ByteBuffer a(int i) {
        try {
            return this.c.getOutputBuffer(i);
        } catch (java.lang.Exception e) {
            a(new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.Z4, null, e, null));
            return null;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(android.media.MediaCodec mediaCodec, android.media.MediaCodec.CodecException codecException) {
        a(new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.W4, "DiagnosticInfo: " + codecException.getDiagnosticInfo() + ", error code: " + codecException.getErrorCode() + ", isRecoverable: " + codecException.isRecoverable() + ", isTransient: " + codecException.isTransient(), codecException, null));
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(android.media.MediaCodec mediaCodec, int i) {
        this.b.post(new com.five_corp.ad.internal.movie.partialcache.mediacodec.e(this, mediaCodec, i));
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(android.media.MediaCodec mediaCodec, int i, android.media.MediaCodec.BufferInfo bufferInfo) {
        this.b.post(new com.five_corp.ad.internal.movie.partialcache.mediacodec.f(this, i, bufferInfo));
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(android.media.MediaCodec mediaCodec, android.media.MediaFormat mediaFormat) {
        this.b.post(new com.five_corp.ad.internal.movie.partialcache.mediacodec.g(this, mediaFormat));
    }

    public final void a(com.five_corp.ad.internal.s sVar) {
        if (this.d == 4) {
            return;
        }
        this.d = 4;
        this.f2013a.a(sVar);
    }

    public final void a(com.five_corp.ad.internal.movie.partialcache.mediacodec.a aVar, com.five_corp.ad.internal.movie.partialcache.x1 x1Var, int i) {
        if (this.d != 2) {
            return;
        }
        try {
            this.c.queueInputBuffer(aVar.f2008a, 0, i, x1Var.d, x1Var.e);
        } catch (java.lang.Exception e) {
            a(new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.Y4, null, e, null));
        }
    }

    public final void a() {
        if (this.d == 3) {
            return;
        }
        this.d = 3;
        this.c.release();
        this.b.removeCallbacksAndMessages(null);
    }

    public final void a(com.five_corp.ad.internal.movie.partialcache.mediacodec.i iVar, boolean z) {
        if (this.d != 2) {
            return;
        }
        try {
            this.c.releaseOutputBuffer(iVar.f2014a, z);
        } catch (java.lang.Exception e) {
            a(new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.a5, null, e, null));
        }
    }

    public final void a(android.media.MediaFormat mediaFormat, android.view.Surface surface) {
        if (this.d != 1) {
            return;
        }
        this.c.setCallback(this);
        try {
            this.c.configure(mediaFormat, surface, (android.media.MediaCrypto) null, 0);
            try {
                this.c.start();
                this.d = 2;
            } catch (java.lang.Exception e) {
                a(new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.V4, null, e, null));
            }
        } catch (java.lang.Exception e2) {
            a(new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.U4, null, e2, null));
        }
    }
}

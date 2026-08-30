package com.five_corp.ad.internal.movie.partialcache.video;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements com.five_corp.ad.internal.movie.partialcache.mediacodec.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.media.MediaFormat f2029a;
    public final android.os.Handler b;
    public final com.five_corp.ad.internal.movie.partialcache.video.d c;
    public com.five_corp.ad.internal.movie.partialcache.mediacodec.h e;
    public long g;
    public int f = 1;
    public long h = 0;
    public final java.util.ArrayDeque d = new java.util.ArrayDeque();

    public f(android.media.MediaFormat mediaFormat, android.os.Handler handler, com.five_corp.ad.internal.movie.partialcache.video.d dVar) {
        this.f2029a = mediaFormat;
        this.b = handler;
        this.c = dVar;
    }

    public final void a(android.view.Surface surface, long j) {
        if (this.f != 1) {
            return;
        }
        this.f = 2;
        try {
            com.five_corp.ad.internal.movie.partialcache.mediacodec.h hVar = new com.five_corp.ad.internal.movie.partialcache.mediacodec.h(android.media.MediaCodec.createDecoderByType(this.f2029a.getString("mime")), this, this.b.getLooper());
            this.e = hVar;
            this.g = j;
            hVar.a(this.f2029a, surface);
        } catch (java.lang.Exception e) {
            com.five_corp.ad.internal.movie.partialcache.video.d dVar = this.c;
            ((com.five_corp.ad.internal.movie.x) dVar.c).a(new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.r0, null, e, null));
        }
    }

    @Override // com.five_corp.ad.internal.movie.partialcache.mediacodec.b
    public final void a(com.five_corp.ad.internal.movie.partialcache.mediacodec.h hVar, android.media.MediaFormat mediaFormat) {
    }

    @Override // com.five_corp.ad.internal.movie.partialcache.mediacodec.b
    public final void a(com.five_corp.ad.internal.s sVar) {
        int i = this.f;
        if (i == 5 || i == 6) {
            return;
        }
        this.f = 5;
        com.five_corp.ad.internal.movie.partialcache.video.d dVar = this.c;
        ((com.five_corp.ad.internal.movie.x) dVar.c).a(new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.q5, null, null, sVar));
    }

    @Override // com.five_corp.ad.internal.movie.partialcache.mediacodec.b
    public final boolean a(com.five_corp.ad.internal.movie.partialcache.mediacodec.c cVar, com.five_corp.ad.internal.movie.partialcache.mediacodec.a aVar) {
        com.five_corp.ad.internal.movie.partialcache.x1 x1VarB;
        int i = this.f;
        if (i == 1 || i == 5 || i == 6 || this.e != cVar || (x1VarB = this.c.b.f.b()) == null) {
            return false;
        }
        try {
            java.nio.ByteBuffer byteBuffer = aVar.b;
            java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(x1VarB.f2030a, x1VarB.b, x1VarB.c);
            byteBuffer.rewind();
            while (byteBufferWrap.position() < byteBufferWrap.limit()) {
                int i2 = byteBufferWrap.getInt();
                byteBuffer.put(new byte[]{0, 0, 0, 1});
                byteBuffer.put(byteBufferWrap.array(), byteBufferWrap.position(), i2);
                byteBufferWrap.position(byteBufferWrap.position() + i2);
            }
            int iPosition = byteBuffer.position();
            byteBuffer.position(0);
            byteBuffer.limit(iPosition);
            this.e.a(aVar, x1VarB, iPosition);
        } catch (java.lang.Exception e) {
            a(new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.r5, null, e, null));
        }
        return true;
    }

    @Override // com.five_corp.ad.internal.movie.partialcache.mediacodec.b
    public final void a(com.five_corp.ad.internal.movie.partialcache.mediacodec.h hVar, com.five_corp.ad.internal.movie.partialcache.mediacodec.i iVar) {
        int i = this.f;
        if (i == 1 || i == 5 || i == 6 || this.e != hVar || iVar.b()) {
            return;
        }
        if (this.f != 2) {
            if (!this.d.isEmpty() || iVar.a() >= this.h) {
                this.d.addLast(iVar);
                return;
            } else {
                this.e.a(iVar, true);
                return;
            }
        }
        if (iVar.a() < this.g) {
            this.e.a(iVar, false);
            return;
        }
        this.e.a(iVar, true);
        this.f = 3;
        com.five_corp.ad.internal.movie.partialcache.video.d dVar = this.c;
        dVar.getClass();
        dVar.f2027a.post(new com.five_corp.ad.internal.movie.partialcache.video.a(dVar, new com.five_corp.ad.internal.movie.partialcache.video.b(dVar)));
    }

    public final void a(long j) {
        com.five_corp.ad.internal.movie.partialcache.mediacodec.i iVar;
        int i = this.f;
        if (i == 3 || i == 4) {
            this.f = 4;
            this.h = j;
            if (this.d.isEmpty() || ((com.five_corp.ad.internal.movie.partialcache.mediacodec.i) this.d.peekFirst()).a() >= j) {
                return;
            }
            java.lang.Object objPollFirst = this.d.pollFirst();
            while (true) {
                iVar = (com.five_corp.ad.internal.movie.partialcache.mediacodec.i) objPollFirst;
                if (this.d.isEmpty() || ((com.five_corp.ad.internal.movie.partialcache.mediacodec.i) this.d.peekFirst()).a() >= j) {
                    break;
                }
                this.e.a(iVar, false);
                objPollFirst = this.d.pollFirst();
            }
            this.e.a(iVar, true);
        }
    }

    public final void a() {
        int i = this.f;
        if (i == 1 || i == 6) {
            return;
        }
        if (i == 5) {
            this.f = 6;
        } else {
            this.f = 1;
        }
        com.five_corp.ad.internal.movie.partialcache.mediacodec.h hVar = this.e;
        if (hVar != null) {
            hVar.a();
            this.e = null;
        }
        this.d.clear();
    }
}

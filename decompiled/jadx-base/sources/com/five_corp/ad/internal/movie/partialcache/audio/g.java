package com.five_corp.ad.internal.movie.partialcache.audio;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements com.five_corp.ad.internal.movie.partialcache.mediacodec.b, com.five_corp.ad.internal.movie.partialcache.audio.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.os.Looper f1996a;
    public final com.five_corp.ad.internal.movie.partialcache.audio.e b;
    public final android.media.MediaFormat e;
    public com.five_corp.ad.internal.movie.partialcache.mediacodec.h f;
    public com.five_corp.ad.internal.movie.partialcache.audio.m g;
    public long h;
    public int d = 1;
    public final java.util.ArrayDeque c = new java.util.ArrayDeque();

    public g(android.media.MediaFormat mediaFormat, android.os.Looper looper, com.five_corp.ad.internal.movie.partialcache.audio.c cVar) {
        this.e = mediaFormat;
        this.f1996a = looper;
        this.b = cVar;
    }

    @Override // com.five_corp.ad.internal.movie.partialcache.mediacodec.b
    public final void a(com.five_corp.ad.internal.s sVar) {
        int i = this.d;
        if (i == 5 || i == 6) {
            return;
        }
        this.d = 5;
        com.five_corp.ad.internal.movie.partialcache.audio.e eVar = this.b;
        ((com.five_corp.ad.internal.movie.partialcache.audio.c) eVar).c.a(new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.d5, null, null, sVar));
    }

    public final void b() {
        int i = this.d;
        if (i == 1 || i == 6) {
            return;
        }
        if (i == 5) {
            this.d = 6;
        } else {
            this.d = 1;
        }
        com.five_corp.ad.internal.movie.partialcache.mediacodec.h hVar = this.f;
        if (hVar != null) {
            hVar.a();
            this.f = null;
        }
        com.five_corp.ad.internal.movie.partialcache.audio.m mVar = this.g;
        if (mVar != null) {
            android.os.Handler handler = mVar.c;
            if (handler != null) {
                handler.postAtFrontOfQueue(new com.five_corp.ad.internal.movie.partialcache.audio.l(mVar));
            }
            this.g = null;
        }
        this.c.clear();
    }

    @Override // com.five_corp.ad.internal.movie.partialcache.mediacodec.b
    public final boolean a(com.five_corp.ad.internal.movie.partialcache.mediacodec.c cVar, com.five_corp.ad.internal.movie.partialcache.mediacodec.a aVar) {
        com.five_corp.ad.internal.movie.partialcache.x1 x1VarB;
        int i = this.d;
        if (i == 1 || i == 5 || i == 6 || this.f != cVar || (x1VarB = ((com.five_corp.ad.internal.movie.partialcache.audio.c) this.b).b.d.b()) == null) {
            return false;
        }
        java.nio.ByteBuffer byteBuffer = aVar.b;
        byteBuffer.rewind();
        byteBuffer.put(x1VarB.f2030a, x1VarB.b, x1VarB.c);
        byteBuffer.rewind();
        this.f.a(aVar, x1VarB, x1VarB.c);
        return true;
    }

    @Override // com.five_corp.ad.internal.movie.partialcache.mediacodec.b
    public final void a(com.five_corp.ad.internal.movie.partialcache.mediacodec.h hVar, com.five_corp.ad.internal.movie.partialcache.mediacodec.i iVar) {
        boolean z;
        int i = this.d;
        if (i == 1 || i == 5 || i == 6 || this.f != hVar || iVar.b()) {
            return;
        }
        if (this.d == 2) {
            this.d = 3;
            z = true;
        } else {
            z = false;
        }
        if (this.c.isEmpty() && iVar.a() < this.h) {
            com.five_corp.ad.internal.movie.partialcache.audio.m mVar = this.g;
            int i2 = iVar.f2014a;
            android.media.MediaCodec.BufferInfo bufferInfo = iVar.b;
            java.nio.ByteBuffer byteBufferA = this.f.a(i2);
            byteBufferA.position(bufferInfo.offset);
            int i3 = bufferInfo.size;
            byte[] bArr = new byte[i3];
            byteBufferA.get(bArr, 0, i3);
            this.f.a(iVar, false);
            mVar.c.post(new com.five_corp.ad.internal.movie.partialcache.audio.k(mVar, bArr));
        } else {
            this.c.addLast(new com.five_corp.ad.internal.movie.partialcache.audio.f(1, iVar, null));
        }
        if (z) {
            com.five_corp.ad.internal.movie.partialcache.audio.c cVar = (com.five_corp.ad.internal.movie.partialcache.audio.c) this.b;
            cVar.getClass();
            cVar.f1993a.post(new com.five_corp.ad.internal.movie.partialcache.audio.a(cVar, new com.five_corp.ad.internal.movie.partialcache.audio.b(cVar)));
        }
    }

    @Override // com.five_corp.ad.internal.movie.partialcache.mediacodec.b
    public final void a(com.five_corp.ad.internal.movie.partialcache.mediacodec.h hVar, android.media.MediaFormat mediaFormat) {
        int i = this.d;
        if (i == 1 || i == 5 || i == 6 || this.f != hVar) {
            return;
        }
        if (this.c.isEmpty()) {
            com.five_corp.ad.internal.movie.partialcache.audio.m mVar = this.g;
            mVar.c.post(new com.five_corp.ad.internal.movie.partialcache.audio.j(mVar, mediaFormat));
        } else {
            this.c.addLast(new com.five_corp.ad.internal.movie.partialcache.audio.f(2, null, mediaFormat));
        }
    }

    public final void a() {
        if (this.d != 1) {
            return;
        }
        this.d = 2;
        this.h = 0L;
        this.c.clear();
        try {
            com.five_corp.ad.internal.movie.partialcache.mediacodec.h hVar = new com.five_corp.ad.internal.movie.partialcache.mediacodec.h(android.media.MediaCodec.createDecoderByType(this.e.getString("mime")), this, this.f1996a);
            this.f = hVar;
            hVar.a(this.e, (android.view.Surface) null);
            com.five_corp.ad.internal.movie.partialcache.audio.m mVar = new com.five_corp.ad.internal.movie.partialcache.audio.m(this);
            this.g = mVar;
            android.media.MediaFormat mediaFormat = this.e;
            if (mVar.f != 1) {
                return;
            }
            android.os.HandlerThread handlerThread = new android.os.HandlerThread(mVar.f2000a);
            mVar.d = handlerThread;
            handlerThread.start();
            android.os.Handler handler = new android.os.Handler(mVar.d.getLooper());
            mVar.c = handler;
            mVar.f = 2;
            handler.post(new com.five_corp.ad.internal.movie.partialcache.audio.j(mVar, mediaFormat));
        } catch (java.io.IOException e) {
            com.five_corp.ad.internal.movie.partialcache.audio.e eVar = this.b;
            ((com.five_corp.ad.internal.movie.partialcache.audio.c) eVar).c.a(new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.c5, null, e, null));
        }
    }

    public final void a(long j) {
        int i = this.d;
        if (i == 3 || i == 4) {
            this.d = 4;
            this.h = j + 1000000;
            while (!this.c.isEmpty()) {
                com.five_corp.ad.internal.movie.partialcache.audio.f fVar = (com.five_corp.ad.internal.movie.partialcache.audio.f) this.c.peekFirst();
                if ((fVar.f1995a == 2 ? -1L : fVar.b.a()) >= this.h) {
                    return;
                }
                com.five_corp.ad.internal.movie.partialcache.audio.f fVar2 = (com.five_corp.ad.internal.movie.partialcache.audio.f) this.c.pollFirst();
                if (fVar2.f1995a == 2) {
                    com.five_corp.ad.internal.movie.partialcache.audio.m mVar = this.g;
                    mVar.c.post(new com.five_corp.ad.internal.movie.partialcache.audio.j(mVar, fVar2.c));
                } else {
                    com.five_corp.ad.internal.movie.partialcache.audio.m mVar2 = this.g;
                    com.five_corp.ad.internal.movie.partialcache.mediacodec.i iVar = fVar2.b;
                    int i2 = iVar.f2014a;
                    android.media.MediaCodec.BufferInfo bufferInfo = iVar.b;
                    java.nio.ByteBuffer byteBufferA = this.f.a(i2);
                    byteBufferA.position(bufferInfo.offset);
                    int i3 = bufferInfo.size;
                    byte[] bArr = new byte[i3];
                    byteBufferA.get(bArr, 0, i3);
                    this.f.a(iVar, false);
                    mVar2.c.post(new com.five_corp.ad.internal.movie.partialcache.audio.k(mVar2, bArr));
                }
            }
        }
    }
}

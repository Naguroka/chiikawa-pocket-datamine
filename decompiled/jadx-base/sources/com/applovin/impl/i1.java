package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class i1 extends android.media.MediaCodec.Callback {
    private final android.os.HandlerThread b;
    private android.os.Handler c;
    private android.media.MediaFormat h;
    private android.media.MediaFormat i;
    private android.media.MediaCodec.CodecException j;
    private long k;
    private boolean l;
    private java.lang.IllegalStateException m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f866a = new java.lang.Object();
    private final com.applovin.impl.nb d = new com.applovin.impl.nb();
    private final com.applovin.impl.nb e = new com.applovin.impl.nb();
    private final java.util.ArrayDeque f = new java.util.ArrayDeque();
    private final java.util.ArrayDeque g = new java.util.ArrayDeque();

    i1(android.os.HandlerThread handlerThread) {
        this.b = handlerThread;
    }

    public void h() {
        synchronized (this.f866a) {
            this.l = true;
            this.b.quit();
            b();
        }
    }

    public android.media.MediaFormat c() {
        android.media.MediaFormat mediaFormat;
        synchronized (this.f866a) {
            mediaFormat = this.h;
            if (mediaFormat == null) {
                throw new java.lang.IllegalStateException();
            }
        }
        return mediaFormat;
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(android.media.MediaCodec mediaCodec, int i) {
        synchronized (this.f866a) {
            this.d.a(i);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(android.media.MediaCodec mediaCodec, int i, android.media.MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f866a) {
            android.media.MediaFormat mediaFormat = this.i;
            if (mediaFormat != null) {
                a(mediaFormat);
                this.i = null;
            }
            this.e.a(i);
            this.f.add(bufferInfo);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(android.media.MediaCodec mediaCodec, android.media.MediaCodec.CodecException codecException) {
        synchronized (this.f866a) {
            this.j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(android.media.MediaCodec mediaCodec, android.media.MediaFormat mediaFormat) {
        synchronized (this.f866a) {
            a(mediaFormat);
            this.i = null;
        }
    }

    private void b() {
        if (!this.g.isEmpty()) {
            this.i = (android.media.MediaFormat) this.g.getLast();
        }
        this.d.a();
        this.e.a();
        this.f.clear();
        this.g.clear();
        this.j = null;
    }

    private boolean d() {
        return this.k > 0 || this.l;
    }

    private void a(android.media.MediaFormat mediaFormat) {
        this.e.a(-2);
        this.g.add(mediaFormat);
    }

    private void e() {
        f();
        g();
    }

    private void f() {
        java.lang.IllegalStateException illegalStateException = this.m;
        if (illegalStateException == null) {
            return;
        }
        this.m = null;
        throw illegalStateException;
    }

    private void g() {
        android.media.MediaCodec.CodecException codecException = this.j;
        if (codecException == null) {
            return;
        }
        this.j = null;
        throw codecException;
    }

    public int a() {
        synchronized (this.f866a) {
            int iD = -1;
            if (d()) {
                return -1;
            }
            e();
            if (!this.d.c()) {
                iD = this.d.d();
            }
            return iD;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(java.lang.Runnable runnable) {
        synchronized (this.f866a) {
            d(runnable);
        }
    }

    private void d(java.lang.Runnable runnable) {
        if (this.l) {
            return;
        }
        long j = this.k - 1;
        this.k = j;
        if (j > 0) {
            return;
        }
        if (j < 0) {
            a(new java.lang.IllegalStateException());
            return;
        }
        b();
        try {
            runnable.run();
        } catch (java.lang.IllegalStateException e) {
            a(e);
        } catch (java.lang.Exception e2) {
            a(new java.lang.IllegalStateException(e2));
        }
    }

    public int a(android.media.MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f866a) {
            if (d()) {
                return -1;
            }
            e();
            if (this.e.c()) {
                return -1;
            }
            int iD = this.e.d();
            if (iD >= 0) {
                com.applovin.impl.b1.b(this.h);
                android.media.MediaCodec.BufferInfo bufferInfo2 = (android.media.MediaCodec.BufferInfo) this.f.remove();
                bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
            } else if (iD == -2) {
                this.h = (android.media.MediaFormat) this.g.remove();
            }
            return iD;
        }
    }

    public void a(final java.lang.Runnable runnable) {
        synchronized (this.f866a) {
            this.k++;
            ((android.os.Handler) com.applovin.impl.xp.a(this.c)).post(new java.lang.Runnable() { // from class: com.applovin.impl.i1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.b(runnable);
                }
            });
        }
    }

    public void a(android.media.MediaCodec mediaCodec) {
        com.applovin.impl.b1.b(this.c == null);
        this.b.start();
        android.os.Handler handler = new android.os.Handler(this.b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.c = handler;
    }

    private void a(java.lang.IllegalStateException illegalStateException) {
        synchronized (this.f866a) {
            this.m = illegalStateException;
        }
    }
}

package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class g1 implements com.applovin.impl.gd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.media.MediaCodec f805a;
    private final com.applovin.impl.i1 b;
    private final com.applovin.impl.h1 c;
    private final boolean d;
    private boolean e;
    private int f;
    private android.view.Surface g;

    @Override // com.applovin.impl.gd
    public boolean c() {
        return false;
    }

    public static final class b implements com.applovin.impl.gd.b {
        private final com.applovin.exoplayer2.common.base.Supplier b;
        private final com.applovin.exoplayer2.common.base.Supplier c;
        private final boolean d;
        private final boolean e;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ android.os.HandlerThread a(int i) {
            return new android.os.HandlerThread(com.applovin.impl.g1.f(i));
        }

        public b(final int i, boolean z, boolean z2) {
            this(new com.applovin.exoplayer2.common.base.Supplier() { // from class: com.applovin.impl.g1$b$$ExternalSyntheticLambda0
                @Override // com.applovin.exoplayer2.common.base.Supplier
                public final java.lang.Object get() {
                    return com.applovin.impl.g1.b.a(i);
                }
            }, new com.applovin.exoplayer2.common.base.Supplier() { // from class: com.applovin.impl.g1$b$$ExternalSyntheticLambda1
                @Override // com.applovin.exoplayer2.common.base.Supplier
                public final java.lang.Object get() {
                    return com.applovin.impl.g1.b.b(i);
                }
            }, z, z2);
        }

        @Override // com.applovin.impl.gd.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.g1 a(com.applovin.impl.gd.a aVar) throws java.lang.Exception {
            android.media.MediaCodec mediaCodecCreateByCodecName;
            java.lang.String str = aVar.f819a.f920a;
            com.applovin.impl.g1 g1Var = null;
            try {
                com.applovin.impl.ko.a("createCodec:" + str);
                mediaCodecCreateByCodecName = android.media.MediaCodec.createByCodecName(str);
                try {
                    com.applovin.impl.g1 g1Var2 = new com.applovin.impl.g1(mediaCodecCreateByCodecName, (android.os.HandlerThread) this.b.get(), (android.os.HandlerThread) this.c.get(), this.d, this.e);
                    try {
                        com.applovin.impl.ko.a();
                        g1Var2.a(aVar.b, aVar.d, aVar.e, aVar.f, aVar.g);
                        return g1Var2;
                    } catch (java.lang.Exception e) {
                        e = e;
                        g1Var = g1Var2;
                        if (g1Var != null) {
                            g1Var.a();
                        } else if (mediaCodecCreateByCodecName != null) {
                            mediaCodecCreateByCodecName.release();
                        }
                        throw e;
                    }
                } catch (java.lang.Exception e2) {
                    e = e2;
                }
            } catch (java.lang.Exception e3) {
                e = e3;
                mediaCodecCreateByCodecName = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ android.os.HandlerThread b(int i) {
            return new android.os.HandlerThread(com.applovin.impl.g1.g(i));
        }

        b(com.applovin.exoplayer2.common.base.Supplier supplier, com.applovin.exoplayer2.common.base.Supplier supplier2, boolean z, boolean z2) {
            this.b = supplier;
            this.c = supplier2;
            this.d = z;
            this.e = z2;
        }
    }

    private g1(android.media.MediaCodec mediaCodec, android.os.HandlerThread handlerThread, android.os.HandlerThread handlerThread2, boolean z, boolean z2) {
        this.f805a = mediaCodec;
        this.b = new com.applovin.impl.i1(handlerThread);
        this.c = new com.applovin.impl.h1(mediaCodec, handlerThread2, z);
        this.d = z2;
        this.f = 0;
    }

    @Override // com.applovin.impl.gd
    public void b() {
        this.c.b();
        this.f805a.flush();
        com.applovin.impl.i1 i1Var = this.b;
        final android.media.MediaCodec mediaCodec = this.f805a;
        java.util.Objects.requireNonNull(mediaCodec);
        i1Var.a(new java.lang.Runnable() { // from class: com.applovin.impl.g1$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                mediaCodec.start();
            }
        });
    }

    @Override // com.applovin.impl.gd
    public int d() {
        return this.b.a();
    }

    @Override // com.applovin.impl.gd
    public android.media.MediaFormat e() {
        return this.b.c();
    }

    @Override // com.applovin.impl.gd
    public void c(int i) {
        f();
        this.f805a.setVideoScalingMode(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String f(int i) {
        return a(i, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String g(int i) {
        return a(i, "ExoPlayer:MediaCodecQueueingThread:");
    }

    private static java.lang.String a(int i, java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(").append(i).append(")");
        }
        return sb.toString();
    }

    @Override // com.applovin.impl.gd
    public java.nio.ByteBuffer b(int i) {
        return this.f805a.getOutputBuffer(i);
    }

    @Override // com.applovin.impl.gd
    public int a(android.media.MediaCodec.BufferInfo bufferInfo) {
        return this.b.a(bufferInfo);
    }

    private void f() {
        if (this.d) {
            try {
                this.c.i();
            } catch (java.lang.InterruptedException e) {
                java.lang.Thread.currentThread().interrupt();
                throw new java.lang.IllegalStateException(e);
            }
        }
    }

    @Override // com.applovin.impl.gd
    public java.nio.ByteBuffer a(int i) {
        return this.f805a.getInputBuffer(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(android.media.MediaFormat mediaFormat, android.view.Surface surface, android.media.MediaCrypto mediaCrypto, int i, boolean z) {
        this.b.a(this.f805a);
        com.applovin.impl.ko.a("configureCodec");
        this.f805a.configure(mediaFormat, surface, mediaCrypto, i);
        com.applovin.impl.ko.a();
        if (z) {
            this.g = this.f805a.createInputSurface();
        }
        this.c.h();
        com.applovin.impl.ko.a("startCodec");
        this.f805a.start();
        com.applovin.impl.ko.a();
        this.f = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.gd.c cVar, android.media.MediaCodec mediaCodec, long j, long j2) {
        cVar.a(this, j, j2);
    }

    @Override // com.applovin.impl.gd
    public void a(int i, int i2, int i3, long j, int i4) {
        this.c.b(i, i2, i3, j, i4);
    }

    @Override // com.applovin.impl.gd
    public void a(int i, int i2, com.applovin.impl.z4 z4Var, long j, int i3) {
        this.c.a(i, i2, z4Var, j, i3);
    }

    @Override // com.applovin.impl.gd
    public void a() {
        try {
            if (this.f == 1) {
                this.c.g();
                this.b.h();
            }
            this.f = 2;
        } finally {
            android.view.Surface surface = this.g;
            if (surface != null) {
                surface.release();
            }
            if (!this.e) {
                this.f805a.release();
                this.e = true;
            }
        }
    }

    @Override // com.applovin.impl.gd
    public void a(int i, long j) {
        this.f805a.releaseOutputBuffer(i, j);
    }

    @Override // com.applovin.impl.gd
    public void a(int i, boolean z) {
        this.f805a.releaseOutputBuffer(i, z);
    }

    @Override // com.applovin.impl.gd
    public void a(final com.applovin.impl.gd.c cVar, android.os.Handler handler) {
        f();
        this.f805a.setOnFrameRenderedListener(new android.media.MediaCodec.OnFrameRenderedListener() { // from class: com.applovin.impl.g1$$ExternalSyntheticLambda0
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(android.media.MediaCodec mediaCodec, long j, long j2) {
                this.f$0.a(cVar, mediaCodec, j, j2);
            }
        }, handler);
    }

    @Override // com.applovin.impl.gd
    public void a(android.view.Surface surface) {
        f();
        this.f805a.setOutputSurface(surface);
    }

    @Override // com.applovin.impl.gd
    public void a(android.os.Bundle bundle) {
        f();
        this.f805a.setParameters(bundle);
    }
}

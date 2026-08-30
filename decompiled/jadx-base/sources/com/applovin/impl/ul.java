package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class ul implements com.applovin.impl.gd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.media.MediaCodec f1408a;
    private final android.view.Surface b;
    private java.nio.ByteBuffer[] c;
    private java.nio.ByteBuffer[] d;

    @Override // com.applovin.impl.gd
    public boolean c() {
        return false;
    }

    public static class c implements com.applovin.impl.gd.b {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.applovin.impl.ul$a] */
        /* JADX WARN: Type inference failed for: r0v1, types: [android.view.Surface] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        @Override // com.applovin.impl.gd.b
        public com.applovin.impl.gd a(com.applovin.impl.gd.a aVar) throws java.lang.Throwable {
            android.media.MediaCodec mediaCodecB;
            android.view.Surface surfaceA;
            ?? r0 = 0;
            r0 = 0;
            r0 = 0;
            try {
                mediaCodecB = b(aVar);
                try {
                    com.applovin.impl.ko.a("configureCodec");
                    mediaCodecB.configure(aVar.b, aVar.d, aVar.e, aVar.f);
                    com.applovin.impl.ko.a();
                    if (!aVar.g) {
                        surfaceA = null;
                    } else if (com.applovin.impl.xp.f1515a >= 18) {
                        surfaceA = com.applovin.impl.ul.b.a(mediaCodecB);
                    } else {
                        throw new java.lang.IllegalStateException("Encoding from a surface is only supported on API 18 and up.");
                    }
                    try {
                        com.applovin.impl.ko.a("startCodec");
                        mediaCodecB.start();
                        com.applovin.impl.ko.a();
                        return new com.applovin.impl.ul(mediaCodecB, surfaceA);
                    } catch (java.io.IOException | java.lang.RuntimeException e) {
                        r0 = surfaceA;
                        e = e;
                        if (r0 != 0) {
                            r0.release();
                        }
                        if (mediaCodecB != null) {
                            mediaCodecB.release();
                        }
                        throw e;
                    }
                } catch (java.io.IOException e2) {
                    e = e2;
                } catch (java.lang.RuntimeException e3) {
                    e = e3;
                }
            } catch (java.io.IOException | java.lang.RuntimeException e4) {
                e = e4;
                mediaCodecB = null;
            }
        }

        protected android.media.MediaCodec b(com.applovin.impl.gd.a aVar) throws java.io.IOException {
            com.applovin.impl.b1.a(aVar.f819a);
            java.lang.String str = aVar.f819a.f920a;
            com.applovin.impl.ko.a("createCodec:" + str);
            android.media.MediaCodec mediaCodecCreateByCodecName = android.media.MediaCodec.createByCodecName(str);
            com.applovin.impl.ko.a();
            return mediaCodecCreateByCodecName;
        }
    }

    private ul(android.media.MediaCodec mediaCodec, android.view.Surface surface) {
        this.f1408a = mediaCodec;
        this.b = surface;
        if (com.applovin.impl.xp.f1515a < 21) {
            this.c = mediaCodec.getInputBuffers();
            this.d = mediaCodec.getOutputBuffers();
        }
    }

    @Override // com.applovin.impl.gd
    public int d() {
        return this.f1408a.dequeueInputBuffer(0L);
    }

    @Override // com.applovin.impl.gd
    public int a(android.media.MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.f1408a.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3 && com.applovin.impl.xp.f1515a < 21) {
                this.d = this.f1408a.getOutputBuffers();
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // com.applovin.impl.gd
    public android.media.MediaFormat e() {
        return this.f1408a.getOutputFormat();
    }

    @Override // com.applovin.impl.gd
    public void b() {
        this.f1408a.flush();
    }

    @Override // com.applovin.impl.gd
    public java.nio.ByteBuffer b(int i) {
        if (com.applovin.impl.xp.f1515a >= 21) {
            return this.f1408a.getOutputBuffer(i);
        }
        return ((java.nio.ByteBuffer[]) com.applovin.impl.xp.a((java.lang.Object) this.d))[i];
    }

    @Override // com.applovin.impl.gd
    public void c(int i) {
        this.f1408a.setVideoScalingMode(i);
    }

    private static final class b {
        public static android.view.Surface a(android.media.MediaCodec mediaCodec) {
            return mediaCodec.createInputSurface();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.gd.c cVar, android.media.MediaCodec mediaCodec, long j, long j2) {
        cVar.a(this, j, j2);
    }

    @Override // com.applovin.impl.gd
    public void a(int i, int i2, int i3, long j, int i4) {
        this.f1408a.queueInputBuffer(i, i2, i3, j, i4);
    }

    @Override // com.applovin.impl.gd
    public void a(int i, int i2, com.applovin.impl.z4 z4Var, long j, int i3) {
        this.f1408a.queueSecureInputBuffer(i, i2, z4Var.a(), j, i3);
    }

    @Override // com.applovin.impl.gd
    public void a() {
        this.c = null;
        this.d = null;
        android.view.Surface surface = this.b;
        if (surface != null) {
            surface.release();
        }
        this.f1408a.release();
    }

    @Override // com.applovin.impl.gd
    public void a(int i, long j) {
        this.f1408a.releaseOutputBuffer(i, j);
    }

    @Override // com.applovin.impl.gd
    public void a(int i, boolean z) {
        this.f1408a.releaseOutputBuffer(i, z);
    }

    @Override // com.applovin.impl.gd
    public void a(final com.applovin.impl.gd.c cVar, android.os.Handler handler) {
        this.f1408a.setOnFrameRenderedListener(new android.media.MediaCodec.OnFrameRenderedListener() { // from class: com.applovin.impl.ul$$ExternalSyntheticLambda0
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(android.media.MediaCodec mediaCodec, long j, long j2) {
                this.f$0.a(cVar, mediaCodec, j, j2);
            }
        }, handler);
    }

    @Override // com.applovin.impl.gd
    public void a(android.view.Surface surface) {
        this.f1408a.setOutputSurface(surface);
    }

    @Override // com.applovin.impl.gd
    public void a(android.os.Bundle bundle) {
        this.f1408a.setParameters(bundle);
    }

    @Override // com.applovin.impl.gd
    public java.nio.ByteBuffer a(int i) {
        if (com.applovin.impl.xp.f1515a >= 21) {
            return this.f1408a.getInputBuffer(i);
        }
        return ((java.nio.ByteBuffer[]) com.applovin.impl.xp.a((java.lang.Object) this.c))[i];
    }
}

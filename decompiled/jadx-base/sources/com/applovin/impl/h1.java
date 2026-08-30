package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
class h1 {
    private static final java.util.ArrayDeque h = new java.util.ArrayDeque();
    private static final java.lang.Object i = new java.lang.Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.media.MediaCodec f837a;
    private final android.os.HandlerThread b;
    private android.os.Handler c;
    private final java.util.concurrent.atomic.AtomicReference d;
    private final com.applovin.impl.c4 e;
    private final boolean f;
    private boolean g;

    private static com.applovin.impl.h1.b d() {
        java.util.ArrayDeque arrayDeque = h;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new com.applovin.impl.h1.b();
            }
            return (com.applovin.impl.h1.b) arrayDeque.removeFirst();
        }
    }

    private static boolean f() {
        java.lang.String lowerCase = com.applovin.exoplayer2.common.base.Ascii.toLowerCase(com.applovin.impl.xp.c);
        return lowerCase.contains(com.adjust.sdk.Constants.REFERRER_API_SAMSUNG) || lowerCase.contains("motorola");
    }

    public h1(android.media.MediaCodec mediaCodec, android.os.HandlerThread handlerThread, boolean z) {
        this(mediaCodec, handlerThread, z, new com.applovin.impl.c4());
    }

    public void h() {
        if (this.g) {
            return;
        }
        this.b.start();
        this.c = new com.applovin.impl.h1.a(this.b.getLooper());
        this.g = true;
    }

    class a extends android.os.Handler {
        a(android.os.Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            com.applovin.impl.h1.this.a(message);
        }
    }

    public void b() {
        if (this.g) {
            try {
                c();
            } catch (java.lang.InterruptedException e) {
                java.lang.Thread.currentThread().interrupt();
                throw new java.lang.IllegalStateException(e);
            }
        }
    }

    h1(android.media.MediaCodec mediaCodec, android.os.HandlerThread handlerThread, boolean z, com.applovin.impl.c4 c4Var) {
        this.f837a = mediaCodec;
        this.b = handlerThread;
        this.e = c4Var;
        this.d = new java.util.concurrent.atomic.AtomicReference();
        this.f = z || f();
    }

    public void g() {
        if (this.g) {
            b();
            this.b.quit();
        }
        this.g = false;
    }

    public void i() {
        a();
    }

    private void e() {
        java.lang.RuntimeException runtimeException = (java.lang.RuntimeException) this.d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    private void c() {
        ((android.os.Handler) com.applovin.impl.xp.a(this.c)).removeCallbacksAndMessages(null);
        a();
        e();
    }

    private void a() {
        this.e.c();
        ((android.os.Handler) com.applovin.impl.xp.a(this.c)).obtainMessage(2).sendToTarget();
        this.e.a();
    }

    public void b(int i2, int i3, int i4, long j, int i5) {
        e();
        com.applovin.impl.h1.b bVarD = d();
        bVarD.a(i2, i3, i4, j, i5);
        ((android.os.Handler) com.applovin.impl.xp.a(this.c)).obtainMessage(0, bVarD).sendToTarget();
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f839a;
        public int b;
        public int c;
        public final android.media.MediaCodec.CryptoInfo d = new android.media.MediaCodec.CryptoInfo();
        public long e;
        public int f;

        b() {
        }

        public void a(int i, int i2, int i3, long j, int i4) {
            this.f839a = i;
            this.b = i2;
            this.c = i3;
            this.e = j;
            this.f = i4;
        }
    }

    private static void a(com.applovin.impl.z4 z4Var, android.media.MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = z4Var.f;
        cryptoInfo.numBytesOfClearData = a(z4Var.d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = a(z4Var.e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) com.applovin.impl.b1.a(a(z4Var.b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) com.applovin.impl.b1.a(a(z4Var.f1559a, cryptoInfo.iv));
        cryptoInfo.mode = z4Var.c;
        if (com.applovin.impl.xp.f1515a >= 24) {
            cryptoInfo.setPattern(new android.media.MediaCodec.CryptoInfo.Pattern(z4Var.g, z4Var.h));
        }
    }

    private static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 != null && bArr2.length >= bArr.length) {
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return java.util.Arrays.copyOf(bArr, bArr.length);
    }

    private static int[] a(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 != null && iArr2.length >= iArr.length) {
            java.lang.System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            return iArr2;
        }
        return java.util.Arrays.copyOf(iArr, iArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(android.os.Message message) {
        com.applovin.impl.h1.b bVar;
        int i2 = message.what;
        if (i2 == 0) {
            bVar = (com.applovin.impl.h1.b) message.obj;
            a(bVar.f839a, bVar.b, bVar.c, bVar.e, bVar.f);
        } else if (i2 != 1) {
            if (i2 != 2) {
                a(new java.lang.IllegalStateException(java.lang.String.valueOf(message.what)));
            } else {
                this.e.e();
            }
            bVar = null;
        } else {
            bVar = (com.applovin.impl.h1.b) message.obj;
            a(bVar.f839a, bVar.b, bVar.d, bVar.e, bVar.f);
        }
        if (bVar != null) {
            a(bVar);
        }
    }

    private void a(int i2, int i3, int i4, long j, int i5) {
        try {
            this.f837a.queueInputBuffer(i2, i3, i4, j, i5);
        } catch (java.lang.RuntimeException e) {
            a(e);
        }
    }

    private void a(int i2, int i3, android.media.MediaCodec.CryptoInfo cryptoInfo, long j, int i4) {
        try {
            if (this.f) {
                synchronized (i) {
                    this.f837a.queueSecureInputBuffer(i2, i3, cryptoInfo, j, i4);
                }
                return;
            }
            this.f837a.queueSecureInputBuffer(i2, i3, cryptoInfo, j, i4);
        } catch (java.lang.RuntimeException e) {
            a(e);
        }
    }

    public void a(int i2, int i3, com.applovin.impl.z4 z4Var, long j, int i4) {
        e();
        com.applovin.impl.h1.b bVarD = d();
        bVarD.a(i2, i3, 0, j, i4);
        a(z4Var, bVarD.d);
        ((android.os.Handler) com.applovin.impl.xp.a(this.c)).obtainMessage(1, bVarD).sendToTarget();
    }

    void a(java.lang.RuntimeException runtimeException) {
        this.d.set(runtimeException);
    }

    private static void a(com.applovin.impl.h1.b bVar) {
        java.util.ArrayDeque arrayDeque = h;
        synchronized (arrayDeque) {
            arrayDeque.add(bVar);
        }
    }
}

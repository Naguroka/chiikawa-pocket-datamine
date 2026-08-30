package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class dj implements com.applovin.impl.uq, com.applovin.impl.v2 {
    private int j;
    private android.graphics.SurfaceTexture k;
    private byte[] n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f728a = new java.util.concurrent.atomic.AtomicBoolean();
    private final java.util.concurrent.atomic.AtomicBoolean b = new java.util.concurrent.atomic.AtomicBoolean(true);
    private final com.applovin.impl.ei c = new com.applovin.impl.ei();
    private final com.applovin.impl.j9 d = new com.applovin.impl.j9();
    private final com.applovin.impl.eo f = new com.applovin.impl.eo();
    private final com.applovin.impl.eo g = new com.applovin.impl.eo();
    private final float[] h = new float[16];
    private final float[] i = new float[16];
    private volatile int l = 0;
    private int m = -1;

    public android.graphics.SurfaceTexture b() {
        android.opengl.GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
        com.applovin.impl.aa.a();
        this.c.a();
        com.applovin.impl.aa.a();
        this.j = com.applovin.impl.aa.b();
        android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(this.j);
        this.k = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new android.graphics.SurfaceTexture.OnFrameAvailableListener() { // from class: com.applovin.impl.dj$$ExternalSyntheticLambda0
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture2) {
                this.f$0.a(surfaceTexture2);
            }
        });
        return this.k;
    }

    public void a(float[] fArr, boolean z) {
        android.opengl.GLES20.glClear(16384);
        com.applovin.impl.aa.a();
        if (this.f728a.compareAndSet(true, false)) {
            ((android.graphics.SurfaceTexture) com.applovin.impl.b1.a(this.k)).updateTexImage();
            com.applovin.impl.aa.a();
            if (this.b.compareAndSet(true, false)) {
                android.opengl.Matrix.setIdentityM(this.h, 0);
            }
            long timestamp = this.k.getTimestamp();
            java.lang.Long l = (java.lang.Long) this.f.b(timestamp);
            if (l != null) {
                this.d.a(this.h, l.longValue());
            }
            com.applovin.impl.ci ciVar = (com.applovin.impl.ci) this.g.c(timestamp);
            if (ciVar != null) {
                this.c.b(ciVar);
            }
        }
        android.opengl.Matrix.multiplyMM(this.i, 0, fArr, 0, this.h, 0);
        this.c.a(this.j, this.i, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(android.graphics.SurfaceTexture surfaceTexture) {
        this.f728a.set(true);
    }

    @Override // com.applovin.impl.v2
    public void a(long j, float[] fArr) {
        this.d.a(j, fArr);
    }

    @Override // com.applovin.impl.v2
    public void a() {
        this.f.a();
        this.d.a();
        this.b.set(true);
    }

    @Override // com.applovin.impl.uq
    public void a(long j, long j2, com.applovin.impl.e9 e9Var, android.media.MediaFormat mediaFormat) {
        this.f.a(j2, java.lang.Long.valueOf(j));
        a(e9Var.w, e9Var.x, j2);
    }

    public void a(int i) {
        this.l = i;
    }

    private void a(byte[] bArr, int i, long j) {
        byte[] bArr2 = this.n;
        int i2 = this.m;
        this.n = bArr;
        if (i == -1) {
            i = this.l;
        }
        this.m = i;
        if (i2 == i && java.util.Arrays.equals(bArr2, this.n)) {
            return;
        }
        byte[] bArr3 = this.n;
        com.applovin.impl.ci ciVarA = bArr3 != null ? com.applovin.impl.di.a(bArr3, this.m) : null;
        if (ciVarA == null || !com.applovin.impl.ei.a(ciVarA)) {
            ciVarA = com.applovin.impl.ci.a(this.m);
        }
        this.g.a(j, ciVarA);
    }
}

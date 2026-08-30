package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class w2 extends com.applovin.impl.e2 {
    private final com.applovin.impl.o5 n;
    private final com.applovin.impl.ah o;
    private long p;
    private com.applovin.impl.v2 q;
    private long r;

    @Override // com.applovin.impl.qi
    public boolean d() {
        return true;
    }

    @Override // com.applovin.impl.qi, com.applovin.impl.ri
    public java.lang.String getName() {
        return "CameraMotionRenderer";
    }

    public w2() {
        super(6);
        this.n = new com.applovin.impl.o5(1);
        this.o = new com.applovin.impl.ah();
    }

    @Override // com.applovin.impl.e2, com.applovin.impl.rh.b
    public void a(int i, java.lang.Object obj) {
        if (i == 8) {
            this.q = (com.applovin.impl.v2) obj;
        } else {
            super.a(i, obj);
        }
    }

    @Override // com.applovin.impl.e2
    protected void v() {
        z();
    }

    @Override // com.applovin.impl.qi
    public boolean c() {
        return j();
    }

    private void z() {
        com.applovin.impl.v2 v2Var = this.q;
        if (v2Var != null) {
            v2Var.a();
        }
    }

    @Override // com.applovin.impl.e2
    protected void a(long j, boolean z) {
        this.r = Long.MIN_VALUE;
        z();
    }

    @Override // com.applovin.impl.e2
    protected void a(com.applovin.impl.e9[] e9VarArr, long j, long j2) {
        this.p = j2;
    }

    private float[] a(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.o.a(byteBuffer.array(), byteBuffer.limit());
        this.o.f(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i = 0; i < 3; i++) {
            fArr[i] = java.lang.Float.intBitsToFloat(this.o.m());
        }
        return fArr;
    }

    @Override // com.applovin.impl.qi
    public void a(long j, long j2) {
        while (!j() && this.r < androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US + j) {
            this.n.b();
            if (a(r(), this.n, 0) != -4 || this.n.e()) {
                return;
            }
            com.applovin.impl.o5 o5Var = this.n;
            this.r = o5Var.f;
            if (this.q != null && !o5Var.d()) {
                this.n.g();
                float[] fArrA = a((java.nio.ByteBuffer) com.applovin.impl.xp.a(this.n.c));
                if (fArrA != null) {
                    ((com.applovin.impl.v2) com.applovin.impl.xp.a(this.q)).a(this.r - this.p, fArrA);
                }
            }
        }
    }

    @Override // com.applovin.impl.ri
    public int a(com.applovin.impl.e9 e9Var) {
        if (androidx.media3.common.MimeTypes.APPLICATION_CAMERA_MOTION.equals(e9Var.m)) {
            return com.applovin.impl.ri.a(4);
        }
        return com.applovin.impl.ri.a(0);
    }
}

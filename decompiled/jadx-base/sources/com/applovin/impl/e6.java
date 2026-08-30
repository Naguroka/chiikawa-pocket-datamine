package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class e6 implements com.applovin.impl.kc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.q5 f746a;
    private final long b;
    private final long c;
    private final long d;
    private final long e;
    private final int f;
    private final boolean g;
    private final long h;
    private final boolean i;
    private int j;
    private boolean k;

    public e6() {
        this(new com.applovin.impl.q5(true, 65536), 50000, 50000, 2500, 5000, -1, false, 0, false);
    }

    @Override // com.applovin.impl.kc
    public void f() {
        a(false);
    }

    @Override // com.applovin.impl.kc
    public void c() {
        a(true);
    }

    @Override // com.applovin.impl.kc
    public void e() {
        a(true);
    }

    @Override // com.applovin.impl.kc
    public com.applovin.impl.n0 b() {
        return this.f746a;
    }

    @Override // com.applovin.impl.kc
    public long d() {
        return this.h;
    }

    private static void a(int i, int i2, java.lang.String str, java.lang.String str2) {
        com.applovin.impl.b1.a(i >= i2, str + " cannot be less than " + str2);
    }

    protected e6(com.applovin.impl.q5 q5Var, int i, int i2, int i3, int i4, int i5, boolean z, int i6, boolean z2) {
        a(i3, 0, "bufferForPlaybackMs", "0");
        a(i4, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(i, i3, "minBufferMs", "bufferForPlaybackMs");
        a(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(i2, i, "maxBufferMs", "minBufferMs");
        a(i6, 0, "backBufferDurationMs", "0");
        this.f746a = q5Var;
        this.b = com.applovin.impl.t2.a(i);
        this.c = com.applovin.impl.t2.a(i2);
        this.d = com.applovin.impl.t2.a(i3);
        this.e = com.applovin.impl.t2.a(i4);
        this.f = i5;
        this.j = i5 == -1 ? 13107200 : i5;
        this.g = z;
        this.h = com.applovin.impl.t2.a(i6);
        this.i = z2;
    }

    protected int a(com.applovin.impl.qi[] qiVarArr, com.applovin.impl.g8[] g8VarArr) {
        int iA = 0;
        for (int i = 0; i < qiVarArr.length; i++) {
            if (g8VarArr[i] != null) {
                iA += a(qiVarArr[i].e());
            }
        }
        return java.lang.Math.max(13107200, iA);
    }

    private static int a(int i) {
        switch (i) {
            case -2:
                return 0;
            case -1:
            default:
                throw new java.lang.IllegalArgumentException();
            case 0:
                return androidx.media3.exoplayer.DefaultLoadControl.DEFAULT_MUXED_BUFFER_SIZE;
            case 1:
                return 13107200;
            case 2:
                return androidx.media3.exoplayer.DefaultLoadControl.DEFAULT_VIDEO_BUFFER_SIZE;
            case 3:
            case 4:
            case 5:
            case 6:
                return 131072;
        }
    }

    @Override // com.applovin.impl.kc
    public void a(com.applovin.impl.qi[] qiVarArr, com.applovin.impl.po poVar, com.applovin.impl.g8[] g8VarArr) {
        int iA = this.f;
        if (iA == -1) {
            iA = a(qiVarArr, g8VarArr);
        }
        this.j = iA;
        this.f746a.a(iA);
    }

    private void a(boolean z) {
        int i = this.f;
        if (i == -1) {
            i = 13107200;
        }
        this.j = i;
        this.k = false;
        if (z) {
            this.f746a.e();
        }
    }

    @Override // com.applovin.impl.kc
    public boolean a() {
        return this.i;
    }

    @Override // com.applovin.impl.kc
    public boolean a(long j, long j2, float f) {
        boolean z = true;
        boolean z2 = this.f746a.d() >= this.j;
        long jMin = this.b;
        if (f > 1.0f) {
            jMin = java.lang.Math.min(com.applovin.impl.xp.a(jMin, f), this.c);
        }
        if (j2 < java.lang.Math.max(jMin, 500000L)) {
            if (!this.g && z2) {
                z = false;
            }
            this.k = z;
            if (!z && j2 < 500000) {
                com.applovin.impl.oc.d("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= this.c || z2) {
            this.k = false;
        }
        return this.k;
    }

    @Override // com.applovin.impl.kc
    public boolean a(long j, float f, boolean z, long j2) {
        long jB = com.applovin.impl.xp.b(j, f);
        long jMin = z ? this.e : this.d;
        if (j2 != androidx.media3.common.C.TIME_UNSET) {
            jMin = java.lang.Math.min(j2 / 2, jMin);
        }
        return jMin <= 0 || jB >= jMin || (!this.g && this.f746a.d() >= this.j);
    }
}

package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class u1 {
    private long A;
    private long B;
    private long C;
    private boolean D;
    private long E;
    private long F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.u1.a f1381a;
    private final long[] b;
    private android.media.AudioTrack c;
    private int d;
    private int e;
    private com.applovin.impl.t1 f;
    private int g;
    private boolean h;
    private long i;
    private float j;
    private boolean k;
    private long l;
    private long m;
    private java.lang.reflect.Method n;
    private long o;
    private boolean p;
    private boolean q;
    private long r;
    private long s;
    private long t;
    private long u;
    private int v;
    private int w;
    private long x;
    private long y;
    private long z;

    public interface a {
        void a(int i, long j);

        void a(long j);

        void a(long j, long j2, long j3, long j4);

        void b(long j);

        void b(long j, long j2, long j3, long j4);
    }

    public u1(com.applovin.impl.u1.a aVar) {
        this.f1381a = (com.applovin.impl.u1.a) com.applovin.impl.b1.a(aVar);
        if (com.applovin.impl.xp.f1515a >= 18) {
            try {
                this.n = android.media.AudioTrack.class.getMethod("getLatency", null);
            } catch (java.lang.NoSuchMethodException unused) {
            }
        }
        this.b = new long[10];
    }

    public void i() {
        ((com.applovin.impl.t1) com.applovin.impl.b1.a(this.f)).f();
    }

    public boolean g(long j) {
        int playState = ((android.media.AudioTrack) com.applovin.impl.b1.a(this.c)).getPlayState();
        if (this.h) {
            if (playState == 2) {
                this.p = false;
                return false;
            }
            if (playState == 1 && b() == 0) {
                return false;
            }
        }
        boolean z = this.p;
        boolean zE = e(j);
        this.p = zE;
        if (z && !zE && playState != 1) {
            this.f1381a.a(this.e, com.applovin.impl.t2.b(this.i));
        }
        return true;
    }

    public int b(long j) {
        return this.e - ((int) (j - (b() * ((long) this.d))));
    }

    public long c(long j) {
        return com.applovin.impl.t2.b(a(j - b()));
    }

    public boolean f(long j) {
        return this.y != androidx.media3.common.C.TIME_UNSET && j > 0 && android.os.SystemClock.elapsedRealtime() - this.y >= 200;
    }

    public void d(long j) {
        this.z = b();
        this.x = android.os.SystemClock.elapsedRealtime() * 1000;
        this.A = j;
    }

    public boolean e(long j) {
        return j > b() || a();
    }

    private void h(long j) {
        java.lang.reflect.Method method;
        if (!this.q || (method = this.n) == null || j - this.r < 500000) {
            return;
        }
        try {
            long jIntValue = (((long) ((java.lang.Integer) com.applovin.impl.xp.a((java.lang.Integer) method.invoke(com.applovin.impl.b1.a(this.c), new java.lang.Object[0]))).intValue()) * 1000) - this.i;
            this.o = jIntValue;
            long jMax = java.lang.Math.max(jIntValue, 0L);
            this.o = jMax;
            if (jMax > androidx.media3.exoplayer.dash.DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US) {
                this.f1381a.b(jMax);
                this.o = 0L;
            }
        } catch (java.lang.Exception unused) {
            this.n = null;
        }
        this.r = j;
    }

    private boolean a() {
        return this.h && ((android.media.AudioTrack) com.applovin.impl.b1.a(this.c)).getPlayState() == 2 && b() == 0;
    }

    public boolean d() {
        return ((android.media.AudioTrack) com.applovin.impl.b1.a(this.c)).getPlayState() == 3;
    }

    public void g() {
        h();
        this.c = null;
        this.f = null;
    }

    public boolean f() {
        h();
        if (this.x != androidx.media3.common.C.TIME_UNSET) {
            return false;
        }
        ((com.applovin.impl.t1) com.applovin.impl.b1.a(this.f)).f();
        return true;
    }

    private void e() {
        long jC = c();
        if (jC == 0) {
            return;
        }
        long jNanoTime = java.lang.System.nanoTime() / 1000;
        if (jNanoTime - this.m >= 30000) {
            long[] jArr = this.b;
            int i = this.v;
            jArr[i] = jC - jNanoTime;
            this.v = (i + 1) % 10;
            int i2 = this.w;
            if (i2 < 10) {
                this.w = i2 + 1;
            }
            this.m = jNanoTime;
            this.l = 0L;
            int i3 = 0;
            while (true) {
                int i4 = this.w;
                if (i3 >= i4) {
                    break;
                }
                this.l += this.b[i3] / ((long) i4);
                i3++;
            }
        }
        if (this.h) {
            return;
        }
        a(jNanoTime, jC);
        h(jNanoTime);
    }

    private long c() {
        return a(b());
    }

    private long b() {
        android.media.AudioTrack audioTrack = (android.media.AudioTrack) com.applovin.impl.b1.a(this.c);
        if (this.x != androidx.media3.common.C.TIME_UNSET) {
            return java.lang.Math.min(this.A, this.z + ((((android.os.SystemClock.elapsedRealtime() * 1000) - this.x) * ((long) this.g)) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE;
        if (this.h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.u = this.s;
            }
            playbackHeadPosition += this.u;
        }
        if (com.applovin.impl.xp.f1515a <= 29) {
            if (playbackHeadPosition == 0 && this.s > 0 && playState == 3) {
                if (this.y == androidx.media3.common.C.TIME_UNSET) {
                    this.y = android.os.SystemClock.elapsedRealtime();
                }
                return this.s;
            }
            this.y = androidx.media3.common.C.TIME_UNSET;
        }
        if (this.s > playbackHeadPosition) {
            this.t++;
        }
        this.s = playbackHeadPosition;
        return playbackHeadPosition + (this.t << 32);
    }

    private void h() {
        this.l = 0L;
        this.w = 0;
        this.v = 0;
        this.m = 0L;
        this.C = 0L;
        this.F = 0L;
        this.k = false;
    }

    private long a(long j) {
        return (j * 1000000) / ((long) this.g);
    }

    public long a(boolean z) {
        long jMax;
        if (((android.media.AudioTrack) com.applovin.impl.b1.a(this.c)).getPlayState() == 3) {
            e();
        }
        long jNanoTime = java.lang.System.nanoTime() / 1000;
        com.applovin.impl.t1 t1Var = (com.applovin.impl.t1) com.applovin.impl.b1.a(this.f);
        boolean zD = t1Var.d();
        if (zD) {
            jMax = a(t1Var.b()) + com.applovin.impl.xp.a(jNanoTime - t1Var.c(), this.j);
        } else {
            if (this.w == 0) {
                jMax = c();
            } else {
                jMax = this.l + jNanoTime;
            }
            if (!z) {
                jMax = java.lang.Math.max(0L, jMax - this.o);
            }
        }
        if (this.D != zD) {
            this.F = this.C;
            this.E = this.B;
        }
        long j = jNanoTime - this.F;
        if (j < 1000000) {
            long jA = this.E + com.applovin.impl.xp.a(j, this.j);
            long j2 = (j * 1000) / 1000000;
            jMax = ((jMax * j2) + ((1000 - j2) * jA)) / 1000;
        }
        if (!this.k) {
            long j3 = this.B;
            if (jMax > j3) {
                this.k = true;
                this.f1381a.a(java.lang.System.currentTimeMillis() - com.applovin.impl.t2.b(com.applovin.impl.xp.b(com.applovin.impl.t2.b(jMax - j3), this.j)));
            }
        }
        this.C = jNanoTime;
        this.B = jMax;
        this.D = zD;
        return jMax;
    }

    private void a(long j, long j2) {
        com.applovin.impl.t1 t1Var = (com.applovin.impl.t1) com.applovin.impl.b1.a(this.f);
        if (t1Var.a(j)) {
            long jC = t1Var.c();
            long jB = t1Var.b();
            if (java.lang.Math.abs(jC - j) > androidx.media3.exoplayer.dash.DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US) {
                this.f1381a.b(jB, jC, j, j2);
                t1Var.e();
            } else if (java.lang.Math.abs(a(jB) - j2) > androidx.media3.exoplayer.dash.DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US) {
                this.f1381a.a(jB, jC, j, j2);
                t1Var.e();
            } else {
                t1Var.a();
            }
        }
    }

    public void a(android.media.AudioTrack audioTrack, boolean z, int i, int i2, int i3) {
        this.c = audioTrack;
        this.d = i2;
        this.e = i3;
        this.f = new com.applovin.impl.t1(audioTrack);
        this.g = audioTrack.getSampleRate();
        this.h = z && a(i);
        boolean zG = com.applovin.impl.xp.g(i);
        this.q = zG;
        this.i = zG ? a(i3 / i2) : -9223372036854775807L;
        this.s = 0L;
        this.t = 0L;
        this.u = 0L;
        this.p = false;
        this.x = androidx.media3.common.C.TIME_UNSET;
        this.y = androidx.media3.common.C.TIME_UNSET;
        this.r = 0L;
        this.o = 0L;
        this.j = 1.0f;
    }

    public void a(float f) {
        this.j = f;
        com.applovin.impl.t1 t1Var = this.f;
        if (t1Var != null) {
            t1Var.f();
        }
    }

    private static boolean a(int i) {
        return com.applovin.impl.xp.f1515a < 23 && (i == 5 || i == 6);
    }
}

package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class i6 implements com.applovin.impl.jg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.ig f875a;
    private final long b;
    private final long c;
    private final com.applovin.impl.gl d;
    private int e;
    private long f;
    private long g;
    private long h;
    private long i;
    private long j;
    private long k;
    private long l;

    public i6(com.applovin.impl.gl glVar, long j, long j2, long j3, long j4, boolean z) {
        com.applovin.impl.b1.a(j >= 0 && j2 > j);
        this.d = glVar;
        this.b = j;
        this.c = j2;
        if (j3 != j2 - j && !z) {
            this.e = 0;
        } else {
            this.f = j4;
            this.e = 4;
        }
        this.f875a = new com.applovin.impl.ig();
    }

    @Override // com.applovin.impl.jg
    public long a(com.applovin.impl.k8 k8Var) throws java.io.IOException {
        int i = this.e;
        if (i == 0) {
            long jF = k8Var.f();
            this.g = jF;
            this.e = 1;
            long j = this.c - 65307;
            if (j > jF) {
                return j;
            }
        } else if (i != 1) {
            if (i == 2) {
                long jB = b(k8Var);
                if (jB != -1) {
                    return jB;
                }
                this.e = 3;
            } else if (i != 3) {
                if (i == 4) {
                    return -1L;
                }
                throw new java.lang.IllegalStateException();
            }
            d(k8Var);
            this.e = 4;
            return -(this.k + 2);
        }
        this.f = c(k8Var);
        this.e = 4;
        return this.g;
    }

    @Override // com.applovin.impl.jg
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.applovin.impl.i6.b a() {
        if (this.f != 0) {
            return new com.applovin.impl.i6.b();
        }
        return null;
    }

    private void d(com.applovin.impl.k8 k8Var) throws com.applovin.impl.ch {
        while (true) {
            this.f875a.a(k8Var);
            this.f875a.a(k8Var, false);
            com.applovin.impl.ig igVar = this.f875a;
            if (igVar.c > this.h) {
                k8Var.b();
                return;
            } else {
                k8Var.a(igVar.h + igVar.i);
                this.i = k8Var.f();
                this.k = this.f875a.c;
            }
        }
    }

    private final class b implements com.applovin.impl.ij {
        @Override // com.applovin.impl.ij
        public boolean b() {
            return true;
        }

        private b() {
        }

        @Override // com.applovin.impl.ij
        public com.applovin.impl.ij.a b(long j) {
            return new com.applovin.impl.ij.a(new com.applovin.impl.kj(j, com.applovin.impl.xp.b((com.applovin.impl.i6.this.b + ((com.applovin.impl.i6.this.d.b(j) * (com.applovin.impl.i6.this.c - com.applovin.impl.i6.this.b)) / com.applovin.impl.i6.this.f)) - 30000, com.applovin.impl.i6.this.b, com.applovin.impl.i6.this.c - 1)));
        }

        @Override // com.applovin.impl.ij
        public long d() {
            return com.applovin.impl.i6.this.d.a(com.applovin.impl.i6.this.f);
        }
    }

    long c(com.applovin.impl.k8 k8Var) throws com.applovin.impl.ch, java.io.EOFException {
        this.f875a.a();
        if (this.f875a.a(k8Var)) {
            this.f875a.a(k8Var, false);
            com.applovin.impl.ig igVar = this.f875a;
            k8Var.a(igVar.h + igVar.i);
            long j = this.f875a.c;
            while (true) {
                com.applovin.impl.ig igVar2 = this.f875a;
                if ((igVar2.b & 4) == 4 || !igVar2.a(k8Var) || k8Var.f() >= this.c || !this.f875a.a(k8Var, true)) {
                    break;
                }
                com.applovin.impl.ig igVar3 = this.f875a;
                if (!com.applovin.impl.m8.a(k8Var, igVar3.h + igVar3.i)) {
                    break;
                }
                j = this.f875a.c;
            }
            return j;
        }
        throw new java.io.EOFException();
    }

    private long b(com.applovin.impl.k8 k8Var) throws java.io.IOException {
        if (this.i == this.j) {
            return -1L;
        }
        long jF = k8Var.f();
        if (!this.f875a.a(k8Var, this.j)) {
            long j = this.i;
            if (j != jF) {
                return j;
            }
            throw new java.io.IOException("No ogg page can be found.");
        }
        this.f875a.a(k8Var, false);
        k8Var.b();
        long j2 = this.h;
        com.applovin.impl.ig igVar = this.f875a;
        long j3 = igVar.c;
        long j4 = j2 - j3;
        int i = igVar.h + igVar.i;
        if (0 <= j4 && j4 < 72000) {
            return -1L;
        }
        if (j4 < 0) {
            this.j = jF;
            this.l = j3;
        } else {
            this.i = k8Var.f() + ((long) i);
            this.k = this.f875a.c;
        }
        long j5 = this.j;
        long j6 = this.i;
        if (j5 - j6 < androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US) {
            this.j = j6;
            return j6;
        }
        long jF2 = k8Var.f() - (((long) i) * (j4 <= 0 ? 2L : 1L));
        long j7 = this.j;
        long j8 = this.i;
        return com.applovin.impl.xp.b(jF2 + ((j4 * (j7 - j8)) / (this.l - this.k)), j8, j7 - 1);
    }

    @Override // com.applovin.impl.jg
    public void a(long j) {
        this.h = com.applovin.impl.xp.b(j, 0L, this.f - 1);
        this.e = 2;
        this.i = this.b;
        this.j = this.c;
        this.k = 0L;
        this.l = this.f;
    }
}

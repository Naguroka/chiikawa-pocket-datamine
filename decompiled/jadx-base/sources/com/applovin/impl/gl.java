package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
abstract class gl {
    private com.applovin.impl.qo b;
    private com.applovin.impl.l8 c;
    private com.applovin.impl.jg d;
    private long e;
    private long f;
    private long g;
    private int h;
    private int i;
    private long k;
    private boolean l;
    private boolean m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.hg f825a = new com.applovin.impl.hg();
    private com.applovin.impl.gl.b j = new com.applovin.impl.gl.b();

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        com.applovin.impl.e9 f826a;
        com.applovin.impl.jg b;

        b() {
        }
    }

    protected abstract long a(com.applovin.impl.ah ahVar);

    protected abstract boolean a(com.applovin.impl.ah ahVar, long j, com.applovin.impl.gl.b bVar);

    private static final class c implements com.applovin.impl.jg {
        private c() {
        }

        @Override // com.applovin.impl.jg
        public long a(com.applovin.impl.k8 k8Var) {
            return -1L;
        }

        @Override // com.applovin.impl.jg
        public void a(long j) {
        }

        @Override // com.applovin.impl.jg
        public com.applovin.impl.ij a() {
            return new com.applovin.impl.ij.b(androidx.media3.common.C.TIME_UNSET);
        }
    }

    private void a() {
        com.applovin.impl.b1.b(this.b);
        com.applovin.impl.xp.a(this.c);
    }

    protected long b(long j) {
        return (((long) this.i) * j) / 1000000;
    }

    protected void c(long j) {
        this.g = j;
    }

    protected long a(long j) {
        return (j * 1000000) / ((long) this.i);
    }

    private int b(com.applovin.impl.k8 k8Var) {
        if (!a(k8Var)) {
            return -1;
        }
        com.applovin.impl.e9 e9Var = this.j.f826a;
        this.i = e9Var.A;
        if (!this.m) {
            this.b.a(e9Var);
            this.m = true;
        }
        com.applovin.impl.jg jgVar = this.j.b;
        if (jgVar != null) {
            this.d = jgVar;
        } else if (k8Var.a() == -1) {
            this.d = new com.applovin.impl.gl.c();
        } else {
            com.applovin.impl.ig igVarA = this.f825a.a();
            this.d = new com.applovin.impl.i6(this, this.f, k8Var.a(), igVarA.h + igVarA.i, igVarA.c, (igVarA.b & 4) != 0);
        }
        this.h = 2;
        this.f825a.d();
        return 0;
    }

    void a(com.applovin.impl.l8 l8Var, com.applovin.impl.qo qoVar) {
        this.c = l8Var;
        this.b = qoVar;
        a(true);
    }

    final int a(com.applovin.impl.k8 k8Var, com.applovin.impl.th thVar) {
        a();
        int i = this.h;
        if (i == 0) {
            return b(k8Var);
        }
        if (i == 1) {
            k8Var.a((int) this.f);
            this.h = 2;
            return 0;
        }
        if (i == 2) {
            com.applovin.impl.xp.a(this.d);
            return b(k8Var, thVar);
        }
        if (i == 3) {
            return -1;
        }
        throw new java.lang.IllegalStateException();
    }

    private int b(com.applovin.impl.k8 k8Var, com.applovin.impl.th thVar) {
        long jA = this.d.a(k8Var);
        if (jA >= 0) {
            thVar.f1364a = jA;
            return 1;
        }
        if (jA < -1) {
            c(-(jA + 2));
        }
        if (!this.l) {
            this.c.a((com.applovin.impl.ij) com.applovin.impl.b1.b(this.d.a()));
            this.l = true;
        }
        if (this.k <= 0 && !this.f825a.a(k8Var)) {
            this.h = 3;
            return -1;
        }
        this.k = 0L;
        com.applovin.impl.ah ahVarB = this.f825a.b();
        long jA2 = a(ahVarB);
        if (jA2 >= 0) {
            long j = this.g;
            if (j + jA2 >= this.e) {
                long jA3 = a(j);
                this.b.a(ahVarB, ahVarB.e());
                this.b.a(jA3, 1, ahVarB.e(), 0, null);
                this.e = -1L;
            }
        }
        this.g += jA2;
        return 0;
    }

    private boolean a(com.applovin.impl.k8 k8Var) {
        while (this.f825a.a(k8Var)) {
            this.k = k8Var.f() - this.f;
            if (!a(this.f825a.b(), this.f, this.j)) {
                return true;
            }
            this.f = k8Var.f();
        }
        this.h = 3;
        return false;
    }

    protected void a(boolean z) {
        if (z) {
            this.j = new com.applovin.impl.gl.b();
            this.f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1L;
        this.g = 0L;
    }

    final void a(long j, long j2) {
        this.f825a.c();
        if (j == 0) {
            a(!this.l);
        } else if (this.h != 0) {
            this.e = b(j2);
            ((com.applovin.impl.jg) com.applovin.impl.xp.a(this.d)).a(this.e);
            this.h = 2;
        }
    }
}

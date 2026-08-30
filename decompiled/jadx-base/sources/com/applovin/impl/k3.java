package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class k3 implements com.applovin.impl.vd, com.applovin.impl.vd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.applovin.impl.vd f943a;
    private com.applovin.impl.vd.a b;
    private com.applovin.impl.k3.a[] c = new com.applovin.impl.k3.a[0];
    private long d;
    long f;
    long g;

    public k3(com.applovin.impl.vd vdVar, boolean z, long j, long j2) {
        this.f943a = vdVar;
        this.d = z ? j : androidx.media3.common.C.TIME_UNSET;
        this.f = j;
        this.g = j2;
    }

    @Override // com.applovin.impl.vd
    public void f() {
        this.f943a.f();
    }

    @Override // com.applovin.impl.vd
    public void a(long j, boolean z) {
        this.f943a.a(j, z);
    }

    @Override // com.applovin.impl.vd
    public long h() {
        if (c()) {
            long j = this.d;
            this.d = androidx.media3.common.C.TIME_UNSET;
            long jH = h();
            return jH != androidx.media3.common.C.TIME_UNSET ? jH : j;
        }
        long jH2 = this.f943a.h();
        if (jH2 == androidx.media3.common.C.TIME_UNSET) {
            return androidx.media3.common.C.TIME_UNSET;
        }
        boolean z = true;
        com.applovin.impl.b1.b(jH2 >= this.f);
        long j2 = this.g;
        if (j2 != Long.MIN_VALUE && jH2 > j2) {
            z = false;
        }
        com.applovin.impl.b1.b(z);
        return jH2;
    }

    @Override // com.applovin.impl.vd
    public long e() {
        long jE = this.f943a.e();
        if (jE != Long.MIN_VALUE) {
            long j = this.g;
            if (j == Long.MIN_VALUE || jE < j) {
                return jE;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.applovin.impl.vd
    public long g() {
        long jG = this.f943a.g();
        if (jG != Long.MIN_VALUE) {
            long j = this.g;
            if (j == Long.MIN_VALUE || jG < j) {
                return jG;
            }
        }
        return Long.MIN_VALUE;
    }

    boolean c() {
        return this.d != androidx.media3.common.C.TIME_UNSET;
    }

    private com.applovin.impl.jj b(long j, com.applovin.impl.jj jjVar) {
        long jB = com.applovin.impl.xp.b(jjVar.f927a, 0L, j - this.f);
        long j2 = jjVar.b;
        long j3 = this.g;
        long jB2 = com.applovin.impl.xp.b(j2, 0L, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j);
        return (jB == jjVar.f927a && jB2 == jjVar.b) ? jjVar : new com.applovin.impl.jj(jB, jB2);
    }

    private final class a implements com.applovin.impl.cj {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.applovin.impl.cj f944a;
        private boolean b;

        public a(com.applovin.impl.cj cjVar) {
            this.f944a = cjVar;
        }

        public void b() {
            this.b = false;
        }

        @Override // com.applovin.impl.cj
        public boolean d() {
            return !com.applovin.impl.k3.this.c() && this.f944a.d();
        }

        @Override // com.applovin.impl.cj
        public void a() {
            this.f944a.a();
        }

        @Override // com.applovin.impl.cj
        public int a(com.applovin.impl.f9 f9Var, com.applovin.impl.o5 o5Var, int i) {
            if (com.applovin.impl.k3.this.c()) {
                return -3;
            }
            if (this.b) {
                o5Var.e(4);
                return -4;
            }
            int iA = this.f944a.a(f9Var, o5Var, i);
            if (iA == -5) {
                com.applovin.impl.e9 e9Var = (com.applovin.impl.e9) com.applovin.impl.b1.a(f9Var.b);
                int i2 = e9Var.C;
                if (i2 != 0 || e9Var.D != 0) {
                    com.applovin.impl.k3 k3Var = com.applovin.impl.k3.this;
                    if (k3Var.f != 0) {
                        i2 = 0;
                    }
                    f9Var.b = e9Var.a().e(i2).f(k3Var.g == Long.MIN_VALUE ? e9Var.D : 0).a();
                }
                return -5;
            }
            com.applovin.impl.k3 k3Var2 = com.applovin.impl.k3.this;
            long j = k3Var2.g;
            if (j == Long.MIN_VALUE || ((iA != -4 || o5Var.f < j) && !(iA == -3 && k3Var2.e() == Long.MIN_VALUE && !o5Var.d))) {
                return iA;
            }
            o5Var.b();
            o5Var.e(4);
            this.b = true;
            return -4;
        }

        @Override // com.applovin.impl.cj
        public int a(long j) {
            if (com.applovin.impl.k3.this.c()) {
                return -3;
            }
            return this.f944a.a(j);
        }
    }

    @Override // com.applovin.impl.vd
    public long a(long j, com.applovin.impl.jj jjVar) {
        long j2 = this.f;
        if (j == j2) {
            return j2;
        }
        return this.f943a.a(j, b(j, jjVar));
    }

    @Override // com.applovin.impl.vd
    public void c(long j) {
        this.f943a.c(j);
    }

    @Override // com.applovin.impl.vd
    public boolean b(long j) {
        return this.f943a.b(j);
    }

    @Override // com.applovin.impl.vd
    public boolean a() {
        return this.f943a.a();
    }

    @Override // com.applovin.impl.vd
    public com.applovin.impl.po b() {
        return this.f943a.b();
    }

    @Override // com.applovin.impl.pj.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(com.applovin.impl.vd vdVar) {
        ((com.applovin.impl.vd.a) com.applovin.impl.b1.a(this.b)).a((com.applovin.impl.pj) this);
    }

    @Override // com.applovin.impl.vd.a
    public void a(com.applovin.impl.vd vdVar) {
        ((com.applovin.impl.vd.a) com.applovin.impl.b1.a(this.b)).a((com.applovin.impl.vd) this);
    }

    @Override // com.applovin.impl.vd
    public void a(com.applovin.impl.vd.a aVar, long j) {
        this.b = aVar;
        this.f943a.a(this, j);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0034  */
    @Override // com.applovin.impl.vd
    public long a(long j) {
        this.d = androidx.media3.common.C.TIME_UNSET;
        boolean z = false;
        for (com.applovin.impl.k3.a aVar : this.c) {
            if (aVar != null) {
                aVar.b();
            }
        }
        long jA = this.f943a.a(j);
        if (jA == j) {
            z = true;
        } else if (jA >= this.f) {
            long j2 = this.g;
            if (j2 == Long.MIN_VALUE || jA <= j2) {
                z = true;
            }
        }
        com.applovin.impl.b1.b(z);
        return jA;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0043  */
    /* JADX WARN: Code duplicated, block: B:27:0x0063  */
    @Override // com.applovin.impl.vd
    public long a(com.applovin.impl.g8[] g8VarArr, boolean[] zArr, com.applovin.impl.cj[] cjVarArr, boolean[] zArr2, long j) {
        long j2;
        boolean z;
        this.c = new com.applovin.impl.k3.a[cjVarArr.length];
        com.applovin.impl.cj[] cjVarArr2 = new com.applovin.impl.cj[cjVarArr.length];
        int i = 0;
        while (true) {
            com.applovin.impl.cj cjVar = null;
            if (i >= cjVarArr.length) {
                break;
            }
            com.applovin.impl.k3.a[] aVarArr = this.c;
            com.applovin.impl.k3.a aVar = (com.applovin.impl.k3.a) cjVarArr[i];
            aVarArr[i] = aVar;
            if (aVar != null) {
                cjVar = aVar.f944a;
            }
            cjVarArr2[i] = cjVar;
            i++;
        }
        long jA = this.f943a.a(g8VarArr, zArr, cjVarArr2, zArr2, j);
        if (c()) {
            long j3 = this.f;
            if (j == j3 && a(j3, g8VarArr)) {
                j2 = jA;
            } else {
                j2 = androidx.media3.common.C.TIME_UNSET;
            }
        } else {
            j2 = androidx.media3.common.C.TIME_UNSET;
        }
        this.d = j2;
        if (jA != j) {
            if (jA >= this.f) {
                long j4 = this.g;
                z = j4 == Long.MIN_VALUE || jA <= j4;
            }
        }
        com.applovin.impl.b1.b(z);
        for (int i2 = 0; i2 < cjVarArr.length; i2++) {
            com.applovin.impl.cj cjVar2 = cjVarArr2[i2];
            if (cjVar2 == null) {
                this.c[i2] = null;
            } else {
                com.applovin.impl.k3.a[] aVarArr2 = this.c;
                com.applovin.impl.k3.a aVar2 = aVarArr2[i2];
                if (aVar2 == null || aVar2.f944a != cjVar2) {
                    aVarArr2[i2] = new com.applovin.impl.k3.a(cjVar2);
                }
            }
            cjVarArr[i2] = this.c[i2];
        }
        return jA;
    }

    private static boolean a(long j, com.applovin.impl.g8[] g8VarArr) {
        if (j != 0) {
            for (com.applovin.impl.g8 g8Var : g8VarArr) {
                if (g8Var != null) {
                    com.applovin.impl.e9 e9VarG = g8Var.g();
                    if (!com.applovin.impl.hf.a(e9VarG.m, e9VarG.j)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void a(long j, long j2) {
        this.f = j;
        this.g = j2;
    }
}

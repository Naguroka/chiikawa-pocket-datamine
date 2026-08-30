package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class wd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.applovin.impl.vd f1464a;
    public final java.lang.Object b;
    public final com.applovin.impl.cj[] c;
    public boolean d;
    public boolean e;
    public com.applovin.impl.yd f;
    public boolean g;
    private final boolean[] h;
    private final com.applovin.impl.ri[] i;
    private final com.applovin.impl.vo j;
    private final com.applovin.impl.ee k;
    private com.applovin.impl.wd l;
    private com.applovin.impl.po m;
    private com.applovin.impl.wo n;
    private long o;

    public wd(com.applovin.impl.ri[] riVarArr, long j, com.applovin.impl.vo voVar, com.applovin.impl.n0 n0Var, com.applovin.impl.ee eeVar, com.applovin.impl.yd ydVar, com.applovin.impl.wo woVar) {
        this.i = riVarArr;
        this.o = j;
        this.j = voVar;
        this.k = eeVar;
        com.applovin.impl.ae.a aVar = ydVar.f1538a;
        this.b = aVar.f1504a;
        this.f = ydVar;
        this.m = com.applovin.impl.po.d;
        this.n = woVar;
        this.c = new com.applovin.impl.cj[riVarArr.length];
        this.h = new boolean[riVarArr.length];
        this.f1464a = a(aVar, eeVar, n0Var, ydVar.b, ydVar.d);
    }

    public long f() {
        return this.o;
    }

    public long g() {
        return this.f.b + this.o;
    }

    public boolean j() {
        return this.d && (!this.e || this.f1464a.e() == Long.MIN_VALUE);
    }

    public long c() {
        if (!this.d) {
            return this.f.b;
        }
        long jE = this.e ? this.f1464a.e() : Long.MIN_VALUE;
        return jE == Long.MIN_VALUE ? this.f.e : jE;
    }

    public long e() {
        if (this.d) {
            return this.f1464a.g();
        }
        return 0L;
    }

    public long a(com.applovin.impl.wo woVar, long j, boolean z) {
        return a(woVar, j, z, new boolean[this.i.length]);
    }

    public long e(long j) {
        return j + f();
    }

    public void c(long j) {
        this.o = j;
    }

    public void l() {
        a();
        a(this.k, this.f1464a);
    }

    public com.applovin.impl.wd d() {
        return this.l;
    }

    public com.applovin.impl.po h() {
        return this.m;
    }

    public com.applovin.impl.wo i() {
        return this.n;
    }

    public void m() {
        com.applovin.impl.vd vdVar = this.f1464a;
        if (vdVar instanceof com.applovin.impl.k3) {
            long j = this.f.d;
            if (j == androidx.media3.common.C.TIME_UNSET) {
                j = Long.MIN_VALUE;
            }
            ((com.applovin.impl.k3) vdVar).a(0L, j);
        }
    }

    private void b(com.applovin.impl.cj[] cjVarArr) {
        int i = 0;
        while (true) {
            com.applovin.impl.ri[] riVarArr = this.i;
            if (i >= riVarArr.length) {
                return;
            }
            if (riVarArr[i].e() == -2) {
                cjVarArr[i] = null;
            }
            i++;
        }
    }

    private boolean k() {
        return this.l == null;
    }

    public long d(long j) {
        return j - f();
    }

    public long a(com.applovin.impl.wo woVar, long j, boolean z, boolean[] zArr) {
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= woVar.f1476a) {
                break;
            }
            boolean[] zArr2 = this.h;
            if (z || !woVar.a(this.n, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        b(this.c);
        a();
        this.n = woVar;
        b();
        long jA = this.f1464a.a(woVar.c, this.h, this.c, zArr, j);
        a(this.c);
        this.e = false;
        int i2 = 0;
        while (true) {
            com.applovin.impl.cj[] cjVarArr = this.c;
            if (i2 >= cjVarArr.length) {
                return jA;
            }
            if (cjVarArr[i2] != null) {
                com.applovin.impl.b1.b(woVar.a(i2));
                if (this.i[i2].e() != -2) {
                    this.e = true;
                }
            } else {
                com.applovin.impl.b1.b(woVar.c[i2] == null);
            }
            i2++;
        }
    }

    private void b() {
        if (!k()) {
            return;
        }
        int i = 0;
        while (true) {
            com.applovin.impl.wo woVar = this.n;
            if (i >= woVar.f1476a) {
                return;
            }
            boolean zA = woVar.a(i);
            com.applovin.impl.g8 g8Var = this.n.c[i];
            if (zA && g8Var != null) {
                g8Var.i();
            }
            i++;
        }
    }

    public void b(long j) {
        com.applovin.impl.b1.b(k());
        if (this.d) {
            this.f1464a.c(d(j));
        }
    }

    private void a(com.applovin.impl.cj[] cjVarArr) {
        int i = 0;
        while (true) {
            com.applovin.impl.ri[] riVarArr = this.i;
            if (i >= riVarArr.length) {
                return;
            }
            if (riVarArr[i].e() == -2 && this.n.a(i)) {
                cjVarArr[i] = new com.applovin.impl.r7();
            }
            i++;
        }
    }

    public void a(long j) {
        com.applovin.impl.b1.b(k());
        this.f1464a.b(d(j));
    }

    public com.applovin.impl.wo b(float f, com.applovin.impl.fo foVar) {
        com.applovin.impl.wo woVarA = this.j.a(this.i, h(), this.f.f1538a, foVar);
        for (com.applovin.impl.g8 g8Var : woVarA.c) {
            if (g8Var != null) {
                g8Var.a(f);
            }
        }
        return woVarA;
    }

    private static com.applovin.impl.vd a(com.applovin.impl.ae.a aVar, com.applovin.impl.ee eeVar, com.applovin.impl.n0 n0Var, long j, long j2) {
        com.applovin.impl.vd vdVarA = eeVar.a(aVar, n0Var, j);
        return j2 != androidx.media3.common.C.TIME_UNSET ? new com.applovin.impl.k3(vdVarA, true, 0L, j2) : vdVarA;
    }

    private void a() {
        if (!k()) {
            return;
        }
        int i = 0;
        while (true) {
            com.applovin.impl.wo woVar = this.n;
            if (i >= woVar.f1476a) {
                return;
            }
            boolean zA = woVar.a(i);
            com.applovin.impl.g8 g8Var = this.n.c[i];
            if (zA && g8Var != null) {
                g8Var.f();
            }
            i++;
        }
    }

    public void a(float f, com.applovin.impl.fo foVar) {
        this.d = true;
        this.m = this.f1464a.b();
        com.applovin.impl.wo woVarB = b(f, foVar);
        com.applovin.impl.yd ydVar = this.f;
        long jMax = ydVar.b;
        long j = ydVar.e;
        if (j != androidx.media3.common.C.TIME_UNSET && jMax >= j) {
            jMax = java.lang.Math.max(0L, j - 1);
        }
        long jA = a(woVarB, jMax, false);
        long j2 = this.o;
        com.applovin.impl.yd ydVar2 = this.f;
        this.o = j2 + (ydVar2.b - jA);
        this.f = ydVar2.b(jA);
    }

    private static void a(com.applovin.impl.ee eeVar, com.applovin.impl.vd vdVar) {
        try {
            if (vdVar instanceof com.applovin.impl.k3) {
                eeVar.a(((com.applovin.impl.k3) vdVar).f943a);
            } else {
                eeVar.a(vdVar);
            }
        } catch (java.lang.RuntimeException e) {
            com.applovin.impl.oc.a("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public void a(com.applovin.impl.wd wdVar) {
        if (wdVar == this.l) {
            return;
        }
        a();
        this.l = wdVar;
        b();
    }
}

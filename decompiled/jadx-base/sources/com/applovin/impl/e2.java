package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e2 implements com.applovin.impl.qi, com.applovin.impl.ri {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f744a;
    private com.applovin.impl.si c;
    private int d;
    private int f;
    private com.applovin.impl.cj g;
    private com.applovin.impl.e9[] h;
    private long i;
    private long j;
    private boolean l;
    private boolean m;
    private final com.applovin.impl.f9 b = new com.applovin.impl.f9();
    private long k = Long.MIN_VALUE;

    @Override // com.applovin.impl.rh.b
    public void a(int i, java.lang.Object obj) {
    }

    protected abstract void a(long j, boolean z);

    protected void a(boolean z, boolean z2) {
    }

    protected abstract void a(com.applovin.impl.e9[] e9VarArr, long j, long j2);

    @Override // com.applovin.impl.qi
    public com.applovin.impl.fd l() {
        return null;
    }

    @Override // com.applovin.impl.ri
    public int m() {
        return 0;
    }

    @Override // com.applovin.impl.qi
    public final com.applovin.impl.ri n() {
        return this;
    }

    protected abstract void v();

    protected void w() {
    }

    protected void x() {
    }

    protected void y() {
    }

    public e2(int i) {
        this.f744a = i;
    }

    @Override // com.applovin.impl.qi, com.applovin.impl.ri
    public final int e() {
        return this.f744a;
    }

    @Override // com.applovin.impl.qi
    public final int b() {
        return this.f;
    }

    @Override // com.applovin.impl.qi
    public final void start() {
        com.applovin.impl.b1.b(this.f == 1);
        this.f = 2;
        x();
    }

    @Override // com.applovin.impl.qi
    public final com.applovin.impl.cj o() {
        return this.g;
    }

    @Override // com.applovin.impl.qi
    public final boolean j() {
        return this.k == Long.MIN_VALUE;
    }

    @Override // com.applovin.impl.qi
    public final long i() {
        return this.k;
    }

    @Override // com.applovin.impl.qi
    public final void g() {
        this.l = true;
    }

    @Override // com.applovin.impl.qi
    public final boolean k() {
        return this.l;
    }

    @Override // com.applovin.impl.qi
    public final void b(int i) {
        this.d = i;
    }

    @Override // com.applovin.impl.qi
    public final void h() {
        ((com.applovin.impl.cj) com.applovin.impl.b1.a(this.g)).a();
    }

    @Override // com.applovin.impl.qi
    public final void stop() {
        com.applovin.impl.b1.b(this.f == 2);
        this.f = 1;
        y();
    }

    @Override // com.applovin.impl.qi
    public final void f() {
        com.applovin.impl.b1.b(this.f == 1);
        this.b.a();
        this.f = 0;
        this.g = null;
        this.h = null;
        this.l = false;
        v();
    }

    @Override // com.applovin.impl.qi
    public final void reset() {
        com.applovin.impl.b1.b(this.f == 0);
        this.b.a();
        w();
    }

    protected final com.applovin.impl.f9 r() {
        this.b.a();
        return this.b;
    }

    protected final com.applovin.impl.e9[] t() {
        return (com.applovin.impl.e9[]) com.applovin.impl.b1.a(this.h);
    }

    protected final com.applovin.impl.si q() {
        return (com.applovin.impl.si) com.applovin.impl.b1.a(this.c);
    }

    protected final int s() {
        return this.d;
    }

    protected final com.applovin.impl.z7 a(java.lang.Throwable th, com.applovin.impl.e9 e9Var, int i) {
        return a(th, e9Var, false, i);
    }

    protected final boolean u() {
        return j() ? this.l : ((com.applovin.impl.cj) com.applovin.impl.b1.a(this.g)).d();
    }

    protected int b(long j) {
        return ((com.applovin.impl.cj) com.applovin.impl.b1.a(this.g)).a(j - this.i);
    }

    protected final com.applovin.impl.z7 a(java.lang.Throwable th, com.applovin.impl.e9 e9Var, boolean z, int i) {
        int iD;
        if (e9Var == null || this.m) {
            iD = 4;
        } else {
            this.m = true;
            try {
                iD = com.applovin.impl.ri.d(a(e9Var));
                this.m = false;
            } catch (com.applovin.impl.z7 unused) {
                this.m = false;
                iD = 4;
            } catch (java.lang.Throwable th2) {
                this.m = false;
                throw th2;
            }
        }
        return com.applovin.impl.z7.a(th, getName(), s(), e9Var, iD, z, i);
    }

    @Override // com.applovin.impl.qi
    public final void a(com.applovin.impl.si siVar, com.applovin.impl.e9[] e9VarArr, com.applovin.impl.cj cjVar, long j, boolean z, boolean z2, long j2, long j3) {
        com.applovin.impl.b1.b(this.f == 0);
        this.c = siVar;
        this.f = 1;
        this.j = j;
        a(z, z2);
        a(e9VarArr, cjVar, j2, j3);
        a(j, z);
    }

    protected final int a(com.applovin.impl.f9 f9Var, com.applovin.impl.o5 o5Var, int i) {
        int iA = ((com.applovin.impl.cj) com.applovin.impl.b1.a(this.g)).a(f9Var, o5Var, i);
        if (iA == -4) {
            if (o5Var.e()) {
                this.k = Long.MIN_VALUE;
                return this.l ? -4 : -3;
            }
            long j = o5Var.f + this.i;
            o5Var.f = j;
            this.k = java.lang.Math.max(this.k, j);
        } else if (iA == -5) {
            com.applovin.impl.e9 e9Var = (com.applovin.impl.e9) com.applovin.impl.b1.a(f9Var.b);
            if (e9Var.q != Long.MAX_VALUE) {
                f9Var.b = e9Var.a().a(e9Var.q + this.i).a();
            }
        }
        return iA;
    }

    @Override // com.applovin.impl.qi
    public final void a(com.applovin.impl.e9[] e9VarArr, com.applovin.impl.cj cjVar, long j, long j2) {
        com.applovin.impl.b1.b(!this.l);
        this.g = cjVar;
        if (this.k == Long.MIN_VALUE) {
            this.k = j;
        }
        this.h = e9VarArr;
        this.i = j2;
        a(e9VarArr, j, j2);
    }

    @Override // com.applovin.impl.qi
    public final void a(long j) {
        this.l = false;
        this.j = j;
        this.k = j;
        a(j, false);
    }
}

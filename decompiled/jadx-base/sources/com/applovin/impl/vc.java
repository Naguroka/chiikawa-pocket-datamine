package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class vc implements com.applovin.impl.vd, com.applovin.impl.vd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.applovin.impl.ae.a f1425a;
    private final long b;
    private final com.applovin.impl.n0 c;
    private com.applovin.impl.ae d;
    private com.applovin.impl.vd f;
    private com.applovin.impl.vd.a g;
    private long h = androidx.media3.common.C.TIME_UNSET;

    public vc(com.applovin.impl.ae.a aVar, com.applovin.impl.n0 n0Var, long j) {
        this.f1425a = aVar;
        this.c = n0Var;
        this.b = j;
    }

    public long d() {
        return this.b;
    }

    public long c() {
        return this.h;
    }

    public void a(com.applovin.impl.ae.a aVar) {
        long jD = d(this.b);
        com.applovin.impl.vd vdVarA = ((com.applovin.impl.ae) com.applovin.impl.b1.a(this.d)).a(aVar, this.c, jD);
        this.f = vdVarA;
        if (this.g != null) {
            vdVarA.a(this, jD);
        }
    }

    public void i() {
        if (this.f != null) {
            ((com.applovin.impl.ae) com.applovin.impl.b1.a(this.d)).a(this.f);
        }
    }

    @Override // com.applovin.impl.vd
    public void f() {
        com.applovin.impl.vd vdVar = this.f;
        if (vdVar != null) {
            vdVar.f();
            return;
        }
        com.applovin.impl.ae aeVar = this.d;
        if (aeVar != null) {
            aeVar.b();
        }
    }

    @Override // com.applovin.impl.vd
    public long h() {
        return ((com.applovin.impl.vd) com.applovin.impl.xp.a(this.f)).h();
    }

    @Override // com.applovin.impl.vd
    public long e() {
        return ((com.applovin.impl.vd) com.applovin.impl.xp.a(this.f)).e();
    }

    @Override // com.applovin.impl.vd
    public long g() {
        return ((com.applovin.impl.vd) com.applovin.impl.xp.a(this.f)).g();
    }

    @Override // com.applovin.impl.vd
    public boolean b(long j) {
        com.applovin.impl.vd vdVar = this.f;
        return vdVar != null && vdVar.b(j);
    }

    public void e(long j) {
        this.h = j;
    }

    @Override // com.applovin.impl.vd
    public void a(long j, boolean z) {
        ((com.applovin.impl.vd) com.applovin.impl.xp.a(this.f)).a(j, z);
    }

    @Override // com.applovin.impl.vd
    public void c(long j) {
        ((com.applovin.impl.vd) com.applovin.impl.xp.a(this.f)).c(j);
    }

    private long d(long j) {
        long j2 = this.h;
        return j2 != androidx.media3.common.C.TIME_UNSET ? j2 : j;
    }

    @Override // com.applovin.impl.vd
    public com.applovin.impl.po b() {
        return ((com.applovin.impl.vd) com.applovin.impl.xp.a(this.f)).b();
    }

    @Override // com.applovin.impl.vd
    public long a(long j, com.applovin.impl.jj jjVar) {
        return ((com.applovin.impl.vd) com.applovin.impl.xp.a(this.f)).a(j, jjVar);
    }

    @Override // com.applovin.impl.pj.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(com.applovin.impl.vd vdVar) {
        ((com.applovin.impl.vd.a) com.applovin.impl.xp.a(this.g)).a((com.applovin.impl.pj) this);
    }

    @Override // com.applovin.impl.vd
    public boolean a() {
        com.applovin.impl.vd vdVar = this.f;
        return vdVar != null && vdVar.a();
    }

    @Override // com.applovin.impl.vd.a
    public void a(com.applovin.impl.vd vdVar) {
        ((com.applovin.impl.vd.a) com.applovin.impl.xp.a(this.g)).a((com.applovin.impl.vd) this);
    }

    @Override // com.applovin.impl.vd
    public void a(com.applovin.impl.vd.a aVar, long j) {
        this.g = aVar;
        com.applovin.impl.vd vdVar = this.f;
        if (vdVar != null) {
            vdVar.a(this, d(this.b));
        }
    }

    @Override // com.applovin.impl.vd
    public long a(long j) {
        return ((com.applovin.impl.vd) com.applovin.impl.xp.a(this.f)).a(j);
    }

    @Override // com.applovin.impl.vd
    public long a(com.applovin.impl.g8[] g8VarArr, boolean[] zArr, com.applovin.impl.cj[] cjVarArr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.h;
        if (j3 == androidx.media3.common.C.TIME_UNSET || j != this.b) {
            j2 = j;
        } else {
            this.h = androidx.media3.common.C.TIME_UNSET;
            j2 = j3;
        }
        return ((com.applovin.impl.vd) com.applovin.impl.xp.a(this.f)).a(g8VarArr, zArr, cjVarArr, zArr2, j2);
    }

    public void a(com.applovin.impl.ae aeVar) {
        com.applovin.impl.b1.b(this.d == null);
        this.d = aeVar;
    }
}

package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class g6 implements com.applovin.impl.fd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.bl f807a;
    private final com.applovin.impl.g6.a b;
    private com.applovin.impl.qi c;
    private com.applovin.impl.fd d;
    private boolean f = true;
    private boolean g;

    public interface a {
        void a(com.applovin.impl.ph phVar);
    }

    public g6(com.applovin.impl.g6.a aVar, com.applovin.impl.l3 l3Var) {
        this.b = aVar;
        this.f807a = new com.applovin.impl.bl(l3Var);
    }

    public void c() {
        this.g = false;
        this.f807a.c();
    }

    public void b(com.applovin.impl.qi qiVar) throws com.applovin.impl.z7 {
        com.applovin.impl.fd fdVar;
        com.applovin.impl.fd fdVarL = qiVar.l();
        if (fdVarL == null || fdVarL == (fdVar = this.d)) {
            return;
        }
        if (fdVar == null) {
            this.d = fdVarL;
            this.c = qiVar;
            fdVarL.a(this.f807a.a());
            return;
        }
        throw com.applovin.impl.z7.a(new java.lang.IllegalStateException("Multiple renderer media clocks enabled."));
    }

    @Override // com.applovin.impl.fd
    public long p() {
        if (this.f) {
            return this.f807a.p();
        }
        return ((com.applovin.impl.fd) com.applovin.impl.b1.a(this.d)).p();
    }

    @Override // com.applovin.impl.fd
    public com.applovin.impl.ph a() {
        com.applovin.impl.fd fdVar = this.d;
        if (fdVar != null) {
            return fdVar.a();
        }
        return this.f807a.a();
    }

    public void b() {
        this.g = true;
        this.f807a.b();
    }

    private void c(boolean z) {
        if (a(z)) {
            this.f = true;
            if (this.g) {
                this.f807a.b();
                return;
            }
            return;
        }
        com.applovin.impl.fd fdVar = (com.applovin.impl.fd) com.applovin.impl.b1.a(this.d);
        long jP = fdVar.p();
        if (this.f) {
            if (jP < this.f807a.p()) {
                this.f807a.c();
                return;
            } else {
                this.f = false;
                if (this.g) {
                    this.f807a.b();
                }
            }
        }
        this.f807a.a(jP);
        com.applovin.impl.ph phVarA = fdVar.a();
        if (phVarA.equals(this.f807a.a())) {
            return;
        }
        this.f807a.a(phVarA);
        this.b.a(phVarA);
    }

    public void a(com.applovin.impl.qi qiVar) {
        if (qiVar == this.c) {
            this.d = null;
            this.c = null;
            this.f = true;
        }
    }

    public long b(boolean z) {
        c(z);
        return p();
    }

    public void a(long j) {
        this.f807a.a(j);
    }

    @Override // com.applovin.impl.fd
    public void a(com.applovin.impl.ph phVar) {
        com.applovin.impl.fd fdVar = this.d;
        if (fdVar != null) {
            fdVar.a(phVar);
            phVar = this.d.a();
        }
        this.f807a.a(phVar);
    }

    private boolean a(boolean z) {
        com.applovin.impl.qi qiVar = this.c;
        return qiVar == null || qiVar.c() || (!this.c.d() && (z || this.c.j()));
    }
}

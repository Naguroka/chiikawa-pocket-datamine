package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class el implements com.applovin.impl.l8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f765a;
    private final com.applovin.impl.l8 b;

    public el(long j, com.applovin.impl.l8 l8Var) {
        this.f765a = j;
        this.b = l8Var;
    }

    @Override // com.applovin.impl.l8
    public void c() {
        this.b.c();
    }

    class a implements com.applovin.impl.ij {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.ij f766a;

        a(com.applovin.impl.ij ijVar) {
            this.f766a = ijVar;
        }

        @Override // com.applovin.impl.ij
        public long d() {
            return this.f766a.d();
        }

        @Override // com.applovin.impl.ij
        public com.applovin.impl.ij.a b(long j) {
            com.applovin.impl.ij.a aVarB = this.f766a.b(j);
            com.applovin.impl.kj kjVar = aVarB.f890a;
            com.applovin.impl.kj kjVar2 = new com.applovin.impl.kj(kjVar.f963a, kjVar.b + com.applovin.impl.el.this.f765a);
            com.applovin.impl.kj kjVar3 = aVarB.b;
            return new com.applovin.impl.ij.a(kjVar2, new com.applovin.impl.kj(kjVar3.f963a, kjVar3.b + com.applovin.impl.el.this.f765a));
        }

        @Override // com.applovin.impl.ij
        public boolean b() {
            return this.f766a.b();
        }
    }

    @Override // com.applovin.impl.l8
    public void a(com.applovin.impl.ij ijVar) {
        this.b.a(new com.applovin.impl.el.a(ijVar));
    }

    @Override // com.applovin.impl.l8
    public com.applovin.impl.qo a(int i, int i2) {
        return this.b.a(i, i2);
    }
}

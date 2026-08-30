package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class dh implements com.applovin.impl.gj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.e9 f727a;
    private com.applovin.impl.ho b;
    private com.applovin.impl.qo c;

    public dh(java.lang.String str) {
        this.f727a = new com.applovin.impl.e9.b().f(str).a();
    }

    private void a() {
        com.applovin.impl.b1.b(this.b);
        com.applovin.impl.xp.a(this.c);
    }

    @Override // com.applovin.impl.gj
    public void a(com.applovin.impl.ah ahVar) {
        a();
        long jB = this.b.b();
        long jC = this.b.c();
        if (jB == androidx.media3.common.C.TIME_UNSET || jC == androidx.media3.common.C.TIME_UNSET) {
            return;
        }
        com.applovin.impl.e9 e9Var = this.f727a;
        if (jC != e9Var.q) {
            com.applovin.impl.e9 e9VarA = e9Var.a().a(jC).a();
            this.f727a = e9VarA;
            this.c.a(e9VarA);
        }
        int iA = ahVar.a();
        this.c.a(ahVar, iA);
        this.c.a(jB, 1, iA, 0, null);
    }

    @Override // com.applovin.impl.gj
    public void a(com.applovin.impl.ho hoVar, com.applovin.impl.l8 l8Var, com.applovin.impl.dp.d dVar) {
        this.b = hoVar;
        dVar.a();
        com.applovin.impl.qo qoVarA = l8Var.a(dVar.c(), 5);
        this.c = qoVarA;
        qoVarA.a(this.f727a);
    }
}

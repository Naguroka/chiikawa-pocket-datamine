package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a2 implements com.applovin.impl.h5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f576a;
    private final java.util.ArrayList b = new java.util.ArrayList(1);
    private int c;
    private com.applovin.impl.k5 d;

    protected a2(boolean z) {
        this.f576a = z;
    }

    @Override // com.applovin.impl.h5
    public final void a(com.applovin.impl.xo xoVar) {
        com.applovin.impl.b1.a(xoVar);
        if (this.b.contains(xoVar)) {
            return;
        }
        this.b.add(xoVar);
        this.c++;
    }

    protected final void b(com.applovin.impl.k5 k5Var) {
        for (int i = 0; i < this.c; i++) {
            ((com.applovin.impl.xo) this.b.get(i)).b(this, k5Var, this.f576a);
        }
    }

    protected final void c(com.applovin.impl.k5 k5Var) {
        this.d = k5Var;
        for (int i = 0; i < this.c; i++) {
            ((com.applovin.impl.xo) this.b.get(i)).a(this, k5Var, this.f576a);
        }
    }

    protected final void d(int i) {
        com.applovin.impl.k5 k5Var = (com.applovin.impl.k5) com.applovin.impl.xp.a(this.d);
        for (int i2 = 0; i2 < this.c; i2++) {
            ((com.applovin.impl.xo) this.b.get(i2)).a(this, k5Var, this.f576a, i);
        }
    }

    protected final void g() {
        com.applovin.impl.k5 k5Var = (com.applovin.impl.k5) com.applovin.impl.xp.a(this.d);
        for (int i = 0; i < this.c; i++) {
            ((com.applovin.impl.xo) this.b.get(i)).c(this, k5Var, this.f576a);
        }
        this.d = null;
    }
}

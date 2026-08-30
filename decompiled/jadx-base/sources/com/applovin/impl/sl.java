package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class sl extends com.applovin.impl.yg implements com.applovin.impl.nl {
    private com.applovin.impl.nl d;
    private long f;

    @Override // com.applovin.impl.nl
    public long a(int i) {
        return ((com.applovin.impl.nl) com.applovin.impl.b1.a(this.d)).a(i) + this.f;
    }

    @Override // com.applovin.impl.l2
    public void b() {
        super.b();
        this.d = null;
    }

    @Override // com.applovin.impl.nl
    public int a() {
        return ((com.applovin.impl.nl) com.applovin.impl.b1.a(this.d)).a();
    }

    @Override // com.applovin.impl.nl
    public java.util.List b(long j) {
        return ((com.applovin.impl.nl) com.applovin.impl.b1.a(this.d)).b(j - this.f);
    }

    @Override // com.applovin.impl.nl
    public int a(long j) {
        return ((com.applovin.impl.nl) com.applovin.impl.b1.a(this.d)).a(j - this.f);
    }

    public void a(long j, com.applovin.impl.nl nlVar, long j2) {
        this.b = j;
        this.d = nlVar;
        if (j2 != Long.MAX_VALUE) {
            j = j2;
        }
        this.f = j;
    }
}

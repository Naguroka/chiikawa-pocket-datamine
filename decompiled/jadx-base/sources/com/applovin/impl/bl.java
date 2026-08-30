package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class bl implements com.applovin.impl.fd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.l3 f653a;
    private boolean b;
    private long c;
    private long d;
    private com.applovin.impl.ph f = com.applovin.impl.ph.d;

    public bl(com.applovin.impl.l3 l3Var) {
        this.f653a = l3Var;
    }

    public void b() {
        if (this.b) {
            return;
        }
        this.d = this.f653a.c();
        this.b = true;
    }

    public void c() {
        if (this.b) {
            a(p());
            this.b = false;
        }
    }

    @Override // com.applovin.impl.fd
    public long p() {
        long jA;
        long j = this.c;
        if (!this.b) {
            return j;
        }
        long jC = this.f653a.c() - this.d;
        com.applovin.impl.ph phVar = this.f;
        if (phVar.f1145a == 1.0f) {
            jA = com.applovin.impl.t2.a(jC);
        } else {
            jA = phVar.a(jC);
        }
        return j + jA;
    }

    @Override // com.applovin.impl.fd
    public com.applovin.impl.ph a() {
        return this.f;
    }

    public void a(long j) {
        this.c = j;
        if (this.b) {
            this.d = this.f653a.c();
        }
    }

    @Override // com.applovin.impl.fd
    public void a(com.applovin.impl.ph phVar) {
        if (this.b) {
            a(p());
        }
        this.f = phVar;
    }
}

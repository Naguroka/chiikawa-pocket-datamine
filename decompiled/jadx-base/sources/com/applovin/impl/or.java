package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class or implements com.applovin.impl.ij {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.mr f1135a;
    private final int b;
    private final long c;
    private final long d;
    private final long e;

    @Override // com.applovin.impl.ij
    public boolean b() {
        return true;
    }

    public or(com.applovin.impl.mr mrVar, int i, long j, long j2) {
        this.f1135a = mrVar;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / ((long) mrVar.e);
        this.d = j3;
        this.e = c(j3);
    }

    @Override // com.applovin.impl.ij
    public long d() {
        return this.e;
    }

    @Override // com.applovin.impl.ij
    public com.applovin.impl.ij.a b(long j) {
        long jB = com.applovin.impl.xp.b((((long) this.f1135a.c) * j) / (((long) this.b) * 1000000), 0L, this.d - 1);
        long j2 = this.c + (((long) this.f1135a.e) * jB);
        long jC = c(jB);
        com.applovin.impl.kj kjVar = new com.applovin.impl.kj(jC, j2);
        if (jC < j && jB != this.d - 1) {
            long j3 = jB + 1;
            return new com.applovin.impl.ij.a(kjVar, new com.applovin.impl.kj(c(j3), this.c + (((long) this.f1135a.e) * j3)));
        }
        return new com.applovin.impl.ij.a(kjVar);
    }

    private long c(long j) {
        return com.applovin.impl.xp.c(j * ((long) this.b), 1000000L, this.f1135a.c);
    }
}

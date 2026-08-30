package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class kl implements com.applovin.impl.nl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.a5[] f965a;
    private final long[] b;

    public kl(com.applovin.impl.a5[] a5VarArr, long[] jArr) {
        this.f965a = a5VarArr;
        this.b = jArr;
    }

    @Override // com.applovin.impl.nl
    public long a(int i) {
        com.applovin.impl.b1.a(i >= 0);
        com.applovin.impl.b1.a(i < this.b.length);
        return this.b[i];
    }

    @Override // com.applovin.impl.nl
    public java.util.List b(long j) {
        com.applovin.impl.a5 a5Var;
        int iB = com.applovin.impl.xp.b(this.b, j, true, false);
        if (iB != -1 && (a5Var = this.f965a[iB]) != com.applovin.impl.a5.s) {
            return java.util.Collections.singletonList(a5Var);
        }
        return java.util.Collections.emptyList();
    }

    @Override // com.applovin.impl.nl
    public int a() {
        return this.b.length;
    }

    @Override // com.applovin.impl.nl
    public int a(long j) {
        int iA = com.applovin.impl.xp.a(this.b, j, false, false);
        if (iA < this.b.length) {
            return iA;
        }
        return -1;
    }
}

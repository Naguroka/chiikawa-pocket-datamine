package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class y8 implements com.applovin.impl.ij {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.z8 f1534a;
    private final long b;

    @Override // com.applovin.impl.ij
    public boolean b() {
        return true;
    }

    public y8(com.applovin.impl.z8 z8Var, long j) {
        this.f1534a = z8Var;
        this.b = j;
    }

    @Override // com.applovin.impl.ij
    public long d() {
        return this.f1534a.b();
    }

    @Override // com.applovin.impl.ij
    public com.applovin.impl.ij.a b(long j) {
        com.applovin.impl.b1.b(this.f1534a.k);
        com.applovin.impl.z8 z8Var = this.f1534a;
        com.applovin.impl.z8.a aVar = z8Var.k;
        long[] jArr = aVar.f1566a;
        long[] jArr2 = aVar.b;
        int iB = com.applovin.impl.xp.b(jArr, z8Var.a(j), true, false);
        com.applovin.impl.kj kjVarA = a(iB == -1 ? 0L : jArr[iB], iB != -1 ? jArr2[iB] : 0L);
        if (kjVarA.f963a != j && iB != jArr.length - 1) {
            int i = iB + 1;
            return new com.applovin.impl.ij.a(kjVarA, a(jArr[i], jArr2[i]));
        }
        return new com.applovin.impl.ij.a(kjVarA);
    }

    private com.applovin.impl.kj a(long j, long j2) {
        return new com.applovin.impl.kj((j * 1000000) / ((long) this.f1534a.e), this.b + j2);
    }
}

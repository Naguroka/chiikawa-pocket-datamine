package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class lb implements com.applovin.impl.ij {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long[] f987a;
    private final long[] b;
    private final long c;
    private final boolean d;

    public lb(long[] jArr, long[] jArr2, long j) {
        com.applovin.impl.b1.a(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z = length > 0;
        this.d = z;
        if (z && jArr2[0] > 0) {
            int i = length + 1;
            long[] jArr3 = new long[i];
            this.f987a = jArr3;
            long[] jArr4 = new long[i];
            this.b = jArr4;
            java.lang.System.arraycopy(jArr, 0, jArr3, 1, length);
            java.lang.System.arraycopy(jArr2, 0, jArr4, 1, length);
        } else {
            this.f987a = jArr;
            this.b = jArr2;
        }
        this.c = j;
    }

    @Override // com.applovin.impl.ij
    public long d() {
        return this.c;
    }

    @Override // com.applovin.impl.ij
    public com.applovin.impl.ij.a b(long j) {
        if (!this.d) {
            return new com.applovin.impl.ij.a(com.applovin.impl.kj.c);
        }
        int iB = com.applovin.impl.xp.b(this.b, j, true, true);
        com.applovin.impl.kj kjVar = new com.applovin.impl.kj(this.b[iB], this.f987a[iB]);
        if (kjVar.f963a != j && iB != this.b.length - 1) {
            int i = iB + 1;
            return new com.applovin.impl.ij.a(kjVar, new com.applovin.impl.kj(this.b[i], this.f987a[i]));
        }
        return new com.applovin.impl.ij.a(kjVar);
    }

    @Override // com.applovin.impl.ij
    public boolean b() {
        return this.d;
    }
}

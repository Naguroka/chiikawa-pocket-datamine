package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class g3 implements com.applovin.impl.ij {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f806a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    private final long f;

    @Override // com.applovin.impl.ij
    public boolean b() {
        return true;
    }

    public java.lang.String toString() {
        return "ChunkIndex(length=" + this.f806a + ", sizes=" + java.util.Arrays.toString(this.b) + ", offsets=" + java.util.Arrays.toString(this.c) + ", timeUs=" + java.util.Arrays.toString(this.e) + ", durationsUs=" + java.util.Arrays.toString(this.d) + ")";
    }

    public g3(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.f806a = length;
        if (length > 0) {
            int i = length - 1;
            this.f = jArr2[i] + jArr3[i];
        } else {
            this.f = 0L;
        }
    }

    public int c(long j) {
        return com.applovin.impl.xp.b(this.e, j, true, true);
    }

    @Override // com.applovin.impl.ij
    public long d() {
        return this.f;
    }

    @Override // com.applovin.impl.ij
    public com.applovin.impl.ij.a b(long j) {
        int iC = c(j);
        com.applovin.impl.kj kjVar = new com.applovin.impl.kj(this.e[iC], this.c[iC]);
        if (kjVar.f963a < j && iC != this.f806a - 1) {
            int i = iC + 1;
            return new com.applovin.impl.ij.a(kjVar, new com.applovin.impl.kj(this.e[i], this.c[i]));
        }
        return new com.applovin.impl.ij.a(kjVar);
    }
}

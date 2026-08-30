package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class a6 implements com.applovin.impl.k8 {
    private final com.applovin.impl.f5 b;
    private final long c;
    private long d;
    private int f;
    private int g;
    private byte[] e = new byte[65536];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f582a = new byte[4096];

    public a6(com.applovin.impl.f5 f5Var, long j, long j2) {
        this.b = f5Var;
        this.d = j;
        this.c = j2;
    }

    @Override // com.applovin.impl.k8
    public int b(byte[] bArr, int i, int i2) throws java.io.EOFException, java.io.InterruptedIOException {
        int iMin;
        e(i2);
        int i3 = this.g;
        int i4 = this.f;
        int i5 = i3 - i4;
        if (i5 == 0) {
            iMin = a(this.e, i4, i2, 0, true);
            if (iMin == -1) {
                return -1;
            }
            this.g += iMin;
        } else {
            iMin = java.lang.Math.min(i2, i5);
        }
        java.lang.System.arraycopy(this.e, this.f, bArr, i, iMin);
        this.f += iMin;
        return iMin;
    }

    @Override // com.applovin.impl.k8
    public boolean a(int i, boolean z) throws java.io.EOFException, java.io.InterruptedIOException {
        e(i);
        int iA = this.g - this.f;
        while (iA < i) {
            iA = a(this.e, this.f, i, iA, z);
            if (iA == -1) {
                return false;
            }
            this.g = this.f + iA;
        }
        this.f += i;
        return true;
    }

    @Override // com.applovin.impl.k8
    public void c(int i) throws java.io.EOFException, java.io.InterruptedIOException {
        a(i, false);
    }

    @Override // com.applovin.impl.k8
    public long f() {
        return this.d;
    }

    private void e(int i) {
        int i2 = this.f + i;
        byte[] bArr = this.e;
        if (i2 > bArr.length) {
            this.e = java.util.Arrays.copyOf(this.e, com.applovin.impl.xp.a(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    private void g(int i) {
        int i2 = this.g - i;
        this.g = i2;
        this.f = 0;
        byte[] bArr = this.e;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        java.lang.System.arraycopy(bArr, i, bArr2, 0, i2);
        this.e = bArr2;
    }

    @Override // com.applovin.impl.k8
    public boolean b(byte[] bArr, int i, int i2, boolean z) {
        if (!a(i2, z)) {
            return false;
        }
        java.lang.System.arraycopy(this.e, this.f - i2, bArr, i, i2);
        return true;
    }

    private void d(int i) {
        if (i != -1) {
            this.d += (long) i;
        }
    }

    @Override // com.applovin.impl.k8
    public void c(byte[] bArr, int i, int i2) {
        b(bArr, i, i2, false);
    }

    @Override // com.applovin.impl.k8
    public long a() {
        return this.c;
    }

    private int f(int i) {
        int iMin = java.lang.Math.min(this.g, i);
        g(iMin);
        return iMin;
    }

    @Override // com.applovin.impl.k8, com.applovin.impl.f5
    public int a(byte[] bArr, int i, int i2) throws java.io.EOFException, java.io.InterruptedIOException {
        int iE = e(bArr, i, i2);
        if (iE == 0) {
            iE = a(bArr, i, i2, 0, true);
        }
        d(iE);
        return iE;
    }

    private int e(byte[] bArr, int i, int i2) {
        int i3 = this.g;
        if (i3 == 0) {
            return 0;
        }
        int iMin = java.lang.Math.min(i3, i2);
        java.lang.System.arraycopy(this.e, 0, bArr, i, iMin);
        g(iMin);
        return iMin;
    }

    @Override // com.applovin.impl.k8
    public void b() {
        this.f = 0;
    }

    @Override // com.applovin.impl.k8
    public long d() {
        return this.d + ((long) this.f);
    }

    @Override // com.applovin.impl.k8
    public boolean a(byte[] bArr, int i, int i2, boolean z) throws java.io.EOFException, java.io.InterruptedIOException {
        int iE = e(bArr, i, i2);
        while (iE < i2 && iE != -1) {
            iE = a(bArr, i, i2, iE, z);
        }
        d(iE);
        return iE != -1;
    }

    @Override // com.applovin.impl.k8
    public int b(int i) throws java.io.EOFException, java.io.InterruptedIOException {
        int iF = f(i);
        if (iF == 0) {
            byte[] bArr = this.f582a;
            iF = a(bArr, 0, java.lang.Math.min(i, bArr.length), 0, true);
        }
        d(iF);
        return iF;
    }

    @Override // com.applovin.impl.k8
    public void d(byte[] bArr, int i, int i2) throws java.io.EOFException, java.io.InterruptedIOException {
        a(bArr, i, i2, false);
    }

    @Override // com.applovin.impl.k8
    public void a(int i) throws java.io.EOFException, java.io.InterruptedIOException {
        b(i, false);
    }

    private int a(byte[] bArr, int i, int i2, int i3, boolean z) throws java.io.EOFException, java.io.InterruptedIOException {
        if (!java.lang.Thread.interrupted()) {
            int iA = this.b.a(bArr, i + i3, i2 - i3);
            if (iA != -1) {
                return i3 + iA;
            }
            if (i3 == 0 && z) {
                return -1;
            }
            throw new java.io.EOFException();
        }
        throw new java.io.InterruptedIOException();
    }

    public boolean b(int i, boolean z) throws java.io.EOFException, java.io.InterruptedIOException {
        int iF = f(i);
        while (iF < i && iF != -1) {
            iF = a(this.f582a, -iF, java.lang.Math.min(i, this.f582a.length + iF), iF, z);
        }
        d(iF);
        return iF != -1;
    }
}

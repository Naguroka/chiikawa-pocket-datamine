package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class j5 extends java.io.InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.h5 f907a;
    private final com.applovin.impl.k5 b;
    private long f;
    private boolean d = false;
    private boolean e = false;
    private final byte[] c = new byte[1];

    public j5(com.applovin.impl.h5 h5Var, com.applovin.impl.k5 k5Var) {
        this.f907a = h5Var;
        this.b = k5Var;
    }

    @Override // java.io.InputStream
    public int read() {
        if (read(this.c) == -1) {
            return -1;
        }
        return this.c[0] & 255;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.e) {
            return;
        }
        this.f907a.close();
        this.e = true;
    }

    private void a() {
        if (this.d) {
            return;
        }
        this.f907a.a(this.b);
        this.d = true;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        com.applovin.impl.b1.b(!this.e);
        a();
        int iA = this.f907a.a(bArr, i, i2);
        if (iA == -1) {
            return -1;
        }
        this.f += (long) iA;
        return iA;
    }
}

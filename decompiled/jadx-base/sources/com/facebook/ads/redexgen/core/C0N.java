package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0N, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0N extends java.io.BufferedInputStream {
    public static java.lang.String[] A03 = {"yEbyHje8NcUxSO9Vq0KCjHXZXQexIrx8", "", "YDpf0JUXXv3vM7KYNqlKfCs4JIrQ9MgF", "YsWjcpRBLEj4Ul19eLlIoi2JTVU6PmF7", "RrIU59JghBJEpeymJLqkoB6uIS3R1kvl", "KslpVvwdI", "eBV46u0KGpW8gKNBF9SaAmjhVwB3niU2", "QySyK0NFyvlSgnCLWPpjCoJkkP0WQU4e"};
    public int A00;
    public int A01;
    public boolean A02;

    public C0N(java.io.InputStream inputStream) {
        super(inputStream);
        this.A00 = Integer.MAX_VALUE;
    }

    public final boolean A00() {
        return this.A02;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        this.A00 = i;
        super.mark(i);
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read() throws java.io.IOException {
        if (this.A01 + 1 > this.A00) {
            this.A02 = true;
            return -1;
        }
        int i = this.A01 + 1;
        java.lang.String[] strArr = A03;
        if (strArr[4].charAt(24) == strArr[0].charAt(24)) {
            throw new java.lang.RuntimeException();
        }
        A03[1] = "Q3BDu8k6tWq8iYS9U8U";
        this.A01 = i;
        return super.read();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws java.io.IOException {
        if (this.A01 + bArr.length > this.A00) {
            this.A02 = true;
            return -1;
        }
        return super.read(bArr);
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (this.A01 + i2 > this.A00) {
            this.A02 = true;
            return -1;
        }
        int i3 = super.read(bArr, i, i2);
        int read = this.A01;
        this.A01 = read + i3;
        return i3;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() throws java.io.IOException {
        this.A00 = Integer.MAX_VALUE;
        super.reset();
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j) throws java.io.IOException {
        if (((long) this.A01) + j > this.A00) {
            this.A02 = true;
            return 0L;
        }
        this.A01 = (int) (((long) this.A01) + j);
        return super.skip(j);
    }
}

package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0930Pf extends java.io.InputStream {
    public static java.lang.String[] A07 = {"B8lxMUavHKfoRp1ohdiOuIMzoadcXLBz", "taDtiJzBvL", "1gxctnmp", "xW0DP8NMjWRKl", "7bIhL0zS", "nSBO3UXQ6VW4x", "omPJR1lrO3rz1FXfY5MEGpCyJVEjNQz7", "CC4tEEDcP37TF"};
    public int A00;
    public long A01;
    public com.facebook.ads.redexgen.core.InterfaceC0724Gz A02;
    public final android.net.Uri A03;
    public final com.facebook.ads.redexgen.core.C1198Zr A04;
    public final com.facebook.ads.redexgen.core.InterfaceC0723Gy A05;
    public final java.lang.String A06;

    public C0930Pf(com.facebook.ads.redexgen.core.C1198Zr c1198Zr, android.net.Uri uri, com.facebook.ads.redexgen.core.InterfaceC0723Gy interfaceC0723Gy) throws java.io.IOException {
        this.A04 = c1198Zr;
        this.A05 = interfaceC0723Gy;
        this.A03 = uri;
        this.A06 = com.facebook.ads.redexgen.core.RW.A08(this.A04, this.A03);
        A00(0);
    }

    private void A00(int i) throws java.io.IOException {
        if (this.A02 != null) {
            this.A02.close();
        }
        this.A02 = this.A05.A4t();
        this.A01 = (int) this.A02.AEE(new com.facebook.ads.redexgen.core.H3(this.A03, i, -1L, this.A06));
    }

    @Override // java.io.InputStream
    public final int available() {
        return ((int) this.A01) - this.A00;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        this.A02.close();
    }

    @Override // java.io.InputStream
    public final int read() throws java.io.IOException {
        byte[] b = new byte[1];
        return read(b);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = this.A02.read(bArr, i, i2);
        int read = this.A00;
        this.A00 = read + i3;
        return i3;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws java.io.IOException {
        long j2 = this.A01 - ((long) this.A00);
        if (j2 <= 0) {
            return 0L;
        }
        if (j > j2) {
            j = j2;
        }
        this.A00 = (int) (((long) this.A00) + j);
        A00(this.A00);
        if (A07[0].charAt(28) != 'X') {
            throw new java.lang.RuntimeException();
        }
        A07[1] = "2";
        return j;
    }
}

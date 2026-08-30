package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ph, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0932Ph extends java.io.InputStream {
    public static byte[] A04;
    public java.security.MessageDigest A00;
    public final com.facebook.ads.redexgen.core.C1198Zr A01;
    public final com.facebook.ads.redexgen.core.InterfaceC0931Pg A02;
    public final java.io.FileInputStream A03;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 43);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-52, -61, -76, -23, -8, -15};
    }

    public C0932Ph(com.facebook.ads.redexgen.core.C1198Zr c1198Zr, java.io.FileInputStream fileInputStream, com.facebook.ads.redexgen.core.InterfaceC0931Pg interfaceC0931Pg) {
        this.A03 = fileInputStream;
        this.A02 = interfaceC0931Pg;
        this.A01 = c1198Zr;
        try {
            this.A00 = java.security.MessageDigest.getInstance(A00(0, 3, 84));
        } catch (java.security.NoSuchAlgorithmException unused) {
            this.A00 = null;
        }
    }

    @Override // java.io.InputStream
    public final int available() throws java.io.IOException {
        return this.A03.available();
    }

    @Override // java.io.InputStream
    public final int read() throws java.io.IOException {
        byte[] b = new byte[1];
        return read(b);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = this.A03.read(bArr, i, i2);
        if (this.A00 != null) {
            try {
                if (i3 > 0) {
                    this.A00.update(bArr, i, i3);
                } else if (i3 == -1) {
                    this.A02.A92(com.facebook.ads.redexgen.core.LS.A05(this.A00.digest()));
                    this.A00 = null;
                }
            } catch (java.lang.Exception e) {
                this.A00 = null;
                this.A01.A07().AAS(A00(3, 3, 90), com.facebook.ads.redexgen.core.C8E.A13, new com.facebook.ads.redexgen.core.C8F(e));
            }
        }
        return i3;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws java.io.IOException {
        int actuallyRead = (int) j;
        byte[] bArr = new byte[1024];
        long j2 = 0;
        while (actuallyRead > 0) {
            int bytesToRead = read(bArr, 0, java.lang.Math.min(actuallyRead, 1024));
            if (bytesToRead <= 0) {
                break;
            }
            actuallyRead -= bytesToRead;
            j2 += (long) bytesToRead;
        }
        return j2;
    }
}

package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class XA implements com.facebook.ads.redexgen.core.InterfaceC0724Gz {
    public static byte[] A06;
    public static java.lang.String[] A07 = {"dBAoZLypinVieBiN6OmOrWglm0mkw7Th", com.json.zb.q, "cmJJD6tZYhQ1wcbsHE5vIxhw0qQZwo02", "X8ZVpNsLQVQ2kLhXMp5QNPazaYxfqolh", "NaudB7RRuuobxIxQA39JuxlozKEnLkCL", "rXbUFyh56idg3rSuJ4tJQtpYdGaFTF2y", "zDvFriMjZpoGqxlueWcDzXzIguNkUtNl", "sVEOjn8EJonDcZfN7QRvAJKGT0zqZa3R"};
    public long A00;
    public android.net.Uri A01;
    public java.io.InputStream A02;
    public boolean A03;
    public final android.content.res.AssetManager A04;
    public final com.facebook.ads.redexgen.core.HL<? super com.facebook.ads.redexgen.core.XA> A05;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            int i5 = (bArrCopyOfRange[i4] ^ i3) ^ 101;
            if (A07[1].length() != 1) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A07;
            strArr[0] = "n6owUrHV0UlTalMNOYWSyyNAru5hM8Vx";
            strArr[7] = "gByYkjtEEdTZs51Nu13z1IN8evpdXlXB";
            bArrCopyOfRange[i4] = (byte) i5;
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        byte[] bArr = {106, 90, 20, 27, 17, 7, 26, 28, 17, 42, 20, 6, 6, 16, 1, 90};
        if (A07[6].charAt(24) != 'g') {
            throw new java.lang.RuntimeException();
        }
        A07[4] = "9ywXzXhCM32rn3RSs826HxV6thYomWUI";
        A06 = bArr;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC0724Gz
    public final long AEE(com.facebook.ads.redexgen.core.H3 h3) throws com.facebook.ads.redexgen.core.C0717Gs {
        try {
            this.A01 = h3.A04;
            java.lang.String path = this.A01.getPath();
            if (path.startsWith(A00(1, 15, 16))) {
                path = path.substring(15);
            } else if (path.startsWith(A00(0, 1, 32))) {
                path = path.substring(1);
            }
            this.A02 = this.A04.open(path, 1);
            if (this.A02.skip(h3.A03) < h3.A03) {
                throw new java.io.EOFException();
            }
            if (h3.A02 != -1) {
                this.A00 = h3.A02;
            } else {
                this.A00 = this.A02.available();
                if (this.A00 == 2147483647L) {
                    this.A00 = -1L;
                }
            }
            this.A03 = true;
            if (this.A05 != null) {
                this.A05.ADs(this, h3);
            }
            return this.A00;
        } catch (java.io.IOException e) {
            throw new com.facebook.ads.redexgen.core.C0717Gs(e);
        }
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HL != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.AssetDataSource> */
    public XA(android.content.Context context, com.facebook.ads.redexgen.core.HL<? super com.facebook.ads.redexgen.core.XA> hl) {
        this.A04 = context.getAssets();
        this.A05 = hl;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0724Gz
    public final android.net.Uri A8c() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0724Gz
    public final void close() throws com.facebook.ads.redexgen.core.C0717Gs {
        this.A01 = null;
        try {
            try {
                if (this.A02 != null) {
                    this.A02.close();
                }
                this.A02 = null;
                if (this.A03) {
                    this.A03 = false;
                    if (this.A05 != null) {
                        this.A05.ADr(this);
                    }
                }
            } catch (java.io.IOException e) {
                throw new com.facebook.ads.redexgen.core.C0717Gs(e);
            }
        } catch (java.lang.Throwable th) {
            this.A02 = null;
            if (this.A03) {
                this.A03 = false;
                if (this.A05 != null) {
                    this.A05.ADr(this);
                }
            }
            throw th;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0724Gz
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (i2 == 0) {
            return 0;
        }
        if (this.A00 == 0) {
            return -1;
        }
        try {
            if (this.A00 != -1) {
                i2 = (int) java.lang.Math.min(this.A00, i2);
            }
            int i3 = this.A02.read(bArr, i, i2);
            if (i3 == -1) {
                if (this.A00 == -1) {
                    return -1;
                }
                throw new com.facebook.ads.redexgen.core.C0717Gs(new java.io.EOFException());
            }
            if (this.A00 != -1) {
                this.A00 -= (long) i3;
            }
            if (this.A05 != null) {
                this.A05.ABS(this, i3);
            }
            return i3;
        } catch (java.io.IOException e) {
            throw new com.facebook.ads.redexgen.core.C0717Gs(e);
        }
    }
}

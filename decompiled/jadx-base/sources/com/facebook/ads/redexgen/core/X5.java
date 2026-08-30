package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class X5 implements com.facebook.ads.redexgen.core.InterfaceC0724Gz {
    public static byte[] A0A;
    public com.facebook.ads.redexgen.core.InterfaceC0724Gz A00;
    public com.facebook.ads.redexgen.core.InterfaceC0724Gz A01;
    public com.facebook.ads.redexgen.core.InterfaceC0724Gz A02;
    public com.facebook.ads.redexgen.core.InterfaceC0724Gz A03;
    public com.facebook.ads.redexgen.core.InterfaceC0724Gz A04;
    public com.facebook.ads.redexgen.core.InterfaceC0724Gz A05;
    public com.facebook.ads.redexgen.core.InterfaceC0724Gz A06;
    public final android.content.Context A07;
    public final com.facebook.ads.redexgen.core.InterfaceC0724Gz A08;
    public final com.facebook.ads.redexgen.core.HL<? super com.facebook.ads.redexgen.core.InterfaceC0724Gz> A09;

    static {
        A07();
    }

    public static java.lang.String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 78);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A07() {
        A0A = new byte[]{-105, -55, -42, -52, -38, -41, -47, -52, -57, -55, -37, -37, -51, -36, -105, 1, 52, 52, 37, 45, 48, 52, 41, 46, 39, -32, 52, 47, -32, 48, 44, 33, 57, -32, 18, 20, 13, 16, -32, 51, 52, 50, 37, 33, 45, -32, 55, 41, 52, 40, 47, 53, 52, -32, 36, 37, 48, 37, 46, 36, 41, 46, 39, -32, 47, 46, -32, 52, 40, 37, -32, 18, 20, 13, 16, -32, 37, 56, 52, 37, 46, 51, 41, 47, 46, -54, -21, -20, -25, -5, -14, -6, -54, -25, -6, -25, -39, -11, -5, -8, -23, -21, -73, -28, -28, -31, -28, -110, -37, -32, -27, -26, -45, -32, -26, -37, -45, -26, -37, -32, -39, -110, -60, -58, -65, -62, -110, -41, -22, -26, -41, -32, -27, -37, -31, -32, -14, 4, 4, -10, 5, -15, -3, -5, -68, -12, -17, -15, -13, -16, -3, -3, -7, -68, -17, -14, 1, -68, -9, -4, 2, -13, 0, -4, -17, -6, -68, -13, 6, -3, -2, -6, -17, 7, -13, 0, -64, -68, -13, 6, 2, -68, 0, 2, -5, -2, -68, -32, 2, -5, -2, -46, -17, 2, -17, -31, -3, 3, 0, -15, -13, -75, -63, -64, -58, -73, -64, -58, -52, -55, -36, -55, 52, 35, 57, 52, 39, 53, 49, 55, 52, 37, 39, -36, -34, -41, -38};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HL != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.DataSource> */
    public X5(android.content.Context context, com.facebook.ads.redexgen.core.HL<? super com.facebook.ads.redexgen.core.InterfaceC0724Gz> hl, com.facebook.ads.redexgen.core.InterfaceC0724Gz interfaceC0724Gz) {
        this.A07 = context.getApplicationContext();
        this.A09 = hl;
        this.A08 = (com.facebook.ads.redexgen.core.InterfaceC0724Gz) com.facebook.ads.redexgen.core.AbstractC0730Hf.A01(interfaceC0724Gz);
    }

    private com.facebook.ads.redexgen.core.InterfaceC0724Gz A00() {
        if (this.A00 == null) {
            this.A00 = new com.facebook.ads.redexgen.core.XA(this.A07, this.A09);
        }
        return this.A00;
    }

    private com.facebook.ads.redexgen.core.InterfaceC0724Gz A01() {
        if (this.A01 == null) {
            this.A01 = new com.facebook.ads.redexgen.core.X9(this.A07, this.A09);
        }
        return this.A01;
    }

    private com.facebook.ads.redexgen.core.InterfaceC0724Gz A02() {
        if (this.A02 == null) {
            this.A02 = new com.facebook.ads.redexgen.core.X8();
        }
        return this.A02;
    }

    private com.facebook.ads.redexgen.core.InterfaceC0724Gz A03() {
        if (this.A04 == null) {
            this.A04 = new com.facebook.ads.redexgen.core.X1(this.A09);
        }
        return this.A04;
    }

    private com.facebook.ads.redexgen.core.InterfaceC0724Gz A04() {
        if (this.A05 == null) {
            this.A05 = new com.facebook.ads.redexgen.core.C1125Wt(this.A07, this.A09);
        }
        return this.A05;
    }

    private com.facebook.ads.redexgen.core.InterfaceC0724Gz A05() throws java.lang.Exception {
        if (this.A06 == null) {
            try {
                this.A06 = (com.facebook.ads.redexgen.core.InterfaceC0724Gz) java.lang.Class.forName(A06(141, 60, 64)).getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
            } catch (java.lang.ClassNotFoundException unused) {
                android.util.Log.w(A06(85, 17, 56), A06(15, 70, 114));
            } catch (java.lang.Exception e) {
                throw new java.lang.RuntimeException(A06(102, 34, 36), e);
            }
            if (this.A06 == null) {
                this.A06 = this.A08;
            }
        }
        return this.A06;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0724Gz
    public final android.net.Uri A8c() {
        if (this.A03 == null) {
            return null;
        }
        return this.A03.A8c();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0724Gz
    public final long AEE(com.facebook.ads.redexgen.core.H3 h3) throws java.io.IOException {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(this.A03 == null);
        java.lang.String scheme = h3.A04.getScheme();
        if (com.facebook.ads.redexgen.core.IK.A0e(h3.A04)) {
            java.lang.String path = h3.A04.getPath();
            java.lang.String scheme2 = A06(0, 15, 26);
            if (path.startsWith(scheme2)) {
                this.A03 = A00();
            } else {
                this.A03 = A03();
            }
        } else {
            java.lang.String scheme3 = A06(136, 5, 67);
            if (scheme3.equals(scheme)) {
                this.A03 = A00();
            } else {
                java.lang.String scheme4 = A06(com.ironsource.g3.c.b.b, 7, 4);
                if (scheme4.equals(scheme)) {
                    this.A03 = A01();
                } else {
                    java.lang.String scheme5 = A06(223, 4, 28);
                    if (scheme5.equals(scheme)) {
                        this.A03 = A05();
                    } else {
                        java.lang.String scheme6 = A06(208, 4, 26);
                        if (scheme6.equals(scheme)) {
                            this.A03 = A02();
                        } else {
                            java.lang.String scheme7 = A06(212, 11, 116);
                            if (scheme7.equals(scheme)) {
                                this.A03 = A04();
                            } else {
                                this.A03 = this.A08;
                            }
                        }
                    }
                }
            }
        }
        return this.A03.AEE(h3);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0724Gz
    public final void close() throws java.io.IOException {
        if (this.A03 != null) {
            try {
                this.A03.close();
            } finally {
                this.A03 = null;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0724Gz
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        return this.A03.read(bArr, i, i2);
    }
}

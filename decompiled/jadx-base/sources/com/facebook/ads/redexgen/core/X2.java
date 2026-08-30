package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class X2 implements com.facebook.ads.redexgen.core.InterfaceC0724Gz {
    public static byte[] A00;
    public static final com.facebook.ads.redexgen.core.InterfaceC0723Gy A01;
    public static final com.facebook.ads.redexgen.core.X2 A02;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 65);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{95, 110, 118, 118, 98, 59, 104, 116, 110, 105, 120, 126};
    }

    static {
        A01();
        A02 = new com.facebook.ads.redexgen.core.X2();
        A01 = new com.facebook.ads.redexgen.core.X3();
    }

    public X2() {
    }

    public /* synthetic */ X2(com.facebook.ads.redexgen.core.X3 x3) {
        this();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0724Gz
    public final android.net.Uri A8c() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0724Gz
    public final long AEE(com.facebook.ads.redexgen.core.H3 h3) throws java.io.IOException {
        throw new java.io.IOException(A00(0, 12, 90));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0724Gz
    public final void close() throws java.io.IOException {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0724Gz
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        throw new java.lang.UnsupportedOperationException();
    }
}

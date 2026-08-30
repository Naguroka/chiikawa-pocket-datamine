package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class KT implements com.facebook.ads.redexgen.core.InterfaceC0992Rp {
    public static byte[] A04;
    public int A00;
    public java.lang.String A01;
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> A02;
    public byte[] A03;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 124);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{72, 99, 114, 113, 105, 116, 109, 38, 99, 116, 116, 105, 116};
    }

    public KT(java.net.HttpURLConnection httpURLConnection, byte[] bArr) {
        try {
            this.A00 = httpURLConnection.getResponseCode();
            this.A01 = httpURLConnection.getURL().toString();
        } catch (java.io.IOException e) {
            android.util.Log.e(getClass().getSimpleName(), A00(0, 13, 122), e);
        }
        this.A02 = httpURLConnection.getHeaderFields();
        this.A03 = bArr;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0992Rp
    public final byte[] A6W() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0992Rp
    public final java.lang.String A6X() {
        if (this.A03 != null) {
            return new java.lang.String(this.A03);
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0992Rp
    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> A7X() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0992Rp
    public final int A8R() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0992Rp
    public final java.lang.String getUrl() {
        return this.A01;
    }
}

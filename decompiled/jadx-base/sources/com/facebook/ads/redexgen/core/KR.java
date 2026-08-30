package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class KR implements com.facebook.ads.redexgen.core.S6 {
    public static byte[] A01;
    public final boolean A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 126);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{75, 14, 48, 28, 29, 7, 22, 29, 7, 73, 83, 42, 29, 27, 29, 17, 14, 29, 88, 13, 10, 20, 66, 88, 30, 57, 44, 57, 56, 62, 119, 109};
    }

    public KR(boolean z) {
        this.A00 = z;
    }

    private void A02(java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
        if (map != null) {
            for (java.lang.String str : map.keySet()) {
                for (java.lang.String header : map.get(str)) {
                    java.lang.String str2 = str + A00(1, 1, 74) + header;
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.S6
    public final boolean A9X() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.S6
    public final void AAO(java.net.HttpURLConnection httpURLConnection, java.lang.Object obj) throws java.io.IOException {
        java.lang.String str = httpURLConnection.getRequestMethod() + A00(0, 1, 21) + httpURLConnection.getURL().toString();
        if (obj instanceof java.lang.String) {
            java.lang.String str2 = A00(2, 9, 13) + ((java.lang.String) obj);
        }
        A02(httpURLConnection.getRequestProperties());
    }

    @Override // com.facebook.ads.redexgen.core.S6
    public final void AAP(com.facebook.ads.redexgen.core.InterfaceC0992Rp interfaceC0992Rp) {
        if (interfaceC0992Rp != null) {
            java.lang.String str = A00(11, 13, 6) + interfaceC0992Rp.getUrl();
            java.lang.String str2 = A00(24, 8, 51) + interfaceC0992Rp.A8R();
            A02(interfaceC0992Rp.A7X());
        }
    }
}

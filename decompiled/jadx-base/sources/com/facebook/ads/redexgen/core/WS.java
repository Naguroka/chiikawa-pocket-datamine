package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class WS implements com.facebook.ads.redexgen.core.InterfaceC0994Rr {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"tUJYxHq8rXjSvzNkaZErPg", "Hl6JSJOVoKK9bKT5jd2Pvq0tZsDPJ0dE", "oSGC6AFXBpr4lbJyv6MQNQ9waO2ute48", "z7WBfzJJ407mMZZPgmkMQfCriHOQCxec", "E0947yqUj", "IMqeF", "h4IMHr5Sq", "nmzUvfQCAff3ThOCongsk2"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.C7j A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 70);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-104, -74, -61, 124, -55, 117, -71, -66, -56, -59, -74, -55, -72, -67, 117, -72, -60, -54, -61, -55, -70, -57, -56, -125, 4, 41, 51, 48, 33, 52, 35, 40, 37, 36, -32, 35, 47, 53, 46, 52, 37, 50, 51, -18, -32, 18, 37, 51, 48, 47, 46, 51, 37, -6, -32};
    }

    static {
        A01();
    }

    public WS(com.facebook.ads.redexgen.core.C7j c7j) {
        this.A00 = c7j;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0994Rr
    public final void ABa(com.facebook.ads.redexgen.core.InterfaceC0992Rp interfaceC0992Rp) {
        if (this.A00.A04().A9O() && interfaceC0992Rp != null) {
            java.lang.String str = A00(24, 31, 122) + interfaceC0992Rp.A6X();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0994Rr
    public final void ABt(java.lang.Exception exc) {
        if (this.A00.A04().A9O()) {
            java.lang.String str = com.facebook.ads.redexgen.core.JI.A01;
            java.lang.String strA00 = A00(0, 24, 15);
            java.lang.String[] strArr = A02;
            if (strArr[0].length() != strArr[7].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A02;
            strArr2[1] = "IahxZOLaTB1sAAwpoanyBYHnO0M02siA";
            strArr2[3] = "J682L6mt58ljZzHK0luG4OOmc7ySlZqX";
            android.util.Log.e(str, strA00, exc);
        }
    }
}

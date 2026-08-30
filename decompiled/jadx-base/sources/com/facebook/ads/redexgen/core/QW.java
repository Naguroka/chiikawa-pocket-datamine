package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class QW {
    public static byte[] A09;
    public static java.lang.String[] A0A = {"4QAeMuK9yCc4xE434", "vsUO926M2mRMCBHvkZDLDSVJZasjRX8H", "m75JG3kyGBA9Pa8Q", "BsXoGLiaQGDi3KDXWPANO86ZRypkU3", "NEfK90sKL", "NA5kCdAu0CbcY72yECaBPvDnC3FLldwL", "T76ZrsNa0P6C1lpNf7S0Tx3scEBkBq8W", "cxX21NDQKlhKMPjA26xNh3AVlSUU32"};
    public java.lang.String A00;
    public java.lang.String A01;
    public final com.facebook.ads.redexgen.core.C7j A02;
    public final com.facebook.ads.redexgen.core.J7 A03;
    public final com.facebook.ads.redexgen.core.JF A04;
    public final com.facebook.ads.redexgen.core.QV A05;
    public final java.lang.String A06;
    public final java.util.Map<java.lang.String, java.lang.String> A07;
    public final boolean A08;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 88);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A04() {
        A09 = new byte[]{88, 79, 78, 78, 85, 84, 101, 89, 86, 83, 89, 81, 93, 74, 75, 75, 80, 81, 96, 81, 94, 82, 90, 8, 3, 9, 50, 14, 12, 31, 9, 50, 30, 5, 2, 26, 50, 24, 29, 19, 0, 19, 24, 2, 41, 19, 14, 2, 4, 23, 33, 50, 33, 42, 48, 27, 48, kotlin.io.encoding.Base64.padSymbol, 52, 33, 78, 72, 68, 76, 118, 69, 70, 72, 77, 81, 88, 75, 88, 81, 98, 94, 82, 80, 77, 81, 88, 73, 88, 98, 107, 120, 107, 98, 81, 96, 111, 99, 107, 104, 38};
    }

    static {
        A04();
    }

    public QW(com.facebook.ads.redexgen.core.C7j c7j, com.facebook.ads.redexgen.core.QV qv, com.facebook.ads.redexgen.core.J7 j7, java.util.Map<java.lang.String, java.lang.String> metricsData, java.lang.String str) {
        this.A02 = c7j;
        this.A05 = qv;
        this.A03 = j7;
        this.A07 = metricsData;
        this.A06 = str;
        this.A04 = new com.facebook.ads.redexgen.core.JF(this.A06, this.A03);
        this.A08 = com.facebook.ads.redexgen.core.C0762Im.A25(qv.getContext());
    }

    private void A01() {
        java.util.HashMap map = new java.util.HashMap();
        map.put(A00(50, 10, 28), A00(60, 9, 113));
        A07(map);
    }

    private void A02() {
        this.A04.A04(com.facebook.ads.redexgen.core.JE.A0b, null);
    }

    private void A03() {
        java.util.HashMap map = new java.util.HashMap();
        map.put(A00(50, 10, 28), A00(23, 16, 53));
        A07(map);
    }

    private void A05(java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        map.put(A00(83, 10, 86), java.lang.String.valueOf(str));
        java.util.HashMap map2 = new java.util.HashMap();
        map2.put(A00(50, 10, 28), A00(69, 14, 101));
        map2.put(A00(39, 11, 46), com.facebook.ads.redexgen.core.LV.A01(map));
        A07(map2);
    }

    private void A06(java.lang.String str, float f, float f2) {
        java.util.HashMap map = new java.util.HashMap();
        map.put(A00(12, 11, 103), str);
        map.put(A00(93, 1, 72), java.lang.String.valueOf(f));
        map.put(A00(94, 1, 7), java.lang.String.valueOf(f2));
        java.util.HashMap map2 = new java.util.HashMap();
        map2.put(A00(50, 10, 28), A00(0, 12, 98));
        map2.put(A00(39, 11, 46), com.facebook.ads.redexgen.core.LV.A01(map));
        A07(map2);
    }

    private void A07(java.util.Map<java.lang.String, java.lang.String> data) {
        if (android.text.TextUtils.isEmpty(this.A06)) {
            return;
        }
        data.putAll(this.A07);
        data.putAll(com.facebook.ads.redexgen.core.QX.A01(this.A02, this.A00, this.A01));
        this.A03.AAM(this.A06, data);
    }

    @android.webkit.JavascriptInterface
    public void initializeLogging(java.lang.String str, java.lang.String str2) {
        if (!this.A08) {
            return;
        }
        this.A00 = str;
        if (A0A[4].length() == 10) {
            throw new java.lang.RuntimeException();
        }
        A0A[1] = "4HHX0Lv3voylt1VaUhFjcSRGfPCuBfwt";
        this.A01 = str2;
    }

    @android.webkit.JavascriptInterface
    public void logButtonClick(java.lang.String str, float f, float f2) {
        if (!this.A08) {
            return;
        }
        A06(str, f, f2);
    }

    @android.webkit.JavascriptInterface
    public void logEndCardShowUp() {
        if (!this.A08) {
            return;
        }
        A03();
    }

    @android.webkit.JavascriptInterface
    public void logGameLoad() {
        if (!this.A08) {
            return;
        }
        A01();
    }

    @android.webkit.JavascriptInterface
    public void logLevelComplete(java.lang.String str) {
        if (!this.A08) {
            return;
        }
        A05(str);
    }

    @android.webkit.JavascriptInterface
    public void onCTAClick() {
        A02();
        this.A05.A0A();
    }
}

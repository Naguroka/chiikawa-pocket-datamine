package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.a6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1213a6 {
    public static byte[] A02;
    public static java.lang.String[] A03 = {"lJVeP2IR7ua2", "jEDUnDrnc1QBGJRRXgI1zLNGeQAVlRB5", "4J1evWwVBwsv6j2jE3cxdE8l4EvJqUWx", "hbOpPbm2Lvz8WBi4M4lcAmyYP20RrxkZ", "42MJRsHMkke9vUn", "N1ePHibZvm11p1YoQp9n3cvTSohhnC86", "pzMHmXStxFGPpObuVYX1kVlrzXN", "JuJmyZjKd3poC4Sz8wRazc2gW2"};
    public static final java.lang.String A04;
    public final com.facebook.ads.redexgen.core.AnonymousClass69 A00;
    public final com.facebook.ads.redexgen.core.C04766f A01;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 45);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{81, 115, 100, 109, 110, 96, 101, 104, 111, 102, 33, 36, 101, 33, 96, 114, 114, 100, 117, 114, 60, 30, 9, 0, 3, 13, 8, 5, 2, 11, 76, 5, 1, 13, 11, 9, 86, 76, 73, 31, 118, 84, 67, 74, 73, 71, 66, 79, 72, 65, 6, 75, 71, 84, 77, 83, 86, 28, 6, 3, 85, 86, 116, 99, 106, 105, 103, 98, 111, 104, 97, 38, 112, 111, 98, 99, 105, 60, 38, 35, 117, 50, 101, 48, 48, 96, 97, 98, 98, 123, 52, 110, 101, 100, 123, 103, 103, 51, 111, 123, 55, 100, 55, 101, 123, 100, 55, 100, 55, 51, 100, 50, 52, 53, 53, 51, 98, 55, 53, 34, 33, 34, 51, 36, 47, 106, 113, 116, 113, 112, 104, 113};
    }

    static {
        A02();
        A04 = com.facebook.ads.redexgen.core.C1213a6.class.getSimpleName();
    }

    public C1213a6(com.facebook.ads.redexgen.core.AnonymousClass69 anonymousClass69, com.facebook.ads.redexgen.core.C1198Zr c1198Zr) {
        this.A00 = anonymousClass69;
        this.A00.A3l(new com.facebook.ads.redexgen.core.C1215a8(this));
        this.A01 = new com.facebook.ads.redexgen.core.C04766f(c1198Zr);
        A01();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A01() {
        if (com.facebook.ads.internal.api.BuildConfigApi.isDebug()) {
            java.util.Locale locale = java.util.Locale.US;
            com.facebook.ads.redexgen.core.AnonymousClass69 anonymousClass69 = this.A00;
            if (A03[2].charAt(7) != 'V') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A03;
            strArr[7] = "B9WAOcp3zNbG4sQr12bKZPkRro";
            strArr[6] = "6ENVq9NVFWRAnG6rhAVuoXedHs5";
            java.lang.String.format(locale, A00(0, 20, 44), java.lang.Integer.valueOf(anonymousClass69.A6Q().size()));
        }
        for (com.facebook.ads.redexgen.core.C6C c6c : this.A00.A6Q()) {
            switch (com.facebook.ads.redexgen.core.AnonymousClass68.A00[c6c.A8b().ordinal()]) {
                case 1:
                    A04(c6c.getUrl());
                    break;
                case 2:
                    A06(c6c.getUrl());
                    break;
                case 3:
                    A05(c6c.getUrl());
                    break;
            }
        }
        this.A01.A0W(new com.facebook.ads.redexgen.core.C1214a7(this), new com.facebook.ads.redexgen.core.C6Y(A00(81, 36, 123), A00(125, 7, 50)));
    }

    private void A04(java.lang.String str) {
        if (com.facebook.ads.internal.api.BuildConfigApi.isDebug()) {
            java.lang.String.format(java.util.Locale.US, A00(20, 20, 65), str);
        }
        com.facebook.ads.redexgen.core.C04746d c04746d = new com.facebook.ads.redexgen.core.C04746d(str, -1, -1, A00(81, 36, 123), A00(125, 7, 50));
        c04746d.A01 = A00(117, 8, 106);
        this.A01.A0b(c04746d);
    }

    private void A05(java.lang.String str) {
        if (com.facebook.ads.internal.api.BuildConfigApi.isDebug()) {
            java.lang.String.format(java.util.Locale.US, A00(40, 21, 11), str);
        }
        com.facebook.ads.redexgen.core.C04726b c04726b = new com.facebook.ads.redexgen.core.C04726b(str, A00(81, 36, 123), A00(125, 7, 50));
        c04726b.A04 = true;
        c04726b.A02 = A00(117, 8, 106);
        this.A01.A0X(c04726b);
    }

    private void A06(java.lang.String str) {
        if (com.facebook.ads.internal.api.BuildConfigApi.isDebug()) {
            java.lang.String.format(java.util.Locale.US, A00(61, 20, 43), str);
        }
        com.facebook.ads.redexgen.core.C04726b c04726b = new com.facebook.ads.redexgen.core.C04726b(str, A00(81, 36, 123), A00(125, 7, 50));
        c04726b.A04 = false;
        c04726b.A02 = A00(117, 8, 106);
        this.A01.A0a(c04726b);
    }
}

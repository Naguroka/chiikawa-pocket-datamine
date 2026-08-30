package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class Y8 implements com.facebook.ads.redexgen.core.D3 {
    public static byte[] A06;
    public static java.lang.String[] A07 = {"zUGrZ70EHgg4g8jXzpavLDW1HDXUjcvk", "XSRjUF9sTEDdiXUxwO45u1DbSW314W2J", "nLsxxxsHKOcuDjVroXgLpQGJx0KxE44c", "bndBw", "3JgXmgjTjEsbQfCoCUHiRi58jKtnVEg9", "AlsRl", "ykJWFh5Q95Nl6YL21erwEseKjv08tJJZ", "ViwjESz0dBuyLmVYZ7snsHdQwrDUg30e"};
    public int A00;
    public int A01;
    public long A02;
    public boolean A03;
    public final java.util.List<com.facebook.ads.redexgen.core.DE> A04;
    public final com.facebook.ads.redexgen.core.C9[] A05;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            byte b = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 18);
            if (A07[7].charAt(14) != 'V') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A07;
            strArr[5] = "dfNOx";
            strArr[3] = "k4245";
            bArrCopyOfRange[i4] = b;
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{105, 120, 120, 100, 97, 107, 105, 124, 97, 103, 102, 39, 108, 126, 106, 123, 125, 106, 123};
    }

    static {
        A01();
    }

    public Y8(java.util.List<com.facebook.ads.redexgen.core.DE> list) {
        this.A04 = list;
        this.A05 = new com.facebook.ads.redexgen.core.C9[list.size()];
    }

    private boolean A02(com.facebook.ads.redexgen.core.I4 i4, int i) {
        if (i4.A04() == 0) {
            return false;
        }
        int iA0E = i4.A0E();
        if (A07[2].charAt(4) == 'H') {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A07;
        strArr[5] = "AT2i3";
        strArr[3] = "4HMu9";
        if (iA0E != i) {
            this.A03 = false;
        }
        int i2 = this.A00 - 1;
        if (A07[1].charAt(2) != 'R') {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A07;
        strArr2[5] = "zNNuT";
        strArr2[3] = "DYhQD";
        this.A00 = i2;
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.D3
    public final void A4n(com.facebook.ads.redexgen.core.I4 i4) {
        if (this.A03) {
            if (this.A00 == 2 && !A02(i4, 32)) {
                return;
            }
            if (this.A00 == 1 && !A02(i4, 0)) {
                return;
            }
            int iA06 = i4.A06();
            int iA04 = i4.A04();
            for (com.facebook.ads.redexgen.core.C9 c9 : this.A05) {
                i4.A0Y(iA06);
                c9.AFv(i4, iA04);
            }
            int dataPosition = this.A01;
            this.A01 = dataPosition + iA04;
        }
    }

    @Override // com.facebook.ads.redexgen.core.D3
    public final void A5B(com.facebook.ads.redexgen.core.InterfaceC0611Bz interfaceC0611Bz, com.facebook.ads.redexgen.core.DH dh) {
        for (int i = 0; i < i; i++) {
            com.facebook.ads.redexgen.core.DE de = this.A04.get(i);
            dh.A05();
            com.facebook.ads.redexgen.core.C9 output = interfaceC0611Bz.AHA(dh.A03(), 3);
            output.A69(com.facebook.ads.internal.exoplayer2.thirdparty.Format.A0A(dh.A04(), A00(0, 19, 26), null, -1, 0, java.util.Collections.singletonList(de.A02), de.A01, null));
            this.A05[i] = output;
        }
    }

    @Override // com.facebook.ads.redexgen.core.D3
    public final void AEL() {
        if (this.A03) {
            for (com.facebook.ads.redexgen.core.C9 c9 : this.A05) {
                java.lang.String[] strArr = A07;
                if (strArr[5].length() != strArr[3].length()) {
                    throw new java.lang.RuntimeException();
                }
                A07[1] = "w2RvpoOeyIRfzKBrI6Jaemc95yLcCgR9";
                c9.AFw(this.A02, 1, this.A01, 0, null);
            }
            this.A03 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.core.D3
    public final void AEM(long j, boolean z) {
        if (!z) {
            return;
        }
        this.A03 = true;
        this.A02 = j;
        this.A01 = 0;
        this.A00 = 2;
    }

    @Override // com.facebook.ads.redexgen.core.D3
    public final void AG6() {
        this.A03 = false;
    }
}

package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class CP {
    public static byte[] A09;
    public static java.lang.String[] A0A = {"xMNext", "zlzEwhsQC3FpKQNfU72ignmkxEXGlEWQ", "hTVEjk3rNFsg66RRpHStC4yCUn29H2cK", "lb2Z9KtgGwzkm6WUebOJTSliuGJIKPxa", "NDBSvjeraksgouCWowC9mNbakqVzapXj", "jkP3sVUJry8UgHuLS2r02X6f", "lSPidmQgGebPlfolmgnIPeXjLgEThElM", "Xkj28o"};
    public int A00;
    public int A01;
    public long A02;
    public int A03;
    public int A04;
    public final int A05;
    public final com.facebook.ads.redexgen.core.I4 A06;
    public final com.facebook.ads.redexgen.core.I4 A07;
    public final boolean A08;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            int i5 = (bArrCopyOfRange[i4] - i3) - 30;
            if (A0A[1].charAt(28) == 'R') {
                throw new java.lang.RuntimeException();
            }
            A0A[2] = "7TPgv6JzmOMJusvdxeRCHMdlPjF1ygj3";
            bArrCopyOfRange[i4] = (byte) i5;
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A09 = new byte[]{-92, -89, -80, -79, -78, -99, -95, -90, -77, -84, -87, 94, -85, -77, -79, -78, 94, -96, -93, 94, 111};
    }

    static {
        A01();
    }

    public CP(com.facebook.ads.redexgen.core.I4 i4, com.facebook.ads.redexgen.core.I4 i5, boolean z) {
        this.A07 = i4;
        this.A06 = i5;
        this.A08 = z;
        i5.A0Y(12);
        this.A05 = i5.A0H();
        i4.A0Y(12);
        this.A04 = i4.A0H();
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A06(i4.A08() == 1, A00(0, 21, 32));
        this.A00 = -1;
    }

    public final boolean A02() {
        long jA0M;
        int iA0H;
        int i = this.A00 + 1;
        this.A00 = i;
        if (i == this.A05) {
            if (A0A[4].charAt(18) != 'C') {
                throw new java.lang.RuntimeException();
            }
            A0A[5] = "9rTTdGUS3";
            return false;
        }
        if (this.A08) {
            jA0M = this.A06.A0N();
        } else {
            com.facebook.ads.redexgen.core.I4 i4 = this.A06;
            java.lang.String[] strArr = A0A;
            if (strArr[6].charAt(8) != strArr[3].charAt(8)) {
                A0A[4] = "IGdwwTQI2iFuokxRsKC9HYA9e5TBmMKA";
                jA0M = i4.A0M();
            } else {
                java.lang.String[] strArr2 = A0A;
                strArr2[0] = "DD1qjj";
                strArr2[7] = "zmmxaf";
                jA0M = i4.A0M();
            }
        }
        this.A02 = jA0M;
        if (this.A00 == this.A03) {
            this.A01 = this.A07.A0H();
            this.A07.A0Z(4);
            int i2 = this.A04 - 1;
            this.A04 = i2;
            if (i2 > 0) {
                iA0H = this.A07.A0H() - 1;
            } else {
                iA0H = -1;
            }
            this.A03 = iA0H;
        }
        return true;
    }
}

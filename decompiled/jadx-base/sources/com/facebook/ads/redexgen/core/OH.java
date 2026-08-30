package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class OH {
    public static long A0D;
    public static byte[] A0E;
    public static java.lang.String[] A0F = {"R0SbMgWAoC497HVFrz", "HjDMjTQFKfQjEPdjddKMHVEmssyIO6xJ", "qLmiUd82g2mhrwqPXxjSPUm4NIZHyVr2", "b8w5", "5ahVLoWejnV8u5u0zxB2Y4aA1Z0H734m", "82nB4Ww4zktBcOGVc7", "fE0nEfPNcAkneFTlCeTsSM9yzZ1yQJUc", "9xmO"};
    public com.facebook.ads.redexgen.core.AbstractC1341cD A00;
    public com.facebook.ads.redexgen.core.LL A01;
    public com.facebook.ads.redexgen.core.LZ A02;
    public com.facebook.ads.redexgen.core.OG A03;
    public boolean A04;
    public boolean A05;
    public final com.facebook.ads.redexgen.core.C1T A06;
    public final com.facebook.ads.redexgen.core.C1199Zs A07;
    public final com.facebook.ads.redexgen.core.J7 A08;
    public final com.facebook.ads.redexgen.core.C0842Lv A09;
    public final com.facebook.ads.redexgen.core.MR A0A;
    public final com.facebook.ads.redexgen.core.C0987Rk A0B;
    public final java.lang.String A0C;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 19);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        byte[] bArr = {119, -120, 117, 118, -87, -88, -88, -93, -94, 119, -96, -99, -105, -97, -128, -99, -89, -88, -103, -94, -103, -90, 115, -96, -96, -99, -96, 78, -109, -90, -109, -111, -93, -94, -105, -100, -107, 78, -113, -111, -94, -105, -99, -100, -100, -55, -55, -58, -55, 119, -50, -65, -64, -61, -68, 119, -58, -57, -68, -59, -64, -59, -66, 119};
        java.lang.String[] strArr = A0F;
        if (strArr[4].charAt(11) == strArr[6].charAt(11)) {
            throw new java.lang.RuntimeException();
        }
        A0F[5] = "";
        A0E = bArr;
    }

    static {
        A01();
        A0D = 0L;
    }

    public OH(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, java.lang.String str, com.facebook.ads.redexgen.core.C0987Rk c0987Rk, com.facebook.ads.redexgen.core.C0842Lv c0842Lv, com.facebook.ads.redexgen.core.J7 j7, com.facebook.ads.redexgen.core.C1T c1t) {
        this(c1199Zs, str, c0987Rk, c0842Lv, j7, c1t, new com.facebook.ads.redexgen.core.C1064Uj());
    }

    public OH(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, java.lang.String str, com.facebook.ads.redexgen.core.C0987Rk c0987Rk, com.facebook.ads.redexgen.core.C0842Lv c0842Lv, com.facebook.ads.redexgen.core.J7 j7, com.facebook.ads.redexgen.core.C1T c1t, com.facebook.ads.redexgen.core.MR mr) {
        this.A04 = true;
        this.A07 = c1199Zs;
        this.A0C = str;
        this.A0B = c0987Rk;
        this.A09 = c0842Lv;
        this.A08 = j7;
        this.A06 = c1t;
        this.A0A = mr;
    }

    public OH(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, java.lang.String str, com.facebook.ads.redexgen.core.C0987Rk c0987Rk, com.facebook.ads.redexgen.core.C0842Lv c0842Lv, com.facebook.ads.redexgen.core.J7 j7, com.facebook.ads.redexgen.core.C1T c1t, com.facebook.ads.redexgen.core.MR mr, com.facebook.ads.redexgen.core.LZ lz) {
        this.A04 = true;
        this.A07 = c1199Zs;
        this.A0C = str;
        this.A0B = c0987Rk;
        this.A09 = c0842Lv;
        this.A08 = j7;
        this.A06 = c1t;
        this.A0A = mr;
        this.A02 = lz;
    }

    private void A02(java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, java.lang.String> map) {
        java.lang.String strA00 = A00(0, 22, 33);
        try {
            com.facebook.ads.redexgen.core.M3.A0a(map, this.A00);
            com.facebook.ads.redexgen.core.AbstractC03250h adAction = com.facebook.ads.redexgen.core.C03260i.A01(this.A07, this.A08, str, com.facebook.ads.redexgen.core.L5.A00(str2), new com.facebook.ads.redexgen.core.O8(map).A03(this.A0B).A02(this.A09).A05(), this.A04, this.A05, this.A06);
            if (adAction instanceof com.facebook.ads.redexgen.core.C0705Gf) {
                ((com.facebook.ads.redexgen.core.C0705Gf) adAction).A0H(this.A01);
            }
            com.facebook.ads.redexgen.core.EnumC03240g enumC03240gA0C = com.facebook.ads.redexgen.core.EnumC03240g.A09;
            if (adAction != null) {
                enumC03240gA0C = adAction.A0C();
            }
            if (!(((adAction instanceof com.facebook.ads.redexgen.core.GQ) || (adAction instanceof com.facebook.ads.redexgen.core.C0705Gf)) && com.facebook.ads.redexgen.core.M3.A0g(this.A07, enumC03240gA0C, map)) && enumC03240gA0C != com.facebook.ads.redexgen.core.EnumC03240g.A06) {
                if (this.A03 != null) {
                    this.A03.ABf();
                }
                this.A0A.A4P(this.A0C);
            }
        } catch (android.content.ActivityNotFoundException e) {
            android.util.Log.e(strA00, A00(44, 20, 68) + str2, e);
        } catch (java.lang.Exception e2) {
            java.lang.String strA01 = A00(22, 22, 27);
            if (A0F[2].charAt(19) != 'S') {
                throw new java.lang.RuntimeException();
            }
            A0F[0] = "pDGFYqmHYV4Rom3KsQ";
            android.util.Log.e(strA00, strA01, e2);
        }
    }

    public static boolean A03(com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        boolean zA2j = com.facebook.ads.redexgen.core.C0762Im.A2j(c1199Zs);
        int iA07 = com.facebook.ads.redexgen.core.C0762Im.A07(c1199Zs);
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis() - A0D;
        if (zA2j && A0D > 0 && jCurrentTimeMillis < iA07) {
            return true;
        }
        A0D = java.lang.System.currentTimeMillis();
        return false;
    }

    public final void A04(com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cD) {
        this.A00 = abstractC1341cD;
    }

    public final void A05(com.facebook.ads.redexgen.core.LL ll) {
        this.A01 = ll;
    }

    public final void A06(com.facebook.ads.redexgen.core.LZ lz) {
        this.A02 = lz;
    }

    public final void A07(com.facebook.ads.redexgen.core.OG og) {
        this.A03 = og;
    }

    public final void A08(java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, java.lang.String> extraData) {
        new com.facebook.ads.redexgen.core.JF(str, this.A08).A04(com.facebook.ads.redexgen.core.JE.A0J, extraData);
        if (this.A09.A09(this.A07)) {
            this.A08.A9w(str, extraData);
            return;
        }
        A02(str, str2, extraData);
        if (this.A00 == null || this.A00.A1P().A0I() == null || this.A02 == null) {
            return;
        }
        com.facebook.ads.redexgen.core.LC.A07(this.A07.A01(), this.A00.A1P().A0I(), this.A02);
    }

    public final void A09(boolean z) {
        this.A05 = z;
    }
}

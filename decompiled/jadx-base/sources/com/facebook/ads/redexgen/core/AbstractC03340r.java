package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC03340r {
    public static byte[] A04;
    public boolean A00;
    public final com.facebook.ads.redexgen.core.AbstractC03350s A01;
    public final com.facebook.ads.redexgen.core.C1199Zs A02;
    public final com.facebook.ads.redexgen.core.C0987Rk A03;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 121);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-2, 34, 37, 39, 26, 40, 40, 30, 36, 35, -43, 33, 36, 28, 28, 26, 25};
    }

    public abstract void A06(java.util.Map<java.lang.String, java.lang.String> map);

    public AbstractC03340r(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.AbstractC03350s abstractC03350s, com.facebook.ads.redexgen.core.C0987Rk c0987Rk) {
        this.A02 = c1199Zs;
        this.A01 = abstractC03350s;
        this.A03 = c0987Rk;
    }

    public final void A03() {
        if (this.A00) {
            return;
        }
        if (this.A01 != null) {
            this.A01.A00();
        }
        java.util.Map<java.lang.String, java.lang.String> extraData = new com.facebook.ads.redexgen.core.O8().A03(this.A03).A05();
        A06(extraData);
        this.A00 = true;
        com.facebook.ads.redexgen.core.LC.A04(this.A02, A00(0, 17, 60));
        com.facebook.ads.redexgen.core.AbstractC03350s abstractC03350s = this.A01;
    }
}

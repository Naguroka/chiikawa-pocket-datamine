package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.au, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1262au implements com.facebook.ads.redexgen.core.InterfaceC04324m {
    public static byte[] A04;
    public int A00;
    public int A01;
    public int A02;
    public int[] A03;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 51);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-95, -74, -50, -60, -54, -55, 117, -59, -60, -56, -66, -55, -66, -60, -61, -56, 117, -62, -54, -56, -55, 117, -73, -70, 117, -61, -60, -61, -126, -61, -70, -68, -74, -55, -66, -53, -70, -117, -92, -77, -96, -89, 91, -97, -92, -82, -81, -100, -87, -98, -96, 91, -88, -80, -82, -81, 91, -99, -96, 91, -87, -86, -87, 104, -87, -96, -94, -100, -81, -92, -79, -96};
    }

    public final void A02() {
        if (this.A03 != null) {
            java.util.Arrays.fill(this.A03, -1);
        }
        this.A00 = 0;
    }

    public final void A03(int i, int i2) {
        this.A01 = i;
        this.A02 = i2;
    }

    public final void A04(com.facebook.ads.redexgen.core.FL fl, boolean z) {
        this.A00 = 0;
        if (this.A03 != null) {
            java.util.Arrays.fill(this.A03, -1);
        }
        com.facebook.ads.redexgen.core.AbstractC04344o abstractC04344o = fl.A06;
        if (fl.A04 != null && abstractC04344o != null && abstractC04344o.A1U()) {
            if (z) {
                if (!fl.A00.A0B()) {
                    abstractC04344o.A1r(fl.A04.A0E(), this);
                }
            } else if (!fl.A1p()) {
                abstractC04344o.A1q(this.A01, this.A02, fl.A0s, this);
            }
            if (this.A00 > abstractC04344o.A00) {
                abstractC04344o.A00 = this.A00;
                abstractC04344o.A08 = z;
                fl.A0r.A0O();
            }
        }
    }

    public final boolean A05(int i) {
        if (this.A03 != null) {
            int i2 = this.A00 * 2;
            for (int i3 = 0; i3 < i2; i3 += 2) {
                int count = this.A03[i3];
                if (count == i) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC04324m
    public final void A3o(int i, int i2) {
        if (i >= 0) {
            if (i2 >= 0) {
                int i3 = this.A00 * 2;
                if (this.A03 == null) {
                    this.A03 = new int[4];
                    java.util.Arrays.fill(this.A03, -1);
                } else {
                    int storagePosition = this.A03.length;
                    if (i3 >= storagePosition) {
                        int[] iArr = this.A03;
                        int storagePosition2 = i3 * 2;
                        this.A03 = new int[storagePosition2];
                        java.lang.System.arraycopy(iArr, 0, this.A03, 0, iArr.length);
                    }
                }
                this.A03[i3] = i;
                int storagePosition3 = i3 + 1;
                this.A03[storagePosition3] = i2;
                int storagePosition4 = this.A00;
                this.A00 = storagePosition4 + 1;
                return;
            }
            throw new java.lang.IllegalArgumentException(A00(37, 35, 8));
        }
        throw new java.lang.IllegalArgumentException(A00(0, 37, 34));
    }
}

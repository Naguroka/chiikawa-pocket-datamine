package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class YY extends com.facebook.ads.redexgen.core.CO {
    public static byte[] A03;
    public final long A00;
    public final java.util.List<com.facebook.ads.redexgen.core.YY> A01;
    public final java.util.List<com.facebook.ads.redexgen.core.YX> A02;

    static {
        A05();
    }

    public static java.lang.String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 114);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{121, 58, 54, 55, 45, 56, 48, 55, 60, 43, 42, 99, 121, 24, 84, 93, 89, 78, 93, 75, 2, 24};
    }

    public YY(int i, long j) {
        super(i);
        this.A00 = j;
        this.A02 = new java.util.ArrayList();
        this.A01 = new java.util.ArrayList();
    }

    public final com.facebook.ads.redexgen.core.YY A06(int i) {
        int size = this.A01.size();
        for (int i2 = 0; i2 < size; i2++) {
            com.facebook.ads.redexgen.core.YY yy = this.A01.get(i2);
            int childrenSize = ((com.facebook.ads.redexgen.core.CO) yy).A00;
            if (childrenSize == i) {
                return yy;
            }
        }
        return null;
    }

    public final com.facebook.ads.redexgen.core.YX A07(int i) {
        int size = this.A02.size();
        for (int i2 = 0; i2 < size; i2++) {
            com.facebook.ads.redexgen.core.YX yx = this.A02.get(i2);
            int childrenSize = ((com.facebook.ads.redexgen.core.CO) yx).A00;
            if (childrenSize == i) {
                return yx;
            }
        }
        return null;
    }

    public final void A08(com.facebook.ads.redexgen.core.YY yy) {
        this.A01.add(yy);
    }

    public final void A09(com.facebook.ads.redexgen.core.YX yx) {
        this.A02.add(yx);
    }

    @Override // com.facebook.ads.redexgen.core.CO
    public final java.lang.String toString() {
        return com.facebook.ads.redexgen.core.CO.A02(super.A00) + A04(13, 9, 74) + java.util.Arrays.toString(this.A02.toArray()) + A04(0, 13, 43) + java.util.Arrays.toString(this.A01.toArray());
    }
}

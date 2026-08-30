package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C5 {
    public static byte[] A02;
    public final com.facebook.ads.redexgen.core.C7 A00;
    public final com.facebook.ads.redexgen.core.C7 A01;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 10);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-106, -118, 101, -72};
    }

    public C5(com.facebook.ads.redexgen.core.C7 c7) {
        this(c7, c7);
    }

    public C5(com.facebook.ads.redexgen.core.C7 c7, com.facebook.ads.redexgen.core.C7 c8) {
        this.A00 = (com.facebook.ads.redexgen.core.C7) com.facebook.ads.redexgen.core.AbstractC0730Hf.A01(c7);
        this.A01 = (com.facebook.ads.redexgen.core.C7) com.facebook.ads.redexgen.core.AbstractC0730Hf.A01(c8);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.facebook.ads.redexgen.core.C5 c5 = (com.facebook.ads.redexgen.core.C5) obj;
        return this.A00.equals(c5.A00) && this.A01.equals(c5.A01);
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public final java.lang.String toString() {
        return A00(2, 1, 0) + this.A00 + (this.A00.equals(this.A01) ? A00(0, 0, 17) : A00(0, 2, 96) + this.A01) + A00(3, 1, 81);
    }
}

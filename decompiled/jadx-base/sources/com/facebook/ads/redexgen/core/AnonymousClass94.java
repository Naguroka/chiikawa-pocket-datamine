package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.94, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass94 {
    public static byte[] A02;
    public final int A00;
    public final int A01;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 34);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-85, -48, -40, -61, -50, -53, -58, -126, -53, -48, -58, -57, -38, -90, -57, -50, -42, -61, -126, -118, -121, -58, -114, -126, -53, -48, -58, -57, -38, -126, -97, -126, -121, -58, -117, -56, -53, -50, -57, -126, -118, -121, -58, -117, -126, -98, -126, -113, -109, -12, -9, -6, -13, -82, -53, -82, -77, -14, -82, -76, -76, -82, -9, -4, -14, -13, 6, -82, -53, -82, -77, -14, -47, -44, -41, -48, -117, -88, -88, -117, -104, -100, -117, -111, -111, -117, -44, -39, -49, -48, -29, -117, -88, -117, -112, -49};
    }

    public AnonymousClass94() {
        this(-1, -1);
    }

    public AnonymousClass94(int i, int i2) {
        if (i < -1) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, A00(35, 14, 64), java.lang.Integer.valueOf(i)));
        }
        if (i >= 0 && i2 < 0) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, A00(49, 23, 108), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)));
        }
        if (i == -1 && i2 != -1) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, A00(72, 24, 73), java.lang.Integer.valueOf(i2)));
        }
        this.A00 = i;
        this.A01 = i2;
    }

    public final int A02() {
        return this.A00;
    }

    public final int A03() {
        return this.A01;
    }

    public final int A04(com.facebook.ads.redexgen.core.AnonymousClass94 anonymousClass94) {
        if (this.A00 != anonymousClass94.A00) {
            return this.A00 - anonymousClass94.A00;
        }
        return this.A01 - anonymousClass94.A01;
    }

    public final com.facebook.ads.redexgen.core.AnonymousClass94 A05(int i) {
        if (this.A01 + i >= 0) {
            return new com.facebook.ads.redexgen.core.AnonymousClass94(this.A00, this.A01 + i);
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, A00(0, 35, 64), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(this.A01)));
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.facebook.ads.redexgen.core.AnonymousClass94)) {
            return false;
        }
        com.facebook.ads.redexgen.core.AnonymousClass94 anonymousClass94 = (com.facebook.ads.redexgen.core.AnonymousClass94) obj;
        return anonymousClass94.A00 == this.A00 && anonymousClass94.A01 == this.A01;
    }

    public final int hashCode() {
        return (this.A00 * 2) + (this.A01 * 3);
    }
}

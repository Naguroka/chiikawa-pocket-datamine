package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4R, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C4R {
    public static byte[] A05;
    public static java.lang.String[] A06 = {"6A8c5bTmn3VqyB8YAlCr0l6Zt8", "WvRRX1RoaLPXS8ebG7t3iKQl5mlirRpT", "WchiA2SGVr9snt7FUspuKPhd1UDHlrMO", "Eitw2B1PL", "6IVwjfWBqAtEKeEHT6LIQhSZ71mOayX0", "DKDeSzlopwneHhxkht4X8JiglSdKfD1S", "icQypc6bx", "6eJUJUb"};
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1261at A04;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 90);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{-97, -109, -32, -74, -30, -30, -27, -41, -36, -31, -44, -25, -40, -80, -45, -57, 20, -13, 8, 32, 22, 28, 27, -19, 25, 22, 20, -20, 21, 11, -28, 3, -9, 68, 45, 56, 67, 64, 59, 20, -9, 36, 25, 30, 37, 40, -1, 36, 28, 37, 49, 35, 6, 37, 41, 31, 42, 31, 37, 36, -13};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final void A05(android.view.View view) {
        int iA05 = this.A04.A04.A05();
        if (iA05 >= 0) {
            A04(view);
            return;
        }
        this.A01 = this.A04.A0p(view);
        if (this.A02) {
            int iA07 = (this.A04.A04.A07() - iA05) - this.A04.A04.A0C(view);
            this.A00 = this.A04.A04.A07() - iA07;
            if (iA07 > 0) {
                int iA0D = this.A00 - this.A04.A04.A0D(view);
                int iA0A = this.A04.A04.A0A();
                int iMin = iA0D - (java.lang.Math.min(this.A04.A04.A0F(view) - iA0A, 0) + iA0A);
                if (iMin < 0) {
                    this.A00 += java.lang.Math.min(iA07, -iMin);
                    return;
                }
                return;
            }
            return;
        }
        int iA0F = this.A04.A04.A0F(view);
        int iA0A2 = iA0F - this.A04.A04.A0A();
        this.A00 = iA0F;
        if (iA0A2 > 0) {
            int iA0D2 = this.A04.A04.A0D(view) + iA0F;
            int iA08 = this.A04.A04.A07() - java.lang.Math.min(0, (this.A04.A04.A07() - iA05) - this.A04.A04.A0C(view));
            java.lang.String[] strArr = A06;
            if (strArr[2].charAt(17) == strArr[1].charAt(17)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A06;
            strArr2[3] = "Cz8X0dfem";
            strArr2[6] = "kvMaEjgz6";
            int i = iA08 - iA0D2;
            if (i < 0) {
                this.A00 -= java.lang.Math.min(iA0A2, -i);
            }
        }
    }

    static {
        A01();
    }

    public C4R(com.facebook.ads.redexgen.core.C1261at c1261at) {
        this.A04 = c1261at;
        A03();
    }

    public final void A02() {
        int iA0A;
        if (this.A02) {
            iA0A = this.A04.A04.A07();
        } else {
            iA0A = this.A04.A04.A0A();
        }
        this.A00 = iA0A;
    }

    public final void A03() {
        this.A01 = -1;
        this.A00 = Integer.MIN_VALUE;
        this.A02 = false;
        this.A03 = false;
    }

    public final void A04(android.view.View view) {
        if (this.A02) {
            this.A00 = this.A04.A04.A0C(view) + this.A04.A04.A05();
        } else {
            this.A00 = this.A04.A04.A0F(view);
        }
        com.facebook.ads.redexgen.core.C1261at c1261at = this.A04;
        java.lang.String[] strArr = A06;
        if (strArr[4].charAt(19) == strArr[5].charAt(19)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A06;
        strArr2[2] = "KzGGhFAymIJJcnKPjC7mQoKH3wQvbJNl";
        strArr2[1] = "M2kGapXrbhEzK3ghy5X2EP5VRS1NNbBf";
        this.A01 = c1261at.A0p(view);
    }

    public final boolean A06(android.view.View view, com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53) {
        com.facebook.ads.redexgen.core.C04354p c04354p = (com.facebook.ads.redexgen.core.C04354p) view.getLayoutParams();
        return !c04354p.A02() && c04354p.A00() >= 0 && c04354p.A00() < anonymousClass53.A03();
    }

    public final java.lang.String toString() {
        return A00(40, 21, 92) + this.A01 + A00(0, 14, 25) + this.A00 + A00(14, 17, 77) + this.A02 + A00(31, 9, 125) + this.A03 + '}';
    }
}

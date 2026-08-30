package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class GR {
    public static byte[] A0G;
    public static java.lang.String[] A0H = {"NUzGMnL", "YQomcxwQ93PK4ynsoGLiAyy456b0aprk", "uNrGKGnRv4o3g0hSFh353yXiGCuuTbcl", "SgzJpbJtXWAVdbgrbfLOIM48XHAMhxWL", "3zAyiaC", "pHYNglNqhBNsg9S2eahg7hU7OyTCBGVk", "Ro2GB40CJjXXy4HKltQfUSJDg2onAoKh", "NsNQiUOCEqaWjU1BLVqBIrSW7n245ODK"};
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public android.text.Layout.Alignment A08;
    public java.lang.String A09;
    public java.lang.String A0A;
    public java.lang.String A0B;
    public java.lang.String A0C;
    public java.util.List<java.lang.String> A0D;
    public boolean A0E;
    public boolean A0F;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0G, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            java.lang.String[] strArr = A0H;
            if (strArr[1].charAt(18) != strArr[3].charAt(18)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0H;
            strArr2[4] = "FheFC1U";
            strArr2[0] = "PUes7im";
            if (i4 >= length) {
                return new java.lang.String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 95);
            i4++;
        }
    }

    public static void A02() {
        A0G = new byte[]{-73, -42, -40, -32, -36, -25, -28, -22, -29, -39, -107, -40, -28, -31, -28, -25, -107, -29, -28, -23, -107, -39, -38, -37, -34, -29, -38, -39, -93, -34, 7, 6, 12, -72, -5, 7, 4, 7, 10, -72, 6, 7, 12, -72, -4, -3, -2, 1, 6, -3, -4};
    }

    static {
        A02();
    }

    public GR() {
        A03();
    }

    public static int A00(int i, java.lang.String str, java.lang.String str2, int i2) {
        if (!str.isEmpty()) {
            java.lang.String[] strArr = A0H;
            if (strArr[1].charAt(18) != strArr[3].charAt(18)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0H;
            strArr2[1] = "7EvIURBQpECqxG5jGjLOa9HKn8wbzJkS";
            strArr2[3] = "UbOohqAT6hcG0r1X4DLnHOjV5CTu4rQu";
            if (i != -1) {
                if (str.equals(str2)) {
                    return i + i2;
                }
                return -1;
            }
        }
        return i;
    }

    private final void A03() {
        java.lang.String strA01 = A01(0, 0, 7);
        this.A0A = strA01;
        this.A0B = strA01;
        this.A0D = java.util.Collections.emptyList();
        this.A0C = strA01;
        this.A09 = null;
        this.A0F = false;
        this.A0E = false;
        this.A06 = -1;
        this.A07 = -1;
        this.A02 = -1;
        this.A05 = -1;
        this.A04 = -1;
        this.A08 = null;
    }

    public final float A04() {
        return this.A00;
    }

    public final int A05() {
        if (this.A0E) {
            return this.A01;
        }
        throw new java.lang.IllegalStateException(A01(0, 29, 22));
    }

    public final int A06() {
        if (this.A0F) {
            return this.A03;
        }
        throw new java.lang.IllegalStateException(A01(29, 22, 57));
    }

    public final int A07() {
        return this.A04;
    }

    public final int A08() {
        if (this.A02 == -1 && this.A05 == -1) {
            return -1;
        }
        int i = this.A02 == 1 ? 1 : 0;
        int i2 = this.A05;
        java.lang.String[] strArr = A0H;
        if (strArr[1].charAt(18) != strArr[3].charAt(18)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0H;
        strArr2[4] = "3eGvBoe";
        strArr2[0] = "z8byPBs";
        return i | (i2 == 1 ? 2 : 0);
    }

    public final int A09(java.lang.String str, java.lang.String str2, java.lang.String[] strArr, java.lang.String str3) {
        if (this.A0A.isEmpty() && this.A0B.isEmpty() && this.A0D.isEmpty() && this.A0C.isEmpty()) {
            return str2.isEmpty() ? 1 : 0;
        }
        int iA00 = A00(A00(A00(0, this.A0A, str, 1073741824), this.A0B, str2, 2), this.A0C, str3, 4);
        if (iA00 == -1 || !java.util.Arrays.asList(strArr).containsAll(this.A0D)) {
            return 0;
        }
        return iA00 + (this.A0D.size() * 4);
    }

    public final android.text.Layout.Alignment A0A() {
        return this.A08;
    }

    public final com.facebook.ads.redexgen.core.GR A0B(int i) {
        this.A01 = i;
        this.A0E = true;
        return this;
    }

    public final com.facebook.ads.redexgen.core.GR A0C(int i) {
        this.A03 = i;
        this.A0F = true;
        return this;
    }

    public final com.facebook.ads.redexgen.core.GR A0D(java.lang.String str) {
        this.A09 = com.facebook.ads.redexgen.core.IK.A0M(str);
        return this;
    }

    public final com.facebook.ads.redexgen.core.GR A0E(boolean z) {
        this.A02 = z ? 1 : 0;
        return this;
    }

    public final com.facebook.ads.redexgen.core.GR A0F(boolean z) {
        this.A05 = z ? 1 : 0;
        return this;
    }

    public final com.facebook.ads.redexgen.core.GR A0G(boolean z) {
        this.A07 = z ? 1 : 0;
        return this;
    }

    public final java.lang.String A0H() {
        return this.A09;
    }

    public final void A0I(java.lang.String str) {
        this.A0A = str;
    }

    public final void A0J(java.lang.String str) {
        this.A0B = str;
    }

    public final void A0K(java.lang.String str) {
        this.A0C = str;
    }

    public final void A0L(java.lang.String[] strArr) {
        this.A0D = java.util.Arrays.asList(strArr);
    }

    public final boolean A0M() {
        return this.A0E;
    }

    public final boolean A0N() {
        return this.A0F;
    }

    public final boolean A0O() {
        return this.A06 == 1;
    }

    public final boolean A0P() {
        return this.A07 == 1;
    }
}

package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class GM {
    public static byte[] A0E;
    public static java.lang.String[] A0F = {"qGv4Ar1pPX57WAHh5VU", "JK4BXp3", "hkMdgbGuGt", "myKKM", "21uhsW4yaSW", "5251CPxGdu3uRv", "iZvaw", "zE"};
    public float A00;
    public int A01;
    public int A03;
    public android.text.Layout.Alignment A08;
    public java.lang.String A09;
    public java.lang.String A0A;
    public boolean A0B;
    public boolean A0C;
    public final com.facebook.ads.redexgen.core.GM A0D;
    public int A06 = -1;
    public int A07 = -1;
    public int A02 = -1;
    public int A05 = -1;
    public int A04 = -1;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 99);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A0E = new byte[]{0, 31, 33, 41, 37, 48, 45, 51, 44, 34, -34, 33, 45, 42, 45, 48, -34, 38, 31, 49, -34, 44, 45, 50, -34, 32, 35, 35, 44, -34, 34, 35, 36, 39, 44, 35, 34, -20, -52, -11, -12, -6, -90, -23, -11, -14, -11, -8, -90, -18, -25, -7, -90, -12, -11, -6, -90, -24, -21, -21, -12, -90, -22, -21, -20, -17, -12, -21, -22, -76};
    }

    static {
        A02();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x009d  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a1  */
    private com.facebook.ads.redexgen.core.GM A00(com.facebook.ads.redexgen.core.GM gm, boolean z) {
        if (gm != null) {
            if (!this.A0C && gm.A0C) {
                A0B(gm.A03);
            }
            if (this.A02 == -1) {
                this.A02 = gm.A02;
            }
            if (this.A05 == -1) {
                this.A05 = gm.A05;
            }
            java.lang.String str = this.A09;
            if (A0F[1].length() != 7) {
                throw new java.lang.RuntimeException();
            }
            A0F[1] = "BinrSMK";
            if (str == null) {
                this.A09 = gm.A09;
            }
            if (this.A06 == -1) {
                this.A06 = gm.A06;
            }
            if (this.A07 == -1) {
                this.A07 = gm.A07;
            }
            if (this.A08 == null) {
                this.A08 = gm.A08;
            }
            if (this.A04 == -1) {
                this.A04 = gm.A04;
                java.lang.String[] strArr = A0F;
                if (strArr[3].length() != strArr[6].length()) {
                    throw new java.lang.RuntimeException();
                }
                A0F[4] = "";
                this.A00 = gm.A00;
            }
            if (z) {
                boolean z2 = this.A0B;
                if (A0F[7].length() != 4) {
                    A0F[1] = "rTyailN";
                    if (!z2) {
                        if (gm.A0B) {
                            A0A(gm.A01);
                        }
                    }
                } else {
                    A0F[4] = "s2sgnw7Sb4LAyN";
                    if (!z2) {
                        if (gm.A0B) {
                            A0A(gm.A01);
                        }
                    }
                }
            }
        }
        return this;
    }

    public final float A03() {
        return this.A00;
    }

    public final int A04() {
        if (this.A0B) {
            return this.A01;
        }
        throw new java.lang.IllegalStateException(A01(0, 38, 91));
    }

    public final int A05() {
        if (this.A0C) {
            return this.A03;
        }
        throw new java.lang.IllegalStateException(A01(38, 32, 35));
    }

    public final int A06() {
        return this.A04;
    }

    public final int A07() {
        if (this.A02 == -1 && this.A05 == -1) {
            return -1;
        }
        int i = (this.A02 == 1 ? 1 : 0) | (this.A05 == 1 ? 2 : 0);
        if (A0F[7].length() == 4) {
            throw new java.lang.RuntimeException();
        }
        A0F[5] = "RqDPD18WM9MqMG";
        return i;
    }

    public final android.text.Layout.Alignment A08() {
        return this.A08;
    }

    public final com.facebook.ads.redexgen.core.GM A09(float f) {
        this.A00 = f;
        return this;
    }

    public final com.facebook.ads.redexgen.core.GM A0A(int i) {
        this.A01 = i;
        this.A0B = true;
        return this;
    }

    public final com.facebook.ads.redexgen.core.GM A0B(int i) {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(this.A0D == null);
        this.A03 = i;
        this.A0C = true;
        return this;
    }

    public final com.facebook.ads.redexgen.core.GM A0C(int i) {
        this.A04 = i;
        return this;
    }

    public final com.facebook.ads.redexgen.core.GM A0D(android.text.Layout.Alignment alignment) {
        this.A08 = alignment;
        return this;
    }

    public final com.facebook.ads.redexgen.core.GM A0E(com.facebook.ads.redexgen.core.GM gm) {
        return A00(gm, true);
    }

    public final com.facebook.ads.redexgen.core.GM A0F(java.lang.String str) {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(this.A0D == null);
        this.A09 = str;
        return this;
    }

    public final com.facebook.ads.redexgen.core.GM A0G(java.lang.String str) {
        this.A0A = str;
        return this;
    }

    public final com.facebook.ads.redexgen.core.GM A0H(boolean z) {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(this.A0D == null);
        this.A02 = z ? 1 : 0;
        return this;
    }

    public final com.facebook.ads.redexgen.core.GM A0I(boolean z) {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(this.A0D == null);
        this.A05 = z ? 1 : 0;
        return this;
    }

    public final com.facebook.ads.redexgen.core.GM A0J(boolean z) {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(this.A0D == null);
        this.A06 = z ? 1 : 0;
        return this;
    }

    public final com.facebook.ads.redexgen.core.GM A0K(boolean z) {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(this.A0D == null);
        this.A07 = z ? 1 : 0;
        return this;
    }

    public final java.lang.String A0L() {
        return this.A09;
    }

    public final java.lang.String A0M() {
        return this.A0A;
    }

    public final boolean A0N() {
        return this.A0B;
    }

    public final boolean A0O() {
        return this.A0C;
    }

    public final boolean A0P() {
        return this.A06 == 1;
    }

    public final boolean A0Q() {
        return this.A07 == 1;
    }
}

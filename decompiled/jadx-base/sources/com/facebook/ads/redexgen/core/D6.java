package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class D6 {
    public static java.lang.String[] A0G = {"rO0OZJw6z6", "aaZ1PuqlEnLnLH0uh8kye4H6vupShwsu", "5d2n1ynsTscs64Ie1ZijKw8edeUX", "XdYDAAdfzTXMLa7AW4crlcJNhIryq833", "hHVLoZdNuWeEAEugaul4BO4ImQQR7t2p", "4twoC8d7INBRsRXpAg06MCBSmEgkqQ0x", "xsd05V2KW0Qtu4gWH7wQnZjvefOmt", "hPU0XcOuH3hqUbmwT7ddYXSmCiMt"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public com.facebook.ads.redexgen.core.C0750Hz A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;

    public D6() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A00(com.facebook.ads.redexgen.core.D6 d6) {
        if (this.A0F) {
            if (!d6.A0F || this.A03 != d6.A03 || this.A07 != d6.A07 || this.A0C != d6.A0C) {
                return true;
            }
            if (this.A0B && d6.A0B && this.A0A != d6.A0A) {
                return true;
            }
            if (this.A05 != d6.A05 && (this.A05 == 0 || d6.A05 == 0)) {
                return true;
            }
            if (this.A09.A04 == 0 && d6.A09.A04 == 0 && (this.A06 != d6.A06 || this.A02 != d6.A02)) {
                return true;
            }
            if ((this.A09.A04 == 1 && d6.A09.A04 == 1 && (this.A00 != d6.A00 || this.A01 != d6.A01)) || this.A0E != d6.A0E) {
                return true;
            }
            if (this.A0E && d6.A0E && this.A04 != d6.A04) {
                return true;
            }
        }
        return false;
    }

    public final void A02() {
        this.A0D = false;
        this.A0F = false;
    }

    public final void A03(int i) {
        this.A08 = i;
        this.A0D = true;
    }

    public final void A04(com.facebook.ads.redexgen.core.C0750Hz c0750Hz, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, int i5, int i6, int i7, int i8, int i9) {
        this.A09 = c0750Hz;
        this.A05 = i;
        this.A08 = i2;
        this.A03 = i3;
        this.A07 = i4;
        this.A0C = z;
        this.A0B = z2;
        this.A0A = z3;
        this.A0E = z4;
        this.A04 = i5;
        this.A06 = i6;
        this.A02 = i7;
        this.A00 = i8;
        this.A01 = i9;
        this.A0F = true;
        this.A0D = true;
    }

    public final boolean A05() {
        if (this.A0D) {
            int i = this.A08;
            if (A0G[0].length() == 9) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0G;
            strArr[6] = "pPTeXoiLCEtvkN2q3qoF43bpwUDrc";
            strArr[5] = "VbLm6dZxTDBAJEz4a5qL5XAV7QNWTJHt";
            if (i == 7 || this.A08 == 2) {
                return true;
            }
        }
        return false;
    }
}

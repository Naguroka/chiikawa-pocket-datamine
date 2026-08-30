package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.at, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1261at extends com.facebook.ads.redexgen.core.AbstractC04344o implements com.facebook.ads.redexgen.core.AnonymousClass50 {
    public static byte[] A0F;
    public static java.lang.String[] A0G = {"ZTDwmEtle1avZIcEXO6Ngzge8j05pfT9", "s1YfUPq4amp3sGXTr0KOnMWCCCkrB2x5", "RLSriKm", "hA4l3MFFurEjuKvfb479JjwTp2cnC09n", "5GFF521rSn4TdhEStccPhauxYrt7NMVp", "XQN2s9DMc1xKucEpv2CitIAcNHBR8E7y", "8ubGCSX", "EFysGv6XChRnXfWxG2n7d2ksHTdYT6om"};
    public int A00;
    public int A01;
    public int A02;
    public com.facebook.ads.internal.androidx.support.v7.widget.LinearLayoutManager$SavedState A03;
    public com.facebook.ads.redexgen.core.C4Y A04;
    public boolean A05;
    public int A06;
    public com.facebook.ads.redexgen.core.C4T A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final com.facebook.ads.redexgen.core.C4R A0D;
    public final com.facebook.ads.redexgen.core.C4S A0E;

    public static java.lang.String A0T(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0F, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 91);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A0V() {
        A0F = new byte[]{31, 24, 0, 23, 26, 31, 18, 86, 25, 4, 31, 19, 24, 2, 23, 2, 31, 25, 24, 76};
    }

    static {
        A0V();
    }

    public C1261at(android.content.Context context) {
        this(context, 1, false);
    }

    public C1261at(android.content.Context context, int i, boolean z) {
        this.A0A = false;
        this.A05 = false;
        this.A0C = false;
        this.A0B = true;
        this.A01 = -1;
        this.A02 = Integer.MIN_VALUE;
        this.A03 = null;
        this.A0D = new com.facebook.ads.redexgen.core.C4R(this);
        this.A0E = new com.facebook.ads.redexgen.core.C4S();
        this.A06 = 2;
        A2A(i);
        A0h(z);
        A1R(true);
    }

    private final int A04(int i, com.facebook.ads.redexgen.core.C04414w c04414w, com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53) {
        if (A0W() == 0 || i == 0) {
            return 0;
        }
        this.A07.A0B = true;
        A29();
        int absDy = i > 0 ? 1 : -1;
        int consumed = java.lang.Math.abs(i);
        A0Y(absDy, consumed, true, anonymousClass53);
        int i2 = this.A07.A07;
        int layoutDirection = A08(c04414w, this.A07, anonymousClass53, false);
        int i3 = i2 + layoutDirection;
        if (i3 < 0) {
            return 0;
        }
        int absDy2 = consumed > i3 ? absDy * i3 : i;
        int layoutDirection2 = -absDy2;
        this.A04.A0J(layoutDirection2);
        this.A07.A04 = absDy2;
        return absDy2;
    }

    private int A05(int i, com.facebook.ads.redexgen.core.C04414w c04414w, com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53, boolean z) {
        int fixOffset;
        int gap = this.A04.A07() - i;
        if (gap > 0) {
            int i2 = -A04(-gap, c04414w, anonymousClass53);
            int i3 = i + i2;
            if (z && (fixOffset = this.A04.A07() - i3) > 0) {
                this.A04.A0J(fixOffset);
                return fixOffset + i2;
            }
            return i2;
        }
        return 0;
    }

    private int A06(int i, com.facebook.ads.redexgen.core.C04414w c04414w, com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53, boolean z) {
        int iA0A;
        int gap = i - this.A04.A0A();
        if (gap > 0) {
            int i2 = -A04(gap, c04414w, anonymousClass53);
            int i3 = i + i2;
            if (z && (iA0A = i3 - this.A04.A0A()) > 0) {
                this.A04.A0J(-iA0A);
                return i2 - iA0A;
            }
            return i2;
        }
        return 0;
    }

    private final int A08(com.facebook.ads.redexgen.core.C04414w c04414w, com.facebook.ads.redexgen.core.C4T c4t, com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53, boolean z) {
        int i = c4t.A00;
        int start = c4t.A07;
        if (start != Integer.MIN_VALUE) {
            int start2 = c4t.A00;
            if (start2 < 0) {
                int i2 = c4t.A07;
                int start3 = c4t.A00;
                c4t.A07 = i2 + start3;
            }
            A0e(c04414w, c4t);
        }
        int i3 = c4t.A00;
        int start4 = c4t.A02;
        int i4 = i3 + start4;
        com.facebook.ads.redexgen.core.C4S c4s = this.A0E;
        while (true) {
            if ((!c4t.A09 && i4 <= 0) || !c4t.A05(anonymousClass53)) {
                break;
            }
            c4s.A00();
            A2D(c04414w, anonymousClass53, c4t, c4s);
            if (!c4s.A01) {
                int i5 = c4t.A06;
                int remainingSpace = c4s.A00;
                int start5 = c4t.A05;
                c4t.A06 = i5 + (remainingSpace * start5);
                if (!c4s.A03 || this.A07.A08 != null || !anonymousClass53.A07()) {
                    int remainingSpace2 = c4t.A00;
                    int start6 = c4s.A00;
                    c4t.A00 = remainingSpace2 - start6;
                    int start7 = c4s.A00;
                    i4 -= start7;
                }
                int start8 = c4t.A07;
                if (start8 != Integer.MIN_VALUE) {
                    int remainingSpace3 = c4t.A07;
                    int start9 = c4s.A00;
                    c4t.A07 = remainingSpace3 + start9;
                    int start10 = c4t.A00;
                    if (start10 < 0) {
                        int remainingSpace4 = c4t.A07;
                        int start11 = c4t.A00;
                        c4t.A07 = remainingSpace4 + start11;
                    }
                    A0e(c04414w, c4t);
                }
                if (z && c4s.A02) {
                    break;
                }
            } else {
                break;
            }
        }
        int start12 = c4t.A00;
        return i - start12;
    }

    private int A09(com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53) {
        if (A0W() == 0) {
            return 0;
        }
        A29();
        return com.facebook.ads.redexgen.core.AnonymousClass57.A00(anonymousClass53, this.A04, A0R(!this.A0B, true), A0Q(!this.A0B, true), this, this.A0B);
    }

    private int A0A(com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53) {
        if (A0W() != 0) {
            A29();
            return com.facebook.ads.redexgen.core.AnonymousClass57.A02(anonymousClass53, this.A04, A0R(!this.A0B, true), A0Q(!this.A0B, true), this, this.A0B, this.A05);
        }
        if (A0G[3].charAt(25) != '2') {
            throw new java.lang.RuntimeException();
        }
        A0G[1] = "J9JFedtgHh7lzsKv2wGVe5URJzbGPRgH";
        return 0;
    }

    private int A0B(com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53) {
        if (A0W() == 0) {
            return 0;
        }
        A29();
        return com.facebook.ads.redexgen.core.AnonymousClass57.A01(anonymousClass53, this.A04, A0R(!this.A0B, true), A0Q(!this.A0B, true), this, this.A0B);
    }

    private final int A0C(com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53) {
        if (anonymousClass53.A06()) {
            return this.A04.A0B();
        }
        return 0;
    }

    private android.view.View A0D() {
        return A0H(0, A0W());
    }

    private android.view.View A0E() {
        return A0H(A0W() - 1, -1);
    }

    private android.view.View A0F() {
        return A0t(this.A05 ? 0 : A0W() - 1);
    }

    private android.view.View A0G() {
        return A0t(this.A05 ? A0W() - 1 : 0);
    }

    private final android.view.View A0H(int i, int i2) {
        int next;
        int acceptableBoundsFlag;
        int preferredBoundsFlag;
        A29();
        if (i2 > i) {
            next = 1;
        } else {
            next = i2 < i ? -1 : 0;
        }
        if (next == 0) {
            return A0t(i);
        }
        int preferredBoundsFlag2 = this.A04.A0F(A0t(i));
        int next2 = this.A04.A0A();
        if (preferredBoundsFlag2 < next2) {
            acceptableBoundsFlag = 16644;
            preferredBoundsFlag = 16388;
        } else {
            acceptableBoundsFlag = 4161;
            preferredBoundsFlag = androidx.fragment.app.FragmentTransaction.TRANSIT_FRAGMENT_OPEN;
        }
        int next3 = this.A00;
        if (next3 == 0) {
            return super.A04.A00(i, i2, acceptableBoundsFlag, preferredBoundsFlag);
        }
        return super.A05.A00(i, i2, acceptableBoundsFlag, preferredBoundsFlag);
    }

    private final android.view.View A0J(int i, int i2, boolean z, boolean z2) {
        int i3;
        A29();
        int i4 = 0;
        if (z) {
            i3 = 24579;
        } else {
            i3 = 320;
        }
        if (z2) {
            i4 = 320;
        }
        int i5 = this.A00;
        int acceptableBoundsFlag = A0G[5].charAt(29);
        if (acceptableBoundsFlag != 69) {
            throw new java.lang.RuntimeException();
        }
        A0G[5] = "CO2lCdhiUyNnJNyVLVKK7uQ85cne8EHP";
        if (i5 == 0) {
            return super.A04.A00(i, i2, i3, i4);
        }
        return super.A05.A00(i, i2, i3, i4);
    }

    private android.view.View A0K(com.facebook.ads.redexgen.core.C04414w c04414w, com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53) {
        return A28(c04414w, anonymousClass53, 0, A0W(), anonymousClass53.A03());
    }

    private android.view.View A0L(com.facebook.ads.redexgen.core.C04414w c04414w, com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53) {
        return A28(c04414w, anonymousClass53, A0W() - 1, -1, anonymousClass53.A03());
    }

    private android.view.View A0M(com.facebook.ads.redexgen.core.C04414w c04414w, com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53) {
        return this.A05 ? A0D() : A0E();
    }

    private android.view.View A0N(com.facebook.ads.redexgen.core.C04414w c04414w, com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53) {
        return this.A05 ? A0E() : A0D();
    }

    private android.view.View A0O(com.facebook.ads.redexgen.core.C04414w c04414w, com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53) {
        return this.A05 ? A0K(c04414w, anonymousClass53) : A0L(c04414w, anonymousClass53);
    }

    private android.view.View A0P(com.facebook.ads.redexgen.core.C04414w c04414w, com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53) {
        return this.A05 ? A0L(c04414w, anonymousClass53) : A0K(c04414w, anonymousClass53);
    }

    private android.view.View A0Q(boolean z, boolean z2) {
        if (this.A05) {
            return A0J(0, A0W(), z, z2);
        }
        return A0J(A0W() - 1, -1, z, z2);
    }

    private android.view.View A0R(boolean z, boolean z2) {
        if (this.A05) {
            return A0J(A0W() - 1, -1, z, z2);
        }
        return A0J(0, A0W(), z, z2);
    }

    private final com.facebook.ads.redexgen.core.C4T A0S() {
        return new com.facebook.ads.redexgen.core.C4T();
    }

    private void A0U() {
        if (this.A00 == 1 || !A2F()) {
            this.A05 = this.A0A;
        } else {
            this.A05 = !this.A0A;
        }
    }

    private void A0W(int i, int i2) {
        this.A07.A00 = this.A04.A07() - i2;
        this.A07.A03 = this.A05 ? -1 : 1;
        this.A07.A01 = i;
        this.A07.A05 = 1;
        this.A07.A06 = i2;
        this.A07.A07 = Integer.MIN_VALUE;
    }

    private void A0X(int i, int i2) {
        this.A07.A00 = i2 - this.A04.A0A();
        this.A07.A01 = i;
        this.A07.A03 = this.A05 ? 1 : -1;
        this.A07.A05 = -1;
        this.A07.A06 = i2;
        this.A07.A07 = Integer.MIN_VALUE;
    }

    private void A0Y(int i, int i2, boolean z, com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53) {
        int iA0A;
        this.A07.A09 = A0i();
        this.A07.A02 = A0C(anonymousClass53);
        this.A07.A05 = i;
        int i3 = -1;
        if (i == 1) {
            this.A07.A02 += this.A04.A08();
            android.view.View viewA0F = A0F();
            com.facebook.ads.redexgen.core.C4T c4t = this.A07;
            if (!this.A05) {
                i3 = 1;
            }
            c4t.A03 = i3;
            this.A07.A01 = A0p(viewA0F) + this.A07.A03;
            this.A07.A06 = this.A04.A0C(viewA0F);
            iA0A = this.A04.A0C(viewA0F) - this.A04.A07();
        } else {
            android.view.View viewA0G = A0G();
            this.A07.A02 += this.A04.A0A();
            this.A07.A03 = this.A05 ? 1 : -1;
            this.A07.A01 = A0p(viewA0G) + this.A07.A03;
            this.A07.A06 = this.A04.A0F(viewA0G);
            iA0A = (-this.A04.A0F(viewA0G)) + this.A04.A0A();
        }
        this.A07.A00 = i2;
        if (z) {
            com.facebook.ads.redexgen.core.C4T c4t2 = this.A07;
            int scrollingOffset = c4t2.A00;
            c4t2.A00 = scrollingOffset - iA0A;
        }
        this.A07.A07 = iA0A;
    }

    private void A0Z(com.facebook.ads.redexgen.core.C4R c4r) {
        A0W(c4r.A01, c4r.A00);
    }

    private void A0a(com.facebook.ads.redexgen.core.C4R c4r) {
        A0X(c4r.A01, c4r.A00);
    }

    private void A0b(com.facebook.ads.redexgen.core.C04414w c04414w, int i) {
        int iA0W = A0W();
        if (i < 0) {
            return;
        }
        int iA06 = this.A04.A06() - i;
        boolean z = this.A05;
        int limit = A0G[3].charAt(25);
        if (limit != 50) {
            throw new java.lang.RuntimeException();
        }
        A0G[1] = "5eQap7viEGWOuRbzagNYDGjkAWEMIhVp";
        if (z) {
            for (int i2 = 0; i2 < iA0W; i2++) {
                android.view.View viewA0t = A0t(i2);
                int childCount = this.A04.A0F(viewA0t);
                if (childCount >= iA06) {
                    int childCount2 = this.A04.A0H(viewA0t);
                    if (childCount2 >= iA06) {
                    }
                }
                int limit2 = A0G[4].length();
                if (limit2 != 13) {
                    java.lang.String[] strArr = A0G;
                    strArr[6] = "EiwXPaP";
                    strArr[2] = "4OvxlWI";
                    A0d(c04414w, 0, i2);
                    return;
                }
                A0d(c04414w, 0, i2);
                return;
            }
            return;
        }
        for (int i3 = iA0W - 1; i3 >= 0; i3--) {
            android.view.View viewA0t2 = A0t(i3);
            int childCount3 = this.A04.A0F(viewA0t2);
            if (childCount3 >= iA06) {
                int childCount4 = this.A04.A0H(viewA0t2);
                if (childCount4 >= iA06) {
                }
            }
            int childCount5 = iA0W - 1;
            A0d(c04414w, childCount5, i3);
            return;
        }
    }

    private void A0c(com.facebook.ads.redexgen.core.C04414w c04414w, int i) {
        if (i < 0) {
            return;
        }
        int iA0W = A0W();
        if (this.A05) {
            for (int i2 = iA0W - 1; i2 >= 0; i2--) {
                android.view.View viewA0t = A0t(i2);
                com.facebook.ads.redexgen.core.C4Y c4y = this.A04;
                int childCount = A0G[5].charAt(29);
                if (childCount != 69) {
                    throw new java.lang.RuntimeException();
                }
                A0G[3] = "CCkneFsBnjHsOQTiipl2DNgji2H70UcR";
                int limit = c4y.A0C(viewA0t);
                if (limit <= i) {
                    int limit2 = this.A04.A0G(viewA0t);
                    if (limit2 <= i) {
                    }
                }
                int limit3 = iA0W - 1;
                A0d(c04414w, limit3, i2);
                return;
            }
            return;
        }
        for (int i3 = 0; i3 < iA0W; i3++) {
            android.view.View viewA0t2 = A0t(i3);
            int limit4 = this.A04.A0C(viewA0t2);
            if (limit4 <= i) {
                int limit5 = this.A04.A0G(viewA0t2);
                if (limit5 <= i) {
                }
            }
            A0d(c04414w, 0, i3);
            return;
        }
    }

    private void A0d(com.facebook.ads.redexgen.core.C04414w c04414w, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 > i) {
            for (int i3 = i2 - 1; i3 >= i; i3--) {
                A14(i3, c04414w);
            }
            return;
        }
        while (i > i2) {
            A14(i, c04414w);
            i--;
        }
    }

    private void A0e(com.facebook.ads.redexgen.core.C04414w c04414w, com.facebook.ads.redexgen.core.C4T c4t) {
        if (!c4t.A0B || c4t.A09) {
            return;
        }
        if (c4t.A05 == -1) {
            A0b(c04414w, c4t.A07);
        } else {
            A0c(c04414w, c4t.A07);
        }
    }

    private void A0f(com.facebook.ads.redexgen.core.C04414w c04414w, com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53, int scrapExtraEnd, int scrapExtraEnd2) {
        if (!anonymousClass53.A08() || A0W() == 0 || anonymousClass53.A07() || !A22()) {
            return;
        }
        int iA0D = 0;
        int scrapExtraStart = 0;
        java.util.List<com.facebook.ads.redexgen.core.AnonymousClass56> listA0J = c04414w.A0J();
        int i = listA0J.size();
        int iA0p = A0p(A0t(0));
        for (int scrapSize = 0; scrapSize < i; scrapSize++) {
            com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56 = listA0J.get(scrapSize);
            if (!anonymousClass56.A0a()) {
                int direction = 1;
                if ((anonymousClass56.A0I() < iA0p) != this.A05) {
                    direction = -1;
                }
                if (direction == -1) {
                    iA0D += this.A04.A0D(anonymousClass56.A0H);
                } else {
                    scrapExtraStart += this.A04.A0D(anonymousClass56.A0H);
                }
            }
        }
        this.A07.A08 = listA0J;
        if (iA0D > 0) {
            A0X(A0p(A0G()), scrapExtraEnd);
            this.A07.A02 = iA0D;
            this.A07.A00 = 0;
            this.A07.A04();
            A08(c04414w, this.A07, anonymousClass53, false);
        }
        if (scrapExtraStart > 0) {
            A0W(A0p(A0F()), scrapExtraEnd2);
            this.A07.A02 = scrapExtraStart;
            this.A07.A00 = 0;
            this.A07.A04();
            A08(c04414w, this.A07, anonymousClass53, false);
        }
        this.A07.A08 = null;
    }

    private void A0g(com.facebook.ads.redexgen.core.C04414w c04414w, com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53, com.facebook.ads.redexgen.core.C4R c4r) {
        if (A0k(anonymousClass53, c4r) || A0j(c04414w, anonymousClass53, c4r)) {
            return;
        }
        c4r.A02();
        c4r.A01 = this.A0C ? anonymousClass53.A03() - 1 : 0;
    }

    private final void A0h(boolean z) {
        A1y(null);
        if (z == this.A0A) {
            return;
        }
        this.A0A = z;
        A0y();
    }

    private final boolean A0i() {
        return this.A04.A09() == 0 && this.A04.A06() == 0;
    }

    private boolean A0j(com.facebook.ads.redexgen.core.C04414w c04414w, com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53, com.facebook.ads.redexgen.core.C4R c4r) {
        android.view.View viewA0P;
        int iA0A;
        if (A0W() == 0) {
            return false;
        }
        android.view.View viewA0s = A0s();
        if (viewA0s != null && c4r.A06(viewA0s, anonymousClass53)) {
            c4r.A05(viewA0s);
            return true;
        }
        if (this.A08 != this.A0C) {
            return false;
        }
        if (c4r.A02) {
            viewA0P = A0O(c04414w, anonymousClass53);
        } else {
            viewA0P = A0P(c04414w, anonymousClass53);
        }
        if (viewA0P == null) {
            return false;
        }
        c4r.A04(viewA0P);
        if (!anonymousClass53.A07() && A22()) {
            if (this.A04.A0F(viewA0P) >= this.A04.A07() || this.A04.A0C(viewA0P) < this.A04.A0A()) {
                if (c4r.A02) {
                    iA0A = this.A04.A07();
                } else {
                    iA0A = this.A04.A0A();
                }
                c4r.A00 = iA0A;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b2, code lost:
    
        if ((r7 - r6) < 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b4, code lost:
    
        r10.A00 = r8.A04.A0A();
        r10.A02 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00be, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c7, code lost:
    
        if ((r7 - r6) < 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ca, code lost:
    
        r1 = r8.A04.A07() - r8.A04.A0C(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d7, code lost:
    
        if (r1 >= 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d9, code lost:
    
        r10.A00 = r8.A04.A07();
        r10.A02 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e3, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e6, code lost:
    
        if (r10.A02 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e8, code lost:
    
        r1 = r8.A04.A0C(r5);
        r1 = r1 + r8.A04.A05();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f5, code lost:
    
        r10.A00 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f8, code lost:
    
        r1 = r8.A04.A0F(r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean A0k(com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53, com.facebook.ads.redexgen.core.C4R c4r) {
        if (anonymousClass53.A07() || this.A01 == -1) {
            return false;
        }
        int i = this.A01;
        if (A0G[7].charAt(1) != 'F') {
            throw new java.lang.RuntimeException();
        }
        A0G[7] = "TFIDoufW7PPC7ZEj7Y5tPHllsDSURNN1";
        if (i < 0 || this.A01 >= anonymousClass53.A03()) {
            this.A01 = -1;
            this.A02 = Integer.MIN_VALUE;
            return false;
        }
        c4r.A01 = this.A01;
        if (this.A03 != null && this.A03.A01()) {
            c4r.A02 = this.A03.A02;
            if (c4r.A02) {
                c4r.A00 = this.A04.A07() - this.A03.A00;
            } else {
                c4r.A00 = this.A04.A0A() + this.A03.A00;
            }
            return true;
        }
        if (this.A02 == Integer.MIN_VALUE) {
            android.view.View viewA1m = A1m(this.A01);
            if (viewA1m != null) {
                if (this.A04.A0D(viewA1m) > this.A04.A0B()) {
                    c4r.A02();
                    return true;
                }
                int iA0F = this.A04.A0F(viewA1m);
                int iA0A = this.A04.A0A();
                if (A0G[7].charAt(1) != 'F') {
                    A0G[1] = "BfWLqmz6tLXTBl9sOf8GvQUpsUyqil7O";
                } else {
                    A0G[3] = "F1yYn32nqotC7GL2fjmWFlYeH2UBHhCV";
                }
            } else {
                if (A0W() > 0) {
                    android.view.View child = A0t(0);
                    c4r.A02 = (this.A01 < A0p(child)) == this.A05;
                }
                c4r.A02();
            }
            return true;
        }
        boolean z = this.A05;
        if (A0G[5].charAt(29) != 'E') {
            throw new java.lang.RuntimeException();
        }
        A0G[7] = "6FIelR57229tmCeHfVqBadRckpOvBeMr";
        c4r.A02 = z;
        if (this.A05) {
            c4r.A00 = this.A04.A07() - this.A02;
        } else {
            c4r.A00 = this.A04.A0A() + this.A02;
        }
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04344o
    public int A1d(int i, com.facebook.ads.redexgen.core.C04414w c04414w, com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53) {
        if (this.A00 == 1) {
            return 0;
        }
        return A04(i, c04414w, anonymousClass53);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04344o
    public int A1e(int i, com.facebook.ads.redexgen.core.C04414w c04414w, com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53) {
        if (this.A00 == 0) {
            return 0;
        }
        return A04(i, c04414w, anonymousClass53);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04344o
    public final int A1f(com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53) {
        return A09(anonymousClass53);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04344o
    public final int A1g(com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53) {
        return A0A(anonymousClass53);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04344o
    public final int A1h(com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53) {
        return A0B(anonymousClass53);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04344o
    public final int A1i(com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53) {
        return A09(anonymousClass53);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04344o
    public final int A1j(com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53) {
        return A0A(anonymousClass53);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04344o
    public final int A1k(com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53) {
        return A0B(anonymousClass53);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04344o
    public final android.os.Parcelable A1l() {
        if (this.A03 != null) {
            return new com.facebook.ads.internal.util.parcelable.WrappedParcelable(new com.facebook.ads.internal.androidx.support.v7.widget.LinearLayoutManager$SavedState(this.A03));
        }
        com.facebook.ads.internal.androidx.support.v7.widget.LinearLayoutManager$SavedState linearLayoutManager$SavedState = new com.facebook.ads.internal.androidx.support.v7.widget.LinearLayoutManager$SavedState();
        if (A0W() > 0) {
            A29();
            boolean didLayoutFromEnd = this.A08 ^ this.A05;
            linearLayoutManager$SavedState.A02 = didLayoutFromEnd;
            if (didLayoutFromEnd) {
                android.view.View refChild = A0F();
                linearLayoutManager$SavedState.A00 = this.A04.A07() - this.A04.A0C(refChild);
                linearLayoutManager$SavedState.A01 = A0p(refChild);
            } else {
                android.view.View viewA0G = A0G();
                linearLayoutManager$SavedState.A01 = A0p(viewA0G);
                linearLayoutManager$SavedState.A00 = this.A04.A0F(viewA0G) - this.A04.A0A();
            }
        } else {
            linearLayoutManager$SavedState.A00();
        }
        return new com.facebook.ads.internal.util.parcelable.WrappedParcelable(linearLayoutManager$SavedState);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04344o
    public final android.view.View A1m(int i) {
        int firstChild = A0W();
        if (firstChild == 0) {
            return null;
        }
        int childCount = i - A0p(A0t(0));
        if (childCount >= 0 && childCount < firstChild) {
            android.view.View viewA0t = A0t(childCount);
            if (A0p(viewA0t) == i) {
                return viewA0t;
            }
        }
        return super.A1m(i);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04344o
    public android.view.View A1n(android.view.View view, int i, com.facebook.ads.redexgen.core.C04414w c04414w, com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53) {
        int maxScroll;
        android.view.View nextFocus;
        android.view.View viewA0F;
        A0U();
        if (A0W() == 0 || (maxScroll = A27(i)) == Integer.MIN_VALUE) {
            return null;
        }
        A29();
        A29();
        int layoutDir = this.A04.A0B();
        A0Y(maxScroll, (int) (layoutDir * 0.33333334f), false, anonymousClass53);
        this.A07.A07 = Integer.MIN_VALUE;
        this.A07.A0B = false;
        A08(c04414w, this.A07, anonymousClass53, true);
        if (maxScroll == -1) {
            nextFocus = A0N(c04414w, anonymousClass53);
        } else {
            nextFocus = A0M(c04414w, anonymousClass53);
        }
        if (maxScroll == -1) {
            viewA0F = A0G();
        } else {
            viewA0F = A0F();
        }
        if (viewA0F.hasFocusable()) {
            if (nextFocus == null) {
                return null;
            }
            return viewA0F;
        }
        return nextFocus;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04344o
    public com.facebook.ads.redexgen.core.C04354p A1o() {
        return new com.facebook.ads.redexgen.core.C04354p(-2, -2);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04344o
    public void A1p(int i) {
        this.A01 = i;
        this.A02 = Integer.MIN_VALUE;
        if (this.A03 != null) {
            this.A03.A00();
        }
        A0y();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04344o
    public final void A1q(int i, int i2, com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53, com.facebook.ads.redexgen.core.InterfaceC04324m interfaceC04324m) {
        if (this.A00 != 0) {
            i = i2;
        }
        int delta = A0W();
        if (delta == 0 || i == 0) {
            return;
        }
        A29();
        int i3 = i > 0 ? 1 : -1;
        int delta2 = java.lang.Math.abs(i);
        A0Y(i3, delta2, true, anonymousClass53);
        A2E(anonymousClass53, this.A07, interfaceC04324m);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04344o
    public final void A1r(int i, com.facebook.ads.redexgen.core.InterfaceC04324m interfaceC04324m) {
        boolean z;
        int direction;
        if (this.A03 != null && this.A03.A01()) {
            z = this.A03.A02;
            direction = this.A03.A01;
        } else {
            A0U();
            z = this.A05;
            if (this.A01 == -1) {
                direction = z ? i - 1 : 0;
            } else {
                direction = this.A01;
            }
        }
        int anchorPos = z ? -1 : 1;
        for (int i2 = 0; i2 < this.A06 && direction >= 0 && direction < i; i2++) {
            interfaceC04324m.A3o(direction, 0);
            direction += anchorPos;
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04344o
    public final void A1s(android.os.Parcelable parcelable) {
        java.lang.ClassLoader classLoader;
        if (!(parcelable instanceof com.facebook.ads.internal.util.parcelable.WrappedParcelable) || (classLoader = getClass().getClassLoader()) == null) {
            return;
        }
        android.os.Parcelable state = ((com.facebook.ads.internal.util.parcelable.WrappedParcelable) parcelable).unwrap(classLoader);
        if (state instanceof com.facebook.ads.internal.androidx.support.v7.widget.LinearLayoutManager$SavedState) {
            this.A03 = (com.facebook.ads.internal.androidx.support.v7.widget.LinearLayoutManager$SavedState) state;
            A0y();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04344o
    public final void A1t(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.A1t(accessibilityEvent);
        if (A0W() > 0) {
            accessibilityEvent.setFromIndex(A24());
            if (A0G[1].charAt(13) == 'I') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0G;
            strArr[6] = "JM0e54P";
            strArr[2] = "62qYDCA";
            accessibilityEvent.setToIndex(A25());
        }
    }

    /* JADX WARN: Code duplicated, block: B:86:0x0242  */
    @Override // com.facebook.ads.redexgen.core.AbstractC04344o
    public void A1u(com.facebook.ads.redexgen.core.C04414w c04414w, com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53) {
        int startOffset;
        int fixOffset;
        int extraForStart;
        android.view.View viewA1m;
        int fixOffset2;
        int extraForStart2 = -1;
        if ((this.A03 != null || this.A01 != -1) && anonymousClass53.A03() == 0) {
            A1I(c04414w);
            return;
        }
        if (this.A03 != null && this.A03.A01()) {
            this.A01 = this.A03.A01;
        }
        A29();
        com.facebook.ads.redexgen.core.C4T c4t = this.A07;
        if (A0G[4].length() == 13) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A0G;
        strArr[6] = "TEU8GGg";
        strArr[2] = "lg12FnG";
        c4t.A0B = false;
        A0U();
        android.view.View viewA0s = A0s();
        if (!this.A0D.A03 || this.A01 != -1 || this.A03 != null) {
            this.A0D.A03();
            this.A0D.A02 = this.A05 ^ this.A0C;
            A0g(c04414w, anonymousClass53, this.A0D);
            this.A0D.A03 = true;
        } else if (viewA0s != null) {
            int startOffset2 = this.A04.A0F(viewA0s);
            int lastElement = this.A04.A07();
            if (A0G[0].charAt(9) != '8') {
                A0G[1] = "cu8BBcv0k6hBgzqZsr0VN3sfifuVMQ62";
                if (startOffset2 < lastElement) {
                    if (this.A04.A0C(viewA0s) <= this.A04.A0A()) {
                    }
                }
            } else if (startOffset2 < lastElement) {
                if (this.A04.A0C(viewA0s) <= this.A04.A0A()) {
                }
            }
            this.A0D.A05(viewA0s);
        }
        int lastElement2 = A0C(anonymousClass53);
        if (this.A07.A04 >= 0) {
            startOffset = 0;
        } else {
            startOffset = lastElement2;
            lastElement2 = 0;
        }
        int current = startOffset + this.A04.A0A();
        int startOffset3 = lastElement2 + this.A04.A08();
        if (anonymousClass53.A07() && this.A01 != -1 && this.A02 != Integer.MIN_VALUE && (viewA1m = A1m(this.A01)) != null) {
            if (this.A05) {
                fixOffset2 = (this.A04.A07() - this.A04.A0C(viewA1m)) - this.A02;
            } else {
                fixOffset2 = this.A02 - (this.A04.A0F(viewA1m) - this.A04.A0A());
            }
            if (fixOffset2 > 0) {
                current += fixOffset2;
            } else {
                startOffset3 -= fixOffset2;
            }
        }
        if (this.A0D.A02) {
            if (this.A05) {
                extraForStart2 = 1;
            }
        } else if (!this.A05) {
            extraForStart2 = 1;
        }
        A2C(c04414w, anonymousClass53, this.A0D, extraForStart2);
        A1H(c04414w);
        this.A07.A09 = A0i();
        this.A07.A0A = anonymousClass53.A07();
        if (this.A0D.A02) {
            A0a(this.A0D);
            this.A07.A02 = current;
            A08(c04414w, this.A07, anonymousClass53, false);
            extraForStart = this.A07.A06;
            int extraForEnd = this.A07.A01;
            if (this.A07.A00 > 0) {
                com.facebook.ads.redexgen.core.C4T c4t2 = this.A07;
                if (A0G[7].charAt(1) != 'F') {
                    java.lang.String[] strArr2 = A0G;
                    strArr2[6] = "MJWLhmn";
                    strArr2[2] = "Xdeja1C";
                    startOffset3 += c4t2.A00;
                } else {
                    A0G[3] = "HkWuM96xU0ciNRE25G4cwktgC29lbS6I";
                    startOffset3 += c4t2.A00;
                }
            }
            A0Z(this.A0D);
            this.A07.A02 = startOffset3;
            this.A07.A01 += this.A07.A03;
            A08(c04414w, this.A07, anonymousClass53, false);
            fixOffset = this.A07.A06;
            if (this.A07.A00 > 0) {
                int i = this.A07.A00;
                A0X(extraForEnd, extraForStart);
                this.A07.A02 = i;
                A08(c04414w, this.A07, anonymousClass53, false);
                extraForStart = this.A07.A06;
            }
        } else {
            A0Z(this.A0D);
            this.A07.A02 = startOffset3;
            A08(c04414w, this.A07, anonymousClass53, false);
            fixOffset = this.A07.A06;
            int extraForEnd2 = this.A07.A01;
            if (this.A07.A00 > 0) {
                current += this.A07.A00;
            }
            A0a(this.A0D);
            this.A07.A02 = current;
            this.A07.A01 += this.A07.A03;
            A08(c04414w, this.A07, anonymousClass53, false);
            extraForStart = this.A07.A06;
            if (this.A07.A00 > 0) {
                int i2 = this.A07.A00;
                A0W(extraForEnd2, fixOffset);
                this.A07.A02 = i2;
                A08(c04414w, this.A07, anonymousClass53, false);
                fixOffset = this.A07.A06;
            }
        }
        if (A0W() > 0) {
            if (this.A05 ^ this.A0C) {
                int iA05 = A05(fixOffset, c04414w, anonymousClass53, true);
                int extraForStart3 = extraForStart + iA05;
                int fixOffset3 = fixOffset + iA05;
                int iA06 = A06(extraForStart3, c04414w, anonymousClass53, false);
                extraForStart = extraForStart3 + iA06;
                fixOffset = fixOffset3 + iA06;
            } else {
                int iA07 = A06(extraForStart, c04414w, anonymousClass53, true);
                int extraForStart4 = extraForStart + iA07;
                int fixOffset4 = fixOffset + iA07;
                int iA08 = A05(fixOffset4, c04414w, anonymousClass53, false);
                extraForStart = extraForStart4 + iA08;
                fixOffset = fixOffset4 + iA08;
            }
        }
        A0f(c04414w, anonymousClass53, extraForStart, fixOffset);
        if (!anonymousClass53.A07()) {
            this.A04.A0I();
        } else {
            this.A0D.A03();
        }
        this.A08 = this.A0C;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04344o
    public void A1v(com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53) {
        super.A1v(anonymousClass53);
        this.A03 = null;
        this.A01 = -1;
        this.A02 = Integer.MIN_VALUE;
        this.A0D.A03();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04344o
    public final void A1w(com.facebook.ads.redexgen.core.FL fl, com.facebook.ads.redexgen.core.C04414w c04414w) {
        super.A1w(fl, c04414w);
        if (this.A09) {
            A1I(c04414w);
            c04414w.A0P();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04344o
    public void A1x(com.facebook.ads.redexgen.core.FL fl, com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53, int i) {
        com.facebook.ads.redexgen.core.C1260as linearSmoothScroller = new com.facebook.ads.redexgen.core.C1260as(fl.getContext());
        linearSmoothScroller.A0A(i);
        A1L(linearSmoothScroller);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04344o
    public final void A1y(java.lang.String str) {
        if (this.A03 == null) {
            super.A1y(str);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04344o
    public final boolean A1z() {
        return (A0Y() == 1073741824 || A0i() == 1073741824 || !A1S()) ? false : true;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04344o
    public final boolean A20() {
        return this.A00 == 0;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04344o
    public final boolean A21() {
        return this.A00 == 1;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04344o
    public boolean A22() {
        return this.A03 == null && this.A08 == this.A0C;
    }

    public final int A23() {
        android.view.View child = A0J(0, A0W(), true, false);
        if (child == null) {
            return -1;
        }
        return A0p(child);
    }

    public final int A24() {
        android.view.View child = A0J(0, A0W(), false, true);
        if (child == null) {
            return -1;
        }
        return A0p(child);
    }

    public final int A25() {
        android.view.View child = A0J(A0W() - 1, -1, false, true);
        if (child == null) {
            return -1;
        }
        return A0p(child);
    }

    public final int A26() {
        return this.A00;
    }

    public final int A27(int i) {
        switch (i) {
            case 1:
                if (this.A00 == 1) {
                    return -1;
                }
                boolean zA2F = A2F();
                if (A0G[4].length() != 13) {
                    A0G[7] = "JFBGAdvw0W46p1IiHd184rfjlhxsbjRk";
                    return zA2F ? 1 : -1;
                }
                break;
            case 2:
                return (this.A00 != 1 && A2F()) ? -1 : 1;
            case 17:
                if (this.A00 == 0) {
                    return -1;
                }
                return Integer.MIN_VALUE;
            case 33:
                if (this.A00 == 1) {
                    return -1;
                }
                return Integer.MIN_VALUE;
            case 66:
                int i2 = this.A00;
                java.lang.String[] strArr = A0G;
                if (strArr[6].length() == strArr[2].length()) {
                    A0G[0] = "A4gNOGqmCbgTlyYHXDAs3UqrHjABAhAn";
                    return i2 == 0 ? 1 : Integer.MIN_VALUE;
                }
                break;
            case 130:
                return this.A00 == 1 ? 1 : Integer.MIN_VALUE;
            default:
                return Integer.MIN_VALUE;
        }
        throw new java.lang.RuntimeException();
    }

    public android.view.View A28(com.facebook.ads.redexgen.core.C04414w c04414w, com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53, int i, int i2, int i3) {
        A29();
        android.view.View view = null;
        android.view.View view2 = null;
        int iA0A = this.A04.A0A();
        int boundsEnd = this.A04.A07();
        int boundsStart = i2 > i ? 1 : -1;
        while (i != i2) {
            android.view.View outOfBoundsMatch = A0t(i);
            int iA0p = A0p(outOfBoundsMatch);
            if (iA0p >= 0 && iA0p < i3) {
                if (((com.facebook.ads.redexgen.core.C04354p) outOfBoundsMatch.getLayoutParams()).A02()) {
                    if (view == null) {
                        view = outOfBoundsMatch;
                    }
                } else if (this.A04.A0F(outOfBoundsMatch) >= boundsEnd || this.A04.A0C(outOfBoundsMatch) < iA0A) {
                    if (view2 == null) {
                        view2 = outOfBoundsMatch;
                    }
                } else {
                    return outOfBoundsMatch;
                }
            }
            i += boundsStart;
        }
        return view2 != null ? view2 : view;
    }

    public final void A29() {
        if (this.A07 == null) {
            com.facebook.ads.redexgen.core.C4T c4tA0S = A0S();
            if (A0G[3].charAt(25) != '2') {
                throw new java.lang.RuntimeException();
            }
            A0G[7] = "6FRvOBuqOIFmnj4QgnBJgNDOjl7oudHL";
            this.A07 = c4tA0S;
        }
        if (this.A04 == null) {
            this.A04 = com.facebook.ads.redexgen.core.C4Y.A02(this, this.A00);
        }
    }

    public final void A2A(int i) {
        if (i == 0 || i == 1) {
            A1y(null);
            if (i == this.A00) {
                return;
            }
            this.A00 = i;
            this.A04 = null;
            A0y();
            return;
        }
        throw new java.lang.IllegalArgumentException(A0T(0, 20, 45) + i);
    }

    public final void A2B(int i, int i2) {
        this.A01 = i;
        this.A02 = i2;
        if (this.A03 != null) {
            this.A03.A00();
        }
        A0y();
    }

    public void A2C(com.facebook.ads.redexgen.core.C04414w c04414w, com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53, com.facebook.ads.redexgen.core.C4R c4r, int i) {
    }

    public void A2D(com.facebook.ads.redexgen.core.C04414w c04414w, com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53, com.facebook.ads.redexgen.core.C4T c4t, com.facebook.ads.redexgen.core.C4S c4s) {
        int iA0g;
        int right;
        int iA0e;
        int iA0E;
        android.view.View viewA03 = c4t.A03(c04414w);
        if (viewA03 == null) {
            c4s.A01 = true;
            return;
        }
        com.facebook.ads.redexgen.core.C04354p c04354p = (com.facebook.ads.redexgen.core.C04354p) viewA03.getLayoutParams();
        if (c4t.A08 == null) {
            if (this.A05 == (c4t.A05 == -1)) {
                A17(viewA03);
            } else {
                A19(viewA03, 0);
            }
        } else {
            boolean z = this.A05;
            int bottom = c4t.A05;
            if (z == (bottom == -1)) {
                A16(viewA03);
            } else {
                A18(viewA03, 0);
            }
        }
        A1A(viewA03, 0, 0);
        c4s.A00 = this.A04.A0D(viewA03);
        if (this.A00 == 1) {
            if (A2F()) {
                iA0E = A0h() - A0f();
                iA0e = iA0E - this.A04.A0E(viewA03);
            } else {
                iA0e = A0e();
                iA0E = this.A04.A0E(viewA03) + iA0e;
            }
            if (c4t.A05 == -1) {
                right = c4t.A06;
                iA0g = c4t.A06 - c4s.A00;
            } else {
                iA0g = c4t.A06;
                right = c4t.A06 + c4s.A00;
            }
        } else {
            iA0g = A0g();
            right = this.A04.A0E(viewA03) + iA0g;
            int bottom2 = c4t.A05;
            if (bottom2 == -1) {
                iA0E = c4t.A06;
                int i = c4t.A06;
                int bottom3 = c4s.A00;
                iA0e = i - bottom3;
            } else {
                iA0e = c4t.A06;
                int i2 = c4t.A06;
                int bottom4 = c4s.A00;
                iA0E = i2 + bottom4;
            }
        }
        A1B(viewA03, iA0e, iA0g, iA0E, right);
        if (c04354p.A02() || c04354p.A01()) {
            c4s.A03 = true;
        }
        c4s.A02 = viewA03.hasFocusable();
    }

    public void A2E(com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53, com.facebook.ads.redexgen.core.C4T c4t, com.facebook.ads.redexgen.core.InterfaceC04324m interfaceC04324m) {
        int i = c4t.A01;
        if (i >= 0) {
            int pos = anonymousClass53.A03();
            if (i < pos) {
                int pos2 = c4t.A07;
                interfaceC04324m.A3o(i, java.lang.Math.max(0, pos2));
            }
        }
    }

    public final boolean A2F() {
        return A0a() == 1;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass50
    public final android.graphics.PointF A4k(int i) {
        if (A0W() == 0) {
            return null;
        }
        boolean z = i < A0p(A0t(0));
        boolean z2 = this.A05;
        int firstChildPos = A0G[4].length();
        if (firstChildPos == 13) {
            throw new java.lang.RuntimeException();
        }
        A0G[7] = "FFnbbIQmxzlcCB5QJgqtb02Njm6aLfkX";
        int i2 = z != z2 ? -1 : 1;
        int direction = this.A00;
        if (direction == 0) {
            return new android.graphics.PointF(i2, 0.0f);
        }
        return new android.graphics.PointF(0.0f, i2);
    }
}

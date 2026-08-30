package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C05619z {
    public static java.lang.String[] A0C = {"SD", "YErhAKhoPoHO5JcEqCBGFqT2VStp1TyC", "4nv8DO5j3lb6Mdbyys8fgVzZqlsTdLry", "qjEmQJ3wIXjwZ0GHyvyvCADunUAuqpjO", "GXkzr7370MakhENzuenfkB0eq9kFXv2R", "1aejgQpeBJQ", "itEEkzdbLzIQ5uhNoBodYKCVqRWw6l67", "d1pp0oBGZIx5DTsWzGpHk31c0cFELqne"};
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public com.facebook.ads.redexgen.core.C05599x A04;
    public com.facebook.ads.redexgen.core.C05599x A05;
    public com.facebook.ads.redexgen.core.C05599x A06;
    public com.facebook.ads.redexgen.core.AM A07;
    public java.lang.Object A08;
    public boolean A09;
    public final com.facebook.ads.redexgen.core.AK A0A = new com.facebook.ads.redexgen.core.AK();
    public final com.facebook.ads.redexgen.core.AL A0B = new com.facebook.ads.redexgen.core.AL();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 22 out of bounds for length 22
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private com.facebook.ads.redexgen.core.C05609y A02(int i, long j, long j2) {
        com.facebook.ads.redexgen.core.Et et = new com.facebook.ads.redexgen.core.Et(i, j2);
        this.A07.A09(et.A02, this.A0A);
        int iA04 = this.A0A.A04(j);
        long jA09 = iA04 == -1 ? Long.MIN_VALUE : this.A0A.A09(iA04);
        boolean zA0A = A0A(et, jA09);
        return new com.facebook.ads.redexgen.core.C05609y(et, j, jA09, androidx.media3.common.C.TIME_UNSET, jA09 == Long.MIN_VALUE ? this.A0A.A07() : jA09, zA0A, A0B(et, zA0A));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private com.facebook.ads.redexgen.core.C05609y A03(com.facebook.ads.redexgen.core.C05599x c05599x, long j) {
        long jLongValue;
        com.facebook.ads.redexgen.core.C05609y c05609y = c05599x.A02;
        if (c05609y.A06) {
            int iA03 = this.A07.A03(c05609y.A04.A02, this.A0A, this.A0B, this.A01, this.A09);
            if (iA03 == -1) {
                return null;
            }
            int i = this.A07.A0A(iA03, this.A0A, true).A00;
            java.lang.Object obj = this.A0A.A03;
            long j2 = c05609y.A04.A03;
            if (this.A07.A0B(i, this.A0B).A00 == iA03) {
                android.util.Pair<java.lang.Integer, java.lang.Long> pairA08 = this.A07.A08(this.A0B, this.A0A, i, androidx.media3.common.C.TIME_UNSET, java.lang.Math.max(0L, (c05599x.A07() + c05609y.A01) - j));
                if (pairA08 == null) {
                    java.lang.String[] strArr = A0C;
                    if (strArr[2].charAt(19) != strArr[4].charAt(19)) {
                        throw new java.lang.RuntimeException();
                    }
                    A0C[5] = "RfWnK2Yyhbj";
                    return null;
                }
                iA03 = ((java.lang.Integer) pairA08.first).intValue();
                jLongValue = ((java.lang.Long) pairA08.second).longValue();
                if (c05599x.A01 == null || !c05599x.A01.A09.equals(obj)) {
                    j2 = this.A02;
                    this.A02 = j2 + 1;
                } else {
                    j2 = c05599x.A01.A02.A04.A03;
                }
                java.lang.String[] strArr2 = A0C;
                if (strArr2[7].charAt(25) == strArr2[6].charAt(25)) {
                    throw new java.lang.RuntimeException();
                }
                A0C[0] = "9O";
            } else {
                jLongValue = 0;
            }
            return A06(A07(iA03, jLongValue, j2), jLongValue, jLongValue);
        }
        com.facebook.ads.redexgen.core.Et et = c05609y.A04;
        this.A07.A09(et.A02, this.A0A);
        if (et.A01()) {
            int i2 = et.A00;
            int iA01 = this.A0A.A01(i2);
            if (iA01 != -1) {
                int iA04 = this.A0A.A03(i2, et.A01);
                if (iA04 >= iA01) {
                    return A02(et.A02, c05609y.A00, et.A03);
                }
                if (this.A0A.A0E(i2, iA04)) {
                    return A01(et.A02, i2, iA04, c05609y.A00, et.A03);
                }
                return null;
            }
            java.lang.String[] strArr3 = A0C;
            if (strArr3[2].charAt(19) != strArr3[4].charAt(19)) {
                return null;
            }
            java.lang.String[] strArr4 = A0C;
            strArr4[7] = "7zgqZ6WWzHmmqPblEioaJN2bcKHGrBAI";
            strArr4[6] = "Cs5FGi3SA7t6W0gmOhYnK70NiHLGkBqx";
            return null;
        }
        if (c05609y.A02 != Long.MIN_VALUE) {
            int iA05 = this.A0A.A05(c05609y.A02);
            if (iA05 == -1) {
                return A02(et.A02, c05609y.A02, et.A03);
            }
            int iA02 = this.A0A.A02(iA05);
            if (this.A0A.A0E(iA05, iA02)) {
                return A01(et.A02, iA05, iA02, c05609y.A02, et.A03);
            }
            return null;
        }
        int iA00 = this.A0A.A00();
        java.lang.String[] strArr5 = A0C;
        if (strArr5[3].charAt(8) != strArr5[1].charAt(8)) {
            A0C[0] = "wj";
            if (iA00 == 0) {
                return null;
            }
        } else if (iA00 == 0) {
            return null;
        }
        int i3 = iA00 - 1;
        com.facebook.ads.redexgen.core.AK ak = this.A0A;
        if (A0C[0].length() != 2) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr6 = A0C;
        strArr6[3] = "VmafS5x0USKT3bX56Sh5G7yfuCiR0ECp";
        strArr6[1] = "jdmLnQmjPF3iio1UvFs2J48PpGnAnjtG";
        if (ak.A09(i3) != Long.MIN_VALUE || this.A0A.A0D(i3)) {
            return null;
        }
        int iA06 = this.A0A.A02(i3);
        if (!this.A0A.A0E(i3, iA06)) {
            return null;
        }
        return A01(et.A02, i3, iA06, this.A0A.A07(), et.A03);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 19
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private com.facebook.ads.redexgen.core.C05609y A04(com.facebook.ads.redexgen.core.C05609y c05609y, com.facebook.ads.redexgen.core.Et et) {
        long jA07;
        long j = c05609y.A03;
        long j2 = c05609y.A02;
        boolean zA0A = A0A(et, j2);
        boolean zA0B = A0B(et, zA0A);
        this.A07.A09(et.A02, this.A0A);
        if (et.A01()) {
            jA07 = this.A0A.A0A(et.A00, et.A01);
        } else {
            jA07 = j2 == Long.MIN_VALUE ? this.A0A.A07() : j2;
        }
        return new com.facebook.ads.redexgen.core.C05609y(et, j, j2, c05609y.A00, jA07, zA0A, zA0B);
    }

    private long A00(int i) {
        java.lang.Object obj = this.A07.A0A(i, this.A0A, true).A03;
        int holderWindowIndex = this.A0A.A00;
        java.lang.Object periodUid = this.A08;
        if (periodUid != null) {
            com.facebook.ads.redexgen.core.AM am = this.A07;
            java.lang.Object periodUid2 = this.A08;
            int oldFrontPeriodIndex = am.A04(periodUid2);
            if (oldFrontPeriodIndex != -1 && this.A07.A09(oldFrontPeriodIndex, this.A0A).A00 == holderWindowIndex) {
                return this.A03;
            }
        }
        for (com.facebook.ads.redexgen.core.C05599x c05599xA0E = A0E(); c05599xA0E != null; c05599xA0E = c05599xA0E.A01) {
            java.lang.Object periodUid3 = c05599xA0E.A09;
            if (periodUid3.equals(obj)) {
                return c05599xA0E.A02.A04.A03;
            }
        }
        for (com.facebook.ads.redexgen.core.C05599x c05599xA0E2 = A0E(); c05599xA0E2 != null; c05599xA0E2 = c05599xA0E2.A01) {
            com.facebook.ads.redexgen.core.AM am2 = this.A07;
            java.lang.Object periodUid4 = c05599xA0E2.A09;
            int iA04 = am2.A04(periodUid4);
            if (iA04 != -1 && this.A07.A09(iA04, this.A0A).A00 == holderWindowIndex) {
                return c05599xA0E2.A02.A04.A03;
            }
        }
        long j = this.A02;
        long j2 = 1 + j;
        java.lang.String[] strArr = A0C;
        java.lang.String str = strArr[3];
        java.lang.String str2 = strArr[1];
        int windowIndex = str.charAt(8);
        if (windowIndex == str2.charAt(8)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0C;
        strArr2[2] = "2Y54STJJyMHaXaS5RPefAOPYISy1E85Y";
        strArr2[4] = "6EgyLqFQ36hKoQjXu3lfzUAUfA5pLivv";
        this.A02 = j2;
        return j;
    }

    private com.facebook.ads.redexgen.core.C05609y A01(int i, int i2, int i3, long j, long j2) {
        long jA06;
        com.facebook.ads.redexgen.core.Et et = new com.facebook.ads.redexgen.core.Et(i, i2, i3, j2);
        boolean zA0A = A0A(et, Long.MIN_VALUE);
        boolean zA0B = A0B(et, zA0A);
        long jA0A = this.A07.A09(et.A02, this.A0A).A0A(et.A00, et.A01);
        if (i3 == this.A0A.A02(i2)) {
            com.facebook.ads.redexgen.core.AK ak = this.A0A;
            if (A0C[5].length() != 11) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0C;
            strArr[7] = "IhCnEfnszwyWWR41sH3i20r6eCOdziXa";
            strArr[6] = "l3K1PshDhrbGMMnMidrkvh7uV3bNc5yZ";
            jA06 = ak.A06();
        } else {
            jA06 = 0;
        }
        return new com.facebook.ads.redexgen.core.C05609y(et, jA06, Long.MIN_VALUE, j, jA0A, zA0A, zA0B);
    }

    private com.facebook.ads.redexgen.core.C05609y A05(com.facebook.ads.redexgen.core.A1 a1) {
        return A06(a1.A04, a1.A01, a1.A02);
    }

    private com.facebook.ads.redexgen.core.C05609y A06(com.facebook.ads.redexgen.core.Et et, long j, long j2) {
        this.A07.A09(et.A02, this.A0A);
        if (et.A01()) {
            if (this.A0A.A0E(et.A00, et.A01)) {
                return A01(et.A02, et.A00, et.A01, j, et.A03);
            }
            java.lang.String[] strArr = A0C;
            if (strArr[7].charAt(25) == strArr[6].charAt(25)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0C;
            strArr2[2] = "AzfkTkyDGbg2im4f3QyfDnjEgxrRqpBB";
            strArr2[4] = "KpnticVnfLOfZpXrv5gfFtiDgljdRFm8";
            return null;
        }
        return A02(et.A02, j2, et.A03);
    }

    private com.facebook.ads.redexgen.core.Et A07(int i, long j, long j2) {
        this.A07.A09(i, this.A0A);
        int iA05 = this.A0A.A05(j);
        if (iA05 == -1) {
            return new com.facebook.ads.redexgen.core.Et(i, j2);
        }
        return new com.facebook.ads.redexgen.core.Et(i, iA05, this.A0A.A02(iA05), j2);
    }

    private boolean A08() {
        com.facebook.ads.redexgen.core.C05599x c05599xA0E = A0E();
        if (c05599xA0E == null) {
            return true;
        }
        while (true) {
            int iA03 = this.A07.A03(c05599xA0E.A02.A04.A02, this.A0A, this.A0B, this.A01, this.A09);
            while (lastValidPeriodHolder != null && !c05599xA0E.A02.A06) {
                c05599xA0E = c05599xA0E.A01;
            }
            if (iA03 == -1) {
                break;
            }
            com.facebook.ads.redexgen.core.C05599x lastValidPeriodHolder = c05599xA0E.A01;
            if (lastValidPeriodHolder == null) {
                break;
            }
            com.facebook.ads.redexgen.core.C05599x lastValidPeriodHolder2 = c05599xA0E.A01;
            if (lastValidPeriodHolder2.A02.A04.A02 != iA03) {
                break;
            }
            c05599xA0E = c05599xA0E.A01;
        }
        boolean readingPeriodRemoved = A0S(c05599xA0E);
        c05599xA0E.A02 = A04(c05599xA0E.A02, c05599xA0E.A02.A04);
        return (readingPeriodRemoved && A0P()) ? false : true;
    }

    private boolean A09(com.facebook.ads.redexgen.core.C05599x c05599x, com.facebook.ads.redexgen.core.C05609y c05609y) {
        com.facebook.ads.redexgen.core.C05609y c05609y2 = c05599x.A02;
        return c05609y2.A03 == c05609y.A03 && c05609y2.A02 == c05609y.A02 && c05609y2.A04.equals(c05609y.A04);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006e  */
    private boolean A0A(com.facebook.ads.redexgen.core.Et et, long j) {
        int adGroupCount;
        int adGroupCount2 = this.A07.A09(et.A02, this.A0A).A00();
        if (adGroupCount2 == 0) {
            return true;
        }
        int i = adGroupCount2 - 1;
        boolean zA01 = et.A01();
        long jA09 = this.A0A.A09(i);
        if (A0C[5].length() != 11) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A0C;
        strArr[2] = "Hc3aCU8VvQ7fMwIReaFfVUkP2Qt6QnfB";
        strArr[4] = "AI0v3pGWOJlJlSG7sCXfeKphukfOjim0";
        if (jA09 != Long.MIN_VALUE) {
            return !zA01 && j == Long.MIN_VALUE;
        }
        int postrollAdCount = this.A0A.A01(i);
        if (postrollAdCount == -1) {
            return false;
        }
        if (zA01) {
            int i2 = et.A00;
            if (A0C[5].length() != 11) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0C;
            strArr2[2] = "QtVqnRQedw8mZcoThXsfzsvUlAmleI46";
            strArr2[4] = "4SM7fHGVCS5a0RahBL1f2ORniSun8Kda";
            if (i2 == i && et.A01 == postrollAdCount - 1) {
                adGroupCount = 1;
            } else {
                adGroupCount = 0;
            }
        } else {
            adGroupCount = 0;
        }
        if (adGroupCount == 0) {
            return !zA01 && this.A0A.A02(i) == postrollAdCount;
        }
        return true;
    }

    private boolean A0B(com.facebook.ads.redexgen.core.Et et, boolean z) {
        return !this.A07.A0B(this.A07.A09(et.A02, this.A0A).A00, this.A0B).A08 && this.A07.A0F(et.A02, this.A0A, this.A0B, this.A01, this.A09) && z;
    }

    public final com.facebook.ads.redexgen.core.C05599x A0C() {
        if (this.A05 != null) {
            if (this.A05 == this.A06) {
                this.A06 = this.A05.A01;
            }
            this.A05.A0D();
            this.A00--;
            int i = this.A00;
            if (A0C[0].length() != 2) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0C;
            strArr[2] = "fHZ2t8GiDHbFn4NJmwYfIeU3TMjbrGb5";
            strArr[4] = "gVIXRXuUbCo6Jg17uj0fHWePWtEZtbid";
            if (i == 0) {
                this.A04 = null;
                this.A08 = this.A05.A09;
                this.A03 = this.A05.A02.A04.A03;
            }
            this.A05 = this.A05.A01;
        } else {
            this.A05 = this.A04;
            this.A06 = this.A04;
        }
        com.facebook.ads.redexgen.core.C05599x c05599x = this.A05;
        java.lang.String[] strArr2 = A0C;
        if (strArr2[3].charAt(8) == strArr2[1].charAt(8)) {
            return c05599x;
        }
        java.lang.String[] strArr3 = A0C;
        strArr3[7] = "Ws6vUc5hx67maGB8HH1cEpAr34Q1TMnp";
        strArr3[6] = "cQMmMd0UHrRlmvgDuZLAY44xPtqD6N6M";
        return c05599x;
    }

    public final com.facebook.ads.redexgen.core.C05599x A0D() {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04((this.A06 == null || this.A06.A01 == null) ? false : true);
        this.A06 = this.A06.A01;
        return this.A06;
    }

    public final com.facebook.ads.redexgen.core.C05599x A0E() {
        return A0P() ? this.A05 : this.A04;
    }

    public final com.facebook.ads.redexgen.core.C05599x A0F() {
        return this.A04;
    }

    public final com.facebook.ads.redexgen.core.C05599x A0G() {
        return this.A05;
    }

    public final com.facebook.ads.redexgen.core.C05599x A0H() {
        return this.A06;
    }

    public final com.facebook.ads.redexgen.core.C05609y A0I(long j, com.facebook.ads.redexgen.core.A1 a1) {
        if (this.A04 == null) {
            return A05(a1);
        }
        return A03(this.A04, j);
    }

    public final com.facebook.ads.redexgen.core.C05609y A0J(com.facebook.ads.redexgen.core.C05609y c05609y, int i) {
        return A04(c05609y, c05609y.A04.A00(i));
    }

    public final com.facebook.ads.redexgen.core.XU A0K(com.facebook.ads.redexgen.core.AF[] afArr, com.facebook.ads.redexgen.core.AbstractC0713Go abstractC0713Go, com.facebook.ads.redexgen.core.InterfaceC0716Gr interfaceC0716Gr, com.facebook.ads.redexgen.core.Ev ev, java.lang.Object obj, com.facebook.ads.redexgen.core.C05609y c05609y) {
        long jA07;
        if (this.A04 != null) {
            jA07 = this.A04.A07() + this.A04.A02.A01;
        } else {
            jA07 = c05609y.A03;
        }
        com.facebook.ads.redexgen.core.C05599x c05599x = new com.facebook.ads.redexgen.core.C05599x(afArr, jA07, abstractC0713Go, interfaceC0716Gr, ev, obj, c05609y);
        if (this.A04 != null) {
            com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(A0P());
            this.A04.A01 = c05599x;
        }
        this.A08 = null;
        this.A04 = c05599x;
        this.A00++;
        java.lang.String[] strArr = A0C;
        if (strArr[7].charAt(25) == strArr[6].charAt(25)) {
            throw new java.lang.RuntimeException();
        }
        A0C[0] = "lD";
        return c05599x.A08;
    }

    public final com.facebook.ads.redexgen.core.Et A0L(int i, long j) {
        return A07(i, j, A00(i));
    }

    public final void A0M(long j) {
        if (this.A04 != null) {
            this.A04.A0G(j);
        }
    }

    public final void A0N(com.facebook.ads.redexgen.core.AM am) {
        this.A07 = am;
    }

    public final void A0O(boolean z) {
        com.facebook.ads.redexgen.core.C05599x c05599xA0E = A0E();
        if (c05599xA0E != null) {
            this.A08 = z ? c05599xA0E.A09 : null;
            this.A03 = c05599xA0E.A02.A04.A03;
            c05599xA0E.A0D();
            A0S(c05599xA0E);
        } else if (!z) {
            this.A08 = null;
        }
        this.A05 = null;
        this.A04 = null;
        this.A06 = null;
        this.A00 = 0;
    }

    public final boolean A0P() {
        return this.A05 != null;
    }

    public final boolean A0Q() {
        return this.A04 == null || (!this.A04.A02.A05 && this.A04.A0H() && this.A04.A02.A01 != androidx.media3.common.C.TIME_UNSET && this.A00 < 100);
    }

    public final boolean A0R(int i) {
        this.A01 = i;
        return A08();
    }

    public final boolean A0S(com.facebook.ads.redexgen.core.C05599x c05599x) {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(c05599x != null);
        boolean z = false;
        this.A04 = c05599x;
        while (c05599x.A01 != null) {
            c05599x = c05599x.A01;
            if (c05599x == this.A06) {
                this.A06 = this.A05;
                z = true;
            }
            c05599x.A0D();
            this.A00--;
        }
        this.A04.A01 = null;
        return z;
    }

    public final boolean A0T(com.facebook.ads.redexgen.core.XU xu) {
        return this.A04 != null && this.A04.A08 == xu;
    }

    public final boolean A0U(com.facebook.ads.redexgen.core.Et et, long j) {
        int iA03 = et.A02;
        com.facebook.ads.redexgen.core.C05599x c05599x = null;
        for (com.facebook.ads.redexgen.core.C05599x c05599xA0E = A0E(); c05599xA0E != null; c05599xA0E = c05599xA0E.A01) {
            if (c05599x == null) {
                c05599xA0E.A02 = A0J(c05599xA0E.A02, iA03);
            } else {
                if (iA03 == -1 || !c05599xA0E.A09.equals(this.A07.A0A(iA03, this.A0A, true).A03)) {
                    return true ^ A0S(c05599x);
                }
                com.facebook.ads.redexgen.core.C05609y c05609yA03 = A03(c05599x, j);
                if (A0C[5].length() != 11) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr = A0C;
                strArr[2] = "815hHLFNQOCwx2WJokef24TLOsZ1d1uP";
                strArr[4] = "NoWRN646BC2VXV8taBUfsEmBKdMT4cIO";
                if (c05609yA03 == null) {
                    return true ^ A0S(c05599x);
                }
                c05599xA0E.A02 = A0J(c05599xA0E.A02, iA03);
                if (!A09(c05599xA0E, c05609yA03)) {
                    return true ^ A0S(c05599x);
                }
            }
            if (c05599xA0E.A02.A06) {
                iA03 = this.A07.A03(iA03, this.A0A, this.A0B, this.A01, this.A09);
            }
            c05599x = c05599xA0E;
            if (A0C[5].length() != 11) {
                throw new java.lang.RuntimeException();
            }
            A0C[0] = "i7";
        }
        return true;
    }

    public final boolean A0V(boolean z) {
        this.A09 = z;
        return A08();
    }
}

package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1041Tm extends android.widget.FrameLayout implements com.facebook.ads.redexgen.core.MS {
    public static byte[] A0L;
    public static java.lang.String[] A0M = {"2u2dP7fJh3RTJE0f5j", "V84xfC9vRBWBw28ag3Wa", "AJ9OWsf0IOCB9JkMwpi03POlIdxFWB0O", "t4KHUJW6pNylT", "agpCzVGtSfjd9ImL9ArnGOWeGltiI7KT", "yQxi0n265GvpKMbNVeZVKXQg4YYx4N", "9gQlnw56", "rIoCFSW2UJYE3I7OlTOsSCWVSaoSra"};
    public static final android.widget.RelativeLayout.LayoutParams A0N;
    public int A00;
    public int A01;
    public int A02;
    public com.facebook.ads.redexgen.core.OK A03;
    public com.facebook.ads.redexgen.core.U6 A04;
    public com.facebook.ads.redexgen.core.C0953Qc A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final com.facebook.ads.redexgen.core.C1339cB A0A;
    public final com.facebook.ads.redexgen.core.C5W A0B;
    public final com.facebook.ads.redexgen.core.C04766f A0C;
    public final com.facebook.ads.redexgen.core.C1199Zs A0D;
    public final com.facebook.ads.redexgen.core.J7 A0E;
    public final com.facebook.ads.redexgen.core.JF A0F;
    public final com.facebook.ads.redexgen.core.ViewOnSystemUiVisibilityChangeListenerC0837Lq A0G;
    public final com.facebook.ads.redexgen.core.MR A0H;
    public final com.facebook.ads.internal.view.FullScreenAdToolbar A0I;
    public final com.facebook.ads.redexgen.core.N9 A0J;
    public final java.util.ArrayList<com.facebook.ads.redexgen.core.Q3> A0K;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private com.facebook.ads.redexgen.core.U6 A08(boolean z, int i) {
        com.facebook.ads.redexgen.core.C1043To c1043To = new com.facebook.ads.redexgen.core.C1043To(this, i);
        com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cDA1N = this.A0A.A1N(this.A00);
        boolean z2 = this.A0A.A1V() && this.A00 > 0;
        com.facebook.ads.redexgen.core.C1339cB c1339cB = this.A0A;
        java.lang.String[] strArr = A0M;
        if (strArr[0].length() == strArr[1].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0M;
        strArr2[5] = "3gdOFv01Kz0ZnyucWuUEmXxf6IoafQ";
        strArr2[7] = "fC48jcODpmlfGlCBCMGbrb6lg5xDB9";
        boolean z3 = c1339cB.A1U() && this.A00 > 0;
        java.lang.String strA1P = this.A0A.A1P();
        if (!A0V(abstractC1341cDA1N)) {
            if (abstractC1341cDA1N.A1P().A0P()) {
                this.A0D.A0E().AGg(com.facebook.ads.redexgen.core.EnumC03220e.A07);
                this.A0D.A0E().AGL(this.A00);
                this.A0D.A0E().A4Z(strA1P);
                return new com.facebook.ads.redexgen.core.A6(this.A0D, this.A0E, this.A0I, abstractC1341cDA1N, this.A0C, this.A0J, this.A00, this.A0H, this.A0F, i, z2, z3, c1043To);
            }
            this.A0D.A0E().AGg(com.facebook.ads.redexgen.core.EnumC03220e.A07);
            this.A0D.A0E().AGL(this.A00);
            this.A0D.A0E().A4Z(strA1P);
            return new com.facebook.ads.redexgen.core.C0563Ab(this.A0D, this.A0E, abstractC1341cDA1N, this.A0C, this.A0J, this.A00, this.A0H, this.A0F, this.A0A.A0S(), i, this.A0A.A1J(), z, this.A0A.A1L(), this.A0A.A1W(), z2, z3, c1043To);
        }
        int i2 = this.A00;
        java.lang.String[] strArr3 = A0M;
        if (strArr3[2].charAt(19) == strArr3[4].charAt(19)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr4 = A0M;
        strArr4[0] = "X43UyhT2SnEGqWLDn0";
        strArr4[1] = "NDqgRgGPAErBzSE9x3wi";
        int iA01 = A01(i2);
        if (iA01 == 0) {
            this.A09 = true;
        }
        this.A0D.A0E().AGg(com.facebook.ads.redexgen.core.EnumC03220e.A06);
        this.A0D.A0E().AGL(this.A00);
        this.A0D.A0E().A4Z(strA1P);
        return new com.facebook.ads.redexgen.core.B8(this.A0D, this.A0J, this.A00, this.A0E, abstractC1341cDA1N, this.A0H, this.A0I, z2, z3, c1043To, iA01);
    }

    public static java.lang.String A09(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0L, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 100);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A0D() {
        A0L = new byte[]{-103, -24, -33, -103, -1, 34, -34};
    }

    static {
        A0D();
        A0N = new android.widget.RelativeLayout.LayoutParams(-1, -1);
    }

    public C1041Tm(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.N9 n9, com.facebook.ads.redexgen.core.J7 j7, com.facebook.ads.redexgen.core.C1339cB c1339cB, com.facebook.ads.redexgen.core.C04766f c04766f, com.facebook.ads.redexgen.core.MR mr) {
        super(c1199Zs);
        this.A0K = new java.util.ArrayList<>();
        this.A09 = false;
        this.A07 = false;
        this.A08 = false;
        this.A06 = true;
        this.A02 = 1;
        this.A00 = 0;
        this.A01 = 0;
        this.A0B = new com.facebook.ads.redexgen.core.C1044Tp(this);
        this.A0D = c1199Zs;
        this.A0J = n9;
        this.A0E = j7;
        this.A0A = c1339cB;
        this.A0C = c04766f;
        this.A0H = mr;
        this.A0F = new com.facebook.ads.redexgen.core.JF(this.A0A.A1N(0).A1U(), this.A0E);
        this.A0G = new com.facebook.ads.redexgen.core.ViewOnSystemUiVisibilityChangeListenerC0837Lq(this);
        this.A0G.A05(com.facebook.ads.redexgen.core.EnumC0836Lp.A02);
        this.A05 = new com.facebook.ads.redexgen.core.C0953Qc(this.A0D, this.A0J, this.A0A.A0m(), mr);
        this.A0I = A05();
        addView(this.A0I, new android.widget.FrameLayout.LayoutParams(-1, this.A0I.getToolbarHeight()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b6, code lost:
    
        if (r5 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b8, code lost:
    
        A0C();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bb, code lost:
    
        return 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c8, code lost:
    
        if (r5 == false) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int A00() {
        if (!this.A09) {
            if (this.A04 == null || !this.A04.A16() || this.A0A.A1J() != 1) {
                return 0;
            }
            A0R(false, this.A02);
            return 1;
        }
        if (A0S() && this.A04 != null && (this.A04.A16() || this.A0A.A1J() == 2 || !this.A04.A15())) {
            if (!this.A0A.A1W()) {
                this.A08 = true;
            }
            A0R(false, this.A02);
            java.lang.String[] strArr = A0M;
            if (strArr[5].length() != strArr[7].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0M;
            strArr2[5] = "Fu5VcCLRWlCVSPev3Ny5pnjuJiPpeN";
            strArr2[7] = "hy8N08k5Vw4Z8hL9UmI1FpStaZ0OSb";
            return 2;
        }
        if (this.A04 != null && this.A04.A15()) {
            this.A0I.setToolbarActionMode(0);
            this.A0D.A0E().A4b();
            this.A04.A11();
            return 3;
        }
        if (A0T()) {
            boolean zA0U = A0U();
            java.lang.String[] strArr3 = A0M;
            if (strArr3[5].length() == strArr3[7].length()) {
                java.lang.String[] strArr4 = A0M;
                strArr4[6] = "AFtEA7yR";
                strArr4[3] = "Q8ZNY7QUzDAYM";
            }
        }
        if ((this.A04 instanceof com.facebook.ads.redexgen.core.B8) && A0S()) {
            A0R(false, this.A02);
            return 5;
        }
        this.A0F.A04(com.facebook.ads.redexgen.core.JE.A07, null);
        A0H(4);
        return 6;
    }

    private int A01(int i) {
        if (this.A0A.A1W()) {
            com.facebook.ads.redexgen.core.C1339cB c1339cB = this.A0A;
            java.lang.String[] strArr = A0M;
            if (strArr[0].length() == strArr[1].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0M;
            strArr2[5] = "SFVCTE3Hv2F6eV4jkYzgVN3BuZvLlt";
            strArr2[7] = "be2ILDbetBMqGPrAeiZBpkZxeTc1wp";
            if (i < c1339cB.A1R().size() && i >= 0) {
                return this.A0A.A1R().get(i).intValue();
            }
        }
        return this.A0A.A0S();
    }

    public static /* synthetic */ int A02(com.facebook.ads.redexgen.core.C1041Tm c1041Tm, int i) {
        int i2 = c1041Tm.A01 + i;
        c1041Tm.A01 = i2;
        return i2;
    }

    private com.facebook.ads.internal.view.FullScreenAdToolbar A05() {
        com.facebook.ads.internal.view.FullScreenAdToolbar fullScreenAdToolbar = new com.facebook.ads.internal.view.FullScreenAdToolbar(this.A0D, this.A0H, this.A0F, 2, -1, false);
        fullScreenAdToolbar.setFullscreen(true);
        fullScreenAdToolbar.setToolbarListener(new com.facebook.ads.redexgen.core.C1042Tn(this));
        return fullScreenAdToolbar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A() {
        int iA00 = A00();
        if (iA00 != 0) {
            this.A0D.A0E().A4c(iA00);
        }
    }

    private void A0B() {
        if (this.A00 > 0 && !android.text.TextUtils.isEmpty(this.A0A.A1N(this.A00 - 1).A1U())) {
            com.facebook.ads.redexgen.core.J7 j7 = this.A0E;
            java.lang.String strA1U = this.A0A.A1N(this.A00 - 1).A1U();
            com.facebook.ads.redexgen.core.O8 o8A03 = new com.facebook.ads.redexgen.core.O8().A03(this.A04 != null ? this.A04.getAdViewabilityChecker() : null);
            com.facebook.ads.redexgen.core.U6 u6 = this.A04;
            java.lang.String[] strArr = A0M;
            if (strArr[6].length() == strArr[3].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0M;
            strArr2[2] = "pDlFeLBfyToKKboIUgGc0hC9I32LVeJD";
            strArr2[4] = "3B6yIVnUpbF0PBycHqRFA1bh2UEjPzxQ";
            j7.A9x(strA1U, o8A03.A02(u6 != null ? this.A04.getTouchDataRecorder() : null).A05());
        }
    }

    private void A0C() {
        this.A0D.A0E().A4a();
        this.A07 = true;
        this.A03 = new com.facebook.ads.redexgen.core.OK(this.A0D, this.A0A, this.A0E, this.A0H, this.A0I.getToolbarHeight(), this.A02);
        com.facebook.ads.redexgen.core.Q3 q3 = null;
        for (com.facebook.ads.redexgen.core.Q3 s : this.A0K) {
            if (s.A00 == com.facebook.ads.redexgen.core.Q3.A06) {
                q3 = s;
                break;
            }
        }
        if (q3 != null) {
            A0I(this.A03, q3);
        } else if (!this.A0K.isEmpty()) {
            A0I(this.A03, this.A0K.get(0));
        }
        A0Q(true);
        this.A0I.setOnlyPageDetails(null);
        if (this.A04 != null) {
            com.facebook.ads.redexgen.core.M3.A0J(this.A04);
            this.A04.A0z();
            this.A04 = null;
        }
        com.facebook.ads.redexgen.core.M3.A0J(this.A03);
        com.facebook.ads.redexgen.core.M3.A0G(com.json.mediationsdk.utils.IronSourceConstants.RV_API_HAS_AVAILABILITY_FALSE, this.A03);
        addView(this.A03, 0, new android.widget.FrameLayout.LayoutParams(-1, -1));
    }

    private final void A0E() {
        if (android.os.Build.VERSION.SDK_INT < 19) {
            return;
        }
        this.A0G.A05(com.facebook.ads.redexgen.core.EnumC0836Lp.A03);
    }

    private synchronized void A0F() {
        this.A0H.A4P(this.A0J.A6F());
        this.A05.A05();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0G(float f) {
        float seenCurrentPosMS;
        float fA01 = A01(this.A00 - 1);
        float seenCurrentPosMS2 = (this.A0A.A1W() ? 0 : this.A01) + f;
        if (fA01 > 0.0f) {
            seenCurrentPosMS = seenCurrentPosMS2 / fA01;
        } else {
            seenCurrentPosMS = 1.0f;
        }
        if (this.A06 && this.A0A.A1W()) {
            this.A06 = false;
            this.A0I.setProgressImmediate(0.0f);
        }
        float unskippableSeconds = 100.0f * seenCurrentPosMS;
        this.A0I.setProgress(unskippableSeconds);
        if (seenCurrentPosMS >= 1.0f && !this.A09) {
            this.A09 = true;
            this.A0I.setToolbarActionMode(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0H(int i) {
        this.A0D.A0E().A4X(i);
        this.A09 = true;
        A0F();
        A0B();
        this.A0H.A4P(this.A0J.A7I());
    }

    private void A0I(android.view.ViewGroup viewGroup, com.facebook.ads.redexgen.core.Q3 q3) {
        if (q3.A00 == com.facebook.ads.redexgen.core.Q3.A06 && q3.A03 != null) {
            com.facebook.ads.redexgen.core.AbstractC0900Ob.A00(this.A0D, viewGroup, q3.A03);
        } else {
            int i = q3.A01;
            java.lang.String[] strArr = A0M;
            if (strArr[0].length() == strArr[1].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0M;
            strArr2[5] = "6Qw2GncBlIK9qwoUetngT0jkAnHCQL";
            strArr2[7] = "iVxLMdIUnWJTFKOlNtOcmcGRsmSn6x";
            com.facebook.ads.redexgen.core.M3.A0M(viewGroup, i);
        }
        this.A0I.setFullscreen(q3.A05);
        this.A0I.A09(q3.A02, q3.A04);
    }

    private void A0J(com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cD) {
        if (A0V(abstractC1341cD) && this.A02 == 2) {
            this.A0I.setOnlyPageDetails(abstractC1341cD.A1S());
        } else {
            this.A0I.setOnlyPageDetails(null);
        }
    }

    private final void A0K(com.facebook.ads.redexgen.core.C5Q c5q) {
        c5q.A0A(this.A0B);
        int i = c5q.A05().getResources().getConfiguration().orientation;
        this.A02 = i;
        A0R(this.A0A.A1T(), i);
        A0E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x00a4  */
    public void A0Q(boolean z) {
        boolean z2;
        if (!A0T() || A0S()) {
            z2 = false;
        } else {
            boolean zA0U = A0U();
            java.lang.String[] strArr = A0M;
            if (strArr[0].length() == strArr[1].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0M;
            strArr2[2] = "abX2oERzf98UggHhJlwc5xOu8ehA434Q";
            strArr2[4] = "mcfqurarHSiAo6r6yfyhrMyo3UPU5OrE";
            if (zA0U) {
                z2 = false;
            } else {
                z2 = true;
            }
        }
        boolean willShowCombinedEndCards = A0S();
        if (!willShowCombinedEndCards && !z2) {
            this.A09 = true;
            if (z) {
                this.A0I.setToolbarActionMessage(A09(0, 0, 85));
            }
            com.facebook.ads.internal.view.FullScreenAdToolbar fullScreenAdToolbar = this.A0I;
            java.lang.String[] strArr3 = A0M;
            if (strArr3[6].length() == strArr3[3].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr4 = A0M;
            strArr4[0] = "6hDdRvQvhZI2wvmWyf";
            strArr4[1] = "dfELTL2TgrvtcbRt37j2";
            fullScreenAdToolbar.setToolbarActionMode(0);
            return;
        }
        com.facebook.ads.internal.view.FullScreenAdToolbar fullScreenAdToolbar2 = this.A0I;
        java.lang.String[] strArr5 = A0M;
        if (strArr5[0].length() != strArr5[1].length()) {
            java.lang.String[] strArr6 = A0M;
            strArr6[2] = "JMDiVFyp4yY8WixxdBAiYWzIdfNljSYZ";
            strArr6[4] = "DEcXsd0kn675y00aYcKTg0COR2JcG3d3";
            fullScreenAdToolbar2.setToolbarActionMode(1);
            return;
        }
        java.lang.String[] strArr7 = A0M;
        strArr7[6] = "uCb48oA3";
        strArr7[3] = "eCwSqnipc7icS";
        fullScreenAdToolbar2.setToolbarActionMode(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:20:0x0077  */
    /* JADX WARN: Code duplicated, block: B:22:0x0096  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a3  */
    public void A0R(boolean z, int i) {
        boolean isLoaded;
        java.lang.String[] strArr;
        if (this.A04 != null) {
            this.A04.A0z();
            this.A04.removeAllViews();
            com.facebook.ads.redexgen.core.M3.A0J(this.A04);
        }
        if (!A0S()) {
            this.A09 = true;
            if (A0T()) {
                A0C();
                return;
            } else {
                A0H(1);
                return;
            }
        }
        if (this.A0A.A1W()) {
            this.A09 = false;
            com.facebook.ads.internal.view.FullScreenAdToolbar fullScreenAdToolbar = this.A0I;
            java.lang.String[] strArr2 = A0M;
            if (strArr2[0].length() != strArr2[1].length()) {
                java.lang.String[] strArr3 = A0M;
                strArr3[5] = "hirdpqFqEpTGRF7TvzfLNB23PEQWY5";
                strArr3[7] = "Eb3FssofDa3ImZpKtnPvm2BrdUNNTg";
                fullScreenAdToolbar.setProgressImmediate(0.0f);
                isLoaded = this.A0D.A00().A9M(this.A0A.A1N(this.A00).A1U(), this.A0A.A1O());
                if (!isLoaded) {
                    this.A0D.A0E().A4Y();
                    A0H(2);
                    strArr = A0M;
                    if (strArr[6].length() != strArr[3].length()) {
                        java.lang.String[] strArr4 = A0M;
                        strArr4[0] = "SeXhCWKDArfU2xbUHE";
                        strArr4[1] = "icHjaKCGoPIgSTYVXjnx";
                        return;
                    }
                } else {
                    com.facebook.ads.redexgen.core.U6 u6A08 = A08(z, i);
                    this.A04 = u6A08;
                    setupToolbarForAd(u6A08);
                    addView(this.A04, 0, A0N);
                    this.A00++;
                    this.A04.A12();
                    return;
                }
            }
        } else {
            isLoaded = this.A0D.A00().A9M(this.A0A.A1N(this.A00).A1U(), this.A0A.A1O());
            if (!isLoaded) {
                this.A0D.A0E().A4Y();
                A0H(2);
                strArr = A0M;
                if (strArr[6].length() != strArr[3].length()) {
                    java.lang.String[] strArr5 = A0M;
                    strArr5[0] = "SeXhCWKDArfU2xbUHE";
                    strArr5[1] = "icHjaKCGoPIgSTYVXjnx";
                    return;
                }
            } else {
                com.facebook.ads.redexgen.core.U6 u6A09 = A08(z, i);
                this.A04 = u6A09;
                setupToolbarForAd(u6A09);
                addView(this.A04, 0, A0N);
                this.A00++;
                this.A04.A12();
                return;
            }
        }
        throw new java.lang.RuntimeException();
    }

    private boolean A0S() {
        return this.A00 < this.A0A.A1K();
    }

    private boolean A0T() {
        return this.A0A.A1J() == 2;
    }

    private final boolean A0U() {
        return this.A07;
    }

    public static boolean A0V(com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cD) {
        return android.text.TextUtils.isEmpty(abstractC1341cD.A1P().A0E().A08());
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public final void A9q(android.content.Intent intent, android.os.Bundle bundle, com.facebook.ads.redexgen.core.C5Q c5q) {
        this.A0H.A3q(this, A0N);
        A0K(c5q);
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public final void ACz(boolean z) {
        if (this.A04 != null) {
            this.A04.A13(z);
        }
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public final void ADN(boolean z) {
        if (this.A04 != null) {
            this.A04.A14(z);
        }
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public final void AFx(android.os.Bundle bundle) {
    }

    public com.facebook.ads.redexgen.core.U6 getContentView() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public java.lang.String getCurrentClientToken() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public final boolean onActivityResult(int i, int i2, android.content.Intent intent) {
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A02 = configuration.orientation;
        if (this.A04 != null) {
            this.A04.onConfigurationChanged(configuration);
        }
        if (this.A04 instanceof com.facebook.ads.redexgen.core.B8) {
            A0I(this.A04, this.A04.getFullScreenAdStyle());
            A0J(this.A04.getAdDataBundle());
        }
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public final void onDestroy() {
        if (this.A04 != null) {
            this.A04.A0z();
            this.A04 = null;
        }
        this.A0D.A00().A4d(this.A0A.A1O());
        this.A0G.A03();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setListener(com.facebook.ads.redexgen.core.MR mr) {
    }

    public void setServerSideRewardHandler(com.facebook.ads.redexgen.core.C0953Qc c0953Qc) {
        this.A05 = c0953Qc;
    }

    private void setupToolbarForAd(com.facebook.ads.redexgen.core.U6 u6) {
        if (this.A0I == null) {
            return;
        }
        this.A06 = true;
        com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cDA1N = this.A0A.A1N(this.A00);
        this.A0I.A0C(this.A0D, abstractC1341cDA1N.A1J());
        this.A0I.A0B(abstractC1341cDA1N.A1S(), abstractC1341cDA1N.A1U(), A01(this.A00));
        com.facebook.ads.redexgen.core.Q3 fullScreenAdStyle = u6.getFullScreenAdStyle();
        A0I(u6, fullScreenAdStyle);
        this.A0K.add(fullScreenAdStyle);
        this.A0I.setToolbarActionMessage(A09(4, 3, 90) + (this.A00 + 1) + A09(0, 4, 21) + this.A0A.A1K());
        if (this.A08) {
            this.A0I.setToolbarActionMode(1);
        }
        A0J(abstractC1341cDA1N);
    }
}

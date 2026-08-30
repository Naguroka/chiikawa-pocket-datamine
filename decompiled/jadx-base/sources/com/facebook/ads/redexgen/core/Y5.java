package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class Y5 implements com.facebook.ads.redexgen.core.D3 {
    public static byte[] A0E;
    public static java.lang.String[] A0F = {"MuM37mvTkzlYg2EyoGZNQeCtoH5o0amC", "mBjEqUiK3L9cxidSIeTlZKdFAvm", "XHnnymrKKOAQEyDjuW6Oc54SHnyt4GQm", "pkS5", "Uhg1", "yxzae7OE9DkPBU2323XK9iAPH766hQxt", "Bopy6Xk2MIHKC3K2u75K6Kfh", "uzVvOj5dUDYWkx4CAcwiCIxvqEsnaeE6"};
    public long A00;
    public long A01;
    public com.facebook.ads.redexgen.core.C9 A02;
    public com.facebook.ads.redexgen.core.D8 A03;
    public java.lang.String A04;
    public boolean A05;
    public final com.facebook.ads.redexgen.core.DC A0B;
    public final boolean[] A0D = new boolean[3];
    public final com.facebook.ads.redexgen.core.D9 A0A = new com.facebook.ads.redexgen.core.D9(32, 128);
    public final com.facebook.ads.redexgen.core.D9 A08 = new com.facebook.ads.redexgen.core.D9(33, 128);
    public final com.facebook.ads.redexgen.core.D9 A06 = new com.facebook.ads.redexgen.core.D9(34, 128);
    public final com.facebook.ads.redexgen.core.D9 A07 = new com.facebook.ads.redexgen.core.D9(39, 128);
    public final com.facebook.ads.redexgen.core.D9 A09 = new com.facebook.ads.redexgen.core.D9(40, 128);
    public final com.facebook.ads.redexgen.core.I4 A0C = new com.facebook.ads.redexgen.core.I4();

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 21);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A0E = new byte[]{119, 97, 101, 100, -127, -108, -112, -109, -108, -95, 114, -117, -126, -107, -115, -126, -128, -111, -126, -127, kotlin.io.encoding.Base64.padSymbol, 126, -112, -115, -126, -128, -111, 124, -113, 126, -111, -122, -116, 124, -122, -127, -128, kotlin.io.encoding.Base64.padSymbol, -109, 126, -119, -110, -126, 87, kotlin.io.encoding.Base64.padSymbol, -79, -92, -97, -96, -86, 106, -93, -96, -79, -98};
    }

    static {
        A02();
    }

    public Y5(com.facebook.ads.redexgen.core.DC dc) {
        this.A0B = dc;
    }

    public static com.facebook.ads.internal.exoplayer2.thirdparty.Format A00(java.lang.String str, com.facebook.ads.redexgen.core.D9 d9, com.facebook.ads.redexgen.core.D9 d10, com.facebook.ads.redexgen.core.D9 d11) {
        byte[] csd = new byte[d9.A00 + d10.A00 + d11.A00];
        java.lang.System.arraycopy(d9.A01, 0, csd, 0, d9.A00);
        java.lang.System.arraycopy(d10.A01, 0, csd, d9.A00, d10.A00);
        java.lang.System.arraycopy(d11.A01, 0, csd, d9.A00 + d10.A00, d11.A00);
        com.facebook.ads.redexgen.core.I5 i5 = new com.facebook.ads.redexgen.core.I5(d10.A01, 0, d10.A00);
        i5.A07(44);
        int i = i5.A05(3);
        i5.A06();
        i5.A07(88);
        i5.A07(8);
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (i5.A0A()) {
                i2 += 89;
            }
            if (i5.A0A()) {
                i2 += 8;
            }
        }
        i5.A07(i2);
        if (i > 0) {
            i5.A07((8 - i) * 2);
        }
        i5.A04();
        int chromaFormatIdc = i5.A04();
        if (chromaFormatIdc == 3) {
            i5.A06();
        }
        int picHeightInLumaSamples = i5.A04();
        int confWinLeftOffset = i5.A04();
        if (i5.A0A()) {
            int toSkip = i5.A04();
            int iA04 = i5.A04();
            int subHeightC = i5.A04();
            int iA05 = i5.A04();
            picHeightInLumaSamples -= (toSkip + iA04) * ((chromaFormatIdc == 1 || chromaFormatIdc == 2) ? 2 : 1);
            confWinLeftOffset -= (subHeightC + iA05) * (chromaFormatIdc == 1 ? 2 : 1);
        }
        i5.A04();
        i5.A04();
        int iA06 = i5.A04();
        for (int i4 = i5.A0A() ? 0 : i; i4 <= i; i4++) {
            i5.A04();
            i5.A04();
            i5.A04();
        }
        i5.A04();
        i5.A04();
        i5.A04();
        i5.A04();
        i5.A04();
        i5.A04();
        if (i5.A0A() && i5.A0A()) {
            A05(i5);
        }
        i5.A07(2);
        if (i5.A0A()) {
            i5.A07(8);
            i5.A04();
            i5.A04();
            java.lang.String[] strArr = A0F;
            if (strArr[3].length() != strArr[4].length()) {
                throw new java.lang.RuntimeException();
            }
            A0F[5] = "beliyUp3I";
            i5.A06();
        }
        A06(i5);
        if (i5.A0A()) {
            int log2MaxPicOrderCntLsbMinus4 = 0;
            while (true) {
                int maxSubLayersMinus1 = i5.A04();
                if (A0F[6].length() == 30) {
                    A0F[2] = "DqswfFoquAR3l8kr9ImxEhUsB68HngNw";
                    if (log2MaxPicOrderCntLsbMinus4 >= maxSubLayersMinus1) {
                        break;
                    }
                    i5.A07(iA06 + 4 + 1);
                    log2MaxPicOrderCntLsbMinus4++;
                } else {
                    A0F[5] = "eP05A5uOer10TfC46mqSQX";
                    if (log2MaxPicOrderCntLsbMinus4 >= maxSubLayersMinus1) {
                        break;
                    }
                    i5.A07(iA06 + 4 + 1);
                    log2MaxPicOrderCntLsbMinus4++;
                }
            }
        }
        i5.A07(2);
        float f = 1.0f;
        if (i5.A0A() && i5.A0A()) {
            int log2MaxPicOrderCntLsbMinus5 = i5.A05(8);
            if (log2MaxPicOrderCntLsbMinus5 == 255) {
                int iA07 = i5.A05(16);
                int iA08 = i5.A05(16);
                if (iA07 != 0 && iA08 != 0) {
                    f = iA07 / iA08;
                }
            } else {
                float[] fArr = com.facebook.ads.redexgen.core.I0.A04;
                if (A0F[5].length() == 23) {
                    throw new java.lang.RuntimeException();
                }
                A0F[5] = "lNxPCo9oIuhji7Gv";
                if (log2MaxPicOrderCntLsbMinus5 < fArr.length) {
                    f = com.facebook.ads.redexgen.core.I0.A04[log2MaxPicOrderCntLsbMinus5];
                } else {
                    android.util.Log.w(A01(0, 10, 26), A01(10, 35, 8) + log2MaxPicOrderCntLsbMinus5);
                }
            }
        }
        return com.facebook.ads.internal.exoplayer2.thirdparty.Format.A03(str, A01(45, 10, 38), null, -1, -1, picHeightInLumaSamples, confWinLeftOffset, -1.0f, java.util.Collections.singletonList(csd), -1, f, null);
    }

    private void A03(long j, int i, int i2, long j2) {
        if (this.A05) {
            this.A03.A02(j, i);
        } else {
            com.facebook.ads.redexgen.core.D9 d9 = this.A0A;
            java.lang.String[] strArr = A0F;
            if (strArr[3].length() != strArr[4].length()) {
                throw new java.lang.RuntimeException();
            }
            A0F[5] = "T4Iekhb";
            d9.A04(i2);
            this.A08.A04(i2);
            this.A06.A04(i2);
            if (this.A0A.A03() && this.A08.A03() && this.A06.A03()) {
                this.A02.A69(A00(this.A04, this.A0A, this.A08, this.A06));
                this.A05 = true;
            }
        }
        boolean zA04 = this.A07.A04(i2);
        if (A0F[2].charAt(9) == '6') {
            throw new java.lang.RuntimeException();
        }
        A0F[5] = "5wZyobeJENeWPOGTXoMwsZ";
        if (zA04) {
            this.A0C.A0b(this.A07.A01, com.facebook.ads.redexgen.core.I0.A02(this.A07.A01, this.A07.A00));
            this.A0C.A0Z(5);
            this.A0B.A02(j2, this.A0C);
        }
        if (this.A09.A04(i2)) {
            this.A0C.A0b(this.A09.A01, com.facebook.ads.redexgen.core.I0.A02(this.A09.A01, this.A09.A00));
            this.A0C.A0Z(5);
            this.A0B.A02(j2, this.A0C);
        }
    }

    private void A04(long j, int i, int i2, long j2) {
        if (this.A05) {
            this.A03.A03(j, i, i2, j2);
        } else {
            this.A0A.A01(i2);
            this.A08.A01(i2);
            com.facebook.ads.redexgen.core.D9 d9 = this.A06;
            if (A0F[2].charAt(9) == '6') {
                throw new java.lang.RuntimeException();
            }
            A0F[2] = "afSaij9DosEsjnR5OQlOdYTC4yKMsCpR";
            d9.A01(i2);
        }
        this.A07.A01(i2);
        this.A09.A01(i2);
    }

    public static void A05(com.facebook.ads.redexgen.core.I5 i5) {
        for (int i = 0; i < 4; i++) {
            int i2 = 0;
            while (i2 < 6) {
                int i3 = 1;
                if (!i5.A0A()) {
                    i5.A04();
                } else {
                    int i4 = i << 1;
                    if (A0F[5].length() == 23) {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr = A0F;
                    strArr[7] = "Trv63JQRohtZ2guXV2KCLZkCXYmgTsG4";
                    strArr[0] = "BkNV2uBmbZiRokG0PRq1Sv9g32SKHwb9";
                    int sizeId = java.lang.Math.min(64, 1 << (i4 + 4));
                    if (i > 1) {
                        i5.A03();
                    }
                    for (int i6 = 0; i6 < sizeId; i6++) {
                        i5.A03();
                    }
                }
                if (i == 3) {
                    i3 = 3;
                }
                i2 += i3;
            }
        }
    }

    public static void A06(com.facebook.ads.redexgen.core.I5 i5) {
        int iA04 = i5.A04();
        boolean zA0A = false;
        int numNegativePics = 0;
        for (int stRpsIdx = 0; stRpsIdx < iA04; stRpsIdx++) {
            if (stRpsIdx != 0) {
                zA0A = i5.A0A();
            }
            if (zA0A) {
                i5.A06();
                i5.A04();
                for (int i = 0; i <= numNegativePics; i++) {
                    if (i5.A0A()) {
                        i5.A06();
                    }
                }
            } else {
                int previousNumDeltaPocs = i5.A04();
                int iA05 = i5.A04();
                numNegativePics = previousNumDeltaPocs + iA05;
                for (int numShortTermRefPicSets = 0; numShortTermRefPicSets < previousNumDeltaPocs; numShortTermRefPicSets++) {
                    i5.A04();
                    i5.A06();
                }
                for (int numShortTermRefPicSets2 = 0; numShortTermRefPicSets2 < iA05; numShortTermRefPicSets2++) {
                    i5.A04();
                    i5.A06();
                }
            }
        }
    }

    private void A07(byte[] bArr, int i, int i2) {
        if (this.A05) {
            this.A03.A04(bArr, i, i2);
        } else {
            this.A0A.A02(bArr, i, i2);
            this.A08.A02(bArr, i, i2);
            this.A06.A02(bArr, i, i2);
        }
        this.A07.A02(bArr, i, i2);
        this.A09.A02(bArr, i, i2);
    }

    @Override // com.facebook.ads.redexgen.core.D3
    public final void A4n(com.facebook.ads.redexgen.core.I4 i4) {
        while (i4.A04() > 0) {
            int iA06 = i4.A06();
            int iA07 = i4.A07();
            byte[] bArr = i4.A00;
            long j = this.A01;
            int offset = i4.A04();
            this.A01 = j + ((long) offset);
            com.facebook.ads.redexgen.core.C9 c9 = this.A02;
            int offset2 = i4.A04();
            c9.AFv(i4, offset2);
            while (iA06 < iA07) {
                int iA04 = com.facebook.ads.redexgen.core.I0.A04(bArr, iA06, iA07, this.A0D);
                if (iA04 == iA07) {
                    A07(bArr, iA06, iA07);
                    return;
                }
                int bytesWrittenPastPosition = com.facebook.ads.redexgen.core.I0.A00(bArr, iA04);
                int i = iA04 - iA06;
                if (i > 0) {
                    A07(bArr, iA06, iA04);
                }
                int i2 = iA07 - iA04;
                long j2 = this.A01 - ((long) i2);
                int offset3 = i < 0 ? -i : 0;
                A03(j2, i2, offset3, this.A00);
                long absolutePosition = this.A00;
                A04(j2, i2, bytesWrittenPastPosition, absolutePosition);
                iA06 = iA04 + 3;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.D3
    public final void A5B(com.facebook.ads.redexgen.core.InterfaceC0611Bz interfaceC0611Bz, com.facebook.ads.redexgen.core.DH dh) {
        dh.A05();
        this.A04 = dh.A04();
        this.A02 = interfaceC0611Bz.AHA(dh.A03(), 2);
        this.A03 = new com.facebook.ads.redexgen.core.D8(this.A02);
        this.A0B.A03(interfaceC0611Bz, dh);
    }

    @Override // com.facebook.ads.redexgen.core.D3
    public final void AEL() {
    }

    @Override // com.facebook.ads.redexgen.core.D3
    public final void AEM(long j, boolean z) {
        this.A00 = j;
    }

    @Override // com.facebook.ads.redexgen.core.D3
    public final void AG6() {
        com.facebook.ads.redexgen.core.I0.A0B(this.A0D);
        this.A0A.A00();
        this.A08.A00();
        this.A06.A00();
        this.A07.A00();
        this.A09.A00();
        this.A03.A01();
        this.A01 = 0L;
    }
}

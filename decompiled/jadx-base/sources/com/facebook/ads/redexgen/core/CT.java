package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class CT {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"wKfvjnTfcOCKDMPJJwrDJ", "BiqBrO9zznhho2tL5UciatPP4bSmOs", "cZYy1M68RFqrdQwlSPY78RcvokmRJ", "tju6iARchYraidMuKGJ5uPvGKVeMW6gD", "Y97vgpZfbX6TvfdF2pMOeBFL", "2mehisQ4WAFPRb0II6r5g", "hLX37fwLOdV4BXkBL9GY87j8KNIyc", "u9IItuxuS7Hs6eOanDo40tgXJH3Fx3"};
    public static final int A02;
    public static final int A03;
    public static final int A04;
    public static final int A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static android.util.Pair<long[], long[]> A05(com.facebook.ads.redexgen.core.YY yy) {
        if (yy != null) {
            com.facebook.ads.redexgen.core.YX yxA07 = yy.A07(com.facebook.ads.redexgen.core.CO.A0O);
            java.lang.String[] strArr = A01;
            if (strArr[1].length() != strArr[7].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A01;
            strArr2[1] = "SB39xNBo9M6iPaB1lJN3UDY5qWf8gr";
            strArr2[7] = "2q10ZFvNKxj4J1CiL420MMAJAxUxvK";
            if (yxA07 != null) {
                com.facebook.ads.redexgen.core.I4 i4 = yxA07.A00;
                i4.A0Y(8);
                int iA01 = com.facebook.ads.redexgen.core.CO.A01(i4.A08());
                int iA0H = i4.A0H();
                long[] jArr = new long[iA0H];
                long[] jArr2 = new long[iA0H];
                for (int i = 0; i < iA0H; i++) {
                    jArr[i] = iA01 == 1 ? i4.A0N() : i4.A0M();
                    jArr2[i] = iA01 == 1 ? i4.A0L() : i4.A08();
                    if (i4.A0U() != 1) {
                        throw new java.lang.IllegalArgumentException(A0I(272, 23, 57));
                    }
                    i4.A0Z(2);
                }
                return android.util.Pair.create(jArr, jArr2);
            }
        }
        return android.util.Pair.create(null, null);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0091  */
    /* JADX WARN: Code duplicated, block: B:41:0x009e  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static com.facebook.ads.redexgen.core.CS A0B(com.facebook.ads.redexgen.core.I4 i4) {
        long jA0M;
        int i;
        i4.A0Y(8);
        int iA01 = com.facebook.ads.redexgen.core.CO.A01(i4.A08());
        i4.A0Z(iA01 == 0 ? 8 : 16);
        int iA08 = i4.A08();
        i4.A0Z(4);
        boolean z = true;
        int iA06 = i4.A06();
        int i2 = iA01 == 0 ? 4 : 8;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i4.A00[iA06 + i3] != -1) {
                z = false;
                break;
            }
        }
        if (z) {
            i4.A0Z(i2);
            jA0M = androidx.media3.common.C.TIME_UNSET;
        } else {
            jA0M = iA01 == 0 ? i4.A0M() : i4.A0N();
            if (jA0M == 0) {
                jA0M = androidx.media3.common.C.TIME_UNSET;
            }
        }
        i4.A0Z(16);
        int iA09 = i4.A08();
        int iA010 = i4.A08();
        i4.A0Z(4);
        int iA011 = i4.A08();
        int iA012 = i4.A08();
        if (iA09 == 0 && iA010 == 65536 && iA011 == (-65536) && iA012 == 0) {
            i = 90;
        } else if (iA09 == 0) {
            int i5 = -65536;
            if (A01[4].length() != 24) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A01;
            strArr[0] = "DRv0rQs5Tea6yP10dxVxA";
            strArr[5] = "0Obd8siLUSB8su0UFYouw";
            if (iA010 == i5 && iA011 == 65536 && iA012 == 0) {
                i = 270;
            } else if (iA09 != (-65536) && iA010 == 0 && iA011 == 0 && iA012 == (-65536)) {
                i = org.objectweb.asm.Opcodes.GETFIELD;
            } else {
                i = 0;
            }
        } else if (iA09 != (-65536)) {
            i = 0;
        } else {
            i = 0;
        }
        return new com.facebook.ads.redexgen.core.CS(iA08, jA0M, i);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static com.facebook.ads.redexgen.core.C0621Cj A0C(com.facebook.ads.redexgen.core.YY yy, com.facebook.ads.redexgen.core.YX yx, long j, com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData drmInitData, boolean z, boolean z2) throws com.facebook.ads.redexgen.core.A0 {
        long j2 = j;
        com.facebook.ads.redexgen.core.YY yyA06 = yy.A06(com.facebook.ads.redexgen.core.CO.A0d);
        int iA02 = A02(yyA06.A07(com.facebook.ads.redexgen.core.CO.A0V).A00);
        if (iA02 == -1) {
            return null;
        }
        com.facebook.ads.redexgen.core.CS csA0B = A0B(yy.A07(com.facebook.ads.redexgen.core.CO.A1J).A00);
        if (j2 == androidx.media3.common.C.TIME_UNSET) {
            j2 = csA0B.A02;
        }
        long jA04 = A04(yx.A00);
        long jA0F = j2 == androidx.media3.common.C.TIME_UNSET ? androidx.media3.common.C.TIME_UNSET : com.facebook.ads.redexgen.core.IK.A0F(j2, 1000000L, jA04);
        com.facebook.ads.redexgen.core.YY yyA07 = yyA06.A06(com.facebook.ads.redexgen.core.CO.A0h).A06(com.facebook.ads.redexgen.core.CO.A16);
        android.util.Pair<java.lang.Long, java.lang.String> pairA06 = A06(yyA06.A07(com.facebook.ads.redexgen.core.CO.A0c).A00);
        com.facebook.ads.redexgen.core.CR crA0A = A0A(yyA07.A07(com.facebook.ads.redexgen.core.CO.A1A).A00, csA0B.A00, csA0B.A01, (java.lang.String) pairA06.second, drmInitData, z2);
        long[] jArr = null;
        long[] jArr2 = null;
        if (!z) {
            android.util.Pair<long[], long[]> pairA05 = A05(yy.A06(com.facebook.ads.redexgen.core.CO.A0N));
            jArr = (long[]) pairA05.first;
            jArr2 = (long[]) pairA05.second;
        }
        if (crA0A.A02 == null) {
            return null;
        }
        return new com.facebook.ads.redexgen.core.C0621Cj(csA0B.A00, iA02, ((java.lang.Long) pairA06.first).longValue(), jA04, jA0F, crA0A.A02, crA0A.A01, crA0A.A03, crA0A.A00, jArr, jArr2);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static com.facebook.ads.redexgen.core.C0622Ck A0D(com.facebook.ads.redexgen.core.I4 i4, int i, int i2, java.lang.String str) {
        int i3 = i + 8;
        while (i3 - i < i2) {
            i4.A0Y(i3);
            int iA08 = i4.A08();
            if (i4.A08() == com.facebook.ads.redexgen.core.CO.A1G) {
                int iA01 = com.facebook.ads.redexgen.core.CO.A01(i4.A08());
                i4.A0Z(1);
                int i5 = 0;
                int i6 = 0;
                if (iA01 != 0) {
                    int iA0E = i4.A0E();
                    java.lang.String[] strArr = A01;
                    if (strArr[1].length() == strArr[7].length()) {
                        java.lang.String[] strArr2 = A01;
                        strArr2[6] = "qu8ijNmmTbbg3oNQNlJL6MLizRZ8y";
                        strArr2[2] = "aYTRmwnSMEmjoN0pr4C9D2r3oJTUQ";
                        i5 = (iA0E & androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK) >> 4;
                        i6 = iA0E & 15;
                    }
                    throw new java.lang.RuntimeException();
                }
                i4.A0Z(1);
                boolean z = i4.A0E() == 1;
                int iA0E2 = i4.A0E();
                byte[] bArr = new byte[16];
                i4.A0c(bArr, 0, bArr.length);
                byte[] bArr2 = null;
                if (z && iA0E2 == 0) {
                    int iA0E3 = i4.A0E();
                    bArr2 = new byte[iA0E3];
                    i4.A0c(bArr2, 0, iA0E3);
                    if (A01[3].charAt(25) != 'q') {
                        A01[4] = "FzDJD7GxRHP6LR8w8noFgrhr";
                    }
                    throw new java.lang.RuntimeException();
                }
                return new com.facebook.ads.redexgen.core.C0622Ck(z, str, iA0E2, bArr, i5, i6, bArr2);
            }
            i3 += iA08;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x033e  */
    /* JADX WARN: Code duplicated, block: B:121:0x0344  */
    /* JADX WARN: Code duplicated, block: B:123:0x0369  */
    /* JADX WARN: Code duplicated, block: B:125:0x0373  */
    /* JADX WARN: Code duplicated, block: B:127:0x039c  */
    /* JADX WARN: Code duplicated, block: B:129:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:135:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:175:0x0496  */
    /* JADX WARN: Code duplicated, block: B:214:0x05aa  */
    /* JADX WARN: Code duplicated, block: B:68:0x019b  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c7 A[PHI: r0
  0x01c7: PHI (r0v101 long) = (r0v98 long), (r0v102 long) binds: [B:86:0x01e8, B:76:0x01c5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x01eb A[PHI: r0
  0x01eb: PHI (r0v99 long) = (r0v98 long), (r0v102 long) binds: [B:86:0x01e8, B:76:0x01c5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static com.facebook.ads.redexgen.core.C0624Cm A0E(com.facebook.ads.redexgen.core.C0621Cj c0621Cj, com.facebook.ads.redexgen.core.YY yy, com.facebook.ads.redexgen.core.C1 c1) throws com.facebook.ads.redexgen.core.A0 {
        com.facebook.ads.redexgen.core.CQ yv;
        boolean z;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int[] iArr2;
        long j;
        int[] iArr3;
        long j2;
        long jA0F;
        java.lang.String[] strArr;
        long jA0F2;
        long jA0F3;
        boolean z2;
        com.facebook.ads.redexgen.core.YX yxA07 = yy.A07(com.facebook.ads.redexgen.core.CO.A1C);
        if (yxA07 != null) {
            yv = new com.facebook.ads.redexgen.core.YW(yxA07);
        } else {
            com.facebook.ads.redexgen.core.YX yxA08 = yy.A07(com.facebook.ads.redexgen.core.CO.A1E);
            if (yxA08 == null) {
                throw new com.facebook.ads.redexgen.core.A0(A0I(230, 42, 27));
            }
            yv = new com.facebook.ads.redexgen.core.YV(yxA08);
        }
        int iA8C = yv.A8C();
        if (iA8C == 0) {
            return new com.facebook.ads.redexgen.core.C0624Cm(c0621Cj, new long[0], new int[0], 0, new long[0], new int[0], androidx.media3.common.C.TIME_UNSET);
        }
        boolean z3 = false;
        com.facebook.ads.redexgen.core.YX yxA09 = yy.A07(com.facebook.ads.redexgen.core.CO.A17);
        if (yxA09 == null) {
            z3 = true;
            yxA09 = yy.A07(com.facebook.ads.redexgen.core.CO.A0B);
        }
        com.facebook.ads.redexgen.core.I4 i4 = yxA09.A00;
        com.facebook.ads.redexgen.core.I4 i5 = yy.A07(com.facebook.ads.redexgen.core.CO.A19).A00;
        com.facebook.ads.redexgen.core.I4 i6 = yy.A07(com.facebook.ads.redexgen.core.CO.A1D).A00;
        com.facebook.ads.redexgen.core.YX yxA010 = yy.A07(com.facebook.ads.redexgen.core.CO.A1B);
        com.facebook.ads.redexgen.core.I4 i7 = yxA010 != null ? yxA010.A00 : null;
        com.facebook.ads.redexgen.core.YX yxA011 = yy.A07(com.facebook.ads.redexgen.core.CO.A0C);
        com.facebook.ads.redexgen.core.I4 i8 = yxA011 != null ? yxA011.A00 : null;
        com.facebook.ads.redexgen.core.CP cp = new com.facebook.ads.redexgen.core.CP(i5, i4, z3);
        i6.A0Y(12);
        int iA0H = i6.A0H() - 1;
        int iA0H2 = i6.A0H();
        int iA0H3 = i6.A0H();
        int iA0H4 = 0;
        int iA0H5 = 0;
        int iA08 = 0;
        if (i8 != null) {
            i8.A0Y(12);
            iA0H5 = i8.A0H();
        }
        int iA0H6 = -1;
        int iA0H7 = 0;
        if (i7 != null) {
            i7.A0Y(12);
            iA0H7 = i7.A0H();
            if (iA0H7 > 0) {
                iA0H6 = i7.A0H() - 1;
            } else {
                i7 = null;
            }
        }
        if (!yv.A9S()) {
            z = false;
        } else if (A0I(492, 9, 99).equals(c0621Cj.A07.A0O) && iA0H == 0 && iA0H5 == 0 && iA0H7 == 0) {
            z = true;
        } else {
            z = false;
        }
        int i = 0;
        long j3 = 0;
        java.lang.String strA0I = A0I(128, 11, 82);
        if (z) {
            long[] jArr3 = new long[cp.A05];
            int[] iArr4 = new int[cp.A05];
            while (cp.A02()) {
                jArr3[cp.A00] = cp.A02;
                iArr4[cp.A00] = cp.A01;
            }
            com.facebook.ads.redexgen.core.CW cwA00 = com.facebook.ads.redexgen.core.CX.A00(com.facebook.ads.redexgen.core.IK.A05(c0621Cj.A07.A0A, c0621Cj.A07.A05), jArr3, iArr4, iA0H3);
            jArr = cwA00.A04;
            iArr = cwA00.A03;
            i = cwA00.A00;
            jArr2 = cwA00.A05;
            iArr2 = cwA00.A02;
            j = cwA00.A01;
        } else {
            jArr = new long[iA8C];
            iArr = new int[iA8C];
            jArr2 = new long[iA8C];
            iArr2 = new int[iA8C];
            long j4 = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < iA8C; i3++) {
                while (i2 == 0) {
                    com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(cp.A02());
                    j4 = cp.A02;
                    i2 = cp.A01;
                }
                if (i8 != null) {
                    while (iA0H4 == 0 && iA0H5 > 0) {
                        iA0H4 = i8.A0H();
                        iA08 = i8.A08();
                        if (A01[3].charAt(25) == 'q') {
                            throw new java.lang.RuntimeException();
                        }
                        A01[4] = "T7MS70AgvrSYLWkO1L15UrY6";
                        iA0H5--;
                    }
                    iA0H4--;
                }
                jArr[i3] = j4;
                iArr[i3] = yv.AEq();
                if (iArr[i3] > i) {
                    i = iArr[i3];
                }
                jArr2[i3] = j3 + ((long) iA08);
                iArr2[i3] = i7 == null ? 1 : 0;
                if (i3 == iA0H6) {
                    iArr2[i3] = 1;
                    iA0H7--;
                    if (iA0H7 > 0) {
                        iA0H6 = i7.A0H() - 1;
                    }
                }
                j3 += (long) iA0H3;
                iA0H2--;
                if (iA0H2 == 0 && iA0H > 0) {
                    iA0H2 = i6.A0H();
                    iA0H3 = i6.A08();
                    iA0H--;
                }
                j4 += (long) iArr[i3];
                i2--;
            }
            if (A01[4].length() != 24) {
                java.lang.String[] strArr2 = A01;
                strArr2[6] = "1x4r3QDhXS8glXG5t4wNB39AR7uuM";
                strArr2[2] = "5j8IEQQYzKn3TpoBKrvmtIcpvFXFY";
                j = j3 + ((long) iA08);
                if (iA0H4 == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                A01[3] = "J25iE7lToAoHyJubBWfm6kDf3pcJ5bYZ";
                j = j3 + ((long) iA08);
                if (iA0H4 == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            com.facebook.ads.redexgen.core.AbstractC0730Hf.A03(z2);
            while (iA0H5 > 0) {
                com.facebook.ads.redexgen.core.AbstractC0730Hf.A03(i8.A0H() == 0);
                i8.A08();
                iA0H5--;
            }
            if (iA0H7 == 0 && iA0H2 == 0 && i2 == 0 && iA0H == 0) {
                java.lang.String[] strArr3 = A01;
                if (strArr3[0].length() == strArr3[5].length()) {
                    java.lang.String[] strArr4 = A01;
                    strArr4[0] = "VsKp6eoYBAwv0r8izw51M";
                    strArr4[5] = "dOPgIEAug0Ialy3H1BUHx";
                }
            } else {
                android.util.Log.w(strA0I, A0I(org.objectweb.asm.Opcodes.IFNULL, 32, 66) + c0621Cj.A00 + A0I(94, 34, 107) + iA0H7 + A0I(0, 35, 91) + iA0H2 + A0I(35, 26, 10) + i2 + A0I(61, 33, 92) + iA0H);
            }
        }
        long jA0F4 = com.facebook.ads.redexgen.core.IK.A0F(j, 1000000L, c0621Cj.A06);
        if (c0621Cj.A08 != null) {
            boolean zA03 = c1.A03();
            java.lang.String[] strArr5 = A01;
            if (strArr5[1].length() != strArr5[7].length()) {
                throw new java.lang.RuntimeException();
            }
            A01[3] = "jVrpzpD1joJQABonj7NJjNbCdWJy5EdT";
            if (!zA03) {
                if (c0621Cj.A08.length == 1) {
                    int i9 = c0621Cj.A03;
                    java.lang.String[] strArr6 = A01;
                    if (strArr6[6].length() != strArr6[2].length()) {
                        java.lang.String[] strArr7 = A01;
                        strArr7[6] = "WthGMIXdWOz8Ua0OooxNnGjRurSTX";
                        strArr7[2] = "8iQ8dtTSUAyRJALmcBZVJU5NaK75t";
                        if (i9 == 1) {
                            if (jArr2.length >= 2) {
                                j2 = c0621Cj.A09[0];
                                jA0F = j2 + com.facebook.ads.redexgen.core.IK.A0F(c0621Cj.A08[0], c0621Cj.A06, c0621Cj.A05);
                                strArr = A01;
                                if (strArr[1].length() != strArr[7].length()) {
                                    A01[4] = "rX3C7Ywl9vX0ZnhkJJoFAv9K";
                                    if (A0N(jArr2, j, j2, jA0F)) {
                                        jA0F2 = com.facebook.ads.redexgen.core.IK.A0F(j2 - jArr2[0], c0621Cj.A07.A0C, c0621Cj.A06);
                                        jA0F3 = com.facebook.ads.redexgen.core.IK.A0F(j - jA0F, c0621Cj.A07.A0C, c0621Cj.A06);
                                        if (jA0F2 == 0) {
                                            c1.A00 = (int) jA0F2;
                                            c1.A01 = (int) jA0F3;
                                            com.facebook.ads.redexgen.core.IK.A0a(jArr2, 1000000L, c0621Cj.A06);
                                            return new com.facebook.ads.redexgen.core.C0624Cm(c0621Cj, jArr, iArr, i, jArr2, iArr2, jA0F4);
                                        }
                                        c1.A00 = (int) jA0F2;
                                        c1.A01 = (int) jA0F3;
                                        com.facebook.ads.redexgen.core.IK.A0a(jArr2, 1000000L, c0621Cj.A06);
                                        return new com.facebook.ads.redexgen.core.C0624Cm(c0621Cj, jArr, iArr, i, jArr2, iArr2, jA0F4);
                                    }
                                } else if (A0N(jArr2, j, j2, jA0F)) {
                                    jA0F2 = com.facebook.ads.redexgen.core.IK.A0F(j2 - jArr2[0], c0621Cj.A07.A0C, c0621Cj.A06);
                                    jA0F3 = com.facebook.ads.redexgen.core.IK.A0F(j - jA0F, c0621Cj.A07.A0C, c0621Cj.A06);
                                    if ((jA0F2 == 0 || jA0F3 != 0) && jA0F2 <= 2147483647L && jA0F3 <= 2147483647L) {
                                        c1.A00 = (int) jA0F2;
                                        c1.A01 = (int) jA0F3;
                                        com.facebook.ads.redexgen.core.IK.A0a(jArr2, 1000000L, c0621Cj.A06);
                                        return new com.facebook.ads.redexgen.core.C0624Cm(c0621Cj, jArr, iArr, i, jArr2, iArr2, jA0F4);
                                    }
                                }
                            }
                        }
                    } else {
                        java.lang.String[] strArr8 = A01;
                        strArr8[1] = "niaOhVyF9zijLlBeQnQS92PK7EH1dL";
                        strArr8[7] = "UB8uQ6YloO9Kj57UpEBRfKbQwbRLnU";
                        if (i9 == 1) {
                            if (jArr2.length >= 2) {
                                j2 = c0621Cj.A09[0];
                                jA0F = j2 + com.facebook.ads.redexgen.core.IK.A0F(c0621Cj.A08[0], c0621Cj.A06, c0621Cj.A05);
                                strArr = A01;
                                if (strArr[1].length() != strArr[7].length()) {
                                    A01[4] = "rX3C7Ywl9vX0ZnhkJJoFAv9K";
                                    if (A0N(jArr2, j, j2, jA0F)) {
                                        jA0F2 = com.facebook.ads.redexgen.core.IK.A0F(j2 - jArr2[0], c0621Cj.A07.A0C, c0621Cj.A06);
                                        jA0F3 = com.facebook.ads.redexgen.core.IK.A0F(j - jA0F, c0621Cj.A07.A0C, c0621Cj.A06);
                                        if (jA0F2 == 0) {
                                            c1.A00 = (int) jA0F2;
                                            c1.A01 = (int) jA0F3;
                                            com.facebook.ads.redexgen.core.IK.A0a(jArr2, 1000000L, c0621Cj.A06);
                                            return new com.facebook.ads.redexgen.core.C0624Cm(c0621Cj, jArr, iArr, i, jArr2, iArr2, jA0F4);
                                        }
                                        c1.A00 = (int) jA0F2;
                                        c1.A01 = (int) jA0F3;
                                        com.facebook.ads.redexgen.core.IK.A0a(jArr2, 1000000L, c0621Cj.A06);
                                        return new com.facebook.ads.redexgen.core.C0624Cm(c0621Cj, jArr, iArr, i, jArr2, iArr2, jA0F4);
                                    }
                                } else if (A0N(jArr2, j, j2, jA0F)) {
                                    jA0F2 = com.facebook.ads.redexgen.core.IK.A0F(j2 - jArr2[0], c0621Cj.A07.A0C, c0621Cj.A06);
                                    jA0F3 = com.facebook.ads.redexgen.core.IK.A0F(j - jA0F, c0621Cj.A07.A0C, c0621Cj.A06);
                                    if (jA0F2 == 0) {
                                        c1.A00 = (int) jA0F2;
                                        c1.A01 = (int) jA0F3;
                                        com.facebook.ads.redexgen.core.IK.A0a(jArr2, 1000000L, c0621Cj.A06);
                                        return new com.facebook.ads.redexgen.core.C0624Cm(c0621Cj, jArr, iArr, i, jArr2, iArr2, jA0F4);
                                    }
                                    c1.A00 = (int) jA0F2;
                                    c1.A01 = (int) jA0F3;
                                    com.facebook.ads.redexgen.core.IK.A0a(jArr2, 1000000L, c0621Cj.A06);
                                    return new com.facebook.ads.redexgen.core.C0624Cm(c0621Cj, jArr, iArr, i, jArr2, iArr2, jA0F4);
                                }
                            }
                        }
                    }
                }
                if (c0621Cj.A08.length == 1 && c0621Cj.A08[0] == 0) {
                    long j5 = c0621Cj.A09[0];
                    for (int i10 = 0; i10 < jArr2.length; i10++) {
                        jArr2[i10] = com.facebook.ads.redexgen.core.IK.A0F(jArr2[i10] - j5, 1000000L, c0621Cj.A06);
                    }
                    return new com.facebook.ads.redexgen.core.C0624Cm(c0621Cj, jArr, iArr, i, jArr2, iArr2, com.facebook.ads.redexgen.core.IK.A0F(j - j5, 1000000L, c0621Cj.A06));
                }
                boolean z4 = c0621Cj.A03 == 1;
                int i11 = 0;
                int i12 = 0;
                boolean z5 = false;
                for (int i13 = 0; i13 < c0621Cj.A08.length; i13++) {
                    long j6 = c0621Cj.A09[i13];
                    if (j6 != -1) {
                        long jA0F5 = com.facebook.ads.redexgen.core.IK.A0F(c0621Cj.A08[i13], c0621Cj.A06, c0621Cj.A05);
                        int iA0A = com.facebook.ads.redexgen.core.IK.A0A(jArr2, j6, true, true);
                        int iA0A2 = com.facebook.ads.redexgen.core.IK.A0A(jArr2, j6 + jA0F5, z4, false);
                        i11 += iA0A2 - iA0A;
                        z5 |= i12 != iA0A;
                        i12 = iA0A2;
                    }
                }
                boolean z6 = z5 | (i11 != iA8C);
                long[] jArr4 = z6 ? new long[i11] : jArr;
                if (A01[4].length() == 24) {
                    A01[3] = "HX38PpSpJdKJVnralw4JeP7WhnL3Yt36";
                    if (z6) {
                        iArr3 = new int[i11];
                    } else {
                        iArr3 = iArr;
                    }
                } else if (z6) {
                    iArr3 = new int[i11];
                } else {
                    iArr3 = iArr;
                }
                if (z6) {
                    i = 0;
                }
                int[] iArr5 = z6 ? new int[i11] : iArr2;
                long[] jArr5 = new long[i11];
                long j7 = 0;
                int i14 = 0;
                int i15 = 0;
                while (i15 < c0621Cj.A08.length) {
                    long j8 = c0621Cj.A09[i15];
                    long j9 = c0621Cj.A08[i15];
                    if (j8 != -1) {
                        long jA0F6 = com.facebook.ads.redexgen.core.IK.A0F(j9, c0621Cj.A06, c0621Cj.A05) + j8;
                        int iA0A3 = com.facebook.ads.redexgen.core.IK.A0A(jArr2, j8, true, true);
                        int iA0A4 = com.facebook.ads.redexgen.core.IK.A0A(jArr2, jA0F6, z4, false);
                        if (z6) {
                            int i16 = iA0A4 - iA0A3;
                            java.lang.String[] strArr9 = A01;
                            if (strArr9[0].length() != strArr9[5].length()) {
                                throw new java.lang.RuntimeException();
                            }
                            java.lang.String[] strArr10 = A01;
                            strArr10[6] = "8xc2WX4GXe9BUi9sicQW3M3nkEbYD";
                            strArr10[2] = "iLkGavMjd9hnsoPn7ianFz22ioWov";
                            java.lang.System.arraycopy(jArr, iA0A3, jArr4, i14, i16);
                            java.lang.System.arraycopy(iArr, iA0A3, iArr3, i14, i16);
                            java.lang.System.arraycopy(iArr2, iA0A3, iArr5, i14, i16);
                        }
                        if (iA0A3 < iA0A4 && (iArr5[i14] & 1) == 0) {
                            android.util.Log.w(strA0I, A0I(139, 59, 60));
                            throw new com.facebook.ads.redexgen.core.YU();
                        }
                        while (iA0A3 < iA0A4) {
                            jArr5[i14] = com.facebook.ads.redexgen.core.IK.A0F(j7, 1000000L, c0621Cj.A05) + com.facebook.ads.redexgen.core.IK.A0F(jArr2[iA0A3] - j8, 1000000L, c0621Cj.A06);
                            if (z6 && iArr3[i14] > i) {
                                i = iArr[iA0A3];
                            }
                            i14++;
                            iA0A3++;
                        }
                    } else {
                        java.lang.String[] strArr11 = A01;
                        if (strArr11[1].length() != strArr11[7].length()) {
                            java.lang.String[] strArr12 = A01;
                            strArr12[6] = "AsAVvem5NMhWIybfEXO67YivXGRhJ";
                            strArr12[2] = "w3z0UenH5hv2GBLFucIqZRSJgTZ5n";
                        } else {
                            java.lang.String[] strArr13 = A01;
                            strArr13[1] = "FqUet2Edp63uvuYFixWWLVfsIcw5ss";
                            strArr13[7] = "0Phl3rkV9F7T5BEuWD41D0LyczkgXJ";
                        }
                    }
                    j7 += j9;
                    java.lang.String[] strArr14 = A01;
                    if (strArr14[0].length() != strArr14[5].length()) {
                        java.lang.String[] strArr15 = A01;
                        strArr15[1] = "rX1q8KDYISuui1UpUJDl9yaJUetve8";
                        strArr15[7] = "UO8dIb2HXniEFtq1NmRGmusPRyIKNO";
                        i15 += 0;
                    } else {
                        A01[3] = "zEF3wbvGOcT6k47GmAiaT8QyjmuvCsOG";
                        i15++;
                    }
                }
                return new com.facebook.ads.redexgen.core.C0624Cm(c0621Cj, jArr4, iArr3, i, jArr5, iArr5, com.facebook.ads.redexgen.core.IK.A0F(j7, 1000000L, c0621Cj.A06));
            }
        }
        com.facebook.ads.redexgen.core.IK.A0a(jArr2, 1000000L, c0621Cj.A06);
        return new com.facebook.ads.redexgen.core.C0624Cm(c0621Cj, jArr, iArr, i, jArr2, iArr2, jA0F4);
    }

    public static java.lang.String A0I(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 19);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A0J() {
        A00 = new byte[]{-102, -114, -32, -45, -37, -49, -41, -36, -41, -36, -43, -63, -49, -37, -34, -38, -45, -31, -81, -30, -62, -41, -37, -45, -31, -30, -49, -37, -34, -78, -45, -38, -30, -49, -114, 73, kotlin.io.encoding.Base64.padSymbol, -113, -126, -118, 126, -122, -117, -122, -117, -124, 112, 126, -118, -115, -119, -126, -112, 102, -117, 96, -123, -110, -117, -120, kotlin.io.encoding.Base64.padSymbol, -101, -113, -31, -44, -36, -48, -40, -35, -40, -35, -42, -61, -40, -36, -44, -30, -29, -48, -36, -33, -77, -44, -37, -29, -48, -78, -41, -48, -35, -42, -44, -30, -113, -72, -98, -16, -29, -21, -33, -25, -20, -25, -20, -27, -47, -9, -20, -31, -26, -16, -19, -20, -25, -8, -33, -14, -25, -19, -20, -47, -33, -21, -18, -22, -29, -15, -98, -90, -39, -44, -46, -75, -58, -41, -40, -54, -41, -40, -104, -74, -67, -66, -63, -72, -67, -74, 111, -76, -77, -72, -61, 111, -69, -72, -62, -61, -119, 111, -76, -77, -72, -61, 111, -77, -66, -76, -62, 111, -67, -66, -61, 111, -62, -61, -80, -63, -61, 111, -58, -72, -61, -73, 111, -80, 111, -62, -56, -67, -78, 111, -62, -80, -68, -65, -69, -76, 125, -98, -61, -72, -60, -61, -56, -66, -56, -55, -70, -61, -55, 117, -56, -55, -73, -63, 117, -73, -60, -51, 117, -69, -60, -57, 117, -55, -57, -74, -72, -64, 117, -126, -96, -113, -111, -103, 78, -106, -113, -95, 78, -100, -99, 78, -95, -113, -101, -98, -102, -109, 78, -94, -113, -112, -102, -109, 78, -95, -105, -88, -109, 78, -105, -100, -108, -99, -96, -101, -113, -94, -105, -99, -100, -95, -70, -65, -63, -68, -68, -69, -66, -64, -79, -80, 108, -71, -79, -80, -75, -83, 108, -66, -83, -64, -79, 122, -24, -9, -9, -13, -16, -22, -24, -5, -16, -10, -11, -74, -5, -5, -12, -13, -78, -1, -12, -13, -103, -88, -88, -92, -95, -101, -103, -84, -95, -89, -90, 103, -80, 101, -101, -103, -91, -99, -86, -103, 101, -91, -89, -84, -95, -89, -90, -80, -65, -65, -69, -72, -78, -80, -61, -72, -66, -67, 126, -57, 124, -68, -65, -125, 124, -78, -76, -80, 124, -123, 127, -121, -92, -77, -77, -81, -84, -90, -92, -73, -84, -78, -79, 114, -69, 112, -80, -77, 119, 112, -71, -73, -73, -110, -95, -95, -99, -102, -108, -110, -91, -102, -96, -97, 96, -87, 94, -94, -90, -102, -108, -100, -91, -102, -98, -106, 94, -91, -87, 100, -104, -24, -4, -21, -16, -10, -74, -70, -18, -9, -9, -60, -40, -57, -52, -46, -110, -60, -58, -106, -52, -32, -49, -44, -38, -102, -52, -41, -52, -50, -101, -81, -98, -93, -87, 105, -101, -89, -84, 103, -79, -100, -32, -12, -29, -24, -18, -82, -28, -32, -30, -78, -37, -17, -34, -29, -23, -87, -25, -22, -82, -37, -89, -26, -37, -18, -25, -119, -99, -116, -111, -105, 87, -107, -104, -115, -113, -41, -21, -38, -33, -27, -91, -24, -41, -19, 116, -120, 119, 124, -126, 66, -119, -127, 119, 65, 119, -121, -122, -13, 7, -10, -5, 1, -63, 8, 0, -10, -64, -10, 6, 5, -64, -6, -10, -111, -91, -108, -103, -97, 95, -90, -98, -108, 94, -108, -92, -93, 94, -104, -108, 107, -96, -94, -97, -106, -103, -100, -107, 109, -100, -110, -94, -19, -20, -19, -69, -93, -94, -93, -77, -82, -80, -71, -82, 124, 126, -121, -116, -11, -6, -5, -2, -10, -45, 6, 1, -1, -27, -5, 12, -9, -78, 5, -6, 1, 7, -2, -10, -78, -12, -9, -78, 2, 1, 5, -5, 6, -5, 8, -9, -94, -85, -94, -81, -125, -113, -118, 126, kotlin.io.encoding.Base64.padSymbol, 126, -111, -116, -118, kotlin.io.encoding.Base64.padSymbol, -122, -112, kotlin.io.encoding.Base64.padSymbol, -118, 126, -117, -127, 126, -111, -116, -113, -106, -37, -45, -30, -49, -20, -37, -19, -27, -79, -95, -90, -89, 94, -97, -78, -83, -85, 94, -89, -79, 94, -85, -97, -84, -94, -97, -78, -83, -80, -73, -88, -92, -86, -93, -69, -67, -86, -68, -85, -100, -91, -102, 87, -104, -85, -90, -92, 87, -96, -86, 87, -92, -104, -91, -101, -104, -85, -90, -87, -80, -13, -28, -9, -13, -80, -93, -98, -97, -97, -110, -115, -114, -104, 88, 92, -112, -103, -103, 1, -12, -17, -16, -6, -70, -20, 1, -18, -35, -48, -53, -52, -42, -106, -49, -52, -35, -54, -39, -52, -57, -56, -46, -110, -37, -112, -39, -47, -57, -111, -46, -47, -107, -111, -39, -45, -101, -100, -113, -118, -117, -107, 85, -98, 83, -100, -108, -118, 84, -107, -108, 88, 84, -100, -106, 95};
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:77:0x019b  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0K(com.facebook.ads.redexgen.core.I4 i4, int i, int i2, int i3, int i5, int i6, com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData drmInitData, com.facebook.ads.redexgen.core.CR cr, int i7) throws com.facebook.ads.redexgen.core.A0 {
        com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData drmInitDataA02 = drmInitData;
        int iIntValue = i;
        i4.A0Y(i2 + 8 + 8);
        i4.A0Z(16);
        int iA0I = i4.A0I();
        int iA0I2 = i4.A0I();
        boolean z = false;
        float fA00 = 1.0f;
        i4.A0Z(50);
        int iA06 = i4.A06();
        if (iIntValue == com.facebook.ads.redexgen.core.CO.A0R) {
            android.util.Pair<java.lang.Integer, com.facebook.ads.redexgen.core.C0622Ck> pairA09 = A09(i4, i2, i3);
            if (pairA09 != null) {
                iIntValue = ((java.lang.Integer) pairA09.first).intValue();
                drmInitDataA02 = drmInitDataA02 == null ? null : drmInitDataA02.A02(((com.facebook.ads.redexgen.core.C0622Ck) pairA09.second).A02);
                cr.A03[i7] = (com.facebook.ads.redexgen.core.C0622Ck) pairA09.second;
            }
            i4.A0Y(iA06);
        }
        java.util.List<byte[]> listSingletonList = null;
        java.lang.String strA0I = null;
        byte[] bArrA0O = null;
        int i8 = -1;
        while (iA06 - i2 < i3) {
            i4.A0Y(iA06);
            int iA07 = i4.A06();
            int iA08 = i4.A08();
            if (iA08 == 0 && i4.A06() - i2 == i3) {
                if (strA0I == null) {
                    return;
                }
                cr.A02 = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A04(java.lang.Integer.toString(i5), strA0I, null, -1, -1, iA0I, iA0I2, -1.0f, listSingletonList, i6, fA00, bArrA0O, i8, null, drmInitDataA02);
            }
            com.facebook.ads.redexgen.core.AbstractC0730Hf.A05(iA08 > 0, A0I(574, 32, 127));
            int iA09 = i4.A08();
            if (iA09 == com.facebook.ads.redexgen.core.CO.A08) {
                com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(strA0I == null);
                strA0I = A0I(710, 9, 120);
                i4.A0Y(iA07 + 8);
                com.facebook.ads.redexgen.core.IM imA00 = com.facebook.ads.redexgen.core.IM.A00(i4);
                listSingletonList = imA00.A04;
                cr.A00 = imA00.A02;
                if (!z) {
                    fA00 = imA00.A00;
                }
            } else if (iA09 == com.facebook.ads.redexgen.core.CO.A0Y) {
                com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(strA0I == null);
                strA0I = A0I(androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection.DEFAULT_MAX_HEIGHT_TO_DISCARD, 10, 84);
                i4.A0Y(iA07 + 8);
                com.facebook.ads.redexgen.core.IS isA00 = com.facebook.ads.redexgen.core.IS.A00(i4);
                listSingletonList = isA00.A01;
                cr.A00 = isA00.A00;
            } else if (iA09 == com.facebook.ads.redexgen.core.CO.A1U) {
                com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(strA0I == null);
                strA0I = iIntValue == com.facebook.ads.redexgen.core.CO.A1S ? A0I(729, 19, 80) : A0I(748, 19, 19);
            } else if (iA09 == com.facebook.ads.redexgen.core.CO.A0D) {
                com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(strA0I == null);
                strA0I = A0I(700, 10, 22);
            } else if (iA09 == com.facebook.ads.redexgen.core.CO.A0S) {
                com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(strA0I == null);
                android.util.Pair<java.lang.String, byte[]> pairA07 = A07(i4, iA07);
                strA0I = (java.lang.String) pairA07.first;
                listSingletonList = java.util.Collections.singletonList((byte[]) pairA07.second);
            } else if (iA09 == com.facebook.ads.redexgen.core.CO.A0p) {
                fA00 = A00(i4, iA07);
                z = true;
            } else {
                int i9 = com.facebook.ads.redexgen.core.CO.A1F;
                if (A01[4].length() != 24) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr = A01;
                strArr[0] = "iYmWMA5MLL1Wi0FqlWhWy";
                strArr[5] = "xHQBUoymKE76LzHx1pe9u";
                if (iA09 == i9) {
                    bArrA0O = A0O(i4, iA07, iA08);
                } else if (iA09 == com.facebook.ads.redexgen.core.CO.A15) {
                    int iA0E = i4.A0E();
                    i4.A0Z(3);
                    if (iA0E == 0) {
                        switch (i4.A0E()) {
                            case 0:
                                i8 = 0;
                                break;
                            case 1:
                                i8 = 1;
                                break;
                            case 2:
                                i8 = 2;
                                break;
                            case 3:
                                i8 = 3;
                                break;
                        }
                    }
                }
            }
            iA06 += iA08;
        }
        if (strA0I == null) {
            return;
        }
        cr.A02 = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A04(java.lang.Integer.toString(i5), strA0I, null, -1, -1, iA0I, iA0I2, -1.0f, listSingletonList, i6, fA00, bArrA0O, i8, null, drmInitDataA02);
    }

    static {
        A0J();
        A08 = com.facebook.ads.redexgen.core.IK.A08(A0I(696, 4, 39));
        A05 = com.facebook.ads.redexgen.core.IK.A08(A0I(662, 4, 34));
        A07 = com.facebook.ads.redexgen.core.IK.A08(A0I(692, 4, 108));
        A04 = com.facebook.ads.redexgen.core.IK.A08(A0I(636, 4, 102));
        A06 = com.facebook.ads.redexgen.core.IK.A08(A0I(com.bytedance.sdk.openadsdk.TTAdConstant.STYLE_SIZE_RADIO_2_3, 4, 53));
        A02 = com.facebook.ads.redexgen.core.IK.A08(A0I(606, 4, 44));
        A03 = com.facebook.ads.redexgen.core.IK.A08(A0I(632, 4, 91));
    }

    public static float A00(com.facebook.ads.redexgen.core.I4 i4, int i) {
        i4.A0Y(i + 8);
        int vSpacing = i4.A0H();
        int hSpacing = i4.A0H();
        return vSpacing / hSpacing;
    }

    public static int A01(com.facebook.ads.redexgen.core.I4 i4) {
        int iA0E = i4.A0E();
        int size = iA0E & 127;
        while ((iA0E & 128) == 128) {
            iA0E = i4.A0E();
            int currentByte = iA0E & 127;
            size = (size << 7) | currentByte;
        }
        return size;
    }

    public static int A02(com.facebook.ads.redexgen.core.I4 i4) {
        i4.A0Y(16);
        int iA08 = i4.A08();
        int trackType = A05;
        if (iA08 == trackType) {
            return 1;
        }
        int trackType2 = A08;
        if (iA08 == trackType2) {
            return 2;
        }
        int trackType3 = A07;
        if (iA08 == trackType3) {
            return 3;
        }
        int trackType4 = A04;
        if (iA08 == trackType4) {
            return 3;
        }
        int trackType5 = A06;
        if (iA08 == trackType5) {
            return 3;
        }
        int trackType6 = A02;
        if (iA08 == trackType6) {
            return 3;
        }
        int i = A03;
        java.lang.String[] strArr = A01;
        java.lang.String str = strArr[0];
        java.lang.String str2 = strArr[5];
        int length = str.length();
        int trackType7 = str2.length();
        if (length != trackType7) {
            throw new java.lang.RuntimeException();
        }
        A01[4] = "ptSvWaLuPQhFEfQVJrBGw099";
        if (iA08 == i) {
            return 4;
        }
        return -1;
    }

    public static int A03(com.facebook.ads.redexgen.core.I4 i4, int i, int i2) {
        int iA06 = i4.A06();
        while (childAtomPosition < i2) {
            i4.A0Y(iA06);
            int iA08 = i4.A08();
            com.facebook.ads.redexgen.core.AbstractC0730Hf.A05(iA08 > 0, A0I(574, 32, 127));
            int childAtomSize = i4.A08();
            int childAtomPosition = com.facebook.ads.redexgen.core.CO.A0S;
            if (childAtomSize == childAtomPosition) {
                return iA06;
            }
            iA06 += iA08;
        }
        return -1;
    }

    public static long A04(com.facebook.ads.redexgen.core.I4 i4) {
        int fullAtom = 8;
        i4.A0Y(8);
        if (com.facebook.ads.redexgen.core.CO.A01(i4.A08()) != 0) {
            fullAtom = 16;
        }
        i4.A0Z(fullAtom);
        return i4.A0M();
    }

    public static android.util.Pair<java.lang.Long, java.lang.String> A06(com.facebook.ads.redexgen.core.I4 i4) {
        i4.A0Y(8);
        int fullAtom = com.facebook.ads.redexgen.core.CO.A01(i4.A08());
        int languageCode = fullAtom == 0 ? 8 : 16;
        i4.A0Z(languageCode);
        long jA0M = i4.A0M();
        int version = fullAtom == 0 ? 4 : 8;
        i4.A0Z(version);
        int iA0I = i4.A0I();
        int languageCode2 = iA0I >> 10;
        java.lang.StringBuilder sbAppend = new java.lang.StringBuilder().append(A0I(0, 0, 85)).append((char) ((languageCode2 & 31) + 96));
        int languageCode3 = iA0I >> 5;
        java.lang.StringBuilder sbAppend2 = sbAppend.append((char) ((languageCode3 & 31) + 96));
        int languageCode4 = iA0I & 31;
        return android.util.Pair.create(java.lang.Long.valueOf(jA0M), sbAppend2.append((char) (languageCode4 + 96)).toString());
    }

    public static android.util.Pair<java.lang.String, byte[]> A07(com.facebook.ads.redexgen.core.I4 i4, int i) {
        i4.A0Y(i + 8 + 4);
        i4.A0Z(1);
        A01(i4);
        i4.A0Z(2);
        int iA0E = i4.A0E();
        if ((iA0E & 128) != 0) {
            i4.A0Z(2);
        }
        if ((iA0E & 64) != 0) {
            i4.A0Z(i4.A0I());
        }
        int i2 = iA0E & 32;
        if (A01[3].charAt(25) != 'q') {
            A01[4] = "9zjbq8A01Hky9x2uEvc360p9";
            if (i2 != 0) {
                i4.A0Z(2);
            }
            i4.A0Z(1);
            A01(i4);
            java.lang.String mimeType = com.facebook.ads.redexgen.core.AbstractC0748Hx.A03(i4.A0E());
            if (!A0I(482, 10, 21).equals(mimeType) && !A0I(501, 13, 0).equals(mimeType)) {
                boolean zEquals = A0I(com.json.mediationsdk.utils.IronSourceConstants.INIT_COMPLETE, 16, 127).equals(mimeType);
                int objectTypeIndication = A01[4].length();
                if (objectTypeIndication != 24) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr = A01;
                strArr[6] = "EPCMbb5M2ndyYlrS8sZelweUVDWhj";
                strArr[2] = "RxyG9YUmCwxkJjXIkU0O3vs0xICJ2";
                if (!zEquals) {
                    i4.A0Z(12);
                    i4.A0Z(1);
                    int flags = A01(i4);
                    byte[] bArr = new byte[flags];
                    i4.A0c(bArr, 0, flags);
                    return android.util.Pair.create(mimeType, bArr);
                }
            }
            return android.util.Pair.create(mimeType, null);
        }
        throw new java.lang.RuntimeException();
    }

    public static android.util.Pair<java.lang.Integer, com.facebook.ads.redexgen.core.C0622Ck> A08(com.facebook.ads.redexgen.core.I4 i4, int i, int i2) {
        int i3 = i + 8;
        int childAtomType = -1;
        int childAtomSize = 0;
        java.lang.String schemeType = null;
        java.lang.Integer dataFormat = null;
        while (true) {
            int i5 = i3 - i;
            java.lang.String[] strArr = A01;
            java.lang.String str = strArr[6];
            java.lang.String str2 = strArr[2];
            int schemeInformationBoxPosition = str.length();
            int childPosition = str2.length();
            if (schemeInformationBoxPosition != childPosition) {
                break;
            }
            java.lang.String[] strArr2 = A01;
            strArr2[1] = "u8GxPqM0qiVjecpGcAI22AXxAkx5XE";
            strArr2[7] = "6HZRT7kxjkFFZpA9NZx363WBPs3Huj";
            if (i5 < i2) {
                i4.A0Y(i3);
                int schemeInformationBoxSize = i4.A08();
                int schemeInformationBoxPosition2 = i4.A08();
                int childPosition2 = com.facebook.ads.redexgen.core.CO.A0T;
                if (schemeInformationBoxPosition2 == childPosition2) {
                    int childPosition3 = i4.A08();
                    dataFormat = java.lang.Integer.valueOf(childPosition3);
                } else {
                    int childPosition4 = com.facebook.ads.redexgen.core.CO.A0z;
                    if (schemeInformationBoxPosition2 == childPosition4) {
                        i4.A0Z(4);
                        schemeType = i4.A0S(4);
                    } else {
                        int childPosition5 = com.facebook.ads.redexgen.core.CO.A0y;
                        if (schemeInformationBoxPosition2 == childPosition5) {
                            childAtomType = i3;
                            childAtomSize = schemeInformationBoxSize;
                        }
                    }
                }
                i3 += schemeInformationBoxSize;
            } else {
                if (A0I(566, 4, 56).equals(schemeType) || A0I(558, 4, 119).equals(schemeType) || A0I(570, 4, 6).equals(schemeType) || A0I(com.bytedance.sdk.openadsdk.TTAdConstant.STYLE_SIZE_RADIO_9_16, 4, 45).equals(schemeType)) {
                    boolean z = true;
                    com.facebook.ads.redexgen.core.AbstractC0730Hf.A05(dataFormat != null, A0I(610, 22, 10));
                    com.facebook.ads.redexgen.core.AbstractC0730Hf.A05(childAtomType != -1, A0I(640, 22, 43));
                    com.facebook.ads.redexgen.core.C0622Ck c0622CkA0D = A0D(i4, childAtomType, childAtomSize, schemeType);
                    if (c0622CkA0D == null) {
                        z = false;
                    }
                    com.facebook.ads.redexgen.core.AbstractC0730Hf.A05(z, A0I(670, 22, 36));
                    android.util.Pair<java.lang.Integer, com.facebook.ads.redexgen.core.C0622Ck> pairCreate = android.util.Pair.create(dataFormat, c0622CkA0D);
                    java.lang.String[] strArr3 = A01;
                    java.lang.String str3 = strArr3[1];
                    java.lang.String str4 = strArr3[7];
                    int schemeInformationBoxPosition3 = str3.length();
                    int childPosition6 = str4.length();
                    if (schemeInformationBoxPosition3 != childPosition6) {
                        break;
                    }
                    A01[4] = "BomvvRogxkATO5u6fLPcNSRZ";
                    return pairCreate;
                }
                return null;
            }
        }
        throw new java.lang.RuntimeException();
    }

    public static android.util.Pair<java.lang.Integer, com.facebook.ads.redexgen.core.C0622Ck> A09(com.facebook.ads.redexgen.core.I4 i4, int i, int i2) {
        android.util.Pair<java.lang.Integer, com.facebook.ads.redexgen.core.C0622Ck> pairA08;
        int iA06 = i4.A06();
        while (childPosition < i2) {
            i4.A0Y(iA06);
            int iA08 = i4.A08();
            if (A01[3].charAt(25) == 'q') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A01;
            strArr[0] = "z9X14U2xyaoBmPkEGCOx1";
            strArr[5] = "DsriTKfNXeqdZCjpQL7vy";
            com.facebook.ads.redexgen.core.AbstractC0730Hf.A05(iA08 > 0, A0I(574, 32, 127));
            int childAtomSize = i4.A08();
            int childPosition = com.facebook.ads.redexgen.core.CO.A13;
            if (childAtomSize == childPosition && (pairA08 = A08(i4, iA06, iA08)) != null) {
                return pairA08;
            }
            iA06 += iA08;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0076  */
    /* JADX WARN: Code duplicated, block: B:71:0x0132  */
    /* JADX WARN: Code duplicated, block: B:76:0x0157  */
    public static com.facebook.ads.redexgen.core.CR A0A(com.facebook.ads.redexgen.core.I4 i4, int i, int i2, java.lang.String str, com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData drmInitData, boolean z) throws com.facebook.ads.redexgen.core.A0 {
        i4.A0Y(12);
        int iA08 = i4.A08();
        com.facebook.ads.redexgen.core.CR cr = new com.facebook.ads.redexgen.core.CR(iA08);
        int childStartPosition = 0;
        while (childStartPosition < iA08) {
            int iA06 = i4.A06();
            int iA09 = i4.A08();
            com.facebook.ads.redexgen.core.AbstractC0730Hf.A05(iA09 > 0, A0I(574, 32, 127));
            int iA010 = i4.A08();
            if (iA010 != com.facebook.ads.redexgen.core.CO.A06 && iA010 != com.facebook.ads.redexgen.core.CO.A07) {
                int i3 = com.facebook.ads.redexgen.core.CO.A0R;
                java.lang.String[] strArr = A01;
                if (strArr[0].length() == strArr[5].length()) {
                    A01[3] = "lyak74LYl3NueiVoRRMM3bxQDe0CQS4M";
                    if (iA010 == i3 || iA010 == com.facebook.ads.redexgen.core.CO.A0l || iA010 == com.facebook.ads.redexgen.core.CO.A0X || iA010 == com.facebook.ads.redexgen.core.CO.A0W || iA010 == com.facebook.ads.redexgen.core.CO.A0s || iA010 == com.facebook.ads.redexgen.core.CO.A1S || iA010 == com.facebook.ads.redexgen.core.CO.A1T) {
                        A0K(i4, iA010, iA06, iA09, i, i2, drmInitData, cr, childStartPosition);
                    } else {
                        int i5 = com.facebook.ads.redexgen.core.CO.A0k;
                        java.lang.String[] strArr2 = A01;
                        if (strArr2[1].length() == strArr2[7].length()) {
                            java.lang.String[] strArr3 = A01;
                            strArr3[0] = "duDThokwZavf6bDuXF1CS";
                            strArr3[5] = "LUlnqMDpQMMHRYGBb5pBn";
                            if (iA010 == i5 || iA010 == com.facebook.ads.redexgen.core.CO.A0Q || iA010 == com.facebook.ads.redexgen.core.CO.A04 || iA010 == com.facebook.ads.redexgen.core.CO.A0M || iA010 == com.facebook.ads.redexgen.core.CO.A0I) {
                                A0M(i4, iA010, iA06, iA09, i, str, z, drmInitData, cr, childStartPosition);
                            } else {
                                int i6 = com.facebook.ads.redexgen.core.CO.A0J;
                                java.lang.String[] strArr4 = A01;
                                if (strArr4[1].length() != strArr4[7].length()) {
                                    throw new java.lang.RuntimeException();
                                }
                                java.lang.String[] strArr5 = A01;
                                strArr5[0] = "GdLGfzxxpEi9vrD3hnmsY";
                                strArr5[5] = "OWzGgAJv4ZQFnapET40NY";
                                if (iA010 == i6 || iA010 == com.facebook.ads.redexgen.core.CO.A0K) {
                                    A0M(i4, iA010, iA06, iA09, i, str, z, drmInitData, cr, childStartPosition);
                                } else {
                                    int i7 = com.facebook.ads.redexgen.core.CO.A0L;
                                    if (A01[4].length() == 24) {
                                        A01[3] = "cKQ0nFMbJLdtJPhFqMdBZLcbkFt494U8";
                                        if (iA010 == i7 || iA010 == com.facebook.ads.redexgen.core.CO.A0v || iA010 == com.facebook.ads.redexgen.core.CO.A0w || iA010 == com.facebook.ads.redexgen.core.CO.A0a || iA010 == com.facebook.ads.redexgen.core.CO.A14 || iA010 == com.facebook.ads.redexgen.core.CO.A03 || iA010 == com.facebook.ads.redexgen.core.CO.A05) {
                                            A0M(i4, iA010, iA06, iA09, i, str, z, drmInitData, cr, childStartPosition);
                                        } else {
                                            int i8 = com.facebook.ads.redexgen.core.CO.A02;
                                            java.lang.String[] strArr6 = A01;
                                            if (strArr6[1].length() != strArr6[7].length()) {
                                                A01[3] = "itS1mJNkVsEBjcww7x1AKGi7qQvt6gSt";
                                                if (iA010 != i8) {
                                                    if (iA010 == com.facebook.ads.redexgen.core.CO.A1O && iA010 != com.facebook.ads.redexgen.core.CO.A1W && iA010 != com.facebook.ads.redexgen.core.CO.A18 && iA010 != com.facebook.ads.redexgen.core.CO.A09) {
                                                        if (iA010 == com.facebook.ads.redexgen.core.CO.A0A) {
                                                            cr.A02 = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A0B(java.lang.Integer.toString(i), A0I(315, 27, 37), null, -1, null);
                                                        }
                                                    }
                                                }
                                            } else {
                                                java.lang.String[] strArr7 = A01;
                                                strArr7[0] = "XUFCcR3hltcr5N58b41PL";
                                                strArr7[5] = "7kFGsklD5wbfNJVuHwSqq";
                                                if (iA010 != i8) {
                                                    if (iA010 == com.facebook.ads.redexgen.core.CO.A1O) {
                                                    }
                                                }
                                            }
                                            iA06 = iA06;
                                            iA09 = iA09;
                                            A0L(i4, iA010, iA06, iA09, i, str, cr);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                throw new java.lang.RuntimeException();
            }
            A0K(i4, iA010, iA06, iA09, i, i2, drmInitData, cr, childStartPosition);
            i4.A0Y(iA06 + iA09);
            if (A01[4].length() != 24) {
                childStartPosition++;
            } else {
                A01[4] = "gRpHBrURdW9WOHTyJ9LvjA1x";
                childStartPosition++;
            }
        }
        return cr;
    }

    public static com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata A0F(com.facebook.ads.redexgen.core.YX yx, boolean z) {
        if (z) {
            return null;
        }
        com.facebook.ads.redexgen.core.I4 i4 = yx.A00;
        i4.A0Y(8);
        while (i4.A04() >= 8) {
            int atomPosition = i4.A06();
            int iA08 = i4.A08();
            if (i4.A08() == com.facebook.ads.redexgen.core.CO.A0g) {
                i4.A0Y(atomPosition);
                return A0H(i4, atomPosition + iA08);
            }
            i4.A0Z(iA08 - 8);
        }
        return null;
    }

    public static com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata A0G(com.facebook.ads.redexgen.core.I4 i4, int i) {
        i4.A0Z(8);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (i4.A06() < i) {
            com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame id3FrameA04 = com.facebook.ads.redexgen.core.AbstractC0613Cb.A04(i4);
            if (id3FrameA04 != null) {
                arrayList.add(id3FrameA04);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata(arrayList);
    }

    public static com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata A0H(com.facebook.ads.redexgen.core.I4 i4, int i) {
        i4.A0Z(12);
        while (i4.A06() < i) {
            int iA06 = i4.A06();
            int atomType = i4.A08();
            int atomSize = i4.A08();
            int atomPosition = com.facebook.ads.redexgen.core.CO.A0Z;
            if (atomSize == atomPosition) {
                i4.A0Y(iA06);
                return A0G(i4, iA06 + atomType);
            }
            int atomPosition2 = atomType - 8;
            i4.A0Z(atomPosition2);
        }
        if (A01[3].charAt(25) == 'q') {
            throw new java.lang.RuntimeException();
        }
        A01[3] = "eZNVatTIYyd9KfmF8OttG16Me3cbZREr";
        return null;
    }

    public static void A0L(com.facebook.ads.redexgen.core.I4 i4, int i, int i2, int i3, int i5, java.lang.String str, com.facebook.ads.redexgen.core.CR cr) throws com.facebook.ads.redexgen.core.A0 {
        java.lang.String strA0I;
        i4.A0Y(i2 + 8 + 8);
        java.util.List listSingletonList = null;
        long j = Long.MAX_VALUE;
        if (i == com.facebook.ads.redexgen.core.CO.A02) {
            strA0I = A0I(295, 20, 116);
        } else if (i == com.facebook.ads.redexgen.core.CO.A1O) {
            strA0I = A0I(388, 28, 30);
            int i6 = (i3 - 8) - 8;
            byte[] bArr = new byte[i6];
            if (A01[4].length() != 24) {
                i4.A0c(bArr, 0, i6);
                listSingletonList = java.util.Collections.singletonList(bArr);
            } else {
                java.lang.String[] strArr = A01;
                strArr[1] = "KykxXqtA4hxsgCSu10LzWv14ucl7xu";
                strArr[7] = "BGtgEZ2LrbQo2YAkZ53sLCFYW54s0h";
                i4.A0c(bArr, 0, i6);
                listSingletonList = java.util.Collections.singletonList(bArr);
            }
        } else if (i == com.facebook.ads.redexgen.core.CO.A1W) {
            strA0I = A0I(367, 21, 48);
        } else if (i == com.facebook.ads.redexgen.core.CO.A18) {
            strA0I = A0I(295, 20, 116);
            j = 0;
        } else if (i == com.facebook.ads.redexgen.core.CO.A09) {
            strA0I = A0I(342, 25, 60);
            cr.A01 = 1;
        } else {
            throw new java.lang.IllegalStateException();
        }
        java.lang.String mimeType = java.lang.Integer.toString(i5);
        java.lang.String[] strArr2 = A01;
        if (strArr2[6].length() != strArr2[2].length()) {
            throw new java.lang.RuntimeException();
        }
        A01[3] = "qNRFp5z8cylDu7M8uboDkb8OElCQgoCr";
        cr.A02 = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A09(mimeType, strA0I, null, -1, 0, str, -1, null, j, listSingletonList);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x027c  */
    /* JADX WARN: Code duplicated, block: B:103:0x0286  */
    /* JADX WARN: Code duplicated, block: B:104:0x029c  */
    /* JADX WARN: Code duplicated, block: B:106:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:107:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:109:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:111:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:113:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:115:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:116:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:118:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:119:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:121:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:128:0x0332 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:146:0x01b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:0x01b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:0x01b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:150:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0084  */
    /* JADX WARN: Code duplicated, block: B:26:0x0092  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:32:0x00be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:46:0x0106  */
    /* JADX WARN: Code duplicated, block: B:48:0x010a  */
    /* JADX WARN: Code duplicated, block: B:49:0x011d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0121  */
    /* JADX WARN: Code duplicated, block: B:53:0x0143  */
    /* JADX WARN: Code duplicated, block: B:54:0x0152  */
    /* JADX WARN: Code duplicated, block: B:55:0x0168  */
    /* JADX WARN: Code duplicated, block: B:57:0x016c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0181  */
    /* JADX WARN: Code duplicated, block: B:61:0x0185  */
    /* JADX WARN: Code duplicated, block: B:63:0x0188  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:67:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:71:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x01de  */
    /* JADX WARN: Code duplicated, block: B:77:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:82:0x0208  */
    /* JADX WARN: Code duplicated, block: B:84:0x0216  */
    /* JADX WARN: Code duplicated, block: B:85:0x0221  */
    /* JADX WARN: Code duplicated, block: B:87:0x0225  */
    /* JADX WARN: Code duplicated, block: B:89:0x0229  */
    /* JADX WARN: Code duplicated, block: B:90:0x0235  */
    /* JADX WARN: Code duplicated, block: B:92:0x0239  */
    /* JADX WARN: Code duplicated, block: B:93:0x0245  */
    /* JADX WARN: Code duplicated, block: B:95:0x0259  */
    /* JADX WARN: Code duplicated, block: B:97:0x0267  */
    public static void A0M(com.facebook.ads.redexgen.core.I4 i4, int i, int childPosition, int i2, int i3, java.lang.String mimeType, boolean z, com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData drmInitData, com.facebook.ads.redexgen.core.CR cr, int i5) throws com.facebook.ads.redexgen.core.A0 {
        int iA0I;
        int iA0F;
        java.lang.String strA0I;
        int i6;
        int atomType;
        int esdsAtomPosition;
        int i7;
        int length;
        int esdsAtomPosition2;
        int esdsAtomPosition3;
        int esdsAtomPosition4;
        int esdsAtomPosition5;
        int i8;
        int length2;
        int esdsAtomPosition6;
        int esdsAtomPosition7;
        int esdsAtomPosition8;
        java.lang.String str;
        int esdsAtomPosition9;
        int esdsAtomPosition10;
        int esdsAtomPosition11;
        int esdsAtomPosition12;
        java.lang.String str2;
        int esdsAtomPosition13;
        byte[] bArr;
        int childAtomSize;
        java.lang.String[] strArr;
        boolean z2;
        int iA08;
        int iA03;
        java.lang.String string;
        java.lang.String str3;
        java.lang.String[] strArr2;
        com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData drmInitDataA02 = drmInitData;
        int childPosition2 = i;
        i4.A0Y(childPosition + 8 + 8);
        int quickTimeSoundDescriptionVersion = 0;
        if (z) {
            quickTimeSoundDescriptionVersion = i4.A0I();
            i4.A0Z(6);
        } else {
            i4.A0Z(8);
        }
        if (quickTimeSoundDescriptionVersion == 0 || quickTimeSoundDescriptionVersion == 1) {
            iA0I = i4.A0I();
            i4.A0Z(6);
            iA0F = i4.A0F();
            if (quickTimeSoundDescriptionVersion == 1) {
                i4.A0Z(16);
            }
        } else if (quickTimeSoundDescriptionVersion == 2) {
            i4.A0Z(16);
            iA0F = (int) java.lang.Math.round(i4.A03());
            iA0I = i4.A0H();
            i4.A0Z(20);
        } else {
            return;
        }
        int quickTimeSoundDescriptionVersion2 = i4.A06();
        if (childPosition2 == com.facebook.ads.redexgen.core.CO.A0Q) {
            android.util.Pair<java.lang.Integer, com.facebook.ads.redexgen.core.C0622Ck> pairA09 = A09(i4, childPosition, i2);
            if (pairA09 != null) {
                childPosition2 = ((java.lang.Integer) pairA09.first).intValue();
                if (drmInitDataA02 == null) {
                    drmInitDataA02 = null;
                } else {
                    drmInitDataA02 = drmInitDataA02.A02(((com.facebook.ads.redexgen.core.C0622Ck) pairA09.second).A02);
                }
                if (A01[3].charAt(25) != 'q') {
                    A01[4] = "ClMmTzEirLQQWaoaw26IKZCw";
                    cr.A03[i5] = (com.facebook.ads.redexgen.core.C0622Ck) pairA09.second;
                }
            }
            i4.A0Y(quickTimeSoundDescriptionVersion2);
            strA0I = null;
            i6 = com.facebook.ads.redexgen.core.CO.A04;
            atomType = A01[4].length();
            if (atomType != 24) {
                java.lang.String[] strArr3 = A01;
                strArr3[6] = "Mdkh6Mkttrjr2CfN4mqLgx9XFIE7Y";
                strArr3[2] = "iAZGrP25zg35EJYjSm5Cl3znbejzR";
                if (childPosition2 == i6) {
                    strA0I = A0I(426, 9, 80);
                } else {
                    esdsAtomPosition = com.facebook.ads.redexgen.core.CO.A0M;
                    if (childPosition2 == esdsAtomPosition) {
                        strA0I = A0I(457, 10, 108);
                    } else {
                        i7 = com.facebook.ads.redexgen.core.CO.A0I;
                        java.lang.String[] strArr4 = A01;
                        java.lang.String mimeType2 = strArr4[0];
                        java.lang.String str4 = strArr4[5];
                        length = mimeType2.length();
                        esdsAtomPosition2 = str4.length();
                        if (length == esdsAtomPosition2) {
                            java.lang.String[] strArr5 = A01;
                            strArr5[6] = "Zqe6d8cjHif8ypNB2BqCb7eNUxdxZ";
                            strArr5[2] = "QA9ktGqLcEAqVLo1te6DtcBXMYCen";
                            if (childPosition2 == i7) {
                                strA0I = A0I(501, 13, 0);
                            } else {
                                esdsAtomPosition3 = com.facebook.ads.redexgen.core.CO.A0K;
                                if (childPosition2 != esdsAtomPosition3) {
                                    esdsAtomPosition4 = com.facebook.ads.redexgen.core.CO.A0L;
                                    if (childPosition2 == esdsAtomPosition4) {
                                        strA0I = A0I(com.json.mediationsdk.utils.IronSourceConstants.INIT_COMPLETE, 16, 127);
                                    } else {
                                        esdsAtomPosition5 = com.facebook.ads.redexgen.core.CO.A0J;
                                        if (childPosition2 == esdsAtomPosition5) {
                                            strA0I = A0I(com.json.mediationsdk.logger.IronSourceError.ERROR_AD_UNIT_CAPPED, 28, 29);
                                        } else {
                                            i8 = com.facebook.ads.redexgen.core.CO.A0v;
                                            java.lang.String[] strArr6 = A01;
                                            java.lang.String mimeType3 = strArr6[1];
                                            java.lang.String str5 = strArr6[7];
                                            length2 = mimeType3.length();
                                            esdsAtomPosition6 = str5.length();
                                            if (length2 != esdsAtomPosition6) {
                                                java.lang.String[] strArr7 = A01;
                                                strArr7[0] = "Za6iKmGifzJSKPrg9mzrH";
                                                strArr7[5] = "sngbP1wZsMOGH9hu1alub";
                                                if (childPosition2 == i8) {
                                                    java.lang.String[] strArr8 = A01;
                                                    java.lang.String str6 = strArr8[6];
                                                    str2 = strArr8[2];
                                                    esdsAtomPosition13 = str6.length();
                                                    if (esdsAtomPosition13 == str2.length()) {
                                                        java.lang.String[] strArr9 = A01;
                                                        strArr9[6] = "ImiLuJdYJHxCSyJBtjj1nlpw8DqsI";
                                                        strArr9[2] = "3ETlNfirEj2exDwwoviDJOepzhB6D";
                                                        strA0I = A0I(416, 10, 116);
                                                    }
                                                } else {
                                                    esdsAtomPosition7 = com.facebook.ads.redexgen.core.CO.A0w;
                                                    if (childPosition2 == esdsAtomPosition7) {
                                                        strA0I = A0I(445, 12, 39);
                                                    } else {
                                                        esdsAtomPosition8 = com.facebook.ads.redexgen.core.CO.A0a;
                                                        if (childPosition2 != esdsAtomPosition8) {
                                                            esdsAtomPosition10 = com.facebook.ads.redexgen.core.CO.A14;
                                                            if (childPosition2 == esdsAtomPosition10) {
                                                                java.lang.String[] strArr10 = A01;
                                                                java.lang.String str7 = strArr10[0];
                                                                str = strArr10[5];
                                                                esdsAtomPosition9 = str7.length();
                                                                if (esdsAtomPosition9 != str.length()) {
                                                                    throw new java.lang.RuntimeException();
                                                                }
                                                                java.lang.String[] strArr11 = A01;
                                                                strArr11[1] = "HpMoEBh7wJwh423AWemPuBKWXentdM";
                                                                strArr11[7] = "QuzHJbRWBF8tTBbq9KA2qEe5RgzvTY";
                                                                strA0I = A0I(492, 9, 99);
                                                            } else {
                                                                esdsAtomPosition11 = com.facebook.ads.redexgen.core.CO.A03;
                                                                if (childPosition2 == esdsAtomPosition11) {
                                                                    strA0I = A0I(482, 10, 21);
                                                                } else {
                                                                    esdsAtomPosition12 = com.facebook.ads.redexgen.core.CO.A05;
                                                                    if (childPosition2 == esdsAtomPosition12) {
                                                                        strA0I = A0I(435, 10, 88);
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            java.lang.String[] strArr12 = A01;
                                                            java.lang.String str8 = strArr12[0];
                                                            str = strArr12[5];
                                                            esdsAtomPosition9 = str8.length();
                                                            if (esdsAtomPosition9 != str.length()) {
                                                                throw new java.lang.RuntimeException();
                                                            }
                                                            java.lang.String[] strArr13 = A01;
                                                            strArr13[1] = "HpMoEBh7wJwh423AWemPuBKWXentdM";
                                                            strArr13[7] = "QuzHJbRWBF8tTBbq9KA2qEe5RgzvTY";
                                                            strA0I = A0I(492, 9, 99);
                                                        }
                                                    }
                                                }
                                            } else {
                                                A01[3] = "edjy6hWV1aP471I9DFgChAk6TLiFBb4Y";
                                                if (childPosition2 == i8) {
                                                    java.lang.String[] strArr14 = A01;
                                                    java.lang.String str9 = strArr14[6];
                                                    str2 = strArr14[2];
                                                    esdsAtomPosition13 = str9.length();
                                                    if (esdsAtomPosition13 == str2.length()) {
                                                        java.lang.String[] strArr15 = A01;
                                                        strArr15[6] = "ImiLuJdYJHxCSyJBtjj1nlpw8DqsI";
                                                        strArr15[2] = "3ETlNfirEj2exDwwoviDJOepzhB6D";
                                                        strA0I = A0I(416, 10, 116);
                                                    }
                                                } else {
                                                    esdsAtomPosition7 = com.facebook.ads.redexgen.core.CO.A0w;
                                                    if (childPosition2 == esdsAtomPosition7) {
                                                        strA0I = A0I(445, 12, 39);
                                                    } else {
                                                        esdsAtomPosition8 = com.facebook.ads.redexgen.core.CO.A0a;
                                                        if (childPosition2 != esdsAtomPosition8) {
                                                            esdsAtomPosition10 = com.facebook.ads.redexgen.core.CO.A14;
                                                            if (childPosition2 == esdsAtomPosition10) {
                                                                java.lang.String[] strArr16 = A01;
                                                                java.lang.String str10 = strArr16[0];
                                                                str = strArr16[5];
                                                                esdsAtomPosition9 = str10.length();
                                                                if (esdsAtomPosition9 != str.length()) {
                                                                    throw new java.lang.RuntimeException();
                                                                }
                                                                java.lang.String[] strArr17 = A01;
                                                                strArr17[1] = "HpMoEBh7wJwh423AWemPuBKWXentdM";
                                                                strArr17[7] = "QuzHJbRWBF8tTBbq9KA2qEe5RgzvTY";
                                                                strA0I = A0I(492, 9, 99);
                                                            } else {
                                                                esdsAtomPosition11 = com.facebook.ads.redexgen.core.CO.A03;
                                                                if (childPosition2 == esdsAtomPosition11) {
                                                                    strA0I = A0I(482, 10, 21);
                                                                } else {
                                                                    esdsAtomPosition12 = com.facebook.ads.redexgen.core.CO.A05;
                                                                    if (childPosition2 == esdsAtomPosition12) {
                                                                        strA0I = A0I(435, 10, 88);
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            java.lang.String[] strArr18 = A01;
                                                            java.lang.String str11 = strArr18[0];
                                                            str = strArr18[5];
                                                            esdsAtomPosition9 = str11.length();
                                                            if (esdsAtomPosition9 != str.length()) {
                                                                throw new java.lang.RuntimeException();
                                                            }
                                                            java.lang.String[] strArr19 = A01;
                                                            strArr19[1] = "HpMoEBh7wJwh423AWemPuBKWXentdM";
                                                            strArr19[7] = "QuzHJbRWBF8tTBbq9KA2qEe5RgzvTY";
                                                            strA0I = A0I(492, 9, 99);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    strA0I = A0I(com.json.mediationsdk.utils.IronSourceConstants.INIT_COMPLETE, 16, 127);
                                }
                            }
                        }
                    }
                }
                bArr = null;
                while (quickTimeSoundDescriptionVersion2 - childPosition < i2) {
                    i4.A0Y(quickTimeSoundDescriptionVersion2);
                    childAtomSize = i4.A08();
                    strArr = A01;
                    if (strArr[1].length() != strArr[7].length()) {
                        A01[4] = "77JkTzz3NFo7gTAW49b3hBRm";
                        if (childAtomSize > 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } else if (childAtomSize > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    com.facebook.ads.redexgen.core.AbstractC0730Hf.A05(z2, A0I(574, 32, 127));
                    iA08 = i4.A08();
                    if (iA08 != com.facebook.ads.redexgen.core.CO.A0S) {
                        if (!z) {
                        }
                        if (iA08 == com.facebook.ads.redexgen.core.CO.A0E) {
                            i4.A0Y(quickTimeSoundDescriptionVersion2 + 8);
                            cr.A02 = com.facebook.ads.redexgen.core.AV.A07(i4, java.lang.Integer.toString(i3), mimeType, drmInitDataA02);
                        } else if (iA08 == com.facebook.ads.redexgen.core.CO.A0H) {
                            i4.A0Y(quickTimeSoundDescriptionVersion2 + 8);
                            cr.A02 = com.facebook.ads.redexgen.core.AV.A08(i4, java.lang.Integer.toString(i3), mimeType, drmInitDataA02);
                        } else if (iA08 == com.facebook.ads.redexgen.core.CO.A0G) {
                            string = java.lang.Integer.toString(i3);
                            str3 = strA0I;
                            strArr2 = A01;
                            if (strArr2[0].length() != strArr2[5].length()) {
                                cr.A02 = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A07(string, str3, null, -1, -1, iA0I, iA0F, null, drmInitDataA02, 0, mimeType);
                            } else {
                                A01[4] = "EBLYUFe8VXGddau7pqu73bNM";
                                cr.A02 = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A07(string, str3, null, -1, -1, iA0I, iA0F, null, drmInitDataA02, 0, mimeType);
                            }
                        } else if (iA08 == com.facebook.ads.redexgen.core.CO.A05) {
                            bArr = new byte[childAtomSize];
                            i4.A0Y(quickTimeSoundDescriptionVersion2);
                            i4.A0c(bArr, 0, childAtomSize);
                        }
                    } else {
                        if (iA08 == com.facebook.ads.redexgen.core.CO.A0S) {
                            iA03 = quickTimeSoundDescriptionVersion2;
                        } else {
                            iA03 = A03(i4, quickTimeSoundDescriptionVersion2, childAtomSize);
                        }
                        if (iA03 != -1) {
                            android.util.Pair<java.lang.String, byte[]> pairA07 = A07(i4, iA03);
                            strA0I = (java.lang.String) pairA07.first;
                            bArr = (byte[]) pairA07.second;
                            if (A0I(467, 15, 103).equals(strA0I)) {
                                android.util.Pair<java.lang.Integer, java.lang.Integer> pairA03 = com.facebook.ads.redexgen.core.AbstractC0734Hj.A03(bArr);
                                iA0F = ((java.lang.Integer) pairA03.first).intValue();
                                iA0I = ((java.lang.Integer) pairA03.second).intValue();
                            }
                        }
                    }
                    quickTimeSoundDescriptionVersion2 += childAtomSize;
                }
                if (cr.A02 == null) {
                    return;
                } else {
                    return;
                }
            }
            java.lang.String[] strArr20 = A01;
            strArr20[6] = "PwA5j1KgKbwMGSx2ZfBAphzj3gSm0";
            strArr20[2] = "eWbH0yxX37TjnorAUcqiGnPlAT3ga";
            if (childPosition2 == i6) {
                strA0I = A0I(426, 9, 80);
            } else {
                esdsAtomPosition = com.facebook.ads.redexgen.core.CO.A0M;
                if (childPosition2 == esdsAtomPosition) {
                    strA0I = A0I(457, 10, 108);
                } else {
                    i7 = com.facebook.ads.redexgen.core.CO.A0I;
                    java.lang.String[] strArr21 = A01;
                    java.lang.String mimeType4 = strArr21[0];
                    java.lang.String str12 = strArr21[5];
                    length = mimeType4.length();
                    esdsAtomPosition2 = str12.length();
                    if (length == esdsAtomPosition2) {
                        java.lang.String[] strArr22 = A01;
                        strArr22[6] = "Zqe6d8cjHif8ypNB2BqCb7eNUxdxZ";
                        strArr22[2] = "QA9ktGqLcEAqVLo1te6DtcBXMYCen";
                        if (childPosition2 == i7) {
                            strA0I = A0I(501, 13, 0);
                        } else {
                            esdsAtomPosition3 = com.facebook.ads.redexgen.core.CO.A0K;
                            if (childPosition2 != esdsAtomPosition3) {
                                esdsAtomPosition4 = com.facebook.ads.redexgen.core.CO.A0L;
                                if (childPosition2 == esdsAtomPosition4) {
                                    strA0I = A0I(com.json.mediationsdk.utils.IronSourceConstants.INIT_COMPLETE, 16, 127);
                                } else {
                                    esdsAtomPosition5 = com.facebook.ads.redexgen.core.CO.A0J;
                                    if (childPosition2 == esdsAtomPosition5) {
                                        strA0I = A0I(com.json.mediationsdk.logger.IronSourceError.ERROR_AD_UNIT_CAPPED, 28, 29);
                                    } else {
                                        i8 = com.facebook.ads.redexgen.core.CO.A0v;
                                        java.lang.String[] strArr23 = A01;
                                        java.lang.String mimeType5 = strArr23[1];
                                        java.lang.String str13 = strArr23[7];
                                        length2 = mimeType5.length();
                                        esdsAtomPosition6 = str13.length();
                                        if (length2 != esdsAtomPosition6) {
                                            java.lang.String[] strArr24 = A01;
                                            strArr24[0] = "Za6iKmGifzJSKPrg9mzrH";
                                            strArr24[5] = "sngbP1wZsMOGH9hu1alub";
                                            if (childPosition2 == i8) {
                                                java.lang.String[] strArr110 = A01;
                                                java.lang.String str14 = strArr110[6];
                                                str2 = strArr110[2];
                                                esdsAtomPosition13 = str14.length();
                                                if (esdsAtomPosition13 == str2.length()) {
                                                    java.lang.String[] strArr111 = A01;
                                                    strArr111[6] = "ImiLuJdYJHxCSyJBtjj1nlpw8DqsI";
                                                    strArr111[2] = "3ETlNfirEj2exDwwoviDJOepzhB6D";
                                                    strA0I = A0I(416, 10, 116);
                                                }
                                            } else {
                                                esdsAtomPosition7 = com.facebook.ads.redexgen.core.CO.A0w;
                                                if (childPosition2 == esdsAtomPosition7) {
                                                    strA0I = A0I(445, 12, 39);
                                                } else {
                                                    esdsAtomPosition8 = com.facebook.ads.redexgen.core.CO.A0a;
                                                    if (childPosition2 != esdsAtomPosition8) {
                                                        esdsAtomPosition10 = com.facebook.ads.redexgen.core.CO.A14;
                                                        if (childPosition2 == esdsAtomPosition10) {
                                                            java.lang.String[] strArr112 = A01;
                                                            java.lang.String str15 = strArr112[0];
                                                            str = strArr112[5];
                                                            esdsAtomPosition9 = str15.length();
                                                            if (esdsAtomPosition9 != str.length()) {
                                                                throw new java.lang.RuntimeException();
                                                            }
                                                            java.lang.String[] strArr113 = A01;
                                                            strArr113[1] = "HpMoEBh7wJwh423AWemPuBKWXentdM";
                                                            strArr113[7] = "QuzHJbRWBF8tTBbq9KA2qEe5RgzvTY";
                                                            strA0I = A0I(492, 9, 99);
                                                        } else {
                                                            esdsAtomPosition11 = com.facebook.ads.redexgen.core.CO.A03;
                                                            if (childPosition2 == esdsAtomPosition11) {
                                                                strA0I = A0I(482, 10, 21);
                                                            } else {
                                                                esdsAtomPosition12 = com.facebook.ads.redexgen.core.CO.A05;
                                                                if (childPosition2 == esdsAtomPosition12) {
                                                                    strA0I = A0I(435, 10, 88);
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        java.lang.String[] strArr114 = A01;
                                                        java.lang.String str16 = strArr114[0];
                                                        str = strArr114[5];
                                                        esdsAtomPosition9 = str16.length();
                                                        if (esdsAtomPosition9 != str.length()) {
                                                            throw new java.lang.RuntimeException();
                                                        }
                                                        java.lang.String[] strArr115 = A01;
                                                        strArr115[1] = "HpMoEBh7wJwh423AWemPuBKWXentdM";
                                                        strArr115[7] = "QuzHJbRWBF8tTBbq9KA2qEe5RgzvTY";
                                                        strA0I = A0I(492, 9, 99);
                                                    }
                                                }
                                            }
                                        } else {
                                            A01[3] = "edjy6hWV1aP471I9DFgChAk6TLiFBb4Y";
                                            if (childPosition2 == i8) {
                                                java.lang.String[] strArr116 = A01;
                                                java.lang.String str17 = strArr116[6];
                                                str2 = strArr116[2];
                                                esdsAtomPosition13 = str17.length();
                                                if (esdsAtomPosition13 == str2.length()) {
                                                    java.lang.String[] strArr117 = A01;
                                                    strArr117[6] = "ImiLuJdYJHxCSyJBtjj1nlpw8DqsI";
                                                    strArr117[2] = "3ETlNfirEj2exDwwoviDJOepzhB6D";
                                                    strA0I = A0I(416, 10, 116);
                                                }
                                            } else {
                                                esdsAtomPosition7 = com.facebook.ads.redexgen.core.CO.A0w;
                                                if (childPosition2 == esdsAtomPosition7) {
                                                    strA0I = A0I(445, 12, 39);
                                                } else {
                                                    esdsAtomPosition8 = com.facebook.ads.redexgen.core.CO.A0a;
                                                    if (childPosition2 != esdsAtomPosition8) {
                                                        esdsAtomPosition10 = com.facebook.ads.redexgen.core.CO.A14;
                                                        if (childPosition2 == esdsAtomPosition10) {
                                                            java.lang.String[] strArr118 = A01;
                                                            java.lang.String str18 = strArr118[0];
                                                            str = strArr118[5];
                                                            esdsAtomPosition9 = str18.length();
                                                            if (esdsAtomPosition9 != str.length()) {
                                                                throw new java.lang.RuntimeException();
                                                            }
                                                            java.lang.String[] strArr119 = A01;
                                                            strArr119[1] = "HpMoEBh7wJwh423AWemPuBKWXentdM";
                                                            strArr119[7] = "QuzHJbRWBF8tTBbq9KA2qEe5RgzvTY";
                                                            strA0I = A0I(492, 9, 99);
                                                        } else {
                                                            esdsAtomPosition11 = com.facebook.ads.redexgen.core.CO.A03;
                                                            if (childPosition2 == esdsAtomPosition11) {
                                                                strA0I = A0I(482, 10, 21);
                                                            } else {
                                                                esdsAtomPosition12 = com.facebook.ads.redexgen.core.CO.A05;
                                                                if (childPosition2 == esdsAtomPosition12) {
                                                                    strA0I = A0I(435, 10, 88);
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        java.lang.String[] strArr1110 = A01;
                                                        java.lang.String str19 = strArr1110[0];
                                                        str = strArr1110[5];
                                                        esdsAtomPosition9 = str19.length();
                                                        if (esdsAtomPosition9 != str.length()) {
                                                            throw new java.lang.RuntimeException();
                                                        }
                                                        java.lang.String[] strArr1111 = A01;
                                                        strArr1111[1] = "HpMoEBh7wJwh423AWemPuBKWXentdM";
                                                        strArr1111[7] = "QuzHJbRWBF8tTBbq9KA2qEe5RgzvTY";
                                                        strA0I = A0I(492, 9, 99);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                strA0I = A0I(com.json.mediationsdk.utils.IronSourceConstants.INIT_COMPLETE, 16, 127);
                            }
                        }
                    }
                }
            }
            bArr = null;
            while (quickTimeSoundDescriptionVersion2 - childPosition < i2) {
                i4.A0Y(quickTimeSoundDescriptionVersion2);
                childAtomSize = i4.A08();
                strArr = A01;
                if (strArr[1].length() != strArr[7].length()) {
                    A01[4] = "77JkTzz3NFo7gTAW49b3hBRm";
                    if (childAtomSize > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else if (childAtomSize > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                com.facebook.ads.redexgen.core.AbstractC0730Hf.A05(z2, A0I(574, 32, 127));
                iA08 = i4.A08();
                if (iA08 != com.facebook.ads.redexgen.core.CO.A0S) {
                    if (!z) {
                    }
                    if (iA08 == com.facebook.ads.redexgen.core.CO.A0E) {
                        i4.A0Y(quickTimeSoundDescriptionVersion2 + 8);
                        cr.A02 = com.facebook.ads.redexgen.core.AV.A07(i4, java.lang.Integer.toString(i3), mimeType, drmInitDataA02);
                    } else if (iA08 == com.facebook.ads.redexgen.core.CO.A0H) {
                        i4.A0Y(quickTimeSoundDescriptionVersion2 + 8);
                        cr.A02 = com.facebook.ads.redexgen.core.AV.A08(i4, java.lang.Integer.toString(i3), mimeType, drmInitDataA02);
                    } else if (iA08 == com.facebook.ads.redexgen.core.CO.A0G) {
                        string = java.lang.Integer.toString(i3);
                        str3 = strA0I;
                        strArr2 = A01;
                        if (strArr2[0].length() != strArr2[5].length()) {
                            cr.A02 = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A07(string, str3, null, -1, -1, iA0I, iA0F, null, drmInitDataA02, 0, mimeType);
                        } else {
                            A01[4] = "EBLYUFe8VXGddau7pqu73bNM";
                            cr.A02 = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A07(string, str3, null, -1, -1, iA0I, iA0F, null, drmInitDataA02, 0, mimeType);
                        }
                    } else if (iA08 == com.facebook.ads.redexgen.core.CO.A05) {
                        bArr = new byte[childAtomSize];
                        i4.A0Y(quickTimeSoundDescriptionVersion2);
                        i4.A0c(bArr, 0, childAtomSize);
                    }
                } else {
                    if (iA08 == com.facebook.ads.redexgen.core.CO.A0S) {
                        iA03 = quickTimeSoundDescriptionVersion2;
                    } else {
                        iA03 = A03(i4, quickTimeSoundDescriptionVersion2, childAtomSize);
                    }
                    if (iA03 != -1) {
                        android.util.Pair<java.lang.String, byte[]> pairA08 = A07(i4, iA03);
                        strA0I = (java.lang.String) pairA08.first;
                        bArr = (byte[]) pairA08.second;
                        if (A0I(467, 15, 103).equals(strA0I)) {
                            android.util.Pair<java.lang.Integer, java.lang.Integer> pairA04 = com.facebook.ads.redexgen.core.AbstractC0734Hj.A03(bArr);
                            iA0F = ((java.lang.Integer) pairA04.first).intValue();
                            iA0I = ((java.lang.Integer) pairA04.second).intValue();
                        }
                    }
                }
                quickTimeSoundDescriptionVersion2 += childAtomSize;
            }
            if (cr.A02 == null) {
                return;
            } else {
                return;
            }
        }
        strA0I = null;
        i6 = com.facebook.ads.redexgen.core.CO.A04;
        atomType = A01[4].length();
        if (atomType != 24) {
            java.lang.String[] strArr25 = A01;
            strArr25[6] = "Mdkh6Mkttrjr2CfN4mqLgx9XFIE7Y";
            strArr25[2] = "iAZGrP25zg35EJYjSm5Cl3znbejzR";
            if (childPosition2 == i6) {
                strA0I = A0I(426, 9, 80);
            } else {
                esdsAtomPosition = com.facebook.ads.redexgen.core.CO.A0M;
                if (childPosition2 == esdsAtomPosition) {
                    strA0I = A0I(457, 10, 108);
                } else {
                    i7 = com.facebook.ads.redexgen.core.CO.A0I;
                    java.lang.String[] strArr26 = A01;
                    java.lang.String mimeType6 = strArr26[0];
                    java.lang.String str110 = strArr26[5];
                    length = mimeType6.length();
                    esdsAtomPosition2 = str110.length();
                    if (length == esdsAtomPosition2) {
                        java.lang.String[] strArr27 = A01;
                        strArr27[6] = "Zqe6d8cjHif8ypNB2BqCb7eNUxdxZ";
                        strArr27[2] = "QA9ktGqLcEAqVLo1te6DtcBXMYCen";
                        if (childPosition2 == i7) {
                            strA0I = A0I(501, 13, 0);
                        } else {
                            esdsAtomPosition3 = com.facebook.ads.redexgen.core.CO.A0K;
                            if (childPosition2 != esdsAtomPosition3) {
                                esdsAtomPosition4 = com.facebook.ads.redexgen.core.CO.A0L;
                                if (childPosition2 == esdsAtomPosition4) {
                                    strA0I = A0I(com.json.mediationsdk.utils.IronSourceConstants.INIT_COMPLETE, 16, 127);
                                } else {
                                    esdsAtomPosition5 = com.facebook.ads.redexgen.core.CO.A0J;
                                    if (childPosition2 == esdsAtomPosition5) {
                                        strA0I = A0I(com.json.mediationsdk.logger.IronSourceError.ERROR_AD_UNIT_CAPPED, 28, 29);
                                    } else {
                                        i8 = com.facebook.ads.redexgen.core.CO.A0v;
                                        java.lang.String[] strArr28 = A01;
                                        java.lang.String mimeType7 = strArr28[1];
                                        java.lang.String str111 = strArr28[7];
                                        length2 = mimeType7.length();
                                        esdsAtomPosition6 = str111.length();
                                        if (length2 != esdsAtomPosition6) {
                                            java.lang.String[] strArr29 = A01;
                                            strArr29[0] = "Za6iKmGifzJSKPrg9mzrH";
                                            strArr29[5] = "sngbP1wZsMOGH9hu1alub";
                                            if (childPosition2 == i8) {
                                                java.lang.String[] strArr1112 = A01;
                                                java.lang.String str112 = strArr1112[6];
                                                str2 = strArr1112[2];
                                                esdsAtomPosition13 = str112.length();
                                                if (esdsAtomPosition13 == str2.length()) {
                                                    java.lang.String[] strArr1113 = A01;
                                                    strArr1113[6] = "ImiLuJdYJHxCSyJBtjj1nlpw8DqsI";
                                                    strArr1113[2] = "3ETlNfirEj2exDwwoviDJOepzhB6D";
                                                    strA0I = A0I(416, 10, 116);
                                                }
                                            } else {
                                                esdsAtomPosition7 = com.facebook.ads.redexgen.core.CO.A0w;
                                                if (childPosition2 == esdsAtomPosition7) {
                                                    strA0I = A0I(445, 12, 39);
                                                } else {
                                                    esdsAtomPosition8 = com.facebook.ads.redexgen.core.CO.A0a;
                                                    if (childPosition2 != esdsAtomPosition8) {
                                                        esdsAtomPosition10 = com.facebook.ads.redexgen.core.CO.A14;
                                                        if (childPosition2 == esdsAtomPosition10) {
                                                            java.lang.String[] strArr1114 = A01;
                                                            java.lang.String str113 = strArr1114[0];
                                                            str = strArr1114[5];
                                                            esdsAtomPosition9 = str113.length();
                                                            if (esdsAtomPosition9 != str.length()) {
                                                                throw new java.lang.RuntimeException();
                                                            }
                                                            java.lang.String[] strArr1115 = A01;
                                                            strArr1115[1] = "HpMoEBh7wJwh423AWemPuBKWXentdM";
                                                            strArr1115[7] = "QuzHJbRWBF8tTBbq9KA2qEe5RgzvTY";
                                                            strA0I = A0I(492, 9, 99);
                                                        } else {
                                                            esdsAtomPosition11 = com.facebook.ads.redexgen.core.CO.A03;
                                                            if (childPosition2 == esdsAtomPosition11) {
                                                                strA0I = A0I(482, 10, 21);
                                                            } else {
                                                                esdsAtomPosition12 = com.facebook.ads.redexgen.core.CO.A05;
                                                                if (childPosition2 == esdsAtomPosition12) {
                                                                    strA0I = A0I(435, 10, 88);
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        java.lang.String[] strArr1116 = A01;
                                                        java.lang.String str114 = strArr1116[0];
                                                        str = strArr1116[5];
                                                        esdsAtomPosition9 = str114.length();
                                                        if (esdsAtomPosition9 != str.length()) {
                                                            throw new java.lang.RuntimeException();
                                                        }
                                                        java.lang.String[] strArr1117 = A01;
                                                        strArr1117[1] = "HpMoEBh7wJwh423AWemPuBKWXentdM";
                                                        strArr1117[7] = "QuzHJbRWBF8tTBbq9KA2qEe5RgzvTY";
                                                        strA0I = A0I(492, 9, 99);
                                                    }
                                                }
                                            }
                                        } else {
                                            A01[3] = "edjy6hWV1aP471I9DFgChAk6TLiFBb4Y";
                                            if (childPosition2 == i8) {
                                                java.lang.String[] strArr1118 = A01;
                                                java.lang.String str115 = strArr1118[6];
                                                str2 = strArr1118[2];
                                                esdsAtomPosition13 = str115.length();
                                                if (esdsAtomPosition13 == str2.length()) {
                                                    java.lang.String[] strArr1119 = A01;
                                                    strArr1119[6] = "ImiLuJdYJHxCSyJBtjj1nlpw8DqsI";
                                                    strArr1119[2] = "3ETlNfirEj2exDwwoviDJOepzhB6D";
                                                    strA0I = A0I(416, 10, 116);
                                                }
                                            } else {
                                                esdsAtomPosition7 = com.facebook.ads.redexgen.core.CO.A0w;
                                                if (childPosition2 == esdsAtomPosition7) {
                                                    strA0I = A0I(445, 12, 39);
                                                } else {
                                                    esdsAtomPosition8 = com.facebook.ads.redexgen.core.CO.A0a;
                                                    if (childPosition2 != esdsAtomPosition8) {
                                                        esdsAtomPosition10 = com.facebook.ads.redexgen.core.CO.A14;
                                                        if (childPosition2 == esdsAtomPosition10) {
                                                            java.lang.String[] strArr11110 = A01;
                                                            java.lang.String str116 = strArr11110[0];
                                                            str = strArr11110[5];
                                                            esdsAtomPosition9 = str116.length();
                                                            if (esdsAtomPosition9 != str.length()) {
                                                                throw new java.lang.RuntimeException();
                                                            }
                                                            java.lang.String[] strArr11111 = A01;
                                                            strArr11111[1] = "HpMoEBh7wJwh423AWemPuBKWXentdM";
                                                            strArr11111[7] = "QuzHJbRWBF8tTBbq9KA2qEe5RgzvTY";
                                                            strA0I = A0I(492, 9, 99);
                                                        } else {
                                                            esdsAtomPosition11 = com.facebook.ads.redexgen.core.CO.A03;
                                                            if (childPosition2 == esdsAtomPosition11) {
                                                                strA0I = A0I(482, 10, 21);
                                                            } else {
                                                                esdsAtomPosition12 = com.facebook.ads.redexgen.core.CO.A05;
                                                                if (childPosition2 == esdsAtomPosition12) {
                                                                    strA0I = A0I(435, 10, 88);
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        java.lang.String[] strArr11112 = A01;
                                                        java.lang.String str117 = strArr11112[0];
                                                        str = strArr11112[5];
                                                        esdsAtomPosition9 = str117.length();
                                                        if (esdsAtomPosition9 != str.length()) {
                                                            throw new java.lang.RuntimeException();
                                                        }
                                                        java.lang.String[] strArr11113 = A01;
                                                        strArr11113[1] = "HpMoEBh7wJwh423AWemPuBKWXentdM";
                                                        strArr11113[7] = "QuzHJbRWBF8tTBbq9KA2qEe5RgzvTY";
                                                        strA0I = A0I(492, 9, 99);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                strA0I = A0I(com.json.mediationsdk.utils.IronSourceConstants.INIT_COMPLETE, 16, 127);
                            }
                        }
                    }
                }
            }
            bArr = null;
            while (quickTimeSoundDescriptionVersion2 - childPosition < i2) {
                i4.A0Y(quickTimeSoundDescriptionVersion2);
                childAtomSize = i4.A08();
                strArr = A01;
                if (strArr[1].length() != strArr[7].length()) {
                    A01[4] = "77JkTzz3NFo7gTAW49b3hBRm";
                    if (childAtomSize > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else if (childAtomSize > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                com.facebook.ads.redexgen.core.AbstractC0730Hf.A05(z2, A0I(574, 32, 127));
                iA08 = i4.A08();
                if (iA08 != com.facebook.ads.redexgen.core.CO.A0S) {
                    if (iA08 == com.facebook.ads.redexgen.core.CO.A0S) {
                        iA03 = quickTimeSoundDescriptionVersion2;
                    } else {
                        iA03 = A03(i4, quickTimeSoundDescriptionVersion2, childAtomSize);
                    }
                    if (iA03 != -1) {
                        android.util.Pair<java.lang.String, byte[]> pairA010 = A07(i4, iA03);
                        strA0I = (java.lang.String) pairA010.first;
                        bArr = (byte[]) pairA010.second;
                        if (A0I(467, 15, 103).equals(strA0I)) {
                            android.util.Pair<java.lang.Integer, java.lang.Integer> pairA05 = com.facebook.ads.redexgen.core.AbstractC0734Hj.A03(bArr);
                            iA0F = ((java.lang.Integer) pairA05.first).intValue();
                            iA0I = ((java.lang.Integer) pairA05.second).intValue();
                        }
                    }
                } else if (!z && iA08 == com.facebook.ads.redexgen.core.CO.A1V) {
                    int atomType2 = A01[4].length();
                    if (atomType2 != 24) {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr30 = A01;
                    strArr30[1] = "UhNjDCpah48Za7zHs6qx4SD3d3Rscb";
                    strArr30[7] = "O3XcQ3fycqCqLrfQRv5Yk09BCeMxh0";
                    if (iA08 == com.facebook.ads.redexgen.core.CO.A0S) {
                        iA03 = quickTimeSoundDescriptionVersion2;
                    } else {
                        iA03 = A03(i4, quickTimeSoundDescriptionVersion2, childAtomSize);
                    }
                    if (iA03 != -1) {
                        android.util.Pair<java.lang.String, byte[]> pairA011 = A07(i4, iA03);
                        strA0I = (java.lang.String) pairA011.first;
                        bArr = (byte[]) pairA011.second;
                        if (A0I(467, 15, 103).equals(strA0I)) {
                            android.util.Pair<java.lang.Integer, java.lang.Integer> pairA06 = com.facebook.ads.redexgen.core.AbstractC0734Hj.A03(bArr);
                            iA0F = ((java.lang.Integer) pairA06.first).intValue();
                            iA0I = ((java.lang.Integer) pairA06.second).intValue();
                        }
                    }
                } else if (iA08 == com.facebook.ads.redexgen.core.CO.A0E) {
                    i4.A0Y(quickTimeSoundDescriptionVersion2 + 8);
                    cr.A02 = com.facebook.ads.redexgen.core.AV.A07(i4, java.lang.Integer.toString(i3), mimeType, drmInitDataA02);
                } else if (iA08 == com.facebook.ads.redexgen.core.CO.A0H) {
                    i4.A0Y(quickTimeSoundDescriptionVersion2 + 8);
                    cr.A02 = com.facebook.ads.redexgen.core.AV.A08(i4, java.lang.Integer.toString(i3), mimeType, drmInitDataA02);
                } else if (iA08 == com.facebook.ads.redexgen.core.CO.A0G) {
                    string = java.lang.Integer.toString(i3);
                    str3 = strA0I;
                    strArr2 = A01;
                    if (strArr2[0].length() != strArr2[5].length()) {
                        cr.A02 = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A07(string, str3, null, -1, -1, iA0I, iA0F, null, drmInitDataA02, 0, mimeType);
                    } else {
                        A01[4] = "EBLYUFe8VXGddau7pqu73bNM";
                        cr.A02 = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A07(string, str3, null, -1, -1, iA0I, iA0F, null, drmInitDataA02, 0, mimeType);
                    }
                } else if (iA08 == com.facebook.ads.redexgen.core.CO.A05) {
                    bArr = new byte[childAtomSize];
                    i4.A0Y(quickTimeSoundDescriptionVersion2);
                    i4.A0c(bArr, 0, childAtomSize);
                }
                quickTimeSoundDescriptionVersion2 += childAtomSize;
            }
            if (cr.A02 == null || strA0I == null) {
                return;
            }
            int atomType3 = A0I(492, 9, 99).equals(strA0I) ? 2 : -1;
            cr.A02 = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(java.lang.Integer.toString(i3), strA0I, null, -1, -1, iA0I, iA0F, atomType3, bArr != null ? java.util.Collections.singletonList(bArr) : null, drmInitDataA02, 0, mimeType);
            return;
        }
        java.lang.String[] strArr210 = A01;
        strArr210[6] = "PwA5j1KgKbwMGSx2ZfBAphzj3gSm0";
        strArr210[2] = "eWbH0yxX37TjnorAUcqiGnPlAT3ga";
        if (childPosition2 == i6) {
            strA0I = A0I(426, 9, 80);
        } else {
            esdsAtomPosition = com.facebook.ads.redexgen.core.CO.A0M;
            if (childPosition2 == esdsAtomPosition) {
                strA0I = A0I(457, 10, 108);
            } else {
                i7 = com.facebook.ads.redexgen.core.CO.A0I;
                java.lang.String[] strArr211 = A01;
                java.lang.String mimeType8 = strArr211[0];
                java.lang.String str118 = strArr211[5];
                length = mimeType8.length();
                esdsAtomPosition2 = str118.length();
                if (length == esdsAtomPosition2) {
                    java.lang.String[] strArr212 = A01;
                    strArr212[6] = "Zqe6d8cjHif8ypNB2BqCb7eNUxdxZ";
                    strArr212[2] = "QA9ktGqLcEAqVLo1te6DtcBXMYCen";
                    if (childPosition2 == i7) {
                        strA0I = A0I(501, 13, 0);
                    } else {
                        esdsAtomPosition3 = com.facebook.ads.redexgen.core.CO.A0K;
                        if (childPosition2 != esdsAtomPosition3) {
                            esdsAtomPosition4 = com.facebook.ads.redexgen.core.CO.A0L;
                            if (childPosition2 == esdsAtomPosition4) {
                                strA0I = A0I(com.json.mediationsdk.utils.IronSourceConstants.INIT_COMPLETE, 16, 127);
                            } else {
                                esdsAtomPosition5 = com.facebook.ads.redexgen.core.CO.A0J;
                                if (childPosition2 == esdsAtomPosition5) {
                                    strA0I = A0I(com.json.mediationsdk.logger.IronSourceError.ERROR_AD_UNIT_CAPPED, 28, 29);
                                } else {
                                    i8 = com.facebook.ads.redexgen.core.CO.A0v;
                                    java.lang.String[] strArr213 = A01;
                                    java.lang.String mimeType9 = strArr213[1];
                                    java.lang.String str119 = strArr213[7];
                                    length2 = mimeType9.length();
                                    esdsAtomPosition6 = str119.length();
                                    if (length2 != esdsAtomPosition6) {
                                        java.lang.String[] strArr214 = A01;
                                        strArr214[0] = "Za6iKmGifzJSKPrg9mzrH";
                                        strArr214[5] = "sngbP1wZsMOGH9hu1alub";
                                        if (childPosition2 == i8) {
                                            java.lang.String[] strArr11114 = A01;
                                            java.lang.String str1110 = strArr11114[6];
                                            str2 = strArr11114[2];
                                            esdsAtomPosition13 = str1110.length();
                                            if (esdsAtomPosition13 == str2.length()) {
                                                java.lang.String[] strArr11115 = A01;
                                                strArr11115[6] = "ImiLuJdYJHxCSyJBtjj1nlpw8DqsI";
                                                strArr11115[2] = "3ETlNfirEj2exDwwoviDJOepzhB6D";
                                                strA0I = A0I(416, 10, 116);
                                            }
                                        } else {
                                            esdsAtomPosition7 = com.facebook.ads.redexgen.core.CO.A0w;
                                            if (childPosition2 == esdsAtomPosition7) {
                                                strA0I = A0I(445, 12, 39);
                                            } else {
                                                esdsAtomPosition8 = com.facebook.ads.redexgen.core.CO.A0a;
                                                if (childPosition2 != esdsAtomPosition8) {
                                                    esdsAtomPosition10 = com.facebook.ads.redexgen.core.CO.A14;
                                                    if (childPosition2 == esdsAtomPosition10) {
                                                        java.lang.String[] strArr11116 = A01;
                                                        java.lang.String str1111 = strArr11116[0];
                                                        str = strArr11116[5];
                                                        esdsAtomPosition9 = str1111.length();
                                                        if (esdsAtomPosition9 != str.length()) {
                                                            throw new java.lang.RuntimeException();
                                                        }
                                                        java.lang.String[] strArr11117 = A01;
                                                        strArr11117[1] = "HpMoEBh7wJwh423AWemPuBKWXentdM";
                                                        strArr11117[7] = "QuzHJbRWBF8tTBbq9KA2qEe5RgzvTY";
                                                        strA0I = A0I(492, 9, 99);
                                                    } else {
                                                        esdsAtomPosition11 = com.facebook.ads.redexgen.core.CO.A03;
                                                        if (childPosition2 == esdsAtomPosition11) {
                                                            strA0I = A0I(482, 10, 21);
                                                        } else {
                                                            esdsAtomPosition12 = com.facebook.ads.redexgen.core.CO.A05;
                                                            if (childPosition2 == esdsAtomPosition12) {
                                                                strA0I = A0I(435, 10, 88);
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    java.lang.String[] strArr11118 = A01;
                                                    java.lang.String str1112 = strArr11118[0];
                                                    str = strArr11118[5];
                                                    esdsAtomPosition9 = str1112.length();
                                                    if (esdsAtomPosition9 != str.length()) {
                                                        throw new java.lang.RuntimeException();
                                                    }
                                                    java.lang.String[] strArr11119 = A01;
                                                    strArr11119[1] = "HpMoEBh7wJwh423AWemPuBKWXentdM";
                                                    strArr11119[7] = "QuzHJbRWBF8tTBbq9KA2qEe5RgzvTY";
                                                    strA0I = A0I(492, 9, 99);
                                                }
                                            }
                                        }
                                    } else {
                                        A01[3] = "edjy6hWV1aP471I9DFgChAk6TLiFBb4Y";
                                        if (childPosition2 == i8) {
                                            java.lang.String[] strArr111110 = A01;
                                            java.lang.String str1113 = strArr111110[6];
                                            str2 = strArr111110[2];
                                            esdsAtomPosition13 = str1113.length();
                                            if (esdsAtomPosition13 == str2.length()) {
                                                java.lang.String[] strArr111111 = A01;
                                                strArr111111[6] = "ImiLuJdYJHxCSyJBtjj1nlpw8DqsI";
                                                strArr111111[2] = "3ETlNfirEj2exDwwoviDJOepzhB6D";
                                                strA0I = A0I(416, 10, 116);
                                            }
                                        } else {
                                            esdsAtomPosition7 = com.facebook.ads.redexgen.core.CO.A0w;
                                            if (childPosition2 == esdsAtomPosition7) {
                                                strA0I = A0I(445, 12, 39);
                                            } else {
                                                esdsAtomPosition8 = com.facebook.ads.redexgen.core.CO.A0a;
                                                if (childPosition2 != esdsAtomPosition8) {
                                                    esdsAtomPosition10 = com.facebook.ads.redexgen.core.CO.A14;
                                                    if (childPosition2 == esdsAtomPosition10) {
                                                        java.lang.String[] strArr111112 = A01;
                                                        java.lang.String str1114 = strArr111112[0];
                                                        str = strArr111112[5];
                                                        esdsAtomPosition9 = str1114.length();
                                                        if (esdsAtomPosition9 != str.length()) {
                                                            throw new java.lang.RuntimeException();
                                                        }
                                                        java.lang.String[] strArr111113 = A01;
                                                        strArr111113[1] = "HpMoEBh7wJwh423AWemPuBKWXentdM";
                                                        strArr111113[7] = "QuzHJbRWBF8tTBbq9KA2qEe5RgzvTY";
                                                        strA0I = A0I(492, 9, 99);
                                                    } else {
                                                        esdsAtomPosition11 = com.facebook.ads.redexgen.core.CO.A03;
                                                        if (childPosition2 == esdsAtomPosition11) {
                                                            strA0I = A0I(482, 10, 21);
                                                        } else {
                                                            esdsAtomPosition12 = com.facebook.ads.redexgen.core.CO.A05;
                                                            if (childPosition2 == esdsAtomPosition12) {
                                                                strA0I = A0I(435, 10, 88);
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    java.lang.String[] strArr111114 = A01;
                                                    java.lang.String str1115 = strArr111114[0];
                                                    str = strArr111114[5];
                                                    esdsAtomPosition9 = str1115.length();
                                                    if (esdsAtomPosition9 != str.length()) {
                                                        throw new java.lang.RuntimeException();
                                                    }
                                                    java.lang.String[] strArr111115 = A01;
                                                    strArr111115[1] = "HpMoEBh7wJwh423AWemPuBKWXentdM";
                                                    strArr111115[7] = "QuzHJbRWBF8tTBbq9KA2qEe5RgzvTY";
                                                    strA0I = A0I(492, 9, 99);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            strA0I = A0I(com.json.mediationsdk.utils.IronSourceConstants.INIT_COMPLETE, 16, 127);
                        }
                    }
                }
            }
        }
        bArr = null;
        while (quickTimeSoundDescriptionVersion2 - childPosition < i2) {
            i4.A0Y(quickTimeSoundDescriptionVersion2);
            childAtomSize = i4.A08();
            strArr = A01;
            if (strArr[1].length() != strArr[7].length()) {
                A01[4] = "77JkTzz3NFo7gTAW49b3hBRm";
                if (childAtomSize > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else if (childAtomSize > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            com.facebook.ads.redexgen.core.AbstractC0730Hf.A05(z2, A0I(574, 32, 127));
            iA08 = i4.A08();
            if (iA08 != com.facebook.ads.redexgen.core.CO.A0S) {
                if (!z) {
                }
                if (iA08 == com.facebook.ads.redexgen.core.CO.A0E) {
                    i4.A0Y(quickTimeSoundDescriptionVersion2 + 8);
                    cr.A02 = com.facebook.ads.redexgen.core.AV.A07(i4, java.lang.Integer.toString(i3), mimeType, drmInitDataA02);
                } else if (iA08 == com.facebook.ads.redexgen.core.CO.A0H) {
                    i4.A0Y(quickTimeSoundDescriptionVersion2 + 8);
                    cr.A02 = com.facebook.ads.redexgen.core.AV.A08(i4, java.lang.Integer.toString(i3), mimeType, drmInitDataA02);
                } else if (iA08 == com.facebook.ads.redexgen.core.CO.A0G) {
                    string = java.lang.Integer.toString(i3);
                    str3 = strA0I;
                    strArr2 = A01;
                    if (strArr2[0].length() != strArr2[5].length()) {
                        cr.A02 = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A07(string, str3, null, -1, -1, iA0I, iA0F, null, drmInitDataA02, 0, mimeType);
                    } else {
                        A01[4] = "EBLYUFe8VXGddau7pqu73bNM";
                        cr.A02 = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A07(string, str3, null, -1, -1, iA0I, iA0F, null, drmInitDataA02, 0, mimeType);
                    }
                } else if (iA08 == com.facebook.ads.redexgen.core.CO.A05) {
                    bArr = new byte[childAtomSize];
                    i4.A0Y(quickTimeSoundDescriptionVersion2);
                    i4.A0c(bArr, 0, childAtomSize);
                }
            } else {
                if (iA08 == com.facebook.ads.redexgen.core.CO.A0S) {
                    iA03 = quickTimeSoundDescriptionVersion2;
                } else {
                    iA03 = A03(i4, quickTimeSoundDescriptionVersion2, childAtomSize);
                }
                if (iA03 != -1) {
                    android.util.Pair<java.lang.String, byte[]> pairA012 = A07(i4, iA03);
                    strA0I = (java.lang.String) pairA012.first;
                    bArr = (byte[]) pairA012.second;
                    if (A0I(467, 15, 103).equals(strA0I)) {
                        android.util.Pair<java.lang.Integer, java.lang.Integer> pairA013 = com.facebook.ads.redexgen.core.AbstractC0734Hj.A03(bArr);
                        iA0F = ((java.lang.Integer) pairA013.first).intValue();
                        iA0I = ((java.lang.Integer) pairA013.second).intValue();
                    }
                }
            }
            quickTimeSoundDescriptionVersion2 += childAtomSize;
        }
        if (cr.A02 == null) {
            return;
        } else {
            return;
        }
        throw new java.lang.RuntimeException();
    }

    public static boolean A0N(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length - 1;
        int latestDelayIndex = com.facebook.ads.redexgen.core.IK.A06(3, 0, length);
        int lastIndex = jArr.length;
        return jArr[0] <= j2 && j2 < jArr[latestDelayIndex] && jArr[com.facebook.ads.redexgen.core.IK.A06(lastIndex - 3, 0, length)] < j3 && j3 <= j;
    }

    public static byte[] A0O(com.facebook.ads.redexgen.core.I4 i4, int i, int i2) {
        int i3 = i + 8;
        while (childPosition < i2) {
            i4.A0Y(i3);
            int childAtomType = i4.A08();
            int childAtomSize = i4.A08();
            int childPosition = com.facebook.ads.redexgen.core.CO.A0q;
            if (childAtomSize == childPosition) {
                int childPosition2 = i3 + childAtomType;
                return java.util.Arrays.copyOfRange(i4.A00, i3, childPosition2);
            }
            i3 += childAtomType;
        }
        return null;
    }
}

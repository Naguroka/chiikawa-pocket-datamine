package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class YS implements com.facebook.ads.redexgen.core.InterfaceC0609Bx {
    public static byte[] A0X;
    public static java.lang.String[] A0Y = {"NLNd4eI8orA1H4rBpr8HMLqUS8K0bIhZ", "4iV8K", "FgNr", "GaBUpY3lkp20WVhZ3rI", "4koLIaX6bKg5r0b1Lqm", "8ZnkkLJNVKhhCexk35olMcz5oR9RrYh", "DMCEbABAxHK2JHC68zvJPiYU4vzbcsY5", "h5GR"};
    public static final com.facebook.ads.redexgen.core.C0 A0Z;
    public static final int A0a;
    public static final com.facebook.ads.internal.exoplayer2.thirdparty.Format A0b;
    public static final byte[] A0c;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public com.facebook.ads.redexgen.core.InterfaceC0611Bz A0C;
    public com.facebook.ads.redexgen.core.C0612Ca A0D;
    public com.facebook.ads.redexgen.core.I4 A0E;
    public boolean A0F;
    public boolean A0G;
    public com.facebook.ads.redexgen.core.C9[] A0H;
    public com.facebook.ads.redexgen.core.C9[] A0I;
    public final int A0J;
    public final android.util.SparseArray<com.facebook.ads.redexgen.core.C0612Ca> A0K;
    public final com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData A0L;
    public final com.facebook.ads.redexgen.core.C9 A0M;
    public final com.facebook.ads.redexgen.core.C0621Cj A0N;
    public final com.facebook.ads.redexgen.core.I4 A0O;
    public final com.facebook.ads.redexgen.core.I4 A0P;
    public final com.facebook.ads.redexgen.core.I4 A0Q;
    public final com.facebook.ads.redexgen.core.I4 A0R;
    public final com.facebook.ads.redexgen.core.IG A0S;
    public final java.util.ArrayDeque<com.facebook.ads.redexgen.core.YY> A0T;
    public final java.util.ArrayDeque<com.facebook.ads.redexgen.core.CZ> A0U;
    public final java.util.List<com.facebook.ads.internal.exoplayer2.thirdparty.Format> A0V;
    public final byte[] A0W;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A00(com.facebook.ads.redexgen.core.C0612Ca c0612Ca, int i, long j, int i2, com.facebook.ads.redexgen.core.I4 i4, int i3) {
        int iA08;
        int i5 = i3;
        long j2 = j;
        i4.A0Y(8);
        int iA00 = com.facebook.ads.redexgen.core.CO.A00(i4.A08());
        com.facebook.ads.redexgen.core.C0621Cj c0621Cj = c0612Ca.A05;
        com.facebook.ads.redexgen.core.C0623Cl c0623Cl = c0612Ca.A07;
        com.facebook.ads.redexgen.core.CU cu = c0623Cl.A07;
        c0623Cl.A0E[i] = i4.A0H();
        c0623Cl.A0G[i] = c0623Cl.A05;
        if ((iA00 & 1) != 0) {
            long[] jArr = c0623Cl.A0G;
            long j3 = jArr[i];
            long jA08 = i4.A08();
            java.lang.String[] strArr = A0Y;
            if (strArr[0].charAt(25) == strArr[6].charAt(25)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0Y;
            strArr2[4] = "sBrX2EtwYh6muAXVYmp";
            strArr2[3] = "Nkb2elyGZGwJQHQIPXA";
            jArr[i] = j3 + jA08;
        }
        int i6 = iA00 & 4;
        java.lang.String[] strArr3 = A0Y;
        if (strArr3[1].length() == strArr3[5].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr4 = A0Y;
        strArr4[4] = "HmZMGavRpWiJTUMCOGz";
        strArr4[3] = "B8AJYf0RCBxmiXX5ezT";
        boolean z = i6 != 0;
        int iA0H = cu.A01;
        if (z) {
            iA0H = i4.A0H();
        }
        boolean z2 = (iA00 & 256) != 0;
        boolean z3 = (iA00 & 512) != 0;
        boolean z4 = (iA00 & 1024) != 0;
        boolean z5 = (iA00 & 2048) != 0;
        long jA0F = 0;
        if (c0621Cj.A08 != null && c0621Cj.A08.length == 1 && c0621Cj.A08[0] == 0) {
            jA0F = com.facebook.ads.redexgen.core.IK.A0F(c0621Cj.A09[0], 1000L, c0621Cj.A06);
        }
        int[] iArr = c0623Cl.A0D;
        int[] iArr2 = c0623Cl.A0C;
        long[] jArr2 = c0623Cl.A0F;
        boolean[] zArr = c0623Cl.A0I;
        boolean z6 = c0621Cj.A03 == 2 && (i2 & 1) != 0;
        int i7 = i5 + c0623Cl.A0E[i];
        long j4 = c0621Cj.A06;
        if (i > 0) {
            j2 = c0623Cl.A06;
        }
        java.lang.String[] strArr5 = A0Y;
        if (strArr5[7].length() != strArr5[2].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr6 = A0Y;
        strArr6[7] = "ymkz";
        strArr6[2] = "tPkJ";
        while (i5 < i7) {
            int iA0H2 = z2 ? i4.A0H() : cu.A00;
            int iA0H3 = z3 ? i4.A0H() : cu.A03;
            if (i5 == 0 && z) {
                iA08 = iA0H;
            } else {
                iA08 = z4 ? i4.A08() : cu.A01;
            }
            if (z5) {
                iArr2[i5] = (int) ((((long) i4.A08()) * 1000) / j4);
            } else {
                iArr2[i5] = 0;
            }
            jArr2[i5] = com.facebook.ads.redexgen.core.IK.A0F(j2, 1000L, j4) - jA0F;
            iArr[i5] = iA0H3;
            zArr[i5] = ((iA08 >> 16) & 1) == 0 && (!z6 || i5 == 0);
            j2 += (long) iA0H2;
            i5++;
        }
        c0623Cl.A06 = j2;
        return i7;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static android.util.Pair<java.lang.Long, com.facebook.ads.redexgen.core.C1174Yt> A04(com.facebook.ads.redexgen.core.I4 i4, long j) throws com.facebook.ads.redexgen.core.A0 {
        long jA0N;
        long jA0N2;
        i4.A0Y(8);
        int iA01 = com.facebook.ads.redexgen.core.CO.A01(i4.A08());
        i4.A0Z(4);
        long jA0M = i4.A0M();
        if (iA01 == 0) {
            jA0N = i4.A0M();
            jA0N2 = j + i4.A0M();
        } else {
            jA0N = i4.A0N();
            jA0N2 = j + i4.A0N();
        }
        long jA0F = com.facebook.ads.redexgen.core.IK.A0F(jA0N, 1000000L, jA0M);
        i4.A0Z(2);
        int iA0I = i4.A0I();
        int[] iArr = new int[iA0I];
        long[] jArr = new long[iA0I];
        long[] jArr2 = new long[iA0I];
        long[] jArr3 = new long[iA0I];
        long jA0F2 = jA0F;
        for (int i = 0; i < iA0I; i++) {
            int iA08 = i4.A08();
            if ((Integer.MIN_VALUE & iA08) != 0) {
                throw new com.facebook.ads.redexgen.core.A0(A0A(581, 28, 60));
            }
            long jA0M2 = i4.A0M();
            iArr[i] = Integer.MAX_VALUE & iA08;
            jArr[i] = jA0N2;
            jArr3[i] = jA0F2;
            jA0N += jA0M2;
            jA0F2 = com.facebook.ads.redexgen.core.IK.A0F(jA0N, 1000000L, jA0M);
            jArr2[i] = jA0F2 - jArr3[i];
            i4.A0Z(4);
            jA0N2 += (long) iArr[i];
        }
        return android.util.Pair.create(java.lang.Long.valueOf(jA0F), new com.facebook.ads.redexgen.core.C1174Yt(iArr, jArr, jArr2, jArr3));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static com.facebook.ads.redexgen.core.C0612Ca A09(com.facebook.ads.redexgen.core.I4 i4, android.util.SparseArray<com.facebook.ads.redexgen.core.C0612Ca> sparseArray) {
        i4.A0Y(8);
        int iA00 = com.facebook.ads.redexgen.core.CO.A00(i4.A08());
        com.facebook.ads.redexgen.core.C0612Ca c0612CaA08 = A08(sparseArray, i4.A08());
        if (c0612CaA08 == null) {
            return null;
        }
        int i = iA00 & 1;
        java.lang.String[] strArr = A0Y;
        if (strArr[4].length() == strArr[3].length()) {
            java.lang.String[] strArr2 = A0Y;
            strArr2[7] = "FJhT";
            strArr2[2] = "Pkvr";
            if (i != 0) {
                long jA0N = i4.A0N();
                c0612CaA08.A07.A05 = jA0N;
                c0612CaA08.A07.A04 = jA0N;
            }
            com.facebook.ads.redexgen.core.CU cu = c0612CaA08.A04;
            int iA0H = (iA00 & 2) != 0 ? i4.A0H() - 1 : cu.A02;
            int i2 = iA00 & 8;
            java.lang.String[] strArr3 = A0Y;
            if (strArr3[1].length() != strArr3[5].length()) {
                java.lang.String[] strArr4 = A0Y;
                strArr4[1] = "0FTku";
                strArr4[5] = "hJQPen4eUYzTZKVdfpRcJxs2T1l2JpI";
                c0612CaA08.A07.A07 = new com.facebook.ads.redexgen.core.CU(iA0H, i2 != 0 ? i4.A0H() : cu.A00, (iA00 & 16) != 0 ? i4.A0H() : cu.A03, (iA00 & 32) != 0 ? i4.A0H() : cu.A01);
                return c0612CaA08;
            }
        }
        throw new java.lang.RuntimeException();
    }

    public static java.lang.String A0A(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0X, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 51);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A0D() {
        A0X = new byte[]{41, 37, 102, 83, 72, 74, 7, 84, 78, 93, 66, 7, 75, 66, 84, 84, 7, 83, 79, 70, 73, 7, 79, 66, 70, 67, 66, 85, 7, 75, 66, 73, 64, 83, 79, 7, 15, 82, 73, 84, 82, 87, 87, 72, 85, 83, 66, 67, 14, 9, 117, 94, 68, 66, 73, 16, 83, 95, 69, 94, 68, 16, 89, 94, 16, 67, 82, 87, 64, 16, 17, 13, 16, 1, 16, 24, 69, 94, 67, 69, 64, 64, 95, 66, 68, 85, 84, 25, 30, 56, 19, 9, 15, 4, 93, 30, 18, 8, 19, 9, 93, 20, 19, 93, 14, 26, 13, 25, 93, 92, 64, 93, 76, 93, 85, 8, 19, 14, 8, 13, 13, 18, 15, 9, 24, 25, 84, 83, 40, 28, 15, 9, 3, 11, 0, 26, 11, 10, 35, 30, 90, 43, 22, 26, 28, 15, 13, 26, 1, 28, 10, 36, 45, 44, 49, 42, 45, 36, 99, 45, 38, 36, 34, 55, 42, 53, 38, 99, 44, 37, 37, 48, 38, 55, 99, 55, 44, 99, 48, 34, 46, 51, 47, 38, 99, 39, 34, 55, 34, 109, 58, 19, 23, 16, 86, 23, 2, 25, 27, 86, 18, 19, 16, 31, 24, 19, 5, 86, 19, 14, 2, 19, 24, 18, 19, 18, 86, 23, 2, 25, 27, 86, 5, 31, 12, 19, 86, 94, 3, 24, 5, 3, 6, 6, 25, 4, 2, 19, 18, 95, 88, 110, 71, 67, 68, 2, 67, 86, 77, 79, 2, 85, 75, 86, 74, 2, 78, 71, 76, 69, 86, 74, 2, 28, 2, 16, 19, 22, 21, 22, 26, 17, 20, 22, 21, 2, 10, 87, 76, 81, 87, 82, 82, 77, 80, 86, 71, 70, 11, 12, 122, 83, 88, 81, 66, 94, 22, 91, 95, 69, 91, 87, 66, 85, 94, 12, 22, 35, 10, 10, 31, 9, 24, 76, 24, 3, 76, 9, 2, 15, 30, 21, 28, 24, 5, 3, 2, 76, 8, 13, 24, 13, 76, 27, 13, 31, 76, 2, 9, 11, 13, 24, 5, 26, 9, 66, 69, 108, 108, 121, 111, 126, 42, 126, 101, 42, 111, 100, 110, 42, 101, 108, 42, 103, 110, 107, 126, 42, 125, 107, 121, 42, 100, 111, 109, 107, 126, 99, 124, 111, 36, 16, 41, 58, 45, 45, 54, 59, 54, 49, 56, 127, 11, 45, 62, 60, 52, 26, 49, 60, 45, 38, 47, 43, 54, 48, 49, 29, 48, 39, 127, 47, 62, 45, 62, 50, 58, 43, 58, 45, 44, 127, 54, 44, 127, 42, 49, 44, 42, 47, 47, 48, 45, 43, 58, 59, 113, 11, 51, 49, 40, 40, kotlin.io.encoding.Base64.padSymbol, 60, 120, 40, 43, 43, 48, 120, 57, 44, 55, 53, 120, 112, 62, 57, 49, 52, kotlin.io.encoding.Base64.padSymbol, 60, 120, 44, 55, 120, kotlin.io.encoding.Base64.padSymbol, 32, 44, 42, 57, 59, 44, 120, 45, 45, 49, 60, 113, 20, 44, 46, 55, 55, 46, 41, 32, 103, 38, 51, 40, 42, 103, 48, 46, 51, 47, 103, 43, 34, 41, 32, 51, 47, 103, 121, 103, 117, 118, 115, 112, 115, 127, 116, 113, 115, 112, 103, 111, 50, 41, 52, 50, 55, 55, 40, 53, 51, 34, 35, 110, 105, 77, 118, 125, 96, 104, 125, 123, 108, 125, 124, 56, 117, 119, 119, 110, 56, 122, 119, 96, 54, 72, 115, 120, 101, 109, 120, 126, 105, 120, 121, kotlin.io.encoding.Base64.padSymbol, 110, 124, 116, 114, kotlin.io.encoding.Base64.padSymbol, 120, 115, 105, 111, 100, kotlin.io.encoding.Base64.padSymbol, 126, 114, 104, 115, 105, 39, kotlin.io.encoding.Base64.padSymbol, 90, 97, 103, 110, 97, 107, 99, 106, 107, 47, 102, 97, 107, 102, 125, 106, 108, 123, 47, 125, 106, 105, 106, 125, 106, 97, 108, 106, 86, 97, 114, 105, 97, 98, 108, 101, 32, 108, 101, 110, 103, 116, 104, 32, 100, 101, 115, 99, 114, 105, 112, 116, 105, 111, 110, 32, 105, 110, 32, 115, 103, 112, 100, 32, 102, 111, 117, 110, 100, 32, 40, 117, 110, 115, 117, 112, 112, 111, 114, 116, 101, 100, 41, 41, 56, 56, 36, 33, 43, 41, 60, 33, 39, 38, 103, 48, 101, 45, 37, 59, 47, 37, 51, okio.Utf8.REPLACEMENT_BYTE, 49, 122, 101, 104, 105, 99, 35, 100, 105, 122, 111, 34, kotlin.io.encoding.Base64.padSymbol, 48, 49, 59, 123, 57, 36, 96};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A0K(com.facebook.ads.redexgen.core.YY yy) throws com.facebook.ads.redexgen.core.A0 {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A06(this.A0N == null, A0A(532, 20, 43));
        com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData drmInitData = this.A0L;
        java.lang.String[] strArr = A0Y;
        if (strArr[1].length() == strArr[5].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0Y;
        strArr2[0] = "cITVXbucFjOfeClWrkS0v9B8d8WyNU66";
        strArr2[6] = "gc4qcVgrZ1gcE7K2dExDGvJ4qDD8VQ1r";
        com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData drmInitDataA05 = drmInitData != null ? this.A0L : A05(yy.A02);
        com.facebook.ads.redexgen.core.YY yyA06 = yy.A06(com.facebook.ads.redexgen.core.CO.A0m);
        android.util.SparseArray<com.facebook.ads.redexgen.core.CU> sparseArray = new android.util.SparseArray<>();
        long jA01 = androidx.media3.common.C.TIME_UNSET;
        int size = yyA06.A02.size();
        for (int i = 0; i < size; i++) {
            com.facebook.ads.redexgen.core.YX yx = yyA06.A02.get(i);
            if (((com.facebook.ads.redexgen.core.CO) yx).A00 == com.facebook.ads.redexgen.core.CO.A1M) {
                android.util.Pair<java.lang.Integer, com.facebook.ads.redexgen.core.CU> pairA03 = A03(yx.A00);
                sparseArray.put(((java.lang.Integer) pairA03.first).intValue(), (com.facebook.ads.redexgen.core.CU) pairA03.second);
            } else if (((com.facebook.ads.redexgen.core.CO) yx).A00 == com.facebook.ads.redexgen.core.CO.A0f) {
                jA01 = A01(yx.A00);
            }
        }
        android.util.SparseArray sparseArray2 = new android.util.SparseArray();
        int size2 = yy.A01.size();
        for (int i2 = 0; i2 < size2; i2++) {
            com.facebook.ads.redexgen.core.YY yy2 = yy.A01.get(i2);
            if (((com.facebook.ads.redexgen.core.CO) yy2).A00 == com.facebook.ads.redexgen.core.CO.A1L) {
                com.facebook.ads.redexgen.core.C0621Cj c0621CjA0C = com.facebook.ads.redexgen.core.CT.A0C(yy2, yy.A07(com.facebook.ads.redexgen.core.CO.A0n), jA01, drmInitDataA05, (this.A0J & 16) != 0, false);
                if (c0621CjA0C != null) {
                    sparseArray2.put(c0621CjA0C.A00, c0621CjA0C);
                }
            }
        }
        int size3 = sparseArray2.size();
        if (this.A0K.size() != 0) {
            com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(this.A0K.size() == size3);
            for (int i3 = 0; i3 < size3; i3++) {
                com.facebook.ads.redexgen.core.C0621Cj c0621Cj = (com.facebook.ads.redexgen.core.C0621Cj) sparseArray2.valueAt(i3);
                this.A0K.get(c0621Cj.A00).A07(c0621Cj, A06(sparseArray, c0621Cj.A00));
            }
            return;
        }
        for (int i4 = 0; i4 < size3; i4++) {
            com.facebook.ads.redexgen.core.C0621Cj c0621Cj2 = (com.facebook.ads.redexgen.core.C0621Cj) sparseArray2.valueAt(i4);
            com.facebook.ads.redexgen.core.C0612Ca c0612Ca = new com.facebook.ads.redexgen.core.C0612Ca(this.A0C.AHA(i4, c0621Cj2.A03));
            c0612Ca.A07(c0621Cj2, A06(sparseArray, c0621Cj2.A00));
            this.A0K.put(c0621Cj2.A00, c0612Ca);
            this.A08 = java.lang.Math.max(this.A08, c0621Cj2.A04);
        }
        A0C();
        this.A0C.A5u();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0M(com.facebook.ads.redexgen.core.YY yy, android.util.SparseArray<com.facebook.ads.redexgen.core.C0612Ca> sparseArray, int i, byte[] bArr) throws com.facebook.ads.redexgen.core.A0 {
        com.facebook.ads.redexgen.core.C0612Ca c0612CaA09 = A09(yy.A07(com.facebook.ads.redexgen.core.CO.A1I).A00, sparseArray);
        if (c0612CaA09 == null) {
            return;
        }
        com.facebook.ads.redexgen.core.C0623Cl c0623Cl = c0612CaA09.A07;
        long jA02 = c0623Cl.A06;
        c0612CaA09.A04();
        if (yy.A07(com.facebook.ads.redexgen.core.CO.A1H) != null && (i & 2) == 0) {
            jA02 = A02(yy.A07(com.facebook.ads.redexgen.core.CO.A1H).A00);
        }
        A0N(yy, c0612CaA09, jA02, i);
        com.facebook.ads.redexgen.core.C0621Cj c0621Cj = c0612CaA09.A05;
        com.facebook.ads.redexgen.core.CU cu = c0623Cl.A07;
        java.lang.String[] strArr = A0Y;
        if (strArr[4].length() != strArr[3].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0Y;
        strArr2[4] = "WU7oMBOObJevND1f7OB";
        strArr2[3] = "wctXeW8hr2zoeToUczf";
        com.facebook.ads.redexgen.core.C0622Ck c0622CkA00 = c0621Cj.A00(cu.A02);
        com.facebook.ads.redexgen.core.YX yxA07 = yy.A07(com.facebook.ads.redexgen.core.CO.A0u);
        if (yxA07 != null) {
            A0P(c0622CkA00, yxA07.A00, c0623Cl);
        }
        com.facebook.ads.redexgen.core.YX yxA08 = yy.A07(com.facebook.ads.redexgen.core.CO.A0t);
        if (yxA08 != null) {
            A0S(yxA08.A00, c0623Cl);
        }
        com.facebook.ads.redexgen.core.YX yxA09 = yy.A07(com.facebook.ads.redexgen.core.CO.A10);
        if (yxA09 != null) {
            A0T(yxA09.A00, c0623Cl);
        }
        com.facebook.ads.redexgen.core.YX yxA010 = yy.A07(com.facebook.ads.redexgen.core.CO.A0x);
        com.facebook.ads.redexgen.core.YX yxA011 = yy.A07(com.facebook.ads.redexgen.core.CO.A11);
        if (yxA010 != null && yxA011 != null) {
            A0V(yxA010.A00, yxA011.A00, c0622CkA00 != null ? c0622CkA00.A02 : null, c0623Cl);
        }
        int size = yy.A02.size();
        for (int i2 = 0; i2 < size; i2++) {
            java.util.List<com.facebook.ads.redexgen.core.YX> list = yy.A02;
            java.lang.String[] strArr3 = A0Y;
            if (strArr3[0].charAt(25) == strArr3[6].charAt(25)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr4 = A0Y;
            strArr4[1] = "paWge";
            strArr4[5] = "dXzfuXi73AxT86ALLJ8HbAy7LfB3Ldz";
            com.facebook.ads.redexgen.core.YX yx = list.get(i2);
            if (((com.facebook.ads.redexgen.core.CO) yx).A00 == com.facebook.ads.redexgen.core.CO.A1Q) {
                A0U(yx.A00, c0623Cl, bArr);
            }
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0P(com.facebook.ads.redexgen.core.C0622Ck c0622Ck, com.facebook.ads.redexgen.core.I4 i4, com.facebook.ads.redexgen.core.C0623Cl c0623Cl) throws com.facebook.ads.redexgen.core.A0 {
        int i = c0622Ck.A00;
        i4.A0Y(8);
        if ((com.facebook.ads.redexgen.core.CO.A00(i4.A08()) & 1) == 1) {
            i4.A0Z(8);
        }
        int iA0E = i4.A0E();
        int iA0H = i4.A0H();
        if (iA0H != c0623Cl.A00) {
            throw new com.facebook.ads.redexgen.core.A0(A0A(290, 17, 5) + iA0H + A0A(0, 2, 54) + c0623Cl.A00);
        }
        int i2 = 0;
        if (iA0E == 0) {
            boolean[] zArr = c0623Cl.A0H;
            for (int i3 = 0; i3 < iA0H; i3++) {
                int iA0E2 = i4.A0E();
                i2 += iA0E2;
                zArr[i3] = iA0E2 > i;
            }
        } else {
            i2 = 0 + (iA0E * iA0H);
            java.util.Arrays.fill(c0623Cl.A0H, 0, iA0H, iA0E > i);
        }
        c0623Cl.A02(i2);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x009f A[PHI: r0
  0x009f: PHI (r0v25 int) = (r0v15 int), (r0v28 int) binds: [B:29:0x00a4, B:24:0x009d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x00a7 A[PHI: r0
  0x00a7: PHI (r0v16 int) = (r0v15 int), (r0v28 int) binds: [B:29:0x00a4, B:24:0x009d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0V(com.facebook.ads.redexgen.core.I4 i4, com.facebook.ads.redexgen.core.I4 i5, java.lang.String str, com.facebook.ads.redexgen.core.C0623Cl c0623Cl) throws com.facebook.ads.redexgen.core.A0 {
        int i;
        boolean z;
        i4.A0Y(8);
        int iA08 = i4.A08();
        if (i4.A08() != A0a) {
            return;
        }
        if (com.facebook.ads.redexgen.core.CO.A01(iA08) == 1) {
            i4.A0Z(4);
        }
        if (i4.A08() != 1) {
            throw new com.facebook.ads.redexgen.core.A0(A0A(50, 39, 3));
        }
        i5.A0Y(8);
        int iA09 = i5.A08();
        if (i5.A08() != A0a) {
            return;
        }
        int iA01 = com.facebook.ads.redexgen.core.CO.A01(iA09);
        if (iA01 == 1) {
            long jA0M = i5.A0M();
            java.lang.String[] strArr = A0Y;
            if (strArr[1].length() == strArr[5].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0Y;
            strArr2[0] = "Yi6XpDuUaBAqz4Q9RTtXdhx6bInSLOYw";
            strArr2[6] = "EJ7sM7qc4WMJT6Oi5h30pL90chEObdKG";
            if (jA0M == 0) {
                throw new com.facebook.ads.redexgen.core.A0(A0A(609, 55, 51));
            }
        } else if (iA01 >= 2) {
            i5.A0Z(4);
        }
        if (i5.A0M() != 1) {
            throw new com.facebook.ads.redexgen.core.A0(A0A(89, 39, 78));
        }
        i5.A0Z(1);
        int iA0E = i5.A0E();
        int i2 = (iA0E & androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK) >> 4;
        int i3 = iA0E & 15;
        int iA0E2 = i5.A0E();
        java.lang.String[] strArr3 = A0Y;
        if (strArr3[0].charAt(25) != strArr3[6].charAt(25)) {
            java.lang.String[] strArr4 = A0Y;
            strArr4[1] = "uSoFd";
            strArr4[5] = "9dYUw5Rswq6IyquMiBU8DnR3Itf6z4D";
            i = 0;
            if (iA0E2 == 1) {
                z = true;
            } else {
                z = false;
            }
        } else {
            i = 0;
            if (iA0E2 == 1) {
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            int iA0E3 = i5.A0E();
            byte[] bArr = new byte[16];
            i5.A0c(bArr, i, bArr.length);
            byte[] bArr2 = null;
            if (z && iA0E3 == 0) {
                int iA0E4 = i5.A0E();
                bArr2 = new byte[iA0E4];
                i5.A0c(bArr2, i, iA0E4);
                java.lang.String[] strArr5 = A0Y;
                if (strArr5[7].length() != strArr5[2].length()) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr6 = A0Y;
                strArr6[0] = "NMPbPFPzZieJ0klTqiPiG8lUGoZuO9ot";
                strArr6[6] = "33Uf7pkjTP2iaKo1mKQ7ReS4dLx9vP9t";
            }
            c0623Cl.A0A = true;
            c0623Cl.A08 = new com.facebook.ads.redexgen.core.C0622Ck(z, str, iA0E3, bArr, i2, i3, bArr2);
        }
    }

    static {
        A0D();
        A0Z = new com.facebook.ads.redexgen.core.YT();
        A0a = com.facebook.ads.redexgen.core.IK.A08(A0A(682, 4, 101));
        A0c = new byte[]{-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
        A0b = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A02(null, A0A(664, 18, 123), Long.MAX_VALUE);
    }

    public YS() {
        this(0);
    }

    public YS(int i) {
        this(i, null);
    }

    public YS(int i, com.facebook.ads.redexgen.core.IG ig) {
        this(i, ig, null, null);
    }

    public YS(int i, com.facebook.ads.redexgen.core.IG ig, com.facebook.ads.redexgen.core.C0621Cj c0621Cj, com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData drmInitData) {
        this(i, ig, c0621Cj, drmInitData, java.util.Collections.emptyList());
    }

    public YS(int i, com.facebook.ads.redexgen.core.IG ig, com.facebook.ads.redexgen.core.C0621Cj c0621Cj, com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData drmInitData, java.util.List<com.facebook.ads.internal.exoplayer2.thirdparty.Format> closedCaptionFormats) {
        this(i, ig, c0621Cj, drmInitData, closedCaptionFormats, null);
    }

    public YS(int i, com.facebook.ads.redexgen.core.IG ig, com.facebook.ads.redexgen.core.C0621Cj c0621Cj, com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData drmInitData, java.util.List<com.facebook.ads.internal.exoplayer2.thirdparty.Format> closedCaptionFormats, com.facebook.ads.redexgen.core.C9 c9) {
        this.A0J = (c0621Cj != null ? 8 : 0) | i;
        this.A0S = ig;
        this.A0N = c0621Cj;
        this.A0L = drmInitData;
        this.A0V = java.util.Collections.unmodifiableList(closedCaptionFormats);
        this.A0M = c9;
        this.A0O = new com.facebook.ads.redexgen.core.I4(16);
        this.A0R = new com.facebook.ads.redexgen.core.I4(com.facebook.ads.redexgen.core.I0.A03);
        this.A0Q = new com.facebook.ads.redexgen.core.I4(5);
        this.A0P = new com.facebook.ads.redexgen.core.I4();
        this.A0W = new byte[16];
        this.A0T = new java.util.ArrayDeque<>();
        this.A0U = new java.util.ArrayDeque<>();
        this.A0K = new android.util.SparseArray<>();
        this.A08 = androidx.media3.common.C.TIME_UNSET;
        this.A0A = androidx.media3.common.C.TIME_UNSET;
        this.A0B = androidx.media3.common.C.TIME_UNSET;
        A0B();
    }

    public static long A01(com.facebook.ads.redexgen.core.I4 i4) {
        i4.A0Y(8);
        int fullAtom = i4.A08();
        return com.facebook.ads.redexgen.core.CO.A01(fullAtom) == 0 ? i4.A0M() : i4.A0N();
    }

    public static long A02(com.facebook.ads.redexgen.core.I4 i4) {
        i4.A0Y(8);
        int fullAtom = i4.A08();
        int version = com.facebook.ads.redexgen.core.CO.A01(fullAtom);
        return version == 1 ? i4.A0N() : i4.A0M();
    }

    public static android.util.Pair<java.lang.Integer, com.facebook.ads.redexgen.core.CU> A03(com.facebook.ads.redexgen.core.I4 i4) {
        i4.A0Y(12);
        int defaultSampleDescriptionIndex = i4.A08();
        int trackId = i4.A0H();
        int defaultSampleFlags = i4.A0H();
        int defaultSampleSize = i4.A0H();
        int defaultSampleDuration = i4.A08();
        return android.util.Pair.create(java.lang.Integer.valueOf(defaultSampleDescriptionIndex), new com.facebook.ads.redexgen.core.CU(trackId - 1, defaultSampleFlags, defaultSampleSize, defaultSampleDuration));
    }

    public static com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData A05(java.util.List<com.facebook.ads.redexgen.core.YX> list) {
        java.util.ArrayList arrayList = null;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            com.facebook.ads.redexgen.core.YX yx = list.get(i);
            int leafChildrenSize = ((com.facebook.ads.redexgen.core.CO) yx).A00;
            if (leafChildrenSize == com.facebook.ads.redexgen.core.CO.A0r) {
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                }
                byte[] bArr = yx.A00.A00;
                java.util.UUID uuidA02 = com.facebook.ads.redexgen.core.AbstractC0618Cg.A02(bArr);
                if (uuidA02 == null) {
                    android.util.Log.w(A0A(128, 22, 93), A0A(437, 42, 107));
                } else {
                    arrayList.add(new com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData.SchemeData(uuidA02, A0A(696, 9, 103), bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData(arrayList);
    }

    private com.facebook.ads.redexgen.core.CU A06(android.util.SparseArray<com.facebook.ads.redexgen.core.CU> sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return (com.facebook.ads.redexgen.core.CU) com.facebook.ads.redexgen.core.AbstractC0730Hf.A01(sparseArray.get(i));
    }

    public static com.facebook.ads.redexgen.core.C0612Ca A07(android.util.SparseArray<com.facebook.ads.redexgen.core.C0612Ca> sparseArray) {
        com.facebook.ads.redexgen.core.C0612Ca c0612Ca = null;
        long j = Long.MAX_VALUE;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            com.facebook.ads.redexgen.core.C0612Ca c0612CaValueAt = sparseArray.valueAt(i);
            if (c0612CaValueAt.A02 != c0612CaValueAt.A07.A02) {
                long nextTrackRunOffset = c0612CaValueAt.A07.A0G[c0612CaValueAt.A02];
                if (nextTrackRunOffset < j) {
                    c0612Ca = c0612CaValueAt;
                    j = nextTrackRunOffset;
                }
            }
        }
        return c0612Ca;
    }

    public static com.facebook.ads.redexgen.core.C0612Ca A08(android.util.SparseArray<com.facebook.ads.redexgen.core.C0612Ca> sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return sparseArray.get(i);
    }

    private void A0B() {
        this.A02 = 0;
        this.A00 = 0;
    }

    private void A0C() {
        if (this.A0I == null) {
            this.A0I = new com.facebook.ads.redexgen.core.C9[2];
            int i = 0;
            if (this.A0M != null) {
                this.A0I[0] = this.A0M;
                i = 0 + 1;
            }
            int emsgTrackOutputCount = this.A0J;
            if ((emsgTrackOutputCount & 4) != 0) {
                this.A0I[i] = this.A0C.AHA(this.A0K.size(), 4);
                i++;
            }
            this.A0I = (com.facebook.ads.redexgen.core.C9[]) java.util.Arrays.copyOf(this.A0I, i);
            for (com.facebook.ads.redexgen.core.C9 c9 : this.A0I) {
                c9.A69(A0b);
            }
        }
        if (this.A0H == null) {
            this.A0H = new com.facebook.ads.redexgen.core.C9[this.A0V.size()];
            for (int i2 = 0; i2 < i; i2++) {
                com.facebook.ads.redexgen.core.InterfaceC0611Bz interfaceC0611Bz = this.A0C;
                int i3 = this.A0K.size();
                com.facebook.ads.redexgen.core.C9 output = interfaceC0611Bz.AHA(i3 + 1 + i2, 3);
                output.A69(this.A0V.get(i2));
                this.A0H[i2] = output;
            }
        }
    }

    private void A0E(long j) {
        while (!this.A0U.isEmpty()) {
            com.facebook.ads.redexgen.core.CZ czRemoveFirst = this.A0U.removeFirst();
            this.A03 -= czRemoveFirst.A00;
            long jA06 = j + czRemoveFirst.A01;
            if (this.A0S != null) {
                jA06 = this.A0S.A06(jA06);
            }
            for (com.facebook.ads.redexgen.core.C9 c9 : this.A0I) {
                c9.AFw(jA06, 1, czRemoveFirst.A00, this.A03, null);
            }
        }
    }

    private void A0F(long j) throws com.facebook.ads.redexgen.core.A0 {
        while (!this.A0T.isEmpty()) {
            com.facebook.ads.redexgen.core.YY yyPeek = this.A0T.peek();
            java.lang.String[] strArr = A0Y;
            if (strArr[0].charAt(25) == strArr[6].charAt(25)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0Y;
            strArr2[4] = "gNXaBBDJLYyRWj2Z7QI";
            strArr2[3] = "TD4PDa0LhqSPzxNxfPG";
            if (yyPeek.A00 != j) {
                break;
            } else {
                A0I(this.A0T.pop());
            }
        }
        A0B();
    }

    private void A0G(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By) throws java.lang.InterruptedException, java.io.IOException {
        int i = ((int) this.A07) - this.A00;
        if (this.A0E != null) {
            interfaceC0610By.readFully(this.A0E.A00, 8, i);
            int atomPayloadSize = this.A01;
            A0O(new com.facebook.ads.redexgen.core.YX(atomPayloadSize, this.A0E), interfaceC0610By.A86());
        } else {
            interfaceC0610By.AGq(i);
        }
        A0F(interfaceC0610By.A86());
        java.lang.String[] strArr = A0Y;
        java.lang.String str = strArr[0];
        java.lang.String str2 = strArr[6];
        int atomPayloadSize2 = str.charAt(25);
        if (atomPayloadSize2 == str2.charAt(25)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0Y;
        strArr2[1] = "4FJvf";
        strArr2[5] = "L9aSIrlhJLOJ4gZHMUtL1skIFqYjh5f";
    }

    private void A0H(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By) throws java.lang.InterruptedException, java.io.IOException {
        com.facebook.ads.redexgen.core.C0612Ca nextTrackBundle = null;
        long j = Long.MAX_VALUE;
        int size = this.A0K.size();
        for (int i = 0; i < size; i++) {
            com.facebook.ads.redexgen.core.C0623Cl c0623Cl = this.A0K.valueAt(i).A07;
            if (c0623Cl.A0B && c0623Cl.A04 < j) {
                j = c0623Cl.A04;
                android.util.SparseArray<com.facebook.ads.redexgen.core.C0612Ca> sparseArray = this.A0K;
                java.lang.String[] strArr = A0Y;
                if (strArr[4].length() != strArr[3].length()) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr2 = A0Y;
                strArr2[1] = "kt1A3";
                strArr2[5] = "mNo1CSqVUFLWh990elZl1WPNTwsUo12";
                com.facebook.ads.redexgen.core.C0612Ca nextTrackBundle2 = sparseArray.valueAt(i);
                nextTrackBundle = nextTrackBundle2;
            }
        }
        if (nextTrackBundle == null) {
            this.A02 = 3;
            return;
        }
        int iA86 = (int) (j - interfaceC0610By.A86());
        if (iA86 >= 0) {
            interfaceC0610By.AGq(iA86);
            nextTrackBundle.A07.A04(interfaceC0610By);
            return;
        }
        throw new com.facebook.ads.redexgen.core.A0(A0A(307, 39, 95));
    }

    private void A0I(com.facebook.ads.redexgen.core.YY yy) throws com.facebook.ads.redexgen.core.A0 {
        if (((com.facebook.ads.redexgen.core.CO) yy).A00 == com.facebook.ads.redexgen.core.CO.A0j) {
            A0K(yy);
        } else if (((com.facebook.ads.redexgen.core.CO) yy).A00 == com.facebook.ads.redexgen.core.CO.A0i) {
            A0J(yy);
        } else {
            if (this.A0T.isEmpty()) {
                return;
            }
            this.A0T.peek().A08(yy);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x007d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0097  */
    /* JADX WARN: Code duplicated, block: B:21:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:25:0x00c8 A[LOOP:1: B:20:0x00a4->B:25:0x00c8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x00da  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    private void A0J(com.facebook.ads.redexgen.core.YY yy) throws com.facebook.ads.redexgen.core.A0 {
        int size;
        java.lang.String[] strArr;
        int i;
        com.facebook.ads.redexgen.core.C0612Ca c0612CaValueAt;
        long j;
        java.lang.String str;
        int trackCount;
        A0L(yy, this.A0K, this.A0J, this.A0W);
        com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData drmInitDataA05 = this.A0L != null ? null : A05(yy.A02);
        if (drmInitDataA05 == null) {
            if (this.A0A != androidx.media3.common.C.TIME_UNSET) {
                size = this.A0K.size();
                strArr = A0Y;
                if (strArr[0].charAt(25) != strArr[6].charAt(25)) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr2 = A0Y;
                strArr2[1] = "SLujA";
                strArr2[5] = "54hBL6ZhhAHwudix1T3OFjmqjeaVz8V";
                for (i = 0; i < size; i++) {
                    c0612CaValueAt = this.A0K.valueAt(i);
                    j = this.A0A;
                    java.lang.String[] strArr3 = A0Y;
                    java.lang.String str2 = strArr3[7];
                    str = strArr3[2];
                    trackCount = str2.length();
                    if (trackCount != str.length()) {
                        java.lang.String[] strArr4 = A0Y;
                        strArr4[0] = "JzptpZA4eYxy2xJI1KlH0ejrbcDGS6Rm";
                        strArr4[6] = "qWlvxcI9Vh7HD5II0LoLiUDgTr4SEUlu";
                        c0612CaValueAt.A05(j);
                    }
                }
                this.A0A = androidx.media3.common.C.TIME_UNSET;
                return;
            }
            return;
        }
        int size2 = this.A0K.size();
        java.lang.String[] strArr5 = A0Y;
        if (strArr5[1].length() != strArr5[5].length()) {
            java.lang.String[] strArr6 = A0Y;
            strArr6[0] = "AYjZd4g6T0IxTHPvW5j6vW4JlA5KT5rF";
            strArr6[6] = "Mee0jY90dwUegeNg5bKbsrEqYZuyqQmD";
            int i2 = 0;
            while (i2 < size2) {
                com.facebook.ads.redexgen.core.C0612Ca c0612CaValueAt2 = this.A0K.valueAt(i2);
                java.lang.String[] strArr7 = A0Y;
                java.lang.String str3 = strArr7[1];
                java.lang.String str4 = strArr7[5];
                int trackCount2 = str3.length();
                if (trackCount2 != str4.length()) {
                    java.lang.String[] strArr8 = A0Y;
                    strArr8[0] = "9D0DcxlbTrvCOM9kwdnib1tB4ktxoksB";
                    strArr8[6] = "xmyCm9TqbgmL7mY9bOatvH3VH7vFgkg3";
                    c0612CaValueAt2.A06(drmInitDataA05);
                    i2++;
                } else {
                    c0612CaValueAt2.A06(drmInitDataA05);
                    i2++;
                }
            }
            if (this.A0A != androidx.media3.common.C.TIME_UNSET) {
                size = this.A0K.size();
                strArr = A0Y;
                if (strArr[0].charAt(25) != strArr[6].charAt(25)) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr9 = A0Y;
                strArr9[1] = "SLujA";
                strArr9[5] = "54hBL6ZhhAHwudix1T3OFjmqjeaVz8V";
                while (i < size) {
                    c0612CaValueAt = this.A0K.valueAt(i);
                    j = this.A0A;
                    java.lang.String[] strArr10 = A0Y;
                    java.lang.String str5 = strArr10[7];
                    str = strArr10[2];
                    trackCount = str5.length();
                    if (trackCount != str.length()) {
                        java.lang.String[] strArr11 = A0Y;
                        strArr11[0] = "JzptpZA4eYxy2xJI1KlH0ejrbcDGS6Rm";
                        strArr11[6] = "qWlvxcI9Vh7HD5II0LoLiUDgTr4SEUlu";
                        c0612CaValueAt.A05(j);
                    }
                }
                this.A0A = androidx.media3.common.C.TIME_UNSET;
                return;
            }
            return;
        }
        throw new java.lang.RuntimeException();
    }

    public static void A0L(com.facebook.ads.redexgen.core.YY yy, android.util.SparseArray<com.facebook.ads.redexgen.core.C0612Ca> sparseArray, int i, byte[] bArr) throws com.facebook.ads.redexgen.core.A0 {
        int size = yy.A01.size();
        for (int i2 = 0; i2 < size; i2++) {
            com.facebook.ads.redexgen.core.YY child = yy.A01.get(i2);
            int i3 = ((com.facebook.ads.redexgen.core.CO) child).A00;
            int moofContainerChildrenSize = com.facebook.ads.redexgen.core.CO.A1K;
            if (i3 == moofContainerChildrenSize) {
                A0M(child, sparseArray, i, bArr);
            }
        }
    }

    public static void A0N(com.facebook.ads.redexgen.core.YY yy, com.facebook.ads.redexgen.core.C0612Ca c0612Ca, long j, int trunIndex) {
        int i = 0;
        int trunSampleCount = 0;
        java.util.List<com.facebook.ads.redexgen.core.YX> list = yy.A02;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            com.facebook.ads.redexgen.core.YX yx = list.get(i2);
            if (((com.facebook.ads.redexgen.core.CO) yx).A00 == com.facebook.ads.redexgen.core.CO.A1N) {
                com.facebook.ads.redexgen.core.I4 trunData = yx.A00;
                trunData.A0Y(12);
                int iA0H = trunData.A0H();
                if (iA0H > 0) {
                    trunSampleCount += iA0H;
                    java.lang.String[] strArr = A0Y;
                    if (strArr[4].length() != strArr[3].length()) {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr2 = A0Y;
                    strArr2[0] = "ra20oBhvV3095H1tQEj3cUfqdugQ0hdh";
                    strArr2[6] = "LUb7Sxx6Lbmy90ZTUB4vzQSJRbj77A9K";
                    i++;
                } else {
                    continue;
                }
            }
        }
        c0612Ca.A02 = 0;
        c0612Ca.A00 = 0;
        c0612Ca.A01 = 0;
        c0612Ca.A07.A03(i, trunSampleCount);
        int i3 = 0;
        int trunStartPosition = 0;
        for (int i4 = 0; i4 < size; i4++) {
            com.facebook.ads.redexgen.core.YX yx2 = list.get(i4);
            int trunIndex2 = ((com.facebook.ads.redexgen.core.CO) yx2).A00;
            if (trunIndex2 == com.facebook.ads.redexgen.core.CO.A1N) {
                trunStartPosition = A00(c0612Ca, i3, j, trunIndex, yx2.A00, trunStartPosition);
                i3++;
            }
        }
    }

    private void A0O(com.facebook.ads.redexgen.core.YX yx, long j) throws com.facebook.ads.redexgen.core.A0 {
        if (!this.A0T.isEmpty()) {
            this.A0T.peek().A09(yx);
            return;
        }
        if (((com.facebook.ads.redexgen.core.CO) yx).A00 == com.facebook.ads.redexgen.core.CO.A12) {
            android.util.Pair<java.lang.Long, com.facebook.ads.redexgen.core.C1174Yt> pairA04 = A04(yx.A00, j);
            this.A0B = ((java.lang.Long) pairA04.first).longValue();
            this.A0C.AG8((com.facebook.ads.redexgen.core.C6) pairA04.second);
            this.A0F = true;
            return;
        }
        if (((com.facebook.ads.redexgen.core.CO) yx).A00 != com.facebook.ads.redexgen.core.CO.A0P) {
            return;
        }
        A0Q(yx.A00);
    }

    private void A0Q(com.facebook.ads.redexgen.core.I4 i4) {
        if (this.A0I == null || this.A0I.length == 0) {
            return;
        }
        i4.A0Y(12);
        int iA04 = i4.A04();
        i4.A0Q();
        i4.A0Q();
        long jA0F = com.facebook.ads.redexgen.core.IK.A0F(i4.A0M(), 1000000L, i4.A0M());
        for (com.facebook.ads.redexgen.core.C9 c9 : this.A0I) {
            i4.A0Y(12);
            c9.AFv(i4, iA04);
        }
        if (this.A0B != androidx.media3.common.C.TIME_UNSET) {
            long jA06 = this.A0B + jA0F;
            if (this.A0S != null) {
                jA06 = this.A0S.A06(jA06);
            }
            for (com.facebook.ads.redexgen.core.C9 c10 : this.A0I) {
                c10.AFw(jA06, 1, iA04, 0, null);
            }
            return;
        }
        this.A0U.addLast(new com.facebook.ads.redexgen.core.CZ(jA0F, iA04));
        this.A03 += iA04;
    }

    public static void A0R(com.facebook.ads.redexgen.core.I4 i4, int i, com.facebook.ads.redexgen.core.C0623Cl c0623Cl) throws com.facebook.ads.redexgen.core.A0 {
        i4.A0Y(i + 8);
        int fullAtom = i4.A08();
        int flags = com.facebook.ads.redexgen.core.CO.A00(fullAtom);
        int fullAtom2 = flags & 1;
        if (fullAtom2 == 0) {
            int fullAtom3 = flags & 2;
            boolean z = fullAtom3 != 0;
            int sampleCount = i4.A0H();
            int fullAtom4 = c0623Cl.A00;
            if (sampleCount == fullAtom4) {
                java.util.Arrays.fill(c0623Cl.A0H, 0, sampleCount, z);
                int iA04 = i4.A04();
                java.lang.String[] strArr = A0Y;
                java.lang.String str = strArr[7];
                java.lang.String str2 = strArr[2];
                int flags2 = str.length();
                int fullAtom5 = str2.length();
                if (flags2 != fullAtom5) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr2 = A0Y;
                strArr2[7] = "AHUK";
                strArr2[2] = "TJdi";
                c0623Cl.A02(iA04);
                c0623Cl.A05(i4);
                return;
            }
            java.lang.StringBuilder sbAppend = new java.lang.StringBuilder().append(A0A(290, 17, 5)).append(sampleCount).append(A0A(0, 2, 54));
            int fullAtom6 = c0623Cl.A00;
            throw new com.facebook.ads.redexgen.core.A0(sbAppend.append(fullAtom6).toString());
        }
        throw new com.facebook.ads.redexgen.core.A0(A0A(381, 56, 108));
    }

    public static void A0S(com.facebook.ads.redexgen.core.I4 i4, com.facebook.ads.redexgen.core.C0623Cl c0623Cl) throws com.facebook.ads.redexgen.core.A0 {
        i4.A0Y(8);
        int flags = i4.A08();
        int fullAtom = com.facebook.ads.redexgen.core.CO.A00(flags) & 1;
        if (fullAtom == 1) {
            i4.A0Z(8);
        }
        int iA0H = i4.A0H();
        if (iA0H == 1) {
            int entryCount = com.facebook.ads.redexgen.core.CO.A01(flags);
            c0623Cl.A04 += entryCount == 0 ? i4.A0M() : i4.A0N();
            return;
        }
        throw new com.facebook.ads.redexgen.core.A0(A0A(552, 29, 46) + iA0H);
    }

    public static void A0T(com.facebook.ads.redexgen.core.I4 i4, com.facebook.ads.redexgen.core.C0623Cl c0623Cl) throws com.facebook.ads.redexgen.core.A0 {
        A0R(i4, 0, c0623Cl);
    }

    public static void A0U(com.facebook.ads.redexgen.core.I4 i4, com.facebook.ads.redexgen.core.C0623Cl c0623Cl, byte[] bArr) throws com.facebook.ads.redexgen.core.A0 {
        i4.A0Y(8);
        i4.A0c(bArr, 0, 16);
        if (!java.util.Arrays.equals(bArr, A0c)) {
            return;
        }
        A0R(i4, 16, c0623Cl);
    }

    public static boolean A0W(int i) {
        if (i != com.facebook.ads.redexgen.core.CO.A0j) {
            int i2 = com.facebook.ads.redexgen.core.CO.A1L;
            java.lang.String[] strArr = A0Y;
            if (strArr[7].length() != strArr[2].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0Y;
            strArr2[4] = "z52WapgDuUmRrJT6dfh";
            strArr2[3] = "pwB1eRxling54jqU6H4";
            if (i != i2 && i != com.facebook.ads.redexgen.core.CO.A0d && i != com.facebook.ads.redexgen.core.CO.A0h && i != com.facebook.ads.redexgen.core.CO.A16 && i != com.facebook.ads.redexgen.core.CO.A0i && i != com.facebook.ads.redexgen.core.CO.A1K && i != com.facebook.ads.redexgen.core.CO.A0m && i != com.facebook.ads.redexgen.core.CO.A0N) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00a2  */
    public static boolean A0X(int i) {
        if (i != com.facebook.ads.redexgen.core.CO.A0V) {
            int i2 = com.facebook.ads.redexgen.core.CO.A0c;
            java.lang.String[] strArr = A0Y;
            if (strArr[1].length() == strArr[5].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0Y;
            strArr2[4] = "7R4knsjQsoYw3FkbVRD";
            strArr2[3] = "IJ7EeFeEp8TvkaWnmhI";
            if (i != i2 && i != com.facebook.ads.redexgen.core.CO.A0n && i != com.facebook.ads.redexgen.core.CO.A12 && i != com.facebook.ads.redexgen.core.CO.A1A && i != com.facebook.ads.redexgen.core.CO.A1H && i != com.facebook.ads.redexgen.core.CO.A1I && i != com.facebook.ads.redexgen.core.CO.A1J && i != com.facebook.ads.redexgen.core.CO.A1M) {
                int i3 = com.facebook.ads.redexgen.core.CO.A1N;
                java.lang.String[] strArr3 = A0Y;
                if (strArr3[0].charAt(25) == strArr3[6].charAt(25)) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr4 = A0Y;
                strArr4[7] = "XNpM";
                strArr4[2] = "Sb63";
                if (i != i3 && i != com.facebook.ads.redexgen.core.CO.A0r && i != com.facebook.ads.redexgen.core.CO.A0u && i != com.facebook.ads.redexgen.core.CO.A0t && i != com.facebook.ads.redexgen.core.CO.A10 && i != com.facebook.ads.redexgen.core.CO.A1Q && i != com.facebook.ads.redexgen.core.CO.A0x) {
                    int i4 = com.facebook.ads.redexgen.core.CO.A11;
                    java.lang.String[] strArr5 = A0Y;
                    if (strArr5[0].charAt(25) != strArr5[6].charAt(25)) {
                        java.lang.String[] strArr6 = A0Y;
                        strArr6[7] = "rn1A";
                        strArr6[2] = "2A15";
                        if (i != i4) {
                            if (i == com.facebook.ads.redexgen.core.CO.A0O && i != com.facebook.ads.redexgen.core.CO.A0f && i != com.facebook.ads.redexgen.core.CO.A0P) {
                                return false;
                            }
                        }
                    } else if (i != i4) {
                        if (i == com.facebook.ads.redexgen.core.CO.A0O) {
                        }
                    }
                }
            }
        }
        return true;
    }

    private boolean A0Y(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By) throws java.lang.InterruptedException, java.io.IOException {
        if (this.A00 == 0) {
            if (!interfaceC0610By.AEp(this.A0O.A00, 0, 8, true)) {
                return false;
            }
            this.A00 = 8;
            this.A0O.A0Y(0);
            this.A07 = this.A0O.A0M();
            this.A01 = this.A0O.A08();
        }
        long j = this.A07;
        java.lang.String[] strArr = A0Y;
        if (strArr[4].length() != strArr[3].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0Y;
        strArr2[7] = "deGD";
        strArr2[2] = "uZkj";
        if (j == 1) {
            interfaceC0610By.readFully(this.A0O.A00, 8, 8);
            int headerBytesRemaining = this.A00;
            this.A00 = headerBytesRemaining + 8;
            this.A07 = this.A0O.A0N();
        } else if (this.A07 == 0) {
            long jA7g = interfaceC0610By.A7g();
            if (jA7g == -1 && !this.A0T.isEmpty()) {
                jA7g = this.A0T.peek().A00;
            }
            if (jA7g != -1) {
                long jA86 = jA7g - interfaceC0610By.A86();
                int trackCount = this.A00;
                this.A07 = jA86 + ((long) trackCount);
            }
        }
        if (this.A07 >= this.A00) {
            long jA87 = interfaceC0610By.A86() - ((long) this.A00);
            if (this.A01 == com.facebook.ads.redexgen.core.CO.A0i) {
                int size = this.A0K.size();
                for (int i = 0; i < size; i++) {
                    com.facebook.ads.redexgen.core.C0623Cl c0623Cl = this.A0K.valueAt(i).A07;
                    c0623Cl.A03 = jA87;
                    c0623Cl.A04 = jA87;
                    c0623Cl.A05 = jA87;
                }
            }
            if (this.A01 == com.facebook.ads.redexgen.core.CO.A0b) {
                this.A0D = null;
                this.A09 = this.A07 + jA87;
                if (!this.A0F) {
                    this.A0C.AG8(new com.facebook.ads.redexgen.core.C1169Yo(this.A08, jA87));
                    this.A0F = true;
                }
                this.A02 = 2;
                return true;
            }
            if (A0W(this.A01)) {
                long jA88 = (interfaceC0610By.A86() + this.A07) - 8;
                this.A0T.push(new com.facebook.ads.redexgen.core.YY(this.A01, jA88));
                if (this.A07 == this.A00) {
                    A0F(jA88);
                } else {
                    A0B();
                }
            } else if (A0X(this.A01)) {
                if (this.A00 != 8) {
                    throw new com.facebook.ads.redexgen.core.A0(A0A(org.objectweb.asm.Opcodes.ARRAYLENGTH, 51, 69));
                }
                if (this.A07 <= 2147483647L) {
                    this.A0E = new com.facebook.ads.redexgen.core.I4((int) this.A07);
                    java.lang.System.arraycopy(this.A0O.A00, 0, this.A0E.A00, 0, 8);
                    this.A02 = 1;
                } else {
                    throw new com.facebook.ads.redexgen.core.A0(A0A(241, 49, 17));
                }
            } else if (this.A07 <= 2147483647L) {
                this.A0E = null;
                java.lang.String[] strArr3 = A0Y;
                if (strArr3[4].length() != strArr3[3].length()) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr4 = A0Y;
                strArr4[0] = "CFkyaDHKl829MEsfGeCJV98D86mxwRuG";
                strArr4[6] = "SvrGe4OZrAn9QexWiwFyRQyCjduNZ0ii";
                this.A02 = 1;
            } else {
                throw new com.facebook.ads.redexgen.core.A0(A0A(479, 53, 116));
            }
            return true;
        }
        throw new com.facebook.ads.redexgen.core.A0(A0A(2, 48, 20));
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:36:0x0104  */
    /* JADX WARN: Code duplicated, block: B:39:0x011c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0145  */
    /* JADX WARN: Code duplicated, block: B:45:0x0161  */
    /* JADX WARN: Code duplicated, block: B:47:0x0175  */
    /* JADX WARN: Code duplicated, block: B:49:0x0184  */
    /* JADX WARN: Code duplicated, block: B:52:0x0199  */
    /* JADX WARN: Code duplicated, block: B:55:0x019f  */
    /* JADX WARN: Code duplicated, block: B:57:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:58:0x0202 A[LOOP:1: B:58:0x0202->B:64:0x022d, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:60:0x0208  */
    /* JADX WARN: Code duplicated, block: B:64:0x022d A[LOOP:1: B:58:0x0202->B:64:0x022d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x0245  */
    /* JADX WARN: Code duplicated, block: B:69:0x024c  */
    /* JADX WARN: Code duplicated, block: B:73:0x0266  */
    /* JADX WARN: Code duplicated, block: B:76:0x026e  */
    /* JADX WARN: Code duplicated, block: B:78:0x019b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0227 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private boolean A0Z(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By) throws java.lang.InterruptedException, java.io.IOException {
        com.facebook.ads.redexgen.core.C0623Cl c0623Cl;
        com.facebook.ads.redexgen.core.C0621Cj c0621Cj;
        com.facebook.ads.redexgen.core.C9 c9;
        long jA00;
        int iAFu;
        java.lang.String[] strArr;
        boolean z;
        com.facebook.ads.redexgen.core.C8 c8;
        int i;
        com.facebook.ads.redexgen.core.C0622Ck c0622CkA00;
        byte[] bArr;
        int i2;
        int i3;
        boolean z2;
        java.lang.String str;
        java.lang.String[] strArr2;
        int iAFu2;
        int i4 = 4;
        int i5 = 1;
        int i6 = 0;
        if (this.A02 == 3) {
            if (this.A0D == null) {
                com.facebook.ads.redexgen.core.C0612Ca c0612CaA07 = A07(this.A0K);
                if (c0612CaA07 == null) {
                    int iA86 = (int) (this.A09 - interfaceC0610By.A86());
                    if (iA86 >= 0) {
                        interfaceC0610By.AGq(iA86);
                        A0B();
                        return false;
                    }
                    throw new com.facebook.ads.redexgen.core.A0(A0A(346, 35, 57));
                }
                int iA87 = (int) (c0612CaA07.A07.A0G[c0612CaA07.A02] - interfaceC0610By.A86());
                if (iA87 < 0) {
                    android.util.Log.w(A0A(128, 22, 93), A0A(150, 40, 112));
                    iA87 = 0;
                }
                interfaceC0610By.AGq(iA87);
                java.lang.String[] strArr3 = A0Y;
                if (strArr3[0].charAt(25) != strArr3[6].charAt(25)) {
                    java.lang.String[] strArr4 = A0Y;
                    strArr4[7] = "cA3P";
                    strArr4[2] = "KFDs";
                    this.A0D = c0612CaA07;
                }
            }
            this.A06 = this.A0D.A07.A0D[this.A0D.A01];
            if (this.A0D.A01 < this.A0D.A03) {
                interfaceC0610By.AGq(this.A06);
                this.A0D.A01();
                if (!this.A0D.A08()) {
                    this.A0D = null;
                }
                this.A02 = 3;
                return true;
            }
            if (this.A0D.A05.A02 == 1) {
                this.A06 -= 8;
                interfaceC0610By.AGq(8);
            }
            this.A04 = this.A0D.A03();
            this.A06 += this.A04;
            this.A02 = 4;
            this.A05 = 0;
            c0623Cl = this.A0D.A07;
            c0621Cj = this.A0D.A05;
            c9 = this.A0D.A06;
            int i7 = this.A0D.A01;
            jA00 = c0623Cl.A00(i7) * 1000;
            if (this.A0S != null) {
                jA00 = this.A0S.A06(jA00);
            }
            if (c0621Cj.A01 != 0) {
                while (this.A04 < this.A06) {
                    iAFu = this.A04 + c9.AFu(interfaceC0610By, this.A06 - this.A04, false);
                    strArr = A0Y;
                    if (strArr[4].length() != strArr[3].length()) {
                        java.lang.String[] strArr5 = A0Y;
                        strArr5[0] = "1P85sOMrC7mCK5MksTIy5txI4uRDM7tn";
                        strArr5[6] = "xlzTK0ml8rlPwpKJ6n8uO0ndQxCezJLP";
                        this.A04 = iAFu;
                    }
                }
            } else {
                bArr = this.A0Q.A00;
                bArr[0] = 0;
                bArr[1] = 0;
                bArr[2] = 0;
                i2 = c0621Cj.A01 + 1;
                i3 = 4 - c0621Cj.A01;
                while (this.A04 < this.A06) {
                    if (this.A05 == 0) {
                        interfaceC0610By.readFully(bArr, i3, i2);
                        this.A0Q.A0Y(i6);
                        this.A05 = this.A0Q.A0H() - i5;
                        this.A0R.A0Y(i6);
                        c9.AFv(this.A0R, i4);
                        c9.AFv(this.A0Q, i5);
                        if (this.A0H.length > 0) {
                            str = c0621Cj.A07.A0O;
                            strArr2 = A0Y;
                            if (strArr2[0].charAt(25) != strArr2[6].charAt(25)) {
                                java.lang.String[] strArr6 = A0Y;
                                strArr6[7] = "X4NM";
                                strArr6[2] = "aVjU";
                                if (com.facebook.ads.redexgen.core.I0.A0C(str, bArr[i4])) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            } else {
                                java.lang.String[] strArr7 = A0Y;
                                strArr7[7] = "WpBt";
                                strArr7[2] = "lWmW";
                                if (com.facebook.ads.redexgen.core.I0.A0C(str, bArr[i4])) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            }
                        } else {
                            z2 = false;
                        }
                        this.A0G = z2;
                        this.A04 += 5;
                        this.A06 += i3;
                    } else {
                        if (this.A0G) {
                            this.A0P.A0W(this.A05);
                            interfaceC0610By.readFully(this.A0P.A00, i6, this.A05);
                            c9.AFv(this.A0P, this.A05);
                            iAFu2 = this.A05;
                            int iA02 = com.facebook.ads.redexgen.core.I0.A02(this.A0P.A00, this.A0P.A07());
                            this.A0P.A0Y(A0A(686, 10, 63).equals(c0621Cj.A07.A0O) ? 1 : 0);
                            this.A0P.A0X(iA02);
                            com.facebook.ads.redexgen.core.G3.A03(jA00, this.A0P, this.A0H);
                        } else {
                            iAFu2 = c9.AFu(interfaceC0610By, this.A05, false);
                        }
                        this.A04 += iAFu2;
                        this.A05 -= iAFu2;
                        i4 = 4;
                        i5 = 1;
                        i6 = 0;
                    }
                }
            }
            z = c0623Cl.A0I[i7];
            c8 = null;
            i = z;
            if (c0623Cl.A0A) {
                int i8 = (z ? 1 : 0) | 1073741824;
                if (c0623Cl.A08 != null) {
                    c0622CkA00 = c0623Cl.A08;
                } else {
                    c0622CkA00 = c0621Cj.A00(c0623Cl.A07.A02);
                }
                c8 = c0622CkA00.A01;
                i = i8;
            }
            c9.AFw(jA00, i, this.A06, 0, c8);
            A0E(jA00);
            if (!this.A0D.A08()) {
                this.A0D = null;
            }
            this.A02 = 3;
            return true;
        }
        c0623Cl = this.A0D.A07;
        c0621Cj = this.A0D.A05;
        c9 = this.A0D.A06;
        int i9 = this.A0D.A01;
        jA00 = c0623Cl.A00(i9) * 1000;
        if (this.A0S != null) {
            jA00 = this.A0S.A06(jA00);
        }
        if (c0621Cj.A01 != 0) {
            while (this.A04 < this.A06) {
                iAFu = this.A04 + c9.AFu(interfaceC0610By, this.A06 - this.A04, false);
                strArr = A0Y;
                if (strArr[4].length() != strArr[3].length()) {
                    java.lang.String[] strArr8 = A0Y;
                    strArr8[0] = "1P85sOMrC7mCK5MksTIy5txI4uRDM7tn";
                    strArr8[6] = "xlzTK0ml8rlPwpKJ6n8uO0ndQxCezJLP";
                    this.A04 = iAFu;
                }
            }
        } else {
            bArr = this.A0Q.A00;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            i2 = c0621Cj.A01 + 1;
            i3 = 4 - c0621Cj.A01;
            while (this.A04 < this.A06) {
                if (this.A05 == 0) {
                    interfaceC0610By.readFully(bArr, i3, i2);
                    this.A0Q.A0Y(i6);
                    this.A05 = this.A0Q.A0H() - i5;
                    this.A0R.A0Y(i6);
                    c9.AFv(this.A0R, i4);
                    c9.AFv(this.A0Q, i5);
                    if (this.A0H.length > 0) {
                        str = c0621Cj.A07.A0O;
                        strArr2 = A0Y;
                        if (strArr2[0].charAt(25) != strArr2[6].charAt(25)) {
                            java.lang.String[] strArr9 = A0Y;
                            strArr9[7] = "X4NM";
                            strArr9[2] = "aVjU";
                            if (com.facebook.ads.redexgen.core.I0.A0C(str, bArr[i4])) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            java.lang.String[] strArr10 = A0Y;
                            strArr10[7] = "WpBt";
                            strArr10[2] = "lWmW";
                            if (com.facebook.ads.redexgen.core.I0.A0C(str, bArr[i4])) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        }
                    } else {
                        z2 = false;
                    }
                    this.A0G = z2;
                    this.A04 += 5;
                    this.A06 += i3;
                } else {
                    if (this.A0G) {
                        this.A0P.A0W(this.A05);
                        interfaceC0610By.readFully(this.A0P.A00, i6, this.A05);
                        c9.AFv(this.A0P, this.A05);
                        iAFu2 = this.A05;
                        int iA03 = com.facebook.ads.redexgen.core.I0.A02(this.A0P.A00, this.A0P.A07());
                        this.A0P.A0Y(A0A(686, 10, 63).equals(c0621Cj.A07.A0O) ? 1 : 0);
                        this.A0P.A0X(iA03);
                        com.facebook.ads.redexgen.core.G3.A03(jA00, this.A0P, this.A0H);
                    } else {
                        iAFu2 = c9.AFu(interfaceC0610By, this.A05, false);
                    }
                    this.A04 += iAFu2;
                    this.A05 -= iAFu2;
                    i4 = 4;
                    i5 = 1;
                    i6 = 0;
                }
            }
        }
        z = c0623Cl.A0I[i9];
        c8 = null;
        i = z;
        if (c0623Cl.A0A) {
            int i10 = (z ? 1 : 0) | 1073741824;
            if (c0623Cl.A08 != null) {
                c0622CkA00 = c0623Cl.A08;
            } else {
                c0622CkA00 = c0621Cj.A00(c0623Cl.A07.A02);
            }
            c8 = c0622CkA00.A01;
            i = i10;
        }
        c9.AFw(jA00, i, this.A06, 0, c8);
        A0E(jA00);
        if (!this.A0D.A08()) {
            this.A0D = null;
        }
        this.A02 = 3;
        return true;
        throw new java.lang.RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0609Bx
    public final void A9D(com.facebook.ads.redexgen.core.InterfaceC0611Bz interfaceC0611Bz) {
        this.A0C = interfaceC0611Bz;
        if (this.A0N != null) {
            com.facebook.ads.redexgen.core.C0612Ca c0612Ca = new com.facebook.ads.redexgen.core.C0612Ca(interfaceC0611Bz.AHA(0, this.A0N.A03));
            c0612Ca.A07(this.A0N, new com.facebook.ads.redexgen.core.CU(0, 0, 0, 0));
            this.A0K.put(0, c0612Ca);
            A0C();
            this.A0C.A5u();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0609Bx
    public final int AEk(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By, com.facebook.ads.redexgen.core.C4 c4) throws java.lang.InterruptedException, java.io.IOException {
        while (true) {
            switch (this.A02) {
                case 0:
                    if (!A0Y(interfaceC0610By)) {
                        return -1;
                    }
                    break;
                    break;
                case 1:
                    A0G(interfaceC0610By);
                    break;
                case 2:
                    A0H(interfaceC0610By);
                    break;
                default:
                    if (A0Z(interfaceC0610By)) {
                        return 0;
                    }
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0609Bx
    public final void AG7(long j, long j2) {
        int size = this.A0K.size();
        for (int i = 0; i < size; i++) {
            this.A0K.valueAt(i).A04();
        }
        this.A0U.clear();
        this.A03 = 0;
        this.A0A = j2;
        this.A0T.clear();
        A0B();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0609Bx
    public final boolean AGs(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By) throws java.lang.InterruptedException, java.io.IOException {
        return com.facebook.ads.redexgen.core.AbstractC0619Ch.A03(interfaceC0610By);
    }
}

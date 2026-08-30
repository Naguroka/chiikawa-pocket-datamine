package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class YQ implements com.facebook.ads.redexgen.core.InterfaceC0609Bx, com.facebook.ads.redexgen.core.C6 {
    public static byte[] A0J;
    public static java.lang.String[] A0K = {"wz4V52vnyaYzOzVosV2ggmqDE2de2aPD", "esit5oX7p0ewzuQ78yIb5IGBQ4Ll7QTy", "tMkVwszYh26uN0N48v", "KJWf5gllWosHtEG14Ww8x97Nig", "fJrikXC0LBawWnAwWRav5JxSrwLR9RG4", "RlENClTr9MFxo5IUenPz66cSFO", "MF3OfsQe3I", "XRSHK8nEMc6B"};
    public static final com.facebook.ads.redexgen.core.C0 A0L;
    public static final int A0M;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public com.facebook.ads.redexgen.core.InterfaceC0611Bz A09;
    public com.facebook.ads.redexgen.core.I4 A0A;
    public boolean A0B;
    public com.facebook.ads.redexgen.core.C0615Cd[] A0C;
    public long[][] A0D;
    public final int A0E;
    public final com.facebook.ads.redexgen.core.I4 A0F;
    public final com.facebook.ads.redexgen.core.I4 A0G;
    public final com.facebook.ads.redexgen.core.I4 A0H;
    public final java.util.ArrayDeque<com.facebook.ads.redexgen.core.YY> A0I;

    public static java.lang.String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0J, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 113);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A07() {
        A0J = new byte[]{-18, 33, 28, 26, -51, 32, 22, 39, 18, -51, 25, 18, 32, 32, -51, 33, 21, 14, 27, -51, 21, 18, 14, 17, 18, 31, -51, 25, 18, 27, 20, 33, 21, -51, -43, 34, 27, 32, 34, 29, 29, 28, 31, 33, 18, 17, -42, -37, -5, -2, -86, -86};
    }

    static {
        A07();
        A0L = new com.facebook.ads.redexgen.core.YR();
        A0M = com.facebook.ads.redexgen.core.IK.A08(A04(48, 4, 25));
    }

    public YQ() {
        this(0);
    }

    public YQ(int i) {
        this.A0E = i;
        this.A0F = new com.facebook.ads.redexgen.core.I4(16);
        this.A0I = new java.util.ArrayDeque<>();
        this.A0H = new com.facebook.ads.redexgen.core.I4(com.facebook.ads.redexgen.core.I0.A03);
        this.A0G = new com.facebook.ads.redexgen.core.I4(4);
        this.A06 = -1;
    }

    private int A00(long j) {
        long sampleAccumulatedBytes = Long.MAX_VALUE;
        int i = 1;
        int i2 = -1;
        long j2 = Long.MAX_VALUE;
        long j3 = Long.MAX_VALUE;
        int trackIndex = 1;
        int minAccumulatedBytesTrackIndex = -1;
        for (int i3 = 0; i3 < this.A0C.length; i3++) {
            com.facebook.ads.redexgen.core.C0615Cd c0615Cd = this.A0C[i3];
            int i4 = c0615Cd.A00;
            if (i4 != c0615Cd.A03.A01) {
                long j4 = c0615Cd.A03.A06[i4];
                long j5 = this.A0D[i3][i4];
                long j6 = j4 - j;
                int i5 = (j6 < 0 || j6 >= 262144) ? 1 : 0;
                if ((i5 == 0 && i != 0) || (i5 == i && j6 < sampleAccumulatedBytes)) {
                    i = i5;
                    sampleAccumulatedBytes = j6;
                    i2 = i3;
                    j2 = j5;
                }
                if (j5 < j3) {
                    j3 = j5;
                    trackIndex = i5;
                    minAccumulatedBytesTrackIndex = i3;
                }
            }
        }
        if (j3 == Long.MAX_VALUE || trackIndex == 0) {
            return i2;
        }
        if (A0K[0].charAt(24) != 'E') {
            throw new java.lang.RuntimeException();
        }
        A0K[6] = "tZzV2qNllM";
        if (j2 < 10485760 + j3) {
            return i2;
        }
        return minAccumulatedBytesTrackIndex;
    }

    private int A01(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By, com.facebook.ads.redexgen.core.C4 c4) throws java.lang.InterruptedException, java.io.IOException {
        int i;
        long jA86 = interfaceC0610By.A86();
        if (this.A06 == -1) {
            this.A06 = A00(jA86);
            if (this.A06 == -1) {
                return -1;
            }
        }
        com.facebook.ads.redexgen.core.C0615Cd c0615Cd = this.A0C[this.A06];
        com.facebook.ads.redexgen.core.C9 trackOutput = c0615Cd.A01;
        int i2 = c0615Cd.A00;
        long j = c0615Cd.A03.A06[i2];
        int sampleSize = c0615Cd.A03.A05[i2];
        long j2 = (j - jA86) + ((long) this.A04);
        if (j2 < 0 || j2 >= 262144) {
            c4.A00 = j;
            return 1;
        }
        if (c0615Cd.A02.A02 == 1) {
            j2 += 8;
            sampleSize -= 8;
        }
        interfaceC0610By.AGq((int) j2);
        if (c0615Cd.A02.A01 != 0) {
            byte[] bArr = this.A0G.A00;
            bArr[0] = 0;
            bArr[1] = 0;
            java.lang.String[] strArr = A0K;
            if (strArr[2].length() != strArr[7].length()) {
                A0K[0] = "vyve0RiE3dygV6rbXBv0klsLEJYuli0L";
                bArr[2] = 0;
                int i3 = c0615Cd.A02.A01;
                int i4 = 4 - c0615Cd.A02.A01;
                while (this.A04 < sampleSize) {
                    if (this.A05 == 0) {
                        interfaceC0610By.readFully(this.A0G.A00, i4, i3);
                        this.A0G.A0Y(0);
                        this.A05 = this.A0G.A0H();
                        this.A0H.A0Y(0);
                        trackOutput.AFv(this.A0H, 4);
                        this.A04 += 4;
                        sampleSize += i4;
                    } else {
                        int iAFu = trackOutput.AFu(interfaceC0610By, this.A05, false);
                        this.A04 += iAFu;
                        this.A05 -= iAFu;
                    }
                }
                i = 0;
            } else {
                throw new java.lang.RuntimeException();
            }
        } else {
            while (true) {
                int i5 = this.A04;
                java.lang.String[] strArr2 = A0K;
                if (strArr2[1].charAt(20) == strArr2[4].charAt(20)) {
                    A0K[6] = "5r7UGAoy7S";
                    if (i5 >= sampleSize) {
                        break;
                    }
                    int iAFu2 = trackOutput.AFu(interfaceC0610By, sampleSize - this.A04, false);
                    this.A04 += iAFu2;
                    this.A05 -= iAFu2;
                } else {
                    if (i5 >= sampleSize) {
                        break;
                    }
                    int iAFu3 = trackOutput.AFu(interfaceC0610By, sampleSize - this.A04, false);
                    this.A04 += iAFu3;
                    this.A05 -= iAFu3;
                }
            }
            i = 0;
        }
        trackOutput.AFw(c0615Cd.A03.A07[i2], c0615Cd.A03.A04[i2], sampleSize, 0, null);
        c0615Cd.A00++;
        this.A06 = -1;
        this.A04 = i;
        this.A05 = i;
        return i;
    }

    public static int A02(com.facebook.ads.redexgen.core.C0624Cm c0624Cm, long j) {
        int iA00 = c0624Cm.A00(j);
        if (iA00 == -1) {
            return c0624Cm.A01(j);
        }
        return iA00;
    }

    public static long A03(com.facebook.ads.redexgen.core.C0624Cm c0624Cm, long j, long j2) {
        int iA02 = A02(c0624Cm, j);
        if (iA02 == -1) {
            return j2;
        }
        return java.lang.Math.min(c0624Cm.A06[iA02], j2);
    }

    private java.util.ArrayList<com.facebook.ads.redexgen.core.C0624Cm> A05(com.facebook.ads.redexgen.core.YY yy, com.facebook.ads.redexgen.core.C1 c1, boolean z) throws com.facebook.ads.redexgen.core.A0 {
        com.facebook.ads.redexgen.core.C0621Cj c0621CjA0C;
        java.util.ArrayList<com.facebook.ads.redexgen.core.C0624Cm> arrayList = new java.util.ArrayList<>();
        for (int i = 0; i < yy.A01.size(); i++) {
            com.facebook.ads.redexgen.core.YY yy2 = yy.A01.get(i);
            int i2 = ((com.facebook.ads.redexgen.core.CO) yy2).A00;
            if (i2 == com.facebook.ads.redexgen.core.CO.A1L && (c0621CjA0C = com.facebook.ads.redexgen.core.CT.A0C(yy2, yy.A07(com.facebook.ads.redexgen.core.CO.A0n), androidx.media3.common.C.TIME_UNSET, null, z, this.A0B)) != null) {
                com.facebook.ads.redexgen.core.C0624Cm c0624CmA0E = com.facebook.ads.redexgen.core.CT.A0E(c0621CjA0C, yy2.A06(com.facebook.ads.redexgen.core.CO.A0d).A06(com.facebook.ads.redexgen.core.CO.A0h).A06(com.facebook.ads.redexgen.core.CO.A16), c1);
                if (c0624CmA0E.A01 != 0) {
                    arrayList.add(c0624CmA0E);
                }
            }
        }
        return arrayList;
    }

    private void A06() {
        this.A03 = 0;
        this.A00 = 0;
    }

    private void A08(long j) throws com.facebook.ads.redexgen.core.A0 {
        while (true) {
            java.util.ArrayDeque<com.facebook.ads.redexgen.core.YY> arrayDeque = this.A0I;
            java.lang.String[] strArr = A0K;
            if (strArr[2].length() == strArr[7].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0K;
            strArr2[3] = "94GrU73F5EyrcbNA6j51EfMGM9";
            strArr2[5] = "F9uNEWGJqPBROLdqhW4wSeNvu2";
            if (!arrayDeque.isEmpty() && this.A0I.peek().A00 == j) {
                com.facebook.ads.redexgen.core.YY yyPop = this.A0I.pop();
                if (((com.facebook.ads.redexgen.core.CO) yyPop).A00 == com.facebook.ads.redexgen.core.CO.A0j) {
                    A0A(yyPop);
                    this.A0I.clear();
                    this.A03 = 2;
                } else if (!this.A0I.isEmpty()) {
                    com.facebook.ads.redexgen.core.YY containerAtom = this.A0I.peek();
                    containerAtom.A08(yyPop);
                }
            } else {
                if (this.A03 != 2) {
                    A06();
                    return;
                }
                return;
            }
        }
    }

    private void A09(long j) {
        for (com.facebook.ads.redexgen.core.C0615Cd track : this.A0C) {
            com.facebook.ads.redexgen.core.C0624Cm c0624Cm = track.A03;
            int iA00 = c0624Cm.A00(j);
            if (iA00 == -1) {
                iA00 = c0624Cm.A01(j);
            }
            track.A00 = iA00;
        }
    }

    private void A0A(com.facebook.ads.redexgen.core.YY yy) throws com.facebook.ads.redexgen.core.A0 {
        java.util.ArrayList<com.facebook.ads.redexgen.core.C0624Cm> arrayListA05;
        int trackCount = -1;
        long jMax = androidx.media3.common.C.TIME_UNSET;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata metadataA0F = null;
        com.facebook.ads.redexgen.core.C1 c1 = new com.facebook.ads.redexgen.core.C1();
        com.facebook.ads.redexgen.core.YX yxA07 = yy.A07(com.facebook.ads.redexgen.core.CO.A1P);
        if (yxA07 != null && (metadataA0F = com.facebook.ads.redexgen.core.CT.A0F(yxA07, this.A0B)) != null) {
            c1.A05(metadataA0F);
        }
        try {
            arrayListA05 = A05(yy, c1, (this.A0E & 1) != 0);
        } catch (com.facebook.ads.redexgen.core.YU unused) {
            c1 = new com.facebook.ads.redexgen.core.C1();
            arrayListA05 = A05(yy, c1, true);
        }
        int size = arrayListA05.size();
        for (int i = 0; i < size; i++) {
            com.facebook.ads.redexgen.core.C0624Cm c0624Cm = arrayListA05.get(i);
            com.facebook.ads.redexgen.core.C0621Cj c0621Cj = c0624Cm.A03;
            com.facebook.ads.redexgen.core.C0615Cd c0615Cd = new com.facebook.ads.redexgen.core.C0615Cd(c0621Cj, c0624Cm, this.A09.AHA(i, c0621Cj.A03));
            com.facebook.ads.internal.exoplayer2.thirdparty.Format formatA0F = c0621Cj.A07.A0F(c0624Cm.A00 + 30);
            if (c0621Cj.A03 == 1) {
                if (c1.A03()) {
                    formatA0F = formatA0F.A0G(c1.A00, c1.A01);
                }
                if (metadataA0F != null) {
                    formatA0F = formatA0F.A0J(metadataA0F);
                }
            }
            c0615Cd.A01.A69(formatA0F);
            jMax = java.lang.Math.max(jMax, c0621Cj.A04 != androidx.media3.common.C.TIME_UNSET ? c0621Cj.A04 : c0624Cm.A02);
            if (c0621Cj.A03 == 2 && trackCount == -1) {
                trackCount = arrayList.size();
            }
            arrayList.add(c0615Cd);
        }
        this.A02 = trackCount;
        this.A08 = jMax;
        this.A0C = (com.facebook.ads.redexgen.core.C0615Cd[]) arrayList.toArray(new com.facebook.ads.redexgen.core.C0615Cd[arrayList.size()]);
        this.A0D = A0G(this.A0C);
        this.A09.A5u();
        this.A09.AG8(this);
    }

    public static boolean A0B(int i) {
        return i == com.facebook.ads.redexgen.core.CO.A0j || i == com.facebook.ads.redexgen.core.CO.A1L || i == com.facebook.ads.redexgen.core.CO.A0d || i == com.facebook.ads.redexgen.core.CO.A0h || i == com.facebook.ads.redexgen.core.CO.A16 || i == com.facebook.ads.redexgen.core.CO.A0N;
    }

    public static boolean A0C(int i) {
        if (i != com.facebook.ads.redexgen.core.CO.A0c && i != com.facebook.ads.redexgen.core.CO.A0n && i != com.facebook.ads.redexgen.core.CO.A0V && i != com.facebook.ads.redexgen.core.CO.A1A && i != com.facebook.ads.redexgen.core.CO.A1D && i != com.facebook.ads.redexgen.core.CO.A1B && i != com.facebook.ads.redexgen.core.CO.A0C && i != com.facebook.ads.redexgen.core.CO.A0O && i != com.facebook.ads.redexgen.core.CO.A19 && i != com.facebook.ads.redexgen.core.CO.A1C && i != com.facebook.ads.redexgen.core.CO.A1E && i != com.facebook.ads.redexgen.core.CO.A17 && i != com.facebook.ads.redexgen.core.CO.A0B) {
            int i2 = com.facebook.ads.redexgen.core.CO.A1J;
            java.lang.String[] strArr = A0K;
            if (strArr[1].charAt(20) != strArr[4].charAt(20)) {
                throw new java.lang.RuntimeException();
            }
            A0K[0] = "U3OZ2jnvkswrjx8Ur9vHK1X6EFaJhYJ7";
            if (i != i2 && i != com.facebook.ads.redexgen.core.CO.A0U && i != com.facebook.ads.redexgen.core.CO.A1P) {
                return false;
            }
        }
        return true;
    }

    private boolean A0D(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By) throws java.lang.InterruptedException, java.io.IOException {
        if (this.A00 == 0) {
            if (!interfaceC0610By.AEp(this.A0F.A00, 0, 8, true)) {
                return false;
            }
            this.A00 = 8;
            this.A0F.A0Y(0);
            this.A07 = this.A0F.A0M();
            this.A01 = this.A0F.A08();
        }
        if (this.A07 == 1) {
            interfaceC0610By.readFully(this.A0F.A00, 8, 8);
            int headerBytesRemaining = this.A00;
            this.A00 = headerBytesRemaining + 8;
            this.A07 = this.A0F.A0N();
        } else {
            long endPosition = this.A07;
            if (endPosition == 0) {
                long jA7g = interfaceC0610By.A7g();
                if (jA7g == -1 && !this.A0I.isEmpty()) {
                    jA7g = this.A0I.peek().A00;
                }
                if (jA7g != -1) {
                    long endPosition2 = interfaceC0610By.A86();
                    long j = jA7g - endPosition2;
                    int i = this.A00;
                    java.lang.String[] strArr = A0K;
                    if (strArr[1].charAt(20) != strArr[4].charAt(20)) {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr2 = A0K;
                    strArr2[1] = "dzRUDibdLgOz76mBe3Hd5q70FZ39yex3";
                    strArr2[4] = "PQflqNZiVauK8bXoCB0g54EgUoVKXKVc";
                    long endPosition3 = i;
                    this.A07 = j + endPosition3;
                }
            }
        }
        if (this.A07 >= this.A00) {
            if (A0B(this.A01)) {
                long jA86 = (interfaceC0610By.A86() + this.A07) - ((long) this.A00);
                this.A0I.push(new com.facebook.ads.redexgen.core.YY(this.A01, jA86));
                if (this.A07 == this.A00) {
                    A08(jA86);
                } else {
                    A06();
                }
            } else if (A0C(this.A01)) {
                com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(this.A00 == 8);
                com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(this.A07 <= 2147483647L);
                this.A0A = new com.facebook.ads.redexgen.core.I4((int) this.A07);
                java.lang.System.arraycopy(this.A0F.A00, 0, this.A0A.A00, 0, 8);
                this.A03 = 1;
            } else {
                this.A0A = null;
                this.A03 = 1;
            }
            return true;
        }
        throw new com.facebook.ads.redexgen.core.A0(A04(0, 48, 60));
    }

    private boolean A0E(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By, com.facebook.ads.redexgen.core.C4 c4) throws java.lang.InterruptedException, java.io.IOException {
        long j = this.A07 - ((long) this.A00);
        long jA86 = interfaceC0610By.A86() + j;
        boolean z = false;
        if (this.A0A != null) {
            interfaceC0610By.readFully(this.A0A.A00, this.A00, (int) j);
            if (this.A01 == com.facebook.ads.redexgen.core.CO.A0U) {
                this.A0B = A0F(this.A0A);
            } else {
                boolean zIsEmpty = this.A0I.isEmpty();
                java.lang.String[] strArr = A0K;
                if (strArr[1].charAt(20) != strArr[4].charAt(20)) {
                    throw new java.lang.RuntimeException();
                }
                A0K[6] = "JSMKdVw6fi";
                if (!zIsEmpty) {
                    this.A0I.peek().A09(new com.facebook.ads.redexgen.core.YX(this.A01, this.A0A));
                }
            }
        } else if (j < 262144) {
            interfaceC0610By.AGq((int) j);
        } else {
            c4.A00 = interfaceC0610By.A86() + j;
            z = true;
        }
        A08(jA86);
        return z && this.A03 != 2;
    }

    public static boolean A0F(com.facebook.ads.redexgen.core.I4 i4) {
        int iA08;
        int majorBrand;
        i4.A0Y(8);
        int iA09 = i4.A08();
        int majorBrand2 = A0M;
        if (iA09 == majorBrand2) {
            return true;
        }
        i4.A0Z(4);
        do {
            int iA04 = i4.A04();
            java.lang.String[] strArr = A0K;
            java.lang.String str = strArr[3];
            java.lang.String str2 = strArr[5];
            int length = str.length();
            int majorBrand3 = str2.length();
            if (length != majorBrand3) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0K;
            strArr2[2] = "ak31gwjiZ7lchhs8qU";
            strArr2[7] = "SN9Txq6J8sCX";
            if (iA04 > 0) {
                iA08 = i4.A08();
                majorBrand = A0M;
            } else {
                return false;
            }
        } while (iA08 != majorBrand);
        return true;
    }

    public static long[][] A0G(com.facebook.ads.redexgen.core.C0615Cd[] c0615CdArr) {
        long[][] jArr = new long[c0615CdArr.length][];
        int[] iArr = new int[c0615CdArr.length];
        long[] jArr2 = new long[c0615CdArr.length];
        boolean[] tracksFinished = new boolean[c0615CdArr.length];
        for (int i = 0; i < c0615CdArr.length; i++) {
            jArr[i] = new long[c0615CdArr[i].A03.A01];
            jArr2[i] = c0615CdArr[i].A03.A07[0];
        }
        long j = 0;
        int i2 = 0;
        while (i2 < c0615CdArr.length) {
            long j2 = Long.MAX_VALUE;
            int minTimeTrackIndex = -1;
            for (int i3 = 0; i3 < c0615CdArr.length; i3++) {
                if (!tracksFinished[i3]) {
                    long minTimeUs = jArr2[i3];
                    if (minTimeUs <= j2) {
                        minTimeTrackIndex = i3;
                        j2 = jArr2[i3];
                    }
                }
            }
            int i4 = iArr[minTimeTrackIndex];
            jArr[minTimeTrackIndex][i4] = j;
            j += (long) c0615CdArr[minTimeTrackIndex].A03.A05[i4];
            int i5 = i4 + 1;
            iArr[minTimeTrackIndex] = i5;
            if (i5 < jArr[minTimeTrackIndex].length) {
                jArr2[minTimeTrackIndex] = c0615CdArr[minTimeTrackIndex].A03.A07[i5];
            } else {
                tracksFinished[minTimeTrackIndex] = true;
                i2++;
            }
        }
        return jArr;
    }

    @Override // com.facebook.ads.redexgen.core.C6
    public final long A7F() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.core.C6
    public final com.facebook.ads.redexgen.core.C5 A8H(long j) {
        long secondTimeUs;
        long jA03;
        int sampleIndex;
        if (this.A0C.length == 0) {
            return new com.facebook.ads.redexgen.core.C5(com.facebook.ads.redexgen.core.C7.A04);
        }
        long j2 = androidx.media3.common.C.TIME_UNSET;
        long secondOffset = -1;
        int i = this.A02;
        if (A0K[6].length() == 10) {
            java.lang.String[] strArr = A0K;
            strArr[1] = "zNPStOwPeWMWlu6U4cps5UEx93ZdGJzU";
            strArr[4] = "1Oiw5RRZUeL0D5PfWcAG5DXe0fbn2IOb";
            if (i != -1) {
                com.facebook.ads.redexgen.core.C0624Cm c0624Cm = this.A0C[this.A02].A03;
                int iA02 = A02(c0624Cm, j);
                if (iA02 == -1) {
                    return new com.facebook.ads.redexgen.core.C5(com.facebook.ads.redexgen.core.C7.A04);
                }
                secondTimeUs = c0624Cm.A07[iA02];
                jA03 = c0624Cm.A06[iA02];
                if (secondTimeUs < j && iA02 < c0624Cm.A01 - 1 && (sampleIndex = c0624Cm.A01(j)) != -1 && sampleIndex != iA02) {
                    j2 = c0624Cm.A07[sampleIndex];
                    secondOffset = c0624Cm.A06[sampleIndex];
                }
            } else {
                secondTimeUs = j;
                jA03 = Long.MAX_VALUE;
            }
            for (int i2 = 0; i2 < this.A0C.length; i2++) {
                int i3 = this.A02;
                if (A0K[6].length() == 10) {
                    A0K[0] = "CBUdIpY9GLFYfu7LhTfnmGuFEDhohH6D";
                    if (i2 != i3) {
                        com.facebook.ads.redexgen.core.C0624Cm c0624Cm2 = this.A0C[i2].A03;
                        jA03 = A03(c0624Cm2, secondTimeUs, jA03);
                        if (j2 != androidx.media3.common.C.TIME_UNSET) {
                            secondOffset = A03(c0624Cm2, j2, secondOffset);
                        }
                    }
                }
            }
            com.facebook.ads.redexgen.core.C7 c7 = new com.facebook.ads.redexgen.core.C7(secondTimeUs, jA03);
            if (j2 == androidx.media3.common.C.TIME_UNSET) {
                return new com.facebook.ads.redexgen.core.C5(c7);
            }
            return new com.facebook.ads.redexgen.core.C5(c7, new com.facebook.ads.redexgen.core.C7(j2, secondOffset));
        }
        throw new java.lang.RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0609Bx
    public final void A9D(com.facebook.ads.redexgen.core.InterfaceC0611Bz interfaceC0611Bz) {
        this.A09 = interfaceC0611Bz;
    }

    @Override // com.facebook.ads.redexgen.core.C6
    public final boolean A9h() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0609Bx
    public final int AEk(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By, com.facebook.ads.redexgen.core.C4 c4) throws java.lang.InterruptedException, java.io.IOException {
        while (true) {
            switch (this.A03) {
                case 0:
                    if (!A0D(interfaceC0610By)) {
                        return -1;
                    }
                    break;
                    break;
                case 1:
                    if (A0E(interfaceC0610By, c4)) {
                        java.lang.String[] strArr = A0K;
                        if (strArr[2].length() == strArr[7].length()) {
                            throw new java.lang.RuntimeException();
                        }
                        A0K[6] = "Qacs7AJWJq";
                        return 1;
                    }
                    break;
                case 2:
                    return A01(interfaceC0610By, c4);
                default:
                    throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0609Bx
    public final void AG7(long j, long j2) {
        this.A0I.clear();
        this.A00 = 0;
        this.A06 = -1;
        this.A04 = 0;
        this.A05 = 0;
        if (j == 0) {
            A06();
        } else {
            if (this.A0C == null) {
                return;
            }
            A09(j2);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0609Bx
    public final boolean AGs(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By) throws java.lang.InterruptedException, java.io.IOException {
        return com.facebook.ads.redexgen.core.AbstractC0619Ch.A04(interfaceC0610By);
    }
}

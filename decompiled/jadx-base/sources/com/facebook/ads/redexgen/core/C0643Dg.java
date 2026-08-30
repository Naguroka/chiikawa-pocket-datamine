package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Dg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0643Dg implements com.facebook.ads.redexgen.core.XU, com.facebook.ads.redexgen.core.InterfaceC0611Bz, com.facebook.ads.redexgen.core.HB<com.facebook.ads.redexgen.core.XY>, com.facebook.ads.redexgen.core.HE, com.facebook.ads.redexgen.core.FF {
    public static byte[] A0c;
    public static java.lang.String[] A0d = {"peLU6GbomQp3KTDTEO6fFbGDd5YKfbx5", "7mT0mr2NYOE5sZhPJJhz2OZpyXxRGG9d", "UXLPIbz1b38T7IFge1hDzhsuoxMK7yBR", "gCShhPyLIj5hpfUfS", "XuIiTKqZqLFDSY9gTXO0Gx3LpXWUQlMf", "5IJgqt6", "EtcMKAz9SJVscvNDduv2RLMG0vWKtUvv", "0mgYyHLWy1r45Lytf"};
    public int A00;
    public int A01;
    public int A02;
    public long A04;
    public com.facebook.ads.redexgen.core.C6 A07;
    public com.facebook.ads.redexgen.core.XV A08;
    public com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean[] A0L;
    public boolean[] A0M;
    public boolean[] A0N;
    public final int A0O;
    public final long A0P;
    public final android.net.Uri A0Q;
    public final com.facebook.ads.redexgen.core.C0672Ep A0S;
    public final com.facebook.ads.redexgen.core.InterfaceC0673Eq A0T;
    public final com.facebook.ads.redexgen.core.F6 A0U;
    public final com.facebook.ads.redexgen.core.InterfaceC0716Gr A0V;
    public final com.facebook.ads.redexgen.core.InterfaceC0724Gz A0W;
    public final java.lang.String A0b;
    public final com.facebook.ads.redexgen.core.C1127Wv A0X = new com.facebook.ads.redexgen.core.C1127Wv(A07(0, 27, 38));
    public final com.facebook.ads.redexgen.core.C0736Hl A0Y = new com.facebook.ads.redexgen.core.C0736Hl();
    public final java.lang.Runnable A0Z = new com.facebook.ads.redexgen.core.En(this);
    public final java.lang.Runnable A0a = new com.facebook.ads.redexgen.core.Eo(this);
    public final android.os.Handler A0R = new android.os.Handler();
    public int[] A0J = new int[0];
    public com.facebook.ads.redexgen.core.XT[] A0K = new com.facebook.ads.redexgen.core.XT[0];
    public long A06 = androidx.media3.common.C.TIME_UNSET;
    public long A05 = -1;
    public long A03 = androidx.media3.common.C.TIME_UNSET;

    public static java.lang.String A07(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0c, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 116);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A0B() {
        A0c = new byte[]{30, kotlin.io.encoding.Base64.padSymbol, 51, 54, 55, 32, 104, 23, 42, 38, 32, 51, 49, 38, kotlin.io.encoding.Base64.padSymbol, 32, 31, 55, 54, 59, 51, 2, 55, 32, 59, kotlin.io.encoding.Base64.padSymbol, 54};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.XU
    public final long AGC(com.facebook.ads.redexgen.core.InterfaceC0710Gl[] interfaceC0710GlArr, boolean[] zArr, com.facebook.ads.redexgen.core.FG[] fgArr, boolean[] zArr2, long j) {
        int i;
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(this.A0F);
        int i2 = this.A01;
        int i3 = 0;
        while (true) {
            i = 0;
            if (i3 >= interfaceC0710GlArr.length) {
                break;
            }
            if (fgArr[i3] != null && (interfaceC0710GlArr[i3] == null || !zArr[i3])) {
                int i4 = ((com.facebook.ads.redexgen.core.XX) fgArr[i3]).A00;
                com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(this.A0L[i4]);
                this.A01--;
                this.A0L[i4] = false;
                fgArr[i3] = null;
            }
            i3++;
        }
        boolean z = !this.A0I ? j == 0 : i2 != 0;
        for (int i5 = 0; i5 < interfaceC0710GlArr.length; i5++) {
            if (fgArr[i5] == null && interfaceC0710GlArr[i5] != null) {
                com.facebook.ads.redexgen.core.InterfaceC0710Gl interfaceC0710Gl = interfaceC0710GlArr[i5];
                com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(interfaceC0710Gl.length() == 1);
                com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(interfaceC0710Gl.A7a(0) == 0);
                int iA00 = this.A09.A00(interfaceC0710Gl.A8Y());
                com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(!this.A0L[iA00]);
                this.A01++;
                this.A0L[iA00] = true;
                fgArr[i5] = new com.facebook.ads.redexgen.core.XX(this, iA00);
                zArr2[i5] = true;
                if (!z) {
                    com.facebook.ads.redexgen.core.XT xt = this.A0K[iA00];
                    xt.A0J();
                    z = xt.A0D(j, true, true) == -1 && xt.A0B() != 0;
                }
            }
        }
        if (this.A01 == 0) {
            this.A0E = false;
            this.A0D = false;
            if (this.A0X.A08()) {
                com.facebook.ads.redexgen.core.XT[] xtArr = this.A0K;
                int length = xtArr.length;
                while (i < length) {
                    xtArr[i].A0H();
                    i++;
                }
                this.A0X.A05();
            } else {
                com.facebook.ads.redexgen.core.XT[] xtArr2 = this.A0K;
                int length2 = xtArr2.length;
                while (i < length2) {
                    xtArr2[i].A0I();
                    i++;
                }
            }
        } else if (z) {
            j = AGB(j);
            for (int i6 = 0; i6 < fgArr.length; i6++) {
                if (fgArr[i6] != null) {
                    zArr2[i6] = true;
                }
            }
        }
        this.A0I = true;
        return j;
    }

    static {
        A0B();
    }

    public C0643Dg(android.net.Uri uri, com.facebook.ads.redexgen.core.InterfaceC0724Gz interfaceC0724Gz, com.facebook.ads.redexgen.core.InterfaceC0609Bx[] interfaceC0609BxArr, int i, com.facebook.ads.redexgen.core.F6 f6, com.facebook.ads.redexgen.core.InterfaceC0673Eq interfaceC0673Eq, com.facebook.ads.redexgen.core.InterfaceC0716Gr interfaceC0716Gr, java.lang.String str, int i2) {
        this.A0Q = uri;
        this.A0W = interfaceC0724Gz;
        this.A0O = i;
        this.A0U = f6;
        this.A0T = interfaceC0673Eq;
        this.A0V = interfaceC0716Gr;
        this.A0b = str;
        this.A0P = i2;
        this.A0S = new com.facebook.ads.redexgen.core.C0672Ep(interfaceC0609BxArr, this);
        this.A00 = i == -1 ? 3 : i;
        f6.A03();
    }

    private int A00() {
        int i = 0;
        for (com.facebook.ads.redexgen.core.XT xt : this.A0K) {
            int extractedSamplesCount = xt.A0C();
            i += extractedSamplesCount;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.HB
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final int ACT(com.facebook.ads.redexgen.core.XY xy, long j, long j2, java.io.IOException iOException) {
        boolean isErrorFatal = A0N(iOException);
        this.A0U.A0H(xy.A03, 1, -1, null, 0, null, xy.A02, this.A03, j, j2, xy.A00, iOException, isErrorFatal);
        A0E(xy);
        if (isErrorFatal) {
            return 3;
        }
        int iA00 = A00();
        boolean madeProgress = iA00 > this.A02;
        if (A0L(xy, iA00)) {
            return madeProgress ? 1 : 0;
        }
        return 2;
    }

    private long A02() {
        long jMax = Long.MIN_VALUE;
        for (com.facebook.ads.redexgen.core.XT xt : this.A0K) {
            long largestQueuedTimestampUs = xt.A0F();
            jMax = java.lang.Math.max(jMax, largestQueuedTimestampUs);
        }
        return jMax;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09() {
        if (this.A0G) {
            return;
        }
        boolean z = this.A0F;
        if (A0d[5].length() != 14) {
            A0d[1] = "ZlqthdC5a5V1gMLl5Bq31xGEZ23V1gO9";
            if (z || this.A07 == null || !this.A0H) {
                return;
            }
            for (com.facebook.ads.redexgen.core.XT xt : this.A0K) {
                if (xt.A0G() == null) {
                    return;
                }
            }
            this.A0Y.A01();
            int length = this.A0K.length;
            com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup[] trackGroupArr = new com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup[length];
            this.A0N = new boolean[length];
            this.A0L = new boolean[length];
            this.A0M = new boolean[length];
            this.A03 = this.A07.A7F();
            int i = 0;
            while (true) {
                boolean z2 = true;
                if (i < length) {
                    com.facebook.ads.internal.exoplayer2.thirdparty.Format formatA0G = this.A0K[i].A0G();
                    trackGroupArr[i] = new com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup(formatA0G);
                    java.lang.String str = formatA0G.A0O;
                    if (!com.facebook.ads.redexgen.core.AbstractC0748Hx.A0B(str)) {
                        boolean zA09 = com.facebook.ads.redexgen.core.AbstractC0748Hx.A09(str);
                        java.lang.String[] strArr = A0d;
                        java.lang.String str2 = strArr[2];
                        java.lang.String str3 = strArr[0];
                        int iCharAt = str2.charAt(13);
                        int trackCount = str3.charAt(13);
                        if (iCharAt != trackCount) {
                            A0d[5] = "wjlt";
                            if (!zA09) {
                                z2 = false;
                            }
                        }
                    }
                    this.A0N[i] = z2;
                    this.A0A |= z2;
                    i++;
                } else {
                    this.A09 = new com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray(trackGroupArr);
                    if (this.A0O == -1 && this.A05 == -1 && this.A07.A7F() == androidx.media3.common.C.TIME_UNSET) {
                        if (A0d[1].charAt(24) != 'Q') {
                            java.lang.String[] strArr2 = A0d;
                            strArr2[7] = "bvBqSLHYyRK7T41Ph";
                            strArr2[3] = "q1iL5o2Amc4Ds9Lvm";
                            this.A00 = 6;
                        } else {
                            A0d[5] = "4JTtgCqRPlniUROX";
                            this.A00 = 6;
                        }
                    }
                    this.A0F = true;
                    this.A0T.ADc(this.A03, this.A07.A9h());
                    this.A08.ADC(this);
                    return;
                }
            }
        }
        throw new java.lang.RuntimeException();
    }

    private void A0A() {
        com.facebook.ads.redexgen.core.XY xy = new com.facebook.ads.redexgen.core.XY(this, this.A0Q, this.A0W, this.A0S, this.A0Y);
        if (this.A0F) {
            com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(A0I());
            if (this.A03 != androidx.media3.common.C.TIME_UNSET) {
                long j = this.A06;
                long j2 = this.A03;
                if (A0d[5].length() == 14) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr = A0d;
                strArr[4] = "EEVowzvPGAuoS8G3kXEqEFrH8fWZZ317";
                strArr[6] = "VR26HTJrPSZGT1wLH8eUhUMOdoWDO7dv";
                if (j >= j2) {
                    this.A0B = true;
                    this.A06 = androidx.media3.common.C.TIME_UNSET;
                    return;
                }
            }
            xy.A04(this.A07.A8H(this.A06).A00.A00, this.A06);
            this.A06 = androidx.media3.common.C.TIME_UNSET;
        }
        this.A02 = A00();
        this.A0U.A0E(xy.A03, 1, -1, null, 0, null, xy.A02, this.A03, this.A0X.A04(xy, this, this.A00));
    }

    private void A0C(int i) {
        if (!this.A0M[i]) {
            com.facebook.ads.internal.exoplayer2.thirdparty.Format formatA01 = this.A09.A01(i).A01(0);
            this.A0U.A06(com.facebook.ads.redexgen.core.AbstractC0748Hx.A01(formatA01.A0O), formatA01, 0, null, this.A04);
            this.A0M[i] = true;
        }
    }

    private void A0D(int i) {
        if (!this.A0E || !this.A0N[i] || this.A0K[i].A0M()) {
            return;
        }
        this.A06 = 0L;
        this.A0E = false;
        this.A0D = true;
        this.A04 = 0L;
        this.A02 = 0;
        for (com.facebook.ads.redexgen.core.XT xt : this.A0K) {
            xt.A0I();
        }
        this.A08.ABd(this);
    }

    private void A0E(com.facebook.ads.redexgen.core.XY xy) {
        if (this.A05 != -1) {
            return;
        }
        this.A05 = xy.A01;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.HB
    /* JADX INFO: renamed from: A0F, reason: merged with bridge method [inline-methods] */
    public final void ACS(com.facebook.ads.redexgen.core.XY xy, long j, long j2) {
        long j3;
        if (this.A03 == androidx.media3.common.C.TIME_UNSET) {
            long jA02 = A02();
            if (jA02 == Long.MIN_VALUE) {
                j3 = 0;
            } else {
                j3 = 10000 + jA02;
            }
            this.A03 = j3;
            this.A0T.ADc(this.A03, this.A07.A9h());
        }
        this.A0U.A0G(xy.A03, 1, -1, null, 0, null, xy.A02, this.A03, j, j2, xy.A00);
        A0E(xy);
        this.A0B = true;
        this.A08.ABd(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.HB
    /* JADX INFO: renamed from: A0G, reason: merged with bridge method [inline-methods] */
    public final void ACQ(com.facebook.ads.redexgen.core.XY xy, long j, long j2, boolean z) {
        this.A0U.A0F(xy.A03, 1, -1, null, 0, null, xy.A02, this.A03, j, j2, xy.A00);
        if (!z) {
            A0E(xy);
            for (com.facebook.ads.redexgen.core.XT xt : this.A0K) {
                xt.A0I();
            }
            if (this.A01 > 0) {
                this.A08.ABd(this);
            }
        }
    }

    private boolean A0I() {
        return this.A06 != androidx.media3.common.C.TIME_UNSET;
    }

    private boolean A0J() {
        return this.A0D || A0I();
    }

    private boolean A0K(long j) {
        int length = this.A0K.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                return true;
            }
            com.facebook.ads.redexgen.core.XT xt = this.A0K[i];
            xt.A0J();
            int i2 = xt.A0D(j, true, false);
            if (!(i2 != -1) && (this.A0N[i] || !this.A0A)) {
                return false;
            }
            i++;
        }
    }

    private boolean A0L(com.facebook.ads.redexgen.core.XY xy, int i) {
        if (this.A05 != -1 || (this.A07 != null && this.A07.A7F() != androidx.media3.common.C.TIME_UNSET)) {
            this.A02 = i;
            if (A0d[5].length() != 14) {
                A0d[1] = "skDgVB0Ht0zuzgTIxTUQ6nUZxrKrp9x6";
                return true;
            }
        } else {
            if (this.A0F && !A0J()) {
                this.A0E = true;
                return false;
            }
            this.A0D = this.A0F;
            this.A04 = 0L;
            this.A02 = 0;
            for (com.facebook.ads.redexgen.core.XT xt : this.A0K) {
                xt.A0I();
                java.lang.String[] strArr = A0d;
                if (strArr[4].charAt(26) == strArr[6].charAt(26)) {
                    java.lang.String[] strArr2 = A0d;
                    strArr2[7] = "KZ8GDv2dcd7yDyxHm";
                    strArr2[3] = "atXiisDnWt347KW7D";
                }
            }
            xy.A04(0L, 0L);
            return true;
        }
        throw new java.lang.RuntimeException();
    }

    public static boolean A0N(java.io.IOException iOException) {
        return iOException instanceof com.facebook.ads.redexgen.core.XR;
    }

    public final int A0O(int i, long j) {
        int skipCount;
        if (A0J()) {
            return 0;
        }
        com.facebook.ads.redexgen.core.XT xt = this.A0K[i];
        if (this.A0B && j > xt.A0F()) {
            skipCount = xt.A0A();
        } else {
            skipCount = xt.A0D(j, true, true);
            if (skipCount == -1) {
                skipCount = 0;
            }
        }
        if (skipCount > 0) {
            A0C(i);
        } else {
            A0D(i);
        }
        return skipCount;
    }

    public final int A0P(int i, com.facebook.ads.redexgen.core.C05569u c05569u, com.facebook.ads.redexgen.core.C1177Yw c1177Yw, boolean z) {
        if (A0J()) {
            return -3;
        }
        com.facebook.ads.redexgen.core.XT xt = this.A0K[i];
        java.lang.String[] strArr = A0d;
        if (strArr[4].charAt(26) != strArr[6].charAt(26)) {
            throw new java.lang.RuntimeException();
        }
        A0d[1] = "CFUr7kPjUmptptxTmpAlPyDYAkhTIB3I";
        int iA0E = xt.A0E(c05569u, c1177Yw, z, this.A0B, this.A04);
        if (iA0E == -4) {
            A0C(i);
        } else if (iA0E == -3) {
            A0D(i);
        }
        return iA0E;
    }

    public final void A0Q() throws java.io.IOException {
        this.A0X.A06(this.A00);
    }

    public final void A0R() {
        if (this.A0F) {
            for (com.facebook.ads.redexgen.core.XT xt : this.A0K) {
                xt.A0H();
            }
        }
        this.A0X.A07(this);
        this.A0R.removeCallbacksAndMessages(null);
        this.A08 = null;
        this.A0G = true;
        this.A0U.A04();
    }

    public final boolean A0S(int i) {
        return !A0J() && (this.A0B || this.A0K[i].A0M());
    }

    @Override // com.facebook.ads.redexgen.core.XU
    public final boolean A4p(long j) {
        if (this.A0B || this.A0E) {
            return false;
        }
        if (this.A0F && this.A01 == 0) {
            return false;
        }
        boolean zA02 = this.A0Y.A02();
        boolean continuedLoading = this.A0X.A08();
        if (!continuedLoading) {
            A0A();
            return true;
        }
        return zA02;
    }

    @Override // com.facebook.ads.redexgen.core.XU
    public final void A5W(long j, boolean z) {
        int length = this.A0K.length;
        for (int i = 0; i < length; i++) {
            this.A0K[i].A0K(j, z, this.A0L[i]);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0611Bz
    public final void A5u() {
        this.A0H = true;
        this.A0R.post(this.A0Z);
    }

    @Override // com.facebook.ads.redexgen.core.XU
    public final long A6L(long j, com.facebook.ads.redexgen.core.AI ai) {
        if (!this.A07.A9h()) {
            return 0L;
        }
        com.facebook.ads.redexgen.core.C5 c5A8H = this.A07.A8H(j);
        return com.facebook.ads.redexgen.core.IK.A0I(j, ai, c5A8H.A00.A01, c5A8H.A01.A01);
    }

    @Override // com.facebook.ads.redexgen.core.XU
    public final long A6b() {
        long jA02;
        if (this.A0B) {
            return Long.MIN_VALUE;
        }
        if (A0I()) {
            return this.A06;
        }
        if (this.A0A) {
            jA02 = Long.MAX_VALUE;
            int i = this.A0K.length;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.A0N[i2]) {
                    jA02 = java.lang.Math.min(jA02, this.A0K[i2].A0F());
                }
            }
        } else {
            jA02 = A02();
        }
        if (jA02 == Long.MIN_VALUE) {
            return this.A04;
        }
        return jA02;
    }

    @Override // com.facebook.ads.redexgen.core.XU
    public final long A7s() {
        if (this.A01 == 0) {
            return Long.MIN_VALUE;
        }
        return A6b();
    }

    @Override // com.facebook.ads.redexgen.core.XU
    public final com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray A8Z() {
        return this.A09;
    }

    @Override // com.facebook.ads.redexgen.core.XU
    public final void AAn() throws java.io.IOException {
        A0Q();
    }

    @Override // com.facebook.ads.redexgen.core.HE
    public final void ACX() {
        for (com.facebook.ads.redexgen.core.XT xt : this.A0K) {
            xt.A0I();
        }
        this.A0S.A03();
    }

    @Override // com.facebook.ads.redexgen.core.FF
    public final void ADv(com.facebook.ads.internal.exoplayer2.thirdparty.Format format) {
        this.A0R.post(this.A0Z);
    }

    @Override // com.facebook.ads.redexgen.core.XU
    public final void AEX(com.facebook.ads.redexgen.core.XV xv, long j) {
        this.A08 = xv;
        this.A0Y.A02();
        A0A();
    }

    @Override // com.facebook.ads.redexgen.core.XU
    public final long AEo() {
        if (!this.A0C) {
            this.A0U.A05();
            this.A0C = true;
        }
        if (this.A0D) {
            if (!this.A0B && A00() <= this.A02) {
                return androidx.media3.common.C.TIME_UNSET;
            }
            java.lang.String[] strArr = A0d;
            if (strArr[2].charAt(13) == strArr[0].charAt(13)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0d;
            strArr2[4] = "8QQskbS2Pw4utxbEv0LyYmP5VjWpvONg";
            strArr2[6] = "uwG3ZIcw3rm7jy9KlanJYK16xJWMutQx";
            this.A0D = false;
            return this.A04;
        }
        return androidx.media3.common.C.TIME_UNSET;
    }

    @Override // com.facebook.ads.redexgen.core.XU
    public final void AEu(long j) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0611Bz
    public final void AG8(com.facebook.ads.redexgen.core.C6 c6) {
        this.A07 = c6;
        this.A0R.post(this.A0Z);
    }

    @Override // com.facebook.ads.redexgen.core.XU
    public final long AGB(long j) {
        if (!this.A07.A9h()) {
            j = 0;
        }
        this.A04 = j;
        this.A0D = false;
        if (!A0I() && A0K(j)) {
            return j;
        }
        this.A0E = false;
        this.A06 = j;
        this.A0B = false;
        if (this.A0X.A08()) {
            com.facebook.ads.redexgen.core.C1127Wv c1127Wv = this.A0X;
            if (A0d[5].length() == 14) {
                throw new java.lang.RuntimeException();
            }
            A0d[1] = "E7sj14dZL93fqj6GUgSTTa20SijXvEHd";
            c1127Wv.A05();
        } else {
            for (com.facebook.ads.redexgen.core.XT xt : this.A0K) {
                xt.A0I();
            }
        }
        return j;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0611Bz
    public final com.facebook.ads.redexgen.core.C9 AHA(int i, int i2) {
        int length = this.A0K.length;
        for (int i3 = 0; i3 < length; i3++) {
            int trackCount = this.A0J[i3];
            if (trackCount == i) {
                return this.A0K[i3];
            }
        }
        com.facebook.ads.redexgen.core.XT xt = new com.facebook.ads.redexgen.core.XT(this.A0V);
        xt.A0L(this);
        int trackCount2 = length + 1;
        this.A0J = java.util.Arrays.copyOf(this.A0J, trackCount2);
        this.A0J[length] = i;
        int trackCount3 = length + 1;
        this.A0K = (com.facebook.ads.redexgen.core.XT[]) java.util.Arrays.copyOf(this.A0K, trackCount3);
        this.A0K[length] = xt;
        return xt;
    }
}

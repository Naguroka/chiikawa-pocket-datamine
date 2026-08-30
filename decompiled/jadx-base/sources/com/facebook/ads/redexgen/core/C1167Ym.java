package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ym, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1167Ym implements com.facebook.ads.redexgen.core.InterfaceC0609Bx {
    public static byte[] A07;
    public static final com.facebook.ads.redexgen.core.C0 A08;
    public static final int A09;
    public static final byte[] A0A;
    public static final byte[] A0B;
    public static final int[] A0C;
    public static final int[] A0D;
    public int A00;
    public int A01;
    public long A02;
    public com.facebook.ads.redexgen.core.C9 A03;
    public boolean A04;
    public boolean A05;
    public final byte[] A06 = new byte[1];

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 48);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A05() {
        A07 = new byte[]{-64, 6, 18, 1, 13, 5, -64, 20, 25, 16, 5, -64, -60, -62, -30, -18, -13, -85, -117, -119, -87, -75, -70, -107, -65, -86, 114, 121, -91, -85, -94, -102, 86, -92, -91, -86, 86, -100, -97, -92, -102, 86, 119, -125, -120, 86, -98, -101, -105, -102, -101, -88, 100, -51, -16, -16, -23, -21, -27, -16, -92, -59, -47, -42, -92, -113, -76, -68, -89, -78, -81, -86, 102, -74, -89, -86, -86, -81, -76, -83, 102, -88, -81, -70, -71, 102, -84, -75, -72, 102, -84, -72, -89, -77, -85, 102, -82, -85, -89, -86, -85, -72, 102, -127, 117, -17, -38, -109, -89, -106, -101, -95, 97, 101, -103, -94, -94, -39, -19, -36, -31, -25, -89, -39, -27, -22, -91, -17, -38};
    }

    static {
        A05();
        A08 = new com.facebook.ads.redexgen.core.C1168Yn();
        A0C = new int[]{13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
        A0D = new int[]{18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        A0A = com.facebook.ads.redexgen.core.IK.A0i(A03(12, 6, 113));
        A0B = com.facebook.ads.redexgen.core.IK.A0i(A03(18, 9, 56));
        A09 = A0D[8];
    }

    private int A00(int i) throws com.facebook.ads.redexgen.core.A0 {
        if (A07(i)) {
            return this.A05 ? A0D[i] : A0C[i];
        }
        throw new com.facebook.ads.redexgen.core.A0(A03(53, 12, 84) + (this.A05 ? A03(105, 2, 104) : A03(103, 2, 3)) + A03(0, 12, 112) + i);
    }

    private int A01(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By) throws java.lang.InterruptedException, java.io.IOException {
        interfaceC0610By.AFq();
        interfaceC0610By.AEO(this.A06, 0, 1);
        byte b = this.A06[0];
        if ((b & 131) <= 0) {
            return A00((b >> 3) & 15);
        }
        throw new com.facebook.ads.redexgen.core.A0(A03(65, 38, 22) + ((int) b));
    }

    private int A02(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By) throws java.lang.InterruptedException, java.io.IOException {
        if (this.A00 == 0) {
            try {
                this.A01 = A01(interfaceC0610By);
                this.A00 = this.A01;
            } catch (java.io.EOFException unused) {
                return -1;
            }
        }
        int iAFu = this.A03.AFu(interfaceC0610By, this.A00, true);
        if (iAFu == -1) {
            return -1;
        }
        int bytesAppended = this.A00;
        this.A00 = bytesAppended - iAFu;
        int bytesAppended2 = this.A00;
        if (bytesAppended2 > 0) {
            return 0;
        }
        this.A03.AFw(this.A02, 1, this.A01, 0, null);
        this.A02 += 20000;
        return 0;
    }

    private void A04() {
        if (!this.A04) {
            this.A04 = true;
            this.A03.A69(com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(null, this.A05 ? A03(117, 12, 72) : A03(107, 10, 2), null, -1, A09, 1, this.A05 ? androidx.media3.extractor.AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND : 8000, -1, null, null, 0, null));
        }
    }

    private boolean A06(int i) {
        return !this.A05 && (i < 12 || i > 14);
    }

    private boolean A07(int i) {
        return i >= 0 && i <= 15 && (A08(i) || A06(i));
    }

    private boolean A08(int i) {
        return this.A05 && (i < 10 || i > 13);
    }

    private boolean A09(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By) throws java.lang.InterruptedException, java.io.IOException {
        if (A0A(interfaceC0610By, A0A)) {
            this.A05 = false;
            interfaceC0610By.AGq(A0A.length);
            return true;
        }
        if (!A0A(interfaceC0610By, A0B)) {
            return false;
        }
        this.A05 = true;
        interfaceC0610By.AGq(A0B.length);
        return true;
    }

    private boolean A0A(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By, byte[] bArr) throws java.lang.InterruptedException, java.io.IOException {
        interfaceC0610By.AFq();
        byte[] bArr2 = new byte[bArr.length];
        interfaceC0610By.AEO(bArr2, 0, bArr.length);
        return java.util.Arrays.equals(bArr2, bArr);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0609Bx
    public final void A9D(com.facebook.ads.redexgen.core.InterfaceC0611Bz interfaceC0611Bz) {
        interfaceC0611Bz.AG8(new com.facebook.ads.redexgen.core.C1169Yo(androidx.media3.common.C.TIME_UNSET));
        this.A03 = interfaceC0611Bz.AHA(0, 1);
        interfaceC0611Bz.A5u();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0609Bx
    public final int AEk(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By, com.facebook.ads.redexgen.core.C4 c4) throws java.lang.InterruptedException, java.io.IOException {
        if (interfaceC0610By.A86() != 0 || A09(interfaceC0610By)) {
            A04();
            return A02(interfaceC0610By);
        }
        throw new com.facebook.ads.redexgen.core.A0(A03(27, 26, 6));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0609Bx
    public final void AG7(long j, long j2) {
        this.A02 = 0L;
        this.A01 = 0;
        this.A00 = 0;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0609Bx
    public final boolean AGs(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By) throws java.lang.InterruptedException, java.io.IOException {
        return A09(interfaceC0610By);
    }
}

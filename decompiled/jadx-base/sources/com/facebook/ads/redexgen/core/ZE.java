package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ZE implements com.facebook.ads.redexgen.core.InterfaceC05589w {
    public static byte[] A0A;
    public int A00;
    public boolean A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final com.facebook.ads.redexgen.core.X7 A07;
    public final com.facebook.ads.redexgen.core.I8 A08;
    public final boolean A09;

    static {
        A02();
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 56);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A0A = new byte[]{-73, -6, -8, 5, 5, 6, 11, -73, -7, -4, -73, 3, -4, 10, 10, -73, 11, -1, -8, 5, -73, -44, -28, -9, -24, -24, -25, -12, -56, -15, -12, -46, -18, -29, -5, -28, -29, -27, -19, -61, -24, -10, -25, -12, -44, -25, -28, -9, -24, -24, -25, -12, -49, -11, -82, -63, -78, -78, -79, -66, -110, -69, -66, -100, -72, -83, -59, -82, -83, -81, -73, -103, -65, -1, -13, 10, -44, 7, -8, -8, -9, 4, -33, 5, -54, -58, -53, -97, -46, -61, -61, -62, -49, -86, -48};
    }

    public ZE() {
        this(new com.facebook.ads.redexgen.core.X7(true, 65536));
    }

    @java.lang.Deprecated
    public ZE(com.facebook.ads.redexgen.core.X7 x7) {
        this(x7, 15000, 50000, 2500, 5000, -1, true);
    }

    @java.lang.Deprecated
    public ZE(com.facebook.ads.redexgen.core.X7 x7, int i, int i2, int i3, int i4, int i5, boolean z) {
        this(x7, i, i2, i3, i4, i5, z, null);
    }

    @java.lang.Deprecated
    public ZE(com.facebook.ads.redexgen.core.X7 x7, int i, int i2, int i3, int i4, int i5, boolean z, com.facebook.ads.redexgen.core.I8 i8) {
        java.lang.String strA01 = A01(54, 19, 20);
        java.lang.String strA02 = A01(21, 1, 108);
        A03(i3, 0, strA01, strA02);
        java.lang.String strA03 = A01(22, 32, 74);
        A03(i4, 0, strA03, strA02);
        java.lang.String strA04 = A01(84, 11, 37);
        A03(i, i3, strA04, strA01);
        A03(i, i4, strA04, strA03);
        A03(i2, i, A01(73, 11, 90), strA04);
        this.A07 = x7;
        this.A06 = ((long) i) * 1000;
        this.A05 = ((long) i2) * 1000;
        this.A04 = ((long) i3) * 1000;
        this.A03 = ((long) i4) * 1000;
        this.A02 = i5;
        this.A09 = z;
        this.A08 = i8;
    }

    private final int A00(com.facebook.ads.redexgen.core.ZA[] zaArr, com.facebook.ads.redexgen.core.C0711Gm c0711Gm) {
        int iA01 = 0;
        for (int i = 0; i < targetBufferSize; i++) {
            if (c0711Gm.A00(i) != null) {
                int targetBufferSize = zaArr[i].A8a();
                iA01 += com.facebook.ads.redexgen.core.IK.A01(targetBufferSize);
            }
        }
        return iA01;
    }

    public static void A03(int i, int i2, java.lang.String str, java.lang.String str2) {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A05(i >= i2, str + A01(0, 21, 95) + str2);
    }

    private void A04(boolean z) {
        this.A00 = 0;
        if (this.A08 != null && this.A01) {
            this.A08.A03(0);
        }
        this.A01 = false;
        if (z) {
            this.A07.A03();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05589w
    public final com.facebook.ads.redexgen.core.X7 A6O() {
        return this.A07;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05589w
    public final long A6T() {
        return 0L;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05589w
    public final void ADK() {
        A04(true);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05589w
    public final void ADi() {
        A04(true);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05589w
    public final void ADq(com.facebook.ads.redexgen.core.ZA[] zaArr, com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray trackGroupArray, com.facebook.ads.redexgen.core.C0711Gm c0711Gm) {
        int iA00;
        if (this.A02 == -1) {
            iA00 = A00(zaArr, c0711Gm);
        } else {
            iA00 = this.A02;
        }
        this.A00 = iA00;
        this.A07.A04(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05589w
    public final boolean AFs() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05589w
    public final boolean AGi(long j, float f) {
        boolean z = true;
        boolean z2 = this.A07.A02() >= this.A00;
        boolean z3 = this.A01;
        long jMin = this.A06;
        if (f > 1.0f) {
            jMin = java.lang.Math.min(com.facebook.ads.redexgen.core.IK.A0C(jMin, f), this.A05);
        }
        if (j < jMin) {
            boolean targetBufferSizeReached = this.A09;
            if (!targetBufferSizeReached && z2) {
                z = false;
            }
            this.A01 = z;
        } else if (j > this.A05 || z2) {
            this.A01 = false;
        }
        if (this.A08 != null) {
            boolean targetBufferSizeReached2 = this.A01;
            if (targetBufferSizeReached2 != z3) {
                boolean targetBufferSizeReached3 = this.A01;
                if (targetBufferSizeReached3) {
                    this.A08.A00(0);
                } else {
                    this.A08.A03(0);
                }
            }
        }
        boolean targetBufferSizeReached4 = this.A01;
        return targetBufferSizeReached4;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05589w
    public final boolean AGl(long j, float f, boolean z) {
        long jA0D = com.facebook.ads.redexgen.core.IK.A0D(j, f);
        long j2 = z ? this.A03 : this.A04;
        return j2 <= 0 || jA0D >= j2 || (!this.A09 && this.A07.A02() >= this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05589w
    public final void onPrepared() {
        A04(false);
    }
}

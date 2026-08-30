package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class Y3 implements com.facebook.ads.redexgen.core.D3 {
    public static byte[] A0K;
    public static java.lang.String[] A0L = {"RqyisEW22tOH5WIwpLcKL6eizzPfHptP", "aWbVucXqEzF", "iKxD8M8y5MAaz8b2SAMSWT159g8OHUH3", "TuH5CDb2qjsE", "s34nIKvdrq7ET7tKswDGusZjyAaLjuPm", "K7N8ZxdsX0GfOkkhmxhFBcRrwBWcLVUE", "iYQWeW8FTV17FBUAK78FPjV3djOG5RRO", "5krJNILA4E2Buk7AxVT98maipICXfTro"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public long A09;
    public long A0A;
    public long A0B;
    public com.facebook.ads.internal.exoplayer2.thirdparty.Format A0C;
    public com.facebook.ads.redexgen.core.C9 A0D;
    public java.lang.String A0E;
    public boolean A0F;
    public boolean A0G;
    public final java.lang.String A0J;
    public final com.facebook.ads.redexgen.core.I4 A0I = new com.facebook.ads.redexgen.core.I4(1024);
    public final com.facebook.ads.redexgen.core.I3 A0H = new com.facebook.ads.redexgen.core.I3(this.A0I.A00);

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0K, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 23);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A04() {
        A0K = new byte[]{-49, -29, -46, -41, -35, -99, -37, -34, -94, -49, -101, -38, -49, -30, -37};
    }

    static {
        A04();
    }

    public Y3(java.lang.String str) {
        this.A0J = str;
    }

    private int A00(com.facebook.ads.redexgen.core.I3 i3) throws com.facebook.ads.redexgen.core.A0 {
        int iA01 = i3.A01();
        android.util.Pair<java.lang.Integer, java.lang.Integer> config = com.facebook.ads.redexgen.core.AbstractC0734Hj.A02(i3, true);
        int bitsLeft = ((java.lang.Integer) config.first).intValue();
        this.A05 = bitsLeft;
        int bitsLeft2 = ((java.lang.Integer) config.second).intValue();
        this.A02 = bitsLeft2;
        int bitsLeft3 = i3.A01();
        return iA01 - bitsLeft3;
    }

    private int A01(com.facebook.ads.redexgen.core.I3 i3) throws com.facebook.ads.redexgen.core.A0 {
        int tmp;
        int i = 0;
        int muxSlotLengthBytes = this.A03;
        if (muxSlotLengthBytes == 0) {
            do {
                tmp = i3.A04(8);
                i += tmp;
            } while (tmp == 255);
            return i;
        }
        throw new com.facebook.ads.redexgen.core.A0();
    }

    public static long A02(com.facebook.ads.redexgen.core.I3 i3) {
        int bytesForValue = i3.A04(2);
        return i3.A04((bytesForValue + 1) * 8);
    }

    private void A05(int i) {
        this.A0I.A0W(i);
        this.A0H.A0B(this.A0I.A00);
    }

    private void A06(com.facebook.ads.redexgen.core.I3 i3) throws com.facebook.ads.redexgen.core.A0 {
        boolean useSameStreamMux = i3.A0F();
        if (!useSameStreamMux) {
            this.A0G = true;
            A08(i3);
        } else {
            boolean useSameStreamMux2 = this.A0G;
            if (!useSameStreamMux2) {
                return;
            }
        }
        if (this.A00 == 0) {
            int i = this.A04;
            java.lang.String[] strArr = A0L;
            if (strArr[0].charAt(28) != strArr[2].charAt(28)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0L;
            strArr2[7] = "5agqEDFlcrjfgZa47a0m768slUOnSwnc";
            strArr2[4] = "HPz04SumpQj2HPS1bXRSXZkhjq4PVell";
            if (i == 0) {
                A09(i3, A01(i3));
                boolean useSameStreamMux3 = this.A0F;
                if (useSameStreamMux3) {
                    i3.A08((int) this.A09);
                    return;
                }
                return;
            }
            throw new com.facebook.ads.redexgen.core.A0();
        }
        throw new com.facebook.ads.redexgen.core.A0();
    }

    private void A07(com.facebook.ads.redexgen.core.I3 i3) {
        this.A03 = i3.A04(3);
        switch (this.A03) {
            case 0:
                i3.A08(8);
                return;
            case 1:
                java.lang.String[] strArr = A0L;
                if (strArr[0].charAt(28) != strArr[2].charAt(28)) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr2 = A0L;
                strArr2[7] = "9sfVtz2FpDydaHWrlogrDKKIrHPvjr2l";
                strArr2[4] = "X5kEpJqi8JZRJu1shaH14KWcrCapjbop";
                i3.A08(9);
                return;
            case 2:
            default:
                return;
            case 3:
            case 4:
            case 5:
                i3.A08(6);
                return;
            case 6:
            case 7:
                i3.A08(1);
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0079  */
    /* JADX WARN: Code duplicated, block: B:22:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:37:0x010b  */
    private void A08(com.facebook.ads.redexgen.core.I3 i3) throws com.facebook.ads.redexgen.core.A0 {
        boolean zA0F;
        com.facebook.ads.internal.exoplayer2.thirdparty.Format formatA07;
        int iA04 = i3.A04(1);
        this.A00 = iA04 == 1 ? i3.A04(1) : 0;
        if (this.A00 == 0) {
            if (iA04 == 1) {
                A02(i3);
            }
            boolean zA0F2 = i3.A0F();
            java.lang.String[] strArr = A0L;
            if (strArr[3].length() == strArr[1].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0L;
            strArr2[5] = "YM9tMTEAABKLgCh00OZxAOOXLNMUsZbW";
            strArr2[6] = "rVxwbgtiZyL8ee8TQ5F6E3K07P5G4M5u";
            if (zA0F2) {
                this.A04 = i3.A04(6);
                int iA05 = i3.A04(4);
                int iA06 = i3.A04(3);
                if (iA05 == 0 && iA06 == 0) {
                    java.lang.String[] strArr3 = A0L;
                    if (strArr3[0].charAt(28) != strArr3[2].charAt(28)) {
                        java.lang.String[] strArr4 = A0L;
                        strArr4[0] = "9pOSu5Z9F6ZPH8juPAYW8YgmjA02H8Ho";
                        strArr4[2] = "9sgz8F0VXKS0fqcGD1XDXpqO5HcLHP29";
                        if (iA04 == 0) {
                            int iA03 = i3.A03();
                            int iA00 = A00(i3);
                            i3.A07(iA03);
                            byte[] bArr = new byte[(iA00 + 7) / 8];
                            i3.A0D(bArr, 0, iA00);
                            formatA07 = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A07(this.A0E, A03(0, 15, 87), null, -1, -1, this.A02, this.A05, java.util.Collections.singletonList(bArr), null, 0, this.A0J);
                            if (!formatA07.equals(this.A0C)) {
                                this.A0C = formatA07;
                                this.A0A = 1024000000 / ((long) formatA07.A0C);
                                this.A0D.A69(formatA07);
                            }
                        } else {
                            i3.A08(((int) A02(i3)) - A00(i3));
                        }
                    } else {
                        java.lang.String[] strArr5 = A0L;
                        strArr5[3] = "TcDnSfmQhmz9";
                        strArr5[1] = "EmneVC4uyez";
                        if (iA04 == 0) {
                            int iA07 = i3.A03();
                            int iA01 = A00(i3);
                            i3.A07(iA07);
                            byte[] bArr2 = new byte[(iA01 + 7) / 8];
                            i3.A0D(bArr2, 0, iA01);
                            formatA07 = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A07(this.A0E, A03(0, 15, 87), null, -1, -1, this.A02, this.A05, java.util.Collections.singletonList(bArr2), null, 0, this.A0J);
                            if (!formatA07.equals(this.A0C)) {
                                this.A0C = formatA07;
                                this.A0A = 1024000000 / ((long) formatA07.A0C);
                                this.A0D.A69(formatA07);
                            }
                        } else {
                            i3.A08(((int) A02(i3)) - A00(i3));
                        }
                    }
                    A07(i3);
                    this.A0F = i3.A0F();
                    this.A09 = 0L;
                    if (this.A0F) {
                        if (iA04 == 1) {
                            this.A09 = A02(i3);
                        } else {
                            do {
                                zA0F = i3.A0F();
                                this.A09 = (this.A09 << 8) + ((long) i3.A04(8));
                            } while (zA0F);
                        }
                    }
                    if (i3.A0F()) {
                        i3.A08(8);
                        return;
                    }
                    return;
                }
                throw new com.facebook.ads.redexgen.core.A0();
            }
            throw new com.facebook.ads.redexgen.core.A0();
        }
        throw new com.facebook.ads.redexgen.core.A0();
    }

    private void A09(com.facebook.ads.redexgen.core.I3 i3, int i) {
        int iA03 = i3.A03();
        int bitPosition = iA03 & 7;
        if (bitPosition == 0) {
            int bitPosition2 = iA03 >> 3;
            this.A0I.A0Y(bitPosition2);
        } else {
            int bitPosition3 = i * 8;
            i3.A0D(this.A0I.A00, 0, bitPosition3);
            this.A0I.A0Y(0);
        }
        this.A0D.AFv(this.A0I, i);
        this.A0D.AFw(this.A0B, 1, i, 0, null);
        this.A0B += this.A0A;
    }

    @Override // com.facebook.ads.redexgen.core.D3
    public final void A4n(com.facebook.ads.redexgen.core.I4 i4) throws com.facebook.ads.redexgen.core.A0 {
        while (i4.A04() > 0) {
            switch (this.A08) {
                case 0:
                    int secondByte = i4.A0E();
                    if (secondByte == 86) {
                        this.A08 = 1;
                    }
                    break;
                case 1:
                    int iA0E = i4.A0E();
                    java.lang.String[] strArr = A0L;
                    if (strArr[7].charAt(1) != strArr[4].charAt(1)) {
                        java.lang.String[] strArr2 = A0L;
                        strArr2[0] = "J0S9aENUsBhGT6TWdEBcSEOx1TOmHbNB";
                        strArr2[2] = "4xwluMQF6ZjkgEcs6bHTORxMqrw3HBm1";
                        if ((iA0E & 224) == 224) {
                            this.A07 = iA0E;
                            this.A08 = 2;
                        } else if (iA0E != 86) {
                            this.A08 = 0;
                        }
                    } else {
                        throw new java.lang.RuntimeException();
                    }
                    break;
                case 2:
                    int bytesToRead = this.A07;
                    this.A06 = ((bytesToRead & (-225)) << 8) | i4.A0E();
                    if (this.A06 > this.A0I.A00.length) {
                        A05(this.A06);
                    }
                    this.A01 = 0;
                    this.A08 = 3;
                    break;
                case 3:
                    int iMin = java.lang.Math.min(i4.A04(), this.A06 - this.A01);
                    byte[] bArr = this.A0H.A00;
                    int bytesToRead2 = this.A01;
                    i4.A0c(bArr, bytesToRead2, iMin);
                    int bytesToRead3 = this.A01;
                    this.A01 = bytesToRead3 + iMin;
                    int i = this.A01;
                    int bytesToRead4 = this.A06;
                    if (i == bytesToRead4) {
                        this.A0H.A07(0);
                        A06(this.A0H);
                        this.A08 = 0;
                    }
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.D3
    public final void A5B(com.facebook.ads.redexgen.core.InterfaceC0611Bz interfaceC0611Bz, com.facebook.ads.redexgen.core.DH dh) {
        dh.A05();
        this.A0D = interfaceC0611Bz.AHA(dh.A03(), 1);
        this.A0E = dh.A04();
    }

    @Override // com.facebook.ads.redexgen.core.D3
    public final void AEL() {
    }

    @Override // com.facebook.ads.redexgen.core.D3
    public final void AEM(long j, boolean z) {
        this.A0B = j;
    }

    @Override // com.facebook.ads.redexgen.core.D3
    public final void AG6() {
        this.A08 = 0;
        this.A0G = false;
    }
}

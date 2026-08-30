package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class YO implements com.facebook.ads.redexgen.core.InterfaceC0628Cq {
    public static byte[] A0C;
    public static java.lang.String[] A0D = {"M6vrv0lPEulBwKqIn2oLppwSAAexYQcr", "X6z94pEoRYhvrmzLz15NCZNPiV1DGayg", "F6R2l19lbUGnqlkRAWY8nlBn3LzcSNMm", "JqMGE07PKcarQTYJfMVlvgbSgBzQwdvf", "cRwG0", "Hdv6CWBxyQva7HVZ3vsBwW", "jFaf4HwpniU", "dgl0k2wZZNfglCqQP4SbAA"};
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public final long A08;
    public final long A09;
    public final com.facebook.ads.redexgen.core.C0627Cp A0A = new com.facebook.ads.redexgen.core.C0627Cp();
    public final com.facebook.ads.redexgen.core.AbstractC0631Ct A0B;

    public static java.lang.String A09(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0C, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A0D[2].charAt(29) == 'C') {
                throw new java.lang.RuntimeException();
            }
            A0D[6] = "9Sh3q5vdw8d";
            if (i4 >= length) {
                return new java.lang.String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 103);
            i4++;
        }
    }

    public static void A0A() {
        A0C = new byte[]{-10, 23, -56, 23, 15, 15, -56, 24, 9, 15, 13, -56, 11, 9, 22, -56, 10, 13, -56, 14, 23, 29, 22, 12, -42};
    }

    static {
        A0A();
    }

    public YO(long j, long j2, com.facebook.ads.redexgen.core.AbstractC0631Ct abstractC0631Ct, int i, long j3) {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A03(j >= 0 && j2 > j);
        this.A0B = abstractC0631Ct;
        this.A09 = j;
        this.A08 = j2;
        if (i == j2 - j) {
            this.A07 = j3;
            this.A00 = 3;
        } else {
            this.A00 = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A00(long j, long j2, long j3) {
        long j4 = j + ((((this.A08 - this.A09) * j2) / this.A07) - j3);
        if (j4 < this.A09) {
            j4 = this.A09;
        }
        if (j4 >= this.A08) {
            return this.A08 - 1;
        }
        return j4;
    }

    private final long A01(long j, com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By) throws java.lang.InterruptedException, java.io.IOException {
        if (this.A04 == this.A01) {
            return -(this.A05 + 2);
        }
        long jA86 = interfaceC0610By.A86();
        if (!A0D(interfaceC0610By, this.A01)) {
            if (this.A04 != jA86) {
                return this.A04;
            }
            throw new java.io.IOException(A09(0, 25, 65));
        }
        this.A0A.A03(interfaceC0610By, false);
        interfaceC0610By.AFq();
        long j2 = j - this.A0A.A05;
        int i = this.A0A.A01 + this.A0A.A00;
        if (j2 >= 0 && j2 <= 72000) {
            interfaceC0610By.AGq(i);
            return -(this.A0A.A05 + 2);
        }
        if (j2 >= 0) {
            this.A04 = interfaceC0610By.A86() + ((long) i);
            this.A05 = this.A0A.A05;
            if ((this.A01 - this.A04) + ((long) i) < androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US) {
                interfaceC0610By.AGq(i);
                long initialPosition = this.A05;
                return -(initialPosition + 2);
            }
        } else {
            this.A01 = jA86;
            java.lang.String[] strArr = A0D;
            if (strArr[7].length() != strArr[5].length()) {
                throw new java.lang.RuntimeException();
            }
            A0D[2] = "ATYd0uYOxaasgtMR93yDbR3KTZDZgUML";
            this.A02 = this.A0A.A05;
        }
        if (this.A01 - this.A04 < androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US) {
            this.A01 = this.A04;
            return this.A04;
        }
        long j3 = i;
        long j4 = j2 > 0 ? 1L : 2L;
        long granuleDistance = interfaceC0610By.A86();
        return java.lang.Math.min(java.lang.Math.max((granuleDistance - (j3 * j4)) + (((this.A01 - this.A04) * j2) / (this.A02 - this.A05)), this.A04), this.A01 - 1);
    }

    private final long A02(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By) throws java.lang.InterruptedException, java.io.IOException {
        A0C(interfaceC0610By);
        this.A0A.A02();
        while ((this.A0A.A04 & 4) != 4 && interfaceC0610By.A86() < this.A08) {
            this.A0A.A03(interfaceC0610By, false);
            interfaceC0610By.AGq(this.A0A.A01 + this.A0A.A00);
        }
        return this.A0A.A05;
    }

    private final long A03(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By, long j, long j2) throws java.lang.InterruptedException, java.io.IOException {
        this.A0A.A03(interfaceC0610By, false);
        while (true) {
            long j3 = this.A0A.A05;
            java.lang.String[] strArr = A0D;
            if (strArr[3].charAt(10) == strArr[1].charAt(10)) {
                throw new java.lang.RuntimeException();
            }
            A0D[2] = "U3Kz5F0VQIVI1IcDcrvJUmEEvpKOlzXJ";
            if (j3 < j) {
                interfaceC0610By.AGq(this.A0A.A01 + this.A0A.A00);
                j2 = this.A0A.A05;
                this.A0A.A03(interfaceC0610By, false);
            } else {
                interfaceC0610By.AFq();
                return j2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.InterfaceC0628Cq
    /* JADX INFO: renamed from: A07, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.redexgen.core.YP A58() {
        com.facebook.ads.redexgen.core.C0625Cn c0625Cn = null;
        if (this.A07 != 0) {
            return new com.facebook.ads.redexgen.core.YP(this);
        }
        return null;
    }

    private final void A0B() {
        this.A04 = this.A09;
        this.A01 = this.A08;
        this.A05 = 0L;
        this.A02 = this.A07;
    }

    private final void A0C(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By) throws java.lang.InterruptedException, java.io.IOException {
        if (A0D(interfaceC0610By, this.A08)) {
        } else {
            throw new java.io.EOFException();
        }
    }

    private final boolean A0D(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By, long j) throws java.lang.InterruptedException, java.io.IOException {
        long jMin = java.lang.Math.min(3 + j, this.A08);
        byte[] bArr = new byte[2048];
        int i = bArr.length;
        while (true) {
            if (interfaceC0610By.A86() + ((long) i) > jMin && (i = (int) (jMin - interfaceC0610By.A86())) < 4) {
                return false;
            }
            interfaceC0610By.AEP(bArr, 0, i, false);
            for (int i2 = 0; i2 < i - 3; i2++) {
                int peekLength = bArr[i2];
                if (peekLength == 79 && bArr[i2 + 1] == 103 && bArr[i2 + 2] == 103) {
                    int peekLength2 = bArr[i2 + 3];
                    if (peekLength2 == 83) {
                        interfaceC0610By.AGq(i2);
                        return true;
                    }
                }
            }
            interfaceC0610By.AGq(i - 3);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0628Cq
    public final long AEl(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By) throws java.lang.InterruptedException, java.io.IOException {
        long jA03;
        switch (this.A00) {
            case 0:
                this.A03 = interfaceC0610By.A86();
                this.A00 = 1;
                long j = this.A08 - 65307;
                if (j > this.A03) {
                    return j;
                }
                break;
            case 1:
                break;
            case 2:
                if (this.A06 == 0) {
                    jA03 = 0;
                } else {
                    long jA01 = A01(this.A06, interfaceC0610By);
                    if (jA01 >= 0) {
                        return jA01;
                    }
                    jA03 = A03(interfaceC0610By, this.A06, -(jA01 + 2));
                }
                this.A00 = 3;
                long currentGranule = 2 + jA03;
                return -currentGranule;
            case 3:
                return -1L;
            default:
                throw new java.lang.IllegalStateException();
        }
        this.A07 = A02(interfaceC0610By);
        this.A00 = 3;
        return this.A03;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    @Override // com.facebook.ads.redexgen.core.InterfaceC0628Cq
    public final long AGy(long j) {
        boolean z;
        if (this.A00 != 3) {
            int i = this.A00;
            if (A0D[4].length() == 16) {
                throw new java.lang.RuntimeException();
            }
            A0D[4] = "RpDPvXNkHrQ5YzzwgtOUV1eKAXch";
            if (i == 2) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A03(z);
        long jA04 = 0;
        if (j != 0) {
            jA04 = this.A0B.A04(j);
        }
        this.A06 = jA04;
        this.A00 = 2;
        A0B();
        return this.A06;
    }
}

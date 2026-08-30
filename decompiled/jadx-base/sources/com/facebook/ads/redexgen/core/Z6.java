package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class Z6 implements com.facebook.ads.redexgen.core.InterfaceC0568Ag {
    public static java.lang.String[] A08 = {"DqzHGffDcmflJqigjgSPz5Ih3LuvN1vm", "GNv6Ae", "LelNVzb768HYU8MfXJtnH9MoMCR0fTwa", "KnBzaomJ4wFvZeITctRDF8tBR6fO5AM8", "2u9otpZXCk16Szcxzo3RgVsB8eWIqp2Q", "EbIk1BCgQ5uw3o5TzCMO1ZXZATNxIl6G", "RIc4tTFixsMvKq90zInLLBFrOnvIp26L", "v8gNFDmzDFQ65UlksIc5Du22tyA8sdnr"};
    public boolean A04;
    public boolean A05;
    public int[] A06;
    public int[] A07;
    public java.nio.ByteBuffer A02 = com.facebook.ads.redexgen.core.InterfaceC0568Ag.A00;
    public java.nio.ByteBuffer A03 = com.facebook.ads.redexgen.core.InterfaceC0568Ag.A00;
    public int A00 = -1;
    public int A01 = -1;

    public final void A00(int[] iArr) {
        this.A07 = iArr;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0568Ag
    public final boolean A4m(int i, int i2, int i3) throws com.facebook.ads.redexgen.core.C0567Af {
        boolean z = !java.util.Arrays.equals(this.A07, this.A06);
        this.A06 = this.A07;
        if (this.A06 == null) {
            this.A04 = false;
            return z;
        }
        if (i3 == 2) {
            if (!z && this.A01 == i && this.A00 == i2) {
                return false;
            }
            this.A01 = i;
            this.A00 = i2;
            boolean outputChannelsChanged = i2 != this.A06.length;
            this.A04 = outputChannelsChanged;
            int i4 = 0;
            while (true) {
                int length = this.A06.length;
                java.lang.String[] strArr = A08;
                if (strArr[0].charAt(13) != strArr[6].charAt(13)) {
                    throw new java.lang.RuntimeException();
                }
                A08[1] = "576vmg";
                if (i4 >= length) {
                    return true;
                }
                int i5 = this.A06[i4];
                if (i5 < i2) {
                    boolean z2 = this.A04;
                    boolean outputChannelsChanged2 = i5 != i4;
                    this.A04 = z2 | outputChannelsChanged2;
                    i4++;
                } else {
                    throw new com.facebook.ads.redexgen.core.C0567Af(i, i2, i3);
                }
            }
        } else {
            throw new com.facebook.ads.redexgen.core.C0567Af(i, i2, i3);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0568Ag
    public final java.nio.ByteBuffer A7u() {
        java.nio.ByteBuffer byteBuffer = this.A03;
        java.nio.ByteBuffer outputBuffer = com.facebook.ads.redexgen.core.InterfaceC0568Ag.A00;
        this.A03 = outputBuffer;
        return byteBuffer;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0568Ag
    public final int A7v() {
        if (this.A06 == null) {
            return this.A00;
        }
        int[] iArr = this.A06;
        if (A08[4].charAt(2) != '9') {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A08;
        strArr[7] = "4sakcIsy6w2uz0nPxriWxgex69qzPMi1";
        strArr[3] = "A1JfXRpmh7pGoJx4KgQXcs2DSpbOe785";
        return iArr.length;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0568Ag
    public final int A7w() {
        return 2;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0568Ag
    public final int A7x() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0568Ag
    public final boolean A9L() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0568Ag
    public final boolean A9Q() {
        return this.A05 && this.A03 == com.facebook.ads.redexgen.core.InterfaceC0568Ag.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0568Ag
    public final void AEh() {
        this.A05 = true;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0568Ag
    public final void AEi(java.nio.ByteBuffer byteBuffer) {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(this.A06 != null);
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int position = this.A00;
        int i = (iLimit - iPosition) / (position * 2);
        int position2 = this.A06.length;
        int i2 = position2 * i * 2;
        int position3 = this.A02.capacity();
        if (position3 < i2) {
            this.A02 = java.nio.ByteBuffer.allocateDirect(i2).order(java.nio.ByteOrder.nativeOrder());
        } else {
            this.A02.clear();
        }
        while (iPosition < iLimit) {
            for (int position4 : this.A06) {
                this.A02.putShort(byteBuffer.getShort((position4 * 2) + iPosition));
            }
            int position5 = this.A00;
            iPosition += position5 * 2;
        }
        byteBuffer.position(iLimit);
        this.A02.flip();
        this.A03 = this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0568Ag
    public final void flush() {
        this.A03 = com.facebook.ads.redexgen.core.InterfaceC0568Ag.A00;
        this.A05 = false;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0568Ag
    public final void reset() {
        flush();
        this.A02 = com.facebook.ads.redexgen.core.InterfaceC0568Ag.A00;
        this.A00 = -1;
        this.A01 = -1;
        this.A06 = null;
        this.A07 = null;
        this.A04 = false;
    }
}

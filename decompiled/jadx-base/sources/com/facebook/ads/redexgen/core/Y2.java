package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class Y2 implements com.facebook.ads.redexgen.core.D3 {
    public static java.lang.String[] A0C = {"Bbs", "qKP6KHSkWW9KU9paIT6cf", "rU75di5eOLilCbxPpy0GSAGaZrwajqTf", "YuVhXtragfVeFRPbNAekYc6E0B7lda9D", "hXC", "Q2lOeY0ESaZONfZDo5", "kBrVqaC6UGic4BlLAWI19a1g6tHSTPJ5", "2JtfLv4jLMmGEDOdqHeBx3Ka5hQzD6D9"};
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public com.facebook.ads.redexgen.core.C9 A05;
    public java.lang.String A06;
    public boolean A07;
    public boolean A08;
    public final com.facebook.ads.redexgen.core.C3 A09;
    public final com.facebook.ads.redexgen.core.I4 A0A;
    public final java.lang.String A0B;

    public Y2() {
        this(null);
    }

    public Y2(java.lang.String str) {
        this.A02 = 0;
        this.A0A = new com.facebook.ads.redexgen.core.I4(4);
        this.A0A.A00[0] = -1;
        this.A09 = new com.facebook.ads.redexgen.core.C3();
        this.A0B = str;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    private void A00(com.facebook.ads.redexgen.core.I4 i4) {
        boolean z;
        byte[] bArr = i4.A00;
        int iA07 = i4.A07();
        for (int iA06 = i4.A06(); iA06 < iA07; iA06++) {
            int startOffset = bArr[iA06];
            boolean z2 = (startOffset & 255) == 255;
            if (this.A08) {
                int startOffset2 = bArr[iA06];
                if ((startOffset2 & 224) == 224) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            this.A08 = z2;
            if (z) {
                i4.A0Y(iA06 + 1);
                this.A08 = false;
                this.A0A.A00[1] = bArr[iA06];
                this.A00 = 2;
                this.A02 = 1;
                return;
            }
        }
        i4.A0Y(iA07);
    }

    private void A01(com.facebook.ads.redexgen.core.I4 i4) {
        int iMin = java.lang.Math.min(i4.A04(), this.A01 - this.A00);
        this.A05.AFv(i4, iMin);
        int bytesToRead = this.A00;
        this.A00 = bytesToRead + iMin;
        int i = this.A00;
        int bytesToRead2 = this.A01;
        if (i < bytesToRead2) {
            return;
        }
        this.A05.AFw(this.A04, 1, this.A01, 0, null);
        this.A04 += this.A03;
        this.A00 = 0;
        this.A02 = 0;
    }

    private void A02(com.facebook.ads.redexgen.core.I4 i4) {
        int iMin = java.lang.Math.min(i4.A04(), 4 - this.A00);
        i4.A0c(this.A0A.A00, this.A00, iMin);
        this.A00 += iMin;
        if (this.A00 < 4) {
            return;
        }
        this.A0A.A0Y(0);
        if (com.facebook.ads.redexgen.core.C3.A04(this.A0A.A08(), this.A09)) {
            this.A01 = this.A09.A02;
            if (!this.A07) {
                this.A03 = (((long) this.A09.A04) * 1000000) / ((long) this.A09.A03);
                this.A05.A69(com.facebook.ads.internal.exoplayer2.thirdparty.Format.A07(this.A06, this.A09.A06, null, -1, 4096, this.A09.A01, this.A09.A03, null, null, 0, this.A0B));
                this.A07 = true;
            }
            this.A0A.A0Y(0);
            this.A05.AFv(this.A0A, 4);
            this.A02 = 2;
            return;
        }
        this.A00 = 0;
        int bytesToRead = A0C[7].charAt(6);
        if (bytesToRead != 52) {
            throw new java.lang.RuntimeException();
        }
        A0C[2] = "yj03MnPaN3pOKkNVSQZdPFhvu9IxLlvy";
        this.A02 = 1;
    }

    @Override // com.facebook.ads.redexgen.core.D3
    public final void A4n(com.facebook.ads.redexgen.core.I4 i4) {
        while (i4.A04() > 0) {
            switch (this.A02) {
                case 0:
                    A00(i4);
                    break;
                case 1:
                    A02(i4);
                    break;
                case 2:
                    A01(i4);
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.D3
    public final void A5B(com.facebook.ads.redexgen.core.InterfaceC0611Bz interfaceC0611Bz, com.facebook.ads.redexgen.core.DH dh) {
        dh.A05();
        this.A06 = dh.A04();
        this.A05 = interfaceC0611Bz.AHA(dh.A03(), 1);
    }

    @Override // com.facebook.ads.redexgen.core.D3
    public final void AEL() {
    }

    @Override // com.facebook.ads.redexgen.core.D3
    public final void AEM(long j, boolean z) {
        this.A04 = j;
    }

    @Override // com.facebook.ads.redexgen.core.D3
    public final void AG6() {
        this.A02 = 0;
        this.A00 = 0;
        this.A08 = false;
    }
}

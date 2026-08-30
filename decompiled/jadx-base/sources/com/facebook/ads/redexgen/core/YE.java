package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class YE implements com.facebook.ads.redexgen.core.D3 {
    public static java.lang.String[] A0C = {"UR", "FY5Q8wkMzwGgA7CHszR", "oo", "rr9Xmu114t4y3gs6khcCbH1NFDvtdjMs", "UjrPFe3d7TQjPi7HMFQy8aGwM8eNaoDN", "xcuQi76y2EBejEkhYDRMU4MF2hp8ggad", "ib8jr0kQKGvv5", "3vBuLU5L6MxmfiHBCqMCSpz7UqqXldTw"};
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public com.facebook.ads.internal.exoplayer2.thirdparty.Format A05;
    public com.facebook.ads.redexgen.core.C9 A06;
    public java.lang.String A07;
    public boolean A08;
    public final com.facebook.ads.redexgen.core.I3 A09;
    public final com.facebook.ads.redexgen.core.I4 A0A;
    public final java.lang.String A0B;

    public YE() {
        this(null);
    }

    public YE(java.lang.String str) {
        this.A09 = new com.facebook.ads.redexgen.core.I3(new byte[128]);
        this.A0A = new com.facebook.ads.redexgen.core.I4(this.A09.A00);
        this.A02 = 0;
        this.A0B = str;
    }

    private void A00() {
        this.A09.A07(0);
        com.facebook.ads.redexgen.core.AU auA09 = com.facebook.ads.redexgen.core.AV.A09(this.A09);
        if (this.A05 == null || auA09.A00 != this.A05.A05 || auA09.A03 != this.A05.A0C || auA09.A05 != this.A05.A0O) {
            this.A05 = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A07(this.A07, auA09.A05, null, -1, -1, auA09.A00, auA09.A03, null, null, 0, this.A0B);
            this.A06.A69(this.A05);
        }
        this.A01 = auA09.A01;
        this.A03 = (((long) auA09.A02) * 1000000) / ((long) this.A05.A0C);
    }

    private boolean A01(com.facebook.ads.redexgen.core.I4 i4) {
        while (true) {
            if (i4.A04() <= 0) {
                return false;
            }
            if (!this.A08) {
                this.A08 = i4.A0E() == 11;
            } else {
                int iA0E = i4.A0E();
                if (iA0E == 119) {
                    this.A08 = false;
                    return true;
                }
                this.A08 = iA0E == 11;
            }
        }
    }

    private boolean A02(com.facebook.ads.redexgen.core.I4 i4, byte[] bArr, int i) {
        int iMin = java.lang.Math.min(i4.A04(), i - this.A00);
        int bytesToRead = this.A00;
        i4.A0c(bArr, bytesToRead, iMin);
        int bytesToRead2 = this.A00;
        this.A00 = bytesToRead2 + iMin;
        int bytesToRead3 = this.A00;
        return bytesToRead3 == i;
    }

    @Override // com.facebook.ads.redexgen.core.D3
    public final void A4n(com.facebook.ads.redexgen.core.I4 i4) {
        while (i4.A04() > 0) {
            switch (this.A02) {
                case 0:
                    if (A01(i4)) {
                        this.A02 = 1;
                        this.A0A.A00[0] = 11;
                        this.A0A.A00[1] = 119;
                        this.A00 = 2;
                    }
                    break;
                case 1:
                    byte[] bArr = this.A0A.A00;
                    java.lang.String[] strArr = A0C;
                    if (strArr[0].length() == strArr[2].length()) {
                        java.lang.String[] strArr2 = A0C;
                        strArr2[7] = "0SbbrZbiygrnA8KIjiYAllo3xZVtG9CY";
                        strArr2[6] = "3iWCKJ6X5JwOa";
                        if (A02(i4, bArr, 128)) {
                            A00();
                            this.A0A.A0Y(0);
                            this.A06.AFv(this.A0A, 128);
                            this.A02 = 2;
                        }
                    } else if (A02(i4, bArr, 128)) {
                        A00();
                        this.A0A.A0Y(0);
                        this.A06.AFv(this.A0A, 128);
                        this.A02 = 2;
                    }
                    break;
                case 2:
                    int iMin = java.lang.Math.min(i4.A04(), this.A01 - this.A00);
                    this.A06.AFv(i4, iMin);
                    int bytesToRead = this.A00;
                    this.A00 = bytesToRead + iMin;
                    java.lang.String[] strArr3 = A0C;
                    java.lang.String str = strArr3[5];
                    java.lang.String str2 = strArr3[4];
                    int iCharAt = str.charAt(30);
                    int bytesToRead2 = str2.charAt(30);
                    if (iCharAt != bytesToRead2) {
                        A0C[3] = "zjnaxiSB7LOeccAdxYsFw2TSMtFsjVwI";
                        int i = this.A00;
                        int bytesToRead3 = this.A01;
                        if (i == bytesToRead3) {
                            this.A06.AFw(this.A04, 1, this.A01, 0, null);
                            this.A04 += this.A03;
                            this.A02 = 0;
                        }
                    } else {
                        throw new java.lang.RuntimeException();
                    }
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.D3
    public final void A5B(com.facebook.ads.redexgen.core.InterfaceC0611Bz interfaceC0611Bz, com.facebook.ads.redexgen.core.DH dh) {
        dh.A05();
        this.A07 = dh.A04();
        this.A06 = interfaceC0611Bz.AHA(dh.A03(), 1);
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

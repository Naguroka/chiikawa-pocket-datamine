package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ct, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0631Ct {
    public static java.lang.String[] A0D = {"4sB", "4D1DWBgJZiBViwZnGmt2ByWkRprHhpuN", "gQxDIdQCIY8vfaa60xk6NebO", "KlEKQoHUYHnVYbWdbbrUbqdXanEvwJey", "Vgi", "EjA", "c6RE6lR1BbmyrfXfshORHVWXlBaSCNUD", "Oj5QC3LAwof"};
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public com.facebook.ads.redexgen.core.InterfaceC0611Bz A06;
    public com.facebook.ads.redexgen.core.C9 A07;
    public com.facebook.ads.redexgen.core.InterfaceC0628Cq A08;
    public com.facebook.ads.redexgen.core.C0630Cs A09;
    public boolean A0A;
    public boolean A0B;
    public final com.facebook.ads.redexgen.core.C0626Co A0C = new com.facebook.ads.redexgen.core.C0626Co();

    public abstract long A07(com.facebook.ads.redexgen.core.I4 i4);

    public abstract boolean A0A(com.facebook.ads.redexgen.core.I4 i4, long j, com.facebook.ads.redexgen.core.C0630Cs c0630Cs) throws java.lang.InterruptedException, java.io.IOException;

    private int A00(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By) throws java.lang.InterruptedException, java.io.IOException {
        boolean zA0A = true;
        while (zA0A) {
            boolean readingHeaders = this.A0C.A05(interfaceC0610By);
            if (!readingHeaders) {
                this.A01 = 3;
                return -1;
            }
            this.A03 = interfaceC0610By.A86() - this.A04;
            zA0A = A0A(this.A0C.A02(), this.A04, this.A09);
            if (zA0A) {
                this.A04 = interfaceC0610By.A86();
            }
        }
        this.A00 = this.A09.A00.A0C;
        boolean readingHeaders2 = this.A0A;
        if (!readingHeaders2) {
            this.A07.A69(this.A09.A00);
            this.A0A = true;
        }
        if (this.A09.A01 != null) {
            this.A08 = this.A09.A01;
        } else if (interfaceC0610By.A7g() == -1) {
            this.A08 = new com.facebook.ads.redexgen.core.YI();
        } else {
            com.facebook.ads.redexgen.core.C0627Cp firstPayloadPageHeader = this.A0C.A01();
            this.A08 = new com.facebook.ads.redexgen.core.YO(this.A04, interfaceC0610By.A7g(), this, firstPayloadPageHeader.A01 + firstPayloadPageHeader.A00, firstPayloadPageHeader.A05);
        }
        this.A09 = null;
        this.A01 = 2;
        this.A0C.A04();
        return 0;
    }

    private int A01(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By, com.facebook.ads.redexgen.core.C4 c4) throws java.lang.InterruptedException, java.io.IOException {
        long jAEl = this.A08.AEl(interfaceC0610By);
        if (jAEl >= 0) {
            c4.A00 = jAEl;
            return 1;
        }
        if (jAEl < -1) {
            A08(-(2 + jAEl));
        }
        if (!this.A0B) {
            this.A06.AG8(this.A08.A58());
            this.A0B = true;
        }
        if (this.A03 <= 0 && !this.A0C.A05(interfaceC0610By)) {
            this.A01 = 3;
            return -1;
        }
        this.A03 = 0L;
        com.facebook.ads.redexgen.core.I4 i4A02 = this.A0C.A02();
        long granulesInPacket = A07(i4A02);
        if (granulesInPacket >= 0) {
            long j = this.A02 + granulesInPacket;
            long position = this.A05;
            java.lang.String[] strArr = A0D;
            if (strArr[7].length() == strArr[4].length()) {
                throw new java.lang.RuntimeException();
            }
            A0D[2] = "tkdh02BFbCmE16kBlmpbWsReDLdmp4";
            if (j >= position) {
                long position2 = this.A02;
                long jA03 = A03(position2);
                this.A07.AFv(i4A02, i4A02.A07());
                this.A07.AFw(jA03, 1, i4A02.A07(), 0, null);
                this.A05 = -1L;
            }
        }
        this.A02 += granulesInPacket;
        return 0;
    }

    public final int A02(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By, com.facebook.ads.redexgen.core.C4 c4) throws java.lang.InterruptedException, java.io.IOException {
        switch (this.A01) {
            case 0:
                return A00(interfaceC0610By);
            case 1:
                interfaceC0610By.AGq((int) this.A04);
                this.A01 = 2;
                return 0;
            case 2:
                return A01(interfaceC0610By, c4);
            default:
                throw new java.lang.IllegalStateException();
        }
    }

    public final long A03(long j) {
        return (1000000 * j) / ((long) this.A00);
    }

    public final long A04(long j) {
        return (((long) this.A00) * j) / 1000000;
    }

    public final void A05(long j, long j2) {
        this.A0C.A03();
        if (j == 0) {
            A09(!this.A0B);
            return;
        }
        int i = this.A01;
        if (A0D[3].charAt(0) == 'b') {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A0D;
        strArr[6] = "vHhb77yLnULgrCT5zUPvEHWgwFYyoY87";
        strArr[1] = "aks3HGgyr08vyLjUiSSy9kWjl3bsOMrH";
        if (i == 0) {
            return;
        }
        this.A05 = this.A08.AGy(j2);
        this.A01 = 2;
    }

    public final void A06(com.facebook.ads.redexgen.core.InterfaceC0611Bz interfaceC0611Bz, com.facebook.ads.redexgen.core.C9 c9) {
        this.A06 = interfaceC0611Bz;
        this.A07 = c9;
        A09(true);
    }

    public void A08(long j) {
        this.A02 = j;
    }

    public void A09(boolean z) {
        if (z) {
            this.A09 = new com.facebook.ads.redexgen.core.C0630Cs();
            this.A04 = 0L;
            this.A01 = 0;
        } else {
            this.A01 = 1;
        }
        this.A05 = -1L;
        this.A02 = 0L;
        java.lang.String[] strArr = A0D;
        if (strArr[7].length() == strArr[4].length()) {
            throw new java.lang.RuntimeException();
        }
        A0D[2] = "W7PBNvrcPf";
    }
}

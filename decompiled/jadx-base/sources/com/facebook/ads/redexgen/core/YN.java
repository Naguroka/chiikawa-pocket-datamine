package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class YN implements com.facebook.ads.redexgen.core.InterfaceC0628Cq, com.facebook.ads.redexgen.core.C6 {
    public long A00 = -1;
    public long A01 = -1;
    public long[] A02;
    public long[] A03;
    public final /* synthetic */ com.facebook.ads.redexgen.core.YM A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.C6
    public final com.facebook.ads.redexgen.core.C5 A8H(long j) {
        int iA0B = com.facebook.ads.redexgen.core.IK.A0B(this.A02, this.A04.A04(j), true, true);
        long jA03 = this.A04.A03(this.A02[iA0B]);
        com.facebook.ads.redexgen.core.C7 c7 = new com.facebook.ads.redexgen.core.C7(jA03, this.A00 + this.A03[iA0B]);
        return (jA03 >= j || iA0B == this.A02.length - 1) ? new com.facebook.ads.redexgen.core.C5(c7) : new com.facebook.ads.redexgen.core.C5(c7, new com.facebook.ads.redexgen.core.C7(this.A04.A03(this.A02[iA0B + 1]), this.A00 + this.A03[iA0B + 1]));
    }

    public YN(com.facebook.ads.redexgen.core.YM ym) {
        this.A04 = ym;
    }

    public final void A00(long j) {
        this.A00 = j;
    }

    public final void A01(com.facebook.ads.redexgen.core.I4 i4) {
        i4.A0Z(1);
        int length = i4.A0G();
        int i = length / 18;
        this.A02 = new long[i];
        this.A03 = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.A02[i2] = i4.A0L();
            this.A03[i2] = i4.A0L();
            i4.A0Z(2);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0628Cq
    public final com.facebook.ads.redexgen.core.C6 A58() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.C6
    public final long A7F() {
        return this.A04.A01.A01();
    }

    @Override // com.facebook.ads.redexgen.core.C6
    public final boolean A9h() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0628Cq
    public final long AEl(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By) throws java.lang.InterruptedException, java.io.IOException {
        if (this.A01 < 0) {
            return -1L;
        }
        long result = -(this.A01 + 2);
        this.A01 = -1L;
        return result;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0628Cq
    public final long AGy(long j) {
        long jA04 = this.A04.A04(j);
        long granule = this.A02[com.facebook.ads.redexgen.core.IK.A0B(this.A02, jA04, true, true)];
        this.A01 = granule;
        return jA04;
    }
}

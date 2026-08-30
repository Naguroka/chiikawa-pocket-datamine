package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class FE {
    public com.facebook.ads.redexgen.core.FE A00;
    public com.facebook.ads.redexgen.core.C0715Gq A01;
    public boolean A02;
    public final long A03;
    public final long A04;

    public FE(long j, int i) {
        this.A04 = j;
        this.A03 = ((long) i) + j;
    }

    public final int A00(long j) {
        return ((int) (j - this.A04)) + this.A01.A00;
    }

    public final com.facebook.ads.redexgen.core.FE A01() {
        this.A01 = null;
        com.facebook.ads.redexgen.core.FE fe = this.A00;
        this.A00 = null;
        return fe;
    }

    public final void A02(com.facebook.ads.redexgen.core.C0715Gq c0715Gq, com.facebook.ads.redexgen.core.FE fe) {
        this.A01 = c0715Gq;
        this.A00 = fe;
        this.A02 = true;
    }
}

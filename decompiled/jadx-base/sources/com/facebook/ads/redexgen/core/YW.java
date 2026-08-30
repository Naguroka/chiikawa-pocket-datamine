package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class YW implements com.facebook.ads.redexgen.core.CQ {
    public final int A00;
    public final int A01;
    public final com.facebook.ads.redexgen.core.I4 A02;

    public YW(com.facebook.ads.redexgen.core.YX yx) {
        this.A02 = yx.A00;
        this.A02.A0Y(12);
        this.A00 = this.A02.A0H();
        this.A01 = this.A02.A0H();
    }

    @Override // com.facebook.ads.redexgen.core.CQ
    public final int A8C() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.CQ
    public final boolean A9S() {
        return this.A00 != 0;
    }

    @Override // com.facebook.ads.redexgen.core.CQ
    public final int AEq() {
        return this.A00 == 0 ? this.A02.A0H() : this.A00;
    }
}

package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class CB {
    public final com.facebook.ads.redexgen.core.C9 A00;

    public abstract void A0B(com.facebook.ads.redexgen.core.I4 i4, long j) throws com.facebook.ads.redexgen.core.A0;

    public abstract boolean A0C(com.facebook.ads.redexgen.core.I4 i4) throws com.facebook.ads.redexgen.core.A0;

    public CB(com.facebook.ads.redexgen.core.C9 c9) {
        this.A00 = c9;
    }

    public final void A00(com.facebook.ads.redexgen.core.I4 i4, long j) throws com.facebook.ads.redexgen.core.A0 {
        if (A0C(i4)) {
            A0B(i4, j);
        }
    }
}

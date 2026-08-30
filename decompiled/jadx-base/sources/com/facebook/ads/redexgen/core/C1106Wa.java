package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1106Wa extends com.facebook.ads.redexgen.core.KY {
    public final /* synthetic */ com.facebook.ads.redexgen.core.WY A00;

    public C1106Wa(com.facebook.ads.redexgen.core.WY wy) {
        this.A00 = wy;
    }

    @Override // com.facebook.ads.redexgen.core.KY
    public final void A06() throws java.lang.Exception {
        com.facebook.ads.redexgen.core.WY.A00(this.A00);
        if (this.A00.A01 > 0) {
            try {
                java.lang.Thread.sleep(this.A00.A01);
            } catch (java.lang.InterruptedException unused) {
            }
        }
        this.A00.A0B();
    }
}

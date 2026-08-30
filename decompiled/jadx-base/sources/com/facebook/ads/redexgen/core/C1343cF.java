package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1343cF implements com.facebook.ads.redexgen.core.O7 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.AbstractC1342cE A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.W7 A02;

    public C1343cF(com.facebook.ads.redexgen.core.AbstractC1342cE abstractC1342cE, int i, com.facebook.ads.redexgen.core.W7 w7) {
        this.A01 = abstractC1342cE;
        this.A00 = i;
        this.A02 = w7;
    }

    @Override // com.facebook.ads.redexgen.core.O7
    public final void AC8(boolean z) {
        if (this.A00 == 0) {
            this.A02.A1b(this.A01.A04);
        }
        this.A02.A1e(z, true);
    }
}

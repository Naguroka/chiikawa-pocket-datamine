package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1048Tt implements com.facebook.ads.redexgen.core.LG {
    public final /* synthetic */ int A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.KY A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.AbstractC1045Tq A02;

    public C1048Tt(com.facebook.ads.redexgen.core.AbstractC1045Tq abstractC1045Tq, int i, com.facebook.ads.redexgen.core.KY ky) {
        this.A02 = abstractC1045Tq;
        this.A00 = i;
        this.A01 = ky;
    }

    @Override // com.facebook.ads.redexgen.core.LG
    public final void ABb() throws java.lang.Throwable {
        this.A01.run();
    }

    @Override // com.facebook.ads.redexgen.core.LG
    public final void ADF(float f) {
        this.A02.A07.setProgress(100.0f * (1.0f - (f / this.A00)));
    }
}

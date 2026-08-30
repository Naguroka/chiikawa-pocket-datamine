package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.c2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1330c2 implements com.facebook.ads.redexgen.core.InterfaceC03581p {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C03501h A00;

    public C1330c2(com.facebook.ads.redexgen.core.C03501h c03501h) {
        this.A00 = c03501h;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03581p
    public final void AD2(com.facebook.ads.AdError adError) {
        this.A00.A04.AB4(com.facebook.ads.AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03581p
    public final void AD3() {
        this.A00.A04.AB5();
    }
}

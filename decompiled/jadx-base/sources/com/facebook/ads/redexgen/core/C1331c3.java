package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.c3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1331c3 implements com.facebook.ads.redexgen.core.C6X {
    public final /* synthetic */ com.facebook.ads.redexgen.core.AbstractC1341cD A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.InterfaceC03491g A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C03501h A02;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1199Zs A03;
    public final /* synthetic */ boolean A04;

    public C1331c3(com.facebook.ads.redexgen.core.C03501h c03501h, com.facebook.ads.redexgen.core.C1199Zs c1199Zs, boolean z, com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cD, com.facebook.ads.redexgen.core.InterfaceC03491g interfaceC03491g) {
        this.A02 = c03501h;
        this.A03 = c1199Zs;
        this.A04 = z;
        this.A00 = abstractC1341cD;
        this.A01 = interfaceC03491g;
    }

    private void A00(boolean z) {
        if (z) {
            if (com.facebook.ads.redexgen.core.C0762Im.A1g(this.A03) && this.A04) {
                this.A02.A02.add(com.facebook.ads.redexgen.core.AbstractC0927Pc.A01(this.A03, this.A00, 1, new com.facebook.ads.redexgen.core.C1332c4(this)));
                return;
            } else {
                this.A01.AB5();
                return;
            }
        }
        this.A01.AB4(com.facebook.ads.AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.core.C6X
    public final void ABT() {
        A00(false);
    }

    @Override // com.facebook.ads.redexgen.core.C6X
    public final void ABc() {
        A00(true);
    }
}

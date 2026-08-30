package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0685Fi extends com.facebook.ads.redexgen.core.AbstractC1322bu {
    public C0685Fi(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.C03621t c03621t) {
        super(c1199Zs, c03621t);
    }

    private com.facebook.ads.redexgen.core.C1320bs A00(java.lang.Runnable runnable) {
        return new com.facebook.ads.redexgen.core.C1320bs(this, runnable);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1322bu
    public final com.facebook.ads.redexgen.core.C1E A0H() {
        com.facebook.ads.redexgen.core.C1363cZ successfullyLoadedAdapter = (com.facebook.ads.redexgen.core.C1363cZ) this.A01;
        if (successfullyLoadedAdapter != null) {
            return successfullyLoadedAdapter.A09();
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1322bu
    public final void A0O() {
        com.facebook.ads.redexgen.core.C1363cZ interstitialAdapter = (com.facebook.ads.redexgen.core.C1363cZ) this.A01;
        interstitialAdapter.A0B();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1322bu
    public final void A0Q(com.facebook.ads.redexgen.core.InterfaceC03320p interfaceC03320p, com.facebook.ads.redexgen.core.C8W c8w, com.facebook.ads.redexgen.core.C8U c8u, com.facebook.ads.redexgen.core.C03631u c03631u) {
        com.facebook.ads.redexgen.core.C1363cZ c1363cZ = (com.facebook.ads.redexgen.core.C1363cZ) interfaceC03320p;
        com.facebook.ads.redexgen.core.C1321bt c1321bt = new com.facebook.ads.redexgen.core.C1321bt(this, c03631u, c1363cZ);
        A0G().postDelayed(c1321bt, c8w.A05().A05());
        java.util.EnumSet<com.facebook.ads.CacheFlag> enumSet = this.A08.A0B;
        if (enumSet == null) {
            enumSet = com.facebook.ads.CacheFlag.ALL;
        }
        c1363cZ.A0A(this.A0B, A00(c1321bt), c03631u, enumSet, this.A08.A04, this.A08.A05, this.A08.A02);
    }
}

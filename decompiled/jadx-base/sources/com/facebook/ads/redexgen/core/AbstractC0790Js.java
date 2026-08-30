package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Js, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0790Js implements com.facebook.ads.redexgen.core.SX {
    public final com.facebook.ads.redexgen.core.SP A00;
    public final com.facebook.ads.redexgen.core.AnonymousClass79 A01;

    public AbstractC0790Js(com.facebook.ads.redexgen.core.AnonymousClass79 anonymousClass79, com.facebook.ads.redexgen.core.SP sp) {
        this.A01 = anonymousClass79;
        this.A00 = sp;
    }

    @Override // com.facebook.ads.redexgen.core.SX
    public void A3v(java.util.Map<com.facebook.ads.redexgen.core.SF, com.facebook.ads.redexgen.core.EnumC1005Sc> map, java.util.Map<com.facebook.ads.sync.SyncModifiableBundle, com.facebook.ads.redexgen.core.SP> map2) {
        map2.put(null, this.A00);
    }
}

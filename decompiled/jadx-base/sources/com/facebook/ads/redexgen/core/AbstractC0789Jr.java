package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Jr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0789Jr implements com.facebook.ads.redexgen.core.SX {
    public final com.facebook.ads.redexgen.core.C0797Jz A00;
    public final com.facebook.ads.redexgen.core.EnumC1005Sc A01;

    public AbstractC0789Jr(com.facebook.ads.redexgen.core.C0797Jz c0797Jz, com.facebook.ads.redexgen.core.EnumC1005Sc enumC1005Sc) {
        this.A00 = c0797Jz;
        this.A01 = enumC1005Sc;
    }

    @Override // com.facebook.ads.redexgen.core.SX
    public void A3v(java.util.Map<com.facebook.ads.redexgen.core.SF, com.facebook.ads.redexgen.core.EnumC1005Sc> map, java.util.Map<com.facebook.ads.sync.SyncModifiableBundle, com.facebook.ads.redexgen.core.SP> map2) {
        map.put(this.A00, this.A01);
    }
}

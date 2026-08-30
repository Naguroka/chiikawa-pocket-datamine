package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class UN implements com.facebook.ads.redexgen.core.O7 {
    public final java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.BP> A00;

    public UN(com.facebook.ads.redexgen.core.BP bp) {
        this.A00 = new java.lang.ref.WeakReference<>(bp);
    }

    public /* synthetic */ UN(com.facebook.ads.redexgen.core.BP bp, com.facebook.ads.redexgen.core.BU bu) {
        this(bp);
    }

    @Override // com.facebook.ads.redexgen.core.O7
    public final void AC8(boolean z) {
        com.facebook.ads.redexgen.core.BP cardLayout = this.A00.get();
        if (cardLayout != null) {
            cardLayout.A06 = z;
            cardLayout.A05();
        }
    }
}

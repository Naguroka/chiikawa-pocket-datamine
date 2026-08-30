package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Uf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1060Uf implements com.facebook.ads.redexgen.core.O7 {
    public final java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.BZ> A00;

    public C1060Uf(com.facebook.ads.redexgen.core.BZ bz) {
        this.A00 = new java.lang.ref.WeakReference<>(bz);
    }

    public /* synthetic */ C1060Uf(com.facebook.ads.redexgen.core.BZ bz, com.facebook.ads.redexgen.core.C0596Bk c0596Bk) {
        this(bz);
    }

    @Override // com.facebook.ads.redexgen.core.O7
    public final void AC8(boolean z) {
        com.facebook.ads.redexgen.core.BZ cardLayout = this.A00.get();
        if (cardLayout != null) {
            cardLayout.A04 = z;
            cardLayout.A04();
        }
    }
}

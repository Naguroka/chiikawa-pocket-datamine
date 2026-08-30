package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ur, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1072Ur extends com.facebook.ads.redexgen.core.KY {
    public final java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.C0987Rk> A00;

    public C1072Ur(com.facebook.ads.redexgen.core.C0987Rk c0987Rk) {
        this.A00 = new java.lang.ref.WeakReference<>(c0987Rk);
    }

    public C1072Ur(java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.C0987Rk> weakReference) {
        this.A00 = weakReference;
    }

    @Override // com.facebook.ads.redexgen.core.KY
    public final void A06() {
        com.facebook.ads.redexgen.core.C0987Rk viewabilityChecker = this.A00.get();
        if (viewabilityChecker != null) {
            viewabilityChecker.A0U();
        }
    }
}

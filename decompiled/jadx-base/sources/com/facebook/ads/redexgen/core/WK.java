package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class WK implements com.facebook.ads.redexgen.core.JP {
    public java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.W7> A00;

    public WK(com.facebook.ads.redexgen.core.W7 w7) {
        this.A00 = new java.lang.ref.WeakReference<>(w7);
    }

    @Override // com.facebook.ads.redexgen.core.JP
    public final void AD0(boolean z) {
        if (this.A00.get() != null) {
            this.A00.get().A1e(z, false);
        }
    }
}

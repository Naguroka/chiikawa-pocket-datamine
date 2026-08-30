package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.d2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1392d2 implements com.facebook.ads.redexgen.core.AnonymousClass03<java.io.File> {
    @Override // com.facebook.ads.redexgen.core.AnonymousClass03
    public final com.facebook.ads.redexgen.core.AnonymousClass02<java.io.File> A3i(java.io.File file, com.facebook.ads.redexgen.core.C0L c0l) {
        if (file.exists()) {
            return new com.facebook.ads.redexgen.core.AnonymousClass02<>(true, file);
        }
        return new com.facebook.ads.redexgen.core.AnonymousClass02<>(false, null);
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass03
    public final void A4q(java.io.File file, com.facebook.ads.redexgen.core.C0L c0l) {
    }
}

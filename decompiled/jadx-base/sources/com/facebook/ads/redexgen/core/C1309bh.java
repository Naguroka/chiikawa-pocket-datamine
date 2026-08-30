package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1309bh implements com.facebook.ads.redexgen.core.InterfaceC05148d {
    @Override // com.facebook.ads.redexgen.core.InterfaceC05148d
    public final java.lang.String A6c() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05148d
    public final java.lang.String A6q() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05148d
    public final com.facebook.ads.redexgen.core.C05107x A78(com.facebook.ads.redexgen.core.C7j c7j) {
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05148d
    public final java.lang.String A7o() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05148d
    public final java.lang.String A8V() {
        if (com.facebook.ads.AdSettings.getTestAdType() != com.facebook.ads.AdSettings.TestAdType.DEFAULT) {
            return com.facebook.ads.AdSettings.getTestAdType().getAdTypeString();
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05148d
    public final boolean A9Y() {
        return com.facebook.ads.AdSettings.isMixedAudience();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05148d
    public final boolean A9d() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05148d
    public final java.lang.Boolean A9i() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05148d
    public final boolean isTestMode(android.content.Context context) {
        return com.facebook.ads.AdSettings.isTestMode(context);
    }
}

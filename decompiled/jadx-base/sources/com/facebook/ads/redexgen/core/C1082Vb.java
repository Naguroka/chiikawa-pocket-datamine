package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1082Vb implements com.facebook.ads.redexgen.core.C5W {
    public final /* synthetic */ com.facebook.ads.redexgen.core.VY A00;

    public C1082Vb(com.facebook.ads.redexgen.core.VY vy) {
        this.A00 = vy;
    }

    @Override // com.facebook.ads.redexgen.core.C5W
    public final boolean A9J() {
        if (this.A00.A0E.canGoBack()) {
            this.A00.A0E.goBack();
            return true;
        }
        return false;
    }
}

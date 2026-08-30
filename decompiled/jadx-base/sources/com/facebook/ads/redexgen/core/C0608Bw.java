package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Bw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0608Bw extends com.facebook.ads.redexgen.core.AbstractC1006Sd {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0606Bu A00;

    public C0608Bw(com.facebook.ads.redexgen.core.C0606Bu c0606Bu) {
        this.A00 = c0606Bu;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC05348x
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(com.facebook.ads.redexgen.core.C9P c9p) {
        if (this.A00.A03 != null) {
            this.A00.A03.onPause();
        }
    }
}

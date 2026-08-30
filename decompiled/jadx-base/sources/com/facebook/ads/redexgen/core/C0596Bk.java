package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Bk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0596Bk extends com.facebook.ads.redexgen.core.AbstractC0956Qf {
    public final /* synthetic */ com.facebook.ads.redexgen.core.BZ A00;

    public C0596Bk(com.facebook.ads.redexgen.core.BZ bz) {
        this.A00 = bz;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC05348x
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(com.facebook.ads.redexgen.core.C0973Qw c0973Qw) {
        if (this.A00.getVideoView() != null) {
            this.A00.A07.A0P().setVolume(this.A00.getVideoView().getVolume());
        }
    }
}

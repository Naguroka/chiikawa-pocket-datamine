package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class WN implements com.facebook.ads.redexgen.core.JR {
    public final /* synthetic */ com.facebook.ads.internal.api.MediaViewVideoRendererApi A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.WJ A01;

    public WN(com.facebook.ads.redexgen.core.WJ wj, com.facebook.ads.internal.api.MediaViewVideoRendererApi mediaViewVideoRendererApi) {
        this.A01 = wj;
        this.A00 = mediaViewVideoRendererApi;
    }

    @Override // com.facebook.ads.redexgen.core.JR
    public final void AGT() {
        this.A00.setVolume(0.0f);
    }

    @Override // com.facebook.ads.redexgen.core.JR
    public final void AGY(com.facebook.ads.NativeAd nativeAd) {
        this.A01.A0I(com.facebook.ads.redexgen.core.W7.A0L(nativeAd.getInternalNativeAd()), null);
    }

    @Override // com.facebook.ads.redexgen.core.JR
    public final void AHF() {
        this.A01.A0D();
    }
}

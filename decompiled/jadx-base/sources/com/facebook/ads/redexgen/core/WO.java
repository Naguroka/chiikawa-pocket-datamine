package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class WO implements com.facebook.ads.redexgen.core.JR {
    public final /* synthetic */ com.facebook.ads.internal.api.MediaViewVideoRendererApi A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.WJ A01;

    public WO(com.facebook.ads.redexgen.core.WJ wj, com.facebook.ads.internal.api.MediaViewVideoRendererApi mediaViewVideoRendererApi) {
        this.A01 = wj;
        this.A00 = mediaViewVideoRendererApi;
    }

    @Override // com.facebook.ads.redexgen.core.JR
    public final void AGT() {
        this.A00.setVolume(1.0f);
    }

    @Override // com.facebook.ads.redexgen.core.JR
    public final void AGY(com.facebook.ads.NativeAd nativeAd) {
        this.A01.A0I(com.facebook.ads.redexgen.core.W7.A0L(nativeAd.getInternalNativeAd()), new com.facebook.ads.redexgen.core.WK(com.facebook.ads.redexgen.core.W7.A0L(nativeAd.getInternalNativeAd())));
    }

    @Override // com.facebook.ads.redexgen.core.JR
    public final void AHF() {
        this.A01.A0D();
    }
}

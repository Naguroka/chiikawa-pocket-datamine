package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class VS extends com.facebook.ads.redexgen.core.KY {
    public final /* synthetic */ com.facebook.ads.redexgen.core.AnimationAnimationListenerC0850Md A00;

    public VS(com.facebook.ads.redexgen.core.AnimationAnimationListenerC0850Md animationAnimationListenerC0850Md) {
        this.A00 = animationAnimationListenerC0850Md;
    }

    @Override // com.facebook.ads.redexgen.core.KY
    public final void A06() {
        this.A00.A00.finish(3);
        this.A00.A00.A05().overridePendingTransition(17432576, android.R.anim.fade_out);
    }
}

package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class CN implements com.facebook.ads.redexgen.core.W6 {
    public com.facebook.ads.NativeAdBase A00;
    public com.facebook.ads.NativeAdListener A01;

    public CN(com.facebook.ads.NativeAdListener nativeAdListener, com.facebook.ads.NativeAdBase nativeAdBase) {
        this.A01 = nativeAdListener;
        this.A00 = nativeAdBase;
    }

    @Override // com.facebook.ads.redexgen.core.JM
    public final void AB2() {
        com.facebook.ads.redexgen.core.KP.A00(new com.facebook.ads.redexgen.core.W2(this));
    }

    @Override // com.facebook.ads.redexgen.core.JM
    public final void AB6() {
        com.facebook.ads.redexgen.core.KP.A00(new com.facebook.ads.redexgen.core.W3(this));
    }

    @Override // com.facebook.ads.redexgen.core.JM
    public final void ABs(com.facebook.ads.redexgen.core.C0779Jg c0779Jg) {
        com.facebook.ads.redexgen.core.KP.A00(new com.facebook.ads.redexgen.core.W5(this, c0779Jg));
    }

    @Override // com.facebook.ads.redexgen.core.JM
    public final void ACb() {
        com.facebook.ads.redexgen.core.KP.A00(new com.facebook.ads.redexgen.core.W1(this));
    }

    @Override // com.facebook.ads.redexgen.core.W6
    public final void ACg() {
        com.facebook.ads.redexgen.core.KP.A00(new com.facebook.ads.redexgen.core.W4(this));
    }
}

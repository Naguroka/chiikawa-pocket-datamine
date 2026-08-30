package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1280bE implements com.facebook.ads.redexgen.core.InterfaceC03752g {
    private com.facebook.ads.redexgen.core.C03762h A00(com.facebook.ads.redexgen.core.InterfaceC03742f interfaceC03742f) {
        return (com.facebook.ads.redexgen.core.C03762h) interfaceC03742f.A6h();
    }

    public final void A01(com.facebook.ads.redexgen.core.InterfaceC03742f interfaceC03742f) {
        if (!interfaceC03742f.A8e()) {
            interfaceC03742f.AGe(0, 0, 0, 0);
            return;
        }
        float fA7k = A7k(interfaceC03742f);
        float fA8A = A8A(interfaceC03742f);
        float elevation = com.facebook.ads.redexgen.core.C03782j.A00(fA7k, fA8A, interfaceC03742f.A89());
        int vPadding = (int) java.lang.Math.ceil(elevation);
        float elevation2 = com.facebook.ads.redexgen.core.C03782j.A01(fA7k, fA8A, interfaceC03742f.A89());
        int iCeil = (int) java.lang.Math.ceil(elevation2);
        interfaceC03742f.AGe(vPadding, iCeil, vPadding, iCeil);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03752g
    public final android.content.res.ColorStateList A6U(com.facebook.ads.redexgen.core.InterfaceC03742f interfaceC03742f) {
        return A00(interfaceC03742f).A05();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03752g
    public final float A7H(com.facebook.ads.redexgen.core.InterfaceC03742f interfaceC03742f) {
        return interfaceC03742f.A6i().getElevation();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03752g
    public final float A7k(com.facebook.ads.redexgen.core.InterfaceC03742f interfaceC03742f) {
        return A00(interfaceC03742f).A03();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03752g
    public final float A7p(com.facebook.ads.redexgen.core.InterfaceC03742f interfaceC03742f) {
        return A8A(interfaceC03742f) * 2.0f;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03752g
    public final float A7q(com.facebook.ads.redexgen.core.InterfaceC03742f interfaceC03742f) {
        return A8A(interfaceC03742f) * 2.0f;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03752g
    public final float A8A(com.facebook.ads.redexgen.core.InterfaceC03742f interfaceC03742f) {
        return A00(interfaceC03742f).A04();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03752g
    public final void A9G() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03752g
    public final void A9H(com.facebook.ads.redexgen.core.InterfaceC03742f interfaceC03742f, android.content.Context context, android.content.res.ColorStateList colorStateList, float f, float f2, float f3) {
        com.facebook.ads.redexgen.core.C03762h background = new com.facebook.ads.redexgen.core.C03762h(colorStateList, f);
        interfaceC03742f.AGK(background);
        android.view.View view = interfaceC03742f.A6i();
        view.setClipToOutline(true);
        view.setElevation(f2);
        AGW(interfaceC03742f, f3);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03752g
    public final void ABY(com.facebook.ads.redexgen.core.InterfaceC03742f interfaceC03742f) {
        AGW(interfaceC03742f, A7k(interfaceC03742f));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03752g
    public final void ADD(com.facebook.ads.redexgen.core.InterfaceC03742f interfaceC03742f) {
        AGW(interfaceC03742f, A7k(interfaceC03742f));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03752g
    public final void AGJ(com.facebook.ads.redexgen.core.InterfaceC03742f interfaceC03742f, android.content.res.ColorStateList colorStateList) {
        A00(interfaceC03742f).A08(colorStateList);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03752g
    public final void AGP(com.facebook.ads.redexgen.core.InterfaceC03742f interfaceC03742f, float f) {
        interfaceC03742f.A6i().setElevation(f);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03752g
    public final void AGW(com.facebook.ads.redexgen.core.InterfaceC03742f interfaceC03742f, float f) {
        A00(interfaceC03742f).A07(f, interfaceC03742f.A8e(), interfaceC03742f.A89());
        A01(interfaceC03742f);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03752g
    public final void AGc(com.facebook.ads.redexgen.core.InterfaceC03742f interfaceC03742f, float f) {
        A00(interfaceC03742f).A06(f);
    }
}

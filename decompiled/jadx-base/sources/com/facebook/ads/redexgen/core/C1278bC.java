package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1278bC implements com.facebook.ads.redexgen.core.InterfaceC03752g {
    public final android.graphics.RectF A00 = new android.graphics.RectF();

    private com.facebook.ads.redexgen.core.C03782j A00(android.content.Context context, android.content.res.ColorStateList colorStateList, float f, float f2, float f3) {
        return new com.facebook.ads.redexgen.core.C03782j(context.getResources(), colorStateList, f, f2, f3);
    }

    private com.facebook.ads.redexgen.core.C03782j A01(com.facebook.ads.redexgen.core.InterfaceC03742f interfaceC03742f) {
        return (com.facebook.ads.redexgen.core.C03782j) interfaceC03742f.A6h();
    }

    public final void A02(com.facebook.ads.redexgen.core.InterfaceC03742f interfaceC03742f) {
        android.graphics.Rect rect = new android.graphics.Rect();
        A01(interfaceC03742f).A0K(rect);
        interfaceC03742f.AGX((int) java.lang.Math.ceil(A7q(interfaceC03742f)), (int) java.lang.Math.ceil(A7p(interfaceC03742f)));
        interfaceC03742f.AGe(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03752g
    public final android.content.res.ColorStateList A6U(com.facebook.ads.redexgen.core.InterfaceC03742f interfaceC03742f) {
        return A01(interfaceC03742f).A0F();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03752g
    public final float A7H(com.facebook.ads.redexgen.core.InterfaceC03742f interfaceC03742f) {
        return A01(interfaceC03742f).A0E();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03752g
    public final float A7k(com.facebook.ads.redexgen.core.InterfaceC03742f interfaceC03742f) {
        return A01(interfaceC03742f).A0B();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03752g
    public final float A7p(com.facebook.ads.redexgen.core.InterfaceC03742f interfaceC03742f) {
        return A01(interfaceC03742f).A0C();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03752g
    public final float A7q(com.facebook.ads.redexgen.core.InterfaceC03742f interfaceC03742f) {
        return A01(interfaceC03742f).A0D();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03752g
    public final float A8A(com.facebook.ads.redexgen.core.InterfaceC03742f interfaceC03742f) {
        return A01(interfaceC03742f).A0A();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03752g
    public void A9G() {
        com.facebook.ads.redexgen.core.C03782j.A0G = new com.facebook.ads.redexgen.core.C1279bD(this);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03752g
    public final void A9H(com.facebook.ads.redexgen.core.InterfaceC03742f interfaceC03742f, android.content.Context context, android.content.res.ColorStateList colorStateList, float f, float f2, float f3) {
        com.facebook.ads.redexgen.core.C03782j c03782jA00 = A00(context, colorStateList, f, f2, f3);
        c03782jA00.A0L(interfaceC03742f.A89());
        interfaceC03742f.AGK(c03782jA00);
        A02(interfaceC03742f);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03752g
    public final void ABY(com.facebook.ads.redexgen.core.InterfaceC03742f interfaceC03742f) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03752g
    public final void ADD(com.facebook.ads.redexgen.core.InterfaceC03742f interfaceC03742f) {
        A01(interfaceC03742f).A0L(interfaceC03742f.A89());
        A02(interfaceC03742f);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03752g
    public final void AGJ(com.facebook.ads.redexgen.core.InterfaceC03742f interfaceC03742f, android.content.res.ColorStateList colorStateList) {
        A01(interfaceC03742f).A0J(colorStateList);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03752g
    public final void AGP(com.facebook.ads.redexgen.core.InterfaceC03742f interfaceC03742f, float f) {
        A01(interfaceC03742f).A0I(f);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03752g
    public final void AGW(com.facebook.ads.redexgen.core.InterfaceC03742f interfaceC03742f, float f) {
        A01(interfaceC03742f).A0H(f);
        A02(interfaceC03742f);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03752g
    public final void AGc(com.facebook.ads.redexgen.core.InterfaceC03742f interfaceC03742f, float f) {
        A01(interfaceC03742f).A0G(f);
        A02(interfaceC03742f);
    }
}

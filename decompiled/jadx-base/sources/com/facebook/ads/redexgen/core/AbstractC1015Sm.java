package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1015Sm extends android.widget.RelativeLayout implements com.facebook.ads.redexgen.core.InterfaceC0970Qt {
    public com.facebook.ads.redexgen.core.T7 A00;

    public AbstractC1015Sm(com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        super(c1199Zs);
    }

    public AbstractC1015Sm(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, android.util.AttributeSet attributeSet, int i) {
        super(c1199Zs, attributeSet, i);
        android.widget.RelativeLayout.LayoutParams params = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        setLayoutParams(params);
    }

    public void A07() {
    }

    public void A08() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0970Qt
    public final void A9r(com.facebook.ads.redexgen.core.T7 t7) {
        this.A00 = t7;
        A07();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0970Qt
    public final void AHD(com.facebook.ads.redexgen.core.T7 t7) {
        A08();
        this.A00 = null;
    }

    public com.facebook.ads.redexgen.core.T7 getVideoView() {
        return this.A00;
    }
}

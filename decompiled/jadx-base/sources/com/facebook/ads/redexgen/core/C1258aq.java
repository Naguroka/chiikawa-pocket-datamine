package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1258aq extends com.facebook.ads.redexgen.core.C4Y {
    public C1258aq(com.facebook.ads.redexgen.core.AbstractC04344o abstractC04344o) {
        super(abstractC04344o, null);
    }

    @Override // com.facebook.ads.redexgen.core.C4Y
    public final int A06() {
        return this.A02.A0X();
    }

    @Override // com.facebook.ads.redexgen.core.C4Y
    public final int A07() {
        return this.A02.A0X() - this.A02.A0d();
    }

    @Override // com.facebook.ads.redexgen.core.C4Y
    public final int A08() {
        return this.A02.A0d();
    }

    @Override // com.facebook.ads.redexgen.core.C4Y
    public final int A09() {
        return this.A02.A0Y();
    }

    @Override // com.facebook.ads.redexgen.core.C4Y
    public final int A0A() {
        return this.A02.A0g();
    }

    @Override // com.facebook.ads.redexgen.core.C4Y
    public final int A0B() {
        return (this.A02.A0X() - this.A02.A0g()) - this.A02.A0d();
    }

    @Override // com.facebook.ads.redexgen.core.C4Y
    public final int A0C(android.view.View view) {
        return this.A02.A0j(view) + ((com.facebook.ads.redexgen.core.C04354p) view.getLayoutParams()).bottomMargin;
    }

    @Override // com.facebook.ads.redexgen.core.C4Y
    public final int A0D(android.view.View view) {
        com.facebook.ads.redexgen.core.C04354p c04354p = (com.facebook.ads.redexgen.core.C04354p) view.getLayoutParams();
        return this.A02.A0l(view) + c04354p.topMargin + c04354p.bottomMargin;
    }

    @Override // com.facebook.ads.redexgen.core.C4Y
    public final int A0E(android.view.View view) {
        com.facebook.ads.redexgen.core.C04354p c04354p = (com.facebook.ads.redexgen.core.C04354p) view.getLayoutParams();
        return this.A02.A0m(view) + c04354p.leftMargin + c04354p.rightMargin;
    }

    @Override // com.facebook.ads.redexgen.core.C4Y
    public final int A0F(android.view.View view) {
        return this.A02.A0o(view) - ((com.facebook.ads.redexgen.core.C04354p) view.getLayoutParams()).topMargin;
    }

    @Override // com.facebook.ads.redexgen.core.C4Y
    public final int A0G(android.view.View view) {
        this.A02.A1E(view, true, this.A01);
        return this.A01.bottom;
    }

    @Override // com.facebook.ads.redexgen.core.C4Y
    public final int A0H(android.view.View view) {
        this.A02.A1E(view, true, this.A01);
        return this.A01.top;
    }

    @Override // com.facebook.ads.redexgen.core.C4Y
    public final void A0J(int i) {
        this.A02.A10(i);
    }
}

package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ar, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1259ar extends com.facebook.ads.redexgen.core.C4Y {
    public C1259ar(com.facebook.ads.redexgen.core.AbstractC04344o abstractC04344o) {
        super(abstractC04344o, null);
    }

    @Override // com.facebook.ads.redexgen.core.C4Y
    public final int A06() {
        return this.A02.A0h();
    }

    @Override // com.facebook.ads.redexgen.core.C4Y
    public final int A07() {
        return this.A02.A0h() - this.A02.A0f();
    }

    @Override // com.facebook.ads.redexgen.core.C4Y
    public final int A08() {
        return this.A02.A0f();
    }

    @Override // com.facebook.ads.redexgen.core.C4Y
    public final int A09() {
        return this.A02.A0i();
    }

    @Override // com.facebook.ads.redexgen.core.C4Y
    public final int A0A() {
        return this.A02.A0e();
    }

    @Override // com.facebook.ads.redexgen.core.C4Y
    public final int A0B() {
        return (this.A02.A0h() - this.A02.A0e()) - this.A02.A0f();
    }

    @Override // com.facebook.ads.redexgen.core.C4Y
    public final int A0C(android.view.View view) {
        return this.A02.A0n(view) + ((com.facebook.ads.redexgen.core.C04354p) view.getLayoutParams()).rightMargin;
    }

    @Override // com.facebook.ads.redexgen.core.C4Y
    public final int A0D(android.view.View view) {
        com.facebook.ads.redexgen.core.C04354p c04354p = (com.facebook.ads.redexgen.core.C04354p) view.getLayoutParams();
        return this.A02.A0m(view) + c04354p.leftMargin + c04354p.rightMargin;
    }

    @Override // com.facebook.ads.redexgen.core.C4Y
    public final int A0E(android.view.View view) {
        com.facebook.ads.redexgen.core.C04354p c04354p = (com.facebook.ads.redexgen.core.C04354p) view.getLayoutParams();
        return this.A02.A0l(view) + c04354p.topMargin + c04354p.bottomMargin;
    }

    @Override // com.facebook.ads.redexgen.core.C4Y
    public final int A0F(android.view.View view) {
        return this.A02.A0k(view) - ((com.facebook.ads.redexgen.core.C04354p) view.getLayoutParams()).leftMargin;
    }

    @Override // com.facebook.ads.redexgen.core.C4Y
    public final int A0G(android.view.View view) {
        this.A02.A1E(view, true, this.A01);
        return this.A01.right;
    }

    @Override // com.facebook.ads.redexgen.core.C4Y
    public final int A0H(android.view.View view) {
        this.A02.A1E(view, true, this.A01);
        return this.A01.left;
    }

    @Override // com.facebook.ads.redexgen.core.C4Y
    public final void A0J(int i) {
        this.A02.A0z(i);
    }
}

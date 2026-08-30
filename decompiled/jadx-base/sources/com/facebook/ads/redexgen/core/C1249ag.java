package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ag, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1249ag extends com.facebook.ads.redexgen.core.AnonymousClass37 {
    public final com.facebook.ads.redexgen.core.AnonymousClass37 A00 = new com.facebook.ads.redexgen.core.C1250ah(this);
    public final com.facebook.ads.redexgen.core.FL A01;

    public C1249ag(com.facebook.ads.redexgen.core.FL fl) {
        this.A01 = fl;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass37
    public final void A07(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.A07(view, accessibilityEvent);
        accessibilityEvent.setClassName(com.facebook.ads.redexgen.core.FL.class.getName());
        if ((view instanceof com.facebook.ads.redexgen.core.FL) && !A0B()) {
            com.facebook.ads.redexgen.core.FL fl = (com.facebook.ads.redexgen.core.FL) view;
            if (fl.getLayoutManager() != null) {
                fl.getLayoutManager().A1t(accessibilityEvent);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass37
    public final void A08(android.view.View view, com.facebook.ads.redexgen.core.C04133s c04133s) {
        super.A08(view, c04133s);
        c04133s.A0O(com.facebook.ads.redexgen.core.FL.class.getName());
        if (!A0B() && this.A01.getLayoutManager() != null) {
            this.A01.getLayoutManager().A1F(c04133s);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass37
    public final boolean A09(android.view.View view, int i, android.os.Bundle bundle) {
        if (super.A09(view, i, bundle)) {
            return true;
        }
        if (!A0B() && this.A01.getLayoutManager() != null) {
            return this.A01.getLayoutManager().A1V(i, bundle);
        }
        return false;
    }

    public final com.facebook.ads.redexgen.core.AnonymousClass37 A0A() {
        return this.A00;
    }

    public final boolean A0B() {
        return this.A01.A1p();
    }
}

package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.b4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1271b4 extends com.facebook.ads.redexgen.core.AnonymousClass37 {
    public static java.lang.String[] A01 = {"gP5iRBNUcEm4", "hagqDV25a6ynaoYCoJf0l9z0sKG8jhWl", "ooYhQl9ZMyV9UByvd6u2ZbJwINTXZRCk", "quE", "9rQMt62DD9QRN345Nnq0LTFFdDUm2qAK", "qEkkF74LDRYf2iXVehyp9KJG4XjlQH4Q", "6Z5psXCaQYJ6H", "E0d3lf1uFrHxpWzWCxHKFqknJeusaBoL"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.C04023h A00;

    public C1271b4(com.facebook.ads.redexgen.core.C04023h c04023h) {
        this.A00 = c04023h;
    }

    private boolean A00() {
        return this.A00.A01 != null && this.A00.A01.A01() > 1;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass37
    public final void A07(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.A07(view, accessibilityEvent);
        accessibilityEvent.setClassName(com.facebook.ads.redexgen.core.C04023h.class.getName());
        accessibilityEvent.setScrollable(A00());
        if (accessibilityEvent.getEventType() == 4096 && this.A00.A01 != null) {
            accessibilityEvent.setItemCount(this.A00.A01.A01());
            accessibilityEvent.setFromIndex(this.A00.A00);
            accessibilityEvent.setToIndex(this.A00.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass37
    public final void A08(android.view.View view, com.facebook.ads.redexgen.core.C04133s c04133s) {
        super.A08(view, c04133s);
        c04133s.A0O(com.facebook.ads.redexgen.core.C04023h.class.getName());
        c04133s.A0R(A00());
        if (this.A00.canScrollHorizontally(1)) {
            if (A01[3].length() != 3) {
                throw new java.lang.RuntimeException();
            }
            A01[1] = "jglgbim5NCizxs0Sda1mccX23gBCKHWl";
            c04133s.A0N(4096);
        }
        if (this.A00.canScrollHorizontally(-1)) {
            c04133s.A0N(8192);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass37
    public final boolean A09(android.view.View view, int i, android.os.Bundle bundle) {
        if (super.A09(view, i, bundle)) {
            return true;
        }
        switch (i) {
            case 4096:
                if (!this.A00.canScrollHorizontally(1)) {
                    return false;
                }
                this.A00.setCurrentItem(this.A00.A00 + 1);
                return true;
            case 8192:
                if (!this.A00.canScrollHorizontally(-1)) {
                    return false;
                }
                this.A00.setCurrentItem(this.A00.A00 - 1);
                return true;
            default:
                return false;
        }
    }
}

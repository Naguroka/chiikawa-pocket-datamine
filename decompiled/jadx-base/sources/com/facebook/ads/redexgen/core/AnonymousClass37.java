package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.37, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AnonymousClass37 {
    public static final android.view.View.AccessibilityDelegate A01;
    public static final com.facebook.ads.redexgen.core.AnonymousClass36 A02;
    public final android.view.View.AccessibilityDelegate A00 = A02.A00(this);

    static {
        if (android.os.Build.VERSION.SDK_INT >= 16) {
            A02 = new com.facebook.ads.redexgen.core.C1274b7();
        } else {
            A02 = new com.facebook.ads.redexgen.core.AnonymousClass36();
        }
        A01 = new android.view.View.AccessibilityDelegate();
    }

    public final android.view.View.AccessibilityDelegate A00() {
        return this.A00;
    }

    public final com.facebook.ads.redexgen.core.C04153u A01(android.view.View view) {
        return A02.A01(A01, view);
    }

    public final void A02(android.view.View view, int i) {
        A01.sendAccessibilityEvent(view, i);
    }

    public final void A03(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        A01.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public final void A04(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        A01.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public final boolean A05(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return A01.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public final boolean A06(android.view.ViewGroup viewGroup, android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return A01.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public void A07(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        A01.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void A08(android.view.View view, com.facebook.ads.redexgen.core.C04133s c04133s) {
        A01.onInitializeAccessibilityNodeInfo(view, c04133s.A0M());
    }

    public boolean A09(android.view.View view, int i, android.os.Bundle bundle) {
        return A02.A02(A01, view, i, bundle);
    }
}

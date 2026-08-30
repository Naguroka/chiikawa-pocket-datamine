package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.36, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class AnonymousClass36 {
    public android.view.View.AccessibilityDelegate A00(final com.facebook.ads.redexgen.core.AnonymousClass37 anonymousClass37) {
        return new android.view.View.AccessibilityDelegate() { // from class: com.facebook.ads.redexgen.X.35
            @Override // android.view.View.AccessibilityDelegate
            public final boolean dispatchPopulateAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
                return anonymousClass37.A05(view, accessibilityEvent);
            }

            @Override // android.view.View.AccessibilityDelegate
            public final void onInitializeAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
                anonymousClass37.A07(view, accessibilityEvent);
            }

            @Override // android.view.View.AccessibilityDelegate
            public final void onInitializeAccessibilityNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
                anonymousClass37.A08(view, com.facebook.ads.redexgen.core.C04133s.A01(accessibilityNodeInfo));
            }

            @Override // android.view.View.AccessibilityDelegate
            public final void onPopulateAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
                anonymousClass37.A03(view, accessibilityEvent);
            }

            @Override // android.view.View.AccessibilityDelegate
            public final boolean onRequestSendAccessibilityEvent(android.view.ViewGroup viewGroup, android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
                return anonymousClass37.A06(viewGroup, view, accessibilityEvent);
            }

            @Override // android.view.View.AccessibilityDelegate
            public final void sendAccessibilityEvent(android.view.View view, int i) {
                anonymousClass37.A02(view, i);
            }

            @Override // android.view.View.AccessibilityDelegate
            public final void sendAccessibilityEventUnchecked(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
                anonymousClass37.A04(view, accessibilityEvent);
            }
        };
    }

    public com.facebook.ads.redexgen.core.C04153u A01(android.view.View.AccessibilityDelegate accessibilityDelegate, android.view.View view) {
        return null;
    }

    public boolean A02(android.view.View.AccessibilityDelegate accessibilityDelegate, android.view.View view, int i, android.os.Bundle bundle) {
        return false;
    }
}

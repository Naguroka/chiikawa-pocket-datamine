package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.b7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1274b7 extends com.facebook.ads.redexgen.core.AnonymousClass36 {
    @Override // com.facebook.ads.redexgen.core.AnonymousClass36
    public final android.view.View.AccessibilityDelegate A00(final com.facebook.ads.redexgen.core.AnonymousClass37 anonymousClass37) {
        return new android.view.View.AccessibilityDelegate() { // from class: com.facebook.ads.redexgen.X.34
            @Override // android.view.View.AccessibilityDelegate
            public final boolean dispatchPopulateAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
                return anonymousClass37.A05(view, accessibilityEvent);
            }

            @Override // android.view.View.AccessibilityDelegate
            public final android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider(android.view.View view) {
                com.facebook.ads.redexgen.core.C04153u provider = anonymousClass37.A01(view);
                if (provider != null) {
                    return (android.view.accessibility.AccessibilityNodeProvider) provider.A02();
                }
                return null;
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
            public final boolean performAccessibilityAction(android.view.View view, int i, android.os.Bundle bundle) {
                return anonymousClass37.A09(view, i, bundle);
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

    @Override // com.facebook.ads.redexgen.core.AnonymousClass36
    public final com.facebook.ads.redexgen.core.C04153u A01(android.view.View.AccessibilityDelegate accessibilityDelegate, android.view.View view) {
        android.view.accessibility.AccessibilityNodeProvider accessibilityNodeProvider = accessibilityDelegate.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new com.facebook.ads.redexgen.core.C04153u(accessibilityNodeProvider);
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass36
    public final boolean A02(android.view.View.AccessibilityDelegate accessibilityDelegate, android.view.View view, int i, android.os.Bundle bundle) {
        return accessibilityDelegate.performAccessibilityAction(view, i, bundle);
    }
}

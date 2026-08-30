package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.40, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AnonymousClass40 {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.3y] */
    public static com.facebook.ads.redexgen.core.C3y A00(final com.facebook.ads.redexgen.core.InterfaceC04193z interfaceC04193z) {
        return new android.view.accessibility.AccessibilityNodeProvider() { // from class: com.facebook.ads.redexgen.X.3y
            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
                return (android.view.accessibility.AccessibilityNodeInfo) interfaceC04193z.A4s(i);
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final java.util.List<android.view.accessibility.AccessibilityNodeInfo> findAccessibilityNodeInfosByText(java.lang.String str, int i) {
                return interfaceC04193z.A63(str, i);
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final android.view.accessibility.AccessibilityNodeInfo findFocus(int i) {
                return (android.view.accessibility.AccessibilityNodeInfo) interfaceC04193z.A64(i);
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final boolean performAction(int i, int i2, android.os.Bundle bundle) {
                return interfaceC04193z.AEQ(i, i2, bundle);
            }
        };
    }
}

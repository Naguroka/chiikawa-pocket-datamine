package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC04183x {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.3v] */
    public static com.facebook.ads.redexgen.core.C04163v A00(final com.facebook.ads.redexgen.core.InterfaceC04173w interfaceC04173w) {
        return new android.view.accessibility.AccessibilityNodeProvider() { // from class: com.facebook.ads.redexgen.X.3v
            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
                return (android.view.accessibility.AccessibilityNodeInfo) interfaceC04173w.A4s(i);
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final java.util.List<android.view.accessibility.AccessibilityNodeInfo> findAccessibilityNodeInfosByText(java.lang.String str, int i) {
                return interfaceC04173w.A63(str, i);
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final boolean performAction(int i, int i2, android.os.Bundle bundle) {
                return interfaceC04173w.AEQ(i, i2, bundle);
            }
        };
    }
}

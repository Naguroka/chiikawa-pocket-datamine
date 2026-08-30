package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC04073m {
    public static final com.facebook.ads.redexgen.core.C04063l A00;

    static {
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            A00 = new com.facebook.ads.redexgen.core.FY();
        } else if (android.os.Build.VERSION.SDK_INT >= 16) {
            A00 = new com.facebook.ads.redexgen.core.C1269b1();
        } else {
            A00 = new com.facebook.ads.redexgen.core.C04063l();
        }
    }

    public static int A00(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return A00.A00(accessibilityEvent);
    }

    public static void A01(android.view.accessibility.AccessibilityEvent accessibilityEvent, int i) {
        A00.A01(accessibilityEvent, i);
    }
}

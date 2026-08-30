package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class FY extends com.facebook.ads.redexgen.core.C1269b1 {
    @Override // com.facebook.ads.redexgen.core.C04063l
    public final int A00(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    @Override // com.facebook.ads.redexgen.core.C04063l
    public final void A01(android.view.accessibility.AccessibilityEvent accessibilityEvent, int i) {
        accessibilityEvent.setContentChangeTypes(i);
    }
}

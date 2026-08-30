package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3H, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C3H extends com.facebook.ads.redexgen.core.C04836n {
    @Override // com.facebook.ads.redexgen.core.C04093o
    public java.lang.Object A00(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        return android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z);
    }

    @Override // com.facebook.ads.redexgen.core.C04093o
    public java.lang.Object A01(int i, int i2, boolean z, int i3) {
        return android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z);
    }

    @Override // com.facebook.ads.redexgen.core.C04093o
    public final void A03(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, java.lang.Object obj) {
        accessibilityNodeInfo.setCollectionInfo((android.view.accessibility.AccessibilityNodeInfo.CollectionInfo) obj);
    }

    @Override // com.facebook.ads.redexgen.core.C04093o
    public final void A04(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, java.lang.Object obj) {
        accessibilityNodeInfo.setCollectionItemInfo((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) obj);
    }
}

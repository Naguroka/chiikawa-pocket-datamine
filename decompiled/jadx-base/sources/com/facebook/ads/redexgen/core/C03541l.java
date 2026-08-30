package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C03541l extends com.facebook.ads.redexgen.core.C03692a {
    @Override // com.facebook.ads.redexgen.core.C3S
    public final com.facebook.ads.redexgen.core.C04053k A08(android.view.View view, com.facebook.ads.redexgen.core.C04053k c04053k) {
        android.view.WindowInsets result = (android.view.WindowInsets) com.facebook.ads.redexgen.core.C04053k.A01(c04053k);
        android.view.WindowInsets unwrapped = view.dispatchApplyWindowInsets(result);
        if (unwrapped != result) {
            result = new android.view.WindowInsets(unwrapped);
        }
        return com.facebook.ads.redexgen.core.C04053k.A00(result);
    }

    @Override // com.facebook.ads.redexgen.core.C3S
    public final com.facebook.ads.redexgen.core.C04053k A09(android.view.View view, com.facebook.ads.redexgen.core.C04053k c04053k) {
        android.view.WindowInsets result = (android.view.WindowInsets) com.facebook.ads.redexgen.core.C04053k.A01(c04053k);
        android.view.WindowInsets unwrapped = view.onApplyWindowInsets(result);
        if (unwrapped != result) {
            result = new android.view.WindowInsets(unwrapped);
        }
        return com.facebook.ads.redexgen.core.C04053k.A00(result);
    }

    @Override // com.facebook.ads.redexgen.core.C3S
    public final void A0B(android.view.View view) {
        view.stopNestedScroll();
    }

    @Override // com.facebook.ads.redexgen.core.C3S
    public final void A0F(android.view.View view, final com.facebook.ads.redexgen.core.C3D c3d) {
        if (c3d == null) {
            view.setOnApplyWindowInsetsListener(null);
        } else {
            view.setOnApplyWindowInsetsListener(new android.view.View.OnApplyWindowInsetsListener() { // from class: com.facebook.ads.redexgen.X.3R
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final android.view.WindowInsets onApplyWindowInsets(android.view.View view2, android.view.WindowInsets windowInsets) {
                    com.facebook.ads.redexgen.core.C04053k compatInsets = c3d.ABA(view2, com.facebook.ads.redexgen.core.C04053k.A00(windowInsets));
                    return (android.view.WindowInsets) com.facebook.ads.redexgen.core.C04053k.A01(compatInsets);
                }
            });
        }
    }
}

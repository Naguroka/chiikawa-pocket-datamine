package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ah, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1250ah extends com.facebook.ads.redexgen.core.AnonymousClass37 {
    public static java.lang.String[] A01 = {"TEi6qE8rkCQGgGy4v7NzSxsVq0pzva7O", "YDOvw0rnr4UKw3Mnxoslotwc24p8", "a0zjiBNZeYiCSuvwyHtYeell8KyTQ5xY", "ogjV6WpDB35FLp8RKY", "WANqVRIVKxhPnPWopei7e1k0CZWy62T", "aZZWj5Yt51SqLR33GVZjsdPHZCc7cpWa", "7MlacYU9Pwo9bfliYZC3slRrct3tH7Ko", "0XE4m45s2Z74YdVCvJuFI2R02XTQtmXa"};
    public final com.facebook.ads.redexgen.core.C1249ag A00;

    public C1250ah(com.facebook.ads.redexgen.core.C1249ag c1249ag) {
        this.A00 = c1249ag;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass37
    public final void A08(android.view.View view, com.facebook.ads.redexgen.core.C04133s c04133s) {
        super.A08(view, c04133s);
        if (!this.A00.A0B() && this.A00.A01.getLayoutManager() != null) {
            com.facebook.ads.redexgen.core.AbstractC04344o layoutManager = this.A00.A01.getLayoutManager();
            if (A01[1].length() != 28) {
                throw new java.lang.RuntimeException();
            }
            A01[4] = "lLG2rM4BR6TSMRI6WEis0bH1e3aTZeM";
            layoutManager.A1C(view, c04133s);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass37
    public final boolean A09(android.view.View view, int i, android.os.Bundle bundle) {
        if (super.A09(view, i, bundle)) {
            return true;
        }
        if (!this.A00.A0B() && this.A00.A01.getLayoutManager() != null) {
            return this.A00.A01.getLayoutManager().A1X(view, i, bundle);
        }
        return false;
    }
}

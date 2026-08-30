package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Bl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0597Bl extends com.facebook.ads.redexgen.core.TV {
    public static java.lang.String[] A00 = {"f1NrkMLFHAOxAk1WYXb4ZQBI9BQGMxNf", "ieQbYkP9qXWhodiL", "FasCpRA2RHhykdlBGUblwYUAQMGKU0mS", "sjzKgK2sh59qhJK5Sm5NCXrbKyy", "73hXtYSYooo4yypUFlMlXcqu25ITYI9G", "jFG3gQjXUuH0GALbmhZbm14pHMTfeDNL", "AB4YZhA3BNaHUCHwFjy4bae76Yz8EFa9", "dMMrkYyDXzmdfTW8HhUzXkOm8W"};

    public C0597Bl(com.facebook.ads.redexgen.core.C04123r c04123r, int i, java.util.List<com.facebook.ads.redexgen.core.QK> list, com.facebook.ads.redexgen.core.C0987Rk c0987Rk, android.os.Bundle bundle) {
        super(c04123r, i, list, c0987Rk, bundle);
        c04123r.A1f(this);
        this.A03 = new com.facebook.ads.redexgen.core.C1078Ux(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A00() {
        int iA23 = this.A0C.A23();
        if (this.A05 == null || iA23 == -1) {
            return;
        }
        int curPos = this.A05.size();
        if (iA23 < curPos - 1) {
            int i = iA23 + 1;
            if (A00[2].charAt(8) != 'R') {
                throw new java.lang.RuntimeException();
            }
            A00[2] = "QoZYEwWSRtnMYn7R6MgH1oBp1kGEXSrp";
            A0U(i);
        }
    }

    private void A01(int i) {
        int visibleItem = this.A0C.A24();
        int lastVisibleItem = this.A0C.A25();
        int firstVisibleItem = this.A0C.A23();
        if (firstVisibleItem != visibleItem) {
            A0S(visibleItem);
        }
        if (firstVisibleItem != lastVisibleItem) {
            A0S(lastVisibleItem);
        }
        A0T(firstVisibleItem);
        A0V(visibleItem, lastVisibleItem, i);
    }

    @Override // com.facebook.ads.redexgen.core.TV, com.facebook.ads.redexgen.core.AbstractC04394t
    public final void A0L(com.facebook.ads.redexgen.core.FL fl, int i) {
    }

    @Override // com.facebook.ads.redexgen.core.TV, com.facebook.ads.redexgen.core.AbstractC04394t
    public final void A0M(com.facebook.ads.redexgen.core.FL fl, int i, int i2) {
        if (this.A0C.A23() != -1) {
            com.facebook.ads.redexgen.core.UO curCard = (com.facebook.ads.redexgen.core.UO) this.A0C.A1m(this.A0C.A23());
            if (curCard != null && curCard.A18() && !curCard.A17()) {
                curCard.A15();
            }
            A01(i);
        }
    }

    @Override // com.facebook.ads.redexgen.core.TV
    public final void A0X(android.view.View view, boolean z) {
        view.setAlpha(z ? 1.0f : 0.8f);
    }

    @Override // com.facebook.ads.redexgen.core.TV
    public final void A0Z(com.facebook.ads.redexgen.core.UO uo, boolean z) {
        A0X(uo, z);
        if (!z && uo.A17()) {
            uo.A14();
        }
    }

    @Override // com.facebook.ads.redexgen.core.TV
    public final boolean A0a(android.view.View view) {
        android.graphics.Rect rect = new android.graphics.Rect();
        view.getGlobalVisibleRect(rect);
        return ((float) rect.width()) / ((float) view.getWidth()) >= 0.75f;
    }

    public final com.facebook.ads.redexgen.core.C0987Rk A0b() {
        return this.A04;
    }

    public final void A0c(com.facebook.ads.redexgen.core.C0987Rk c0987Rk) {
        this.A04 = c0987Rk;
    }

    public final void A0d(java.util.List<com.facebook.ads.redexgen.core.QK> list) {
        this.A05 = list;
    }
}

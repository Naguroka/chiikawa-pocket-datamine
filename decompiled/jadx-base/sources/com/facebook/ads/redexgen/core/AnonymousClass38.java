package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.38, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass38 extends com.facebook.ads.redexgen.core.C04123r {
    public com.facebook.ads.redexgen.core.C0597Bl A00;
    public java.util.List<com.facebook.ads.redexgen.core.QK> A01;

    public AnonymousClass38(com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        super(c1199Zs);
        this.A00 = new com.facebook.ads.redexgen.core.C0597Bl(this, 1, null, null, null);
    }

    public final void A1y(com.facebook.ads.redexgen.core.C0987Rk c0987Rk) {
        if (this.A00 != null) {
            this.A00.A0c(c0987Rk);
        }
    }

    public com.facebook.ads.redexgen.core.C0597Bl getCarouselCardBehaviorHelper() {
        return this.A00;
    }

    public void setCardsInfo(java.util.ArrayList arrayList) {
        this.A01 = arrayList;
        this.A00.A0d(this.A01);
    }
}

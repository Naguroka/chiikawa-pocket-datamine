package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class TJ extends com.facebook.ads.redexgen.core.AbstractC04224c<com.facebook.ads.redexgen.core.TH> {
    public final int A00;
    public final com.facebook.ads.redexgen.core.C1199Zs A01;
    public final com.facebook.ads.redexgen.core.ViewOnClickListenerC1063Ui A02;
    public final java.util.List<java.lang.String> A03;

    public TJ(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, java.util.List<java.lang.String> screenshotUrls, int i, com.facebook.ads.redexgen.core.ViewOnClickListenerC1063Ui viewOnClickListenerC1063Ui) {
        this.A03 = screenshotUrls;
        this.A00 = i;
        this.A01 = c1199Zs;
        this.A02 = viewOnClickListenerC1063Ui;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC04224c
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.redexgen.core.TH A0C(android.view.ViewGroup viewGroup, int i) {
        com.facebook.ads.redexgen.core.TI ti = new com.facebook.ads.redexgen.core.TI(this.A01);
        if (com.facebook.ads.redexgen.core.C0762Im.A17(this.A01)) {
            ti.setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC0952Qb(this));
        }
        return new com.facebook.ads.redexgen.core.TH(ti);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC04224c
    /* JADX INFO: renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final void A0D(com.facebook.ads.redexgen.core.TH th, int i) {
        java.lang.String str = this.A03.get(i);
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(-2, -1);
        int startSpacing = this.A00 * 4;
        if (i != 0) {
            startSpacing = this.A00;
        }
        marginLayoutParams.setMargins(startSpacing, 0, i >= A0E() + (-1) ? this.A00 * 4 : this.A00, 0);
        th.A0j().setLayoutParams(marginLayoutParams);
        th.A0j().A00(str);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04224c
    public final int A0E() {
        return this.A03.size();
    }
}

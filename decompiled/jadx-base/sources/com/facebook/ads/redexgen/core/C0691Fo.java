package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0691Fo extends com.facebook.ads.redexgen.core.AbstractC1342cE {
    public final com.facebook.ads.redexgen.core.C1199Zs A00;

    public C0691Fo(com.facebook.ads.redexgen.core.C3C c3c, java.util.List<com.facebook.ads.redexgen.core.W7> list, com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        super(c3c, list, c1199Zs);
        this.A00 = c1199Zs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC04224c
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.redexgen.core.VW A0C(android.view.ViewGroup viewGroup, int i) {
        return new com.facebook.ads.redexgen.core.VW(new com.facebook.ads.redexgen.core.C0849Mc(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04224c
    /* JADX INFO: renamed from: A0H, reason: merged with bridge method [inline-methods] */
    public final void A0D(com.facebook.ads.redexgen.core.VW vw, int i) {
        super.A0D(vw, i);
        com.facebook.ads.redexgen.core.C0849Mc c0849Mc = (com.facebook.ads.redexgen.core.C0849Mc) vw.A0j();
        com.facebook.ads.redexgen.core.C0872Mz imageView = (com.facebook.ads.redexgen.core.C0872Mz) c0849Mc.getImageCardView();
        imageView.setImageDrawable(null);
        A0F(imageView, i);
        com.facebook.ads.redexgen.core.W7 childAd = ((com.facebook.ads.redexgen.core.AbstractC1342cE) this).A01.get(i);
        childAd.A11().A0K(this.A00);
        childAd.A1N(c0849Mc, c0849Mc);
    }
}

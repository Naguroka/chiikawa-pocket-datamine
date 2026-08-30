package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class Fp extends com.facebook.ads.redexgen.core.AbstractC1342cE {
    public final com.facebook.ads.redexgen.core.C1199Zs A00;
    public final com.facebook.ads.redexgen.core.JW A01;

    public Fp(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.C3C c3c, java.util.List<com.facebook.ads.redexgen.core.W7> list, com.facebook.ads.redexgen.core.JW jw) {
        super(c3c, list, c1199Zs);
        this.A00 = c1199Zs;
        this.A01 = jw == null ? new com.facebook.ads.redexgen.core.JW() : jw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC04224c
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.redexgen.core.VW A0C(android.view.ViewGroup viewGroup, int i) {
        return new com.facebook.ads.redexgen.core.VW(new com.facebook.ads.redexgen.core.MX(this.A00, this.A01));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04224c
    /* JADX INFO: renamed from: A0H */
    public final void A0D(com.facebook.ads.redexgen.core.VW vw, int i) {
        super.A0D(vw, i);
        com.facebook.ads.redexgen.core.MX mx = (com.facebook.ads.redexgen.core.MX) vw.A0j();
        A0F(mx.getImageCardView(), i);
        if (((com.facebook.ads.redexgen.core.AbstractC1342cE) this).A01.get(i) != null) {
            mx.setTitle(((com.facebook.ads.redexgen.core.AbstractC1342cE) this).A01.get(i).getAdHeadline());
            mx.setSubtitle(((com.facebook.ads.redexgen.core.AbstractC1342cE) this).A01.get(i).getAdLinkDescription());
            mx.setButtonText(((com.facebook.ads.redexgen.core.AbstractC1342cE) this).A01.get(i).getAdCallToAction());
        }
        com.facebook.ads.redexgen.core.W7 w7 = ((com.facebook.ads.redexgen.core.AbstractC1342cE) this).A01.get(i);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(mx);
        w7.A1O(mx, mx, arrayList);
    }
}

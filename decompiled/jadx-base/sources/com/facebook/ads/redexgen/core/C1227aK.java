package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1227aK extends com.facebook.ads.redexgen.core.C3E {
    public static java.lang.String[] A02 = {"mOKLXDYLG6rjJ8Uhc3dA94WggTy9aTCY", "BGa58WlKg30brm3iaXDpmKRreNqQx6sP", "OEIW0kNKyti99uOllTeGQwyl2xTRs9Rh", "66ZfANP52P8mfwFN1T5txUDlKbhE7PV5", "bDC5rvyouDOgyvzMPOhXiUUV9GXsFm8X", "OYxAj3HMhtWdnmP8KTtjhXT1I6nqQa9s", "h9E4hr1XPZf2wtmTKQKy9uKgM46lwlc6", "41TCzlsMJFbrsVbgrjJGy8KkwVmNtDJ0"};
    public java.util.List<com.facebook.ads.NativeAd> A00 = new java.util.ArrayList();
    public final /* synthetic */ com.facebook.ads.redexgen.core.C04565l A01;

    public C1227aK(com.facebook.ads.redexgen.core.C04565l c04565l) {
        this.A01 = c04565l;
    }

    @Override // com.facebook.ads.redexgen.core.C3E
    public final int A01() {
        return this.A00.size();
    }

    @Override // com.facebook.ads.redexgen.core.C3E
    public final int A02(java.lang.Object obj) {
        int index = this.A00.indexOf(obj);
        if (index >= 0) {
            return index;
        }
        return -2;
    }

    @Override // com.facebook.ads.redexgen.core.C3E
    public final java.lang.Object A04(android.view.ViewGroup viewGroup, int i) {
        android.view.View adView;
        if (this.A01.A01 != null) {
            adView = this.A01.A01.createView(this.A00.get(i), i);
        } else {
            adView = this.A01.A02 != null ? com.facebook.ads.NativeAdView.render(this.A01.A06, this.A00.get(i), this.A01.A02, this.A01.A03) : com.facebook.ads.NativeAdView.render(this.A01.A06, this.A00.get(i), this.A01.A03);
        }
        viewGroup.addView(adView);
        return adView;
    }

    @Override // com.facebook.ads.redexgen.core.C3E
    public final void A07(android.view.ViewGroup viewGroup, int i, java.lang.Object obj) {
        if (i < this.A00.size()) {
            com.facebook.ads.redexgen.core.C04565l c04565l = this.A01;
            if (A02[4].charAt(30) == 'x') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A02;
            strArr[2] = "v77RhDbNLQhSOdbZwI5GIdcCxuAqz5PX";
            strArr[7] = "TxIZGVGrDJLkO7AUrnSGEi4CFfNom122";
            if (c04565l.A01 != null) {
                this.A01.A01.destroyView(this.A00.get(i), (android.view.View) obj);
            } else {
                this.A00.get(i).unregisterView();
            }
        }
        viewGroup.removeView((android.view.View) obj);
    }

    @Override // com.facebook.ads.redexgen.core.C3E
    public final boolean A08(android.view.View view, java.lang.Object obj) {
        return view == obj;
    }

    public final void A09() {
        this.A00.clear();
        int iMin = java.lang.Math.min(this.A01.A00, this.A01.A04.getUniqueNativeAdCount());
        for (int i = 0; i < iMin; i++) {
            com.facebook.ads.NativeAd ad = this.A01.A04.nextNativeAd();
            com.facebook.ads.redexgen.core.W7.A0L(ad.getInternalNativeAd()).A1c(true);
            this.A00.add(ad);
        }
        A05();
    }
}

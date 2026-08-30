package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0895Nw extends android.widget.RelativeLayout {
    public static com.facebook.ads.redexgen.core.MR A05;
    public static byte[] A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public com.facebook.ads.redexgen.core.AbstractC1246ad A00;
    public com.facebook.ads.redexgen.core.C1199Zs A01;
    public com.facebook.ads.redexgen.core.AnonymousClass38 A02;
    public com.facebook.ads.redexgen.core.C1077Uw A03;
    public com.facebook.ads.redexgen.core.OT A04;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 60);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{2, 32, 51, 46, 52, 50, 36, 45, 97, 15, 32, 53, 40, 55, 36, 97, 55, 40, 36, 54, 97, 32, 37, 36, 49, 53, 36, 51, 97, 40, 50, 47, 102, 53, 97, 34, 51, 36, 32, 53, 36, 37, 97, 49, 51, 46, 49, 36, 51, 45, 56, 67, 65, 74, 65, 86, 77, 71};
    }

    static {
        A02();
        A08 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 8.0f);
        A07 = A08 * 10;
        A09 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 15.0f);
        A05 = new com.facebook.ads.redexgen.core.C1076Uv();
    }

    public C0895Nw(com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        super(c1199Zs);
        this.A01 = c1199Zs;
        this.A02 = new com.facebook.ads.redexgen.core.AnonymousClass38(c1199Zs);
        com.facebook.ads.redexgen.core.M3.A0K(this.A02);
        this.A00 = new com.facebook.ads.redexgen.core.FM();
        this.A00.A0G(this.A02);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(this.A02, layoutParams);
    }

    private java.util.ArrayList<com.facebook.ads.redexgen.core.QK> A01(com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cD) {
        if (abstractC1341cD == null) {
            return new java.util.ArrayList<>();
        }
        java.util.List<com.facebook.ads.redexgen.core.C1F> listA1W = abstractC1341cD.A1W();
        java.util.ArrayList<com.facebook.ads.redexgen.core.QK> arrayList = new java.util.ArrayList<>(listA1W.size());
        for (int i = 0; i < listA1W.size(); i++) {
            arrayList.add(new com.facebook.ads.redexgen.core.QK(i, listA1W.size(), listA1W.get(i)));
        }
        return arrayList;
    }

    public final void A04() {
        this.A02.setAdapter(null);
    }

    public final void A05(com.facebook.ads.redexgen.core.W7 w7, int i) {
        java.util.ArrayList<com.facebook.ads.redexgen.core.QK> arrayListA01 = A01(w7.A0z());
        this.A02.setCardsInfo(arrayListA01);
        this.A03 = new com.facebook.ads.redexgen.core.C1077Uw(this.A01, arrayListA01, w7.A0z(), this.A01.A01().A09(), w7, A05, w7.A0z().A1U(), this.A02.getCarouselCardBehaviorHelper(), null);
        this.A02.setAdapter(this.A03);
        if (i == 0) {
            i = com.facebook.ads.redexgen.core.LP.A03.widthPixels;
        }
        this.A03.A0F(i - A07, 16, 0);
        this.A03.A06();
        setupDotsLayout(w7, arrayListA01);
    }

    public final void A06(com.facebook.ads.redexgen.core.C0987Rk c0987Rk) {
        if (this.A03 != null) {
            this.A03.A0G(c0987Rk);
        } else {
            this.A01.A07().AA0(A00(51, 7, 24), com.facebook.ads.redexgen.core.C8E.A1v, new com.facebook.ads.redexgen.core.C8F(A00(0, 51, 125)));
        }
        this.A02.A1y(c0987Rk);
    }

    public static com.facebook.ads.redexgen.core.MR getDummyListener() {
        return A05;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (z && this.A03 != null) {
            this.A03.A0F((i3 - i) - A07, 16, 0);
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpLayoutForCardAtIndex(int i) {
        if (this.A04 != null) {
            this.A04.A00(i);
        }
    }

    private void setupDotsLayout(com.facebook.ads.redexgen.core.W7 w7, java.util.ArrayList<com.facebook.ads.redexgen.core.QK> arrayList) {
        this.A02.getCarouselCardBehaviorHelper().A0Y(new com.facebook.ads.redexgen.core.C1075Uu(this));
        this.A04 = new com.facebook.ads.redexgen.core.OT(this.A01, w7.A0z().A1O().A01(), arrayList.size());
        com.facebook.ads.redexgen.core.M3.A0K(this.A04);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(3, this.A02.getId());
        layoutParams.setMargins(0, A09, 0, 0);
        addView(this.A04, layoutParams);
    }
}

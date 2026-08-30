package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class TK extends com.facebook.ads.redexgen.core.AnonymousClass56 implements com.facebook.ads.redexgen.core.MY {
    public com.facebook.ads.redexgen.core.C1T A00;
    public com.facebook.ads.redexgen.core.AbstractC0986Rj A01;
    public com.facebook.ads.redexgen.core.C0987Rk A02;
    public com.facebook.ads.redexgen.core.C0987Rk A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final android.util.SparseBooleanArray A08;
    public final com.facebook.ads.redexgen.core.C1199Zs A09;
    public final com.facebook.ads.redexgen.core.BP A0A;

    public TK(com.facebook.ads.redexgen.core.BP bp, android.util.SparseBooleanArray sparseBooleanArray, com.facebook.ads.redexgen.core.C0987Rk c0987Rk, int i, int i2, int i3, int i4, com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.C1T c1t) {
        super(bp);
        this.A09 = c1199Zs;
        this.A0A = bp;
        this.A08 = sparseBooleanArray;
        this.A02 = c0987Rk;
        this.A04 = i;
        this.A05 = i2;
        this.A06 = i3;
        this.A07 = i4;
        this.A00 = c1t;
    }

    private void A0A(com.facebook.ads.redexgen.core.J7 j7, com.facebook.ads.redexgen.core.C0842Lv c0842Lv, java.lang.String str, com.facebook.ads.redexgen.core.QK qk) {
        if (this.A08.get(qk.A02())) {
            return;
        }
        if (this.A03 != null) {
            this.A03.A0V();
            this.A03 = null;
        }
        this.A01 = new com.facebook.ads.redexgen.core.TM(this, str, qk, j7, qk.A04(), c0842Lv);
        this.A03 = new com.facebook.ads.redexgen.core.C0987Rk(this.A0A, 10, new java.lang.ref.WeakReference(this.A01), this.A09);
        this.A03.A0Y(false);
        this.A03.A0W(100);
        this.A03.A0X(100);
        this.A0A.setOnAssetsLoadedListener(new com.facebook.ads.redexgen.core.TL(this, qk));
    }

    public final void A0j(com.facebook.ads.redexgen.core.QK qk, com.facebook.ads.redexgen.core.J7 j7, com.facebook.ads.redexgen.core.C04766f c04766f, com.facebook.ads.redexgen.core.C0842Lv c0842Lv, java.lang.String str) {
        int iA02 = qk.A02();
        this.A0A.setTag(-1593835536, java.lang.Integer.valueOf(iA02));
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(this.A04, -2);
        int rightMargin = iA02 == 0 ? this.A05 : this.A06;
        int position = this.A07;
        marginLayoutParams.setMargins(rightMargin, 0, iA02 >= position + (-1) ? this.A05 : this.A06, 0);
        java.lang.String imageUrl = qk.A03().A0E().A07();
        java.lang.String strA08 = qk.A03().A0E().A08();
        this.A0A.setIsVideo(!android.text.TextUtils.isEmpty(strA08));
        if (this.A0A.A18()) {
            this.A0A.setVideoPlaceholderUrl(imageUrl);
            this.A0A.setVideoUrl(c04766f.A0S(strA08));
        } else {
            this.A0A.setImageUrl(imageUrl);
        }
        this.A0A.setLayoutParams(marginLayoutParams);
        this.A0A.setAdTitleAndDescription(qk.A03().A0F().A08(), qk.A03().A0F().A02());
        this.A0A.setCTAInfo(qk.A03().A0G(), qk.A04());
        this.A0A.A1B(qk.A04());
        A0A(j7, c0842Lv, str, qk);
    }

    @Override // com.facebook.ads.redexgen.core.MY
    public final void AGH() {
        this.A0A.A13();
    }
}

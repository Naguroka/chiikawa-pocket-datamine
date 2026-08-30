package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class TR extends com.facebook.ads.redexgen.core.AnonymousClass56 implements com.facebook.ads.redexgen.core.MY {
    public static java.lang.String[] A08 = {"biNTtjxa0xULALtZEUOcP", "rMVpYr4hwZgX", "y0rebd1hOaNR", "snwXdVXwO66aPvNuuMD2", "jxkMgVVp1g5", "Dcah1JX", "lglxOXHbCZFpcLf1TWQPAMUDis4zLCZx", "n80A5ryznQOlcAJIvKv7FeLq2ck19EHB"};
    public com.facebook.ads.redexgen.core.C1T A00;
    public com.facebook.ads.redexgen.core.AbstractC0986Rj A01;
    public com.facebook.ads.redexgen.core.C0987Rk A02;
    public com.facebook.ads.redexgen.core.C0987Rk A03;
    public final int A04;
    public final android.util.SparseBooleanArray A05;
    public final com.facebook.ads.redexgen.core.C1199Zs A06;
    public final com.facebook.ads.redexgen.core.BZ A07;

    public TR(com.facebook.ads.redexgen.core.BZ bz, android.util.SparseBooleanArray sparseBooleanArray, com.facebook.ads.redexgen.core.C0987Rk c0987Rk, int i, com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.C1T c1t) {
        super(bz);
        this.A06 = c1199Zs;
        this.A07 = bz;
        this.A05 = sparseBooleanArray;
        this.A02 = c0987Rk;
        this.A04 = i;
        this.A00 = c1t;
    }

    private void A0A(com.facebook.ads.redexgen.core.J7 j7, com.facebook.ads.redexgen.core.C0842Lv c0842Lv, java.lang.String str, com.facebook.ads.redexgen.core.QK qk) {
        if (this.A05.get(qk.A02())) {
            return;
        }
        if (this.A03 != null) {
            this.A03.A0V();
            java.lang.String[] strArr = A08;
            if (strArr[1].length() != strArr[2].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A08;
            strArr2[3] = "sEemyGdXpNnP2WRBMWcD";
            strArr2[0] = "kawPFcVLuq3VyedHvbBIc";
            this.A03 = null;
        }
        this.A01 = new com.facebook.ads.redexgen.core.TT(this, str, qk, j7, qk.A04(), c0842Lv);
        this.A03 = new com.facebook.ads.redexgen.core.C0987Rk(this.A07, 10, new java.lang.ref.WeakReference(this.A01), this.A06);
        this.A03.A0Y(false);
        this.A03.A0W(100);
        this.A03.A0X(100);
        this.A07.setOnAssetsLoadedListener(new com.facebook.ads.redexgen.core.TS(this, qk));
    }

    public final void A0j(com.facebook.ads.redexgen.core.QK qk, com.facebook.ads.redexgen.core.J7 j7, com.facebook.ads.redexgen.core.C04766f c04766f, com.facebook.ads.redexgen.core.C0842Lv c0842Lv, java.lang.String str, int i, int i2, int i3) {
        int iA02 = qk.A02();
        this.A07.setTag(-1593835536, java.lang.Integer.valueOf(iA02));
        this.A07.setupNativeCtaExtension(qk);
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(i, -2);
        int rightMargin = iA02 == 0 ? i3 : i2;
        if (iA02 < this.A04 - 1) {
            i3 = i2;
        }
        java.lang.String[] strArr = A08;
        if (strArr[1].length() != strArr[2].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A08;
        strArr2[1] = "ng4t5bAKqCWK";
        strArr2[2] = "n9xBZs9SEWUc";
        marginLayoutParams.setMargins(rightMargin, 0, i3, 0);
        java.lang.String strA07 = qk.A03().A0E().A07();
        java.lang.String strA08 = qk.A03().A0E().A08();
        this.A07.setIsVideo(!android.text.TextUtils.isEmpty(strA08));
        if (this.A07.A18()) {
            this.A07.setVideoPlaceholderUrl(strA07);
            this.A07.setVideoUrl(c04766f.A0S(strA08));
        } else {
            this.A07.setImageUrl(strA07);
        }
        this.A07.setLayoutParams(marginLayoutParams);
        this.A07.setCTAInfo(qk.A03().A0G(), qk.A04());
        this.A07.A19(qk.A04());
        A0A(j7, c0842Lv, str, qk);
    }

    public final void A0k(com.facebook.ads.redexgen.core.C0987Rk c0987Rk) {
        this.A02 = c0987Rk;
    }

    @Override // com.facebook.ads.redexgen.core.MY
    public final void AGH() {
        this.A07.A13();
    }
}

package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5P, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C5P implements com.facebook.ads.internal.api.AdViewApi {
    public static byte[] A0D;
    public static java.lang.String[] A0E = {"8ZsaPqFHBksSubEDxj161z8v83o0PIqL", "1NWTdVv6N7aOqefGpQ3nVAkwh7f4QYaR", "Q4l1tys1ZSMgMj214694goNihNba6PJ2", "j8ts1um9VlgNYzePKTTbdrZm7P7LEYQS", "t56Pwr0qdwmiw03ThNEKvYWwkytCRLDg", "RREINDdqXCKFIVRasebbhTe", "edGRVZA6FwzGspMgtzkdHpprfoIdLjRD", "fNcadsm2hMDvYVzuw1qW3xw"};
    public long A00;
    public android.view.View A01;
    public com.facebook.ads.AdListener A02;
    public com.facebook.ads.redexgen.core.C0686Fj A03;
    public com.facebook.ads.redexgen.core.O6 A04;
    public java.lang.String A05;
    public java.lang.String A06;
    public final android.util.DisplayMetrics A07;
    public final com.facebook.ads.AdView A08;
    public final com.facebook.ads.internal.api.AdViewParentApi A09;
    public final com.facebook.ads.redexgen.core.C0669Ei A0A;
    public final com.facebook.ads.redexgen.core.EnumC0781Jj A0B;
    public final java.lang.String A0C;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 39);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A0D = new byte[]{-112, -110, -115, -61, -61, -109, -115, -66, -107, -58, -106, -110, -110, -102, -101, -103, 98, -109, -114, 97, -113, 100, 100, 101, -83, -52, -39, -39, -48, -35, -117, -52, -49, -117, -49, -48, -34, -33, -35, -38, -28, -48, -49, -35, -4, 9, 9, 0, 13, -69, -4, -1, -69, 7, 10, -4, -1, -69, 13, 0, 12, 16, 0, 14, 15, 0, -1, -35, -5, 8, 8, 9, 14, -70, 0, 3, 8, -2, -70, -5, -70, 14, -1, 7, 10, 6, -5, 14, -1, -70, 14, 2, -5, 14, -70, 6, 9, -5, -2, -70, -4, 3, -2, -70, -63, -65, 13, -63, -83, -80, -97, -75, -58, -79, -72, -71, -57, -56, -58, -61, -51, -62, -59, -73, -70, -105, -70};
    }

    static {
        A02();
    }

    public C5P(android.content.Context context, java.lang.String str, com.facebook.ads.AdSize adSize, com.facebook.ads.internal.api.AdViewParentApi adViewParentApi, com.facebook.ads.AdView adView) {
        this.A00 = -1L;
        if (adSize != null && adSize != com.facebook.ads.AdSize.INTERSTITIAL) {
            this.A07 = adView.getContext().getResources().getDisplayMetrics();
            this.A0B = com.facebook.ads.redexgen.core.LA.A04(adSize);
            this.A0C = str;
            this.A09 = adViewParentApi;
            this.A08 = adView;
            this.A0A = com.facebook.ads.redexgen.core.C04465b.A08(context);
            this.A0A.A0E().A3E(com.facebook.ads.internal.protocol.AdPlacementType.BANNER.toString(), str);
            com.facebook.ads.redexgen.core.C03621t c03621t = new com.facebook.ads.redexgen.core.C03621t(str, com.facebook.ads.redexgen.core.LA.A05(this.A0B), com.facebook.ads.internal.protocol.AdPlacementType.BANNER, com.facebook.ads.redexgen.core.LA.A04(adSize), 1, new com.facebook.ads.redexgen.core.C1309bh());
            c03621t.A06(this.A05);
            c03621t.A07(this.A06);
            this.A03 = new com.facebook.ads.redexgen.core.C0686Fj(this.A0A, c03621t);
            this.A03.A0R(new com.facebook.ads.redexgen.core.C1238aV(this));
            return;
        }
        throw new java.lang.IllegalArgumentException(A01(108, 6, 37));
    }

    public C5P(android.content.Context context, java.lang.String str, java.lang.String str2, com.facebook.ads.internal.api.AdViewParentApi adViewParentApi, com.facebook.ads.AdView adView) throws com.facebook.ads.redexgen.core.C0780Jh {
        this(context, str, A00(str2), adViewParentApi, adView);
        this.A0A.A0E().A49();
    }

    public static com.facebook.ads.AdSize A00(java.lang.String str) throws com.facebook.ads.redexgen.core.C0780Jh {
        com.facebook.ads.redexgen.core.EnumC0783Jl template = com.facebook.ads.redexgen.core.C0788Jq.A00(str);
        if (template != null) {
            com.facebook.ads.redexgen.core.C0788Jq.A03(template);
            return com.facebook.ads.redexgen.core.LA.A01(template);
        }
        throw new com.facebook.ads.redexgen.core.C0780Jh(com.facebook.ads.internal.protocol.AdErrorType.BID_PAYLOAD_ERROR, java.lang.String.format(java.util.Locale.US, A01(67, 41, 115), str));
    }

    private void A03(java.lang.String str) {
        this.A00 = java.lang.System.currentTimeMillis();
        if (str == null) {
            this.A0A.A0E().A3B();
        } else {
            com.facebook.ads.redexgen.core.C0669Ei c0669Ei = this.A0A;
            if (A0E[1].charAt(22) == 'v') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0E;
            strArr[5] = "M5Y3D3mNGdfLR2WDul4k9MR";
            strArr[7] = "fol70tWokzFUGtpcuxJkkr6";
            c0669Ei.A0E().A3A();
        }
        com.facebook.ads.redexgen.core.C0686Fj c0686Fj = this.A03;
        java.lang.String[] strArr2 = A0E;
        if (strArr2[2].charAt(21) == strArr2[3].charAt(21)) {
            throw new java.lang.RuntimeException();
        }
        A0E[1] = "pe4oZgDQ3sTDNo8k5JxuPcj1mqE4f2TD";
        if (c0686Fj != null) {
            this.A03.A0V(str);
        }
        this.A0A.A0E().A39();
        if (A0E[1].charAt(22) != 'v') {
            A0E[1] = "D8Oc2vjooMbkdhwRsJFg2j6kNTTlIbDv";
        }
    }

    public final long A04() {
        return this.A00;
    }

    public final android.util.DisplayMetrics A05() {
        return this.A07;
    }

    public final com.facebook.ads.AdListener A06() {
        return this.A02;
    }

    public final com.facebook.ads.AdView A07() {
        return this.A08;
    }

    public final com.facebook.ads.redexgen.core.C0686Fj A08() {
        return this.A03;
    }

    public final com.facebook.ads.redexgen.core.C0669Ei A09() {
        return this.A0A;
    }

    public final com.facebook.ads.redexgen.core.EnumC0781Jj A0A() {
        return this.A0B;
    }

    public final void A0B(android.widget.RelativeLayout relativeLayout, android.view.View view) {
        com.facebook.ads.redexgen.core.QS qsA01;
        this.A0A.A0E().A4M(this.A06 != null);
        if (this.A06 != null && (qsA01 = com.facebook.ads.redexgen.core.QR.A01(this.A0A, this.A06)) != null) {
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            relativeLayout.addView(qsA01, new android.widget.RelativeLayout.LayoutParams(layoutParams.width, layoutParams.height));
        }
    }

    public final void A0C(com.facebook.ads.AdListener adListener) {
        this.A0A.A0E().A37(adListener != null);
        this.A02 = adListener;
    }

    public final void A0D(com.facebook.ads.redexgen.core.O6 o6) {
        this.A04 = o6;
    }

    @Override // com.facebook.ads.internal.api.AdViewApi
    public final com.facebook.ads.AdView.AdViewLoadConfigBuilder buildLoadAdConfig() {
        return new com.facebook.ads.redexgen.core.JL(this);
    }

    @Override // com.facebook.ads.Ad
    public final void destroy() {
        com.facebook.ads.redexgen.core.AbstractC0792Ju.A05(A01(114, 7, 45), A01(24, 19, 68), A01(16, 8, 6));
        this.A0A.A0E().A3F();
        if (this.A03 != null) {
            this.A03.A0X(true);
            this.A03.A0J();
            this.A03 = null;
        }
        if (android.os.Build.VERSION.SDK_INT >= 18) {
            com.facebook.ads.redexgen.core.O6 o6 = this.A04;
            if (A0E[6].charAt(11) == 'y') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0E;
            strArr[2] = "TN5XSHsAoZcgZfma8JU5HEv6EkUhgjUJ";
            strArr[3] = "0EGaYiN0xr4bPRWWNOnd4RhBajl5vHs2";
            if (o6 != null) {
                com.facebook.ads.AdView adView = this.A08;
                java.lang.String[] strArr2 = A0E;
                if (strArr2[5].length() != strArr2[7].length()) {
                    throw new java.lang.RuntimeException();
                }
                A0E[1] = "TnNHs1kiAbubcu5fNfkZcHChaOM3HmV2";
                if (com.facebook.ads.redexgen.core.C0762Im.A16(adView.getContext())) {
                    this.A04.A07();
                    if (this.A01 != null) {
                        this.A01.getOverlay().remove(this.A04);
                    }
                }
            }
        }
        this.A08.removeAllViews();
        this.A01 = null;
        this.A02 = null;
    }

    @Override // com.facebook.ads.Ad
    public final java.lang.String getPlacementId() {
        return this.A0C;
    }

    @Override // com.facebook.ads.Ad
    public final boolean isAdInvalidated() {
        boolean z = this.A03 == null || this.A03.A0Y();
        this.A0A.A0E().A5E(z);
        return z;
    }

    @Override // com.facebook.ads.Ad
    public final void loadAd() {
        com.facebook.ads.redexgen.core.AbstractC0792Ju.A05(A01(121, 6, 47), A01(43, 24, 116), A01(0, 8, 54));
        A03(null);
    }

    @Override // com.facebook.ads.internal.api.AdViewApi
    public final void loadAd(com.facebook.ads.AdView.AdViewLoadConfig adViewLoadConfig) {
        com.facebook.ads.redexgen.core.AbstractC0792Ju.A05(A01(121, 6, 47), A01(43, 24, 116), A01(8, 8, 59));
        A03(((com.facebook.ads.redexgen.core.JL) adViewLoadConfig).A00());
    }

    @Override // com.facebook.ads.internal.api.AdViewApi, com.facebook.ads.internal.api.AdViewParentApi
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        this.A09.onConfigurationChanged(configuration);
        if (this.A01 != null) {
            com.facebook.ads.redexgen.core.AbstractC0785Jn.A01(this.A07, this.A01, this.A0B);
        }
    }

    @Override // com.facebook.ads.internal.api.AdViewApi, com.facebook.ads.Ad
    @java.lang.Deprecated
    public final void setExtraHints(com.facebook.ads.ExtraHints extraHints) {
        this.A05 = extraHints.getHints();
        this.A06 = extraHints.getMediationData();
        if (com.facebook.ads.redexgen.core.C0762Im.A0i(this.A0A) && this.A03 != null) {
            this.A03.A08.A06(this.A05);
            this.A03.A08.A07(this.A06);
        }
    }
}

package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class GL<NativeViewabilityLogger> implements com.facebook.ads.redexgen.core.InterfaceC1369cf {
    public static byte[] A0J;
    public static java.lang.String[] A0K = {"NhwOmA8H17maQr2Thm3XPPVG1xwEsLhZ", "rranxCubAcBFDRhPr2LDrxoK3htxcyeL", "LmhV8", "ZLGOK7uKxyyp5W3sNEqoBEODv8zXcPE1", "dNK0bBZMrDk2YJmjrhSzlk1RMTFmUAsD", "q33l17MPfjO0fzYSahPh7EE95Ux5x03H", "4VfBn9Mh4W5rafl7A4va0uDeREUgOp63", "NLrbv196ww605txiYhOndsfSQjY"};
    public static final java.lang.String A0L;
    public com.facebook.ads.redexgen.core.InterfaceC03400x A00;
    public com.facebook.ads.redexgen.core.C03410y A01;
    public com.facebook.ads.redexgen.core.C1349cL A02;
    public com.facebook.ads.redexgen.core.C0690Fn A03;
    public com.facebook.ads.redexgen.core.C0669Ei A04;
    public com.facebook.ads.redexgen.core.J7 A05;
    public com.facebook.ads.redexgen.core.EnumC0781Jj A06;
    public com.facebook.ads.redexgen.core.O1 A08;
    public com.facebook.ads.redexgen.core.C1070Up A09;
    public com.facebook.ads.redexgen.core.BN A0A;
    public com.facebook.ads.redexgen.core.AbstractC0986Rj A0B;
    public com.facebook.ads.redexgen.core.C0987Rk A0C;
    public java.lang.String A0E;
    public final java.lang.String A0I = java.util.UUID.randomUUID().toString();
    public boolean A0F = false;
    public boolean A0G = false;
    public boolean A0H = false;
    public com.facebook.ads.redexgen.core.C0842Lv A07 = new com.facebook.ads.redexgen.core.C0842Lv();
    public java.lang.Boolean A0D = false;

    public static java.lang.String A08(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0J, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 106);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A0B() {
        A0J = new byte[]{28, 40, 38, -25, 31, 26, 28, 30, 27, 40, 40, 36, -25, 26, 29, 44, -25, 27, 26, 39, 39, 30, 43, -25, 28, 37, 34, 28, 36, 30, 29, -15, -30, -11, -15, -84, -27, -15, -22, -23, -21, -22, -36, -93, -82};
    }

    static {
        A0B();
        A0L = com.facebook.ads.redexgen.core.GL.class.getSimpleName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.GL != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    public void A0A() {
        if (this.A00 != null && this.A0A != null && this.A03 != null && this.A03.A19()) {
            this.A00.ABO(this, this.A0A);
        }
        if (this.A00 != null) {
            boolean z = this.A0F;
            if (A0K[1].charAt(21) == 'I') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0K;
            strArr[6] = "pcQhCrMOoUvf1wSUiS8eXhj7G6bioSrh";
            strArr[4] = "JWZBC7ZhFf7k7YrTz5pa22tV9NT1Mc4w";
            if (z && (this.A0G || !this.A0H)) {
                com.facebook.ads.redexgen.core.InterfaceC03400x interfaceC03400x = this.A00;
                if (A0K[3].charAt(25) != 'G') {
                    A0K[3] = "irPj8aYnTZH6GsdLYSbTyVfXBLXHQnPh";
                    interfaceC03400x.ABO(this, this.A09);
                } else {
                    A0K[3] = "5PA9hoTjlgD01Tr6eTkR8jxCvDfXc2RO";
                    interfaceC03400x.ABO(this, this.A09);
                }
            }
        }
        this.A04.A0E().A44(this.A00 != null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.GL != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    public void A0C(int i, com.facebook.ads.redexgen.core.C8X c8x) {
        com.facebook.ads.redexgen.core.C1366cc c1366cc = new com.facebook.ads.redexgen.core.C1366cc(this);
        this.A0A = new com.facebook.ads.redexgen.core.BN(this.A04, this.A05, c1366cc, this.A03, A08(0, 31, 79), 2, this.A07);
        this.A0B = new com.facebook.ads.redexgen.core.C1365cb(this);
        this.A0C = new com.facebook.ads.redexgen.core.C0987Rk(this.A0A, c8x.A04(), c8x.A09(), true, new java.lang.ref.WeakReference(this.A0B), this.A04);
        this.A0C.A0W(this.A03.A0O());
        this.A0C.A0X(this.A03.A0P());
        this.A0A.setVisibility(0);
        this.A04.getResources();
        this.A0A.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, i));
        this.A0A.AGz();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.GL != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    private void A0F(com.facebook.ads.redexgen.core.C8X c8x, org.json.JSONObject jSONObject, com.facebook.ads.redexgen.core.EnumC0781Jj enumC0781Jj) {
        this.A0G = false;
        com.facebook.ads.redexgen.core.C1351cN c1351cNA00 = com.facebook.ads.redexgen.core.C1351cN.A00(this.A04, jSONObject);
        this.A0E = c1351cNA00.A6r();
        if (com.facebook.ads.redexgen.core.AbstractC03290l.A06(this.A04, c1351cNA00, this.A05)) {
            this.A04.A0E().A4g();
            this.A00.ACN(this, com.facebook.ads.redexgen.core.C0779Jg.A00(com.facebook.ads.internal.protocol.AdErrorType.NO_FILL));
            return;
        }
        this.A08 = new com.facebook.ads.redexgen.core.GO(this, c1351cNA00);
        this.A09 = new com.facebook.ads.redexgen.core.C1070Up(this.A04, (java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.O1>) new java.lang.ref.WeakReference(this.A08), c8x.A04(), A6r());
        this.A09.A0G(c8x.A07(), c8x.A08());
        com.facebook.ads.redexgen.core.AbstractC03350s impressionHelper = new com.facebook.ads.redexgen.core.C1364ca(this);
        this.A02 = new com.facebook.ads.redexgen.core.C1349cL(this.A04, this.A05, this.A09, this.A09.getViewabilityChecker(), impressionHelper, enumC0781Jj);
        this.A02.A08(c1351cNA00);
        this.A09.loadDataWithBaseURL(com.facebook.ads.redexgen.core.O4.A01(com.facebook.ads.internal.settings.AdInternalSettings.getUrlPrefix()), c1351cNA00.A04(), A08(31, 9, 19), A08(40, 5, 12), null);
        this.A0F = true;
        A0A();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0053 A[PHI: r1
  0x0053: PHI (r1v13 int) = (r1v10 int), (r1v17 int) binds: [B:20:0x0079, B:12:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:15:0x005f  */
    /* JADX WARN: Code duplicated, block: B:17:0x0062  */
    /* JADX WARN: Code duplicated, block: B:23:0x007e  */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.GL != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    private void A0G(com.facebook.ads.redexgen.core.EnumC0781Jj enumC0781Jj, com.facebook.ads.redexgen.core.C8X c8x) {
        int i;
        int bannerHeight;
        if (this.A03 != null) {
            com.facebook.ads.redexgen.core.J7 j7 = this.A05;
            if (A0K[1].charAt(21) == 'I') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0K;
            strArr[6] = "0asQ5nS3mEJJFXqECkaJp8czAINd5ojj";
            strArr[4] = "wkfCN0fAVUFan65EWCqz3ffd3K2ZXjjS";
            if (j7 == null) {
                return;
            }
            int iA03 = enumC0781Jj.A03();
            if (A0K[3].charAt(25) != 'G') {
                A0K[5] = "7AAzPingpmVfFCqSXKHauNoNKo9Xv93Z";
                i = (int) (iA03 * android.content.res.Resources.getSystem().getDisplayMetrics().density);
                if (com.facebook.ads.redexgen.core.C0762Im.A26(this.A04)) {
                    bannerHeight = com.facebook.ads.redexgen.core.AnonymousClass65.A0A(this.A03.A0o()) ? 1 : 0;
                }
                if (bannerHeight == 0) {
                    A0C(i, c8x);
                } else {
                    new com.facebook.ads.redexgen.core.AnonymousClass65(new com.facebook.ads.redexgen.core.C04766f(this.A04), this.A03.A0o(), this.A03.A0c(), this.A03.A0l(), true, new com.facebook.ads.redexgen.core.C1368ce(this, i, c8x, this)).A0B();
                }
            }
            i = (int) (iA03 * android.content.res.Resources.getSystem().getDisplayMetrics().density);
            if (com.facebook.ads.redexgen.core.C0762Im.A26(this.A04)) {
                if (com.facebook.ads.redexgen.core.AnonymousClass65.A0A(this.A03.A0o())) {
                }
            }
            if (bannerHeight == 0) {
                A0C(i, c8x);
            } else {
                new com.facebook.ads.redexgen.core.AnonymousClass65(new com.facebook.ads.redexgen.core.C04766f(this.A04), this.A03.A0o(), this.A03.A0c(), this.A03.A0l(), true, new com.facebook.ads.redexgen.core.C1368ce(this, i, c8x, this)).A0B();
            }
            if (bannerHeight == 0) {
                A0C(i, c8x);
            } else {
                new com.facebook.ads.redexgen.core.AnonymousClass65(new com.facebook.ads.redexgen.core.C04766f(this.A04), this.A03.A0o(), this.A03.A0c(), this.A03.A0l(), true, new com.facebook.ads.redexgen.core.C1368ce(this, i, c8x, this)).A0B();
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.GL != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.core.InterfaceC03320p
    public final java.lang.String A6r() {
        return this.A0E;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.GL != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.core.InterfaceC03320p
    public final com.facebook.ads.internal.protocol.AdPlacementType A82() {
        if (com.facebook.ads.redexgen.core.C0762Im.A14(this.A04)) {
            com.facebook.ads.redexgen.core.EnumC0781Jj enumC0781Jj = this.A06;
            java.lang.String[] strArr = A0K;
            if (strArr[2].length() == strArr[7].length()) {
                throw new java.lang.RuntimeException();
            }
            A0K[0] = "gRyzGCsQg6apk2eHBZ3N290V4KDgGwY2";
            if (enumC0781Jj != null && this.A06 == com.facebook.ads.redexgen.core.EnumC0781Jj.A09) {
                return com.facebook.ads.internal.protocol.AdPlacementType.MEDIUM_RECTANGLE;
            }
        }
        return com.facebook.ads.internal.protocol.AdPlacementType.BANNER;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.GL != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1369cf
    public final void A9p(com.facebook.ads.redexgen.core.C0669Ei c0669Ei, com.facebook.ads.redexgen.core.J7 j7, com.facebook.ads.redexgen.core.EnumC0781Jj enumC0781Jj, com.facebook.ads.redexgen.core.InterfaceC03400x interfaceC03400x, org.json.JSONObject jSONObject, com.facebook.ads.redexgen.core.C8X c8x) {
        c0669Ei.A0E().A43();
        this.A04 = c0669Ei;
        this.A05 = j7;
        this.A00 = interfaceC03400x;
        this.A06 = enumC0781Jj;
        this.A0H = com.facebook.ads.redexgen.core.C0762Im.A1e(this.A04.getApplicationContext());
        this.A03 = com.facebook.ads.redexgen.core.C0690Fn.A02(jSONObject, this.A04);
        if (this.A03.A19()) {
            A0G(enumC0781Jj, c8x);
        } else {
            A0F(c8x, jSONObject, enumC0781Jj);
        }
        this.A01 = new com.facebook.ads.redexgen.core.C03410y(this.A04, this.A0I, this, interfaceC03400x);
        this.A01.A02();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.GL != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.core.InterfaceC03320p
    public final boolean AH5() {
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.GL != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.core.InterfaceC03320p
    public final void onDestroy() {
        this.A04.A0E().A41(this.A09 != null);
        if (this.A09 != null) {
            this.A09.destroy();
            this.A09 = null;
            this.A08 = null;
        }
        if (this.A01 != null) {
            this.A01.A03();
        }
    }
}

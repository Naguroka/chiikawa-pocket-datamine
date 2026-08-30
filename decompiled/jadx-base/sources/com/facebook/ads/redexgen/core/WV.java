package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class WV implements com.facebook.ads.redexgen.core.J7 {
    public static com.facebook.ads.redexgen.core.J7 A03;
    public static byte[] A04;
    public static final java.lang.String A05;
    public static volatile boolean A06;
    public final com.facebook.ads.redexgen.core.C1198Zr A00;
    public final com.facebook.ads.redexgen.core.AnonymousClass91 A01;
    public final com.facebook.ads.redexgen.core.J6 A02;

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 64);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{50, 119, 100, 119, 124, 102, 60, 54, 3, 3, 18, 26, 7, 3, 30, 25, 16, 87, 3, 24, 87, 27, 24, 16, 87, 22, 25, 87, 30, 25, 1, 22, 27, 30, 19, 87, 66, 100, 119, 117, 115, 87, 85, 94, 85, 66, 89, 83, 29, 16, 25, 12};
    }

    static {
        A03();
        A05 = com.facebook.ads.redexgen.core.WV.class.getSimpleName();
        A06 = false;
    }

    public WV(com.facebook.ads.redexgen.core.C1198Zr c1198Zr) {
        com.facebook.ads.redexgen.core.J5 dispatchCallback;
        this.A00 = c1198Zr;
        if (com.facebook.ads.redexgen.core.Io.A0T(c1198Zr)) {
            this.A01 = com.facebook.ads.redexgen.core.AbstractC05368z.A00(c1198Zr);
            dispatchCallback = com.facebook.ads.redexgen.core.JC.A00(c1198Zr, this.A01);
        } else {
            com.facebook.ads.redexgen.core.C0667Ef c0667EfA01 = com.facebook.ads.redexgen.core.AbstractC05368z.A01(c1198Zr);
            dispatchCallback = com.facebook.ads.redexgen.core.JC.A01(c1198Zr, c0667EfA01);
            this.A01 = c0667EfA01;
        }
        this.A02 = new com.facebook.ads.redexgen.core.WY(c1198Zr, dispatchCallback);
        com.facebook.ads.redexgen.core.M8.A08.execute(new com.facebook.ads.redexgen.core.WX(this));
        A04(c1198Zr);
    }

    public static synchronized com.facebook.ads.redexgen.core.J7 A01(com.facebook.ads.redexgen.core.C1198Zr c1198Zr) {
        if (A03 == null) {
            A03 = new com.facebook.ads.redexgen.core.WV(c1198Zr);
        }
        return A03;
    }

    public static synchronized void A04(com.facebook.ads.redexgen.core.C1198Zr c1198Zr) {
        if (A06) {
            return;
        }
        c1198Zr.A03().AB3();
        A06 = true;
    }

    private void A05(com.facebook.ads.redexgen.core.J4 j4) {
        if (!j4.A0A()) {
            android.util.Log.e(A05, A02(7, 29, 55) + j4.A06() + A02(0, 7, 82));
        } else {
            A06(j4);
            this.A01.AHh(j4, new com.facebook.ads.redexgen.core.WW(this, j4));
        }
    }

    private void A06(com.facebook.ads.redexgen.core.J4 j4) {
        switch (j4.A06()) {
            case A0Q:
            case A0K:
            case A07:
            case A0J:
            case A0R:
            case A0T:
            case A0U:
                com.facebook.ads.redexgen.core.C8F c8f = new com.facebook.ads.redexgen.core.C8F(new java.lang.Exception(A02(36, 5, 86)));
                c8f.A05(1);
                try {
                    c8f.A07(new org.json.JSONObject().put(A02(48, 4, 41), j4.A06().toString()));
                    break;
                } catch (org.json.JSONException unused) {
                }
                this.A00.A07().AA1(A02(41, 7, 112), com.facebook.ads.redexgen.core.C8E.A1H, c8f);
                break;
        }
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final void A9t(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> data) {
        A05(new com.facebook.ads.redexgen.core.J3().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(com.facebook.ads.redexgen.core.J9.A04).A02(com.facebook.ads.redexgen.core.JA.A04).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final void A9v(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> data) {
        A05(new com.facebook.ads.redexgen.core.J3().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(com.facebook.ads.redexgen.core.J9.A04).A02(com.facebook.ads.redexgen.core.JA.A06).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final void A9w(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> data) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        A05(new com.facebook.ads.redexgen.core.J3().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(com.facebook.ads.redexgen.core.J9.A04).A02(com.facebook.ads.redexgen.core.JA.A07).A06(com.facebook.ads.redexgen.core.JH.A0A(str, com.facebook.ads.redexgen.core.JE.A0I)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final void A9x(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> data) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        A05(new com.facebook.ads.redexgen.core.J3().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(com.facebook.ads.redexgen.core.J9.A04).A02(com.facebook.ads.redexgen.core.JA.A08).A06(com.facebook.ads.redexgen.core.JH.A0A(str, com.facebook.ads.redexgen.core.JE.A06)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final void A9z(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> data) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        A05(new com.facebook.ads.redexgen.core.J3().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(com.facebook.ads.redexgen.core.J9.A04).A02(com.facebook.ads.redexgen.core.JA.A0B).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final void AA3(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> data) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        A05(new com.facebook.ads.redexgen.core.J3().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(com.facebook.ads.redexgen.core.J9.A04).A02(com.facebook.ads.redexgen.core.JA.A0C).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final void AA6(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> data) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        A05(new com.facebook.ads.redexgen.core.J3().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(com.facebook.ads.redexgen.core.J9.A05).A02(com.facebook.ads.redexgen.core.JA.A0D).A06(com.facebook.ads.redexgen.core.JH.A0A(str, com.facebook.ads.redexgen.core.JE.A0T)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final void AA7(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> data) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        A05(new com.facebook.ads.redexgen.core.J3().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(com.facebook.ads.redexgen.core.J9.A05).A02(com.facebook.ads.redexgen.core.JA.A0E).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final void AA8(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> data) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        A05(new com.facebook.ads.redexgen.core.J3().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(com.facebook.ads.redexgen.core.J9.A05).A02(com.facebook.ads.redexgen.core.JA.A0F).A06(com.facebook.ads.redexgen.core.JH.A0A(str, com.facebook.ads.redexgen.core.JE.A0V)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final void AA9(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> data) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        A05(new com.facebook.ads.redexgen.core.J3().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(com.facebook.ads.redexgen.core.J9.A05).A02(com.facebook.ads.redexgen.core.JA.A0K).A06(com.facebook.ads.redexgen.core.JH.A0A(str, com.facebook.ads.redexgen.core.JE.A0W)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final void AAI(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> data) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        A05(new com.facebook.ads.redexgen.core.J3().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(com.facebook.ads.redexgen.core.J9.A05).A02(com.facebook.ads.redexgen.core.JA.A0H).A06(com.facebook.ads.redexgen.core.JH.A0A(str, com.facebook.ads.redexgen.core.JE.A0X)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final void AAK(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> data) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        A05(new com.facebook.ads.redexgen.core.J3().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(com.facebook.ads.redexgen.core.J9.A04).A02(com.facebook.ads.redexgen.core.JA.A0J).A06(com.facebook.ads.redexgen.core.JH.A0A(str, com.facebook.ads.redexgen.core.JE.A0Y)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final void AAL(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> data, java.lang.String str2, com.facebook.ads.redexgen.core.J9 j9) {
        A05(new com.facebook.ads.redexgen.core.J3().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(j9).A02(com.facebook.ads.redexgen.core.JA.A00(str2)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final void AAM(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> data) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        com.facebook.ads.redexgen.core.J4 adEvent = new com.facebook.ads.redexgen.core.J3().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(com.facebook.ads.redexgen.core.J9.A04).A02(com.facebook.ads.redexgen.core.JA.A0L).A07(this.A00);
        A05(adEvent);
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final void AAQ(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> data) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        A05(new com.facebook.ads.redexgen.core.J3().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(com.facebook.ads.redexgen.core.J9.A05).A02(com.facebook.ads.redexgen.core.JA.A0N).A06(com.facebook.ads.redexgen.core.JH.A0A(str, com.facebook.ads.redexgen.core.JE.A0g)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final void AAR(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> data) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        A05(new com.facebook.ads.redexgen.core.J3().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(com.facebook.ads.redexgen.core.J9.A05).A02(com.facebook.ads.redexgen.core.JA.A0O).A06(com.facebook.ads.redexgen.core.JH.A0A(str, com.facebook.ads.redexgen.core.JE.A0h)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final void AAT(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        A05(new com.facebook.ads.redexgen.core.J3().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A01(com.facebook.ads.redexgen.core.J9.A04).A02(com.facebook.ads.redexgen.core.JA.A0P).A06(com.facebook.ads.redexgen.core.JH.A0A(str, com.facebook.ads.redexgen.core.JE.A0i)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final void AAU(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> data) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        A05(new com.facebook.ads.redexgen.core.J3().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(com.facebook.ads.redexgen.core.J9.A04).A02(com.facebook.ads.redexgen.core.JA.A0G).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final void AAY(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> data) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        A05(new com.facebook.ads.redexgen.core.J3().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(com.facebook.ads.redexgen.core.J9.A05).A02(com.facebook.ads.redexgen.core.JA.A0Q).A06(com.facebook.ads.redexgen.core.JH.A0A(str, com.facebook.ads.redexgen.core.JE.A0m)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final void AAZ(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> data) {
        A05(new com.facebook.ads.redexgen.core.J3().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(com.facebook.ads.redexgen.core.J9.A05).A02(com.facebook.ads.redexgen.core.JA.A0V).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final void AAb(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> data) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        A05(new com.facebook.ads.redexgen.core.J3().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(com.facebook.ads.redexgen.core.J9.A05).A02(com.facebook.ads.redexgen.core.JA.A0W).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final void AEU(java.lang.String str) {
        new com.facebook.ads.redexgen.core.SA(this.A00).execute(str);
    }
}

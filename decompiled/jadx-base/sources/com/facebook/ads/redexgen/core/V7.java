package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class V7 implements com.facebook.ads.redexgen.core.MS {
    public static byte[] A0D;
    public int A00;
    public com.facebook.ads.redexgen.core.TC A01;
    public com.facebook.ads.redexgen.core.C9S A02;
    public java.lang.String A03;
    public final com.facebook.ads.redexgen.core.C1199Zs A04;
    public final com.facebook.ads.redexgen.core.J7 A05;
    public final com.facebook.ads.redexgen.core.MR A06;
    public final com.facebook.ads.redexgen.core.N4 A07;
    public final com.facebook.ads.redexgen.core.T7 A08;
    public final com.facebook.ads.redexgen.core.AbstractC0990Rn A0C = new com.facebook.ads.redexgen.core.C0601Bp(this);
    public final com.facebook.ads.redexgen.core.AbstractC1006Sd A0B = new com.facebook.ads.redexgen.core.C0600Bo(this);
    public final com.facebook.ads.redexgen.core.AbstractC1012Sj A09 = new com.facebook.ads.redexgen.core.C0599Bn(this);
    public final com.facebook.ads.redexgen.core.AbstractC1010Sh A0A = new com.facebook.ads.redexgen.core.C0598Bm(this);

    static {
        A03();
    }

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 102);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A03() {
        A0D = new byte[]{44, 56, 57, 34, kotlin.io.encoding.Base64.padSymbol, 33, 44, 52, 122, 117, 112, 124, 119, 109, 77, 118, 114, 124, 119, 20, 18, 4, 47, 0, 21, 8, 23, 4, 34, 21, 0, 35, 20, 21, 21, 14, 15, 55, 40, 37, 36, 46, 8, 47, 53, 36, 51, 50, 53, 40, 53, 32, 45, 4, 55, 36, 47, 53, 81, 78, 67, 66, 72, 107, 72, 64, 64, 66, 85, 116, 107, 102, 103, 109, 79, 82, 70, 103, 120, 117, 116, 126, 66, 116, 116, 122, 69, 120, 124, 116, okio.Utf8.REPLACEMENT_BYTE, 32, 45, 44, 38, 28, 27, 5};
    }

    public V7(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.N4 n4, com.facebook.ads.redexgen.core.J7 j7, com.facebook.ads.redexgen.core.MR mr) {
        this.A04 = c1199Zs;
        this.A05 = j7;
        this.A07 = n4;
        this.A08 = new com.facebook.ads.redexgen.core.T7(c1199Zs);
        this.A08.A0c(new com.facebook.ads.redexgen.core.C8S(c1199Zs));
        this.A08.getEventBus().A03(this.A0C, this.A0B, this.A09, this.A0A);
        this.A06 = mr;
        this.A08.setIsFullScreen(true);
        this.A08.setVolume(1.0f);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(15);
        mr.A3q(this.A08, layoutParams);
        com.facebook.ads.redexgen.core.MZ closeButton = new com.facebook.ads.redexgen.core.MZ(c1199Zs);
        closeButton.setOnClickListener(new com.facebook.ads.redexgen.core.N2(this));
        android.widget.RelativeLayout.LayoutParams params = closeButton.getDefaultLayoutParams();
        mr.A3q(closeButton, params);
    }

    public final void A04(int i) {
        this.A08.setVideoProgressReportIntervalMs(i);
    }

    public final void A05(android.view.View view) {
        this.A08.setControlsAnchorView(view);
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public final void A9q(android.content.Intent intent, android.os.Bundle bundle, com.facebook.ads.redexgen.core.C5Q c5q) {
        java.lang.String ctaText = A02(8, 11, 127);
        if (bundle == null) {
            this.A03 = intent.getStringExtra(ctaText);
        } else {
            this.A03 = bundle.getString(ctaText);
        }
        java.lang.String stringExtra = intent.getStringExtra(A02(19, 18, 7));
        if (stringExtra != null && !stringExtra.isEmpty()) {
            com.facebook.ads.redexgen.core.QI qi = new com.facebook.ads.redexgen.core.QI(this.A04, stringExtra);
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            int i = (int) (16.0f * com.facebook.ads.redexgen.core.LP.A02);
            layoutParams.setMargins(i, i, i, i);
            layoutParams.addRule(10);
            layoutParams.addRule(9);
            qi.setOnClickListener(new com.facebook.ads.redexgen.core.N3(this));
            this.A06.A3q(qi, layoutParams);
        }
        this.A00 = intent.getIntExtra(A02(77, 13, 119), 0);
        this.A02 = new com.facebook.ads.redexgen.core.C9S(this.A04, this.A05, this.A08, this.A03, intent.getBundleExtra(A02(58, 11, 65)), null);
        if (com.facebook.ads.redexgen.core.C0762Im.A1q(this.A04)) {
            this.A01 = new com.facebook.ads.redexgen.core.TC(this.A04, this.A05, this.A08, this.A03, this.A02, null);
        } else {
            this.A01 = null;
        }
        this.A08.setVideoMPD(intent.getStringExtra(A02(69, 8, 100)));
        this.A08.setVideoURI(intent.getStringExtra(A02(90, 8, 47)));
        if (this.A00 > 0) {
            this.A08.A0Y(this.A00);
        }
        if (intent.getBooleanExtra(A02(0, 8, 43), false)) {
            this.A08.A0b(com.facebook.ads.redexgen.core.EnumC0969Qs.A04, 17);
        }
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public final void ACz(boolean z) {
        this.A06.A4Q(A02(37, 21, 39), new com.facebook.ads.redexgen.core.C1008Sf());
        this.A08.A0W();
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public final void ADN(boolean z) {
        this.A06.A4Q(A02(37, 21, 39), new com.facebook.ads.redexgen.core.C1007Se());
        if (!this.A08.A0k()) {
            this.A08.A0b(com.facebook.ads.redexgen.core.EnumC0969Qs.A04, 18);
        }
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public final void AFx(android.os.Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public final java.lang.String getCurrentClientToken() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public final boolean onActivityResult(int i, int i2, android.content.Intent intent) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public final void onDestroy() {
        this.A06.A4Q(A02(37, 21, 39), new com.facebook.ads.redexgen.core.R6(this.A00, this.A08.getCurrentPositionInMillis()));
        this.A02.A0i(this.A08.getCurrentPositionInMillis());
        if (this.A01 != null) {
            this.A01.A06();
        }
        this.A08.A0Z(1);
        this.A08.A0V();
    }
}

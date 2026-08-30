package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class VY extends android.widget.RelativeLayout implements com.facebook.ads.redexgen.core.MS {
    public static byte[] A0F;
    public static final java.lang.String A0G;
    public long A00;
    public long A01;
    public java.lang.String A02;
    public boolean A03;
    public java.lang.String A04;
    public boolean A05;
    public final com.facebook.ads.redexgen.core.C5W A06;
    public final com.facebook.ads.redexgen.core.C5Q A07;
    public final com.facebook.ads.redexgen.core.C1199Zs A08;
    public final com.facebook.ads.redexgen.core.J7 A09;
    public final com.facebook.ads.redexgen.core.MR A0A;
    public final com.facebook.ads.redexgen.core.C0882Nj A0B;
    public final com.facebook.ads.redexgen.core.C0883Nk A0C;
    public final com.facebook.ads.redexgen.core.InterfaceC0891Ns A0D;
    public final com.facebook.ads.redexgen.core.C1079Uy A0E;

    public static java.lang.String A0C(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0F, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 44);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A0D() {
        A0F = new byte[]{90, 112, 112, 125, 112, 20, okio.Utf8.REPLACEMENT_BYTE, kotlin.io.encoding.Base64.padSymbol, 112, 19, okio.Utf8.REPLACEMENT_BYTE, 62, 36, 53, 62, 36, 112, 28, okio.Utf8.REPLACEMENT_BYTE, 49, 52, 53, 52, 112, 4, 57, kotlin.io.encoding.Base64.padSymbol, 53, 106, 112, 48, 26, 26, 23, 26, 118, 85, 91, 94, 26, 124, 83, 84, 83, 73, 82, 26, 110, 83, 87, 95, 0, 26, 95, 117, 117, 120, 117, 25, 58, 52, 49, 117, 6, 33, 52, 39, 33, 117, 1, 60, 56, 48, 111, 117, 117, 95, 95, 82, 95, 45, 26, 12, 15, 16, 17, 12, 26, 95, 58, 17, 27, 95, 43, 22, 18, 26, 69, 95, 109, 71, 71, 74, 71, 52, 4, 21, 8, 11, 11, 71, 53, 2, 6, 3, 30, 71, 51, 14, 10, 2, 93, 71, 87, 125, 125, 112, 125, 14, 56, 46, 46, 52, 50, 51, 125, 27, 52, 51, 52, 46, 53, 125, 9, 52, 48, 56, 103, 125, 42, 26, 48, 48, kotlin.io.encoding.Base64.padSymbol, 48, 88, 113, 126, 116, 124, 117, 98, 48, 68, 121, 125, 117, 42, 48, 97, 81, 76, 84, 80, 70, 81, 3, 80, 70, 80, 80, 74, 76, 77, 3, 71, 66, 87, 66, 3, 79, 76, 68, 68, 70, 71, 3, 99, 3, 126, 125, 112, 106, 107, 37, 125, 115, 126, 113, 116, 67, 83, 78, 86, 82, 68, 83, 116, 115, 109, 85, 90, 95, 83, 88, 66, 98, 89, 93, 83, 88, 37, 44, 35, 41, 33, 40, okio.Utf8.REPLACEMENT_BYTE, 25, 36, 32, 40};
    }

    static {
        A0D();
        A0G = com.facebook.ads.redexgen.core.VY.class.getSimpleName();
    }

    public VY(com.facebook.ads.redexgen.core.C5Q c5q, com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.J7 j7, com.facebook.ads.redexgen.core.MR mr) {
        com.facebook.ads.redexgen.core.C1079Uy c1079Uy;
        super(c1199Zs);
        this.A06 = new com.facebook.ads.redexgen.core.C1082Vb(this);
        this.A05 = true;
        this.A01 = -1L;
        this.A03 = true;
        this.A07 = c5q;
        this.A09 = j7;
        this.A0A = mr;
        this.A08 = c1199Zs;
        if (c1199Zs.A0D() == null) {
            c1199Zs.A0E().A93();
        }
        this.A0D = A0E();
        if (com.facebook.ads.redexgen.core.AbstractC0763In.A02(c1199Zs) || c1199Zs.A0D() == null) {
            c1079Uy = new com.facebook.ads.redexgen.core.C1079Uy(c1199Zs, this.A0D);
        } else {
            c1079Uy = new com.facebook.ads.redexgen.core.C1079Uy(c1199Zs, c1199Zs.A0D(), this.A0D);
        }
        this.A0E = c1079Uy;
        this.A0B = new com.facebook.ads.redexgen.core.C0882Nj(c1199Zs, this.A0E);
        this.A0B.setId(android.view.View.generateViewId());
        this.A0B.setListener(new com.facebook.ads.redexgen.core.C1081Va(this));
        this.A0E.setBrowserNavigationListener(this.A0B.getBrowserNavigationListener());
        this.A0C = new com.facebook.ads.redexgen.core.C0883Nk(c1199Zs, null, android.R.attr.progressBarStyleHorizontal);
        A0F();
        c5q.A0A(this.A06);
    }

    public com.facebook.ads.redexgen.core.InterfaceC0891Ns A0E() {
        return new com.facebook.ads.redexgen.core.VZ(this);
    }

    public void A0F() {
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10);
        this.A0A.A3q(this.A0B, layoutParams);
        android.widget.RelativeLayout.LayoutParams webViewParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        webViewParams.addRule(3, this.A0B.getId());
        webViewParams.addRule(12);
        this.A0A.A3q(this.A0E, webViewParams);
        android.widget.RelativeLayout.LayoutParams webViewParams2 = new android.widget.RelativeLayout.LayoutParams(-1, (int) (com.facebook.ads.redexgen.core.LP.A02 * 2.0f));
        webViewParams2.addRule(3, this.A0B.getId());
        this.A0C.setProgress(0);
        this.A0A.A3q(this.A0C, webViewParams2);
    }

    public void A0G() {
        this.A07.finish(1);
    }

    public void A0H(java.lang.String str) {
    }

    public void A9q(android.content.Intent intent, android.os.Bundle bundle, com.facebook.ads.redexgen.core.C5Q c5q) {
        if (this.A01 < 0) {
            this.A01 = java.lang.System.currentTimeMillis();
        }
        java.lang.String strA0C = A0C(231, 11, 97);
        java.lang.String strA0C2 = A0C(220, 11, 26);
        java.lang.String url = A0C(210, 10, 13);
        if (bundle == null) {
            this.A02 = intent.getStringExtra(url);
            this.A04 = intent.getStringExtra(strA0C2);
            this.A00 = intent.getLongExtra(strA0C, -1L);
        } else {
            this.A02 = bundle.getString(url);
            this.A04 = bundle.getString(strA0C2);
            this.A00 = bundle.getLong(strA0C, -1L);
        }
        java.lang.String strA0C3 = this.A02 != null ? this.A02 : A0C(org.objectweb.asm.Opcodes.IFNONNULL, 11, 51);
        this.A0B.setUrl(strA0C3);
        this.A0E.loadUrl(strA0C3);
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public final void ACz(boolean z) {
        this.A0E.onPause();
        if (this.A03) {
            this.A03 = false;
            com.facebook.ads.redexgen.core.C0886Nn c0886NnA07 = new com.facebook.ads.redexgen.core.C0885Nm(this.A0E.getFirstUrl()).A01(this.A00).A03(this.A01).A04(this.A0E.getResponseEndMs()).A00(this.A0E.getDomContentLoadedMs()).A05(this.A0E.getScrollReadyMs()).A02(this.A0E.getLoadFinishMs()).A06(java.lang.System.currentTimeMillis()).A07();
            this.A09.A9v(this.A04, c0886NnA07.A02());
            if (com.facebook.ads.internal.api.BuildConfigApi.isDebug()) {
                java.lang.String str = A0C(org.objectweb.asm.Opcodes.RET, 30, 15) + java.lang.System.currentTimeMillis() + A0C(org.objectweb.asm.Opcodes.FCMPL, 20, 60) + c0886NnA07.A01 + A0C(53, 22, 121) + c0886NnA07.A03 + A0C(75, 24, 83) + c0886NnA07.A04 + A0C(0, 30, 124) + c0886NnA07.A00 + A0C(99, 24, 75) + c0886NnA07.A05 + A0C(30, 23, 22) + c0886NnA07.A02 + A0C(123, 26, 113) + c0886NnA07.A06;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public final void ADN(boolean z) {
        this.A0E.onResume();
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public final void AFx(android.os.Bundle bundle) {
        bundle.putString(A0C(210, 10, 13), this.A02);
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public java.lang.String getCurrentClientToken() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public final boolean onActivityResult(int i, int i2, android.content.Intent intent) {
        return false;
    }

    public void onDestroy() {
        this.A07.A0B(this.A06);
        com.facebook.ads.redexgen.core.O4.A03(this.A0E);
        this.A0E.destroy();
    }

    public void setListener(com.facebook.ads.redexgen.core.MR mr) {
    }
}

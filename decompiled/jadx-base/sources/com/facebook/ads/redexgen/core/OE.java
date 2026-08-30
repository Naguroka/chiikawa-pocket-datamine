package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class OE extends android.widget.LinearLayout {
    public static byte[] A0A;
    public static final android.widget.LinearLayout.LayoutParams A0B;
    public android.widget.LinearLayout A00;
    public android.widget.TextView A01;
    public java.lang.String A02;
    public boolean A03;
    public final int A04;
    public final android.view.View.OnClickListener A05;
    public final android.widget.RelativeLayout A06;
    public final com.facebook.ads.redexgen.core.C1199Zs A07;
    public final com.facebook.ads.redexgen.core.ViewOnClickListenerC1063Ui A08;
    public final com.facebook.ads.redexgen.core.OU A09;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 11);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A0A = new byte[]{-96, -93, -93, -92, -77, -96, -88, -85, -78};
    }

    public abstract void A0D(int i);

    static {
        A01();
        A0B = new android.widget.LinearLayout.LayoutParams(-2, -2);
    }

    public OE(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, int i, com.facebook.ads.redexgen.core.C1O c1o, boolean z, java.lang.String str, com.facebook.ads.redexgen.core.J7 j7, com.facebook.ads.redexgen.core.MR mr, com.facebook.ads.redexgen.core.C0987Rk c0987Rk, com.facebook.ads.redexgen.core.C0842Lv c0842Lv, com.facebook.ads.redexgen.core.C1T c1t, boolean z2, java.lang.String str2) {
        super(c1199Zs);
        this.A02 = A00(0, 0, 37);
        com.facebook.ads.redexgen.core.M3.A0K(this);
        this.A07 = c1199Zs;
        this.A04 = i;
        this.A03 = z2;
        this.A02 = str2;
        this.A09 = new com.facebook.ads.redexgen.core.OU(c1199Zs);
        com.facebook.ads.redexgen.core.M3.A0M(this.A09, 0);
        com.facebook.ads.redexgen.core.M3.A0K(this.A09);
        if (z2) {
            this.A00 = new android.widget.LinearLayout(c1199Zs);
            this.A01 = new android.widget.TextView(c1199Zs);
            com.facebook.ads.redexgen.core.M3.A0K(this.A01);
        }
        this.A08 = new com.facebook.ads.redexgen.core.ViewOnClickListenerC1063Ui(c1199Zs, str, c1o, z, j7, mr, c0987Rk, c0842Lv, c1t);
        com.facebook.ads.redexgen.core.M3.A0G(1001, this.A08);
        this.A05 = com.facebook.ads.redexgen.core.AbstractC0904Of.A03(this.A08, A00(0, 9, 52));
        this.A06 = new android.widget.RelativeLayout(c1199Zs);
        this.A06.setLayoutParams(A0B);
        com.facebook.ads.redexgen.core.M3.A0K(this.A06);
    }

    public void A0C() {
        this.A09.setOnClickListener(this.A05);
    }

    public final com.facebook.ads.redexgen.core.ViewOnClickListenerC1063Ui getCTAButton() {
        return this.A08;
    }

    public android.view.View getExpandableLayout() {
        return null;
    }

    public final android.widget.ImageView getIconView() {
        return this.A09;
    }

    public void setInfo(com.facebook.ads.redexgen.core.C1M c1m, com.facebook.ads.redexgen.core.C1P c1p, java.lang.String str, java.lang.String str2, com.facebook.ads.redexgen.core.LZ lz, com.facebook.ads.redexgen.core.OG og) {
        this.A08.setCta(c1p, str, new java.util.HashMap(), lz, og);
        new com.facebook.ads.redexgen.core.AsyncTaskC1068Un(this.A09, this.A07).A05(this.A04, this.A04).A07(str2);
    }

    public void setTitleMaxLines(int i) {
    }
}

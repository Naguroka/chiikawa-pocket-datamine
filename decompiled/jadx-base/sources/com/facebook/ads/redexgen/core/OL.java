package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class OL extends android.widget.Button {
    public static java.lang.String[] A0A = {"AuzWZ8osEfq4z249PYqxDxnd", "GmaNjpajnwuNMOpMTnafkSdm", "IXSwi1vel7aGkSvKIjHlp", "5xYCukR2VNv2y0", "9gt7y21mjsR", "XkvVk", "YCgMHGcNxR5BY", "3lMWF0VDfBsAiU48Gpk3b"};
    public static final int A0B = (int) (com.facebook.ads.redexgen.core.LP.A02 * 16.0f);
    public static final int A0C = (int) (com.facebook.ads.redexgen.core.LP.A02 * 4.0f);
    public int A00;
    public int A01;
    public com.facebook.ads.redexgen.core.C1O A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final float A06;
    public final int A07;
    public final java.lang.Runnable A08;
    public final java.lang.Runnable A09;

    public OL(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.C1O c1o) {
        super(c1199Zs);
        this.A03 = false;
        this.A01 = 0;
        this.A00 = 0;
        this.A04 = true;
        this.A05 = false;
        this.A08 = new com.facebook.ads.redexgen.core.C1062Uh(this);
        this.A09 = new com.facebook.ads.redexgen.core.C1061Ug(this);
        this.A02 = c1o;
        this.A07 = com.facebook.ads.redexgen.core.C0762Im.A05(c1199Zs);
        this.A06 = com.facebook.ads.redexgen.core.C0762Im.A00(c1199Zs);
        com.facebook.ads.redexgen.core.M3.A0Y(this, false, 16);
        setGravity(17);
        A03();
    }

    private void A03() {
        if (this.A02 != null) {
            this.A00 = this.A02.A08(this.A05);
            this.A01 = this.A02.A09(this.A05);
        }
        com.facebook.ads.redexgen.core.M3.A0O(this, this.A00, this.A04 ? A0C : 0);
        setTextColor(this.A01);
    }

    private void A04() {
        if (this.A07 < 0 || this.A03) {
            return;
        }
        this.A03 = true;
        java.lang.String[] strArr = A0A;
        if (strArr[1].length() != strArr[0].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0A;
        strArr2[1] = "QVGWsKZ9hUXhPHMuZeCIqAcU";
        strArr2[0] = "lfolaSZCl8ASaScD6QDCGzAz";
        if (com.facebook.ads.redexgen.core.C0762Im.A2W(getContext()) && android.os.Build.VERSION.SDK_INT >= 16) {
            postDelayed(this.A08, this.A07);
        }
    }

    public com.facebook.ads.redexgen.core.C1O getColorInfo() {
        return this.A02;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        A04();
    }

    public void setRoundedCornersEnabled(boolean z) {
        this.A04 = z;
        A03();
    }

    public void setText(java.lang.String str) {
        super.setText((java.lang.CharSequence) str.toUpperCase(java.util.Locale.US));
    }

    public void setUpButtonColors(com.facebook.ads.redexgen.core.C1O c1o) {
        this.A02 = c1o;
        A03();
    }

    public void setViewShowsOverMedia(boolean z) {
        this.A05 = z;
        A03();
    }
}

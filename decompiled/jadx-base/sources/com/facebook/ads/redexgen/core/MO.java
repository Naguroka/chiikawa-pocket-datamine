package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class MO extends android.widget.LinearLayout {
    public static byte[] A04;
    public static final int A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public final android.widget.ImageView A00;
    public final android.widget.ImageView A01;
    public final com.facebook.ads.redexgen.core.C2S A02;
    public final com.facebook.ads.redexgen.core.C1199Zs A03;

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 118);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{103, 66};
    }

    static {
        A03();
        A08 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 50.0f);
        A05 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 10.0f);
        A06 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 20.0f);
        A09 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 4.0f);
        A07 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 12.0f);
    }

    public MO(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, int i) {
        super(c1199Zs);
        this.A03 = c1199Zs;
        this.A02 = com.facebook.ads.redexgen.core.C2T.A00(c1199Zs.A01());
        setOrientation(0);
        this.A00 = new android.widget.ImageView(c1199Zs);
        this.A01 = new android.widget.ImageView(c1199Zs);
        A04(i);
    }

    private void A04(int i) {
        com.facebook.ads.redexgen.core.MB mb;
        A05(this.A00, com.facebook.ads.redexgen.core.MB.AD_CHOICES_ICON);
        if (i == 2) {
            setPadding(A05, A05 / 3, A05, A05 / 3);
            android.widget.TextView textView = new android.widget.TextView(this.A03);
            textView.setText(A02(0, 2, 80));
            textView.setTextColor(-1);
            textView.setPadding(0, A05 / 2, A05 / 2, A05 / 2);
            com.facebook.ads.redexgen.core.M3.A0Y(textView, true, 13);
            android.widget.LinearLayout.LayoutParams textViewParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
            textViewParams.gravity = 16;
            addView(textView, textViewParams);
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(A07, A07);
            layoutParams.gravity = 16;
            addView(this.A00, layoutParams);
            return;
        }
        setPadding(A05, A05, A05, A05);
        if (i == 1) {
            mb = com.facebook.ads.redexgen.core.MB.AN_INFO_ICON;
        } else {
            mb = com.facebook.ads.redexgen.core.MB.DEFAULT_INFO_ICON;
        }
        A05(this.A01, mb);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(A06, A06);
        layoutParams2.gravity = 17;
        addView(this.A01, layoutParams2);
        android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(A06, A06);
        layoutParams3.setMargins(A09, 0, 0, 0);
        layoutParams3.gravity = 17;
        addView(this.A00, layoutParams3);
    }

    public static void A05(android.widget.ImageView imageView, com.facebook.ads.redexgen.core.MB mb) {
        imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        imageView.setImageBitmap(com.facebook.ads.redexgen.core.MC.A01(mb));
        imageView.setColorFilter(-1);
    }

    public void setAdDetails(com.facebook.ads.redexgen.core.C1Z c1z, java.lang.String str, com.facebook.ads.redexgen.core.JF jf, com.facebook.ads.redexgen.core.MR mr) {
        setOnClickListener(new com.facebook.ads.redexgen.core.MN(this, jf, mr, str, c1z));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(A08);
        gradientDrawable.setColor(i);
        com.facebook.ads.redexgen.core.M3.A0S(this, gradientDrawable);
    }

    public void setIconColors(int i) {
        this.A00.setColorFilter(i);
        this.A01.setColorFilter(i);
    }
}

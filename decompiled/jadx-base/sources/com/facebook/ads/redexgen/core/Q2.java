package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class Q2 extends android.widget.RelativeLayout {
    public com.facebook.ads.redexgen.core.ViewOnClickListenerC1063Ui A00;
    public final android.view.View.OnClickListener A01;
    public final com.facebook.ads.redexgen.core.C1M A02;
    public final com.facebook.ads.redexgen.core.C1Z A03;
    public final com.facebook.ads.redexgen.core.C1199Zs A04;
    public final com.facebook.ads.redexgen.core.OU A05;
    public final com.facebook.ads.redexgen.core.C0899Oa A06;
    public final java.lang.String A07;
    public static final int A0B = (int) (com.facebook.ads.redexgen.core.LP.A02 * 2.0f);
    public static final int A0F = (int) (com.facebook.ads.redexgen.core.LP.A02 * 16.0f);
    public static final int A0D = (int) (com.facebook.ads.redexgen.core.LP.A02 * 20.0f);
    public static final int A0E = (int) (com.facebook.ads.redexgen.core.LP.A02 * 13.0f);
    public static final int A08 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 72.0f);
    public static final int A0C = (int) (com.facebook.ads.redexgen.core.LP.A02 * 8.0f);
    public static final int A0A = (int) (com.facebook.ads.redexgen.core.LP.A02 * 24.0f);
    public static final int A09 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 16.0f);

    public Q2(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.C1Z c1z, com.facebook.ads.redexgen.core.C1M c1m, com.facebook.ads.redexgen.core.ViewOnClickListenerC1063Ui viewOnClickListenerC1063Ui, java.lang.String str, android.view.View.OnClickListener onClickListener) {
        super(c1199Zs);
        this.A04 = c1199Zs;
        this.A03 = c1z;
        this.A02 = c1m;
        this.A00 = viewOnClickListenerC1063Ui;
        this.A07 = str;
        this.A01 = onClickListener;
        this.A05 = new com.facebook.ads.redexgen.core.OU(this.A04);
        this.A06 = new com.facebook.ads.redexgen.core.C0899Oa(this.A04, com.facebook.ads.redexgen.core.C1O.A01(null), true, false, true);
        A00();
    }

    private void A00() {
        com.facebook.ads.redexgen.core.AbstractC0900Ob.A00(this.A04, this, this.A03.A01());
        android.widget.ImageView imageView = new android.widget.ImageView(this.A04);
        imageView.setImageBitmap(com.facebook.ads.redexgen.core.MC.A01(com.facebook.ads.redexgen.core.MB.REDESIGN_CLOSE_ICON));
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(A0A, A0A);
        imageView.setColorFilter(-1);
        layoutParams.addRule(11);
        layoutParams.setMargins(A09, A09, A09, A09);
        imageView.setLayoutParams(layoutParams);
        addView(imageView);
        imageView.setOnClickListener(this.A01);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this.A04);
        linearLayout.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1));
        linearLayout.setGravity(17);
        linearLayout.setOrientation(1);
        android.widget.ImageView closeImageView = this.A05;
        com.facebook.ads.redexgen.core.M3.A0M(closeImageView, 0);
        this.A05.setRadius(A0B);
        new com.facebook.ads.redexgen.core.AsyncTaskC1068Un(this.A05, this.A04).A04().A07(this.A03.A01());
        this.A06.A03(this.A02.A08(), this.A03.A03(), null, false, true);
        this.A06.setAlignment(17);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(0, A0F, 0, A0F);
        this.A06.getDescriptionTextView().setText(this.A07);
        linearLayout.addView(this.A05, new android.widget.LinearLayout.LayoutParams(A08, A08));
        linearLayout.addView(this.A06, layoutParams2);
        if (this.A00 != null) {
            android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(-2, -2);
            this.A00.setPadding(A0D, A0E, A0D, A0E);
            this.A00.setLayoutParams(layoutParams3);
            com.facebook.ads.redexgen.core.M3.A0S(this.A00, com.facebook.ads.redexgen.core.M3.A06(-16738826, A0C));
            if (android.os.Build.VERSION.SDK_INT >= 21) {
                this.A00.setStateListAnimator(null);
            }
            com.facebook.ads.redexgen.core.M3.A0X(this.A00);
            linearLayout.addView(this.A00);
        }
        addView(linearLayout);
    }
}

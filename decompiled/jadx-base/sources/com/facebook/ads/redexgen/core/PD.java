package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class PD extends android.widget.FrameLayout {
    public final int A00;
    public final android.widget.RelativeLayout A01;
    public final com.facebook.ads.redexgen.core.ViewOnClickListenerC1063Ui A02;
    public static final int A05 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 36.0f);
    public static final int A06 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 36.0f);
    public static final int A03 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 23.0f);
    public static final int A04 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 3.0f);
    public static final int A07 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 4.0f);

    public PD(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cD, com.facebook.ads.redexgen.core.J7 j7, com.facebook.ads.redexgen.core.MR mr, com.facebook.ads.redexgen.core.C0987Rk c0987Rk, com.facebook.ads.redexgen.core.C0842Lv c0842Lv, com.facebook.ads.redexgen.core.C1O c1o, com.facebook.ads.redexgen.core.OG og) {
        super(c1199Zs);
        this.A00 = c1o.A08(true);
        this.A01 = new android.widget.RelativeLayout(c1199Zs);
        addView(this.A01, new android.widget.FrameLayout.LayoutParams(-1, -1));
        this.A01.setClickable(false);
        A01(c1199Zs, abstractC1341cD.A1P().A0G().A04());
        this.A02 = new com.facebook.ads.redexgen.core.ViewOnClickListenerC1063Ui(c1199Zs, abstractC1341cD.A0Y(), (com.facebook.ads.redexgen.core.C1O) null, j7, mr, c0987Rk, c0842Lv, abstractC1341cD.A1Q());
        this.A02.setCta(abstractC1341cD.A1P().A0G(), abstractC1341cD.A1U(), new java.util.HashMap(), og);
        this.A02.setIsInAppBrowser(true);
        android.widget.FrameLayout.LayoutParams ctaButtonParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        addView(this.A02, ctaButtonParams);
    }

    private void A00(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, android.view.View view) {
        android.widget.ImageView imageView = new android.widget.ImageView(c1199Zs);
        imageView.setImageBitmap(com.facebook.ads.redexgen.core.MC.A01(com.facebook.ads.redexgen.core.MB.MINIMIZE_ARROW));
        imageView.setRotation(180.0f);
        imageView.setClickable(false);
        imageView.setColorFilter(this.A00);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(A03, A03);
        imageView.setPadding(A04, A04, A04, A04);
        layoutParams.addRule(2, view.getId());
        layoutParams.addRule(14);
        this.A01.addView(imageView, layoutParams);
    }

    private void A01(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, java.lang.String str) {
        android.widget.Button button = new android.widget.Button(c1199Zs);
        com.facebook.ads.redexgen.core.M3.A0K(button);
        button.setPadding(A06, 0, A06, 0);
        button.setText(str.toUpperCase(java.util.Locale.getDefault()));
        button.setTextSize(14.0f);
        button.setTypeface(android.graphics.Typeface.defaultFromStyle(1));
        com.facebook.ads.redexgen.core.M3.A0O(button, this.A00, A07);
        button.setTextColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        android.widget.RelativeLayout.LayoutParams ctaParams = new android.widget.RelativeLayout.LayoutParams(-2, A05);
        ctaParams.addRule(12);
        ctaParams.addRule(14);
        this.A01.addView(button, ctaParams);
        A00(c1199Zs, button);
    }

    public final void A02(java.lang.String str) {
        this.A02.A09(str);
    }

    @Override // android.view.View
    public final boolean performClick() {
        return this.A02.performClick();
    }

    public void setAutoClickTime(com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cD, com.facebook.ads.redexgen.core.MQ mq) {
        this.A02.A0A(abstractC1341cD, mq);
    }
}

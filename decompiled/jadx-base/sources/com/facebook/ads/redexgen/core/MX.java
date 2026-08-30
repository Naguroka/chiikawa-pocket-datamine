package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class MX extends com.facebook.ads.internal.api.AdNativeComponentView {
    public final android.widget.LinearLayout A00;
    public final android.widget.RelativeLayout A01;
    public final android.widget.RelativeLayout A02;
    public final android.widget.TextView A03;
    public final android.widget.TextView A04;
    public final android.widget.TextView A05;
    public final com.facebook.ads.redexgen.core.JW A06;
    public final com.facebook.ads.redexgen.core.V8 A07;
    public static java.lang.String[] A08 = {"cqqrkZtRQb88kyLB6Q2uvm01R0QnuoNK", "Nq3CfSfg25oVaXc5kCSSNTYEBmLkWVpQ", "Ug05W3SKca0ZbWrt9dtmEm51Q", "w8D7pTd1AENWsOJ7Gbtv6zmPYShcD12", "Jz7rkQN0I2l0GA78AAlVWxdn72", "N7yF5pKoWcUwU52GLomX8fL4MB9AuJQz", "7uQymxnuKPwGh5iPF3bNh6uz1YyZJI6b", "PV6rNOTmS7sV6l09QwDyTUKdw7Zl10tb"};
    public static final int A09 = ((int) com.facebook.ads.redexgen.core.LP.A02) * 500;
    public static final int A0H = (int) (com.facebook.ads.redexgen.core.LP.A02 * 500.0f);
    public static final int A0D = (int) (com.facebook.ads.redexgen.core.LP.A02 * 4.0f);
    public static final int A0B = (int) (com.facebook.ads.redexgen.core.LP.A02 * 8.0f);
    public static final int A0G = (int) (com.facebook.ads.redexgen.core.LP.A02 * 8.0f);
    public static final int A0E = (int) (com.facebook.ads.redexgen.core.LP.A02 * 4.0f);
    public static final int A0C = (int) com.facebook.ads.redexgen.core.LP.A02;
    public static final int A0F = (int) (com.facebook.ads.redexgen.core.LP.A02 * 4.0f);
    public static final int A0A = (int) (((double) com.facebook.ads.redexgen.core.LP.A02) * 0.5d);

    public MX(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.JW jw) {
        super(c1199Zs);
        this.A06 = jw;
        this.A05 = new android.widget.TextView(c1199Zs);
        this.A04 = new android.widget.TextView(c1199Zs);
        this.A03 = new android.widget.TextView(c1199Zs);
        this.A02 = new android.widget.RelativeLayout(c1199Zs);
        this.A00 = new android.widget.LinearLayout(c1199Zs);
        this.A01 = new android.widget.RelativeLayout(c1199Zs);
        this.A07 = new com.facebook.ads.redexgen.core.V8(c1199Zs);
        A09();
        A0D();
        A05();
        A0A();
        A00();
        A0B();
        A03();
        A0A();
        A08();
        A0C();
    }

    private void A00() {
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams.weight = 1.0f;
        layoutParams.gravity = 1;
        this.A00.addView(this.A01, layoutParams);
    }

    private void A01() {
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(3, this.A04.getId());
        com.facebook.ads.redexgen.core.M3.A0J(this.A03);
        this.A02.addView(this.A03, layoutParams);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        this.A02.setBackgroundDrawable(null);
        this.A02.setPadding(A0G, A0G, A0G, A0G);
        com.facebook.ads.redexgen.core.M3.A0J(this.A02);
        this.A00.addView(this.A02, layoutParams2);
    }

    private void A02() {
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(A0B, A0D, A0B, A0D);
        com.facebook.ads.redexgen.core.M3.A0J(this.A03);
        this.A00.addView(this.A03, layoutParams);
    }

    private void A03() {
        this.A01.addView(this.A07, new android.widget.LinearLayout.LayoutParams(-2, -1));
    }

    private void A04() {
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(8, this.A07.getId());
        layoutParams.addRule(5, this.A07.getId());
        layoutParams.addRule(7, this.A07.getId());
        this.A02.setPadding(A0G, 0, A0G, 0);
        android.graphics.drawable.GradientDrawable shape = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.BOTTOM_TOP, new int[]{-872415232, 0});
        this.A02.setBackgroundDrawable(shape);
        com.facebook.ads.redexgen.core.M3.A0J(this.A02);
        this.A01.addView(this.A02, layoutParams);
    }

    private void A05() {
        addView(this.A00, new android.widget.LinearLayout.LayoutParams(-2, -2));
    }

    private void A06() {
        this.A05.setTextColor(-1);
        this.A04.setTextColor(-1);
        this.A03.setTextColor(this.A06.A03());
    }

    private void A07() {
        this.A07.setMaxWidth(A0H);
        this.A05.setTextColor(this.A06.A04(0.2f));
        this.A04.setTextColor(this.A06.A04(0.4f));
        this.A03.setTextColor(this.A06.A03());
        ((android.widget.LinearLayout.LayoutParams) this.A01.getLayoutParams()).gravity = 1;
    }

    private void A08() {
        this.A03.setPadding(A0C, A0C, A0C, A0C);
        this.A03.setTextSize(14.0f);
        com.facebook.ads.redexgen.core.M3.A0K(this.A03);
    }

    private void A09() {
        setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-2, -1));
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setColor(this.A06.A01());
        gradientDrawable.setCornerRadius(A0F);
        gradientDrawable.setStroke(1, this.A06.A02());
        setBackgroundDrawable(gradientDrawable);
        setPadding(A0A, A0A, A0A, A0A);
    }

    private void A0A() {
        com.facebook.ads.redexgen.core.M3.A0K(this.A01);
    }

    private void A0B() {
        this.A07.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
        this.A07.setRadius(new float[]{A0F, A0F, A0F, A0F, 0.0f, 0.0f, 0.0f, 0.0f});
        this.A07.setAdjustViewBounds(true);
        com.facebook.ads.redexgen.core.LU.A04(this.A07, com.facebook.ads.redexgen.core.LU.A0B);
        com.facebook.ads.redexgen.core.M3.A0K(this.A07);
    }

    private void A0C() {
        com.facebook.ads.redexgen.core.M3.A0K(this.A02);
        this.A05.setTextSize(14.0f);
        com.facebook.ads.redexgen.core.M3.A0K(this.A05);
        this.A05.setMaxLines(1);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, 0, A0E);
        this.A02.addView(this.A05, layoutParams);
        this.A04.setTextSize(12.0f);
        com.facebook.ads.redexgen.core.M3.A0K(this.A04);
        this.A04.setMaxLines(1);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(3, this.A05.getId());
        layoutParams2.setMargins(0, 0, 0, A0E);
        this.A02.addView(this.A04, layoutParams2);
    }

    private void A0D() {
        this.A00.setOrientation(1);
        com.facebook.ads.redexgen.core.M3.A0K(this.A00);
    }

    @Override // com.facebook.ads.internal.api.AdNativeComponentView
    public android.view.View getAdContentsView() {
        return this.A07;
    }

    public android.widget.ImageView getImageCardView() {
        return this.A07;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0018  */
    @Override // com.facebook.ads.internal.api.AdNativeComponentView, android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iA0F = ((int) com.facebook.ads.redexgen.core.LP.A02) * com.facebook.ads.redexgen.core.C0762Im.A0F(getContext());
        int heightThreshold = android.view.View.MeasureSpec.getSize(i2);
        if (heightThreshold < iA0F) {
            int heightThreshold2 = android.view.View.MeasureSpec.getMode(i2);
            if (heightThreshold2 == 0) {
                A01();
                A07();
            } else {
                A02();
                A04();
                A06();
            }
        } else {
            A01();
            A07();
        }
        super.onMeasure(i, i2);
    }

    public void setButtonText(java.lang.String str) {
        if (str == null || str.trim().isEmpty()) {
            this.A03.setVisibility(8);
            return;
        }
        android.text.SpannableString spannableString = new android.text.SpannableString(str);
        spannableString.setSpan(new android.text.style.StyleSpan(1), 0, spannableString.length(), 0);
        this.A03.setText(spannableString);
    }

    public void setSubtitle(java.lang.String str) {
        if (str == null || str.trim().isEmpty()) {
            this.A04.setVisibility(8);
        }
        this.A04.setText(str);
        java.lang.String[] strArr = A08;
        if (strArr[0].charAt(31) == strArr[6].charAt(31)) {
            throw new java.lang.RuntimeException();
        }
        A08[3] = "tjmDQp9WMGCYDxrOu8tbgj2JMnaMPXF";
    }

    public void setTitle(java.lang.String str) {
        if (str == null || str.trim().isEmpty()) {
            this.A05.setVisibility(8);
        }
        this.A05.setText(str);
    }
}

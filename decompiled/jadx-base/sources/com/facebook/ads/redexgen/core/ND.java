package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ND extends android.widget.RelativeLayout {
    public final int A00;
    public final int A01;
    public final com.facebook.ads.redexgen.core.C2S A02;
    public final com.facebook.ads.redexgen.core.C1199Zs A03;
    public final com.facebook.ads.redexgen.core.NG A04;
    public final boolean A05;
    public static final int A09 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 16.0f);
    public static final int A0A = (int) (com.facebook.ads.redexgen.core.LP.A02 * 8.0f);
    public static final int A0D = (int) (com.facebook.ads.redexgen.core.LP.A02 * 44.0f);
    public static final int A08 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 10.0f);
    public static final int A07 = A09 - A08;
    public static final int A0E = (int) (com.facebook.ads.redexgen.core.LP.A02 * 75.0f);
    public static final int A0B = (int) (com.facebook.ads.redexgen.core.LP.A02 * 25.0f);
    public static final int A0F = (int) (com.facebook.ads.redexgen.core.LP.A02 * 45.0f);
    public static final int A0C = (int) (com.facebook.ads.redexgen.core.LP.A02 * 15.0f);
    public static final int A06 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 16.0f);

    public ND(com.facebook.ads.redexgen.core.NC nc) {
        super(nc.A0C);
        this.A03 = nc.A0C;
        this.A02 = com.facebook.ads.redexgen.core.C2T.A00(this.A03.A01());
        this.A04 = nc.A02;
        this.A01 = nc.A0B ? A0E : A0F;
        this.A00 = nc.A0B ? A0B : A0C;
        this.A05 = nc.A07;
        setFocusable(true);
        android.view.View viewA01 = A01(nc);
        android.view.View viewA00 = A00(nc);
        android.view.View footerView = getFooterView();
        com.facebook.ads.redexgen.core.M3.A0K(viewA01);
        com.facebook.ads.redexgen.core.M3.A0K(viewA00);
        com.facebook.ads.redexgen.core.M3.A0K(footerView);
        android.widget.RelativeLayout.LayoutParams contentParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        contentParams.addRule(10);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        layoutParams.addRule(3, viewA01.getId());
        layoutParams.addRule(2, footerView.getId());
        android.widget.RelativeLayout.LayoutParams footerParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        footerParams.addRule(12);
        footerParams.setMargins(A09, 0, A09, A09);
        addView(viewA01, contentParams);
        addView(viewA00, layoutParams);
        addView(footerView, footerParams);
        footerView.setVisibility(nc.A08 ? 0 : 8);
    }

    public /* synthetic */ ND(com.facebook.ads.redexgen.core.NC nc, com.facebook.ads.redexgen.core.NA na) {
        this(nc);
    }

    private android.view.View A00(com.facebook.ads.redexgen.core.NC nc) {
        android.widget.ImageView imageView = new android.widget.ImageView(getContext());
        imageView.setPadding(this.A00, this.A00, this.A00, this.A00);
        imageView.setImageBitmap(com.facebook.ads.redexgen.core.MC.A01(nc.A01));
        imageView.setColorFilter(-1);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(this.A01, this.A01);
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(nc.A00);
        com.facebook.ads.redexgen.core.M3.A0S(imageView, gradientDrawable);
        layoutParams.gravity = 17;
        layoutParams.setMargins(A09, 0, A09, A09);
        android.widget.TextView subtitleView = new android.widget.TextView(getContext());
        com.facebook.ads.redexgen.core.M3.A0Y(subtitleView, true, 20);
        subtitleView.setTextColor(-14934495);
        subtitleView.setText(nc.A06);
        subtitleView.setGravity(17);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(A09, 0, A09, A09);
        android.widget.TextView titleView = new android.widget.TextView(getContext());
        com.facebook.ads.redexgen.core.M3.A0Y(titleView, false, 16);
        titleView.setTextColor(-10459280);
        titleView.setText(nc.A05);
        titleView.setGravity(17);
        android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(A09, 0, A09, A09);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(subtitleView, layoutParams2);
        linearLayout.addView(titleView, layoutParams3);
        if (nc.A09) {
            android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(getContext());
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(17);
            if (!android.text.TextUtils.isEmpty(nc.A04)) {
                com.facebook.ads.redexgen.core.OU ou = new com.facebook.ads.redexgen.core.OU(this.A03);
                android.widget.LinearLayout.LayoutParams iconParams = new android.widget.LinearLayout.LayoutParams(A0F, A0F);
                iconParams.setMargins(0, 0, A0A, 0);
                ou.setFullCircleCorners(true);
                new com.facebook.ads.redexgen.core.AsyncTaskC1068Un(ou, this.A03).A05(A0F, A0F).A07(nc.A04);
                linearLayout2.addView(ou, iconParams);
            }
            com.facebook.ads.redexgen.core.NI ni = new com.facebook.ads.redexgen.core.NI(this.A03);
            ni.setData(nc.A03, com.facebook.ads.redexgen.core.MB.CHECKMARK);
            ni.setSelected(true);
            linearLayout2.addView(ni, new android.widget.LinearLayout.LayoutParams(-2, -2));
            linearLayout.addView(linearLayout2);
        }
        return linearLayout;
    }

    private android.view.View A01(com.facebook.ads.redexgen.core.NC nc) {
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(getContext());
        linearLayout.setOrientation(0);
        if (nc.A0A) {
            android.widget.ImageView imageView = new android.widget.ImageView(getContext());
            imageView.setPadding(A08, A08, A08, A08);
            imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
            imageView.setImageBitmap(com.facebook.ads.redexgen.core.MC.A01(com.facebook.ads.redexgen.core.MB.CROSS));
            imageView.setOnClickListener(new com.facebook.ads.redexgen.core.NA(this));
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(A0D, A0D);
            layoutParams.setMargins(A07, A07, A07, A07);
            linearLayout.addView(imageView, layoutParams);
        }
        return linearLayout;
    }

    private android.view.View getFooterView() {
        android.widget.ImageView imageView = new android.widget.ImageView(getContext());
        imageView.setImageBitmap(com.facebook.ads.redexgen.core.MC.A01(com.facebook.ads.redexgen.core.MB.SETTINGS));
        imageView.setColorFilter(-13272859);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(A06, A06);
        layoutParams.gravity = 17;
        android.widget.TextView textView = new android.widget.TextView(getContext());
        com.facebook.ads.redexgen.core.M3.A0Y(textView, false, 16);
        textView.setTextColor(-13272859);
        textView.setPadding(A0A, A0A, A0A, A0A);
        textView.setText(this.A02.A0J());
        android.widget.LinearLayout.LayoutParams settingsIconParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        settingsIconParams.gravity = 17;
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setOnClickListener(new com.facebook.ads.redexgen.core.NB(this));
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, settingsIconParams);
        return linearLayout;
    }
}

package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class NI extends android.widget.LinearLayout {
    public boolean A00;
    public final android.widget.ImageView A01;
    public final android.widget.TextView A02;
    public static final int A04 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 16.0f);
    public static final int A05 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 12.0f);
    public static final int A06 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 12.0f);
    public static final int A03 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 16.0f);

    public NI(com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        super(c1199Zs);
        this.A00 = false;
        setOrientation(0);
        setPadding(A04, A05, A04, A05);
        this.A01 = new android.widget.ImageView(getContext());
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(A03, A03);
        layoutParams.gravity = 17;
        this.A02 = new android.widget.TextView(getContext());
        android.view.ViewGroup.LayoutParams textViewParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        addView(this.A01, layoutParams);
        addView(this.A02, textViewParams);
        A00();
    }

    private void A00() {
        int textColor;
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(this.A00 ? -13272859 : -1315344);
        gradientDrawable.setCornerRadius(50.0f);
        com.facebook.ads.redexgen.core.M3.A0S(this, gradientDrawable);
        com.facebook.ads.redexgen.core.M3.A0Y(this.A02, false, 14);
        if (this.A00) {
            textColor = -1;
        } else {
            textColor = -10459280;
        }
        this.A02.setTextColor(textColor);
        this.A01.setColorFilter(textColor);
    }

    public final void A01() {
        setSelected(!this.A00);
    }

    public void setData(java.lang.String str, com.facebook.ads.redexgen.core.MB mb) {
        this.A02.setText(str);
        if (mb != null) {
            this.A01.setImageBitmap(com.facebook.ads.redexgen.core.MC.A01(mb));
            this.A01.setVisibility(0);
            this.A02.setPadding(A06, 0, 0, 0);
        } else {
            this.A01.setVisibility(8);
            this.A02.setPadding(0, 0, 0, 0);
        }
        A00();
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        this.A00 = z;
        A00();
    }
}

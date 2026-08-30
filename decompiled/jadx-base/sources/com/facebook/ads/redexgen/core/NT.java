package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class NT extends android.widget.LinearLayout {
    public final android.widget.ImageView A00;
    public final android.widget.LinearLayout A01;
    public final android.widget.TextView A02;
    public static final int A05 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 8.0f);
    public static final int A06 = (int) (((double) com.facebook.ads.redexgen.core.LP.A02) * 14.5d);
    public static final int A04 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 20.0f);
    public static final android.widget.LinearLayout.LayoutParams A03 = new android.widget.LinearLayout.LayoutParams(-1, -2);

    public NT(com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        super(c1199Zs);
        this.A00 = new android.widget.ImageView(c1199Zs);
        this.A00.setColorFilter(-10459280);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(A04, A04);
        layoutParams.gravity = 16;
        this.A00.setLayoutParams(layoutParams);
        this.A01 = new android.widget.LinearLayout(c1199Zs);
        this.A01.setOrientation(1);
        this.A01.setPadding(A05 * 2, 0, 0, 0);
        android.widget.LinearLayout linearLayout = this.A01;
        android.widget.LinearLayout.LayoutParams iconParams = A03;
        linearLayout.setLayoutParams(iconParams);
        this.A02 = new android.widget.TextView(c1199Zs);
        com.facebook.ads.redexgen.core.M3.A0Y(this.A02, true, 16);
        this.A02.setTextColor(-14934495);
        android.widget.LinearLayout linearLayout2 = this.A01;
        android.widget.TextView textView = this.A02;
        android.widget.LinearLayout.LayoutParams iconParams2 = A03;
        linearLayout2.addView(textView, iconParams2);
        setOrientation(0);
        addView(this.A00);
        addView(this.A01);
    }

    public void setInfo(com.facebook.ads.redexgen.core.MB mb, java.lang.String str, java.lang.String str2) {
        this.A00.setImageBitmap(com.facebook.ads.redexgen.core.MC.A01(mb));
        this.A02.setText(str);
        if (!android.text.TextUtils.isEmpty(str2)) {
            android.widget.TextView textView = new android.widget.TextView(getContext());
            com.facebook.ads.redexgen.core.M3.A0Y(textView, false, 14);
            textView.setTextColor(-10459280);
            textView.setText(str2);
            this.A01.addView(textView, A03);
            setPadding(0, A05, 0, A05);
            return;
        }
        setPadding(0, A06, 0, A06);
    }
}

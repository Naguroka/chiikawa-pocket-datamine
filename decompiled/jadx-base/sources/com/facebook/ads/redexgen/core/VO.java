package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class VO extends com.facebook.ads.redexgen.core.OE {
    public final android.widget.TextView A00;
    public final android.widget.TextView A01;
    public static final int A02 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 36.0f);
    public static final int A05 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 4.0f);
    public static final int A03 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 8.0f);
    public static final int A04 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 4.0f);

    public VO(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, int i, com.facebook.ads.redexgen.core.C1O c1o, boolean z, java.lang.String str, com.facebook.ads.redexgen.core.J7 j7, com.facebook.ads.redexgen.core.MR mr, com.facebook.ads.redexgen.core.C0987Rk c0987Rk, com.facebook.ads.redexgen.core.C0842Lv c0842Lv, com.facebook.ads.redexgen.core.C1T c1t) {
        super(c1199Zs, i, c1o, z, str, j7, mr, c0987Rk, c0842Lv, c1t, false, "");
        setOrientation(0);
        setPadding(A05, A05, A05, A05);
        this.A01 = A02(-16448251, 13, true);
        this.A00 = A02(-10131605, 12, false);
        this.A06.addView(A01(i), new android.widget.LinearLayout.LayoutParams(-1, -2));
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        addView(this.A06, layoutParams);
        this.A08.setPadding(A03, 0, A03, 0);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-2, A02);
        layoutParams2.gravity = 17;
        addView(this.A08, layoutParams2);
    }

    private android.widget.LinearLayout A01(int i) {
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this.A07);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(A04, 0, A04, 0);
        linearLayout.addView(this.A01, com.facebook.ads.redexgen.core.OE.A0B);
        linearLayout.addView(this.A00, com.facebook.ads.redexgen.core.OE.A0B);
        android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(this.A07);
        linearLayout2.setOrientation(0);
        linearLayout2.addView(this.A09, new android.widget.LinearLayout.LayoutParams(i, i));
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 16;
        linearLayout2.addView(linearLayout, layoutParams);
        return linearLayout2;
    }

    private android.widget.TextView A02(int i, int i2, boolean z) {
        android.widget.TextView textView = new android.widget.TextView(this.A07);
        textView.setTextColor(i);
        textView.setSingleLine(true);
        textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
        com.facebook.ads.redexgen.core.M3.A0Y(textView, z, i2);
        return textView;
    }

    @Override // com.facebook.ads.redexgen.core.OE
    public final void A0C() {
        super.A0C();
        this.A01.setOnClickListener(this.A05);
        this.A00.setOnClickListener(this.A05);
    }

    @Override // com.facebook.ads.redexgen.core.OE
    public final void A0D(int i) {
    }

    @Override // com.facebook.ads.redexgen.core.OE
    public void setInfo(com.facebook.ads.redexgen.core.C1M c1m, com.facebook.ads.redexgen.core.C1P c1p, java.lang.String str, java.lang.String str2, com.facebook.ads.redexgen.core.LZ lz, com.facebook.ads.redexgen.core.OG og) {
        super.setInfo(c1m, c1p, str, str2, lz, og);
        this.A01.setText(c1m.A08());
        this.A00.setText(c1m.A07());
        if (android.text.TextUtils.isEmpty(c1p.A04())) {
            com.facebook.ads.redexgen.core.M3.A0H(this.A08);
        }
    }
}

package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class OT extends android.widget.LinearLayout {
    public int A00;
    public java.util.List<android.graphics.drawable.GradientDrawable> A01;
    public final int A02;
    public final int A03;
    public final int A04;

    public OT(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.C1O c1o, int i) {
        super(c1199Zs);
        this.A00 = -1;
        setOrientation(0);
        setGravity(17);
        float f = com.facebook.ads.redexgen.core.LP.A02;
        int i2 = (int) (8.0f * f);
        int i3 = (int) (6.0f * f);
        this.A02 = (int) (1.0f * f);
        this.A04 = c1o.A04(false);
        this.A03 = com.facebook.ads.redexgen.core.AbstractC03842p.A01(this.A04, 128);
        this.A01 = new java.util.ArrayList();
        for (int margin = 0; margin < i; margin++) {
            android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setSize(i2, i2);
            gradientDrawable.setStroke(this.A02, 0);
            android.widget.ImageView imageView = new android.widget.ImageView(c1199Zs);
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, 0, i3, 0);
            layoutParams.gravity = 17;
            imageView.setLayoutParams(layoutParams);
            imageView.setImageDrawable(gradientDrawable);
            this.A01.add(gradientDrawable);
            addView(imageView);
        }
        A00(0);
    }

    public final void A00(int i) {
        int i2;
        int borderColor;
        if (this.A00 == i) {
            return;
        }
        this.A00 = i;
        for (int i3 = 0; i3 < i; i3++) {
            if (i3 == i) {
                i2 = this.A04;
                borderColor = this.A04;
            } else {
                i2 = this.A03;
                borderColor = 0;
            }
            android.graphics.drawable.GradientDrawable gradientDrawable = this.A01.get(i3);
            int i4 = this.A02;
            gradientDrawable.setStroke(i4, borderColor);
            this.A01.get(i3).setColor(i2);
            this.A01.get(i3).invalidateSelf();
        }
    }
}

package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class OW extends android.widget.LinearLayout {
    public static final int A06 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 4.0f);
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final com.facebook.ads.redexgen.core.C1199Zs A04;
    public final com.facebook.ads.redexgen.core.OX[] A05;

    public OW(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, int i, int i2, int i3, int i4) {
        super(c1199Zs);
        this.A00 = A06;
        this.A04 = c1199Zs;
        setOrientation(0);
        this.A03 = i;
        this.A01 = i3;
        this.A02 = i4;
        this.A05 = new com.facebook.ads.redexgen.core.OX[i2];
        for (int i5 = 0; i5 < i2; i5++) {
            this.A05[i5] = A00();
            addView(this.A05[i5]);
        }
        A01();
    }

    private com.facebook.ads.redexgen.core.OX A00() {
        com.facebook.ads.redexgen.core.OX ox = new com.facebook.ads.redexgen.core.OX(this.A04, this.A01, this.A02);
        android.widget.LinearLayout.LayoutParams starRatingViewParams = new android.widget.LinearLayout.LayoutParams(this.A03, this.A03);
        starRatingViewParams.gravity = 16;
        ox.setLayoutParams(starRatingViewParams);
        return ox;
    }

    private void A01() {
        int i = 0;
        while (i < i) {
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.A05[i].getLayoutParams();
            int i2 = i == 0 ? 0 : this.A00;
            layoutParams.leftMargin = i2;
            i++;
        }
        requestLayout();
    }

    private void A02(float f) {
        for (int i = 0; i < i; i++) {
            float fillRatio = java.lang.Math.min(1.0f, f - i);
            if (fillRatio < 0.0f) {
                fillRatio = 0.0f;
            }
            this.A05[i].setFillRatio(fillRatio);
        }
    }

    public void setItemSpacing(int i) {
        this.A00 = i;
        A01();
    }

    public void setRating(float f) {
        A02(f);
    }
}

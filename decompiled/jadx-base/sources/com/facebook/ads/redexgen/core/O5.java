package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class O5 extends android.widget.FrameLayout {
    public int A00;
    public int A01;
    public final android.widget.ImageView A02;
    public final android.widget.ImageView A03;

    public O5(com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        super(c1199Zs);
        this.A03 = new android.widget.ImageView(c1199Zs);
        this.A02 = new android.widget.ImageView(c1199Zs);
        A00();
    }

    public O5(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, android.util.AttributeSet attributeSet) {
        super(c1199Zs, attributeSet);
        this.A03 = new android.widget.ImageView(c1199Zs, attributeSet);
        this.A02 = new android.widget.ImageView(c1199Zs, attributeSet);
        A00();
    }

    public O5(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, android.util.AttributeSet attributeSet, int i) {
        super(c1199Zs, attributeSet, i);
        this.A03 = new android.widget.ImageView(c1199Zs, attributeSet, i);
        this.A02 = new android.widget.ImageView(c1199Zs, attributeSet, i);
        A00();
    }

    public O5(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, android.util.AttributeSet attributeSet, int i, int i2) {
        super(c1199Zs, attributeSet, i, i2);
        this.A03 = new android.widget.ImageView(c1199Zs, attributeSet, i, i2);
        this.A02 = new android.widget.ImageView(c1199Zs, attributeSet, i, i2);
        A00();
    }

    private void A00() {
        addView(this.A02, new android.widget.FrameLayout.LayoutParams(-1, -1));
        addView(this.A03, new android.widget.FrameLayout.LayoutParams(-2, -2));
        com.facebook.ads.redexgen.core.LU.A04(this.A03, com.facebook.ads.redexgen.core.LU.A0B);
        setId(com.facebook.ads.redexgen.core.M3.A00());
    }

    public android.widget.ImageView getBodyImageView() {
        return this.A03;
    }

    public int getImageHeight() {
        return this.A00;
    }

    public int getImageWidth() {
        return this.A01;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.A01 <= 0 || this.A00 <= 0) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int i5 = i3 - i;
        int i6 = i4 - i2;
        float fMin = java.lang.Math.min(i5 / this.A01, i6 / this.A00);
        int i7 = (int) (this.A01 * fMin);
        int i8 = (int) (this.A00 * fMin);
        this.A02.layout(i, i2, i3, i4);
        int blurBorderViewHeight = (i5 / 2) + i;
        int blurBorderViewWidth = (i6 / 2) + i2;
        this.A03.layout(blurBorderViewHeight - (i7 / 2), blurBorderViewWidth - (i8 / 2), (i7 / 2) + blurBorderViewHeight, blurBorderViewWidth + (i8 / 2));
        this.A02.setVisibility(0);
    }

    public void setImage(android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2) {
        if (bitmap2 != null) {
            com.facebook.ads.redexgen.core.M3.A0S(this.A02, new android.graphics.drawable.BitmapDrawable(getContext().getResources(), bitmap2));
        } else {
            com.facebook.ads.redexgen.core.M3.A0M(this.A02, 0);
        }
        if (bitmap != null) {
            this.A01 = bitmap.getWidth();
            this.A00 = bitmap.getHeight();
            this.A03.setImageBitmap(android.graphics.Bitmap.createBitmap(bitmap));
            return;
        }
        this.A03.setImageDrawable(null);
    }
}

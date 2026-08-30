package com.bytedance.sdk.component.adexpress.ldr;

/* JADX INFO: loaded from: classes3.dex */
public class JAA extends android.widget.FrameLayout {
    private static final int WR = (com.bytedance.sdk.component.adexpress.dynamic.zx.VB.IL("", 0.0f, true)[1] / 2) + 1;
    private static final int eo = (com.bytedance.sdk.component.adexpress.dynamic.zx.VB.IL("", 0.0f, true)[1] / 2) + 3;
    android.widget.LinearLayout IL;
    private float Kg;
    private float bX;
    android.widget.LinearLayout bg;
    private float eqN;
    private double iR;
    private android.graphics.drawable.Drawable ldr;
    private android.graphics.drawable.Drawable zx;

    public JAA(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.bg = new android.widget.LinearLayout(getContext());
        this.IL = new android.widget.LinearLayout(getContext());
        this.bg.setOrientation(0);
        this.bg.setGravity(androidx.core.view.GravityCompat.START);
        this.IL.setOrientation(0);
        this.IL.setGravity(androidx.core.view.GravityCompat.START);
        this.zx = com.bytedance.sdk.component.utils.Fy.bX(context, "tt_star_thick");
        this.ldr = com.bytedance.sdk.component.utils.Fy.bX(context, "tt_star");
    }

    public android.graphics.drawable.Drawable getStarEmptyDrawable() {
        return this.zx;
    }

    public android.graphics.drawable.Drawable getStarFillDrawable() {
        return this.ldr;
    }

    public void bg(double d, int i, int i2, int i3) {
        float f = i2;
        this.bX = (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bX(getContext(), f);
        this.eqN = (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bX(getContext(), f);
        this.iR = d;
        this.Kg = i3;
        removeAllViews();
        for (int i4 = 0; i4 < 5; i4++) {
            android.widget.ImageView starImageView = getStarImageView();
            starImageView.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
            starImageView.setColorFilter(i, android.graphics.PorterDuff.Mode.SRC_IN);
            starImageView.setImageDrawable(getStarFillDrawable());
            this.IL.addView(starImageView);
        }
        for (int i5 = 0; i5 < 5; i5++) {
            android.widget.ImageView starImageView2 = getStarImageView();
            starImageView2.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
            starImageView2.setImageDrawable(getStarEmptyDrawable());
            this.bg.addView(starImageView2);
        }
        addView(this.bg);
        addView(this.IL);
        requestLayout();
    }

    private android.widget.ImageView getStarImageView() {
        android.widget.ImageView imageView = new android.widget.ImageView(getContext());
        imageView.setLayoutParams(new android.view.ViewGroup.LayoutParams((int) this.bX, (int) this.eqN));
        imageView.setPadding(1, WR, 1, eo);
        return imageView;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.bg.measure(i, i2);
        double d = this.iR;
        float f = this.bX;
        this.IL.measure(android.view.View.MeasureSpec.makeMeasureSpec((int) (((double) ((((int) d) * f) + 1.0f)) + (((double) (f - 2.0f)) * (d - ((double) ((int) d))))), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(this.bg.getMeasuredHeight(), 1073741824));
        if (this.Kg > 0.0f) {
            android.widget.LinearLayout linearLayout = this.bg;
            linearLayout.setPadding(0, ((int) (linearLayout.getMeasuredHeight() - this.Kg)) / 2, 0, 0);
            this.IL.setPadding(0, ((int) (this.bg.getMeasuredHeight() - this.Kg)) / 2, 0, 0);
        }
    }
}

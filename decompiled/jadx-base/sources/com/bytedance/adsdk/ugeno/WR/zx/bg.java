package com.bytedance.adsdk.ugeno.WR.zx;

/* JADX INFO: loaded from: classes3.dex */
public class bg extends android.widget.FrameLayout {
    private float IL;
    private com.bytedance.adsdk.ugeno.bX Kg;
    private double bX;
    private float bg;
    private float eqN;
    private android.content.Context iR;
    private android.widget.LinearLayout ldr;
    private android.widget.LinearLayout zx;

    public bg(android.content.Context context) {
        super(context);
        this.iR = context;
        this.zx = new android.widget.LinearLayout(context);
        this.ldr = new android.widget.LinearLayout(context);
        this.zx.setOrientation(0);
        this.zx.setGravity(androidx.core.view.GravityCompat.START);
        this.ldr.setOrientation(0);
        this.ldr.setGravity(androidx.core.view.GravityCompat.START);
    }

    public void bg(double d, int i, int i2, float f, int i3) {
        removeAllViews();
        this.zx.removeAllViews();
        this.ldr.removeAllViews();
        this.bg = (int) com.bytedance.adsdk.ugeno.iR.Kg.bg(this.iR, f);
        this.IL = (int) com.bytedance.adsdk.ugeno.iR.Kg.bg(this.iR, f);
        this.bX = d;
        this.eqN = i3;
        for (int i4 = 0; i4 < 5; i4++) {
            android.widget.ImageView starImageView = getStarImageView();
            starImageView.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
            starImageView.setImageResource(com.bytedance.adsdk.ugeno.iR.eqN.bg(this.iR, "tt_ugen_rating_star"));
            starImageView.setColorFilter(i, android.graphics.PorterDuff.Mode.SRC_IN);
            this.ldr.addView(starImageView);
        }
        for (int i5 = 0; i5 < 5; i5++) {
            android.widget.ImageView starImageView2 = getStarImageView();
            starImageView2.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
            starImageView2.setImageResource(com.bytedance.adsdk.ugeno.iR.eqN.bg(this.iR, "tt_ugen_rating_star"));
            starImageView2.setColorFilter(i2);
            this.zx.addView(starImageView2);
        }
        addView(this.zx);
        addView(this.ldr);
        requestLayout();
    }

    private android.widget.ImageView getStarImageView() {
        android.widget.ImageView imageView = new android.widget.ImageView(getContext());
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams((int) this.bg, (int) this.IL);
        layoutParams.leftMargin = (int) this.eqN;
        layoutParams.topMargin = 0;
        layoutParams.rightMargin = (int) this.eqN;
        layoutParams.bottomMargin = 1;
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        com.bytedance.adsdk.ugeno.bX bXVar = this.Kg;
        if (bXVar != null) {
            bXVar.bg(i, i2);
        }
        super.onMeasure(i, i2);
        this.zx.measure(i, i2);
        double dFloor = java.lang.Math.floor(this.bX);
        float f = this.eqN;
        float f2 = this.bg;
        this.ldr.measure(android.view.View.MeasureSpec.makeMeasureSpec((int) ((((double) (f + f + f2)) * dFloor) + ((double) f) + ((this.bX - dFloor) * ((double) f2))), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(this.zx.getMeasuredHeight(), 1073741824));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        com.bytedance.adsdk.ugeno.bX bXVar = this.Kg;
        if (bXVar != null) {
            bXVar.bg(i, i2, i3, i4);
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.adsdk.ugeno.bX bXVar = this.Kg;
        if (bXVar != null) {
            bXVar.iR();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.adsdk.ugeno.bX bXVar = this.Kg;
        if (bXVar != null) {
            bXVar.Kg();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        com.bytedance.adsdk.ugeno.bX bXVar = this.Kg;
        if (bXVar != null) {
            bXVar.IL(i, i2, i3, i4);
        }
    }

    public void bg(com.bytedance.adsdk.ugeno.bX bXVar) {
        this.Kg = bXVar;
    }
}

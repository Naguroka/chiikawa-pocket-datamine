package com.bytedance.sdk.openadsdk.core.zx;

/* JADX INFO: loaded from: classes4.dex */
public class ldr extends android.widget.FrameLayout {
    private int IL;
    private boolean Kg;
    private android.graphics.drawable.Drawable bX;
    private int bg;
    private android.graphics.drawable.Drawable eqN;
    private android.animation.ValueAnimator iR;
    private boolean ldr;
    private android.graphics.drawable.Drawable zx;

    public void setProgress(int i) {
        this.IL = i;
        android.graphics.drawable.Drawable drawable = this.bX;
        if (drawable != null) {
            drawable.setLevel((int) ((i * 10000.0f) / this.bg));
        }
    }

    public void setMax(int i) {
        this.bg = i;
    }

    public void setProgressDrawable(android.graphics.drawable.Drawable drawable) {
        this.eqN = drawable;
        setBackground(drawable);
        android.graphics.drawable.Drawable drawable2 = this.eqN;
        if (drawable2 instanceof android.graphics.drawable.LayerDrawable) {
            int numberOfLayers = ((android.graphics.drawable.LayerDrawable) drawable2).getNumberOfLayers();
            for (int i = 0; i < numberOfLayers; i++) {
                android.graphics.drawable.Drawable drawable3 = ((android.graphics.drawable.LayerDrawable) this.eqN).getDrawable(i);
                if ((drawable3 instanceof android.graphics.drawable.ScaleDrawable) || (drawable3 instanceof android.graphics.drawable.ClipDrawable)) {
                    this.bX = drawable3;
                }
            }
        }
        android.graphics.drawable.Drawable drawable4 = this.eqN;
        if (drawable4 instanceof android.graphics.drawable.RotateDrawable) {
            this.bX = drawable4;
        }
    }

    public void setIndeterminateDrawable(android.graphics.drawable.Drawable drawable) {
        this.zx = drawable;
        setProgressDrawable(drawable);
        if (this.ldr && this.iR == null) {
            bg();
        }
    }

    public ldr(android.content.Context context) {
        super(context);
        this.bg = 100;
    }

    public ldr(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.bg = 100;
    }

    @Override // android.view.View
    public void setLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(com.bytedance.sdk.openadsdk.core.zx.WR.bg(this, layoutParams));
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.ldr = true;
        if (this.zx != null) {
            bg();
        }
    }

    private void bg() {
        android.animation.ValueAnimator valueAnimatorOfInt = android.animation.ValueAnimator.ofInt(0, 10000);
        this.iR = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(2000L);
        this.iR.setRepeatCount(-1);
        this.iR.setInterpolator(new android.view.animation.LinearInterpolator());
        this.iR.setRepeatMode(1);
        this.iR.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.zx.ldr.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                com.bytedance.sdk.openadsdk.core.zx.ldr.this.setProgress(((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        this.iR.start();
        setMax(10000);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.ldr = false;
        android.animation.ValueAnimator valueAnimator = this.iR;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.iR.removeAllUpdateListeners();
            this.iR = null;
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(android.view.View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            if (this.Kg) {
                this.Kg = false;
                android.animation.ValueAnimator valueAnimator = this.iR;
                if (valueAnimator != null) {
                    valueAnimator.resume();
                    return;
                } else {
                    bg();
                    return;
                }
            }
            return;
        }
        if (this.iR == null || this.Kg) {
            return;
        }
        this.Kg = true;
        this.iR.pause();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }
}

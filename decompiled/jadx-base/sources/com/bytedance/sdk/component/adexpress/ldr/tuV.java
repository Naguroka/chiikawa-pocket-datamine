package com.bytedance.sdk.component.adexpress.ldr;

/* JADX INFO: loaded from: classes3.dex */
public class tuV extends android.view.View {
    private float IL;
    private float Kg;
    private android.animation.Animator.AnimatorListener WR;
    private android.animation.ValueAnimator bX;
    private float bg;
    private int eo;
    private android.animation.ValueAnimator eqN;
    private float iR;
    private long ldr;
    private android.graphics.Paint zx;

    public tuV(android.content.Context context, int i) {
        super(context);
        this.ldr = 300L;
        this.iR = 0.0f;
        this.eo = i;
        bg();
    }

    public void bg() {
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.zx = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.zx.setColor(this.eo);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.bg = i / 2.0f;
        this.IL = i2 / 2.0f;
        this.Kg = (float) (java.lang.Math.hypot(i, i2) / 2.0d);
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(this.bg, this.IL, this.iR, this.zx);
    }

    public void IL() {
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(0.0f, this.Kg);
        this.bX = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.ldr);
        this.bX.setInterpolator(new android.view.animation.LinearInterpolator());
        this.bX.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.ldr.tuV.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                com.bytedance.sdk.component.adexpress.ldr.tuV.this.iR = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
                com.bytedance.sdk.component.adexpress.ldr.tuV.this.invalidate();
            }
        });
        this.bX.start();
    }

    public void bX() {
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(this.Kg, 0.0f);
        this.eqN = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.ldr);
        this.eqN.setInterpolator(new android.view.animation.LinearInterpolator());
        this.eqN.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.ldr.tuV.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                com.bytedance.sdk.component.adexpress.ldr.tuV.this.iR = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
                com.bytedance.sdk.component.adexpress.ldr.tuV.this.invalidate();
            }
        });
        android.animation.Animator.AnimatorListener animatorListener = this.WR;
        if (animatorListener != null) {
            this.eqN.addListener(animatorListener);
        }
        this.eqN.start();
    }

    public void setAnimationListener(android.animation.Animator.AnimatorListener animatorListener) {
        this.WR = animatorListener;
    }
}

package com.bytedance.sdk.component.adexpress.ldr;

/* JADX INFO: loaded from: classes3.dex */
public class kMt extends android.view.View {
    private static int bX = 50;
    private int IL;
    private android.graphics.Paint bg;
    private android.animation.ObjectAnimator eqN;

    public kMt(android.content.Context context) {
        this(context, null);
    }

    public kMt(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public kMt(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.IL = 10;
        bX();
    }

    private void bX() {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.bg = paint;
        paint.setAntiAlias(true);
        this.bg.setColor(android.graphics.Color.parseColor("#FFFFFFFF"));
        this.bg.setStyle(android.graphics.Paint.Style.STROKE);
        this.bg.setStrokeWidth(18.0f);
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
        this.eqN = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(200L);
    }

    @Override // android.view.View
    public void invalidate() {
        if (hasWindowFocus()) {
            super.invalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        this.bg.setShader(new android.graphics.LinearGradient(getMeasuredWidth() / 2, 0.0f, getMeasuredWidth() / 2, getMeasuredHeight(), -1, androidx.core.view.ViewCompat.MEASURED_SIZE_MASK, android.graphics.Shader.TileMode.CLAMP));
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, this.IL, this.bg);
    }

    public void bg() {
        int iMin = ((int) java.lang.Math.min(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f)) - 18;
        bX = iMin;
        android.animation.ValueAnimator valueAnimatorOfInt = android.animation.ValueAnimator.ofInt(10, iMin);
        valueAnimatorOfInt.setInterpolator(new android.view.animation.PathInterpolator(0.0f, 0.2f, 0.3f, 1.0f));
        valueAnimatorOfInt.setDuration(800L);
        valueAnimatorOfInt.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.ldr.kMt.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                com.bytedance.sdk.component.adexpress.ldr.kMt.this.IL = ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue();
                com.bytedance.sdk.component.adexpress.ldr.kMt.this.invalidate();
            }
        });
        valueAnimatorOfInt.addListener(new android.animation.Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.ldr.kMt.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(android.animation.Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(android.animation.Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                com.bytedance.sdk.component.adexpress.ldr.kMt.this.setVisibility(0);
                com.bytedance.sdk.component.adexpress.ldr.kMt.this.setAlpha(1.0f);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                com.bytedance.sdk.component.adexpress.ldr.kMt.this.eqN.start();
            }
        });
        valueAnimatorOfInt.start();
    }

    public void IL() {
        clearAnimation();
    }
}

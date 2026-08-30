package com.bytedance.sdk.component.adexpress.ldr;

/* JADX INFO: loaded from: classes3.dex */
public class VzQ extends android.view.View {
    private android.graphics.Paint IL;
    private android.graphics.RectF bX;
    private android.content.Context bg;
    private float eqN;
    private boolean iR;
    private int ldr;
    private android.animation.ValueAnimator zx;

    public VzQ(android.content.Context context) {
        super(context);
        this.ldr = 1500;
        this.bg = context;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.IL = paint;
        paint.setAntiAlias(true);
        this.IL.setStyle(android.graphics.Paint.Style.STROKE);
        this.IL.setStrokeWidth(10.0f);
        this.IL.setColor(android.graphics.Color.parseColor("#80FFFFFF"));
        this.bX = new android.graphics.RectF();
    }

    public void bg() {
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(0.0f, 360.0f);
        this.zx = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.ldr);
        this.zx.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.ldr.VzQ.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                com.bytedance.sdk.component.adexpress.ldr.VzQ.this.eqN = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
                com.bytedance.sdk.component.adexpress.ldr.VzQ.this.requestLayout();
            }
        });
        this.zx.start();
    }

    public void IL() {
        android.animation.ValueAnimator valueAnimator = this.zx;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public void bX() {
        this.iR = true;
        invalidate();
    }

    public void setDuration(int i) {
        this.ldr = i;
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (this.iR) {
            return;
        }
        canvas.drawArc(this.bX, 270.0f, this.eqN, false, this.IL);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.bX.set(5.0f, 5.0f, i - 5, i2 - 5);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = android.view.View.MeasureSpec.getSize(i);
        int size2 = android.view.View.MeasureSpec.getSize(i2);
        setMeasuredDimension(java.lang.Math.min(size, size2), java.lang.Math.min(size, size2));
    }
}

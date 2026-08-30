package com.bytedance.sdk.openadsdk.core.widget;

/* JADX INFO: loaded from: classes4.dex */
public class yDt extends com.bytedance.sdk.openadsdk.core.zx.eqN {
    private android.graphics.RectF IL;
    private android.graphics.Paint bg;

    public yDt(android.content.Context context) {
        super(context);
        bg();
    }

    private void bg() {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.bg = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        this.bg.setColor(android.graphics.Color.parseColor("#99333333"));
        this.bg.setAntiAlias(true);
        this.bg.setStrokeWidth(0.0f);
        this.IL = new android.graphics.RectF();
    }

    @Override // com.bytedance.sdk.openadsdk.core.zx.eqN, android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.IL.right == getMeasuredWidth() && this.IL.bottom == getMeasuredHeight()) {
            return;
        }
        this.IL.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        android.graphics.RectF rectF = this.IL;
        canvas.drawRoundRect(rectF, rectF.right / 2.0f, this.IL.bottom / 2.0f, this.bg);
        super.onDraw(canvas);
    }
}

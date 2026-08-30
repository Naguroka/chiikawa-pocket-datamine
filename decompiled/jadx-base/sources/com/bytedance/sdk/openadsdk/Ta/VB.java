package com.bytedance.sdk.openadsdk.Ta;

/* JADX INFO: loaded from: classes4.dex */
public class VB extends android.view.View {
    private float IL;
    private float bX;
    private final android.graphics.Paint bg;

    public VB(android.content.Context context) {
        super(context);
        setBackgroundColor(android.graphics.Color.parseColor("#8A8A8A"));
        android.graphics.Paint paint = new android.graphics.Paint();
        this.bg = paint;
        paint.setColor(-1);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
    }

    public void setProgress(float f) {
        this.bX = getWidth() * f;
        invalidate();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = i2;
        this.IL = (1.0f * f) / 2.0f;
        this.bg.setStrokeWidth(f);
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        float f = this.bX;
        if (f > 0.0f) {
            float f2 = this.IL;
            canvas.drawLine(0.0f, f2, f, f2, this.bg);
        }
    }
}

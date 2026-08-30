package com.bytedance.sdk.openadsdk.core.widget;

/* JADX INFO: loaded from: classes4.dex */
public class Lq extends com.bytedance.sdk.openadsdk.core.zx.Kg {
    private android.graphics.RectF IL;
    private int bX;
    private android.graphics.Paint bg;

    public Lq(android.content.Context context) {
        this(context, null);
    }

    public Lq(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Lq(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.bX = 0;
        bg();
    }

    private void bg() {
        setTextColor(-1);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.bg = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        this.bg.setColor(android.graphics.Color.parseColor("#99333333"));
        this.bg.setAntiAlias(true);
        this.bg.setStrokeWidth(0.0f);
        this.IL = new android.graphics.RectF();
    }

    @Override // com.bytedance.sdk.openadsdk.core.zx.Kg, android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth > 0 && measuredHeight > 0) {
            int iMeasureText = (int) getPaint().measureText("00");
            this.bX = iMeasureText;
            if (measuredWidth < iMeasureText) {
                measuredWidth = iMeasureText;
            }
            int i3 = measuredWidth + ((measuredHeight / 2) * 2);
            setMeasuredDimension(i3, measuredHeight);
            this.IL.set(0.0f, 0.0f, i3, measuredHeight);
            return;
        }
        this.IL.set(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        android.graphics.RectF rectF = this.IL;
        canvas.drawRoundRect(rectF, rectF.bottom / 2.0f, this.IL.bottom / 2.0f, this.bg);
        canvas.translate((this.IL.right / 2.0f) - (getPaint().measureText(getText().toString()) / 2.0f), 0.0f);
        super.onDraw(canvas);
    }
}

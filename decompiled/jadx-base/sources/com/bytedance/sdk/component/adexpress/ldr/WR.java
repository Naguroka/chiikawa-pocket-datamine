package com.bytedance.sdk.component.adexpress.ldr;

/* JADX INFO: loaded from: classes3.dex */
public class WR extends android.view.View {
    private int IL;
    private int Kg;
    private final android.graphics.RectF bX;
    private int bg;
    private android.graphics.Paint eqN;
    private android.graphics.Paint iR;
    private int ldr;
    private android.graphics.Paint zx;

    public WR(android.content.Context context) {
        super(context);
        this.bX = new android.graphics.RectF();
        bg();
    }

    private void bg() {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.eqN = paint;
        paint.setAntiAlias(true);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.iR = paint2;
        paint2.setAntiAlias(true);
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.zx = paint3;
        paint3.setAntiAlias(true);
    }

    public void setRadius(int i) {
        this.ldr = i;
    }

    public void setDislikeColor(int i) {
        this.iR.setColor(i);
    }

    public void setDislikeWidth(int i) {
        this.iR.setStrokeWidth(i);
    }

    public void setStrokeColor(int i) {
        this.eqN.setStyle(android.graphics.Paint.Style.STROKE);
        this.eqN.setColor(i);
    }

    public void setStrokeWidth(int i) {
        this.eqN.setStrokeWidth(i);
        this.Kg = i;
    }

    public void setBgColor(int i) {
        this.zx.setStyle(android.graphics.Paint.Style.FILL);
        this.zx.setColor(i);
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        android.graphics.RectF rectF = this.bX;
        int i = this.ldr;
        canvas.drawRoundRect(rectF, i, i, this.zx);
        android.graphics.RectF rectF2 = this.bX;
        int i2 = this.ldr;
        canvas.drawRoundRect(rectF2, i2, i2, this.eqN);
        int i3 = this.bg;
        int i4 = this.IL;
        canvas.drawLine(i3 * 0.3f, i4 * 0.3f, i3 * 0.7f, i4 * 0.7f, this.iR);
        int i5 = this.bg;
        int i6 = this.IL;
        canvas.drawLine(i5 * 0.7f, i6 * 0.3f, i5 * 0.3f, i6 * 0.7f, this.iR);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.bg = i;
        this.IL = i2;
        android.graphics.RectF rectF = this.bX;
        int i5 = this.Kg;
        rectF.set(i5, i5, i - i5, i2 - i5);
    }
}

package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

/* JADX INFO: loaded from: classes3.dex */
public class Fy extends android.graphics.drawable.Drawable {
    private int IL;
    private int bX;
    private android.graphics.Paint bg;
    private android.graphics.RectF eqN;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public Fy(int i, int i2) {
        this.bX = i;
        this.IL = i2;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.bg = paint;
        paint.setColor(0);
        this.bg.setAntiAlias(true);
        this.bg.setShadowLayer(i2, 0.0f, 0.0f, androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        this.bg.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_ATOP));
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        int i5 = this.IL;
        this.eqN = new android.graphics.RectF(i + i5, i2 + i5, i3 - i5, i4 - i5);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        android.graphics.RectF rectF = this.eqN;
        int i = this.bX;
        canvas.drawRoundRect(rectF, i, i, this.bg);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.bg.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.bg.setColorFilter(colorFilter);
    }
}

package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class OX extends android.widget.ImageView {
    public float A00;
    public final int A01;
    public final int A02;
    public final android.graphics.Bitmap A03;

    public OX(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, int i, int i2) {
        super(c1199Zs);
        this.A03 = com.facebook.ads.redexgen.core.MC.A01(com.facebook.ads.redexgen.core.MB.RATINGS);
        this.A00 = 1.0f;
        this.A01 = i;
        this.A02 = i2;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        android.graphics.Paint paint = new android.graphics.Paint(2);
        paint.setColorFilter(new android.graphics.PorterDuffColorFilter(this.A01, android.graphics.PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(this.A03, (android.graphics.Rect) null, new android.graphics.Rect(0, 0, getWidth(), getHeight()), paint);
        paint.setColorFilter(new android.graphics.PorterDuffColorFilter(this.A02, android.graphics.PorterDuff.Mode.SRC_ATOP));
        android.graphics.Rect fillRect = new android.graphics.Rect(0, 0, (int) (this.A00 * this.A03.getWidth()), this.A03.getHeight());
        android.graphics.Rect drawRect = new android.graphics.Rect(0, 0, (int) (this.A00 * getWidth()), getHeight());
        canvas.drawBitmap(this.A03, fillRect, drawRect, paint);
    }

    public void setFillRatio(float f) {
        this.A00 = f;
        postInvalidate();
    }
}

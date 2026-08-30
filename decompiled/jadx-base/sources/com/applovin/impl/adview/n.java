package com.applovin.impl.adview;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends com.applovin.impl.adview.e {
    private static final android.graphics.Paint c = new android.graphics.Paint(1);
    private static final android.graphics.Paint d = new android.graphics.Paint(1);
    private static final android.graphics.Paint f = new android.graphics.Paint(1);

    public n(android.content.Context context) {
        super(context);
        c.setColor(-1);
        d.setColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        android.graphics.Paint paint = f;
        paint.setColor(-1);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
    }

    protected float getCenter() {
        return getSize() / 2.0f;
    }

    protected float getCrossOffset() {
        return this.f609a * 10.0f;
    }

    protected float getInnerCircleOffset() {
        return this.f609a * 2.0f;
    }

    protected float getInnerCircleRadius() {
        return getCenter() - getInnerCircleOffset();
    }

    protected float getStrokeWidth() {
        return this.f609a * 3.0f;
    }

    @Override // com.applovin.impl.adview.e
    public com.applovin.impl.adview.e.a getStyle() {
        return com.applovin.impl.adview.e.a.WHITE_ON_BLACK;
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        float center = getCenter();
        canvas.drawCircle(center, center, center, c);
        canvas.drawCircle(center, center, getInnerCircleRadius(), d);
        float crossOffset = getCrossOffset();
        float size = getSize() - crossOffset;
        android.graphics.Paint paint = f;
        paint.setStrokeWidth(getStrokeWidth());
        canvas.drawLine(crossOffset, crossOffset, size, size, paint);
        canvas.drawLine(crossOffset, size, size, crossOffset, paint);
    }
}

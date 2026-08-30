package com.applovin.impl.adview;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends com.applovin.impl.adview.e {
    private static final android.graphics.Paint c = new android.graphics.Paint(1);
    private static final android.graphics.Paint d = new android.graphics.Paint(1);

    public i(android.content.Context context) {
        super(context);
        c.setARGB(80, 0, 0, 0);
        android.graphics.Paint paint = d;
        paint.setColor(-1);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
    }

    @Override // com.applovin.impl.adview.e
    public void a(int i) {
        setViewScale(i / 30.0f);
    }

    protected float getCenter() {
        return getSize() / 2.0f;
    }

    protected float getCrossOffset() {
        return this.f609a * 8.0f;
    }

    protected float getStrokeWidth() {
        return this.f609a * 2.0f;
    }

    @Override // com.applovin.impl.adview.e
    public com.applovin.impl.adview.e.a getStyle() {
        return com.applovin.impl.adview.e.a.WHITE_ON_TRANSPARENT;
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        float center = getCenter();
        canvas.drawCircle(center, center, center, c);
        float crossOffset = getCrossOffset();
        float size = getSize() - crossOffset;
        android.graphics.Paint paint = d;
        paint.setStrokeWidth(getStrokeWidth());
        canvas.drawLine(crossOffset, crossOffset, size, size, paint);
        canvas.drawLine(crossOffset, size, size, crossOffset, paint);
    }
}

package com.five_corp.ad.internal.view;

/* JADX INFO: renamed from: com.five_corp.ad.internal.view.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1517j extends android.view.View implements com.five_corp.ad.internal.layouter.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.graphics.Paint f2099a;
    public final android.graphics.Paint b;
    public final android.graphics.Paint c;
    public float d;
    public android.graphics.RectF e;
    public final com.five_corp.ad.internal.logger.a f;

    public C1517j(android.content.Context context, com.five_corp.ad.internal.ad.custom_layout.i iVar, com.five_corp.ad.internal.logger.a aVar) {
        super(context);
        this.f = aVar;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f2099a = paint;
        paint.setColor(com.five_corp.ad.internal.view.M.a(iVar.f1805a));
        android.graphics.Paint.Style style = android.graphics.Paint.Style.STROKE;
        paint.setStyle(style);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.b = paint2;
        paint2.setColor(com.five_corp.ad.internal.view.M.a(iVar.c));
        paint2.setStyle(style);
        paint2.setStrokeWidth(5.0f);
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.c = paint3;
        paint3.setColor(com.five_corp.ad.internal.view.M.a(iVar.b));
        this.e = new android.graphics.RectF(5.0f, 5.0f, getWidth() - 5.0f, getHeight() - 5.0f);
        this.d = 0.0f;
    }

    @Override // com.five_corp.ad.internal.layouter.l
    public final void a(com.five_corp.ad.internal.layouter.i iVar) {
        this.d = iVar.d;
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawOval(this.e, this.c);
        canvas.drawArc(this.e, 270.0f, -(360.0f - (this.d * 360.0f)), false, this.f2099a);
        canvas.drawArc(this.e, -90.0f, this.d * 360.0f, false, this.b);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        try {
            this.e = new android.graphics.RectF(5.0f, 5.0f, i - 5.0f, i2 - 5.0f);
            invalidate();
        } catch (java.lang.Throwable th) {
            this.f.a(th);
        }
    }
}

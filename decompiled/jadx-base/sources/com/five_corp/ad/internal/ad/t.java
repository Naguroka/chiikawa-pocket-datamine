package com.five_corp.ad.internal.ad;

/* JADX INFO: loaded from: classes4.dex */
public final class t extends androidx.appcompat.widget.AppCompatTextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public android.graphics.Paint f1832a;

    public t(android.content.Context context) {
        super(context);
        a();
    }

    public final void a() {
        android.graphics.Paint paint = new android.graphics.Paint(getPaint());
        this.f1832a = paint;
        paint.setAntiAlias(true);
        this.f1832a.setStrokeWidth(4.0f);
        this.f1832a.setColor(-1);
        this.f1832a.setStyle(android.graphics.Paint.Style.STROKE);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        canvas.drawText(getText().toString(), (getWidth() - this.f1832a.measureText(getText().toString())) / 2.0f, getBaseline(), this.f1832a);
        super.onDraw(canvas);
    }
}

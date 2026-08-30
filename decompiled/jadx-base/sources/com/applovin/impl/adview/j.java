package com.applovin.impl.adview;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends com.applovin.impl.adview.e {
    private static final android.graphics.Paint f = new android.graphics.Paint(1);
    private static final android.graphics.Paint g = new android.graphics.Paint(1);
    private final float[] c;
    private android.graphics.Path d;

    public j(android.content.Context context) {
        super(context);
        this.c = new float[]{30.0f, 30.0f, 50.0f, 50.0f, 30.0f, 70.0f, 55.0f, 30.0f, 75.0f, 50.0f, 55.0f, 70.0f};
        f.setARGB(80, 0, 0, 0);
        android.graphics.Paint paint = g;
        paint.setColor(-1);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
    }

    @Override // com.applovin.impl.adview.e
    public void a(int i) {
        setViewScale(i / 30.0f);
        a();
    }

    protected float getCenter() {
        return getSize() / 2.0f;
    }

    protected float getStrokeWidth() {
        return this.f609a * 2.0f;
    }

    @Override // com.applovin.impl.adview.e
    public com.applovin.impl.adview.e.a getStyle() {
        return com.applovin.impl.adview.e.a.TRANSPARENT_SKIP;
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        float center = getCenter();
        canvas.drawCircle(center, center, center, f);
        android.graphics.Paint paint = g;
        paint.setStrokeWidth(getStrokeWidth());
        canvas.drawPath(this.d, paint);
    }

    private void a() {
        int i = 0;
        while (true) {
            float[] fArr = this.c;
            if (i < fArr.length) {
                fArr[i] = fArr[i] * 0.3f * this.f609a;
                i++;
            } else {
                android.graphics.Path path = new android.graphics.Path();
                this.d = path;
                float[] fArr2 = this.c;
                path.moveTo(fArr2[0], fArr2[1]);
                android.graphics.Path path2 = this.d;
                float[] fArr3 = this.c;
                path2.lineTo(fArr3[2], fArr3[3]);
                android.graphics.Path path3 = this.d;
                float[] fArr4 = this.c;
                path3.lineTo(fArr4[4], fArr4[5]);
                android.graphics.Path path4 = this.d;
                float[] fArr5 = this.c;
                path4.moveTo(fArr5[6], fArr5[7]);
                android.graphics.Path path5 = this.d;
                float[] fArr6 = this.c;
                path5.lineTo(fArr6[8], fArr6[9]);
                android.graphics.Path path6 = this.d;
                float[] fArr7 = this.c;
                path6.lineTo(fArr7[10], fArr7[11]);
                return;
            }
        }
    }
}

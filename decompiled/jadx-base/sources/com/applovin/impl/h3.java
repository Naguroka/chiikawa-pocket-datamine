package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class h3 extends android.view.View {
    private static final int x = android.graphics.Color.rgb(66, org.objectweb.asm.Opcodes.I2B, 241);
    private static final int y = android.graphics.Color.rgb(66, org.objectweb.asm.Opcodes.I2B, 241);
    private static final int z = android.graphics.Color.rgb(66, org.objectweb.asm.Opcodes.I2B, 241);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.graphics.Paint f840a;
    private android.graphics.Paint b;
    protected android.graphics.Paint c;
    protected android.graphics.Paint d;
    private android.graphics.RectF f;
    private float g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private float m;
    private int n;
    private java.lang.String o;
    private java.lang.String p;
    private float q;
    private java.lang.String r;
    private float s;
    private final float t;
    private final float u;
    private final float v;
    private final int w;

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("saved_instance", super.onSaveInstanceState());
        bundle.putInt("text_color", getTextColor());
        bundle.putFloat("text_size", getTextSize());
        bundle.putFloat("inner_bottom_text_size", getInnerBottomTextSize());
        bundle.putFloat("inner_bottom_text_color", getInnerBottomTextColor());
        bundle.putString("inner_bottom_text", getInnerBottomText());
        bundle.putInt("inner_bottom_text_color", getInnerBottomTextColor());
        bundle.putInt("finished_stroke_color", getFinishedStrokeColor());
        bundle.putInt(com.applovin.sdk.AppLovinMediationProvider.MAX, getMax());
        bundle.putInt("progress", getProgress());
        bundle.putString("suffix", getSuffixText());
        bundle.putString("prefix", getPrefixText());
        bundle.putFloat("finished_stroke_width", getFinishedStrokeWidth());
        bundle.putInt("inner_background_color", getInnerBackgroundColor());
        return bundle;
    }

    public h3(android.content.Context context) {
        this(context, null);
    }

    protected void b() {
        android.text.TextPaint textPaint = new android.text.TextPaint();
        this.c = textPaint;
        textPaint.setColor(this.h);
        this.c.setTextSize(this.g);
        this.c.setAntiAlias(true);
        android.text.TextPaint textPaint2 = new android.text.TextPaint();
        this.d = textPaint2;
        textPaint2.setColor(this.i);
        this.d.setTextSize(this.q);
        this.d.setAntiAlias(true);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f840a = paint;
        paint.setColor(this.l);
        this.f840a.setStyle(android.graphics.Paint.Style.STROKE);
        this.f840a.setAntiAlias(true);
        this.f840a.setStrokeWidth(this.m);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.b = paint2;
        paint2.setColor(this.n);
        this.b.setAntiAlias(true);
    }

    protected void a() {
        this.l = x;
        this.h = y;
        this.g = this.u;
        setMax(100);
        setProgress(0);
        this.m = this.t;
        this.n = 0;
        this.q = this.v;
        this.i = z;
    }

    @Override // android.view.View
    public void invalidate() {
        b();
        super.invalidate();
    }

    public float getFinishedStrokeWidth() {
        return this.m;
    }

    public void setFinishedStrokeWidth(float f) {
        this.m = f;
        invalidate();
    }

    public h3(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private float getProgressAngle() {
        return (getProgress() / this.k) * 360.0f;
    }

    public int getProgress() {
        return this.j;
    }

    public void setProgress(int i) {
        this.j = i;
        if (i > getMax()) {
            this.j %= getMax();
        }
        invalidate();
    }

    public int getMax() {
        return this.k;
    }

    public void setMax(int i) {
        if (i > 0) {
            this.k = i;
            invalidate();
        }
    }

    public float getTextSize() {
        return this.g;
    }

    public void setTextSize(float f) {
        this.g = f;
        invalidate();
    }

    public int getTextColor() {
        return this.h;
    }

    public void setTextColor(int i) {
        this.h = i;
        invalidate();
    }

    public int getFinishedStrokeColor() {
        return this.l;
    }

    public void setFinishedStrokeColor(int i) {
        this.l = i;
        invalidate();
    }

    public java.lang.String getSuffixText() {
        return this.p;
    }

    public void setSuffixText(java.lang.String str) {
        this.p = str;
        invalidate();
    }

    public java.lang.String getPrefixText() {
        return this.o;
    }

    public h3(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = new android.graphics.RectF();
        this.j = 0;
        this.o = "";
        this.p = "";
        this.r = "";
        this.u = com.applovin.impl.h3.a.d(getResources(), 14.0f);
        this.w = (int) com.applovin.impl.h3.a.c(getResources(), 100.0f);
        this.t = com.applovin.impl.h3.a.c(getResources(), 4.0f);
        this.v = com.applovin.impl.h3.a.d(getResources(), 18.0f);
        a();
        b();
    }

    public void setPrefixText(java.lang.String str) {
        this.o = str;
        invalidate();
    }

    public int getInnerBackgroundColor() {
        return this.n;
    }

    public void setInnerBackgroundColor(int i) {
        this.n = i;
        invalidate();
    }

    public java.lang.String getInnerBottomText() {
        return this.r;
    }

    public void setInnerBottomText(java.lang.String str) {
        this.r = str;
        invalidate();
    }

    public float getInnerBottomTextSize() {
        return this.q;
    }

    public void setInnerBottomTextSize(float f) {
        this.q = f;
        invalidate();
    }

    public int getInnerBottomTextColor() {
        return this.i;
    }

    public void setInnerBottomTextColor(int i) {
        this.i = i;
        invalidate();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(a(i), a(i2));
        this.s = getHeight() - ((getHeight() * 3) / 4);
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        float f = this.m;
        this.f.set(f, f, getWidth() - f, getHeight() - f);
        float width = getWidth();
        float f2 = this.m;
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, ((width - f2) + f2) / 2.0f, this.b);
        canvas.drawArc(this.f, 270.0f, -getProgressAngle(), false, this.f840a);
        java.lang.String str = this.o + this.j + this.p;
        if (!android.text.TextUtils.isEmpty(str)) {
            canvas.drawText(str, (getWidth() - this.c.measureText(str)) / 2.0f, (getWidth() - (this.c.descent() + this.c.ascent())) / 2.0f, this.c);
        }
        if (android.text.TextUtils.isEmpty(getInnerBottomText())) {
            return;
        }
        this.d.setTextSize(this.q);
        canvas.drawText(getInnerBottomText(), (getWidth() - this.d.measureText(getInnerBottomText())) / 2.0f, (getHeight() - this.s) - ((this.c.descent() + this.c.ascent()) / 2.0f), this.d);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (parcelable instanceof android.os.Bundle) {
            android.os.Bundle bundle = (android.os.Bundle) parcelable;
            this.h = bundle.getInt("text_color");
            this.g = bundle.getFloat("text_size");
            this.q = bundle.getFloat("inner_bottom_text_size");
            this.r = bundle.getString("inner_bottom_text");
            this.i = bundle.getInt("inner_bottom_text_color");
            this.l = bundle.getInt("finished_stroke_color");
            this.m = bundle.getFloat("finished_stroke_width");
            this.n = bundle.getInt("inner_background_color");
            b();
            setMax(bundle.getInt(com.applovin.sdk.AppLovinMediationProvider.MAX));
            setProgress(bundle.getInt("progress"));
            this.o = bundle.getString("prefix");
            this.p = bundle.getString("suffix");
            super.onRestoreInstanceState(bundle.getParcelable("saved_instance"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    private static class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static float c(android.content.res.Resources resources, float f) {
            return (f * resources.getDisplayMetrics().density) + 0.5f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static float d(android.content.res.Resources resources, float f) {
            return f * resources.getDisplayMetrics().scaledDensity;
        }
    }

    private int a(int i) {
        int mode = android.view.View.MeasureSpec.getMode(i);
        int size = android.view.View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        int i2 = this.w;
        return mode == Integer.MIN_VALUE ? java.lang.Math.min(i2, size) : i2;
    }
}

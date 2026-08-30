package com.bytedance.sdk.component.adexpress.ldr;

/* JADX INFO: loaded from: classes3.dex */
public class eqN extends android.view.View {
    private int IL;
    private java.util.List<java.lang.Integer> Kg;
    private float PX;
    private float Ta;
    private android.graphics.Paint VB;
    private java.util.List<java.lang.Integer> WR;
    private float bX;
    private int bg;
    private android.graphics.Paint eo;
    private int eqN;
    private boolean iR;
    private int ldr;
    private int yDt;
    private float zx;

    public eqN(android.content.Context context) {
        this(context, null);
    }

    public eqN(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public eqN(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.bg = -1;
        this.IL = -65536;
        this.bX = 18.0f;
        this.eqN = 3;
        this.zx = 50.0f;
        this.ldr = 2;
        this.iR = false;
        this.Kg = new java.util.ArrayList();
        this.WR = new java.util.ArrayList();
        this.yDt = 24;
        bX();
    }

    private void bX() {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.eo = paint;
        paint.setAntiAlias(true);
        this.eo.setStrokeWidth(this.yDt);
        this.Kg.add(255);
        this.WR.add(0);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.VB = paint2;
        paint2.setAntiAlias(true);
        this.VB.setColor(android.graphics.Color.parseColor("#0FFFFFFF"));
        this.VB.setStyle(android.graphics.Paint.Style.FILL);
    }

    @Override // android.view.View
    public void invalidate() {
        if (hasWindowFocus()) {
            super.invalidate();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            invalidate();
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = i / 2.0f;
        this.PX = f;
        this.Ta = i2 / 2.0f;
        float f2 = f - (this.yDt / 2.0f);
        this.zx = f2;
        this.bX = f2 / 4.0f;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = android.view.View.MeasureSpec.getSize(i);
        int size2 = android.view.View.MeasureSpec.getSize(i2);
        setMeasuredDimension(java.lang.Math.min(size, size2), java.lang.Math.min(size, size2));
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        this.eo.setShader(new android.graphics.LinearGradient(this.PX, 0.0f, this.Ta, getMeasuredHeight(), -1, androidx.core.view.ViewCompat.MEASURED_SIZE_MASK, android.graphics.Shader.TileMode.CLAMP));
        int i = 0;
        while (true) {
            if (i >= this.Kg.size()) {
                break;
            }
            java.lang.Integer num = this.Kg.get(i);
            this.eo.setAlpha(num.intValue());
            java.lang.Integer num2 = this.WR.get(i);
            if (this.bX + num2.intValue() < this.zx) {
                canvas.drawCircle(this.PX, this.Ta, this.bX + num2.intValue(), this.eo);
            }
            if (num.intValue() > 0 && num2.intValue() < this.zx) {
                this.Kg.set(i, java.lang.Integer.valueOf(num.intValue() - this.ldr > 0 ? num.intValue() - (this.ldr * 3) : 1));
                this.WR.set(i, java.lang.Integer.valueOf(num2.intValue() + this.ldr));
            }
            i++;
        }
        java.util.List<java.lang.Integer> list = this.WR;
        if (list.get(list.size() - 1).intValue() >= this.zx / this.eqN) {
            this.Kg.add(255);
            this.WR.add(0);
        }
        if (this.WR.size() >= 3) {
            this.WR.remove(0);
            this.Kg.remove(0);
        }
        this.eo.setAlpha(255);
        this.eo.setColor(this.IL);
        canvas.drawCircle(this.PX, this.Ta, this.bX, this.VB);
        if (this.iR) {
            invalidate();
        }
    }

    public void bg() {
        this.iR = true;
        invalidate();
    }

    public void IL() {
        this.iR = false;
        this.WR.clear();
        this.Kg.clear();
        this.Kg.add(255);
        this.WR.add(0);
        invalidate();
    }

    public void setColor(int i) {
        this.bg = i;
    }

    public void setCoreColor(int i) {
        this.IL = i;
    }

    public void setCoreRadius(int i) {
        this.bX = i;
    }

    public void setDiffuseWidth(int i) {
        this.eqN = i;
    }

    public void setMaxWidth(int i) {
        this.zx = i;
    }

    public void setDiffuseSpeed(int i) {
        this.ldr = i;
    }
}

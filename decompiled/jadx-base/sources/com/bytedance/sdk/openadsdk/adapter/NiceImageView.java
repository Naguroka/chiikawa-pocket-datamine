package com.bytedance.sdk.openadsdk.adapter;

/* JADX INFO: loaded from: classes4.dex */
public class NiceImageView extends com.bytedance.sdk.openadsdk.core.zx.eqN {
    private android.graphics.RectF Fy;
    private boolean IL;
    private int Kg;
    private final android.graphics.RectF LZ;
    private int Lq;
    private int PX;
    private int Ta;
    private int VB;
    private final float[] VzQ;
    private int WR;
    private boolean bX;
    private final android.content.Context bg;
    private int eo;
    private int eqN;
    private int iR;
    private android.graphics.Path kMt;
    private int ldr;
    private final android.graphics.Path rri;
    private final android.graphics.Paint tC;
    private final float[] tuV;
    private int vb;
    private float xxp;
    private final android.graphics.Xfermode yDt;
    private int zx;

    public NiceImageView(android.content.Context context) {
        this(context, null);
    }

    public NiceImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NiceImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.zx = -1;
        this.iR = -1;
        this.bg = context;
        this.Kg = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 10.0f);
        this.VzQ = new float[8];
        this.tuV = new float[8];
        this.LZ = new android.graphics.RectF();
        this.Fy = new android.graphics.RectF();
        this.tC = new android.graphics.Paint();
        this.rri = new android.graphics.Path();
        if (android.os.Build.VERSION.SDK_INT <= 27) {
            this.yDt = new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_IN);
        } else {
            this.yDt = new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OUT);
            this.kMt = new android.graphics.Path();
        }
        bX();
        eqN();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.Lq = i;
        this.vb = i2;
        bg();
        IL();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        canvas.saveLayer(this.Fy, null, 31);
        if (!this.bX) {
            int i = this.Lq;
            int i2 = this.eqN;
            int i3 = this.ldr;
            int i4 = this.vb;
            canvas.scale((((i - (i2 * 2)) - (i3 * 2)) * 1.0f) / i, (((i4 - (i2 * 2)) - (i3 * 2)) * 1.0f) / i4, i / 2.0f, i4 / 2.0f);
        }
        super.onDraw(canvas);
        this.tC.reset();
        this.rri.reset();
        if (this.IL) {
            this.rri.addCircle(this.Lq / 2.0f, this.vb / 2.0f, this.xxp, android.graphics.Path.Direction.CCW);
        } else {
            this.rri.addRoundRect(this.Fy, this.tuV, android.graphics.Path.Direction.CCW);
        }
        this.tC.setAntiAlias(true);
        this.tC.setStyle(android.graphics.Paint.Style.FILL);
        this.tC.setXfermode(this.yDt);
        if (android.os.Build.VERSION.SDK_INT <= 27) {
            canvas.drawPath(this.rri, this.tC);
        } else {
            this.kMt.addRect(this.Fy, android.graphics.Path.Direction.CCW);
            this.kMt.op(this.rri, android.graphics.Path.Op.DIFFERENCE);
            canvas.drawPath(this.kMt, this.tC);
        }
        this.tC.setXfermode(null);
        int i5 = this.Ta;
        if (i5 != 0) {
            this.tC.setColor(i5);
            canvas.drawPath(this.rri, this.tC);
        }
        canvas.restore();
        bg(canvas);
    }

    private void bg(android.graphics.Canvas canvas) {
        if (this.IL) {
            int i = this.eqN;
            if (i > 0) {
                bg(canvas, i, this.zx, this.xxp - (i / 2.0f));
            }
            int i2 = this.ldr;
            if (i2 > 0) {
                bg(canvas, i2, this.iR, (this.xxp - this.eqN) - (i2 / 2.0f));
                return;
            }
            return;
        }
        int i3 = this.eqN;
        if (i3 > 0) {
            bg(canvas, i3, this.zx, this.LZ, this.VzQ);
        }
    }

    private void bg(android.graphics.Canvas canvas, int i, int i2, float f) {
        bg(i, i2);
        this.rri.addCircle(this.Lq / 2.0f, this.vb / 2.0f, f, android.graphics.Path.Direction.CCW);
        canvas.drawPath(this.rri, this.tC);
    }

    private void bg(android.graphics.Canvas canvas, int i, int i2, android.graphics.RectF rectF, float[] fArr) {
        bg(i, i2);
        this.rri.addRoundRect(rectF, fArr, android.graphics.Path.Direction.CCW);
        canvas.drawPath(this.rri, this.tC);
    }

    private void bg(int i, int i2) {
        this.rri.reset();
        this.tC.setStrokeWidth(i);
        this.tC.setColor(i2);
        this.tC.setStyle(android.graphics.Paint.Style.STROKE);
    }

    private void bg() {
        if (this.IL) {
            return;
        }
        android.graphics.RectF rectF = this.LZ;
        int i = this.eqN;
        rectF.set(i / 2.0f, i / 2.0f, this.Lq - (i / 2.0f), this.vb - (i / 2.0f));
    }

    private void IL() {
        if (this.IL) {
            float fMin = java.lang.Math.min(this.Lq, this.vb) / 2.0f;
            this.xxp = fMin;
            android.graphics.RectF rectF = this.Fy;
            int i = this.Lq;
            int i2 = this.vb;
            rectF.set((i / 2.0f) - fMin, (i2 / 2.0f) - fMin, (i / 2.0f) + fMin, (i2 / 2.0f) + fMin);
            return;
        }
        this.Fy.set(0.0f, 0.0f, this.Lq, this.vb);
        if (this.bX) {
            this.Fy = this.LZ;
        }
    }

    private void bX() {
        if (this.IL) {
            return;
        }
        int i = 0;
        if (this.Kg <= 0) {
            float[] fArr = this.VzQ;
            int i2 = this.WR;
            float f = i2;
            fArr[1] = f;
            fArr[0] = f;
            int i3 = this.eo;
            float f2 = i3;
            fArr[3] = f2;
            fArr[2] = f2;
            int i4 = this.PX;
            float f3 = i4;
            fArr[5] = f3;
            fArr[4] = f3;
            int i5 = this.VB;
            float f4 = i5;
            fArr[7] = f4;
            fArr[6] = f4;
            float[] fArr2 = this.tuV;
            int i6 = this.eqN;
            float f5 = i2 - (i6 / 2.0f);
            fArr2[1] = f5;
            fArr2[0] = f5;
            float f6 = i3 - (i6 / 2.0f);
            fArr2[3] = f6;
            fArr2[2] = f6;
            float f7 = i4 - (i6 / 2.0f);
            fArr2[5] = f7;
            fArr2[4] = f7;
            float f8 = i5 - (i6 / 2.0f);
            fArr2[7] = f8;
            fArr2[6] = f8;
            return;
        }
        while (true) {
            float[] fArr3 = this.VzQ;
            if (i >= fArr3.length) {
                return;
            }
            int i7 = this.Kg;
            fArr3[i] = i7;
            this.tuV[i] = i7 - (this.eqN / 2.0f);
            i++;
        }
    }

    private void bg(boolean z) {
        if (z) {
            this.Kg = 0;
        }
        bX();
        bg();
        invalidate();
    }

    private void eqN() {
        if (this.IL) {
            return;
        }
        this.ldr = 0;
    }

    public void isCoverSrc(boolean z) {
        this.bX = z;
        IL();
        invalidate();
    }

    public void isCircle(boolean z) {
        this.IL = z;
        eqN();
        IL();
        invalidate();
    }

    public void setBorderWidth(int i) {
        this.eqN = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.bg, i);
        bg(false);
    }

    public void setBorderColor(int i) {
        this.zx = i;
        invalidate();
    }

    public void setInnerBorderWidth(int i) {
        this.ldr = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.bg, i);
        eqN();
        invalidate();
    }

    public void setInnerBorderColor(int i) {
        this.iR = i;
        invalidate();
    }

    public void setCornerRadius(int i) {
        this.Kg = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.bg, i);
        bg(false);
    }

    public void setCornerTopLeftRadius(int i) {
        this.WR = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.bg, i);
        bg(true);
    }

    public void setCornerTopRightRadius(int i) {
        this.eo = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.bg, i);
        bg(true);
    }

    public void setCornerBottomLeftRadius(int i) {
        this.VB = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.bg, i);
        bg(true);
    }

    public void setCornerBottomRightRadius(int i) {
        this.PX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.bg, i);
        bg(true);
    }

    public void setMaskColor(int i) {
        this.Ta = i;
        invalidate();
    }
}

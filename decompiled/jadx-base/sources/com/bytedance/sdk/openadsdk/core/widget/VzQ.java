package com.bytedance.sdk.openadsdk.core.widget;

/* JADX INFO: loaded from: classes4.dex */
public class VzQ extends com.bytedance.sdk.openadsdk.core.zx.eqN {
    private int IL;
    private int bX;
    private final android.graphics.Paint bg;
    private final android.graphics.Matrix eqN;
    private android.graphics.BitmapShader ldr;
    private final android.graphics.RectF zx;

    public VzQ(android.content.Context context) {
        this(context, null);
    }

    public VzQ(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VzQ(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.IL = 25;
        this.bX = 25;
        this.zx = new android.graphics.RectF();
        android.graphics.Paint paint = new android.graphics.Paint();
        this.bg = paint;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        this.eqN = new android.graphics.Matrix();
    }

    public void setXRound(int i) {
        this.IL = i;
        postInvalidate();
    }

    public void setYRound(int i) {
        this.bX = i;
        postInvalidate();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.zx.set(0.0f, 0.0f, i, i2);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        android.graphics.Bitmap bitmapBg;
        android.graphics.drawable.Drawable drawable = getDrawable();
        if (drawable == null) {
            super.onDraw(canvas);
            return;
        }
        if (this.ldr == null && (bitmapBg = bg(drawable)) != null) {
            android.graphics.Shader.TileMode tileMode = android.graphics.Shader.TileMode.REPEAT;
            this.ldr = new android.graphics.BitmapShader(bitmapBg, tileMode, tileMode);
            float fMax = (bitmapBg.getWidth() == getWidth() && bitmapBg.getHeight() == getHeight()) ? 1.0f : java.lang.Math.max((getWidth() * 1.0f) / bitmapBg.getWidth(), (getHeight() * 1.0f) / bitmapBg.getHeight());
            this.eqN.setScale(fMax, fMax);
            this.ldr.setLocalMatrix(this.eqN);
        }
        android.graphics.BitmapShader bitmapShader = this.ldr;
        if (bitmapShader != null) {
            this.bg.setShader(bitmapShader);
            canvas.drawRoundRect(this.zx, this.IL, this.bX, this.bg);
        } else {
            super.onDraw(canvas);
        }
    }

    @Override // android.view.View
    public void unscheduleDrawable(android.graphics.drawable.Drawable drawable) {
        super.unscheduleDrawable(drawable);
        this.ldr = null;
    }

    private android.graphics.Bitmap bg(android.graphics.drawable.Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof android.graphics.drawable.BitmapDrawable) {
            return ((android.graphics.drawable.BitmapDrawable) drawable).getBitmap();
        }
        int width = drawable.getIntrinsicWidth() <= 0 ? getWidth() : drawable.getIntrinsicWidth();
        int height = drawable.getIntrinsicHeight() <= 0 ? getHeight() : drawable.getIntrinsicHeight();
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(width, height, android.graphics.Bitmap.Config.ARGB_8888);
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, width, height);
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }
}

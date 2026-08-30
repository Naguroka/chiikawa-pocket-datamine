package com.bytedance.sdk.component.adexpress.ldr;

/* JADX INFO: loaded from: classes3.dex */
public class Ja extends android.widget.ImageView {
    private int IL;
    private int bX;
    private android.graphics.Paint bg;
    private android.graphics.Matrix eqN;

    public Ja(android.content.Context context) {
        this(context, null);
    }

    public Ja(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Ja(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.IL = 25;
        this.bX = 25;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.bg = paint;
        paint.setAntiAlias(true);
        this.bg.setFilterBitmap(true);
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

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        android.graphics.drawable.Drawable drawable = getDrawable();
        if (drawable != null) {
            android.graphics.Bitmap bitmapBg = bg(drawable);
            if (bitmapBg != null) {
                android.graphics.Shader.TileMode tileMode = android.graphics.Shader.TileMode.REPEAT;
                android.graphics.BitmapShader bitmapShader = new android.graphics.BitmapShader(bitmapBg, tileMode, tileMode);
                float fMax = (bitmapBg.getWidth() == getWidth() && bitmapBg.getHeight() == getHeight()) ? 1.0f : java.lang.Math.max((getWidth() * 1.0f) / bitmapBg.getWidth(), (getHeight() * 1.0f) / bitmapBg.getHeight());
                this.eqN.setScale(fMax, fMax);
                bitmapShader.setLocalMatrix(this.eqN);
                this.bg.setShader(bitmapShader);
                canvas.drawRoundRect(new android.graphics.RectF(0.0f, 0.0f, getWidth(), getHeight()), this.IL, this.bX, this.bg);
                return;
            }
            super.onDraw(canvas);
            return;
        }
        super.onDraw(canvas);
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

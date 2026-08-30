package androidx.core.graphics.drawable;

/* JADX INFO: loaded from: classes.dex */
public abstract class RoundedBitmapDrawable extends android.graphics.drawable.Drawable {
    private static final int DEFAULT_PAINT_FLAGS = 3;
    final android.graphics.Bitmap mBitmap;
    private int mBitmapHeight;
    private final android.graphics.BitmapShader mBitmapShader;
    private int mBitmapWidth;
    private float mCornerRadius;
    private boolean mIsCircular;
    private int mTargetDensity;
    private int mGravity = 119;
    private final android.graphics.Paint mPaint = new android.graphics.Paint(3);
    private final android.graphics.Matrix mShaderMatrix = new android.graphics.Matrix();
    final android.graphics.Rect mDstRect = new android.graphics.Rect();
    private final android.graphics.RectF mDstRectF = new android.graphics.RectF();
    private boolean mApplyGravity = true;

    private static boolean isGreaterThanZero(float f) {
        return f > 0.05f;
    }

    public final android.graphics.Paint getPaint() {
        return this.mPaint;
    }

    public final android.graphics.Bitmap getBitmap() {
        return this.mBitmap;
    }

    private void computeBitmapSize() {
        this.mBitmapWidth = this.mBitmap.getScaledWidth(this.mTargetDensity);
        this.mBitmapHeight = this.mBitmap.getScaledHeight(this.mTargetDensity);
    }

    public void setTargetDensity(android.graphics.Canvas canvas) {
        setTargetDensity(canvas.getDensity());
    }

    public void setTargetDensity(android.util.DisplayMetrics displayMetrics) {
        setTargetDensity(displayMetrics.densityDpi);
    }

    public void setTargetDensity(int i) {
        if (this.mTargetDensity != i) {
            if (i == 0) {
                i = org.objectweb.asm.Opcodes.IF_ICMPNE;
            }
            this.mTargetDensity = i;
            if (this.mBitmap != null) {
                computeBitmapSize();
            }
            invalidateSelf();
        }
    }

    public int getGravity() {
        return this.mGravity;
    }

    public void setGravity(int i) {
        if (this.mGravity != i) {
            this.mGravity = i;
            this.mApplyGravity = true;
            invalidateSelf();
        }
    }

    public void setMipMap(boolean z) {
        throw new java.lang.UnsupportedOperationException();
    }

    public boolean hasMipMap() {
        throw new java.lang.UnsupportedOperationException();
    }

    public void setAntiAlias(boolean z) {
        this.mPaint.setAntiAlias(z);
        invalidateSelf();
    }

    public boolean hasAntiAlias() {
        return this.mPaint.isAntiAlias();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.mPaint.setFilterBitmap(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.mPaint.setDither(z);
        invalidateSelf();
    }

    void gravityCompatApply(int i, int i2, int i3, android.graphics.Rect rect, android.graphics.Rect rect2) {
        throw new java.lang.UnsupportedOperationException();
    }

    void updateDstRect() {
        if (this.mApplyGravity) {
            if (this.mIsCircular) {
                int iMin = java.lang.Math.min(this.mBitmapWidth, this.mBitmapHeight);
                gravityCompatApply(this.mGravity, iMin, iMin, getBounds(), this.mDstRect);
                int iMin2 = java.lang.Math.min(this.mDstRect.width(), this.mDstRect.height());
                this.mDstRect.inset(java.lang.Math.max(0, (this.mDstRect.width() - iMin2) / 2), java.lang.Math.max(0, (this.mDstRect.height() - iMin2) / 2));
                this.mCornerRadius = iMin2 * 0.5f;
            } else {
                gravityCompatApply(this.mGravity, this.mBitmapWidth, this.mBitmapHeight, getBounds(), this.mDstRect);
            }
            this.mDstRectF.set(this.mDstRect);
            if (this.mBitmapShader != null) {
                this.mShaderMatrix.setTranslate(this.mDstRectF.left, this.mDstRectF.top);
                this.mShaderMatrix.preScale(this.mDstRectF.width() / this.mBitmap.getWidth(), this.mDstRectF.height() / this.mBitmap.getHeight());
                this.mBitmapShader.setLocalMatrix(this.mShaderMatrix);
                this.mPaint.setShader(this.mBitmapShader);
            }
            this.mApplyGravity = false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        android.graphics.Bitmap bitmap = this.mBitmap;
        if (bitmap == null) {
            return;
        }
        updateDstRect();
        if (this.mPaint.getShader() == null) {
            canvas.drawBitmap(bitmap, (android.graphics.Rect) null, this.mDstRect, this.mPaint);
            return;
        }
        android.graphics.RectF rectF = this.mDstRectF;
        float f = this.mCornerRadius;
        canvas.drawRoundRect(rectF, f, f, this.mPaint);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.mPaint.getAlpha()) {
            this.mPaint.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.mPaint.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.mPaint.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.ColorFilter getColorFilter() {
        return this.mPaint.getColorFilter();
    }

    public void setCircular(boolean z) {
        this.mIsCircular = z;
        this.mApplyGravity = true;
        if (z) {
            updateCircularCornerRadius();
            this.mPaint.setShader(this.mBitmapShader);
            invalidateSelf();
            return;
        }
        setCornerRadius(0.0f);
    }

    private void updateCircularCornerRadius() {
        this.mCornerRadius = java.lang.Math.min(this.mBitmapHeight, this.mBitmapWidth) / 2;
    }

    public boolean isCircular() {
        return this.mIsCircular;
    }

    public void setCornerRadius(float f) {
        if (this.mCornerRadius == f) {
            return;
        }
        this.mIsCircular = false;
        if (isGreaterThanZero(f)) {
            this.mPaint.setShader(this.mBitmapShader);
        } else {
            this.mPaint.setShader(null);
        }
        this.mCornerRadius = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(android.graphics.Rect rect) {
        super.onBoundsChange(rect);
        if (this.mIsCircular) {
            updateCircularCornerRadius();
        }
        this.mApplyGravity = true;
    }

    public float getCornerRadius() {
        return this.mCornerRadius;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.mBitmapWidth;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.mBitmapHeight;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        android.graphics.Bitmap bitmap;
        return (this.mGravity != 119 || this.mIsCircular || (bitmap = this.mBitmap) == null || bitmap.hasAlpha() || this.mPaint.getAlpha() < 255 || isGreaterThanZero(this.mCornerRadius)) ? -3 : -1;
    }

    RoundedBitmapDrawable(android.content.res.Resources resources, android.graphics.Bitmap bitmap) {
        this.mTargetDensity = org.objectweb.asm.Opcodes.IF_ICMPNE;
        if (resources != null) {
            this.mTargetDensity = resources.getDisplayMetrics().densityDpi;
        }
        this.mBitmap = bitmap;
        if (bitmap != null) {
            computeBitmapSize();
            this.mBitmapShader = new android.graphics.BitmapShader(bitmap, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP);
        } else {
            this.mBitmapHeight = -1;
            this.mBitmapWidth = -1;
            this.mBitmapShader = null;
        }
    }
}

package androidx.cardview.widget;

/* JADX INFO: loaded from: classes.dex */
class RoundRectDrawableWithShadow extends android.graphics.drawable.Drawable {
    private static final double COS_45 = java.lang.Math.cos(java.lang.Math.toRadians(45.0d));
    private static final float SHADOW_MULTIPLIER = 1.5f;
    static androidx.cardview.widget.RoundRectDrawableWithShadow.RoundRectHelper sRoundRectHelper;
    private android.content.res.ColorStateList mBackground;
    private final android.graphics.RectF mCardBounds;
    private float mCornerRadius;
    private android.graphics.Paint mCornerShadowPaint;
    private android.graphics.Path mCornerShadowPath;
    private android.graphics.Paint mEdgeShadowPaint;
    private final int mInsetShadow;
    private float mRawMaxShadowSize;
    private float mRawShadowSize;
    private final int mShadowEndColor;
    private float mShadowSize;
    private final int mShadowStartColor;
    private boolean mDirty = true;
    private boolean mAddPaddingForCorners = true;
    private boolean mPrintedShadowClipWarning = false;
    private android.graphics.Paint mPaint = new android.graphics.Paint(5);

    interface RoundRectHelper {
        void drawRoundRect(android.graphics.Canvas canvas, android.graphics.RectF rectF, float f, android.graphics.Paint paint);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    RoundRectDrawableWithShadow(android.content.res.Resources resources, android.content.res.ColorStateList colorStateList, float f, float f2, float f3) {
        this.mShadowStartColor = resources.getColor(androidx.cardview.R.color.cardview_shadow_start_color);
        this.mShadowEndColor = resources.getColor(androidx.cardview.R.color.cardview_shadow_end_color);
        this.mInsetShadow = resources.getDimensionPixelSize(androidx.cardview.R.dimen.cardview_compat_inset_shadow);
        setBackground(colorStateList);
        android.graphics.Paint paint = new android.graphics.Paint(5);
        this.mCornerShadowPaint = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.mCornerRadius = (int) (f + 0.5f);
        this.mCardBounds = new android.graphics.RectF();
        android.graphics.Paint paint2 = new android.graphics.Paint(this.mCornerShadowPaint);
        this.mEdgeShadowPaint = paint2;
        paint2.setAntiAlias(false);
        setShadowSize(f2, f3);
    }

    private void setBackground(android.content.res.ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = android.content.res.ColorStateList.valueOf(0);
        }
        this.mBackground = colorStateList;
        this.mPaint.setColor(colorStateList.getColorForState(getState(), this.mBackground.getDefaultColor()));
    }

    private int toEven(float f) {
        int i = (int) (f + 0.5f);
        return i % 2 == 1 ? i - 1 : i;
    }

    void setAddPaddingForCorners(boolean z) {
        this.mAddPaddingForCorners = z;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.mPaint.setAlpha(i);
        this.mCornerShadowPaint.setAlpha(i);
        this.mEdgeShadowPaint.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(android.graphics.Rect rect) {
        super.onBoundsChange(rect);
        this.mDirty = true;
    }

    private void setShadowSize(float f, float f2) {
        if (f < 0.0f) {
            throw new java.lang.IllegalArgumentException("Invalid shadow size " + f + ". Must be >= 0");
        }
        if (f2 < 0.0f) {
            throw new java.lang.IllegalArgumentException("Invalid max shadow size " + f2 + ". Must be >= 0");
        }
        float even = toEven(f);
        float even2 = toEven(f2);
        if (even > even2) {
            if (!this.mPrintedShadowClipWarning) {
                this.mPrintedShadowClipWarning = true;
            }
            even = even2;
        }
        if (this.mRawShadowSize == even && this.mRawMaxShadowSize == even2) {
            return;
        }
        this.mRawShadowSize = even;
        this.mRawMaxShadowSize = even2;
        this.mShadowSize = (int) ((even * SHADOW_MULTIPLIER) + this.mInsetShadow + 0.5f);
        this.mDirty = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(android.graphics.Rect rect) {
        int iCeil = (int) java.lang.Math.ceil(calculateVerticalPadding(this.mRawMaxShadowSize, this.mCornerRadius, this.mAddPaddingForCorners));
        int iCeil2 = (int) java.lang.Math.ceil(calculateHorizontalPadding(this.mRawMaxShadowSize, this.mCornerRadius, this.mAddPaddingForCorners));
        rect.set(iCeil2, iCeil, iCeil2, iCeil);
        return true;
    }

    static float calculateVerticalPadding(float f, float f2, boolean z) {
        return z ? (float) (((double) (f * SHADOW_MULTIPLIER)) + ((1.0d - COS_45) * ((double) f2))) : f * SHADOW_MULTIPLIER;
    }

    static float calculateHorizontalPadding(float f, float f2, boolean z) {
        return z ? (float) (((double) f) + ((1.0d - COS_45) * ((double) f2))) : f;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        android.content.res.ColorStateList colorStateList = this.mBackground;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.mPaint.getColor() == colorForState) {
            return false;
        }
        this.mPaint.setColor(colorForState);
        this.mDirty = true;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        android.content.res.ColorStateList colorStateList = this.mBackground;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.mPaint.setColorFilter(colorFilter);
    }

    void setCornerRadius(float f) {
        if (f < 0.0f) {
            throw new java.lang.IllegalArgumentException("Invalid radius " + f + ". Must be >= 0");
        }
        float f2 = (int) (f + 0.5f);
        if (this.mCornerRadius == f2) {
            return;
        }
        this.mCornerRadius = f2;
        this.mDirty = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        if (this.mDirty) {
            buildComponents(getBounds());
            this.mDirty = false;
        }
        canvas.translate(0.0f, this.mRawShadowSize / 2.0f);
        drawShadow(canvas);
        canvas.translate(0.0f, (-this.mRawShadowSize) / 2.0f);
        sRoundRectHelper.drawRoundRect(canvas, this.mCardBounds, this.mCornerRadius, this.mPaint);
    }

    private void drawShadow(android.graphics.Canvas canvas) {
        float f = this.mCornerRadius;
        float f2 = (-f) - this.mShadowSize;
        float f3 = f + this.mInsetShadow + (this.mRawShadowSize / 2.0f);
        float f4 = f3 * 2.0f;
        boolean z = this.mCardBounds.width() - f4 > 0.0f;
        boolean z2 = this.mCardBounds.height() - f4 > 0.0f;
        int iSave = canvas.save();
        canvas.translate(this.mCardBounds.left + f3, this.mCardBounds.top + f3);
        canvas.drawPath(this.mCornerShadowPath, this.mCornerShadowPaint);
        if (z) {
            canvas.drawRect(0.0f, f2, this.mCardBounds.width() - f4, -this.mCornerRadius, this.mEdgeShadowPaint);
        }
        canvas.restoreToCount(iSave);
        int iSave2 = canvas.save();
        canvas.translate(this.mCardBounds.right - f3, this.mCardBounds.bottom - f3);
        canvas.rotate(180.0f);
        canvas.drawPath(this.mCornerShadowPath, this.mCornerShadowPaint);
        if (z) {
            canvas.drawRect(0.0f, f2, this.mCardBounds.width() - f4, (-this.mCornerRadius) + this.mShadowSize, this.mEdgeShadowPaint);
        }
        canvas.restoreToCount(iSave2);
        int iSave3 = canvas.save();
        canvas.translate(this.mCardBounds.left + f3, this.mCardBounds.bottom - f3);
        canvas.rotate(270.0f);
        canvas.drawPath(this.mCornerShadowPath, this.mCornerShadowPaint);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.mCardBounds.height() - f4, -this.mCornerRadius, this.mEdgeShadowPaint);
        }
        canvas.restoreToCount(iSave3);
        int iSave4 = canvas.save();
        canvas.translate(this.mCardBounds.right - f3, this.mCardBounds.top + f3);
        canvas.rotate(90.0f);
        canvas.drawPath(this.mCornerShadowPath, this.mCornerShadowPaint);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.mCardBounds.height() - f4, -this.mCornerRadius, this.mEdgeShadowPaint);
        }
        canvas.restoreToCount(iSave4);
    }

    private void buildShadowCorners() {
        float f = this.mCornerRadius;
        android.graphics.RectF rectF = new android.graphics.RectF(-f, -f, f, f);
        android.graphics.RectF rectF2 = new android.graphics.RectF(rectF);
        float f2 = this.mShadowSize;
        rectF2.inset(-f2, -f2);
        android.graphics.Path path = this.mCornerShadowPath;
        if (path == null) {
            this.mCornerShadowPath = new android.graphics.Path();
        } else {
            path.reset();
        }
        this.mCornerShadowPath.setFillType(android.graphics.Path.FillType.EVEN_ODD);
        this.mCornerShadowPath.moveTo(-this.mCornerRadius, 0.0f);
        this.mCornerShadowPath.rLineTo(-this.mShadowSize, 0.0f);
        this.mCornerShadowPath.arcTo(rectF2, 180.0f, 90.0f, false);
        this.mCornerShadowPath.arcTo(rectF, 270.0f, -90.0f, false);
        this.mCornerShadowPath.close();
        float f3 = this.mCornerRadius;
        float f4 = f3 / (this.mShadowSize + f3);
        android.graphics.Paint paint = this.mCornerShadowPaint;
        float f5 = this.mCornerRadius + this.mShadowSize;
        int i = this.mShadowStartColor;
        paint.setShader(new android.graphics.RadialGradient(0.0f, 0.0f, f5, new int[]{i, i, this.mShadowEndColor}, new float[]{0.0f, f4, 1.0f}, android.graphics.Shader.TileMode.CLAMP));
        android.graphics.Paint paint2 = this.mEdgeShadowPaint;
        float f6 = this.mCornerRadius;
        float f7 = this.mShadowSize;
        int i2 = this.mShadowStartColor;
        paint2.setShader(new android.graphics.LinearGradient(0.0f, (-f6) + f7, 0.0f, (-f6) - f7, new int[]{i2, i2, this.mShadowEndColor}, new float[]{0.0f, 0.5f, 1.0f}, android.graphics.Shader.TileMode.CLAMP));
        this.mEdgeShadowPaint.setAntiAlias(false);
    }

    private void buildComponents(android.graphics.Rect rect) {
        float f = this.mRawMaxShadowSize * SHADOW_MULTIPLIER;
        this.mCardBounds.set(rect.left + this.mRawMaxShadowSize, rect.top + f, rect.right - this.mRawMaxShadowSize, rect.bottom - f);
        buildShadowCorners();
    }

    float getCornerRadius() {
        return this.mCornerRadius;
    }

    void getMaxShadowAndCornerPadding(android.graphics.Rect rect) {
        getPadding(rect);
    }

    void setShadowSize(float f) {
        setShadowSize(f, this.mRawMaxShadowSize);
    }

    void setMaxShadowSize(float f) {
        setShadowSize(this.mRawShadowSize, f);
    }

    float getShadowSize() {
        return this.mRawShadowSize;
    }

    float getMaxShadowSize() {
        return this.mRawMaxShadowSize;
    }

    float getMinWidth() {
        float f = this.mRawMaxShadowSize;
        return (java.lang.Math.max(f, this.mCornerRadius + this.mInsetShadow + (f / 2.0f)) * 2.0f) + ((this.mRawMaxShadowSize + this.mInsetShadow) * 2.0f);
    }

    float getMinHeight() {
        float f = this.mRawMaxShadowSize;
        return (java.lang.Math.max(f, this.mCornerRadius + this.mInsetShadow + ((f * SHADOW_MULTIPLIER) / 2.0f)) * 2.0f) + (((this.mRawMaxShadowSize * SHADOW_MULTIPLIER) + this.mInsetShadow) * 2.0f);
    }

    void setColor(android.content.res.ColorStateList colorStateList) {
        setBackground(colorStateList);
        invalidateSelf();
    }

    android.content.res.ColorStateList getColor() {
        return this.mBackground;
    }
}

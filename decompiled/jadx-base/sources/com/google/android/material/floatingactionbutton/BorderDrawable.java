package com.google.android.material.floatingactionbutton;

/* JADX INFO: loaded from: classes5.dex */
class BorderDrawable extends android.graphics.drawable.Drawable {
    private static final float DRAW_STROKE_WIDTH_MULTIPLE = 1.3333f;
    private android.content.res.ColorStateList borderTint;
    float borderWidth;
    private int bottomInnerStrokeColor;
    private int bottomOuterStrokeColor;
    private int currentBorderTintColor;
    private final android.graphics.Paint paint;
    private com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel;
    private int topInnerStrokeColor;
    private int topOuterStrokeColor;
    private final com.google.android.material.shape.ShapeAppearancePathProvider pathProvider = com.google.android.material.shape.ShapeAppearancePathProvider.getInstance();
    private final android.graphics.Path shapePath = new android.graphics.Path();
    private final android.graphics.Rect rect = new android.graphics.Rect();
    private final android.graphics.RectF rectF = new android.graphics.RectF();
    private final android.graphics.RectF boundsRectF = new android.graphics.RectF();
    private final com.google.android.material.floatingactionbutton.BorderDrawable.BorderState state = new com.google.android.material.floatingactionbutton.BorderDrawable.BorderState();
    private boolean invalidateShader = true;

    BorderDrawable(com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel) {
        this.shapeAppearanceModel = shapeAppearanceModel;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.paint = paint;
        paint.setStyle(android.graphics.Paint.Style.STROKE);
    }

    public void setBorderWidth(float f) {
        if (this.borderWidth != f) {
            this.borderWidth = f;
            this.paint.setStrokeWidth(f * DRAW_STROKE_WIDTH_MULTIPLE);
            this.invalidateShader = true;
            invalidateSelf();
        }
    }

    void setBorderTint(android.content.res.ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.currentBorderTintColor = colorStateList.getColorForState(getState(), this.currentBorderTintColor);
        }
        this.borderTint = colorStateList;
        this.invalidateShader = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
        invalidateSelf();
    }

    void setGradientColors(int i, int i2, int i3, int i4) {
        this.topOuterStrokeColor = i;
        this.topInnerStrokeColor = i2;
        this.bottomOuterStrokeColor = i3;
        this.bottomInnerStrokeColor = i4;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        if (this.invalidateShader) {
            this.paint.setShader(createGradientShader());
            this.invalidateShader = false;
        }
        float strokeWidth = this.paint.getStrokeWidth() / 2.0f;
        copyBounds(this.rect);
        this.rectF.set(this.rect);
        float fMin = java.lang.Math.min(this.shapeAppearanceModel.getTopLeftCornerSize().getCornerSize(getBoundsAsRectF()), this.rectF.width() / 2.0f);
        if (this.shapeAppearanceModel.isRoundRect(getBoundsAsRectF())) {
            this.rectF.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.rectF, fMin, fMin, this.paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(android.graphics.Outline outline) {
        if (this.shapeAppearanceModel.isRoundRect(getBoundsAsRectF())) {
            outline.setRoundRect(getBounds(), this.shapeAppearanceModel.getTopLeftCornerSize().getCornerSize(getBoundsAsRectF()));
            return;
        }
        copyBounds(this.rect);
        this.rectF.set(this.rect);
        this.pathProvider.calculatePath(this.shapeAppearanceModel, 1.0f, this.rectF, this.shapePath);
        if (this.shapePath.isConvex()) {
            outline.setConvexPath(this.shapePath);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(android.graphics.Rect rect) {
        if (!this.shapeAppearanceModel.isRoundRect(getBoundsAsRectF())) {
            return true;
        }
        int iRound = java.lang.Math.round(this.borderWidth);
        rect.set(iRound, iRound, iRound, iRound);
        return true;
    }

    protected android.graphics.RectF getBoundsAsRectF() {
        this.boundsRectF.set(getBounds());
        return this.boundsRectF;
    }

    public com.google.android.material.shape.ShapeAppearanceModel getShapeAppearanceModel() {
        return this.shapeAppearanceModel;
    }

    public void setShapeAppearanceModel(com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel) {
        this.shapeAppearanceModel = shapeAppearanceModel;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.paint.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.borderWidth > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(android.graphics.Rect rect) {
        this.invalidateShader = true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        android.content.res.ColorStateList colorStateList = this.borderTint;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int colorForState;
        android.content.res.ColorStateList colorStateList = this.borderTint;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.currentBorderTintColor)) != this.currentBorderTintColor) {
            this.invalidateShader = true;
            this.currentBorderTintColor = colorForState;
        }
        if (this.invalidateShader) {
            invalidateSelf();
        }
        return this.invalidateShader;
    }

    private android.graphics.Shader createGradientShader() {
        android.graphics.Rect rect = this.rect;
        copyBounds(rect);
        float fHeight = this.borderWidth / rect.height();
        return new android.graphics.LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{androidx.core.graphics.ColorUtils.compositeColors(this.topOuterStrokeColor, this.currentBorderTintColor), androidx.core.graphics.ColorUtils.compositeColors(this.topInnerStrokeColor, this.currentBorderTintColor), androidx.core.graphics.ColorUtils.compositeColors(androidx.core.graphics.ColorUtils.setAlphaComponent(this.topInnerStrokeColor, 0), this.currentBorderTintColor), androidx.core.graphics.ColorUtils.compositeColors(androidx.core.graphics.ColorUtils.setAlphaComponent(this.bottomInnerStrokeColor, 0), this.currentBorderTintColor), androidx.core.graphics.ColorUtils.compositeColors(this.bottomInnerStrokeColor, this.currentBorderTintColor), androidx.core.graphics.ColorUtils.compositeColors(this.bottomOuterStrokeColor, this.currentBorderTintColor)}, new float[]{0.0f, fHeight, 0.5f, 0.5f, 1.0f - fHeight, 1.0f}, android.graphics.Shader.TileMode.CLAMP);
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable.ConstantState getConstantState() {
        return this.state;
    }

    private class BorderState extends android.graphics.drawable.Drawable.ConstantState {
        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        private BorderState() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable() {
            return com.google.android.material.floatingactionbutton.BorderDrawable.this;
        }
    }
}

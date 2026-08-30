package com.google.android.material.button;

/* JADX INFO: loaded from: classes5.dex */
class MaterialButtonHelper {
    private android.content.res.ColorStateList backgroundTint;
    private android.graphics.PorterDuff.Mode backgroundTintMode;
    private boolean checkable;
    private int cornerRadius;
    private int elevation;
    private int insetBottom;
    private int insetLeft;
    private int insetRight;
    private int insetTop;
    private android.graphics.drawable.Drawable maskDrawable;
    private final com.google.android.material.button.MaterialButton materialButton;
    private android.content.res.ColorStateList rippleColor;
    private android.graphics.drawable.LayerDrawable rippleDrawable;
    private com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel;
    private android.content.res.ColorStateList strokeColor;
    private int strokeWidth;
    private static final boolean IS_MIN_LOLLIPOP = true;
    private static final boolean IS_LOLLIPOP = false;
    private boolean shouldDrawSurfaceColorStroke = false;
    private boolean backgroundOverwritten = false;
    private boolean cornerRadiusSet = false;
    private boolean toggleCheckedStateOnClick = true;

    MaterialButtonHelper(com.google.android.material.button.MaterialButton materialButton, com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel) {
        this.materialButton = materialButton;
        this.shapeAppearanceModel = shapeAppearanceModel;
    }

    void loadFromAttributes(android.content.res.TypedArray typedArray) {
        this.insetLeft = typedArray.getDimensionPixelOffset(com.google.android.material.R.styleable.MaterialButton_android_insetLeft, 0);
        this.insetRight = typedArray.getDimensionPixelOffset(com.google.android.material.R.styleable.MaterialButton_android_insetRight, 0);
        this.insetTop = typedArray.getDimensionPixelOffset(com.google.android.material.R.styleable.MaterialButton_android_insetTop, 0);
        this.insetBottom = typedArray.getDimensionPixelOffset(com.google.android.material.R.styleable.MaterialButton_android_insetBottom, 0);
        if (typedArray.hasValue(com.google.android.material.R.styleable.MaterialButton_cornerRadius)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(com.google.android.material.R.styleable.MaterialButton_cornerRadius, -1);
            this.cornerRadius = dimensionPixelSize;
            setShapeAppearanceModel(this.shapeAppearanceModel.withCornerSize(dimensionPixelSize));
            this.cornerRadiusSet = true;
        }
        this.strokeWidth = typedArray.getDimensionPixelSize(com.google.android.material.R.styleable.MaterialButton_strokeWidth, 0);
        this.backgroundTintMode = com.google.android.material.internal.ViewUtils.parseTintMode(typedArray.getInt(com.google.android.material.R.styleable.MaterialButton_backgroundTintMode, -1), android.graphics.PorterDuff.Mode.SRC_IN);
        this.backgroundTint = com.google.android.material.resources.MaterialResources.getColorStateList(this.materialButton.getContext(), typedArray, com.google.android.material.R.styleable.MaterialButton_backgroundTint);
        this.strokeColor = com.google.android.material.resources.MaterialResources.getColorStateList(this.materialButton.getContext(), typedArray, com.google.android.material.R.styleable.MaterialButton_strokeColor);
        this.rippleColor = com.google.android.material.resources.MaterialResources.getColorStateList(this.materialButton.getContext(), typedArray, com.google.android.material.R.styleable.MaterialButton_rippleColor);
        this.checkable = typedArray.getBoolean(com.google.android.material.R.styleable.MaterialButton_android_checkable, false);
        this.elevation = typedArray.getDimensionPixelSize(com.google.android.material.R.styleable.MaterialButton_elevation, 0);
        this.toggleCheckedStateOnClick = typedArray.getBoolean(com.google.android.material.R.styleable.MaterialButton_toggleCheckedStateOnClick, true);
        int paddingStart = androidx.core.view.ViewCompat.getPaddingStart(this.materialButton);
        int paddingTop = this.materialButton.getPaddingTop();
        int paddingEnd = androidx.core.view.ViewCompat.getPaddingEnd(this.materialButton);
        int paddingBottom = this.materialButton.getPaddingBottom();
        if (typedArray.hasValue(com.google.android.material.R.styleable.MaterialButton_android_background)) {
            setBackgroundOverwritten();
        } else {
            updateBackground();
        }
        androidx.core.view.ViewCompat.setPaddingRelative(this.materialButton, paddingStart + this.insetLeft, paddingTop + this.insetTop, paddingEnd + this.insetRight, paddingBottom + this.insetBottom);
    }

    private void updateBackground() {
        this.materialButton.setInternalBackground(createBackground());
        com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable = getMaterialShapeDrawable();
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setElevation(this.elevation);
            materialShapeDrawable.setState(this.materialButton.getDrawableState());
        }
    }

    void setBackgroundOverwritten() {
        this.backgroundOverwritten = true;
        this.materialButton.setSupportBackgroundTintList(this.backgroundTint);
        this.materialButton.setSupportBackgroundTintMode(this.backgroundTintMode);
    }

    boolean isBackgroundOverwritten() {
        return this.backgroundOverwritten;
    }

    private android.graphics.drawable.InsetDrawable wrapDrawableWithInset(android.graphics.drawable.Drawable drawable) {
        return new android.graphics.drawable.InsetDrawable(drawable, this.insetLeft, this.insetTop, this.insetRight, this.insetBottom);
    }

    void setSupportBackgroundTintList(android.content.res.ColorStateList colorStateList) {
        if (this.backgroundTint != colorStateList) {
            this.backgroundTint = colorStateList;
            if (getMaterialShapeDrawable() != null) {
                androidx.core.graphics.drawable.DrawableCompat.setTintList(getMaterialShapeDrawable(), this.backgroundTint);
            }
        }
    }

    android.content.res.ColorStateList getSupportBackgroundTintList() {
        return this.backgroundTint;
    }

    void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode) {
        if (this.backgroundTintMode != mode) {
            this.backgroundTintMode = mode;
            if (getMaterialShapeDrawable() == null || this.backgroundTintMode == null) {
                return;
            }
            androidx.core.graphics.drawable.DrawableCompat.setTintMode(getMaterialShapeDrawable(), this.backgroundTintMode);
        }
    }

    android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
        return this.backgroundTintMode;
    }

    void setShouldDrawSurfaceColorStroke(boolean z) {
        this.shouldDrawSurfaceColorStroke = z;
        updateStroke();
    }

    private android.graphics.drawable.Drawable createBackground() {
        com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable = new com.google.android.material.shape.MaterialShapeDrawable(this.shapeAppearanceModel);
        materialShapeDrawable.initializeElevationOverlay(this.materialButton.getContext());
        androidx.core.graphics.drawable.DrawableCompat.setTintList(materialShapeDrawable, this.backgroundTint);
        android.graphics.PorterDuff.Mode mode = this.backgroundTintMode;
        if (mode != null) {
            androidx.core.graphics.drawable.DrawableCompat.setTintMode(materialShapeDrawable, mode);
        }
        materialShapeDrawable.setStroke(this.strokeWidth, this.strokeColor);
        com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable2 = new com.google.android.material.shape.MaterialShapeDrawable(this.shapeAppearanceModel);
        materialShapeDrawable2.setTint(0);
        materialShapeDrawable2.setStroke(this.strokeWidth, this.shouldDrawSurfaceColorStroke ? com.google.android.material.color.MaterialColors.getColor(this.materialButton, com.google.android.material.R.attr.colorSurface) : 0);
        if (IS_MIN_LOLLIPOP) {
            com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable3 = new com.google.android.material.shape.MaterialShapeDrawable(this.shapeAppearanceModel);
            this.maskDrawable = materialShapeDrawable3;
            androidx.core.graphics.drawable.DrawableCompat.setTint(materialShapeDrawable3, -1);
            android.graphics.drawable.RippleDrawable rippleDrawable = new android.graphics.drawable.RippleDrawable(com.google.android.material.ripple.RippleUtils.sanitizeRippleDrawableColor(this.rippleColor), wrapDrawableWithInset(new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{materialShapeDrawable2, materialShapeDrawable})), this.maskDrawable);
            this.rippleDrawable = rippleDrawable;
            return rippleDrawable;
        }
        com.google.android.material.ripple.RippleDrawableCompat rippleDrawableCompat = new com.google.android.material.ripple.RippleDrawableCompat(this.shapeAppearanceModel);
        this.maskDrawable = rippleDrawableCompat;
        androidx.core.graphics.drawable.DrawableCompat.setTintList(rippleDrawableCompat, com.google.android.material.ripple.RippleUtils.sanitizeRippleDrawableColor(this.rippleColor));
        android.graphics.drawable.LayerDrawable layerDrawable = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{materialShapeDrawable2, materialShapeDrawable, this.maskDrawable});
        this.rippleDrawable = layerDrawable;
        return wrapDrawableWithInset(layerDrawable);
    }

    void updateMaskBounds(int i, int i2) {
        android.graphics.drawable.Drawable drawable = this.maskDrawable;
        if (drawable != null) {
            drawable.setBounds(this.insetLeft, this.insetTop, i2 - this.insetRight, i - this.insetBottom);
        }
    }

    void setBackgroundColor(int i) {
        if (getMaterialShapeDrawable() != null) {
            getMaterialShapeDrawable().setTint(i);
        }
    }

    void setRippleColor(android.content.res.ColorStateList colorStateList) {
        if (this.rippleColor != colorStateList) {
            this.rippleColor = colorStateList;
            boolean z = IS_MIN_LOLLIPOP;
            if (z && (this.materialButton.getBackground() instanceof android.graphics.drawable.RippleDrawable)) {
                ((android.graphics.drawable.RippleDrawable) this.materialButton.getBackground()).setColor(com.google.android.material.ripple.RippleUtils.sanitizeRippleDrawableColor(colorStateList));
            } else {
                if (z || !(this.materialButton.getBackground() instanceof com.google.android.material.ripple.RippleDrawableCompat)) {
                    return;
                }
                ((com.google.android.material.ripple.RippleDrawableCompat) this.materialButton.getBackground()).setTintList(com.google.android.material.ripple.RippleUtils.sanitizeRippleDrawableColor(colorStateList));
            }
        }
    }

    android.content.res.ColorStateList getRippleColor() {
        return this.rippleColor;
    }

    void setStrokeColor(android.content.res.ColorStateList colorStateList) {
        if (this.strokeColor != colorStateList) {
            this.strokeColor = colorStateList;
            updateStroke();
        }
    }

    android.content.res.ColorStateList getStrokeColor() {
        return this.strokeColor;
    }

    void setStrokeWidth(int i) {
        if (this.strokeWidth != i) {
            this.strokeWidth = i;
            updateStroke();
        }
    }

    int getStrokeWidth() {
        return this.strokeWidth;
    }

    private void updateStroke() {
        com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable = getMaterialShapeDrawable();
        com.google.android.material.shape.MaterialShapeDrawable surfaceColorStrokeDrawable = getSurfaceColorStrokeDrawable();
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setStroke(this.strokeWidth, this.strokeColor);
            if (surfaceColorStrokeDrawable != null) {
                surfaceColorStrokeDrawable.setStroke(this.strokeWidth, this.shouldDrawSurfaceColorStroke ? com.google.android.material.color.MaterialColors.getColor(this.materialButton, com.google.android.material.R.attr.colorSurface) : 0);
            }
        }
    }

    void setCornerRadius(int i) {
        if (this.cornerRadiusSet && this.cornerRadius == i) {
            return;
        }
        this.cornerRadius = i;
        this.cornerRadiusSet = true;
        setShapeAppearanceModel(this.shapeAppearanceModel.withCornerSize(i));
    }

    int getCornerRadius() {
        return this.cornerRadius;
    }

    private com.google.android.material.shape.MaterialShapeDrawable getMaterialShapeDrawable(boolean z) {
        android.graphics.drawable.LayerDrawable layerDrawable = this.rippleDrawable;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        if (IS_MIN_LOLLIPOP) {
            return (com.google.android.material.shape.MaterialShapeDrawable) ((android.graphics.drawable.LayerDrawable) ((android.graphics.drawable.InsetDrawable) this.rippleDrawable.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
        }
        return (com.google.android.material.shape.MaterialShapeDrawable) this.rippleDrawable.getDrawable(!z ? 1 : 0);
    }

    com.google.android.material.shape.MaterialShapeDrawable getMaterialShapeDrawable() {
        return getMaterialShapeDrawable(false);
    }

    void setCheckable(boolean z) {
        this.checkable = z;
    }

    boolean isCheckable() {
        return this.checkable;
    }

    boolean isToggleCheckedStateOnClick() {
        return this.toggleCheckedStateOnClick;
    }

    void setToggleCheckedStateOnClick(boolean z) {
        this.toggleCheckedStateOnClick = z;
    }

    private com.google.android.material.shape.MaterialShapeDrawable getSurfaceColorStrokeDrawable() {
        return getMaterialShapeDrawable(true);
    }

    private void updateButtonShape(com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel) {
        if (IS_LOLLIPOP && !this.backgroundOverwritten) {
            int paddingStart = androidx.core.view.ViewCompat.getPaddingStart(this.materialButton);
            int paddingTop = this.materialButton.getPaddingTop();
            int paddingEnd = androidx.core.view.ViewCompat.getPaddingEnd(this.materialButton);
            int paddingBottom = this.materialButton.getPaddingBottom();
            updateBackground();
            androidx.core.view.ViewCompat.setPaddingRelative(this.materialButton, paddingStart, paddingTop, paddingEnd, paddingBottom);
            return;
        }
        if (getMaterialShapeDrawable() != null) {
            getMaterialShapeDrawable().setShapeAppearanceModel(shapeAppearanceModel);
        }
        if (getSurfaceColorStrokeDrawable() != null) {
            getSurfaceColorStrokeDrawable().setShapeAppearanceModel(shapeAppearanceModel);
        }
        if (getMaskDrawable() != null) {
            getMaskDrawable().setShapeAppearanceModel(shapeAppearanceModel);
        }
    }

    public com.google.android.material.shape.Shapeable getMaskDrawable() {
        android.graphics.drawable.LayerDrawable layerDrawable = this.rippleDrawable;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        if (this.rippleDrawable.getNumberOfLayers() > 2) {
            return (com.google.android.material.shape.Shapeable) this.rippleDrawable.getDrawable(2);
        }
        return (com.google.android.material.shape.Shapeable) this.rippleDrawable.getDrawable(1);
    }

    void setShapeAppearanceModel(com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel) {
        this.shapeAppearanceModel = shapeAppearanceModel;
        updateButtonShape(shapeAppearanceModel);
    }

    com.google.android.material.shape.ShapeAppearanceModel getShapeAppearanceModel() {
        return this.shapeAppearanceModel;
    }

    public void setInsetBottom(int i) {
        setVerticalInsets(this.insetTop, i);
    }

    public int getInsetBottom() {
        return this.insetBottom;
    }

    public void setInsetTop(int i) {
        setVerticalInsets(i, this.insetBottom);
    }

    private void setVerticalInsets(int i, int i2) {
        int paddingStart = androidx.core.view.ViewCompat.getPaddingStart(this.materialButton);
        int paddingTop = this.materialButton.getPaddingTop();
        int paddingEnd = androidx.core.view.ViewCompat.getPaddingEnd(this.materialButton);
        int paddingBottom = this.materialButton.getPaddingBottom();
        int i3 = this.insetTop;
        int i4 = this.insetBottom;
        this.insetBottom = i2;
        this.insetTop = i;
        if (!this.backgroundOverwritten) {
            updateBackground();
        }
        androidx.core.view.ViewCompat.setPaddingRelative(this.materialButton, paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    public int getInsetTop() {
        return this.insetTop;
    }
}

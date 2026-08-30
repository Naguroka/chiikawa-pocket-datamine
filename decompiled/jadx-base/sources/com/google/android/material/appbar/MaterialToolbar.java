package com.google.android.material.appbar;

/* JADX INFO: loaded from: classes5.dex */
public class MaterialToolbar extends androidx.appcompat.widget.Toolbar {
    private static final int DEF_STYLE_RES = com.google.android.material.R.style.Widget_MaterialComponents_Toolbar;
    private static final android.widget.ImageView.ScaleType[] LOGO_SCALE_TYPE_ARRAY = {android.widget.ImageView.ScaleType.MATRIX, android.widget.ImageView.ScaleType.FIT_XY, android.widget.ImageView.ScaleType.FIT_START, android.widget.ImageView.ScaleType.FIT_CENTER, android.widget.ImageView.ScaleType.FIT_END, android.widget.ImageView.ScaleType.CENTER, android.widget.ImageView.ScaleType.CENTER_CROP, android.widget.ImageView.ScaleType.CENTER_INSIDE};
    private java.lang.Boolean logoAdjustViewBounds;
    private android.widget.ImageView.ScaleType logoScaleType;
    private java.lang.Integer navigationIconTint;
    private boolean subtitleCentered;
    private boolean titleCentered;

    public MaterialToolbar(android.content.Context context) {
        this(context, null);
    }

    public MaterialToolbar(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.toolbarStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialToolbar(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        int i2 = DEF_STYLE_RES;
        super(com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(context, attributeSet, i, i2), attributeSet, i);
        android.content.Context context2 = getContext();
        android.content.res.TypedArray typedArrayObtainStyledAttributes = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, com.google.android.material.R.styleable.MaterialToolbar, i, i2, new int[0]);
        if (typedArrayObtainStyledAttributes.hasValue(com.google.android.material.R.styleable.MaterialToolbar_navigationIconTint)) {
            setNavigationIconTint(typedArrayObtainStyledAttributes.getColor(com.google.android.material.R.styleable.MaterialToolbar_navigationIconTint, -1));
        }
        this.titleCentered = typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.MaterialToolbar_titleCentered, false);
        this.subtitleCentered = typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.MaterialToolbar_subtitleCentered, false);
        int i3 = typedArrayObtainStyledAttributes.getInt(com.google.android.material.R.styleable.MaterialToolbar_logoScaleType, -1);
        if (i3 >= 0) {
            android.widget.ImageView.ScaleType[] scaleTypeArr = LOGO_SCALE_TYPE_ARRAY;
            if (i3 < scaleTypeArr.length) {
                this.logoScaleType = scaleTypeArr[i3];
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(com.google.android.material.R.styleable.MaterialToolbar_logoAdjustViewBounds)) {
            this.logoAdjustViewBounds = java.lang.Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.MaterialToolbar_logoAdjustViewBounds, false));
        }
        typedArrayObtainStyledAttributes.recycle();
        initBackground(context2);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        maybeCenterTitleViews();
        updateLogoImageView();
    }

    private void maybeCenterTitleViews() {
        if (this.titleCentered || this.subtitleCentered) {
            android.widget.TextView titleTextView = com.google.android.material.internal.ToolbarUtils.getTitleTextView(this);
            android.widget.TextView subtitleTextView = com.google.android.material.internal.ToolbarUtils.getSubtitleTextView(this);
            if (titleTextView == null && subtitleTextView == null) {
                return;
            }
            android.util.Pair<java.lang.Integer, java.lang.Integer> pairCalculateTitleBoundLimits = calculateTitleBoundLimits(titleTextView, subtitleTextView);
            if (this.titleCentered && titleTextView != null) {
                layoutTitleCenteredHorizontally(titleTextView, pairCalculateTitleBoundLimits);
            }
            if (!this.subtitleCentered || subtitleTextView == null) {
                return;
            }
            layoutTitleCenteredHorizontally(subtitleTextView, pairCalculateTitleBoundLimits);
        }
    }

    private android.util.Pair<java.lang.Integer, java.lang.Integer> calculateTitleBoundLimits(android.widget.TextView textView, android.widget.TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            android.view.View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                if (childAt.getRight() < i && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new android.util.Pair<>(java.lang.Integer.valueOf(paddingLeft), java.lang.Integer.valueOf(paddingRight));
    }

    private void layoutTitleCenteredHorizontally(android.view.View view, android.util.Pair<java.lang.Integer, java.lang.Integer> pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int iMax = java.lang.Math.max(java.lang.Math.max(((java.lang.Integer) pair.first).intValue() - i, 0), java.lang.Math.max(i2 - ((java.lang.Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i += iMax;
            i2 -= iMax;
            view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i, view.getTop(), i2, view.getBottom());
    }

    private void updateLogoImageView() {
        android.widget.ImageView logoImageView = com.google.android.material.internal.ToolbarUtils.getLogoImageView(this);
        if (logoImageView != null) {
            java.lang.Boolean bool = this.logoAdjustViewBounds;
            if (bool != null) {
                logoImageView.setAdjustViewBounds(bool.booleanValue());
            }
            android.widget.ImageView.ScaleType scaleType = this.logoScaleType;
            if (scaleType != null) {
                logoImageView.setScaleType(scaleType);
            }
        }
    }

    public android.widget.ImageView.ScaleType getLogoScaleType() {
        return this.logoScaleType;
    }

    public void setLogoScaleType(android.widget.ImageView.ScaleType scaleType) {
        if (this.logoScaleType != scaleType) {
            this.logoScaleType = scaleType;
            requestLayout();
        }
    }

    public boolean isLogoAdjustViewBounds() {
        java.lang.Boolean bool = this.logoAdjustViewBounds;
        return bool != null && bool.booleanValue();
    }

    public void setLogoAdjustViewBounds(boolean z) {
        java.lang.Boolean bool = this.logoAdjustViewBounds;
        if (bool == null || bool.booleanValue() != z) {
            this.logoAdjustViewBounds = java.lang.Boolean.valueOf(z);
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.android.material.shape.MaterialShapeUtils.setParentAbsoluteElevation(this);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        com.google.android.material.shape.MaterialShapeUtils.setElevation(this, f);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(android.graphics.drawable.Drawable drawable) {
        super.setNavigationIcon(maybeTintNavigationIcon(drawable));
    }

    public void setNavigationIconTint(int i) {
        this.navigationIconTint = java.lang.Integer.valueOf(i);
        android.graphics.drawable.Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void clearNavigationIconTint() {
        this.navigationIconTint = null;
        android.graphics.drawable.Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            androidx.core.graphics.drawable.DrawableCompat.setTintList(androidx.core.graphics.drawable.DrawableCompat.wrap(navigationIcon.mutate()), null);
            setNavigationIcon(navigationIcon);
        }
    }

    public java.lang.Integer getNavigationIconTint() {
        return this.navigationIconTint;
    }

    public void setTitleCentered(boolean z) {
        if (this.titleCentered != z) {
            this.titleCentered = z;
            requestLayout();
        }
    }

    public boolean isTitleCentered() {
        return this.titleCentered;
    }

    public void setSubtitleCentered(boolean z) {
        if (this.subtitleCentered != z) {
            this.subtitleCentered = z;
            requestLayout();
        }
    }

    public boolean isSubtitleCentered() {
        return this.subtitleCentered;
    }

    private void initBackground(android.content.Context context) {
        android.graphics.drawable.Drawable background = getBackground();
        if (background == null || (background instanceof android.graphics.drawable.ColorDrawable)) {
            com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable = new com.google.android.material.shape.MaterialShapeDrawable();
            materialShapeDrawable.setFillColor(android.content.res.ColorStateList.valueOf(background != null ? ((android.graphics.drawable.ColorDrawable) background).getColor() : 0));
            materialShapeDrawable.initializeElevationOverlay(context);
            materialShapeDrawable.setElevation(androidx.core.view.ViewCompat.getElevation(this));
            androidx.core.view.ViewCompat.setBackground(this, materialShapeDrawable);
        }
    }

    private android.graphics.drawable.Drawable maybeTintNavigationIcon(android.graphics.drawable.Drawable drawable) {
        if (drawable == null || this.navigationIconTint == null) {
            return drawable;
        }
        android.graphics.drawable.Drawable drawableWrap = androidx.core.graphics.drawable.DrawableCompat.wrap(drawable.mutate());
        androidx.core.graphics.drawable.DrawableCompat.setTint(drawableWrap, this.navigationIconTint.intValue());
        return drawableWrap;
    }
}

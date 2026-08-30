package com.google.android.material.button;

/* JADX INFO: loaded from: classes5.dex */
public class MaterialButton extends androidx.appcompat.widget.AppCompatButton implements android.widget.Checkable, com.google.android.material.shape.Shapeable {
    private static final int[] CHECKABLE_STATE_SET = {android.R.attr.state_checkable};
    private static final int[] CHECKED_STATE_SET = {android.R.attr.state_checked};
    private static final int DEF_STYLE_RES = com.google.android.material.R.style.Widget_MaterialComponents_Button;
    public static final int ICON_GRAVITY_END = 3;
    public static final int ICON_GRAVITY_START = 1;
    public static final int ICON_GRAVITY_TEXT_END = 4;
    public static final int ICON_GRAVITY_TEXT_START = 2;
    public static final int ICON_GRAVITY_TEXT_TOP = 32;
    public static final int ICON_GRAVITY_TOP = 16;
    private static final java.lang.String LOG_TAG = "MaterialButton";
    private boolean broadcasting;
    private boolean checked;
    private android.graphics.drawable.Drawable icon;
    private int iconGravity;
    private int iconLeft;
    private int iconPadding;
    private int iconSize;
    private android.content.res.ColorStateList iconTint;
    private android.graphics.PorterDuff.Mode iconTintMode;
    private int iconTop;
    private final com.google.android.material.button.MaterialButtonHelper materialButtonHelper;
    private final java.util.LinkedHashSet<com.google.android.material.button.MaterialButton.OnCheckedChangeListener> onCheckedChangeListeners;
    private com.google.android.material.button.MaterialButton.OnPressedChangeListener onPressedChangeListenerInternal;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface IconGravity {
    }

    public interface OnCheckedChangeListener {
        void onCheckedChanged(com.google.android.material.button.MaterialButton materialButton, boolean z);
    }

    interface OnPressedChangeListener {
        void onPressedChanged(com.google.android.material.button.MaterialButton materialButton, boolean z);
    }

    public MaterialButton(android.content.Context context) {
        this(context, null);
    }

    public MaterialButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.materialButtonStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButton(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        int i2 = DEF_STYLE_RES;
        super(com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(context, attributeSet, i, i2), attributeSet, i);
        this.onCheckedChangeListeners = new java.util.LinkedHashSet<>();
        this.checked = false;
        this.broadcasting = false;
        android.content.Context context2 = getContext();
        android.content.res.TypedArray typedArrayObtainStyledAttributes = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, com.google.android.material.R.styleable.MaterialButton, i, i2, new int[0]);
        this.iconPadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.MaterialButton_iconPadding, 0);
        this.iconTintMode = com.google.android.material.internal.ViewUtils.parseTintMode(typedArrayObtainStyledAttributes.getInt(com.google.android.material.R.styleable.MaterialButton_iconTintMode, -1), android.graphics.PorterDuff.Mode.SRC_IN);
        this.iconTint = com.google.android.material.resources.MaterialResources.getColorStateList(getContext(), typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.MaterialButton_iconTint);
        this.icon = com.google.android.material.resources.MaterialResources.getDrawable(getContext(), typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.MaterialButton_icon);
        this.iconGravity = typedArrayObtainStyledAttributes.getInteger(com.google.android.material.R.styleable.MaterialButton_iconGravity, 1);
        this.iconSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.MaterialButton_iconSize, 0);
        com.google.android.material.button.MaterialButtonHelper materialButtonHelper = new com.google.android.material.button.MaterialButtonHelper(this, com.google.android.material.shape.ShapeAppearanceModel.builder(context2, attributeSet, i, i2).build());
        this.materialButtonHelper = materialButtonHelper;
        materialButtonHelper.loadFromAttributes(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        setCompoundDrawablePadding(this.iconPadding);
        updateIcon(this.icon != null);
    }

    private java.lang.String getA11yClassName() {
        return (isCheckable() ? android.widget.CompoundButton.class : android.widget.Button.class).getName();
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(isCheckable());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.widget.TextView, android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        com.google.android.material.button.MaterialButton.SavedState savedState = new com.google.android.material.button.MaterialButton.SavedState(super.onSaveInstanceState());
        savedState.checked = this.checked;
        return savedState;
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof com.google.android.material.button.MaterialButton.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        com.google.android.material.button.MaterialButton.SavedState savedState = (com.google.android.material.button.MaterialButton.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setChecked(savedState.checked);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.TintableBackgroundView
    public void setSupportBackgroundTintList(android.content.res.ColorStateList colorStateList) {
        if (isUsingOriginalBackground()) {
            this.materialButtonHelper.setSupportBackgroundTintList(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.TintableBackgroundView
    public android.content.res.ColorStateList getSupportBackgroundTintList() {
        if (isUsingOriginalBackground()) {
            return this.materialButtonHelper.getSupportBackgroundTintList();
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.TintableBackgroundView
    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode) {
        if (isUsingOriginalBackground()) {
            this.materialButtonHelper.setSupportBackgroundTintMode(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.TintableBackgroundView
    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
        if (isUsingOriginalBackground()) {
            return this.materialButtonHelper.getSupportBackgroundTintMode();
        }
        return super.getSupportBackgroundTintMode();
    }

    @Override // android.view.View
    public void setBackgroundTintList(android.content.res.ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public android.content.res.ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public void setBackgroundTintMode(android.graphics.PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    @Override // android.view.View
    public android.graphics.PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (isUsingOriginalBackground()) {
            this.materialButtonHelper.setBackgroundColor(i);
        } else {
            super.setBackgroundColor(i);
        }
    }

    @Override // android.view.View
    public void setBackground(android.graphics.drawable.Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? androidx.appcompat.content.res.AppCompatResources.getDrawable(getContext(), i) : null);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        if (isUsingOriginalBackground()) {
            if (drawable != getBackground()) {
                android.util.Log.w(LOG_TAG, "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                this.materialButtonHelper.setBackgroundOverwritten();
                super.setBackgroundDrawable(drawable);
                return;
            }
            getBackground().setState(drawable.getState());
            return;
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        updateIconPosition(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    protected void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        updateIconPosition(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isUsingOriginalBackground()) {
            com.google.android.material.shape.MaterialShapeUtils.setParentAbsoluteElevation(this, this.materialButtonHelper.getMaterialShapeDrawable());
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (isUsingOriginalBackground()) {
            this.materialButtonHelper.getMaterialShapeDrawable().setElevation(f);
        }
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.icon != null) {
            if (this.icon.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        updateIconPosition(getMeasuredWidth(), getMeasuredHeight());
    }

    private android.text.Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & androidx.core.view.GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        if (gravity == 1) {
            return android.text.Layout.Alignment.ALIGN_CENTER;
        }
        if (gravity == 5 || gravity == 8388613) {
            return android.text.Layout.Alignment.ALIGN_OPPOSITE;
        }
        return android.text.Layout.Alignment.ALIGN_NORMAL;
    }

    private android.text.Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return android.text.Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (textAlignment == 4) {
            return android.text.Layout.Alignment.ALIGN_CENTER;
        }
        return android.text.Layout.Alignment.ALIGN_NORMAL;
    }

    private void updateIconPosition(int i, int i2) {
        if (this.icon == null || getLayout() == null) {
            return;
        }
        if (isIconStart() || isIconEnd()) {
            this.iconTop = 0;
            android.text.Layout.Alignment actualTextAlignment = getActualTextAlignment();
            int i3 = this.iconGravity;
            if (i3 == 1 || i3 == 3 || ((i3 == 2 && actualTextAlignment == android.text.Layout.Alignment.ALIGN_NORMAL) || (this.iconGravity == 4 && actualTextAlignment == android.text.Layout.Alignment.ALIGN_OPPOSITE))) {
                this.iconLeft = 0;
                updateIcon(false);
                return;
            }
            int intrinsicWidth = this.iconSize;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.icon.getIntrinsicWidth();
            }
            int textLayoutWidth = ((((i - getTextLayoutWidth()) - androidx.core.view.ViewCompat.getPaddingEnd(this)) - intrinsicWidth) - this.iconPadding) - androidx.core.view.ViewCompat.getPaddingStart(this);
            if (actualTextAlignment == android.text.Layout.Alignment.ALIGN_CENTER) {
                textLayoutWidth /= 2;
            }
            if (isLayoutRTL() != (this.iconGravity == 4)) {
                textLayoutWidth = -textLayoutWidth;
            }
            if (this.iconLeft != textLayoutWidth) {
                this.iconLeft = textLayoutWidth;
                updateIcon(false);
                return;
            }
            return;
        }
        if (isIconTop()) {
            this.iconLeft = 0;
            if (this.iconGravity == 16) {
                this.iconTop = 0;
                updateIcon(false);
                return;
            }
            int intrinsicHeight = this.iconSize;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.icon.getIntrinsicHeight();
            }
            int iMax = java.lang.Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.iconPadding) - getPaddingBottom()) / 2);
            if (this.iconTop != iMax) {
                this.iconTop = iMax;
                updateIcon(false);
            }
        }
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        int iMax = 0;
        for (int i = 0; i < lineCount; i++) {
            iMax = java.lang.Math.max(iMax, getTextWidth(getTextInLine(i)));
        }
        return iMax;
    }

    private int getTextWidth(java.lang.CharSequence charSequence) {
        android.text.TextPaint paint = getPaint();
        java.lang.String string = charSequence.toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        return java.lang.Math.min((int) paint.measureText(string), getLayout().getEllipsizedWidth());
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        android.text.TextPaint paint = getPaint();
        java.lang.String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return java.lang.Math.min(rect.height(), getLayout().getHeight());
    }

    private java.lang.CharSequence getTextInLine(int i) {
        return getText().subSequence(getLayout().getLineStart(i), getLayout().getLineEnd(i));
    }

    private boolean isLayoutRTL() {
        return androidx.core.view.ViewCompat.getLayoutDirection(this) == 1;
    }

    void setInternalBackground(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setIconPadding(int i) {
        if (this.iconPadding != i) {
            this.iconPadding = i;
            setCompoundDrawablePadding(i);
        }
    }

    public int getIconPadding() {
        return this.iconPadding;
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.iconSize != i) {
            this.iconSize = i;
            updateIcon(true);
        }
    }

    public int getIconSize() {
        return this.iconSize;
    }

    public void setIcon(android.graphics.drawable.Drawable drawable) {
        if (this.icon != drawable) {
            this.icon = drawable;
            updateIcon(true);
            updateIconPosition(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? androidx.appcompat.content.res.AppCompatResources.getDrawable(getContext(), i) : null);
    }

    public android.graphics.drawable.Drawable getIcon() {
        return this.icon;
    }

    public void setIconTint(android.content.res.ColorStateList colorStateList) {
        if (this.iconTint != colorStateList) {
            this.iconTint = colorStateList;
            updateIcon(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(androidx.appcompat.content.res.AppCompatResources.getColorStateList(getContext(), i));
    }

    public android.content.res.ColorStateList getIconTint() {
        return this.iconTint;
    }

    public void setIconTintMode(android.graphics.PorterDuff.Mode mode) {
        if (this.iconTintMode != mode) {
            this.iconTintMode = mode;
            updateIcon(false);
        }
    }

    public android.graphics.PorterDuff.Mode getIconTintMode() {
        return this.iconTintMode;
    }

    private void updateIcon(boolean z) {
        android.graphics.drawable.Drawable drawable = this.icon;
        boolean z2 = true;
        if (drawable != null) {
            android.graphics.drawable.Drawable drawableMutate = androidx.core.graphics.drawable.DrawableCompat.wrap(drawable).mutate();
            this.icon = drawableMutate;
            androidx.core.graphics.drawable.DrawableCompat.setTintList(drawableMutate, this.iconTint);
            android.graphics.PorterDuff.Mode mode = this.iconTintMode;
            if (mode != null) {
                androidx.core.graphics.drawable.DrawableCompat.setTintMode(this.icon, mode);
            }
            int intrinsicWidth = this.iconSize;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.icon.getIntrinsicWidth();
            }
            int intrinsicHeight = this.iconSize;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.icon.getIntrinsicHeight();
            }
            android.graphics.drawable.Drawable drawable2 = this.icon;
            int i = this.iconLeft;
            int i2 = this.iconTop;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.icon.setVisible(true, z);
        }
        if (z) {
            resetIconDrawable();
            return;
        }
        android.graphics.drawable.Drawable[] compoundDrawablesRelative = androidx.core.widget.TextViewCompat.getCompoundDrawablesRelative(this);
        android.graphics.drawable.Drawable drawable3 = compoundDrawablesRelative[0];
        android.graphics.drawable.Drawable drawable4 = compoundDrawablesRelative[1];
        android.graphics.drawable.Drawable drawable5 = compoundDrawablesRelative[2];
        if ((!isIconStart() || drawable3 == this.icon) && ((!isIconEnd() || drawable5 == this.icon) && (!isIconTop() || drawable4 == this.icon))) {
            z2 = false;
        }
        if (z2) {
            resetIconDrawable();
        }
    }

    private void resetIconDrawable() {
        if (isIconStart()) {
            androidx.core.widget.TextViewCompat.setCompoundDrawablesRelative(this, this.icon, null, null, null);
        } else if (isIconEnd()) {
            androidx.core.widget.TextViewCompat.setCompoundDrawablesRelative(this, null, null, this.icon, null);
        } else if (isIconTop()) {
            androidx.core.widget.TextViewCompat.setCompoundDrawablesRelative(this, null, this.icon, null, null);
        }
    }

    private boolean isIconStart() {
        int i = this.iconGravity;
        return i == 1 || i == 2;
    }

    private boolean isIconEnd() {
        int i = this.iconGravity;
        return i == 3 || i == 4;
    }

    private boolean isIconTop() {
        int i = this.iconGravity;
        return i == 16 || i == 32;
    }

    public void setRippleColor(android.content.res.ColorStateList colorStateList) {
        if (isUsingOriginalBackground()) {
            this.materialButtonHelper.setRippleColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        if (isUsingOriginalBackground()) {
            setRippleColor(androidx.appcompat.content.res.AppCompatResources.getColorStateList(getContext(), i));
        }
    }

    public android.content.res.ColorStateList getRippleColor() {
        if (isUsingOriginalBackground()) {
            return this.materialButtonHelper.getRippleColor();
        }
        return null;
    }

    public void setStrokeColor(android.content.res.ColorStateList colorStateList) {
        if (isUsingOriginalBackground()) {
            this.materialButtonHelper.setStrokeColor(colorStateList);
        }
    }

    public void setStrokeColorResource(int i) {
        if (isUsingOriginalBackground()) {
            setStrokeColor(androidx.appcompat.content.res.AppCompatResources.getColorStateList(getContext(), i));
        }
    }

    public android.content.res.ColorStateList getStrokeColor() {
        if (isUsingOriginalBackground()) {
            return this.materialButtonHelper.getStrokeColor();
        }
        return null;
    }

    public void setStrokeWidth(int i) {
        if (isUsingOriginalBackground()) {
            this.materialButtonHelper.setStrokeWidth(i);
        }
    }

    public void setStrokeWidthResource(int i) {
        if (isUsingOriginalBackground()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    public int getStrokeWidth() {
        if (isUsingOriginalBackground()) {
            return this.materialButtonHelper.getStrokeWidth();
        }
        return 0;
    }

    public void setCornerRadius(int i) {
        if (isUsingOriginalBackground()) {
            this.materialButtonHelper.setCornerRadius(i);
        }
    }

    public void setCornerRadiusResource(int i) {
        if (isUsingOriginalBackground()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public int getCornerRadius() {
        if (isUsingOriginalBackground()) {
            return this.materialButtonHelper.getCornerRadius();
        }
        return 0;
    }

    public int getIconGravity() {
        return this.iconGravity;
    }

    public void setIconGravity(int i) {
        if (this.iconGravity != i) {
            this.iconGravity = i;
            updateIconPosition(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setInsetBottom(int i) {
        this.materialButtonHelper.setInsetBottom(i);
    }

    public int getInsetBottom() {
        return this.materialButtonHelper.getInsetBottom();
    }

    public void setInsetTop(int i) {
        this.materialButtonHelper.setInsetTop(i);
    }

    public int getInsetTop() {
        return this.materialButtonHelper.getInsetTop();
    }

    @Override // android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isCheckable()) {
            mergeDrawableStates(iArrOnCreateDrawableState, CHECKABLE_STATE_SET);
        }
        if (isChecked()) {
            mergeDrawableStates(iArrOnCreateDrawableState, CHECKED_STATE_SET);
        }
        return iArrOnCreateDrawableState;
    }

    public void addOnCheckedChangeListener(com.google.android.material.button.MaterialButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.onCheckedChangeListeners.add(onCheckedChangeListener);
    }

    public void removeOnCheckedChangeListener(com.google.android.material.button.MaterialButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.onCheckedChangeListeners.remove(onCheckedChangeListener);
    }

    public void clearOnCheckedChangeListeners() {
        this.onCheckedChangeListeners.clear();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (isCheckable() && isEnabled() && this.checked != z) {
            this.checked = z;
            refreshDrawableState();
            if (getParent() instanceof com.google.android.material.button.MaterialButtonToggleGroup) {
                ((com.google.android.material.button.MaterialButtonToggleGroup) getParent()).onButtonCheckedStateChanged(this, this.checked);
            }
            if (this.broadcasting) {
                return;
            }
            this.broadcasting = true;
            java.util.Iterator<com.google.android.material.button.MaterialButton.OnCheckedChangeListener> it = this.onCheckedChangeListeners.iterator();
            while (it.hasNext()) {
                it.next().onCheckedChanged(this, this.checked);
            }
            this.broadcasting = false;
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.checked;
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.checked);
    }

    @Override // android.view.View
    public boolean performClick() {
        if (this.materialButtonHelper.isToggleCheckedStateOnClick()) {
            toggle();
        }
        return super.performClick();
    }

    public boolean isToggleCheckedStateOnClick() {
        return this.materialButtonHelper.isToggleCheckedStateOnClick();
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.materialButtonHelper.setToggleCheckedStateOnClick(z);
    }

    public boolean isCheckable() {
        com.google.android.material.button.MaterialButtonHelper materialButtonHelper = this.materialButtonHelper;
        return materialButtonHelper != null && materialButtonHelper.isCheckable();
    }

    public void setCheckable(boolean z) {
        if (isUsingOriginalBackground()) {
            this.materialButtonHelper.setCheckable(z);
        }
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel) {
        if (isUsingOriginalBackground()) {
            this.materialButtonHelper.setShapeAppearanceModel(shapeAppearanceModel);
            return;
        }
        throw new java.lang.IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    @Override // com.google.android.material.shape.Shapeable
    public com.google.android.material.shape.ShapeAppearanceModel getShapeAppearanceModel() {
        if (isUsingOriginalBackground()) {
            return this.materialButtonHelper.getShapeAppearanceModel();
        }
        throw new java.lang.IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    void setOnPressedChangeListenerInternal(com.google.android.material.button.MaterialButton.OnPressedChangeListener onPressedChangeListener) {
        this.onPressedChangeListenerInternal = onPressedChangeListener;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        com.google.android.material.button.MaterialButton.OnPressedChangeListener onPressedChangeListener = this.onPressedChangeListenerInternal;
        if (onPressedChangeListener != null) {
            onPressedChangeListener.onPressedChanged(this, z);
        }
        super.setPressed(z);
    }

    private boolean isUsingOriginalBackground() {
        com.google.android.material.button.MaterialButtonHelper materialButtonHelper = this.materialButtonHelper;
        return (materialButtonHelper == null || materialButtonHelper.isBackgroundOverwritten()) ? false : true;
    }

    void setShouldDrawSurfaceColorStroke(boolean z) {
        if (isUsingOriginalBackground()) {
            this.materialButtonHelper.setShouldDrawSurfaceColorStroke(z);
        }
    }

    static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<com.google.android.material.button.MaterialButton.SavedState> CREATOR = new android.os.Parcelable.ClassLoaderCreator<com.google.android.material.button.MaterialButton.SavedState>() { // from class: com.google.android.material.button.MaterialButton.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public com.google.android.material.button.MaterialButton.SavedState createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
                return new com.google.android.material.button.MaterialButton.SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public com.google.android.material.button.MaterialButton.SavedState createFromParcel(android.os.Parcel parcel) {
                return new com.google.android.material.button.MaterialButton.SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public com.google.android.material.button.MaterialButton.SavedState[] newArray(int i) {
                return new com.google.android.material.button.MaterialButton.SavedState[i];
            }
        };
        boolean checked;

        public SavedState(android.os.Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            readFromParcel(parcel);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.checked ? 1 : 0);
        }

        private void readFromParcel(android.os.Parcel parcel) {
            this.checked = parcel.readInt() == 1;
        }
    }
}

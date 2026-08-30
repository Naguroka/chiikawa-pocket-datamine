package com.google.android.material.textfield;

/* JADX INFO: loaded from: classes5.dex */
class StartCompoundLayout extends android.widget.LinearLayout {
    private boolean hintExpanded;
    private java.lang.CharSequence prefixText;
    private final android.widget.TextView prefixTextView;
    private android.view.View.OnLongClickListener startIconOnLongClickListener;
    private android.content.res.ColorStateList startIconTintList;
    private android.graphics.PorterDuff.Mode startIconTintMode;
    private final com.google.android.material.internal.CheckableImageButton startIconView;
    private final com.google.android.material.textfield.TextInputLayout textInputLayout;

    StartCompoundLayout(com.google.android.material.textfield.TextInputLayout textInputLayout, androidx.appcompat.widget.TintTypedArray tintTypedArray) {
        super(textInputLayout.getContext());
        this.textInputLayout = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -1, androidx.core.view.GravityCompat.START));
        com.google.android.material.internal.CheckableImageButton checkableImageButton = (com.google.android.material.internal.CheckableImageButton) android.view.LayoutInflater.from(getContext()).inflate(com.google.android.material.R.layout.design_text_input_start_icon, (android.view.ViewGroup) this, false);
        this.startIconView = checkableImageButton;
        com.google.android.material.textfield.IconHelper.setCompatRippleBackgroundIfNeeded(checkableImageButton);
        androidx.appcompat.widget.AppCompatTextView appCompatTextView = new androidx.appcompat.widget.AppCompatTextView(getContext());
        this.prefixTextView = appCompatTextView;
        initStartIconView(tintTypedArray);
        initPrefixTextView(tintTypedArray);
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    private void initStartIconView(androidx.appcompat.widget.TintTypedArray tintTypedArray) {
        if (com.google.android.material.resources.MaterialResources.isFontScaleAtLeast1_3(getContext())) {
            androidx.core.view.MarginLayoutParamsCompat.setMarginEnd((android.view.ViewGroup.MarginLayoutParams) this.startIconView.getLayoutParams(), 0);
        }
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        if (tintTypedArray.hasValue(com.google.android.material.R.styleable.TextInputLayout_startIconTint)) {
            this.startIconTintList = com.google.android.material.resources.MaterialResources.getColorStateList(getContext(), tintTypedArray, com.google.android.material.R.styleable.TextInputLayout_startIconTint);
        }
        if (tintTypedArray.hasValue(com.google.android.material.R.styleable.TextInputLayout_startIconTintMode)) {
            this.startIconTintMode = com.google.android.material.internal.ViewUtils.parseTintMode(tintTypedArray.getInt(com.google.android.material.R.styleable.TextInputLayout_startIconTintMode, -1), null);
        }
        if (tintTypedArray.hasValue(com.google.android.material.R.styleable.TextInputLayout_startIconDrawable)) {
            setStartIconDrawable(tintTypedArray.getDrawable(com.google.android.material.R.styleable.TextInputLayout_startIconDrawable));
            if (tintTypedArray.hasValue(com.google.android.material.R.styleable.TextInputLayout_startIconContentDescription)) {
                setStartIconContentDescription(tintTypedArray.getText(com.google.android.material.R.styleable.TextInputLayout_startIconContentDescription));
            }
            setStartIconCheckable(tintTypedArray.getBoolean(com.google.android.material.R.styleable.TextInputLayout_startIconCheckable, true));
        }
    }

    private void initPrefixTextView(androidx.appcompat.widget.TintTypedArray tintTypedArray) {
        this.prefixTextView.setVisibility(8);
        this.prefixTextView.setId(com.google.android.material.R.id.textinput_prefix_text);
        this.prefixTextView.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
        androidx.core.view.ViewCompat.setAccessibilityLiveRegion(this.prefixTextView, 1);
        setPrefixTextAppearance(tintTypedArray.getResourceId(com.google.android.material.R.styleable.TextInputLayout_prefixTextAppearance, 0));
        if (tintTypedArray.hasValue(com.google.android.material.R.styleable.TextInputLayout_prefixTextColor)) {
            setPrefixTextColor(tintTypedArray.getColorStateList(com.google.android.material.R.styleable.TextInputLayout_prefixTextColor));
        }
        setPrefixText(tintTypedArray.getText(com.google.android.material.R.styleable.TextInputLayout_prefixText));
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        updatePrefixTextViewPadding();
    }

    android.widget.TextView getPrefixTextView() {
        return this.prefixTextView;
    }

    void setPrefixText(java.lang.CharSequence charSequence) {
        this.prefixText = android.text.TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.prefixTextView.setText(charSequence);
        updateVisibility();
    }

    java.lang.CharSequence getPrefixText() {
        return this.prefixText;
    }

    void setPrefixTextColor(android.content.res.ColorStateList colorStateList) {
        this.prefixTextView.setTextColor(colorStateList);
    }

    android.content.res.ColorStateList getPrefixTextColor() {
        return this.prefixTextView.getTextColors();
    }

    void setPrefixTextAppearance(int i) {
        androidx.core.widget.TextViewCompat.setTextAppearance(this.prefixTextView, i);
    }

    void setStartIconDrawable(android.graphics.drawable.Drawable drawable) {
        this.startIconView.setImageDrawable(drawable);
        if (drawable != null) {
            com.google.android.material.textfield.IconHelper.applyIconTint(this.textInputLayout, this.startIconView, this.startIconTintList, this.startIconTintMode);
            setStartIconVisible(true);
            refreshStartIconDrawableState();
        } else {
            setStartIconVisible(false);
            setStartIconOnClickListener(null);
            setStartIconOnLongClickListener(null);
            setStartIconContentDescription(null);
        }
    }

    android.graphics.drawable.Drawable getStartIconDrawable() {
        return this.startIconView.getDrawable();
    }

    void setStartIconOnClickListener(android.view.View.OnClickListener onClickListener) {
        com.google.android.material.textfield.IconHelper.setIconOnClickListener(this.startIconView, onClickListener, this.startIconOnLongClickListener);
    }

    void setStartIconOnLongClickListener(android.view.View.OnLongClickListener onLongClickListener) {
        this.startIconOnLongClickListener = onLongClickListener;
        com.google.android.material.textfield.IconHelper.setIconOnLongClickListener(this.startIconView, onLongClickListener);
    }

    void setStartIconVisible(boolean z) {
        if (isStartIconVisible() != z) {
            this.startIconView.setVisibility(z ? 0 : 8);
            updatePrefixTextViewPadding();
            updateVisibility();
        }
    }

    boolean isStartIconVisible() {
        return this.startIconView.getVisibility() == 0;
    }

    void refreshStartIconDrawableState() {
        com.google.android.material.textfield.IconHelper.refreshIconDrawableState(this.textInputLayout, this.startIconView, this.startIconTintList);
    }

    void setStartIconCheckable(boolean z) {
        this.startIconView.setCheckable(z);
    }

    boolean isStartIconCheckable() {
        return this.startIconView.isCheckable();
    }

    void setStartIconContentDescription(java.lang.CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.startIconView.setContentDescription(charSequence);
        }
    }

    java.lang.CharSequence getStartIconContentDescription() {
        return this.startIconView.getContentDescription();
    }

    void setStartIconTintList(android.content.res.ColorStateList colorStateList) {
        if (this.startIconTintList != colorStateList) {
            this.startIconTintList = colorStateList;
            com.google.android.material.textfield.IconHelper.applyIconTint(this.textInputLayout, this.startIconView, colorStateList, this.startIconTintMode);
        }
    }

    void setStartIconTintMode(android.graphics.PorterDuff.Mode mode) {
        if (this.startIconTintMode != mode) {
            this.startIconTintMode = mode;
            com.google.android.material.textfield.IconHelper.applyIconTint(this.textInputLayout, this.startIconView, this.startIconTintList, mode);
        }
    }

    void setupAccessibilityNodeInfo(androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (this.prefixTextView.getVisibility() == 0) {
            accessibilityNodeInfoCompat.setLabelFor(this.prefixTextView);
            accessibilityNodeInfoCompat.setTraversalAfter(this.prefixTextView);
        } else {
            accessibilityNodeInfoCompat.setTraversalAfter(this.startIconView);
        }
    }

    void updatePrefixTextViewPadding() {
        android.widget.EditText editText = this.textInputLayout.editText;
        if (editText == null) {
            return;
        }
        androidx.core.view.ViewCompat.setPaddingRelative(this.prefixTextView, isStartIconVisible() ? 0 : androidx.core.view.ViewCompat.getPaddingStart(editText), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(com.google.android.material.R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    void onHintStateChanged(boolean z) {
        this.hintExpanded = z;
        updateVisibility();
    }

    private void updateVisibility() {
        int i = (this.prefixText == null || this.hintExpanded) ? 8 : 0;
        setVisibility(this.startIconView.getVisibility() == 0 || i == 0 ? 0 : 8);
        this.prefixTextView.setVisibility(i);
        this.textInputLayout.updateDummyDrawables();
    }
}

package com.google.android.material.textfield;

/* JADX INFO: loaded from: classes5.dex */
class EndCompoundLayout extends android.widget.LinearLayout {
    private final android.view.accessibility.AccessibilityManager accessibilityManager;
    private android.widget.EditText editText;
    private final android.text.TextWatcher editTextWatcher;
    private final java.util.LinkedHashSet<com.google.android.material.textfield.TextInputLayout.OnEndIconChangedListener> endIconChangedListeners;
    private final com.google.android.material.textfield.EndCompoundLayout.EndIconDelegates endIconDelegates;
    private final android.widget.FrameLayout endIconFrame;
    private int endIconMode;
    private android.view.View.OnLongClickListener endIconOnLongClickListener;
    private android.content.res.ColorStateList endIconTintList;
    private android.graphics.PorterDuff.Mode endIconTintMode;
    private final com.google.android.material.internal.CheckableImageButton endIconView;
    private android.view.View.OnLongClickListener errorIconOnLongClickListener;
    private android.content.res.ColorStateList errorIconTintList;
    private android.graphics.PorterDuff.Mode errorIconTintMode;
    private final com.google.android.material.internal.CheckableImageButton errorIconView;
    private boolean hintExpanded;
    private final com.google.android.material.textfield.TextInputLayout.OnEditTextAttachedListener onEditTextAttachedListener;
    private java.lang.CharSequence suffixText;
    private final android.widget.TextView suffixTextView;
    final com.google.android.material.textfield.TextInputLayout textInputLayout;
    private androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener touchExplorationStateChangeListener;

    EndCompoundLayout(com.google.android.material.textfield.TextInputLayout textInputLayout, androidx.appcompat.widget.TintTypedArray tintTypedArray) {
        super(textInputLayout.getContext());
        this.endIconMode = 0;
        this.endIconChangedListeners = new java.util.LinkedHashSet<>();
        this.editTextWatcher = new com.google.android.material.internal.TextWatcherAdapter() { // from class: com.google.android.material.textfield.EndCompoundLayout.1
            @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
            public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
                com.google.android.material.textfield.EndCompoundLayout.this.getEndIconDelegate().beforeEditTextChanged(charSequence, i, i2, i3);
            }

            @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
            public void afterTextChanged(android.text.Editable editable) {
                com.google.android.material.textfield.EndCompoundLayout.this.getEndIconDelegate().afterEditTextChanged(editable);
            }
        };
        com.google.android.material.textfield.TextInputLayout.OnEditTextAttachedListener onEditTextAttachedListener = new com.google.android.material.textfield.TextInputLayout.OnEditTextAttachedListener() { // from class: com.google.android.material.textfield.EndCompoundLayout.2
            @Override // com.google.android.material.textfield.TextInputLayout.OnEditTextAttachedListener
            public void onEditTextAttached(com.google.android.material.textfield.TextInputLayout textInputLayout2) {
                if (com.google.android.material.textfield.EndCompoundLayout.this.editText == textInputLayout2.getEditText()) {
                    return;
                }
                if (com.google.android.material.textfield.EndCompoundLayout.this.editText != null) {
                    com.google.android.material.textfield.EndCompoundLayout.this.editText.removeTextChangedListener(com.google.android.material.textfield.EndCompoundLayout.this.editTextWatcher);
                    if (com.google.android.material.textfield.EndCompoundLayout.this.editText.getOnFocusChangeListener() == com.google.android.material.textfield.EndCompoundLayout.this.getEndIconDelegate().getOnEditTextFocusChangeListener()) {
                        com.google.android.material.textfield.EndCompoundLayout.this.editText.setOnFocusChangeListener(null);
                    }
                }
                com.google.android.material.textfield.EndCompoundLayout.this.editText = textInputLayout2.getEditText();
                if (com.google.android.material.textfield.EndCompoundLayout.this.editText != null) {
                    com.google.android.material.textfield.EndCompoundLayout.this.editText.addTextChangedListener(com.google.android.material.textfield.EndCompoundLayout.this.editTextWatcher);
                }
                com.google.android.material.textfield.EndCompoundLayout.this.getEndIconDelegate().onEditTextAttached(com.google.android.material.textfield.EndCompoundLayout.this.editText);
                com.google.android.material.textfield.EndCompoundLayout endCompoundLayout = com.google.android.material.textfield.EndCompoundLayout.this;
                endCompoundLayout.setOnFocusChangeListenersIfNeeded(endCompoundLayout.getEndIconDelegate());
            }
        };
        this.onEditTextAttachedListener = onEditTextAttachedListener;
        this.accessibilityManager = (android.view.accessibility.AccessibilityManager) getContext().getSystemService("accessibility");
        this.textInputLayout = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -1, androidx.core.view.GravityCompat.END));
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
        this.endIconFrame = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -1));
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(getContext());
        com.google.android.material.internal.CheckableImageButton checkableImageButtonCreateIconView = createIconView(this, layoutInflaterFrom, com.google.android.material.R.id.text_input_error_icon);
        this.errorIconView = checkableImageButtonCreateIconView;
        com.google.android.material.internal.CheckableImageButton checkableImageButtonCreateIconView2 = createIconView(frameLayout, layoutInflaterFrom, com.google.android.material.R.id.text_input_end_icon);
        this.endIconView = checkableImageButtonCreateIconView2;
        this.endIconDelegates = new com.google.android.material.textfield.EndCompoundLayout.EndIconDelegates(this, tintTypedArray);
        androidx.appcompat.widget.AppCompatTextView appCompatTextView = new androidx.appcompat.widget.AppCompatTextView(getContext());
        this.suffixTextView = appCompatTextView;
        initErrorIconView(tintTypedArray);
        initEndIconView(tintTypedArray);
        initSuffixTextView(tintTypedArray);
        frameLayout.addView(checkableImageButtonCreateIconView2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(checkableImageButtonCreateIconView);
        textInputLayout.addOnEditTextAttachedListener(onEditTextAttachedListener);
        addOnAttachStateChangeListener(new android.view.View.OnAttachStateChangeListener() { // from class: com.google.android.material.textfield.EndCompoundLayout.3
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(android.view.View view) {
                com.google.android.material.textfield.EndCompoundLayout.this.addTouchExplorationStateChangeListenerIfNeeded();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(android.view.View view) {
                com.google.android.material.textfield.EndCompoundLayout.this.removeTouchExplorationStateChangeListenerIfNeeded();
            }
        });
    }

    private com.google.android.material.internal.CheckableImageButton createIconView(android.view.ViewGroup viewGroup, android.view.LayoutInflater layoutInflater, int i) {
        com.google.android.material.internal.CheckableImageButton checkableImageButton = (com.google.android.material.internal.CheckableImageButton) layoutInflater.inflate(com.google.android.material.R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        com.google.android.material.textfield.IconHelper.setCompatRippleBackgroundIfNeeded(checkableImageButton);
        if (com.google.android.material.resources.MaterialResources.isFontScaleAtLeast1_3(getContext())) {
            androidx.core.view.MarginLayoutParamsCompat.setMarginStart((android.view.ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    private void initErrorIconView(androidx.appcompat.widget.TintTypedArray tintTypedArray) {
        if (tintTypedArray.hasValue(com.google.android.material.R.styleable.TextInputLayout_errorIconTint)) {
            this.errorIconTintList = com.google.android.material.resources.MaterialResources.getColorStateList(getContext(), tintTypedArray, com.google.android.material.R.styleable.TextInputLayout_errorIconTint);
        }
        if (tintTypedArray.hasValue(com.google.android.material.R.styleable.TextInputLayout_errorIconTintMode)) {
            this.errorIconTintMode = com.google.android.material.internal.ViewUtils.parseTintMode(tintTypedArray.getInt(com.google.android.material.R.styleable.TextInputLayout_errorIconTintMode, -1), null);
        }
        if (tintTypedArray.hasValue(com.google.android.material.R.styleable.TextInputLayout_errorIconDrawable)) {
            setErrorIconDrawable(tintTypedArray.getDrawable(com.google.android.material.R.styleable.TextInputLayout_errorIconDrawable));
        }
        this.errorIconView.setContentDescription(getResources().getText(com.google.android.material.R.string.error_icon_content_description));
        androidx.core.view.ViewCompat.setImportantForAccessibility(this.errorIconView, 2);
        this.errorIconView.setClickable(false);
        this.errorIconView.setPressable(false);
        this.errorIconView.setFocusable(false);
    }

    private void initEndIconView(androidx.appcompat.widget.TintTypedArray tintTypedArray) {
        if (!tintTypedArray.hasValue(com.google.android.material.R.styleable.TextInputLayout_passwordToggleEnabled)) {
            if (tintTypedArray.hasValue(com.google.android.material.R.styleable.TextInputLayout_endIconTint)) {
                this.endIconTintList = com.google.android.material.resources.MaterialResources.getColorStateList(getContext(), tintTypedArray, com.google.android.material.R.styleable.TextInputLayout_endIconTint);
            }
            if (tintTypedArray.hasValue(com.google.android.material.R.styleable.TextInputLayout_endIconTintMode)) {
                this.endIconTintMode = com.google.android.material.internal.ViewUtils.parseTintMode(tintTypedArray.getInt(com.google.android.material.R.styleable.TextInputLayout_endIconTintMode, -1), null);
            }
        }
        if (tintTypedArray.hasValue(com.google.android.material.R.styleable.TextInputLayout_endIconMode)) {
            setEndIconMode(tintTypedArray.getInt(com.google.android.material.R.styleable.TextInputLayout_endIconMode, 0));
            if (tintTypedArray.hasValue(com.google.android.material.R.styleable.TextInputLayout_endIconContentDescription)) {
                setEndIconContentDescription(tintTypedArray.getText(com.google.android.material.R.styleable.TextInputLayout_endIconContentDescription));
            }
            setEndIconCheckable(tintTypedArray.getBoolean(com.google.android.material.R.styleable.TextInputLayout_endIconCheckable, true));
            return;
        }
        if (tintTypedArray.hasValue(com.google.android.material.R.styleable.TextInputLayout_passwordToggleEnabled)) {
            if (tintTypedArray.hasValue(com.google.android.material.R.styleable.TextInputLayout_passwordToggleTint)) {
                this.endIconTintList = com.google.android.material.resources.MaterialResources.getColorStateList(getContext(), tintTypedArray, com.google.android.material.R.styleable.TextInputLayout_passwordToggleTint);
            }
            if (tintTypedArray.hasValue(com.google.android.material.R.styleable.TextInputLayout_passwordToggleTintMode)) {
                this.endIconTintMode = com.google.android.material.internal.ViewUtils.parseTintMode(tintTypedArray.getInt(com.google.android.material.R.styleable.TextInputLayout_passwordToggleTintMode, -1), null);
            }
            setEndIconMode(tintTypedArray.getBoolean(com.google.android.material.R.styleable.TextInputLayout_passwordToggleEnabled, false) ? 1 : 0);
            setEndIconContentDescription(tintTypedArray.getText(com.google.android.material.R.styleable.TextInputLayout_passwordToggleContentDescription));
        }
    }

    private void initSuffixTextView(androidx.appcompat.widget.TintTypedArray tintTypedArray) {
        this.suffixTextView.setVisibility(8);
        this.suffixTextView.setId(com.google.android.material.R.id.textinput_suffix_text);
        this.suffixTextView.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2, 80.0f));
        androidx.core.view.ViewCompat.setAccessibilityLiveRegion(this.suffixTextView, 1);
        setSuffixTextAppearance(tintTypedArray.getResourceId(com.google.android.material.R.styleable.TextInputLayout_suffixTextAppearance, 0));
        if (tintTypedArray.hasValue(com.google.android.material.R.styleable.TextInputLayout_suffixTextColor)) {
            setSuffixTextColor(tintTypedArray.getColorStateList(com.google.android.material.R.styleable.TextInputLayout_suffixTextColor));
        }
        setSuffixText(tintTypedArray.getText(com.google.android.material.R.styleable.TextInputLayout_suffixText));
    }

    void setErrorIconDrawable(int i) {
        setErrorIconDrawable(i != 0 ? androidx.appcompat.content.res.AppCompatResources.getDrawable(getContext(), i) : null);
        refreshErrorIconDrawableState();
    }

    void setErrorIconDrawable(android.graphics.drawable.Drawable drawable) {
        this.errorIconView.setImageDrawable(drawable);
        updateErrorIconVisibility();
        com.google.android.material.textfield.IconHelper.applyIconTint(this.textInputLayout, this.errorIconView, this.errorIconTintList, this.errorIconTintMode);
    }

    android.graphics.drawable.Drawable getErrorIconDrawable() {
        return this.errorIconView.getDrawable();
    }

    void setErrorIconTintList(android.content.res.ColorStateList colorStateList) {
        if (this.errorIconTintList != colorStateList) {
            this.errorIconTintList = colorStateList;
            com.google.android.material.textfield.IconHelper.applyIconTint(this.textInputLayout, this.errorIconView, colorStateList, this.errorIconTintMode);
        }
    }

    void setErrorIconTintMode(android.graphics.PorterDuff.Mode mode) {
        if (this.errorIconTintMode != mode) {
            this.errorIconTintMode = mode;
            com.google.android.material.textfield.IconHelper.applyIconTint(this.textInputLayout, this.errorIconView, this.errorIconTintList, mode);
        }
    }

    void setErrorIconOnClickListener(android.view.View.OnClickListener onClickListener) {
        com.google.android.material.textfield.IconHelper.setIconOnClickListener(this.errorIconView, onClickListener, this.errorIconOnLongClickListener);
    }

    com.google.android.material.internal.CheckableImageButton getEndIconView() {
        return this.endIconView;
    }

    com.google.android.material.textfield.EndIconDelegate getEndIconDelegate() {
        return this.endIconDelegates.get(this.endIconMode);
    }

    int getEndIconMode() {
        return this.endIconMode;
    }

    void setEndIconMode(int i) {
        if (this.endIconMode == i) {
            return;
        }
        tearDownDelegate(getEndIconDelegate());
        int i2 = this.endIconMode;
        this.endIconMode = i;
        dispatchOnEndIconChanged(i2);
        setEndIconVisible(i != 0);
        com.google.android.material.textfield.EndIconDelegate endIconDelegate = getEndIconDelegate();
        setEndIconDrawable(getIconResId(endIconDelegate));
        setEndIconContentDescription(endIconDelegate.getIconContentDescriptionResId());
        setEndIconCheckable(endIconDelegate.isIconCheckable());
        if (endIconDelegate.isBoxBackgroundModeSupported(this.textInputLayout.getBoxBackgroundMode())) {
            setUpDelegate(endIconDelegate);
            setEndIconOnClickListener(endIconDelegate.getOnIconClickListener());
            android.widget.EditText editText = this.editText;
            if (editText != null) {
                endIconDelegate.onEditTextAttached(editText);
                setOnFocusChangeListenersIfNeeded(endIconDelegate);
            }
            com.google.android.material.textfield.IconHelper.applyIconTint(this.textInputLayout, this.endIconView, this.endIconTintList, this.endIconTintMode);
            refreshIconState(true);
            return;
        }
        throw new java.lang.IllegalStateException("The current box background mode " + this.textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
    }

    void refreshIconState(boolean z) {
        boolean z2;
        boolean zIsActivated;
        boolean zIsChecked;
        com.google.android.material.textfield.EndIconDelegate endIconDelegate = getEndIconDelegate();
        boolean z3 = true;
        if (!endIconDelegate.isIconCheckable() || (zIsChecked = this.endIconView.isChecked()) == endIconDelegate.isIconChecked()) {
            z2 = false;
        } else {
            this.endIconView.setChecked(!zIsChecked);
            z2 = true;
        }
        if (!endIconDelegate.isIconActivable() || (zIsActivated = this.endIconView.isActivated()) == endIconDelegate.isIconActivated()) {
            z3 = z2;
        } else {
            setEndIconActivated(!zIsActivated);
        }
        if (z || z3) {
            refreshEndIconDrawableState();
        }
    }

    private void setUpDelegate(com.google.android.material.textfield.EndIconDelegate endIconDelegate) {
        endIconDelegate.setUp();
        this.touchExplorationStateChangeListener = endIconDelegate.getTouchExplorationStateChangeListener();
        addTouchExplorationStateChangeListenerIfNeeded();
    }

    private void tearDownDelegate(com.google.android.material.textfield.EndIconDelegate endIconDelegate) {
        removeTouchExplorationStateChangeListenerIfNeeded();
        this.touchExplorationStateChangeListener = null;
        endIconDelegate.tearDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTouchExplorationStateChangeListenerIfNeeded() {
        if (this.touchExplorationStateChangeListener == null || this.accessibilityManager == null || !androidx.core.view.ViewCompat.isAttachedToWindow(this)) {
            return;
        }
        androidx.core.view.accessibility.AccessibilityManagerCompat.addTouchExplorationStateChangeListener(this.accessibilityManager, this.touchExplorationStateChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTouchExplorationStateChangeListenerIfNeeded() {
        android.view.accessibility.AccessibilityManager accessibilityManager;
        androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.touchExplorationStateChangeListener;
        if (touchExplorationStateChangeListener == null || (accessibilityManager = this.accessibilityManager) == null) {
            return;
        }
        androidx.core.view.accessibility.AccessibilityManagerCompat.removeTouchExplorationStateChangeListener(accessibilityManager, touchExplorationStateChangeListener);
    }

    private int getIconResId(com.google.android.material.textfield.EndIconDelegate endIconDelegate) {
        int i = this.endIconDelegates.customEndIconDrawableId;
        return i == 0 ? endIconDelegate.getIconDrawableResId() : i;
    }

    void setEndIconOnClickListener(android.view.View.OnClickListener onClickListener) {
        com.google.android.material.textfield.IconHelper.setIconOnClickListener(this.endIconView, onClickListener, this.endIconOnLongClickListener);
    }

    void setEndIconOnLongClickListener(android.view.View.OnLongClickListener onLongClickListener) {
        this.endIconOnLongClickListener = onLongClickListener;
        com.google.android.material.textfield.IconHelper.setIconOnLongClickListener(this.endIconView, onLongClickListener);
    }

    void setErrorIconOnLongClickListener(android.view.View.OnLongClickListener onLongClickListener) {
        this.errorIconOnLongClickListener = onLongClickListener;
        com.google.android.material.textfield.IconHelper.setIconOnLongClickListener(this.errorIconView, onLongClickListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnFocusChangeListenersIfNeeded(com.google.android.material.textfield.EndIconDelegate endIconDelegate) {
        if (this.editText == null) {
            return;
        }
        if (endIconDelegate.getOnEditTextFocusChangeListener() != null) {
            this.editText.setOnFocusChangeListener(endIconDelegate.getOnEditTextFocusChangeListener());
        }
        if (endIconDelegate.getOnIconViewFocusChangeListener() != null) {
            this.endIconView.setOnFocusChangeListener(endIconDelegate.getOnIconViewFocusChangeListener());
        }
    }

    void refreshErrorIconDrawableState() {
        com.google.android.material.textfield.IconHelper.refreshIconDrawableState(this.textInputLayout, this.errorIconView, this.errorIconTintList);
    }

    void setEndIconVisible(boolean z) {
        if (isEndIconVisible() != z) {
            this.endIconView.setVisibility(z ? 0 : 8);
            updateEndLayoutVisibility();
            updateSuffixTextViewPadding();
            this.textInputLayout.updateDummyDrawables();
        }
    }

    boolean isEndIconVisible() {
        return this.endIconFrame.getVisibility() == 0 && this.endIconView.getVisibility() == 0;
    }

    void setEndIconActivated(boolean z) {
        this.endIconView.setActivated(z);
    }

    void refreshEndIconDrawableState() {
        com.google.android.material.textfield.IconHelper.refreshIconDrawableState(this.textInputLayout, this.endIconView, this.endIconTintList);
    }

    void setEndIconCheckable(boolean z) {
        this.endIconView.setCheckable(z);
    }

    boolean isEndIconCheckable() {
        return this.endIconView.isCheckable();
    }

    boolean isEndIconChecked() {
        return hasEndIcon() && this.endIconView.isChecked();
    }

    void checkEndIcon() {
        this.endIconView.performClick();
        this.endIconView.jumpDrawablesToCurrentState();
    }

    void setEndIconDrawable(int i) {
        setEndIconDrawable(i != 0 ? androidx.appcompat.content.res.AppCompatResources.getDrawable(getContext(), i) : null);
    }

    void setEndIconDrawable(android.graphics.drawable.Drawable drawable) {
        this.endIconView.setImageDrawable(drawable);
        if (drawable != null) {
            com.google.android.material.textfield.IconHelper.applyIconTint(this.textInputLayout, this.endIconView, this.endIconTintList, this.endIconTintMode);
            refreshEndIconDrawableState();
        }
    }

    android.graphics.drawable.Drawable getEndIconDrawable() {
        return this.endIconView.getDrawable();
    }

    void setEndIconContentDescription(int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    void setEndIconContentDescription(java.lang.CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.endIconView.setContentDescription(charSequence);
        }
    }

    java.lang.CharSequence getEndIconContentDescription() {
        return this.endIconView.getContentDescription();
    }

    void setEndIconTintList(android.content.res.ColorStateList colorStateList) {
        if (this.endIconTintList != colorStateList) {
            this.endIconTintList = colorStateList;
            com.google.android.material.textfield.IconHelper.applyIconTint(this.textInputLayout, this.endIconView, colorStateList, this.endIconTintMode);
        }
    }

    void setEndIconTintMode(android.graphics.PorterDuff.Mode mode) {
        if (this.endIconTintMode != mode) {
            this.endIconTintMode = mode;
            com.google.android.material.textfield.IconHelper.applyIconTint(this.textInputLayout, this.endIconView, this.endIconTintList, mode);
        }
    }

    void addOnEndIconChangedListener(com.google.android.material.textfield.TextInputLayout.OnEndIconChangedListener onEndIconChangedListener) {
        this.endIconChangedListeners.add(onEndIconChangedListener);
    }

    void removeOnEndIconChangedListener(com.google.android.material.textfield.TextInputLayout.OnEndIconChangedListener onEndIconChangedListener) {
        this.endIconChangedListeners.remove(onEndIconChangedListener);
    }

    void clearOnEndIconChangedListeners() {
        this.endIconChangedListeners.clear();
    }

    boolean hasEndIcon() {
        return this.endIconMode != 0;
    }

    android.widget.TextView getSuffixTextView() {
        return this.suffixTextView;
    }

    void setSuffixText(java.lang.CharSequence charSequence) {
        this.suffixText = android.text.TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.suffixTextView.setText(charSequence);
        updateSuffixTextVisibility();
    }

    java.lang.CharSequence getSuffixText() {
        return this.suffixText;
    }

    void setSuffixTextAppearance(int i) {
        androidx.core.widget.TextViewCompat.setTextAppearance(this.suffixTextView, i);
    }

    void setSuffixTextColor(android.content.res.ColorStateList colorStateList) {
        this.suffixTextView.setTextColor(colorStateList);
    }

    android.content.res.ColorStateList getSuffixTextColor() {
        return this.suffixTextView.getTextColors();
    }

    void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? androidx.appcompat.content.res.AppCompatResources.getDrawable(getContext(), i) : null);
    }

    void setPasswordVisibilityToggleDrawable(android.graphics.drawable.Drawable drawable) {
        this.endIconView.setImageDrawable(drawable);
    }

    void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    void setPasswordVisibilityToggleContentDescription(java.lang.CharSequence charSequence) {
        this.endIconView.setContentDescription(charSequence);
    }

    android.graphics.drawable.Drawable getPasswordVisibilityToggleDrawable() {
        return this.endIconView.getDrawable();
    }

    java.lang.CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.endIconView.getContentDescription();
    }

    boolean isPasswordVisibilityToggleEnabled() {
        return this.endIconMode == 1;
    }

    void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.endIconMode != 1) {
            setEndIconMode(1);
        } else {
            if (z) {
                return;
            }
            setEndIconMode(0);
        }
    }

    void setPasswordVisibilityToggleTintList(android.content.res.ColorStateList colorStateList) {
        this.endIconTintList = colorStateList;
        com.google.android.material.textfield.IconHelper.applyIconTint(this.textInputLayout, this.endIconView, colorStateList, this.endIconTintMode);
    }

    void setPasswordVisibilityToggleTintMode(android.graphics.PorterDuff.Mode mode) {
        this.endIconTintMode = mode;
        com.google.android.material.textfield.IconHelper.applyIconTint(this.textInputLayout, this.endIconView, this.endIconTintList, mode);
    }

    void togglePasswordVisibilityToggle(boolean z) {
        if (this.endIconMode == 1) {
            this.endIconView.performClick();
            if (z) {
                this.endIconView.jumpDrawablesToCurrentState();
            }
        }
    }

    void onHintStateChanged(boolean z) {
        this.hintExpanded = z;
        updateSuffixTextVisibility();
    }

    void onTextInputBoxStateUpdated() {
        updateErrorIconVisibility();
        refreshErrorIconDrawableState();
        refreshEndIconDrawableState();
        if (getEndIconDelegate().shouldTintIconOnError()) {
            tintEndIconOnError(this.textInputLayout.shouldShowError());
        }
    }

    private void updateSuffixTextVisibility() {
        int visibility = this.suffixTextView.getVisibility();
        int i = (this.suffixText == null || this.hintExpanded) ? 8 : 0;
        if (visibility != i) {
            getEndIconDelegate().onSuffixVisibilityChanged(i == 0);
        }
        updateEndLayoutVisibility();
        this.suffixTextView.setVisibility(i);
        this.textInputLayout.updateDummyDrawables();
    }

    void updateSuffixTextViewPadding() {
        if (this.textInputLayout.editText == null) {
            return;
        }
        androidx.core.view.ViewCompat.setPaddingRelative(this.suffixTextView, getContext().getResources().getDimensionPixelSize(com.google.android.material.R.dimen.material_input_text_to_prefix_suffix_padding), this.textInputLayout.editText.getPaddingTop(), (isEndIconVisible() || isErrorIconVisible()) ? 0 : androidx.core.view.ViewCompat.getPaddingEnd(this.textInputLayout.editText), this.textInputLayout.editText.getPaddingBottom());
    }

    com.google.android.material.internal.CheckableImageButton getCurrentEndIconView() {
        if (isErrorIconVisible()) {
            return this.errorIconView;
        }
        if (hasEndIcon() && isEndIconVisible()) {
            return this.endIconView;
        }
        return null;
    }

    boolean isErrorIconVisible() {
        return this.errorIconView.getVisibility() == 0;
    }

    private void updateErrorIconVisibility() {
        this.errorIconView.setVisibility(getErrorIconDrawable() != null && this.textInputLayout.isErrorEnabled() && this.textInputLayout.shouldShowError() ? 0 : 8);
        updateEndLayoutVisibility();
        updateSuffixTextViewPadding();
        if (hasEndIcon()) {
            return;
        }
        this.textInputLayout.updateDummyDrawables();
    }

    private void updateEndLayoutVisibility() {
        this.endIconFrame.setVisibility((this.endIconView.getVisibility() != 0 || isErrorIconVisible()) ? 8 : 0);
        setVisibility(isEndIconVisible() || isErrorIconVisible() || ((this.suffixText == null || this.hintExpanded) ? '\b' : (char) 0) == 0 ? 0 : 8);
    }

    private void dispatchOnEndIconChanged(int i) {
        java.util.Iterator<com.google.android.material.textfield.TextInputLayout.OnEndIconChangedListener> it = this.endIconChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().onEndIconChanged(this.textInputLayout, i);
        }
    }

    private void tintEndIconOnError(boolean z) {
        if (z && getEndIconDrawable() != null) {
            android.graphics.drawable.Drawable drawableMutate = androidx.core.graphics.drawable.DrawableCompat.wrap(getEndIconDrawable()).mutate();
            androidx.core.graphics.drawable.DrawableCompat.setTint(drawableMutate, this.textInputLayout.getErrorCurrentTextColors());
            this.endIconView.setImageDrawable(drawableMutate);
            return;
        }
        com.google.android.material.textfield.IconHelper.applyIconTint(this.textInputLayout, this.endIconView, this.endIconTintList, this.endIconTintMode);
    }

    private static class EndIconDelegates {
        private final int customEndIconDrawableId;
        private final android.util.SparseArray<com.google.android.material.textfield.EndIconDelegate> delegates = new android.util.SparseArray<>();
        private final com.google.android.material.textfield.EndCompoundLayout endLayout;
        private final int passwordIconDrawableId;

        EndIconDelegates(com.google.android.material.textfield.EndCompoundLayout endCompoundLayout, androidx.appcompat.widget.TintTypedArray tintTypedArray) {
            this.endLayout = endCompoundLayout;
            this.customEndIconDrawableId = tintTypedArray.getResourceId(com.google.android.material.R.styleable.TextInputLayout_endIconDrawable, 0);
            this.passwordIconDrawableId = tintTypedArray.getResourceId(com.google.android.material.R.styleable.TextInputLayout_passwordToggleDrawable, 0);
        }

        com.google.android.material.textfield.EndIconDelegate get(int i) {
            com.google.android.material.textfield.EndIconDelegate endIconDelegate = this.delegates.get(i);
            if (endIconDelegate != null) {
                return endIconDelegate;
            }
            com.google.android.material.textfield.EndIconDelegate endIconDelegateCreate = create(i);
            this.delegates.append(i, endIconDelegateCreate);
            return endIconDelegateCreate;
        }

        private com.google.android.material.textfield.EndIconDelegate create(int i) {
            if (i == -1) {
                return new com.google.android.material.textfield.CustomEndIconDelegate(this.endLayout);
            }
            if (i == 0) {
                return new com.google.android.material.textfield.NoEndIconDelegate(this.endLayout);
            }
            if (i == 1) {
                return new com.google.android.material.textfield.PasswordToggleEndIconDelegate(this.endLayout, this.passwordIconDrawableId);
            }
            if (i == 2) {
                return new com.google.android.material.textfield.ClearTextEndIconDelegate(this.endLayout);
            }
            if (i == 3) {
                return new com.google.android.material.textfield.DropdownMenuEndIconDelegate(this.endLayout);
            }
            throw new java.lang.IllegalArgumentException("Invalid end icon mode: " + i);
        }
    }
}

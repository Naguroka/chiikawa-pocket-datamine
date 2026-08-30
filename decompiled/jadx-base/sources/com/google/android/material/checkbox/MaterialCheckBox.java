package com.google.android.material.checkbox;

/* JADX INFO: loaded from: classes5.dex */
public class MaterialCheckBox extends androidx.appcompat.widget.AppCompatCheckBox {
    public static final int STATE_CHECKED = 1;
    public static final int STATE_INDETERMINATE = 2;
    public static final int STATE_UNCHECKED = 0;
    private boolean broadcasting;
    private android.graphics.drawable.Drawable buttonDrawable;
    private android.graphics.drawable.Drawable buttonIconDrawable;
    android.content.res.ColorStateList buttonIconTintList;
    private android.graphics.PorterDuff.Mode buttonIconTintMode;
    android.content.res.ColorStateList buttonTintList;
    private boolean centerIfNoTextEnabled;
    private int checkedState;
    private int[] currentStateChecked;
    private java.lang.CharSequence customStateDescription;
    private java.lang.CharSequence errorAccessibilityLabel;
    private boolean errorShown;
    private android.content.res.ColorStateList materialThemeColorsTintList;
    private android.widget.CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
    private final java.util.LinkedHashSet<com.google.android.material.checkbox.MaterialCheckBox.OnCheckedStateChangedListener> onCheckedStateChangedListeners;
    private final java.util.LinkedHashSet<com.google.android.material.checkbox.MaterialCheckBox.OnErrorChangedListener> onErrorChangedListeners;
    private final androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat transitionToUnchecked;
    private final androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback transitionToUncheckedCallback;
    private boolean useMaterialThemeColors;
    private boolean usingMaterialButtonDrawable;
    private static final int DEF_STYLE_RES = com.google.android.material.R.style.Widget_MaterialComponents_CompoundButton_CheckBox;
    private static final int[] INDETERMINATE_STATE_SET = {com.google.android.material.R.attr.state_indeterminate};
    private static final int[] ERROR_STATE_SET = {com.google.android.material.R.attr.state_error};
    private static final int[][] CHECKBOX_STATES = {new int[]{android.R.attr.state_enabled, com.google.android.material.R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
    private static final int FRAMEWORK_BUTTON_DRAWABLE_RES_ID = android.content.res.Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface CheckedState {
    }

    public interface OnCheckedStateChangedListener {
        void onCheckedStateChangedListener(com.google.android.material.checkbox.MaterialCheckBox materialCheckBox, int i);
    }

    public interface OnErrorChangedListener {
        void onErrorChanged(com.google.android.material.checkbox.MaterialCheckBox materialCheckBox, boolean z);
    }

    private void updateIconTintIfNeeded() {
    }

    public MaterialCheckBox(android.content.Context context) {
        this(context, null);
    }

    public MaterialCheckBox(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.checkboxStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialCheckBox(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        int i2 = DEF_STYLE_RES;
        super(com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(context, attributeSet, i, i2), attributeSet, i);
        this.onErrorChangedListeners = new java.util.LinkedHashSet<>();
        this.onCheckedStateChangedListeners = new java.util.LinkedHashSet<>();
        this.transitionToUnchecked = androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.create(getContext(), com.google.android.material.R.drawable.mtrl_checkbox_button_checked_unchecked);
        this.transitionToUncheckedCallback = new androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback() { // from class: com.google.android.material.checkbox.MaterialCheckBox.1
            @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
            public void onAnimationStart(android.graphics.drawable.Drawable drawable) {
                super.onAnimationStart(drawable);
                if (com.google.android.material.checkbox.MaterialCheckBox.this.buttonTintList != null) {
                    androidx.core.graphics.drawable.DrawableCompat.setTint(drawable, com.google.android.material.checkbox.MaterialCheckBox.this.buttonTintList.getColorForState(com.google.android.material.checkbox.MaterialCheckBox.this.currentStateChecked, com.google.android.material.checkbox.MaterialCheckBox.this.buttonTintList.getDefaultColor()));
                }
            }

            @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
            public void onAnimationEnd(android.graphics.drawable.Drawable drawable) {
                super.onAnimationEnd(drawable);
                if (com.google.android.material.checkbox.MaterialCheckBox.this.buttonTintList != null) {
                    androidx.core.graphics.drawable.DrawableCompat.setTintList(drawable, com.google.android.material.checkbox.MaterialCheckBox.this.buttonTintList);
                }
            }
        };
        android.content.Context context2 = getContext();
        this.buttonDrawable = androidx.core.widget.CompoundButtonCompat.getButtonDrawable(this);
        this.buttonTintList = getSuperButtonTintList();
        setSupportButtonTintList(null);
        androidx.appcompat.widget.TintTypedArray tintTypedArrayObtainTintedStyledAttributes = com.google.android.material.internal.ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, com.google.android.material.R.styleable.MaterialCheckBox, i, i2, new int[0]);
        this.buttonIconDrawable = tintTypedArrayObtainTintedStyledAttributes.getDrawable(com.google.android.material.R.styleable.MaterialCheckBox_buttonIcon);
        if (this.buttonDrawable != null && com.google.android.material.internal.ThemeEnforcement.isMaterial3Theme(context2) && isButtonDrawableLegacy(tintTypedArrayObtainTintedStyledAttributes)) {
            super.setButtonDrawable((android.graphics.drawable.Drawable) null);
            this.buttonDrawable = androidx.appcompat.content.res.AppCompatResources.getDrawable(context2, com.google.android.material.R.drawable.mtrl_checkbox_button);
            this.usingMaterialButtonDrawable = true;
            if (this.buttonIconDrawable == null) {
                this.buttonIconDrawable = androidx.appcompat.content.res.AppCompatResources.getDrawable(context2, com.google.android.material.R.drawable.mtrl_checkbox_button_icon);
            }
        }
        this.buttonIconTintList = com.google.android.material.resources.MaterialResources.getColorStateList(context2, tintTypedArrayObtainTintedStyledAttributes, com.google.android.material.R.styleable.MaterialCheckBox_buttonIconTint);
        this.buttonIconTintMode = com.google.android.material.internal.ViewUtils.parseTintMode(tintTypedArrayObtainTintedStyledAttributes.getInt(com.google.android.material.R.styleable.MaterialCheckBox_buttonIconTintMode, -1), android.graphics.PorterDuff.Mode.SRC_IN);
        this.useMaterialThemeColors = tintTypedArrayObtainTintedStyledAttributes.getBoolean(com.google.android.material.R.styleable.MaterialCheckBox_useMaterialThemeColors, false);
        this.centerIfNoTextEnabled = tintTypedArrayObtainTintedStyledAttributes.getBoolean(com.google.android.material.R.styleable.MaterialCheckBox_centerIfNoTextEnabled, true);
        this.errorShown = tintTypedArrayObtainTintedStyledAttributes.getBoolean(com.google.android.material.R.styleable.MaterialCheckBox_errorShown, false);
        this.errorAccessibilityLabel = tintTypedArrayObtainTintedStyledAttributes.getText(com.google.android.material.R.styleable.MaterialCheckBox_errorAccessibilityLabel);
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.MaterialCheckBox_checkedState)) {
            setCheckedState(tintTypedArrayObtainTintedStyledAttributes.getInt(com.google.android.material.R.styleable.MaterialCheckBox_checkedState, 0));
        }
        tintTypedArrayObtainTintedStyledAttributes.recycle();
        refreshButtonDrawable();
    }

    /* JADX INFO: renamed from: lambda$new$0$com-google-android-material-checkbox-MaterialCheckBox, reason: not valid java name */
    /* synthetic */ void m770xdf87d0bf() {
        this.buttonIconDrawable.jumpToCurrentState();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        android.graphics.drawable.Drawable buttonDrawable;
        if (this.centerIfNoTextEnabled && android.text.TextUtils.isEmpty(getText()) && (buttonDrawable = androidx.core.widget.CompoundButtonCompat.getButtonDrawable(this)) != null) {
            int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * (com.google.android.material.internal.ViewUtils.isLayoutRtl(this) ? -1 : 1);
            int iSave = canvas.save();
            canvas.translate(width, 0.0f);
            super.onDraw(canvas);
            canvas.restoreToCount(iSave);
            if (getBackground() != null) {
                android.graphics.Rect bounds = buttonDrawable.getBounds();
                androidx.core.graphics.drawable.DrawableCompat.setHotspotBounds(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
                return;
            }
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.useMaterialThemeColors && this.buttonTintList == null && this.buttonIconTintList == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            mergeDrawableStates(iArrOnCreateDrawableState, INDETERMINATE_STATE_SET);
        }
        if (isErrorShown()) {
            mergeDrawableStates(iArrOnCreateDrawableState, ERROR_STATE_SET);
        }
        this.currentStateChecked = com.google.android.material.drawable.DrawableUtils.getCheckedState(iArrOnCreateDrawableState);
        updateIconTintIfNeeded();
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        updateIconTintIfNeeded();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public boolean isChecked() {
        return this.checkedState == 1;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(android.widget.CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.onCheckedChangeListener = onCheckedChangeListener;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && isErrorShown()) {
            accessibilityNodeInfo.setText(((java.lang.Object) accessibilityNodeInfo.getText()) + ", " + ((java.lang.Object) this.errorAccessibilityLabel));
        }
    }

    public void setCheckedState(int i) {
        android.view.autofill.AutofillManager autofillManager;
        android.widget.CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.checkedState != i) {
            this.checkedState = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            setDefaultStateDescription();
            if (this.broadcasting) {
                return;
            }
            this.broadcasting = true;
            java.util.LinkedHashSet<com.google.android.material.checkbox.MaterialCheckBox.OnCheckedStateChangedListener> linkedHashSet = this.onCheckedStateChangedListeners;
            if (linkedHashSet != null) {
                java.util.Iterator<com.google.android.material.checkbox.MaterialCheckBox.OnCheckedStateChangedListener> it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    it.next().onCheckedStateChangedListener(this, this.checkedState);
                }
            }
            if (this.checkedState != 2 && (onCheckedChangeListener = this.onCheckedChangeListener) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (android.os.Build.VERSION.SDK_INT >= 26 && (autofillManager = (android.view.autofill.AutofillManager) getContext().getSystemService(android.view.autofill.AutofillManager.class)) != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.broadcasting = false;
        }
    }

    public int getCheckedState() {
        return this.checkedState;
    }

    public void addOnCheckedStateChangedListener(com.google.android.material.checkbox.MaterialCheckBox.OnCheckedStateChangedListener onCheckedStateChangedListener) {
        this.onCheckedStateChangedListeners.add(onCheckedStateChangedListener);
    }

    public void removeOnCheckedStateChangedListener(com.google.android.material.checkbox.MaterialCheckBox.OnCheckedStateChangedListener onCheckedStateChangedListener) {
        this.onCheckedStateChangedListeners.remove(onCheckedStateChangedListener);
    }

    public void clearOnCheckedStateChangedListeners() {
        this.onCheckedStateChangedListeners.clear();
    }

    public void setErrorShown(boolean z) {
        if (this.errorShown == z) {
            return;
        }
        this.errorShown = z;
        refreshDrawableState();
        java.util.Iterator<com.google.android.material.checkbox.MaterialCheckBox.OnErrorChangedListener> it = this.onErrorChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().onErrorChanged(this, this.errorShown);
        }
    }

    public boolean isErrorShown() {
        return this.errorShown;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorAccessibilityLabel(java.lang.CharSequence charSequence) {
        this.errorAccessibilityLabel = charSequence;
    }

    public java.lang.CharSequence getErrorAccessibilityLabel() {
        return this.errorAccessibilityLabel;
    }

    public void addOnErrorChangedListener(com.google.android.material.checkbox.MaterialCheckBox.OnErrorChangedListener onErrorChangedListener) {
        this.onErrorChangedListeners.add(onErrorChangedListener);
    }

    public void removeOnErrorChangedListener(com.google.android.material.checkbox.MaterialCheckBox.OnErrorChangedListener onErrorChangedListener) {
        this.onErrorChangedListeners.remove(onErrorChangedListener);
    }

    public void clearOnErrorChangedListeners() {
        this.onErrorChangedListeners.clear();
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(androidx.appcompat.content.res.AppCompatResources.getDrawable(getContext(), i));
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(android.graphics.drawable.Drawable drawable) {
        this.buttonDrawable = drawable;
        this.usingMaterialButtonDrawable = false;
        refreshButtonDrawable();
    }

    @Override // android.widget.CompoundButton
    public android.graphics.drawable.Drawable getButtonDrawable() {
        return this.buttonDrawable;
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(android.content.res.ColorStateList colorStateList) {
        if (this.buttonTintList == colorStateList) {
            return;
        }
        this.buttonTintList = colorStateList;
        refreshButtonDrawable();
    }

    @Override // android.widget.CompoundButton
    public android.content.res.ColorStateList getButtonTintList() {
        return this.buttonTintList;
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(android.graphics.PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        refreshButtonDrawable();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(androidx.appcompat.content.res.AppCompatResources.getDrawable(getContext(), i));
    }

    public void setButtonIconDrawable(android.graphics.drawable.Drawable drawable) {
        this.buttonIconDrawable = drawable;
        refreshButtonDrawable();
    }

    public android.graphics.drawable.Drawable getButtonIconDrawable() {
        return this.buttonIconDrawable;
    }

    public void setButtonIconTintList(android.content.res.ColorStateList colorStateList) {
        if (this.buttonIconTintList == colorStateList) {
            return;
        }
        this.buttonIconTintList = colorStateList;
        refreshButtonDrawable();
    }

    public android.content.res.ColorStateList getButtonIconTintList() {
        return this.buttonIconTintList;
    }

    public void setButtonIconTintMode(android.graphics.PorterDuff.Mode mode) {
        if (this.buttonIconTintMode == mode) {
            return;
        }
        this.buttonIconTintMode = mode;
        refreshButtonDrawable();
    }

    public android.graphics.PorterDuff.Mode getButtonIconTintMode() {
        return this.buttonIconTintMode;
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.useMaterialThemeColors = z;
        if (z) {
            androidx.core.widget.CompoundButtonCompat.setButtonTintList(this, getMaterialThemeColorsTintList());
        } else {
            androidx.core.widget.CompoundButtonCompat.setButtonTintList(this, null);
        }
    }

    public boolean isUseMaterialThemeColors() {
        return this.useMaterialThemeColors;
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.centerIfNoTextEnabled = z;
    }

    public boolean isCenterIfNoTextEnabled() {
        return this.centerIfNoTextEnabled;
    }

    private void refreshButtonDrawable() {
        this.buttonDrawable = com.google.android.material.drawable.DrawableUtils.createTintableMutatedDrawableIfNeeded(this.buttonDrawable, this.buttonTintList, androidx.core.widget.CompoundButtonCompat.getButtonTintMode(this));
        this.buttonIconDrawable = com.google.android.material.drawable.DrawableUtils.createTintableMutatedDrawableIfNeeded(this.buttonIconDrawable, this.buttonIconTintList, this.buttonIconTintMode);
        setUpDefaultButtonDrawableAnimationIfNeeded();
        updateButtonTints();
        super.setButtonDrawable(com.google.android.material.drawable.DrawableUtils.compositeTwoLayeredDrawable(this.buttonDrawable, this.buttonIconDrawable));
        refreshDrawableState();
    }

    private void setUpDefaultButtonDrawableAnimationIfNeeded() {
        if (this.usingMaterialButtonDrawable) {
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat animatedVectorDrawableCompat = this.transitionToUnchecked;
            if (animatedVectorDrawableCompat != null) {
                animatedVectorDrawableCompat.unregisterAnimationCallback(this.transitionToUncheckedCallback);
                this.transitionToUnchecked.registerAnimationCallback(this.transitionToUncheckedCallback);
            }
            android.graphics.drawable.Drawable drawable = this.buttonDrawable;
            if (!(drawable instanceof android.graphics.drawable.AnimatedStateListDrawable) || this.transitionToUnchecked == null) {
                return;
            }
            ((android.graphics.drawable.AnimatedStateListDrawable) drawable).addTransition(com.google.android.material.R.id.checked, com.google.android.material.R.id.unchecked, this.transitionToUnchecked, false);
            ((android.graphics.drawable.AnimatedStateListDrawable) this.buttonDrawable).addTransition(com.google.android.material.R.id.indeterminate, com.google.android.material.R.id.unchecked, this.transitionToUnchecked, false);
        }
    }

    private void updateButtonTints() {
        android.content.res.ColorStateList colorStateList;
        android.content.res.ColorStateList colorStateList2;
        android.graphics.drawable.Drawable drawable = this.buttonDrawable;
        if (drawable != null && (colorStateList2 = this.buttonTintList) != null) {
            androidx.core.graphics.drawable.DrawableCompat.setTintList(drawable, colorStateList2);
        }
        android.graphics.drawable.Drawable drawable2 = this.buttonIconDrawable;
        if (drawable2 == null || (colorStateList = this.buttonIconTintList) == null) {
            return;
        }
        androidx.core.graphics.drawable.DrawableCompat.setTintList(drawable2, colorStateList);
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(java.lang.CharSequence charSequence) {
        this.customStateDescription = charSequence;
        if (charSequence == null) {
            setDefaultStateDescription();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    private void setDefaultStateDescription() {
        if (android.os.Build.VERSION.SDK_INT < 30 || this.customStateDescription != null) {
            return;
        }
        super.setStateDescription(getButtonStateDescription());
    }

    private java.lang.String getButtonStateDescription() {
        int i = this.checkedState;
        if (i == 1) {
            return getResources().getString(com.google.android.material.R.string.mtrl_checkbox_state_description_checked);
        }
        if (i == 0) {
            return getResources().getString(com.google.android.material.R.string.mtrl_checkbox_state_description_unchecked);
        }
        return getResources().getString(com.google.android.material.R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private android.content.res.ColorStateList getSuperButtonTintList() {
        android.content.res.ColorStateList colorStateList = this.buttonTintList;
        if (colorStateList != null) {
            return colorStateList;
        }
        if (super.getButtonTintList() != null) {
            return super.getButtonTintList();
        }
        return getSupportButtonTintList();
    }

    private boolean isButtonDrawableLegacy(androidx.appcompat.widget.TintTypedArray tintTypedArray) {
        return tintTypedArray.getResourceId(com.google.android.material.R.styleable.MaterialCheckBox_android_button, 0) == FRAMEWORK_BUTTON_DRAWABLE_RES_ID && tintTypedArray.getResourceId(com.google.android.material.R.styleable.MaterialCheckBox_buttonCompat, 0) == 0;
    }

    private android.content.res.ColorStateList getMaterialThemeColorsTintList() {
        if (this.materialThemeColorsTintList == null) {
            int[][] iArr = CHECKBOX_STATES;
            int[] iArr2 = new int[iArr.length];
            int color = com.google.android.material.color.MaterialColors.getColor(this, com.google.android.material.R.attr.colorControlActivated);
            int color2 = com.google.android.material.color.MaterialColors.getColor(this, com.google.android.material.R.attr.colorError);
            int color3 = com.google.android.material.color.MaterialColors.getColor(this, com.google.android.material.R.attr.colorSurface);
            int color4 = com.google.android.material.color.MaterialColors.getColor(this, com.google.android.material.R.attr.colorOnSurface);
            iArr2[0] = com.google.android.material.color.MaterialColors.layer(color3, color2, 1.0f);
            iArr2[1] = com.google.android.material.color.MaterialColors.layer(color3, color, 1.0f);
            iArr2[2] = com.google.android.material.color.MaterialColors.layer(color3, color4, 0.54f);
            iArr2[3] = com.google.android.material.color.MaterialColors.layer(color3, color4, 0.38f);
            iArr2[4] = com.google.android.material.color.MaterialColors.layer(color3, color4, 0.38f);
            this.materialThemeColorsTintList = new android.content.res.ColorStateList(iArr, iArr2);
        }
        return this.materialThemeColorsTintList;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        com.google.android.material.checkbox.MaterialCheckBox.SavedState savedState = new com.google.android.material.checkbox.MaterialCheckBox.SavedState(super.onSaveInstanceState());
        savedState.checkedState = getCheckedState();
        return savedState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof com.google.android.material.checkbox.MaterialCheckBox.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        com.google.android.material.checkbox.MaterialCheckBox.SavedState savedState = (com.google.android.material.checkbox.MaterialCheckBox.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCheckedState(savedState.checkedState);
    }

    static class SavedState extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<com.google.android.material.checkbox.MaterialCheckBox.SavedState> CREATOR = new android.os.Parcelable.Creator<com.google.android.material.checkbox.MaterialCheckBox.SavedState>() { // from class: com.google.android.material.checkbox.MaterialCheckBox.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public com.google.android.material.checkbox.MaterialCheckBox.SavedState createFromParcel(android.os.Parcel parcel) {
                return new com.google.android.material.checkbox.MaterialCheckBox.SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public com.google.android.material.checkbox.MaterialCheckBox.SavedState[] newArray(int i) {
                return new com.google.android.material.checkbox.MaterialCheckBox.SavedState[i];
            }
        };
        int checkedState;

        SavedState(android.os.Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(android.os.Parcel parcel) {
            super(parcel);
            this.checkedState = ((java.lang.Integer) parcel.readValue(getClass().getClassLoader())).intValue();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(java.lang.Integer.valueOf(this.checkedState));
        }

        public java.lang.String toString() {
            return "MaterialCheckBox.SavedState{" + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " CheckedState=" + getCheckedStateString() + "}";
        }

        private java.lang.String getCheckedStateString() {
            int i = this.checkedState;
            if (i != 1) {
                return i != 2 ? "unchecked" : "indeterminate";
            }
            return "checked";
        }
    }
}

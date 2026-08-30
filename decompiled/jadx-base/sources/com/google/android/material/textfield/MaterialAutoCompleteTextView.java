package com.google.android.material.textfield;

/* JADX INFO: loaded from: classes5.dex */
public class MaterialAutoCompleteTextView extends androidx.appcompat.widget.AppCompatAutoCompleteTextView {
    private static final int MAX_ITEMS_MEASURED = 15;
    private final android.view.accessibility.AccessibilityManager accessibilityManager;
    private final androidx.appcompat.widget.ListPopupWindow modalListPopup;
    private final float popupElevation;
    private final int simpleItemLayout;
    private int simpleItemSelectedColor;
    private android.content.res.ColorStateList simpleItemSelectedRippleColor;
    private final android.graphics.Rect tempRect;

    public MaterialAutoCompleteTextView(android.content.Context context) {
        this(context, null);
    }

    public MaterialAutoCompleteTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.autoCompleteTextViewStyle);
    }

    public MaterialAutoCompleteTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(context, attributeSet, i, 0), attributeSet, i);
        this.tempRect = new android.graphics.Rect();
        android.content.Context context2 = getContext();
        android.content.res.TypedArray typedArrayObtainStyledAttributes = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, com.google.android.material.R.styleable.MaterialAutoCompleteTextView, i, com.google.android.material.R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (typedArrayObtainStyledAttributes.hasValue(com.google.android.material.R.styleable.MaterialAutoCompleteTextView_android_inputType) && typedArrayObtainStyledAttributes.getInt(com.google.android.material.R.styleable.MaterialAutoCompleteTextView_android_inputType, 0) == 0) {
            setKeyListener(null);
        }
        this.simpleItemLayout = typedArrayObtainStyledAttributes.getResourceId(com.google.android.material.R.styleable.MaterialAutoCompleteTextView_simpleItemLayout, com.google.android.material.R.layout.mtrl_auto_complete_simple_item);
        this.popupElevation = typedArrayObtainStyledAttributes.getDimensionPixelOffset(com.google.android.material.R.styleable.MaterialAutoCompleteTextView_android_popupElevation, com.google.android.material.R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        this.simpleItemSelectedColor = typedArrayObtainStyledAttributes.getColor(com.google.android.material.R.styleable.MaterialAutoCompleteTextView_simpleItemSelectedColor, 0);
        this.simpleItemSelectedRippleColor = com.google.android.material.resources.MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.MaterialAutoCompleteTextView_simpleItemSelectedRippleColor);
        this.accessibilityManager = (android.view.accessibility.AccessibilityManager) context2.getSystemService("accessibility");
        androidx.appcompat.widget.ListPopupWindow listPopupWindow = new androidx.appcompat.widget.ListPopupWindow(context2);
        this.modalListPopup = listPopupWindow;
        listPopupWindow.setModal(true);
        listPopupWindow.setAnchorView(this);
        listPopupWindow.setInputMethodMode(2);
        listPopupWindow.setAdapter(getAdapter());
        listPopupWindow.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() { // from class: com.google.android.material.textfield.MaterialAutoCompleteTextView.1
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int i2, long j) {
                com.google.android.material.textfield.MaterialAutoCompleteTextView materialAutoCompleteTextView = com.google.android.material.textfield.MaterialAutoCompleteTextView.this;
                com.google.android.material.textfield.MaterialAutoCompleteTextView.this.updateText(i2 < 0 ? materialAutoCompleteTextView.modalListPopup.getSelectedItem() : materialAutoCompleteTextView.getAdapter().getItem(i2));
                android.widget.AdapterView.OnItemClickListener onItemClickListener = com.google.android.material.textfield.MaterialAutoCompleteTextView.this.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i2 < 0) {
                        view = com.google.android.material.textfield.MaterialAutoCompleteTextView.this.modalListPopup.getSelectedView();
                        i2 = com.google.android.material.textfield.MaterialAutoCompleteTextView.this.modalListPopup.getSelectedItemPosition();
                        j = com.google.android.material.textfield.MaterialAutoCompleteTextView.this.modalListPopup.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(com.google.android.material.textfield.MaterialAutoCompleteTextView.this.modalListPopup.getListView(), view, i2, j);
                }
                com.google.android.material.textfield.MaterialAutoCompleteTextView.this.modalListPopup.dismiss();
            }
        });
        if (typedArrayObtainStyledAttributes.hasValue(com.google.android.material.R.styleable.MaterialAutoCompleteTextView_simpleItems)) {
            setSimpleItems(typedArrayObtainStyledAttributes.getResourceId(com.google.android.material.R.styleable.MaterialAutoCompleteTextView_simpleItems, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        android.view.accessibility.AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            this.modalListPopup.show();
        } else {
            super.showDropDown();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends android.widget.ListAdapter & android.widget.Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.modalListPopup.setAdapter(getAdapter());
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        onInputTypeChanged();
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(android.widget.AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.modalListPopup.setOnItemSelectedListener(getOnItemSelectedListener());
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    public void setSimpleItems(java.lang.String[] strArr) {
        setAdapter(new com.google.android.material.textfield.MaterialAutoCompleteTextView.MaterialArrayAdapter(getContext(), this.simpleItemLayout, strArr));
    }

    public void setSimpleItemSelectedColor(int i) {
        this.simpleItemSelectedColor = i;
        if (getAdapter() instanceof com.google.android.material.textfield.MaterialAutoCompleteTextView.MaterialArrayAdapter) {
            ((com.google.android.material.textfield.MaterialAutoCompleteTextView.MaterialArrayAdapter) getAdapter()).updateSelectedItemColorStateList();
        }
    }

    public int getSimpleItemSelectedColor() {
        return this.simpleItemSelectedColor;
    }

    public void setSimpleItemSelectedRippleColor(android.content.res.ColorStateList colorStateList) {
        this.simpleItemSelectedRippleColor = colorStateList;
        if (getAdapter() instanceof com.google.android.material.textfield.MaterialAutoCompleteTextView.MaterialArrayAdapter) {
            ((com.google.android.material.textfield.MaterialAutoCompleteTextView.MaterialArrayAdapter) getAdapter()).updateSelectedItemColorStateList();
        }
    }

    public android.content.res.ColorStateList getSimpleItemSelectedRippleColor() {
        return this.simpleItemSelectedRippleColor;
    }

    public float getPopupElevation() {
        return this.popupElevation;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.android.material.textfield.TextInputLayout textInputLayoutFindTextInputLayoutAncestor = findTextInputLayoutAncestor();
        if (textInputLayoutFindTextInputLayoutAncestor != null && textInputLayoutFindTextInputLayoutAncestor.isProvidingHint() && super.getHint() == null && com.google.android.material.internal.ManufacturerUtils.isMeizuDevice()) {
            setHint("");
        }
    }

    @Override // android.widget.TextView
    public java.lang.CharSequence getHint() {
        com.google.android.material.textfield.TextInputLayout textInputLayoutFindTextInputLayoutAncestor = findTextInputLayoutAncestor();
        if (textInputLayoutFindTextInputLayoutAncestor != null && textInputLayoutFindTextInputLayoutAncestor.isProvidingHint()) {
            return textInputLayoutFindTextInputLayoutAncestor.getHint();
        }
        return super.getHint();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (android.view.View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(java.lang.Math.min(java.lang.Math.max(getMeasuredWidth(), measureContentWidth()), android.view.View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    private int measureContentWidth() {
        android.widget.ListAdapter adapter = getAdapter();
        com.google.android.material.textfield.TextInputLayout textInputLayoutFindTextInputLayoutAncestor = findTextInputLayoutAncestor();
        int i = 0;
        if (adapter == null || textInputLayoutFindTextInputLayoutAncestor == null) {
            return 0;
        }
        int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMin = java.lang.Math.min(adapter.getCount(), java.lang.Math.max(0, this.modalListPopup.getSelectedItemPosition()) + 15);
        android.view.View view = null;
        int iMax = 0;
        for (int iMax2 = java.lang.Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
            int itemViewType = adapter.getItemViewType(iMax2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = adapter.getView(iMax2, view, textInputLayoutFindTextInputLayoutAncestor);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax = java.lang.Math.max(iMax, view.getMeasuredWidth());
        }
        android.graphics.drawable.Drawable background = this.modalListPopup.getBackground();
        if (background != null) {
            background.getPadding(this.tempRect);
            iMax += this.tempRect.left + this.tempRect.right;
        }
        return iMax + textInputLayoutFindTextInputLayoutAncestor.getEndIconView().getMeasuredWidth();
    }

    private void onInputTypeChanged() {
        com.google.android.material.textfield.TextInputLayout textInputLayoutFindTextInputLayoutAncestor = findTextInputLayoutAncestor();
        if (textInputLayoutFindTextInputLayoutAncestor != null) {
            textInputLayoutFindTextInputLayoutAncestor.updateEditTextBoxBackgroundIfNeeded();
        }
    }

    private com.google.android.material.textfield.TextInputLayout findTextInputLayoutAncestor() {
        for (android.view.ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof com.google.android.material.textfield.TextInputLayout) {
                return (com.google.android.material.textfield.TextInputLayout) parent;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T extends android.widget.ListAdapter & android.widget.Filterable> void updateText(java.lang.Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    private class MaterialArrayAdapter<T> extends android.widget.ArrayAdapter<java.lang.String> {
        private android.content.res.ColorStateList pressedRippleColor;
        private android.content.res.ColorStateList selectedItemRippleOverlaidColor;

        MaterialArrayAdapter(android.content.Context context, int i, java.lang.String[] strArr) {
            super(context, i, strArr);
            updateSelectedItemColorStateList();
        }

        void updateSelectedItemColorStateList() {
            this.pressedRippleColor = sanitizeDropdownItemSelectedRippleColor();
            this.selectedItemRippleOverlaidColor = createItemSelectedColorStateList();
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public android.view.View getView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
            android.view.View view2 = super.getView(i, view, viewGroup);
            if (view2 instanceof android.widget.TextView) {
                android.widget.TextView textView = (android.widget.TextView) view2;
                androidx.core.view.ViewCompat.setBackground(textView, com.google.android.material.textfield.MaterialAutoCompleteTextView.this.getText().toString().contentEquals(textView.getText()) ? getSelectedItemDrawable() : null);
            }
            return view2;
        }

        private android.graphics.drawable.Drawable getSelectedItemDrawable() {
            if (!hasSelectedColor()) {
                return null;
            }
            android.graphics.drawable.ColorDrawable colorDrawable = new android.graphics.drawable.ColorDrawable(com.google.android.material.textfield.MaterialAutoCompleteTextView.this.simpleItemSelectedColor);
            if (this.pressedRippleColor == null) {
                return colorDrawable;
            }
            androidx.core.graphics.drawable.DrawableCompat.setTintList(colorDrawable, this.selectedItemRippleOverlaidColor);
            return new android.graphics.drawable.RippleDrawable(this.pressedRippleColor, colorDrawable, null);
        }

        private android.content.res.ColorStateList createItemSelectedColorStateList() {
            if (!hasSelectedColor() || !hasSelectedRippleColor()) {
                return null;
            }
            int[] iArr = {android.R.attr.state_hovered, -16842919};
            int[] iArr2 = {android.R.attr.state_selected, -16842919};
            return new android.content.res.ColorStateList(new int[][]{iArr2, iArr, new int[0]}, new int[]{com.google.android.material.color.MaterialColors.layer(com.google.android.material.textfield.MaterialAutoCompleteTextView.this.simpleItemSelectedColor, com.google.android.material.textfield.MaterialAutoCompleteTextView.this.simpleItemSelectedRippleColor.getColorForState(iArr2, 0)), com.google.android.material.color.MaterialColors.layer(com.google.android.material.textfield.MaterialAutoCompleteTextView.this.simpleItemSelectedColor, com.google.android.material.textfield.MaterialAutoCompleteTextView.this.simpleItemSelectedRippleColor.getColorForState(iArr, 0)), com.google.android.material.textfield.MaterialAutoCompleteTextView.this.simpleItemSelectedColor});
        }

        private android.content.res.ColorStateList sanitizeDropdownItemSelectedRippleColor() {
            if (!hasSelectedRippleColor()) {
                return null;
            }
            int[] iArr = {android.R.attr.state_pressed};
            return new android.content.res.ColorStateList(new int[][]{iArr, new int[0]}, new int[]{com.google.android.material.textfield.MaterialAutoCompleteTextView.this.simpleItemSelectedRippleColor.getColorForState(iArr, 0), 0});
        }

        private boolean hasSelectedColor() {
            return com.google.android.material.textfield.MaterialAutoCompleteTextView.this.simpleItemSelectedColor != 0;
        }

        private boolean hasSelectedRippleColor() {
            return com.google.android.material.textfield.MaterialAutoCompleteTextView.this.simpleItemSelectedRippleColor != null;
        }
    }
}

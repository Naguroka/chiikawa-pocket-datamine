package com.google.android.material.timepicker;

/* JADX INFO: loaded from: classes5.dex */
class TimePickerTextInputPresenter implements com.google.android.material.timepicker.TimePickerView.OnSelectionChange, com.google.android.material.timepicker.TimePickerPresenter {
    private final com.google.android.material.timepicker.TimePickerTextInputKeyController controller;
    private final android.widget.EditText hourEditText;
    private final com.google.android.material.timepicker.ChipTextInputComboView hourTextInput;
    private final android.widget.EditText minuteEditText;
    private final com.google.android.material.timepicker.ChipTextInputComboView minuteTextInput;
    private final com.google.android.material.timepicker.TimeModel time;
    private final android.widget.LinearLayout timePickerView;
    private com.google.android.material.button.MaterialButtonToggleGroup toggle;
    private final android.text.TextWatcher minuteTextWatcher = new com.google.android.material.internal.TextWatcherAdapter() { // from class: com.google.android.material.timepicker.TimePickerTextInputPresenter.1
        @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            try {
                if (android.text.TextUtils.isEmpty(editable)) {
                    com.google.android.material.timepicker.TimePickerTextInputPresenter.this.time.setMinute(0);
                } else {
                    com.google.android.material.timepicker.TimePickerTextInputPresenter.this.time.setMinute(java.lang.Integer.parseInt(editable.toString()));
                }
            } catch (java.lang.NumberFormatException unused) {
            }
        }
    };
    private final android.text.TextWatcher hourTextWatcher = new com.google.android.material.internal.TextWatcherAdapter() { // from class: com.google.android.material.timepicker.TimePickerTextInputPresenter.2
        @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            try {
                if (android.text.TextUtils.isEmpty(editable)) {
                    com.google.android.material.timepicker.TimePickerTextInputPresenter.this.time.setHour(0);
                } else {
                    com.google.android.material.timepicker.TimePickerTextInputPresenter.this.time.setHour(java.lang.Integer.parseInt(editable.toString()));
                }
            } catch (java.lang.NumberFormatException unused) {
            }
        }
    };

    public TimePickerTextInputPresenter(android.widget.LinearLayout linearLayout, final com.google.android.material.timepicker.TimeModel timeModel) {
        this.timePickerView = linearLayout;
        this.time = timeModel;
        android.content.res.Resources resources = linearLayout.getResources();
        com.google.android.material.timepicker.ChipTextInputComboView chipTextInputComboView = (com.google.android.material.timepicker.ChipTextInputComboView) linearLayout.findViewById(com.google.android.material.R.id.material_minute_text_input);
        this.minuteTextInput = chipTextInputComboView;
        com.google.android.material.timepicker.ChipTextInputComboView chipTextInputComboView2 = (com.google.android.material.timepicker.ChipTextInputComboView) linearLayout.findViewById(com.google.android.material.R.id.material_hour_text_input);
        this.hourTextInput = chipTextInputComboView2;
        android.widget.TextView textView = (android.widget.TextView) chipTextInputComboView.findViewById(com.google.android.material.R.id.material_label);
        android.widget.TextView textView2 = (android.widget.TextView) chipTextInputComboView2.findViewById(com.google.android.material.R.id.material_label);
        textView.setText(resources.getString(com.google.android.material.R.string.material_timepicker_minute));
        textView2.setText(resources.getString(com.google.android.material.R.string.material_timepicker_hour));
        chipTextInputComboView.setTag(com.google.android.material.R.id.selection_type, 12);
        chipTextInputComboView2.setTag(com.google.android.material.R.id.selection_type, 10);
        if (timeModel.format == 0) {
            setupPeriodToggle();
        }
        android.view.View.OnClickListener onClickListener = new android.view.View.OnClickListener() { // from class: com.google.android.material.timepicker.TimePickerTextInputPresenter.3
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                com.google.android.material.timepicker.TimePickerTextInputPresenter.this.onSelectionChanged(((java.lang.Integer) view.getTag(com.google.android.material.R.id.selection_type)).intValue());
            }
        };
        chipTextInputComboView2.setOnClickListener(onClickListener);
        chipTextInputComboView.setOnClickListener(onClickListener);
        chipTextInputComboView2.addInputFilter(timeModel.getHourInputValidator());
        chipTextInputComboView.addInputFilter(timeModel.getMinuteInputValidator());
        this.hourEditText = chipTextInputComboView2.getTextInput().getEditText();
        this.minuteEditText = chipTextInputComboView.getTextInput().getEditText();
        this.controller = new com.google.android.material.timepicker.TimePickerTextInputKeyController(chipTextInputComboView2, chipTextInputComboView, timeModel);
        chipTextInputComboView2.setChipDelegate(new com.google.android.material.timepicker.ClickActionDelegate(linearLayout.getContext(), com.google.android.material.R.string.material_hour_selection) { // from class: com.google.android.material.timepicker.TimePickerTextInputPresenter.4
            @Override // com.google.android.material.timepicker.ClickActionDelegate, androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(android.view.View view, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setContentDescription(view.getResources().getString(com.google.android.material.R.string.material_hour_suffix, java.lang.String.valueOf(timeModel.getHourForDisplay())));
            }
        });
        chipTextInputComboView.setChipDelegate(new com.google.android.material.timepicker.ClickActionDelegate(linearLayout.getContext(), com.google.android.material.R.string.material_minute_selection) { // from class: com.google.android.material.timepicker.TimePickerTextInputPresenter.5
            @Override // com.google.android.material.timepicker.ClickActionDelegate, androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(android.view.View view, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setContentDescription(view.getResources().getString(com.google.android.material.R.string.material_minute_suffix, java.lang.String.valueOf(timeModel.minute)));
            }
        });
        initialize();
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void initialize() {
        addTextWatchers();
        setTime(this.time);
        this.controller.bind();
    }

    private void addTextWatchers() {
        this.hourEditText.addTextChangedListener(this.hourTextWatcher);
        this.minuteEditText.addTextChangedListener(this.minuteTextWatcher);
    }

    private void removeTextWatchers() {
        this.hourEditText.removeTextChangedListener(this.hourTextWatcher);
        this.minuteEditText.removeTextChangedListener(this.minuteTextWatcher);
    }

    private void setTime(com.google.android.material.timepicker.TimeModel timeModel) {
        removeTextWatchers();
        java.util.Locale locale = this.timePickerView.getResources().getConfiguration().locale;
        java.lang.String str = java.lang.String.format(locale, com.google.android.material.timepicker.TimeModel.ZERO_LEADING_NUMBER_FORMAT, java.lang.Integer.valueOf(timeModel.minute));
        java.lang.String str2 = java.lang.String.format(locale, com.google.android.material.timepicker.TimeModel.ZERO_LEADING_NUMBER_FORMAT, java.lang.Integer.valueOf(timeModel.getHourForDisplay()));
        this.minuteTextInput.setText(str);
        this.hourTextInput.setText(str2);
        addTextWatchers();
        updateSelection();
    }

    private void setupPeriodToggle() {
        com.google.android.material.button.MaterialButtonToggleGroup materialButtonToggleGroup = (com.google.android.material.button.MaterialButtonToggleGroup) this.timePickerView.findViewById(com.google.android.material.R.id.material_clock_period_toggle);
        this.toggle = materialButtonToggleGroup;
        materialButtonToggleGroup.addOnButtonCheckedListener(new com.google.android.material.button.MaterialButtonToggleGroup.OnButtonCheckedListener() { // from class: com.google.android.material.timepicker.TimePickerTextInputPresenter$$ExternalSyntheticLambda0
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.OnButtonCheckedListener
            public final void onButtonChecked(com.google.android.material.button.MaterialButtonToggleGroup materialButtonToggleGroup2, int i, boolean z) {
                this.f$0.m788xf2085e95(materialButtonToggleGroup2, i, z);
            }
        });
        this.toggle.setVisibility(0);
        updateSelection();
    }

    /* JADX INFO: renamed from: lambda$setupPeriodToggle$0$com-google-android-material-timepicker-TimePickerTextInputPresenter, reason: not valid java name */
    /* synthetic */ void m788xf2085e95(com.google.android.material.button.MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z) {
        if (z) {
            this.time.setPeriod(i == com.google.android.material.R.id.material_clock_period_pm_button ? 1 : 0);
        }
    }

    private void updateSelection() {
        int i;
        com.google.android.material.button.MaterialButtonToggleGroup materialButtonToggleGroup = this.toggle;
        if (materialButtonToggleGroup == null) {
            return;
        }
        if (this.time.period == 0) {
            i = com.google.android.material.R.id.material_clock_period_am_button;
        } else {
            i = com.google.android.material.R.id.material_clock_period_pm_button;
        }
        materialButtonToggleGroup.check(i);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.OnSelectionChange
    public void onSelectionChanged(int i) {
        this.time.selection = i;
        this.minuteTextInput.setChecked(i == 12);
        this.hourTextInput.setChecked(i == 10);
        updateSelection();
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void show() {
        this.timePickerView.setVisibility(0);
        onSelectionChanged(this.time.selection);
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void hide() {
        android.view.View focusedChild = this.timePickerView.getFocusedChild();
        if (focusedChild != null) {
            com.google.android.material.internal.ViewUtils.hideKeyboard(focusedChild);
        }
        this.timePickerView.setVisibility(8);
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void invalidate() {
        setTime(this.time);
    }

    private static void setCursorDrawableColor(android.widget.EditText editText, int i) {
        try {
            android.content.Context context = editText.getContext();
            java.lang.reflect.Field declaredField = android.widget.TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            int i2 = declaredField.getInt(editText);
            java.lang.reflect.Field declaredField2 = android.widget.TextView.class.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            java.lang.Object obj = declaredField2.get(editText);
            java.lang.reflect.Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
            declaredField3.setAccessible(true);
            android.graphics.drawable.Drawable drawable = androidx.appcompat.content.res.AppCompatResources.getDrawable(context, i2);
            drawable.setColorFilter(i, android.graphics.PorterDuff.Mode.SRC_IN);
            declaredField3.set(obj, new android.graphics.drawable.Drawable[]{drawable, drawable});
        } catch (java.lang.Throwable unused) {
        }
    }

    public void resetChecked() {
        this.minuteTextInput.setChecked(this.time.selection == 12);
        this.hourTextInput.setChecked(this.time.selection == 10);
    }

    public void clearCheck() {
        this.minuteTextInput.setChecked(false);
        this.hourTextInput.setChecked(false);
    }
}

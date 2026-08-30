package com.google.android.material.timepicker;

/* JADX INFO: loaded from: classes5.dex */
public final class MaterialTimePicker extends androidx.fragment.app.DialogFragment implements com.google.android.material.timepicker.TimePickerView.OnDoubleTapListener {
    public static final int INPUT_MODE_CLOCK = 0;
    static final java.lang.String INPUT_MODE_EXTRA = "TIME_PICKER_INPUT_MODE";
    public static final int INPUT_MODE_KEYBOARD = 1;
    static final java.lang.String NEGATIVE_BUTTON_TEXT_EXTRA = "TIME_PICKER_NEGATIVE_BUTTON_TEXT";
    static final java.lang.String NEGATIVE_BUTTON_TEXT_RES_EXTRA = "TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES";
    static final java.lang.String OVERRIDE_THEME_RES_ID = "TIME_PICKER_OVERRIDE_THEME_RES_ID";
    static final java.lang.String POSITIVE_BUTTON_TEXT_EXTRA = "TIME_PICKER_POSITIVE_BUTTON_TEXT";
    static final java.lang.String POSITIVE_BUTTON_TEXT_RES_EXTRA = "TIME_PICKER_POSITIVE_BUTTON_TEXT_RES";
    static final java.lang.String TIME_MODEL_EXTRA = "TIME_PICKER_TIME_MODEL";
    static final java.lang.String TITLE_RES_EXTRA = "TIME_PICKER_TITLE_RES";
    static final java.lang.String TITLE_TEXT_EXTRA = "TIME_PICKER_TITLE_TEXT";
    private com.google.android.material.timepicker.TimePickerPresenter activePresenter;
    private android.widget.Button cancelButton;
    private int clockIcon;
    private int keyboardIcon;
    private com.google.android.material.button.MaterialButton modeButton;
    private java.lang.CharSequence negativeButtonText;
    private java.lang.CharSequence positiveButtonText;
    private android.view.ViewStub textInputStub;
    private com.google.android.material.timepicker.TimeModel time;
    private com.google.android.material.timepicker.TimePickerClockPresenter timePickerClockPresenter;
    private com.google.android.material.timepicker.TimePickerTextInputPresenter timePickerTextInputPresenter;
    private com.google.android.material.timepicker.TimePickerView timePickerView;
    private java.lang.CharSequence titleText;
    private final java.util.Set<android.view.View.OnClickListener> positiveButtonListeners = new java.util.LinkedHashSet();
    private final java.util.Set<android.view.View.OnClickListener> negativeButtonListeners = new java.util.LinkedHashSet();
    private final java.util.Set<android.content.DialogInterface.OnCancelListener> cancelListeners = new java.util.LinkedHashSet();
    private final java.util.Set<android.content.DialogInterface.OnDismissListener> dismissListeners = new java.util.LinkedHashSet();
    private int titleResId = 0;
    private int positiveButtonTextResId = 0;
    private int negativeButtonTextResId = 0;
    private int inputMode = 0;
    private int overrideThemeResId = 0;

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.android.material.timepicker.MaterialTimePicker newInstance(com.google.android.material.timepicker.MaterialTimePicker.Builder builder) {
        com.google.android.material.timepicker.MaterialTimePicker materialTimePicker = new com.google.android.material.timepicker.MaterialTimePicker();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable(TIME_MODEL_EXTRA, builder.time);
        bundle.putInt(INPUT_MODE_EXTRA, builder.inputMode);
        bundle.putInt(TITLE_RES_EXTRA, builder.titleTextResId);
        if (builder.titleText != null) {
            bundle.putCharSequence(TITLE_TEXT_EXTRA, builder.titleText);
        }
        bundle.putInt(POSITIVE_BUTTON_TEXT_RES_EXTRA, builder.positiveButtonTextResId);
        if (builder.positiveButtonText != null) {
            bundle.putCharSequence(POSITIVE_BUTTON_TEXT_EXTRA, builder.positiveButtonText);
        }
        bundle.putInt(NEGATIVE_BUTTON_TEXT_RES_EXTRA, builder.negativeButtonTextResId);
        if (builder.negativeButtonText != null) {
            bundle.putCharSequence(NEGATIVE_BUTTON_TEXT_EXTRA, builder.negativeButtonText);
        }
        bundle.putInt(OVERRIDE_THEME_RES_ID, builder.overrideThemeResId);
        materialTimePicker.setArguments(bundle);
        return materialTimePicker;
    }

    public int getMinute() {
        return this.time.minute;
    }

    public void setMinute(int i) {
        this.time.setMinute(i);
        com.google.android.material.timepicker.TimePickerPresenter timePickerPresenter = this.activePresenter;
        if (timePickerPresenter != null) {
            timePickerPresenter.invalidate();
        }
    }

    public int getHour() {
        return this.time.hour % 24;
    }

    public void setHour(int i) {
        this.time.setHour(i);
        com.google.android.material.timepicker.TimePickerPresenter timePickerPresenter = this.activePresenter;
        if (timePickerPresenter != null) {
            timePickerPresenter.invalidate();
        }
    }

    public int getInputMode() {
        return this.inputMode;
    }

    @Override // androidx.fragment.app.DialogFragment
    public final android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        android.app.Dialog dialog = new android.app.Dialog(requireContext(), getThemeResId());
        android.content.Context context = dialog.getContext();
        int iResolveOrThrow = com.google.android.material.resources.MaterialAttributes.resolveOrThrow(context, com.google.android.material.R.attr.colorSurface, com.google.android.material.timepicker.MaterialTimePicker.class.getCanonicalName());
        com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable = new com.google.android.material.shape.MaterialShapeDrawable(context, null, com.google.android.material.R.attr.materialTimePickerStyle, com.google.android.material.R.style.Widget_MaterialComponents_TimePicker);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, com.google.android.material.R.styleable.MaterialTimePicker, com.google.android.material.R.attr.materialTimePickerStyle, com.google.android.material.R.style.Widget_MaterialComponents_TimePicker);
        this.clockIcon = typedArrayObtainStyledAttributes.getResourceId(com.google.android.material.R.styleable.MaterialTimePicker_clockIcon, 0);
        this.keyboardIcon = typedArrayObtainStyledAttributes.getResourceId(com.google.android.material.R.styleable.MaterialTimePicker_keyboardIcon, 0);
        typedArrayObtainStyledAttributes.recycle();
        materialShapeDrawable.initializeElevationOverlay(context);
        materialShapeDrawable.setFillColor(android.content.res.ColorStateList.valueOf(iResolveOrThrow));
        android.view.Window window = dialog.getWindow();
        window.setBackgroundDrawable(materialShapeDrawable);
        window.requestFeature(1);
        window.setLayout(-2, -2);
        materialShapeDrawable.setElevation(androidx.core.view.ViewCompat.getElevation(window.getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        restoreState(bundle);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable(TIME_MODEL_EXTRA, this.time);
        bundle.putInt(INPUT_MODE_EXTRA, this.inputMode);
        bundle.putInt(TITLE_RES_EXTRA, this.titleResId);
        bundle.putCharSequence(TITLE_TEXT_EXTRA, this.titleText);
        bundle.putInt(POSITIVE_BUTTON_TEXT_RES_EXTRA, this.positiveButtonTextResId);
        bundle.putCharSequence(POSITIVE_BUTTON_TEXT_EXTRA, this.positiveButtonText);
        bundle.putInt(NEGATIVE_BUTTON_TEXT_RES_EXTRA, this.negativeButtonTextResId);
        bundle.putCharSequence(NEGATIVE_BUTTON_TEXT_EXTRA, this.negativeButtonText);
        bundle.putInt(OVERRIDE_THEME_RES_ID, this.overrideThemeResId);
    }

    private void restoreState(android.os.Bundle bundle) {
        if (bundle == null) {
            return;
        }
        com.google.android.material.timepicker.TimeModel timeModel = (com.google.android.material.timepicker.TimeModel) bundle.getParcelable(TIME_MODEL_EXTRA);
        this.time = timeModel;
        if (timeModel == null) {
            this.time = new com.google.android.material.timepicker.TimeModel();
        }
        this.inputMode = bundle.getInt(INPUT_MODE_EXTRA, 0);
        this.titleResId = bundle.getInt(TITLE_RES_EXTRA, 0);
        this.titleText = bundle.getCharSequence(TITLE_TEXT_EXTRA);
        this.positiveButtonTextResId = bundle.getInt(POSITIVE_BUTTON_TEXT_RES_EXTRA, 0);
        this.positiveButtonText = bundle.getCharSequence(POSITIVE_BUTTON_TEXT_EXTRA);
        this.negativeButtonTextResId = bundle.getInt(NEGATIVE_BUTTON_TEXT_RES_EXTRA, 0);
        this.negativeButtonText = bundle.getCharSequence(NEGATIVE_BUTTON_TEXT_EXTRA);
        this.overrideThemeResId = bundle.getInt(OVERRIDE_THEME_RES_ID, 0);
    }

    @Override // androidx.fragment.app.Fragment
    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) layoutInflater.inflate(com.google.android.material.R.layout.material_timepicker_dialog, viewGroup);
        com.google.android.material.timepicker.TimePickerView timePickerView = (com.google.android.material.timepicker.TimePickerView) viewGroup2.findViewById(com.google.android.material.R.id.material_timepicker_view);
        this.timePickerView = timePickerView;
        timePickerView.setOnDoubleTapListener(this);
        this.textInputStub = (android.view.ViewStub) viewGroup2.findViewById(com.google.android.material.R.id.material_textinput_timepicker);
        this.modeButton = (com.google.android.material.button.MaterialButton) viewGroup2.findViewById(com.google.android.material.R.id.material_timepicker_mode_button);
        android.widget.TextView textView = (android.widget.TextView) viewGroup2.findViewById(com.google.android.material.R.id.header_title);
        int i = this.titleResId;
        if (i != 0) {
            textView.setText(i);
        } else if (!android.text.TextUtils.isEmpty(this.titleText)) {
            textView.setText(this.titleText);
        }
        updateInputMode(this.modeButton);
        android.widget.Button button = (android.widget.Button) viewGroup2.findViewById(com.google.android.material.R.id.material_timepicker_ok_button);
        button.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.android.material.timepicker.MaterialTimePicker.1
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                java.util.Iterator it = com.google.android.material.timepicker.MaterialTimePicker.this.positiveButtonListeners.iterator();
                while (it.hasNext()) {
                    ((android.view.View.OnClickListener) it.next()).onClick(view);
                }
                com.google.android.material.timepicker.MaterialTimePicker.this.dismiss();
            }
        });
        int i2 = this.positiveButtonTextResId;
        if (i2 != 0) {
            button.setText(i2);
        } else if (!android.text.TextUtils.isEmpty(this.positiveButtonText)) {
            button.setText(this.positiveButtonText);
        }
        android.widget.Button button2 = (android.widget.Button) viewGroup2.findViewById(com.google.android.material.R.id.material_timepicker_cancel_button);
        this.cancelButton = button2;
        button2.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.android.material.timepicker.MaterialTimePicker.2
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                java.util.Iterator it = com.google.android.material.timepicker.MaterialTimePicker.this.negativeButtonListeners.iterator();
                while (it.hasNext()) {
                    ((android.view.View.OnClickListener) it.next()).onClick(view);
                }
                com.google.android.material.timepicker.MaterialTimePicker.this.dismiss();
            }
        });
        int i3 = this.negativeButtonTextResId;
        if (i3 != 0) {
            this.cancelButton.setText(i3);
        } else if (!android.text.TextUtils.isEmpty(this.negativeButtonText)) {
            this.cancelButton.setText(this.negativeButtonText);
        }
        updateCancelButtonVisibility();
        this.modeButton.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.android.material.timepicker.MaterialTimePicker.3
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                com.google.android.material.timepicker.MaterialTimePicker materialTimePicker = com.google.android.material.timepicker.MaterialTimePicker.this;
                materialTimePicker.inputMode = materialTimePicker.inputMode == 0 ? 1 : 0;
                com.google.android.material.timepicker.MaterialTimePicker materialTimePicker2 = com.google.android.material.timepicker.MaterialTimePicker.this;
                materialTimePicker2.updateInputMode(materialTimePicker2.modeButton);
            }
        });
        return viewGroup2;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.activePresenter = null;
        this.timePickerClockPresenter = null;
        this.timePickerTextInputPresenter = null;
        com.google.android.material.timepicker.TimePickerView timePickerView = this.timePickerView;
        if (timePickerView != null) {
            timePickerView.setOnDoubleTapListener(null);
            this.timePickerView = null;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        java.util.Iterator<android.content.DialogInterface.OnCancelListener> it = this.cancelListeners.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        java.util.Iterator<android.content.DialogInterface.OnDismissListener> it = this.dismissListeners.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment
    public void setCancelable(boolean z) {
        super.setCancelable(z);
        updateCancelButtonVisibility();
    }

    @Override // com.google.android.material.timepicker.TimePickerView.OnDoubleTapListener
    public void onDoubleTap() {
        this.inputMode = 1;
        updateInputMode(this.modeButton);
        this.timePickerTextInputPresenter.resetChecked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateInputMode(com.google.android.material.button.MaterialButton materialButton) {
        if (materialButton == null || this.timePickerView == null || this.textInputStub == null) {
            return;
        }
        com.google.android.material.timepicker.TimePickerPresenter timePickerPresenter = this.activePresenter;
        if (timePickerPresenter != null) {
            timePickerPresenter.hide();
        }
        com.google.android.material.timepicker.TimePickerPresenter timePickerPresenterInitializeOrRetrieveActivePresenterForMode = initializeOrRetrieveActivePresenterForMode(this.inputMode, this.timePickerView, this.textInputStub);
        this.activePresenter = timePickerPresenterInitializeOrRetrieveActivePresenterForMode;
        timePickerPresenterInitializeOrRetrieveActivePresenterForMode.show();
        this.activePresenter.invalidate();
        android.util.Pair<java.lang.Integer, java.lang.Integer> pairDataForMode = dataForMode(this.inputMode);
        materialButton.setIconResource(((java.lang.Integer) pairDataForMode.first).intValue());
        materialButton.setContentDescription(getResources().getString(((java.lang.Integer) pairDataForMode.second).intValue()));
        materialButton.sendAccessibilityEvent(4);
    }

    private void updateCancelButtonVisibility() {
        android.widget.Button button = this.cancelButton;
        if (button != null) {
            button.setVisibility(isCancelable() ? 0 : 8);
        }
    }

    private com.google.android.material.timepicker.TimePickerPresenter initializeOrRetrieveActivePresenterForMode(int i, com.google.android.material.timepicker.TimePickerView timePickerView, android.view.ViewStub viewStub) {
        if (i == 0) {
            com.google.android.material.timepicker.TimePickerClockPresenter timePickerClockPresenter = this.timePickerClockPresenter;
            if (timePickerClockPresenter == null) {
                timePickerClockPresenter = new com.google.android.material.timepicker.TimePickerClockPresenter(timePickerView, this.time);
            }
            this.timePickerClockPresenter = timePickerClockPresenter;
            return timePickerClockPresenter;
        }
        if (this.timePickerTextInputPresenter == null) {
            this.timePickerTextInputPresenter = new com.google.android.material.timepicker.TimePickerTextInputPresenter((android.widget.LinearLayout) viewStub.inflate(), this.time);
        }
        this.timePickerTextInputPresenter.clearCheck();
        return this.timePickerTextInputPresenter;
    }

    private android.util.Pair<java.lang.Integer, java.lang.Integer> dataForMode(int i) {
        if (i == 0) {
            return new android.util.Pair<>(java.lang.Integer.valueOf(this.keyboardIcon), java.lang.Integer.valueOf(com.google.android.material.R.string.material_timepicker_text_input_mode_description));
        }
        if (i == 1) {
            return new android.util.Pair<>(java.lang.Integer.valueOf(this.clockIcon), java.lang.Integer.valueOf(com.google.android.material.R.string.material_timepicker_clock_mode_description));
        }
        throw new java.lang.IllegalArgumentException("no icon for mode: " + i);
    }

    com.google.android.material.timepicker.TimePickerClockPresenter getTimePickerClockPresenter() {
        return this.timePickerClockPresenter;
    }

    void setActivePresenter(com.google.android.material.timepicker.TimePickerPresenter timePickerPresenter) {
        this.activePresenter = timePickerPresenter;
    }

    public boolean addOnPositiveButtonClickListener(android.view.View.OnClickListener onClickListener) {
        return this.positiveButtonListeners.add(onClickListener);
    }

    public boolean removeOnPositiveButtonClickListener(android.view.View.OnClickListener onClickListener) {
        return this.positiveButtonListeners.remove(onClickListener);
    }

    public void clearOnPositiveButtonClickListeners() {
        this.positiveButtonListeners.clear();
    }

    public boolean addOnNegativeButtonClickListener(android.view.View.OnClickListener onClickListener) {
        return this.negativeButtonListeners.add(onClickListener);
    }

    public boolean removeOnNegativeButtonClickListener(android.view.View.OnClickListener onClickListener) {
        return this.negativeButtonListeners.remove(onClickListener);
    }

    public void clearOnNegativeButtonClickListeners() {
        this.negativeButtonListeners.clear();
    }

    public boolean addOnCancelListener(android.content.DialogInterface.OnCancelListener onCancelListener) {
        return this.cancelListeners.add(onCancelListener);
    }

    public boolean removeOnCancelListener(android.content.DialogInterface.OnCancelListener onCancelListener) {
        return this.cancelListeners.remove(onCancelListener);
    }

    public void clearOnCancelListeners() {
        this.cancelListeners.clear();
    }

    public boolean addOnDismissListener(android.content.DialogInterface.OnDismissListener onDismissListener) {
        return this.dismissListeners.add(onDismissListener);
    }

    public boolean removeOnDismissListener(android.content.DialogInterface.OnDismissListener onDismissListener) {
        return this.dismissListeners.remove(onDismissListener);
    }

    public void clearOnDismissListeners() {
        this.dismissListeners.clear();
    }

    private int getThemeResId() {
        int i = this.overrideThemeResId;
        if (i != 0) {
            return i;
        }
        android.util.TypedValue typedValueResolve = com.google.android.material.resources.MaterialAttributes.resolve(requireContext(), com.google.android.material.R.attr.materialTimePickerTheme);
        if (typedValueResolve == null) {
            return 0;
        }
        return typedValueResolve.data;
    }

    public static final class Builder {
        private int inputMode;
        private java.lang.CharSequence negativeButtonText;
        private java.lang.CharSequence positiveButtonText;
        private java.lang.CharSequence titleText;
        private com.google.android.material.timepicker.TimeModel time = new com.google.android.material.timepicker.TimeModel();
        private int titleTextResId = 0;
        private int positiveButtonTextResId = 0;
        private int negativeButtonTextResId = 0;
        private int overrideThemeResId = 0;

        public com.google.android.material.timepicker.MaterialTimePicker.Builder setInputMode(int i) {
            this.inputMode = i;
            return this;
        }

        public com.google.android.material.timepicker.MaterialTimePicker.Builder setHour(int i) {
            this.time.setHourOfDay(i);
            return this;
        }

        public com.google.android.material.timepicker.MaterialTimePicker.Builder setMinute(int i) {
            this.time.setMinute(i);
            return this;
        }

        public com.google.android.material.timepicker.MaterialTimePicker.Builder setTimeFormat(int i) {
            int i2 = this.time.hour;
            int i3 = this.time.minute;
            com.google.android.material.timepicker.TimeModel timeModel = new com.google.android.material.timepicker.TimeModel(i);
            this.time = timeModel;
            timeModel.setMinute(i3);
            this.time.setHourOfDay(i2);
            return this;
        }

        public com.google.android.material.timepicker.MaterialTimePicker.Builder setTitleText(int i) {
            this.titleTextResId = i;
            return this;
        }

        public com.google.android.material.timepicker.MaterialTimePicker.Builder setTitleText(java.lang.CharSequence charSequence) {
            this.titleText = charSequence;
            return this;
        }

        public com.google.android.material.timepicker.MaterialTimePicker.Builder setPositiveButtonText(int i) {
            this.positiveButtonTextResId = i;
            return this;
        }

        public com.google.android.material.timepicker.MaterialTimePicker.Builder setPositiveButtonText(java.lang.CharSequence charSequence) {
            this.positiveButtonText = charSequence;
            return this;
        }

        public com.google.android.material.timepicker.MaterialTimePicker.Builder setNegativeButtonText(int i) {
            this.negativeButtonTextResId = i;
            return this;
        }

        public com.google.android.material.timepicker.MaterialTimePicker.Builder setNegativeButtonText(java.lang.CharSequence charSequence) {
            this.negativeButtonText = charSequence;
            return this;
        }

        public com.google.android.material.timepicker.MaterialTimePicker.Builder setTheme(int i) {
            this.overrideThemeResId = i;
            return this;
        }

        public com.google.android.material.timepicker.MaterialTimePicker build() {
            return com.google.android.material.timepicker.MaterialTimePicker.newInstance(this);
        }
    }
}

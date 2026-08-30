package com.google.android.material.timepicker;

/* JADX INFO: loaded from: classes5.dex */
class TimePickerView extends androidx.constraintlayout.widget.ConstraintLayout implements com.google.android.material.timepicker.TimePickerControls {
    static final java.lang.String GENERIC_VIEW_ACCESSIBILITY_CLASS_NAME = "android.view.View";
    private final com.google.android.material.timepicker.ClockFaceView clockFace;
    private final com.google.android.material.timepicker.ClockHandView clockHandView;
    private final com.google.android.material.chip.Chip hourView;
    private final com.google.android.material.chip.Chip minuteView;
    private com.google.android.material.timepicker.TimePickerView.OnDoubleTapListener onDoubleTapListener;
    private com.google.android.material.timepicker.TimePickerView.OnPeriodChangeListener onPeriodChangeListener;
    private com.google.android.material.timepicker.TimePickerView.OnSelectionChange onSelectionChangeListener;
    private final android.view.View.OnClickListener selectionListener;
    private final com.google.android.material.button.MaterialButtonToggleGroup toggle;

    interface OnDoubleTapListener {
        void onDoubleTap();
    }

    interface OnPeriodChangeListener {
        void onPeriodChange(int i);
    }

    interface OnSelectionChange {
        void onSelectionChanged(int i);
    }

    public TimePickerView(android.content.Context context) {
        this(context, null);
    }

    public TimePickerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimePickerView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.selectionListener = new android.view.View.OnClickListener() { // from class: com.google.android.material.timepicker.TimePickerView.1
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                if (com.google.android.material.timepicker.TimePickerView.this.onSelectionChangeListener != null) {
                    com.google.android.material.timepicker.TimePickerView.this.onSelectionChangeListener.onSelectionChanged(((java.lang.Integer) view.getTag(com.google.android.material.R.id.selection_type)).intValue());
                }
            }
        };
        android.view.LayoutInflater.from(context).inflate(com.google.android.material.R.layout.material_timepicker, this);
        this.clockFace = (com.google.android.material.timepicker.ClockFaceView) findViewById(com.google.android.material.R.id.material_clock_face);
        com.google.android.material.button.MaterialButtonToggleGroup materialButtonToggleGroup = (com.google.android.material.button.MaterialButtonToggleGroup) findViewById(com.google.android.material.R.id.material_clock_period_toggle);
        this.toggle = materialButtonToggleGroup;
        materialButtonToggleGroup.addOnButtonCheckedListener(new com.google.android.material.button.MaterialButtonToggleGroup.OnButtonCheckedListener() { // from class: com.google.android.material.timepicker.TimePickerView$$ExternalSyntheticLambda0
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.OnButtonCheckedListener
            public final void onButtonChecked(com.google.android.material.button.MaterialButtonToggleGroup materialButtonToggleGroup2, int i2, boolean z) {
                this.f$0.m789x9f44237d(materialButtonToggleGroup2, i2, z);
            }
        });
        this.minuteView = (com.google.android.material.chip.Chip) findViewById(com.google.android.material.R.id.material_minute_tv);
        this.hourView = (com.google.android.material.chip.Chip) findViewById(com.google.android.material.R.id.material_hour_tv);
        this.clockHandView = (com.google.android.material.timepicker.ClockHandView) findViewById(com.google.android.material.R.id.material_clock_hand);
        setupDoubleTap();
        setUpDisplay();
    }

    /* JADX INFO: renamed from: lambda$new$0$com-google-android-material-timepicker-TimePickerView, reason: not valid java name */
    /* synthetic */ void m789x9f44237d(com.google.android.material.button.MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z) {
        if (z && this.onPeriodChangeListener != null) {
            this.onPeriodChangeListener.onPeriodChange(i == com.google.android.material.R.id.material_clock_period_pm_button ? 1 : 0);
        }
    }

    private void setupDoubleTap() {
        final android.view.GestureDetector gestureDetector = new android.view.GestureDetector(getContext(), new android.view.GestureDetector.SimpleOnGestureListener() { // from class: com.google.android.material.timepicker.TimePickerView.2
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(android.view.MotionEvent motionEvent) {
                com.google.android.material.timepicker.TimePickerView.OnDoubleTapListener onDoubleTapListener = com.google.android.material.timepicker.TimePickerView.this.onDoubleTapListener;
                if (onDoubleTapListener == null) {
                    return false;
                }
                onDoubleTapListener.onDoubleTap();
                return true;
            }
        });
        android.view.View.OnTouchListener onTouchListener = new android.view.View.OnTouchListener() { // from class: com.google.android.material.timepicker.TimePickerView.3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                if (((android.widget.Checkable) view).isChecked()) {
                    return gestureDetector.onTouchEvent(motionEvent);
                }
                return false;
            }
        };
        this.minuteView.setOnTouchListener(onTouchListener);
        this.hourView.setOnTouchListener(onTouchListener);
    }

    public void setMinuteHourDelegate(androidx.core.view.AccessibilityDelegateCompat accessibilityDelegateCompat) {
        androidx.core.view.ViewCompat.setAccessibilityDelegate(this.hourView, accessibilityDelegateCompat);
    }

    public void setHourClickDelegate(androidx.core.view.AccessibilityDelegateCompat accessibilityDelegateCompat) {
        androidx.core.view.ViewCompat.setAccessibilityDelegate(this.minuteView, accessibilityDelegateCompat);
    }

    private void setUpDisplay() {
        this.minuteView.setTag(com.google.android.material.R.id.selection_type, 12);
        this.hourView.setTag(com.google.android.material.R.id.selection_type, 10);
        this.minuteView.setOnClickListener(this.selectionListener);
        this.hourView.setOnClickListener(this.selectionListener);
        this.minuteView.setAccessibilityClassName(GENERIC_VIEW_ACCESSIBILITY_CLASS_NAME);
        this.hourView.setAccessibilityClassName(GENERIC_VIEW_ACCESSIBILITY_CLASS_NAME);
    }

    @Override // com.google.android.material.timepicker.TimePickerControls
    public void setValues(java.lang.String[] strArr, int i) {
        this.clockFace.setValues(strArr, i);
    }

    @Override // com.google.android.material.timepicker.TimePickerControls
    public void setHandRotation(float f) {
        this.clockHandView.setHandRotation(f);
    }

    public void setHandRotation(float f, boolean z) {
        this.clockHandView.setHandRotation(f, z);
    }

    public void setAnimateOnTouchUp(boolean z) {
        this.clockHandView.setAnimateOnTouchUp(z);
    }

    @Override // com.google.android.material.timepicker.TimePickerControls
    public void updateTime(int i, int i2, int i3) {
        int i4;
        if (i == 1) {
            i4 = com.google.android.material.R.id.material_clock_period_pm_button;
        } else {
            i4 = com.google.android.material.R.id.material_clock_period_am_button;
        }
        this.toggle.check(i4);
        java.util.Locale locale = getResources().getConfiguration().locale;
        java.lang.String str = java.lang.String.format(locale, com.google.android.material.timepicker.TimeModel.ZERO_LEADING_NUMBER_FORMAT, java.lang.Integer.valueOf(i3));
        java.lang.String str2 = java.lang.String.format(locale, com.google.android.material.timepicker.TimeModel.ZERO_LEADING_NUMBER_FORMAT, java.lang.Integer.valueOf(i2));
        if (!android.text.TextUtils.equals(this.minuteView.getText(), str)) {
            this.minuteView.setText(str);
        }
        if (android.text.TextUtils.equals(this.hourView.getText(), str2)) {
            return;
        }
        this.hourView.setText(str2);
    }

    @Override // com.google.android.material.timepicker.TimePickerControls
    public void setActiveSelection(int i) {
        updateSelection(this.minuteView, i == 12);
        updateSelection(this.hourView, i == 10);
    }

    private void updateSelection(com.google.android.material.chip.Chip chip, boolean z) {
        chip.setChecked(z);
        androidx.core.view.ViewCompat.setAccessibilityLiveRegion(chip, z ? 2 : 0);
    }

    public void addOnRotateListener(com.google.android.material.timepicker.ClockHandView.OnRotateListener onRotateListener) {
        this.clockHandView.addOnRotateListener(onRotateListener);
    }

    public void setOnActionUpListener(com.google.android.material.timepicker.ClockHandView.OnActionUpListener onActionUpListener) {
        this.clockHandView.setOnActionUpListener(onActionUpListener);
    }

    void setOnPeriodChangeListener(com.google.android.material.timepicker.TimePickerView.OnPeriodChangeListener onPeriodChangeListener) {
        this.onPeriodChangeListener = onPeriodChangeListener;
    }

    void setOnSelectionChangeListener(com.google.android.material.timepicker.TimePickerView.OnSelectionChange onSelectionChange) {
        this.onSelectionChangeListener = onSelectionChange;
    }

    void setOnDoubleTapListener(com.google.android.material.timepicker.TimePickerView.OnDoubleTapListener onDoubleTapListener) {
        this.onDoubleTapListener = onDoubleTapListener;
    }

    public void showToggle() {
        this.toggle.setVisibility(0);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(android.view.View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            updateToggleConstraints();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        updateToggleConstraints();
    }

    private void updateToggleConstraints() {
        if (this.toggle.getVisibility() == 0) {
            androidx.constraintlayout.widget.ConstraintSet constraintSet = new androidx.constraintlayout.widget.ConstraintSet();
            constraintSet.clone(this);
            constraintSet.clear(com.google.android.material.R.id.material_clock_display, androidx.core.view.ViewCompat.getLayoutDirection(this) == 0 ? 2 : 1);
            constraintSet.applyTo(this);
        }
    }
}

package com.google.android.material.timepicker;

/* JADX INFO: loaded from: classes5.dex */
class TimePickerClockPresenter implements com.google.android.material.timepicker.ClockHandView.OnRotateListener, com.google.android.material.timepicker.TimePickerView.OnSelectionChange, com.google.android.material.timepicker.TimePickerView.OnPeriodChangeListener, com.google.android.material.timepicker.ClockHandView.OnActionUpListener, com.google.android.material.timepicker.TimePickerPresenter {
    private static final int DEGREES_PER_HOUR = 30;
    private static final int DEGREES_PER_MINUTE = 6;
    private boolean broadcasting = false;
    private float hourRotation;
    private float minuteRotation;
    private final com.google.android.material.timepicker.TimeModel time;
    private final com.google.android.material.timepicker.TimePickerView timePickerView;
    private static final java.lang.String[] HOUR_CLOCK_VALUES = {"12", "1", "2", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D, "4", "5", "6", com.json.Cdo.e, "8", "9", "10", "11"};
    private static final java.lang.String[] HOUR_CLOCK_24_VALUES = {"00", "2", "4", "6", "8", "10", "12", "14", "16", "18", "20", "22"};
    private static final java.lang.String[] MINUTE_CLOCK_VALUES = {"00", "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55"};

    public TimePickerClockPresenter(com.google.android.material.timepicker.TimePickerView timePickerView, com.google.android.material.timepicker.TimeModel timeModel) {
        this.timePickerView = timePickerView;
        this.time = timeModel;
        initialize();
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void initialize() {
        if (this.time.format == 0) {
            this.timePickerView.showToggle();
        }
        this.timePickerView.addOnRotateListener(this);
        this.timePickerView.setOnSelectionChangeListener(this);
        this.timePickerView.setOnPeriodChangeListener(this);
        this.timePickerView.setOnActionUpListener(this);
        updateValues();
        invalidate();
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void invalidate() {
        this.hourRotation = this.time.getHourForDisplay() * getDegreesPerHour();
        this.minuteRotation = this.time.minute * 6;
        setSelection(this.time.selection, false);
        updateTime();
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void show() {
        this.timePickerView.setVisibility(0);
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void hide() {
        this.timePickerView.setVisibility(8);
    }

    private java.lang.String[] getHourClockValues() {
        return this.time.format == 1 ? HOUR_CLOCK_24_VALUES : HOUR_CLOCK_VALUES;
    }

    private int getDegreesPerHour() {
        return this.time.format == 1 ? 15 : 30;
    }

    @Override // com.google.android.material.timepicker.ClockHandView.OnRotateListener
    public void onRotate(float f, boolean z) {
        if (this.broadcasting) {
            return;
        }
        int i = this.time.hour;
        int i2 = this.time.minute;
        int iRound = java.lang.Math.round(f);
        if (this.time.selection == 12) {
            this.time.setMinute((iRound + 3) / 6);
            this.minuteRotation = (float) java.lang.Math.floor(this.time.minute * 6);
        } else {
            this.time.setHour((iRound + (getDegreesPerHour() / 2)) / getDegreesPerHour());
            this.hourRotation = this.time.getHourForDisplay() * getDegreesPerHour();
        }
        if (z) {
            return;
        }
        updateTime();
        performHapticFeedback(i, i2);
    }

    private void performHapticFeedback(int i, int i2) {
        if (this.time.minute == i2 && this.time.hour == i) {
            return;
        }
        this.timePickerView.performHapticFeedback(4);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.OnSelectionChange
    public void onSelectionChanged(int i) {
        setSelection(i, true);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.OnPeriodChangeListener
    public void onPeriodChange(int i) {
        this.time.setPeriod(i);
    }

    void setSelection(int i, boolean z) {
        boolean z2 = i == 12;
        this.timePickerView.setAnimateOnTouchUp(z2);
        this.time.selection = i;
        this.timePickerView.setValues(z2 ? MINUTE_CLOCK_VALUES : getHourClockValues(), z2 ? com.google.android.material.R.string.material_minute_suffix : com.google.android.material.R.string.material_hour_suffix);
        this.timePickerView.setHandRotation(z2 ? this.minuteRotation : this.hourRotation, z);
        this.timePickerView.setActiveSelection(i);
        this.timePickerView.setMinuteHourDelegate(new com.google.android.material.timepicker.ClickActionDelegate(this.timePickerView.getContext(), com.google.android.material.R.string.material_hour_selection) { // from class: com.google.android.material.timepicker.TimePickerClockPresenter.1
            @Override // com.google.android.material.timepicker.ClickActionDelegate, androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(android.view.View view, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setContentDescription(view.getResources().getString(com.google.android.material.R.string.material_hour_suffix, java.lang.String.valueOf(com.google.android.material.timepicker.TimePickerClockPresenter.this.time.getHourForDisplay())));
            }
        });
        this.timePickerView.setHourClickDelegate(new com.google.android.material.timepicker.ClickActionDelegate(this.timePickerView.getContext(), com.google.android.material.R.string.material_minute_selection) { // from class: com.google.android.material.timepicker.TimePickerClockPresenter.2
            @Override // com.google.android.material.timepicker.ClickActionDelegate, androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(android.view.View view, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setContentDescription(view.getResources().getString(com.google.android.material.R.string.material_minute_suffix, java.lang.String.valueOf(com.google.android.material.timepicker.TimePickerClockPresenter.this.time.minute)));
            }
        });
    }

    @Override // com.google.android.material.timepicker.ClockHandView.OnActionUpListener
    public void onActionUp(float f, boolean z) {
        this.broadcasting = true;
        int i = this.time.minute;
        int i2 = this.time.hour;
        if (this.time.selection == 10) {
            this.timePickerView.setHandRotation(this.hourRotation, false);
            android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) androidx.core.content.ContextCompat.getSystemService(this.timePickerView.getContext(), android.view.accessibility.AccessibilityManager.class);
            if (!(accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled())) {
                setSelection(12, true);
            }
        } else {
            int iRound = java.lang.Math.round(f);
            if (!z) {
                this.time.setMinute(((iRound + 15) / 30) * 5);
                this.minuteRotation = this.time.minute * 6;
            }
            this.timePickerView.setHandRotation(this.minuteRotation, z);
        }
        this.broadcasting = false;
        updateTime();
        performHapticFeedback(i2, i);
    }

    private void updateTime() {
        this.timePickerView.updateTime(this.time.period, this.time.getHourForDisplay(), this.time.minute);
    }

    private void updateValues() {
        updateValues(HOUR_CLOCK_VALUES, com.google.android.material.timepicker.TimeModel.NUMBER_FORMAT);
        updateValues(HOUR_CLOCK_24_VALUES, com.google.android.material.timepicker.TimeModel.NUMBER_FORMAT);
        updateValues(MINUTE_CLOCK_VALUES, com.google.android.material.timepicker.TimeModel.ZERO_LEADING_NUMBER_FORMAT);
    }

    private void updateValues(java.lang.String[] strArr, java.lang.String str) {
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = com.google.android.material.timepicker.TimeModel.formatText(this.timePickerView.getResources(), strArr[i], str);
        }
    }
}

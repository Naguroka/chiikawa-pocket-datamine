package com.google.android.material.timepicker;

/* JADX INFO: loaded from: classes5.dex */
interface TimePickerControls {

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ActiveSelection {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ClockPeriod {
    }

    void setActiveSelection(int i);

    void setHandRotation(float f);

    void setValues(java.lang.String[] strArr, int i);

    void updateTime(int i, int i2, int i3);
}

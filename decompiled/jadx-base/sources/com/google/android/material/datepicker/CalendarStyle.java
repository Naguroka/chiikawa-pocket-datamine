package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes5.dex */
final class CalendarStyle {
    final com.google.android.material.datepicker.CalendarItemStyle day;
    final com.google.android.material.datepicker.CalendarItemStyle invalidDay;
    final android.graphics.Paint rangeFill;
    final com.google.android.material.datepicker.CalendarItemStyle selectedDay;
    final com.google.android.material.datepicker.CalendarItemStyle selectedYear;
    final com.google.android.material.datepicker.CalendarItemStyle todayDay;
    final com.google.android.material.datepicker.CalendarItemStyle todayYear;
    final com.google.android.material.datepicker.CalendarItemStyle year;

    CalendarStyle(android.content.Context context) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(com.google.android.material.resources.MaterialAttributes.resolveOrThrow(context, com.google.android.material.R.attr.materialCalendarStyle, com.google.android.material.datepicker.MaterialCalendar.class.getCanonicalName()), com.google.android.material.R.styleable.MaterialCalendar);
        this.day = com.google.android.material.datepicker.CalendarItemStyle.create(context, typedArrayObtainStyledAttributes.getResourceId(com.google.android.material.R.styleable.MaterialCalendar_dayStyle, 0));
        this.invalidDay = com.google.android.material.datepicker.CalendarItemStyle.create(context, typedArrayObtainStyledAttributes.getResourceId(com.google.android.material.R.styleable.MaterialCalendar_dayInvalidStyle, 0));
        this.selectedDay = com.google.android.material.datepicker.CalendarItemStyle.create(context, typedArrayObtainStyledAttributes.getResourceId(com.google.android.material.R.styleable.MaterialCalendar_daySelectedStyle, 0));
        this.todayDay = com.google.android.material.datepicker.CalendarItemStyle.create(context, typedArrayObtainStyledAttributes.getResourceId(com.google.android.material.R.styleable.MaterialCalendar_dayTodayStyle, 0));
        android.content.res.ColorStateList colorStateList = com.google.android.material.resources.MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.MaterialCalendar_rangeFillColor);
        this.year = com.google.android.material.datepicker.CalendarItemStyle.create(context, typedArrayObtainStyledAttributes.getResourceId(com.google.android.material.R.styleable.MaterialCalendar_yearStyle, 0));
        this.selectedYear = com.google.android.material.datepicker.CalendarItemStyle.create(context, typedArrayObtainStyledAttributes.getResourceId(com.google.android.material.R.styleable.MaterialCalendar_yearSelectedStyle, 0));
        this.todayYear = com.google.android.material.datepicker.CalendarItemStyle.create(context, typedArrayObtainStyledAttributes.getResourceId(com.google.android.material.R.styleable.MaterialCalendar_yearTodayStyle, 0));
        android.graphics.Paint paint = new android.graphics.Paint();
        this.rangeFill = paint;
        paint.setColor(colorStateList.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}

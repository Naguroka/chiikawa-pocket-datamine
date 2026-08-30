package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes5.dex */
abstract class DateFormatTextWatcher extends com.google.android.material.internal.TextWatcherAdapter {
    private static final int VALIDATION_DELAY = 1000;
    private final com.google.android.material.datepicker.CalendarConstraints constraints;
    private final java.text.DateFormat dateFormat;
    private final java.lang.String outOfRange;
    private final java.lang.Runnable setErrorCallback;
    private java.lang.Runnable setRangeErrorCallback;
    private final com.google.android.material.textfield.TextInputLayout textInputLayout;

    void onInvalidDate() {
    }

    abstract void onValidDate(java.lang.Long l);

    DateFormatTextWatcher(final java.lang.String str, java.text.DateFormat dateFormat, com.google.android.material.textfield.TextInputLayout textInputLayout, com.google.android.material.datepicker.CalendarConstraints calendarConstraints) {
        this.dateFormat = dateFormat;
        this.textInputLayout = textInputLayout;
        this.constraints = calendarConstraints;
        this.outOfRange = textInputLayout.getContext().getString(com.google.android.material.R.string.mtrl_picker_out_of_range);
        this.setErrorCallback = new java.lang.Runnable() { // from class: com.google.android.material.datepicker.DateFormatTextWatcher$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m773x5657fb8e(str);
            }
        };
    }

    /* JADX INFO: renamed from: lambda$new$0$com-google-android-material-datepicker-DateFormatTextWatcher, reason: not valid java name */
    /* synthetic */ void m773x5657fb8e(java.lang.String str) {
        com.google.android.material.textfield.TextInputLayout textInputLayout = this.textInputLayout;
        java.text.DateFormat dateFormat = this.dateFormat;
        android.content.Context context = textInputLayout.getContext();
        textInputLayout.setError(context.getString(com.google.android.material.R.string.mtrl_picker_invalid_format) + "\n" + java.lang.String.format(context.getString(com.google.android.material.R.string.mtrl_picker_invalid_format_use), sanitizeDateString(str)) + "\n" + java.lang.String.format(context.getString(com.google.android.material.R.string.mtrl_picker_invalid_format_example), sanitizeDateString(dateFormat.format(new java.util.Date(com.google.android.material.datepicker.UtcDates.getTodayCalendar().getTimeInMillis())))));
        onInvalidDate();
    }

    @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        this.textInputLayout.removeCallbacks(this.setErrorCallback);
        this.textInputLayout.removeCallbacks(this.setRangeErrorCallback);
        this.textInputLayout.setError(null);
        onValidDate(null);
        if (android.text.TextUtils.isEmpty(charSequence)) {
            return;
        }
        try {
            java.util.Date date = this.dateFormat.parse(charSequence.toString());
            this.textInputLayout.setError(null);
            long time = date.getTime();
            if (this.constraints.getDateValidator().isValid(time) && this.constraints.isWithinBounds(time)) {
                onValidDate(java.lang.Long.valueOf(date.getTime()));
                return;
            }
            java.lang.Runnable runnableCreateRangeErrorCallback = createRangeErrorCallback(time);
            this.setRangeErrorCallback = runnableCreateRangeErrorCallback;
            runValidation(this.textInputLayout, runnableCreateRangeErrorCallback);
        } catch (java.text.ParseException unused) {
            runValidation(this.textInputLayout, this.setErrorCallback);
        }
    }

    private java.lang.Runnable createRangeErrorCallback(final long j) {
        return new java.lang.Runnable() { // from class: com.google.android.material.datepicker.DateFormatTextWatcher$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m772x14d77527(j);
            }
        };
    }

    /* JADX INFO: renamed from: lambda$createRangeErrorCallback$1$com-google-android-material-datepicker-DateFormatTextWatcher, reason: not valid java name */
    /* synthetic */ void m772x14d77527(long j) {
        this.textInputLayout.setError(java.lang.String.format(this.outOfRange, sanitizeDateString(com.google.android.material.datepicker.DateStrings.getDateString(j))));
        onInvalidDate();
    }

    private java.lang.String sanitizeDateString(java.lang.String str) {
        return str.replace(' ', kotlin.text.Typography.nbsp);
    }

    public void runValidation(android.view.View view, java.lang.Runnable runnable) {
        view.postDelayed(runnable, 1000L);
    }
}

package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes5.dex */
class UtcDates {
    static final java.lang.String UTC = "UTC";
    static java.util.concurrent.atomic.AtomicReference<com.google.android.material.datepicker.TimeSource> timeSourceRef = new java.util.concurrent.atomic.AtomicReference<>();

    static void setTimeSource(com.google.android.material.datepicker.TimeSource timeSource) {
        timeSourceRef.set(timeSource);
    }

    static com.google.android.material.datepicker.TimeSource getTimeSource() {
        com.google.android.material.datepicker.TimeSource timeSource = timeSourceRef.get();
        return timeSource == null ? com.google.android.material.datepicker.TimeSource.system() : timeSource;
    }

    private UtcDates() {
    }

    private static java.util.TimeZone getTimeZone() {
        return java.util.TimeZone.getTimeZone(UTC);
    }

    private static android.icu.util.TimeZone getUtcAndroidTimeZone() {
        return android.icu.util.TimeZone.getTimeZone(UTC);
    }

    static java.util.Calendar getTodayCalendar() {
        java.util.Calendar calendarNow = getTimeSource().now();
        calendarNow.set(11, 0);
        calendarNow.set(12, 0);
        calendarNow.set(13, 0);
        calendarNow.set(14, 0);
        calendarNow.setTimeZone(getTimeZone());
        return calendarNow;
    }

    static java.util.Calendar getUtcCalendar() {
        return getUtcCalendarOf(null);
    }

    static java.util.Calendar getUtcCalendarOf(java.util.Calendar calendar) {
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(getTimeZone());
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }

    static java.util.Calendar getDayCopy(java.util.Calendar calendar) {
        java.util.Calendar utcCalendarOf = getUtcCalendarOf(calendar);
        java.util.Calendar utcCalendar = getUtcCalendar();
        utcCalendar.set(utcCalendarOf.get(1), utcCalendarOf.get(2), utcCalendarOf.get(5));
        return utcCalendar;
    }

    static long canonicalYearMonthDay(long j) {
        java.util.Calendar utcCalendar = getUtcCalendar();
        utcCalendar.setTimeInMillis(j);
        return getDayCopy(utcCalendar).getTimeInMillis();
    }

    private static android.icu.text.DateFormat getAndroidFormat(java.lang.String str, java.util.Locale locale) {
        android.icu.text.DateFormat instanceForSkeleton = android.icu.text.DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(getUtcAndroidTimeZone());
        return instanceForSkeleton;
    }

    private static java.text.DateFormat getFormat(int i, java.util.Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i, locale);
        dateInstance.setTimeZone(getTimeZone());
        return dateInstance;
    }

    static java.text.SimpleDateFormat getTextInputFormat() {
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(((java.text.SimpleDateFormat) java.text.DateFormat.getDateInstance(3, java.util.Locale.getDefault())).toPattern().replaceAll("\\s+", ""), java.util.Locale.getDefault());
        simpleDateFormat.setTimeZone(getTimeZone());
        simpleDateFormat.setLenient(false);
        return simpleDateFormat;
    }

    static java.lang.String getTextInputHint(android.content.res.Resources resources, java.text.SimpleDateFormat simpleDateFormat) {
        java.lang.String pattern = simpleDateFormat.toPattern();
        java.lang.String string = resources.getString(com.google.android.material.R.string.mtrl_picker_text_input_year_abbr);
        java.lang.String string2 = resources.getString(com.google.android.material.R.string.mtrl_picker_text_input_month_abbr);
        java.lang.String string3 = resources.getString(com.google.android.material.R.string.mtrl_picker_text_input_day_abbr);
        if (pattern.replaceAll("[^y]", "").length() == 1) {
            pattern = pattern.replace("y", "yyyy");
        }
        return pattern.replace("d", string3).replace("M", string2).replace("y", string);
    }

    static java.text.SimpleDateFormat getSimpleFormat(java.lang.String str) {
        return getSimpleFormat(str, java.util.Locale.getDefault());
    }

    private static java.text.SimpleDateFormat getSimpleFormat(java.lang.String str, java.util.Locale locale) {
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(getTimeZone());
        return simpleDateFormat;
    }

    static android.icu.text.DateFormat getYearAbbrMonthDayFormat(java.util.Locale locale) {
        return getAndroidFormat("yMMMd", locale);
    }

    static android.icu.text.DateFormat getAbbrMonthDayFormat(java.util.Locale locale) {
        return getAndroidFormat("MMMd", locale);
    }

    static android.icu.text.DateFormat getAbbrMonthWeekdayDayFormat(java.util.Locale locale) {
        return getAndroidFormat("MMMEd", locale);
    }

    static android.icu.text.DateFormat getYearAbbrMonthWeekdayDayFormat(java.util.Locale locale) {
        return getAndroidFormat("yMMMEd", locale);
    }

    static java.text.DateFormat getMediumFormat() {
        return getMediumFormat(java.util.Locale.getDefault());
    }

    static java.text.DateFormat getMediumFormat(java.util.Locale locale) {
        return getFormat(2, locale);
    }

    static java.text.DateFormat getMediumNoYear() {
        return getMediumNoYear(java.util.Locale.getDefault());
    }

    static java.text.DateFormat getMediumNoYear(java.util.Locale locale) {
        java.text.SimpleDateFormat simpleDateFormat = (java.text.SimpleDateFormat) getMediumFormat(locale);
        simpleDateFormat.applyPattern(removeYearFromDateFormatPattern(simpleDateFormat.toPattern()));
        return simpleDateFormat;
    }

    static java.text.DateFormat getFullFormat() {
        return getFullFormat(java.util.Locale.getDefault());
    }

    static java.text.DateFormat getFullFormat(java.util.Locale locale) {
        return getFormat(0, locale);
    }

    private static java.lang.String removeYearFromDateFormatPattern(java.lang.String str) {
        int iFindCharactersInDateFormatPattern = findCharactersInDateFormatPattern(str, "yY", 1, 0);
        if (iFindCharactersInDateFormatPattern >= str.length()) {
            return str;
        }
        int iFindCharactersInDateFormatPattern2 = findCharactersInDateFormatPattern(str, "EMd", 1, iFindCharactersInDateFormatPattern);
        return str.replace(str.substring(findCharactersInDateFormatPattern(str, iFindCharactersInDateFormatPattern2 < str.length() ? "EMd," : "EMd", -1, iFindCharactersInDateFormatPattern) + 1, iFindCharactersInDateFormatPattern2), " ").trim();
    }

    private static int findCharactersInDateFormatPattern(java.lang.String str, java.lang.String str2, int i, int i2) {
        while (i2 >= 0 && i2 < str.length() && str2.indexOf(str.charAt(i2)) == -1) {
            if (str.charAt(i2) == '\'') {
                do {
                    i2 += i;
                    if (i2 < 0 || i2 >= str.length()) {
                        break;
                    }
                } while (str.charAt(i2) != '\'');
            }
            i2 += i;
        }
        return i2;
    }
}

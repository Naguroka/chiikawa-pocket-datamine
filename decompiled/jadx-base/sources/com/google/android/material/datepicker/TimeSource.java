package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes5.dex */
class TimeSource {
    private static final com.google.android.material.datepicker.TimeSource SYSTEM_TIME_SOURCE = new com.google.android.material.datepicker.TimeSource(null, null);
    private final java.lang.Long fixedTimeMs;
    private final java.util.TimeZone fixedTimeZone;

    private TimeSource(java.lang.Long l, java.util.TimeZone timeZone) {
        this.fixedTimeMs = l;
        this.fixedTimeZone = timeZone;
    }

    static com.google.android.material.datepicker.TimeSource system() {
        return SYSTEM_TIME_SOURCE;
    }

    static com.google.android.material.datepicker.TimeSource fixed(long j, java.util.TimeZone timeZone) {
        return new com.google.android.material.datepicker.TimeSource(java.lang.Long.valueOf(j), timeZone);
    }

    static com.google.android.material.datepicker.TimeSource fixed(long j) {
        return new com.google.android.material.datepicker.TimeSource(java.lang.Long.valueOf(j), null);
    }

    java.util.Calendar now() {
        return now(this.fixedTimeZone);
    }

    java.util.Calendar now(java.util.TimeZone timeZone) {
        java.util.Calendar calendar = timeZone == null ? java.util.Calendar.getInstance() : java.util.Calendar.getInstance(timeZone);
        java.lang.Long l = this.fixedTimeMs;
        if (l != null) {
            calendar.setTimeInMillis(l.longValue());
        }
        return calendar;
    }
}

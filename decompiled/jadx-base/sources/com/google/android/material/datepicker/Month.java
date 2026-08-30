package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes5.dex */
final class Month implements java.lang.Comparable<com.google.android.material.datepicker.Month>, android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.material.datepicker.Month> CREATOR = new android.os.Parcelable.Creator<com.google.android.material.datepicker.Month>() { // from class: com.google.android.material.datepicker.Month.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.google.android.material.datepicker.Month createFromParcel(android.os.Parcel parcel) {
            return com.google.android.material.datepicker.Month.create(parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.google.android.material.datepicker.Month[] newArray(int i) {
            return new com.google.android.material.datepicker.Month[i];
        }
    };
    final int daysInMonth;
    final int daysInWeek;
    private final java.util.Calendar firstOfMonth;
    private java.lang.String longName;
    final int month;
    final long timeInMillis;
    final int year;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private Month(java.util.Calendar calendar) {
        calendar.set(5, 1);
        java.util.Calendar dayCopy = com.google.android.material.datepicker.UtcDates.getDayCopy(calendar);
        this.firstOfMonth = dayCopy;
        this.month = dayCopy.get(2);
        this.year = dayCopy.get(1);
        this.daysInWeek = dayCopy.getMaximum(7);
        this.daysInMonth = dayCopy.getActualMaximum(5);
        this.timeInMillis = dayCopy.getTimeInMillis();
    }

    static com.google.android.material.datepicker.Month create(long j) {
        java.util.Calendar utcCalendar = com.google.android.material.datepicker.UtcDates.getUtcCalendar();
        utcCalendar.setTimeInMillis(j);
        return new com.google.android.material.datepicker.Month(utcCalendar);
    }

    static com.google.android.material.datepicker.Month create(int i, int i2) {
        java.util.Calendar utcCalendar = com.google.android.material.datepicker.UtcDates.getUtcCalendar();
        utcCalendar.set(1, i);
        utcCalendar.set(2, i2);
        return new com.google.android.material.datepicker.Month(utcCalendar);
    }

    static com.google.android.material.datepicker.Month current() {
        return new com.google.android.material.datepicker.Month(com.google.android.material.datepicker.UtcDates.getTodayCalendar());
    }

    int daysFromStartOfWeekToFirstOfMonth(int i) {
        int i2 = this.firstOfMonth.get(7);
        if (i <= 0) {
            i = this.firstOfMonth.getFirstDayOfWeek();
        }
        int i3 = i2 - i;
        return i3 < 0 ? i3 + this.daysInWeek : i3;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.material.datepicker.Month)) {
            return false;
        }
        com.google.android.material.datepicker.Month month = (com.google.android.material.datepicker.Month) obj;
        return this.month == month.month && this.year == month.year;
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Integer.valueOf(this.month), java.lang.Integer.valueOf(this.year)});
    }

    @Override // java.lang.Comparable
    public int compareTo(com.google.android.material.datepicker.Month month) {
        return this.firstOfMonth.compareTo(month.firstOfMonth);
    }

    int monthsUntil(com.google.android.material.datepicker.Month month) {
        if (this.firstOfMonth instanceof java.util.GregorianCalendar) {
            return ((month.year - this.year) * 12) + (month.month - this.month);
        }
        throw new java.lang.IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    long getStableId() {
        return this.firstOfMonth.getTimeInMillis();
    }

    long getDay(int i) {
        java.util.Calendar dayCopy = com.google.android.material.datepicker.UtcDates.getDayCopy(this.firstOfMonth);
        dayCopy.set(5, i);
        return dayCopy.getTimeInMillis();
    }

    int getDayOfMonth(long j) {
        java.util.Calendar dayCopy = com.google.android.material.datepicker.UtcDates.getDayCopy(this.firstOfMonth);
        dayCopy.setTimeInMillis(j);
        return dayCopy.get(5);
    }

    com.google.android.material.datepicker.Month monthsLater(int i) {
        java.util.Calendar dayCopy = com.google.android.material.datepicker.UtcDates.getDayCopy(this.firstOfMonth);
        dayCopy.add(2, i);
        return new com.google.android.material.datepicker.Month(dayCopy);
    }

    java.lang.String getLongName() {
        if (this.longName == null) {
            this.longName = com.google.android.material.datepicker.DateStrings.getYearMonth(this.firstOfMonth.getTimeInMillis());
        }
        return this.longName;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.year);
        parcel.writeInt(this.month);
    }
}

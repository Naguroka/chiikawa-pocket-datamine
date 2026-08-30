package com.google.android.material.timepicker;

/* JADX INFO: loaded from: classes5.dex */
class TimeModel implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.material.timepicker.TimeModel> CREATOR = new android.os.Parcelable.Creator<com.google.android.material.timepicker.TimeModel>() { // from class: com.google.android.material.timepicker.TimeModel.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.google.android.material.timepicker.TimeModel createFromParcel(android.os.Parcel parcel) {
            return new com.google.android.material.timepicker.TimeModel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.google.android.material.timepicker.TimeModel[] newArray(int i) {
            return new com.google.android.material.timepicker.TimeModel[i];
        }
    };
    public static final java.lang.String NUMBER_FORMAT = "%d";
    public static final java.lang.String ZERO_LEADING_NUMBER_FORMAT = "%02d";
    final int format;
    int hour;
    private final com.google.android.material.timepicker.MaxInputValidator hourInputValidator;
    int minute;
    private final com.google.android.material.timepicker.MaxInputValidator minuteInputValidator;
    int period;
    int selection;

    private static int getPeriod(int i) {
        return i >= 12 ? 1 : 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public TimeModel() {
        this(0);
    }

    public TimeModel(int i) {
        this(0, 0, 10, i);
    }

    public TimeModel(int i, int i2, int i3, int i4) {
        this.hour = i;
        this.minute = i2;
        this.selection = i3;
        this.format = i4;
        this.period = getPeriod(i);
        this.minuteInputValidator = new com.google.android.material.timepicker.MaxInputValidator(59);
        this.hourInputValidator = new com.google.android.material.timepicker.MaxInputValidator(i4 == 1 ? 24 : 12);
    }

    protected TimeModel(android.os.Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }

    public void setHourOfDay(int i) {
        this.period = getPeriod(i);
        this.hour = i;
    }

    public void setHour(int i) {
        if (this.format == 1) {
            this.hour = i;
        } else {
            this.hour = (i % 12) + (this.period != 1 ? 0 : 12);
        }
    }

    public void setMinute(int i) {
        this.minute = i % 60;
    }

    public int getHourForDisplay() {
        if (this.format == 1) {
            return this.hour % 24;
        }
        int i = this.hour;
        if (i % 12 == 0) {
            return 12;
        }
        return this.period == 1 ? i - 12 : i;
    }

    public com.google.android.material.timepicker.MaxInputValidator getMinuteInputValidator() {
        return this.minuteInputValidator;
    }

    public com.google.android.material.timepicker.MaxInputValidator getHourInputValidator() {
        return this.hourInputValidator;
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Integer.valueOf(this.format), java.lang.Integer.valueOf(this.hour), java.lang.Integer.valueOf(this.minute), java.lang.Integer.valueOf(this.selection)});
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.material.timepicker.TimeModel)) {
            return false;
        }
        com.google.android.material.timepicker.TimeModel timeModel = (com.google.android.material.timepicker.TimeModel) obj;
        return this.hour == timeModel.hour && this.minute == timeModel.minute && this.format == timeModel.format && this.selection == timeModel.selection;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.hour);
        parcel.writeInt(this.minute);
        parcel.writeInt(this.selection);
        parcel.writeInt(this.format);
    }

    public void setPeriod(int i) {
        if (i != this.period) {
            this.period = i;
            int i2 = this.hour;
            if (i2 < 12 && i == 1) {
                this.hour = i2 + 12;
            } else {
                if (i2 < 12 || i != 0) {
                    return;
                }
                this.hour = i2 - 12;
            }
        }
    }

    public static java.lang.String formatText(android.content.res.Resources resources, java.lang.CharSequence charSequence) {
        return formatText(resources, charSequence, ZERO_LEADING_NUMBER_FORMAT);
    }

    public static java.lang.String formatText(android.content.res.Resources resources, java.lang.CharSequence charSequence, java.lang.String str) {
        return java.lang.String.format(resources.getConfiguration().locale, str, java.lang.Integer.valueOf(java.lang.Integer.parseInt(java.lang.String.valueOf(charSequence))));
    }
}

package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes5.dex */
public class DateValidatorPointBackward implements com.google.android.material.datepicker.CalendarConstraints.DateValidator {
    public static final android.os.Parcelable.Creator<com.google.android.material.datepicker.DateValidatorPointBackward> CREATOR = new android.os.Parcelable.Creator<com.google.android.material.datepicker.DateValidatorPointBackward>() { // from class: com.google.android.material.datepicker.DateValidatorPointBackward.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.google.android.material.datepicker.DateValidatorPointBackward createFromParcel(android.os.Parcel parcel) {
            return new com.google.android.material.datepicker.DateValidatorPointBackward(parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.google.android.material.datepicker.DateValidatorPointBackward[] newArray(int i) {
            return new com.google.android.material.datepicker.DateValidatorPointBackward[i];
        }
    };
    private final long point;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private DateValidatorPointBackward(long j) {
        this.point = j;
    }

    public static com.google.android.material.datepicker.DateValidatorPointBackward before(long j) {
        return new com.google.android.material.datepicker.DateValidatorPointBackward(j);
    }

    public static com.google.android.material.datepicker.DateValidatorPointBackward now() {
        return before(com.google.android.material.datepicker.UtcDates.getTodayCalendar().getTimeInMillis());
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public boolean isValid(long j) {
        return j <= this.point;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeLong(this.point);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.google.android.material.datepicker.DateValidatorPointBackward) && this.point == ((com.google.android.material.datepicker.DateValidatorPointBackward) obj).point;
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Long.valueOf(this.point)});
    }
}

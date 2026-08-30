package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes5.dex */
public final class CompositeDateValidator implements com.google.android.material.datepicker.CalendarConstraints.DateValidator {
    private static final int COMPARATOR_ALL_ID = 2;
    private static final int COMPARATOR_ANY_ID = 1;
    private final com.google.android.material.datepicker.CompositeDateValidator.Operator operator;
    private final java.util.List<com.google.android.material.datepicker.CalendarConstraints.DateValidator> validators;
    private static final com.google.android.material.datepicker.CompositeDateValidator.Operator ANY_OPERATOR = new com.google.android.material.datepicker.CompositeDateValidator.Operator() { // from class: com.google.android.material.datepicker.CompositeDateValidator.1
        @Override // com.google.android.material.datepicker.CompositeDateValidator.Operator
        public int getId() {
            return 1;
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.Operator
        public boolean isValid(java.util.List<com.google.android.material.datepicker.CalendarConstraints.DateValidator> list, long j) {
            for (com.google.android.material.datepicker.CalendarConstraints.DateValidator dateValidator : list) {
                if (dateValidator != null && dateValidator.isValid(j)) {
                    return true;
                }
            }
            return false;
        }
    };
    private static final com.google.android.material.datepicker.CompositeDateValidator.Operator ALL_OPERATOR = new com.google.android.material.datepicker.CompositeDateValidator.Operator() { // from class: com.google.android.material.datepicker.CompositeDateValidator.2
        @Override // com.google.android.material.datepicker.CompositeDateValidator.Operator
        public int getId() {
            return 2;
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.Operator
        public boolean isValid(java.util.List<com.google.android.material.datepicker.CalendarConstraints.DateValidator> list, long j) {
            for (com.google.android.material.datepicker.CalendarConstraints.DateValidator dateValidator : list) {
                if (dateValidator != null && !dateValidator.isValid(j)) {
                    return false;
                }
            }
            return true;
        }
    };
    public static final android.os.Parcelable.Creator<com.google.android.material.datepicker.CompositeDateValidator> CREATOR = new android.os.Parcelable.Creator<com.google.android.material.datepicker.CompositeDateValidator>() { // from class: com.google.android.material.datepicker.CompositeDateValidator.3
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.google.android.material.datepicker.CompositeDateValidator createFromParcel(android.os.Parcel parcel) {
            java.util.ArrayList arrayList = parcel.readArrayList(com.google.android.material.datepicker.CalendarConstraints.DateValidator.class.getClassLoader());
            int i = parcel.readInt();
            com.google.android.material.datepicker.CompositeDateValidator.Operator operator = (i != 2 && i == 1) ? com.google.android.material.datepicker.CompositeDateValidator.ANY_OPERATOR : com.google.android.material.datepicker.CompositeDateValidator.ALL_OPERATOR;
            return new com.google.android.material.datepicker.CompositeDateValidator((java.util.List) androidx.core.util.Preconditions.checkNotNull(arrayList), operator);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.google.android.material.datepicker.CompositeDateValidator[] newArray(int i) {
            return new com.google.android.material.datepicker.CompositeDateValidator[i];
        }
    };

    private interface Operator {
        int getId();

        boolean isValid(java.util.List<com.google.android.material.datepicker.CalendarConstraints.DateValidator> list, long j);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CompositeDateValidator(java.util.List<com.google.android.material.datepicker.CalendarConstraints.DateValidator> list, com.google.android.material.datepicker.CompositeDateValidator.Operator operator) {
        this.validators = list;
        this.operator = operator;
    }

    public static com.google.android.material.datepicker.CalendarConstraints.DateValidator allOf(java.util.List<com.google.android.material.datepicker.CalendarConstraints.DateValidator> list) {
        return new com.google.android.material.datepicker.CompositeDateValidator(list, ALL_OPERATOR);
    }

    public static com.google.android.material.datepicker.CalendarConstraints.DateValidator anyOf(java.util.List<com.google.android.material.datepicker.CalendarConstraints.DateValidator> list) {
        return new com.google.android.material.datepicker.CompositeDateValidator(list, ANY_OPERATOR);
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public boolean isValid(long j) {
        return this.operator.isValid(this.validators, j);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeList(this.validators);
        parcel.writeInt(this.operator.getId());
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.material.datepicker.CompositeDateValidator)) {
            return false;
        }
        com.google.android.material.datepicker.CompositeDateValidator compositeDateValidator = (com.google.android.material.datepicker.CompositeDateValidator) obj;
        return this.validators.equals(compositeDateValidator.validators) && this.operator.getId() == compositeDateValidator.operator.getId();
    }

    public int hashCode() {
        return this.validators.hashCode();
    }
}

package androidx.preference;

/* JADX INFO: loaded from: classes3.dex */
public class MultiSelectListPreference extends androidx.preference.DialogPreference {
    private java.lang.CharSequence[] mEntries;
    private java.lang.CharSequence[] mEntryValues;
    private java.util.Set<java.lang.String> mValues;

    public MultiSelectListPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mValues = new java.util.HashSet();
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.preference.R.styleable.MultiSelectListPreference, i, i2);
        this.mEntries = androidx.core.content.res.TypedArrayUtils.getTextArray(typedArrayObtainStyledAttributes, androidx.preference.R.styleable.MultiSelectListPreference_entries, androidx.preference.R.styleable.MultiSelectListPreference_android_entries);
        this.mEntryValues = androidx.core.content.res.TypedArrayUtils.getTextArray(typedArrayObtainStyledAttributes, androidx.preference.R.styleable.MultiSelectListPreference_entryValues, androidx.preference.R.styleable.MultiSelectListPreference_android_entryValues);
        typedArrayObtainStyledAttributes.recycle();
    }

    public MultiSelectListPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MultiSelectListPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, androidx.core.content.res.TypedArrayUtils.getAttr(context, androidx.preference.R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }

    public MultiSelectListPreference(android.content.Context context) {
        this(context, null);
    }

    public void setEntries(java.lang.CharSequence[] charSequenceArr) {
        this.mEntries = charSequenceArr;
    }

    public void setEntries(int i) {
        setEntries(getContext().getResources().getTextArray(i));
    }

    public java.lang.CharSequence[] getEntries() {
        return this.mEntries;
    }

    public void setEntryValues(java.lang.CharSequence[] charSequenceArr) {
        this.mEntryValues = charSequenceArr;
    }

    public void setEntryValues(int i) {
        setEntryValues(getContext().getResources().getTextArray(i));
    }

    public java.lang.CharSequence[] getEntryValues() {
        return this.mEntryValues;
    }

    public void setValues(java.util.Set<java.lang.String> set) {
        this.mValues.clear();
        this.mValues.addAll(set);
        persistStringSet(set);
        notifyChanged();
    }

    public java.util.Set<java.lang.String> getValues() {
        return this.mValues;
    }

    public int findIndexOfValue(java.lang.String str) {
        java.lang.CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.mEntryValues) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (android.text.TextUtils.equals(this.mEntryValues[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    protected boolean[] getSelectedItems() {
        java.lang.CharSequence[] charSequenceArr = this.mEntryValues;
        int length = charSequenceArr.length;
        java.util.Set<java.lang.String> set = this.mValues;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = set.contains(charSequenceArr[i].toString());
        }
        return zArr;
    }

    @Override // androidx.preference.Preference
    protected java.lang.Object onGetDefaultValue(android.content.res.TypedArray typedArray, int i) {
        java.lang.CharSequence[] textArray = typedArray.getTextArray(i);
        java.util.HashSet hashSet = new java.util.HashSet();
        for (java.lang.CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    @Override // androidx.preference.Preference
    protected void onSetInitialValue(java.lang.Object obj) {
        setValues(getPersistedStringSet((java.util.Set) obj));
    }

    @Override // androidx.preference.Preference
    protected android.os.Parcelable onSaveInstanceState() {
        android.os.Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (isPersistent()) {
            return parcelableOnSaveInstanceState;
        }
        androidx.preference.MultiSelectListPreference.SavedState savedState = new androidx.preference.MultiSelectListPreference.SavedState(parcelableOnSaveInstanceState);
        savedState.mValues = getValues();
        return savedState;
    }

    @Override // androidx.preference.Preference
    protected void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(androidx.preference.MultiSelectListPreference.SavedState.class)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        androidx.preference.MultiSelectListPreference.SavedState savedState = (androidx.preference.MultiSelectListPreference.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setValues(savedState.mValues);
    }

    private static class SavedState extends androidx.preference.Preference.BaseSavedState {
        public static final android.os.Parcelable.Creator<androidx.preference.MultiSelectListPreference.SavedState> CREATOR = new android.os.Parcelable.Creator<androidx.preference.MultiSelectListPreference.SavedState>() { // from class: androidx.preference.MultiSelectListPreference.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public androidx.preference.MultiSelectListPreference.SavedState createFromParcel(android.os.Parcel parcel) {
                return new androidx.preference.MultiSelectListPreference.SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public androidx.preference.MultiSelectListPreference.SavedState[] newArray(int i) {
                return new androidx.preference.MultiSelectListPreference.SavedState[i];
            }
        };
        java.util.Set<java.lang.String> mValues;

        SavedState(android.os.Parcel parcel) {
            super(parcel);
            int i = parcel.readInt();
            this.mValues = new java.util.HashSet();
            java.lang.String[] strArr = new java.lang.String[i];
            parcel.readStringArray(strArr);
            java.util.Collections.addAll(this.mValues, strArr);
        }

        SavedState(android.os.Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.mValues.size());
            java.util.Set<java.lang.String> set = this.mValues;
            parcel.writeStringArray((java.lang.String[]) set.toArray(new java.lang.String[set.size()]));
        }
    }
}

package androidx.preference;

/* JADX INFO: loaded from: classes3.dex */
public class ListPreference extends androidx.preference.DialogPreference {
    private static final java.lang.String TAG = "ListPreference";
    private java.lang.CharSequence[] mEntries;
    private java.lang.CharSequence[] mEntryValues;
    private java.lang.String mSummary;
    private java.lang.String mValue;
    private boolean mValueSet;

    public ListPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.preference.R.styleable.ListPreference, i, i2);
        this.mEntries = androidx.core.content.res.TypedArrayUtils.getTextArray(typedArrayObtainStyledAttributes, androidx.preference.R.styleable.ListPreference_entries, androidx.preference.R.styleable.ListPreference_android_entries);
        this.mEntryValues = androidx.core.content.res.TypedArrayUtils.getTextArray(typedArrayObtainStyledAttributes, androidx.preference.R.styleable.ListPreference_entryValues, androidx.preference.R.styleable.ListPreference_android_entryValues);
        if (androidx.core.content.res.TypedArrayUtils.getBoolean(typedArrayObtainStyledAttributes, androidx.preference.R.styleable.ListPreference_useSimpleSummaryProvider, androidx.preference.R.styleable.ListPreference_useSimpleSummaryProvider, false)) {
            setSummaryProvider(androidx.preference.ListPreference.SimpleSummaryProvider.getInstance());
        }
        typedArrayObtainStyledAttributes.recycle();
        android.content.res.TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, androidx.preference.R.styleable.Preference, i, i2);
        this.mSummary = androidx.core.content.res.TypedArrayUtils.getString(typedArrayObtainStyledAttributes2, androidx.preference.R.styleable.Preference_summary, androidx.preference.R.styleable.Preference_android_summary);
        typedArrayObtainStyledAttributes2.recycle();
    }

    public ListPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ListPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, androidx.core.content.res.TypedArrayUtils.getAttr(context, androidx.preference.R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }

    public ListPreference(android.content.Context context) {
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

    @Override // androidx.preference.Preference
    public void setSummary(java.lang.CharSequence charSequence) {
        super.setSummary(charSequence);
        if (charSequence == null) {
            this.mSummary = null;
        } else {
            this.mSummary = charSequence.toString();
        }
    }

    @Override // androidx.preference.Preference
    public java.lang.CharSequence getSummary() {
        if (getSummaryProvider() != null) {
            return getSummaryProvider().provideSummary(this);
        }
        java.lang.CharSequence entry = getEntry();
        java.lang.CharSequence summary = super.getSummary();
        java.lang.String str = this.mSummary;
        if (str == null) {
            return summary;
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        if (entry == null) {
            entry = "";
        }
        objArr[0] = entry;
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (android.text.TextUtils.equals(str2, summary)) {
            return summary;
        }
        android.util.Log.w(TAG, "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return str2;
    }

    public void setValue(java.lang.String str) {
        boolean z = !android.text.TextUtils.equals(this.mValue, str);
        if (z || !this.mValueSet) {
            this.mValue = str;
            this.mValueSet = true;
            persistString(str);
            if (z) {
                notifyChanged();
            }
        }
    }

    public java.lang.String getValue() {
        return this.mValue;
    }

    public java.lang.CharSequence getEntry() {
        java.lang.CharSequence[] charSequenceArr;
        int valueIndex = getValueIndex();
        if (valueIndex < 0 || (charSequenceArr = this.mEntries) == null) {
            return null;
        }
        return charSequenceArr[valueIndex];
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

    public void setValueIndex(int i) {
        java.lang.CharSequence[] charSequenceArr = this.mEntryValues;
        if (charSequenceArr != null) {
            setValue(charSequenceArr[i].toString());
        }
    }

    private int getValueIndex() {
        return findIndexOfValue(this.mValue);
    }

    @Override // androidx.preference.Preference
    protected java.lang.Object onGetDefaultValue(android.content.res.TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // androidx.preference.Preference
    protected void onSetInitialValue(java.lang.Object obj) {
        setValue(getPersistedString((java.lang.String) obj));
    }

    @Override // androidx.preference.Preference
    protected android.os.Parcelable onSaveInstanceState() {
        android.os.Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (isPersistent()) {
            return parcelableOnSaveInstanceState;
        }
        androidx.preference.ListPreference.SavedState savedState = new androidx.preference.ListPreference.SavedState(parcelableOnSaveInstanceState);
        savedState.mValue = getValue();
        return savedState;
    }

    @Override // androidx.preference.Preference
    protected void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(androidx.preference.ListPreference.SavedState.class)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        androidx.preference.ListPreference.SavedState savedState = (androidx.preference.ListPreference.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setValue(savedState.mValue);
    }

    private static class SavedState extends androidx.preference.Preference.BaseSavedState {
        public static final android.os.Parcelable.Creator<androidx.preference.ListPreference.SavedState> CREATOR = new android.os.Parcelable.Creator<androidx.preference.ListPreference.SavedState>() { // from class: androidx.preference.ListPreference.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public androidx.preference.ListPreference.SavedState createFromParcel(android.os.Parcel parcel) {
                return new androidx.preference.ListPreference.SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public androidx.preference.ListPreference.SavedState[] newArray(int i) {
                return new androidx.preference.ListPreference.SavedState[i];
            }
        };
        java.lang.String mValue;

        SavedState(android.os.Parcel parcel) {
            super(parcel);
            this.mValue = parcel.readString();
        }

        SavedState(android.os.Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.mValue);
        }
    }

    public static final class SimpleSummaryProvider implements androidx.preference.Preference.SummaryProvider<androidx.preference.ListPreference> {
        private static androidx.preference.ListPreference.SimpleSummaryProvider sSimpleSummaryProvider;

        private SimpleSummaryProvider() {
        }

        public static androidx.preference.ListPreference.SimpleSummaryProvider getInstance() {
            if (sSimpleSummaryProvider == null) {
                sSimpleSummaryProvider = new androidx.preference.ListPreference.SimpleSummaryProvider();
            }
            return sSimpleSummaryProvider;
        }

        @Override // androidx.preference.Preference.SummaryProvider
        public java.lang.CharSequence provideSummary(androidx.preference.ListPreference listPreference) {
            if (android.text.TextUtils.isEmpty(listPreference.getEntry())) {
                return listPreference.getContext().getString(androidx.preference.R.string.not_set);
            }
            return listPreference.getEntry();
        }
    }
}

package androidx.preference;

/* JADX INFO: loaded from: classes3.dex */
public abstract class TwoStatePreference extends androidx.preference.Preference {
    protected boolean mChecked;
    private boolean mCheckedSet;
    private boolean mDisableDependentsState;
    private java.lang.CharSequence mSummaryOff;
    private java.lang.CharSequence mSummaryOn;

    public TwoStatePreference(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public TwoStatePreference(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public TwoStatePreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TwoStatePreference(android.content.Context context) {
        this(context, null);
    }

    @Override // androidx.preference.Preference
    protected void onClick() {
        super.onClick();
        boolean z = !isChecked();
        if (callChangeListener(java.lang.Boolean.valueOf(z))) {
            setChecked(z);
        }
    }

    public boolean isChecked() {
        return this.mChecked;
    }

    public void setChecked(boolean z) {
        boolean z2 = this.mChecked != z;
        if (z2 || !this.mCheckedSet) {
            this.mChecked = z;
            this.mCheckedSet = true;
            persistBoolean(z);
            if (z2) {
                notifyDependencyChange(shouldDisableDependents());
                notifyChanged();
            }
        }
    }

    @Override // androidx.preference.Preference
    public boolean shouldDisableDependents() {
        boolean z;
        if (this.mDisableDependentsState) {
            z = this.mChecked;
        } else {
            z = !this.mChecked;
        }
        return z || super.shouldDisableDependents();
    }

    public void setSummaryOn(java.lang.CharSequence charSequence) {
        this.mSummaryOn = charSequence;
        if (isChecked()) {
            notifyChanged();
        }
    }

    public java.lang.CharSequence getSummaryOn() {
        return this.mSummaryOn;
    }

    public void setSummaryOn(int i) {
        setSummaryOn(getContext().getString(i));
    }

    public void setSummaryOff(java.lang.CharSequence charSequence) {
        this.mSummaryOff = charSequence;
        if (isChecked()) {
            return;
        }
        notifyChanged();
    }

    public java.lang.CharSequence getSummaryOff() {
        return this.mSummaryOff;
    }

    public void setSummaryOff(int i) {
        setSummaryOff(getContext().getString(i));
    }

    public boolean getDisableDependentsState() {
        return this.mDisableDependentsState;
    }

    public void setDisableDependentsState(boolean z) {
        this.mDisableDependentsState = z;
    }

    @Override // androidx.preference.Preference
    protected java.lang.Object onGetDefaultValue(android.content.res.TypedArray typedArray, int i) {
        return java.lang.Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    @Override // androidx.preference.Preference
    protected void onSetInitialValue(java.lang.Object obj) {
        if (obj == null) {
            obj = false;
        }
        setChecked(getPersistedBoolean(((java.lang.Boolean) obj).booleanValue()));
    }

    protected void syncSummaryView(androidx.preference.PreferenceViewHolder preferenceViewHolder) {
        syncSummaryView(preferenceViewHolder.findViewById(android.R.id.summary));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0030  */
    /* JADX WARN: Code duplicated, block: B:20:0x003a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
    protected void syncSummaryView(android.view.View view) {
        boolean z;
        int i;
        java.lang.CharSequence summary;
        if (view instanceof android.widget.TextView) {
            android.widget.TextView textView = (android.widget.TextView) view;
            if (this.mChecked && !android.text.TextUtils.isEmpty(this.mSummaryOn)) {
                textView.setText(this.mSummaryOn);
            } else {
                if (this.mChecked || android.text.TextUtils.isEmpty(this.mSummaryOff)) {
                    z = true;
                } else {
                    textView.setText(this.mSummaryOff);
                }
                if (z) {
                    summary = getSummary();
                    if (!android.text.TextUtils.isEmpty(summary)) {
                        textView.setText(summary);
                        z = false;
                    }
                }
                i = z ? 8 : 0;
                if (i != textView.getVisibility()) {
                    textView.setVisibility(i);
                }
            }
            z = false;
            if (z) {
                summary = getSummary();
                if (!android.text.TextUtils.isEmpty(summary)) {
                    textView.setText(summary);
                    z = false;
                }
            }
            if (z) {
            }
            if (i != textView.getVisibility()) {
                textView.setVisibility(i);
            }
        }
    }

    @Override // androidx.preference.Preference
    protected android.os.Parcelable onSaveInstanceState() {
        android.os.Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (isPersistent()) {
            return parcelableOnSaveInstanceState;
        }
        androidx.preference.TwoStatePreference.SavedState savedState = new androidx.preference.TwoStatePreference.SavedState(parcelableOnSaveInstanceState);
        savedState.mChecked = isChecked();
        return savedState;
    }

    @Override // androidx.preference.Preference
    protected void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(androidx.preference.TwoStatePreference.SavedState.class)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        androidx.preference.TwoStatePreference.SavedState savedState = (androidx.preference.TwoStatePreference.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setChecked(savedState.mChecked);
    }

    static class SavedState extends androidx.preference.Preference.BaseSavedState {
        public static final android.os.Parcelable.Creator<androidx.preference.TwoStatePreference.SavedState> CREATOR = new android.os.Parcelable.Creator<androidx.preference.TwoStatePreference.SavedState>() { // from class: androidx.preference.TwoStatePreference.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public androidx.preference.TwoStatePreference.SavedState createFromParcel(android.os.Parcel parcel) {
                return new androidx.preference.TwoStatePreference.SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public androidx.preference.TwoStatePreference.SavedState[] newArray(int i) {
                return new androidx.preference.TwoStatePreference.SavedState[i];
            }
        };
        boolean mChecked;

        SavedState(android.os.Parcel parcel) {
            super(parcel);
            this.mChecked = parcel.readInt() == 1;
        }

        SavedState(android.os.Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.mChecked ? 1 : 0);
        }
    }
}

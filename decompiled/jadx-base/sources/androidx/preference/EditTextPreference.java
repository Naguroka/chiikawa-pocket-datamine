package androidx.preference;

/* JADX INFO: loaded from: classes3.dex */
public class EditTextPreference extends androidx.preference.DialogPreference {
    private androidx.preference.EditTextPreference.OnBindEditTextListener mOnBindEditTextListener;
    private java.lang.String mText;

    public interface OnBindEditTextListener {
        void onBindEditText(android.widget.EditText editText);
    }

    public EditTextPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.preference.R.styleable.EditTextPreference, i, i2);
        if (androidx.core.content.res.TypedArrayUtils.getBoolean(typedArrayObtainStyledAttributes, androidx.preference.R.styleable.EditTextPreference_useSimpleSummaryProvider, androidx.preference.R.styleable.EditTextPreference_useSimpleSummaryProvider, false)) {
            setSummaryProvider(androidx.preference.EditTextPreference.SimpleSummaryProvider.getInstance());
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public EditTextPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public EditTextPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, androidx.core.content.res.TypedArrayUtils.getAttr(context, androidx.preference.R.attr.editTextPreferenceStyle, android.R.attr.editTextPreferenceStyle));
    }

    public EditTextPreference(android.content.Context context) {
        this(context, null);
    }

    public void setText(java.lang.String str) {
        boolean zShouldDisableDependents = shouldDisableDependents();
        this.mText = str;
        persistString(str);
        boolean zShouldDisableDependents2 = shouldDisableDependents();
        if (zShouldDisableDependents2 != zShouldDisableDependents) {
            notifyDependencyChange(zShouldDisableDependents2);
        }
        notifyChanged();
    }

    public java.lang.String getText() {
        return this.mText;
    }

    @Override // androidx.preference.Preference
    protected java.lang.Object onGetDefaultValue(android.content.res.TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // androidx.preference.Preference
    protected void onSetInitialValue(java.lang.Object obj) {
        setText(getPersistedString((java.lang.String) obj));
    }

    @Override // androidx.preference.Preference
    public boolean shouldDisableDependents() {
        return android.text.TextUtils.isEmpty(this.mText) || super.shouldDisableDependents();
    }

    @Override // androidx.preference.Preference
    protected android.os.Parcelable onSaveInstanceState() {
        android.os.Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (isPersistent()) {
            return parcelableOnSaveInstanceState;
        }
        androidx.preference.EditTextPreference.SavedState savedState = new androidx.preference.EditTextPreference.SavedState(parcelableOnSaveInstanceState);
        savedState.mText = getText();
        return savedState;
    }

    @Override // androidx.preference.Preference
    protected void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(androidx.preference.EditTextPreference.SavedState.class)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        androidx.preference.EditTextPreference.SavedState savedState = (androidx.preference.EditTextPreference.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setText(savedState.mText);
    }

    public void setOnBindEditTextListener(androidx.preference.EditTextPreference.OnBindEditTextListener onBindEditTextListener) {
        this.mOnBindEditTextListener = onBindEditTextListener;
    }

    androidx.preference.EditTextPreference.OnBindEditTextListener getOnBindEditTextListener() {
        return this.mOnBindEditTextListener;
    }

    private static class SavedState extends androidx.preference.Preference.BaseSavedState {
        public static final android.os.Parcelable.Creator<androidx.preference.EditTextPreference.SavedState> CREATOR = new android.os.Parcelable.Creator<androidx.preference.EditTextPreference.SavedState>() { // from class: androidx.preference.EditTextPreference.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public androidx.preference.EditTextPreference.SavedState createFromParcel(android.os.Parcel parcel) {
                return new androidx.preference.EditTextPreference.SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public androidx.preference.EditTextPreference.SavedState[] newArray(int i) {
                return new androidx.preference.EditTextPreference.SavedState[i];
            }
        };
        java.lang.String mText;

        SavedState(android.os.Parcel parcel) {
            super(parcel);
            this.mText = parcel.readString();
        }

        SavedState(android.os.Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.mText);
        }
    }

    public static final class SimpleSummaryProvider implements androidx.preference.Preference.SummaryProvider<androidx.preference.EditTextPreference> {
        private static androidx.preference.EditTextPreference.SimpleSummaryProvider sSimpleSummaryProvider;

        private SimpleSummaryProvider() {
        }

        public static androidx.preference.EditTextPreference.SimpleSummaryProvider getInstance() {
            if (sSimpleSummaryProvider == null) {
                sSimpleSummaryProvider = new androidx.preference.EditTextPreference.SimpleSummaryProvider();
            }
            return sSimpleSummaryProvider;
        }

        @Override // androidx.preference.Preference.SummaryProvider
        public java.lang.CharSequence provideSummary(androidx.preference.EditTextPreference editTextPreference) {
            if (android.text.TextUtils.isEmpty(editTextPreference.getText())) {
                return editTextPreference.getContext().getString(androidx.preference.R.string.not_set);
            }
            return editTextPreference.getText();
        }
    }
}

package androidx.preference;

/* JADX INFO: loaded from: classes3.dex */
@java.lang.Deprecated
public class MultiSelectListPreferenceDialogFragment extends androidx.preference.PreferenceDialogFragment {
    private static final java.lang.String SAVE_STATE_CHANGED = "MultiSelectListPreferenceDialogFragment.changed";
    private static final java.lang.String SAVE_STATE_ENTRIES = "MultiSelectListPreferenceDialogFragment.entries";
    private static final java.lang.String SAVE_STATE_ENTRY_VALUES = "MultiSelectListPreferenceDialogFragment.entryValues";
    private static final java.lang.String SAVE_STATE_VALUES = "MultiSelectListPreferenceDialogFragment.values";
    java.lang.CharSequence[] mEntries;
    java.lang.CharSequence[] mEntryValues;
    java.util.Set<java.lang.String> mNewValues = new java.util.HashSet();
    boolean mPreferenceChanged;

    @java.lang.Deprecated
    public MultiSelectListPreferenceDialogFragment() {
    }

    @java.lang.Deprecated
    public static androidx.preference.MultiSelectListPreferenceDialogFragment newInstance(java.lang.String str) {
        androidx.preference.MultiSelectListPreferenceDialogFragment multiSelectListPreferenceDialogFragment = new androidx.preference.MultiSelectListPreferenceDialogFragment();
        android.os.Bundle bundle = new android.os.Bundle(1);
        bundle.putString(com.ironsource.y8.h.W, str);
        multiSelectListPreferenceDialogFragment.setArguments(bundle);
        return multiSelectListPreferenceDialogFragment;
    }

    @Override // androidx.preference.PreferenceDialogFragment, android.app.DialogFragment, android.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            androidx.preference.MultiSelectListPreference listPreference = getListPreference();
            if (listPreference.getEntries() == null || listPreference.getEntryValues() == null) {
                throw new java.lang.IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
            }
            this.mNewValues.clear();
            this.mNewValues.addAll(listPreference.getValues());
            this.mPreferenceChanged = false;
            this.mEntries = listPreference.getEntries();
            this.mEntryValues = listPreference.getEntryValues();
            return;
        }
        this.mNewValues.clear();
        this.mNewValues.addAll(bundle.getStringArrayList(SAVE_STATE_VALUES));
        this.mPreferenceChanged = bundle.getBoolean(SAVE_STATE_CHANGED, false);
        this.mEntries = bundle.getCharSequenceArray(SAVE_STATE_ENTRIES);
        this.mEntryValues = bundle.getCharSequenceArray(SAVE_STATE_ENTRY_VALUES);
    }

    @Override // androidx.preference.PreferenceDialogFragment, android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList(SAVE_STATE_VALUES, new java.util.ArrayList<>(this.mNewValues));
        bundle.putBoolean(SAVE_STATE_CHANGED, this.mPreferenceChanged);
        bundle.putCharSequenceArray(SAVE_STATE_ENTRIES, this.mEntries);
        bundle.putCharSequenceArray(SAVE_STATE_ENTRY_VALUES, this.mEntryValues);
    }

    private androidx.preference.MultiSelectListPreference getListPreference() {
        return (androidx.preference.MultiSelectListPreference) getPreference();
    }

    @Override // androidx.preference.PreferenceDialogFragment
    protected void onPrepareDialogBuilder(android.app.AlertDialog.Builder builder) {
        super.onPrepareDialogBuilder(builder);
        int length = this.mEntryValues.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.mNewValues.contains(this.mEntryValues[i].toString());
        }
        builder.setMultiChoiceItems(this.mEntries, zArr, new android.content.DialogInterface.OnMultiChoiceClickListener() { // from class: androidx.preference.MultiSelectListPreferenceDialogFragment.1
            @Override // android.content.DialogInterface.OnMultiChoiceClickListener
            public void onClick(android.content.DialogInterface dialogInterface, int i2, boolean z) {
                if (z) {
                    androidx.preference.MultiSelectListPreferenceDialogFragment multiSelectListPreferenceDialogFragment = androidx.preference.MultiSelectListPreferenceDialogFragment.this;
                    multiSelectListPreferenceDialogFragment.mPreferenceChanged = androidx.preference.MultiSelectListPreferenceDialogFragment.this.mNewValues.add(androidx.preference.MultiSelectListPreferenceDialogFragment.this.mEntryValues[i2].toString()) | multiSelectListPreferenceDialogFragment.mPreferenceChanged;
                } else {
                    androidx.preference.MultiSelectListPreferenceDialogFragment multiSelectListPreferenceDialogFragment2 = androidx.preference.MultiSelectListPreferenceDialogFragment.this;
                    multiSelectListPreferenceDialogFragment2.mPreferenceChanged = androidx.preference.MultiSelectListPreferenceDialogFragment.this.mNewValues.remove(androidx.preference.MultiSelectListPreferenceDialogFragment.this.mEntryValues[i2].toString()) | multiSelectListPreferenceDialogFragment2.mPreferenceChanged;
                }
            }
        });
    }

    @Override // androidx.preference.PreferenceDialogFragment
    @java.lang.Deprecated
    public void onDialogClosed(boolean z) {
        androidx.preference.MultiSelectListPreference listPreference = getListPreference();
        if (z && this.mPreferenceChanged) {
            java.util.Set<java.lang.String> set = this.mNewValues;
            if (listPreference.callChangeListener(set)) {
                listPreference.setValues(set);
            }
        }
        this.mPreferenceChanged = false;
    }
}

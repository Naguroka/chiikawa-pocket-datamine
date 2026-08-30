package androidx.preference;

/* JADX INFO: loaded from: classes3.dex */
public class MultiSelectListPreferenceDialogFragmentCompat extends androidx.preference.PreferenceDialogFragmentCompat {
    private static final java.lang.String SAVE_STATE_CHANGED = "MultiSelectListPreferenceDialogFragmentCompat.changed";
    private static final java.lang.String SAVE_STATE_ENTRIES = "MultiSelectListPreferenceDialogFragmentCompat.entries";
    private static final java.lang.String SAVE_STATE_ENTRY_VALUES = "MultiSelectListPreferenceDialogFragmentCompat.entryValues";
    private static final java.lang.String SAVE_STATE_VALUES = "MultiSelectListPreferenceDialogFragmentCompat.values";
    java.lang.CharSequence[] mEntries;
    java.lang.CharSequence[] mEntryValues;
    java.util.Set<java.lang.String> mNewValues = new java.util.HashSet();
    boolean mPreferenceChanged;

    public static androidx.preference.MultiSelectListPreferenceDialogFragmentCompat newInstance(java.lang.String str) {
        androidx.preference.MultiSelectListPreferenceDialogFragmentCompat multiSelectListPreferenceDialogFragmentCompat = new androidx.preference.MultiSelectListPreferenceDialogFragmentCompat();
        android.os.Bundle bundle = new android.os.Bundle(1);
        bundle.putString(com.ironsource.y8.h.W, str);
        multiSelectListPreferenceDialogFragmentCompat.setArguments(bundle);
        return multiSelectListPreferenceDialogFragmentCompat;
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
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

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
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

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    protected void onPrepareDialogBuilder(androidx.appcompat.app.AlertDialog.Builder builder) {
        super.onPrepareDialogBuilder(builder);
        int length = this.mEntryValues.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.mNewValues.contains(this.mEntryValues[i].toString());
        }
        builder.setMultiChoiceItems(this.mEntries, zArr, new android.content.DialogInterface.OnMultiChoiceClickListener() { // from class: androidx.preference.MultiSelectListPreferenceDialogFragmentCompat.1
            @Override // android.content.DialogInterface.OnMultiChoiceClickListener
            public void onClick(android.content.DialogInterface dialogInterface, int i2, boolean z) {
                if (z) {
                    androidx.preference.MultiSelectListPreferenceDialogFragmentCompat multiSelectListPreferenceDialogFragmentCompat = androidx.preference.MultiSelectListPreferenceDialogFragmentCompat.this;
                    multiSelectListPreferenceDialogFragmentCompat.mPreferenceChanged = androidx.preference.MultiSelectListPreferenceDialogFragmentCompat.this.mNewValues.add(androidx.preference.MultiSelectListPreferenceDialogFragmentCompat.this.mEntryValues[i2].toString()) | multiSelectListPreferenceDialogFragmentCompat.mPreferenceChanged;
                } else {
                    androidx.preference.MultiSelectListPreferenceDialogFragmentCompat multiSelectListPreferenceDialogFragmentCompat2 = androidx.preference.MultiSelectListPreferenceDialogFragmentCompat.this;
                    multiSelectListPreferenceDialogFragmentCompat2.mPreferenceChanged = androidx.preference.MultiSelectListPreferenceDialogFragmentCompat.this.mNewValues.remove(androidx.preference.MultiSelectListPreferenceDialogFragmentCompat.this.mEntryValues[i2].toString()) | multiSelectListPreferenceDialogFragmentCompat2.mPreferenceChanged;
                }
            }
        });
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public void onDialogClosed(boolean z) {
        if (z && this.mPreferenceChanged) {
            androidx.preference.MultiSelectListPreference listPreference = getListPreference();
            if (listPreference.callChangeListener(this.mNewValues)) {
                listPreference.setValues(this.mNewValues);
            }
        }
        this.mPreferenceChanged = false;
    }
}

package androidx.preference;

/* JADX INFO: loaded from: classes3.dex */
public class ListPreferenceDialogFragmentCompat extends androidx.preference.PreferenceDialogFragmentCompat {
    private static final java.lang.String SAVE_STATE_ENTRIES = "ListPreferenceDialogFragment.entries";
    private static final java.lang.String SAVE_STATE_ENTRY_VALUES = "ListPreferenceDialogFragment.entryValues";
    private static final java.lang.String SAVE_STATE_INDEX = "ListPreferenceDialogFragment.index";
    int mClickedDialogEntryIndex;
    private java.lang.CharSequence[] mEntries;
    private java.lang.CharSequence[] mEntryValues;

    public static androidx.preference.ListPreferenceDialogFragmentCompat newInstance(java.lang.String str) {
        androidx.preference.ListPreferenceDialogFragmentCompat listPreferenceDialogFragmentCompat = new androidx.preference.ListPreferenceDialogFragmentCompat();
        android.os.Bundle bundle = new android.os.Bundle(1);
        bundle.putString(com.ironsource.y8.h.W, str);
        listPreferenceDialogFragmentCompat.setArguments(bundle);
        return listPreferenceDialogFragmentCompat;
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            androidx.preference.ListPreference listPreference = getListPreference();
            if (listPreference.getEntries() == null || listPreference.getEntryValues() == null) {
                throw new java.lang.IllegalStateException("ListPreference requires an entries array and an entryValues array.");
            }
            this.mClickedDialogEntryIndex = listPreference.findIndexOfValue(listPreference.getValue());
            this.mEntries = listPreference.getEntries();
            this.mEntryValues = listPreference.getEntryValues();
            return;
        }
        this.mClickedDialogEntryIndex = bundle.getInt(SAVE_STATE_INDEX, 0);
        this.mEntries = bundle.getCharSequenceArray(SAVE_STATE_ENTRIES);
        this.mEntryValues = bundle.getCharSequenceArray(SAVE_STATE_ENTRY_VALUES);
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(SAVE_STATE_INDEX, this.mClickedDialogEntryIndex);
        bundle.putCharSequenceArray(SAVE_STATE_ENTRIES, this.mEntries);
        bundle.putCharSequenceArray(SAVE_STATE_ENTRY_VALUES, this.mEntryValues);
    }

    private androidx.preference.ListPreference getListPreference() {
        return (androidx.preference.ListPreference) getPreference();
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    protected void onPrepareDialogBuilder(androidx.appcompat.app.AlertDialog.Builder builder) {
        super.onPrepareDialogBuilder(builder);
        builder.setSingleChoiceItems(this.mEntries, this.mClickedDialogEntryIndex, new android.content.DialogInterface.OnClickListener() { // from class: androidx.preference.ListPreferenceDialogFragmentCompat.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface dialogInterface, int i) {
                androidx.preference.ListPreferenceDialogFragmentCompat.this.mClickedDialogEntryIndex = i;
                androidx.preference.ListPreferenceDialogFragmentCompat.this.onClick(dialogInterface, -1);
                dialogInterface.dismiss();
            }
        });
        builder.setPositiveButton((java.lang.CharSequence) null, (android.content.DialogInterface.OnClickListener) null);
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public void onDialogClosed(boolean z) {
        int i;
        if (!z || (i = this.mClickedDialogEntryIndex) < 0) {
            return;
        }
        java.lang.String string = this.mEntryValues[i].toString();
        androidx.preference.ListPreference listPreference = getListPreference();
        if (listPreference.callChangeListener(string)) {
            listPreference.setValue(string);
        }
    }
}

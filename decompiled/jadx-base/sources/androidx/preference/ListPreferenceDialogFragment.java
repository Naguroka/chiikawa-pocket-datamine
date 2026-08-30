package androidx.preference;

/* JADX INFO: loaded from: classes3.dex */
@java.lang.Deprecated
public class ListPreferenceDialogFragment extends androidx.preference.PreferenceDialogFragment {
    private static final java.lang.String SAVE_STATE_ENTRIES = "ListPreferenceDialogFragment.entries";
    private static final java.lang.String SAVE_STATE_ENTRY_VALUES = "ListPreferenceDialogFragment.entryValues";
    private static final java.lang.String SAVE_STATE_INDEX = "ListPreferenceDialogFragment.index";
    int mClickedDialogEntryIndex;
    private java.lang.CharSequence[] mEntries;
    private java.lang.CharSequence[] mEntryValues;

    @java.lang.Deprecated
    public ListPreferenceDialogFragment() {
    }

    @java.lang.Deprecated
    public static androidx.preference.ListPreferenceDialogFragment newInstance(java.lang.String str) {
        androidx.preference.ListPreferenceDialogFragment listPreferenceDialogFragment = new androidx.preference.ListPreferenceDialogFragment();
        android.os.Bundle bundle = new android.os.Bundle(1);
        bundle.putString(com.ironsource.y8.h.W, str);
        listPreferenceDialogFragment.setArguments(bundle);
        return listPreferenceDialogFragment;
    }

    @Override // androidx.preference.PreferenceDialogFragment, android.app.DialogFragment, android.app.Fragment
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

    @Override // androidx.preference.PreferenceDialogFragment, android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(SAVE_STATE_INDEX, this.mClickedDialogEntryIndex);
        bundle.putCharSequenceArray(SAVE_STATE_ENTRIES, this.mEntries);
        bundle.putCharSequenceArray(SAVE_STATE_ENTRY_VALUES, this.mEntryValues);
    }

    private androidx.preference.ListPreference getListPreference() {
        return (androidx.preference.ListPreference) getPreference();
    }

    @Override // androidx.preference.PreferenceDialogFragment
    protected void onPrepareDialogBuilder(android.app.AlertDialog.Builder builder) {
        super.onPrepareDialogBuilder(builder);
        builder.setSingleChoiceItems(this.mEntries, this.mClickedDialogEntryIndex, new android.content.DialogInterface.OnClickListener() { // from class: androidx.preference.ListPreferenceDialogFragment.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface dialogInterface, int i) {
                androidx.preference.ListPreferenceDialogFragment.this.mClickedDialogEntryIndex = i;
                androidx.preference.ListPreferenceDialogFragment.this.onClick(dialogInterface, -1);
                dialogInterface.dismiss();
            }
        });
        builder.setPositiveButton((java.lang.CharSequence) null, (android.content.DialogInterface.OnClickListener) null);
    }

    @Override // androidx.preference.PreferenceDialogFragment
    @java.lang.Deprecated
    public void onDialogClosed(boolean z) {
        int i;
        androidx.preference.ListPreference listPreference = getListPreference();
        if (!z || (i = this.mClickedDialogEntryIndex) < 0) {
            return;
        }
        java.lang.String string = this.mEntryValues[i].toString();
        if (listPreference.callChangeListener(string)) {
            listPreference.setValue(string);
        }
    }
}

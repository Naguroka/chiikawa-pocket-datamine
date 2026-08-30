package androidx.preference;

/* JADX INFO: loaded from: classes3.dex */
public class DropDownPreference extends androidx.preference.ListPreference {
    private final android.widget.ArrayAdapter mAdapter;
    private final android.content.Context mContext;
    private final android.widget.AdapterView.OnItemSelectedListener mItemSelectedListener;
    private android.widget.Spinner mSpinner;

    public DropDownPreference(android.content.Context context) {
        this(context, null);
    }

    public DropDownPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, androidx.preference.R.attr.dropdownPreferenceStyle);
    }

    public DropDownPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public DropDownPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mItemSelectedListener = new android.widget.AdapterView.OnItemSelectedListener() { // from class: androidx.preference.DropDownPreference.1
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(android.widget.AdapterView<?> adapterView) {
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(android.widget.AdapterView<?> adapterView, android.view.View view, int i3, long j) {
                if (i3 >= 0) {
                    java.lang.String string = androidx.preference.DropDownPreference.this.getEntryValues()[i3].toString();
                    if (string.equals(androidx.preference.DropDownPreference.this.getValue()) || !androidx.preference.DropDownPreference.this.callChangeListener(string)) {
                        return;
                    }
                    androidx.preference.DropDownPreference.this.setValue(string);
                }
            }
        };
        this.mContext = context;
        this.mAdapter = createAdapter();
        updateEntries();
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    protected void onClick() {
        this.mSpinner.performClick();
    }

    @Override // androidx.preference.ListPreference
    public void setEntries(java.lang.CharSequence[] charSequenceArr) {
        super.setEntries(charSequenceArr);
        updateEntries();
    }

    protected android.widget.ArrayAdapter createAdapter() {
        return new android.widget.ArrayAdapter(this.mContext, android.R.layout.simple_spinner_dropdown_item);
    }

    private void updateEntries() {
        this.mAdapter.clear();
        if (getEntries() != null) {
            for (java.lang.CharSequence charSequence : getEntries()) {
                this.mAdapter.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.ListPreference
    public void setValueIndex(int i) {
        setValue(getEntryValues()[i].toString());
    }

    @Override // androidx.preference.Preference
    protected void notifyChanged() {
        super.notifyChanged();
        android.widget.ArrayAdapter arrayAdapter = this.mAdapter;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.Preference
    public void onBindViewHolder(androidx.preference.PreferenceViewHolder preferenceViewHolder) {
        android.widget.Spinner spinner = (android.widget.Spinner) preferenceViewHolder.itemView.findViewById(androidx.preference.R.id.spinner);
        this.mSpinner = spinner;
        spinner.setAdapter((android.widget.SpinnerAdapter) this.mAdapter);
        this.mSpinner.setOnItemSelectedListener(this.mItemSelectedListener);
        this.mSpinner.setSelection(findSpinnerIndexOfValue(getValue()));
        super.onBindViewHolder(preferenceViewHolder);
    }

    private int findSpinnerIndexOfValue(java.lang.String str) {
        java.lang.CharSequence[] entryValues = getEntryValues();
        if (str == null || entryValues == null) {
            return -1;
        }
        for (int length = entryValues.length - 1; length >= 0; length--) {
            if (android.text.TextUtils.equals(entryValues[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }
}

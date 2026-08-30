package androidx.preference;

/* JADX INFO: loaded from: classes3.dex */
@java.lang.Deprecated
public class EditTextPreferenceDialogFragment extends androidx.preference.PreferenceDialogFragment {
    private static final java.lang.String SAVE_STATE_TEXT = "EditTextPreferenceDialogFragment.text";
    private android.widget.EditText mEditText;
    private java.lang.CharSequence mText;

    @Override // androidx.preference.PreferenceDialogFragment
    protected boolean needInputMethod() {
        return true;
    }

    @java.lang.Deprecated
    public EditTextPreferenceDialogFragment() {
    }

    @java.lang.Deprecated
    public static androidx.preference.EditTextPreferenceDialogFragment newInstance(java.lang.String str) {
        androidx.preference.EditTextPreferenceDialogFragment editTextPreferenceDialogFragment = new androidx.preference.EditTextPreferenceDialogFragment();
        android.os.Bundle bundle = new android.os.Bundle(1);
        bundle.putString(com.ironsource.y8.h.W, str);
        editTextPreferenceDialogFragment.setArguments(bundle);
        return editTextPreferenceDialogFragment;
    }

    @Override // androidx.preference.PreferenceDialogFragment, android.app.DialogFragment, android.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.mText = getEditTextPreference().getText();
        } else {
            this.mText = bundle.getCharSequence(SAVE_STATE_TEXT);
        }
    }

    @Override // androidx.preference.PreferenceDialogFragment, android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence(SAVE_STATE_TEXT, this.mText);
    }

    @Override // androidx.preference.PreferenceDialogFragment
    protected void onBindDialogView(android.view.View view) {
        super.onBindDialogView(view);
        android.widget.EditText editText = (android.widget.EditText) view.findViewById(android.R.id.edit);
        this.mEditText = editText;
        editText.requestFocus();
        android.widget.EditText editText2 = this.mEditText;
        if (editText2 == null) {
            throw new java.lang.IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText2.setText(this.mText);
        android.widget.EditText editText3 = this.mEditText;
        editText3.setSelection(editText3.getText().length());
    }

    private androidx.preference.EditTextPreference getEditTextPreference() {
        return (androidx.preference.EditTextPreference) getPreference();
    }

    @Override // androidx.preference.PreferenceDialogFragment
    @java.lang.Deprecated
    public void onDialogClosed(boolean z) {
        if (z) {
            java.lang.String string = this.mEditText.getText().toString();
            if (getEditTextPreference().callChangeListener(string)) {
                getEditTextPreference().setText(string);
            }
        }
    }
}

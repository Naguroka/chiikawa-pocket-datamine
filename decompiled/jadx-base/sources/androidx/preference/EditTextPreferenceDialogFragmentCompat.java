package androidx.preference;

/* JADX INFO: loaded from: classes3.dex */
public class EditTextPreferenceDialogFragmentCompat extends androidx.preference.PreferenceDialogFragmentCompat {
    private static final java.lang.String SAVE_STATE_TEXT = "EditTextPreferenceDialogFragment.text";
    private static final int SHOW_REQUEST_TIMEOUT = 1000;
    private android.widget.EditText mEditText;
    private java.lang.CharSequence mText;
    private final java.lang.Runnable mShowSoftInputRunnable = new java.lang.Runnable() { // from class: androidx.preference.EditTextPreferenceDialogFragmentCompat.1
        @Override // java.lang.Runnable
        public void run() {
            androidx.preference.EditTextPreferenceDialogFragmentCompat.this.scheduleShowSoftInputInner();
        }
    };
    private long mShowRequestTime = -1;

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    protected boolean needInputMethod() {
        return true;
    }

    public static androidx.preference.EditTextPreferenceDialogFragmentCompat newInstance(java.lang.String str) {
        androidx.preference.EditTextPreferenceDialogFragmentCompat editTextPreferenceDialogFragmentCompat = new androidx.preference.EditTextPreferenceDialogFragmentCompat();
        android.os.Bundle bundle = new android.os.Bundle(1);
        bundle.putString(com.ironsource.y8.h.W, str);
        editTextPreferenceDialogFragmentCompat.setArguments(bundle);
        return editTextPreferenceDialogFragmentCompat;
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.mText = getEditTextPreference().getText();
        } else {
            this.mText = bundle.getCharSequence(SAVE_STATE_TEXT);
        }
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence(SAVE_STATE_TEXT, this.mText);
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    protected void onBindDialogView(android.view.View view) {
        super.onBindDialogView(view);
        android.widget.EditText editText = (android.widget.EditText) view.findViewById(android.R.id.edit);
        this.mEditText = editText;
        if (editText == null) {
            throw new java.lang.IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText.requestFocus();
        this.mEditText.setText(this.mText);
        android.widget.EditText editText2 = this.mEditText;
        editText2.setSelection(editText2.getText().length());
        if (getEditTextPreference().getOnBindEditTextListener() != null) {
            getEditTextPreference().getOnBindEditTextListener().onBindEditText(this.mEditText);
        }
    }

    private androidx.preference.EditTextPreference getEditTextPreference() {
        return (androidx.preference.EditTextPreference) getPreference();
    }

    private boolean hasPendingShowSoftInputRequest() {
        long j = this.mShowRequestTime;
        return j != -1 && j + 1000 > android.os.SystemClock.currentThreadTimeMillis();
    }

    private void setPendingShowSoftInputRequest(boolean z) {
        this.mShowRequestTime = z ? android.os.SystemClock.currentThreadTimeMillis() : -1L;
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    protected void scheduleShowSoftInput() {
        setPendingShowSoftInputRequest(true);
        scheduleShowSoftInputInner();
    }

    void scheduleShowSoftInputInner() {
        if (hasPendingShowSoftInputRequest()) {
            android.widget.EditText editText = this.mEditText;
            if (editText == null || !editText.isFocused()) {
                setPendingShowSoftInputRequest(false);
            } else if (((android.view.inputmethod.InputMethodManager) this.mEditText.getContext().getSystemService("input_method")).showSoftInput(this.mEditText, 0)) {
                setPendingShowSoftInputRequest(false);
            } else {
                this.mEditText.removeCallbacks(this.mShowSoftInputRunnable);
                this.mEditText.postDelayed(this.mShowSoftInputRunnable, 50L);
            }
        }
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public void onDialogClosed(boolean z) {
        if (z) {
            java.lang.String string = this.mEditText.getText().toString();
            androidx.preference.EditTextPreference editTextPreference = getEditTextPreference();
            if (editTextPreference.callChangeListener(string)) {
                editTextPreference.setText(string);
            }
        }
    }
}

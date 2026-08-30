package androidx.preference;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PreferenceDialogFragmentCompat extends androidx.fragment.app.DialogFragment implements android.content.DialogInterface.OnClickListener {
    protected static final java.lang.String ARG_KEY = "key";
    private static final java.lang.String SAVE_STATE_ICON = "PreferenceDialogFragment.icon";
    private static final java.lang.String SAVE_STATE_LAYOUT = "PreferenceDialogFragment.layout";
    private static final java.lang.String SAVE_STATE_MESSAGE = "PreferenceDialogFragment.message";
    private static final java.lang.String SAVE_STATE_NEGATIVE_TEXT = "PreferenceDialogFragment.negativeText";
    private static final java.lang.String SAVE_STATE_POSITIVE_TEXT = "PreferenceDialogFragment.positiveText";
    private static final java.lang.String SAVE_STATE_TITLE = "PreferenceDialogFragment.title";
    private android.graphics.drawable.BitmapDrawable mDialogIcon;
    private int mDialogLayoutRes;
    private java.lang.CharSequence mDialogMessage;
    private java.lang.CharSequence mDialogTitle;
    private java.lang.CharSequence mNegativeButtonText;
    private java.lang.CharSequence mPositiveButtonText;
    private androidx.preference.DialogPreference mPreference;
    private int mWhichButtonClicked;

    protected boolean needInputMethod() {
        return false;
    }

    public abstract void onDialogClosed(boolean z);

    protected void onPrepareDialogBuilder(androidx.appcompat.app.AlertDialog.Builder builder) {
    }

    protected void scheduleShowSoftInput() {
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        androidx.activity.result.ActivityResultCaller targetFragment = getTargetFragment();
        if (!(targetFragment instanceof androidx.preference.DialogPreference.TargetFragment)) {
            throw new java.lang.IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        androidx.preference.DialogPreference.TargetFragment targetFragment2 = (androidx.preference.DialogPreference.TargetFragment) targetFragment;
        java.lang.String string = requireArguments().getString("key");
        if (bundle == null) {
            androidx.preference.DialogPreference dialogPreference = (androidx.preference.DialogPreference) targetFragment2.findPreference(string);
            this.mPreference = dialogPreference;
            this.mDialogTitle = dialogPreference.getDialogTitle();
            this.mPositiveButtonText = this.mPreference.getPositiveButtonText();
            this.mNegativeButtonText = this.mPreference.getNegativeButtonText();
            this.mDialogMessage = this.mPreference.getDialogMessage();
            this.mDialogLayoutRes = this.mPreference.getDialogLayoutResource();
            android.graphics.drawable.Drawable dialogIcon = this.mPreference.getDialogIcon();
            if (dialogIcon == null || (dialogIcon instanceof android.graphics.drawable.BitmapDrawable)) {
                this.mDialogIcon = (android.graphics.drawable.BitmapDrawable) dialogIcon;
                return;
            }
            android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(dialogIcon.getIntrinsicWidth(), dialogIcon.getIntrinsicHeight(), android.graphics.Bitmap.Config.ARGB_8888);
            android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
            dialogIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            dialogIcon.draw(canvas);
            this.mDialogIcon = new android.graphics.drawable.BitmapDrawable(getResources(), bitmapCreateBitmap);
            return;
        }
        this.mDialogTitle = bundle.getCharSequence(SAVE_STATE_TITLE);
        this.mPositiveButtonText = bundle.getCharSequence(SAVE_STATE_POSITIVE_TEXT);
        this.mNegativeButtonText = bundle.getCharSequence(SAVE_STATE_NEGATIVE_TEXT);
        this.mDialogMessage = bundle.getCharSequence(SAVE_STATE_MESSAGE);
        this.mDialogLayoutRes = bundle.getInt(SAVE_STATE_LAYOUT, 0);
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) bundle.getParcelable(SAVE_STATE_ICON);
        if (bitmap != null) {
            this.mDialogIcon = new android.graphics.drawable.BitmapDrawable(getResources(), bitmap);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence(SAVE_STATE_TITLE, this.mDialogTitle);
        bundle.putCharSequence(SAVE_STATE_POSITIVE_TEXT, this.mPositiveButtonText);
        bundle.putCharSequence(SAVE_STATE_NEGATIVE_TEXT, this.mNegativeButtonText);
        bundle.putCharSequence(SAVE_STATE_MESSAGE, this.mDialogMessage);
        bundle.putInt(SAVE_STATE_LAYOUT, this.mDialogLayoutRes);
        android.graphics.drawable.BitmapDrawable bitmapDrawable = this.mDialogIcon;
        if (bitmapDrawable != null) {
            bundle.putParcelable(SAVE_STATE_ICON, bitmapDrawable.getBitmap());
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        this.mWhichButtonClicked = -2;
        androidx.appcompat.app.AlertDialog.Builder negativeButton = new androidx.appcompat.app.AlertDialog.Builder(requireContext()).setTitle(this.mDialogTitle).setIcon(this.mDialogIcon).setPositiveButton(this.mPositiveButtonText, this).setNegativeButton(this.mNegativeButtonText, this);
        android.view.View viewOnCreateDialogView = onCreateDialogView(requireContext());
        if (viewOnCreateDialogView != null) {
            onBindDialogView(viewOnCreateDialogView);
            negativeButton.setView(viewOnCreateDialogView);
        } else {
            negativeButton.setMessage(this.mDialogMessage);
        }
        onPrepareDialogBuilder(negativeButton);
        androidx.appcompat.app.AlertDialog alertDialogCreate = negativeButton.create();
        if (needInputMethod()) {
            requestInputMethod(alertDialogCreate);
        }
        return alertDialogCreate;
    }

    public androidx.preference.DialogPreference getPreference() {
        if (this.mPreference == null) {
            this.mPreference = (androidx.preference.DialogPreference) ((androidx.preference.DialogPreference.TargetFragment) getTargetFragment()).findPreference(requireArguments().getString("key"));
        }
        return this.mPreference;
    }

    private void requestInputMethod(android.app.Dialog dialog) {
        android.view.Window window = dialog.getWindow();
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            androidx.preference.PreferenceDialogFragmentCompat.Api30Impl.showIme(window);
        } else {
            scheduleShowSoftInput();
        }
    }

    protected android.view.View onCreateDialogView(android.content.Context context) {
        int i = this.mDialogLayoutRes;
        if (i == 0) {
            return null;
        }
        return getLayoutInflater().inflate(i, (android.view.ViewGroup) null);
    }

    protected void onBindDialogView(android.view.View view) {
        int i;
        android.view.View viewFindViewById = view.findViewById(android.R.id.message);
        if (viewFindViewById != null) {
            java.lang.CharSequence charSequence = this.mDialogMessage;
            if (android.text.TextUtils.isEmpty(charSequence)) {
                i = 8;
            } else {
                if (viewFindViewById instanceof android.widget.TextView) {
                    ((android.widget.TextView) viewFindViewById).setText(charSequence);
                }
                i = 0;
            }
            if (viewFindViewById.getVisibility() != i) {
                viewFindViewById.setVisibility(i);
            }
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i) {
        this.mWhichButtonClicked = i;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        onDialogClosed(this.mWhichButtonClicked == -1);
    }

    private static class Api30Impl {
        private Api30Impl() {
        }

        static void showIme(android.view.Window window) {
            window.getDecorView().getWindowInsetsController().show(android.view.WindowInsets.Type.ime());
        }
    }
}

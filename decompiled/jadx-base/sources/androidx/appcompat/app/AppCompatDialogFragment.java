package androidx.appcompat.app;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatDialogFragment extends androidx.fragment.app.DialogFragment {
    public AppCompatDialogFragment() {
    }

    public AppCompatDialogFragment(int i) {
        super(i);
    }

    @Override // androidx.fragment.app.DialogFragment
    public android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        return new androidx.appcompat.app.AppCompatDialog(getContext(), getTheme());
    }

    @Override // androidx.fragment.app.DialogFragment
    public void setupDialog(android.app.Dialog dialog, int i) {
        if (dialog instanceof androidx.appcompat.app.AppCompatDialog) {
            androidx.appcompat.app.AppCompatDialog appCompatDialog = (androidx.appcompat.app.AppCompatDialog) dialog;
            if (i != 1 && i != 2) {
                if (i != 3) {
                    return;
                } else {
                    dialog.getWindow().addFlags(24);
                }
            }
            appCompatDialog.supportRequestWindowFeature(1);
            return;
        }
        super.setupDialog(dialog, i);
    }
}

package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class ErrorDialogFragment extends android.app.DialogFragment {
    private android.app.Dialog zaa;
    private android.content.DialogInterface.OnCancelListener zab;
    private android.app.Dialog zac;

    public static com.google.android.gms.common.ErrorDialogFragment newInstance(android.app.Dialog dialog) {
        return newInstance(dialog, null);
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        android.content.DialogInterface.OnCancelListener onCancelListener = this.zab;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        android.app.Dialog dialog = this.zaa;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.zac == null) {
            this.zac = new android.app.AlertDialog.Builder((android.content.Context) com.google.android.gms.common.internal.Preconditions.checkNotNull(getActivity())).create();
        }
        return this.zac;
    }

    @Override // android.app.DialogFragment
    public void show(android.app.FragmentManager fragmentManager, java.lang.String str) {
        super.show(fragmentManager, str);
    }

    public static com.google.android.gms.common.ErrorDialogFragment newInstance(android.app.Dialog dialog, android.content.DialogInterface.OnCancelListener onCancelListener) {
        com.google.android.gms.common.ErrorDialogFragment errorDialogFragment = new com.google.android.gms.common.ErrorDialogFragment();
        android.app.Dialog dialog2 = (android.app.Dialog) com.google.android.gms.common.internal.Preconditions.checkNotNull(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        errorDialogFragment.zaa = dialog2;
        if (onCancelListener != null) {
            errorDialogFragment.zab = onCancelListener;
        }
        return errorDialogFragment;
    }
}

package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class SupportErrorDialogFragment extends androidx.fragment.app.DialogFragment {
    private android.app.Dialog zaa;
    private android.content.DialogInterface.OnCancelListener zab;
    private android.app.Dialog zac;

    public static com.google.android.gms.common.SupportErrorDialogFragment newInstance(android.app.Dialog dialog) {
        return newInstance(dialog, null);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        android.content.DialogInterface.OnCancelListener onCancelListener = this.zab;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        android.app.Dialog dialog = this.zaa;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.zac == null) {
            this.zac = new android.app.AlertDialog.Builder((android.content.Context) com.google.android.gms.common.internal.Preconditions.checkNotNull(getContext())).create();
        }
        return this.zac;
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str) {
        super.show(fragmentManager, str);
    }

    public static com.google.android.gms.common.SupportErrorDialogFragment newInstance(android.app.Dialog dialog, android.content.DialogInterface.OnCancelListener onCancelListener) {
        com.google.android.gms.common.SupportErrorDialogFragment supportErrorDialogFragment = new com.google.android.gms.common.SupportErrorDialogFragment();
        android.app.Dialog dialog2 = (android.app.Dialog) com.google.android.gms.common.internal.Preconditions.checkNotNull(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        supportErrorDialogFragment.zaa = dialog2;
        if (onCancelListener != null) {
            supportErrorDialogFragment.zab = onCancelListener;
        }
        return supportErrorDialogFragment;
    }
}

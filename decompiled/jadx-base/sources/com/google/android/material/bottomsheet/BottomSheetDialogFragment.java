package com.google.android.material.bottomsheet;

/* JADX INFO: loaded from: classes5.dex */
public class BottomSheetDialogFragment extends androidx.appcompat.app.AppCompatDialogFragment {
    private boolean waitingForDismissAllowingStateLoss;

    public BottomSheetDialogFragment() {
    }

    public BottomSheetDialogFragment(int i) {
        super(i);
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        return new com.google.android.material.bottomsheet.BottomSheetDialog(getContext(), getTheme());
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismiss() {
        if (tryDismissWithAnimation(false)) {
            return;
        }
        super.dismiss();
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismissAllowingStateLoss() {
        if (tryDismissWithAnimation(true)) {
            return;
        }
        super.dismissAllowingStateLoss();
    }

    private boolean tryDismissWithAnimation(boolean z) {
        android.app.Dialog dialog = getDialog();
        if (!(dialog instanceof com.google.android.material.bottomsheet.BottomSheetDialog)) {
            return false;
        }
        com.google.android.material.bottomsheet.BottomSheetDialog bottomSheetDialog = (com.google.android.material.bottomsheet.BottomSheetDialog) dialog;
        com.google.android.material.bottomsheet.BottomSheetBehavior<android.widget.FrameLayout> behavior = bottomSheetDialog.getBehavior();
        if (!behavior.isHideable() || !bottomSheetDialog.getDismissWithAnimation()) {
            return false;
        }
        dismissWithAnimation(behavior, z);
        return true;
    }

    private void dismissWithAnimation(com.google.android.material.bottomsheet.BottomSheetBehavior<?> bottomSheetBehavior, boolean z) {
        this.waitingForDismissAllowingStateLoss = z;
        if (bottomSheetBehavior.getState() == 5) {
            dismissAfterAnimation();
            return;
        }
        if (getDialog() instanceof com.google.android.material.bottomsheet.BottomSheetDialog) {
            ((com.google.android.material.bottomsheet.BottomSheetDialog) getDialog()).removeDefaultCallback();
        }
        bottomSheetBehavior.addBottomSheetCallback(new com.google.android.material.bottomsheet.BottomSheetDialogFragment.BottomSheetDismissCallback());
        bottomSheetBehavior.setState(5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dismissAfterAnimation() {
        if (this.waitingForDismissAllowingStateLoss) {
            super.dismissAllowingStateLoss();
        } else {
            super.dismiss();
        }
    }

    private class BottomSheetDismissCallback extends com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback {
        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(android.view.View view, float f) {
        }

        private BottomSheetDismissCallback() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(android.view.View view, int i) {
            if (i == 5) {
                com.google.android.material.bottomsheet.BottomSheetDialogFragment.this.dismissAfterAnimation();
            }
        }
    }
}

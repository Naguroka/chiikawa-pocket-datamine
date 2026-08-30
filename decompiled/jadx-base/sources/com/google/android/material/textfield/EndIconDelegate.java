package com.google.android.material.textfield;

/* JADX INFO: loaded from: classes5.dex */
abstract class EndIconDelegate {
    final android.content.Context context;
    final com.google.android.material.internal.CheckableImageButton endIconView;
    final com.google.android.material.textfield.EndCompoundLayout endLayout;
    final com.google.android.material.textfield.TextInputLayout textInputLayout;

    void afterEditTextChanged(android.text.Editable editable) {
    }

    void beforeEditTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
    }

    int getIconContentDescriptionResId() {
        return 0;
    }

    int getIconDrawableResId() {
        return 0;
    }

    android.view.View.OnFocusChangeListener getOnEditTextFocusChangeListener() {
        return null;
    }

    android.view.View.OnClickListener getOnIconClickListener() {
        return null;
    }

    android.view.View.OnFocusChangeListener getOnIconViewFocusChangeListener() {
        return null;
    }

    androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener getTouchExplorationStateChangeListener() {
        return null;
    }

    boolean isBoxBackgroundModeSupported(int i) {
        return true;
    }

    boolean isIconActivable() {
        return false;
    }

    boolean isIconActivated() {
        return false;
    }

    boolean isIconCheckable() {
        return false;
    }

    boolean isIconChecked() {
        return false;
    }

    void onEditTextAttached(android.widget.EditText editText) {
    }

    void onInitializeAccessibilityNodeInfo(android.view.View view, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
    }

    void onPopulateAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
    }

    void onSuffixVisibilityChanged(boolean z) {
    }

    void setUp() {
    }

    boolean shouldTintIconOnError() {
        return false;
    }

    void tearDown() {
    }

    EndIconDelegate(com.google.android.material.textfield.EndCompoundLayout endCompoundLayout) {
        this.textInputLayout = endCompoundLayout.textInputLayout;
        this.endLayout = endCompoundLayout;
        this.context = endCompoundLayout.getContext();
        this.endIconView = endCompoundLayout.getEndIconView();
    }

    final void refreshIconState() {
        this.endLayout.refreshIconState(false);
    }
}

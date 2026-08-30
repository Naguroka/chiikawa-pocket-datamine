package com.google.android.material.textfield;

/* JADX INFO: loaded from: classes5.dex */
class PasswordToggleEndIconDelegate extends com.google.android.material.textfield.EndIconDelegate {
    private android.widget.EditText editText;
    private int iconResId;
    private final android.view.View.OnClickListener onIconClickListener;

    @Override // com.google.android.material.textfield.EndIconDelegate
    boolean isIconCheckable() {
        return true;
    }

    /* JADX INFO: renamed from: lambda$new$0$com-google-android-material-textfield-PasswordToggleEndIconDelegate, reason: not valid java name */
    /* synthetic */ void m787x4cc26475(android.view.View view) {
        android.widget.EditText editText = this.editText;
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (hasPasswordTransformation()) {
            this.editText.setTransformationMethod(null);
        } else {
            this.editText.setTransformationMethod(android.text.method.PasswordTransformationMethod.getInstance());
        }
        if (selectionEnd >= 0) {
            this.editText.setSelection(selectionEnd);
        }
        refreshIconState();
    }

    PasswordToggleEndIconDelegate(com.google.android.material.textfield.EndCompoundLayout endCompoundLayout, int i) {
        super(endCompoundLayout);
        this.iconResId = com.google.android.material.R.drawable.design_password_eye;
        this.onIconClickListener = new android.view.View.OnClickListener() { // from class: com.google.android.material.textfield.PasswordToggleEndIconDelegate$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                this.f$0.m787x4cc26475(view);
            }
        };
        if (i != 0) {
            this.iconResId = i;
        }
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    void setUp() {
        if (isInputTypePassword(this.editText)) {
            this.editText.setTransformationMethod(android.text.method.PasswordTransformationMethod.getInstance());
        }
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    void tearDown() {
        android.widget.EditText editText = this.editText;
        if (editText != null) {
            editText.setTransformationMethod(android.text.method.PasswordTransformationMethod.getInstance());
        }
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    int getIconDrawableResId() {
        return this.iconResId;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    int getIconContentDescriptionResId() {
        return com.google.android.material.R.string.password_toggle_content_description;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    boolean isIconChecked() {
        return !hasPasswordTransformation();
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    android.view.View.OnClickListener getOnIconClickListener() {
        return this.onIconClickListener;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    void onEditTextAttached(android.widget.EditText editText) {
        this.editText = editText;
        refreshIconState();
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    void beforeEditTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        refreshIconState();
    }

    private boolean hasPasswordTransformation() {
        android.widget.EditText editText = this.editText;
        return editText != null && (editText.getTransformationMethod() instanceof android.text.method.PasswordTransformationMethod);
    }

    private static boolean isInputTypePassword(android.widget.EditText editText) {
        return editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224);
    }
}

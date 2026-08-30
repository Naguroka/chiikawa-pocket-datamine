package com.google.android.material.textfield;

/* JADX INFO: loaded from: classes5.dex */
class EditTextUtils {
    private EditTextUtils() {
    }

    static boolean isEditable(android.widget.EditText editText) {
        return editText.getInputType() != 0;
    }
}

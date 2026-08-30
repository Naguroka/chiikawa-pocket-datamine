package com.google.android.material.timepicker;

/* JADX INFO: loaded from: classes5.dex */
class TimePickerTextInputKeyController implements android.widget.TextView.OnEditorActionListener, android.view.View.OnKeyListener {
    private final com.google.android.material.timepicker.ChipTextInputComboView hourLayoutComboView;
    private boolean keyListenerRunning = false;
    private final com.google.android.material.timepicker.ChipTextInputComboView minuteLayoutComboView;
    private final com.google.android.material.timepicker.TimeModel time;

    TimePickerTextInputKeyController(com.google.android.material.timepicker.ChipTextInputComboView chipTextInputComboView, com.google.android.material.timepicker.ChipTextInputComboView chipTextInputComboView2, com.google.android.material.timepicker.TimeModel timeModel) {
        this.hourLayoutComboView = chipTextInputComboView;
        this.minuteLayoutComboView = chipTextInputComboView2;
        this.time = timeModel;
    }

    public void bind() {
        com.google.android.material.textfield.TextInputLayout textInput = this.hourLayoutComboView.getTextInput();
        com.google.android.material.textfield.TextInputLayout textInput2 = this.minuteLayoutComboView.getTextInput();
        android.widget.EditText editText = textInput.getEditText();
        android.widget.EditText editText2 = textInput2.getEditText();
        editText.setImeOptions(268435461);
        editText2.setImeOptions(268435462);
        editText.setOnEditorActionListener(this);
        editText.setOnKeyListener(this);
        editText2.setOnKeyListener(this);
    }

    private void moveSelection(int i) {
        this.minuteLayoutComboView.setChecked(i == 12);
        this.hourLayoutComboView.setChecked(i == 10);
        this.time.selection = i;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(android.widget.TextView textView, int i, android.view.KeyEvent keyEvent) {
        boolean z = i == 5;
        if (z) {
            moveSelection(12);
        }
        return z;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(android.view.View view, int i, android.view.KeyEvent keyEvent) {
        boolean zOnHourKeyPress;
        if (this.keyListenerRunning) {
            return false;
        }
        this.keyListenerRunning = true;
        android.widget.EditText editText = (android.widget.EditText) view;
        if (this.time.selection == 12) {
            zOnHourKeyPress = onMinuteKeyPress(i, keyEvent, editText);
        } else {
            zOnHourKeyPress = onHourKeyPress(i, keyEvent, editText);
        }
        this.keyListenerRunning = false;
        return zOnHourKeyPress;
    }

    private boolean onMinuteKeyPress(int i, android.view.KeyEvent keyEvent, android.widget.EditText editText) {
        if (!(i == 67 && keyEvent.getAction() == 0 && android.text.TextUtils.isEmpty(editText.getText()))) {
            return false;
        }
        moveSelection(10);
        return true;
    }

    private boolean onHourKeyPress(int i, android.view.KeyEvent keyEvent, android.widget.EditText editText) {
        android.text.Editable text = editText.getText();
        if (text == null) {
            return false;
        }
        if (!(i >= 7 && i <= 16 && keyEvent.getAction() == 1 && editText.getSelectionStart() == 2 && text.length() == 2)) {
            return false;
        }
        moveSelection(12);
        return true;
    }
}

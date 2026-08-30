package com.google.android.material.theme;

/* JADX INFO: loaded from: classes5.dex */
public class MaterialComponentsViewInflater extends androidx.appcompat.app.AppCompatViewInflater {
    @Override // androidx.appcompat.app.AppCompatViewInflater
    protected androidx.appcompat.widget.AppCompatButton createButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new com.google.android.material.button.MaterialButton(context, attributeSet);
    }

    @Override // androidx.appcompat.app.AppCompatViewInflater
    protected androidx.appcompat.widget.AppCompatCheckBox createCheckBox(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new com.google.android.material.checkbox.MaterialCheckBox(context, attributeSet);
    }

    @Override // androidx.appcompat.app.AppCompatViewInflater
    protected androidx.appcompat.widget.AppCompatRadioButton createRadioButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new com.google.android.material.radiobutton.MaterialRadioButton(context, attributeSet);
    }

    @Override // androidx.appcompat.app.AppCompatViewInflater
    protected androidx.appcompat.widget.AppCompatTextView createTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new com.google.android.material.textview.MaterialTextView(context, attributeSet);
    }

    @Override // androidx.appcompat.app.AppCompatViewInflater
    protected androidx.appcompat.widget.AppCompatAutoCompleteTextView createAutoCompleteTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new com.google.android.material.textfield.MaterialAutoCompleteTextView(context, attributeSet);
    }
}

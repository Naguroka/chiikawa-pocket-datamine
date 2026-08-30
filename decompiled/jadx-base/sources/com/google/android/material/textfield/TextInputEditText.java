package com.google.android.material.textfield;

/* JADX INFO: loaded from: classes5.dex */
public class TextInputEditText extends androidx.appcompat.widget.AppCompatEditText {
    private final android.graphics.Rect parentRect;
    private boolean textInputLayoutFocusedRectEnabled;

    public TextInputEditText(android.content.Context context) {
        this(context, null);
    }

    public TextInputEditText(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.editTextStyle);
    }

    public TextInputEditText(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(context, attributeSet, i, 0), attributeSet, i);
        this.parentRect = new android.graphics.Rect();
        android.content.res.TypedArray typedArrayObtainStyledAttributes = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(context, attributeSet, com.google.android.material.R.styleable.TextInputEditText, i, com.google.android.material.R.style.Widget_Design_TextInputEditText, new int[0]);
        setTextInputLayoutFocusedRectEnabled(typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.TextInputEditText_textInputLayoutFocusedRectEnabled, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.android.material.textfield.TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.isProvidingHint() && super.getHint() == null && com.google.android.material.internal.ManufacturerUtils.isMeizuDevice()) {
            setHint("");
        }
    }

    @Override // android.widget.TextView
    public java.lang.CharSequence getHint() {
        com.google.android.material.textfield.TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.isProvidingHint()) {
            return textInputLayout.getHint();
        }
        return super.getHint();
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        android.view.inputmethod.InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return inputConnectionOnCreateInputConnection;
    }

    private com.google.android.material.textfield.TextInputLayout getTextInputLayout() {
        for (android.view.ViewParent parent = getParent(); parent instanceof android.view.View; parent = parent.getParent()) {
            if (parent instanceof com.google.android.material.textfield.TextInputLayout) {
                return (com.google.android.material.textfield.TextInputLayout) parent;
            }
        }
        return null;
    }

    private java.lang.CharSequence getHintFromLayout() {
        com.google.android.material.textfield.TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z) {
        this.textInputLayoutFocusedRectEnabled = z;
    }

    public boolean isTextInputLayoutFocusedRectEnabled() {
        return this.textInputLayoutFocusedRectEnabled;
    }

    private boolean shouldUseTextInputLayoutFocusedRect(com.google.android.material.textfield.TextInputLayout textInputLayout) {
        return textInputLayout != null && this.textInputLayoutFocusedRectEnabled;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(android.graphics.Rect rect) {
        super.getFocusedRect(rect);
        com.google.android.material.textfield.TextInputLayout textInputLayout = getTextInputLayout();
        if (!shouldUseTextInputLayoutFocusedRect(textInputLayout) || rect == null) {
            return;
        }
        textInputLayout.getFocusedRect(this.parentRect);
        rect.bottom = this.parentRect.bottom;
    }

    @Override // android.view.View
    public boolean getGlobalVisibleRect(android.graphics.Rect rect, android.graphics.Point point) {
        com.google.android.material.textfield.TextInputLayout textInputLayout = getTextInputLayout();
        if (shouldUseTextInputLayoutFocusedRect(textInputLayout)) {
            return textInputLayout.getGlobalVisibleRect(rect, point);
        }
        return super.getGlobalVisibleRect(rect, point);
    }

    @Override // android.view.View
    public boolean requestRectangleOnScreen(android.graphics.Rect rect) {
        com.google.android.material.textfield.TextInputLayout textInputLayout = getTextInputLayout();
        if (shouldUseTextInputLayoutFocusedRect(textInputLayout) && rect != null) {
            this.parentRect.set(rect.left, rect.top, rect.right, rect.bottom + (textInputLayout.getHeight() - getHeight()));
            return super.requestRectangleOnScreen(this.parentRect);
        }
        return super.requestRectangleOnScreen(rect);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        getTextInputLayout();
    }

    private java.lang.String getAccessibilityNodeInfoText(com.google.android.material.textfield.TextInputLayout textInputLayout) {
        android.text.Editable text = getText();
        java.lang.CharSequence hint = textInputLayout.getHint();
        boolean z = !android.text.TextUtils.isEmpty(text);
        java.lang.String string = android.text.TextUtils.isEmpty(hint) ^ true ? hint.toString() : "";
        if (z) {
            return ((java.lang.Object) text) + (android.text.TextUtils.isEmpty(string) ? "" : ", " + string);
        }
        return !android.text.TextUtils.isEmpty(string) ? string : "";
    }
}

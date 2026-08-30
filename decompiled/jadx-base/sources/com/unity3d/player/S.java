package com.unity3d.player;

/* JADX INFO: loaded from: classes6.dex */
abstract class S implements android.text.TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected android.content.Context f3892a;
    protected com.unity3d.player.UnityPlayer b;
    protected android.widget.EditText c = createEditText(this);
    protected boolean d;
    protected boolean e;
    protected com.unity3d.player.F f;
    protected com.unity3d.player.G g;

    public S(android.content.Context context, com.unity3d.player.UnityPlayer unityPlayer) {
        this.f3892a = context;
        this.b = unityPlayer;
    }

    public final java.lang.String a() {
        android.view.inputmethod.InputMethodSubtype currentInputMethodSubtype = ((android.view.inputmethod.InputMethodManager) this.f3892a.getSystemService("input_method")).getCurrentInputMethodSubtype();
        if (currentInputMethodSubtype == null) {
            return null;
        }
        java.lang.String strA = com.unity3d.player.AbstractC1747y.a(currentInputMethodSubtype);
        if (strA != null && !strA.equals("")) {
            return strA;
        }
        return currentInputMethodSubtype.getMode() + " " + currentInputMethodSubtype.getExtraValue();
    }

    public void a(java.lang.String str, int i, boolean z, boolean z2, boolean z3, boolean z4, java.lang.String str2, int i2, boolean z5, boolean z6) {
        this.e = z6;
        setupTextInput(str, i, z, z2, z3, z4, str2, i2);
        a(z5);
    }

    public final void a(java.lang.String str, boolean z) {
        this.c.setSelection(0, 0);
        this.b.reportSoftInputStr(str, 1, z);
    }

    public abstract void a(boolean z);

    @Override // android.text.TextWatcher
    public final void afterTextChanged(android.text.Editable editable) {
        this.b.reportSoftInputStr(editable.toString(), 0, false);
        int selectionStart = this.c.getSelectionStart();
        this.b.reportSoftInputSelection(selectionStart, this.c.getSelectionEnd() - selectionStart);
    }

    public final java.lang.String b() {
        android.widget.EditText editText = this.c;
        if (editText == null) {
            return null;
        }
        return editText.getText().toString();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
    }

    public abstract void c();

    protected abstract android.widget.EditText createEditText(com.unity3d.player.S s);

    public boolean d() {
        return this.e;
    }

    public abstract void e();

    public final void f() {
        ((android.view.inputmethod.InputMethodManager) this.f3892a.getSystemService("input_method")).showSoftInput(this.c, 0);
    }

    protected void invokeOnClose() {
        com.unity3d.player.G g = this.g;
        if (g != null) {
            ((com.unity3d.player.C1730p0) g).a();
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
    }

    protected void setupTextInput(java.lang.String str, int i, boolean z, boolean z2, boolean z3, boolean z4, java.lang.String str2, int i2) {
        this.c.setOnEditorActionListener(new com.unity3d.player.Q(this));
        this.c.setBackgroundColor(-1);
        this.c.setImeOptions(6);
        this.c.setText(str);
        this.c.setHint(str2);
        this.c.setHintTextColor(1627389952);
        android.widget.EditText editText = this.c;
        int i3 = (z ? 32768 : 524288) | (z2 ? 131072 : 0) | (z3 ? 128 : 0);
        if (i >= 0 && i <= 11) {
            int i4 = new int[]{1, 16385, 12290, 17, 2, 3, 8289, 33, 1, 16417, 17, 8194}[i];
            if ((i4 & 2) != 0) {
                i3 = (z3 ? 16 : 0) | i4;
            } else {
                i3 |= i4;
            }
        }
        editText.setInputType(i3);
        this.c.setImeOptions(33554432);
        if (i2 > 0) {
            this.c.setFilters(new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(i2)});
        }
        this.c.addTextChangedListener(this);
        android.widget.EditText editText2 = this.c;
        editText2.setSelection(editText2.getText().length());
        this.c.setClickable(true);
    }
}

package com.google.android.material.timepicker;

/* JADX INFO: loaded from: classes5.dex */
class MaxInputValidator implements android.text.InputFilter {
    private int max;

    public MaxInputValidator(int i) {
        this.max = i;
    }

    public void setMax(int i) {
        this.max = i;
    }

    public int getMax() {
        return this.max;
    }

    @Override // android.text.InputFilter
    public java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i, int i2, android.text.Spanned spanned, int i3, int i4) {
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(spanned);
            sb.replace(i3, i4, charSequence.subSequence(i, i2).toString());
            if (java.lang.Integer.parseInt(sb.toString()) <= this.max) {
                return null;
            }
            return "";
        } catch (java.lang.NumberFormatException unused) {
            return "";
        }
    }
}

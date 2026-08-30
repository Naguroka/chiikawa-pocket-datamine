package androidx.emoji2.text;

/* JADX INFO: loaded from: classes.dex */
class UnprecomputeTextOnModificationSpannable implements android.text.Spannable {
    private android.text.Spannable mDelegate;
    private boolean mSafeToWrite = false;

    UnprecomputeTextOnModificationSpannable(android.text.Spannable spannable) {
        this.mDelegate = spannable;
    }

    UnprecomputeTextOnModificationSpannable(android.text.Spanned spanned) {
        this.mDelegate = new android.text.SpannableString(spanned);
    }

    UnprecomputeTextOnModificationSpannable(java.lang.CharSequence charSequence) {
        this.mDelegate = new android.text.SpannableString(charSequence);
    }

    private void ensureSafeWrites() {
        android.text.Spannable spannable = this.mDelegate;
        if (!this.mSafeToWrite && precomputedTextDetector().isPrecomputedText(spannable)) {
            this.mDelegate = new android.text.SpannableString(spannable);
        }
        this.mSafeToWrite = true;
    }

    android.text.Spannable getUnwrappedSpannable() {
        return this.mDelegate;
    }

    @Override // android.text.Spannable
    public void setSpan(java.lang.Object obj, int i, int i2, int i3) {
        ensureSafeWrites();
        this.mDelegate.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.Spannable
    public void removeSpan(java.lang.Object obj) {
        ensureSafeWrites();
        this.mDelegate.removeSpan(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i, int i2, java.lang.Class<T> cls) {
        return (T[]) this.mDelegate.getSpans(i, i2, cls);
    }

    @Override // android.text.Spanned
    public int getSpanStart(java.lang.Object obj) {
        return this.mDelegate.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(java.lang.Object obj) {
        return this.mDelegate.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(java.lang.Object obj) {
        return this.mDelegate.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, java.lang.Class cls) {
        return this.mDelegate.nextSpanTransition(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.mDelegate.length();
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.mDelegate.charAt(i);
    }

    @Override // java.lang.CharSequence
    public java.lang.CharSequence subSequence(int i, int i2) {
        return this.mDelegate.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public java.lang.String toString() {
        return this.mDelegate.toString();
    }

    @Override // java.lang.CharSequence
    public java.util.stream.IntStream chars() {
        return androidx.emoji2.text.UnprecomputeTextOnModificationSpannable.CharSequenceHelper_API24.chars(this.mDelegate);
    }

    @Override // java.lang.CharSequence
    public java.util.stream.IntStream codePoints() {
        return androidx.emoji2.text.UnprecomputeTextOnModificationSpannable.CharSequenceHelper_API24.codePoints(this.mDelegate);
    }

    private static class CharSequenceHelper_API24 {
        private CharSequenceHelper_API24() {
        }

        static java.util.stream.IntStream codePoints(java.lang.CharSequence charSequence) {
            return charSequence.codePoints();
        }

        static java.util.stream.IntStream chars(java.lang.CharSequence charSequence) {
            return charSequence.chars();
        }
    }

    static androidx.emoji2.text.UnprecomputeTextOnModificationSpannable.PrecomputedTextDetector precomputedTextDetector() {
        return android.os.Build.VERSION.SDK_INT < 28 ? new androidx.emoji2.text.UnprecomputeTextOnModificationSpannable.PrecomputedTextDetector() : new androidx.emoji2.text.UnprecomputeTextOnModificationSpannable.PrecomputedTextDetector_28();
    }

    static class PrecomputedTextDetector {
        PrecomputedTextDetector() {
        }

        boolean isPrecomputedText(java.lang.CharSequence charSequence) {
            return charSequence instanceof androidx.core.text.PrecomputedTextCompat;
        }
    }

    static class PrecomputedTextDetector_28 extends androidx.emoji2.text.UnprecomputeTextOnModificationSpannable.PrecomputedTextDetector {
        PrecomputedTextDetector_28() {
        }

        @Override // androidx.emoji2.text.UnprecomputeTextOnModificationSpannable.PrecomputedTextDetector
        boolean isPrecomputedText(java.lang.CharSequence charSequence) {
            return (charSequence instanceof android.text.PrecomputedText) || (charSequence instanceof androidx.core.text.PrecomputedTextCompat);
        }
    }
}

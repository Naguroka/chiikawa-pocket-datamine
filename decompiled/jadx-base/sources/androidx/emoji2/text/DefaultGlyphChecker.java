package androidx.emoji2.text;

/* JADX INFO: loaded from: classes.dex */
class DefaultGlyphChecker implements androidx.emoji2.text.EmojiCompat.GlyphChecker {
    private static final int PAINT_TEXT_SIZE = 10;
    private static final java.lang.ThreadLocal<java.lang.StringBuilder> sStringBuilder = new java.lang.ThreadLocal<>();
    private final android.text.TextPaint mTextPaint;

    DefaultGlyphChecker() {
        android.text.TextPaint textPaint = new android.text.TextPaint();
        this.mTextPaint = textPaint;
        textPaint.setTextSize(10.0f);
    }

    @Override // androidx.emoji2.text.EmojiCompat.GlyphChecker
    public boolean hasGlyph(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        java.lang.StringBuilder stringBuilder = getStringBuilder();
        stringBuilder.setLength(0);
        while (i < i2) {
            stringBuilder.append(charSequence.charAt(i));
            i++;
        }
        return androidx.core.graphics.PaintCompat.hasGlyph(this.mTextPaint, stringBuilder.toString());
    }

    private static java.lang.StringBuilder getStringBuilder() {
        java.lang.ThreadLocal<java.lang.StringBuilder> threadLocal = sStringBuilder;
        if (threadLocal.get() == null) {
            threadLocal.set(new java.lang.StringBuilder());
        }
        return threadLocal.get();
    }
}

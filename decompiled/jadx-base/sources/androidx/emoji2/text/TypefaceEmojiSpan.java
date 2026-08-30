package androidx.emoji2.text;

/* JADX INFO: loaded from: classes.dex */
public final class TypefaceEmojiSpan extends androidx.emoji2.text.EmojiSpan {
    private static android.graphics.Paint sDebugPaint;

    public TypefaceEmojiSpan(androidx.emoji2.text.EmojiMetadata emojiMetadata) {
        super(emojiMetadata);
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, android.graphics.Paint paint) {
        if (androidx.emoji2.text.EmojiCompat.get().isEmojiSpanIndicatorEnabled()) {
            canvas.drawRect(f, i3, f + getWidth(), i5, getDebugPaint());
        }
        getMetadata().draw(canvas, f, i4, paint);
    }

    private static android.graphics.Paint getDebugPaint() {
        if (sDebugPaint == null) {
            android.text.TextPaint textPaint = new android.text.TextPaint();
            sDebugPaint = textPaint;
            textPaint.setColor(androidx.emoji2.text.EmojiCompat.get().getEmojiSpanIndicatorColor());
            sDebugPaint.setStyle(android.graphics.Paint.Style.FILL);
        }
        return sDebugPaint;
    }
}

package androidx.emoji2.text;

/* JADX INFO: loaded from: classes.dex */
public abstract class EmojiSpan extends android.text.style.ReplacementSpan {
    private final androidx.emoji2.text.EmojiMetadata mMetadata;
    private final android.graphics.Paint.FontMetricsInt mTmpFontMetrics = new android.graphics.Paint.FontMetricsInt();
    private short mWidth = -1;
    private short mHeight = -1;
    private float mRatio = 1.0f;

    EmojiSpan(androidx.emoji2.text.EmojiMetadata emojiMetadata) {
        androidx.core.util.Preconditions.checkNotNull(emojiMetadata, "metadata cannot be null");
        this.mMetadata = emojiMetadata;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(android.graphics.Paint paint, java.lang.CharSequence charSequence, int i, int i2, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.mTmpFontMetrics);
        this.mRatio = (java.lang.Math.abs(this.mTmpFontMetrics.descent - this.mTmpFontMetrics.ascent) * 1.0f) / this.mMetadata.getHeight();
        this.mHeight = (short) (this.mMetadata.getHeight() * this.mRatio);
        this.mWidth = (short) (this.mMetadata.getWidth() * this.mRatio);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = this.mTmpFontMetrics.ascent;
            fontMetricsInt.descent = this.mTmpFontMetrics.descent;
            fontMetricsInt.top = this.mTmpFontMetrics.top;
            fontMetricsInt.bottom = this.mTmpFontMetrics.bottom;
        }
        return this.mWidth;
    }

    public final androidx.emoji2.text.EmojiMetadata getMetadata() {
        return this.mMetadata;
    }

    final int getWidth() {
        return this.mWidth;
    }

    public final int getHeight() {
        return this.mHeight;
    }

    final float getRatio() {
        return this.mRatio;
    }

    public final int getId() {
        return getMetadata().getId();
    }
}

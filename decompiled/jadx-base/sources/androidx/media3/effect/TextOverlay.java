package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
public abstract class TextOverlay extends androidx.media3.effect.BitmapOverlay {
    public static final int TEXT_SIZE_PIXELS = 100;
    private android.graphics.Bitmap lastBitmap;
    private android.text.SpannableString lastText;

    public abstract android.text.SpannableString getText(long j);

    public static androidx.media3.effect.TextOverlay createStaticTextOverlay(final android.text.SpannableString spannableString) {
        return new androidx.media3.effect.TextOverlay() { // from class: androidx.media3.effect.TextOverlay.1
            @Override // androidx.media3.effect.TextOverlay
            public android.text.SpannableString getText(long j) {
                return spannableString;
            }
        };
    }

    public static androidx.media3.effect.TextOverlay createStaticTextOverlay(final android.text.SpannableString spannableString, final androidx.media3.effect.OverlaySettings overlaySettings) {
        return new androidx.media3.effect.TextOverlay() { // from class: androidx.media3.effect.TextOverlay.2
            @Override // androidx.media3.effect.TextOverlay
            public android.text.SpannableString getText(long j) {
                return spannableString;
            }

            @Override // androidx.media3.effect.TextureOverlay
            public androidx.media3.effect.OverlaySettings getOverlaySettings(long j) {
                return overlaySettings;
            }
        };
    }

    @Override // androidx.media3.effect.BitmapOverlay
    public android.graphics.Bitmap getBitmap(long j) {
        android.text.SpannableString text = getText(j);
        if (!text.equals(this.lastText)) {
            this.lastText = text;
            android.text.TextPaint textPaint = new android.text.TextPaint();
            textPaint.setTextSize(100.0f);
            android.text.StaticLayout staticLayoutCreateStaticLayout = createStaticLayout(text, textPaint, getSpannedTextWidth(text, textPaint));
            android.graphics.Bitmap bitmap = this.lastBitmap;
            if (bitmap == null || bitmap.getWidth() != staticLayoutCreateStaticLayout.getWidth() || this.lastBitmap.getHeight() != staticLayoutCreateStaticLayout.getHeight()) {
                this.lastBitmap = android.graphics.Bitmap.createBitmap(staticLayoutCreateStaticLayout.getWidth(), staticLayoutCreateStaticLayout.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
            }
            android.graphics.Canvas canvas = new android.graphics.Canvas((android.graphics.Bitmap) androidx.media3.common.util.Assertions.checkNotNull(this.lastBitmap));
            canvas.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
            staticLayoutCreateStaticLayout.draw(canvas);
        }
        return (android.graphics.Bitmap) androidx.media3.common.util.Assertions.checkNotNull(this.lastBitmap);
    }

    private int getSpannedTextWidth(android.text.SpannableString spannableString, android.text.TextPaint textPaint) {
        android.text.StaticLayout staticLayoutCreateStaticLayout = createStaticLayout(spannableString, textPaint, (int) textPaint.measureText(spannableString, 0, spannableString.length()));
        int lineCount = staticLayoutCreateStaticLayout.getLineCount();
        float lineWidth = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            lineWidth += staticLayoutCreateStaticLayout.getLineWidth(i);
        }
        return (int) java.lang.Math.ceil(lineWidth);
    }

    private android.text.StaticLayout createStaticLayout(android.text.SpannableString spannableString, android.text.TextPaint textPaint, int i) {
        if (androidx.media3.common.util.Util.SDK_INT >= 23) {
            return androidx.media3.effect.TextOverlay.Api23.getStaticLayout(spannableString, textPaint, i);
        }
        return new android.text.StaticLayout(spannableString, textPaint, i, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    private static final class Api23 {
        private Api23() {
        }

        public static android.text.StaticLayout getStaticLayout(android.text.SpannableString spannableString, android.text.TextPaint textPaint, int i) {
            return android.text.StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), textPaint, i).build();
        }
    }
}

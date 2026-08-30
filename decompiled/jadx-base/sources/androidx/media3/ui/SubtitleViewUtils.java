package androidx.media3.ui;

/* JADX INFO: loaded from: classes3.dex */
final class SubtitleViewUtils {
    public static float resolveTextSize(int i, float f, int i2, int i3) {
        float f2;
        if (f == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i == 0) {
            f2 = i3;
        } else {
            if (i != 1) {
                if (i != 2) {
                    return -3.4028235E38f;
                }
                return f;
            }
            f2 = i2;
        }
        return f * f2;
    }

    public static void removeAllEmbeddedStyling(androidx.media3.common.text.Cue.Builder builder) {
        builder.clearWindowColor();
        if (builder.getText() instanceof android.text.Spanned) {
            if (!(builder.getText() instanceof android.text.Spannable)) {
                builder.setText(android.text.SpannableString.valueOf(builder.getText()));
            }
            removeSpansIf((android.text.Spannable) androidx.media3.common.util.Assertions.checkNotNull(builder.getText()), new com.google.common.base.Predicate() { // from class: androidx.media3.ui.SubtitleViewUtils$$ExternalSyntheticLambda0
                @Override // com.google.common.base.Predicate
                public final boolean apply(java.lang.Object obj) {
                    return androidx.media3.ui.SubtitleViewUtils.lambda$removeAllEmbeddedStyling$0(obj);
                }
            });
        }
        removeEmbeddedFontSizes(builder);
    }

    static /* synthetic */ boolean lambda$removeAllEmbeddedStyling$0(java.lang.Object obj) {
        return !(obj instanceof androidx.media3.common.text.LanguageFeatureSpan);
    }

    public static void removeEmbeddedFontSizes(androidx.media3.common.text.Cue.Builder builder) {
        builder.setTextSize(-3.4028235E38f, Integer.MIN_VALUE);
        if (builder.getText() instanceof android.text.Spanned) {
            if (!(builder.getText() instanceof android.text.Spannable)) {
                builder.setText(android.text.SpannableString.valueOf(builder.getText()));
            }
            removeSpansIf((android.text.Spannable) androidx.media3.common.util.Assertions.checkNotNull(builder.getText()), new com.google.common.base.Predicate() { // from class: androidx.media3.ui.SubtitleViewUtils$$ExternalSyntheticLambda1
                @Override // com.google.common.base.Predicate
                public final boolean apply(java.lang.Object obj) {
                    return androidx.media3.ui.SubtitleViewUtils.lambda$removeEmbeddedFontSizes$1(obj);
                }
            });
        }
    }

    static /* synthetic */ boolean lambda$removeEmbeddedFontSizes$1(java.lang.Object obj) {
        return (obj instanceof android.text.style.AbsoluteSizeSpan) || (obj instanceof android.text.style.RelativeSizeSpan);
    }

    private static void removeSpansIf(android.text.Spannable spannable, com.google.common.base.Predicate<java.lang.Object> predicate) {
        for (java.lang.Object obj : spannable.getSpans(0, spannable.length(), java.lang.Object.class)) {
            if (predicate.apply(obj)) {
                spannable.removeSpan(obj);
            }
        }
    }

    private SubtitleViewUtils() {
    }
}

package androidx.core.text;

/* JADX INFO: compiled from: SpannableString.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a%\u0010\u0003\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0086\n\u001a\u001d\u0010\u0003\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0086\n\u001a\r\u0010\u000b\u001a\u00020\u0002*\u00020\fH\u0086\b¨\u0006\r"}, d2 = {"clearSpans", "", "Landroid/text/Spannable;", "set", androidx.media3.extractor.text.ttml.TtmlNode.START, "", androidx.media3.extractor.text.ttml.TtmlNode.END, androidx.media3.extractor.text.ttml.TtmlNode.TAG_SPAN, "", "range", "Lkotlin/ranges/IntRange;", "toSpannable", "", "core-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class SpannableStringKt {
    public static final android.text.Spannable toSpannable(java.lang.CharSequence charSequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        android.text.SpannableString spannableStringValueOf = android.text.SpannableString.valueOf(charSequence);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(spannableStringValueOf, "valueOf(this)");
        return spannableStringValueOf;
    }

    public static final void clearSpans(android.text.Spannable spannable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spannable, "<this>");
        android.text.Spannable spannable2 = spannable;
        java.lang.Object[] spans = spannable2.getSpans(0, spannable2.length(), java.lang.Object.class);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(spans, "getSpans(start, end, T::class.java)");
        for (java.lang.Object obj : spans) {
            spannable.removeSpan(obj);
        }
    }

    public static final void set(android.text.Spannable spannable, int i, int i2, java.lang.Object span) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spannable, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(span, "span");
        spannable.setSpan(span, i, i2, 17);
    }

    public static final void set(android.text.Spannable spannable, kotlin.ranges.IntRange range, java.lang.Object span) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spannable, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(range, "range");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(span, "span");
        spannable.setSpan(span, range.getStart().intValue(), range.getEndInclusive().intValue(), 17);
    }
}

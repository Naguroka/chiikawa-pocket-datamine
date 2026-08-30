package androidx.core.text;

/* JADX INFO: compiled from: SpannableStringBuilder.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\u001a%\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u001a3\u0010\u0007\u001a\u00020\u0004*\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\t2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u001a)\u0010\n\u001a\u00020\u0004*\u00020\u00042\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u001a3\u0010\b\u001a\u00020\u0004*\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\t2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u001a1\u0010\u000b\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u001aB\u0010\u000b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\u000f\"\u00020\r2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001a)\u0010\u0011\u001a\u00020\u0004*\u00020\u00042\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u001a1\u0010\u0012\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00142\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u001a)\u0010\u0015\u001a\u00020\u0004*\u00020\u00042\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u001a)\u0010\u0016\u001a\u00020\u0004*\u00020\u00042\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u001a)\u0010\u0017\u001a\u00020\u0004*\u00020\u00042\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u001a)\u0010\u0018\u001a\u00020\u0004*\u00020\u00042\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0019"}, d2 = {"buildSpannedString", "Landroid/text/SpannedString;", "builderAction", "Lkotlin/Function1;", "Landroid/text/SpannableStringBuilder;", "", "Lkotlin/ExtensionFunctionType;", androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "color", "", androidx.media3.extractor.text.ttml.TtmlNode.BOLD, "inSpans", androidx.media3.extractor.text.ttml.TtmlNode.TAG_SPAN, "", "spans", "", "(Landroid/text/SpannableStringBuilder;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Landroid/text/SpannableStringBuilder;", androidx.media3.extractor.text.ttml.TtmlNode.ITALIC, "scale", "proportion", "", "strikeThrough", "subscript", "superscript", androidx.media3.extractor.text.ttml.TtmlNode.UNDERLINE, "core-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class SpannableStringBuilderKt {
    public static final android.text.SpannedString buildSpannedString(kotlin.jvm.functions.Function1<? super android.text.SpannableStringBuilder, kotlin.Unit> builderAction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        builderAction.invoke(spannableStringBuilder);
        return new android.text.SpannedString(spannableStringBuilder);
    }

    public static final android.text.SpannableStringBuilder inSpans(android.text.SpannableStringBuilder spannableStringBuilder, java.lang.Object[] spans, kotlin.jvm.functions.Function1<? super android.text.SpannableStringBuilder, kotlin.Unit> builderAction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spannableStringBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spans, "spans");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        int length = spannableStringBuilder.length();
        builderAction.invoke(spannableStringBuilder);
        for (java.lang.Object obj : spans) {
            spannableStringBuilder.setSpan(obj, length, spannableStringBuilder.length(), 17);
        }
        return spannableStringBuilder;
    }

    public static final android.text.SpannableStringBuilder inSpans(android.text.SpannableStringBuilder spannableStringBuilder, java.lang.Object span, kotlin.jvm.functions.Function1<? super android.text.SpannableStringBuilder, kotlin.Unit> builderAction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spannableStringBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(span, "span");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        int length = spannableStringBuilder.length();
        builderAction.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(span, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final android.text.SpannableStringBuilder bold(android.text.SpannableStringBuilder spannableStringBuilder, kotlin.jvm.functions.Function1<? super android.text.SpannableStringBuilder, kotlin.Unit> builderAction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spannableStringBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        android.text.style.StyleSpan styleSpan = new android.text.style.StyleSpan(1);
        int length = spannableStringBuilder.length();
        builderAction.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final android.text.SpannableStringBuilder italic(android.text.SpannableStringBuilder spannableStringBuilder, kotlin.jvm.functions.Function1<? super android.text.SpannableStringBuilder, kotlin.Unit> builderAction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spannableStringBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        android.text.style.StyleSpan styleSpan = new android.text.style.StyleSpan(2);
        int length = spannableStringBuilder.length();
        builderAction.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final android.text.SpannableStringBuilder underline(android.text.SpannableStringBuilder spannableStringBuilder, kotlin.jvm.functions.Function1<? super android.text.SpannableStringBuilder, kotlin.Unit> builderAction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spannableStringBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        android.text.style.UnderlineSpan underlineSpan = new android.text.style.UnderlineSpan();
        int length = spannableStringBuilder.length();
        builderAction.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(underlineSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final android.text.SpannableStringBuilder color(android.text.SpannableStringBuilder spannableStringBuilder, int i, kotlin.jvm.functions.Function1<? super android.text.SpannableStringBuilder, kotlin.Unit> builderAction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spannableStringBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        android.text.style.ForegroundColorSpan foregroundColorSpan = new android.text.style.ForegroundColorSpan(i);
        int length = spannableStringBuilder.length();
        builderAction.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final android.text.SpannableStringBuilder backgroundColor(android.text.SpannableStringBuilder spannableStringBuilder, int i, kotlin.jvm.functions.Function1<? super android.text.SpannableStringBuilder, kotlin.Unit> builderAction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spannableStringBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        android.text.style.BackgroundColorSpan backgroundColorSpan = new android.text.style.BackgroundColorSpan(i);
        int length = spannableStringBuilder.length();
        builderAction.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(backgroundColorSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final android.text.SpannableStringBuilder strikeThrough(android.text.SpannableStringBuilder spannableStringBuilder, kotlin.jvm.functions.Function1<? super android.text.SpannableStringBuilder, kotlin.Unit> builderAction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spannableStringBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        android.text.style.StrikethroughSpan strikethroughSpan = new android.text.style.StrikethroughSpan();
        int length = spannableStringBuilder.length();
        builderAction.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(strikethroughSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final android.text.SpannableStringBuilder scale(android.text.SpannableStringBuilder spannableStringBuilder, float f, kotlin.jvm.functions.Function1<? super android.text.SpannableStringBuilder, kotlin.Unit> builderAction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spannableStringBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        android.text.style.RelativeSizeSpan relativeSizeSpan = new android.text.style.RelativeSizeSpan(f);
        int length = spannableStringBuilder.length();
        builderAction.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(relativeSizeSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final android.text.SpannableStringBuilder superscript(android.text.SpannableStringBuilder spannableStringBuilder, kotlin.jvm.functions.Function1<? super android.text.SpannableStringBuilder, kotlin.Unit> builderAction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spannableStringBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        android.text.style.SuperscriptSpan superscriptSpan = new android.text.style.SuperscriptSpan();
        int length = spannableStringBuilder.length();
        builderAction.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(superscriptSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final android.text.SpannableStringBuilder subscript(android.text.SpannableStringBuilder spannableStringBuilder, kotlin.jvm.functions.Function1<? super android.text.SpannableStringBuilder, kotlin.Unit> builderAction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spannableStringBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        android.text.style.SubscriptSpan subscriptSpan = new android.text.style.SubscriptSpan();
        int length = spannableStringBuilder.length();
        builderAction.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(subscriptSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }
}

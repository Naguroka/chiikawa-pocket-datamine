package androidx.core.text;

/* JADX INFO: compiled from: Html.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0086\b\u001a\u0017\u0010\t\u001a\u00020\u0002*\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u0004H\u0086\b¨\u0006\u000b"}, d2 = {"parseAsHtml", "Landroid/text/Spanned;", "", "flags", "", "imageGetter", "Landroid/text/Html$ImageGetter;", "tagHandler", "Landroid/text/Html$TagHandler;", "toHtml", "option", "core-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class HtmlKt {
    public static /* synthetic */ android.text.Spanned parseAsHtml$default(java.lang.String str, int i, android.text.Html.ImageGetter imageGetter, android.text.Html.TagHandler tagHandler, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            imageGetter = null;
        }
        if ((i2 & 4) != 0) {
            tagHandler = null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        android.text.Spanned spannedFromHtml = androidx.core.text.HtmlCompat.fromHtml(str, i, imageGetter, tagHandler);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(spannedFromHtml, "fromHtml(this, flags, imageGetter, tagHandler)");
        return spannedFromHtml;
    }

    public static final android.text.Spanned parseAsHtml(java.lang.String str, int i, android.text.Html.ImageGetter imageGetter, android.text.Html.TagHandler tagHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        android.text.Spanned spannedFromHtml = androidx.core.text.HtmlCompat.fromHtml(str, i, imageGetter, tagHandler);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(spannedFromHtml, "fromHtml(this, flags, imageGetter, tagHandler)");
        return spannedFromHtml;
    }

    public static /* synthetic */ java.lang.String toHtml$default(android.text.Spanned spanned, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spanned, "<this>");
        java.lang.String html = androidx.core.text.HtmlCompat.toHtml(spanned, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(html, "toHtml(this, option)");
        return html;
    }

    public static final java.lang.String toHtml(android.text.Spanned spanned, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spanned, "<this>");
        java.lang.String html = androidx.core.text.HtmlCompat.toHtml(spanned, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(html, "toHtml(this, option)");
        return html;
    }
}

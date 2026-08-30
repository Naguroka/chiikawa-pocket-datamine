package androidx.core.text;

/* JADX INFO: loaded from: classes.dex */
public final class HtmlCompat {
    public static final int FROM_HTML_MODE_COMPACT = 63;
    public static final int FROM_HTML_MODE_LEGACY = 0;
    public static final int FROM_HTML_OPTION_USE_CSS_COLORS = 256;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_BLOCKQUOTE = 32;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_DIV = 16;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_HEADING = 2;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_LIST = 8;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_LIST_ITEM = 4;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_PARAGRAPH = 1;
    public static final int TO_HTML_PARAGRAPH_LINES_CONSECUTIVE = 0;
    public static final int TO_HTML_PARAGRAPH_LINES_INDIVIDUAL = 1;

    public static android.text.Spanned fromHtml(java.lang.String str, int i) {
        return androidx.core.text.HtmlCompat.Api24Impl.fromHtml(str, i);
    }

    public static android.text.Spanned fromHtml(java.lang.String str, int i, android.text.Html.ImageGetter imageGetter, android.text.Html.TagHandler tagHandler) {
        return androidx.core.text.HtmlCompat.Api24Impl.fromHtml(str, i, imageGetter, tagHandler);
    }

    public static java.lang.String toHtml(android.text.Spanned spanned, int i) {
        return androidx.core.text.HtmlCompat.Api24Impl.toHtml(spanned, i);
    }

    private HtmlCompat() {
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static android.text.Spanned fromHtml(java.lang.String str, int i) {
            return android.text.Html.fromHtml(str, i);
        }

        static android.text.Spanned fromHtml(java.lang.String str, int i, android.text.Html.ImageGetter imageGetter, android.text.Html.TagHandler tagHandler) {
            return android.text.Html.fromHtml(str, i, imageGetter, tagHandler);
        }

        static java.lang.String toHtml(android.text.Spanned spanned, int i) {
            return android.text.Html.toHtml(spanned, i);
        }
    }
}

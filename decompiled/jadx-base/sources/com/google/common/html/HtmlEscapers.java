package com.google.common.html;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.html.ElementTypesAreNonnullByDefault
public final class HtmlEscapers {
    private static final com.google.common.escape.Escaper HTML_ESCAPER = com.google.common.escape.Escapers.builder().addEscape(kotlin.text.Typography.quote, "&quot;").addEscape('\'', "&#39;").addEscape(kotlin.text.Typography.amp, "&amp;").addEscape(kotlin.text.Typography.less, "&lt;").addEscape(kotlin.text.Typography.greater, "&gt;").build();

    public static com.google.common.escape.Escaper htmlEscaper() {
        return HTML_ESCAPER;
    }

    private HtmlEscapers() {
    }
}

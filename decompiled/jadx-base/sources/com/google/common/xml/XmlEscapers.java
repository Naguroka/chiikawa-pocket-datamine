package com.google.common.xml;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.xml.ElementTypesAreNonnullByDefault
public class XmlEscapers {
    private static final char MAX_ASCII_CONTROL_CHAR = 31;
    private static final char MIN_ASCII_CONTROL_CHAR = 0;
    private static final com.google.common.escape.Escaper XML_ATTRIBUTE_ESCAPER;
    private static final com.google.common.escape.Escaper XML_CONTENT_ESCAPER;
    private static final com.google.common.escape.Escaper XML_ESCAPER;

    private XmlEscapers() {
    }

    public static com.google.common.escape.Escaper xmlContentEscaper() {
        return XML_CONTENT_ESCAPER;
    }

    public static com.google.common.escape.Escaper xmlAttributeEscaper() {
        return XML_ATTRIBUTE_ESCAPER;
    }

    static {
        com.google.common.escape.Escapers.Builder builder = com.google.common.escape.Escapers.builder();
        builder.setSafeRange((char) 0, okio.Utf8.REPLACEMENT_CHARACTER);
        builder.setUnsafeReplacement("�");
        for (char c = 0; c <= 31; c = (char) (c + 1)) {
            if (c != '\t' && c != '\n' && c != '\r') {
                builder.addEscape(c, "�");
            }
        }
        builder.addEscape(kotlin.text.Typography.amp, "&amp;");
        builder.addEscape(kotlin.text.Typography.less, "&lt;");
        builder.addEscape(kotlin.text.Typography.greater, "&gt;");
        XML_CONTENT_ESCAPER = builder.build();
        builder.addEscape('\'', "&apos;");
        builder.addEscape(kotlin.text.Typography.quote, "&quot;");
        XML_ESCAPER = builder.build();
        builder.addEscape('\t', "&#x9;");
        builder.addEscape('\n', "&#xA;");
        builder.addEscape('\r', "&#xD;");
        XML_ATTRIBUTE_ESCAPER = builder.build();
    }
}

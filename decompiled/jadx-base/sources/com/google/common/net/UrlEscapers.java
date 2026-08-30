package com.google.common.net;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.net.ElementTypesAreNonnullByDefault
public final class UrlEscapers {
    static final java.lang.String URL_PATH_OTHER_SAFE_CHARS_LACKING_PLUS = "-._~!$'()*,;&=@:";
    static final java.lang.String URL_FORM_PARAMETER_OTHER_SAFE_CHARS = "-_.*";
    private static final com.google.common.escape.Escaper URL_FORM_PARAMETER_ESCAPER = new com.google.common.net.PercentEscaper(URL_FORM_PARAMETER_OTHER_SAFE_CHARS, true);
    private static final com.google.common.escape.Escaper URL_PATH_SEGMENT_ESCAPER = new com.google.common.net.PercentEscaper("-._~!$'()*,;&=@:+", false);
    private static final com.google.common.escape.Escaper URL_FRAGMENT_ESCAPER = new com.google.common.net.PercentEscaper("-._~!$'()*,;&=@:+/?", false);

    private UrlEscapers() {
    }

    public static com.google.common.escape.Escaper urlFormParameterEscaper() {
        return URL_FORM_PARAMETER_ESCAPER;
    }

    public static com.google.common.escape.Escaper urlPathSegmentEscaper() {
        return URL_PATH_SEGMENT_ESCAPER;
    }

    public static com.google.common.escape.Escaper urlFragmentEscaper() {
        return URL_FRAGMENT_ESCAPER;
    }
}

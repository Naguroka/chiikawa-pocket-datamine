package com.json.environment;

/* JADX INFO: loaded from: classes5.dex */
public class StringUtils {
    public static java.lang.String decodeURI(java.lang.String str) {
        try {
            return java.net.URLDecoder.decode(str, com.adjust.sdk.Constants.ENCODING);
        } catch (java.io.UnsupportedEncodingException e) {
            com.json.l9.d().a(e);
            return "";
        }
    }

    public static java.lang.String encodeURI(java.lang.String str) {
        try {
            return java.net.URLEncoder.encode(str, com.adjust.sdk.Constants.ENCODING).replace("+", "%20");
        } catch (java.io.UnsupportedEncodingException e) {
            com.json.l9.d().a(e);
            return "";
        }
    }

    public static java.lang.String toLowerCase(java.lang.String str) {
        return str == null ? "" : str.toLowerCase(java.util.Locale.ENGLISH);
    }

    public static java.lang.String toUpperCase(java.lang.String str) {
        return str == null ? "" : str.toUpperCase(java.util.Locale.ENGLISH);
    }
}

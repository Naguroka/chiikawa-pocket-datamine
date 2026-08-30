package com.google.android.gms.auth;

/* JADX INFO: loaded from: classes4.dex */
public final class CookieUtil {
    private CookieUtil() {
    }

    private static boolean zza(java.lang.Boolean bool) {
        return bool != null && bool.booleanValue();
    }

    public static java.lang.String getCookieUrl(java.lang.String str, java.lang.Boolean bool) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        java.lang.String str2 = zza(bool) ? "https" : androidx.webkit.ProxyConfig.MATCH_HTTP;
        return new java.lang.StringBuilder(str2.length() + 3 + java.lang.String.valueOf(str).length()).append(str2).append("://").append(str).toString();
    }

    public static java.lang.String getCookieValue(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Long l) {
        java.lang.StringBuilder sbAppend = new java.lang.StringBuilder(str).append('=');
        if (!android.text.TextUtils.isEmpty(str2)) {
            sbAppend.append(str2);
        }
        if (zza(bool)) {
            sbAppend.append(";HttpOnly");
        }
        if (zza(bool2)) {
            sbAppend.append(";Secure");
        }
        if (!android.text.TextUtils.isEmpty(str3)) {
            sbAppend.append(";Domain=").append(str3);
        }
        if (!android.text.TextUtils.isEmpty(str4)) {
            sbAppend.append(";Path=").append(str4);
        }
        if (l != null && l.longValue() > 0) {
            sbAppend.append(";Max-Age=").append(l);
        }
        return sbAppend.toString();
    }
}

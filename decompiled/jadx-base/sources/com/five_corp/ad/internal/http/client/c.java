package com.five_corp.ad.internal.http.client;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.regex.Pattern f1921a = java.util.regex.Pattern.compile("bytes (\\d+)-(\\d+)/.*$");
    public static final java.util.regex.Pattern b = java.util.regex.Pattern.compile("bytes .+/(\\d+)");

    public static int a(java.lang.String str, java.util.regex.Pattern pattern, int i) {
        if (str == null) {
            return -1;
        }
        java.util.regex.Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -1;
        }
        java.lang.String strGroup = matcher.group(i);
        if (strGroup.equals(androidx.webkit.ProxyConfig.MATCH_ALL_SCHEMES)) {
            return -1;
        }
        try {
            return java.lang.Integer.parseInt(strGroup);
        } catch (java.lang.Exception unused) {
            return -1;
        }
    }
}

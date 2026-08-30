package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ra {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.util.regex.Pattern f1224a = java.util.regex.Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");
    private static final java.util.regex.Pattern b = java.util.regex.Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    public static java.lang.String a(long j, long j2) {
        if (j == 0 && j2 == -1) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("bytes=");
        sb.append(j);
        sb.append("-");
        if (j2 != -1) {
            sb.append((j + j2) - 1);
        }
        return sb.toString();
    }

    public static long a(java.lang.String str, java.lang.String str2) {
        long j;
        if (android.text.TextUtils.isEmpty(str)) {
            j = -1;
        } else {
            try {
                j = java.lang.Long.parseLong(str);
            } catch (java.lang.NumberFormatException unused) {
                com.applovin.impl.oc.b("HttpUtil", "Unexpected Content-Length [" + str + com.ironsource.y8.i.e);
                j = -1;
            }
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            return j;
        }
        java.util.regex.Matcher matcher = f1224a.matcher(str2);
        if (!matcher.matches()) {
            return j;
        }
        try {
            long j2 = (java.lang.Long.parseLong((java.lang.String) com.applovin.impl.b1.a((java.lang.Object) matcher.group(2))) - java.lang.Long.parseLong((java.lang.String) com.applovin.impl.b1.a((java.lang.Object) matcher.group(1)))) + 1;
            if (j < 0) {
                return j2;
            }
            if (j == j2) {
                return j;
            }
            com.applovin.impl.oc.d("HttpUtil", "Inconsistent headers [" + str + "] [" + str2 + com.ironsource.y8.i.e);
            return java.lang.Math.max(j, j2);
        } catch (java.lang.NumberFormatException unused2) {
            com.applovin.impl.oc.b("HttpUtil", "Unexpected Content-Range [" + str2 + com.ironsource.y8.i.e);
            return j;
        }
    }

    public static long a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return -1L;
        }
        java.util.regex.Matcher matcher = b.matcher(str);
        if (matcher.matches()) {
            return java.lang.Long.parseLong((java.lang.String) com.applovin.impl.b1.a((java.lang.Object) matcher.group(1)));
        }
        return -1L;
    }
}

package com.iab.omid.library.ironsrc;

/* JADX INFO: loaded from: classes5.dex */
class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.util.regex.Pattern f2422a = java.util.regex.Pattern.compile("<(head)( [^>]*)?>", 2);
    private static final java.util.regex.Pattern b = java.util.regex.Pattern.compile("<(head)( [^>]*)?/>", 2);
    private static final java.util.regex.Pattern c = java.util.regex.Pattern.compile("<(body)( [^>]*?)?>", 2);
    private static final java.util.regex.Pattern d = java.util.regex.Pattern.compile("<(body)( [^>]*?)?/>", 2);
    private static final java.util.regex.Pattern e = java.util.regex.Pattern.compile("<(html)( [^>]*?)?>", 2);
    private static final java.util.regex.Pattern f = java.util.regex.Pattern.compile("<(html)( [^>]*?)?/>", 2);
    private static final java.util.regex.Pattern g = java.util.regex.Pattern.compile("<!DOCTYPE [^>]*>", 2);

    static java.lang.String a(java.lang.String str, java.lang.String str2) {
        com.iab.omid.library.ironsrc.utils.g.a(str, "HTML is null or empty");
        int[][] iArrA = a(str);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + str2.length() + 16);
        if (!b(str, sb, b, str2, iArrA) && !a(str, sb, f2422a, str2, iArrA) && !b(str, sb, d, str2, iArrA) && !a(str, sb, c, str2, iArrA) && !b(str, sb, f, str2, iArrA) && !a(str, sb, e, str2, iArrA) && !a(str, sb, g, str2, iArrA)) {
            return str2 + str;
        }
        return sb.toString();
    }

    private static boolean a(int i, int[][] iArr) {
        if (iArr != null) {
            for (int[] iArr2 : iArr) {
                if (i >= iArr2[0] && i <= iArr2[1]) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean a(java.lang.String str, java.lang.StringBuilder sb, java.util.regex.Pattern pattern, java.lang.String str2, int[][] iArr) {
        java.util.regex.Matcher matcher = pattern.matcher(str);
        int i = 0;
        while (matcher.find(i)) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            if (!a(iStart, iArr)) {
                sb.append(str.substring(0, matcher.end()));
                sb.append(str2);
                sb.append(str.substring(matcher.end()));
                return true;
            }
            i = iEnd;
        }
        return false;
    }

    private static int[][] a(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = str.length();
        int i = 0;
        while (i < length) {
            int iIndexOf = str.indexOf("<!--", i);
            if (iIndexOf >= 0) {
                int iIndexOf2 = str.indexOf("-->", iIndexOf);
                int[] iArr = new int[2];
                if (iIndexOf2 >= 0) {
                    iArr[0] = iIndexOf;
                    iArr[1] = iIndexOf2;
                    arrayList.add(iArr);
                    i = iIndexOf2 + 3;
                } else {
                    iArr[0] = iIndexOf;
                    iArr[1] = length;
                    arrayList.add(iArr);
                }
            }
            i = length;
        }
        return (int[][]) arrayList.toArray((int[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Integer.TYPE, 0, 2));
    }

    static java.lang.String b(java.lang.String str, java.lang.String str2) {
        return a(str2, "<script type=\"text/javascript\">" + str + "</script>");
    }

    private static boolean b(java.lang.String str, java.lang.StringBuilder sb, java.util.regex.Pattern pattern, java.lang.String str2, int[][] iArr) {
        java.util.regex.Matcher matcher = pattern.matcher(str);
        int i = 0;
        while (matcher.find(i)) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            if (!a(iStart, iArr)) {
                sb.append(str.substring(0, matcher.end() - 2));
                sb.append(">");
                sb.append(str2);
                sb.append("</");
                sb.append(matcher.group(1));
                sb.append(">");
                sb.append(str.substring(matcher.end()));
                return true;
            }
            i = iEnd;
        }
        return false;
    }
}

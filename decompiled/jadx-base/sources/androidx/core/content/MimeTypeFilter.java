package androidx.core.content;

/* JADX INFO: loaded from: classes.dex */
public final class MimeTypeFilter {
    private MimeTypeFilter() {
    }

    private static boolean mimeTypeAgainstFilter(java.lang.String[] strArr, java.lang.String[] strArr2) {
        if (strArr2.length != 2) {
            throw new java.lang.IllegalArgumentException("Ill-formatted MIME type filter. Must be type/subtype.");
        }
        if (strArr2[0].isEmpty() || strArr2[1].isEmpty()) {
            throw new java.lang.IllegalArgumentException("Ill-formatted MIME type filter. Type or subtype empty.");
        }
        if (strArr.length != 2) {
            return false;
        }
        if (androidx.webkit.ProxyConfig.MATCH_ALL_SCHEMES.equals(strArr2[0]) || strArr2[0].equals(strArr[0])) {
            return androidx.webkit.ProxyConfig.MATCH_ALL_SCHEMES.equals(strArr2[1]) || strArr2[1].equals(strArr[1]);
        }
        return false;
    }

    public static boolean matches(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            return false;
        }
        return mimeTypeAgainstFilter(str.split("/"), str2.split("/"));
    }

    public static java.lang.String matches(java.lang.String str, java.lang.String[] strArr) {
        if (str == null) {
            return null;
        }
        java.lang.String[] strArrSplit = str.split("/");
        for (java.lang.String str2 : strArr) {
            if (mimeTypeAgainstFilter(strArrSplit, str2.split("/"))) {
                return str2;
            }
        }
        return null;
    }

    public static java.lang.String matches(java.lang.String[] strArr, java.lang.String str) {
        if (strArr == null) {
            return null;
        }
        java.lang.String[] strArrSplit = str.split("/");
        for (java.lang.String str2 : strArr) {
            if (mimeTypeAgainstFilter(str2.split("/"), strArrSplit)) {
                return str2;
            }
        }
        return null;
    }

    public static java.lang.String[] matchesMany(java.lang.String[] strArr, java.lang.String str) {
        if (strArr == null) {
            return new java.lang.String[0];
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String[] strArrSplit = str.split("/");
        for (java.lang.String str2 : strArr) {
            if (mimeTypeAgainstFilter(str2.split("/"), strArrSplit)) {
                arrayList.add(str2);
            }
        }
        return (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]);
    }
}

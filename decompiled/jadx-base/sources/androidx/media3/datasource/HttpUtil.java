package androidx.media3.datasource;

/* JADX INFO: loaded from: classes.dex */
public final class HttpUtil {
    private static final java.lang.String TAG = "HttpUtil";
    private static final java.util.regex.Pattern CONTENT_RANGE_WITH_START_AND_END = java.util.regex.Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");
    private static final java.util.regex.Pattern CONTENT_RANGE_WITH_SIZE = java.util.regex.Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    private HttpUtil() {
    }

    public static java.lang.String buildRangeRequestHeader(long j, long j2) {
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

    public static long getDocumentSize(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return -1L;
        }
        java.util.regex.Matcher matcher = CONTENT_RANGE_WITH_SIZE.matcher(str);
        if (matcher.matches()) {
            return java.lang.Long.parseLong((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(matcher.group(1)));
        }
        return -1L;
    }

    public static long getContentLength(java.lang.String str, java.lang.String str2) {
        long j;
        if (android.text.TextUtils.isEmpty(str)) {
            j = -1;
        } else {
            try {
                j = java.lang.Long.parseLong(str);
            } catch (java.lang.NumberFormatException unused) {
                androidx.media3.common.util.Log.e(TAG, "Unexpected Content-Length [" + str + com.ironsource.y8.i.e);
                j = -1;
            }
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            return j;
        }
        java.util.regex.Matcher matcher = CONTENT_RANGE_WITH_START_AND_END.matcher(str2);
        if (!matcher.matches()) {
            return j;
        }
        try {
            long j2 = (java.lang.Long.parseLong((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(matcher.group(2))) - java.lang.Long.parseLong((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(matcher.group(1)))) + 1;
            if (j < 0) {
                return j2;
            }
            if (j == j2) {
                return j;
            }
            androidx.media3.common.util.Log.w(TAG, "Inconsistent headers [" + str + "] [" + str2 + com.ironsource.y8.i.e);
            return java.lang.Math.max(j, j2);
        } catch (java.lang.NumberFormatException unused2) {
            androidx.media3.common.util.Log.e(TAG, "Unexpected Content-Range [" + str2 + com.ironsource.y8.i.e);
            return j;
        }
    }
}

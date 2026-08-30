package com.google.android.datatransport.runtime.logging;

/* JADX INFO: loaded from: classes4.dex */
public final class Logging {
    private static final java.lang.String LOG_PREFIX = "TRuntime.";
    private static final int MAX_LOG_TAG_SIZE_IN_SDK_N = 23;

    private Logging() {
    }

    private static java.lang.String getTag(java.lang.String str) {
        return android.os.Build.VERSION.SDK_INT < 26 ? concatTag(LOG_PREFIX, str) : LOG_PREFIX + str;
    }

    private static java.lang.String concatTag(java.lang.String str, java.lang.String str2) {
        java.lang.String str3 = str + str2;
        return str3.length() > 23 ? str3.substring(0, 23) : str3;
    }

    public static void d(java.lang.String str, java.lang.String str2) {
        java.lang.String tag = getTag(str);
        if (android.util.Log.isLoggable(tag, 3)) {
            android.util.Log.d(tag, str2);
        }
    }

    public static void d(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        java.lang.String tag = getTag(str);
        if (android.util.Log.isLoggable(tag, 3)) {
            android.util.Log.d(tag, java.lang.String.format(str2, obj));
        }
    }

    public static void d(java.lang.String str, java.lang.String str2, java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String tag = getTag(str);
        if (android.util.Log.isLoggable(tag, 3)) {
            android.util.Log.d(tag, java.lang.String.format(str2, obj, obj2));
        }
    }

    public static void d(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        java.lang.String tag = getTag(str);
        if (android.util.Log.isLoggable(tag, 3)) {
            android.util.Log.d(tag, java.lang.String.format(str2, objArr));
        }
    }

    public static void i(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        java.lang.String tag = getTag(str);
        if (android.util.Log.isLoggable(tag, 4)) {
            android.util.Log.i(tag, java.lang.String.format(str2, obj));
        }
    }

    public static void e(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        java.lang.String tag = getTag(str);
        if (android.util.Log.isLoggable(tag, 6)) {
            android.util.Log.e(tag, str2, th);
        }
    }

    public static void w(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        java.lang.String tag = getTag(str);
        if (android.util.Log.isLoggable(tag, 5)) {
            android.util.Log.w(tag, java.lang.String.format(str2, obj));
        }
    }
}

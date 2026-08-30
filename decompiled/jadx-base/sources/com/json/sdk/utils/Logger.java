package com.json.sdk.utils;

/* JADX INFO: loaded from: classes5.dex */
public class Logger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f3404a;

    public static void d(java.lang.String str, java.lang.String str2) {
        if (f3404a) {
            android.util.Log.d(str, str2);
        }
    }

    public static void d(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        if (f3404a) {
            android.util.Log.d(str, str2, th);
        }
    }

    public static void e(java.lang.String str, java.lang.String str2) {
        if (f3404a) {
            android.util.Log.e(str, str2);
        }
    }

    public static void e(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        if (f3404a) {
            android.util.Log.e(str, str2, th);
        }
    }

    public static void enableLogging(int i) {
        f3404a = com.ironsource.zg.d.MODE_0.a() != i;
    }

    public static void i(java.lang.String str, java.lang.String str2) {
        if (f3404a) {
            android.util.Log.i(str, str2);
        }
    }

    public static void i(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        if (!f3404a || android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        android.util.Log.i(str, str2, th);
    }

    public static void v(java.lang.String str, java.lang.String str2) {
        if (f3404a) {
            android.util.Log.v(str, str2);
        }
    }

    public static void v(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        if (f3404a) {
            android.util.Log.v(str, str2, th);
        }
    }

    public static void w(java.lang.String str, java.lang.String str2) {
        if (f3404a) {
            android.util.Log.w(str, str2);
        }
    }

    public static void w(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        if (f3404a) {
            android.util.Log.w(str, str2, th);
        }
    }
}

package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class oc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f1119a = 0;
    private static boolean b = true;

    public static void d(java.lang.String str, java.lang.String str2) {
        if (f1119a <= 2) {
            android.util.Log.w(str, str2);
        }
    }

    public static void b(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        c(str, a(str2, th));
    }

    public static void c(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        d(str, a(str2, th));
    }

    public static void c(java.lang.String str, java.lang.String str2) {
        if (f1119a <= 1) {
            android.util.Log.i(str, str2);
        }
    }

    private static java.lang.String a(java.lang.String str, java.lang.Throwable th) {
        java.lang.String strA = a(th);
        return !android.text.TextUtils.isEmpty(strA) ? str + "\n  " + strA.replace("\n", "\n  ") + '\n' : str;
    }

    private static boolean b(java.lang.Throwable th) {
        while (th != null) {
            if (th instanceof java.net.UnknownHostException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    public static void b(java.lang.String str, java.lang.String str2) {
        if (f1119a <= 3) {
            android.util.Log.e(str, str2);
        }
    }

    public static void a(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        b(str, a(str2, th));
    }

    public static java.lang.String a(java.lang.Throwable th) {
        if (th == null) {
            return null;
        }
        if (b(th)) {
            return "UnknownHostException (no network)";
        }
        if (!b) {
            return th.getMessage();
        }
        return android.util.Log.getStackTraceString(th).trim().replace("\t", "    ");
    }

    public static void a(java.lang.String str, java.lang.String str2) {
        if (f1119a == 0) {
            android.util.Log.d(str, str2);
        }
    }
}

package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.Thread f1141a = android.os.Looper.getMainLooper().getThread();

    public static void a(java.lang.Throwable th) {
    }

    public static void a(java.lang.Throwable th, java.lang.String str, java.lang.Object... objArr) {
    }

    public static boolean a(boolean z) {
        return a(z, "Assertion failed", new java.lang.Object[0]);
    }

    public static boolean a(boolean z, java.lang.String str, java.lang.Object... objArr) {
        if (!z) {
            a(str, objArr);
        }
        return z;
    }

    public static boolean a(java.lang.Object obj) {
        return a(obj, "Null value not expected", new java.lang.Object[0]);
    }

    public static boolean a(java.lang.Object obj, java.lang.String str, java.lang.Object... objArr) {
        return a(obj != null, str, objArr);
    }

    public static void a(java.lang.String str, java.lang.Object... objArr) {
        a((java.lang.Throwable) null, str, objArr);
    }
}

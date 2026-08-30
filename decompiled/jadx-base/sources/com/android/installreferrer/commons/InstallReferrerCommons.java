package com.android.installreferrer.commons;

/* JADX INFO: loaded from: classes3.dex */
public final class InstallReferrerCommons {
    public static void logVerbose(java.lang.String str, java.lang.String str2) {
        if (android.util.Log.isLoggable(str, 2)) {
            android.util.Log.v(str, str2);
        }
    }

    public static void logWarn(java.lang.String str, java.lang.String str2) {
        if (android.util.Log.isLoggable(str, 5)) {
            android.util.Log.w(str, str2);
        }
    }
}

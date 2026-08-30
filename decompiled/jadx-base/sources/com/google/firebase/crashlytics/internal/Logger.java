package com.google.firebase.crashlytics.internal;

/* JADX INFO: loaded from: classes5.dex */
public class Logger {
    private int logLevel = 4;
    private final java.lang.String tag;
    public static final java.lang.String TAG = "FirebaseCrashlytics";
    static final com.google.firebase.crashlytics.internal.Logger DEFAULT_LOGGER = new com.google.firebase.crashlytics.internal.Logger(TAG);

    public Logger(java.lang.String str) {
        this.tag = str;
    }

    public static com.google.firebase.crashlytics.internal.Logger getLogger() {
        return DEFAULT_LOGGER;
    }

    private boolean canLog(int i) {
        return this.logLevel <= i || android.util.Log.isLoggable(this.tag, i);
    }

    public void d(java.lang.String str, java.lang.Throwable th) {
        if (canLog(3)) {
            android.util.Log.d(this.tag, str, th);
        }
    }

    public void v(java.lang.String str, java.lang.Throwable th) {
        if (canLog(2)) {
            android.util.Log.v(this.tag, str, th);
        }
    }

    public void i(java.lang.String str, java.lang.Throwable th) {
        if (canLog(4)) {
            android.util.Log.i(this.tag, str, th);
        }
    }

    public void w(java.lang.String str, java.lang.Throwable th) {
        if (canLog(5)) {
            android.util.Log.w(this.tag, str, th);
        }
    }

    public void e(java.lang.String str, java.lang.Throwable th) {
        if (canLog(6)) {
            android.util.Log.e(this.tag, str, th);
        }
    }

    public void d(java.lang.String str) {
        d(str, null);
    }

    public void v(java.lang.String str) {
        v(str, null);
    }

    public void i(java.lang.String str) {
        i(str, null);
    }

    public void w(java.lang.String str) {
        w(str, null);
    }

    public void e(java.lang.String str) {
        e(str, null);
    }

    public void log(int i, java.lang.String str) {
        log(i, str, false);
    }

    public void log(int i, java.lang.String str, boolean z) {
        if (z || canLog(i)) {
            android.util.Log.println(i, this.tag, str);
        }
    }
}

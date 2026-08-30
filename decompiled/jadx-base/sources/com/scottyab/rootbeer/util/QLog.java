package com.scottyab.rootbeer.util;

/* JADX INFO: loaded from: classes3.dex */
public final class QLog {
    public static final int ALL = 5;
    public static final int ERRORS_ONLY = 1;
    public static final int ERRORS_WARNINGS = 2;
    public static final int ERRORS_WARNINGS_INFO = 3;
    public static final int ERRORS_WARNINGS_INFO_DEBUG = 4;
    public static int LOGGING_LEVEL = 5;
    public static final int NONE = 0;
    private static final java.lang.String TAG = "RootBeer";
    private static final java.lang.String TAG_GENERAL_OUTPUT = "QLog";

    public static void e(java.lang.Object obj, java.lang.Throwable th) {
        if (isELoggable()) {
            android.util.Log.e(TAG, getTrace() + java.lang.String.valueOf(obj));
            android.util.Log.e(TAG, getThrowableTrace(th));
            android.util.Log.e(TAG_GENERAL_OUTPUT, getTrace() + java.lang.String.valueOf(obj));
            android.util.Log.e(TAG_GENERAL_OUTPUT, getThrowableTrace(th));
        }
    }

    public static void e(java.lang.Object obj) {
        if (isELoggable()) {
            android.util.Log.e(TAG, getTrace() + java.lang.String.valueOf(obj));
            android.util.Log.e(TAG_GENERAL_OUTPUT, getTrace() + java.lang.String.valueOf(obj));
        }
    }

    public static void e(java.lang.Exception exc) {
        if (isELoggable()) {
            exc.printStackTrace();
        }
    }

    public static void w(java.lang.Object obj, java.lang.Throwable th) {
        if (isWLoggable()) {
            android.util.Log.w(TAG, getTrace() + java.lang.String.valueOf(obj));
            android.util.Log.w(TAG, getThrowableTrace(th));
            android.util.Log.w(TAG_GENERAL_OUTPUT, getTrace() + java.lang.String.valueOf(obj));
            android.util.Log.w(TAG_GENERAL_OUTPUT, getThrowableTrace(th));
        }
    }

    public static void w(java.lang.Object obj) {
        if (isWLoggable()) {
            android.util.Log.w(TAG, getTrace() + java.lang.String.valueOf(obj));
            android.util.Log.w(TAG_GENERAL_OUTPUT, getTrace() + java.lang.String.valueOf(obj));
        }
    }

    public static void i(java.lang.Object obj) {
        if (isILoggable()) {
            android.util.Log.i(TAG, getTrace() + java.lang.String.valueOf(obj));
        }
    }

    public static void d(java.lang.Object obj) {
        if (isDLoggable()) {
            android.util.Log.d(TAG, getTrace() + java.lang.String.valueOf(obj));
        }
    }

    public static void v(java.lang.Object obj) {
        if (isVLoggable()) {
            android.util.Log.v(TAG, getTrace() + java.lang.String.valueOf(obj));
        }
    }

    public static boolean isVLoggable() {
        return LOGGING_LEVEL > 4;
    }

    public static boolean isDLoggable() {
        return LOGGING_LEVEL > 3;
    }

    public static boolean isILoggable() {
        return LOGGING_LEVEL > 2;
    }

    public static boolean isWLoggable() {
        return LOGGING_LEVEL > 1;
    }

    public static boolean isELoggable() {
        return LOGGING_LEVEL > 0;
    }

    private static java.lang.String getThrowableTrace(java.lang.Throwable th) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        th.printStackTrace(new java.io.PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    private static java.lang.String getTrace() {
        java.lang.StackTraceElement[] stackTrace = new java.lang.Throwable().getStackTrace();
        java.lang.String methodName = stackTrace[2].getMethodName();
        java.lang.String className = stackTrace[2].getClassName();
        return className.substring(className.lastIndexOf(46) + 1) + ": " + methodName + "() [" + stackTrace[2].getLineNumber() + "] - ";
    }

    private QLog() {
    }
}

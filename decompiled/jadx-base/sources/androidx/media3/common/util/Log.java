package androidx.media3.common.util;

/* JADX INFO: loaded from: classes.dex */
public final class Log {
    public static final int LOG_LEVEL_ALL = 0;
    public static final int LOG_LEVEL_ERROR = 3;
    public static final int LOG_LEVEL_INFO = 1;
    public static final int LOG_LEVEL_OFF = Integer.MAX_VALUE;
    public static final int LOG_LEVEL_WARNING = 2;
    private static int logLevel = 0;
    private static boolean logStackTraces = true;
    private static final java.lang.Object lock = new java.lang.Object();
    private static androidx.media3.common.util.Log.Logger logger = androidx.media3.common.util.Log.Logger.DEFAULT;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface LogLevel {
    }

    public interface Logger {
        public static final androidx.media3.common.util.Log.Logger DEFAULT = new androidx.media3.common.util.Log.Logger() { // from class: androidx.media3.common.util.Log.Logger.1
            @Override // androidx.media3.common.util.Log.Logger
            public void d(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
                android.util.Log.d(str, androidx.media3.common.util.Log.appendThrowableString(str2, th));
            }

            @Override // androidx.media3.common.util.Log.Logger
            public void i(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
                android.util.Log.i(str, androidx.media3.common.util.Log.appendThrowableString(str2, th));
            }

            @Override // androidx.media3.common.util.Log.Logger
            public void w(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
                android.util.Log.w(str, androidx.media3.common.util.Log.appendThrowableString(str2, th));
            }

            @Override // androidx.media3.common.util.Log.Logger
            public void e(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
                android.util.Log.e(str, androidx.media3.common.util.Log.appendThrowableString(str2, th));
            }
        };

        void d(java.lang.String str, java.lang.String str2, java.lang.Throwable th);

        void e(java.lang.String str, java.lang.String str2, java.lang.Throwable th);

        void i(java.lang.String str, java.lang.String str2, java.lang.Throwable th);

        void w(java.lang.String str, java.lang.String str2, java.lang.Throwable th);
    }

    private Log() {
    }

    @org.checkerframework.dataflow.qual.Pure
    public static int getLogLevel() {
        int i;
        synchronized (lock) {
            i = logLevel;
        }
        return i;
    }

    public static void setLogLevel(int i) {
        synchronized (lock) {
            logLevel = i;
        }
    }

    public static void setLogStackTraces(boolean z) {
        synchronized (lock) {
            logStackTraces = z;
        }
    }

    public static void setLogger(androidx.media3.common.util.Log.Logger logger2) {
        synchronized (lock) {
            logger = logger2;
        }
    }

    @org.checkerframework.dataflow.qual.Pure
    public static void d(java.lang.String str, java.lang.String str2) {
        synchronized (lock) {
            if (logLevel == 0) {
                logger.d(str, str2, null);
            }
        }
    }

    @org.checkerframework.dataflow.qual.Pure
    public static void d(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        synchronized (lock) {
            if (logLevel == 0) {
                logger.d(str, str2, th);
            }
        }
    }

    @org.checkerframework.dataflow.qual.Pure
    public static void i(java.lang.String str, java.lang.String str2) {
        synchronized (lock) {
            if (logLevel <= 1) {
                logger.i(str, str2, null);
            }
        }
    }

    @org.checkerframework.dataflow.qual.Pure
    public static void i(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        synchronized (lock) {
            if (logLevel <= 1) {
                logger.i(str, str2, th);
            }
        }
    }

    @org.checkerframework.dataflow.qual.Pure
    public static void w(java.lang.String str, java.lang.String str2) {
        synchronized (lock) {
            if (logLevel <= 2) {
                logger.w(str, str2, null);
            }
        }
    }

    @org.checkerframework.dataflow.qual.Pure
    public static void w(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        synchronized (lock) {
            if (logLevel <= 2) {
                logger.w(str, str2, th);
            }
        }
    }

    @org.checkerframework.dataflow.qual.Pure
    public static void e(java.lang.String str, java.lang.String str2) {
        synchronized (lock) {
            if (logLevel <= 3) {
                logger.e(str, str2, null);
            }
        }
    }

    @org.checkerframework.dataflow.qual.Pure
    public static void e(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        synchronized (lock) {
            if (logLevel <= 3) {
                logger.e(str, str2, th);
            }
        }
    }

    @org.checkerframework.dataflow.qual.Pure
    public static java.lang.String getThrowableString(java.lang.Throwable th) {
        if (th == null) {
            return null;
        }
        synchronized (lock) {
            if (isCausedByUnknownHostException(th)) {
                return "UnknownHostException (no network)";
            }
            if (!logStackTraces) {
                return th.getMessage();
            }
            return android.util.Log.getStackTraceString(th).trim().replace("\t", "    ");
        }
    }

    @org.checkerframework.dataflow.qual.Pure
    public static java.lang.String appendThrowableString(java.lang.String str, java.lang.Throwable th) {
        java.lang.String throwableString = getThrowableString(th);
        return !android.text.TextUtils.isEmpty(throwableString) ? str + "\n  " + throwableString.replace("\n", "\n  ") + '\n' : str;
    }

    @org.checkerframework.dataflow.qual.Pure
    private static boolean isCausedByUnknownHostException(java.lang.Throwable th) {
        while (th != null) {
            if (th instanceof java.net.UnknownHostException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }
}

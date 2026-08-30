package com.adjust.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class Logger implements com.adjust.sdk.ILogger {
    private static java.lang.String formatErrorMessage = "Error formating log message: %s, with params: %s";
    private com.adjust.sdk.LogLevel logLevel;
    private boolean isProductionEnvironment = false;
    private boolean logLevelLocked = false;

    public Logger() {
        setLogLevel(com.adjust.sdk.LogLevel.INFO, false);
    }

    @Override // com.adjust.sdk.ILogger
    public void Assert(java.lang.String str, java.lang.Object... objArr) {
        if (!this.isProductionEnvironment && this.logLevel.androidLogLevel <= 7) {
            try {
                android.util.Log.println(7, com.adjust.sdk.Constants.LOGTAG, com.adjust.sdk.Util.formatString(str, objArr));
            } catch (java.lang.Exception unused) {
                android.util.Log.e(com.adjust.sdk.Constants.LOGTAG, com.adjust.sdk.Util.formatString(formatErrorMessage, str, java.util.Arrays.toString(objArr)));
            }
        }
    }

    @Override // com.adjust.sdk.ILogger
    public void debug(java.lang.String str, java.lang.Object... objArr) {
        if (!this.isProductionEnvironment && this.logLevel.androidLogLevel <= 3) {
            try {
                android.util.Log.d(com.adjust.sdk.Constants.LOGTAG, com.adjust.sdk.Util.formatString(str, objArr));
            } catch (java.lang.Exception unused) {
                android.util.Log.e(com.adjust.sdk.Constants.LOGTAG, com.adjust.sdk.Util.formatString(formatErrorMessage, str, java.util.Arrays.toString(objArr)));
            }
        }
    }

    @Override // com.adjust.sdk.ILogger
    public void error(java.lang.String str, java.lang.Object... objArr) {
        if (!this.isProductionEnvironment && this.logLevel.androidLogLevel <= 6) {
            try {
                android.util.Log.e(com.adjust.sdk.Constants.LOGTAG, com.adjust.sdk.Util.formatString(str, objArr));
            } catch (java.lang.Exception unused) {
                android.util.Log.e(com.adjust.sdk.Constants.LOGTAG, com.adjust.sdk.Util.formatString(formatErrorMessage, str, java.util.Arrays.toString(objArr)));
            }
        }
    }

    @Override // com.adjust.sdk.ILogger
    public void info(java.lang.String str, java.lang.Object... objArr) {
        if (!this.isProductionEnvironment && this.logLevel.androidLogLevel <= 4) {
            try {
                android.util.Log.i(com.adjust.sdk.Constants.LOGTAG, com.adjust.sdk.Util.formatString(str, objArr));
            } catch (java.lang.Exception unused) {
                android.util.Log.e(com.adjust.sdk.Constants.LOGTAG, com.adjust.sdk.Util.formatString(formatErrorMessage, str, java.util.Arrays.toString(objArr)));
            }
        }
    }

    @Override // com.adjust.sdk.ILogger
    public void lockLogLevel() {
        this.logLevelLocked = true;
    }

    @Override // com.adjust.sdk.ILogger
    public void setLogLevel(com.adjust.sdk.LogLevel logLevel, boolean z) {
        if (this.logLevelLocked) {
            return;
        }
        this.logLevel = logLevel;
        this.isProductionEnvironment = z;
    }

    @Override // com.adjust.sdk.ILogger
    public void setLogLevelString(java.lang.String str, boolean z) {
        if (str != null) {
            try {
                setLogLevel(com.adjust.sdk.LogLevel.valueOf(str.toUpperCase(java.util.Locale.US)), z);
            } catch (java.lang.IllegalArgumentException unused) {
                error("Malformed logLevel '%s', falling back to 'info'", str);
            }
        }
    }

    @Override // com.adjust.sdk.ILogger
    public void verbose(java.lang.String str, java.lang.Object... objArr) {
        if (!this.isProductionEnvironment && this.logLevel.androidLogLevel <= 2) {
            try {
                android.util.Log.v(com.adjust.sdk.Constants.LOGTAG, com.adjust.sdk.Util.formatString(str, objArr));
            } catch (java.lang.Exception unused) {
                android.util.Log.e(com.adjust.sdk.Constants.LOGTAG, com.adjust.sdk.Util.formatString(formatErrorMessage, str, java.util.Arrays.toString(objArr)));
            }
        }
    }

    @Override // com.adjust.sdk.ILogger
    public void warn(java.lang.String str, java.lang.Object... objArr) {
        if (!this.isProductionEnvironment && this.logLevel.androidLogLevel <= 5) {
            try {
                android.util.Log.w(com.adjust.sdk.Constants.LOGTAG, com.adjust.sdk.Util.formatString(str, objArr));
            } catch (java.lang.Exception unused) {
                android.util.Log.e(com.adjust.sdk.Constants.LOGTAG, com.adjust.sdk.Util.formatString(formatErrorMessage, str, java.util.Arrays.toString(objArr)));
            }
        }
    }

    @Override // com.adjust.sdk.ILogger
    public void warnInProduction(java.lang.String str, java.lang.Object... objArr) {
        if (this.logLevel.androidLogLevel <= 5) {
            try {
                android.util.Log.w(com.adjust.sdk.Constants.LOGTAG, com.adjust.sdk.Util.formatString(str, objArr));
            } catch (java.lang.Exception unused) {
                android.util.Log.e(com.adjust.sdk.Constants.LOGTAG, com.adjust.sdk.Util.formatString(formatErrorMessage, str, java.util.Arrays.toString(objArr)));
            }
        }
    }
}

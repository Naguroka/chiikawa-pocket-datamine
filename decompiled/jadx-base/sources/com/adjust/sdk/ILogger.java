package com.adjust.sdk;

/* JADX INFO: loaded from: classes3.dex */
public interface ILogger {
    void Assert(java.lang.String str, java.lang.Object... objArr);

    void debug(java.lang.String str, java.lang.Object... objArr);

    void error(java.lang.String str, java.lang.Object... objArr);

    void info(java.lang.String str, java.lang.Object... objArr);

    void lockLogLevel();

    void setLogLevel(com.adjust.sdk.LogLevel logLevel, boolean z);

    void setLogLevelString(java.lang.String str, boolean z);

    void verbose(java.lang.String str, java.lang.Object... objArr);

    void warn(java.lang.String str, java.lang.Object... objArr);

    void warnInProduction(java.lang.String str, java.lang.Object... objArr);
}

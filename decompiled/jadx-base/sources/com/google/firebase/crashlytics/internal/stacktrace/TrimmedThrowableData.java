package com.google.firebase.crashlytics.internal.stacktrace;

/* JADX INFO: loaded from: classes5.dex */
public class TrimmedThrowableData {
    public final com.google.firebase.crashlytics.internal.stacktrace.TrimmedThrowableData cause;
    public final java.lang.String className;
    public final java.lang.String localizedMessage;
    public final java.lang.StackTraceElement[] stacktrace;

    private TrimmedThrowableData(java.lang.String str, java.lang.String str2, java.lang.StackTraceElement[] stackTraceElementArr, com.google.firebase.crashlytics.internal.stacktrace.TrimmedThrowableData trimmedThrowableData) {
        this.localizedMessage = str;
        this.className = str2;
        this.stacktrace = stackTraceElementArr;
        this.cause = trimmedThrowableData;
    }

    public static com.google.firebase.crashlytics.internal.stacktrace.TrimmedThrowableData makeTrimmedThrowableData(java.lang.Throwable th, com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy stackTraceTrimmingStrategy) {
        java.util.Stack stack = new java.util.Stack();
        while (th != null) {
            stack.push(th);
            th = th.getCause();
        }
        com.google.firebase.crashlytics.internal.stacktrace.TrimmedThrowableData trimmedThrowableData = null;
        while (!stack.isEmpty()) {
            java.lang.Throwable th2 = (java.lang.Throwable) stack.pop();
            trimmedThrowableData = new com.google.firebase.crashlytics.internal.stacktrace.TrimmedThrowableData(th2.getLocalizedMessage(), th2.getClass().getName(), stackTraceTrimmingStrategy.getTrimmedStackTrace(th2.getStackTrace()), trimmedThrowableData);
        }
        return trimmedThrowableData;
    }
}

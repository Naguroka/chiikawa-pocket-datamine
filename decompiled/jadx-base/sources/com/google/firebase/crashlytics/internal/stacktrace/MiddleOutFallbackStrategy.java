package com.google.firebase.crashlytics.internal.stacktrace;

/* JADX INFO: loaded from: classes5.dex */
public class MiddleOutFallbackStrategy implements com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy {
    private final int maximumStackSize;
    private final com.google.firebase.crashlytics.internal.stacktrace.MiddleOutStrategy middleOutStrategy;
    private final com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy[] trimmingStrategies;

    public MiddleOutFallbackStrategy(int i, com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy... stackTraceTrimmingStrategyArr) {
        this.maximumStackSize = i;
        this.trimmingStrategies = stackTraceTrimmingStrategyArr;
        this.middleOutStrategy = new com.google.firebase.crashlytics.internal.stacktrace.MiddleOutStrategy(i);
    }

    @Override // com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy
    public java.lang.StackTraceElement[] getTrimmedStackTrace(java.lang.StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.maximumStackSize) {
            return stackTraceElementArr;
        }
        java.lang.StackTraceElement[] trimmedStackTrace = stackTraceElementArr;
        for (com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy stackTraceTrimmingStrategy : this.trimmingStrategies) {
            if (trimmedStackTrace.length <= this.maximumStackSize) {
                break;
            }
            trimmedStackTrace = stackTraceTrimmingStrategy.getTrimmedStackTrace(stackTraceElementArr);
        }
        return trimmedStackTrace.length > this.maximumStackSize ? this.middleOutStrategy.getTrimmedStackTrace(trimmedStackTrace) : trimmedStackTrace;
    }
}

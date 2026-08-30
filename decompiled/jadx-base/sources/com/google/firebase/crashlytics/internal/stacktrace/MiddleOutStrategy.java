package com.google.firebase.crashlytics.internal.stacktrace;

/* JADX INFO: loaded from: classes5.dex */
public class MiddleOutStrategy implements com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy {
    private final int trimmedSize;

    public MiddleOutStrategy(int i) {
        this.trimmedSize = i;
    }

    @Override // com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy
    public java.lang.StackTraceElement[] getTrimmedStackTrace(java.lang.StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i = this.trimmedSize;
        if (length <= i) {
            return stackTraceElementArr;
        }
        int i2 = i / 2;
        int i3 = i - i2;
        java.lang.StackTraceElement[] stackTraceElementArr2 = new java.lang.StackTraceElement[i];
        java.lang.System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i3);
        java.lang.System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i2, stackTraceElementArr2, i3, i2);
        return stackTraceElementArr2;
    }
}

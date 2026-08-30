package com.google.firebase.crashlytics.internal.stacktrace;

/* JADX INFO: loaded from: classes5.dex */
public class RemoveRepeatsStrategy implements com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy {
    private final int maxRepetitions;

    public RemoveRepeatsStrategy() {
        this(1);
    }

    public RemoveRepeatsStrategy(int i) {
        this.maxRepetitions = i;
    }

    @Override // com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy
    public java.lang.StackTraceElement[] getTrimmedStackTrace(java.lang.StackTraceElement[] stackTraceElementArr) {
        java.lang.StackTraceElement[] stackTraceElementArrTrimRepeats = trimRepeats(stackTraceElementArr, this.maxRepetitions);
        return stackTraceElementArrTrimRepeats.length < stackTraceElementArr.length ? stackTraceElementArrTrimRepeats : stackTraceElementArr;
    }

    private static java.lang.StackTraceElement[] trimRepeats(java.lang.StackTraceElement[] stackTraceElementArr, int i) {
        int i2;
        java.util.HashMap map = new java.util.HashMap();
        java.lang.StackTraceElement[] stackTraceElementArr2 = new java.lang.StackTraceElement[stackTraceElementArr.length];
        int i3 = 0;
        int i4 = 0;
        int i5 = 1;
        while (i3 < stackTraceElementArr.length) {
            java.lang.StackTraceElement stackTraceElement = stackTraceElementArr[i3];
            java.lang.Integer num = (java.lang.Integer) map.get(stackTraceElement);
            if (num == null || !isRepeatingSequence(stackTraceElementArr, num.intValue(), i3)) {
                stackTraceElementArr2[i4] = stackTraceElementArr[i3];
                i4++;
                i5 = 1;
                i2 = i3;
            } else {
                int iIntValue = i3 - num.intValue();
                if (i5 < i) {
                    java.lang.System.arraycopy(stackTraceElementArr, i3, stackTraceElementArr2, i4, iIntValue);
                    i4 += iIntValue;
                    i5++;
                }
                i2 = (iIntValue - 1) + i3;
            }
            map.put(stackTraceElement, java.lang.Integer.valueOf(i3));
            i3 = i2 + 1;
        }
        java.lang.StackTraceElement[] stackTraceElementArr3 = new java.lang.StackTraceElement[i4];
        java.lang.System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i4);
        return stackTraceElementArr3;
    }

    private static boolean isRepeatingSequence(java.lang.StackTraceElement[] stackTraceElementArr, int i, int i2) {
        int i3 = i2 - i;
        if (i2 + i3 > stackTraceElementArr.length) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!stackTraceElementArr[i + i4].equals(stackTraceElementArr[i2 + i4])) {
                return false;
            }
        }
        return true;
    }
}

package com.unity3d.ads.core.extensions;

/* JADX INFO: compiled from: ExceptionExtensions.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0003\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"retrieveUnityCrashValue", "", "", "unity-ads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ExceptionExtensionsKt {
    public static final java.lang.String retrieveUnityCrashValue(java.lang.Throwable th) {
        java.lang.StackTraceElement stackTraceElement;
        boolean zContains$default;
        java.lang.String className;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "<this>");
        java.lang.StackTraceElement[] stackTrace = th.getStackTrace();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(stackTrace, "this.stackTrace");
        java.lang.StackTraceElement[] stackTraceElementArr = stackTrace;
        int length = stackTraceElementArr.length;
        int i = 0;
        while (true) {
            stackTraceElement = null;
            if (i >= length) {
                break;
            }
            java.lang.StackTraceElement stackTraceElement2 = stackTraceElementArr[i];
            java.lang.StackTraceElement stackTraceElement3 = stackTraceElement2;
            if (stackTraceElement3 == null || (className = stackTraceElement3.getClassName()) == null) {
                zContains$default = false;
            } else {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(className, "className");
                zContains$default = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) className, (java.lang.CharSequence) com.unity3d.services.SDKErrorHandler.UNITY_PACKAGE, false, 2, (java.lang.Object) null);
            }
            if (zContains$default) {
                stackTraceElement = stackTraceElement2;
                break;
            }
            i++;
        }
        java.lang.StackTraceElement stackTraceElement4 = stackTraceElement;
        if (stackTraceElement4 == null) {
            return "unknown";
        }
        java.lang.String fileName = stackTraceElement4.getFileName();
        if (fileName == null) {
            fileName = "unknown";
        } else {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fileName, "it.fileName ?: SDKErrorHandler.UNKNOWN_FILE");
        }
        java.lang.String str = fileName + '_' + stackTraceElement4.getLineNumber();
        return str != null ? str : "unknown";
    }
}

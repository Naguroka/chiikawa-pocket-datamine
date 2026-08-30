package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes6.dex */
public class Intrinsics {
    public static int compare(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public static int compare(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    private Intrinsics() {
    }

    public static java.lang.String stringPlus(java.lang.String str, java.lang.Object obj) {
        return str + obj;
    }

    public static void checkNotNull(java.lang.Object obj) {
        if (obj == null) {
            throwJavaNpe();
        }
    }

    public static void checkNotNull(java.lang.Object obj, java.lang.String str) {
        if (obj == null) {
            throwJavaNpe(str);
        }
    }

    public static void throwNpe() {
        throw ((kotlin.KotlinNullPointerException) sanitizeStackTrace(new kotlin.KotlinNullPointerException()));
    }

    public static void throwNpe(java.lang.String str) {
        throw ((kotlin.KotlinNullPointerException) sanitizeStackTrace(new kotlin.KotlinNullPointerException(str)));
    }

    public static void throwJavaNpe() {
        throw ((java.lang.NullPointerException) sanitizeStackTrace(new java.lang.NullPointerException()));
    }

    public static void throwJavaNpe(java.lang.String str) {
        throw ((java.lang.NullPointerException) sanitizeStackTrace(new java.lang.NullPointerException(str)));
    }

    public static void throwUninitializedProperty(java.lang.String str) {
        throw ((kotlin.UninitializedPropertyAccessException) sanitizeStackTrace(new kotlin.UninitializedPropertyAccessException(str)));
    }

    public static void throwUninitializedPropertyAccessException(java.lang.String str) {
        throwUninitializedProperty("lateinit property " + str + " has not been initialized");
    }

    public static void throwAssert() {
        throw ((java.lang.AssertionError) sanitizeStackTrace(new java.lang.AssertionError()));
    }

    public static void throwAssert(java.lang.String str) {
        throw ((java.lang.AssertionError) sanitizeStackTrace(new java.lang.AssertionError(str)));
    }

    public static void throwIllegalArgument() {
        throw ((java.lang.IllegalArgumentException) sanitizeStackTrace(new java.lang.IllegalArgumentException()));
    }

    public static void throwIllegalArgument(java.lang.String str) {
        throw ((java.lang.IllegalArgumentException) sanitizeStackTrace(new java.lang.IllegalArgumentException(str)));
    }

    public static void throwIllegalState() {
        throw ((java.lang.IllegalStateException) sanitizeStackTrace(new java.lang.IllegalStateException()));
    }

    public static void throwIllegalState(java.lang.String str) {
        throw ((java.lang.IllegalStateException) sanitizeStackTrace(new java.lang.IllegalStateException(str)));
    }

    public static void checkExpressionValueIsNotNull(java.lang.Object obj, java.lang.String str) {
        if (obj == null) {
            throw ((java.lang.IllegalStateException) sanitizeStackTrace(new java.lang.IllegalStateException(str + " must not be null")));
        }
    }

    public static void checkNotNullExpressionValue(java.lang.Object obj, java.lang.String str) {
        if (obj == null) {
            throw ((java.lang.NullPointerException) sanitizeStackTrace(new java.lang.NullPointerException(str + " must not be null")));
        }
    }

    public static void checkReturnedValueIsNotNull(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
        if (obj == null) {
            throw ((java.lang.IllegalStateException) sanitizeStackTrace(new java.lang.IllegalStateException("Method specified as non-null returned null: " + str + "." + str2)));
        }
    }

    public static void checkReturnedValueIsNotNull(java.lang.Object obj, java.lang.String str) {
        if (obj == null) {
            throw ((java.lang.IllegalStateException) sanitizeStackTrace(new java.lang.IllegalStateException(str)));
        }
    }

    public static void checkFieldIsNotNull(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
        if (obj == null) {
            throw ((java.lang.IllegalStateException) sanitizeStackTrace(new java.lang.IllegalStateException("Field specified as non-null is null: " + str + "." + str2)));
        }
    }

    public static void checkFieldIsNotNull(java.lang.Object obj, java.lang.String str) {
        if (obj == null) {
            throw ((java.lang.IllegalStateException) sanitizeStackTrace(new java.lang.IllegalStateException(str)));
        }
    }

    public static void checkParameterIsNotNull(java.lang.Object obj, java.lang.String str) {
        if (obj == null) {
            throwParameterIsNullIAE(str);
        }
    }

    public static void checkNotNullParameter(java.lang.Object obj, java.lang.String str) {
        if (obj == null) {
            throwParameterIsNullNPE(str);
        }
    }

    private static void throwParameterIsNullIAE(java.lang.String str) {
        throw ((java.lang.IllegalArgumentException) sanitizeStackTrace(new java.lang.IllegalArgumentException(createParameterIsNullExceptionMessage(str))));
    }

    private static void throwParameterIsNullNPE(java.lang.String str) {
        throw ((java.lang.NullPointerException) sanitizeStackTrace(new java.lang.NullPointerException(createParameterIsNullExceptionMessage(str))));
    }

    private static java.lang.String createParameterIsNullExceptionMessage(java.lang.String str) {
        java.lang.StackTraceElement[] stackTrace = java.lang.Thread.currentThread().getStackTrace();
        java.lang.String name = kotlin.jvm.internal.Intrinsics.class.getName();
        int i = 0;
        while (!stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        while (stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        java.lang.StackTraceElement stackTraceElement = stackTrace[i];
        return "Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str;
    }

    public static boolean areEqual(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static boolean areEqual(java.lang.Double d, java.lang.Double d2) {
        if (d == null) {
            if (d2 == null) {
                return true;
            }
        } else if (d2 != null && d.doubleValue() == d2.doubleValue()) {
            return true;
        }
        return false;
    }

    public static boolean areEqual(java.lang.Double d, double d2) {
        return d != null && d.doubleValue() == d2;
    }

    public static boolean areEqual(double d, java.lang.Double d2) {
        return d2 != null && d == d2.doubleValue();
    }

    public static boolean areEqual(java.lang.Float f, java.lang.Float f2) {
        if (f == null) {
            if (f2 == null) {
                return true;
            }
        } else if (f2 != null && f.floatValue() == f2.floatValue()) {
            return true;
        }
        return false;
    }

    public static boolean areEqual(java.lang.Float f, float f2) {
        return f != null && f.floatValue() == f2;
    }

    public static boolean areEqual(float f, java.lang.Float f2) {
        return f2 != null && f == f2.floatValue();
    }

    public static void throwUndefinedForReified() {
        throwUndefinedForReified("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void throwUndefinedForReified(java.lang.String str) {
        throw new java.lang.UnsupportedOperationException(str);
    }

    public static void reifiedOperationMarker(int i, java.lang.String str) {
        throwUndefinedForReified();
    }

    public static void reifiedOperationMarker(int i, java.lang.String str, java.lang.String str2) {
        throwUndefinedForReified(str2);
    }

    public static void needClassReification() {
        throwUndefinedForReified();
    }

    public static void needClassReification(java.lang.String str) {
        throwUndefinedForReified(str);
    }

    public static void checkHasClass(java.lang.String str) throws java.lang.ClassNotFoundException {
        java.lang.String strReplace = str.replace('/', '.');
        try {
            java.lang.Class.forName(strReplace);
        } catch (java.lang.ClassNotFoundException e) {
            throw ((java.lang.ClassNotFoundException) sanitizeStackTrace(new java.lang.ClassNotFoundException("Class " + strReplace + " is not found. Please update the Kotlin runtime to the latest version", e)));
        }
    }

    public static void checkHasClass(java.lang.String str, java.lang.String str2) throws java.lang.ClassNotFoundException {
        java.lang.String strReplace = str.replace('/', '.');
        try {
            java.lang.Class.forName(strReplace);
        } catch (java.lang.ClassNotFoundException e) {
            throw ((java.lang.ClassNotFoundException) sanitizeStackTrace(new java.lang.ClassNotFoundException("Class " + strReplace + " is not found: this code requires the Kotlin runtime of version at least " + str2, e)));
        }
    }

    private static <T extends java.lang.Throwable> T sanitizeStackTrace(T t) {
        return (T) sanitizeStackTrace(t, kotlin.jvm.internal.Intrinsics.class.getName());
    }

    static <T extends java.lang.Throwable> T sanitizeStackTrace(T t, java.lang.String str) {
        java.lang.StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((java.lang.StackTraceElement[]) java.util.Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }

    public static class Kotlin {
        private Kotlin() {
        }
    }
}

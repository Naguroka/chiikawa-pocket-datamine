package androidx.tracing;

/* JADX INFO: loaded from: classes3.dex */
public final class Trace {
    static final java.lang.String TAG = "Trace";
    private static java.lang.reflect.Method sAsyncTraceBeginMethod;
    private static java.lang.reflect.Method sAsyncTraceEndMethod;
    private static java.lang.reflect.Method sIsTagEnabledMethod;
    private static java.lang.reflect.Method sTraceCounterMethod;
    private static long sTraceTagApp;

    public static boolean isEnabled() {
        try {
            if (sIsTagEnabledMethod == null) {
                return android.os.Trace.isEnabled();
            }
        } catch (java.lang.NoClassDefFoundError | java.lang.NoSuchMethodError unused) {
        }
        return isEnabledFallback();
    }

    public static void beginSection(java.lang.String str) {
        androidx.tracing.TraceApi18Impl.beginSection(str);
    }

    public static void endSection() {
        androidx.tracing.TraceApi18Impl.endSection();
    }

    public static void beginAsyncSection(java.lang.String str, int i) {
        try {
            if (sAsyncTraceBeginMethod == null) {
                androidx.tracing.TraceApi29Impl.beginAsyncSection(str, i);
                return;
            }
        } catch (java.lang.NoClassDefFoundError | java.lang.NoSuchMethodError unused) {
        }
        beginAsyncSectionFallback(str, i);
    }

    public static void endAsyncSection(java.lang.String str, int i) {
        try {
            if (sAsyncTraceEndMethod == null) {
                androidx.tracing.TraceApi29Impl.endAsyncSection(str, i);
                return;
            }
        } catch (java.lang.NoClassDefFoundError | java.lang.NoSuchMethodError unused) {
        }
        endAsyncSectionFallback(str, i);
    }

    public static void setCounter(java.lang.String str, int i) {
        try {
            if (sTraceCounterMethod == null) {
                androidx.tracing.TraceApi29Impl.setCounter(str, i);
                return;
            }
        } catch (java.lang.NoClassDefFoundError | java.lang.NoSuchMethodError unused) {
        }
        setCounterFallback(str, i);
    }

    private static boolean isEnabledFallback() {
        try {
            if (sIsTagEnabledMethod == null) {
                sTraceTagApp = android.os.Trace.class.getField("TRACE_TAG_APP").getLong(null);
                sIsTagEnabledMethod = android.os.Trace.class.getMethod("isTagEnabled", java.lang.Long.TYPE);
            }
            return ((java.lang.Boolean) sIsTagEnabledMethod.invoke(null, java.lang.Long.valueOf(sTraceTagApp))).booleanValue();
        } catch (java.lang.Exception e) {
            handleException("isTagEnabled", e);
            return false;
        }
    }

    private static void beginAsyncSectionFallback(java.lang.String str, int i) {
        try {
            if (sAsyncTraceBeginMethod == null) {
                sAsyncTraceBeginMethod = android.os.Trace.class.getMethod("asyncTraceBegin", java.lang.Long.TYPE, java.lang.String.class, java.lang.Integer.TYPE);
            }
            sAsyncTraceBeginMethod.invoke(null, java.lang.Long.valueOf(sTraceTagApp), str, java.lang.Integer.valueOf(i));
        } catch (java.lang.Exception e) {
            handleException("asyncTraceBegin", e);
        }
    }

    private static void endAsyncSectionFallback(java.lang.String str, int i) {
        try {
            if (sAsyncTraceEndMethod == null) {
                sAsyncTraceEndMethod = android.os.Trace.class.getMethod("asyncTraceEnd", java.lang.Long.TYPE, java.lang.String.class, java.lang.Integer.TYPE);
            }
            sAsyncTraceEndMethod.invoke(null, java.lang.Long.valueOf(sTraceTagApp), str, java.lang.Integer.valueOf(i));
        } catch (java.lang.Exception e) {
            handleException("asyncTraceEnd", e);
        }
    }

    private static void setCounterFallback(java.lang.String str, int i) {
        try {
            if (sTraceCounterMethod == null) {
                sTraceCounterMethod = android.os.Trace.class.getMethod("traceCounter", java.lang.Long.TYPE, java.lang.String.class, java.lang.Integer.TYPE);
            }
            sTraceCounterMethod.invoke(null, java.lang.Long.valueOf(sTraceTagApp), str, java.lang.Integer.valueOf(i));
        } catch (java.lang.Exception e) {
            handleException("traceCounter", e);
        }
    }

    private static void handleException(java.lang.String str, java.lang.Exception exc) {
        if (exc instanceof java.lang.reflect.InvocationTargetException) {
            java.lang.Throwable cause = exc.getCause();
            if (cause instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) cause);
            }
            throw new java.lang.RuntimeException(cause);
        }
        android.util.Log.v(TAG, "Unable to call " + str + " via reflection", exc);
    }

    private Trace() {
    }
}

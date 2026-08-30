package androidx.core.os;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public final class TraceCompat {
    private static final java.lang.String TAG = "TraceCompat";
    private static java.lang.reflect.Method sAsyncTraceBeginMethod;
    private static java.lang.reflect.Method sAsyncTraceEndMethod;
    private static java.lang.reflect.Method sIsTagEnabledMethod;
    private static java.lang.reflect.Method sTraceCounterMethod;
    private static long sTraceTagApp;

    static {
        if (android.os.Build.VERSION.SDK_INT < 29) {
            try {
                sTraceTagApp = android.os.Trace.class.getField("TRACE_TAG_APP").getLong(null);
                sIsTagEnabledMethod = android.os.Trace.class.getMethod("isTagEnabled", java.lang.Long.TYPE);
                sAsyncTraceBeginMethod = android.os.Trace.class.getMethod("asyncTraceBegin", java.lang.Long.TYPE, java.lang.String.class, java.lang.Integer.TYPE);
                sAsyncTraceEndMethod = android.os.Trace.class.getMethod("asyncTraceEnd", java.lang.Long.TYPE, java.lang.String.class, java.lang.Integer.TYPE);
                sTraceCounterMethod = android.os.Trace.class.getMethod("traceCounter", java.lang.Long.TYPE, java.lang.String.class, java.lang.Integer.TYPE);
            } catch (java.lang.Exception e) {
                android.util.Log.i(TAG, "Unable to initialize via reflection.", e);
            }
        }
    }

    public static boolean isEnabled() {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return androidx.core.os.TraceCompat.Api29Impl.isEnabled();
        }
        try {
            return ((java.lang.Boolean) sIsTagEnabledMethod.invoke(null, java.lang.Long.valueOf(sTraceTagApp))).booleanValue();
        } catch (java.lang.Exception unused) {
            android.util.Log.v(TAG, "Unable to invoke isTagEnabled() via reflection.");
            return false;
        }
    }

    public static void beginSection(java.lang.String str) {
        androidx.core.os.TraceCompat.Api18Impl.beginSection(str);
    }

    public static void endSection() {
        androidx.core.os.TraceCompat.Api18Impl.endSection();
    }

    public static void beginAsyncSection(java.lang.String str, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.core.os.TraceCompat.Api29Impl.beginAsyncSection(str, i);
            return;
        }
        try {
            sAsyncTraceBeginMethod.invoke(null, java.lang.Long.valueOf(sTraceTagApp), str, java.lang.Integer.valueOf(i));
        } catch (java.lang.Exception unused) {
            android.util.Log.v(TAG, "Unable to invoke asyncTraceBegin() via reflection.");
        }
    }

    public static void endAsyncSection(java.lang.String str, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.core.os.TraceCompat.Api29Impl.endAsyncSection(str, i);
            return;
        }
        try {
            sAsyncTraceEndMethod.invoke(null, java.lang.Long.valueOf(sTraceTagApp), str, java.lang.Integer.valueOf(i));
        } catch (java.lang.Exception unused) {
            android.util.Log.v(TAG, "Unable to invoke endAsyncSection() via reflection.");
        }
    }

    public static void setCounter(java.lang.String str, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.core.os.TraceCompat.Api29Impl.setCounter(str, i);
            return;
        }
        try {
            sTraceCounterMethod.invoke(null, java.lang.Long.valueOf(sTraceTagApp), str, java.lang.Integer.valueOf(i));
        } catch (java.lang.Exception unused) {
            android.util.Log.v(TAG, "Unable to invoke traceCounter() via reflection.");
        }
    }

    private TraceCompat() {
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static boolean isEnabled() {
            return android.os.Trace.isEnabled();
        }

        static void endAsyncSection(java.lang.String str, int i) {
            android.os.Trace.endAsyncSection(str, i);
        }

        static void beginAsyncSection(java.lang.String str, int i) {
            android.os.Trace.beginAsyncSection(str, i);
        }

        static void setCounter(java.lang.String str, long j) {
            android.os.Trace.setCounter(str, j);
        }
    }

    static class Api18Impl {
        private Api18Impl() {
        }

        static void beginSection(java.lang.String str) {
            android.os.Trace.beginSection(str);
        }

        static void endSection() {
            android.os.Trace.endSection();
        }
    }
}

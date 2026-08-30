package androidx.tracing;

/* JADX INFO: loaded from: classes3.dex */
final class TraceApi29Impl {
    private TraceApi29Impl() {
    }

    public static void beginAsyncSection(java.lang.String str, int i) {
        android.os.Trace.beginAsyncSection(str, i);
    }

    public static void endAsyncSection(java.lang.String str, int i) {
        android.os.Trace.endAsyncSection(str, i);
    }

    public static void setCounter(java.lang.String str, int i) {
        android.os.Trace.setCounter(str, i);
    }
}

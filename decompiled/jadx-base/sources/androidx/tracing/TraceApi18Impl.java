package androidx.tracing;

/* JADX INFO: loaded from: classes3.dex */
final class TraceApi18Impl {
    private TraceApi18Impl() {
    }

    public static void beginSection(java.lang.String str) {
        android.os.Trace.beginSection(str);
    }

    public static void endSection() {
        android.os.Trace.endSection();
    }
}
